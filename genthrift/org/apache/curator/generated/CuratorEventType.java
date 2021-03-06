/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.curator.generated;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum CuratorEventType implements org.apache.thrift.TEnum {
  PING(0),
  CREATE(1),
  DELETE(2),
  EXISTS(3),
  GET_DATA(4),
  SET_DATA(5),
  CHILDREN(6),
  SYNC(7),
  GET_ACL(8),
  SET_ACL(9),
  WATCHED(10),
  CLOSING(11),
  CONNECTION_CONNECTED(12),
  CONNECTION_SUSPENDED(13),
  CONNECTION_RECONNECTED(14),
  CONNECTION_LOST(15),
  CONNECTION_READ_ONLY(16),
  LEADER(17),
  PATH_CHILDREN_CACHE(18),
  NODE_CACHE(19);

  private final int value;

  private CuratorEventType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static CuratorEventType findByValue(int value) { 
    switch (value) {
      case 0:
        return PING;
      case 1:
        return CREATE;
      case 2:
        return DELETE;
      case 3:
        return EXISTS;
      case 4:
        return GET_DATA;
      case 5:
        return SET_DATA;
      case 6:
        return CHILDREN;
      case 7:
        return SYNC;
      case 8:
        return GET_ACL;
      case 9:
        return SET_ACL;
      case 10:
        return WATCHED;
      case 11:
        return CLOSING;
      case 12:
        return CONNECTION_CONNECTED;
      case 13:
        return CONNECTION_SUSPENDED;
      case 14:
        return CONNECTION_RECONNECTED;
      case 15:
        return CONNECTION_LOST;
      case 16:
        return CONNECTION_READ_ONLY;
      case 17:
        return LEADER;
      case 18:
        return PATH_CHILDREN_CACHE;
      case 19:
        return NODE_CACHE;
      default:
        return null;
    }
  }
}
