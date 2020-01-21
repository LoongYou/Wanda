package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ProtectedViewWindow extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  java.lang.String get_Default();


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   */

  @DISPID(139)
  @PropGet
  java.lang.String getCaption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(139)
  @PropPut
  void setCaption(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableResize"
   * </p>
   */

  @DISPID(1192)
  @PropGet
  boolean getEnableResize();


  /**
   * <p>
   * Setter method for the COM property "EnableResize"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1192)
  @PropPut
  void setEnableResize(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   */

  @DISPID(123)
  @PropGet
  double getHeight();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(123)
  @PropPut
  void setHeight(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   */

  @DISPID(127)
  @PropGet
  double getLeft();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(127)
  @PropPut
  void setLeft(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   */

  @DISPID(126)
  @PropGet
  double getTop();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(126)
  @PropPut
  void setTop(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   */

  @DISPID(122)
  @PropGet
  double getWidth();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(122)
  @PropPut
  void setWidth(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   */

  @DISPID(558)
  @PropGet
  boolean getVisible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(558)
  @PropPut
  void setVisible(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceName"
   * </p>
   */

  @DISPID(721)
  @PropGet
  java.lang.String getSourceName();


  /**
   * <p>
   * Getter method for the COM property "SourcePath"
   * </p>
   */

  @DISPID(2993)
  @PropGet
  java.lang.String getSourcePath();


  /**
   * <p>
   * Getter method for the COM property "WindowState"
   * </p>
   */

  @DISPID(396)
  @PropGet
  excel.XlProtectedViewWindowState getWindowState();


  /**
   * <p>
   * Setter method for the COM property "WindowState"
   * </p>
   * @param rhs Mandatory excel.XlProtectedViewWindowState parameter.
   */

  @DISPID(396)
  @PropPut
  void setWindowState(
    excel.XlProtectedViewWindowState rhs);


  /**
   * <p>
   * Getter method for the COM property "Workbook"
   * </p>
   */

  @DISPID(752)
  @PropGet
  excel._Workbook getWorkbook();


  /**
   */

  @DISPID(304)
  void activate();


  /**
   */

  @DISPID(277)
  boolean close();


  /**
   * @param writeResPassword Optional parameter. Default value is com4j.Variant.getMissing()
   * @param updateLinks Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(562)
  excel._Workbook edit(
    @Optional java.lang.Object writeResPassword,
    @Optional java.lang.Object updateLinks);


  // Properties:
}
