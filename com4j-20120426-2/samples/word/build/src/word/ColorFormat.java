package word  ;

import com4j.*;

@IID("{000209C6-0000-0000-C000-000000000046}")
public interface ColorFormat extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "RGB"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  int rgb();


  /**
   * <p>
   * Setter method for the COM property "RGB"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  void rgb(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "SchemeColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(12)
  int schemeColor();


  /**
   * <p>
   * Setter method for the COM property "SchemeColor"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(13)
  void schemeColor(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type office.MsoColorType
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(14)
  office.MsoColorType type();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(16)
  void name(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "TintAndShade"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(17)
  float tintAndShade();


  /**
   * <p>
   * Setter method for the COM property "TintAndShade"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(18)
  void tintAndShade(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "OverPrint"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(19)
  office.MsoTriState overPrint();


  /**
   * <p>
   * Setter method for the COM property "OverPrint"
   * </p>
   * @param prop Mandatory office.MsoTriState parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(20)
  void overPrint(
    office.MsoTriState prop);


  /**
   * <p>
   * Getter method for the COM property "Ink"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type float
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(21)
  float ink(
    int index);


  /**
   * <p>
   * Setter method for the COM property "Ink"
   * </p>
   * @param index Mandatory int parameter.
   * @param prop Mandatory float parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(22)
  void ink(
    int index,
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Cyan"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(23)
  int cyan();


  /**
   * <p>
   * Setter method for the COM property "Cyan"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(24)
  void cyan(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Magenta"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(25)
  int magenta();


  /**
   * <p>
   * Setter method for the COM property "Magenta"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(26)
  void magenta(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Yellow"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(27)
  int yellow();


  /**
   * <p>
   * Setter method for the COM property "Yellow"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(28)
  void yellow(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Black"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(29)
  int black();


  /**
   * <p>
   * Setter method for the COM property "Black"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(30)
  void black(
    int prop);


  /**
   * @param cyan Mandatory int parameter.
   * @param magenta Mandatory int parameter.
   * @param yellow Mandatory int parameter.
   * @param black Mandatory int parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(31)
  void setCMYK(
    int cyan,
    int magenta,
    int yellow,
    int black);


  /**
   * <p>
   * Getter method for the COM property "ObjectThemeColor"
   * </p>
   * @return  Returns a value of type word.WdThemeColorIndex
   */

  @DISPID(200) //= 0xc8. The runtime will prefer the VTID if present
  @VTID(32)
  word.WdThemeColorIndex objectThemeColor();


  /**
   * <p>
   * Setter method for the COM property "ObjectThemeColor"
   * </p>
   * @param prop Mandatory word.WdThemeColorIndex parameter.
   */

  @DISPID(200) //= 0xc8. The runtime will prefer the VTID if present
  @VTID(33)
  void objectThemeColor(
    word.WdThemeColorIndex prop);


  /**
   * <p>
   * Getter method for the COM property "Brightness"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(34)
  float brightness();


  /**
   * <p>
   * Setter method for the COM property "Brightness"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(35)
  void brightness(
    float prop);


  // Properties:
}
