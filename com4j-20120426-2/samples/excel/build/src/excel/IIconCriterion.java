package excel  ;

import com4j.*;

@IID("{00024499-0001-0000-C000-000000000046}")
public interface IIconCriterion extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(7)
  int getIndex();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type excel.XlConditionValueTypes
   */

  @VTID(8)
  excel.XlConditionValueTypes getType();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory excel.XlConditionValueTypes parameter.
   */

  @VTID(9)
  void setType(
    excel.XlConditionValueTypes rhs);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getValue();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(11)
  void setValue(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Operator"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(12)
  int getOperator();


  /**
   * <p>
   * Setter method for the COM property "Operator"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(13)
  void setOperator(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Icon"
   * </p>
   * @return  Returns a value of type excel.XlIcon
   */

  @VTID(14)
  excel.XlIcon getIcon();


  /**
   * <p>
   * Setter method for the COM property "Icon"
   * </p>
   * @param rhs Mandatory excel.XlIcon parameter.
   */

  @VTID(15)
  void setIcon(
    excel.XlIcon rhs);


  // Properties:
}
