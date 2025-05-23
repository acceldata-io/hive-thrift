/**
 * Autogenerated by Thrift Compiler (0.21.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package io.trino.hive.thrift.metastore;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class WMPoolTrigger implements org.apache.thrift.TBase<WMPoolTrigger, WMPoolTrigger._Fields>, java.io.Serializable, Cloneable, Comparable<WMPoolTrigger> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WMPoolTrigger");

  private static final org.apache.thrift.protocol.TField POOL_FIELD_DESC = new org.apache.thrift.protocol.TField("pool", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TRIGGER_FIELD_DESC = new org.apache.thrift.protocol.TField("trigger", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField NS_FIELD_DESC = new org.apache.thrift.protocol.TField("ns", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new WMPoolTriggerStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new WMPoolTriggerTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.lang.String pool; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String trigger; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String ns; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    POOL((short)1, "pool"),
    TRIGGER((short)2, "trigger"),
    NS((short)3, "ns");

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
        case 1: // POOL
          return POOL;
        case 2: // TRIGGER
          return TRIGGER;
        case 3: // NS
          return NS;
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
  private static final _Fields optionals[] = {_Fields.NS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.POOL, new org.apache.thrift.meta_data.FieldMetaData("pool", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TRIGGER, new org.apache.thrift.meta_data.FieldMetaData("trigger", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NS, new org.apache.thrift.meta_data.FieldMetaData("ns", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WMPoolTrigger.class, metaDataMap);
  }

  public WMPoolTrigger() {
  }

  public WMPoolTrigger(
    java.lang.String pool,
    java.lang.String trigger)
  {
    this();
    this.pool = pool;
    this.trigger = trigger;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WMPoolTrigger(WMPoolTrigger other) {
    if (other.isSetPool()) {
      this.pool = other.pool;
    }
    if (other.isSetTrigger()) {
      this.trigger = other.trigger;
    }
    if (other.isSetNs()) {
      this.ns = other.ns;
    }
  }

  @Override
  public WMPoolTrigger deepCopy() {
    return new WMPoolTrigger(this);
  }

  @Override
  public void clear() {
    this.pool = null;
    this.trigger = null;
    this.ns = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getPool() {
    return this.pool;
  }

  public WMPoolTrigger setPool(@org.apache.thrift.annotation.Nullable java.lang.String pool) {
    this.pool = pool;
    return this;
  }

  public void unsetPool() {
    this.pool = null;
  }

  /** Returns true if field pool is set (has been assigned a value) and false otherwise */
  public boolean isSetPool() {
    return this.pool != null;
  }

  public void setPoolIsSet(boolean value) {
    if (!value) {
      this.pool = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTrigger() {
    return this.trigger;
  }

  public WMPoolTrigger setTrigger(@org.apache.thrift.annotation.Nullable java.lang.String trigger) {
    this.trigger = trigger;
    return this;
  }

  public void unsetTrigger() {
    this.trigger = null;
  }

  /** Returns true if field trigger is set (has been assigned a value) and false otherwise */
  public boolean isSetTrigger() {
    return this.trigger != null;
  }

  public void setTriggerIsSet(boolean value) {
    if (!value) {
      this.trigger = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getNs() {
    return this.ns;
  }

  public WMPoolTrigger setNs(@org.apache.thrift.annotation.Nullable java.lang.String ns) {
    this.ns = ns;
    return this;
  }

  public void unsetNs() {
    this.ns = null;
  }

  /** Returns true if field ns is set (has been assigned a value) and false otherwise */
  public boolean isSetNs() {
    return this.ns != null;
  }

  public void setNsIsSet(boolean value) {
    if (!value) {
      this.ns = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case POOL:
      if (value == null) {
        unsetPool();
      } else {
        setPool((java.lang.String)value);
      }
      break;

    case TRIGGER:
      if (value == null) {
        unsetTrigger();
      } else {
        setTrigger((java.lang.String)value);
      }
      break;

    case NS:
      if (value == null) {
        unsetNs();
      } else {
        setNs((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case POOL:
      return getPool();

    case TRIGGER:
      return getTrigger();

    case NS:
      return getNs();

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
    case POOL:
      return isSetPool();
    case TRIGGER:
      return isSetTrigger();
    case NS:
      return isSetNs();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof WMPoolTrigger)
      return this.equals((WMPoolTrigger)that);
    return false;
  }

  public boolean equals(WMPoolTrigger that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_pool = true && this.isSetPool();
    boolean that_present_pool = true && that.isSetPool();
    if (this_present_pool || that_present_pool) {
      if (!(this_present_pool && that_present_pool))
        return false;
      if (!this.pool.equals(that.pool))
        return false;
    }

    boolean this_present_trigger = true && this.isSetTrigger();
    boolean that_present_trigger = true && that.isSetTrigger();
    if (this_present_trigger || that_present_trigger) {
      if (!(this_present_trigger && that_present_trigger))
        return false;
      if (!this.trigger.equals(that.trigger))
        return false;
    }

    boolean this_present_ns = true && this.isSetNs();
    boolean that_present_ns = true && that.isSetNs();
    if (this_present_ns || that_present_ns) {
      if (!(this_present_ns && that_present_ns))
        return false;
      if (!this.ns.equals(that.ns))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPool()) ? 131071 : 524287);
    if (isSetPool())
      hashCode = hashCode * 8191 + pool.hashCode();

    hashCode = hashCode * 8191 + ((isSetTrigger()) ? 131071 : 524287);
    if (isSetTrigger())
      hashCode = hashCode * 8191 + trigger.hashCode();

    hashCode = hashCode * 8191 + ((isSetNs()) ? 131071 : 524287);
    if (isSetNs())
      hashCode = hashCode * 8191 + ns.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(WMPoolTrigger other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetPool(), other.isSetPool());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPool()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pool, other.pool);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTrigger(), other.isSetTrigger());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTrigger()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.trigger, other.trigger);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetNs(), other.isSetNs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ns, other.ns);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("WMPoolTrigger(");
    boolean first = true;

    sb.append("pool:");
    if (this.pool == null) {
      sb.append("null");
    } else {
      sb.append(this.pool);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("trigger:");
    if (this.trigger == null) {
      sb.append("null");
    } else {
      sb.append(this.trigger);
    }
    first = false;
    if (isSetNs()) {
      if (!first) sb.append(", ");
      sb.append("ns:");
      if (this.ns == null) {
        sb.append("null");
      } else {
        sb.append(this.ns);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (pool == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'pool' was not present! Struct: " + toString());
    }
    if (trigger == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'trigger' was not present! Struct: " + toString());
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

  private static class WMPoolTriggerStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public WMPoolTriggerStandardScheme getScheme() {
      return new WMPoolTriggerStandardScheme();
    }
  }

  private static class WMPoolTriggerStandardScheme extends org.apache.thrift.scheme.StandardScheme<WMPoolTrigger> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, WMPoolTrigger struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // POOL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pool = iprot.readString();
              struct.setPoolIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TRIGGER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.trigger = iprot.readString();
              struct.setTriggerIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ns = iprot.readString();
              struct.setNsIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, WMPoolTrigger struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.pool != null) {
        oprot.writeFieldBegin(POOL_FIELD_DESC);
        oprot.writeString(struct.pool);
        oprot.writeFieldEnd();
      }
      if (struct.trigger != null) {
        oprot.writeFieldBegin(TRIGGER_FIELD_DESC);
        oprot.writeString(struct.trigger);
        oprot.writeFieldEnd();
      }
      if (struct.ns != null) {
        if (struct.isSetNs()) {
          oprot.writeFieldBegin(NS_FIELD_DESC);
          oprot.writeString(struct.ns);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WMPoolTriggerTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public WMPoolTriggerTupleScheme getScheme() {
      return new WMPoolTriggerTupleScheme();
    }
  }

  private static class WMPoolTriggerTupleScheme extends org.apache.thrift.scheme.TupleScheme<WMPoolTrigger> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WMPoolTrigger struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.pool);
      oprot.writeString(struct.trigger);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetNs()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetNs()) {
        oprot.writeString(struct.ns);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WMPoolTrigger struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.pool = iprot.readString();
      struct.setPoolIsSet(true);
      struct.trigger = iprot.readString();
      struct.setTriggerIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.ns = iprot.readString();
        struct.setNsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

