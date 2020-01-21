package excel  ;

import com4j.*;

@IID("{000244B1-0001-0000-C000-000000000046}")
public interface IMultiThreadedCalculation extends Com4jObject {
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
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(10)
  boolean getEnabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(11)
  void setEnabled(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ThreadMode"
   * </p>
   * @return  Returns a value of type excel.XlThreadMode
   */

  @VTID(12)
  excel.XlThreadMode getThreadMode();


  /**
   * <p>
   * Setter method for the COM property "ThreadMode"
   * </p>
   * @param rhs Mandatory excel.XlThreadMode parameter.
   */

  @VTID(13)
  void setThreadMode(
    excel.XlThreadMode rhs);


  /**
   * <p>
   * Getter method for the COM property "ThreadCount"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(14)
  int getThreadCount();


  /**
   * <p>
   * Setter method for the COM property "ThreadCount"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(15)
  void setThreadCount(
    int rhs);


  // Properties:
}
