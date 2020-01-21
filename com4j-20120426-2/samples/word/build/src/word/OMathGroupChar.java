package word  ;

import com4j.*;

@IID("{02B17CB4-7D55-4B34-B38B-10381433441F}")
public interface OMathGroupChar extends Com4jObject {
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
   * @return  Returns a value of type word.OMath
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(10)
  word.OMath e();


  /**
   * <p>
   * Getter method for the COM property "Char"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(11)
  short _char();


  /**
   * <p>
   * Setter method for the COM property "Char"
   * </p>
   * @param prop Mandatory short parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(12)
  void _char(
    short prop);


  /**
   * <p>
   * Getter method for the COM property "CharTop"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(13)
  boolean charTop();


  /**
   * <p>
   * Setter method for the COM property "CharTop"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(14)
  void charTop(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AlignTop"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(15)
  boolean alignTop();


  /**
   * <p>
   * Setter method for the COM property "AlignTop"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(16)
  void alignTop(
    boolean prop);


  // Properties:
}
