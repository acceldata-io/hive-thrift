/**
 * Autogenerated by Thrift Compiler (0.21.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package io.trino.hive.thrift.metastore;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class ScheduledQueryProgressInfo implements org.apache.thrift.TBase<ScheduledQueryProgressInfo, ScheduledQueryProgressInfo._Fields>, java.io.Serializable, Cloneable, Comparable<ScheduledQueryProgressInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ScheduledQueryProgressInfo");

  private static final org.apache.thrift.protocol.TField SCHEDULED_EXECUTION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("scheduledExecutionId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("state", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField EXECUTOR_QUERY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("executorQueryId", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ERROR_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("errorMessage", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ScheduledQueryProgressInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ScheduledQueryProgressInfoTupleSchemeFactory();

  private long scheduledExecutionId; // required
  private @org.apache.thrift.annotation.Nullable QueryState state; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String executorQueryId; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String errorMessage; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SCHEDULED_EXECUTION_ID((short)1, "scheduledExecutionId"),
    /**
     * 
     * @see QueryState
     */
    STATE((short)2, "state"),
    EXECUTOR_QUERY_ID((short)3, "executorQueryId"),
    ERROR_MESSAGE((short)4, "errorMessage");

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
        case 1: // SCHEDULED_EXECUTION_ID
          return SCHEDULED_EXECUTION_ID;
        case 2: // STATE
          return STATE;
        case 3: // EXECUTOR_QUERY_ID
          return EXECUTOR_QUERY_ID;
        case 4: // ERROR_MESSAGE
          return ERROR_MESSAGE;
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
  private static final int __SCHEDULEDEXECUTIONID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ERROR_MESSAGE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SCHEDULED_EXECUTION_ID, new org.apache.thrift.meta_data.FieldMetaData("scheduledExecutionId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.STATE, new org.apache.thrift.meta_data.FieldMetaData("state", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, QueryState.class)));
    tmpMap.put(_Fields.EXECUTOR_QUERY_ID, new org.apache.thrift.meta_data.FieldMetaData("executorQueryId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ERROR_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("errorMessage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ScheduledQueryProgressInfo.class, metaDataMap);
  }

  public ScheduledQueryProgressInfo() {
  }

  public ScheduledQueryProgressInfo(
    long scheduledExecutionId,
    QueryState state,
    java.lang.String executorQueryId)
  {
    this();
    this.scheduledExecutionId = scheduledExecutionId;
    setScheduledExecutionIdIsSet(true);
    this.state = state;
    this.executorQueryId = executorQueryId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ScheduledQueryProgressInfo(ScheduledQueryProgressInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.scheduledExecutionId = other.scheduledExecutionId;
    if (other.isSetState()) {
      this.state = other.state;
    }
    if (other.isSetExecutorQueryId()) {
      this.executorQueryId = other.executorQueryId;
    }
    if (other.isSetErrorMessage()) {
      this.errorMessage = other.errorMessage;
    }
  }

  @Override
  public ScheduledQueryProgressInfo deepCopy() {
    return new ScheduledQueryProgressInfo(this);
  }

  @Override
  public void clear() {
    setScheduledExecutionIdIsSet(false);
    this.scheduledExecutionId = 0;
    this.state = null;
    this.executorQueryId = null;
    this.errorMessage = null;
  }

  public long getScheduledExecutionId() {
    return this.scheduledExecutionId;
  }

  public ScheduledQueryProgressInfo setScheduledExecutionId(long scheduledExecutionId) {
    this.scheduledExecutionId = scheduledExecutionId;
    setScheduledExecutionIdIsSet(true);
    return this;
  }

  public void unsetScheduledExecutionId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SCHEDULEDEXECUTIONID_ISSET_ID);
  }

  /** Returns true if field scheduledExecutionId is set (has been assigned a value) and false otherwise */
  public boolean isSetScheduledExecutionId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SCHEDULEDEXECUTIONID_ISSET_ID);
  }

  public void setScheduledExecutionIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SCHEDULEDEXECUTIONID_ISSET_ID, value);
  }

  /**
   * 
   * @see QueryState
   */
  @org.apache.thrift.annotation.Nullable
  public QueryState getState() {
    return this.state;
  }

  /**
   * 
   * @see QueryState
   */
  public ScheduledQueryProgressInfo setState(@org.apache.thrift.annotation.Nullable QueryState state) {
    this.state = state;
    return this;
  }

  public void unsetState() {
    this.state = null;
  }

  /** Returns true if field state is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return this.state != null;
  }

  public void setStateIsSet(boolean value) {
    if (!value) {
      this.state = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getExecutorQueryId() {
    return this.executorQueryId;
  }

  public ScheduledQueryProgressInfo setExecutorQueryId(@org.apache.thrift.annotation.Nullable java.lang.String executorQueryId) {
    this.executorQueryId = executorQueryId;
    return this;
  }

  public void unsetExecutorQueryId() {
    this.executorQueryId = null;
  }

  /** Returns true if field executorQueryId is set (has been assigned a value) and false otherwise */
  public boolean isSetExecutorQueryId() {
    return this.executorQueryId != null;
  }

  public void setExecutorQueryIdIsSet(boolean value) {
    if (!value) {
      this.executorQueryId = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getErrorMessage() {
    return this.errorMessage;
  }

  public ScheduledQueryProgressInfo setErrorMessage(@org.apache.thrift.annotation.Nullable java.lang.String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public void unsetErrorMessage() {
    this.errorMessage = null;
  }

  /** Returns true if field errorMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorMessage() {
    return this.errorMessage != null;
  }

  public void setErrorMessageIsSet(boolean value) {
    if (!value) {
      this.errorMessage = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SCHEDULED_EXECUTION_ID:
      if (value == null) {
        unsetScheduledExecutionId();
      } else {
        setScheduledExecutionId((java.lang.Long)value);
      }
      break;

    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((QueryState)value);
      }
      break;

    case EXECUTOR_QUERY_ID:
      if (value == null) {
        unsetExecutorQueryId();
      } else {
        setExecutorQueryId((java.lang.String)value);
      }
      break;

    case ERROR_MESSAGE:
      if (value == null) {
        unsetErrorMessage();
      } else {
        setErrorMessage((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SCHEDULED_EXECUTION_ID:
      return getScheduledExecutionId();

    case STATE:
      return getState();

    case EXECUTOR_QUERY_ID:
      return getExecutorQueryId();

    case ERROR_MESSAGE:
      return getErrorMessage();

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
    case SCHEDULED_EXECUTION_ID:
      return isSetScheduledExecutionId();
    case STATE:
      return isSetState();
    case EXECUTOR_QUERY_ID:
      return isSetExecutorQueryId();
    case ERROR_MESSAGE:
      return isSetErrorMessage();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof ScheduledQueryProgressInfo)
      return this.equals((ScheduledQueryProgressInfo)that);
    return false;
  }

  public boolean equals(ScheduledQueryProgressInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_scheduledExecutionId = true;
    boolean that_present_scheduledExecutionId = true;
    if (this_present_scheduledExecutionId || that_present_scheduledExecutionId) {
      if (!(this_present_scheduledExecutionId && that_present_scheduledExecutionId))
        return false;
      if (this.scheduledExecutionId != that.scheduledExecutionId)
        return false;
    }

    boolean this_present_state = true && this.isSetState();
    boolean that_present_state = true && that.isSetState();
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (!this.state.equals(that.state))
        return false;
    }

    boolean this_present_executorQueryId = true && this.isSetExecutorQueryId();
    boolean that_present_executorQueryId = true && that.isSetExecutorQueryId();
    if (this_present_executorQueryId || that_present_executorQueryId) {
      if (!(this_present_executorQueryId && that_present_executorQueryId))
        return false;
      if (!this.executorQueryId.equals(that.executorQueryId))
        return false;
    }

    boolean this_present_errorMessage = true && this.isSetErrorMessage();
    boolean that_present_errorMessage = true && that.isSetErrorMessage();
    if (this_present_errorMessage || that_present_errorMessage) {
      if (!(this_present_errorMessage && that_present_errorMessage))
        return false;
      if (!this.errorMessage.equals(that.errorMessage))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(scheduledExecutionId);

    hashCode = hashCode * 8191 + ((isSetState()) ? 131071 : 524287);
    if (isSetState())
      hashCode = hashCode * 8191 + state.getValue();

    hashCode = hashCode * 8191 + ((isSetExecutorQueryId()) ? 131071 : 524287);
    if (isSetExecutorQueryId())
      hashCode = hashCode * 8191 + executorQueryId.hashCode();

    hashCode = hashCode * 8191 + ((isSetErrorMessage()) ? 131071 : 524287);
    if (isSetErrorMessage())
      hashCode = hashCode * 8191 + errorMessage.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ScheduledQueryProgressInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetScheduledExecutionId(), other.isSetScheduledExecutionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScheduledExecutionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scheduledExecutionId, other.scheduledExecutionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetState(), other.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state, other.state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetExecutorQueryId(), other.isSetExecutorQueryId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExecutorQueryId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.executorQueryId, other.executorQueryId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetErrorMessage(), other.isSetErrorMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorMessage, other.errorMessage);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ScheduledQueryProgressInfo(");
    boolean first = true;

    sb.append("scheduledExecutionId:");
    sb.append(this.scheduledExecutionId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("state:");
    if (this.state == null) {
      sb.append("null");
    } else {
      sb.append(this.state);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("executorQueryId:");
    if (this.executorQueryId == null) {
      sb.append("null");
    } else {
      sb.append(this.executorQueryId);
    }
    first = false;
    if (isSetErrorMessage()) {
      if (!first) sb.append(", ");
      sb.append("errorMessage:");
      if (this.errorMessage == null) {
        sb.append("null");
      } else {
        sb.append(this.errorMessage);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'scheduledExecutionId' because it's a primitive and you chose the non-beans generator.
    if (state == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'state' was not present! Struct: " + toString());
    }
    if (executorQueryId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'executorQueryId' was not present! Struct: " + toString());
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ScheduledQueryProgressInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public ScheduledQueryProgressInfoStandardScheme getScheme() {
      return new ScheduledQueryProgressInfoStandardScheme();
    }
  }

  private static class ScheduledQueryProgressInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<ScheduledQueryProgressInfo> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, ScheduledQueryProgressInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SCHEDULED_EXECUTION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.scheduledExecutionId = iprot.readI64();
              struct.setScheduledExecutionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.state = io.trino.hive.thrift.metastore.QueryState.findByValue(iprot.readI32());
              struct.setStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXECUTOR_QUERY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.executorQueryId = iprot.readString();
              struct.setExecutorQueryIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ERROR_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.errorMessage = iprot.readString();
              struct.setErrorMessageIsSet(true);
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
      if (!struct.isSetScheduledExecutionId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'scheduledExecutionId' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, ScheduledQueryProgressInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SCHEDULED_EXECUTION_ID_FIELD_DESC);
      oprot.writeI64(struct.scheduledExecutionId);
      oprot.writeFieldEnd();
      if (struct.state != null) {
        oprot.writeFieldBegin(STATE_FIELD_DESC);
        oprot.writeI32(struct.state.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.executorQueryId != null) {
        oprot.writeFieldBegin(EXECUTOR_QUERY_ID_FIELD_DESC);
        oprot.writeString(struct.executorQueryId);
        oprot.writeFieldEnd();
      }
      if (struct.errorMessage != null) {
        if (struct.isSetErrorMessage()) {
          oprot.writeFieldBegin(ERROR_MESSAGE_FIELD_DESC);
          oprot.writeString(struct.errorMessage);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ScheduledQueryProgressInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public ScheduledQueryProgressInfoTupleScheme getScheme() {
      return new ScheduledQueryProgressInfoTupleScheme();
    }
  }

  private static class ScheduledQueryProgressInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<ScheduledQueryProgressInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ScheduledQueryProgressInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.scheduledExecutionId);
      oprot.writeI32(struct.state.getValue());
      oprot.writeString(struct.executorQueryId);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetErrorMessage()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetErrorMessage()) {
        oprot.writeString(struct.errorMessage);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ScheduledQueryProgressInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.scheduledExecutionId = iprot.readI64();
      struct.setScheduledExecutionIdIsSet(true);
      struct.state = io.trino.hive.thrift.metastore.QueryState.findByValue(iprot.readI32());
      struct.setStateIsSet(true);
      struct.executorQueryId = iprot.readString();
      struct.setExecutorQueryIdIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.errorMessage = iprot.readString();
        struct.setErrorMessageIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

