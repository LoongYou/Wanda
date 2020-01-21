package word  ;

import com4j.*;

@IID("{00020952-0000-0000-C000-000000000046}")
public interface _Font extends Com4jObject {
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

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Duplicate"
   * </p>
   * @return  Returns a value of type word._Font
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(10)
  word._Font duplicate();


  /**
   * <p>
   * Getter method for the COM property "Bold"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(130) //= 0x82. The runtime will prefer the VTID if present
  @VTID(11)
  int bold();


  /**
   * <p>
   * Setter method for the COM property "Bold"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(130) //= 0x82. The runtime will prefer the VTID if present
  @VTID(12)
  void bold(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Italic"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(131) //= 0x83. The runtime will prefer the VTID if present
  @VTID(13)
  int italic();


  /**
   * <p>
   * Setter method for the COM property "Italic"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(131) //= 0x83. The runtime will prefer the VTID if present
  @VTID(14)
  void italic(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Hidden"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(132) //= 0x84. The runtime will prefer the VTID if present
  @VTID(15)
  int hidden();


  /**
   * <p>
   * Setter method for the COM property "Hidden"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(132) //= 0x84. The runtime will prefer the VTID if present
  @VTID(16)
  void hidden(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "SmallCaps"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(133) //= 0x85. The runtime will prefer the VTID if present
  @VTID(17)
  int smallCaps();


  /**
   * <p>
   * Setter method for the COM property "SmallCaps"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(133) //= 0x85. The runtime will prefer the VTID if present
  @VTID(18)
  void smallCaps(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "AllCaps"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(134) //= 0x86. The runtime will prefer the VTID if present
  @VTID(19)
  int allCaps();


  /**
   * <p>
   * Setter method for the COM property "AllCaps"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(134) //= 0x86. The runtime will prefer the VTID if present
  @VTID(20)
  void allCaps(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "StrikeThrough"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(135) //= 0x87. The runtime will prefer the VTID if present
  @VTID(21)
  int strikeThrough();


  /**
   * <p>
   * Setter method for the COM property "StrikeThrough"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(135) //= 0x87. The runtime will prefer the VTID if present
  @VTID(22)
  void strikeThrough(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "DoubleStrikeThrough"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(136) //= 0x88. The runtime will prefer the VTID if present
  @VTID(23)
  int doubleStrikeThrough();


  /**
   * <p>
   * Setter method for the COM property "DoubleStrikeThrough"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(136) //= 0x88. The runtime will prefer the VTID if present
  @VTID(24)
  void doubleStrikeThrough(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "ColorIndex"
   * </p>
   * @return  Returns a value of type word.WdColorIndex
   */

  @DISPID(137) //= 0x89. The runtime will prefer the VTID if present
  @VTID(25)
  word.WdColorIndex colorIndex();


  /**
   * <p>
   * Setter method for the COM property "ColorIndex"
   * </p>
   * @param prop Mandatory word.WdColorIndex parameter.
   */

  @DISPID(137) //= 0x89. The runtime will prefer the VTID if present
  @VTID(26)
  void colorIndex(
    word.WdColorIndex prop);


  /**
   * <p>
   * Getter method for the COM property "Subscript"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(138) //= 0x8a. The runtime will prefer the VTID if present
  @VTID(27)
  int subscript();


  /**
   * <p>
   * Setter method for the COM property "Subscript"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(138) //= 0x8a. The runtime will prefer the VTID if present
  @VTID(28)
  void subscript(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Superscript"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(139) //= 0x8b. The runtime will prefer the VTID if present
  @VTID(29)
  int superscript();


  /**
   * <p>
   * Setter method for the COM property "Superscript"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(139) //= 0x8b. The runtime will prefer the VTID if present
  @VTID(30)
  void superscript(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Underline"
   * </p>
   * @return  Returns a value of type word.WdUnderline
   */

  @DISPID(140) //= 0x8c. The runtime will prefer the VTID if present
  @VTID(31)
  word.WdUnderline underline();


  /**
   * <p>
   * Setter method for the COM property "Underline"
   * </p>
   * @param prop Mandatory word.WdUnderline parameter.
   */

