package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ErrorBars extends Com4jObject {
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
   * Getter method for the COM property "Name"
   * </p>
   */

  @DISPID(110)
  @PropGet
  java.lang.String getName();


  /**
   */

  @DISPID(235)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   */

  @DISPID(128)
  @PropGet
  excel.Border getBorder();


  /**
   */

  @DISPID(117)
  java.lang.Object delete();


  /**
   */

  @DISPID(112)
  java.lang.Object clearFormats();


  /**
   * <p>
   * Getter method for the COM property "EndStyle"
   * </p>
   */

  @DISPID(1124)
  @PropGet
  excel.XlEndStyleCap getEndStyle();


  /**
   * <p>
   * Setter method for the COM property "EndStyle"
   * </p>
   * @param rhs Mandatory excel.XlEndStyleCap parameter.
   */

  @DISPID(1124)
  @PropPut
  void setEndStyle(
    excel.XlEndStyleCap rhs);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   */

  @DISPID(116)
  @PropGet
  excel.ChartFormat getFormat();


  // Properties:
}
