package word  ;

import com4j.*;

@IID("{8A342FA0-5831-4B5E-82E1-003D0A0C635D}")
public interface Point extends Com4jObject {
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
   * @return  Returns a value of type word.ChartBorder
   */

  @DISPID(128) //= 0x80. The runtime will prefer the VTID if present
  @VTID(8)
  word.ChartBorder border();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clearFormats();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(551) //= 0x227. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object copy();


  /**
   * <p>
   * Getter method for the COM property "DataLabel"
   * </p>
   * @return  Returns a value of type word.DataLabel
   */

  @DISPID(158) //= 0x9e. The runtime will prefer the VTID if present
  @VTID(11)
  word.DataLabel dataLabel();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object delete();


  /**
   * <p>
   * Getter method for the COM property "Explosion"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(182) //= 0xb6. The runtime will prefer the VTID if present
  @VTID(13)
  int explosion();


  /**
   * <p>
   * Setter method for the COM property "Explosion"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(182) //= 0xb6. The runtime will prefer the VTID if present
  @VTID(14)
  void explosion(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "HasDataLabel"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(77) //= 0x4d. The runtime will prefer the VTID if present
  @VTID(15)
  boolean hasDataLabel();


  /**
   * <p>
   * Setter method for the COM property "HasDataLabel"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(77) //= 0x4d. The runtime will prefer the VTID if present
  @VTID(16)
  void hasDataLabel(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type word.Interior
   */

  @DISPID(129) //= 0x81. The runtime will prefer the VTID if present
  @VTID(17)
  word.Interior interior();


  /**
   * <p>
   * Getter method for the COM property "InvertIfNegative"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(132) //= 0x84. The runtime will prefer the VTID if present
  @VTID(18)
  boolean invertIfNegative();


  /**
   * <p>
   * Setter method for the COM property "InvertIfNegative"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(132) //= 0x84. The runtime will prefer the VTID if present
  @VTID(19)
  void invertIfNegative(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MarkerBackgroundColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(73) //= 0x49. The runtime will prefer the VTID if present
  @VTID(20)
  int markerBackgroundColor();


  /**
   * <p>
   * Setter method for the COM property "MarkerBackgroundColor"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(73) //= 0x49. The runtime will prefer the VTID if present
  @VTID(21)
  void markerBackgroundColor(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "MarkerBackgroundColorIndex"
   * </p>
   * @return  Returns a value of type word.XlColorIndex
   */

  @DISPID(74) //= 0x4a. The runtime will prefer the VTID if present
  @VTID(22)
  word.XlColorIndex markerBackgroundColorIndex();


  /**
   * <p>
   * Setter method for the COM property "MarkerBackgroundColorIndex"
   * </p>
   * @param prop Mandatory word.XlColorIndex parameter.
   */

  @DISPID(74) //= 0x4a. The runtime will prefer the VTID if present
  @VTID(23)
  void markerBackgroundColorIndex(
    word.XlColorIndex prop);


  /**
   * <p>
   * Getter method for the COM property "MarkerForegroundColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(75) //= 0x4b. The runtime will prefer the VTID if present
  @VTID(24)
  int markerForegroundColor();


  /**
   * <p>
   * Setter method for the COM property "MarkerForegroundColor"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(75) //= 0x4b. The runtime will prefer the VTID if present
  @VTID(25)
  void markerForegroundColor(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "MarkerForegroundColorIndex"
   * </p>
   * @return  Returns a value of type word.XlColorIndex
   */

  @DISPID(76) //= 0x4c. The runtime will prefer the VTID if present
  @VTID(26)
  word.XlColorIndex markerForegroundColorIndex();


  /**
   * <p>
   * Setter method for the COM property "MarkerForegroundColorIndex"
   * </p>
   * @param prop Mandatory word.XlColorIndex parameter.
   */

  @DISPID(76) //= 0x4c. The runtime will prefer the VTID if present
  @VTID(27)
  void markerForegroundColorIndex(
    word.XlColorIndex prop);


  /**
   * <p>
   * Getter method for the COM property "MarkerSize"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(231) //= 0xe7. The runtime will prefer the VTID if present
  @VTID(28)
  int markerSize();


  /**
   * <p>
   * Setter method for the COM property "MarkerSize"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(231) //= 0xe7. The runtime will prefer the VTID if present
  @VTID(29)
  void markerSize(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "MarkerStyle"
   * </p>
   * @return  Returns a value of type word.XlMarkerStyle
   */

  @DISPID(72) //= 0x48. The runtime will prefer the VTID if present
  @VTID(30)
  word.XlMarkerStyle markerStyle();


  /**
   * <p>
   * Setter method for the COM property "MarkerStyle"
   * </p>
   * @param prop Mandatory word.XlMarkerStyle parameter.
   */

