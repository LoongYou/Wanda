package excel  ;

import com4j.*;

@IID("{000244C0-0001-0000-C000-000000000046}")
public interface IValueChange extends Com4jObject {
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
   * Getter method for the COM property "Order"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(10)
  int getOrder();


  /**
   * <p>
   * Getter method for the COM property "VisibleInPivotTable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(11)
  boolean getVisibleInPivotTable();


  /**
   * <p>
   * Getter method for the COM property "PivotCell"
   * </p>
   * @return  Returns a value of type excel.PivotCell
   */

  @VTID(12)
  excel.PivotCell getPivotCell();


  /**
   * <p>
   * Getter method for the COM property "Tuple"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(13)
  java.lang.String getTuple();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(14)
  double getValue();


  /**
   * <p>
   * Getter method for the COM property "AllocationValue"
   * </p>
   * @return  Returns a value of type excel.XlAllocationValue
   */

  @VTID(15)
  excel.XlAllocationValue getAllocationValue();


  /**
   * <p>
   * Getter method for the COM property "AllocationMethod"
   * </p>
   * @return  Returns a value of type excel.XlAllocationMethod
   */

  @VTID(16)
  excel.XlAllocationMethod getAllocationMethod();


  /**
   * <p>
   * Getter method for the COM property "AllocationWeightExpression"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(17)
  java.lang.String getAllocationWeightExpression();


  /**
   */

  @VTID(18)
  void delete();


  // Properties:
}
