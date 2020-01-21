package word  ;

import com4j.*;

@IID("{2503B6EE-0889-44DF-B920-6D6F9659DEA3}")
public interface OMathBorderBox extends Com4jObject {
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
   * Getter method for the COM property "HideTop"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(11)
  boolean hideTop();


  /**
   * <p>
   * Setter method for the COM property "HideTop"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(12)
  void hideTop(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "HideBot"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(13)
  boolean hideBot();


  /**
   * <p>
   * Setter method for the COM property "HideBot"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(14)
  void hideBot(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "HideLeft"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(15)
  boolean hideLeft();


  /**
   * <p>
   * Setter method for the COM property "HideLeft"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(16)
  void hideLeft(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "HideRight"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(17)
  boolean hideRight();


  /**
   * <p>
   * Setter method for the COM property "HideRight"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(18)
  void hideRight(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "StrikeH"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(19)
  boolean strikeH();


  /**
   * <p>
   * Setter method for the COM property "StrikeH"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(20)
  void strikeH(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "StrikeV"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(21)
  boolean strikeV();


  /**
   * <p>
   * Setter method for the COM property "StrikeV"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(22)
  void strikeV(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "StrikeBLTR"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(23)
  boolean strikeBLTR();


  /**
   * <p>
   * Setter method for the COM property "StrikeBLTR"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(24)
  void strikeBLTR(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "StrikeTLBR"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(25)
  boolean strikeTLBR();


  /**
   * <p>
   * Setter method for the COM property "StrikeTLBR"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(26)
  void strikeTLBR(
    boolean prop);


  // Properties:
}
