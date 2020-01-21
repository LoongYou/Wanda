package word  ;

import com4j.*;

@IID("{000209B0-0000-0000-C000-000000000046}")
public interface Find extends Com4jObject {
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
   * Getter method for the COM property "Forward"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(10)
  boolean forward();


  /**
   * <p>
   * Setter method for the COM property "Forward"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(11)
  void forward(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type word._Font
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(12)
  word._Font font();


  /**
   * <p>
   * Setter method for the COM property "Font"
   * </p>
   * @param prop Mandatory word._Font parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(13)
  void font(
    word._Font prop);


  /**
   * <p>
   * Getter method for the COM property "Found"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(14)
  boolean found();


  /**
   * <p>
   * Getter method for the COM property "MatchAllWordForms"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(15)
  boolean matchAllWordForms();


  /**
   * <p>
   * Setter method for the COM property "MatchAllWordForms"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(16)
  void matchAllWordForms(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchCase"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(17)
  boolean matchCase();


  /**
   * <p>
   * Setter method for the COM property "MatchCase"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(18)
  void matchCase(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchWildcards"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(19)
  boolean matchWildcards();


  /**
   * <p>
   * Setter method for the COM property "MatchWildcards"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(20)
  void matchWildcards(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchSoundsLike"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(21)
  boolean matchSoundsLike();


  /**
   * <p>
   * Setter method for the COM property "MatchSoundsLike"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(22)
  void matchSoundsLike(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchWholeWord"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(23)
  boolean matchWholeWord();


  /**
   * <p>
   * Setter method for the COM property "MatchWholeWord"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(24)
  void matchWholeWord(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchFuzzy"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(25)
  boolean matchFuzzy();


  /**
   * <p>
   * Setter method for the COM property "MatchFuzzy"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(26)
  void matchFuzzy(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchByte"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
  @VTID(27)
  boolean matchByte();


  /**
   * <p>
   * Setter method for the COM property "MatchByte"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
  @VTID(28)
  void matchByte(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ParagraphFormat"
   * </p>
   * @return  Returns a value of type word._ParagraphFormat
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(29)
  word._ParagraphFormat paragraphFormat();


  /**
   * <p>
   * Setter method for the COM property "ParagraphFormat"
   * </p>
   * @param prop Mandatory word._ParagraphFormat parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(30)
  void paragraphFormat(
    word._ParagraphFormat prop);


  /**
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(31)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object style();


  /**
   * <p>
   * Setter method for the COM property "Style"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(32)
  void style(
    java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String text();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(34)
  void text(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "LanguageID"
   * </p>
   * @return  Returns a value of type word.WdLanguageID
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(35)
  word.WdLanguageID languageID();


  /**
   * <p>
   * Setter method for the COM property "LanguageID"
   * </p>
   * @param prop Mandatory word.WdLanguageID parameter.
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(36)
  void languageID(
    word.WdLanguageID prop);


  /**
   * <p>
   * Getter method for the COM property "Highlight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(37)
  int highlight();


  /**
   * <p>
   * Setter method for the COM property "Highlight"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(38)
  void highlight(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Replacement"
   * </p>
   * @return  Returns a value of type word.Replacement
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(39)
  word.Replacement replacement();


  /**
   * <p>
   * Getter method for the COM property "Frame"
   * </p>
   * @return  Returns a value of type word.Frame
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(40)
  word.Frame frame();


  /**
   * <p>
   * Getter method for the COM property "Wrap"
   * </p>
   * @return  Returns a value of type word.WdFindWrap
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(41)
  word.WdFindWrap wrap();


  /**
   * <p>
   * Setter method for the COM property "Wrap"
   * </p>
   * @param prop Mandatory word.WdFindWrap parameter.
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(42)
  void wrap(
    word.WdFindWrap prop);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(43)
  boolean format();


  /**
   * <p>
   * Setter method for the COM property "Format"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(44)
  void format(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "LanguageIDFarEast"
   * </p>
   * @return  Returns a value of type word.WdLanguageID
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(45)
  word.WdLanguageID languageIDFarEast();


  /**
   * <p>
   * Setter method for the COM property "LanguageIDFarEast"
   * </p>
   * @param prop Mandatory word.WdLanguageID parameter.
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(46)
  void languageIDFarEast(
    word.WdLanguageID prop);


  /**
   * <p>
   * Getter method for the COM property "LanguageIDOther"
   * </p>
   * @return  Returns a value of type word.WdLanguageID
   */

