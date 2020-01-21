package word  ;

import com4j.*;

@IID("{00020958-0000-0000-C000-000000000046}")
public interface Paragraphs extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(7)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  int count();


  /**
   * <p>
   * Getter method for the COM property "First"
   * </p>
   * @return  Returns a value of type word.Paragraph
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  word.Paragraph first();


  /**
   * <p>
   * Getter method for the COM property "Last"
   * </p>
   * @return  Returns a value of type word.Paragraph
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  word.Paragraph last();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(11)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(12)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type word._ParagraphFormat
   */

  @DISPID(1102) //= 0x44e. The runtime will prefer the VTID if present
  @VTID(14)
  word._ParagraphFormat format();


  /**
   * <p>
   * Setter method for the COM property "Format"
   * </p>
   * @param prop Mandatory word._ParagraphFormat parameter.
   */

  @DISPID(1102) //= 0x44e. The runtime will prefer the VTID if present
  @VTID(15)
  void format(
    word._ParagraphFormat prop);


  /**
   * <p>
   * Getter method for the COM property "TabStops"
   * </p>
   * @return  Returns a value of type word.TabStops
   */

  @DISPID(1103) //= 0x44f. The runtime will prefer the VTID if present
  @VTID(16)
  word.TabStops tabStops();


  @VTID(16)
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
  @VTID(17)
  void tabStops(
    word.TabStops prop);


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type word.Borders
   */

  @DISPID(1100) //= 0x44c. The runtime will prefer the VTID if present
  @VTID(18)
  word.Borders borders();


  @VTID(18)
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
  @VTID(19)
  void borders(
    word.Borders prop);


  /**
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(20)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object style();


  /**
   * <p>
   * Setter method for the COM property "Style"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(21)
  void style(
    java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "Alignment"
   * </p>
   * @return  Returns a value of type word.WdParagraphAlignment
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(22)
  word.WdParagraphAlignment alignment();


  /**
   * <p>
   * Setter method for the COM property "Alignment"
   * </p>
   * @param prop Mandatory word.WdParagraphAlignment parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(23)
  void alignment(
    word.WdParagraphAlignment prop);


  /**
   * <p>
   * Getter method for the COM property "KeepTogether"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(24)
  int keepTogether();


  /**
   * <p>
   * Setter method for the COM property "KeepTogether"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(25)
  void keepTogether(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "KeepWithNext"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(26)
  int keepWithNext();


  /**
   * <p>
   * Setter method for the COM property "KeepWithNext"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(27)
  void keepWithNext(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "PageBreakBefore"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(28)
  int pageBreakBefore();


  /**
   * <p>
   * Setter method for the COM property "PageBreakBefore"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(29)
  void pageBreakBefore(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "NoLineNumber"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(30)
  int noLineNumber();


  /**
   * <p>
   * Setter method for the COM property "NoLineNumber"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(31)
  void noLineNumber(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "RightIndent"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(32)
  float rightIndent();


  /**
   * <p>
   * Setter method for the COM property "RightIndent"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(33)
  void rightIndent(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "LeftIndent"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(34)
  float leftIndent();


  /**
   * <p>
   * Setter method for the COM property "LeftIndent"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(35)
  void leftIndent(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "FirstLineIndent"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(36)
  float firstLineIndent();


  /**
   * <p>
   * Setter method for the COM property "FirstLineIndent"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(37)
  void firstLineIndent(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "LineSpacing"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(38)
  float lineSpacing();


  /**
   * <p>
   * Setter method for the COM property "LineSpacing"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(39)
  void lineSpacing(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "LineSpacingRule"
   * </p>
   * @return  Returns a value of type word.WdLineSpacing
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(40)
  word.WdLineSpacing lineSpacingRule();


  /**
   * <p>
   * Setter method for the COM property "LineSpacingRule"
   * </p>
   * @param prop Mandatory word.WdLineSpacing parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(41)
  void lineSpacingRule(
    word.WdLineSpacing prop);


  /**
   * <p>
   * Getter method for the COM property "SpaceBefore"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(42)
  float spaceBefore();


  /**
   * <p>
   * Setter method for the COM property "SpaceBefore"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(43)
  void spaceBefore(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "SpaceAfter"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(44)
  float spaceAfter();


  /**
   * <p>
   * Setter method for the COM property "SpaceAfter"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(45)
  void spaceAfter(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Hyphenation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(46)
  int hyphenation();


  /**
   * <p>
   * Setter method for the COM property "Hyphenation"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(47)
  void hyphenation(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "WidowControl"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(48)
  int widowControl();


  /**
   * <p>
   * Setter method for the COM property "WidowControl"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(49)
  void widowControl(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Shading"
   * </p>
   * @return  Returns a value of type word.Shading
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(50)
  word.Shading shading();


  /**
   * <p>
   * Getter method for the COM property "FarEastLineBreakControl"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(51)
  int farEastLineBreakControl();


  /**
   * <p>
   * Setter method for the COM property "FarEastLineBreakControl"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(52)
  void farEastLineBreakControl(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "WordWrap"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(53)
  int wordWrap();


  /**
   * <p>
   * Setter method for the COM property "WordWrap"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(54)
  void wordWrap(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "HangingPunctuation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(55)
  int hangingPunctuation();


  /**
   * <p>
   * Setter method for the COM property "HangingPunctuation"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(56)
  void hangingPunctuation(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "HalfWidthPunctuationOnTopOfLine"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(57)
  int halfWidthPunctuationOnTopOfLine();


  /**
   * <p>
   * Setter method for the COM property "HalfWidthPunctuationOnTopOfLine"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(58)
  void halfWidthPunctuationOnTopOfLine(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "AddSpaceBetweenFarEastAndAlpha"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(59)
  int addSpaceBetweenFarEastAndAlpha();


  /**
   * <p>
   * Setter method for the COM property "AddSpaceBetweenFarEastAndAlpha"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(60)
  void addSpaceBetweenFarEastAndAlpha(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "AddSpaceBetweenFarEastAndDigit"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(61)
  int addSpaceBetweenFarEastAndDigit();


  /**
   * <p>
   * Setter method for the COM property "AddSpaceBetweenFarEastAndDigit"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(62)
  void addSpaceBetweenFarEastAndDigit(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "BaseLineAlignment"
   * </p>
   * @return  Returns a value of type word.WdBaselineAlignment
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(63)
  word.WdBaselineAlignment baseLineAlignment();


  /**
   * <p>
   * Setter method for the COM property "BaseLineAlignment"
   * </p>
   * @param prop Mandatory word.WdBaselineAlignment parameter.
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(64)
  void baseLineAlignment(
    word.WdBaselineAlignment prop);


  /**
   * <p>
   * Getter method for the COM property "AutoAdjustRightIndent"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(124) //= 0x7c. The runtime will prefer the VTID if present
  @VTID(65)
  int autoAdjustRightIndent();


  /**
   * <p>
   * Setter method for the COM property "AutoAdjustRightIndent"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(124) //= 0x7c. The runtime will prefer the VTID if present
  @VTID(66)
  void autoAdjustRightIndent(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "DisableLineHeightGrid"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(125) //= 0x7d. The runtime will prefer the VTID if present
  @VTID(67)
  int disableLineHeightGrid();


  /**
   * <p>
   * Setter method for the COM property "DisableLineHeightGrid"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(125) //= 0x7d. The runtime will prefer the VTID if present
  @VTID(68)
  void disableLineHeightGrid(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "OutlineLevel"
   * </p>
   * @return  Returns a value of type word.WdOutlineLevel
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(69)
  word.WdOutlineLevel outlineLevel();


  /**
   * <p>
   * Setter method for the COM property "OutlineLevel"
   * </p>
   * @param prop Mandatory word.WdOutlineLevel parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(70)
  void outlineLevel(
    word.WdOutlineLevel prop);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type word.Paragraph
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(71)
  @DefaultMethod
  word.Paragraph item(
    int index);


  /**
   * @param range Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Paragraph
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(72)
  word.Paragraph add(
    @Optional java.lang.Object range);


  /**
   */

  @DISPID(301) //= 0x12d. The runtime will prefer the VTID if present
  @VTID(73)
  void closeUp();


  /**
   */

  @DISPID(302) //= 0x12e. The runtime will prefer the VTID if present
  @VTID(74)
  void openUp();


  /**
   */

  @DISPID(303) //= 0x12f. The runtime will prefer the VTID if present
  @VTID(75)
  void openOrCloseUp();


  /**
   * @param count Mandatory short parameter.
   */

  @DISPID(304) //= 0x130. The runtime will prefer the VTID if present
  @VTID(76)
  void tabHangingIndent(
    short count);


  /**
   * @param count Mandatory short parameter.
   */

  @DISPID(306) //= 0x132. The runtime will prefer the VTID if present
  @VTID(77)
  void tabIndent(
    short count);


  /**
   */

  @DISPID(312) //= 0x138. The runtime will prefer the VTID if present
  @VTID(78)
  void reset();


  /**
   */

  @DISPID(313) //= 0x139. The runtime will prefer the VTID if present
  @VTID(79)
  void space1();


  /**
   */

  @DISPID(314) //= 0x13a. The runtime will prefer the VTID if present
  @VTID(80)
  void space15();


  /**
   */

  @DISPID(315) //= 0x13b. The runtime will prefer the VTID if present
  @VTID(81)
  void space2();


  /**
   * @param count Mandatory short parameter.
   */

  @DISPID(320) //= 0x140. The runtime will prefer the VTID if present
  @VTID(82)
  void indentCharWidth(
    short count);


  /**
   * @param count Mandatory short parameter.
   */

  @DISPID(322) //= 0x142. The runtime will prefer the VTID if present
  @VTID(83)
  void indentFirstLineCharWidth(
    short count);


  /**
   */

  @DISPID(324) //= 0x144. The runtime will prefer the VTID if present
  @VTID(84)
  void outlinePromote();


  /**
   */

  @DISPID(325) //= 0x145. The runtime will prefer the VTID if present
  @VTID(85)
  void outlineDemote();


  /**
   */

  @DISPID(326) //= 0x146. The runtime will prefer the VTID if present
  @VTID(86)
  void outlineDemoteToBody();


  /**
   */

  @DISPID(333) //= 0x14d. The runtime will prefer the VTID if present
  @VTID(87)
  void indent();


  /**
   */

  @DISPID(334) //= 0x14e. The runtime will prefer the VTID if present
  @VTID(88)
  void outdent();


  /**
   * <p>
   * Getter method for the COM property "CharacterUnitRightIndent"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(89)
  float characterUnitRightIndent();


  /**
   * <p>
   * Setter method for the COM property "CharacterUnitRightIndent"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(90)
  void characterUnitRightIndent(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "CharacterUnitLeftIndent"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(91)
  float characterUnitLeftIndent();


  /**
   * <p>
   * Setter method for the COM property "CharacterUnitLeftIndent"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(92)
  void characterUnitLeftIndent(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "CharacterUnitFirstLineIndent"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(128) //= 0x80. The runtime will prefer the VTID if present
  @VTID(93)
  float characterUnitFirstLineIndent();


  /**
   * <p>
   * Setter method for the COM property "CharacterUnitFirstLineIndent"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(128) //= 0x80. The runtime will prefer the VTID if present
  @VTID(94)
  void characterUnitFirstLineIndent(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "LineUnitBefore"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(129) //= 0x81. The runtime will prefer the VTID if present
  @VTID(95)
  float lineUnitBefore();


  /**
   * <p>
   * Setter method for the COM property "LineUnitBefore"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(129) //= 0x81. The runtime will prefer the VTID if present
  @VTID(96)
  void lineUnitBefore(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "LineUnitAfter"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(130) //= 0x82. The runtime will prefer the VTID if present
  @VTID(97)
  float lineUnitAfter();


  /**
   * <p>
   * Setter method for the COM property "LineUnitAfter"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(130) //= 0x82. The runtime will prefer the VTID if present
  @VTID(98)
  void lineUnitAfter(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "ReadingOrder"
   * </p>
   * @return  Returns a value of type word.WdReadingOrder
   */

  @DISPID(131) //= 0x83. The runtime will prefer the VTID if present
  @VTID(99)
  word.WdReadingOrder readingOrder();


  /**
   * <p>
   * Setter method for the COM property "ReadingOrder"
   * </p>
   * @param prop Mandatory word.WdReadingOrder parameter.
   */

  @DISPID(131) //= 0x83. The runtime will prefer the VTID if present
  @VTID(100)
  void readingOrder(
    word.WdReadingOrder prop);


  /**
   * <p>
   * Getter method for the COM property "SpaceBeforeAuto"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(132) //= 0x84. The runtime will prefer the VTID if present
  @VTID(101)
  int spaceBeforeAuto();


  /**
   * <p>
   * Setter method for the COM property "SpaceBeforeAuto"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(132) //= 0x84. The runtime will prefer the VTID if present
  @VTID(102)
  void spaceBeforeAuto(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "SpaceAfterAuto"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(133) //= 0x85. The runtime will prefer the VTID if present
  @VTID(103)
  int spaceAfterAuto();


  /**
   * <p>
   * Setter method for the COM property "SpaceAfterAuto"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(133) //= 0x85. The runtime will prefer the VTID if present
  @VTID(104)
  void spaceAfterAuto(
    int prop);


  /**
   */

  @DISPID(335) //= 0x14f. The runtime will prefer the VTID if present
  @VTID(105)
  void increaseSpacing();


  /**
   */

  @DISPID(336) //= 0x150. The runtime will prefer the VTID if present
  @VTID(106)
  void decreaseSpacing();


  // Properties:
}
