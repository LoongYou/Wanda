package ppt  ;

import com4j.*;

@IID("{91493493-5A91-11CF-8700-00AA0060263B}")
public interface TabStops extends ppt.Collection {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(10)
  ppt._Application application();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ppt.TabStop
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  ppt.TabStop item(
    int index);


  /**
   * <p>
   * Getter method for the COM property "DefaultSpacing"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(13)
  float defaultSpacing();


  /**
   * <p>
   * Setter method for the COM property "DefaultSpacing"
   * </p>
   * @param defaultSpacing Mandatory float parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(14)
  void defaultSpacing(
    float defaultSpacing);


  /**
   * @param type Mandatory ppt.PpTabStopType parameter.
   * @param position Mandatory float parameter.
   * @return  Returns a value of type ppt.TabStop
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(15)
  ppt.TabStop add(
    ppt.PpTabStopType type,
    float position);


  // Properties:
}
