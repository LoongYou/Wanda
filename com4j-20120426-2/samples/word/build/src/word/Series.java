package word  ;

import com4j.*;

@IID("{40810760-068A-4486-BEC9-8EA58C7029F5}")
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
   * @return  Returns a value of type word.XlAxisGroup
   */

  @DISPID(47) //= 0x2f. The runtime will prefer the VTID if present
  @VTID(8)
  word.XlAxisGroup axisGroup();


  /**
   * <p>
   * Setter method for the COM property "AxisGroup"
   * </p>
   * @param prop Mandatory word.XlAxisGroup parameter.
   */

  @DISPID(47) //= 0x2f. The runtime will prefer the VTID if present
  @VTID(9)
  void axisGroup(
    word.XlAxisGroup prop);


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
   * @param direction Mandatory word.XlErrorBarDirection parameter.
   * @param include Mandatory word.XlErrorBarInclude parameter.
   * @param type Mandatory word.XlErrorBarType parameter.
   * @param amount Optional parameter. Default value is com4j.Variant.getMissing()
   * @param minusValues Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(152) //= 0x98. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object errorBar(
    word.XlErrorBarDirection direction,
    word.XlErrorBarInclude include,
    word.XlErrorBarType type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object amount,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object minusValues);


  /**
   * <p>
   * Getter method for the COM property "ErrorBars"
   * </p>
   * @return  Returns a value of type word.ErrorBars
   */

  @DISPID(159) //= 0x9f. The runtime will prefer the VTID if present
  @VTID(16)
  word.ErrorBars errorBars();


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
   * @param prop Mandatory int parameter.
   */

  @DISPID(182) //= 0xb6. The runtime will prefer the VTID if present
  @VTID(18)
  void explosion(
    int prop);


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
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(261) //= 0x105. The runtime will prefer the VTID if present
  @VTID(20)
  void formula(
    java.lang.String prop);


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
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(263) //= 0x107. The runtime will prefer the VTID if present
  @VTID(22)
  void formulaLocal(
    java.lang.String prop);


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
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(264) //= 0x108. The runtime will prefer the VTID if present
  @VTID(24)
  void formulaR1C1(
    java.lang.String prop);


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
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(265) //= 0x109. The runtime will prefer the VTID if present
  @VTID(26)
  void formulaR1C1Local(
    java.lang.String prop);


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
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(78) //= 0x4e. The runtime will prefer the VTID if present
  @VTID(28)
  void hasDataLabels(
    boolean prop);


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
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(160) //= 0xa0. The runtime will prefer the VTID if present
  @VTID(30)
  void hasErrorBars(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type word.Interior
   */

  @DISPID(129) //= 0x81. The runtime will prefer the VTID if present
  @VTID(31)
  word.Interior interior();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type word.ChartFillFormat
   */

  @DISPID(1663) //= 0x67f. The runtime will prefer the VTID if present
  @VTID(32)
  word.ChartFillFormat fill();


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
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(132) //= 0x84. The runtime will prefer the VTID if present
  @VTID(34)
  void invertIfNegative(
    boolean prop);


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
   * @param prop Mandatory int parameter.
   */

  @DISPID(73) //= 0x49. The runtime will prefer the VTID if present
  @VTID(36)
  void markerBackgroundColor(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "MarkerBackgroundColorIndex"
   * </p>
   * @return  Returns a value of type word.XlColorIndex
   */

  @DISPID(74) //= 0x4a. The runtime will prefer the VTID if present
  @VTID(37)
  word.XlColorIndex markerBackgroundColorIndex();


  /**
   * <p>
   * Setter method for the COM property "MarkerBackgroundColorIndex"
   * </p>
   * @param prop Mandatory word.XlColorIndex parameter.
   */

  @DISPID(74) //= 0x4a. The runtime will prefer the VTID if present
  @VTID(38)
  void markerBackgroundColorIndex(
    word.XlColorIndex prop);


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
   * @param prop Mandatory int parameter.
   */

  @DISPID(75) //= 0x4b. The runtime will prefer the VTID if present
  @VTID(40)
  void markerForegroundColor(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "MarkerForegroundColorIndex"
   * </p>
   * @return  Returns a value of type word.XlColorIndex
   */

  @DISPID(76) //= 0x4c. The runtime will prefer the VTID if present
  @VTID(41)
  word.XlColorIndex markerForegroundColorIndex();


  /**
   * <p>
   * Setter method for the COM property "MarkerForegroundColorIndex"
   * </p>
   * @param prop Mandatory word.XlColorIndex parameter.
   */

  @DISPID(76) //= 0x4c. The runtime will prefer the VTID if present
  @VTID(42)
  void markerForegroundColorIndex(
    word.XlColorIndex prop);


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
   * @param prop Mandatory int parameter.
   */

  @DISPID(231) //= 0xe7. The runtime will prefer the VTID if present
  @VTID(44)
  void markerSize(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "MarkerStyle"
   * </p>
   * @return  Returns a value of type word.XlMarkerStyle
   */

  @DISPID(72) //= 0x48. The runtime will prefer the VTID if present
  @VTID(45)
  word.XlMarkerStyle markerStyle();


  /**
   * <p>
   * Setter method for the COM property "MarkerStyle"
   * </p>
   * @param prop Mandatory word.XlMarkerStyle parameter.
   */

  @DISPID(72) //= 0x48. The runtime will prefer the VTID if present
  @VTID(46)
  void markerStyle(
    word.XlMarkerStyle prop);


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
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(48)
  void name(
    java.lang.String prop);


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
   * @return  Returns a value of type word.XlChartPictureType
   */

  @DISPID(161) //= 0xa1. The runtime will prefer the VTID if present
  @VTID(50)
  word.XlChartPictureType pictureType();


  /**
   * <p>
   * Setter method for the COM property "PictureType"
   * </p>
   * @param prop Mandatory word.XlChartPictureType parameter.
   */

  @DISPID(161) //= 0xa1. The runtime will prefer the VTID if present
  @VTID(51)
  void pictureType(
    word.XlChartPictureType prop);


  /**
   * <p>
   * Getter method for the COM property "PictureUnit"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(162) //= 0xa2. The runtime will prefer the VTID if present
  @VTID(52)
  double pictureUnit();


  /**
   * <p>
   * Setter method for the COM property "PictureUnit"
   * </p>
   * @param prop Mandatory double parameter.
   */

  @DISPID(162) //= 0xa2. The runtime will prefer the VTID if present
  @VTID(53)
  void pictureUnit(
    double prop);


  /**
   * <p>
   * Getter method for the COM property "PlotOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(228) //= 0xe4. The runtime will prefer the VTID if present
  @VTID(54)
  int plotOrder();


  /**
   * <p>
   * Setter method for the COM property "PlotOrder"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(228) //= 0xe4. The runtime will prefer the VTID if present
  @VTID(55)
  void plotOrder(
    int prop);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(70) //= 0x46. The runtime will prefer the VTID if present
  @VTID(56)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject points(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(235) //= 0xeb. The runtime will prefer the VTID if present
  @VTID(57)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "Smooth"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(163) //= 0xa3. The runtime will prefer the VTID if present
  @VTID(58)
  boolean smooth();


  /**
   * <p>
   * Setter method for the COM property "Smooth"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(163) //= 0xa3. The runtime will prefer the VTID if present
  @VTID(59)
  void smooth(
    boolean prop);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(154) //= 0x9a. The runtime will prefer the VTID if present
  @VTID(60)
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
  @VTID(61)
  int type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(62)
  void type(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "ChartType"
   * </p>
   * @return  Returns a value of type office.XlChartType
   */

  @DISPID(1400) //= 0x578. The runtime will prefer the VTID if present
  @VTID(63)
  office.XlChartType chartType();


  /**
   * <p>
   * Setter method for the COM property "ChartType"
   * </p>
   * @param prop Mandatory office.XlChartType parameter.
   */

  @DISPID(1400) //= 0x578. The runtime will prefer the VTID if present
  @VTID(64)
  void chartType(
    office.XlChartType prop);


  /**
   * @param chartType Mandatory office.XlChartType parameter.
   */

  @DISPID(1401) //= 0x579. The runtime will prefer the VTID if present
  @VTID(65)
  void applyCustomType(
    office.XlChartType chartType);


  /**
   * <p>
   * Getter method for the COM property "Values"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(164) //= 0xa4. The runtime will prefer the VTID if present
  @VTID(66)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object values();


  /**
   * <p>
   * Setter method for the COM property "Values"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(164) //= 0xa4. The runtime will prefer the VTID if present
  @VTID(67)
  void values(
    @MarshalAs(NativeType.VARIANT) java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "XValues"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1111) //= 0x457. The runtime will prefer the VTID if present
  @VTID(68)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object xValues();


  /**
   * <p>
   * Setter method for the COM property "XValues"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(1111) //= 0x457. The runtime will prefer the VTID if present
  @VTID(69)
  void xValues(
    @MarshalAs(NativeType.VARIANT) java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "BubbleSizes"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1664) //= 0x680. The runtime will prefer the VTID if present
  @VTID(70)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object bubbleSizes();


  /**
   * <p>
   * Setter method for the COM property "BubbleSizes"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(1664) //= 0x680. The runtime will prefer the VTID if present
  @VTID(71)
  void bubbleSizes(
    @MarshalAs(NativeType.VARIANT) java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "BarShape"
   * </p>
   * @return  Returns a value of type word.XlBarShape
   */

  @DISPID(1403) //= 0x57b. The runtime will prefer the VTID if present
  @VTID(72)
  word.XlBarShape barShape();


  /**
   * <p>
   * Setter method for the COM property "BarShape"
   * </p>
   * @param prop Mandatory word.XlBarShape parameter.
   */

  @DISPID(1403) //= 0x57b. The runtime will prefer the VTID if present
  @VTID(73)
  void barShape(
    word.XlBarShape prop);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToSides"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1659) //= 0x67b. The runtime will prefer the VTID if present
  @VTID(74)
  boolean applyPictToSides();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToSides"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1659) //= 0x67b. The runtime will prefer the VTID if present
  @VTID(75)
  void applyPictToSides(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToFront"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1660) //= 0x67c. The runtime will prefer the VTID if present
  @VTID(76)
  boolean applyPictToFront();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToFront"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1660) //= 0x67c. The runtime will prefer the VTID if present
  @VTID(77)
  void applyPictToFront(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToEnd"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1661) //= 0x67d. The runtime will prefer the VTID if present
  @VTID(78)
  boolean applyPictToEnd();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToEnd"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1661) //= 0x67d. The runtime will prefer the VTID if present
  @VTID(79)
  void applyPictToEnd(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Has3DEffect"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1665) //= 0x681. The runtime will prefer the VTID if present
  @VTID(80)
  boolean has3DEffect();


  /**
   * <p>
   * Setter method for the COM property "Has3DEffect"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1665) //= 0x681. The runtime will prefer the VTID if present
  @VTID(81)
  void has3DEffect(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(82)
  boolean shadow();


  /**
   * <p>
   * Setter method for the COM property "Shadow"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(83)
  void shadow(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "HasLeaderLines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1394) //= 0x572. The runtime will prefer the VTID if present
  @VTID(84)
  boolean hasLeaderLines();


  /**
   * <p>
   * Setter method for the COM property "HasLeaderLines"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1394) //= 0x572. The runtime will prefer the VTID if present
  @VTID(85)
  void hasLeaderLines(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "LeaderLines"
   * </p>
   * @return  Returns a value of type word.LeaderLines
   */

  @DISPID(1666) //= 0x682. The runtime will prefer the VTID if present
  @VTID(86)
  word.LeaderLines leaderLines();


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

  @DISPID(1922) //= 0x782. The runtime will prefer the VTID if present
  @VTID(87)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object applyDataLabels(
    @Optional @DefaultValue("2") word.XlDataLabelsType type,
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
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type word.ChartFormat
   */

  @DISPID(1610743890) //= 0x60020052. The runtime will prefer the VTID if present
  @VTID(88)
  word.ChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(89)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(90)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "PictureUnit2"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2649) //= 0xa59. The runtime will prefer the VTID if present
  @VTID(91)
  double pictureUnit2();


  /**
   * <p>
   * Setter method for the COM property "PictureUnit2"
   * </p>
   * @param prop Mandatory double parameter.
   */

  @DISPID(2649) //= 0xa59. The runtime will prefer the VTID if present
  @VTID(92)
  void pictureUnit2(
    double prop);


  /**
   * <p>
   * Getter method for the COM property "PlotColorIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1924) //= 0x784. The runtime will prefer the VTID if present
  @VTID(93)
  int plotColorIndex();


  /**
   * <p>
   * Getter method for the COM property "InvertColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2884) //= 0xb44. The runtime will prefer the VTID if present
  @VTID(94)
  int invertColor();


  /**
   * <p>
   * Setter method for the COM property "InvertColor"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(2884) //= 0xb44. The runtime will prefer the VTID if present
  @VTID(95)
  void invertColor(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "InvertColorIndex"
   * </p>
   * @return  Returns a value of type word.XlColorIndex
   */

  @DISPID(2885) //= 0xb45. The runtime will prefer the VTID if present
  @VTID(96)
  word.XlColorIndex invertColorIndex();


  /**
   * <p>
   * Setter method for the COM property "InvertColorIndex"
   * </p>
   * @param prop Mandatory word.XlColorIndex parameter.
   */

  @DISPID(2885) //= 0xb45. The runtime will prefer the VTID if present
  @VTID(97)
  void invertColorIndex(
    word.XlColorIndex prop);


  // Properties:
}
