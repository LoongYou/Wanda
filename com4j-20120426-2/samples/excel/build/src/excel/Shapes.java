package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Shapes extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   */

  @DISPID(148)
  @PropGet
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   */

  @DISPID(149)
  @PropGet
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   */

  @DISPID(150)
  @PropGet
  com4j.Com4jObject getParent();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   */

  @DISPID(118)
  @PropGet
  int getCount();


  /**
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(170)
  excel.Shape item(
    java.lang.Object index);


  /**
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(0)
  @DefaultMethod
  excel.Shape _Default(
    java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4)
  @PropGet
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param type Mandatory office.MsoCalloutType parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   */

  @DISPID(1713)
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
   */

  @DISPID(1714)
  excel.Shape addConnector(
    office.MsoConnectorType type,
    float beginX,
    float beginY,
    float endX,
    float endY);


  /**
   * @param safeArrayOfPoints Mandatory java.lang.Object parameter.
   */

  @DISPID(1719)
  excel.Shape addCurve(
    java.lang.Object safeArrayOfPoints);


  /**
   * @param orientation Mandatory office.MsoTextOrientation parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   */

  @DISPID(1721)
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
   */

  @DISPID(1722)
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
   */

  @DISPID(1723)
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
   */

  @DISPID(1726)
  excel.Shape addPolyline(
    java.lang.Object safeArrayOfPoints);


  /**
   * @param type Mandatory office.MsoAutoShapeType parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   */

  @DISPID(1727)
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
   */

  @DISPID(1728)
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
   */

  @DISPID(1734)
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
   */

  @DISPID(1735)
  excel.FreeformBuilder buildFreeform(
    office.MsoEditingType editingType,
    float x1,
    float y1);


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(197)
  @PropGet
  excel.ShapeRange getRange(
    java.lang.Object index);


  /**
   */

  @DISPID(1737)
  void selectAll();


  /**
   * @param type Mandatory excel.XlFormControl parameter.
   * @param left Mandatory int parameter.
   * @param top Mandatory int parameter.
   * @param width Mandatory int parameter.
   * @param height Mandatory int parameter.
   */

  @DISPID(1738)
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
   */

  @DISPID(1739)
  excel.Shape addOLEObject(
    @Optional java.lang.Object classType,
    @Optional java.lang.Object filename,
    @Optional java.lang.Object link,
    @Optional java.lang.Object displayAsIcon,
    @Optional java.lang.Object iconFileName,
    @Optional java.lang.Object iconIndex,
    @Optional java.lang.Object iconLabel,
    @Optional java.lang.Object left,
    @Optional java.lang.Object top,
    @Optional java.lang.Object width,
    @Optional java.lang.Object height);


  /**
   * @param type Mandatory office.MsoDiagramType parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   */

  @DISPID(2176)
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
   */

  @DISPID(2177)
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
   */

  @DISPID(2665)
  excel.Shape addChart(
    @Optional java.lang.Object xlChartType,
    @Optional java.lang.Object left,
    @Optional java.lang.Object top,
    @Optional java.lang.Object width,
    @Optional java.lang.Object height);


  /**
   * @param layout Mandatory office.SmartArtLayout parameter.
   * @param left Optional parameter. Default value is com4j.Variant.getMissing()
   * @param top Optional parameter. Default value is com4j.Variant.getMissing()
   * @param width Optional parameter. Default value is com4j.Variant.getMissing()
   * @param height Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2920)
  excel.Shape addSmartArt(
    office.SmartArtLayout layout,
    @Optional java.lang.Object left,
    @Optional java.lang.Object top,
    @Optional java.lang.Object width,
    @Optional java.lang.Object height);


  // Properties:
}
