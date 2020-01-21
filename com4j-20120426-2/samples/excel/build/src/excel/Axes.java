package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Axes extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "Count"
   * </p>
   */

  @DISPID(118)
  @PropGet
  int getCount();


  /**
   * @param type Mandatory excel.XlAxisType parameter.
   * @param axisGroup Optional parameter. Default value is 1
   */

  @DISPID(170)
  excel.Axis item(
    excel.XlAxisType type,
    @Optional @DefaultValue("1") excel.XlAxisGroup axisGroup);


  /**
   */

  @DISPID(-4)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param type Mandatory excel.XlAxisType parameter.
   * @param axisGroup Optional parameter. Default value is 1
   */

  @DISPID(0)
  @DefaultMethod
  excel.Axis _Default(
    excel.XlAxisType type,
    @Optional @DefaultValue("1") excel.XlAxisGroup axisGroup);


  // Properties:
}
