package ppt  ;

import com4j.*;

@IID("{92D41A75-F07E-4CA4-AF6F-BEF486AA4E6F}")
public interface Series extends Com4jObject {
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
   * Getter method for the COM property "AxisGroup"
   * </p>
   * @return  Returns a value of type ppt.XlAxisGroup
   */

  @DISPID(47) //= 0x2f. The runtime will prefer the VTID if present
  @VTID(8)
  ppt.XlAxisGroup axisGroup();


  /**
   * <p>
   * Setter method for the COM property "AxisGroup"
   * </p>
   * @param rhs Mandatory ppt.XlAxisGroup parameter.
   */

  @DISPID(47) //= 0x2f. The runtime will prefer the VTID if present
  @VTID(9)
  void axisGroup(
    ppt.XlAxisGroup rhs);


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   * @return  Returns a value of type ppt.ChartBorder
   */

  @DISPID(128) //= 0x80. The runtime will prefer the VTID if present
  @VTID(10)
  ppt.ChartBorder border();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clearFormats();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(551) //= 0x227. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object copy();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(157) //= 0x9d. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject dataLabels(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object delete();


  /**
   * @param direction Mandatory ppt.XlErrorBarDirection parameter.
   * @param include Mandatory ppt.XlErrorBarInclude parameter.
   * @param type Mandatory ppt.XlErrorBarType parameter.
   * @param amount Optional parameter. Default value is com4j.Variant.getMissing()
   * @param minusValues Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(152) //= 0x98. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object errorBar(
    ppt.XlErrorBarDirection direction,
    ppt.XlErrorBarInclude include,
    ppt.XlErrorBarType type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object amount,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object minusValues);


  /**
   * <p>
   * Getter method for the COM property "ErrorBars"
   * </p>
   * @return  Returns a value of type ppt.ErrorBars
   */

  @DISPID(159) //= 0x9f. The runtime will prefer the VTID if present
  @VTID(16)
  ppt.ErrorBars errorBars();


  /**
   * <p>
   * Getter method for the COM property "Explosion"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(182) //= 0xb6. The runtime will prefer the VTID if present
  @VTID(17)
  int explosion();


  /**
   * <p>
   * Setter method for the COM property "Explosion"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(182) //= 0xb6. The runtime will prefer the VTID if present
  @VTID(18)
  void explosion(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Formula"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(261) //= 0x105. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String formula();


  /**
   * <p>
   * Setter method for the COM property "Formula"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(261) //= 0x105. The runtime will prefer the VTID if present
  @VTID(20)
  void formula(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaLocal"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(263) //= 0x107. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String formulaLocal();


  /**
   * <p>
   * Setter method for the COM property "FormulaLocal"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(263) //= 0x107. The runtime will prefer the VTID if present
  @VTID(22)
  void formulaLocal(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaR1C1"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(264) //= 0x108. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String formulaR1C1();


  /**
   * <p>
   * Setter method for the COM property "FormulaR1C1"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(264) //= 0x108. The runtime will prefer the VTID if present
  @VTID(24)
  void formulaR1C1(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaR1C1Local"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(265) //= 0x109. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String formulaR1C1Local();


  /**
   * <p>
   * Setter method for the COM property "FormulaR1C1Local"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(265) //= 0x109. The runtime will prefer the VTID if present
  @VTID(26)
  void formulaR1C1Local(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "HasDataLabels"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(78) //= 0x4e. The runtime will prefer the VTID if present
  @VTID(27)
  boolean hasDataLabels();


  /**
   * <p>
   * Setter method for the COM property "HasDataLabels"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(78) //= 0x4e. The runtime will prefer the VTID if present
  @VTID(28)
  void hasDataLabels(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasErrorBars"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(160) //= 0xa0. The runtime will prefer the VTID if present
  @VTID(29)
  boolean hasErrorBars();


  /**
   * <p>
   * Setter method for the COM property "HasErrorBars"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(160) //= 0xa0. The runtime will prefer the VTID if present
  @VTID(30)
  void hasErrorBars(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type ppt.Interior
   */