  @DISPID(60) //= 0x3c. The runtime will prefer the VTID if present
  @VTID(47)
  word.WdLanguageID languageIDOther();


  /**
   * <p>
   * Setter method for the COM property "LanguageIDOther"
   * </p>
   * @param prop Mandatory word.WdLanguageID parameter.
   */

  @DISPID(60) //= 0x3c. The runtime will prefer the VTID if present
  @VTID(48)
  void languageIDOther(
    word.WdLanguageID prop);


  /**
   * <p>
   * Getter method for the COM property "CorrectHangulEndings"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(61) //= 0x3d. The runtime will prefer the VTID if present
  @VTID(49)
  boolean correctHangulEndings();


  /**
   * <p>
   * Setter method for the COM property "CorrectHangulEndings"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(61) //= 0x3d. The runtime will prefer the VTID if present
  @VTID(50)
  void correctHangulEndings(
    boolean prop);


  /**
   * @param findText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchCase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchWholeWord Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchWildcards Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchSoundsLike Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchAllWordForms Optional parameter. Default value is com4j.Variant.getMissing()
   * @param forward Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wrap Optional parameter. Default value is com4j.Variant.getMissing()
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @param replaceWith Optional parameter. Default value is com4j.Variant.getMissing()
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(51)
  boolean executeOld(
    @Optional java.lang.Object findText,
    @Optional java.lang.Object matchCase,
    @Optional java.lang.Object matchWholeWord,
    @Optional java.lang.Object matchWildcards,
    @Optional java.lang.Object matchSoundsLike,
    @Optional java.lang.Object matchAllWordForms,
    @Optional java.lang.Object forward,
    @Optional java.lang.Object wrap,
    @Optional java.lang.Object format,
    @Optional java.lang.Object replaceWith,
    @Optional java.lang.Object replace);


  /**
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(52)
  void clearFormatting();


  /**
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(53)
  void setAllFuzzyOptions();


  /**
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(54)
  void clearAllFuzzyOptions();


  /**
   * @param findText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchCase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchWholeWord Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchWildcards Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchSoundsLike Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchAllWordForms Optional parameter. Default value is com4j.Variant.getMissing()
   * @param forward Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wrap Optional parameter. Default value is com4j.Variant.getMissing()
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @param replaceWith Optional parameter. Default value is com4j.Variant.getMissing()
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchKashida Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchDiacritics Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchAlefHamza Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchControl Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(444) //= 0x1bc. The runtime will prefer the VTID if present
  @VTID(55)
  boolean execute(
    @Optional java.lang.Object findText,
    @Optional java.lang.Object matchCase,
    @Optional java.lang.Object matchWholeWord,
    @Optional java.lang.Object matchWildcards,
    @Optional java.lang.Object matchSoundsLike,
    @Optional java.lang.Object matchAllWordForms,
    @Optional java.lang.Object forward,
    @Optional java.lang.Object wrap,
    @Optional java.lang.Object format,
    @Optional java.lang.Object replaceWith,
    @Optional java.lang.Object replace,
    @Optional java.lang.Object matchKashida,
    @Optional java.lang.Object matchDiacritics,
    @Optional java.lang.Object matchAlefHamza,
    @Optional java.lang.Object matchControl);


  /**
   * <p>
   * Getter method for the COM property "NoProofing"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(56)
  int noProofing();


  /**
   * <p>
   * Setter method for the COM property "NoProofing"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(57)
  void noProofing(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "MatchKashida"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(58)
  boolean matchKashida();


  /**
   * <p>
   * Setter method for the COM property "MatchKashida"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(59)
  void matchKashida(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchDiacritics"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(60)
  boolean matchDiacritics();


  /**
   * <p>
   * Setter method for the COM property "MatchDiacritics"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(61)
  void matchDiacritics(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchAlefHamza"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(62)
  boolean matchAlefHamza();


  /**
   * <p>
   * Setter method for the COM property "MatchAlefHamza"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(63)
  void matchAlefHamza(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchControl"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(64)
  boolean matchControl();


  /**
   * <p>
   * Setter method for the COM property "MatchControl"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(65)
  void matchControl(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchPhrase"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(66)
  boolean matchPhrase();


  /**
   * <p>
   * Setter method for the COM property "MatchPhrase"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(67)
  void matchPhrase(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchPrefix"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(68)
  boolean matchPrefix();


  /**
   * <p>
   * Setter method for the COM property "MatchPrefix"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(69)
  void matchPrefix(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchSuffix"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(70)
  boolean matchSuffix();


  /**
   * <p>
   * Setter method for the COM property "MatchSuffix"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(71)
  void matchSuffix(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "IgnoreSpace"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(72)
  boolean ignoreSpace();


  /**
   * <p>
   * Setter method for the COM property "IgnoreSpace"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(73)
  void ignoreSpace(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "IgnorePunct"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(74)
  boolean ignorePunct();


  /**
   * <p>
   * Setter method for the COM property "IgnorePunct"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(75)
  void ignorePunct(
    boolean prop);


  /**
   * @param findText Mandatory java.lang.Object parameter.
   * @param highlightColor Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textColor Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchCase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchWholeWord Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchPrefix Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchSuffix Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchPhrase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchWildcards Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchSoundsLike Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchAllWordForms Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchByte Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchFuzzy Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchKashida Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchDiacritics Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchAlefHamza Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchControl Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreSpace Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignorePunct Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hanjaPhoneticHangul Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(445) //= 0x1bd. The runtime will prefer the VTID if present
  @VTID(76)
  boolean hitHighlight(
    java.lang.Object findText,
    @Optional java.lang.Object highlightColor,
    @Optional java.lang.Object textColor,
    @Optional java.lang.Object matchCase,
    @Optional java.lang.Object matchWholeWord,
    @Optional java.lang.Object matchPrefix,
    @Optional java.lang.Object matchSuffix,
    @Optional java.lang.Object matchPhrase,
    @Optional java.lang.Object matchWildcards,
    @Optional java.lang.Object matchSoundsLike,
    @Optional java.lang.Object matchAllWordForms,
    @Optional java.lang.Object matchByte,
    @Optional java.lang.Object matchFuzzy,
    @Optional java.lang.Object matchKashida,
    @Optional java.lang.Object matchDiacritics,
    @Optional java.lang.Object matchAlefHamza,
    @Optional java.lang.Object matchControl,
    @Optional java.lang.Object ignoreSpace,
    @Optional java.lang.Object ignorePunct,
    @Optional java.lang.Object hanjaPhoneticHangul);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(446) //= 0x1be. The runtime will prefer the VTID if present
  @VTID(77)
  boolean clearHitHighlight();


  /**
   * @param findText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchCase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchWholeWord Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchWildcards Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchSoundsLike Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchAllWordForms Optional parameter. Default value is com4j.Variant.getMissing()
   * @param forward Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wrap Optional parameter. Default value is com4j.Variant.getMissing()
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @param replaceWith Optional parameter. Default value is com4j.Variant.getMissing()
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchKashida Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchDiacritics Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchAlefHamza Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchControl Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchPrefix Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchSuffix Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchPhrase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreSpace Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignorePunct Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(447) //= 0x1bf. The runtime will prefer the VTID if present
  @VTID(78)
  boolean execute2007(
    @Optional java.lang.Object findText,
    @Optional java.lang.Object matchCase,
    @Optional java.lang.Object matchWholeWord,
    @Optional java.lang.Object matchWildcards,
    @Optional java.lang.Object matchSoundsLike,
    @Optional java.lang.Object matchAllWordForms,
    @Optional java.lang.Object forward,
    @Optional java.lang.Object wrap,
    @Optional java.lang.Object format,
    @Optional java.lang.Object replaceWith,
    @Optional java.lang.Object replace,
    @Optional java.lang.Object matchKashida,
    @Optional java.lang.Object matchDiacritics,
    @Optional java.lang.Object matchAlefHamza,
    @Optional java.lang.Object matchControl,
    @Optional java.lang.Object matchPrefix,
    @Optional java.lang.Object matchSuffix,
    @Optional java.lang.Object matchPhrase,
    @Optional java.lang.Object ignoreSpace,
    @Optional java.lang.Object ignorePunct);


  /**
   * <p>
   * Getter method for the COM property "HanjaPhoneticHangul"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(79)
  boolean hanjaPhoneticHangul();


  /**
   * <p>
   * Setter method for the COM property "HanjaPhoneticHangul"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(80)
  void hanjaPhoneticHangul(
    boolean prop);


  // Properties:
}
