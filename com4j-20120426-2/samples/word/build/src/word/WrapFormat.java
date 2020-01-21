package word  ;

import com4j.*;

@IID("{000209C3-0000-0000-C000-000000000046}")
public interface WrapFormat extends Com4jObject {
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
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type word.WdWrapType
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(10)
  word.WdWrapType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param prop Mandatory word.WdWrapType parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(11)
  void type(
    word.WdWrapType prop);


  /**
   * <p>
   * Getter method for the COM property "Side"
   * </p>
   * @return  Returns a value of type word.WdWrapSideType
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(12)
  word.WdWrapSideType side();


  /**
   * <p>
   * Setter method for the COM property "Side"
   * </p>
   * @param prop Mandatory word.WdWrapSideType parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(13)
  void side(
    word.WdWrapSideType prop);


  /**
   * <p>
   * Getter method for the COM property "DistanceTop"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(14)
  float distanceTop();


  /**
   * <p>
   * Setter method for the COM property "DistanceTop"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(15)
  void distanceTop(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "DistanceBottom"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(16)
  float distanceBottom();


  /**
   * <p>
   * Setter method for the COM property "DistanceBottom"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(17)
  void distanceBottom(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "DistanceLeft"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(18)
  float distanceLeft();


  /**
   * <p>
   * Setter method for the COM property "DistanceLeft"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(19)
  void distanceLeft(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "DistanceRight"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(20)
  float distanceRight();


  /**
   * <p>
   * Setter method for the COM property "DistanceRight"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(21)
  void distanceRight(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "AllowOverlap"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(22)
  int allowOverlap();


  /**
   * <p>
   * Setter method for the COM property "AllowOverlap"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(23)
  void allowOverlap(
    int prop);


  // Properties:
}
