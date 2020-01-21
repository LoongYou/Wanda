package word  ;

import com4j.*;

@IID("{DF076FDE-8781-4051-A5BC-99F6B7DC04D4}")
public interface LegendKey extends Com4jObject {
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

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object delete();


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type word.Interior
   */

  @DISPID(129) //= 0x81. The runtime will prefer the VTID if present
  @VTID(11)
  word.Interior interior();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type word.ChartFillFormat
   */

  @DISPID(1663) //= 0x67f. The runtime will prefer the VTID if present
  @VTID(12)
  word.ChartFillFormat fill();


  /**
   * <p>
   * Getter method for the COM property "InvertIfNegative"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(132) //= 0x84. The runtime will prefer the VTID if present
  @VTID(13)
  boolean invertIfNegative();


  /**
   * <p>
   * Setter method for the COM property "InvertIfNegative"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(132) //= 0x84. The runtime will prefer the VTID if present
  @VTID(14)
  void invertIfNegative(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MarkerBackgroundColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(73) //= 0x49. The runtime will prefer the VTID if present
  @VTID(15)
  int markerBackgroundColor();


  /**
   * <p>
   * Setter method for the COM property "MarkerBackgroundColor"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(73) //= 0x49. The runtime will prefer the VTID if present
  @VTID(16)
  void markerBackgroundColor(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "MarkerBackgroundColorIndex"
   * </p>
   * @return  Returns a value of type word.XlColorIndex
   */

  @DISPID(74) //= 0x4a. The runtime will prefer the VTID if present
  @VTID(17)
  word.XlColorIndex markerBackgroundColorIndex();


  /**
   * <p>
   * Setter method for the COM property "MarkerBackgroundColorIndex"
   * </p>
   * @param prop Mandatory word.XlColorIndex parameter.
   */

  @DISPID(74) //= 0x4a. The runtime will prefer the VTID if present
  @VTID(18)
  void markerBackgroundColorIndex(
    word.XlColorIndex prop);


  /**
   * <p>
   * Getter method for the COM property "MarkerForegroundColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(75) //= 0x4b. The runtime will prefer the VTID if present
  @VTID(19)
  int markerForegroundColor();


  /**
   * <p>
   * Setter method for the COM property "MarkerForegroundColor"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(75) //= 0x4b. The runtime will prefer the VTID if present
  @VTID(20)
  void markerForegroundColor(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "MarkerForegroundColorIndex"
   * </p>
   * @return  Returns a value of type word.XlColorIndex
   */

  @DISPID(76) //= 0x4c. The runtime will prefer the VTID if present
  @VTID(21)
  word.XlColorIndex markerForegroundColorIndex();


  /**
   * <p>
   * Setter method for the COM property "MarkerForegroundColorIndex"
   * </p>
   * @param prop Mandatory word.XlColorIndex parameter.
   */

  @DISPID(76) //= 0x4c. The runtime will prefer the VTID if present
  @VTID(22)
  void markerForegroundColorIndex(
    word.XlColorIndex prop);


  /**
   * <p>
   * Getter method for the COM property "MarkerSize"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(231) //= 0xe7. The runtime will prefer the VTID if present
  @VTID(23)
  int markerSize();


  /**
   * <p>
   * Setter method for the COM property "MarkerSize"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(231) //= 0xe7. The runtime will prefer the VTID if present
  @VTID(24)
  void markerSize(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "MarkerStyle"
   * </p>
   * @return  Returns a value of type word.XlMarkerStyle
   */

  @DISPID(72) //= 0x48. The runtime will prefer the VTID if present
  @VTID(25)
  word.XlMarkerStyle markerStyle();


  /**
   * <p>
   * Setter method for the COM property "MarkerStyle"
   * </p>
   * @param prop Mandatory word.XlMarkerStyle parameter.
   */

  @DISPID(72) //= 0x48. The runtime will prefer the VTID if present
  @VTID(26)
  void markerStyle(
    word.XlMarkerStyle prop);


  /**
   * <p>
   * Getter method for the COM property "PictureType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(161) //= 0xa1. The runtime will prefer the VTID if present
  @VTID(27)
  int pictureType();


  /**
   * <p>
   * Setter method for the COM property "PictureType"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(161) //= 0xa1. The runtime will prefer the VTID if present
  @VTID(28)
  void pictureType(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "PictureUnit"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(162) //= 0xa2. The runtime will prefer the VTID if present
  @VTID(29)
  double pictureUnit();


  /**
   * <p>
   * Setter method for the COM property "PictureUnit"
   * </p>
   * @param prop Mandatory double parameter.
   */

  @DISPID(162) //= 0xa2. The runtime will prefer the VTID if present
  @VTID(30)
  void pictureUnit(
    double prop);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(235) //= 0xeb. The runtime will prefer the VTID if present
  @VTID(31)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "Smooth"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(163) //= 0xa3. The runtime will prefer the VTID if present
  @VTID(32)
  boolean smooth();


  /**
   * <p>
   * Setter method for the COM property "Smooth"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(163) //= 0xa3. The runtime will prefer the VTID if present
  @VTID(33)
  void smooth(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(34)
  double left();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(35)
  double top();


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(36)
  double width();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(37)
  double height();


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(38)
  boolean shadow();


  /**
   * <p>
   * Setter method for the COM property "Shadow"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(39)
  void shadow(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type word.ChartFormat
   */

  @DISPID(1610743841) //= 0x60020021. The runtime will prefer the VTID if present
  @VTID(40)
  word.ChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(41)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(42)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "PictureUnit2"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2649) //= 0xa59. The runtime will prefer the VTID if present
  @VTID(43)
  double pictureUnit2();


  /**
   * <p>
   * Setter method for the COM property "PictureUnit2"
   * </p>
   * @param prop Mandatory double parameter.
   */

  @DISPID(2649) //= 0xa59. The runtime will prefer the VTID if present
  @VTID(44)
  void pictureUnit2(
    double prop);


  // Properties:
}
