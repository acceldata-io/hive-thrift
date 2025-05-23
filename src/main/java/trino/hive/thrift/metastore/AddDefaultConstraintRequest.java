/**
 * Autogenerated by Thrift Compiler (0.21.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package io.trino.hive.thrift.metastore;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class AddDefaultConstraintRequest implements org.apache.thrift.TBase<AddDefaultConstraintRequest, AddDefaultConstraintRequest._Fields>, java.io.Serializable, Cloneable, Comparable<AddDefaultConstraintRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AddDefaultConstraintRequest");

  private static final org.apache.thrift.protocol.TField DEFAULT_CONSTRAINT_COLS_FIELD_DESC = new org.apache.thrift.protocol.TField("defaultConstraintCols", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AddDefaultConstraintRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AddDefaultConstraintRequestTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<SQLDefaultConstraint> defaultConstraintCols; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DEFAULT_CONSTRAINT_COLS((short)1, "defaultConstraintCols");

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
        case 1: // DEFAULT_CONSTRAINT_COLS
          return DEFAULT_CONSTRAINT_COLS;
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
    tmpMap.put(_Fields.DEFAULT_CONSTRAINT_COLS, new org.apache.thrift.meta_data.FieldMetaData("defaultConstraintCols", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SQLDefaultConstraint.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AddDefaultConstraintRequest.class, metaDataMap);
  }

  public AddDefaultConstraintRequest() {
  }

  public AddDefaultConstraintRequest(
    java.util.List<SQLDefaultConstraint> defaultConstraintCols)
  {
    this();
    this.defaultConstraintCols = defaultConstraintCols;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AddDefaultConstraintRequest(AddDefaultConstraintRequest other) {
    if (other.isSetDefaultConstraintCols()) {
      java.util.List<SQLDefaultConstraint> __this__defaultConstraintCols = new java.util.ArrayList<SQLDefaultConstraint>(other.defaultConstraintCols.size());
      for (SQLDefaultConstraint other_element : other.defaultConstraintCols) {
        __this__defaultConstraintCols.add(new SQLDefaultConstraint(other_element));
      }
      this.defaultConstraintCols = __this__defaultConstraintCols;
    }
  }

  @Override
  public AddDefaultConstraintRequest deepCopy() {
    return new AddDefaultConstraintRequest(this);
  }

  @Override
  public void clear() {
    this.defaultConstraintCols = null;
  }

  public int getDefaultConstraintColsSize() {
    return (this.defaultConstraintCols == null) ? 0 : this.defaultConstraintCols.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<SQLDefaultConstraint> getDefaultConstraintColsIterator() {
    return (this.defaultConstraintCols == null) ? null : this.defaultConstraintCols.iterator();
  }

  public void addToDefaultConstraintCols(SQLDefaultConstraint elem) {
    if (this.defaultConstraintCols == null) {
      this.defaultConstraintCols = new java.util.ArrayList<SQLDefaultConstraint>();
    }
    this.defaultConstraintCols.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<SQLDefaultConstraint> getDefaultConstraintCols() {
    return this.defaultConstraintCols;
  }

  public AddDefaultConstraintRequest setDefaultConstraintCols(@org.apache.thrift.annotation.Nullable java.util.List<SQLDefaultConstraint> defaultConstraintCols) {
    this.defaultConstraintCols = defaultConstraintCols;
    return this;
  }

  public void unsetDefaultConstraintCols() {
    this.defaultConstraintCols = null;
  }

  /** Returns true if field defaultConstraintCols is set (has been assigned a value) and false otherwise */
  public boolean isSetDefaultConstraintCols() {
    return this.defaultConstraintCols != null;
  }

  public void setDefaultConstraintColsIsSet(boolean value) {
    if (!value) {
      this.defaultConstraintCols = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case DEFAULT_CONSTRAINT_COLS:
      if (value == null) {
        unsetDefaultConstraintCols();
      } else {
        setDefaultConstraintCols((java.util.List<SQLDefaultConstraint>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case DEFAULT_CONSTRAINT_COLS:
      return getDefaultConstraintCols();

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
    case DEFAULT_CONSTRAINT_COLS:
      return isSetDefaultConstraintCols();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof AddDefaultConstraintRequest)
      return this.equals((AddDefaultConstraintRequest)that);
    return false;
  }

  public boolean equals(AddDefaultConstraintRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_defaultConstraintCols = true && this.isSetDefaultConstraintCols();
    boolean that_present_defaultConstraintCols = true && that.isSetDefaultConstraintCols();
    if (this_present_defaultConstraintCols || that_present_defaultConstraintCols) {
      if (!(this_present_defaultConstraintCols && that_present_defaultConstraintCols))
        return false;
      if (!this.defaultConstraintCols.equals(that.defaultConstraintCols))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetDefaultConstraintCols()) ? 131071 : 524287);
    if (isSetDefaultConstraintCols())
      hashCode = hashCode * 8191 + defaultConstraintCols.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(AddDefaultConstraintRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetDefaultConstraintCols(), other.isSetDefaultConstraintCols());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDefaultConstraintCols()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.defaultConstraintCols, other.defaultConstraintCols);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("AddDefaultConstraintRequest(");
    boolean first = true;

    sb.append("defaultConstraintCols:");
    if (this.defaultConstraintCols == null) {
      sb.append("null");
    } else {
      sb.append(this.defaultConstraintCols);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (defaultConstraintCols == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'defaultConstraintCols' was not present! Struct: " + toString());
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AddDefaultConstraintRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public AddDefaultConstraintRequestStandardScheme getScheme() {
      return new AddDefaultConstraintRequestStandardScheme();
    }
  }

  private static class AddDefaultConstraintRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<AddDefaultConstraintRequest> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, AddDefaultConstraintRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DEFAULT_CONSTRAINT_COLS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list552 = iprot.readListBegin();
                struct.defaultConstraintCols = new java.util.ArrayList<SQLDefaultConstraint>(_list552.size);
                @org.apache.thrift.annotation.Nullable SQLDefaultConstraint _elem553;
                for (int _i554 = 0; _i554 < _list552.size; ++_i554)
                {
                  _elem553 = new SQLDefaultConstraint();
                  _elem553.read(iprot);
                  struct.defaultConstraintCols.add(_elem553);
                }
                iprot.readListEnd();
              }
              struct.setDefaultConstraintColsIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, AddDefaultConstraintRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.defaultConstraintCols != null) {
        oprot.writeFieldBegin(DEFAULT_CONSTRAINT_COLS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.defaultConstraintCols.size()));
          for (SQLDefaultConstraint _iter555 : struct.defaultConstraintCols)
          {
            _iter555.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AddDefaultConstraintRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public AddDefaultConstraintRequestTupleScheme getScheme() {
      return new AddDefaultConstraintRequestTupleScheme();
    }
  }

  private static class AddDefaultConstraintRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<AddDefaultConstraintRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AddDefaultConstraintRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.defaultConstraintCols.size());
        for (SQLDefaultConstraint _iter556 : struct.defaultConstraintCols)
        {
          _iter556.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AddDefaultConstraintRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list557 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
        struct.defaultConstraintCols = new java.util.ArrayList<SQLDefaultConstraint>(_list557.size);
        @org.apache.thrift.annotation.Nullable SQLDefaultConstraint _elem558;
        for (int _i559 = 0; _i559 < _list557.size; ++_i559)
        {
          _elem558 = new SQLDefaultConstraint();
          _elem558.read(iprot);
          struct.defaultConstraintCols.add(_elem558);
        }
      }
      struct.setDefaultConstraintColsIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

