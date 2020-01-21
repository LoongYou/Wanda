package word  ;

import com4j.*;

@IID("{00020953-0000-0000-C000-000000000046}")
public interface _ParagraphFormat extends Com4jObject {
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
   * @return  Returns a value of type word._ParagraphFormat
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(10)
  word._ParagraphFormat duplicate();


  /**
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object style();


  /**
   * <p>
   * Setter method for the COM property "Style"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(12)
  void style(
    java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "Alignment"
   * </p>
   * @return  Returns a value of type word.WdParagraphAlignment
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(13)
  word.WdParagraphAlignment alignment();


  /**
   * <p>
   * Setter method for the COM property "Alignment"
   * </p>
   * @param prop Mandatory word.WdParagraphAlignment parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(14)
  void alignment(
    word.WdParagraphAlignment prop);


  /**
   * <p>
   * Getter method for the COM property "KeepTogether"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(15)
  int keepTogether();


  /**
   * <p>
   * Setter method for the COM property "KeepTogether"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(16)
  void keepTogether(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "KeepWithNext"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(17)
  int keepWithNext();


  /**
   * <p>
   * Setter method for the COM property "KeepWithNext"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(18)
  void keepWithNext(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "PageBreakBefore"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(19)
  int pageBreakBefore();


  /**
   * <p>
   * Setter method for the COM property "PageBreakBefore"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(20)
  void pageBreakBefore(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "NoLineNumber"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(21)
  int noLineNumber();


  /**
   * <p>
   * Setter method for the COM property "NoLineNumber"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(22)
  void noLineNumber(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "RightIndent"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(23)
  float rightIndent();


  /**
   * <p>
   * Setter method for the COM property "RightIndent"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(24)
  void rightIndent(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "LeftIndent"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(25)
  float leftIndent();


  /**
   * <p>
   * Setter method for the COM property "LeftIndent"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(26)
  void leftIndent(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "FirstLineIndent"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(27)
  float firstLineIndent();


  /**
   * <p>
   * Setter method for the COM property "FirstLineIndent"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(28)
  void firstLineIndent(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "LineSpacing"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(29)
  float lineSpacing();


  /**
   * <p>
   * Setter method for the COM property "LineSpacing"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(30)
  void lineSpacing(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "LineSpacingRule"
   * </p>
   * @return  Returns a value of type word.WdLineSpacing
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(31)
  word.WdLineSpacing lineSpacingRule();


  /**
   * <p>
   * Setter method for the COM property "LineSpacingRule"
   * </p>
   * @param prop Mandatory word.WdLineSpacing parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(32)
  void lineSpacingRule(
    word.WdLineSpacing prop);


  /**
   * <p>
   * Getter method for the COM property "SpaceBefore"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(33)
  float spaceBefore();


  /**
   * <p>
   * Setter method for the COM property "SpaceBefore"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(34)
  void spaceBefore(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "SpaceAfter"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(35)
  float spaceAfter();


  /**
   * <p>
   * Setter method for the COM property "SpaceAfter"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(36)
  void spaceAfter(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Hyphenation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(37)
  int hyphenation();


  /**
   * <p>
   * Setter method for the COM property "Hyphenation"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(38)
  void hyphenation(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "WidowControl"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(39)
  int widowControl();


  /**
   * <p>
   * Setter method for the COM property "WidowControl"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(40)
  void widowControl(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "FarEastLineBreakControl"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(41)
  int farEastLineBreakControl();


  /**
   * <p>
   * Setter method for the COM property "FarEastLineBreakControl"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(42)
  void farEastLineBreakControl(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "WordWrap"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(43)
  int wordWrap();


  /**
   * <p>
   * Setter method for the COM property "WordWrap"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(44)
  void wordWrap(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "HangingPunctuation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(45)
  int hangingPunctuation();


  /**
   * <p>
   * Setter method for the COM property "HangingPunctuation"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(46)
  void hangingPunctuation(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "HalfWidthPunctuationOnTopOfLine"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(47)
  int halfWidthPunctuationOnTopOfLine();


  /**
   * <p>
   * Setter method for the COM property "HalfWidthPunctuationOnTopOfLine"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(48)
  void halfWidthPunctuationOnTopOfLine(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "AddSpaceBetweenFarEastAndAlpha"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(49)
  int addSpaceBetweenFarEastAndAlpha();


  /**
   * <p>
   * Setter method for the COM property "AddSpaceBetweenFarEastAndAlpha"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(50)
  void addSpaceBetweenFarEastAndAlpha(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "AddSpaceBetweenFarEastAndDigit"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(51)
  int addSpaceBetweenFarEastAndDigit();


  /**
   * <p>
   * Setter method for the COM property "AddSpaceBetweenFarEastAndDigit"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(52)
  void addSpaceBetweenFarEastAndDigit(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "BaseLineAlignment"
   * </p>
   * @return  Returns a value of type word.WdBaselineAlignment
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(53)
  word.WdBaselineAlignment baseLineAlignment();


  /**
   * <p>
   * Setter method for the COM property "BaseLineAlignment"
   * </p>
   * @param prop Mandatory word.WdBaselineAlignment parameter.
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(54)
  void baseLineAlignment(
    word.WdBaselineAlignment prop);


  /**
   * <p>
   * Getter method for the COM property "AutoAdjustRightIndent"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(124) //= 0x7c. The runtime will prefer the VTID if present
  @VTID(55)
  int autoAdjustRightIndent();


  /**
   * <p>
   * Setter method for the COM property "AutoAdjustRightIndent"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(124) //= 0x7c. The runtime will prefer the VTID if present
  @VTID(56)
  void autoAdjustRightIndent(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "DisableLineHeightGrid"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(125) //= 0x7d. The runtime will prefer the VTID if present
  @VTID(57)
  int disableLineHeightGrid();


  /**
   * <p>
   * Setter method for the COM property "DisableLineHeightGrid"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(125) //= 0x7d. The runtime will prefer the VTID if present
  @VTID(58)
  void disableLineHeightGrid(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "TabStops"
   * </p>
   * @return  Returns a value of type word.TabStops
   */