  @DISPID(140) //= 0x8c. The runtime will prefer the VTID if present
  @VTID(32)
  void underline(
    word.WdUnderline prop);


  /**
   * <p>
   * Getter method for the COM property "Size"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(141) //= 0x8d. The runtime will prefer the VTID if present
  @VTID(33)
  float size();


  /**
   * <p>
   * Setter method for the COM property "Size"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(141) //= 0x8d. The runtime will prefer the VTID if present
  @VTID(34)
  void size(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(142) //= 0x8e. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(142) //= 0x8e. The runtime will prefer the VTID if present
  @VTID(36)
  void name(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(143) //= 0x8f. The runtime will prefer the VTID if present
  @VTID(37)
  int position();


  /**
   * <p>
   * Setter method for the COM property "Position"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(143) //= 0x8f. The runtime will prefer the VTID if present
  @VTID(38)
  void position(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Spacing"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(144) //= 0x90. The runtime will prefer the VTID if present
  @VTID(39)
  float spacing();


  /**
   * <p>
   * Setter method for the COM property "Spacing"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(144) //= 0x90. The runtime will prefer the VTID if present
  @VTID(40)
  void spacing(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Scaling"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(145) //= 0x91. The runtime will prefer the VTID if present
  @VTID(41)
  int scaling();


  /**
   * <p>
   * Setter method for the COM property "Scaling"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(145) //= 0x91. The runtime will prefer the VTID if present
  @VTID(42)
  void scaling(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(146) //= 0x92. The runtime will prefer the VTID if present
  @VTID(43)
  int shadow();


  /**
   * <p>
   * Setter method for the COM property "Shadow"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(146) //= 0x92. The runtime will prefer the VTID if present
  @VTID(44)
  void shadow(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Outline"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(147) //= 0x93. The runtime will prefer the VTID if present
  @VTID(45)
  int outline();


  /**
   * <p>
   * Setter method for the COM property "Outline"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(147) //= 0x93. The runtime will prefer the VTID if present
  @VTID(46)
  void outline(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Emboss"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(47)
  int emboss();


  /**
   * <p>
   * Setter method for the COM property "Emboss"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(48)
  void emboss(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Kerning"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(49)
  float kerning();


  /**
   * <p>
   * Setter method for the COM property "Kerning"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(50)
  void kerning(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Engrave"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(51)
  int engrave();


  /**
   * <p>
   * Setter method for the COM property "Engrave"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(52)
  void engrave(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Animation"
   * </p>
   * @return  Returns a value of type word.WdAnimation
   */

  @DISPID(151) //= 0x97. The runtime will prefer the VTID if present
  @VTID(53)
  word.WdAnimation animation();


  /**
   * <p>
   * Setter method for the COM property "Animation"
   * </p>
   * @param prop Mandatory word.WdAnimation parameter.
   */

  @DISPID(151) //= 0x97. The runtime will prefer the VTID if present
  @VTID(54)
  void animation(
    word.WdAnimation prop);


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type word.Borders
   */

  @DISPID(1100) //= 0x44c. The runtime will prefer the VTID if present
  @VTID(55)
  word.Borders borders();


  @VTID(55)
  @ReturnValue(defaultPropertyThrough={word.Borders.class})
  word.Border borders(
    word.WdBorderType index);

  /**
   * <p>
   * Setter method for the COM property "Borders"
   * </p>
   * @param prop Mandatory word.Borders parameter.
   */

  @DISPID(1100) //= 0x44c. The runtime will prefer the VTID if present
  @VTID(56)
  void borders(
    word.Borders prop);


  /**
   * <p>
   * Getter method for the COM property "Shading"
   * </p>
   * @return  Returns a value of type word.Shading
   */

  @DISPID(153) //= 0x99. The runtime will prefer the VTID if present
  @VTID(57)
  word.Shading shading();


  /**
   * <p>
   * Getter method for the COM property "EmphasisMark"
   * </p>
   * @return  Returns a value of type word.WdEmphasisMark
   */

