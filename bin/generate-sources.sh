#!/bin/bash

set -eu

cd "${BASH_SOURCE%/*}/.."

TARGET=target/generated-sources/thrift
rm -rf $TARGET
rm -rf src/main/java
rm -rf target
mkdir -p $TARGET
thrift -o $TARGET \
  --gen java:private_members,fullcamel,sorted_containers,generated_annotations=suppress \
  /Users/prabhu/work/hive-thrift/src/main/thrift/hive_metastore.thrift
mkdir -p target/classes
mv $TARGET/gen-java/io src/main/java
