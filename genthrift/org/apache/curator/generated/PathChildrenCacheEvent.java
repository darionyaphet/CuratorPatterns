/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.curator.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PathChildrenCacheEvent implements org.apache.thrift.TBase<PathChildrenCacheEvent, PathChildrenCacheEvent._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PathChildrenCacheEvent");

  private static final org.apache.thrift.protocol.TField CACHED_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("cachedPath", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("data", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PathChildrenCacheEventStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PathChildrenCacheEventTupleSchemeFactory());
  }

  public String cachedPath; // required
  /**
   * 
   * @see PathChildrenCacheEventType
   */
  public PathChildrenCacheEventType type; // required
  public ChildData data; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CACHED_PATH((short)1, "cachedPath"),
    /**
     * 
     * @see PathChildrenCacheEventType
     */
    TYPE((short)2, "type"),
    DATA((short)3, "data");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CACHED_PATH
          return CACHED_PATH;
        case 2: // TYPE
          return TYPE;
        case 3: // DATA
          return DATA;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CACHED_PATH, new org.apache.thrift.meta_data.FieldMetaData("cachedPath", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, PathChildrenCacheEventType.class)));
    tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ChildData.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PathChildrenCacheEvent.class, metaDataMap);
  }

  public PathChildrenCacheEvent() {
  }

  public PathChildrenCacheEvent(
    String cachedPath,
    PathChildrenCacheEventType type,
    ChildData data)
  {
    this();
    this.cachedPath = cachedPath;
    this.type = type;
    this.data = data;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PathChildrenCacheEvent(PathChildrenCacheEvent other) {
    if (other.isSetCachedPath()) {
      this.cachedPath = other.cachedPath;
    }
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetData()) {
      this.data = new ChildData(other.data);
    }
  }

  public PathChildrenCacheEvent deepCopy() {
    return new PathChildrenCacheEvent(this);
  }

  @Override
  public void clear() {
    this.cachedPath = null;
    this.type = null;
    this.data = null;
  }

  public String getCachedPath() {
    return this.cachedPath;
  }

  public PathChildrenCacheEvent setCachedPath(String cachedPath) {
    this.cachedPath = cachedPath;
    return this;
  }

  public void unsetCachedPath() {
    this.cachedPath = null;
  }

  /** Returns true if field cachedPath is set (has been assigned a value) and false otherwise */
  public boolean isSetCachedPath() {
    return this.cachedPath != null;
  }

  public void setCachedPathIsSet(boolean value) {
    if (!value) {
      this.cachedPath = null;
    }
  }

  /**
   * 
   * @see PathChildrenCacheEventType
   */
  public PathChildrenCacheEventType getType() {
    return this.type;
  }

  /**
   * 
   * @see PathChildrenCacheEventType
   */
  public PathChildrenCacheEvent setType(PathChildrenCacheEventType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public ChildData getData() {
    return this.data;
  }

  public PathChildrenCacheEvent setData(ChildData data) {
    this.data = data;
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CACHED_PATH:
      if (value == null) {
        unsetCachedPath();
      } else {
        setCachedPath((String)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((PathChildrenCacheEventType)value);
      }
      break;

    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((ChildData)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CACHED_PATH:
      return getCachedPath();

    case TYPE:
      return getType();

    case DATA:
      return getData();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CACHED_PATH:
      return isSetCachedPath();
    case TYPE:
      return isSetType();
    case DATA:
      return isSetData();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PathChildrenCacheEvent)
      return this.equals((PathChildrenCacheEvent)that);
    return false;
  }

  public boolean equals(PathChildrenCacheEvent that) {
    if (that == null)
      return false;

    boolean this_present_cachedPath = true && this.isSetCachedPath();
    boolean that_present_cachedPath = true && that.isSetCachedPath();
    if (this_present_cachedPath || that_present_cachedPath) {
      if (!(this_present_cachedPath && that_present_cachedPath))
        return false;
      if (!this.cachedPath.equals(that.cachedPath))
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(PathChildrenCacheEvent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    PathChildrenCacheEvent typedOther = (PathChildrenCacheEvent)other;

    lastComparison = Boolean.valueOf(isSetCachedPath()).compareTo(typedOther.isSetCachedPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCachedPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cachedPath, typedOther.cachedPath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetType()).compareTo(typedOther.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, typedOther.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetData()).compareTo(typedOther.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data, typedOther.data);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PathChildrenCacheEvent(");
    boolean first = true;

    sb.append("cachedPath:");
    if (this.cachedPath == null) {
      sb.append("null");
    } else {
      sb.append(this.cachedPath);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("data:");
    if (this.data == null) {
      sb.append("null");
    } else {
      sb.append(this.data);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PathChildrenCacheEventStandardSchemeFactory implements SchemeFactory {
    public PathChildrenCacheEventStandardScheme getScheme() {
      return new PathChildrenCacheEventStandardScheme();
    }
  }

  private static class PathChildrenCacheEventStandardScheme extends StandardScheme<PathChildrenCacheEvent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PathChildrenCacheEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CACHED_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cachedPath = iprot.readString();
              struct.setCachedPathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = PathChildrenCacheEventType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.data = new ChildData();
              struct.data.read(iprot);
              struct.setDataIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PathChildrenCacheEvent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.cachedPath != null) {
        oprot.writeFieldBegin(CACHED_PATH_FIELD_DESC);
        oprot.writeString(struct.cachedPath);
        oprot.writeFieldEnd();
      }
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.data != null) {
        oprot.writeFieldBegin(DATA_FIELD_DESC);
        struct.data.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PathChildrenCacheEventTupleSchemeFactory implements SchemeFactory {
    public PathChildrenCacheEventTupleScheme getScheme() {
      return new PathChildrenCacheEventTupleScheme();
    }
  }

  private static class PathChildrenCacheEventTupleScheme extends TupleScheme<PathChildrenCacheEvent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PathChildrenCacheEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCachedPath()) {
        optionals.set(0);
      }
      if (struct.isSetType()) {
        optionals.set(1);
      }
      if (struct.isSetData()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetCachedPath()) {
        oprot.writeString(struct.cachedPath);
      }
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetData()) {
        struct.data.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PathChildrenCacheEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.cachedPath = iprot.readString();
        struct.setCachedPathIsSet(true);
      }
      if (incoming.get(1)) {
        struct.type = PathChildrenCacheEventType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.data = new ChildData();
        struct.data.read(iprot);
        struct.setDataIsSet(true);
      }
    }
  }

}

