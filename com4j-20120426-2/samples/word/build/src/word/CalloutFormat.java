package word  ;

import com4j.*;

@IID("{000209C5-0000-0000-C000-000000000046}")
public interface CalloutFormat extends Com4jObject {
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

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Accent"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(10)
  office.MsoTriState accent();


  /**
   * <p>
   * Setter method for the COM property "Accent"
   * </p>
   * @param prop Mandatory office.MsoTriState parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(11)
  void accent(
    office.MsoTriState prop);


  /**
   * <p>
   * Getter method for the COM property "Angle"
   * </p>
   * @return  Returns a value of type office.MsoCalloutAngleType
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(12)
  office.MsoCalloutAngleType angle();


  /**
   * <p>
   * Setter method for the COM property "Angle"
   * </p>
   * @param prop Mandatory office.MsoCalloutAngleType parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(13)
  void angle(
    office.MsoCalloutAngleType prop);


  /**
   * <p>
   * Getter method for the COM property "AutoAttach"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(14)
  office.MsoTriState autoAttach();


  /**
   * <p>
   * Setter method for the COM property "AutoAttach"
   * </p>
   * @param prop Mandatory office.MsoTriState parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(15)
  void autoAttach(
    office.MsoTriState prop);


  /**
   * <p>
   * Getter method for the COM property "AutoLength"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(16)
  office.MsoTriState autoLength();


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(17)
  office.MsoTriState border();


  /**
   * <p>
   * Setter method for the COM property "Border"
   * </p>
   * @param prop Mandatory office.MsoTriState parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(18)
  void border(
    office.MsoTriState prop);


  /**
   * <p>
   * Getter method for the COM property "Drop"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(19)
  float drop();


  /**
   * <p>
   * Getter method for the COM property "DropType"
   * </p>
   * @return  Returns a value of type office.MsoCalloutDropType
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(20)
  office.MsoCalloutDropType dropType();


  /**
   * <p>
   * Getter method for the COM property "Gap"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(21)
  float gap();


  /**
   * <p>
   * Setter method for the COM property "Gap"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(22)
  void gap(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Length"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(23)
  float length();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type office.MsoCalloutType
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(24)
  office.MsoCalloutType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param prop Mandatory office.MsoCalloutType parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(25)
  void type(
    office.MsoCalloutType prop);


  /**
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(26)
  void automaticLength();


  /**
   * @param drop Mandatory float parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(27)
  void customDrop(
    float drop);


  /**
   * @param length Mandatory float parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(28)
  void customLength(
    float length);


  /**
   * @param dropType Mandatory office.MsoCalloutDropType parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(29)
  void presetDrop(
    office.MsoCalloutDropType dropType);


  // Properties:
}
