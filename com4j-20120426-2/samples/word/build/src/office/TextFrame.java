package office  ;

import com4j.*;

@IID("{000C0320-0000-0000-C000-000000000046}")
public interface TextFrame extends office._IMsoDispObj {
  // Methods:
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
   * Getter method for the COM property "MarginBottom"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(10)
  float marginBottom();


  /**
   * <p>
   * Setter method for the COM property "MarginBottom"
   * </p>
   * @param marginBottom Mandatory float parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(11)
  void marginBottom(
    float marginBottom);


  /**
   * <p>
   * Getter method for the COM property "MarginLeft"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(12)
  float marginLeft();


  /**
   * <p>
   * Setter method for the COM property "MarginLeft"
   * </p>
   * @param marginLeft Mandatory float parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(13)
  void marginLeft(
    float marginLeft);


  /**
   * <p>
   * Getter method for the COM property "MarginRight"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(14)
  float marginRight();


  /**
   * <p>
   * Setter method for the COM property "MarginRight"
   * </p>
   * @param marginRight Mandatory float parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(15)
  void marginRight(
    float marginRight);


  /**
   * <p>
   * Getter method for the COM property "MarginTop"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(16)
  float marginTop();


  /**
   * <p>
   * Setter method for the COM property "MarginTop"
   * </p>
   * @param marginTop Mandatory float parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(17)
  void marginTop(
    float marginTop);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type office.MsoTextOrientation
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(18)
  office.MsoTextOrientation orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param orientation Mandatory office.MsoTextOrientation parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(19)
  void orientation(
    office.MsoTextOrientation orientation);


  // Properties:
}
