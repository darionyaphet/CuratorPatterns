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

public enum CreateMode implements org.apache.thrift.TEnum {
  PERSISTENT(0),
  PERSISTENT_SEQUENTIAL(1),
  EPHEMERAL(2),
  EPHEMERAL_SEQUENTIAL(3);

  private final int value;

  private CreateMode(int value) {
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
  public static CreateMode findByValue(int value) { 
    switch (value) {
      case 0:
        return PERSISTENT;
      case 1:
        return PERSISTENT_SEQUENTIAL;
      case 2:
        return EPHEMERAL;
      case 3:
        return EPHEMERAL_SEQUENTIAL;
      default:
        return null;
    }
  }
}