  @DISPID(154) //= 0x9a. The runtime will prefer the VTID if present
  @VTID(58)
  word.WdEmphasisMark emphasisMark();


  /**
   * <p>
   * Setter method for the COM property "EmphasisMark"
   * </p>
   * @param prop Mandatory word.WdEmphasisMark parameter.
   */

  @DISPID(154) //= 0x9a. The runtime will prefer the VTID if present
  @VTID(59)
  void emphasisMark(
    word.WdEmphasisMark prop);


  /**
   * <p>
   * Getter method for the COM property "DisableCharacterSpaceGrid"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(155) //= 0x9b. The runtime will prefer the VTID if present
  @VTID(60)
  boolean disableCharacterSpaceGrid();


  /**
   * <p>
   * Setter method for the COM property "DisableCharacterSpaceGrid"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(155) //= 0x9b. The runtime will prefer the VTID if present
  @VTID(61)
  void disableCharacterSpaceGrid(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "NameFarEast"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(156) //= 0x9c. The runtime will prefer the VTID if present
  @VTID(62)
  java.lang.String nameFarEast();


  /**
   * <p>
   * Setter method for the COM property "NameFarEast"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(156) //= 0x9c. The runtime will prefer the VTID if present
  @VTID(63)
  void nameFarEast(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "NameAscii"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(157) //= 0x9d. The runtime will prefer the VTID if present
  @VTID(64)
  java.lang.String nameAscii();


  /**
   * <p>
   * Setter method for the COM property "NameAscii"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(157) //= 0x9d. The runtime will prefer the VTID if present
  @VTID(65)
  void nameAscii(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "NameOther"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(158) //= 0x9e. The runtime will prefer the VTID if present
  @VTID(66)
  java.lang.String nameOther();


  /**
   * <p>
   * Setter method for the COM property "NameOther"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(158) //= 0x9e. The runtime will prefer the VTID if present
  @VTID(67)
  void nameOther(
    java.lang.String prop);


  /**
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(68)
  void grow();


  /**
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(69)
  void shrink();


  /**
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(70)
  void reset();


  /**
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(71)
  void setAsTemplateDefault();


  /**
   * <p>
   * Getter method for the COM property "Color"
   * </p>
   * @return  Returns a value of type word.WdColor
   */

  @DISPID(159) //= 0x9f. The runtime will prefer the VTID if present
  @VTID(72)
  word.WdColor color();


  /**
   * <p>
   * Setter method for the COM property "Color"
   * </p>
   * @param prop Mandatory word.WdColor parameter.
   */

  @DISPID(159) //= 0x9f. The runtime will prefer the VTID if present
  @VTID(73)
  void color(
    word.WdColor prop);


  /**
   * <p>
   * Getter method for the COM property "BoldBi"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(160) //= 0xa0. The runtime will prefer the VTID if present
  @VTID(74)
  int boldBi();


  /**
   * <p>
   * Setter method for the COM property "BoldBi"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(160) //= 0xa0. The runtime will prefer the VTID if present
  @VTID(75)
  void boldBi(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "ItalicBi"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(161) //= 0xa1. The runtime will prefer the VTID if present
  @VTID(76)
  int italicBi();


  /**
   * <p>
   * Setter method for the COM property "ItalicBi"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(161) //= 0xa1. The runtime will prefer the VTID if present
  @VTID(77)
  void italicBi(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "SizeBi"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(162) //= 0xa2. The runtime will prefer the VTID if present
  @VTID(78)
  float sizeBi();


  /**
   * <p>
   * Setter method for the COM property "SizeBi"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(162) //= 0xa2. The runtime will prefer the VTID if present
  @VTID(79)
  void sizeBi(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "NameBi"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(163) //= 0xa3. The runtime will prefer the VTID if present
  @VTID(80)
  java.lang.String nameBi();


  /**
   * <p>
   * Setter method for the COM property "NameBi"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(163) //= 0xa3. The runtime will prefer the VTID if present
  @VTID(81)
  void nameBi(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "ColorIndexBi"
   * </p>
   * @return  Returns a value of type word.WdColorIndex
   */

