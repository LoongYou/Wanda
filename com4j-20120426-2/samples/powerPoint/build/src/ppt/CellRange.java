package ppt  ;

import com4j.*;

@IID("{914934C8-5A91-11CF-8700-00AA0060263B}")
public interface CellRange extends ppt.Collection {
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
   * @return  Returns a value of type ppt.Cell
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  ppt.Cell item(
    int index);


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type ppt.Borders
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(13)
  ppt.Borders borders();


  @VTID(13)
  @ReturnValue(defaultPropertyThrough={ppt.Borders.class})
  ppt.LineFormat borders(
    ppt.PpBorderType borderType);

  // Properties:
}