  @DISPID(72) //= 0x48. The runtime will prefer the VTID if present
  @VTID(31)
  void markerStyle(
    word.XlMarkerStyle prop);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(32)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object paste();


  /**
   * <p>
   * Getter method for the COM property "PictureType"
   * </p>
   * @return  Returns a value of type word.XlChartPictureType
   */

  @DISPID(161) //= 0xa1. The runtime will prefer the VTID if present
  @VTID(33)
  word.XlChartPictureType pictureType();


  /**
   * <p>
   * Setter method for the COM property "PictureType"
   * </p>
   * @param prop Mandatory word.XlChartPictureType parameter.
   */

  @DISPID(161) //= 0xa1. The runtime will prefer the VTID if present
  @VTID(34)
  void pictureType(
    word.XlChartPictureType prop);


  /**
   * <p>
   * Getter method for the COM property "PictureUnit"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(162) //= 0xa2. The runtime will prefer the VTID if present
  @VTID(35)
  double pictureUnit();


  /**
   * <p>
   * Setter method for the COM property "PictureUnit"
   * </p>
   * @param prop Mandatory double parameter.
   */

  @DISPID(162) //= 0xa2. The runtime will prefer the VTID if present
  @VTID(36)
  void pictureUnit(
    double prop);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(235) //= 0xeb. The runtime will prefer the VTID if present
  @VTID(37)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToSides"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1659) //= 0x67b. The runtime will prefer the VTID if present
  @VTID(38)
  boolean applyPictToSides();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToSides"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1659) //= 0x67b. The runtime will prefer the VTID if present
  @VTID(39)
  void applyPictToSides(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToFront"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1660) //= 0x67c. The runtime will prefer the VTID if present
  @VTID(40)
  boolean applyPictToFront();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToFront"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1660) //= 0x67c. The runtime will prefer the VTID if present
  @VTID(41)
  void applyPictToFront(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToEnd"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1661) //= 0x67d. The runtime will prefer the VTID if present
  @VTID(42)
  boolean applyPictToEnd();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToEnd"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1661) //= 0x67d. The runtime will prefer the VTID if present
  @VTID(43)
  void applyPictToEnd(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(44)
  boolean shadow();


  /**
   * <p>
   * Setter method for the COM property "Shadow"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(45)
  void shadow(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SecondaryPlot"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1662) //= 0x67e. The runtime will prefer the VTID if present
  @VTID(46)
  boolean secondaryPlot();


  /**
   * <p>
   * Setter method for the COM property "SecondaryPlot"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1662) //= 0x67e. The runtime will prefer the VTID if present
  @VTID(47)
  void secondaryPlot(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type word.ChartFillFormat
   */

  @DISPID(1663) //= 0x67f. The runtime will prefer the VTID if present
  @VTID(48)
  word.ChartFillFormat fill();


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
  @VTID(49)
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
   * Getter method for the COM property "Has3DEffect"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1665) //= 0x681. The runtime will prefer the VTID if present
  @VTID(50)
  boolean has3DEffect();


  /**
   * <p>
   * Setter method for the COM property "Has3DEffect"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1665) //= 0x681. The runtime will prefer the VTID if present
  @VTID(51)
  void has3DEffect(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type word.ChartFormat
   */

  @DISPID(1610743854) //= 0x6002002e. The runtime will prefer the VTID if present
  @VTID(52)
  word.ChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(53)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(54)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "PictureUnit2"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2649) //= 0xa59. The runtime will prefer the VTID if present
  @VTID(55)
  double pictureUnit2();


  /**
   * <p>
   * Setter method for the COM property "PictureUnit2"
   * </p>
   * @param prop Mandatory double parameter.
   */

  @DISPID(2649) //= 0xa59. The runtime will prefer the VTID if present
  @VTID(56)
  void pictureUnit2(
    double prop);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2652) //= 0xa5c. The runtime will prefer the VTID if present
  @VTID(57)
  double height();


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2653) //= 0xa5d. The runtime will prefer the VTID if present
  @VTID(58)
  double width();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2655) //= 0xa5f. The runtime will prefer the VTID if present
  @VTID(59)
  double top();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2654) //= 0xa5e. The runtime will prefer the VTID if present
  @VTID(60)
  double left();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2651) //= 0xa5b. The runtime will prefer the VTID if present
  @VTID(61)
  java.lang.String name();


  /**
   * @param loc Mandatory word.XlPieSliceLocation parameter.
   * @param index Optional parameter. Default value is 2
   * @return  Returns a value of type double
   */

  @DISPID(2656) //= 0xa60. The runtime will prefer the VTID if present
  @VTID(62)
  double pieSliceLocation(
    word.XlPieSliceLocation loc,
    @Optional @DefaultValue("2") word.XlPieSliceIndex index);


  // Properties:
}