  @DISPID(1103) //= 0x44f. The runtime will prefer the VTID if present
  @VTID(59)
  word.TabStops tabStops();


  @VTID(59)
  @ReturnValue(defaultPropertyThrough={word.TabStops.class})
  word.TabStop tabStops(
    java.lang.Object index);

  /**
   * <p>
   * Setter method for the COM property "TabStops"
   * </p>
   * @param prop Mandatory word.TabStops parameter.
   */

  @DISPID(1103) //= 0x44f. The runtime will prefer the VTID if present
  @VTID(60)
  void tabStops(
    word.TabStops prop);


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type word.Borders
   */

  @DISPID(1100) //= 0x44c. The runtime will prefer the VTID if present
  @VTID(61)
  word.Borders borders();


  @VTID(61)
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
  @VTID(62)
  void borders(
    word.Borders prop);


  /**
   * <p>
   * Getter method for the COM property "Shading"
   * </p>
   * @return  Returns a value of type word.Shading
   */

  @DISPID(1101) //= 0x44d. The runtime will prefer the VTID if present
  @VTID(63)
  word.Shading shading();


  /**
   * <p>
   * Getter method for the COM property "OutlineLevel"
   * </p>
   * @return  Returns a value of type word.WdOutlineLevel
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(64)
  word.WdOutlineLevel outlineLevel();


  /**
   * <p>
   * Setter method for the COM property "OutlineLevel"
   * </p>
   * @param prop Mandatory word.WdOutlineLevel parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(65)
  void outlineLevel(
    word.WdOutlineLevel prop);


  /**
   */

  @DISPID(301) //= 0x12d. The runtime will prefer the VTID if present
  @VTID(66)
  void closeUp();


  /**
   */

  @DISPID(302) //= 0x12e. The runtime will prefer the VTID if present
  @VTID(67)
  void openUp();


  /**
   */

  @DISPID(303) //= 0x12f. The runtime will prefer the VTID if present
  @VTID(68)
  void openOrCloseUp();


  /**
   * @param count Mandatory short parameter.
   */

  @DISPID(304) //= 0x130. The runtime will prefer the VTID if present
  @VTID(69)
  void tabHangingIndent(
    short count);


  /**
   * @param count Mandatory short parameter.
   */

  @DISPID(306) //= 0x132. The runtime will prefer the VTID if present
  @VTID(70)
  void tabIndent(
    short count);


  /**
   */

  @DISPID(312) //= 0x138. The runtime will prefer the VTID if present
  @VTID(71)
  void reset();


  /**
   */

  @DISPID(313) //= 0x139. The runtime will prefer the VTID if present
  @VTID(72)
  void space1();


  /**
   */

  @DISPID(314) //= 0x13a. The runtime will prefer the VTID if present
  @VTID(73)
  void space15();


