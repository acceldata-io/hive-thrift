/**
 * Autogenerated by Thrift Compiler (0.21.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package io.trino.hive.thrift.metastore;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class WMAlterResourcePlanRequest implements org.apache.thrift.TBase<WMAlterResourcePlanRequest, WMAlterResourcePlanRequest._Fields>, java.io.Serializable, Cloneable, Comparable<WMAlterResourcePlanRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WMAlterResourcePlanRequest");

  private static final org.apache.thrift.protocol.TField RESOURCE_PLAN_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("resourcePlanName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField RESOURCE_PLAN_FIELD_DESC = new org.apache.thrift.protocol.TField("resourcePlan", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField IS_ENABLE_AND_ACTIVATE_FIELD_DESC = new org.apache.thrift.protocol.TField("isEnableAndActivate", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField IS_FORCE_DEACTIVATE_FIELD_DESC = new org.apache.thrift.protocol.TField("isForceDeactivate", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField IS_REPLACE_FIELD_DESC = new org.apache.thrift.protocol.TField("isReplace", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField NS_FIELD_DESC = new org.apache.thrift.protocol.TField("ns", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new WMAlterResourcePlanRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new WMAlterResourcePlanRequestTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.lang.String resourcePlanName; // optional
  private @org.apache.thrift.annotation.Nullable WMNullableResourcePlan resourcePlan; // optional
  private boolean isEnableAndActivate; // optional
  private boolean isForceDeactivate; // optional
  private boolean isReplace; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String ns; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RESOURCE_PLAN_NAME((short)1, "resourcePlanName"),
    RESOURCE_PLAN((short)2, "resourcePlan"),
    IS_ENABLE_AND_ACTIVATE((short)3, "isEnableAndActivate"),
    IS_FORCE_DEACTIVATE((short)4, "isForceDeactivate"),
    IS_REPLACE((short)5, "isReplace"),
    NS((short)6, "ns");

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
        case 1: // RESOURCE_PLAN_NAME
          return RESOURCE_PLAN_NAME;
        case 2: // RESOURCE_PLAN
          return RESOURCE_PLAN;
        case 3: // IS_ENABLE_AND_ACTIVATE
          return IS_ENABLE_AND_ACTIVATE;
        case 4: // IS_FORCE_DEACTIVATE
          return IS_FORCE_DEACTIVATE;
        case 5: // IS_REPLACE
          return IS_REPLACE;
        case 6: // NS
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
  private static final int __ISENABLEANDACTIVATE_ISSET_ID = 0;
  private static final int __ISFORCEDEACTIVATE_ISSET_ID = 1;
  private static final int __ISREPLACE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.RESOURCE_PLAN_NAME,_Fields.RESOURCE_PLAN,_Fields.IS_ENABLE_AND_ACTIVATE,_Fields.IS_FORCE_DEACTIVATE,_Fields.IS_REPLACE,_Fields.NS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESOURCE_PLAN_NAME, new org.apache.thrift.meta_data.FieldMetaData("resourcePlanName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RESOURCE_PLAN, new org.apache.thrift.meta_data.FieldMetaData("resourcePlan", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, WMNullableResourcePlan.class)));
    tmpMap.put(_Fields.IS_ENABLE_AND_ACTIVATE, new org.apache.thrift.meta_data.FieldMetaData("isEnableAndActivate", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.IS_FORCE_DEACTIVATE, new org.apache.thrift.meta_data.FieldMetaData("isForceDeactivate", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.IS_REPLACE, new org.apache.thrift.meta_data.FieldMetaData("isReplace", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.NS, new org.apache.thrift.meta_data.FieldMetaData("ns", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WMAlterResourcePlanRequest.class, metaDataMap);
  }

  public WMAlterResourcePlanRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WMAlterResourcePlanRequest(WMAlterResourcePlanRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetResourcePlanName()) {
      this.resourcePlanName = other.resourcePlanName;
    }
    if (other.isSetResourcePlan()) {
      this.resourcePlan = new WMNullableResourcePlan(other.resourcePlan);
    }
    this.isEnableAndActivate = other.isEnableAndActivate;
    this.isForceDeactivate = other.isForceDeactivate;
    this.isReplace = other.isReplace;
    if (other.isSetNs()) {
      this.ns = other.ns;
    }
  }

  @Override
  public WMAlterResourcePlanRequest deepCopy() {
    return new WMAlterResourcePlanRequest(this);
  }

  @Override
  public void clear() {
    this.resourcePlanName = null;
    this.resourcePlan = null;
    setIsEnableAndActivateIsSet(false);
    this.isEnableAndActivate = false;
    setIsForceDeactivateIsSet(false);
    this.isForceDeactivate = false;
    setIsReplaceIsSet(false);
    this.isReplace = false;
    this.ns = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getResourcePlanName() {
    return this.resourcePlanName;
  }

  public WMAlterResourcePlanRequest setResourcePlanName(@org.apache.thrift.annotation.Nullable java.lang.String resourcePlanName) {
    this.resourcePlanName = resourcePlanName;
    return this;
  }

  public void unsetResourcePlanName() {
    this.resourcePlanName = null;
  }

  /** Returns true if field resourcePlanName is set (has been assigned a value) and false otherwise */
  public boolean isSetResourcePlanName() {
    return this.resourcePlanName != null;
  }

  public void setResourcePlanNameIsSet(boolean value) {
    if (!value) {
      this.resourcePlanName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public WMNullableResourcePlan getResourcePlan() {
    return this.resourcePlan;
  }

  public WMAlterResourcePlanRequest setResourcePlan(@org.apache.thrift.annotation.Nullable WMNullableResourcePlan resourcePlan) {
    this.resourcePlan = resourcePlan;
    return this;
  }

  public void unsetResourcePlan() {
    this.resourcePlan = null;
  }

  /** Returns true if field resourcePlan is set (has been assigned a value) and false otherwise */
  public boolean isSetResourcePlan() {
    return this.resourcePlan != null;
  }

  public void setResourcePlanIsSet(boolean value) {
    if (!value) {
      this.resourcePlan = null;
    }
  }

  public boolean isIsEnableAndActivate() {
    return this.isEnableAndActivate;
  }

  public WMAlterResourcePlanRequest setIsEnableAndActivate(boolean isEnableAndActivate) {
    this.isEnableAndActivate = isEnableAndActivate;
    setIsEnableAndActivateIsSet(true);
    return this;
  }

  public void unsetIsEnableAndActivate() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISENABLEANDACTIVATE_ISSET_ID);
  }

  /** Returns true if field isEnableAndActivate is set (has been assigned a value) and false otherwise */
  public boolean isSetIsEnableAndActivate() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISENABLEANDACTIVATE_ISSET_ID);
  }

  public void setIsEnableAndActivateIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISENABLEANDACTIVATE_ISSET_ID, value);
  }

  public boolean isIsForceDeactivate() {
    return this.isForceDeactivate;
  }

  public WMAlterResourcePlanRequest setIsForceDeactivate(boolean isForceDeactivate) {
    this.isForceDeactivate = isForceDeactivate;
    setIsForceDeactivateIsSet(true);
    return this;
  }

  public void unsetIsForceDeactivate() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISFORCEDEACTIVATE_ISSET_ID);
  }

  /** Returns true if field isForceDeactivate is set (has been assigned a value) and false otherwise */
  public boolean isSetIsForceDeactivate() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISFORCEDEACTIVATE_ISSET_ID);
  }

  public void setIsForceDeactivateIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISFORCEDEACTIVATE_ISSET_ID, value);
  }

  public boolean isIsReplace() {
    return this.isReplace;
  }

  public WMAlterResourcePlanRequest setIsReplace(boolean isReplace) {
    this.isReplace = isReplace;
    setIsReplaceIsSet(true);
    return this;
  }

  public void unsetIsReplace() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISREPLACE_ISSET_ID);
  }

  /** Returns true if field isReplace is set (has been assigned a value) and false otherwise */
  public boolean isSetIsReplace() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISREPLACE_ISSET_ID);
  }

  public void setIsReplaceIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISREPLACE_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getNs() {
    return this.ns;
  }

  public WMAlterResourcePlanRequest setNs(@org.apache.thrift.annotation.Nullable java.lang.String ns) {
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
    case RESOURCE_PLAN_NAME:
      if (value == null) {
        unsetResourcePlanName();
      } else {
        setResourcePlanName((java.lang.String)value);
      }
      break;

    case RESOURCE_PLAN:
      if (value == null) {
        unsetResourcePlan();
      } else {
        setResourcePlan((WMNullableResourcePlan)value);
      }
      break;

    case IS_ENABLE_AND_ACTIVATE:
      if (value == null) {
        unsetIsEnableAndActivate();
      } else {
        setIsEnableAndActivate((java.lang.Boolean)value);
      }
      break;

    case IS_FORCE_DEACTIVATE:
      if (value == null) {
        unsetIsForceDeactivate();
      } else {
        setIsForceDeactivate((java.lang.Boolean)value);
      }
      break;

    case IS_REPLACE:
      if (value == null) {
        unsetIsReplace();
      } else {
        setIsReplace((java.lang.Boolean)value);
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
    case RESOURCE_PLAN_NAME:
      return getResourcePlanName();

    case RESOURCE_PLAN:
      return getResourcePlan();

    case IS_ENABLE_AND_ACTIVATE:
      return isIsEnableAndActivate();

    case IS_FORCE_DEACTIVATE:
      return isIsForceDeactivate();

    case IS_REPLACE:
      return isIsReplace();

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
    case RESOURCE_PLAN_NAME:
      return isSetResourcePlanName();
    case RESOURCE_PLAN:
      return isSetResourcePlan();
    case IS_ENABLE_AND_ACTIVATE:
      return isSetIsEnableAndActivate();
    case IS_FORCE_DEACTIVATE:
      return isSetIsForceDeactivate();
    case IS_REPLACE:
      return isSetIsReplace();
    case NS:
      return isSetNs();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof WMAlterResourcePlanRequest)
      return this.equals((WMAlterResourcePlanRequest)that);
    return false;
  }

  public boolean equals(WMAlterResourcePlanRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_resourcePlanName = true && this.isSetResourcePlanName();
    boolean that_present_resourcePlanName = true && that.isSetResourcePlanName();
    if (this_present_resourcePlanName || that_present_resourcePlanName) {
      if (!(this_present_resourcePlanName && that_present_resourcePlanName))
        return false;
      if (!this.resourcePlanName.equals(that.resourcePlanName))
        return false;
    }

    boolean this_present_resourcePlan = true && this.isSetResourcePlan();
    boolean that_present_resourcePlan = true && that.isSetResourcePlan();
    if (this_present_resourcePlan || that_present_resourcePlan) {
      if (!(this_present_resourcePlan && that_present_resourcePlan))
        return false;
      if (!this.resourcePlan.equals(that.resourcePlan))
        return false;
    }

    boolean this_present_isEnableAndActivate = true && this.isSetIsEnableAndActivate();
    boolean that_present_isEnableAndActivate = true && that.isSetIsEnableAndActivate();
    if (this_present_isEnableAndActivate || that_present_isEnableAndActivate) {
      if (!(this_present_isEnableAndActivate && that_present_isEnableAndActivate))
        return false;
      if (this.isEnableAndActivate != that.isEnableAndActivate)
        return false;
    }

    boolean this_present_isForceDeactivate = true && this.isSetIsForceDeactivate();
    boolean that_present_isForceDeactivate = true && that.isSetIsForceDeactivate();
    if (this_present_isForceDeactivate || that_present_isForceDeactivate) {
      if (!(this_present_isForceDeactivate && that_present_isForceDeactivate))
        return false;
      if (this.isForceDeactivate != that.isForceDeactivate)
        return false;
    }

    boolean this_present_isReplace = true && this.isSetIsReplace();
    boolean that_present_isReplace = true && that.isSetIsReplace();
    if (this_present_isReplace || that_present_isReplace) {
      if (!(this_present_isReplace && that_present_isReplace))
        return false;
      if (this.isReplace != that.isReplace)
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

    hashCode = hashCode * 8191 + ((isSetResourcePlanName()) ? 131071 : 524287);
    if (isSetResourcePlanName())
      hashCode = hashCode * 8191 + resourcePlanName.hashCode();

    hashCode = hashCode * 8191 + ((isSetResourcePlan()) ? 131071 : 524287);
    if (isSetResourcePlan())
      hashCode = hashCode * 8191 + resourcePlan.hashCode();

    hashCode = hashCode * 8191 + ((isSetIsEnableAndActivate()) ? 131071 : 524287);
    if (isSetIsEnableAndActivate())
      hashCode = hashCode * 8191 + ((isEnableAndActivate) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetIsForceDeactivate()) ? 131071 : 524287);
    if (isSetIsForceDeactivate())
      hashCode = hashCode * 8191 + ((isForceDeactivate) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetIsReplace()) ? 131071 : 524287);
    if (isSetIsReplace())
      hashCode = hashCode * 8191 + ((isReplace) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetNs()) ? 131071 : 524287);
    if (isSetNs())
      hashCode = hashCode * 8191 + ns.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(WMAlterResourcePlanRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetResourcePlanName(), other.isSetResourcePlanName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResourcePlanName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resourcePlanName, other.resourcePlanName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetResourcePlan(), other.isSetResourcePlan());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResourcePlan()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resourcePlan, other.resourcePlan);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIsEnableAndActivate(), other.isSetIsEnableAndActivate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsEnableAndActivate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isEnableAndActivate, other.isEnableAndActivate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIsForceDeactivate(), other.isSetIsForceDeactivate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsForceDeactivate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isForceDeactivate, other.isForceDeactivate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIsReplace(), other.isSetIsReplace());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsReplace()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isReplace, other.isReplace);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("WMAlterResourcePlanRequest(");
    boolean first = true;

    if (isSetResourcePlanName()) {
      sb.append("resourcePlanName:");
      if (this.resourcePlanName == null) {
        sb.append("null");
      } else {
        sb.append(this.resourcePlanName);
      }
      first = false;
    }
    if (isSetResourcePlan()) {
      if (!first) sb.append(", ");
      sb.append("resourcePlan:");
      if (this.resourcePlan == null) {
        sb.append("null");
      } else {
        sb.append(this.resourcePlan);
      }
      first = false;
    }
    if (isSetIsEnableAndActivate()) {
      if (!first) sb.append(", ");
      sb.append("isEnableAndActivate:");
      sb.append(this.isEnableAndActivate);
      first = false;
    }
    if (isSetIsForceDeactivate()) {
      if (!first) sb.append(", ");
      sb.append("isForceDeactivate:");
      sb.append(this.isForceDeactivate);
      first = false;
    }
    if (isSetIsReplace()) {
      if (!first) sb.append(", ");
      sb.append("isReplace:");
      sb.append(this.isReplace);
      first = false;
    }
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
    // check for sub-struct validity
    if (resourcePlan != null) {
      resourcePlan.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class WMAlterResourcePlanRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public WMAlterResourcePlanRequestStandardScheme getScheme() {
      return new WMAlterResourcePlanRequestStandardScheme();
    }
  }

  private static class WMAlterResourcePlanRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<WMAlterResourcePlanRequest> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, WMAlterResourcePlanRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESOURCE_PLAN_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.resourcePlanName = iprot.readString();
              struct.setResourcePlanNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RESOURCE_PLAN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.resourcePlan = new WMNullableResourcePlan();
              struct.resourcePlan.read(iprot);
              struct.setResourcePlanIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IS_ENABLE_AND_ACTIVATE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isEnableAndActivate = iprot.readBool();
              struct.setIsEnableAndActivateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // IS_FORCE_DEACTIVATE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isForceDeactivate = iprot.readBool();
              struct.setIsForceDeactivateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // IS_REPLACE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isReplace = iprot.readBool();
              struct.setIsReplaceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // NS
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, WMAlterResourcePlanRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.resourcePlanName != null) {
        if (struct.isSetResourcePlanName()) {
          oprot.writeFieldBegin(RESOURCE_PLAN_NAME_FIELD_DESC);
          oprot.writeString(struct.resourcePlanName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.resourcePlan != null) {
        if (struct.isSetResourcePlan()) {
          oprot.writeFieldBegin(RESOURCE_PLAN_FIELD_DESC);
          struct.resourcePlan.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetIsEnableAndActivate()) {
        oprot.writeFieldBegin(IS_ENABLE_AND_ACTIVATE_FIELD_DESC);
        oprot.writeBool(struct.isEnableAndActivate);
        oprot.writeFieldEnd();
      }
      if (struct.isSetIsForceDeactivate()) {
        oprot.writeFieldBegin(IS_FORCE_DEACTIVATE_FIELD_DESC);
        oprot.writeBool(struct.isForceDeactivate);
        oprot.writeFieldEnd();
      }
      if (struct.isSetIsReplace()) {
        oprot.writeFieldBegin(IS_REPLACE_FIELD_DESC);
        oprot.writeBool(struct.isReplace);
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

  private static class WMAlterResourcePlanRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public WMAlterResourcePlanRequestTupleScheme getScheme() {
      return new WMAlterResourcePlanRequestTupleScheme();
    }
  }

  private static class WMAlterResourcePlanRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<WMAlterResourcePlanRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WMAlterResourcePlanRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetResourcePlanName()) {
        optionals.set(0);
      }
      if (struct.isSetResourcePlan()) {
        optionals.set(1);
      }
      if (struct.isSetIsEnableAndActivate()) {
        optionals.set(2);
      }
      if (struct.isSetIsForceDeactivate()) {
        optionals.set(3);
      }
      if (struct.isSetIsReplace()) {
        optionals.set(4);
      }
      if (struct.isSetNs()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetResourcePlanName()) {
        oprot.writeString(struct.resourcePlanName);
      }
      if (struct.isSetResourcePlan()) {
        struct.resourcePlan.write(oprot);
      }
      if (struct.isSetIsEnableAndActivate()) {
        oprot.writeBool(struct.isEnableAndActivate);
      }
      if (struct.isSetIsForceDeactivate()) {
        oprot.writeBool(struct.isForceDeactivate);
      }
      if (struct.isSetIsReplace()) {
        oprot.writeBool(struct.isReplace);
      }
      if (struct.isSetNs()) {
        oprot.writeString(struct.ns);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WMAlterResourcePlanRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.resourcePlanName = iprot.readString();
        struct.setResourcePlanNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.resourcePlan = new WMNullableResourcePlan();
        struct.resourcePlan.read(iprot);
        struct.setResourcePlanIsSet(true);
      }
      if (incoming.get(2)) {
        struct.isEnableAndActivate = iprot.readBool();
        struct.setIsEnableAndActivateIsSet(true);
      }
      if (incoming.get(3)) {
        struct.isForceDeactivate = iprot.readBool();
        struct.setIsForceDeactivateIsSet(true);
      }
      if (incoming.get(4)) {
        struct.isReplace = iprot.readBool();
        struct.setIsReplaceIsSet(true);
      }
      if (incoming.get(5)) {
        struct.ns = iprot.readString();
        struct.setNsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

