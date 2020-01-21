package office  ;

import com4j.*;

@IID("{000C172F-0000-0000-C000-000000000046}")
public interface IMsoChartData extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Workbook"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject workbook();


  /**
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  void activate();


  /**
   * <p>
   * Getter method for the COM property "IsLinked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  boolean isLinked();


  /**
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  void breakLink();


  // Properties:
}
