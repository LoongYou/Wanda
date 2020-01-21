package office  ;

import com4j.*;

@IID("{000C03C3-0000-0000-C000-000000000046}")
public interface RulerLevel2 extends office._IMsoDispObj {
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
   * Getter method for the COM property "FirstMargin"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  float firstMargin();


  /**
   * <p>
   * Setter method for the COM property "FirstMargin"
   * </p>
   * @param firstMargin Mandatory float parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  void firstMargin(
    float firstMargin);


  /**
   * <p>
   * Getter method for the COM property "LeftMargin"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  float leftMargin();


  /**
   * <p>
   * Setter method for the COM property "LeftMargin"
   * </p>
   * @param leftMargin Mandatory float parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  void leftMargin(
    float leftMargin);


  // Properties:
}
