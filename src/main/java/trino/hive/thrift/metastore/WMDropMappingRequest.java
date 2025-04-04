/**
 * Autogenerated by Thrift Compiler (0.21.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package io.trino.hive.thrift.metastore;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class WMDropMappingRequest implements org.apache.thrift.TBase<WMDropMappingRequest, WMDropMappingRequest._Fields>, java.io.Serializable, Cloneable, Comparable<WMDropMappingRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WMDropMappingRequest");

  private static final org.apache.thrift.protocol.TField MAPPING_FIELD_DESC = new org.apache.thrift.protocol.TField("mapping", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new WMDropMappingRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new WMDropMappingRequestTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable WMMapping mapping; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MAPPING((short)1, "mapping");

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
        case 1: // MAPPING
          return MAPPING;
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
  private static final _Fields optionals[] = {_Fields.MAPPING};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MAPPING, new org.apache.thrift.meta_data.FieldMetaData("mapping", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, WMMapping.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WMDropMappingRequest.class, metaDataMap);
  }

  public WMDropMappingRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WMDropMappingRequest(WMDropMappingRequest other) {
    if (other.isSetMapping()) {
      this.mapping = new WMMapping(other.mapping);
    }
  }

  @Override
  public WMDropMappingRequest deepCopy() {
    return new WMDropMappingRequest(this);
  }

  @Override
  public void clear() {
    this.mapping = null;
  }

  @org.apache.thrift.annotation.Nullable
  public WMMapping getMapping() {
    return this.mapping;
  }

  public WMDropMappingRequest setMapping(@org.apache.thrift.annotation.Nullable WMMapping mapping) {
    this.mapping = mapping;
    return this;
  }

  public void unsetMapping() {
    this.mapping = null;
  }

  /** Returns true if field mapping is set (has been assigned a value) and false otherwise */
  public boolean isSetMapping() {
    return this.mapping != null;
  }

  public void setMappingIsSet(boolean value) {
    if (!value) {
      this.mapping = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case MAPPING:
      if (value == null) {
        unsetMapping();
      } else {
        setMapping((WMMapping)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case MAPPING:
      return getMapping();

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
    case MAPPING:
      return isSetMapping();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof WMDropMappingRequest)
      return this.equals((WMDropMappingRequest)that);
    return false;
  }

  public boolean equals(WMDropMappingRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_mapping = true && this.isSetMapping();
    boolean that_present_mapping = true && that.isSetMapping();
    if (this_present_mapping || that_present_mapping) {
      if (!(this_present_mapping && that_present_mapping))
        return false;
      if (!this.mapping.equals(that.mapping))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMapping()) ? 131071 : 524287);
    if (isSetMapping())
      hashCode = hashCode * 8191 + mapping.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(WMDropMappingRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetMapping(), other.isSetMapping());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMapping()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mapping, other.mapping);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("WMDropMappingRequest(");
    boolean first = true;

    if (isSetMapping()) {
      sb.append("mapping:");
      if (this.mapping == null) {
        sb.append("null");
      } else {
        sb.append(this.mapping);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (mapping != null) {
      mapping.validate();
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

  private static class WMDropMappingRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public WMDropMappingRequestStandardScheme getScheme() {
      return new WMDropMappingRequestStandardScheme();
    }
  }

  private static class WMDropMappingRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<WMDropMappingRequest> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, WMDropMappingRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MAPPING
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.mapping = new WMMapping();
              struct.mapping.read(iprot);
              struct.setMappingIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, WMDropMappingRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.mapping != null) {
        if (struct.isSetMapping()) {
          oprot.writeFieldBegin(MAPPING_FIELD_DESC);
          struct.mapping.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WMDropMappingRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public WMDropMappingRequestTupleScheme getScheme() {
      return new WMDropMappingRequestTupleScheme();
    }
  }

  private static class WMDropMappingRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<WMDropMappingRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WMDropMappingRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMapping()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetMapping()) {
        struct.mapping.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WMDropMappingRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.mapping = new WMMapping();
        struct.mapping.read(iprot);
        struct.setMappingIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

