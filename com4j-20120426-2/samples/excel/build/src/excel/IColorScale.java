package excel  ;

import com4j.*;

@IID("{00024493-0001-0000-C000-000000000046}")
public interface IColorScale extends Com4jObject {
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
   * Getter method for the COM property "Priority"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(10)
  int getPriority();


  /**
   * <p>
   * Setter method for the COM property "Priority"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(11)
  void setPriority(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "StopIfTrue"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(12)
  boolean getStopIfTrue();


  /**
   * <p>
   * Getter method for the COM property "AppliesTo"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(13)
  excel.Range getAppliesTo();


  /**
   * <p>
   * Getter method for the COM property "Formula"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(14)
  java.lang.String getFormula();


  /**
   * <p>
   * Setter method for the COM property "Formula"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(15)
  void setFormula(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(16)
  int getType();


  /**
   */

  @VTID(17)
  void setFirstPriority();


  /**
   */

  @VTID(18)
  void setLastPriority();


  /**
   */

  @VTID(19)
  void delete();


  /**
   * @param range Mandatory excel.Range parameter.
   */

  @VTID(20)
  void modifyAppliesToRange(
    excel.Range range);


  /**
   * <p>
   * Getter method for the COM property "PTCondition"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(21)
  boolean getPTCondition();


  /**
   * <p>
   * Getter method for the COM property "ScopeType"
   * </p>
   * @return  Returns a value of type excel.XlPivotConditionScope
   */

  @VTID(22)
  excel.XlPivotConditionScope getScopeType();


  /**
   * <p>
   * Setter method for the COM property "ScopeType"
   * </p>
   * @param rhs Mandatory excel.XlPivotConditionScope parameter.
   */

  @VTID(23)
  void setScopeType(
    excel.XlPivotConditionScope rhs);


  /**
   * <p>
   * Getter method for the COM property "ColorScaleCriteria"
   * </p>
   * @return  Returns a value of type excel.ColorScaleCriteria
   */

  @VTID(24)
  excel.ColorScaleCriteria getColorScaleCriteria();


  // Properties:
}
