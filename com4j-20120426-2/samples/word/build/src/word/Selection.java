package word  ;

import com4j.*;

@IID("{00020975-0000-0000-C000-000000000046}")
public interface Selection extends Com4jObject {
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
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type word.WdSelectionType
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  word.WdSelectionType type();


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
   * Getter method for the COM property "Style"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object style();


  /**
   * <p>
   * Setter method for the COM property "Style"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(20)
  void style(
    java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "Tables"
   * </p>
   * @return  Returns a value of type word.Tables
   */

  @DISPID(50) //= 0x32. The runtime will prefer the VTID if present
  @VTID(21)
  word.Tables tables();


  @VTID(21)
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
  @VTID(22)
  word.Words words();


  @VTID(22)
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
  @VTID(23)
  word.Sentences sentences();


  @VTID(23)
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
  @VTID(24)
  word.Characters characters();


  @VTID(24)
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
  @VTID(25)
  word.Footnotes footnotes();


  @VTID(25)
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
  @VTID(26)
  word.Endnotes endnotes();


  @VTID(26)
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
  @VTID(27)
  word.Comments comments();


  @VTID(27)
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
  @VTID(28)
  word.Cells cells();


  @VTID(28)
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
  @VTID(29)
  word.Sections sections();


  @VTID(29)
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
  @VTID(30)
  word.Paragraphs paragraphs();


  @VTID(30)
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
  @VTID(31)
  word.Borders borders();


  @VTID(31)
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
  @VTID(32)
  void borders(
    word.Borders prop);


  /**
   * <p>
   * Getter method for the COM property "Shading"
   * </p>
   * @return  Returns a value of type word.Shading
   */

  @DISPID(61) //= 0x3d. The runtime will prefer the VTID if present
  @VTID(33)
  word.Shading shading();


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
   * Getter method for the COM property "PageSetup"
   * </p>
   * @return  Returns a value of type word.PageSetup
   */

  @DISPID(1101) //= 0x44d. The runtime will prefer the VTID if present
  @VTID(39)
  word.PageSetup pageSetup();


  /**
   * <p>
   * Setter method for the COM property "PageSetup"
   * </p>
   * @param prop Mandatory word.PageSetup parameter.
   */

  @DISPID(1101) //= 0x44d. The runtime will prefer the VTID if present
  @VTID(40)
  void pageSetup(
    word.PageSetup prop);


  /**
   * <p>
   * Getter method for the COM property "Bookmarks"
   * </p>
   * @return  Returns a value of type word.Bookmarks
   */

  @DISPID(75) //= 0x4b. The runtime will prefer the VTID if present
  @VTID(41)
  word.Bookmarks bookmarks();


