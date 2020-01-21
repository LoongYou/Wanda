package ppt  ;

import com4j.*;

@IID("{91493492-5A91-11CF-8700-00AA0060263B}")
public interface RulerLevel extends Com4jObject {
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
   * Getter method for the COM property "FirstMargin"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  float firstMargin();


  /**
   * <p>
   * Setter method for the COM property "FirstMargin"
   * </p>
   * @param firstMargin Mandatory float parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(10)
  void firstMargin(
    float firstMargin);


  /**
   * <p>
   * Getter method for the COM property "LeftMargin"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(11)
  float leftMargin();


  /**
   * <p>
   * Setter method for the COM property "LeftMargin"
   * </p>
   * @param leftMargin Mandatory float parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(12)
  void leftMargin(
    float leftMargin);


  // Properties:
}
