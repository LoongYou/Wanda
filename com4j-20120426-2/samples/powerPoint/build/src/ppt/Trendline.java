package ppt  ;

import com4j.*;

@IID("{92D41A79-F07E-4CA4-AF6F-BEF486AA4E6F}")
public interface Trendline extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   * @return  Returns a value of type ppt.ChartBorder
   */

  @DISPID(128) //= 0x80. The runtime will prefer the VTID if present
  @VTID(8)
  ppt.ChartBorder border();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clearFormats();


  /**
   * <p>
   * Getter method for the COM property "DataLabel"
   * </p>
   * @return  Returns a value of type ppt.DataLabel
   */

  @DISPID(158) //= 0x9e. The runtime will prefer the VTID if present
  @VTID(10)
  ppt.DataLabel dataLabel();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object delete();


  /**
   * <p>
   * Getter method for the COM property "DisplayEquation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(190) //= 0xbe. The runtime will prefer the VTID if present
  @VTID(12)
  boolean displayEquation();


  /**
   * <p>
   * Setter method for the COM property "DisplayEquation"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(190) //= 0xbe. The runtime will prefer the VTID if present
  @VTID(13)
  void displayEquation(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayRSquared"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(189) //= 0xbd. The runtime will prefer the VTID if present
  @VTID(14)
  boolean displayRSquared();


  /**
   * <p>
   * Setter method for the COM property "DisplayRSquared"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(189) //= 0xbd. The runtime will prefer the VTID if present
  @VTID(15)
  void displayRSquared(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(486) //= 0x1e6. The runtime will prefer the VTID if present
  @VTID(16)
  int index();


  /**
   * <p>
   * Getter method for the COM property "Intercept"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(186) //= 0xba. The runtime will prefer the VTID if present
  @VTID(17)
  double intercept();


  /**
   * <p>
   * Setter method for the COM property "Intercept"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(186) //= 0xba. The runtime will prefer the VTID if present
  @VTID(18)
  void intercept(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "InterceptIsAuto"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(187) //= 0xbb. The runtime will prefer the VTID if present
  @VTID(19)
  boolean interceptIsAuto();


  /**
   * <p>
   * Setter method for the COM property "InterceptIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(187) //= 0xbb. The runtime will prefer the VTID if present
  @VTID(20)
  void interceptIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(22)
  void name(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "NameIsAuto"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(188) //= 0xbc. The runtime will prefer the VTID if present
  @VTID(23)
  boolean nameIsAuto();


  /**
   * <p>
   * Setter method for the COM property "NameIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(188) //= 0xbc. The runtime will prefer the VTID if present
  @VTID(24)
  void nameIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Order"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(192) //= 0xc0. The runtime will prefer the VTID if present
  @VTID(25)
  int order();


  /**
   * <p>
   * Setter method for the COM property "Order"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(192) //= 0xc0. The runtime will prefer the VTID if present
  @VTID(26)
  void order(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Period"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(184) //= 0xb8. The runtime will prefer the VTID if present
  @VTID(27)
  int period();


  /**
   * <p>
   * Setter method for the COM property "Period"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(184) //= 0xb8. The runtime will prefer the VTID if present
  @VTID(28)
  void period(
    int rhs);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(235) //= 0xeb. The runtime will prefer the VTID if present
  @VTID(29)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type ppt.XlTrendlineType
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(30)
  ppt.XlTrendlineType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory ppt.XlTrendlineType parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(31)
  void type(
    ppt.XlTrendlineType rhs);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type ppt.ChartFormat
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(32)
  ppt.ChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(33)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Backward2"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2650) //= 0xa5a. The runtime will prefer the VTID if present
  @VTID(34)
  double backward2();


  /**
   * <p>
   * Setter method for the COM property "Backward2"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(2650) //= 0xa5a. The runtime will prefer the VTID if present
  @VTID(35)
  void backward2(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Forward2"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2651) //= 0xa5b. The runtime will prefer the VTID if present
  @VTID(36)
  double forward2();


  /**
   * <p>
   * Setter method for the COM property "Forward2"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(2651) //= 0xa5b. The runtime will prefer the VTID if present
  @VTID(37)
  void forward2(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(38)
  ppt._Application application();


  /**
   * <p>
   * Getter method for the COM property "Backward"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(39)
  int backward();


  /**
   * <p>
   * Setter method for the COM property "Backward"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(40)
  void backward(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Forward"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(41)
  int forward();


  /**
   * <p>
   * Setter method for the COM property "Forward"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(42)
  void forward(
    int rhs);


  // Properties:
}
