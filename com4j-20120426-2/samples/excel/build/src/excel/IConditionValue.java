package excel  ;

import com4j.*;

@IID("{00024492-0001-0000-C000-000000000046}")
public interface IConditionValue extends Com4jObject {
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
   * @param newtype Mandatory excel.XlConditionValueTypes parameter.
   * @param newvalue Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(10)
  void modify(
    excel.XlConditionValueTypes newtype,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object newvalue);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type excel.XlConditionValueTypes
   */

  @VTID(11)
  excel.XlConditionValueTypes getType();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getValue();


  // Properties:
}