  @DISPID(129) //= 0x81. The runtime will prefer the VTID if present
  @VTID(31)
  ppt.Interior interior();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type ppt.ChartFillFormat
   */

  @DISPID(1663) //= 0x67f. The runtime will prefer the VTID if present
  @VTID(32)
  ppt.ChartFillFormat fill();


  /**
   * <p>
   * Getter method for the COM property "InvertIfNegative"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(132) //= 0x84. The runtime will prefer the VTID if present
  @VTID(33)
  boolean invertIfNegative();


  /**
   * <p>
   * Setter method for the COM property "InvertIfNegative"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(132) //= 0x84. The runtime will prefer the VTID if present
  @VTID(34)
  void invertIfNegative(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerBackgroundColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(73) //= 0x49. The runtime will prefer the VTID if present
  @VTID(35)
  int markerBackgroundColor();


  /**
   * <p>
   * Setter method for the COM property "MarkerBackgroundColor"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(73) //= 0x49. The runtime will prefer the VTID if present
  @VTID(36)
  void markerBackgroundColor(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerBackgroundColorIndex"
   * </p>
   * @return  Returns a value of type ppt.XlColorIndex
   */

  @DISPID(74) //= 0x4a. The runtime will prefer the VTID if present
  @VTID(37)
  ppt.XlColorIndex markerBackgroundColorIndex();


  /**
   * <p>
   * Setter method for the COM property "MarkerBackgroundColorIndex"
   * </p>
   * @param rhs Mandatory ppt.XlColorIndex parameter.
   */

