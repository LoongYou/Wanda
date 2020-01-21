package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Databar extends Com4jObject {
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
   * Getter method for the COM property "AppliesTo"
   * </p>
   */

  @DISPID(2626)
  @PropGet
  excel.Range getAppliesTo();


  /**
   * <p>
   * Getter method for the COM property "MinPoint"
   * </p>
   */

  @DISPID(2718)
  @PropGet
  excel.ConditionValue getMinPoint();


  /**
   * <p>
   * Getter method for the COM property "MaxPoint"
   * </p>
   */

  @DISPID(2719)
  @PropGet
  excel.ConditionValue getMaxPoint();


  /**
   * <p>
   * Getter method for the COM property "PercentMin"
   * </p>
   */

  @DISPID(2720)
  @PropGet
  int getPercentMin();


  /**
   * <p>
   * Setter method for the COM property "PercentMin"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2720)
  @PropPut
  void setPercentMin(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "PercentMax"
   * </p>
   */

  @DISPID(2721)
  @PropGet
  int getPercentMax();


  /**
   * <p>
   * Setter method for the COM property "PercentMax"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2721)
  @PropPut
  void setPercentMax(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "BarColor"
   * </p>
   */

  @DISPID(2722)
  @PropGet
  com4j.Com4jObject getBarColor();


  /**
   * <p>
   * Getter method for the COM property "ShowValue"
   * </p>
   */

  @DISPID(2024)
  @PropGet
  boolean getShowValue();


  /**
   * <p>
   * Setter method for the COM property "ShowValue"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2024)
  @PropPut
  void setShowValue(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Formula"
   * </p>
   */

  @DISPID(261)
  @PropGet
  java.lang.String getFormula();


  /**
   * <p>
   * Setter method for the COM property "Formula"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(261)
  @PropPut
  void setFormula(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  int getType();


  /**
   */

  @DISPID(2629)
  void setFirstPriority();


  /**
   */

  @DISPID(2630)
  void setLastPriority();


  /**
   */

  @DISPID(117)
  void delete();


  /**
   * @param range Mandatory excel.Range parameter.
   */

  @DISPID(2627)
  void modifyAppliesToRange(
    excel.Range range);


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


  /**
   * <p>
   * Getter method for the COM property "Direction"
   * </p>
   */

  @DISPID(168)
  @PropGet
  int getDirection();


  /**
   * <p>
   * Setter method for the COM property "Direction"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(168)
  @PropPut
  void setDirection(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "BarFillType"
   * </p>
   */

  @DISPID(2941)
  @PropGet
  excel.XlDataBarFillType getBarFillType();


  /**
   * <p>
   * Setter method for the COM property "BarFillType"
   * </p>
   * @param rhs Mandatory excel.XlDataBarFillType parameter.
   */

  @DISPID(2941)
  @PropPut
  void setBarFillType(
    excel.XlDataBarFillType rhs);


  /**
   * <p>
   * Getter method for the COM property "AxisPosition"
   * </p>
   */

  @DISPID(2942)
  @PropGet
  excel.XlDataBarAxisPosition getAxisPosition();


  /**
   * <p>
   * Setter method for the COM property "AxisPosition"
   * </p>
   * @param rhs Mandatory excel.XlDataBarAxisPosition parameter.
   */

  @DISPID(2942)
  @PropPut
  void setAxisPosition(
    excel.XlDataBarAxisPosition rhs);


  /**
   * <p>
   * Getter method for the COM property "AxisColor"
   * </p>
   */

  @DISPID(2943)
  @PropGet
  com4j.Com4jObject getAxisColor();


  /**
   * <p>
   * Getter method for the COM property "BarBorder"
   * </p>
   */

  @DISPID(2944)
  @PropGet
  excel.DataBarBorder getBarBorder();


  /**
   * <p>
   * Getter method for the COM property "NegativeBarFormat"
   * </p>
   */

  @DISPID(2945)
  @PropGet
  excel.NegativeBarFormat getNegativeBarFormat();


  // Properties:
}
