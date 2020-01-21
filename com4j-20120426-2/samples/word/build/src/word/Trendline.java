package word  ;

import com4j.*;

@IID("{91C46192-3124-4346-A815-10B8873F5A06}")
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
   * Getter method for the COM property "Backward"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(185) //= 0xb9. The runtime will prefer the VTID if present
  @VTID(8)
  double backward();


  /**
   * <p>
   * Setter method for the COM property "Backward"
   * </p>
   * @param prop Mandatory double parameter.
   */

  @DISPID(185) //= 0xb9. The runtime will prefer the VTID if present
  @VTID(9)
  void backward(
    double prop);


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   * @return  Returns a value of type word.ChartBorder
   */

  @DISPID(128) //= 0x80. The runtime will prefer the VTID if present
  @VTID(10)
  word.ChartBorder border();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clearFormats();


  /**
   * <p>
   * Getter method for the COM property "DataLabel"
   * </p>
   * @return  Returns a value of type word.DataLabel
   */

  @DISPID(158) //= 0x9e. The runtime will prefer the VTID if present
  @VTID(12)
  word.DataLabel dataLabel();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object delete();


  /**
   * <p>
   * Getter method for the COM property "DisplayEquation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(190) //= 0xbe. The runtime will prefer the VTID if present
  @VTID(14)
  boolean displayEquation();


  /**
   * <p>
   * Setter method for the COM property "DisplayEquation"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(190) //= 0xbe. The runtime will prefer the VTID if present
  @VTID(15)
  void displayEquation(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "DisplayRSquared"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(189) //= 0xbd. The runtime will prefer the VTID if present
  @VTID(16)
  boolean displayRSquared();


  /**
   * <p>
   * Setter method for the COM property "DisplayRSquared"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(189) //= 0xbd. The runtime will prefer the VTID if present
  @VTID(17)
  void displayRSquared(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Forward"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(191) //= 0xbf. The runtime will prefer the VTID if present
  @VTID(18)
  double forward();


  /**
   * <p>
   * Setter method for the COM property "Forward"
   * </p>
   * @param prop Mandatory double parameter.
   */

  @DISPID(191) //= 0xbf. The runtime will prefer the VTID if present
  @VTID(19)
  void forward(
    double prop);


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(486) //= 0x1e6. The runtime will prefer the VTID if present
  @VTID(20)
  int index();


  /**
   * <p>
   * Getter method for the COM property "Intercept"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(186) //= 0xba. The runtime will prefer the VTID if present
  @VTID(21)
  double intercept();


  /**
   * <p>
   * Setter method for the COM property "Intercept"
   * </p>
   * @param prop Mandatory double parameter.
   */

  @DISPID(186) //= 0xba. The runtime will prefer the VTID if present
  @VTID(22)
  void intercept(
    double prop);


  /**
   * <p>
   * Getter method for the COM property "InterceptIsAuto"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(187) //= 0xbb. The runtime will prefer the VTID if present
  @VTID(23)
  boolean interceptIsAuto();


  /**
   * <p>
   * Setter method for the COM property "InterceptIsAuto"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(187) //= 0xbb. The runtime will prefer the VTID if present
  @VTID(24)
  void interceptIsAuto(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(26)
  void name(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "NameIsAuto"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(188) //= 0xbc. The runtime will prefer the VTID if present
  @VTID(27)
  boolean nameIsAuto();


  /**
   * <p>
   * Setter method for the COM property "NameIsAuto"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(188) //= 0xbc. The runtime will prefer the VTID if present
  @VTID(28)
  void nameIsAuto(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Order"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(192) //= 0xc0. The runtime will prefer the VTID if present
  @VTID(29)
  int order();


  /**
   * <p>
   * Setter method for the COM property "Order"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(192) //= 0xc0. The runtime will prefer the VTID if present
  @VTID(30)
  void order(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Period"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(184) //= 0xb8. The runtime will prefer the VTID if present
  @VTID(31)
  int period();


  /**
   * <p>
   * Setter method for the COM property "Period"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(184) //= 0xb8. The runtime will prefer the VTID if present
  @VTID(32)
  void period(
    int prop);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(235) //= 0xeb. The runtime will prefer the VTID if present
  @VTID(33)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type word.XlTrendlineType
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(34)
  word.XlTrendlineType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param prop Mandatory word.XlTrendlineType parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(35)
  void type(
    word.XlTrendlineType prop);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type word.ChartFormat
   */

  @DISPID(1610743837) //= 0x6002001d. The runtime will prefer the VTID if present
  @VTID(36)
  word.ChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(37)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(38)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Backward2"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2650) //= 0xa5a. The runtime will prefer the VTID if present
  @VTID(39)
  double backward2();


  /**
   * <p>
   * Setter method for the COM property "Backward2"
   * </p>
   * @param prop Mandatory double parameter.
   */

  @DISPID(2650) //= 0xa5a. The runtime will prefer the VTID if present
  @VTID(40)
  void backward2(
    double prop);


  /**
   * <p>
   * Getter method for the COM property "Forward2"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2651) //= 0xa5b. The runtime will prefer the VTID if present
  @VTID(41)
  double forward2();


  /**
   * <p>
   * Setter method for the COM property "Forward2"
   * </p>
   * @param prop Mandatory double parameter.
   */

  @DISPID(2651) //= 0xa5b. The runtime will prefer the VTID if present
  @VTID(42)
  void forward2(
    double prop);


  // Properties:
}
