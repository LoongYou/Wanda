package word  ;

import com4j.*;

@IID("{0002095E-0000-0000-C000-000000000046}")
public interface Range extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  java.lang.String text();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(8)
  @DefaultMethod
  void text(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "FormattedText"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  word.Range formattedText();


  /**
   * <p>
   * Setter method for the COM property "FormattedText"
   * </p>
   * @param prop Mandatory word.Range parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  void formattedText(
    word.Range prop);


  /**
   * <p>
   * Getter method for the COM property "Start"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  int start();


  /**
   * <p>
   * Setter method for the COM property "Start"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  void start(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "End"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  int end();


  /**
   * <p>
   * Setter method for the COM property "End"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  void end(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type word._Font
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  word._Font font();


  /**
   * <p>
   * Setter method for the COM property "Font"
   * </p>
   * @param prop Mandatory word._Font parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  void font(
    word._Font prop);


  /**
   * <p>
   * Getter method for the COM property "Duplicate"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  word.Range duplicate();


  /**
   * <p>
   * Getter method for the COM property "StoryType"
   * </p>
   * @return  Returns a value of type word.WdStoryType
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(18)
  word.WdStoryType storyType();


  /**
   * <p>
   * Getter method for the COM property "Tables"
   * </p>
   * @return  Returns a value of type word.Tables
   */

  @DISPID(50) //= 0x32. The runtime will prefer the VTID if present
  @VTID(19)
  word.Tables tables();


  @VTID(19)
  @ReturnValue(defaultPropertyThrough={word.Tables.class})
  word.Table tables(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Words"
   * </p>
   * @return  Returns a value of type word.Words
   */

  @DISPID(51) //= 0x33. The runtime will prefer the VTID if present
  @VTID(20)
  word.Words words();


  @VTID(20)
  @ReturnValue(defaultPropertyThrough={word.Words.class})
  word.Range words(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Sentences"
   * </p>
   * @return  Returns a value of type word.Sentences
   */

  @DISPID(52) //= 0x34. The runtime will prefer the VTID if present
  @VTID(21)
  word.Sentences sentences();


  @VTID(21)
  @ReturnValue(defaultPropertyThrough={word.Sentences.class})
  word.Range sentences(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Characters"
   * </p>
   * @return  Returns a value of type word.Characters
   */

  @DISPID(53) //= 0x35. The runtime will prefer the VTID if present
  @VTID(22)
  word.Characters characters();


  @VTID(22)
  @ReturnValue(defaultPropertyThrough={word.Characters.class})
  word.Range characters(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Footnotes"
   * </p>
   * @return  Returns a value of type word.Footnotes
   */

  @DISPID(54) //= 0x36. The runtime will prefer the VTID if present
  @VTID(23)
  word.Footnotes footnotes();


  @VTID(23)
  @ReturnValue(defaultPropertyThrough={word.Footnotes.class})
  word.Footnote footnotes(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Endnotes"
   * </p>
   * @return  Returns a value of type word.Endnotes
   */

  @DISPID(55) //= 0x37. The runtime will prefer the VTID if present
  @VTID(24)
  word.Endnotes endnotes();


  @VTID(24)
  @ReturnValue(defaultPropertyThrough={word.Endnotes.class})
  word.Endnote endnotes(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Comments"
   * </p>
   * @return  Returns a value of type word.Comments
   */

  @DISPID(56) //= 0x38. The runtime will prefer the VTID if present
  @VTID(25)
  word.Comments comments();


  @VTID(25)
  @ReturnValue(defaultPropertyThrough={word.Comments.class})
  word.Comment comments(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Cells"
   * </p>
   * @return  Returns a value of type word.Cells
   */

  @DISPID(57) //= 0x39. The runtime will prefer the VTID if present
  @VTID(26)
  word.Cells cells();


  @VTID(26)
  @ReturnValue(defaultPropertyThrough={word.Cells.class})
  word.Cell cells(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Sections"
   * </p>
   * @return  Returns a value of type word.Sections
   */

  @DISPID(58) //= 0x3a. The runtime will prefer the VTID if present
  @VTID(27)
  word.Sections sections();


  @VTID(27)
  @ReturnValue(defaultPropertyThrough={word.Sections.class})
  word.Section sections(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Paragraphs"
   * </p>
   * @return  Returns a value of type word.Paragraphs
   */

  @DISPID(59) //= 0x3b. The runtime will prefer the VTID if present
  @VTID(28)
  word.Paragraphs paragraphs();


  @VTID(28)
  @ReturnValue(defaultPropertyThrough={word.Paragraphs.class})
  word.Paragraph paragraphs(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type word.Borders
   */

  @DISPID(1100) //= 0x44c. The runtime will prefer the VTID if present
  @VTID(29)
  word.Borders borders();


  @VTID(29)
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
  @VTID(30)
  void borders(
    word.Borders prop);


  /**
   * <p>
   * Getter method for the COM property "Shading"
   * </p>
   * @return  Returns a value of type word.Shading
   */

  @DISPID(61) //= 0x3d. The runtime will prefer the VTID if present
  @VTID(31)
  word.Shading shading();


  /**
   * <p>
   * Getter method for the COM property "TextRetrievalMode"
   * </p>
   * @return  Returns a value of type word.TextRetrievalMode
   */

  @DISPID(62) //= 0x3e. The runtime will prefer the VTID if present
  @VTID(32)
  word.TextRetrievalMode textRetrievalMode();


  /**
   * <p>
   * Setter method for the COM property "TextRetrievalMode"
   * </p>
   * @param prop Mandatory word.TextRetrievalMode parameter.
   */

  @DISPID(62) //= 0x3e. The runtime will prefer the VTID if present
  @VTID(33)
  void textRetrievalMode(
    word.TextRetrievalMode prop);


  /**
   * <p>
   * Getter method for the COM property "Fields"
   * </p>
   * @return  Returns a value of type word.Fields
   */

  @DISPID(64) //= 0x40. The runtime will prefer the VTID if present
  @VTID(34)
  word.Fields fields();


  @VTID(34)
  @ReturnValue(defaultPropertyThrough={word.Fields.class})
  word.Field fields(
    int index);

  /**
   * <p>
   * Getter method for the COM property "FormFields"
   * </p>
   * @return  Returns a value of type word.FormFields
   */

  @DISPID(65) //= 0x41. The runtime will prefer the VTID if present
  @VTID(35)
  word.FormFields formFields();


  @VTID(35)
  @ReturnValue(defaultPropertyThrough={word.FormFields.class})
  word.FormField formFields(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Frames"
   * </p>
   * @return  Returns a value of type word.Frames
   */

  @DISPID(66) //= 0x42. The runtime will prefer the VTID if present
  @VTID(36)
  word.Frames frames();


  @VTID(36)
  @ReturnValue(defaultPropertyThrough={word.Frames.class})
  word.Frame frames(
    int index);

  /**
   * <p>
   * Getter method for the COM property "ParagraphFormat"
   * </p>
   * @return  Returns a value of type word._ParagraphFormat
   */

  @DISPID(1102) //= 0x44e. The runtime will prefer the VTID if present
  @VTID(37)
  word._ParagraphFormat paragraphFormat();


  /**
   * <p>
   * Setter method for the COM property "ParagraphFormat"
   * </p>
   * @param prop Mandatory word._ParagraphFormat parameter.
   */

  @DISPID(1102) //= 0x44e. The runtime will prefer the VTID if present
  @VTID(38)
  void paragraphFormat(
    word._ParagraphFormat prop);


  /**
   * <p>
   * Getter method for the COM property "ListFormat"
   * </p>
   * @return  Returns a value of type word.ListFormat
   */

  @DISPID(68) //= 0x44. The runtime will prefer the VTID if present
  @VTID(39)
  word.ListFormat listFormat();


  /**
   * <p>
   * Getter method for the COM property "Bookmarks"
   * </p>
   * @return  Returns a value of type word.Bookmarks
   */

  @DISPID(75) //= 0x4b. The runtime will prefer the VTID if present
  @VTID(40)
  word.Bookmarks bookmarks();


  @VTID(40)
  @ReturnValue(defaultPropertyThrough={word.Bookmarks.class})
  word.Bookmark bookmarks(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(41)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(42)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(43)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Bold"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(130) //= 0x82. The runtime will prefer the VTID if present
  @VTID(44)
  int bold();


  /**
   * <p>
   * Setter method for the COM property "Bold"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(130) //= 0x82. The runtime will prefer the VTID if present
  @VTID(45)
  void bold(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Italic"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(131) //= 0x83. The runtime will prefer the VTID if present
  @VTID(46)
  int italic();


  /**
   * <p>
   * Setter method for the COM property "Italic"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(131) //= 0x83. The runtime will prefer the VTID if present
  @VTID(47)
  void italic(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Underline"
   * </p>
   * @return  Returns a value of type word.WdUnderline
   */

  @DISPID(139) //= 0x8b. The runtime will prefer the VTID if present
  @VTID(48)
  word.WdUnderline underline();


  /**
   * <p>
   * Setter method for the COM property "Underline"
   * </p>
   * @param prop Mandatory word.WdUnderline parameter.
   */

  @DISPID(139) //= 0x8b. The runtime will prefer the VTID if present
  @VTID(49)
  void underline(
    word.WdUnderline prop);


  /**
   * <p>
   * Getter method for the COM property "EmphasisMark"
   * </p>
   * @return  Returns a value of type word.WdEmphasisMark
   */

  @DISPID(140) //= 0x8c. The runtime will prefer the VTID if present
  @VTID(50)
  word.WdEmphasisMark emphasisMark();


  /**
   * <p>
   * Setter method for the COM property "EmphasisMark"
   * </p>
   * @param prop Mandatory word.WdEmphasisMark parameter.
   */

  @DISPID(140) //= 0x8c. The runtime will prefer the VTID if present
  @VTID(51)
  void emphasisMark(
    word.WdEmphasisMark prop);


  /**
   * <p>
   * Getter method for the COM property "DisableCharacterSpaceGrid"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(141) //= 0x8d. The runtime will prefer the VTID if present
  @VTID(52)
  boolean disableCharacterSpaceGrid();


  /**
   * <p>
   * Setter method for the COM property "DisableCharacterSpaceGrid"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(141) //= 0x8d. The runtime will prefer the VTID if present
  @VTID(53)
  void disableCharacterSpaceGrid(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Revisions"
   * </p>
   * @return  Returns a value of type word.Revisions
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(54)
  word.Revisions revisions();


  @VTID(54)
  @ReturnValue(defaultPropertyThrough={word.Revisions.class})
  word.Revision revisions(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(151) //= 0x97. The runtime will prefer the VTID if present
  @VTID(55)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object style();


  /**
   * <p>
   * Setter method for the COM property "Style"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(151) //= 0x97. The runtime will prefer the VTID if present
  @VTID(56)
  void style(
    java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "StoryLength"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(152) //= 0x98. The runtime will prefer the VTID if present
  @VTID(57)
  int storyLength();


  /**
   * <p>
   * Getter method for the COM property "LanguageID"
   * </p>
   * @return  Returns a value of type word.WdLanguageID
   */

  @DISPID(153) //= 0x99. The runtime will prefer the VTID if present
  @VTID(58)
  word.WdLanguageID languageID();


  /**
   * <p>
   * Setter method for the COM property "LanguageID"
   * </p>
   * @param prop Mandatory word.WdLanguageID parameter.
   */

  @DISPID(153) //= 0x99. The runtime will prefer the VTID if present
  @VTID(59)
  void languageID(
    word.WdLanguageID prop);


  /**
   * <p>
   * Getter method for the COM property "SynonymInfo"
   * </p>
   * @return  Returns a value of type word.SynonymInfo
   */

  @DISPID(155) //= 0x9b. The runtime will prefer the VTID if present
  @VTID(60)
  word.SynonymInfo synonymInfo();


  /**
   * <p>
   * Getter method for the COM property "Hyperlinks"
   * </p>
   * @return  Returns a value of type word.Hyperlinks
   */

  @DISPID(156) //= 0x9c. The runtime will prefer the VTID if present
  @VTID(61)
  word.Hyperlinks hyperlinks();


  @VTID(61)
  @ReturnValue(defaultPropertyThrough={word.Hyperlinks.class})
  word.Hyperlink hyperlinks(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "ListParagraphs"
   * </p>
   * @return  Returns a value of type word.ListParagraphs
   */

  @DISPID(157) //= 0x9d. The runtime will prefer the VTID if present
  @VTID(62)
  word.ListParagraphs listParagraphs();


  @VTID(62)
  @ReturnValue(defaultPropertyThrough={word.ListParagraphs.class})
  word.Paragraph listParagraphs(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Subdocuments"
   * </p>
   * @return  Returns a value of type word.Subdocuments
   */

  @DISPID(159) //= 0x9f. The runtime will prefer the VTID if present
  @VTID(63)
  word.Subdocuments subdocuments();


  @VTID(63)
  @ReturnValue(defaultPropertyThrough={word.Subdocuments.class})
  word.Subdocument subdocuments(
    int index);

  /**
   * <p>
   * Getter method for the COM property "GrammarChecked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(260) //= 0x104. The runtime will prefer the VTID if present
  @VTID(64)
  boolean grammarChecked();


  /**
   * <p>
   * Setter method for the COM property "GrammarChecked"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(260) //= 0x104. The runtime will prefer the VTID if present
  @VTID(65)
  void grammarChecked(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SpellingChecked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(261) //= 0x105. The runtime will prefer the VTID if present
  @VTID(66)
  boolean spellingChecked();


  /**
   * <p>
   * Setter method for the COM property "SpellingChecked"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(261) //= 0x105. The runtime will prefer the VTID if present
  @VTID(67)
  void spellingChecked(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "HighlightColorIndex"
   * </p>
   * @return  Returns a value of type word.WdColorIndex
   */

  @DISPID(301) //= 0x12d. The runtime will prefer the VTID if present
  @VTID(68)
  word.WdColorIndex highlightColorIndex();


  /**
   * <p>
   * Setter method for the COM property "HighlightColorIndex"
   * </p>
   * @param prop Mandatory word.WdColorIndex parameter.
   */

  @DISPID(301) //= 0x12d. The runtime will prefer the VTID if present
  @VTID(69)
  void highlightColorIndex(
    word.WdColorIndex prop);


  /**
   * <p>
   * Getter method for the COM property "Columns"
   * </p>
   * @return  Returns a value of type word.Columns
   */

  @DISPID(302) //= 0x12e. The runtime will prefer the VTID if present
  @VTID(70)
  word.Columns columns();


  @VTID(70)
  @ReturnValue(defaultPropertyThrough={word.Columns.class})
  word.Column columns(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Rows"
   * </p>
   * @return  Returns a value of type word.Rows
   */

  @DISPID(303) //= 0x12f. The runtime will prefer the VTID if present
  @VTID(71)
  word.Rows rows();


  @VTID(71)
  @ReturnValue(defaultPropertyThrough={word.Rows.class})
  word.Row rows(
    int index);

  /**
   * <p>
   * Getter method for the COM property "CanEdit"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(304) //= 0x130. The runtime will prefer the VTID if present
  @VTID(72)
  int canEdit();


  /**
   * <p>
   * Getter method for the COM property "CanPaste"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(305) //= 0x131. The runtime will prefer the VTID if present
  @VTID(73)
  int canPaste();


  /**
   * <p>
   * Getter method for the COM property "IsEndOfRowMark"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(307) //= 0x133. The runtime will prefer the VTID if present
  @VTID(74)
  boolean isEndOfRowMark();


  /**
   * <p>
   * Getter method for the COM property "BookmarkID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(308) //= 0x134. The runtime will prefer the VTID if present
  @VTID(75)
  int bookmarkID();


  /**
   * <p>
   * Getter method for the COM property "PreviousBookmarkID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(309) //= 0x135. The runtime will prefer the VTID if present
  @VTID(76)
  int previousBookmarkID();


  /**
   * <p>
   * Getter method for the COM property "Find"
   * </p>
   * @return  Returns a value of type word.Find
   */

  @DISPID(262) //= 0x106. The runtime will prefer the VTID if present
  @VTID(77)
  word.Find find();


  /**
   * <p>
   * Getter method for the COM property "PageSetup"
   * </p>
   * @return  Returns a value of type word.PageSetup
   */

  @DISPID(1101) //= 0x44d. The runtime will prefer the VTID if present
  @VTID(78)
  word.PageSetup pageSetup();


  /**
   * <p>
   * Setter method for the COM property "PageSetup"
   * </p>
   * @param prop Mandatory word.PageSetup parameter.
   */

  @DISPID(1101) //= 0x44d. The runtime will prefer the VTID if present
  @VTID(79)
  void pageSetup(
    word.PageSetup prop);


  /**
   * <p>
   * Getter method for the COM property "ShapeRange"
   * </p>
   * @return  Returns a value of type word.ShapeRange
   */

  @DISPID(311) //= 0x137. The runtime will prefer the VTID if present
  @VTID(80)
  word.ShapeRange shapeRange();


  @VTID(80)
  @ReturnValue(defaultPropertyThrough={word.ShapeRange.class})
  word.Shape shapeRange(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Case"
   * </p>
   * @return  Returns a value of type word.WdCharacterCase
   */

  @DISPID(312) //= 0x138. The runtime will prefer the VTID if present
  @VTID(81)
  word.WdCharacterCase _case();


  /**
   * <p>
   * Setter method for the COM property "Case"
   * </p>
   * @param prop Mandatory word.WdCharacterCase parameter.
   */

  @DISPID(312) //= 0x138. The runtime will prefer the VTID if present
  @VTID(82)
  void _case(
    word.WdCharacterCase prop);


  /**
   * <p>
   * Getter method for the COM property "Information"
   * </p>
   * @param type Mandatory word.WdInformation parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(313) //= 0x139. The runtime will prefer the VTID if present
  @VTID(83)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object information(
    word.WdInformation type);


  /**
   * <p>
   * Getter method for the COM property "ReadabilityStatistics"
   * </p>
   * @return  Returns a value of type word.ReadabilityStatistics
   */

  @DISPID(314) //= 0x13a. The runtime will prefer the VTID if present
  @VTID(84)
  word.ReadabilityStatistics readabilityStatistics();


  @VTID(84)
  @ReturnValue(defaultPropertyThrough={word.ReadabilityStatistics.class})
  word.ReadabilityStatistic readabilityStatistics(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "GrammaticalErrors"
   * </p>
   * @return  Returns a value of type word.ProofreadingErrors
   */

  @DISPID(315) //= 0x13b. The runtime will prefer the VTID if present
  @VTID(85)
  word.ProofreadingErrors grammaticalErrors();


  @VTID(85)
  @ReturnValue(defaultPropertyThrough={word.ProofreadingErrors.class})
  word.Range grammaticalErrors(
    int index);

  /**
   * <p>
   * Getter method for the COM property "SpellingErrors"
   * </p>
   * @return  Returns a value of type word.ProofreadingErrors
   */

  @DISPID(316) //= 0x13c. The runtime will prefer the VTID if present
  @VTID(86)
  word.ProofreadingErrors spellingErrors();


  @VTID(86)
  @ReturnValue(defaultPropertyThrough={word.ProofreadingErrors.class})
  word.Range spellingErrors(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type word.WdTextOrientation
   */

  @DISPID(317) //= 0x13d. The runtime will prefer the VTID if present
  @VTID(87)
  word.WdTextOrientation orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param prop Mandatory word.WdTextOrientation parameter.
   */

  @DISPID(317) //= 0x13d. The runtime will prefer the VTID if present
  @VTID(88)
  void orientation(
    word.WdTextOrientation prop);


  /**
   * <p>
   * Getter method for the COM property "InlineShapes"
   * </p>
   * @return  Returns a value of type word.InlineShapes
   */

  @DISPID(319) //= 0x13f. The runtime will prefer the VTID if present
  @VTID(89)
  word.InlineShapes inlineShapes();


  @VTID(89)
  @ReturnValue(defaultPropertyThrough={word.InlineShapes.class})
  word.InlineShape inlineShapes(
    int index);

  /**
   * <p>
   * Getter method for the COM property "NextStoryRange"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(320) //= 0x140. The runtime will prefer the VTID if present
  @VTID(90)
  word.Range nextStoryRange();


  /**
   * <p>
   * Getter method for the COM property "LanguageIDFarEast"
   * </p>
   * @return  Returns a value of type word.WdLanguageID
   */

  @DISPID(321) //= 0x141. The runtime will prefer the VTID if present
  @VTID(91)
  word.WdLanguageID languageIDFarEast();


  /**
   * <p>
   * Setter method for the COM property "LanguageIDFarEast"
   * </p>
   * @param prop Mandatory word.WdLanguageID parameter.
   */

  @DISPID(321) //= 0x141. The runtime will prefer the VTID if present
  @VTID(92)
  void languageIDFarEast(
    word.WdLanguageID prop);


  /**
   * <p>
   * Getter method for the COM property "LanguageIDOther"
   * </p>
   * @return  Returns a value of type word.WdLanguageID
   */

  @DISPID(322) //= 0x142. The runtime will prefer the VTID if present
  @VTID(93)
  word.WdLanguageID languageIDOther();


  /**
   * <p>
   * Setter method for the COM property "LanguageIDOther"
   * </p>
   * @param prop Mandatory word.WdLanguageID parameter.
   */

  @DISPID(322) //= 0x142. The runtime will prefer the VTID if present
  @VTID(94)
  void languageIDOther(
    word.WdLanguageID prop);


  /**
   */

  @DISPID(65535) //= 0xffff. The runtime will prefer the VTID if present
  @VTID(95)
  void select();


  /**
   * @param start Mandatory int parameter.
   * @param end Mandatory int parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(96)
  void setRange(
    int start,
    int end);


  /**
   * @param direction Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(97)
  void collapse(
    @Optional java.lang.Object direction);


  /**
   * @param text Mandatory java.lang.String parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(98)
  void insertBefore(
    java.lang.String text);


  /**
   * @param text Mandatory java.lang.String parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(99)
  void insertAfter(
    java.lang.String text);


  /**
   * @param unit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Range
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(100)
  word.Range next(
    @Optional java.lang.Object unit,
    @Optional java.lang.Object count);


  /**
   * @param unit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Range
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(101)
  word.Range previous(
    @Optional java.lang.Object unit,
    @Optional java.lang.Object count);


  /**
   * @param unit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param extend Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(102)
  int startOf(
    @Optional java.lang.Object unit,
    @Optional java.lang.Object extend);


  /**
   * @param unit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param extend Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(103)
  int endOf(
    @Optional java.lang.Object unit,
    @Optional java.lang.Object extend);


  /**
   * @param unit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(104)
  int move(
    @Optional java.lang.Object unit,
    @Optional java.lang.Object count);


  /**
   * @param unit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(105)
  int moveStart(
    @Optional java.lang.Object unit,
    @Optional java.lang.Object count);


  /**
   * @param unit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(106)
  int moveEnd(
    @Optional java.lang.Object unit,
    @Optional java.lang.Object count);


  /**
   * @param cset Mandatory java.lang.Object parameter.
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(107)
  int moveWhile(
    java.lang.Object cset,
    @Optional java.lang.Object count);


  /**
   * @param cset Mandatory java.lang.Object parameter.
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(108)
  int moveStartWhile(
    java.lang.Object cset,
    @Optional java.lang.Object count);


  /**
   * @param cset Mandatory java.lang.Object parameter.
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(109)
  int moveEndWhile(
    java.lang.Object cset,
    @Optional java.lang.Object count);


  /**
   * @param cset Mandatory java.lang.Object parameter.
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(110)
  int moveUntil(
    java.lang.Object cset,
    @Optional java.lang.Object count);


  /**
   * @param cset Mandatory java.lang.Object parameter.
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(111)
  int moveStartUntil(
    java.lang.Object cset,
    @Optional java.lang.Object count);


  /**
   * @param cset Mandatory java.lang.Object parameter.
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(112)
  int moveEndUntil(
    java.lang.Object cset,
    @Optional java.lang.Object count);


  /**
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(113)
  void cut();


  /**
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(114)
  void copy();


  /**
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(115)
  void paste();


  /**
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(116)
  void insertBreak(
    @Optional java.lang.Object type);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param range Optional parameter. Default value is com4j.Variant.getMissing()
   * @param confirmConversions Optional parameter. Default value is com4j.Variant.getMissing()
   * @param link Optional parameter. Default value is com4j.Variant.getMissing()
   * @param attachment Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(117)
  void insertFile(
    java.lang.String fileName,
    @Optional java.lang.Object range,
    @Optional java.lang.Object confirmConversions,
    @Optional java.lang.Object link,
    @Optional java.lang.Object attachment);


  /**
   * @param range Mandatory word.Range parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(125) //= 0x7d. The runtime will prefer the VTID if present
  @VTID(118)
  boolean inStory(
    word.Range range);


  /**
   * @param range Mandatory word.Range parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(119)
  boolean inRange(
    word.Range range);


  /**
   * @param unit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(120)
  int delete(
    @Optional java.lang.Object unit,
    @Optional java.lang.Object count);


  /**
   */

  @DISPID(128) //= 0x80. The runtime will prefer the VTID if present
  @VTID(121)
  void wholeStory();


  /**
   * @param unit Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(129) //= 0x81. The runtime will prefer the VTID if present
  @VTID(122)
  int expand(
    @Optional java.lang.Object unit);


  /**
   */

  @DISPID(160) //= 0xa0. The runtime will prefer the VTID if present
  @VTID(123)
  void insertParagraph();


  /**
   */

  @DISPID(161) //= 0xa1. The runtime will prefer the VTID if present
  @VTID(124)
  void insertParagraphAfter();


  /**
   * @param separator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param numRows Optional parameter. Default value is com4j.Variant.getMissing()
   * @param numColumns Optional parameter. Default value is com4j.Variant.getMissing()
   * @param initialColumnWidth Optional parameter. Default value is com4j.Variant.getMissing()
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyBorders Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyShading Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyFont Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyColor Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyHeadingRows Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyLastRow Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyFirstColumn Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyLastColumn Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoFit Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Table
   */

  @DISPID(162) //= 0xa2. The runtime will prefer the VTID if present
  @VTID(125)
  word.Table convertToTableOld(
    @Optional java.lang.Object separator,
    @Optional java.lang.Object numRows,
    @Optional java.lang.Object numColumns,
    @Optional java.lang.Object initialColumnWidth,
    @Optional java.lang.Object format,
    @Optional java.lang.Object applyBorders,
    @Optional java.lang.Object applyShading,
    @Optional java.lang.Object applyFont,
    @Optional java.lang.Object applyColor,
    @Optional java.lang.Object applyHeadingRows,
    @Optional java.lang.Object applyLastRow,
    @Optional java.lang.Object applyFirstColumn,
    @Optional java.lang.Object applyLastColumn,
    @Optional java.lang.Object autoFit);


  /**
   * @param dateTimeFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param insertAsField Optional parameter. Default value is com4j.Variant.getMissing()
   * @param insertAsFullWidth Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(163) //= 0xa3. The runtime will prefer the VTID if present
  @VTID(126)
  void insertDateTimeOld(
    @Optional java.lang.Object dateTimeFormat,
    @Optional java.lang.Object insertAsField,
    @Optional java.lang.Object insertAsFullWidth);


  /**
   * @param characterNumber Mandatory int parameter.
   * @param font Optional parameter. Default value is com4j.Variant.getMissing()
   * @param unicode Optional parameter. Default value is com4j.Variant.getMissing()
   * @param bias Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(164) //= 0xa4. The runtime will prefer the VTID if present
  @VTID(127)
  void insertSymbol(
    int characterNumber,
    @Optional java.lang.Object font,
    @Optional java.lang.Object unicode,
    @Optional java.lang.Object bias);


  /**
   * @param referenceType Mandatory java.lang.Object parameter.
   * @param referenceKind Mandatory word.WdReferenceKind parameter.
   * @param referenceItem Mandatory java.lang.Object parameter.
   * @param insertAsHyperlink Optional parameter. Default value is com4j.Variant.getMissing()
   * @param includePosition Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(165) //= 0xa5. The runtime will prefer the VTID if present
  @VTID(128)
  void insertCrossReference_2002(
    java.lang.Object referenceType,
    word.WdReferenceKind referenceKind,
    java.lang.Object referenceItem,
    @Optional java.lang.Object insertAsHyperlink,
    @Optional java.lang.Object includePosition);


  /**
   * @param label Mandatory java.lang.Object parameter.
   * @param title Optional parameter. Default value is com4j.Variant.getMissing()
   * @param titleAutoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param position Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(166) //= 0xa6. The runtime will prefer the VTID if present
  @VTID(129)
  void insertCaptionXP(
    java.lang.Object label,
    @Optional java.lang.Object title,
    @Optional java.lang.Object titleAutoText,
    @Optional java.lang.Object position);


  /**
   */

  @DISPID(167) //= 0xa7. The runtime will prefer the VTID if present
  @VTID(130)
  void copyAsPicture();


  /**
   * @param excludeHeader Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fieldNumber Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortFieldType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortOrder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fieldNumber2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortFieldType2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortOrder2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fieldNumber3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortFieldType3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortOrder3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortColumn Optional parameter. Default value is com4j.Variant.getMissing()
   * @param separator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param caseSensitive Optional parameter. Default value is com4j.Variant.getMissing()
   * @param languageID Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(168) //= 0xa8. The runtime will prefer the VTID if present
  @VTID(131)
  void sortOld(
    @Optional java.lang.Object excludeHeader,
    @Optional java.lang.Object fieldNumber,
    @Optional java.lang.Object sortFieldType,
    @Optional java.lang.Object sortOrder,
    @Optional java.lang.Object fieldNumber2,
    @Optional java.lang.Object sortFieldType2,
    @Optional java.lang.Object sortOrder2,
    @Optional java.lang.Object fieldNumber3,
    @Optional java.lang.Object sortFieldType3,
    @Optional java.lang.Object sortOrder3,
    @Optional java.lang.Object sortColumn,
    @Optional java.lang.Object separator,
    @Optional java.lang.Object caseSensitive,
    @Optional java.lang.Object languageID);


  /**
   */

  @DISPID(169) //= 0xa9. The runtime will prefer the VTID if present
  @VTID(132)
  void sortAscending();


  /**
   */

  @DISPID(170) //= 0xaa. The runtime will prefer the VTID if present
  @VTID(133)
  void sortDescending();


  /**
   * @param range Mandatory word.Range parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(171) //= 0xab. The runtime will prefer the VTID if present
  @VTID(134)
  boolean isEqual(
    word.Range range);


  /**
   * @return  Returns a value of type float
   */

  @DISPID(172) //= 0xac. The runtime will prefer the VTID if present
  @VTID(135)
  float calculate();


  /**
   * @param what Optional parameter. Default value is com4j.Variant.getMissing()
   * @param which Optional parameter. Default value is com4j.Variant.getMissing()
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Range
   */

  @DISPID(173) //= 0xad. The runtime will prefer the VTID if present
  @VTID(136)
  word.Range goTo(
    @Optional java.lang.Object what,
    @Optional java.lang.Object which,
    @Optional java.lang.Object count,
    @Optional java.lang.Object name);


  /**
   * @param what Mandatory word.WdGoToItem parameter.
   * @return  Returns a value of type word.Range
   */

  @DISPID(174) //= 0xae. The runtime will prefer the VTID if present
  @VTID(137)
  word.Range goToNext(
    word.WdGoToItem what);


  /**
   * @param what Mandatory word.WdGoToItem parameter.
   * @return  Returns a value of type word.Range
   */

  @DISPID(175) //= 0xaf. The runtime will prefer the VTID if present
  @VTID(138)
  word.Range goToPrevious(
    word.WdGoToItem what);


  /**
   * @param iconIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param link Optional parameter. Default value is com4j.Variant.getMissing()
   * @param placement Optional parameter. Default value is com4j.Variant.getMissing()
   * @param displayAsIcon Optional parameter. Default value is com4j.Variant.getMissing()
   * @param dataType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconLabel Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(176) //= 0xb0. The runtime will prefer the VTID if present
  @VTID(139)
  void pasteSpecial(
    @Optional java.lang.Object iconIndex,
    @Optional java.lang.Object link,
    @Optional java.lang.Object placement,
    @Optional java.lang.Object displayAsIcon,
    @Optional java.lang.Object dataType,
    @Optional java.lang.Object iconFileName,
    @Optional java.lang.Object iconLabel);


  /**
   */

  @DISPID(177) //= 0xb1. The runtime will prefer the VTID if present
  @VTID(140)
  void lookupNameProperties();


  /**
   * @param statistic Mandatory word.WdStatistic parameter.
   * @return  Returns a value of type int
   */

  @DISPID(178) //= 0xb2. The runtime will prefer the VTID if present
  @VTID(141)
  int computeStatistics(
    word.WdStatistic statistic);


  /**
   * @param direction Mandatory int parameter.
   */

  @DISPID(179) //= 0xb3. The runtime will prefer the VTID if present
  @VTID(142)
  void relocate(
    int direction);


  /**
   */

  @DISPID(180) //= 0xb4. The runtime will prefer the VTID if present
  @VTID(143)
  void checkSynonyms();


  /**
   * @param edition Mandatory java.lang.String parameter.
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(181) //= 0xb5. The runtime will prefer the VTID if present
  @VTID(144)
  void subscribeTo(
    java.lang.String edition,
    @Optional java.lang.Object format);


  /**
   * @param edition Optional parameter. Default value is com4j.Variant.getMissing()
   * @param containsPICT Optional parameter. Default value is com4j.Variant.getMissing()
   * @param containsRTF Optional parameter. Default value is com4j.Variant.getMissing()
   * @param containsText Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(182) //= 0xb6. The runtime will prefer the VTID if present
  @VTID(145)
  void createPublisher(
    @Optional java.lang.Object edition,
    @Optional java.lang.Object containsPICT,
    @Optional java.lang.Object containsRTF,
    @Optional java.lang.Object containsText);


  /**
   */

  @DISPID(183) //= 0xb7. The runtime will prefer the VTID if present
  @VTID(146)
  void insertAutoText();


  /**
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @param style Optional parameter. Default value is com4j.Variant.getMissing()
   * @param linkToSource Optional parameter. Default value is com4j.Variant.getMissing()
   * @param connection Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sqlStatement Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sqlStatement1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordTemplate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePasswordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePasswordTemplate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param dataSource Optional parameter. Default value is com4j.Variant.getMissing()
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param includeFields Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(194) //= 0xc2. The runtime will prefer the VTID if present
  @VTID(147)
  void insertDatabase(
    @Optional java.lang.Object format,
    @Optional java.lang.Object style,
    @Optional java.lang.Object linkToSource,
    @Optional java.lang.Object connection,
    @Optional java.lang.Object sqlStatement,
    @Optional java.lang.Object sqlStatement1,
    @Optional java.lang.Object passwordDocument,
    @Optional java.lang.Object passwordTemplate,
    @Optional java.lang.Object writePasswordDocument,
    @Optional java.lang.Object writePasswordTemplate,
    @Optional java.lang.Object dataSource,
    @Optional java.lang.Object from,
    @Optional java.lang.Object to,
    @Optional java.lang.Object includeFields);


  /**
   */

  @DISPID(195) //= 0xc3. The runtime will prefer the VTID if present
  @VTID(148)
  void autoFormat();


  /**
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(149)
  void checkGrammar();


  /**
   * @param customDictionary Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreUppercase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param alwaysSuggest Optional parameter. Default value is com4j.Variant.getMissing()
   * @param customDictionary2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param customDictionary3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param customDictionary4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param customDictionary5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param customDictionary6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param customDictionary7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param customDictionary8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param customDictionary9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param customDictionary10 Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(150)
  void checkSpelling(
    @Optional java.lang.Object customDictionary,
    @Optional java.lang.Object ignoreUppercase,
    @Optional java.lang.Object alwaysSuggest,
    @Optional java.lang.Object customDictionary2,
    @Optional java.lang.Object customDictionary3,
    @Optional java.lang.Object customDictionary4,
    @Optional java.lang.Object customDictionary5,
    @Optional java.lang.Object customDictionary6,
    @Optional java.lang.Object customDictionary7,
    @Optional java.lang.Object customDictionary8,
    @Optional java.lang.Object customDictionary9,
    @Optional java.lang.Object customDictionary10);


  /**
   * @param customDictionary Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreUppercase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param mainDictionary Optional parameter. Default value is com4j.Variant.getMissing()
   * @param suggestionMode Optional parameter. Default value is com4j.Variant.getMissing()
   * @param customDictionary2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param customDictionary3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param customDictionary4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param customDictionary5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param customDictionary6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param customDictionary7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param customDictionary8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param customDictionary9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param customDictionary10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.SpellingSuggestions
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(151)
  word.SpellingSuggestions getSpellingSuggestions(
    @Optional java.lang.Object customDictionary,
    @Optional java.lang.Object ignoreUppercase,
    @Optional java.lang.Object mainDictionary,
    @Optional java.lang.Object suggestionMode,
    @Optional java.lang.Object customDictionary2,
    @Optional java.lang.Object customDictionary3,
    @Optional java.lang.Object customDictionary4,
    @Optional java.lang.Object customDictionary5,
    @Optional java.lang.Object customDictionary6,
    @Optional java.lang.Object customDictionary7,
    @Optional java.lang.Object customDictionary8,
    @Optional java.lang.Object customDictionary9,
    @Optional java.lang.Object customDictionary10);


  /**
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(152)
  void insertParagraphBefore();


  /**
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(153)
  void nextSubdocument();


  /**
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(154)
  void previousSubdocument();


  /**
   * @param conversionsMode Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fastConversion Optional parameter. Default value is com4j.Variant.getMissing()
   * @param checkHangulEnding Optional parameter. Default value is com4j.Variant.getMissing()
   * @param enableRecentOrdering Optional parameter. Default value is com4j.Variant.getMissing()
   * @param customDictionary Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(155)
  void convertHangulAndHanja(
    @Optional java.lang.Object conversionsMode,
    @Optional java.lang.Object fastConversion,
    @Optional java.lang.Object checkHangulEnding,
    @Optional java.lang.Object enableRecentOrdering,
    @Optional java.lang.Object customDictionary);


  /**
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(156)
  void pasteAsNestedTable();


  /**
   * @param style Mandatory java.lang.Object parameter.
   * @param symbol Optional parameter. Default value is com4j.Variant.getMissing()
   * @param enclosedText Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(223) //= 0xdf. The runtime will prefer the VTID if present
  @VTID(157)
  void modifyEnclosure(
    java.lang.Object style,
    @Optional java.lang.Object symbol,
    @Optional java.lang.Object enclosedText);


  /**
   * @param text Mandatory java.lang.String parameter.
   * @param alignment Optional parameter. Default value is -1
   * @param raise Optional parameter. Default value is 0
   * @param fontSize Optional parameter. Default value is 0
   * @param fontName Optional parameter. Default value is ""
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(158)
  void phoneticGuide(
    java.lang.String text,
    @Optional @DefaultValue("-1") word.WdPhoneticGuideAlignmentType alignment,
    @Optional @DefaultValue("0") int raise,
    @Optional @DefaultValue("0") int fontSize,
    @Optional @DefaultValue("") java.lang.String fontName);


  /**
   * @param dateTimeFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param insertAsField Optional parameter. Default value is com4j.Variant.getMissing()
   * @param insertAsFullWidth Optional parameter. Default value is com4j.Variant.getMissing()
   * @param dateLanguage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param calendarType Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(444) //= 0x1bc. The runtime will prefer the VTID if present
  @VTID(159)
  void insertDateTime(
    @Optional java.lang.Object dateTimeFormat,
    @Optional java.lang.Object insertAsField,
    @Optional java.lang.Object insertAsFullWidth,
    @Optional java.lang.Object dateLanguage,
    @Optional java.lang.Object calendarType);


  /**
   * @param excludeHeader Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fieldNumber Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortFieldType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortOrder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fieldNumber2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortFieldType2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortOrder2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fieldNumber3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortFieldType3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortOrder3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortColumn Optional parameter. Default value is com4j.Variant.getMissing()
   * @param separator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param caseSensitive Optional parameter. Default value is com4j.Variant.getMissing()
   * @param bidiSort Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreThe Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreKashida Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreDiacritics Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreHe Optional parameter. Default value is com4j.Variant.getMissing()
   * @param languageID Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(484) //= 0x1e4. The runtime will prefer the VTID if present
  @VTID(160)
  void sort(
    @Optional java.lang.Object excludeHeader,
    @Optional java.lang.Object fieldNumber,
    @Optional java.lang.Object sortFieldType,
    @Optional java.lang.Object sortOrder,
    @Optional java.lang.Object fieldNumber2,
    @Optional java.lang.Object sortFieldType2,
    @Optional java.lang.Object sortOrder2,
    @Optional java.lang.Object fieldNumber3,
    @Optional java.lang.Object sortFieldType3,
    @Optional java.lang.Object sortOrder3,
    @Optional java.lang.Object sortColumn,
    @Optional java.lang.Object separator,
    @Optional java.lang.Object caseSensitive,
    @Optional java.lang.Object bidiSort,
    @Optional java.lang.Object ignoreThe,
    @Optional java.lang.Object ignoreKashida,
    @Optional java.lang.Object ignoreDiacritics,
    @Optional java.lang.Object ignoreHe,
    @Optional java.lang.Object languageID);


  /**
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(161)
  void detectLanguage();


  /**
   * @param separator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param numRows Optional parameter. Default value is com4j.Variant.getMissing()
   * @param numColumns Optional parameter. Default value is com4j.Variant.getMissing()
   * @param initialColumnWidth Optional parameter. Default value is com4j.Variant.getMissing()
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyBorders Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyShading Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyFont Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyColor Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyHeadingRows Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyLastRow Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyFirstColumn Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyLastColumn Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoFit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoFitBehavior Optional parameter. Default value is com4j.Variant.getMissing()
   * @param defaultTableBehavior Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Table
   */

  @DISPID(498) //= 0x1f2. The runtime will prefer the VTID if present
  @VTID(162)
  word.Table convertToTable(
    @Optional java.lang.Object separator,
    @Optional java.lang.Object numRows,
    @Optional java.lang.Object numColumns,
    @Optional java.lang.Object initialColumnWidth,
    @Optional java.lang.Object format,
    @Optional java.lang.Object applyBorders,
    @Optional java.lang.Object applyShading,
    @Optional java.lang.Object applyFont,
    @Optional java.lang.Object applyColor,
    @Optional java.lang.Object applyHeadingRows,
    @Optional java.lang.Object applyLastRow,
    @Optional java.lang.Object applyFirstColumn,
    @Optional java.lang.Object applyLastColumn,
    @Optional java.lang.Object autoFit,
    @Optional java.lang.Object autoFitBehavior,
    @Optional java.lang.Object defaultTableBehavior);


  /**
   * @param wdTCSCConverterDirection Optional parameter. Default value is 2
   * @param commonTerms Optional parameter. Default value is false
   * @param useVariants Optional parameter. Default value is false
   */

  @DISPID(499) //= 0x1f3. The runtime will prefer the VTID if present
  @VTID(163)
  void tcscConverter(
    @Optional @DefaultValue("2") word.WdTCSCConverterDirection wdTCSCConverterDirection,
    @Optional @DefaultValue("0") boolean commonTerms,
    @Optional @DefaultValue("0") boolean useVariants);


  /**
   * <p>
   * Getter method for the COM property "LanguageDetected"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(263) //= 0x107. The runtime will prefer the VTID if present
  @VTID(164)
  boolean languageDetected();


  /**
   * <p>
   * Setter method for the COM property "LanguageDetected"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(263) //= 0x107. The runtime will prefer the VTID if present
  @VTID(165)
  void languageDetected(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "FitTextWidth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(264) //= 0x108. The runtime will prefer the VTID if present
  @VTID(166)
  float fitTextWidth();


  /**
   * <p>
   * Setter method for the COM property "FitTextWidth"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(264) //= 0x108. The runtime will prefer the VTID if present
  @VTID(167)
  void fitTextWidth(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "HorizontalInVertical"
   * </p>
   * @return  Returns a value of type word.WdHorizontalInVerticalType
   */

  @DISPID(265) //= 0x109. The runtime will prefer the VTID if present
  @VTID(168)
  word.WdHorizontalInVerticalType horizontalInVertical();


  /**
   * <p>
   * Setter method for the COM property "HorizontalInVertical"
   * </p>
   * @param prop Mandatory word.WdHorizontalInVerticalType parameter.
   */

  @DISPID(265) //= 0x109. The runtime will prefer the VTID if present
  @VTID(169)
  void horizontalInVertical(
    word.WdHorizontalInVerticalType prop);


  /**
   * <p>
   * Getter method for the COM property "TwoLinesInOne"
   * </p>
   * @return  Returns a value of type word.WdTwoLinesInOneType
   */

  @DISPID(266) //= 0x10a. The runtime will prefer the VTID if present
  @VTID(170)
  word.WdTwoLinesInOneType twoLinesInOne();


  /**
   * <p>
   * Setter method for the COM property "TwoLinesInOne"
   * </p>
   * @param prop Mandatory word.WdTwoLinesInOneType parameter.
   */

  @DISPID(266) //= 0x10a. The runtime will prefer the VTID if present
  @VTID(171)
  void twoLinesInOne(
    word.WdTwoLinesInOneType prop);


  /**
   * <p>
   * Getter method for the COM property "CombineCharacters"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(267) //= 0x10b. The runtime will prefer the VTID if present
  @VTID(172)
  boolean combineCharacters();


  /**
   * <p>
   * Setter method for the COM property "CombineCharacters"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(267) //= 0x10b. The runtime will prefer the VTID if present
  @VTID(173)
  void combineCharacters(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "NoProofing"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(323) //= 0x143. The runtime will prefer the VTID if present
  @VTID(174)
  int noProofing();


  /**
   * <p>
   * Setter method for the COM property "NoProofing"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(323) //= 0x143. The runtime will prefer the VTID if present
  @VTID(175)
  void noProofing(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "TopLevelTables"
   * </p>
   * @return  Returns a value of type word.Tables
   */

  @DISPID(324) //= 0x144. The runtime will prefer the VTID if present
  @VTID(176)
  word.Tables topLevelTables();


  @VTID(176)
  @ReturnValue(defaultPropertyThrough={word.Tables.class})
  word.Table topLevelTables(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Scripts"
   * </p>
   * @return  Returns a value of type office.Scripts
   */

  @DISPID(325) //= 0x145. The runtime will prefer the VTID if present
  @VTID(177)
  office.Scripts scripts();


  @VTID(177)
  @ReturnValue(defaultPropertyThrough={office.Scripts.class})
  office.Script scripts(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "CharacterWidth"
   * </p>
   * @return  Returns a value of type word.WdCharacterWidth
   */

  @DISPID(326) //= 0x146. The runtime will prefer the VTID if present
  @VTID(178)
  word.WdCharacterWidth characterWidth();


  /**
   * <p>
   * Setter method for the COM property "CharacterWidth"
   * </p>
   * @param prop Mandatory word.WdCharacterWidth parameter.
   */

  @DISPID(326) //= 0x146. The runtime will prefer the VTID if present
  @VTID(179)
  void characterWidth(
    word.WdCharacterWidth prop);


  /**
   * <p>
   * Getter method for the COM property "Kana"
   * </p>
   * @return  Returns a value of type word.WdKana
   */

  @DISPID(327) //= 0x147. The runtime will prefer the VTID if present
  @VTID(180)
  word.WdKana kana();


  /**
   * <p>
   * Setter method for the COM property "Kana"
   * </p>
   * @param prop Mandatory word.WdKana parameter.
   */

  @DISPID(327) //= 0x147. The runtime will prefer the VTID if present
  @VTID(181)
  void kana(
    word.WdKana prop);


  /**
   * <p>
   * Getter method for the COM property "BoldBi"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(400) //= 0x190. The runtime will prefer the VTID if present
  @VTID(182)
  int boldBi();


  /**
   * <p>
   * Setter method for the COM property "BoldBi"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(400) //= 0x190. The runtime will prefer the VTID if present
  @VTID(183)
  void boldBi(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "ItalicBi"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(184)
  int italicBi();


  /**
   * <p>
   * Setter method for the COM property "ItalicBi"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(185)
  void italicBi(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(405) //= 0x195. The runtime will prefer the VTID if present
  @VTID(186)
  java.lang.String id();


  /**
   * <p>
   * Setter method for the COM property "ID"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(405) //= 0x195. The runtime will prefer the VTID if present
  @VTID(187)
  void id(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "HTMLDivisions"
   * </p>
   * @return  Returns a value of type word.HTMLDivisions
   */

  @DISPID(406) //= 0x196. The runtime will prefer the VTID if present
  @VTID(188)
  word.HTMLDivisions htmlDivisions();


  @VTID(188)
  @ReturnValue(defaultPropertyThrough={word.HTMLDivisions.class})
  word.HTMLDivision htmlDivisions(
    int index);

  /**
   * <p>
   * Getter method for the COM property "SmartTags"
   * </p>
   * @return  Returns a value of type word.SmartTags
   */

  @DISPID(407) //= 0x197. The runtime will prefer the VTID if present
  @VTID(189)
  word.SmartTags smartTags();


  @VTID(189)
  @ReturnValue(defaultPropertyThrough={word.SmartTags.class})
  word.SmartTag smartTags(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "ShowAll"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(408) //= 0x198. The runtime will prefer the VTID if present
  @VTID(190)
  boolean showAll();


  /**
   * <p>
   * Setter method for the COM property "ShowAll"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(408) //= 0x198. The runtime will prefer the VTID if present
  @VTID(191)
  void showAll(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of type word._Document
   */

  @DISPID(409) //= 0x199. The runtime will prefer the VTID if present
  @VTID(192)
  word._Document document();


  /**
   * <p>
   * Getter method for the COM property "FootnoteOptions"
   * </p>
   * @return  Returns a value of type word.FootnoteOptions
   */

  @DISPID(410) //= 0x19a. The runtime will prefer the VTID if present
  @VTID(193)
  word.FootnoteOptions footnoteOptions();


  /**
   * <p>
   * Getter method for the COM property "EndnoteOptions"
   * </p>
   * @return  Returns a value of type word.EndnoteOptions
   */

  @DISPID(411) //= 0x19b. The runtime will prefer the VTID if present
  @VTID(194)
  word.EndnoteOptions endnoteOptions();


  /**
   * @param type Mandatory word.WdRecoveryType parameter.
   */

  @DISPID(412) //= 0x19c. The runtime will prefer the VTID if present
  @VTID(195)
  void pasteAndFormat(
    word.WdRecoveryType type);


  /**
   * @param linkedToExcel Mandatory boolean parameter.
   * @param wordFormatting Mandatory boolean parameter.
   * @param rtf Mandatory boolean parameter.
   */

  @DISPID(413) //= 0x19d. The runtime will prefer the VTID if present
  @VTID(196)
  void pasteExcelTable(
    boolean linkedToExcel,
    boolean wordFormatting,
    boolean rtf);


  /**
   */

  @DISPID(414) //= 0x19e. The runtime will prefer the VTID if present
  @VTID(197)
  void pasteAppendTable();


  /**
   * <p>
   * Getter method for the COM property "XMLNodes"
   * </p>
   * @return  Returns a value of type word.XMLNodes
   */

  @DISPID(340) //= 0x154. The runtime will prefer the VTID if present
  @VTID(198)
  word.XMLNodes xmlNodes();


  @VTID(198)
  @ReturnValue(defaultPropertyThrough={word.XMLNodes.class})
  word.XMLNode xmlNodes(
    int index);

  /**
   * <p>
   * Getter method for the COM property "XMLParentNode"
   * </p>
   * @return  Returns a value of type word.XMLNode
   */

  @DISPID(341) //= 0x155. The runtime will prefer the VTID if present
  @VTID(199)
  word.XMLNode xmlParentNode();


  /**
   * <p>
   * Getter method for the COM property "Editors"
   * </p>
   * @return  Returns a value of type word.Editors
   */

  @DISPID(343) //= 0x157. The runtime will prefer the VTID if present
  @VTID(200)
  word.Editors editors();


  @VTID(200)
  @ReturnValue(defaultPropertyThrough={word.Editors.class})
  word.Editor editors(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "XML"
   * </p>
   * @param dataOnly Optional parameter. Default value is false
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(344) //= 0x158. The runtime will prefer the VTID if present
  @VTID(201)
  java.lang.String xml(
    @Optional @DefaultValue("0") boolean dataOnly);


  /**
   * <p>
   * Getter method for the COM property "EnhMetaFileBits"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(345) //= 0x159. The runtime will prefer the VTID if present
  @VTID(202)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object enhMetaFileBits();


  /**
   * @param editorID Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Range
   */

  @DISPID(415) //= 0x19f. The runtime will prefer the VTID if present
  @VTID(203)
  word.Range goToEditableRange(
    @Optional java.lang.Object editorID);


  /**
   * @param xml Mandatory java.lang.String parameter.
   * @param transform Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(416) //= 0x1a0. The runtime will prefer the VTID if present
  @VTID(204)
  void insertXML(
    java.lang.String xml,
    @Optional java.lang.Object transform);


  /**
   * @param label Mandatory java.lang.Object parameter.
   * @param title Optional parameter. Default value is com4j.Variant.getMissing()
   * @param titleAutoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param position Optional parameter. Default value is com4j.Variant.getMissing()
   * @param excludeLabel Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(417) //= 0x1a1. The runtime will prefer the VTID if present
  @VTID(205)
  void insertCaption(
    java.lang.Object label,
    @Optional java.lang.Object title,
    @Optional java.lang.Object titleAutoText,
    @Optional java.lang.Object position,
    @Optional java.lang.Object excludeLabel);


  /**
   * @param referenceType Mandatory java.lang.Object parameter.
   * @param referenceKind Mandatory word.WdReferenceKind parameter.
   * @param referenceItem Mandatory java.lang.Object parameter.
   * @param insertAsHyperlink Optional parameter. Default value is com4j.Variant.getMissing()
   * @param includePosition Optional parameter. Default value is com4j.Variant.getMissing()
   * @param separateNumbers Optional parameter. Default value is com4j.Variant.getMissing()
   * @param separatorString Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(418) //= 0x1a2. The runtime will prefer the VTID if present
  @VTID(206)
  void insertCrossReference(
    java.lang.Object referenceType,
    word.WdReferenceKind referenceKind,
    java.lang.Object referenceItem,
    @Optional java.lang.Object insertAsHyperlink,
    @Optional java.lang.Object includePosition,
    @Optional java.lang.Object separateNumbers,
    @Optional java.lang.Object separatorString);


  /**
   * <p>
   * Getter method for the COM property "OMaths"
   * </p>
   * @return  Returns a value of type word.OMaths
   */

  @DISPID(346) //= 0x15a. The runtime will prefer the VTID if present
  @VTID(207)
  word.OMaths oMaths();


  @VTID(207)
  @ReturnValue(defaultPropertyThrough={word.OMaths.class})
  word.OMath oMaths(
    int index);

  /**
   * <p>
   * Getter method for the COM property "CharacterStyle"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(420) //= 0x1a4. The runtime will prefer the VTID if present
  @VTID(208)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object characterStyle();


  /**
   * <p>
   * Getter method for the COM property "ParagraphStyle"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(421) //= 0x1a5. The runtime will prefer the VTID if present
  @VTID(209)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object paragraphStyle();


  /**
   * <p>
   * Getter method for the COM property "ListStyle"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(422) //= 0x1a6. The runtime will prefer the VTID if present
  @VTID(210)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object listStyle();


  /**
   * <p>
   * Getter method for the COM property "TableStyle"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(423) //= 0x1a7. The runtime will prefer the VTID if present
  @VTID(211)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object tableStyle();


  /**
   * <p>
   * Getter method for the COM property "ContentControls"
   * </p>
   * @return  Returns a value of type word.ContentControls
   */

  @DISPID(424) //= 0x1a8. The runtime will prefer the VTID if present
  @VTID(212)
  word.ContentControls contentControls();


  @VTID(212)
  @ReturnValue(defaultPropertyThrough={word.ContentControls.class})
  word.ContentControl contentControls(
    java.lang.Object index);

  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param format Mandatory word.WdSaveFormat parameter.
   */

  @DISPID(425) //= 0x1a9. The runtime will prefer the VTID if present
  @VTID(213)
  void exportFragment(
    java.lang.String fileName,
    word.WdSaveFormat format);


  /**
   * <p>
   * Getter method for the COM property "WordOpenXML"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(426) //= 0x1aa. The runtime will prefer the VTID if present
  @VTID(214)
  java.lang.String wordOpenXML();


  /**
   * @param level Mandatory short parameter.
   */

  @DISPID(427) //= 0x1ab. The runtime will prefer the VTID if present
  @VTID(215)
  void setListLevel(
    short level);


  /**
   * @param alignment Mandatory int parameter.
   * @param relativeTo Optional parameter. Default value is 0
   */

  @DISPID(500) //= 0x1f4. The runtime will prefer the VTID if present
  @VTID(216)
  void insertAlignmentTab(
    int alignment,
    @Optional @DefaultValue("0") int relativeTo);


  /**
   * <p>
   * Getter method for the COM property "ParentContentControl"
   * </p>
   * @return  Returns a value of type word.ContentControl
   */

  @DISPID(501) //= 0x1f5. The runtime will prefer the VTID if present
  @VTID(217)
  word.ContentControl parentContentControl();


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param matchDestination Optional parameter. Default value is false
   */

  @DISPID(502) //= 0x1f6. The runtime will prefer the VTID if present
  @VTID(218)
  void importFragment(
    java.lang.String fileName,
    @Optional @DefaultValue("0") boolean matchDestination);


  /**
   * @param outputFileName Mandatory java.lang.String parameter.
   * @param exportFormat Mandatory word.WdExportFormat parameter.
   * @param openAfterExport Optional parameter. Default value is false
   * @param optimizeFor Optional parameter. Default value is 0
   * @param exportCurrentPage Optional parameter. Default value is false
   * @param item Optional parameter. Default value is 0
   * @param includeDocProps Optional parameter. Default value is false
   * @param keepIRM Optional parameter. Default value is false
   * @param createBookmarks Optional parameter. Default value is 0
   * @param docStructureTags Optional parameter. Default value is false
   * @param bitmapMissingFonts Optional parameter. Default value is false
   * @param useISO19005_1 Optional parameter. Default value is false
   * @param fixedFormatExtClassPtr Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(503) //= 0x1f7. The runtime will prefer the VTID if present
  @VTID(219)
  void exportAsFixedFormat(
    java.lang.String outputFileName,
    word.WdExportFormat exportFormat,
    @Optional @DefaultValue("0") boolean openAfterExport,
    @Optional @DefaultValue("0") word.WdExportOptimizeFor optimizeFor,
    @Optional @DefaultValue("0") boolean exportCurrentPage,
    @Optional @DefaultValue("0") word.WdExportItem item,
    @Optional @DefaultValue("0") boolean includeDocProps,
    @Optional @DefaultValue("-1") boolean keepIRM,
    @Optional @DefaultValue("0") word.WdExportCreateBookmarks createBookmarks,
    @Optional @DefaultValue("-1") boolean docStructureTags,
    @Optional @DefaultValue("-1") boolean bitmapMissingFonts,
    @Optional @DefaultValue("0") boolean useISO19005_1,
    @Optional java.lang.Object fixedFormatExtClassPtr);


  /**
   * <p>
   * Getter method for the COM property "Locks"
   * </p>
   * @return  Returns a value of type word.CoAuthLocks
   */

  @DISPID(504) //= 0x1f8. The runtime will prefer the VTID if present
  @VTID(220)
  word.CoAuthLocks locks();


  @VTID(220)
  @ReturnValue(defaultPropertyThrough={word.CoAuthLocks.class})
  word.CoAuthLock locks(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Updates"
   * </p>
   * @return  Returns a value of type word.CoAuthUpdates
   */

  @DISPID(505) //= 0x1f9. The runtime will prefer the VTID if present
  @VTID(221)
  word.CoAuthUpdates updates();


  @VTID(221)
  @ReturnValue(defaultPropertyThrough={word.CoAuthUpdates.class})
  word.CoAuthUpdate updates(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Conflicts"
   * </p>
   * @return  Returns a value of type word.Conflicts
   */

  @DISPID(506) //= 0x1fa. The runtime will prefer the VTID if present
  @VTID(222)
  word.Conflicts conflicts();


  @VTID(222)
  @ReturnValue(defaultPropertyThrough={word.Conflicts.class})
  word.Conflict conflicts(
    int index);

  // Properties:
}
