/**
 * Autogenerated by Thrift Compiler (0.21.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package io.trino.hive.thrift.metastore;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class Materialization implements org.apache.thrift.TBase<Materialization, Materialization._Fields>, java.io.Serializable, Cloneable, Comparable<Materialization> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Materialization");

  private static final org.apache.thrift.protocol.TField SOURCE_TABLES_UPDATE_DELETE_MODIFIED_FIELD_DESC = new org.apache.thrift.protocol.TField("sourceTablesUpdateDeleteModified", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField SOURCE_TABLES_COMPACTED_FIELD_DESC = new org.apache.thrift.protocol.TField("sourceTablesCompacted", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new MaterializationStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new MaterializationTupleSchemeFactory();

  private boolean sourceTablesUpdateDeleteModified; // required
  private boolean sourceTablesCompacted; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SOURCE_TABLES_UPDATE_DELETE_MODIFIED((short)1, "sourceTablesUpdateDeleteModified"),
    SOURCE_TABLES_COMPACTED((short)2, "sourceTablesCompacted");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SOURCE_TABLES_UPDATE_DELETE_MODIFIED
          return SOURCE_TABLES_UPDATE_DELETE_MODIFIED;
        case 2: // SOURCE_TABLES_COMPACTED
          return SOURCE_TABLES_COMPACTED;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SOURCETABLESUPDATEDELETEMODIFIED_ISSET_ID = 0;
  private static final int __SOURCETABLESCOMPACTED_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SOURCE_TABLES_UPDATE_DELETE_MODIFIED, new org.apache.thrift.meta_data.FieldMetaData("sourceTablesUpdateDeleteModified", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.SOURCE_TABLES_COMPACTED, new org.apache.thrift.meta_data.FieldMetaData("sourceTablesCompacted", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Materialization.class, metaDataMap);
  }

  public Materialization() {
  }

  public Materialization(
    boolean sourceTablesUpdateDeleteModified,
    boolean sourceTablesCompacted)
  {
    this();
    this.sourceTablesUpdateDeleteModified = sourceTablesUpdateDeleteModified;
    setSourceTablesUpdateDeleteModifiedIsSet(true);
    this.sourceTablesCompacted = sourceTablesCompacted;
    setSourceTablesCompactedIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Materialization(Materialization other) {
    __isset_bitfield = other.__isset_bitfield;
    this.sourceTablesUpdateDeleteModified = other.sourceTablesUpdateDeleteModified;
    this.sourceTablesCompacted = other.sourceTablesCompacted;
  }

  @Override
  public Materialization deepCopy() {
    return new Materialization(this);
  }

  @Override
  public void clear() {
    setSourceTablesUpdateDeleteModifiedIsSet(false);
    this.sourceTablesUpdateDeleteModified = false;
    setSourceTablesCompactedIsSet(false);
    this.sourceTablesCompacted = false;
  }

  public boolean isSourceTablesUpdateDeleteModified() {
    return this.sourceTablesUpdateDeleteModified;
  }

  public Materialization setSourceTablesUpdateDeleteModified(boolean sourceTablesUpdateDeleteModified) {
    this.sourceTablesUpdateDeleteModified = sourceTablesUpdateDeleteModified;
    setSourceTablesUpdateDeleteModifiedIsSet(true);
    return this;
  }

  public void unsetSourceTablesUpdateDeleteModified() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SOURCETABLESUPDATEDELETEMODIFIED_ISSET_ID);
  }

  /** Returns true if field sourceTablesUpdateDeleteModified is set (has been assigned a value) and false otherwise */
  public boolean isSetSourceTablesUpdateDeleteModified() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SOURCETABLESUPDATEDELETEMODIFIED_ISSET_ID);
  }

  public void setSourceTablesUpdateDeleteModifiedIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SOURCETABLESUPDATEDELETEMODIFIED_ISSET_ID, value);
  }

  public boolean isSourceTablesCompacted() {
    return this.sourceTablesCompacted;
  }

  public Materialization setSourceTablesCompacted(boolean sourceTablesCompacted) {
    this.sourceTablesCompacted = sourceTablesCompacted;
    setSourceTablesCompactedIsSet(true);
    return this;
  }

  public void unsetSourceTablesCompacted() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SOURCETABLESCOMPACTED_ISSET_ID);
  }

  /** Returns true if field sourceTablesCompacted is set (has been assigned a value) and false otherwise */
  public boolean isSetSourceTablesCompacted() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SOURCETABLESCOMPACTED_ISSET_ID);
  }

  public void setSourceTablesCompactedIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SOURCETABLESCOMPACTED_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SOURCE_TABLES_UPDATE_DELETE_MODIFIED:
      if (value == null) {
        unsetSourceTablesUpdateDeleteModified();
      } else {
        setSourceTablesUpdateDeleteModified((java.lang.Boolean)value);
      }
      break;

    case SOURCE_TABLES_COMPACTED:
      if (value == null) {
        unsetSourceTablesCompacted();
      } else {
        setSourceTablesCompacted((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SOURCE_TABLES_UPDATE_DELETE_MODIFIED:
      return isSourceTablesUpdateDeleteModified();

    case SOURCE_TABLES_COMPACTED:
      return isSourceTablesCompacted();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  @Override
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SOURCE_TABLES_UPDATE_DELETE_MODIFIED:
      return isSetSourceTablesUpdateDeleteModified();
    case SOURCE_TABLES_COMPACTED:
      return isSetSourceTablesCompacted();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof Materialization)
      return this.equals((Materialization)that);
    return false;
  }

  public boolean equals(Materialization that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_sourceTablesUpdateDeleteModified = true;
    boolean that_present_sourceTablesUpdateDeleteModified = true;
    if (this_present_sourceTablesUpdateDeleteModified || that_present_sourceTablesUpdateDeleteModified) {
      if (!(this_present_sourceTablesUpdateDeleteModified && that_present_sourceTablesUpdateDeleteModified))
        return false;
      if (this.sourceTablesUpdateDeleteModified != that.sourceTablesUpdateDeleteModified)
        return false;
    }

    boolean this_present_sourceTablesCompacted = true;
    boolean that_present_sourceTablesCompacted = true;
    if (this_present_sourceTablesCompacted || that_present_sourceTablesCompacted) {
      if (!(this_present_sourceTablesCompacted && that_present_sourceTablesCompacted))
        return false;
      if (this.sourceTablesCompacted != that.sourceTablesCompacted)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((sourceTablesUpdateDeleteModified) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((sourceTablesCompacted) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(Materialization other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetSourceTablesUpdateDeleteModified(), other.isSetSourceTablesUpdateDeleteModified());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSourceTablesUpdateDeleteModified()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sourceTablesUpdateDeleteModified, other.sourceTablesUpdateDeleteModified);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSourceTablesCompacted(), other.isSetSourceTablesCompacted());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSourceTablesCompacted()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sourceTablesCompacted, other.sourceTablesCompacted);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  @Override
  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Materialization(");
    boolean first = true;

    sb.append("sourceTablesUpdateDeleteModified:");
    sb.append(this.sourceTablesUpdateDeleteModified);
    first = false;
    if (!first) sb.append(", ");
    sb.append("sourceTablesCompacted:");
    sb.append(this.sourceTablesCompacted);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'sourceTablesUpdateDeleteModified' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'sourceTablesCompacted' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MaterializationStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public MaterializationStandardScheme getScheme() {
      return new MaterializationStandardScheme();
    }
  }

  private static class MaterializationStandardScheme extends org.apache.thrift.scheme.StandardScheme<Materialization> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, Materialization struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SOURCE_TABLES_UPDATE_DELETE_MODIFIED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.sourceTablesUpdateDeleteModified = iprot.readBool();
              struct.setSourceTablesUpdateDeleteModifiedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SOURCE_TABLES_COMPACTED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.sourceTablesCompacted = iprot.readBool();
              struct.setSourceTablesCompactedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetSourceTablesUpdateDeleteModified()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'sourceTablesUpdateDeleteModified' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetSourceTablesCompacted()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'sourceTablesCompacted' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, Materialization struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SOURCE_TABLES_UPDATE_DELETE_MODIFIED_FIELD_DESC);
      oprot.writeBool(struct.sourceTablesUpdateDeleteModified);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SOURCE_TABLES_COMPACTED_FIELD_DESC);
      oprot.writeBool(struct.sourceTablesCompacted);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MaterializationTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public MaterializationTupleScheme getScheme() {
      return new MaterializationTupleScheme();
    }
  }

  private static class MaterializationTupleScheme extends org.apache.thrift.scheme.TupleScheme<Materialization> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Materialization struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeBool(struct.sourceTablesUpdateDeleteModified);
      oprot.writeBool(struct.sourceTablesCompacted);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Materialization struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.sourceTablesUpdateDeleteModified = iprot.readBool();
      struct.setSourceTablesUpdateDeleteModifiedIsSet(true);
      struct.sourceTablesCompacted = iprot.readBool();
      struct.setSourceTablesCompactedIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

