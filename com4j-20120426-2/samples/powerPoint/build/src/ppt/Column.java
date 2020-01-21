package ppt  ;

import com4j.*;

@IID("{914934C5-5A91-11CF-8700-00AA0060263B}")
public interface Column extends Com4jObject {
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
   * Getter method for the COM property "Cells"
   * </p>
   * @return  Returns a value of type ppt.CellRange
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.CellRange cells();


  @VTID(9)
  @ReturnValue(defaultPropertyThrough={ppt.CellRange.class})
  ppt.Cell cells(
    int index);

  /**
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  void select();


  /**
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(12)
  float width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param width Mandatory float parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(13)
  void width(
    float width);


  // Properties:
}
