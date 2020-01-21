package ppt  ;

import com4j.*;

@IID("{91493454-5A91-11CF-8700-00AA0060263B}")
public interface Selection extends Com4jObject {
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
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  void cut();


  /**
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  void copy();


  /**
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  void delete();


  /**
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(12)
  void unselect();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type ppt.PpSelectionType
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(13)
  ppt.PpSelectionType type();


  /**
   * <p>
   * Getter method for the COM property "SlideRange"
   * </p>
   * @return  Returns a value of type ppt.SlideRange
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(14)
  ppt.SlideRange slideRange();


  @VTID(14)
  @ReturnValue(defaultPropertyThrough={ppt.SlideRange.class})
  ppt._Slide slideRange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "ShapeRange"
   * </p>
   * @return  Returns a value of type ppt.ShapeRange
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(15)
  ppt.ShapeRange shapeRange();


  @VTID(15)
  @ReturnValue(defaultPropertyThrough={ppt.ShapeRange.class})
  ppt.Shape shapeRange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "TextRange"
   * </p>
   * @return  Returns a value of type ppt.TextRange
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(16)
  ppt.TextRange textRange();


  /**
   * <p>
   * Getter method for the COM property "ChildShapeRange"
   * </p>
   * @return  Returns a value of type ppt.ShapeRange
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(17)
  ppt.ShapeRange childShapeRange();


  @VTID(17)
  @ReturnValue(defaultPropertyThrough={ppt.ShapeRange.class})
  ppt.Shape childShapeRange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "HasChildShapeRange"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(18)
  boolean hasChildShapeRange();


  /**
   * <p>
   * Getter method for the COM property "TextRange2"
   * </p>
   * @return  Returns a value of type office.TextRange2
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(19)
  office.TextRange2 textRange2();


  // Properties:
}
