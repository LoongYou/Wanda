package office  ;

import com4j.*;

@IID("{000C170E-0000-0000-C000-000000000046}")
public interface IMsoTrendline extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Backward"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(8)
  double backward();


  /**
   * <p>
   * Setter method for the COM property "Backward"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(9)
  void backward(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   * @return  Returns a value of type office.IMsoBorder
   */

  @VTID(10)
  office.IMsoBorder border();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clearFormats();


  /**
   * <p>
   * Getter method for the COM property "DataLabel"
   * </p>
   * @return  Returns a value of type office.IMsoDataLabel
   */

  @VTID(12)
  office.IMsoDataLabel dataLabel();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object delete();


  /**
   * <p>
   * Getter method for the COM property "DisplayEquation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(14)
  boolean displayEquation();


  /**
   * <p>
   * Setter method for the COM property "DisplayEquation"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(15)
  void displayEquation(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayRSquared"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(16)
  boolean displayRSquared();


  /**
   * <p>
   * Setter method for the COM property "DisplayRSquared"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(17)
  void displayRSquared(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Forward"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(18)
  double forward();


  /**
   * <p>
   * Setter method for the COM property "Forward"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(19)
  void forward(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(20)
  int index();


  /**
   * <p>
   * Getter method for the COM property "Intercept"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(21)
  double intercept();


  /**
   * <p>
   * Setter method for the COM property "Intercept"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(22)
  void intercept(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "InterceptIsAuto"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(23)
  boolean interceptIsAuto();


  /**
   * <p>
   * Setter method for the COM property "InterceptIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(24)
  void interceptIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(25)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(26)
  void name(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "NameIsAuto"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(27)
  boolean nameIsAuto();


  /**
   * <p>
   * Setter method for the COM property "NameIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(28)
  void nameIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Order"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(29)
  int order();


  /**
   * <p>
   * Setter method for the COM property "Order"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(30)
  void order(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Period"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(31)
  int period();


  /**
   * <p>
   * Setter method for the COM property "Period"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(32)
  void period(
    int rhs);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(33)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type office.XlTrendlineType
   */

  @VTID(34)
  office.XlTrendlineType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory office.XlTrendlineType parameter.
   */

  @VTID(35)
  void type(
    office.XlTrendlineType rhs);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type office.IMsoChartFormat
   */

  @VTID(36)
  office.IMsoChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(37)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(38)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Backward2"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(39)
  double backward2();


  /**
   * <p>
   * Setter method for the COM property "Backward2"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(40)
  void backward2(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Forward2"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(41)
  double forward2();


  /**
   * <p>
   * Setter method for the COM property "Forward2"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(42)
  void forward2(
    double rhs);


  // Properties:
}
