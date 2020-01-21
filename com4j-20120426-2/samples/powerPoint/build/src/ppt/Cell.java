package ppt  ;

import com4j.*;

@IID("{914934C9-5A91-11CF-8700-00AA0060263B}")
public interface Cell extends Com4jObject {
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
   * Getter method for the COM property "Shape"
   * </p>
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.Shape shape();


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type ppt.Borders
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  ppt.Borders borders();


  @VTID(10)
  @ReturnValue(defaultPropertyThrough={ppt.Borders.class})
  ppt.LineFormat borders(
    ppt.PpBorderType borderType);

  /**
   * @param mergeTo Mandatory ppt.Cell parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  void merge(
    ppt.Cell mergeTo);


  /**
   * @param numRows Mandatory int parameter.
   * @param numColumns Mandatory int parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(12)
  void split(
    int numRows,
    int numColumns);


  /**
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(13)
  void select();


  /**
   * <p>
   * Getter method for the COM property "Selected"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(14)
  boolean selected();


  // Properties:
}
