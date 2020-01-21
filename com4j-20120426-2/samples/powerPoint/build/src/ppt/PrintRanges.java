package ppt  ;

import com4j.*;

@IID("{9149345E-5A91-11CF-8700-00AA0060263B}")
public interface PrintRanges extends ppt.Collection {
  // Methods:
  /**
   * @param start Mandatory int parameter.
   * @param end Mandatory int parameter.
   * @return  Returns a value of type ppt.PrintRange
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(10)
  ppt.PrintRange add(
    int start,
    int end);


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(11)
  ppt._Application application();


  /**
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(12)
  void clearAll();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ppt.PrintRange
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(13)
  @DefaultMethod
  ppt.PrintRange item(
    int index);


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  // Properties:
}