  @DISPID(164) //= 0xa4. The runtime will prefer the VTID if present
  @VTID(82)
  word.WdColorIndex colorIndexBi();


  /**
   * <p>
   * Setter method for the COM property "ColorIndexBi"
   * </p>
   * @param prop Mandatory word.WdColorIndex parameter.
   */

  @DISPID(164) //= 0xa4. The runtime will prefer the VTID if present
  @VTID(83)
  void colorIndexBi(
    word.WdColorIndex prop);


  /**
   * <p>
   * Getter method for the COM property "DiacriticColor"
   * </p>
   * @return  Returns a value of type word.WdColor
   */

  @DISPID(165) //= 0xa5. The runtime will prefer the VTID if present
  @VTID(84)
  word.WdColor diacriticColor();


  /**
   * <p>
   * Setter method for the COM property "DiacriticColor"
   * </p>
   * @param prop Mandatory word.WdColor parameter.
   */

  @DISPID(165) //= 0xa5. The runtime will prefer the VTID if present
  @VTID(85)
  void diacriticColor(
    word.WdColor prop);


  /**
   * <p>
   * Getter method for the COM property "UnderlineColor"
   * </p>
   * @return  Returns a value of type word.WdColor
   */

  @DISPID(166) //= 0xa6. The runtime will prefer the VTID if present
  @VTID(86)
  word.WdColor underlineColor();


  /**
   * <p>
   * Setter method for the COM property "UnderlineColor"
   * </p>
   * @param prop Mandatory word.WdColor parameter.
   */

  @DISPID(166) //= 0xa6. The runtime will prefer the VTID if present
  @VTID(87)
  void underlineColor(
    word.WdColor prop);


  /**
   * <p>
   * Getter method for the COM property "Glow"
   * </p>
   * @return  Returns a value of type word.GlowFormat
   */

  @DISPID(167) //= 0xa7. The runtime will prefer the VTID if present
  @VTID(88)
  word.GlowFormat glow();


  /**
   * <p>
   * Setter method for the COM property "Glow"
   * </p>
   * @param prop Mandatory word.GlowFormat parameter.
   */

  @DISPID(167) //= 0xa7. The runtime will prefer the VTID if present
  @VTID(89)
  void glow(
    word.GlowFormat prop);


  /**
   * <p>
   * Getter method for the COM property "Reflection"
   * </p>
   * @return  Returns a value of type word.ReflectionFormat
   */

  @DISPID(168) //= 0xa8. The runtime will prefer the VTID if present
  @VTID(90)
  word.ReflectionFormat reflection();


  /**
   * <p>
   * Setter method for the COM property "Reflection"
   * </p>
   * @param prop Mandatory word.ReflectionFormat parameter.
   */

  @DISPID(168) //= 0xa8. The runtime will prefer the VTID if present
  @VTID(91)
  void reflection(
    word.ReflectionFormat prop);


  /**
   * <p>
   * Getter method for the COM property "TextShadow"
   * </p>
   * @return  Returns a value of type word.ShadowFormat
   */

  @DISPID(169) //= 0xa9. The runtime will prefer the VTID if present
  @VTID(92)
  word.ShadowFormat textShadow();


  /**
   * <p>
   * Setter method for the COM property "TextShadow"
   * </p>
   * @param prop Mandatory word.ShadowFormat parameter.
   */

  @DISPID(169) //= 0xa9. The runtime will prefer the VTID if present
  @VTID(93)
  void textShadow(
    word.ShadowFormat prop);


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type word.FillFormat
   */

  @DISPID(170) //= 0xaa. The runtime will prefer the VTID if present
  @VTID(94)
  word.FillFormat fill();


  /**
   * <p>
   * Setter method for the COM property "Fill"
   * </p>
   * @param prop Mandatory word.FillFormat parameter.
   */

  @DISPID(170) //= 0xaa. The runtime will prefer the VTID if present
  @VTID(95)
  void fill(
    word.FillFormat prop);


  /**
   * <p>
   * Getter method for the COM property "Line"
   * </p>
   * @return  Returns a value of type word.LineFormat
   */

  @DISPID(171) //= 0xab. The runtime will prefer the VTID if present
  @VTID(96)
  word.LineFormat line();


