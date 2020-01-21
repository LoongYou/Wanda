package excel  ;

import com4j.*;

@IID("{0002085B-0001-0000-C000-000000000046}")
public interface IAxes extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(10)
  int getCount();


  /**
   * @param type Mandatory excel.XlAxisType parameter.
   * @param axisGroup Optional parameter. Default value is 1
   * @return  Returns a value of type excel.Axis
   */

  @VTID(11)
  excel.Axis item(
    excel.XlAxisType type,
    @Optional @DefaultValue("1") excel.XlAxisGroup axisGroup);


  /**
   */

  @VTID(12)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param type Mandatory excel.XlAxisType parameter.
   * @param axisGroup Optional parameter. Default value is 1
   * @return  Returns a value of type excel.Axis
   */

  @VTID(13)
  @DefaultMethod
  excel.Axis _Default(
    excel.XlAxisType type,
    @Optional @DefaultValue("1") excel.XlAxisGroup axisGroup);


  // Properties:
}
