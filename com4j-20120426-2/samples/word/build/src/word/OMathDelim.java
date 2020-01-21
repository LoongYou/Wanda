package word  ;

import com4j.*;

@IID("{C94688A6-A2A7-4133-A26D-726CD569D5F3}")
public interface OMathDelim extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(7)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "E"
   * </p>
   * @return  Returns a value of type word.OMathArgs
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(10)
  word.OMathArgs e();


  @VTID(10)
  @ReturnValue(defaultPropertyThrough={word.OMathArgs.class})
  word.OMath e(
    int index);

  /**
   * <p>
   * Getter method for the COM property "BegChar"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(11)
  short begChar();


  /**
   * <p>
   * Setter method for the COM property "BegChar"
   * </p>
   * @param prop Mandatory short parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(12)
  void begChar(
    short prop);


  /**
   * <p>
   * Getter method for the COM property "SepChar"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(13)
  short sepChar();


  /**
   * <p>
   * Setter method for the COM property "SepChar"
   * </p>
   * @param prop Mandatory short parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(14)
  void sepChar(
    short prop);


  /**
   * <p>
   * Getter method for the COM property "EndChar"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(15)
  short endChar();


  /**
   * <p>
   * Setter method for the COM property "EndChar"
   * </p>
   * @param prop Mandatory short parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(16)
  void endChar(
    short prop);


  /**
   * <p>
   * Getter method for the COM property "Grow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(17)
  boolean grow();


  /**
   * <p>
   * Setter method for the COM property "Grow"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(18)
  void grow(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Shape"
   * </p>
   * @return  Returns a value of type word.WdOMathShapeType
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(19)
  word.WdOMathShapeType shape();


  /**
   * <p>
   * Setter method for the COM property "Shape"
   * </p>
   * @param prop Mandatory word.WdOMathShapeType parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(20)
  void shape(
    word.WdOMathShapeType prop);


  /**
   * <p>
   * Getter method for the COM property "NoLeftChar"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(21)
  boolean noLeftChar();


  /**
   * <p>
   * Setter method for the COM property "NoLeftChar"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(22)
  void noLeftChar(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "NoRightChar"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(23)
  boolean noRightChar();


  /**
   * <p>
   * Setter method for the COM property "NoRightChar"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(24)
  void noRightChar(
    boolean prop);


  // Properties:
}
