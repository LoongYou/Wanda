package ppt  ;

import com4j.*;

@IID("{914934E7-5A91-11CF-8700-00AA0060263B}")
public interface ScaleEffect extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  ppt._Application application();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "ByX"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  float byX();


  /**
   * <p>
   * Setter method for the COM property "ByX"
   * </p>
   * @param byX Mandatory float parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(10)
  void byX(
    float byX);


  /**
   * <p>
   * Getter method for the COM property "ByY"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(11)
  float byY();


  /**
   * <p>
   * Setter method for the COM property "ByY"
   * </p>
   * @param byY Mandatory float parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(12)
  void byY(
    float byY);


  /**
   * <p>
   * Getter method for the COM property "FromX"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(13)
  float fromX();


  /**
   * <p>
   * Setter method for the COM property "FromX"
   * </p>
   * @param fromX Mandatory float parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(14)
  void fromX(
    float fromX);


  /**
   * <p>
   * Getter method for the COM property "FromY"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(15)
  float fromY();


  /**
   * <p>
   * Setter method for the COM property "FromY"
   * </p>
   * @param fromY Mandatory float parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(16)
  void fromY(
    float fromY);


  /**
   * <p>
   * Getter method for the COM property "ToX"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(17)
  float toX();


  /**
   * <p>
   * Setter method for the COM property "ToX"
   * </p>
   * @param toX Mandatory float parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(18)
  void toX(
    float toX);


  /**
   * <p>
   * Getter method for the COM property "ToY"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(19)
  float toY();


  /**
   * <p>
   * Setter method for the COM property "ToY"
   * </p>
   * @param toY Mandatory float parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(20)
  void toY(
    float toY);


  // Properties:
}
