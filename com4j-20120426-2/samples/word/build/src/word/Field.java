package word  ;

import com4j.*;

@IID("{0002092F-0000-0000-C000-000000000046}")
public interface Field extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Code"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  word.Range code();


  /**
   * <p>
   * Setter method for the COM property "Code"
   * </p>
   * @param prop Mandatory word.Range parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  void code(
    word.Range prop);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type word.WdFieldType
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(12)
  word.WdFieldType type();


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(13)
  boolean locked();


  /**
   * <p>
   * Setter method for the COM property "Locked"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(14)
  void locked(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Kind"
   * </p>
   * @return  Returns a value of type word.WdFieldKind
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(15)
  word.WdFieldKind kind();


  /**
   * <p>
   * Getter method for the COM property "Result"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(16)
  word.Range result();


  /**
   * <p>
   * Setter method for the COM property "Result"
   * </p>
   * @param prop Mandatory word.Range parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(17)
  void result(
    word.Range prop);


  /**
   * <p>
   * Getter method for the COM property "Data"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String data();


  /**
   * <p>
   * Setter method for the COM property "Data"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(19)
  void data(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type word.Field
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(20)
  word.Field next();


  /**
   * <p>
   * Getter method for the COM property "Previous"
   * </p>
   * @return  Returns a value of type word.Field
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(21)
  word.Field previous();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(22)
  int index();


  /**
   * <p>
   * Getter method for the COM property "ShowCodes"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  boolean showCodes();


  /**
   * <p>
   * Setter method for the COM property "ShowCodes"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(24)
  void showCodes(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "LinkFormat"
   * </p>
   * @return  Returns a value of type word.LinkFormat
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(25)
  word.LinkFormat linkFormat();


  /**
   * <p>
   * Getter method for the COM property "OLEFormat"
   * </p>
   * @return  Returns a value of type word.OLEFormat
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(26)
  word.OLEFormat oleFormat();


  /**
   * <p>
   * Getter method for the COM property "InlineShape"
   * </p>
   * @return  Returns a value of type word.InlineShape
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(27)
  word.InlineShape inlineShape();


  /**
   */

  @DISPID(65535) //= 0xffff. The runtime will prefer the VTID if present
  @VTID(28)
  void select();


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(29)
  boolean update();


  /**
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(30)
  void unlink();


  /**
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(31)
  void updateSource();


  /**
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(32)
  void doClick();


  /**
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(33)
  void copy();


  /**
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(34)
  void cut();


  /**
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(35)
  void delete();


  // Properties:
}
