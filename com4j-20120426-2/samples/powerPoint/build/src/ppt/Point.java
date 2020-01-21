package ppt  ;

import com4j.*;

@IID("{92D41A73-F07E-4CA4-AF6F-BEF486AA4E6F}")
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
   * @return  Returns a value of type ppt.DataLabel
   */

  @DISPID(158) //= 0x9e. The runtime will prefer the VTID if present
  @VTID(11)
  ppt.DataLabel dataLabel();


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
   * @param rhs Mandatory int parameter.
   */

  @DISPID(182) //= 0xb6. The runtime will prefer the VTID if present
  @VTID(14)
  void explosion(
    int rhs);


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
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(77) //= 0x4d. The runtime will prefer the VTID if present
  @VTID(16)
  void hasDataLabel(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type ppt.Interior
   */

  @DISPID(129) //= 0x81. The runtime will prefer the VTID if present
  @VTID(17)
  ppt.Interior interior();


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
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(132) //= 0x84. The runtime will prefer the VTID if present
  @VTID(19)
  void invertIfNegative(
    boolean rhs);


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
   * @param rhs Mandatory int parameter.
   */

  @DISPID(73) //= 0x49. The runtime will prefer the VTID if present
  @VTID(21)
  void markerBackgroundColor(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerBackgroundColorIndex"
   * </p>
   * @return  Returns a value of type ppt.XlColorIndex
   */

  @DISPID(74) //= 0x4a. The runtime will prefer the VTID if present
  @VTID(22)
  ppt.XlColorIndex markerBackgroundColorIndex();


  /**
   * <p>
   * Setter method for the COM property "MarkerBackgroundColorIndex"
   * </p>
   * @param rhs Mandatory ppt.XlColorIndex parameter.
   */

  @DISPID(74) //= 0x4a. The runtime will prefer the VTID if present
  @VTID(23)
  void markerBackgroundColorIndex(
    ppt.XlColorIndex rhs);


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
   * @param rhs Mandatory int parameter.
   */

  @DISPID(75) //= 0x4b. The runtime will prefer the VTID if present
  @VTID(25)
  void markerForegroundColor(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerForegroundColorIndex"
   * </p>
   * @return  Returns a value of type ppt.XlColorIndex
   */

  @DISPID(76) //= 0x4c. The runtime will prefer the VTID if present
  @VTID(26)
  ppt.XlColorIndex markerForegroundColorIndex();


  /**
   * <p>
   * Setter method for the COM property "MarkerForegroundColorIndex"
   * </p>
   * @param rhs Mandatory ppt.XlColorIndex parameter.
   */

  @DISPID(76) //= 0x4c. The runtime will prefer the VTID if present
  @VTID(27)
  void markerForegroundColorIndex(
    ppt.XlColorIndex rhs);


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
   * @param rhs Mandatory int parameter.
   */

  @DISPID(231) //= 0xe7. The runtime will prefer the VTID if present
  @VTID(29)
  void markerSize(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerStyle"
   * </p>
   * @return  Returns a value of type ppt.XlMarkerStyle
   */

  @DISPID(72) //= 0x48. The runtime will prefer the VTID if present
  @VTID(30)
  ppt.XlMarkerStyle markerStyle();


  /**
   * <p>
   * Setter method for the COM property "MarkerStyle"
   * </p>
   * @param rhs Mandatory ppt.XlMarkerStyle parameter.
   */

  @DISPID(72) //= 0x48. The runtime will prefer the VTID if present
  @VTID(31)
  void markerStyle(
    ppt.XlMarkerStyle rhs);


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
   * @return  Returns a value of type ppt.XlChartPictureType
   */

  @DISPID(161) //= 0xa1. The runtime will prefer the VTID if present
  @VTID(33)
  ppt.XlChartPictureType pictureType();


  /**
   * <p>
   * Setter method for the COM property "PictureType"
   * </p>
   * @param rhs Mandatory ppt.XlChartPictureType parameter.
   */

  @DISPID(161) //= 0xa1. The runtime will prefer the VTID if present
  @VTID(34)
  void pictureType(
    ppt.XlChartPictureType rhs);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(235) //= 0xeb. The runtime will prefer the VTID if present
  @VTID(35)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToSides"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1659) //= 0x67b. The runtime will prefer the VTID if present
  @VTID(36)
  boolean applyPictToSides();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToSides"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1659) //= 0x67b. The runtime will prefer the VTID if present
  @VTID(37)
  void applyPictToSides(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToFront"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1660) //= 0x67c. The runtime will prefer the VTID if present
  @VTID(38)
  boolean applyPictToFront();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToFront"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1660) //= 0x67c. The runtime will prefer the VTID if present
  @VTID(39)
  void applyPictToFront(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToEnd"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1661) //= 0x67d. The runtime will prefer the VTID if present
  @VTID(40)
  boolean applyPictToEnd();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToEnd"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1661) //= 0x67d. The runtime will prefer the VTID if present
  @VTID(41)
  void applyPictToEnd(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(42)
  boolean shadow();


  /**
   * <p>
   * Setter method for the COM property "Shadow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(43)
  void shadow(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SecondaryPlot"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1662) //= 0x67e. The runtime will prefer the VTID if present
  @VTID(44)
  boolean secondaryPlot();


  /**
   * <p>
   * Setter method for the COM property "SecondaryPlot"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1662) //= 0x67e. The runtime will prefer the VTID if present
  @VTID(45)
  void secondaryPlot(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type ppt.ChartFillFormat
   */

  @DISPID(1663) //= 0x67f. The runtime will prefer the VTID if present
  @VTID(46)
  ppt.ChartFillFormat fill();


  /**
   * <p>
   * Getter method for the COM property "Has3DEffect"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1665) //= 0x681. The runtime will prefer the VTID if present
  @VTID(47)
  boolean has3DEffect();


  /**
   * <p>
   * Setter method for the COM property "Has3DEffect"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1665) //= 0x681. The runtime will prefer the VTID if present
  @VTID(48)
  void has3DEffect(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type ppt.ChartFormat
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(49)
  ppt.ChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(50)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "PictureUnit2"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2649) //= 0xa59. The runtime will prefer the VTID if present
  @VTID(51)
  double pictureUnit2();


  /**
   * <p>
   * Setter method for the COM property "PictureUnit2"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(2649) //= 0xa59. The runtime will prefer the VTID if present
  @VTID(52)
  void pictureUnit2(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(53)
  ppt._Application application();


  /**
   * @param type Optional parameter. Default value is 2
   * @param legendKey Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasLeaderLines Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(54)
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
  @VTID(55)
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
  @VTID(56)
  int pictureUnit();


  /**
   * <p>
   * Setter method for the COM property "PictureUnit"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(57)
  void pictureUnit(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(58)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(59)
  double height();


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(60)
  double width();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(61)
  double left();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(62)
  double top();


  /**
   * @param loc Mandatory ppt.XlPieSliceLocation parameter.
   * @param index Optional parameter. Default value is 2
   * @return  Returns a value of type double
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(63)
  double pieSliceLocation(
    ppt.XlPieSliceLocation loc,
    @Optional @DefaultValue("2") ppt.XlPieSliceIndex index);


  // Properties:
}
