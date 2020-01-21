package word  ;

import com4j.*;

@IID("{D8252C5E-EB9F-4D74-AA72-C178B128FAC4}")
public interface DataLabels extends Com4jObject,Iterable<Com4jObject> {
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
   * @return  Returns a value of type word.ChartBorder
   */

  @DISPID(128) //= 0x80. The runtime will prefer the VTID if present
  @VTID(10)
  word.ChartBorder border();


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
   * @return  Returns a value of type word.Interior
   */

  @DISPID(129) //= 0x81. The runtime will prefer the VTID if present
  @VTID(12)
  word.Interior interior();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type word.ChartFillFormat
   */

  @DISPID(1663) //= 0x67f. The runtime will prefer the VTID if present
  @VTID(13)
  word.ChartFillFormat fill();


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type word.ChartFont
   */

  @DISPID(146) //= 0x92. The runtime will prefer the VTID if present
  @VTID(14)
  word.ChartFont font();


  /**
   * <p>
   * Getter method for the COM property "HorizontalAlignment"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(136) //= 0x88. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object horizontalAlignment();


  /**
   * <p>
   * Setter method for the COM property "HorizontalAlignment"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(136) //= 0x88. The runtime will prefer the VTID if present
  @VTID(16)
  void horizontalAlignment(
    @MarshalAs(NativeType.VARIANT) java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(134) //= 0x86. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(134) //= 0x86. The runtime will prefer the VTID if present
  @VTID(18)
  void orientation(
    @MarshalAs(NativeType.VARIANT) java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(19)
  boolean shadow();


  /**
   * <p>
   * Setter method for the COM property "Shadow"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(20)
  void shadow(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "VerticalAlignment"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(137) //= 0x89. The runtime will prefer the VTID if present
  @VTID(21)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object verticalAlignment();


  /**
   * <p>
   * Setter method for the COM property "VerticalAlignment"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(137) //= 0x89. The runtime will prefer the VTID if present
  @VTID(22)
  void verticalAlignment(
    @MarshalAs(NativeType.VARIANT) java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "ReadingOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(975) //= 0x3cf. The runtime will prefer the VTID if present
  @VTID(23)
  int readingOrder();


  /**
   * <p>
   * Setter method for the COM property "ReadingOrder"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(975) //= 0x3cf. The runtime will prefer the VTID if present
  @VTID(24)
  void readingOrder(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "AutoScaleFont"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1525) //= 0x5f5. The runtime will prefer the VTID if present
  @VTID(25)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object autoScaleFont();


  /**
   * <p>
   * Setter method for the COM property "AutoScaleFont"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(1525) //= 0x5f5. The runtime will prefer the VTID if present
  @VTID(26)
  void autoScaleFont(
    @MarshalAs(NativeType.VARIANT) java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "AutoText"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(135) //= 0x87. The runtime will prefer the VTID if present
  @VTID(27)
  boolean autoText();


  /**
   * <p>
   * Setter method for the COM property "AutoText"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(135) //= 0x87. The runtime will prefer the VTID if present
  @VTID(28)
  void autoText(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "NumberFormat"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(193) //= 0xc1. The runtime will prefer the VTID if present
  @VTID(29)
  java.lang.String numberFormat();


  /**
   * <p>
   * Setter method for the COM property "NumberFormat"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(193) //= 0xc1. The runtime will prefer the VTID if present
  @VTID(30)
  void numberFormat(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "NumberFormatLinked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(194) //= 0xc2. The runtime will prefer the VTID if present
  @VTID(31)
  boolean numberFormatLinked();


  /**
   * <p>
   * Setter method for the COM property "NumberFormatLinked"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(194) //= 0xc2. The runtime will prefer the VTID if present
  @VTID(32)
  void numberFormatLinked(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "NumberFormatLocal"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1097) //= 0x449. The runtime will prefer the VTID if present
  @VTID(33)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object numberFormatLocal();


  /**
   * <p>
   * Setter method for the COM property "NumberFormatLocal"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(1097) //= 0x449. The runtime will prefer the VTID if present
  @VTID(34)
  void numberFormatLocal(
    @MarshalAs(NativeType.VARIANT) java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "ShowLegendKey"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(171) //= 0xab. The runtime will prefer the VTID if present
  @VTID(35)
  boolean showLegendKey();


  /**
   * <p>
   * Setter method for the COM property "ShowLegendKey"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(171) //= 0xab. The runtime will prefer the VTID if present
  @VTID(36)
  void showLegendKey(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(37)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(38)
  void type(
    @MarshalAs(NativeType.VARIANT) java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   * @return  Returns a value of type word.XlDataLabelPosition
   */

  @DISPID(133) //= 0x85. The runtime will prefer the VTID if present
  @VTID(39)
  word.XlDataLabelPosition position();


  /**
   * <p>
   * Setter method for the COM property "Position"
   * </p>
   * @param prop Mandatory word.XlDataLabelPosition parameter.
   */

  @DISPID(133) //= 0x85. The runtime will prefer the VTID if present
  @VTID(40)
  void position(
    word.XlDataLabelPosition prop);


  /**
   * <p>
   * Getter method for the COM property "ShowSeriesName"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2022) //= 0x7e6. The runtime will prefer the VTID if present
  @VTID(41)
  boolean showSeriesName();


  /**
   * <p>
   * Setter method for the COM property "ShowSeriesName"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(2022) //= 0x7e6. The runtime will prefer the VTID if present
  @VTID(42)
  void showSeriesName(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowCategoryName"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2023) //= 0x7e7. The runtime will prefer the VTID if present
  @VTID(43)
  boolean showCategoryName();


  /**
   * <p>
   * Setter method for the COM property "ShowCategoryName"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(2023) //= 0x7e7. The runtime will prefer the VTID if present
  @VTID(44)
  void showCategoryName(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowValue"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2024) //= 0x7e8. The runtime will prefer the VTID if present
  @VTID(45)
  boolean showValue();


  /**
   * <p>
   * Setter method for the COM property "ShowValue"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(2024) //= 0x7e8. The runtime will prefer the VTID if present
  @VTID(46)
  void showValue(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowPercentage"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2025) //= 0x7e9. The runtime will prefer the VTID if present
  @VTID(47)
  boolean showPercentage();


  /**
   * <p>
   * Setter method for the COM property "ShowPercentage"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(2025) //= 0x7e9. The runtime will prefer the VTID if present
  @VTID(48)
  void showPercentage(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowBubbleSize"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2026) //= 0x7ea. The runtime will prefer the VTID if present
  @VTID(49)
  boolean showBubbleSize();


  /**
   * <p>
   * Setter method for the COM property "ShowBubbleSize"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(2026) //= 0x7ea. The runtime will prefer the VTID if present
  @VTID(50)
  void showBubbleSize(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Separator"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2027) //= 0x7eb. The runtime will prefer the VTID if present
  @VTID(51)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object separator();


  /**
   * <p>
   * Setter method for the COM property "Separator"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(2027) //= 0x7eb. The runtime will prefer the VTID if present
  @VTID(52)
  void separator(
    @MarshalAs(NativeType.VARIANT) java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(53)
  int count();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type word.DataLabel
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(54)
  @DefaultMethod
  word.DataLabel item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(55)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type word.ChartFormat
   */

  @DISPID(1610743858) //= 0x60020032. The runtime will prefer the VTID if present
  @VTID(56)
  word.ChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(57)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(58)
  int creator();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type word.DataLabel
   */

  @DISPID(1610743861) //= 0x60020035. The runtime will prefer the VTID if present
  @VTID(59)
  word.DataLabel _Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  // Properties:
}
