package excel  ;

import com4j.*;

@IID("{000244BA-0001-0000-C000-000000000046}")
public interface ISparkAxes extends Com4jObject {
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
   * Getter method for the COM property "Vertical"
   * </p>
   * @return  Returns a value of type excel.SparkVerticalAxis
   */

  @VTID(10)
  excel.SparkVerticalAxis getVertical();


  /**
   * <p>
   * Getter method for the COM property "Horizontal"
   * </p>
   * @return  Returns a value of type excel.SparkHorizontalAxis
   */

  @VTID(11)
  excel.SparkHorizontalAxis getHorizontal();


  // Properties:
}
