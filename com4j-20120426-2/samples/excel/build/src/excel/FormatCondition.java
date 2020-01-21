package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface FormatCondition extends Com4jObject {
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
   * @param type Mandatory excel.XlFormatConditionType parameter.
   * @param operator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param formula1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param formula2 Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2623)
  void _Modify(
    excel.XlFormatConditionType type,
    @Optional java.lang.Object operator,
    @Optional java.lang.Object formula1,
    @Optional java.lang.Object formula2);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  int getType();


  /**
   * <p>
   * Getter method for the COM property "Operator"
   * </p>
   */

  @DISPID(797)
  @PropGet
  int getOperator();


  /**
   * <p>
   * Getter method for the COM property "Formula1"
   * </p>
   */

  @DISPID(1579)
  @PropGet
  java.lang.String getFormula1();


  /**
   * <p>
   * Getter method for the COM property "Formula2"
   * </p>
   */

  @DISPID(1580)
  @PropGet
  java.lang.String getFormula2();


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   */

  @DISPID(129)
  @PropGet
  excel.Interior getInterior();


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   */

  @DISPID(435)
  @PropGet
  excel.Borders getBorders();


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   */

  @DISPID(146)
  @PropGet
  excel.Font getFont();


  /**
   */

  @DISPID(117)
  void delete();


  /**
   * @param type Mandatory excel.XlFormatConditionType parameter.
   * @param operator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param formula1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param formula2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param string Optional parameter. Default value is com4j.Variant.getMissing()
   * @param operator2 Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1581)
  void modify(
    excel.XlFormatConditionType type,
    @Optional java.lang.Object operator,
    @Optional java.lang.Object formula1,
    @Optional java.lang.Object formula2,
    @Optional java.lang.Object string,
    @Optional java.lang.Object operator2);


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   */

  @DISPID(138)
  @PropGet
  java.lang.String getText();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(138)
  @PropPut
  void setText(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "TextOperator"
   * </p>
   */

  @DISPID(2613)
  @PropGet
  excel.XlContainsOperator getTextOperator();


  /**
   * <p>
   * Setter method for the COM property "TextOperator"
   * </p>
   * @param rhs Mandatory excel.XlContainsOperator parameter.
   */

  @DISPID(2613)
  @PropPut
  void setTextOperator(
    excel.XlContainsOperator rhs);


  /**
   * <p>
   * Getter method for the COM property "DateOperator"
   * </p>
   */

  @DISPID(2614)
  @PropGet
  excel.XlTimePeriods getDateOperator();


  /**
   * <p>
   * Setter method for the COM property "DateOperator"
   * </p>
   * @param rhs Mandatory excel.XlTimePeriods parameter.
   */

  @DISPID(2614)
  @PropPut
  void setDateOperator(
    excel.XlTimePeriods rhs);


  /**
   * <p>
   * Getter method for the COM property "NumberFormat"
   * </p>
   */

  @DISPID(193)
  @PropGet
  java.lang.Object getNumberFormat();


  /**
   * <p>
   * Setter method for the COM property "NumberFormat"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(193)
  @PropPut
  void setNumberFormat(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Priority"
   * </p>
   */

  @DISPID(985)
  @PropGet
  int getPriority();


  /**
   * <p>
   * Setter method for the COM property "Priority"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(985)
  @PropPut
  void setPriority(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "StopIfTrue"
   * </p>
   */

  @DISPID(2625)
  @PropGet
  boolean getStopIfTrue();


  /**
   * <p>
   * Setter method for the COM property "StopIfTrue"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2625)
  @PropPut
  void setStopIfTrue(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AppliesTo"
   * </p>
   */

  @DISPID(2626)
  @PropGet
  excel.Range getAppliesTo();


  /**
   * @param range Mandatory excel.Range parameter.
   */

  @DISPID(2627)
  void modifyAppliesToRange(
    excel.Range range);


  /**
   */

  @DISPID(2629)
  void setFirstPriority();


  /**
   */

  @DISPID(2630)
  void setLastPriority();


  /**
   * <p>
   * Getter method for the COM property "PTCondition"
   * </p>
   */

  @DISPID(2631)
  @PropGet
  boolean getPTCondition();


  /**
   * <p>
   * Getter method for the COM property "ScopeType"
   * </p>
   */

  @DISPID(2615)
  @PropGet
  excel.XlPivotConditionScope getScopeType();


  /**
   * <p>
   * Setter method for the COM property "ScopeType"
   * </p>
   * @param rhs Mandatory excel.XlPivotConditionScope parameter.
   */

  @DISPID(2615)
  @PropPut
  void setScopeType(
    excel.XlPivotConditionScope rhs);


  // Properties:
}
