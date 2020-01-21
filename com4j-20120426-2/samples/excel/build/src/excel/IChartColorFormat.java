package excel  ;

import com4j.*;

@IID("{00024436-0001-0000-C000-000000000046}")
public interface IChartColorFormat extends Com4jObject {
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
   * Getter method for the COM property "SchemeColor"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(10)
  int getSchemeColor();


  /**
   * <p>
   * Setter method for the COM property "SchemeColor"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(11)
  void setSchemeColor(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "RGB"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(12)
  int getRGB();


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(13)
  @DefaultMethod
  int get_Default();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(14)
  int getType();


  // Properties:
}
