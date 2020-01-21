package word  ;

import com4j.*;

@IID("{CEBD4184-4E6D-4FC6-A42D-2142B1B76AF5}")
public interface OMathNary extends Com4jObject {
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
   * Getter method for the COM property "Sub"
   * </p>
   * @return  Returns a value of type word.OMath
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(10)
  word.OMath sub();


  /**
   * <p>
   * Getter method for the COM property "Sup"
   * </p>
   * @return  Returns a value of type word.OMath
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(11)
  word.OMath sup();


  /**
   * <p>
   * Getter method for the COM property "E"
   * </p>
   * @return  Returns a value of type word.OMath
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(12)
  word.OMath e();


  /**
   * <p>
   * Getter method for the COM property "Char"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(13)
  short _char();


  /**
   * <p>
   * Setter method for the COM property "Char"
   * </p>
   * @param prop Mandatory short parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(14)
  void _char(
    short prop);


  /**
   * <p>
   * Getter method for the COM property "Grow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(15)
  boolean grow();


  /**
   * <p>
   * Setter method for the COM property "Grow"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(16)
  void grow(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SubSupLim"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(17)
  boolean subSupLim();


  /**
   * <p>
   * Setter method for the COM property "SubSupLim"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(18)
  void subSupLim(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "HideSub"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(19)
  boolean hideSub();


  /**
   * <p>
   * Setter method for the COM property "HideSub"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(20)
  void hideSub(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "HideSup"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(21)
  boolean hideSup();


  /**
   * <p>
   * Setter method for the COM property "HideSup"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(22)
  void hideSup(
    boolean prop);


  // Properties:
}