  @DISPID(74) //= 0x4a. The runtime will prefer the VTID if present
  @VTID(38)
  void markerBackgroundColorIndex(
    ppt.XlColorIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerForegroundColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(75) //= 0x4b. The runtime will prefer the VTID if present
  @VTID(39)
  int markerForegroundColor();


  /**
   * <p>
   * Setter method for the COM property "MarkerForegroundColor"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(75) //= 0x4b. The runtime will prefer the VTID if present
  @VTID(40)
  void markerForegroundColor(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerForegroundColorIndex"
   * </p>
   * @return  Returns a value of type ppt.XlColorIndex
   */

  @DISPID(76) //= 0x4c. The runtime will prefer the VTID if present
  @VTID(41)
  ppt.XlColorIndex markerForegroundColorIndex();


  /**
   * <p>
   * Setter method for the COM property "MarkerForegroundColorIndex"
   * </p>
   * @param rhs Mandatory ppt.XlColorIndex parameter.
   */

  @DISPID(76) //= 0x4c. The runtime will prefer the VTID if present
  @VTID(42)
  void markerForegroundColorIndex(
    ppt.XlColorIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerSize"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(231) //= 0xe7. The runtime will prefer the VTID if present
  @VTID(43)
  int markerSize();


  /**
   * <p>
   * Setter method for the COM property "MarkerSize"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(231) //= 0xe7. The runtime will prefer the VTID if present
  @VTID(44)
  void markerSize(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerStyle"
   * </p>
   * @return  Returns a value of type ppt.XlMarkerStyle
   */

  @DISPID(72) //= 0x48. The runtime will prefer the VTID if present
  @VTID(45)
  ppt.XlMarkerStyle markerStyle();


  /**
   * <p>
   * Setter method for the COM property "MarkerStyle"
   * </p>
   * @param rhs Mandatory ppt.XlMarkerStyle parameter.
   */

  @DISPID(72) //= 0x48. The runtime will prefer the VTID if present
  @VTID(46)
  void markerStyle(
    ppt.XlMarkerStyle rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(47)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(48)
  void name(
    java.lang.String rhs);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(49)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object paste();


  /**
   * <p>
   * Getter method for the COM property "PictureType"
   * </p>
   * @return  Returns a value of type ppt.XlChartPictureType
   */

  @DISPID(161) //= 0xa1. The runtime will prefer the VTID if present
  @VTID(50)
  ppt.XlChartPictureType pictureType();


  /**
   * <p>
   * Setter method for the COM property "PictureType"
   * </p>
   * @param rhs Mandatory ppt.XlChartPictureType parameter.
   */

  @DISPID(161) //= 0xa1. The runtime will prefer the VTID if present
  @VTID(51)
  void pictureType(
    ppt.XlChartPictureType rhs);


  /**
   * <p>
   * Getter method for the COM property "PlotOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(228) //= 0xe4. The runtime will prefer the VTID if present
  @VTID(52)
  int plotOrder();


  /**
   * <p>
   * Setter method for the COM property "PlotOrder"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(228) //= 0xe4. The runtime will prefer the VTID if present
  @VTID(53)
  void plotOrder(
    int rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(70) //= 0x46. The runtime will prefer the VTID if present
  @VTID(54)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject points(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(235) //= 0xeb. The runtime will prefer the VTID if present
  @VTID(55)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "Smooth"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(163) //= 0xa3. The runtime will prefer the VTID if present
  @VTID(56)
  boolean smooth();


  /**
   * <p>
   * Setter method for the COM property "Smooth"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(163) //= 0xa3. The runtime will prefer the VTID if present
  @VTID(57)
  void smooth(
    boolean rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(154) //= 0x9a. The runtime will prefer the VTID if present
  @VTID(58)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject trendlines(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(59)
  int type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(60)
  void type(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ChartType"
   * </p>
   * @return  Returns a value of type office.XlChartType
   */

  @DISPID(1400) //= 0x578. The runtime will prefer the VTID if present
  @VTID(61)
  office.XlChartType chartType();


  /**
   * <p>
   * Setter method for the COM property "ChartType"
   * </p>
   * @param rhs Mandatory office.XlChartType parameter.
   */

  @DISPID(1400) //= 0x578. The runtime will prefer the VTID if present
  @VTID(62)
  void chartType(
    office.XlChartType rhs);


  /**
   * @param chartType Mandatory office.XlChartType parameter.
   */

  @DISPID(1401) //= 0x579. The runtime will prefer the VTID if present
  @VTID(63)
  void applyCustomType(
    office.XlChartType chartType);


  /**
   * <p>
   * Getter method for the COM property "Values"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(164) //= 0xa4. The runtime will prefer the VTID if present
  @VTID(64)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object values();


  /**
   * <p>
   * Setter method for the COM property "Values"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(164) //= 0xa4. The runtime will prefer the VTID if present
  @VTID(65)
  void values(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "XValues"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1111) //= 0x457. The runtime will prefer the VTID if present
  @VTID(66)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object xValues();


  /**
   * <p>
   * Setter method for the COM property "XValues"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1111) //= 0x457. The runtime will prefer the VTID if present
  @VTID(67)
  void xValues(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "BubbleSizes"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1664) //= 0x680. The runtime will prefer the VTID if present
  @VTID(68)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object bubbleSizes();


  /**
   * <p>
   * Setter method for the COM property "BubbleSizes"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1664) //= 0x680. The runtime will prefer the VTID if present
  @VTID(69)
  void bubbleSizes(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "BarShape"
   * </p>
   * @return  Returns a value of type ppt.XlBarShape
   */

  @DISPID(1403) //= 0x57b. The runtime will prefer the VTID if present
  @VTID(70)
  ppt.XlBarShape barShape();


  /**
   * <p>
   * Setter method for the COM property "BarShape"
   * </p>
   * @param rhs Mandatory ppt.XlBarShape parameter.
   */

  @DISPID(1403) //= 0x57b. The runtime will prefer the VTID if present
  @VTID(71)
  void barShape(
    ppt.XlBarShape rhs);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToSides"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1659) //= 0x67b. The runtime will prefer the VTID if present
  @VTID(72)
  boolean applyPictToSides();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToSides"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1659) //= 0x67b. The runtime will prefer the VTID if present
  @VTID(73)
  void applyPictToSides(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToFront"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1660) //= 0x67c. The runtime will prefer the VTID if present
  @VTID(74)
  boolean applyPictToFront();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToFront"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1660) //= 0x67c. The runtime will prefer the VTID if present
  @VTID(75)
  void applyPictToFront(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToEnd"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1661) //= 0x67d. The runtime will prefer the VTID if present
  @VTID(76)
  boolean applyPictToEnd();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToEnd"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1661) //= 0x67d. The runtime will prefer the VTID if present
  @VTID(77)
  void applyPictToEnd(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Has3DEffect"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1665) //= 0x681. The runtime will prefer the VTID if present
  @VTID(78)
  boolean has3DEffect();


  /**
   * <p>
   * Setter method for the COM property "Has3DEffect"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1665) //= 0x681. The runtime will prefer the VTID if present
  @VTID(79)
  void has3DEffect(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(80)
  boolean shadow();


  /**
   * <p>
   * Setter method for the COM property "Shadow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(81)
  void shadow(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasLeaderLines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1394) //= 0x572. The runtime will prefer the VTID if present
  @VTID(82)
  boolean hasLeaderLines();


  /**
   * <p>
   * Setter method for the COM property "HasLeaderLines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1394) //= 0x572. The runtime will prefer the VTID if present
  @VTID(83)
  void hasLeaderLines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "LeaderLines"
   * </p>
   * @return  Returns a value of type ppt.LeaderLines
   */

  @DISPID(1666) //= 0x682. The runtime will prefer the VTID if present
  @VTID(84)
  ppt.LeaderLines leaderLines();


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type ppt.ChartFormat
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(85)
  ppt.ChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(86)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "PictureUnit2"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2649) //= 0xa59. The runtime will prefer the VTID if present
  @VTID(87)
  double pictureUnit2();


  /**
   * <p>
   * Setter method for the COM property "PictureUnit2"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(2649) //= 0xa59. The runtime will prefer the VTID if present
  @VTID(88)
  void pictureUnit2(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(89)
  ppt._Application application();


  /**
   * @param type Optional parameter. Default value is 2
   * @param legendKey Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasLeaderLines Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(90)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object _ApplyDataLabels(
    @Optional @DefaultValue("2") ppt.XlDataLabelsType type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object legendKey,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object autoText,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object hasLeaderLines);


  /**
   * @param type Optional parameter. Default value is 2
   * @param legendKey Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasLeaderLines Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showSeriesName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showCategoryName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showValue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showPercentage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showBubbleSize Optional parameter. Default value is com4j.Variant.getMissing()
   * @param separator Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(91)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object applyDataLabels(
    @Optional @DefaultValue("2") ppt.XlDataLabelsType type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object legendKey,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object autoText,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object hasLeaderLines,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showSeriesName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showCategoryName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showValue,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showPercentage,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showBubbleSize,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object separator);


  /**
   * <p>
   * Getter method for the COM property "PictureUnit"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(92)
  int pictureUnit();


  /**
   * <p>
   * Setter method for the COM property "PictureUnit"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(93)
  void pictureUnit(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "PlotColorIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(94)
  int plotColorIndex();


  /**
   * <p>
   * Getter method for the COM property "InvertColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(95)
  int invertColor();


  /**
   * <p>
   * Setter method for the COM property "InvertColor"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(96)
  void invertColor(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "InvertColorIndex"
   * </p>
   * @return  Returns a value of type ppt.XlColorIndex
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(97)
  ppt.XlColorIndex invertColorIndex();


  /**
   * <p>
   * Setter method for the COM property "InvertColorIndex"
   * </p>
   * @param rhs Mandatory ppt.XlColorIndex parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(98)
  void invertColorIndex(
    ppt.XlColorIndex rhs);


  // Properties:
}
