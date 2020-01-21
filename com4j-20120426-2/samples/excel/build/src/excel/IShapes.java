package excel  ;

import com4j.*;

@IID("{0002443A-0001-0000-C000-000000000046}")
public interface IShapes extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type excel._Application
   */

  @VTID(7)
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type excel.XlCreator
   */

  @VTID(8)
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getParent();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(10)
  int getCount();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.Shape
   */

  @VTID(11)
  excel.Shape item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.Shape
   */

  @VTID(12)
  @DefaultMethod
  excel.Shape _Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(13)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param type Mandatory office.MsoCalloutType parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @return  Returns a value of type excel.Shape
   */

  @VTID(14)
  excel.Shape addCallout(
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
   * @return  Returns a value of type excel.Shape
   */

  @VTID(15)
  excel.Shape addConnector(
    office.MsoConnectorType type,
    float beginX,
    float beginY,
    float endX,
    float endY);


  /**
   * @param safeArrayOfPoints Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.Shape
   */

  @VTID(16)
  excel.Shape addCurve(
    @MarshalAs(NativeType.VARIANT) java.lang.Object safeArrayOfPoints);


  /**
   * @param orientation Mandatory office.MsoTextOrientation parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @return  Returns a value of type excel.Shape
   */

  @VTID(17)
  excel.Shape addLabel(
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
   * @return  Returns a value of type excel.Shape
   */

  @VTID(18)
  excel.Shape addLine(
    float beginX,
    float beginY,
    float endX,
    float endY);


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param linkToFile Mandatory office.MsoTriState parameter.
   * @param saveWithDocument Mandatory office.MsoTriState parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @return  Returns a value of type excel.Shape
   */

  @VTID(19)
  excel.Shape addPicture(
    java.lang.String filename,
    office.MsoTriState linkToFile,
    office.MsoTriState saveWithDocument,
    float left,
    float top,
    float width,
    float height);


  /**
   * @param safeArrayOfPoints Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.Shape
   */

  @VTID(20)
  excel.Shape addPolyline(
    @MarshalAs(NativeType.VARIANT) java.lang.Object safeArrayOfPoints);


  /**
   * @param type Mandatory office.MsoAutoShapeType parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @return  Returns a value of type excel.Shape
   */

  @VTID(21)
  excel.Shape addShape(
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
   * @return  Returns a value of type excel.Shape
   */

  @VTID(22)
  excel.Shape addTextEffect(
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
   * @return  Returns a value of type excel.Shape
   */

  @VTID(23)
  excel.Shape addTextbox(
    office.MsoTextOrientation orientation,
    float left,
    float top,
    float width,
    float height);


  /**
   * @param editingType Mandatory office.MsoEditingType parameter.
   * @param x1 Mandatory float parameter.
   * @param y1 Mandatory float parameter.
   * @return  Returns a value of type excel.FreeformBuilder
   */

  @VTID(24)
  excel.FreeformBuilder buildFreeform(
    office.MsoEditingType editingType,
    float x1,
    float y1);


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.ShapeRange
   */

  @VTID(25)
  excel.ShapeRange getRange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   */

  @VTID(26)
  void selectAll();


  /**
   * @param type Mandatory excel.XlFormControl parameter.
   * @param left Mandatory int parameter.
   * @param top Mandatory int parameter.
   * @param width Mandatory int parameter.
   * @param height Mandatory int parameter.
   * @return  Returns a value of type excel.Shape
   */

  @VTID(27)
  excel.Shape addFormControl(
    excel.XlFormControl type,
    int left,
    int top,
    int width,
    int height);


  /**
   * @param classType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param filename Optional parameter. Default value is com4j.Variant.getMissing()
   * @param link Optional parameter. Default value is com4j.Variant.getMissing()
   * @param displayAsIcon Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconLabel Optional parameter. Default value is com4j.Variant.getMissing()
   * @param left Optional parameter. Default value is com4j.Variant.getMissing()
   * @param top Optional parameter. Default value is com4j.Variant.getMissing()
   * @param width Optional parameter. Default value is com4j.Variant.getMissing()
   * @param height Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.Shape
   */

  @VTID(28)
  excel.Shape addOLEObject(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object classType,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object link,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object displayAsIcon,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object iconFileName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object iconIndex,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object iconLabel,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object left,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object top,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object width,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object height);


  /**
   * @param type Mandatory office.MsoDiagramType parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @return  Returns a value of type excel.Shape
   */

  @VTID(29)
  excel.Shape addDiagram(
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
   * @return  Returns a value of type excel.Shape
   */

  @VTID(30)
  excel.Shape addCanvas(
    float left,
    float top,
    float width,
    float height);


  /**
   * @param xlChartType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param left Optional parameter. Default value is com4j.Variant.getMissing()
   * @param top Optional parameter. Default value is com4j.Variant.getMissing()
   * @param width Optional parameter. Default value is com4j.Variant.getMissing()
   * @param height Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.Shape
   */

  @VTID(31)
  excel.Shape addChart(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object xlChartType,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object left,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object top,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object width,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object height);


  /**
   * @param layout Mandatory office.SmartArtLayout parameter.
   * @param left Optional parameter. Default value is com4j.Variant.getMissing()
   * @param top Optional parameter. Default value is com4j.Variant.getMissing()
   * @param width Optional parameter. Default value is com4j.Variant.getMissing()
   * @param height Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.Shape
   */

  @VTID(32)
  excel.Shape addSmartArt(
    office.SmartArtLayout layout,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object left,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object top,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object width,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object height);


  // Properties:
}
