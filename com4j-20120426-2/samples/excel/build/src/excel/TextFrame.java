package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface TextFrame extends Com4jObject {
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
   * Getter method for the COM property "MarginBottom"
   * </p>
   */

  @DISPID(1745)
  @PropGet
  float getMarginBottom();


  /**
   * <p>
   * Setter method for the COM property "MarginBottom"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @DISPID(1745)
  @PropPut
  void setMarginBottom(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "MarginLeft"
   * </p>
   */

  @DISPID(1746)
  @PropGet
  float getMarginLeft();


  /**
   * <p>
   * Setter method for the COM property "MarginLeft"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @DISPID(1746)
  @PropPut
  void setMarginLeft(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "MarginRight"
   * </p>
   */

  @DISPID(1747)
  @PropGet
  float getMarginRight();


  /**
   * <p>
   * Setter method for the COM property "MarginRight"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @DISPID(1747)
  @PropPut
  void setMarginRight(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "MarginTop"
   * </p>
   */

  @DISPID(1748)
  @PropGet
  float getMarginTop();


  /**
   * <p>
   * Setter method for the COM property "MarginTop"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @DISPID(1748)
  @PropPut
  void setMarginTop(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   */

  @DISPID(134)
  @PropGet
  office.MsoTextOrientation getOrientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param rhs Mandatory office.MsoTextOrientation parameter.
   */

  @DISPID(134)
  @PropPut
  void setOrientation(
    office.MsoTextOrientation rhs);


  /**
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   * @param length Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(603)
  excel.Characters characters(
    @Optional java.lang.Object start,
    @Optional java.lang.Object length);


  /**
   * <p>
   * Getter method for the COM property "HorizontalAlignment"
   * </p>
   */

  @DISPID(136)
  @PropGet
  excel.XlHAlign getHorizontalAlignment();


  /**
   * <p>
   * Setter method for the COM property "HorizontalAlignment"
   * </p>
   * @param rhs Mandatory excel.XlHAlign parameter.
   */

  @DISPID(136)
  @PropPut
  void setHorizontalAlignment(
    excel.XlHAlign rhs);


  /**
   * <p>
   * Getter method for the COM property "VerticalAlignment"
   * </p>
   */

  @DISPID(137)
  @PropGet
  excel.XlVAlign getVerticalAlignment();


  /**
   * <p>
   * Setter method for the COM property "VerticalAlignment"
   * </p>
   * @param rhs Mandatory excel.XlVAlign parameter.
   */

  @DISPID(137)
  @PropPut
  void setVerticalAlignment(
    excel.XlVAlign rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoSize"
   * </p>
   */

  @DISPID(614)
  @PropGet
  boolean getAutoSize();


  /**
   * <p>
   * Setter method for the COM property "AutoSize"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(614)
  @PropPut
  void setAutoSize(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ReadingOrder"
   * </p>
   */

  @DISPID(975)
  @PropGet
  int getReadingOrder();


  /**
   * <p>
   * Setter method for the COM property "ReadingOrder"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(975)
  @PropPut
  void setReadingOrder(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoMargins"
   * </p>
   */

  @DISPID(1749)
  @PropGet
  boolean getAutoMargins();


  /**
   * <p>
   * Setter method for the COM property "AutoMargins"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1749)
  @PropPut
  void setAutoMargins(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "VerticalOverflow"
   * </p>
   */

  @DISPID(2922)
  @PropGet
  excel.XlOartVerticalOverflow getVerticalOverflow();


  /**
   * <p>
   * Setter method for the COM property "VerticalOverflow"
   * </p>
   * @param rhs Mandatory excel.XlOartVerticalOverflow parameter.
   */

  @DISPID(2922)
  @PropPut
  void setVerticalOverflow(
    excel.XlOartVerticalOverflow rhs);


  /**
   * <p>
   * Getter method for the COM property "HorizontalOverflow"
   * </p>
   */

  @DISPID(2923)
  @PropGet
  excel.XlOartHorizontalOverflow getHorizontalOverflow();


  /**
   * <p>
   * Setter method for the COM property "HorizontalOverflow"
   * </p>
   * @param rhs Mandatory excel.XlOartHorizontalOverflow parameter.
   */

  @DISPID(2923)
  @PropPut
  void setHorizontalOverflow(
    excel.XlOartHorizontalOverflow rhs);


  // Properties:
}
