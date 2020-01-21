package word  ;

import com4j.*;

@IID("{000209CF-0000-0000-C000-000000000046}")
public interface TextEffectFormat extends Com4jObject {
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
   * Getter method for the COM property "Alignment"
   * </p>
   * @return  Returns a value of type office.MsoTextEffectAlignment
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(10)
  office.MsoTextEffectAlignment alignment();


  /**
   * <p>
   * Setter method for the COM property "Alignment"
   * </p>
   * @param prop Mandatory office.MsoTextEffectAlignment parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(11)
  void alignment(
    office.MsoTextEffectAlignment prop);


  /**
   * <p>
   * Getter method for the COM property "FontBold"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(12)
  office.MsoTriState fontBold();


  /**
   * <p>
   * Setter method for the COM property "FontBold"
   * </p>
   * @param prop Mandatory office.MsoTriState parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(13)
  void fontBold(
    office.MsoTriState prop);


  /**
   * <p>
   * Getter method for the COM property "FontItalic"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(14)
  office.MsoTriState fontItalic();


  /**
   * <p>
   * Setter method for the COM property "FontItalic"
   * </p>
   * @param prop Mandatory office.MsoTriState parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(15)
  void fontItalic(
    office.MsoTriState prop);


  /**
   * <p>
   * Getter method for the COM property "FontName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String fontName();


  /**
   * <p>
   * Setter method for the COM property "FontName"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(17)
  void fontName(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "FontSize"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(18)
  float fontSize();


  /**
   * <p>
   * Setter method for the COM property "FontSize"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(19)
  void fontSize(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "KernedPairs"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(20)
  office.MsoTriState kernedPairs();


  /**
   * <p>
   * Setter method for the COM property "KernedPairs"
   * </p>
   * @param prop Mandatory office.MsoTriState parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(21)
  void kernedPairs(
    office.MsoTriState prop);


  /**
   * <p>
   * Getter method for the COM property "NormalizedHeight"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(22)
  office.MsoTriState normalizedHeight();


  /**
   * <p>
   * Setter method for the COM property "NormalizedHeight"
   * </p>
   * @param prop Mandatory office.MsoTriState parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(23)
  void normalizedHeight(
    office.MsoTriState prop);


  /**
   * <p>
   * Getter method for the COM property "PresetShape"
   * </p>
   * @return  Returns a value of type office.MsoPresetTextEffectShape
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(24)
  office.MsoPresetTextEffectShape presetShape();


  /**
   * <p>
   * Setter method for the COM property "PresetShape"
   * </p>
   * @param prop Mandatory office.MsoPresetTextEffectShape parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(25)
  void presetShape(
    office.MsoPresetTextEffectShape prop);


  /**
   * <p>
   * Getter method for the COM property "PresetTextEffect"
   * </p>
   * @return  Returns a value of type office.MsoPresetTextEffect
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(26)
  office.MsoPresetTextEffect presetTextEffect();


  /**
   * <p>
   * Setter method for the COM property "PresetTextEffect"
   * </p>
   * @param prop Mandatory office.MsoPresetTextEffect parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(27)
  void presetTextEffect(
    office.MsoPresetTextEffect prop);


  /**
   * <p>
   * Getter method for the COM property "RotatedChars"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(28)
  office.MsoTriState rotatedChars();


  /**
   * <p>
   * Setter method for the COM property "RotatedChars"
   * </p>
   * @param prop Mandatory office.MsoTriState parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(29)
  void rotatedChars(
    office.MsoTriState prop);


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(30)
  java.lang.String text();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(31)
  void text(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Tracking"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(32)
  float tracking();


  /**
   * <p>
   * Setter method for the COM property "Tracking"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(33)
  void tracking(
    float prop);


  /**
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(34)
  void toggleVerticalText();


  // Properties:
}
