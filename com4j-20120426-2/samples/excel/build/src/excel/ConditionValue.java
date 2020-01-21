package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ConditionValue extends Com4jObject {
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
   * @param newtype Mandatory excel.XlConditionValueTypes parameter.
   * @param newvalue Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1581)
  void modify(
    excel.XlConditionValueTypes newtype,
    @Optional java.lang.Object newvalue);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  excel.XlConditionValueTypes getType();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   */

  @DISPID(6)
  @PropGet
  java.lang.Object getValue();


  // Properties:
}