  /**
   * <p>
   * Setter method for the COM property "Line"
   * </p>
   * @param prop Mandatory word.LineFormat parameter.
   */

  @DISPID(171) //= 0xab. The runtime will prefer the VTID if present
  @VTID(97)
  void line(
    word.LineFormat prop);


  /**
   * <p>
   * Getter method for the COM property "ThreeD"
   * </p>
   * @return  Returns a value of type word.ThreeDFormat
   */

  @DISPID(172) //= 0xac. The runtime will prefer the VTID if present
  @VTID(98)
  word.ThreeDFormat threeD();


  /**
   * <p>
   * Setter method for the COM property "ThreeD"
   * </p>
   * @param prop Mandatory word.ThreeDFormat parameter.
   */

  @DISPID(172) //= 0xac. The runtime will prefer the VTID if present
  @VTID(99)
  void threeD(
    word.ThreeDFormat prop);


  /**
   * <p>
   * Getter method for the COM property "TextColor"
   * </p>
   * @return  Returns a value of type word.ColorFormat
   */

  @DISPID(173) //= 0xad. The runtime will prefer the VTID if present
  @VTID(100)
  word.ColorFormat textColor();


  /**
   * <p>
   * Getter method for the COM property "Ligatures"
   * </p>
   * @return  Returns a value of type word.WdLigatures
   */

  @DISPID(174) //= 0xae. The runtime will prefer the VTID if present
  @VTID(101)
  word.WdLigatures ligatures();


  /**
   * <p>
   * Setter method for the COM property "Ligatures"
   * </p>
   * @param prop Mandatory word.WdLigatures parameter.
   */

  @DISPID(174) //= 0xae. The runtime will prefer the VTID if present
  @VTID(102)
  void ligatures(
    word.WdLigatures prop);


  /**
   * <p>
   * Getter method for the COM property "NumberForm"
   * </p>
   * @return  Returns a value of type word.WdNumberForm
   */

  @DISPID(175) //= 0xaf. The runtime will prefer the VTID if present
  @VTID(103)
  word.WdNumberForm numberForm();


  /**
   * <p>
   * Setter method for the COM property "NumberForm"
   * </p>
   * @param prop Mandatory word.WdNumberForm parameter.
   */

  @DISPID(175) //= 0xaf. The runtime will prefer the VTID if present
  @VTID(104)
  void numberForm(
    word.WdNumberForm prop);


  /**
   * <p>
   * Getter method for the COM property "NumberSpacing"
   * </p>
   * @return  Returns a value of type word.WdNumberSpacing
   */

  @DISPID(176) //= 0xb0. The runtime will prefer the VTID if present
  @VTID(105)
  word.WdNumberSpacing numberSpacing();


  /**
   * <p>
   * Setter method for the COM property "NumberSpacing"
   * </p>
   * @param prop Mandatory word.WdNumberSpacing parameter.
   */

  @DISPID(176) //= 0xb0. The runtime will prefer the VTID if present
  @VTID(106)
  void numberSpacing(
    word.WdNumberSpacing prop);


  /**
   * <p>
   * Getter method for the COM property "ContextualAlternates"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(177) //= 0xb1. The runtime will prefer the VTID if present
  @VTID(107)
  int contextualAlternates();


  /**
   * <p>
   * Setter method for the COM property "ContextualAlternates"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(177) //= 0xb1. The runtime will prefer the VTID if present
  @VTID(108)
  void contextualAlternates(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "StylisticSet"
   * </p>
   * @return  Returns a value of type word.WdStylisticSet
   */

  @DISPID(178) //= 0xb2. The runtime will prefer the VTID if present
  @VTID(109)
  word.WdStylisticSet stylisticSet();


  /**
   * <p>
   * Setter method for the COM property "StylisticSet"
   * </p>
   * @param prop Mandatory word.WdStylisticSet parameter.
   */

  @DISPID(178) //= 0xb2. The runtime will prefer the VTID if present
  @VTID(110)
  void stylisticSet(
    word.WdStylisticSet prop);


  // Properties:
}
