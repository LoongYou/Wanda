package word  ;

import com4j.*;

@IID("{0002099F-0000-0000-C000-000000000046}")
public interface Shapes extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(8000) //= 0x1f40. The runtime will prefer the VTID if present
  @VTID(7)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8001) //= 0x1f41. The runtime will prefer the VTID if present
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
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(11)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type word.Shape
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  word.Shape item(
    java.lang.Object index);


  /**
   * @param type Mandatory office.MsoCalloutType parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @param anchor Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Shape
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(13)
  word.Shape addCallout(
    office.MsoCalloutType type,
    float left,
    float top,
    float width,
    float height,
    @Optional java.lang.Object anchor);


  /**
   * @param type Mandatory office.MsoConnectorType parameter.
   * @param beginX Mandatory float parameter.
   * @param beginY Mandatory float parameter.
   * @param endX Mandatory float parameter.
   * @param endY Mandatory float parameter.
   * @return  Returns a value of type word.Shape
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(14)
  word.Shape addConnector(
    office.MsoConnectorType type,
    float beginX,
    float beginY,
    float endX,
    float endY);


  /**
   * @param safeArrayOfPoints Mandatory java.lang.Object parameter.
   * @param anchor Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Shape
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(15)
  word.Shape addCurve(
    java.lang.Object safeArrayOfPoints,
    @Optional java.lang.Object anchor);


  /**
   * @param orientation Mandatory office.MsoTextOrientation parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @param anchor Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Shape
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(16)
  word.Shape addLabel(
    office.MsoTextOrientation orientation,
    float left,
    float top,
    float width,
    float height,
    @Optional java.lang.Object anchor);


  /**
   * @param beginX Mandatory float parameter.
   * @param beginY Mandatory float parameter.
   * @param endX Mandatory float parameter.
   * @param endY Mandatory float parameter.
   * @param anchor Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Shape
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(17)
  word.Shape addLine(
    float beginX,
    float beginY,
    float endX,
    float endY,
    @Optional java.lang.Object anchor);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param linkToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param saveWithDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param left Optional parameter. Default value is com4j.Variant.getMissing()
   * @param top Optional parameter. Default value is com4j.Variant.getMissing()
   * @param width Optional parameter. Default value is com4j.Variant.getMissing()
   * @param height Optional parameter. Default value is com4j.Variant.getMissing()
   * @param anchor Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Shape
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(18)
  word.Shape addPicture(
    java.lang.String fileName,
    @Optional java.lang.Object linkToFile,
    @Optional java.lang.Object saveWithDocument,
    @Optional java.lang.Object left,
    @Optional java.lang.Object top,
    @Optional java.lang.Object width,
    @Optional java.lang.Object height,
    @Optional java.lang.Object anchor);


  /**
   * @param safeArrayOfPoints Mandatory java.lang.Object parameter.
   * @param anchor Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Shape
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(19)
  word.Shape addPolyline(
    java.lang.Object safeArrayOfPoints,
    @Optional java.lang.Object anchor);


  /**
   * @param type Mandatory int parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @param anchor Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Shape
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(20)
  word.Shape addShape(
    int type,
    float left,
    float top,
    float width,
    float height,
    @Optional java.lang.Object anchor);


  /**
   * @param presetTextEffect Mandatory office.MsoPresetTextEffect parameter.
   * @param text Mandatory java.lang.String parameter.
   * @param fontName Mandatory java.lang.String parameter.
   * @param fontSize Mandatory float parameter.
   * @param fontBold Mandatory office.MsoTriState parameter.
   * @param fontItalic Mandatory office.MsoTriState parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param anchor Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Shape
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(21)
  word.Shape addTextEffect(
    office.MsoPresetTextEffect presetTextEffect,
    java.lang.String text,
    java.lang.String fontName,
    float fontSize,
    office.MsoTriState fontBold,
    office.MsoTriState fontItalic,
    float left,
    float top,
    @Optional java.lang.Object anchor);


  /**
   * @param orientation Mandatory office.MsoTextOrientation parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @param anchor Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Shape
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(22)
  word.Shape addTextbox(
    office.MsoTextOrientation orientation,
    float left,
    float top,
    float width,
    float height,
    @Optional java.lang.Object anchor);


  /**
   * @param editingType Mandatory office.MsoEditingType parameter.
   * @param x1 Mandatory float parameter.
   * @param y1 Mandatory float parameter.
   * @return  Returns a value of type word.FreeformBuilder
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(23)
  word.FreeformBuilder buildFreeform(
    office.MsoEditingType editingType,
    float x1,
    float y1);


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type word.ShapeRange
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(24)
  word.ShapeRange range(
    java.lang.Object index);


  /**
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(25)
  void selectAll();


  /**
   * @param classType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param linkToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param displayAsIcon Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconLabel Optional parameter. Default value is com4j.Variant.getMissing()
   * @param left Optional parameter. Default value is com4j.Variant.getMissing()
   * @param top Optional parameter. Default value is com4j.Variant.getMissing()
   * @param width Optional parameter. Default value is com4j.Variant.getMissing()
   * @param height Optional parameter. Default value is com4j.Variant.getMissing()
   * @param anchor Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Shape
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(26)
  word.Shape addOLEObject(
    @Optional java.lang.Object classType,
    @Optional java.lang.Object fileName,
    @Optional java.lang.Object linkToFile,
    @Optional java.lang.Object displayAsIcon,
    @Optional java.lang.Object iconFileName,
    @Optional java.lang.Object iconIndex,
    @Optional java.lang.Object iconLabel,
    @Optional java.lang.Object left,
    @Optional java.lang.Object top,
    @Optional java.lang.Object width,
    @Optional java.lang.Object height,
    @Optional java.lang.Object anchor);


  /**
   * @param classType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param left Optional parameter. Default value is com4j.Variant.getMissing()
   * @param top Optional parameter. Default value is com4j.Variant.getMissing()
   * @param width Optional parameter. Default value is com4j.Variant.getMissing()
   * @param height Optional parameter. Default value is com4j.Variant.getMissing()
   * @param anchor Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Shape
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(27)
  word.Shape addOLEControl(
    @Optional java.lang.Object classType,
    @Optional java.lang.Object left,
    @Optional java.lang.Object top,
    @Optional java.lang.Object width,
    @Optional java.lang.Object height,
    @Optional java.lang.Object anchor);


  /**
   * @param type Mandatory office.MsoDiagramType parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @param anchor Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Shape
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(28)
  word.Shape addDiagram(
    office.MsoDiagramType type,
    float left,
    float top,
    float width,
    float height,
    @Optional java.lang.Object anchor);


  /**
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @param anchor Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Shape
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(29)
  word.Shape addCanvas(
    float left,
    float top,
    float width,
    float height,
    @Optional java.lang.Object anchor);


  /**
   * @param type Optional parameter. Default value is -1
   * @param left Optional parameter. Default value is com4j.Variant.getMissing()
   * @param top Optional parameter. Default value is com4j.Variant.getMissing()
   * @param width Optional parameter. Default value is com4j.Variant.getMissing()
   * @param height Optional parameter. Default value is com4j.Variant.getMissing()
   * @param anchor Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Shape
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(30)
  word.Shape addChart(
    @Optional @DefaultValue("-1") office.XlChartType type,
    @Optional java.lang.Object left,
    @Optional java.lang.Object top,
    @Optional java.lang.Object width,
    @Optional java.lang.Object height,
    @Optional java.lang.Object anchor);


  /**
   * @param layout Mandatory office.SmartArtLayout parameter.
   * @param left Optional parameter. Default value is com4j.Variant.getMissing()
   * @param top Optional parameter. Default value is com4j.Variant.getMissing()
   * @param width Optional parameter. Default value is com4j.Variant.getMissing()
   * @param height Optional parameter. Default value is com4j.Variant.getMissing()
   * @param anchor Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Shape
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(31)
  word.Shape addSmartArt(
    office.SmartArtLayout layout,
    @Optional java.lang.Object left,
    @Optional java.lang.Object top,
    @Optional java.lang.Object width,
    @Optional java.lang.Object height,
    @Optional java.lang.Object anchor);


  // Properties:
}
