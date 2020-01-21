package excel  ;

import com4j.*;

@IID("{00024434-0001-0000-C000-000000000046}")
public interface IFilter extends Com4jObject {
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
   * Getter method for the COM property "On"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(10)
  boolean getOn();


  /**
   * <p>
   * Getter method for the COM property "Criteria1"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getCriteria1();


  /**
   * <p>
   * Getter method for the COM property "_Operator"
   * </p>
   * @return  Returns a value of type excel.XlAutoFilterOperator
   */

  @VTID(12)
  excel.XlAutoFilterOperator get_Operator();


  /**
   * <p>
   * Getter method for the COM property "Criteria2"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getCriteria2();


  /**
   * <p>
   * Getter method for the COM property "Operator"
   * </p>
   * @return  Returns a value of type excel.XlAutoFilterOperator
   */

  @VTID(14)
  excel.XlAutoFilterOperator getOperator();


  /**
   * <p>
   * Setter method for the COM property "Operator"
   * </p>
   * @param rhs Mandatory excel.XlAutoFilterOperator parameter.
   */

  @VTID(15)
  void setOperator(
    excel.XlAutoFilterOperator rhs);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(16)
  int getCount();


  // Properties:
}