  /**
   */

  @DISPID(315) //= 0x13b. The runtime will prefer the VTID if present
  @VTID(74)
  void space2();


  /**
   * @param count Mandatory short parameter.
   */

  @DISPID(320) //= 0x140. The runtime will prefer the VTID if present
  @VTID(75)
  void indentCharWidth(
    short count);


  /**
   * @param count Mandatory short parameter.
   */

  @DISPID(322) //= 0x142. The runtime will prefer the VTID if present
  @VTID(76)
  void indentFirstLineCharWidth(
    short count);


  /**
   * <p>
   * Getter method for the COM property "CharacterUnitRightIndent"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(77)
  float characterUnitRightIndent();


  /**
   * <p>
   * Setter method for the COM property "CharacterUnitRightIndent"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(78)
  void characterUnitRightIndent(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "CharacterUnitLeftIndent"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(79)
  float characterUnitLeftIndent();


  /**
   * <p>
   * Setter method for the COM property "CharacterUnitLeftIndent"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(80)
  void characterUnitLeftIndent(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "CharacterUnitFirstLineIndent"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(128) //= 0x80. The runtime will prefer the VTID if present
  @VTID(81)
  float characterUnitFirstLineIndent();


  /**
   * <p>
   * Setter method for the COM property "CharacterUnitFirstLineIndent"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(128) //= 0x80. The runtime will prefer the VTID if present
  @VTID(82)
  void characterUnitFirstLineIndent(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "LineUnitBefore"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(129) //= 0x81. The runtime will prefer the VTID if present
  @VTID(83)
  float lineUnitBefore();


  /**
   * <p>
   * Setter method for the COM property "LineUnitBefore"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(129) //= 0x81. The runtime will prefer the VTID if present
  @VTID(84)
  void lineUnitBefore(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "LineUnitAfter"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(130) //= 0x82. The runtime will prefer the VTID if present
  @VTID(85)
  float lineUnitAfter();


  /**
   * <p>
   * Setter method for the COM property "LineUnitAfter"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(130) //= 0x82. The runtime will prefer the VTID if present
  @VTID(86)
  void lineUnitAfter(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "ReadingOrder"
   * </p>
   * @return  Returns a value of type word.WdReadingOrder
   */

  @DISPID(131) //= 0x83. The runtime will prefer the VTID if present
  @VTID(87)
  word.WdReadingOrder readingOrder();


  /**
   * <p>
   * Setter method for the COM property "ReadingOrder"
   * </p>
   * @param prop Mandatory word.WdReadingOrder parameter.
   */

  @DISPID(131) //= 0x83. The runtime will prefer the VTID if present
  @VTID(88)
  void readingOrder(
    word.WdReadingOrder prop);


  /**
   * <p>
   * Getter method for the COM property "SpaceBeforeAuto"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(132) //= 0x84. The runtime will prefer the VTID if present
  @VTID(89)
  int spaceBeforeAuto();


  /**
   * <p>
   * Setter method for the COM property "SpaceBeforeAuto"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(132) //= 0x84. The runtime will prefer the VTID if present
  @VTID(90)
  void spaceBeforeAuto(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "SpaceAfterAuto"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(133) //= 0x85. The runtime will prefer the VTID if present
  @VTID(91)
  int spaceAfterAuto();


  /**
   * <p>
   * Setter method for the COM property "SpaceAfterAuto"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(133) //= 0x85. The runtime will prefer the VTID if present
  @VTID(92)
  void spaceAfterAuto(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "MirrorIndents"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(134) //= 0x86. The runtime will prefer the VTID if present
  @VTID(93)
  int mirrorIndents();


  /**
   * <p>
   * Setter method for the COM property "MirrorIndents"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(134) //= 0x86. The runtime will prefer the VTID if present
  @VTID(94)
  void mirrorIndents(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "TextboxTightWrap"
   * </p>
   * @return  Returns a value of type word.WdTextboxTightWrap
   */

  @DISPID(135) //= 0x87. The runtime will prefer the VTID if present
  @VTID(95)
  word.WdTextboxTightWrap textboxTightWrap();


  /**
   * <p>
   * Setter method for the COM property "TextboxTightWrap"
   * </p>
   * @param prop Mandatory word.WdTextboxTightWrap parameter.
   */

  @DISPID(135) //= 0x87. The runtime will prefer the VTID if present
  @VTID(96)
  void textboxTightWrap(
    word.WdTextboxTightWrap prop);


  // Properties:
}