  @VTID(41)
  @ReturnValue(defaultPropertyThrough={word.Bookmarks.class})
  word.Bookmark bookmarks(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "StoryLength"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(152) //= 0x98. The runtime will prefer the VTID if present
  @VTID(42)
  int storyLength();


  /**
   * <p>
   * Getter method for the COM property "LanguageID"
   * </p>
   * @return  Returns a value of type word.WdLanguageID
   */

  @DISPID(153) //= 0x99. The runtime will prefer the VTID if present
  @VTID(43)
  word.WdLanguageID languageID();


  /**
   * <p>
   * Setter method for the COM property "LanguageID"
   * </p>
   * @param prop Mandatory word.WdLanguageID parameter.
   */

  @DISPID(153) //= 0x99. The runtime will prefer the VTID if present
  @VTID(44)
  void languageID(
    word.WdLanguageID prop);


  /**
   * <p>
   * Getter method for the COM property "LanguageIDFarEast"
   * </p>
   * @return  Returns a value of type word.WdLanguageID
   */

  @DISPID(154) //= 0x9a. The runtime will prefer the VTID if present
  @VTID(45)
  word.WdLanguageID languageIDFarEast();


  /**
   * <p>
   * Setter method for the COM property "LanguageIDFarEast"
   * </p>
   * @param prop Mandatory word.WdLanguageID parameter.
   */

  @DISPID(154) //= 0x9a. The runtime will prefer the VTID if present
  @VTID(46)
  void languageIDFarEast(
    word.WdLanguageID prop);


  /**
   * <p>
   * Getter method for the COM property "LanguageIDOther"
   * </p>
   * @return  Returns a value of type word.WdLanguageID
   */

  @DISPID(155) //= 0x9b. The runtime will prefer the VTID if present
  @VTID(47)
  word.WdLanguageID languageIDOther();


  /**
   * <p>
   * Setter method for the COM property "LanguageIDOther"
   * </p>
   * @param prop Mandatory word.WdLanguageID parameter.
   */

  @DISPID(155) //= 0x9b. The runtime will prefer the VTID if present
  @VTID(48)
  void languageIDOther(
    word.WdLanguageID prop);


  /**
   * <p>
   * Getter method for the COM property "Hyperlinks"
   * </p>
   * @return  Returns a value of type word.Hyperlinks
   */

  @DISPID(156) //= 0x9c. The runtime will prefer the VTID if present
  @VTID(49)
  word.Hyperlinks hyperlinks();


  @VTID(49)
  @ReturnValue(defaultPropertyThrough={word.Hyperlinks.class})
  word.Hyperlink hyperlinks(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Columns"
   * </p>
   * @return  Returns a value of type word.Columns
   */

  @DISPID(302) //= 0x12e. The runtime will prefer the VTID if present
  @VTID(50)
  word.Columns columns();


  @VTID(50)
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
  @VTID(51)
  word.Rows rows();


  @VTID(51)
  @ReturnValue(defaultPropertyThrough={word.Rows.class})
  word.Row rows(
    int index);

  /**
   * <p>
   * Getter method for the COM property "HeaderFooter"
   * </p>
   * @return  Returns a value of type word.HeaderFooter
   */

  @DISPID(306) //= 0x132. The runtime will prefer the VTID if present
  @VTID(52)
  word.HeaderFooter headerFooter();


  /**
   * <p>
   * Getter method for the COM property "IsEndOfRowMark"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(307) //= 0x133. The runtime will prefer the VTID if present
  @VTID(53)
  boolean isEndOfRowMark();


  /**
   * <p>
   * Getter method for the COM property "BookmarkID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(308) //= 0x134. The runtime will prefer the VTID if present
  @VTID(54)
  int bookmarkID();


  /**
   * <p>
   * Getter method for the COM property "PreviousBookmarkID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(309) //= 0x135. The runtime will prefer the VTID if present
  @VTID(55)
  int previousBookmarkID();


  /**
   * <p>
   * Getter method for the COM property "Find"
   * </p>
   * @return  Returns a value of type word.Find
   */

  @DISPID(262) //= 0x106. The runtime will prefer the VTID if present
  @VTID(56)
  word.Find find();


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(400) //= 0x190. The runtime will prefer the VTID if present
  @VTID(57)
  word.Range range();


  /**
   * <p>
   * Getter method for the COM property "Information"
   * </p>
   * @param type Mandatory word.WdInformation parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(58)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object information(
    word.WdInformation type);


  /**
   * <p>
   * Getter method for the COM property "Flags"
   * </p>
   * @return  Returns a value of type word.WdSelectionFlags
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(59)
  word.WdSelectionFlags flags();


  /**
   * <p>
   * Setter method for the COM property "Flags"
   * </p>
   * @param prop Mandatory word.WdSelectionFlags parameter.
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(60)
  void flags(
    word.WdSelectionFlags prop);


  /**
   * <p>
   * Getter method for the COM property "Active"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(61)
  boolean active();


  /**
   * <p>
   * Getter method for the COM property "StartIsActive"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(62)
  boolean startIsActive();


  /**
   * <p>
   * Setter method for the COM property "StartIsActive"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(63)
  void startIsActive(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "IPAtEndOfLine"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(405) //= 0x195. The runtime will prefer the VTID if present
  @VTID(64)
  boolean ipAtEndOfLine();


  /**
   * <p>
   * Getter method for the COM property "ExtendMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(406) //= 0x196. The runtime will prefer the VTID if present
  @VTID(65)
  boolean extendMode();


  /**
   * <p>
   * Setter method for the COM property "ExtendMode"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(406) //= 0x196. The runtime will prefer the VTID if present
  @VTID(66)
  void extendMode(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ColumnSelectMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(407) //= 0x197. The runtime will prefer the VTID if present
  @VTID(67)
  boolean columnSelectMode();


  /**
   * <p>
   * Setter method for the COM property "ColumnSelectMode"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(407) //= 0x197. The runtime will prefer the VTID if present
  @VTID(68)
  void columnSelectMode(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type word.WdTextOrientation
   */

  @DISPID(410) //= 0x19a. The runtime will prefer the VTID if present
  @VTID(69)
  word.WdTextOrientation orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param prop Mandatory word.WdTextOrientation parameter.
   */

  @DISPID(410) //= 0x19a. The runtime will prefer the VTID if present
  @VTID(70)
  void orientation(
    word.WdTextOrientation prop);


  /**
   * <p>
   * Getter method for the COM property "InlineShapes"
   * </p>
   * @return  Returns a value of type word.InlineShapes
   */

  @DISPID(411) //= 0x19b. The runtime will prefer the VTID if present
  @VTID(71)
  word.InlineShapes inlineShapes();


  @VTID(71)
  @ReturnValue(defaultPropertyThrough={word.InlineShapes.class})
  word.InlineShape inlineShapes(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(72)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(73)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(74)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of type word._Document
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(75)
  word._Document document();


  /**
   * <p>
   * Getter method for the COM property "ShapeRange"
   * </p>
   * @return  Returns a value of type word.ShapeRange
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(76)
  word.ShapeRange shapeRange();


  @VTID(76)
  @ReturnValue(defaultPropertyThrough={word.ShapeRange.class})
  word.Shape shapeRange(
    java.lang.Object index);

  /**
   */

  @DISPID(65535) //= 0xffff. The runtime will prefer the VTID if present
  @VTID(77)
  void select();


  /**
   * @param start Mandatory int parameter.
   * @param end Mandatory int parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(78)
  void setRange(
    int start,
    int end);


  /**
   * @param direction Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(79)
  void collapse(
    @Optional java.lang.Object direction);


  /**
   * @param text Mandatory java.lang.String parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(80)
  void insertBefore(
    java.lang.String text);


  /**
   * @param text Mandatory java.lang.String parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(81)
  void insertAfter(
    java.lang.String text);


  /**
   * @param unit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Range
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(82)
  word.Range next(
    @Optional java.lang.Object unit,
    @Optional java.lang.Object count);


  /**
   * @param unit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Range
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(83)
  word.Range previous(
    @Optional java.lang.Object unit,
    @Optional java.lang.Object count);


  /**
   * @param unit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param extend Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(84)
  int startOf(
    @Optional java.lang.Object unit,
    @Optional java.lang.Object extend);


  /**
   * @param unit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param extend Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(85)
  int endOf(
    @Optional java.lang.Object unit,
    @Optional java.lang.Object extend);


  /**
   * @param unit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(86)
  int move(
    @Optional java.lang.Object unit,
    @Optional java.lang.Object count);


  /**
   * @param unit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(87)
  int moveStart(
    @Optional java.lang.Object unit,
    @Optional java.lang.Object count);


  /**
   * @param unit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(88)
  int moveEnd(
    @Optional java.lang.Object unit,
    @Optional java.lang.Object count);


  /**
   * @param cset Mandatory java.lang.Object parameter.
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(89)
  int moveWhile(
    java.lang.Object cset,
    @Optional java.lang.Object count);


  /**
   * @param cset Mandatory java.lang.Object parameter.
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(90)
  int moveStartWhile(
    java.lang.Object cset,
    @Optional java.lang.Object count);


  /**
   * @param cset Mandatory java.lang.Object parameter.
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(91)
  int moveEndWhile(
    java.lang.Object cset,
    @Optional java.lang.Object count);


  /**
   * @param cset Mandatory java.lang.Object parameter.
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(92)
  int moveUntil(
    java.lang.Object cset,
    @Optional java.lang.Object count);


  /**
   * @param cset Mandatory java.lang.Object parameter.
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(93)
  int moveStartUntil(
    java.lang.Object cset,
    @Optional java.lang.Object count);


  /**
   * @param cset Mandatory java.lang.Object parameter.
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(94)
  int moveEndUntil(
    java.lang.Object cset,
    @Optional java.lang.Object count);


  /**
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(95)
  void cut();


  /**
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(96)
  void copy();


  /**
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(97)
  void paste();


  /**
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(98)
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
  @VTID(99)
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
  @VTID(100)
  boolean inStory(
    word.Range range);


  /**
   * @param range Mandatory word.Range parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(101)
  boolean inRange(
    word.Range range);


  /**
   * @param unit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(102)
  int delete(
    @Optional java.lang.Object unit,
    @Optional java.lang.Object count);


  /**
   * @param unit Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(129) //= 0x81. The runtime will prefer the VTID if present
  @VTID(103)
  int expand(
    @Optional java.lang.Object unit);


  /**
   */

  @DISPID(160) //= 0xa0. The runtime will prefer the VTID if present
  @VTID(104)
  void insertParagraph();


  /**
   */

  @DISPID(161) //= 0xa1. The runtime will prefer the VTID if present
  @VTID(105)
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
  @VTID(106)
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
  @VTID(107)
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
  @VTID(108)
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
  @VTID(109)
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
  @VTID(110)
  void insertCaptionXP(
    java.lang.Object label,
    @Optional java.lang.Object title,
    @Optional java.lang.Object titleAutoText,
    @Optional java.lang.Object position);


  /**
   */

  @DISPID(167) //= 0xa7. The runtime will prefer the VTID if present
  @VTID(111)
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
  @VTID(112)
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
  @VTID(113)
  void sortAscending();


  /**
   */

  @DISPID(170) //= 0xaa. The runtime will prefer the VTID if present
  @VTID(114)
  void sortDescending();


  /**
   * @param range Mandatory word.Range parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(171) //= 0xab. The runtime will prefer the VTID if present
  @VTID(115)
  boolean isEqual(
    word.Range range);


  /**
   * @return  Returns a value of type float
   */

  @DISPID(172) //= 0xac. The runtime will prefer the VTID if present
  @VTID(116)
  float calculate();


  /**
   * @param what Optional parameter. Default value is com4j.Variant.getMissing()
   * @param which Optional parameter. Default value is com4j.Variant.getMissing()
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Range
   */

  @DISPID(173) //= 0xad. The runtime will prefer the VTID if present
  @VTID(117)
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
  @VTID(118)
  word.Range goToNext(
    word.WdGoToItem what);


  /**
   * @param what Mandatory word.WdGoToItem parameter.
   * @return  Returns a value of type word.Range
   */

  @DISPID(175) //= 0xaf. The runtime will prefer the VTID if present
  @VTID(119)
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
  @VTID(120)
  void pasteSpecial(
    @Optional java.lang.Object iconIndex,
    @Optional java.lang.Object link,
    @Optional java.lang.Object placement,
    @Optional java.lang.Object displayAsIcon,
    @Optional java.lang.Object dataType,
    @Optional java.lang.Object iconFileName,
    @Optional java.lang.Object iconLabel);


  /**
   * @return  Returns a value of type word.Field
   */

  @DISPID(177) //= 0xb1. The runtime will prefer the VTID if present
  @VTID(121)
  word.Field previousField();


  /**
   * @return  Returns a value of type word.Field
   */

  @DISPID(178) //= 0xb2. The runtime will prefer the VTID if present
  @VTID(122)
  word.Field nextField();


  /**
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(123)
  void insertParagraphBefore();


  /**
   * @param shiftCells Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(124)
  void insertCells(
    @Optional java.lang.Object shiftCells);


  /**
   * @param character Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(300) //= 0x12c. The runtime will prefer the VTID if present
  @VTID(125)
  void extend(
    @Optional java.lang.Object character);


  /**
   */

  @DISPID(301) //= 0x12d. The runtime will prefer the VTID if present
  @VTID(126)
  void shrink();


  /**
   * @param unit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @param extend Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(500) //= 0x1f4. The runtime will prefer the VTID if present
  @VTID(127)
  int moveLeft(
    @Optional java.lang.Object unit,
    @Optional java.lang.Object count,
    @Optional java.lang.Object extend);


  /**
   * @param unit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @param extend Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(501) //= 0x1f5. The runtime will prefer the VTID if present
  @VTID(128)
  int moveRight(
    @Optional java.lang.Object unit,
    @Optional java.lang.Object count,
    @Optional java.lang.Object extend);


  /**
   * @param unit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @param extend Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(502) //= 0x1f6. The runtime will prefer the VTID if present
  @VTID(129)
  int moveUp(
    @Optional java.lang.Object unit,
    @Optional java.lang.Object count,
    @Optional java.lang.Object extend);


  /**
   * @param unit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @param extend Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(503) //= 0x1f7. The runtime will prefer the VTID if present
  @VTID(130)
  int moveDown(
    @Optional java.lang.Object unit,
    @Optional java.lang.Object count,
    @Optional java.lang.Object extend);


  /**
   * @param unit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param extend Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(504) //= 0x1f8. The runtime will prefer the VTID if present
  @VTID(131)
  int homeKey(
    @Optional java.lang.Object unit,
    @Optional java.lang.Object extend);


  /**
   * @param unit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param extend Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(505) //= 0x1f9. The runtime will prefer the VTID if present
  @VTID(132)
  int endKey(
    @Optional java.lang.Object unit,
    @Optional java.lang.Object extend);


  /**
   */

  @DISPID(506) //= 0x1fa. The runtime will prefer the VTID if present
  @VTID(133)
  void escapeKey();


  /**
   * @param text Mandatory java.lang.String parameter.
   */

  @DISPID(507) //= 0x1fb. The runtime will prefer the VTID if present
  @VTID(134)
  void typeText(
    java.lang.String text);


  /**
   */

  @DISPID(509) //= 0x1fd. The runtime will prefer the VTID if present
  @VTID(135)
  void copyFormat();


  /**
   */

  @DISPID(510) //= 0x1fe. The runtime will prefer the VTID if present
  @VTID(136)
  void pasteFormat();


  /**
   */

  @DISPID(512) //= 0x200. The runtime will prefer the VTID if present
  @VTID(137)
  void typeParagraph();


  /**
   */

  @DISPID(513) //= 0x201. The runtime will prefer the VTID if present
  @VTID(138)
  void typeBackspace();


  /**
   */

  @DISPID(514) //= 0x202. The runtime will prefer the VTID if present
  @VTID(139)
  void nextSubdocument();


  /**
   */

  @DISPID(515) //= 0x203. The runtime will prefer the VTID if present
  @VTID(140)
  void previousSubdocument();


  /**
   */

  @DISPID(516) //= 0x204. The runtime will prefer the VTID if present
  @VTID(141)
  void selectColumn();


  /**
   */

  @DISPID(517) //= 0x205. The runtime will prefer the VTID if present
  @VTID(142)
  void selectCurrentFont();


  /**
   */

  @DISPID(518) //= 0x206. The runtime will prefer the VTID if present
  @VTID(143)
  void selectCurrentAlignment();


  /**
   */

  @DISPID(519) //= 0x207. The runtime will prefer the VTID if present
  @VTID(144)
  void selectCurrentSpacing();


  /**
   */

  @DISPID(520) //= 0x208. The runtime will prefer the VTID if present
  @VTID(145)
  void selectCurrentIndent();


  /**
   */

  @DISPID(521) //= 0x209. The runtime will prefer the VTID if present
  @VTID(146)
  void selectCurrentTabs();


  /**
   */

  @DISPID(522) //= 0x20a. The runtime will prefer the VTID if present
  @VTID(147)
  void selectCurrentColor();


  /**
   */

  @DISPID(523) //= 0x20b. The runtime will prefer the VTID if present
  @VTID(148)
  void createTextbox();


  /**
   */

  @DISPID(524) //= 0x20c. The runtime will prefer the VTID if present
  @VTID(149)
  void wholeStory();


  /**
   */

  @DISPID(525) //= 0x20d. The runtime will prefer the VTID if present
  @VTID(150)
  void selectRow();


  /**
   */

  @DISPID(526) //= 0x20e. The runtime will prefer the VTID if present
  @VTID(151)
  void splitTable();


  /**
   * @param numRows Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(528) //= 0x210. The runtime will prefer the VTID if present
  @VTID(152)
  void insertRows(
    @Optional java.lang.Object numRows);


  /**
   */

  @DISPID(529) //= 0x211. The runtime will prefer the VTID if present
  @VTID(153)
  void insertColumns();


  /**
   * @param formula Optional parameter. Default value is com4j.Variant.getMissing()
   * @param numberFormat Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(530) //= 0x212. The runtime will prefer the VTID if present
  @VTID(154)
  void insertFormula(
    @Optional java.lang.Object formula,
    @Optional java.lang.Object numberFormat);


  /**
   * @param wrap Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Revision
   */

  @DISPID(531) //= 0x213. The runtime will prefer the VTID if present
  @VTID(155)
  word.Revision nextRevision(
    @Optional java.lang.Object wrap);


  /**
   * @param wrap Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Revision
   */

  @DISPID(532) //= 0x214. The runtime will prefer the VTID if present
  @VTID(156)
  word.Revision previousRevision(
    @Optional java.lang.Object wrap);


  /**
   */

  @DISPID(533) //= 0x215. The runtime will prefer the VTID if present
  @VTID(157)
  void pasteAsNestedTable();


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param styleName Mandatory java.lang.String parameter.
   * @return  Returns a value of type word.AutoTextEntry
   */

  @DISPID(534) //= 0x216. The runtime will prefer the VTID if present
  @VTID(158)
  word.AutoTextEntry createAutoTextEntry(
    java.lang.String name,
    java.lang.String styleName);


  /**
   */

  @DISPID(535) //= 0x217. The runtime will prefer the VTID if present
  @VTID(159)
  void detectLanguage();


  /**
   */

  @DISPID(536) //= 0x218. The runtime will prefer the VTID if present
  @VTID(160)
  void selectCell();


  /**
   * @param numRows Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(537) //= 0x219. The runtime will prefer the VTID if present
  @VTID(161)
  void insertRowsBelow(
    @Optional java.lang.Object numRows);


  /**
   */

  @DISPID(538) //= 0x21a. The runtime will prefer the VTID if present
  @VTID(162)
  void insertColumnsRight();


  /**
   * @param numRows Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(539) //= 0x21b. The runtime will prefer the VTID if present
  @VTID(163)
  void insertRowsAbove(
    @Optional java.lang.Object numRows);


  /**
   */

  @DISPID(600) //= 0x258. The runtime will prefer the VTID if present
  @VTID(164)
  void rtlRun();


  /**
   */

  @DISPID(601) //= 0x259. The runtime will prefer the VTID if present
  @VTID(165)
  void ltrRun();


  /**
   */

  @DISPID(602) //= 0x25a. The runtime will prefer the VTID if present
  @VTID(166)
  void boldRun();


  /**
   */

  @DISPID(603) //= 0x25b. The runtime will prefer the VTID if present
  @VTID(167)
  void italicRun();


  /**
   */

  @DISPID(605) //= 0x25d. The runtime will prefer the VTID if present
  @VTID(168)
  void rtlPara();


  /**
   */

  @DISPID(606) //= 0x25e. The runtime will prefer the VTID if present
  @VTID(169)
  void ltrPara();


  /**
   * @param dateTimeFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param insertAsField Optional parameter. Default value is com4j.Variant.getMissing()
   * @param insertAsFullWidth Optional parameter. Default value is com4j.Variant.getMissing()
   * @param dateLanguage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param calendarType Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(444) //= 0x1bc. The runtime will prefer the VTID if present
  @VTID(170)
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

  @DISPID(445) //= 0x1bd. The runtime will prefer the VTID if present
  @VTID(171)
  void sort2000(
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

  @DISPID(457) //= 0x1c9. The runtime will prefer the VTID if present
  @VTID(172)
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
   * <p>
   * Getter method for the COM property "NoProofing"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(173)
  int noProofing();


  /**
   * <p>
   * Setter method for the COM property "NoProofing"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(174)
  void noProofing(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "TopLevelTables"
   * </p>
   * @return  Returns a value of type word.Tables
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(175)
  word.Tables topLevelTables();


  @VTID(175)
  @ReturnValue(defaultPropertyThrough={word.Tables.class})
  word.Table topLevelTables(
    int index);

  /**
   * <p>
   * Getter method for the COM property "LanguageDetected"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(176)
  boolean languageDetected();


  /**
   * <p>
   * Setter method for the COM property "LanguageDetected"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(177)
  void languageDetected(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "FitTextWidth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(178)
  float fitTextWidth();


  /**
   * <p>
   * Setter method for the COM property "FitTextWidth"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(179)
  void fitTextWidth(
    float prop);


  /**
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(180)
  void clearFormatting();


  /**
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(181)
  void pasteAppendTable();


  /**
   * <p>
   * Getter method for the COM property "HTMLDivisions"
   * </p>
   * @return  Returns a value of type word.HTMLDivisions
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(182)
  word.HTMLDivisions htmlDivisions();


  @VTID(182)
  @ReturnValue(defaultPropertyThrough={word.HTMLDivisions.class})
  word.HTMLDivision htmlDivisions(
    int index);

  /**
   * <p>
   * Getter method for the COM property "SmartTags"
   * </p>
   * @return  Returns a value of type word.SmartTags
   */

  @DISPID(1015) //= 0x3f7. The runtime will prefer the VTID if present
  @VTID(183)
  word.SmartTags smartTags();


  @VTID(183)
  @ReturnValue(defaultPropertyThrough={word.SmartTags.class})
  word.SmartTag smartTags(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "ChildShapeRange"
   * </p>
   * @return  Returns a value of type word.ShapeRange
   */

  @DISPID(1021) //= 0x3fd. The runtime will prefer the VTID if present
  @VTID(184)
  word.ShapeRange childShapeRange();


  @VTID(184)
  @ReturnValue(defaultPropertyThrough={word.ShapeRange.class})
  word.Shape childShapeRange(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "HasChildShapeRange"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1022) //= 0x3fe. The runtime will prefer the VTID if present
  @VTID(185)
  boolean hasChildShapeRange();


  /**
   * <p>
   * Getter method for the COM property "FootnoteOptions"
   * </p>
   * @return  Returns a value of type word.FootnoteOptions
   */

  @DISPID(1024) //= 0x400. The runtime will prefer the VTID if present
  @VTID(186)
  word.FootnoteOptions footnoteOptions();


  /**
   * <p>
   * Getter method for the COM property "EndnoteOptions"
   * </p>
   * @return  Returns a value of type word.EndnoteOptions
   */

  @DISPID(1025) //= 0x401. The runtime will prefer the VTID if present
  @VTID(187)
  word.EndnoteOptions endnoteOptions();


  /**
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(188)
  void toggleCharacterCode();


  /**
   * @param type Mandatory word.WdRecoveryType parameter.
   */

  @DISPID(1013) //= 0x3f5. The runtime will prefer the VTID if present
  @VTID(189)
  void pasteAndFormat(
    word.WdRecoveryType type);


  /**
   * @param linkedToExcel Mandatory boolean parameter.
   * @param wordFormatting Mandatory boolean parameter.
   * @param rtf Mandatory boolean parameter.
   */

  @DISPID(1014) //= 0x3f6. The runtime will prefer the VTID if present
  @VTID(190)
  void pasteExcelTable(
    boolean linkedToExcel,
    boolean wordFormatting,
    boolean rtf);


  /**
   */

  @DISPID(1019) //= 0x3fb. The runtime will prefer the VTID if present
  @VTID(191)
  void shrinkDiscontiguousSelection();


  /**
   */

  @DISPID(1020) //= 0x3fc. The runtime will prefer the VTID if present
  @VTID(192)
  void insertStyleSeparator();


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
   * @param subFieldNumber Optional parameter. Default value is com4j.Variant.getMissing()
   * @param subFieldNumber2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param subFieldNumber3 Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1023) //= 0x3ff. The runtime will prefer the VTID if present
  @VTID(193)
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
    @Optional java.lang.Object languageID,
    @Optional java.lang.Object subFieldNumber,
    @Optional java.lang.Object subFieldNumber2,
    @Optional java.lang.Object subFieldNumber3);


  /**
   * <p>
   * Getter method for the COM property "XMLNodes"
   * </p>
   * @return  Returns a value of type word.XMLNodes
   */

  @DISPID(310) //= 0x136. The runtime will prefer the VTID if present
  @VTID(194)
  word.XMLNodes xmlNodes();


  @VTID(194)
  @ReturnValue(defaultPropertyThrough={word.XMLNodes.class})
  word.XMLNode xmlNodes(
    int index);

  /**
   * <p>
   * Getter method for the COM property "XMLParentNode"
   * </p>
   * @return  Returns a value of type word.XMLNode
   */

  @DISPID(311) //= 0x137. The runtime will prefer the VTID if present
  @VTID(195)
  word.XMLNode xmlParentNode();


  /**
   * <p>
   * Getter method for the COM property "Editors"
   * </p>
   * @return  Returns a value of type word.Editors
   */

  @DISPID(313) //= 0x139. The runtime will prefer the VTID if present
  @VTID(196)
  word.Editors editors();


  @VTID(196)
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

  @DISPID(314) //= 0x13a. The runtime will prefer the VTID if present
  @VTID(197)
  java.lang.String xml(
    @Optional @DefaultValue("0") boolean dataOnly);


  /**
   * <p>
   * Getter method for the COM property "EnhMetaFileBits"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(315) //= 0x13b. The runtime will prefer the VTID if present
  @VTID(198)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object enhMetaFileBits();


  /**
   * @param editorID Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Range
   */

  @DISPID(1027) //= 0x403. The runtime will prefer the VTID if present
  @VTID(199)
  word.Range goToEditableRange(
    @Optional java.lang.Object editorID);


  /**
   * @param xml Mandatory java.lang.String parameter.
   * @param transform Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1028) //= 0x404. The runtime will prefer the VTID if present
  @VTID(200)
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
  @VTID(201)
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
  @VTID(202)
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

  @DISPID(316) //= 0x13c. The runtime will prefer the VTID if present
  @VTID(203)
  word.OMaths oMaths();


  @VTID(203)
  @ReturnValue(defaultPropertyThrough={word.OMaths.class})
  word.OMath oMaths(
    int index);

  /**
   * <p>
   * Getter method for the COM property "WordOpenXML"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(317) //= 0x13d. The runtime will prefer the VTID if present
  @VTID(204)
  java.lang.String wordOpenXML();


  /**
   */

  @DISPID(1030) //= 0x406. The runtime will prefer the VTID if present
  @VTID(205)
  void clearParagraphStyle();


  /**
   */

  @DISPID(1031) //= 0x407. The runtime will prefer the VTID if present
  @VTID(206)
  void clearCharacterAllFormatting();


  /**
   */

  @DISPID(1032) //= 0x408. The runtime will prefer the VTID if present
  @VTID(207)
  void clearCharacterStyle();


  /**
   */

  @DISPID(1033) //= 0x409. The runtime will prefer the VTID if present
  @VTID(208)
  void clearCharacterDirectFormatting();


  /**
   * <p>
   * Getter method for the COM property "ContentControls"
   * </p>
   * @return  Returns a value of type word.ContentControls
   */

  @DISPID(1034) //= 0x40a. The runtime will prefer the VTID if present
  @VTID(209)
  word.ContentControls contentControls();


  @VTID(209)
  @ReturnValue(defaultPropertyThrough={word.ContentControls.class})
  word.ContentControl contentControls(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "ParentContentControl"
   * </p>
   * @return  Returns a value of type word.ContentControl
   */

  @DISPID(1035) //= 0x40b. The runtime will prefer the VTID if present
  @VTID(210)
  word.ContentControl parentContentControl();


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

  @DISPID(1036) //= 0x40c. The runtime will prefer the VTID if present
  @VTID(211)
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
   */

  @DISPID(1037) //= 0x40d. The runtime will prefer the VTID if present
  @VTID(212)
  void readingModeGrowFont();


  /**
   */

  @DISPID(1038) //= 0x40e. The runtime will prefer the VTID if present
  @VTID(213)
  void readingModeShrinkFont();


  /**
   */

  @DISPID(1039) //= 0x40f. The runtime will prefer the VTID if present
  @VTID(214)
  void clearParagraphAllFormatting();


  /**
   */

  @DISPID(1040) //= 0x410. The runtime will prefer the VTID if present
  @VTID(215)
  void clearParagraphDirectFormatting();


  /**
   */

  @DISPID(1041) //= 0x411. The runtime will prefer the VTID if present
  @VTID(216)
  void insertNewPage();


  // Properties:
}
