package excel  ;

import com4j.*;

@IID("{000208CB-0001-0000-C000-000000000046}")
public interface IPlotArea extends Com4jObject {
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
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(10)
  java.lang.String getName();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   * @return  Returns a value of type excel.Border
   */

  @VTID(12)
  excel.Border getBorder();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clearFormats();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(14)
  double getHeight();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(15)
  void setHeight(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type excel.Interior
   */

  @VTID(16)
  excel.Interior getInterior();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type excel.ChartFillFormat
   */

  @VTID(17)
  excel.ChartFillFormat getFill();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(18)
  double getLeft();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(19)
  void setLeft(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(20)
  double getTop();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(21)
  void setTop(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(22)
  double getWidth();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(23)
  void setWidth(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "_InsideLeft"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(24)
  double get_InsideLeft();


  /**
   * <p>
   * Getter method for the COM property "_InsideTop"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(25)
  double get_InsideTop();


  /**
   * <p>
   * Getter method for the COM property "_InsideWidth"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(26)
  double get_InsideWidth();


  /**
   * <p>
   * Getter method for the COM property "_InsideHeight"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(27)
  double get_InsideHeight();


  /**
   * <p>
   * Getter method for the COM property "InsideLeft"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(28)
  double getInsideLeft();


  /**
   * <p>
   * Setter method for the COM property "InsideLeft"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(29)
  void setInsideLeft(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "InsideTop"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(30)
  double getInsideTop();


  /**
   * <p>
   * Setter method for the COM property "InsideTop"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(31)
  void setInsideTop(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "InsideWidth"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(32)
  double getInsideWidth();


  /**
   * <p>
   * Setter method for the COM property "InsideWidth"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(33)
  void setInsideWidth(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "InsideHeight"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(34)
  double getInsideHeight();


  /**
   * <p>
   * Setter method for the COM property "InsideHeight"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(35)
  void setInsideHeight(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   * @return  Returns a value of type excel.XlChartElementPosition
   */

  @VTID(36)
  excel.XlChartElementPosition getPosition();


  /**
   * <p>
   * Setter method for the COM property "Position"
   * </p>
   * @param rhs Mandatory excel.XlChartElementPosition parameter.
   */

  @VTID(37)
  void setPosition(
    excel.XlChartElementPosition rhs);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type excel.ChartFormat
   */

  @VTID(38)
  excel.ChartFormat getFormat();


  // Properties:
}
