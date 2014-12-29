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

public enum ZooKeeperExceptionType implements org.apache.thrift.TEnum {
  SYSTEMERROR(0),
  RUNTIMEINCONSISTENCY(1),
  DATAINCONSISTENCY(2),
  CONNECTIONLOSS(3),
  MARSHALLINGERROR(4),
  UNIMPLEMENTED(5),
  OPERATIONTIMEOUT(6),
  BADARGUMENTS(7),
  APIERROR(8),
  NOAUTH(9),
  NOCHILDRENFOREPHEMERALS(10),
  INVALIDACL(11),
  AUTHFAILED(12),
  SESSIONEXPIRED(13),
  INVALIDCALLBACK(14),
  SESSIONMOVED(15),
  NOTREADONLY(16);

  private final int value;

  private ZooKeeperExceptionType(int value) {
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
  public static ZooKeeperExceptionType findByValue(int value) { 
    switch (value) {
      case 0:
        return SYSTEMERROR;
      case 1:
        return RUNTIMEINCONSISTENCY;
      case 2:
        return DATAINCONSISTENCY;
      case 3:
        return CONNECTIONLOSS;
      case 4:
        return MARSHALLINGERROR;
      case 5:
        return UNIMPLEMENTED;
      case 6:
        return OPERATIONTIMEOUT;
      case 7:
        return BADARGUMENTS;
      case 8:
        return APIERROR;
      case 9:
        return NOAUTH;
      case 10:
        return NOCHILDRENFOREPHEMERALS;
      case 11:
        return INVALIDACL;
      case 12:
        return AUTHFAILED;
      case 13:
        return SESSIONEXPIRED;
      case 14:
        return INVALIDCALLBACK;
      case 15:
        return SESSIONMOVED;
      case 16:
        return NOTREADONLY;
      default:
        return null;
    }
  }
}
