package ppt  ;

import com4j.*;

@IID("{91493475-5A91-11CF-8700-00AA0060263B}")
public interface Shapes extends Com4jObject,Iterable<Com4jObject> {
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
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(24)
  void selectAll();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type ppt.ShapeRange
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(25)
  ppt.ShapeRange range(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "HasTitle"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(26)
  office.MsoTriState hasTitle();


  /**
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(27)
  ppt.Shape addTitle();


  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(28)
  ppt.Shape title();


  /**
   * <p>
   * Getter method for the COM property "Placeholders"
   * </p>
   * @return  Returns a value of type ppt.Placeholders
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(29)
  ppt.Placeholders placeholders();


  @VTID(29)
  @ReturnValue(defaultPropertyThrough={ppt.Placeholders.class})
  ppt.Shape placeholders(
    int index);

  /**
   * @param left Optional parameter. Default value is 0.0f
   * @param top Optional parameter. Default value is 0.0f
   * @param width Optional parameter. Default value is -1.0f
   * @param height Optional parameter. Default value is -1.0f
   * @param className Optional parameter. Default value is ""
   * @param fileName Optional parameter. Default value is ""
   * @param displayAsIcon Optional parameter. Default value is 0
   * @param iconFileName Optional parameter. Default value is ""
   * @param iconIndex Optional parameter. Default value is 0
   * @param iconLabel Optional parameter. Default value is ""
   * @param link Optional parameter. Default value is 0
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(30)
  ppt.Shape addOLEObject(
    @Optional @DefaultValue("0") float left,
    @Optional @DefaultValue("0") float top,
    @Optional @DefaultValue("-1") float width,
    @Optional @DefaultValue("-1") float height,
    @Optional @DefaultValue("") java.lang.String className,
    @Optional @DefaultValue("") java.lang.String fileName,
    @Optional @DefaultValue("0") office.MsoTriState displayAsIcon,
    @Optional @DefaultValue("") java.lang.String iconFileName,
    @Optional @DefaultValue("0") int iconIndex,
    @Optional @DefaultValue("") java.lang.String iconLabel,
    @Optional @DefaultValue("0") office.MsoTriState link);


  /**
   * @param left Optional parameter. Default value is 1.25f
   * @param top Optional parameter. Default value is 1.25f
   * @param width Optional parameter. Default value is 145.25f
   * @param height Optional parameter. Default value is 145.25f
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(31)
  ppt.Shape addComment(
    @Optional @DefaultValue("1.25") float left,
    @Optional @DefaultValue("1.25") float top,
    @Optional @DefaultValue("145.25") float width,
    @Optional @DefaultValue("145.25") float height);


  /**
   * @param type Mandatory ppt.PpPlaceholderType parameter.
   * @param left Optional parameter. Default value is -1.0f
   * @param top Optional parameter. Default value is -1.0f
   * @param width Optional parameter. Default value is -1.0f
   * @param height Optional parameter. Default value is -1.0f
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(32)
  ppt.Shape addPlaceholder(
    ppt.PpPlaceholderType type,
    @Optional @DefaultValue("-1") float left,
    @Optional @DefaultValue("-1") float top,
    @Optional @DefaultValue("-1") float width,
    @Optional @DefaultValue("-1") float height);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param left Optional parameter. Default value is 0.0f
   * @param top Optional parameter. Default value is 0.0f
   * @param width Optional parameter. Default value is -1.0f
   * @param height Optional parameter. Default value is -1.0f
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(33)
  ppt.Shape addMediaObject(
    java.lang.String fileName,
    @Optional @DefaultValue("0") float left,
    @Optional @DefaultValue("0") float top,
    @Optional @DefaultValue("-1") float width,
    @Optional @DefaultValue("-1") float height);


  /**
   * @return  Returns a value of type ppt.ShapeRange
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(34)
  ppt.ShapeRange paste();


  @VTID(34)
  @ReturnValue(defaultPropertyThrough={ppt.ShapeRange.class})
  ppt.Shape paste(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * @param numRows Mandatory int parameter.
   * @param numColumns Mandatory int parameter.
   * @param left Optional parameter. Default value is -1.0f
   * @param top Optional parameter. Default value is -1.0f
   * @param width Optional parameter. Default value is -1.0f
   * @param height Optional parameter. Default value is -1.0f
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(35)
  ppt.Shape addTable(
    int numRows,
    int numColumns,
    @Optional @DefaultValue("-1") float left,
    @Optional @DefaultValue("-1") float top,
    @Optional @DefaultValue("-1") float width,
    @Optional @DefaultValue("-1") float height);


  /**
   * @param dataType Optional parameter. Default value is 0
   * @param displayAsIcon Optional parameter. Default value is 0
   * @param iconFileName Optional parameter. Default value is ""
   * @param iconIndex Optional parameter. Default value is 0
   * @param iconLabel Optional parameter. Default value is ""
   * @param link Optional parameter. Default value is 0
   * @return  Returns a value of type ppt.ShapeRange
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(36)
  ppt.ShapeRange pasteSpecial(
    @Optional @DefaultValue("0") ppt.PpPasteDataType dataType,
    @Optional @DefaultValue("0") office.MsoTriState displayAsIcon,
    @Optional @DefaultValue("") java.lang.String iconFileName,
    @Optional @DefaultValue("0") int iconIndex,
    @Optional @DefaultValue("") java.lang.String iconLabel,
    @Optional @DefaultValue("0") office.MsoTriState link);


  /**
   * @param type Mandatory office.MsoDiagramType parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(37)
  ppt.Shape addDiagram(
    office.MsoDiagramType type,
    float left,
    float top,
    float width,
    float height);


  /**
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(38)
  ppt.Shape addCanvas(
    float left,
    float top,
    float width,
    float height);


  /**
   * @param type Optional parameter. Default value is -1
   * @param left Optional parameter. Default value is -1.0f
   * @param top Optional parameter. Default value is -1.0f
   * @param width Optional parameter. Default value is -1.0f
   * @param height Optional parameter. Default value is -1.0f
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(39)
  ppt.Shape addChart(
    @Optional @DefaultValue("-1") office.XlChartType type,
    @Optional @DefaultValue("-1") float left,
    @Optional @DefaultValue("-1") float top,
    @Optional @DefaultValue("-1") float width,
    @Optional @DefaultValue("-1") float height);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param linkToFile Optional parameter. Default value is 0
   * @param saveWithDocument Optional parameter. Default value is -1
   * @param left Optional parameter. Default value is 0.0f
   * @param top Optional parameter. Default value is 0.0f
   * @param width Optional parameter. Default value is -1.0f
   * @param height Optional parameter. Default value is -1.0f
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(40)
  ppt.Shape addMediaObject2(
    java.lang.String fileName,
    @Optional @DefaultValue("0") office.MsoTriState linkToFile,
    @Optional @DefaultValue("-1") office.MsoTriState saveWithDocument,
    @Optional @DefaultValue("0") float left,
    @Optional @DefaultValue("0") float top,
    @Optional @DefaultValue("-1") float width,
    @Optional @DefaultValue("-1") float height);


  /**
   * @param embedTag Mandatory java.lang.String parameter.
   * @param left Optional parameter. Default value is 0.0f
   * @param top Optional parameter. Default value is 0.0f
   * @param width Optional parameter. Default value is -1.0f
   * @param height Optional parameter. Default value is -1.0f
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(41)
  ppt.Shape addMediaObjectFromEmbedTag(
    java.lang.String embedTag,
    @Optional @DefaultValue("0") float left,
    @Optional @DefaultValue("0") float top,
    @Optional @DefaultValue("-1") float width,
    @Optional @DefaultValue("-1") float height);


  /**
   * @param layout Mandatory office.SmartArtLayout parameter.
   * @param left Optional parameter. Default value is -1.0f
   * @param top Optional parameter. Default value is -1.0f
   * @param width Optional parameter. Default value is -1.0f
   * @param height Optional parameter. Default value is -1.0f
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(42)
  ppt.Shape addSmartArt(
    office.SmartArtLayout layout,
    @Optional @DefaultValue("-1") float left,
    @Optional @DefaultValue("-1") float top,
    @Optional @DefaultValue("-1") float width,
    @Optional @DefaultValue("-1") float height);


  // Properties:
}
