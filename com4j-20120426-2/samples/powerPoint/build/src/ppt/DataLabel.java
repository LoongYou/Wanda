package ppt  ;

import com4j.*;

@IID("{92D41A61-F07E-4CA4-AF6F-BEF486AA4E6F}")
public interface DataLabel extends Com4jObject {
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
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String name();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(235) //= 0xeb. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select();


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

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object delete();


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type ppt.Interior
   */

  @DISPID(129) //= 0x81. The runtime will prefer the VTID if present
  @VTID(12)
  ppt.Interior interior();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type ppt.ChartFillFormat
   */

  @DISPID(1663) //= 0x67f. The runtime will prefer the VTID if present
  @VTID(13)
  ppt.ChartFillFormat fill();


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(139) //= 0x8b. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String caption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(139) //= 0x8b. The runtime will prefer the VTID if present
  @VTID(15)
  void caption(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Characters"
   * </p>
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   * @param length Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type ppt.ChartCharacters
   */

  @DISPID(603) //= 0x25b. The runtime will prefer the VTID if present
  @VTID(16)
  ppt.ChartCharacters characters(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object start,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object length);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type ppt.ChartFont
   */

  @DISPID(146) //= 0x92. The runtime will prefer the VTID if present
  @VTID(17)
  ppt.ChartFont font();


  /**
   * <p>
   * Getter method for the COM property "HorizontalAlignment"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(136) //= 0x88. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object horizontalAlignment();


  /**
   * <p>
   * Setter method for the COM property "HorizontalAlignment"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(136) //= 0x88. The runtime will prefer the VTID if present
  @VTID(19)
  void horizontalAlignment(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(20)
  double left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(21)
  void left(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(134) //= 0x86. The runtime will prefer the VTID if present
  @VTID(22)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(134) //= 0x86. The runtime will prefer the VTID if present
  @VTID(23)
  void orientation(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(24)
  boolean shadow();


  /**
   * <p>
   * Setter method for the COM property "Shadow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(25)
  void shadow(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(138) //= 0x8a. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.String text();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(138) //= 0x8a. The runtime will prefer the VTID if present
  @VTID(27)
  void text(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(28)
  double top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(29)
  void top(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "VerticalAlignment"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(137) //= 0x89. The runtime will prefer the VTID if present
  @VTID(30)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object verticalAlignment();


  /**
   * <p>
   * Setter method for the COM property "VerticalAlignment"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(137) //= 0x89. The runtime will prefer the VTID if present
  @VTID(31)
  void verticalAlignment(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ReadingOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(975) //= 0x3cf. The runtime will prefer the VTID if present
  @VTID(32)
  int readingOrder();


  /**
   * <p>
   * Setter method for the COM property "ReadingOrder"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(975) //= 0x3cf. The runtime will prefer the VTID if present
  @VTID(33)
  void readingOrder(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoScaleFont"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1525) //= 0x5f5. The runtime will prefer the VTID if present
  @VTID(34)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object autoScaleFont();


  /**
   * <p>
   * Setter method for the COM property "AutoScaleFont"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1525) //= 0x5f5. The runtime will prefer the VTID if present
  @VTID(35)
  void autoScaleFont(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoText"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(135) //= 0x87. The runtime will prefer the VTID if present
  @VTID(36)
  boolean autoText();


  /**
   * <p>
   * Setter method for the COM property "AutoText"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(135) //= 0x87. The runtime will prefer the VTID if present
  @VTID(37)
  void autoText(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "NumberFormat"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(193) //= 0xc1. The runtime will prefer the VTID if present
  @VTID(38)
  java.lang.String numberFormat();


  /**
   * <p>
   * Setter method for the COM property "NumberFormat"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(193) //= 0xc1. The runtime will prefer the VTID if present
  @VTID(39)
  void numberFormat(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "NumberFormatLinked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(194) //= 0xc2. The runtime will prefer the VTID if present
  @VTID(40)
  boolean numberFormatLinked();


  /**
   * <p>
   * Setter method for the COM property "NumberFormatLinked"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(194) //= 0xc2. The runtime will prefer the VTID if present
  @VTID(41)
  void numberFormatLinked(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "NumberFormatLocal"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1097) //= 0x449. The runtime will prefer the VTID if present
  @VTID(42)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object numberFormatLocal();


  /**
   * <p>
   * Setter method for the COM property "NumberFormatLocal"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1097) //= 0x449. The runtime will prefer the VTID if present
  @VTID(43)
  void numberFormatLocal(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowLegendKey"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(171) //= 0xab. The runtime will prefer the VTID if present
  @VTID(44)
  boolean showLegendKey();


  /**
   * <p>
   * Setter method for the COM property "ShowLegendKey"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(171) //= 0xab. The runtime will prefer the VTID if present
  @VTID(45)
  void showLegendKey(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(46)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(47)
  void type(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   * @return  Returns a value of type ppt.XlDataLabelPosition
   */

  @DISPID(133) //= 0x85. The runtime will prefer the VTID if present
  @VTID(48)
  ppt.XlDataLabelPosition position();


  /**
   * <p>
   * Setter method for the COM property "Position"
   * </p>
   * @param rhs Mandatory ppt.XlDataLabelPosition parameter.
   */

  @DISPID(133) //= 0x85. The runtime will prefer the VTID if present
  @VTID(49)
  void position(
    ppt.XlDataLabelPosition rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowSeriesName"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2022) //= 0x7e6. The runtime will prefer the VTID if present
  @VTID(50)
  boolean showSeriesName();


  /**
   * <p>
   * Setter method for the COM property "ShowSeriesName"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2022) //= 0x7e6. The runtime will prefer the VTID if present
  @VTID(51)
  void showSeriesName(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowCategoryName"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2023) //= 0x7e7. The runtime will prefer the VTID if present
  @VTID(52)
  boolean showCategoryName();


  /**
   * <p>
   * Setter method for the COM property "ShowCategoryName"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2023) //= 0x7e7. The runtime will prefer the VTID if present
  @VTID(53)
  void showCategoryName(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowValue"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2024) //= 0x7e8. The runtime will prefer the VTID if present
  @VTID(54)
  boolean showValue();


  /**
   * <p>
   * Setter method for the COM property "ShowValue"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2024) //= 0x7e8. The runtime will prefer the VTID if present
  @VTID(55)
  void showValue(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowPercentage"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2025) //= 0x7e9. The runtime will prefer the VTID if present
  @VTID(56)
  boolean showPercentage();


  /**
   * <p>
   * Setter method for the COM property "ShowPercentage"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2025) //= 0x7e9. The runtime will prefer the VTID if present
  @VTID(57)
  void showPercentage(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowBubbleSize"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2026) //= 0x7ea. The runtime will prefer the VTID if present
  @VTID(58)
  boolean showBubbleSize();


  /**
   * <p>
   * Setter method for the COM property "ShowBubbleSize"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2026) //= 0x7ea. The runtime will prefer the VTID if present
  @VTID(59)
  void showBubbleSize(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Separator"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2027) //= 0x7eb. The runtime will prefer the VTID if present
  @VTID(60)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object separator();


  /**
   * <p>
   * Setter method for the COM property "Separator"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2027) //= 0x7eb. The runtime will prefer the VTID if present
  @VTID(61)
  void separator(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type ppt.ChartFormat
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(62)
  ppt.ChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(63)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(64)
  ppt._Application application();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(65)
  double height();


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(66)
  double width();


  /**
   * <p>
   * Setter method for the COM property "Formula"
   * </p>
   * @param pbstr Mandatory java.lang.String parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(67)
  void formula(
    java.lang.String pbstr);


  /**
   * <p>
   * Getter method for the COM property "Formula"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(68)
  java.lang.String formula();


  /**
   * <p>
   * Setter method for the COM property "FormulaR1C1"
   * </p>
   * @param pbstr Mandatory java.lang.String parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(69)
  void formulaR1C1(
    java.lang.String pbstr);


  /**
   * <p>
   * Getter method for the COM property "FormulaR1C1"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(70)
  java.lang.String formulaR1C1();


  /**
   * <p>
   * Setter method for the COM property "FormulaLocal"
   * </p>
   * @param pbstr Mandatory java.lang.String parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(71)
  void formulaLocal(
    java.lang.String pbstr);


  /**
   * <p>
   * Getter method for the COM property "FormulaLocal"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(72)
  java.lang.String formulaLocal();


  /**
   * <p>
   * Setter method for the COM property "FormulaR1C1Local"
   * </p>
   * @param pbstr Mandatory java.lang.String parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(73)
  void formulaR1C1Local(
    java.lang.String pbstr);


  /**
   * <p>
   * Getter method for the COM property "FormulaR1C1Local"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(74)
  java.lang.String formulaR1C1Local();


  // Properties:
}
