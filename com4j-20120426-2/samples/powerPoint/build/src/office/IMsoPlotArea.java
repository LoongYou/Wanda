package office  ;

import com4j.*;

@IID("{000C1724-0000-0000-C000-000000000046}")
public interface IMsoPlotArea extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String name();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(235) //= 0xeb. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   * @return  Returns a value of type office.IMsoBorder
   */

  @DISPID(128) //= 0x80. The runtime will prefer the VTID if present
  @VTID(10)
  office.IMsoBorder border();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clearFormats();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(12)
  double height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param pd Mandatory double parameter.
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(13)
  void height(
    double pd);


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type office.IMsoInterior
   */

  @DISPID(129) //= 0x81. The runtime will prefer the VTID if present
  @VTID(14)
  office.IMsoInterior interior();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type office.ChartFillFormat
   */

  @DISPID(1663) //= 0x67f. The runtime will prefer the VTID if present
  @VTID(15)
  office.ChartFillFormat fill();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(16)
  double left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param pd Mandatory double parameter.
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(17)
  void left(
    double pd);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(18)
  double top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param pd Mandatory double parameter.
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(19)
  void top(
    double pd);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(20)
  double width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param pd Mandatory double parameter.
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(21)
  void width(
    double pd);


  /**
   * <p>
   * Getter method for the COM property "InsideLeft"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1667) //= 0x683. The runtime will prefer the VTID if present
  @VTID(22)
  double insideLeft();


  /**
   * <p>
   * Setter method for the COM property "InsideLeft"
   * </p>
   * @param pd Mandatory double parameter.
   */

  @DISPID(1667) //= 0x683. The runtime will prefer the VTID if present
  @VTID(23)
  void insideLeft(
    double pd);


  /**
   * <p>
   * Getter method for the COM property "InsideTop"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1668) //= 0x684. The runtime will prefer the VTID if present
  @VTID(24)
  double insideTop();


  /**
   * <p>
   * Setter method for the COM property "InsideTop"
   * </p>
   * @param pd Mandatory double parameter.
   */

  @DISPID(1668) //= 0x684. The runtime will prefer the VTID if present
  @VTID(25)
  void insideTop(
    double pd);


  /**
   * <p>
   * Getter method for the COM property "InsideWidth"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1669) //= 0x685. The runtime will prefer the VTID if present
  @VTID(26)
  double insideWidth();


  /**
   * <p>
   * Setter method for the COM property "InsideWidth"
   * </p>
   * @param pd Mandatory double parameter.
   */

  @DISPID(1669) //= 0x685. The runtime will prefer the VTID if present
  @VTID(27)
  void insideWidth(
    double pd);


  /**
   * <p>
   * Getter method for the COM property "InsideHeight"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1670) //= 0x686. The runtime will prefer the VTID if present
  @VTID(28)
  double insideHeight();


  /**
   * <p>
   * Setter method for the COM property "InsideHeight"
   * </p>
   * @param pd Mandatory double parameter.
   */

  @DISPID(1670) //= 0x686. The runtime will prefer the VTID if present
  @VTID(29)
  void insideHeight(
    double pd);


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   * @return  Returns a value of type office.XlChartElementPosition
   */

  @DISPID(1671) //= 0x687. The runtime will prefer the VTID if present
  @VTID(30)
  office.XlChartElementPosition position();


  /**
   * <p>
   * Setter method for the COM property "Position"
   * </p>
   * @param pval Mandatory office.XlChartElementPosition parameter.
   */

  @DISPID(1671) //= 0x687. The runtime will prefer the VTID if present
  @VTID(31)
  void position(
    office.XlChartElementPosition pval);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type office.IMsoChartFormat
   */

  @DISPID(1610743833) //= 0x60020019. The runtime will prefer the VTID if present
  @VTID(32)
  office.IMsoChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(33)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(34)
  int creator();


  // Properties:
}
