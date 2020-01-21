package office  ;

import com4j.*;

@IID("{000C031F-0000-0000-C000-000000000046}")
public interface TextEffectFormat extends office._IMsoDispObj {
  // Methods:
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
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(10)
  void toggleVerticalText();


  /**
   * <p>
   * Getter method for the COM property "Alignment"
   * </p>
   * @return  Returns a value of type office.MsoTextEffectAlignment
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(11)
  office.MsoTextEffectAlignment alignment();


  /**
   * <p>
   * Setter method for the COM property "Alignment"
   * </p>
   * @param alignment Mandatory office.MsoTextEffectAlignment parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(12)
  void alignment(
    office.MsoTextEffectAlignment alignment);


  /**
   * <p>
   * Getter method for the COM property "FontBold"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(13)
  office.MsoTriState fontBold();


  /**
   * <p>
   * Setter method for the COM property "FontBold"
   * </p>
   * @param fontBold Mandatory office.MsoTriState parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(14)
  void fontBold(
    office.MsoTriState fontBold);


  /**
   * <p>
   * Getter method for the COM property "FontItalic"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(15)
  office.MsoTriState fontItalic();


  /**
   * <p>
   * Setter method for the COM property "FontItalic"
   * </p>
   * @param fontItalic Mandatory office.MsoTriState parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(16)
  void fontItalic(
    office.MsoTriState fontItalic);


  /**
   * <p>
   * Getter method for the COM property "FontName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String fontName();


  /**
   * <p>
   * Setter method for the COM property "FontName"
   * </p>
   * @param fontName Mandatory java.lang.String parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(18)
  void fontName(
    java.lang.String fontName);


  /**
   * <p>
   * Getter method for the COM property "FontSize"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(19)
  float fontSize();


  /**
   * <p>
   * Setter method for the COM property "FontSize"
   * </p>
   * @param fontSize Mandatory float parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(20)
  void fontSize(
    float fontSize);


  /**
   * <p>
   * Getter method for the COM property "KernedPairs"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(21)
  office.MsoTriState kernedPairs();


  /**
   * <p>
   * Setter method for the COM property "KernedPairs"
   * </p>
   * @param kernedPairs Mandatory office.MsoTriState parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(22)
  void kernedPairs(
    office.MsoTriState kernedPairs);


  /**
   * <p>
   * Getter method for the COM property "NormalizedHeight"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(23)
  office.MsoTriState normalizedHeight();


  /**
   * <p>
   * Setter method for the COM property "NormalizedHeight"
   * </p>
   * @param normalizedHeight Mandatory office.MsoTriState parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(24)
  void normalizedHeight(
    office.MsoTriState normalizedHeight);


  /**
   * <p>
   * Getter method for the COM property "PresetShape"
   * </p>
   * @return  Returns a value of type office.MsoPresetTextEffectShape
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(25)
  office.MsoPresetTextEffectShape presetShape();


  /**
   * <p>
   * Setter method for the COM property "PresetShape"
   * </p>
   * @param presetShape Mandatory office.MsoPresetTextEffectShape parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(26)
  void presetShape(
    office.MsoPresetTextEffectShape presetShape);


  /**
   * <p>
   * Getter method for the COM property "PresetTextEffect"
   * </p>
   * @return  Returns a value of type office.MsoPresetTextEffect
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(27)
  office.MsoPresetTextEffect presetTextEffect();


  /**
   * <p>
   * Setter method for the COM property "PresetTextEffect"
   * </p>
   * @param preset Mandatory office.MsoPresetTextEffect parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(28)
  void presetTextEffect(
    office.MsoPresetTextEffect preset);


  /**
   * <p>
   * Getter method for the COM property "RotatedChars"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(29)
  office.MsoTriState rotatedChars();


  /**
   * <p>
   * Setter method for the COM property "RotatedChars"
   * </p>
   * @param rotatedChars Mandatory office.MsoTriState parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(30)
  void rotatedChars(
    office.MsoTriState rotatedChars);


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(31)
  java.lang.String text();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param text Mandatory java.lang.String parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(32)
  void text(
    java.lang.String text);


  /**
   * <p>
   * Getter method for the COM property "Tracking"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(33)
  float tracking();


  /**
   * <p>
   * Setter method for the COM property "Tracking"
   * </p>
   * @param tracking Mandatory float parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(34)
  void tracking(
    float tracking);


  // Properties:
}
