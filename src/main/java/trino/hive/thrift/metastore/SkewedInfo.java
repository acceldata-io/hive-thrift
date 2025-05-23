/**
 * Autogenerated by Thrift Compiler (0.21.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package io.trino.hive.thrift.metastore;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class SkewedInfo implements org.apache.thrift.TBase<SkewedInfo, SkewedInfo._Fields>, java.io.Serializable, Cloneable, Comparable<SkewedInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SkewedInfo");

  private static final org.apache.thrift.protocol.TField SKEWED_COL_NAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("skewedColNames", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField SKEWED_COL_VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("skewedColValues", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField SKEWED_COL_VALUE_LOCATION_MAPS_FIELD_DESC = new org.apache.thrift.protocol.TField("skewedColValueLocationMaps", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SkewedInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SkewedInfoTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> skewedColNames; // required
  private @org.apache.thrift.annotation.Nullable java.util.List<java.util.List<java.lang.String>> skewedColValues; // required
  private @org.apache.thrift.annotation.Nullable java.util.Map<java.util.List<java.lang.String>,java.lang.String> skewedColValueLocationMaps; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SKEWED_COL_NAMES((short)1, "skewedColNames"),
    SKEWED_COL_VALUES((short)2, "skewedColValues"),
    SKEWED_COL_VALUE_LOCATION_MAPS((short)3, "skewedColValueLocationMaps");

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
        case 1: // SKEWED_COL_NAMES
          return SKEWED_COL_NAMES;
        case 2: // SKEWED_COL_VALUES
          return SKEWED_COL_VALUES;
        case 3: // SKEWED_COL_VALUE_LOCATION_MAPS
          return SKEWED_COL_VALUE_LOCATION_MAPS;
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
    tmpMap.put(_Fields.SKEWED_COL_NAMES, new org.apache.thrift.meta_data.FieldMetaData("skewedColNames", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.SKEWED_COL_VALUES, new org.apache.thrift.meta_data.FieldMetaData("skewedColValues", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)))));
    tmpMap.put(_Fields.SKEWED_COL_VALUE_LOCATION_MAPS, new org.apache.thrift.meta_data.FieldMetaData("skewedColValueLocationMaps", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SkewedInfo.class, metaDataMap);
  }

  public SkewedInfo() {
  }

  public SkewedInfo(
    java.util.List<java.lang.String> skewedColNames,
    java.util.List<java.util.List<java.lang.String>> skewedColValues,
    java.util.Map<java.util.List<java.lang.String>,java.lang.String> skewedColValueLocationMaps)
  {
    this();
    this.skewedColNames = skewedColNames;
    this.skewedColValues = skewedColValues;
    this.skewedColValueLocationMaps = skewedColValueLocationMaps;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SkewedInfo(SkewedInfo other) {
    if (other.isSetSkewedColNames()) {
      java.util.List<java.lang.String> __this__skewedColNames = new java.util.ArrayList<java.lang.String>(other.skewedColNames);
      this.skewedColNames = __this__skewedColNames;
    }
    if (other.isSetSkewedColValues()) {
      java.util.List<java.util.List<java.lang.String>> __this__skewedColValues = new java.util.ArrayList<java.util.List<java.lang.String>>(other.skewedColValues.size());
      for (java.util.List<java.lang.String> other_element : other.skewedColValues) {
        java.util.List<java.lang.String> __this__skewedColValues_copy = new java.util.ArrayList<java.lang.String>(other_element);
        __this__skewedColValues.add(__this__skewedColValues_copy);
      }
      this.skewedColValues = __this__skewedColValues;
    }
    if (other.isSetSkewedColValueLocationMaps()) {
      java.util.Map<java.util.List<java.lang.String>,java.lang.String> __this__skewedColValueLocationMaps = new java.util.TreeMap<java.util.List<java.lang.String>,java.lang.String>();
      for (java.util.Map.Entry<java.util.List<java.lang.String>, java.lang.String> other_element : other.skewedColValueLocationMaps.entrySet()) {

        java.util.List<java.lang.String> other_element_key = other_element.getKey();
        java.lang.String other_element_value = other_element.getValue();

        java.util.List<java.lang.String> __this__skewedColValueLocationMaps_copy_key = new java.util.ArrayList<java.lang.String>(other_element_key);

        java.lang.String __this__skewedColValueLocationMaps_copy_value = other_element_value;

        __this__skewedColValueLocationMaps.put(__this__skewedColValueLocationMaps_copy_key, __this__skewedColValueLocationMaps_copy_value);
      }
      this.skewedColValueLocationMaps = __this__skewedColValueLocationMaps;
    }
  }

  @Override
  public SkewedInfo deepCopy() {
    return new SkewedInfo(this);
  }

  @Override
  public void clear() {
    this.skewedColNames = null;
    this.skewedColValues = null;
    this.skewedColValueLocationMaps = null;
  }

  public int getSkewedColNamesSize() {
    return (this.skewedColNames == null) ? 0 : this.skewedColNames.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getSkewedColNamesIterator() {
    return (this.skewedColNames == null) ? null : this.skewedColNames.iterator();
  }

  public void addToSkewedColNames(java.lang.String elem) {
    if (this.skewedColNames == null) {
      this.skewedColNames = new java.util.ArrayList<java.lang.String>();
    }
    this.skewedColNames.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getSkewedColNames() {
    return this.skewedColNames;
  }

  public SkewedInfo setSkewedColNames(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> skewedColNames) {
    this.skewedColNames = skewedColNames;
    return this;
  }

  public void unsetSkewedColNames() {
    this.skewedColNames = null;
  }

  /** Returns true if field skewedColNames is set (has been assigned a value) and false otherwise */
  public boolean isSetSkewedColNames() {
    return this.skewedColNames != null;
  }

  public void setSkewedColNamesIsSet(boolean value) {
    if (!value) {
      this.skewedColNames = null;
    }
  }

  public int getSkewedColValuesSize() {
    return (this.skewedColValues == null) ? 0 : this.skewedColValues.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.util.List<java.lang.String>> getSkewedColValuesIterator() {
    return (this.skewedColValues == null) ? null : this.skewedColValues.iterator();
  }

  public void addToSkewedColValues(java.util.List<java.lang.String> elem) {
    if (this.skewedColValues == null) {
      this.skewedColValues = new java.util.ArrayList<java.util.List<java.lang.String>>();
    }
    this.skewedColValues.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.util.List<java.lang.String>> getSkewedColValues() {
    return this.skewedColValues;
  }

  public SkewedInfo setSkewedColValues(@org.apache.thrift.annotation.Nullable java.util.List<java.util.List<java.lang.String>> skewedColValues) {
    this.skewedColValues = skewedColValues;
    return this;
  }

  public void unsetSkewedColValues() {
    this.skewedColValues = null;
  }

  /** Returns true if field skewedColValues is set (has been assigned a value) and false otherwise */
  public boolean isSetSkewedColValues() {
    return this.skewedColValues != null;
  }

  public void setSkewedColValuesIsSet(boolean value) {
    if (!value) {
      this.skewedColValues = null;
    }
  }

  public int getSkewedColValueLocationMapsSize() {
    return (this.skewedColValueLocationMaps == null) ? 0 : this.skewedColValueLocationMaps.size();
  }

  public void putToSkewedColValueLocationMaps(java.util.List<java.lang.String> key, java.lang.String val) {
    if (this.skewedColValueLocationMaps == null) {
      this.skewedColValueLocationMaps = new java.util.TreeMap<java.util.List<java.lang.String>,java.lang.String>();
    }
    this.skewedColValueLocationMaps.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.util.List<java.lang.String>,java.lang.String> getSkewedColValueLocationMaps() {
    return this.skewedColValueLocationMaps;
  }

  public SkewedInfo setSkewedColValueLocationMaps(@org.apache.thrift.annotation.Nullable java.util.Map<java.util.List<java.lang.String>,java.lang.String> skewedColValueLocationMaps) {
    this.skewedColValueLocationMaps = skewedColValueLocationMaps;
    return this;
  }

  public void unsetSkewedColValueLocationMaps() {
    this.skewedColValueLocationMaps = null;
  }

  /** Returns true if field skewedColValueLocationMaps is set (has been assigned a value) and false otherwise */
  public boolean isSetSkewedColValueLocationMaps() {
    return this.skewedColValueLocationMaps != null;
  }

  public void setSkewedColValueLocationMapsIsSet(boolean value) {
    if (!value) {
      this.skewedColValueLocationMaps = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SKEWED_COL_NAMES:
      if (value == null) {
        unsetSkewedColNames();
      } else {
        setSkewedColNames((java.util.List<java.lang.String>)value);
      }
      break;

    case SKEWED_COL_VALUES:
      if (value == null) {
        unsetSkewedColValues();
      } else {
        setSkewedColValues((java.util.List<java.util.List<java.lang.String>>)value);
      }
      break;

    case SKEWED_COL_VALUE_LOCATION_MAPS:
      if (value == null) {
        unsetSkewedColValueLocationMaps();
      } else {
        setSkewedColValueLocationMaps((java.util.Map<java.util.List<java.lang.String>,java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SKEWED_COL_NAMES:
      return getSkewedColNames();

    case SKEWED_COL_VALUES:
      return getSkewedColValues();

    case SKEWED_COL_VALUE_LOCATION_MAPS:
      return getSkewedColValueLocationMaps();

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
    case SKEWED_COL_NAMES:
      return isSetSkewedColNames();
    case SKEWED_COL_VALUES:
      return isSetSkewedColValues();
    case SKEWED_COL_VALUE_LOCATION_MAPS:
      return isSetSkewedColValueLocationMaps();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof SkewedInfo)
      return this.equals((SkewedInfo)that);
    return false;
  }

  public boolean equals(SkewedInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_skewedColNames = true && this.isSetSkewedColNames();
    boolean that_present_skewedColNames = true && that.isSetSkewedColNames();
    if (this_present_skewedColNames || that_present_skewedColNames) {
      if (!(this_present_skewedColNames && that_present_skewedColNames))
        return false;
      if (!this.skewedColNames.equals(that.skewedColNames))
        return false;
    }

    boolean this_present_skewedColValues = true && this.isSetSkewedColValues();
    boolean that_present_skewedColValues = true && that.isSetSkewedColValues();
    if (this_present_skewedColValues || that_present_skewedColValues) {
      if (!(this_present_skewedColValues && that_present_skewedColValues))
        return false;
      if (!this.skewedColValues.equals(that.skewedColValues))
        return false;
    }

    boolean this_present_skewedColValueLocationMaps = true && this.isSetSkewedColValueLocationMaps();
    boolean that_present_skewedColValueLocationMaps = true && that.isSetSkewedColValueLocationMaps();
    if (this_present_skewedColValueLocationMaps || that_present_skewedColValueLocationMaps) {
      if (!(this_present_skewedColValueLocationMaps && that_present_skewedColValueLocationMaps))
        return false;
      if (!this.skewedColValueLocationMaps.equals(that.skewedColValueLocationMaps))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSkewedColNames()) ? 131071 : 524287);
    if (isSetSkewedColNames())
      hashCode = hashCode * 8191 + skewedColNames.hashCode();

    hashCode = hashCode * 8191 + ((isSetSkewedColValues()) ? 131071 : 524287);
    if (isSetSkewedColValues())
      hashCode = hashCode * 8191 + skewedColValues.hashCode();

    hashCode = hashCode * 8191 + ((isSetSkewedColValueLocationMaps()) ? 131071 : 524287);
    if (isSetSkewedColValueLocationMaps())
      hashCode = hashCode * 8191 + skewedColValueLocationMaps.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SkewedInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetSkewedColNames(), other.isSetSkewedColNames());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSkewedColNames()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.skewedColNames, other.skewedColNames);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSkewedColValues(), other.isSetSkewedColValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSkewedColValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.skewedColValues, other.skewedColValues);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSkewedColValueLocationMaps(), other.isSetSkewedColValueLocationMaps());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSkewedColValueLocationMaps()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.skewedColValueLocationMaps, other.skewedColValueLocationMaps);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SkewedInfo(");
    boolean first = true;

    sb.append("skewedColNames:");
    if (this.skewedColNames == null) {
      sb.append("null");
    } else {
      sb.append(this.skewedColNames);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("skewedColValues:");
    if (this.skewedColValues == null) {
      sb.append("null");
    } else {
      sb.append(this.skewedColValues);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("skewedColValueLocationMaps:");
    if (this.skewedColValueLocationMaps == null) {
      sb.append("null");
    } else {
      sb.append(this.skewedColValueLocationMaps);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class SkewedInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public SkewedInfoStandardScheme getScheme() {
      return new SkewedInfoStandardScheme();
    }
  }

  private static class SkewedInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<SkewedInfo> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, SkewedInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SKEWED_COL_NAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list226 = iprot.readListBegin();
                struct.skewedColNames = new java.util.ArrayList<java.lang.String>(_list226.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem227;
                for (int _i228 = 0; _i228 < _list226.size; ++_i228)
                {
                  _elem227 = iprot.readString();
                  struct.skewedColNames.add(_elem227);
                }
                iprot.readListEnd();
              }
              struct.setSkewedColNamesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SKEWED_COL_VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list229 = iprot.readListBegin();
                struct.skewedColValues = new java.util.ArrayList<java.util.List<java.lang.String>>(_list229.size);
                @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> _elem230;
                for (int _i231 = 0; _i231 < _list229.size; ++_i231)
                {
                  {
                    org.apache.thrift.protocol.TList _list232 = iprot.readListBegin();
                    _elem230 = new java.util.ArrayList<java.lang.String>(_list232.size);
                    @org.apache.thrift.annotation.Nullable java.lang.String _elem233;
                    for (int _i234 = 0; _i234 < _list232.size; ++_i234)
                    {
                      _elem233 = iprot.readString();
                      _elem230.add(_elem233);
                    }
                    iprot.readListEnd();
                  }
                  struct.skewedColValues.add(_elem230);
                }
                iprot.readListEnd();
              }
              struct.setSkewedColValuesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SKEWED_COL_VALUE_LOCATION_MAPS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map235 = iprot.readMapBegin();
                struct.skewedColValueLocationMaps = new java.util.TreeMap<java.util.List<java.lang.String>,java.lang.String>();
                @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> _key236;
                @org.apache.thrift.annotation.Nullable java.lang.String _val237;
                for (int _i238 = 0; _i238 < _map235.size; ++_i238)
                {
                  {
                    org.apache.thrift.protocol.TList _list239 = iprot.readListBegin();
                    _key236 = new java.util.ArrayList<java.lang.String>(_list239.size);
                    @org.apache.thrift.annotation.Nullable java.lang.String _elem240;
                    for (int _i241 = 0; _i241 < _list239.size; ++_i241)
                    {
                      _elem240 = iprot.readString();
                      _key236.add(_elem240);
                    }
                    iprot.readListEnd();
                  }
                  _val237 = iprot.readString();
                  struct.skewedColValueLocationMaps.put(_key236, _val237);
                }
                iprot.readMapEnd();
              }
              struct.setSkewedColValueLocationMapsIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, SkewedInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.skewedColNames != null) {
        oprot.writeFieldBegin(SKEWED_COL_NAMES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.skewedColNames.size()));
          for (java.lang.String _iter242 : struct.skewedColNames)
          {
            oprot.writeString(_iter242);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.skewedColValues != null) {
        oprot.writeFieldBegin(SKEWED_COL_VALUES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, struct.skewedColValues.size()));
          for (java.util.List<java.lang.String> _iter243 : struct.skewedColValues)
          {
            {
              oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, _iter243.size()));
              for (java.lang.String _iter244 : _iter243)
              {
                oprot.writeString(_iter244);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.skewedColValueLocationMaps != null) {
        oprot.writeFieldBegin(SKEWED_COL_VALUE_LOCATION_MAPS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.LIST, org.apache.thrift.protocol.TType.STRING, struct.skewedColValueLocationMaps.size()));
          for (java.util.Map.Entry<java.util.List<java.lang.String>, java.lang.String> _iter245 : struct.skewedColValueLocationMaps.entrySet())
          {
            {
              oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, _iter245.getKey().size()));
              for (java.lang.String _iter246 : _iter245.getKey())
              {
                oprot.writeString(_iter246);
              }
              oprot.writeListEnd();
            }
            oprot.writeString(_iter245.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SkewedInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public SkewedInfoTupleScheme getScheme() {
      return new SkewedInfoTupleScheme();
    }
  }

  private static class SkewedInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<SkewedInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SkewedInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSkewedColNames()) {
        optionals.set(0);
      }
      if (struct.isSetSkewedColValues()) {
        optionals.set(1);
      }
      if (struct.isSetSkewedColValueLocationMaps()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetSkewedColNames()) {
        {
          oprot.writeI32(struct.skewedColNames.size());
          for (java.lang.String _iter247 : struct.skewedColNames)
          {
            oprot.writeString(_iter247);
          }
        }
      }
      if (struct.isSetSkewedColValues()) {
        {
          oprot.writeI32(struct.skewedColValues.size());
          for (java.util.List<java.lang.String> _iter248 : struct.skewedColValues)
          {
            {
              oprot.writeI32(_iter248.size());
              for (java.lang.String _iter249 : _iter248)
              {
                oprot.writeString(_iter249);
              }
            }
          }
        }
      }
      if (struct.isSetSkewedColValueLocationMaps()) {
        {
          oprot.writeI32(struct.skewedColValueLocationMaps.size());
          for (java.util.Map.Entry<java.util.List<java.lang.String>, java.lang.String> _iter250 : struct.skewedColValueLocationMaps.entrySet())
          {
            {
              oprot.writeI32(_iter250.getKey().size());
              for (java.lang.String _iter251 : _iter250.getKey())
              {
                oprot.writeString(_iter251);
              }
            }
            oprot.writeString(_iter250.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SkewedInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list252 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
          struct.skewedColNames = new java.util.ArrayList<java.lang.String>(_list252.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem253;
          for (int _i254 = 0; _i254 < _list252.size; ++_i254)
          {
            _elem253 = iprot.readString();
            struct.skewedColNames.add(_elem253);
          }
        }
        struct.setSkewedColNamesIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list255 = iprot.readListBegin(org.apache.thrift.protocol.TType.LIST);
          struct.skewedColValues = new java.util.ArrayList<java.util.List<java.lang.String>>(_list255.size);
          @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> _elem256;
          for (int _i257 = 0; _i257 < _list255.size; ++_i257)
          {
            {
              org.apache.thrift.protocol.TList _list258 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
              _elem256 = new java.util.ArrayList<java.lang.String>(_list258.size);
              @org.apache.thrift.annotation.Nullable java.lang.String _elem259;
              for (int _i260 = 0; _i260 < _list258.size; ++_i260)
              {
                _elem259 = iprot.readString();
                _elem256.add(_elem259);
              }
            }
            struct.skewedColValues.add(_elem256);
          }
        }
        struct.setSkewedColValuesIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map261 = iprot.readMapBegin(org.apache.thrift.protocol.TType.LIST, org.apache.thrift.protocol.TType.STRING); 
          struct.skewedColValueLocationMaps = new java.util.TreeMap<java.util.List<java.lang.String>,java.lang.String>();
          @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> _key262;
          @org.apache.thrift.annotation.Nullable java.lang.String _val263;
          for (int _i264 = 0; _i264 < _map261.size; ++_i264)
          {
            {
              org.apache.thrift.protocol.TList _list265 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
              _key262 = new java.util.ArrayList<java.lang.String>(_list265.size);
              @org.apache.thrift.annotation.Nullable java.lang.String _elem266;
              for (int _i267 = 0; _i267 < _list265.size; ++_i267)
              {
                _elem266 = iprot.readString();
                _key262.add(_elem266);
              }
            }
            _val263 = iprot.readString();
            struct.skewedColValueLocationMaps.put(_key262, _val263);
          }
        }
        struct.setSkewedColValueLocationMapsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

