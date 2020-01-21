package ppt  ;

import com4j.*;

@IID("{92D41A5A-F07E-4CA4-AF6F-BEF486AA4E6F}")
public interface ChartData extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Workbook"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject workbook();


  /**
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(8)
  void activate();


  /**
   * <p>
   * Getter method for the COM property "IsLinked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  boolean isLinked();


  /**
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  void breakLink();


  // Properties:
}
