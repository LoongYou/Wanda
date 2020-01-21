package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Pane extends Com4jObject {
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
   */

  @DISPID(304)
  boolean activate();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   */

  @DISPID(486)
  @PropGet
  int getIndex();


  /**
   * @param down Optional parameter. Default value is com4j.Variant.getMissing()
   * @param up Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toRight Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toLeft Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(547)
  java.lang.Object largeScroll(
    @Optional java.lang.Object down,
    @Optional java.lang.Object up,
    @Optional java.lang.Object toRight,
    @Optional java.lang.Object toLeft);


  /**
   * <p>
   * Getter method for the COM property "ScrollColumn"
   * </p>
   */

  @DISPID(654)
  @PropGet
  int getScrollColumn();


  /**
   * <p>
   * Setter method for the COM property "ScrollColumn"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(654)
  @PropPut
  void setScrollColumn(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ScrollRow"
   * </p>
   */

  @DISPID(655)
  @PropGet
  int getScrollRow();


  /**
   * <p>
   * Setter method for the COM property "ScrollRow"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(655)
  @PropPut
  void setScrollRow(
    int rhs);


  /**
   * @param down Optional parameter. Default value is com4j.Variant.getMissing()
   * @param up Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toRight Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toLeft Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(548)
  java.lang.Object smallScroll(
    @Optional java.lang.Object down,
    @Optional java.lang.Object up,
    @Optional java.lang.Object toRight,
    @Optional java.lang.Object toLeft);


  /**
   * <p>
   * Getter method for the COM property "VisibleRange"
   * </p>
   */

  @DISPID(1118)
  @PropGet
  excel.Range getVisibleRange();


  /**
   * @param left Mandatory int parameter.
   * @param top Mandatory int parameter.
   * @param width Mandatory int parameter.
   * @param height Mandatory int parameter.
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1781)
  void scrollIntoView(
    int left,
    int top,
    int width,
    int height,
    @Optional java.lang.Object start);


  /**
   * @param points Mandatory int parameter.
   */

  @DISPID(1776)
  int pointsToScreenPixelsX(
    int points);


  /**
   * @param points Mandatory int parameter.
   */

  @DISPID(1777)
  int pointsToScreenPixelsY(
    int points);


  // Properties:
}
