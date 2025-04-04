/**
 * Autogenerated by Thrift Compiler (0.21.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package io.trino.hive.thrift.metastore;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class AllTableConstraintsResponse implements org.apache.thrift.TBase<AllTableConstraintsResponse, AllTableConstraintsResponse._Fields>, java.io.Serializable, Cloneable, Comparable<AllTableConstraintsResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AllTableConstraintsResponse");

  private static final org.apache.thrift.protocol.TField ALL_TABLE_CONSTRAINTS_FIELD_DESC = new org.apache.thrift.protocol.TField("allTableConstraints", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AllTableConstraintsResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AllTableConstraintsResponseTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable SQLAllTableConstraints allTableConstraints; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ALL_TABLE_CONSTRAINTS((short)1, "allTableConstraints");

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
        case 1: // ALL_TABLE_CONSTRAINTS
          return ALL_TABLE_CONSTRAINTS;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ALL_TABLE_CONSTRAINTS, new org.apache.thrift.meta_data.FieldMetaData("allTableConstraints", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SQLAllTableConstraints.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AllTableConstraintsResponse.class, metaDataMap);
  }

  public AllTableConstraintsResponse() {
  }

  public AllTableConstraintsResponse(
    SQLAllTableConstraints allTableConstraints)
  {
    this();
    this.allTableConstraints = allTableConstraints;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AllTableConstraintsResponse(AllTableConstraintsResponse other) {
    if (other.isSetAllTableConstraints()) {
      this.allTableConstraints = new SQLAllTableConstraints(other.allTableConstraints);
    }
  }

  @Override
  public AllTableConstraintsResponse deepCopy() {
    return new AllTableConstraintsResponse(this);
  }

  @Override
  public void clear() {
    this.allTableConstraints = null;
  }

  @org.apache.thrift.annotation.Nullable
  public SQLAllTableConstraints getAllTableConstraints() {
    return this.allTableConstraints;
  }

  public AllTableConstraintsResponse setAllTableConstraints(@org.apache.thrift.annotation.Nullable SQLAllTableConstraints allTableConstraints) {
    this.allTableConstraints = allTableConstraints;
    return this;
  }

  public void unsetAllTableConstraints() {
    this.allTableConstraints = null;
  }

  /** Returns true if field allTableConstraints is set (has been assigned a value) and false otherwise */
  public boolean isSetAllTableConstraints() {
    return this.allTableConstraints != null;
  }

  public void setAllTableConstraintsIsSet(boolean value) {
    if (!value) {
      this.allTableConstraints = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ALL_TABLE_CONSTRAINTS:
      if (value == null) {
        unsetAllTableConstraints();
      } else {
        setAllTableConstraints((SQLAllTableConstraints)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ALL_TABLE_CONSTRAINTS:
      return getAllTableConstraints();

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
    case ALL_TABLE_CONSTRAINTS:
      return isSetAllTableConstraints();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof AllTableConstraintsResponse)
      return this.equals((AllTableConstraintsResponse)that);
    return false;
  }

  public boolean equals(AllTableConstraintsResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_allTableConstraints = true && this.isSetAllTableConstraints();
    boolean that_present_allTableConstraints = true && that.isSetAllTableConstraints();
    if (this_present_allTableConstraints || that_present_allTableConstraints) {
      if (!(this_present_allTableConstraints && that_present_allTableConstraints))
        return false;
      if (!this.allTableConstraints.equals(that.allTableConstraints))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetAllTableConstraints()) ? 131071 : 524287);
    if (isSetAllTableConstraints())
      hashCode = hashCode * 8191 + allTableConstraints.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(AllTableConstraintsResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetAllTableConstraints(), other.isSetAllTableConstraints());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAllTableConstraints()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.allTableConstraints, other.allTableConstraints);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("AllTableConstraintsResponse(");
    boolean first = true;

    sb.append("allTableConstraints:");
    if (this.allTableConstraints == null) {
      sb.append("null");
    } else {
      sb.append(this.allTableConstraints);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (allTableConstraints == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'allTableConstraints' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (allTableConstraints != null) {
      allTableConstraints.validate();
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AllTableConstraintsResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public AllTableConstraintsResponseStandardScheme getScheme() {
      return new AllTableConstraintsResponseStandardScheme();
    }
  }

  private static class AllTableConstraintsResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<AllTableConstraintsResponse> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, AllTableConstraintsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ALL_TABLE_CONSTRAINTS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.allTableConstraints = new SQLAllTableConstraints();
              struct.allTableConstraints.read(iprot);
              struct.setAllTableConstraintsIsSet(true);
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
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, AllTableConstraintsResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.allTableConstraints != null) {
        oprot.writeFieldBegin(ALL_TABLE_CONSTRAINTS_FIELD_DESC);
        struct.allTableConstraints.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AllTableConstraintsResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public AllTableConstraintsResponseTupleScheme getScheme() {
      return new AllTableConstraintsResponseTupleScheme();
    }
  }

  private static class AllTableConstraintsResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<AllTableConstraintsResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AllTableConstraintsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.allTableConstraints.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AllTableConstraintsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.allTableConstraints = new SQLAllTableConstraints();
      struct.allTableConstraints.read(iprot);
      struct.setAllTableConstraintsIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

