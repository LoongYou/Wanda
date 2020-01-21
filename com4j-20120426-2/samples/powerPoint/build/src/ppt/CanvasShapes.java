package ppt  ;

import com4j.*;

@IID("{914934EC-5A91-11CF-8700-00AA0060263B}")
public interface CanvasShapes extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  int count();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  ppt.Shape item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(12)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param type Mandatory office.MsoCalloutType parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(13)
  ppt.Shape addCallout(
    office.MsoCalloutType type,
    float left,
    float top,
    float width,
    float height);


  /**
   * @param type Mandatory office.MsoConnectorType parameter.
   * @param beginX Mandatory float parameter.
   * @param beginY Mandatory float parameter.
   * @param endX Mandatory float parameter.
   * @param endY Mandatory float parameter.
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(14)
  ppt.Shape addConnector(
    office.MsoConnectorType type,
    float beginX,
    float beginY,
    float endX,
    float endY);


  /**
   * @param safeArrayOfPoints Mandatory java.lang.Object parameter.
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(15)
  ppt.Shape addCurve(
    @MarshalAs(NativeType.VARIANT) java.lang.Object safeArrayOfPoints);


  /**
   * @param orientation Mandatory office.MsoTextOrientation parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(16)
  ppt.Shape addLabel(
    office.MsoTextOrientation orientation,
    float left,
    float top,
    float width,
    float height);


  /**
   * @param beginX Mandatory float parameter.
   * @param beginY Mandatory float parameter.
   * @param endX Mandatory float parameter.
   * @param endY Mandatory float parameter.
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(17)
  ppt.Shape addLine(
    float beginX,
    float beginY,
    float endX,
    float endY);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param linkToFile Mandatory office.MsoTriState parameter.
   * @param saveWithDocument Mandatory office.MsoTriState parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Optional parameter. Default value is -1.0f
   * @param height Optional parameter. Default value is -1.0f
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(18)
  ppt.Shape addPicture(
    java.lang.String fileName,
    office.MsoTriState linkToFile,
    office.MsoTriState saveWithDocument,
    float left,
    float top,
    @Optional @DefaultValue("-1") float width,
    @Optional @DefaultValue("-1") float height);


  /**
   * @param safeArrayOfPoints Mandatory java.lang.Object parameter.
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(19)
  ppt.Shape addPolyline(
    @MarshalAs(NativeType.VARIANT) java.lang.Object safeArrayOfPoints);


  /**
   * @param type Mandatory office.MsoAutoShapeType parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(20)
  ppt.Shape addShape(
    office.MsoAutoShapeType type,
    float left,
    float top,
    float width,
    float height);


  /**
   * @param presetTextEffect Mandatory office.MsoPresetTextEffect parameter.
   * @param text Mandatory java.lang.String parameter.
   * @param fontName Mandatory java.lang.String parameter.
   * @param fontSize Mandatory float parameter.
   * @param fontBold Mandatory office.MsoTriState parameter.
   * @param fontItalic Mandatory office.MsoTriState parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(21)
  ppt.Shape addTextEffect(
    office.MsoPresetTextEffect presetTextEffect,
    java.lang.String text,
    java.lang.String fontName,
    float fontSize,
    office.MsoTriState fontBold,
    office.MsoTriState fontItalic,
    float left,
    float top);


  /**
   * @param orientation Mandatory office.MsoTextOrientation parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(22)
  ppt.Shape addTextbox(
    office.MsoTextOrientation orientation,
    float left,
    float top,
    float width,
    float height);


  /**
   * @param editingType Mandatory office.MsoEditingType parameter.
   * @param x1 Mandatory float parameter.
   * @param y1 Mandatory float parameter.
   * @return  Returns a value of type ppt.FreeformBuilder
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(23)
  ppt.FreeformBuilder buildFreeform(
    office.MsoEditingType editingType,
    float x1,
    float y1);


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type ppt.ShapeRange
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(24)
  ppt.ShapeRange range(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(25)
  void selectAll();


  /**
   * <p>
   * Getter method for the COM property "Background"
   * </p>
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(26)
  ppt.Shape background();


  // Properties:
}
