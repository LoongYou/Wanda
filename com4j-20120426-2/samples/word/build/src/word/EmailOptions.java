package word  ;

import com4j.*;

@IID("{000209DB-0000-0000-C000-000000000046}")
public interface EmailOptions extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(7)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "UseThemeStyle"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(10)
  boolean useThemeStyle();


  /**
   * <p>
   * Setter method for the COM property "UseThemeStyle"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(11)
  void useThemeStyle(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MarkCommentsWith"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String markCommentsWith();


  /**
   * <p>
   * Setter method for the COM property "MarkCommentsWith"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(13)
  void markCommentsWith(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "MarkComments"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(14)
  boolean markComments();


  /**
   * <p>
   * Setter method for the COM property "MarkComments"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(15)
  void markComments(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "EmailSignature"
   * </p>
   * @return  Returns a value of type word.EmailSignature
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(16)
  word.EmailSignature emailSignature();


  /**
   * <p>
   * Getter method for the COM property "ComposeStyle"
   * </p>
   * @return  Returns a value of type word.Style
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(17)
  word.Style composeStyle();


  /**
   * <p>
   * Getter method for the COM property "ReplyStyle"
   * </p>
   * @return  Returns a value of type word.Style
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(18)
  word.Style replyStyle();


  /**
   * <p>
   * Getter method for the COM property "ThemeName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String themeName();


  /**
   * <p>
   * Setter method for the COM property "ThemeName"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(20)
  void themeName(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Dummy1"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(21)
  boolean dummy1();


  /**
   * <p>
   * Getter method for the COM property "Dummy2"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(22)
  boolean dummy2();


  /**
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(23)
  void dummy3();


  /**
   * <p>
   * Getter method for the COM property "NewColorOnReply"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(24)
  boolean newColorOnReply();


  /**
   * <p>
   * Setter method for the COM property "NewColorOnReply"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(25)
  void newColorOnReply(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PlainTextStyle"
   * </p>
   * @return  Returns a value of type word.Style
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(26)
  word.Style plainTextStyle();


  /**
   * <p>
   * Getter method for the COM property "UseThemeStyleOnReply"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(27)
  boolean useThemeStyleOnReply();


  /**
   * <p>
   * Setter method for the COM property "UseThemeStyleOnReply"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(28)
  void useThemeStyleOnReply(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeApplyHeadings"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(260) //= 0x104. The runtime will prefer the VTID if present
  @VTID(29)
  boolean autoFormatAsYouTypeApplyHeadings();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeApplyHeadings"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(260) //= 0x104. The runtime will prefer the VTID if present
  @VTID(30)
  void autoFormatAsYouTypeApplyHeadings(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeApplyBorders"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(261) //= 0x105. The runtime will prefer the VTID if present
  @VTID(31)
  boolean autoFormatAsYouTypeApplyBorders();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeApplyBorders"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(261) //= 0x105. The runtime will prefer the VTID if present
  @VTID(32)
  void autoFormatAsYouTypeApplyBorders(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeApplyBulletedLists"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(262) //= 0x106. The runtime will prefer the VTID if present
  @VTID(33)
  boolean autoFormatAsYouTypeApplyBulletedLists();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeApplyBulletedLists"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(262) //= 0x106. The runtime will prefer the VTID if present
  @VTID(34)
  void autoFormatAsYouTypeApplyBulletedLists(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeApplyNumberedLists"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(263) //= 0x107. The runtime will prefer the VTID if present
  @VTID(35)
  boolean autoFormatAsYouTypeApplyNumberedLists();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeApplyNumberedLists"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(263) //= 0x107. The runtime will prefer the VTID if present
  @VTID(36)
  void autoFormatAsYouTypeApplyNumberedLists(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeReplaceQuotes"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(264) //= 0x108. The runtime will prefer the VTID if present
  @VTID(37)
  boolean autoFormatAsYouTypeReplaceQuotes();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeReplaceQuotes"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(264) //= 0x108. The runtime will prefer the VTID if present
  @VTID(38)
  void autoFormatAsYouTypeReplaceQuotes(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeReplaceSymbols"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(265) //= 0x109. The runtime will prefer the VTID if present
  @VTID(39)
  boolean autoFormatAsYouTypeReplaceSymbols();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeReplaceSymbols"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(265) //= 0x109. The runtime will prefer the VTID if present
  @VTID(40)
  void autoFormatAsYouTypeReplaceSymbols(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeReplaceOrdinals"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(266) //= 0x10a. The runtime will prefer the VTID if present
  @VTID(41)
  boolean autoFormatAsYouTypeReplaceOrdinals();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeReplaceOrdinals"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(266) //= 0x10a. The runtime will prefer the VTID if present
  @VTID(42)
  void autoFormatAsYouTypeReplaceOrdinals(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeReplaceFractions"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(267) //= 0x10b. The runtime will prefer the VTID if present
  @VTID(43)
  boolean autoFormatAsYouTypeReplaceFractions();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeReplaceFractions"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(267) //= 0x10b. The runtime will prefer the VTID if present
  @VTID(44)
  void autoFormatAsYouTypeReplaceFractions(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeReplacePlainTextEmphasis"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(268) //= 0x10c. The runtime will prefer the VTID if present
  @VTID(45)
  boolean autoFormatAsYouTypeReplacePlainTextEmphasis();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeReplacePlainTextEmphasis"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(268) //= 0x10c. The runtime will prefer the VTID if present
  @VTID(46)
  void autoFormatAsYouTypeReplacePlainTextEmphasis(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeFormatListItemBeginning"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(269) //= 0x10d. The runtime will prefer the VTID if present
  @VTID(47)
  boolean autoFormatAsYouTypeFormatListItemBeginning();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeFormatListItemBeginning"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(269) //= 0x10d. The runtime will prefer the VTID if present
  @VTID(48)
  void autoFormatAsYouTypeFormatListItemBeginning(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeDefineStyles"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(270) //= 0x10e. The runtime will prefer the VTID if present
  @VTID(49)
  boolean autoFormatAsYouTypeDefineStyles();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeDefineStyles"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(270) //= 0x10e. The runtime will prefer the VTID if present
  @VTID(50)
  void autoFormatAsYouTypeDefineStyles(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeReplaceHyperlinks"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(272) //= 0x110. The runtime will prefer the VTID if present
  @VTID(51)
  boolean autoFormatAsYouTypeReplaceHyperlinks();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeReplaceHyperlinks"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(272) //= 0x110. The runtime will prefer the VTID if present
  @VTID(52)
  void autoFormatAsYouTypeReplaceHyperlinks(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeApplyTables"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(290) //= 0x122. The runtime will prefer the VTID if present
  @VTID(53)
  boolean autoFormatAsYouTypeApplyTables();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeApplyTables"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(290) //= 0x122. The runtime will prefer the VTID if present
  @VTID(54)
  void autoFormatAsYouTypeApplyTables(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeApplyFirstIndents"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(297) //= 0x129. The runtime will prefer the VTID if present
  @VTID(55)
  boolean autoFormatAsYouTypeApplyFirstIndents();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeApplyFirstIndents"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(297) //= 0x129. The runtime will prefer the VTID if present
  @VTID(56)
  void autoFormatAsYouTypeApplyFirstIndents(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeApplyDates"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(298) //= 0x12a. The runtime will prefer the VTID if present
  @VTID(57)
  boolean autoFormatAsYouTypeApplyDates();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeApplyDates"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(298) //= 0x12a. The runtime will prefer the VTID if present
  @VTID(58)
  void autoFormatAsYouTypeApplyDates(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeApplyClosings"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(299) //= 0x12b. The runtime will prefer the VTID if present
  @VTID(59)
  boolean autoFormatAsYouTypeApplyClosings();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeApplyClosings"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(299) //= 0x12b. The runtime will prefer the VTID if present
  @VTID(60)
  void autoFormatAsYouTypeApplyClosings(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeMatchParentheses"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(300) //= 0x12c. The runtime will prefer the VTID if present
  @VTID(61)
  boolean autoFormatAsYouTypeMatchParentheses();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeMatchParentheses"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(300) //= 0x12c. The runtime will prefer the VTID if present
  @VTID(62)
  void autoFormatAsYouTypeMatchParentheses(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeReplaceFarEastDashes"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(301) //= 0x12d. The runtime will prefer the VTID if present
  @VTID(63)
  boolean autoFormatAsYouTypeReplaceFarEastDashes();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeReplaceFarEastDashes"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(301) //= 0x12d. The runtime will prefer the VTID if present
  @VTID(64)
  void autoFormatAsYouTypeReplaceFarEastDashes(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeDeleteAutoSpaces"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(302) //= 0x12e. The runtime will prefer the VTID if present
  @VTID(65)
  boolean autoFormatAsYouTypeDeleteAutoSpaces();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeDeleteAutoSpaces"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(302) //= 0x12e. The runtime will prefer the VTID if present
  @VTID(66)
  void autoFormatAsYouTypeDeleteAutoSpaces(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeInsertClosings"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(303) //= 0x12f. The runtime will prefer the VTID if present
  @VTID(67)
  boolean autoFormatAsYouTypeInsertClosings();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeInsertClosings"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(303) //= 0x12f. The runtime will prefer the VTID if present
  @VTID(68)
  void autoFormatAsYouTypeInsertClosings(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeAutoLetterWizard"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(304) //= 0x130. The runtime will prefer the VTID if present
  @VTID(69)
  boolean autoFormatAsYouTypeAutoLetterWizard();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeAutoLetterWizard"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(304) //= 0x130. The runtime will prefer the VTID if present
  @VTID(70)
  void autoFormatAsYouTypeAutoLetterWizard(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeInsertOvers"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(305) //= 0x131. The runtime will prefer the VTID if present
  @VTID(71)
  boolean autoFormatAsYouTypeInsertOvers();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeInsertOvers"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(305) //= 0x131. The runtime will prefer the VTID if present
  @VTID(72)
  void autoFormatAsYouTypeInsertOvers(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "RelyOnCSS"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(306) //= 0x132. The runtime will prefer the VTID if present
  @VTID(73)
  boolean relyOnCSS();


  /**
   * <p>
   * Setter method for the COM property "RelyOnCSS"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(306) //= 0x132. The runtime will prefer the VTID if present
  @VTID(74)
  void relyOnCSS(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "HTMLFidelity"
   * </p>
   * @return  Returns a value of type word.WdEmailHTMLFidelity
   */

  @DISPID(307) //= 0x133. The runtime will prefer the VTID if present
  @VTID(75)
  word.WdEmailHTMLFidelity htmlFidelity();


  /**
   * <p>
   * Setter method for the COM property "HTMLFidelity"
   * </p>
   * @param prop Mandatory word.WdEmailHTMLFidelity parameter.
   */

  @DISPID(307) //= 0x133. The runtime will prefer the VTID if present
  @VTID(76)
  void htmlFidelity(
    word.WdEmailHTMLFidelity prop);


  /**
   * <p>
   * Getter method for the COM property "EmbedSmartTag"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(308) //= 0x134. The runtime will prefer the VTID if present
  @VTID(77)
  boolean embedSmartTag();


  /**
   * <p>
   * Setter method for the COM property "EmbedSmartTag"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(308) //= 0x134. The runtime will prefer the VTID if present
  @VTID(78)
  void embedSmartTag(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "TabIndentKey"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(309) //= 0x135. The runtime will prefer the VTID if present
  @VTID(79)
  boolean tabIndentKey();


  /**
   * <p>
   * Setter method for the COM property "TabIndentKey"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(309) //= 0x135. The runtime will prefer the VTID if present
  @VTID(80)
  void tabIndentKey(
    boolean prop);


  // Properties:
}
