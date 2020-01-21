package word  ;

import com4j.*;

@IID("{4A304B59-31FF-42DD-B436-7FC9C5DB7559}")
public interface ChartData extends Com4jObject {
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
