package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Outline extends Com4jObject {
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
   * Getter method for the COM property "AutomaticStyles"
   * </p>
   */

  @DISPID(959)
  @PropGet
  boolean getAutomaticStyles();


  /**
   * <p>
   * Setter method for the COM property "AutomaticStyles"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(959)
  @PropPut
  void setAutomaticStyles(
    boolean rhs);


  /**
   * @param rowLevels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnLevels Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(960)
  java.lang.Object showLevels(
    @Optional java.lang.Object rowLevels,
    @Optional java.lang.Object columnLevels);


  /**
   * <p>
   * Getter method for the COM property "SummaryColumn"
   * </p>
   */

  @DISPID(961)
  @PropGet
  excel.XlSummaryColumn getSummaryColumn();


  /**
   * <p>
   * Setter method for the COM property "SummaryColumn"
   * </p>
   * @param rhs Mandatory excel.XlSummaryColumn parameter.
   */

  @DISPID(961)
  @PropPut
  void setSummaryColumn(
    excel.XlSummaryColumn rhs);


  /**
   * <p>
   * Getter method for the COM property "SummaryRow"
   * </p>
   */

  @DISPID(902)
  @PropGet
  excel.XlSummaryRow getSummaryRow();


  /**
   * <p>
   * Setter method for the COM property "SummaryRow"
   * </p>
   * @param rhs Mandatory excel.XlSummaryRow parameter.
   */

  @DISPID(902)
  @PropPut
  void setSummaryRow(
    excel.XlSummaryRow rhs);


  // Properties:
}
