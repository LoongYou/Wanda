package ppt  ;

import com4j.*;

@IID("{91493490-5A91-11CF-8700-00AA0060263B}")
public interface Ruler extends Com4jObject {
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
   * Getter method for the COM property "TabStops"
   * </p>
   * @return  Returns a value of type ppt.TabStops
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.TabStops tabStops();


  @VTID(9)
  @ReturnValue(defaultPropertyThrough={ppt.TabStops.class})
  ppt.TabStop tabStops(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Levels"
   * </p>
   * @return  Returns a value of type ppt.RulerLevels
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  ppt.RulerLevels levels();


  @VTID(10)
  @ReturnValue(defaultPropertyThrough={ppt.RulerLevels.class})
  ppt.RulerLevel levels(
    int index);

  // Properties:
}
