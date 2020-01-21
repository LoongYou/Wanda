package word  ;

import com4j.*;

@IID("{B3A1E8C6-E1CE-4A46-8D12-E017157B03D7}")
public interface Legend extends Com4jObject {
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
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type word.ChartFont
   */

  @DISPID(146) //= 0x92. The runtime will prefer the VTID if present
  @VTID(12)
  word.ChartFont font();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(173) //= 0xad. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject legendEntries(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   * @return  Returns a value of type word.XlLegendPosition
   */

  @DISPID(133) //= 0x85. The runtime will prefer the VTID if present
  @VTID(14)
  word.XlLegendPosition position();


  /**
   * <p>
   * Setter method for the COM property "Position"
   * </p>
   * @param prop Mandatory word.XlLegendPosition parameter.
   */

  @DISPID(133) //= 0x85. The runtime will prefer the VTID if present
  @VTID(15)
  void position(
    word.XlLegendPosition prop);


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(16)
  boolean shadow();


  /**
   * <p>
   * Setter method for the COM property "Shadow"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(17)
  void shadow(
    boolean prop);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clear();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(19)
  double height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param prop Mandatory double parameter.
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(20)
  void height(
    double prop);


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type word.Interior
   */

  @DISPID(129) //= 0x81. The runtime will prefer the VTID if present
  @VTID(21)
  word.Interior interior();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type word.ChartFillFormat
   */

  @DISPID(1663) //= 0x67f. The runtime will prefer the VTID if present
  @VTID(22)
  word.ChartFillFormat fill();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(23)
  double left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param prop Mandatory double parameter.
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(24)
  void left(
    double prop);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(25)
  double top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param prop Mandatory double parameter.
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(26)
  void top(
    double prop);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(27)
  double width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param prop Mandatory double parameter.
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(28)
  void width(
    double prop);


  /**
   * <p>
   * Getter method for the COM property "AutoScaleFont"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1525) //= 0x5f5. The runtime will prefer the VTID if present
  @VTID(29)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object autoScaleFont();


  /**
   * <p>
   * Setter method for the COM property "AutoScaleFont"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(1525) //= 0x5f5. The runtime will prefer the VTID if present
  @VTID(30)
  void autoScaleFont(
    @MarshalAs(NativeType.VARIANT) java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "IncludeInLayout"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2418) //= 0x972. The runtime will prefer the VTID if present
  @VTID(31)
  boolean includeInLayout();


  /**
   * <p>
   * Setter method for the COM property "IncludeInLayout"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(2418) //= 0x972. The runtime will prefer the VTID if present
  @VTID(32)
  void includeInLayout(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type word.ChartFormat
   */

  @DISPID(1610743834) //= 0x6002001a. The runtime will prefer the VTID if present
  @VTID(33)
  word.ChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(34)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(35)
  int creator();


  // Properties:
}
