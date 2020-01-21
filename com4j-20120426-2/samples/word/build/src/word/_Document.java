package word  ;

import com4j.*;

@IID("{0002096B-0000-0000-C000-000000000046}")
public interface _Document extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(9)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "BuiltInDocumentProperties"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject builtInDocumentProperties();


  /**
   * <p>
   * Getter method for the COM property "CustomDocumentProperties"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject customDocumentProperties();


  /**
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String path();


  /**
   * <p>
   * Getter method for the COM property "Bookmarks"
   * </p>
   * @return  Returns a value of type word.Bookmarks
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  word.Bookmarks bookmarks();


  @VTID(14)
  @ReturnValue(defaultPropertyThrough={word.Bookmarks.class})
  word.Bookmark bookmarks(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Tables"
   * </p>
   * @return  Returns a value of type word.Tables
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(15)
  word.Tables tables();


  @VTID(15)
  @ReturnValue(defaultPropertyThrough={word.Tables.class})
  word.Table tables(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Footnotes"
   * </p>
   * @return  Returns a value of type word.Footnotes
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(16)
  word.Footnotes footnotes();


  @VTID(16)
  @ReturnValue(defaultPropertyThrough={word.Footnotes.class})
  word.Footnote footnotes(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Endnotes"
   * </p>
   * @return  Returns a value of type word.Endnotes
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(17)
  word.Endnotes endnotes();


  @VTID(17)
  @ReturnValue(defaultPropertyThrough={word.Endnotes.class})
  word.Endnote endnotes(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Comments"
   * </p>
   * @return  Returns a value of type word.Comments
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(18)
  word.Comments comments();


  @VTID(18)
  @ReturnValue(defaultPropertyThrough={word.Comments.class})
  word.Comment comments(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type word.WdDocumentType
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(19)
  word.WdDocumentType type();


  /**
   * <p>
   * Getter method for the COM property "AutoHyphenation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(20)
  boolean autoHyphenation();


  /**
   * <p>
   * Setter method for the COM property "AutoHyphenation"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(21)
  void autoHyphenation(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "HyphenateCaps"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(22)
  boolean hyphenateCaps();


  /**
   * <p>
   * Setter method for the COM property "HyphenateCaps"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(23)
  void hyphenateCaps(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "HyphenationZone"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(24)
  int hyphenationZone();


  /**
   * <p>
   * Setter method for the COM property "HyphenationZone"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(25)
  void hyphenationZone(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "ConsecutiveHyphensLimit"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(26)
  int consecutiveHyphensLimit();


  /**
   * <p>
   * Setter method for the COM property "ConsecutiveHyphensLimit"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(27)
  void consecutiveHyphensLimit(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Sections"
   * </p>
   * @return  Returns a value of type word.Sections
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(28)
  word.Sections sections();


  @VTID(28)
  @ReturnValue(defaultPropertyThrough={word.Sections.class})
  word.Section sections(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Paragraphs"
   * </p>
   * @return  Returns a value of type word.Paragraphs
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(29)
  word.Paragraphs paragraphs();


  @VTID(29)
  @ReturnValue(defaultPropertyThrough={word.Paragraphs.class})
  word.Paragraph paragraphs(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Words"
   * </p>
   * @return  Returns a value of type word.Words
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(30)
  word.Words words();


  @VTID(30)
  @ReturnValue(defaultPropertyThrough={word.Words.class})
  word.Range words(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Sentences"
   * </p>
   * @return  Returns a value of type word.Sentences
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(31)
  word.Sentences sentences();


  @VTID(31)
  @ReturnValue(defaultPropertyThrough={word.Sentences.class})
  word.Range sentences(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Characters"
   * </p>
   * @return  Returns a value of type word.Characters
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(32)
  word.Characters characters();


  @VTID(32)
  @ReturnValue(defaultPropertyThrough={word.Characters.class})
  word.Range characters(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Fields"
   * </p>
   * @return  Returns a value of type word.Fields
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(33)
  word.Fields fields();


  @VTID(33)
  @ReturnValue(defaultPropertyThrough={word.Fields.class})
  word.Field fields(
    int index);

  /**
   * <p>
   * Getter method for the COM property "FormFields"
   * </p>
   * @return  Returns a value of type word.FormFields
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(34)
  word.FormFields formFields();


  @VTID(34)
  @ReturnValue(defaultPropertyThrough={word.FormFields.class})
  word.FormField formFields(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Styles"
   * </p>
   * @return  Returns a value of type word.Styles
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(35)
  word.Styles styles();


  @VTID(35)
  @ReturnValue(defaultPropertyThrough={word.Styles.class})
  word.Style styles(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Frames"
   * </p>
   * @return  Returns a value of type word.Frames
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(36)
  word.Frames frames();


  @VTID(36)
  @ReturnValue(defaultPropertyThrough={word.Frames.class})
  word.Frame frames(
    int index);

  /**
   * <p>
   * Getter method for the COM property "TablesOfFigures"
   * </p>
   * @return  Returns a value of type word.TablesOfFigures
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(37)
  word.TablesOfFigures tablesOfFigures();


  @VTID(37)
  @ReturnValue(defaultPropertyThrough={word.TablesOfFigures.class})
  word.TableOfFigures tablesOfFigures(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Variables"
   * </p>
   * @return  Returns a value of type word.Variables
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(38)
  word.Variables variables();


  @VTID(38)
  @ReturnValue(defaultPropertyThrough={word.Variables.class})
  word.Variable variables(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "MailMerge"
   * </p>
   * @return  Returns a value of type word.MailMerge
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(39)
  word.MailMerge mailMerge();


  /**
   * <p>
   * Getter method for the COM property "Envelope"
   * </p>
   * @return  Returns a value of type word.Envelope
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(40)
  word.Envelope envelope();


  /**
   * <p>
   * Getter method for the COM property "FullName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(41)
  java.lang.String fullName();


  /**
   * <p>
   * Getter method for the COM property "Revisions"
   * </p>
   * @return  Returns a value of type word.Revisions
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(42)
  word.Revisions revisions();


  @VTID(42)
  @ReturnValue(defaultPropertyThrough={word.Revisions.class})
  word.Revision revisions(
    int index);

  /**
   * <p>
   * Getter method for the COM property "TablesOfContents"
   * </p>
   * @return  Returns a value of type word.TablesOfContents
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(43)
  word.TablesOfContents tablesOfContents();


  @VTID(43)
  @ReturnValue(defaultPropertyThrough={word.TablesOfContents.class})
  word.TableOfContents tablesOfContents(
    int index);

  /**
   * <p>
   * Getter method for the COM property "TablesOfAuthorities"
   * </p>
   * @return  Returns a value of type word.TablesOfAuthorities
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(44)
  word.TablesOfAuthorities tablesOfAuthorities();


  @VTID(44)
  @ReturnValue(defaultPropertyThrough={word.TablesOfAuthorities.class})
  word.TableOfAuthorities tablesOfAuthorities(
    int index);

  /**
   * <p>
   * Getter method for the COM property "PageSetup"
   * </p>
   * @return  Returns a value of type word.PageSetup
   */

  @DISPID(1101) //= 0x44d. The runtime will prefer the VTID if present
  @VTID(45)
  word.PageSetup pageSetup();


  /**
   * <p>
   * Setter method for the COM property "PageSetup"
   * </p>
   * @param prop Mandatory word.PageSetup parameter.
   */

  @DISPID(1101) //= 0x44d. The runtime will prefer the VTID if present
  @VTID(46)
  void pageSetup(
    word.PageSetup prop);


  /**
   * <p>
   * Getter method for the COM property "Windows"
   * </p>
   * @return  Returns a value of type word.Windows
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(47)
  word.Windows windows();


  @VTID(47)
  @ReturnValue(defaultPropertyThrough={word.Windows.class})
  word.Window windows(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "HasRoutingSlip"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(48)
  boolean hasRoutingSlip();


  /**
   * <p>
   * Setter method for the COM property "HasRoutingSlip"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(49)
  void hasRoutingSlip(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "RoutingSlip"
   * </p>
   * @return  Returns a value of type word.RoutingSlip
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(50)
  word.RoutingSlip routingSlip();


  /**
   * <p>
   * Getter method for the COM property "Routed"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(51)
  boolean routed();


  /**
   * <p>
   * Getter method for the COM property "TablesOfAuthoritiesCategories"
   * </p>
   * @return  Returns a value of type word.TablesOfAuthoritiesCategories
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(52)
  word.TablesOfAuthoritiesCategories tablesOfAuthoritiesCategories();


  @VTID(52)
  @ReturnValue(defaultPropertyThrough={word.TablesOfAuthoritiesCategories.class})
  word.TableOfAuthoritiesCategory tablesOfAuthoritiesCategories(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Indexes"
   * </p>
   * @return  Returns a value of type word.Indexes
   */

  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
  @VTID(53)
  word.Indexes indexes();


  @VTID(53)
  @ReturnValue(defaultPropertyThrough={word.Indexes.class})
  word.Index indexes(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Saved"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(54)
  boolean saved();


  /**
   * <p>
   * Setter method for the COM property "Saved"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(55)
  void saved(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Content"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
  @VTID(56)
  word.Range content();


  /**
   * <p>
   * Getter method for the COM property "ActiveWindow"
   * </p>
   * @return  Returns a value of type word.Window
   */

  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
  @VTID(57)
  word.Window activeWindow();


  /**
   * <p>
   * Getter method for the COM property "Kind"
   * </p>
   * @return  Returns a value of type word.WdDocumentKind
   */

  @DISPID(43) //= 0x2b. The runtime will prefer the VTID if present
  @VTID(58)
  word.WdDocumentKind kind();


  /**
   * <p>
   * Setter method for the COM property "Kind"
   * </p>
   * @param prop Mandatory word.WdDocumentKind parameter.
   */

  @DISPID(43) //= 0x2b. The runtime will prefer the VTID if present
  @VTID(59)
  void kind(
    word.WdDocumentKind prop);


  /**
   * <p>
   * Getter method for the COM property "ReadOnly"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(44) //= 0x2c. The runtime will prefer the VTID if present
  @VTID(60)
  boolean readOnly();


  /**
   * <p>
   * Getter method for the COM property "Subdocuments"
   * </p>
   * @return  Returns a value of type word.Subdocuments
   */

  @DISPID(45) //= 0x2d. The runtime will prefer the VTID if present
  @VTID(61)
  word.Subdocuments subdocuments();


  @VTID(61)
  @ReturnValue(defaultPropertyThrough={word.Subdocuments.class})
  word.Subdocument subdocuments(
    int index);

  /**
   * <p>
   * Getter method for the COM property "IsMasterDocument"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(46) //= 0x2e. The runtime will prefer the VTID if present
  @VTID(62)
  boolean isMasterDocument();


  /**
   * <p>
   * Getter method for the COM property "DefaultTabStop"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(48) //= 0x30. The runtime will prefer the VTID if present
  @VTID(63)
  float defaultTabStop();


  /**
   * <p>
   * Setter method for the COM property "DefaultTabStop"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(48) //= 0x30. The runtime will prefer the VTID if present
  @VTID(64)
  void defaultTabStop(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "EmbedTrueTypeFonts"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(50) //= 0x32. The runtime will prefer the VTID if present
  @VTID(65)
  boolean embedTrueTypeFonts();


  /**
   * <p>
   * Setter method for the COM property "EmbedTrueTypeFonts"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(50) //= 0x32. The runtime will prefer the VTID if present
  @VTID(66)
  void embedTrueTypeFonts(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SaveFormsData"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(51) //= 0x33. The runtime will prefer the VTID if present
  @VTID(67)
  boolean saveFormsData();


  /**
   * <p>
   * Setter method for the COM property "SaveFormsData"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(51) //= 0x33. The runtime will prefer the VTID if present
  @VTID(68)
  void saveFormsData(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ReadOnlyRecommended"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(52) //= 0x34. The runtime will prefer the VTID if present
  @VTID(69)
  boolean readOnlyRecommended();


  /**
   * <p>
   * Setter method for the COM property "ReadOnlyRecommended"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(52) //= 0x34. The runtime will prefer the VTID if present
  @VTID(70)
  void readOnlyRecommended(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SaveSubsetFonts"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(53) //= 0x35. The runtime will prefer the VTID if present
  @VTID(71)
  boolean saveSubsetFonts();


  /**
   * <p>
   * Setter method for the COM property "SaveSubsetFonts"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(53) //= 0x35. The runtime will prefer the VTID if present
  @VTID(72)
  void saveSubsetFonts(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Compatibility"
   * </p>
   * @param type Mandatory word.WdCompatibility parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(55) //= 0x37. The runtime will prefer the VTID if present
  @VTID(73)
  boolean compatibility(
    word.WdCompatibility type);


  /**
   * <p>
   * Setter method for the COM property "Compatibility"
   * </p>
   * @param type Mandatory word.WdCompatibility parameter.
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(55) //= 0x37. The runtime will prefer the VTID if present
  @VTID(74)
  void compatibility(
    word.WdCompatibility type,
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "StoryRanges"
   * </p>
   * @return  Returns a value of type word.StoryRanges
   */

  @DISPID(56) //= 0x38. The runtime will prefer the VTID if present
  @VTID(75)
  word.StoryRanges storyRanges();


  @VTID(75)
  @ReturnValue(defaultPropertyThrough={word.StoryRanges.class})
  word.Range storyRanges(
    word.WdStoryType index);

  /**
   * <p>
   * Getter method for the COM property "CommandBars"
   * </p>
   * @return  Returns a value of type office._CommandBars
   */

  @DISPID(57) //= 0x39. The runtime will prefer the VTID if present
  @VTID(76)
  office._CommandBars commandBars();


  /**
   * <p>
   * Getter method for the COM property "IsSubdocument"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(58) //= 0x3a. The runtime will prefer the VTID if present
  @VTID(77)
  boolean isSubdocument();


  /**
   * <p>
   * Getter method for the COM property "SaveFormat"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(59) //= 0x3b. The runtime will prefer the VTID if present
  @VTID(78)
  int saveFormat();


  /**
   * <p>
   * Getter method for the COM property "ProtectionType"
   * </p>
   * @return  Returns a value of type word.WdProtectionType
   */

  @DISPID(60) //= 0x3c. The runtime will prefer the VTID if present
  @VTID(79)
  word.WdProtectionType protectionType();


  /**
   * <p>
   * Getter method for the COM property "Hyperlinks"
   * </p>
   * @return  Returns a value of type word.Hyperlinks
   */

  @DISPID(61) //= 0x3d. The runtime will prefer the VTID if present
  @VTID(80)
  word.Hyperlinks hyperlinks();


  @VTID(80)
  @ReturnValue(defaultPropertyThrough={word.Hyperlinks.class})
  word.Hyperlink hyperlinks(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Shapes"
   * </p>
   * @return  Returns a value of type word.Shapes
   */

  @DISPID(62) //= 0x3e. The runtime will prefer the VTID if present
  @VTID(81)
  word.Shapes shapes();


  @VTID(81)
  @ReturnValue(defaultPropertyThrough={word.Shapes.class})
  word.Shape shapes(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "ListTemplates"
   * </p>
   * @return  Returns a value of type word.ListTemplates
   */

  @DISPID(63) //= 0x3f. The runtime will prefer the VTID if present
  @VTID(82)
  word.ListTemplates listTemplates();


  @VTID(82)
  @ReturnValue(defaultPropertyThrough={word.ListTemplates.class})
  word.ListTemplate listTemplates(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Lists"
   * </p>
   * @return  Returns a value of type word.Lists
   */

  @DISPID(64) //= 0x40. The runtime will prefer the VTID if present
  @VTID(83)
  word.Lists lists();


  @VTID(83)
  @ReturnValue(defaultPropertyThrough={word.Lists.class})
  word.List lists(
    int index);

  /**
   * <p>
   * Getter method for the COM property "UpdateStylesOnOpen"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(66) //= 0x42. The runtime will prefer the VTID if present
  @VTID(84)
  boolean updateStylesOnOpen();


  /**
   * <p>
   * Setter method for the COM property "UpdateStylesOnOpen"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(66) //= 0x42. The runtime will prefer the VTID if present
  @VTID(85)
  void updateStylesOnOpen(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AttachedTemplate"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(67) //= 0x43. The runtime will prefer the VTID if present
  @VTID(86)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object attachedTemplate();


  /**
   * <p>
   * Setter method for the COM property "AttachedTemplate"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(67) //= 0x43. The runtime will prefer the VTID if present
  @VTID(87)
  void attachedTemplate(
    java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "InlineShapes"
   * </p>
   * @return  Returns a value of type word.InlineShapes
   */

  @DISPID(68) //= 0x44. The runtime will prefer the VTID if present
  @VTID(88)
  word.InlineShapes inlineShapes();


  @VTID(88)
  @ReturnValue(defaultPropertyThrough={word.InlineShapes.class})
  word.InlineShape inlineShapes(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Background"
   * </p>
   * @return  Returns a value of type word.Shape
   */

  @DISPID(69) //= 0x45. The runtime will prefer the VTID if present
  @VTID(89)
  word.Shape background();


  /**
   * <p>
   * Setter method for the COM property "Background"
   * </p>
   * @param prop Mandatory word.Shape parameter.
   */

  @DISPID(69) //= 0x45. The runtime will prefer the VTID if present
  @VTID(90)
  void background(
    word.Shape prop);


  /**
   * <p>
   * Getter method for the COM property "GrammarChecked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(70) //= 0x46. The runtime will prefer the VTID if present
  @VTID(91)
  boolean grammarChecked();


  /**
   * <p>
   * Setter method for the COM property "GrammarChecked"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(70) //= 0x46. The runtime will prefer the VTID if present
  @VTID(92)
  void grammarChecked(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SpellingChecked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(71) //= 0x47. The runtime will prefer the VTID if present
  @VTID(93)
  boolean spellingChecked();


  /**
   * <p>
   * Setter method for the COM property "SpellingChecked"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(71) //= 0x47. The runtime will prefer the VTID if present
  @VTID(94)
  void spellingChecked(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowGrammaticalErrors"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(72) //= 0x48. The runtime will prefer the VTID if present
  @VTID(95)
  boolean showGrammaticalErrors();


  /**
   * <p>
   * Setter method for the COM property "ShowGrammaticalErrors"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(72) //= 0x48. The runtime will prefer the VTID if present
  @VTID(96)
  void showGrammaticalErrors(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowSpellingErrors"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(73) //= 0x49. The runtime will prefer the VTID if present
  @VTID(97)
  boolean showSpellingErrors();


  /**
   * <p>
   * Setter method for the COM property "ShowSpellingErrors"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(73) //= 0x49. The runtime will prefer the VTID if present
  @VTID(98)
  void showSpellingErrors(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Versions"
   * </p>
   * @return  Returns a value of type word.Versions
   */

  @DISPID(75) //= 0x4b. The runtime will prefer the VTID if present
  @VTID(99)
  word.Versions versions();


  @VTID(99)
  @ReturnValue(defaultPropertyThrough={word.Versions.class})
  word.Version versions(
    int index);

  /**
   * <p>
   * Getter method for the COM property "ShowSummary"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(76) //= 0x4c. The runtime will prefer the VTID if present
  @VTID(100)
  boolean showSummary();


  /**
   * <p>
   * Setter method for the COM property "ShowSummary"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(76) //= 0x4c. The runtime will prefer the VTID if present
  @VTID(101)
  void showSummary(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SummaryViewMode"
   * </p>
   * @return  Returns a value of type word.WdSummaryMode
   */

  @DISPID(77) //= 0x4d. The runtime will prefer the VTID if present
  @VTID(102)
  word.WdSummaryMode summaryViewMode();


  /**
   * <p>
   * Setter method for the COM property "SummaryViewMode"
   * </p>
   * @param prop Mandatory word.WdSummaryMode parameter.
   */

  @DISPID(77) //= 0x4d. The runtime will prefer the VTID if present
  @VTID(103)
  void summaryViewMode(
    word.WdSummaryMode prop);


  /**
   * <p>
   * Getter method for the COM property "SummaryLength"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(78) //= 0x4e. The runtime will prefer the VTID if present
  @VTID(104)
  int summaryLength();


  /**
   * <p>
   * Setter method for the COM property "SummaryLength"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(78) //= 0x4e. The runtime will prefer the VTID if present
  @VTID(105)
  void summaryLength(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "PrintFractionalWidths"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(79) //= 0x4f. The runtime will prefer the VTID if present
  @VTID(106)
  boolean printFractionalWidths();


  /**
   * <p>
   * Setter method for the COM property "PrintFractionalWidths"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(79) //= 0x4f. The runtime will prefer the VTID if present
  @VTID(107)
  void printFractionalWidths(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PrintPostScriptOverText"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(80) //= 0x50. The runtime will prefer the VTID if present
  @VTID(108)
  boolean printPostScriptOverText();


  /**
   * <p>
   * Setter method for the COM property "PrintPostScriptOverText"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(80) //= 0x50. The runtime will prefer the VTID if present
  @VTID(109)
  void printPostScriptOverText(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Container"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(82) //= 0x52. The runtime will prefer the VTID if present
  @VTID(110)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject container();


  /**
   * <p>
   * Getter method for the COM property "PrintFormsData"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(83) //= 0x53. The runtime will prefer the VTID if present
  @VTID(111)
  boolean printFormsData();


  /**
   * <p>
   * Setter method for the COM property "PrintFormsData"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(83) //= 0x53. The runtime will prefer the VTID if present
  @VTID(112)
  void printFormsData(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ListParagraphs"
   * </p>
   * @return  Returns a value of type word.ListParagraphs
   */

  @DISPID(84) //= 0x54. The runtime will prefer the VTID if present
  @VTID(113)
  word.ListParagraphs listParagraphs();


  @VTID(113)
  @ReturnValue(defaultPropertyThrough={word.ListParagraphs.class})
  word.Paragraph listParagraphs(
    int index);

  /**
   * <p>
   * Setter method for the COM property "Password"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(85) //= 0x55. The runtime will prefer the VTID if present
  @VTID(114)
  void password(
    java.lang.String rhs);


  /**
   * <p>
   * Setter method for the COM property "WritePassword"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(86) //= 0x56. The runtime will prefer the VTID if present
  @VTID(115)
  void writePassword(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "HasPassword"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(87) //= 0x57. The runtime will prefer the VTID if present
  @VTID(116)
  boolean hasPassword();


  /**
   * <p>
   * Getter method for the COM property "WriteReserved"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(88) //= 0x58. The runtime will prefer the VTID if present
  @VTID(117)
  boolean writeReserved();


  /**
   * <p>
   * Getter method for the COM property "ActiveWritingStyle"
   * </p>
   * @param languageID Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(90) //= 0x5a. The runtime will prefer the VTID if present
  @VTID(118)
  java.lang.String activeWritingStyle(
    java.lang.Object languageID);


  /**
   * <p>
   * Setter method for the COM property "ActiveWritingStyle"
   * </p>
   * @param languageID Mandatory java.lang.Object parameter.
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(90) //= 0x5a. The runtime will prefer the VTID if present
  @VTID(119)
  void activeWritingStyle(
    java.lang.Object languageID,
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "UserControl"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(92) //= 0x5c. The runtime will prefer the VTID if present
  @VTID(120)
  boolean userControl();


  /**
   * <p>
   * Setter method for the COM property "UserControl"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(92) //= 0x5c. The runtime will prefer the VTID if present
  @VTID(121)
  void userControl(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "HasMailer"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(93) //= 0x5d. The runtime will prefer the VTID if present
  @VTID(122)
  boolean hasMailer();


  /**
   * <p>
   * Setter method for the COM property "HasMailer"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(93) //= 0x5d. The runtime will prefer the VTID if present
  @VTID(123)
  void hasMailer(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Mailer"
   * </p>
   * @return  Returns a value of type word.Mailer
   */

  @DISPID(94) //= 0x5e. The runtime will prefer the VTID if present
  @VTID(124)
  word.Mailer mailer();


  /**
   * <p>
   * Getter method for the COM property "ReadabilityStatistics"
   * </p>
   * @return  Returns a value of type word.ReadabilityStatistics
   */

  @DISPID(96) //= 0x60. The runtime will prefer the VTID if present
  @VTID(125)
  word.ReadabilityStatistics readabilityStatistics();


  @VTID(125)
  @ReturnValue(defaultPropertyThrough={word.ReadabilityStatistics.class})
  word.ReadabilityStatistic readabilityStatistics(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "GrammaticalErrors"
   * </p>
   * @return  Returns a value of type word.ProofreadingErrors
   */

  @DISPID(97) //= 0x61. The runtime will prefer the VTID if present
  @VTID(126)
  word.ProofreadingErrors grammaticalErrors();


  @VTID(126)
  @ReturnValue(defaultPropertyThrough={word.ProofreadingErrors.class})
  word.Range grammaticalErrors(
    int index);

  /**
   * <p>
   * Getter method for the COM property "SpellingErrors"
   * </p>
   * @return  Returns a value of type word.ProofreadingErrors
   */

  @DISPID(98) //= 0x62. The runtime will prefer the VTID if present
  @VTID(127)
  word.ProofreadingErrors spellingErrors();


  @VTID(127)
  @ReturnValue(defaultPropertyThrough={word.ProofreadingErrors.class})
  word.Range spellingErrors(
    int index);

  /**
   * <p>
   * Getter method for the COM property "VBProject"
   * </p>
   * @return  Returns a value of type vba._VBProject
   */

  @DISPID(99) //= 0x63. The runtime will prefer the VTID if present
  @VTID(128)
  vba._VBProject vbProject();


  /**
   * <p>
   * Getter method for the COM property "FormsDesign"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(129)
  boolean formsDesign();


  /**
   * <p>
   * Getter method for the COM property "_CodeName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(130)
  java.lang.String _CodeName();


  /**
   * <p>
   * Setter method for the COM property "_CodeName"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(131)
  void _CodeName(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "CodeName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(262) //= 0x106. The runtime will prefer the VTID if present
  @VTID(132)
  java.lang.String codeName();


  /**
   * <p>
   * Getter method for the COM property "SnapToGrid"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(300) //= 0x12c. The runtime will prefer the VTID if present
  @VTID(133)
  boolean snapToGrid();


  /**
   * <p>
   * Setter method for the COM property "SnapToGrid"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(300) //= 0x12c. The runtime will prefer the VTID if present
  @VTID(134)
  void snapToGrid(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SnapToShapes"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(301) //= 0x12d. The runtime will prefer the VTID if present
  @VTID(135)
  boolean snapToShapes();


  /**
   * <p>
   * Setter method for the COM property "SnapToShapes"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(301) //= 0x12d. The runtime will prefer the VTID if present
  @VTID(136)
  void snapToShapes(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "GridDistanceHorizontal"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(302) //= 0x12e. The runtime will prefer the VTID if present
  @VTID(137)
  float gridDistanceHorizontal();


  /**
   * <p>
   * Setter method for the COM property "GridDistanceHorizontal"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(302) //= 0x12e. The runtime will prefer the VTID if present
  @VTID(138)
  void gridDistanceHorizontal(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "GridDistanceVertical"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(303) //= 0x12f. The runtime will prefer the VTID if present
  @VTID(139)
  float gridDistanceVertical();


  /**
   * <p>
   * Setter method for the COM property "GridDistanceVertical"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(303) //= 0x12f. The runtime will prefer the VTID if present
  @VTID(140)
  void gridDistanceVertical(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "GridOriginHorizontal"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(304) //= 0x130. The runtime will prefer the VTID if present
  @VTID(141)
  float gridOriginHorizontal();


  /**
   * <p>
   * Setter method for the COM property "GridOriginHorizontal"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(304) //= 0x130. The runtime will prefer the VTID if present
  @VTID(142)
  void gridOriginHorizontal(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "GridOriginVertical"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(305) //= 0x131. The runtime will prefer the VTID if present
  @VTID(143)
  float gridOriginVertical();


  /**
   * <p>
   * Setter method for the COM property "GridOriginVertical"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(305) //= 0x131. The runtime will prefer the VTID if present
  @VTID(144)
  void gridOriginVertical(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "GridSpaceBetweenHorizontalLines"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(306) //= 0x132. The runtime will prefer the VTID if present
  @VTID(145)
  int gridSpaceBetweenHorizontalLines();


  /**
   * <p>
   * Setter method for the COM property "GridSpaceBetweenHorizontalLines"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(306) //= 0x132. The runtime will prefer the VTID if present
  @VTID(146)
  void gridSpaceBetweenHorizontalLines(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "GridSpaceBetweenVerticalLines"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(307) //= 0x133. The runtime will prefer the VTID if present
  @VTID(147)
  int gridSpaceBetweenVerticalLines();


  /**
   * <p>
   * Setter method for the COM property "GridSpaceBetweenVerticalLines"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(307) //= 0x133. The runtime will prefer the VTID if present
  @VTID(148)
  void gridSpaceBetweenVerticalLines(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "GridOriginFromMargin"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(308) //= 0x134. The runtime will prefer the VTID if present
  @VTID(149)
  boolean gridOriginFromMargin();


  /**
   * <p>
   * Setter method for the COM property "GridOriginFromMargin"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(308) //= 0x134. The runtime will prefer the VTID if present
  @VTID(150)
  void gridOriginFromMargin(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "KerningByAlgorithm"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(309) //= 0x135. The runtime will prefer the VTID if present
  @VTID(151)
  boolean kerningByAlgorithm();


  /**
   * <p>
   * Setter method for the COM property "KerningByAlgorithm"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(309) //= 0x135. The runtime will prefer the VTID if present
  @VTID(152)
  void kerningByAlgorithm(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "JustificationMode"
   * </p>
   * @return  Returns a value of type word.WdJustificationMode
   */

  @DISPID(310) //= 0x136. The runtime will prefer the VTID if present
  @VTID(153)
  word.WdJustificationMode justificationMode();


  /**
   * <p>
   * Setter method for the COM property "JustificationMode"
   * </p>
   * @param prop Mandatory word.WdJustificationMode parameter.
   */

  @DISPID(310) //= 0x136. The runtime will prefer the VTID if present
  @VTID(154)
  void justificationMode(
    word.WdJustificationMode prop);


  /**
   * <p>
   * Getter method for the COM property "FarEastLineBreakLevel"
   * </p>
   * @return  Returns a value of type word.WdFarEastLineBreakLevel
   */

  @DISPID(311) //= 0x137. The runtime will prefer the VTID if present
  @VTID(155)
  word.WdFarEastLineBreakLevel farEastLineBreakLevel();


  /**
   * <p>
   * Setter method for the COM property "FarEastLineBreakLevel"
   * </p>
   * @param prop Mandatory word.WdFarEastLineBreakLevel parameter.
   */

  @DISPID(311) //= 0x137. The runtime will prefer the VTID if present
  @VTID(156)
  void farEastLineBreakLevel(
    word.WdFarEastLineBreakLevel prop);


  /**
   * <p>
   * Getter method for the COM property "NoLineBreakBefore"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(312) //= 0x138. The runtime will prefer the VTID if present
  @VTID(157)
  java.lang.String noLineBreakBefore();


  /**
   * <p>
   * Setter method for the COM property "NoLineBreakBefore"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(312) //= 0x138. The runtime will prefer the VTID if present
  @VTID(158)
  void noLineBreakBefore(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "NoLineBreakAfter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(313) //= 0x139. The runtime will prefer the VTID if present
  @VTID(159)
  java.lang.String noLineBreakAfter();


  /**
   * <p>
   * Setter method for the COM property "NoLineBreakAfter"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(313) //= 0x139. The runtime will prefer the VTID if present
  @VTID(160)
  void noLineBreakAfter(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "TrackRevisions"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(314) //= 0x13a. The runtime will prefer the VTID if present
  @VTID(161)
  boolean trackRevisions();


  /**
   * <p>
   * Setter method for the COM property "TrackRevisions"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(314) //= 0x13a. The runtime will prefer the VTID if present
  @VTID(162)
  void trackRevisions(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PrintRevisions"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(315) //= 0x13b. The runtime will prefer the VTID if present
  @VTID(163)
  boolean printRevisions();


  /**
   * <p>
   * Setter method for the COM property "PrintRevisions"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(315) //= 0x13b. The runtime will prefer the VTID if present
  @VTID(164)
  void printRevisions(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowRevisions"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(316) //= 0x13c. The runtime will prefer the VTID if present
  @VTID(165)
  boolean showRevisions();


  /**
   * <p>
   * Setter method for the COM property "ShowRevisions"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(316) //= 0x13c. The runtime will prefer the VTID if present
  @VTID(166)
  void showRevisions(
    boolean prop);


  /**
   * @param saveChanges Optional parameter. Default value is com4j.Variant.getMissing()
   * @param originalFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param routeDocument Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1105) //= 0x451. The runtime will prefer the VTID if present
  @VTID(167)
  void close(
    @Optional java.lang.Object saveChanges,
    @Optional java.lang.Object originalFormat,
    @Optional java.lang.Object routeDocument);


  /**
   * @param fileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fileFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lockComments Optional parameter. Default value is com4j.Variant.getMissing()
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToRecentFiles Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePassword Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnlyRecommended Optional parameter. Default value is com4j.Variant.getMissing()
   * @param embedTrueTypeFonts Optional parameter. Default value is com4j.Variant.getMissing()
   * @param saveNativePictureFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param saveFormsData Optional parameter. Default value is com4j.Variant.getMissing()
   * @param saveAsAOCELetter Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(168)
  void saveAs2000(
    @Optional java.lang.Object fileName,
    @Optional java.lang.Object fileFormat,
    @Optional java.lang.Object lockComments,
    @Optional java.lang.Object password,
    @Optional java.lang.Object addToRecentFiles,
    @Optional java.lang.Object writePassword,
    @Optional java.lang.Object readOnlyRecommended,
    @Optional java.lang.Object embedTrueTypeFonts,
    @Optional java.lang.Object saveNativePictureFormat,
    @Optional java.lang.Object saveFormsData,
    @Optional java.lang.Object saveAsAOCELetter);


  /**
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(169)
  void repaginate();


  /**
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(170)
  void fitToPages();


  /**
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(171)
  void manualHyphenation();


  /**
   */

  @DISPID(65535) //= 0xffff. The runtime will prefer the VTID if present
  @VTID(172)
  void select();


  /**
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(173)
  void dataForm();


  /**
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(174)
  void route();


  /**
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(175)
  void save();


  /**
   * @param background Optional parameter. Default value is com4j.Variant.getMissing()
   * @param append Optional parameter. Default value is com4j.Variant.getMissing()
   * @param range Optional parameter. Default value is com4j.Variant.getMissing()
   * @param outputFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pages Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pageType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinterMacGX Optional parameter. Default value is com4j.Variant.getMissing()
   * @param manualDuplexPrint Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(176)
  void printOutOld(
    @Optional java.lang.Object background,
    @Optional java.lang.Object append,
    @Optional java.lang.Object range,
    @Optional java.lang.Object outputFileName,
    @Optional java.lang.Object from,
    @Optional java.lang.Object to,
    @Optional java.lang.Object item,
    @Optional java.lang.Object copies,
    @Optional java.lang.Object pages,
    @Optional java.lang.Object pageType,
    @Optional java.lang.Object printToFile,
    @Optional java.lang.Object collate,
    @Optional java.lang.Object activePrinterMacGX,
    @Optional java.lang.Object manualDuplexPrint);


  /**
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(177)
  void sendMail();


  /**
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   * @param end Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Range
   */

  @DISPID(2000) //= 0x7d0. The runtime will prefer the VTID if present
  @VTID(178)
  word.Range range(
    @Optional java.lang.Object start,
    @Optional java.lang.Object end);


  /**
   * @param which Mandatory word.WdAutoMacros parameter.
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(179)
  void runAutoMacro(
    word.WdAutoMacros which);


  /**
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(180)
  void activate();


  /**
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(181)
  void printPreview();


  /**
   * @param what Optional parameter. Default value is com4j.Variant.getMissing()
   * @param which Optional parameter. Default value is com4j.Variant.getMissing()
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Range
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(182)
  word.Range goTo(
    @Optional java.lang.Object what,
    @Optional java.lang.Object which,
    @Optional java.lang.Object count,
    @Optional java.lang.Object name);


  /**
   * @param times Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(183)
  boolean undo(
    @Optional java.lang.Object times);


  /**
   * @param times Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(184)
  boolean redo(
    @Optional java.lang.Object times);


  /**
   * @param statistic Mandatory word.WdStatistic parameter.
   * @param includeFootnotesAndEndnotes Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(185)
  int computeStatistics(
    word.WdStatistic statistic,
    @Optional java.lang.Object includeFootnotesAndEndnotes);


  /**
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(186)
  void makeCompatibilityDefault();


  /**
   * @param type Mandatory word.WdProtectionType parameter.
   * @param noReset Optional parameter. Default value is com4j.Variant.getMissing()
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(187)
  void protect2002(
    word.WdProtectionType type,
    @Optional java.lang.Object noReset,
    @Optional java.lang.Object password);


  /**
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(188)
  void unprotect(
    @Optional java.lang.Object password);


  /**
   * @param type Mandatory word.WdEditionType parameter.
   * @param option Mandatory word.WdEditionOption parameter.
   * @param name Mandatory java.lang.String parameter.
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(189)
  void editionOptions(
    word.WdEditionType type,
    word.WdEditionOption option,
    java.lang.String name,
    @Optional java.lang.Object format);


  /**
   * @param letterContent Optional parameter. Default value is com4j.Variant.getMissing()
   * @param wizardMode Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(190)
  void runLetterWizard(
    @Optional java.lang.Object letterContent,
    @Optional java.lang.Object wizardMode);


  /**
   * @return  Returns a value of type word._LetterContent
   */

  @DISPID(124) //= 0x7c. The runtime will prefer the VTID if present
  @VTID(191)
  word._LetterContent getLetterContent();


  /**
   * @param letterContent Mandatory java.lang.Object parameter.
   */

  @DISPID(125) //= 0x7d. The runtime will prefer the VTID if present
  @VTID(192)
  void setLetterContent(
    java.lang.Object letterContent);


  /**
   * @param template Mandatory java.lang.String parameter.
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(193)
  void copyStylesFromTemplate(
    java.lang.String template);


  /**
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(194)
  void updateStyles();


  /**
   */

  @DISPID(131) //= 0x83. The runtime will prefer the VTID if present
  @VTID(195)
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

  @DISPID(132) //= 0x84. The runtime will prefer the VTID if present
  @VTID(196)
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
   * @param address Optional parameter. Default value is com4j.Variant.getMissing()
   * @param subAddress Optional parameter. Default value is com4j.Variant.getMissing()
   * @param newWindow Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addHistory Optional parameter. Default value is com4j.Variant.getMissing()
   * @param extraInfo Optional parameter. Default value is com4j.Variant.getMissing()
   * @param method Optional parameter. Default value is com4j.Variant.getMissing()
   * @param headerInfo Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(135) //= 0x87. The runtime will prefer the VTID if present
  @VTID(197)
  void followHyperlink(
    @Optional java.lang.Object address,
    @Optional java.lang.Object subAddress,
    @Optional java.lang.Object newWindow,
    @Optional java.lang.Object addHistory,
    @Optional java.lang.Object extraInfo,
    @Optional java.lang.Object method,
    @Optional java.lang.Object headerInfo);


  /**
   */

  @DISPID(136) //= 0x88. The runtime will prefer the VTID if present
  @VTID(198)
  void addToFavorites();


  /**
   */

  @DISPID(137) //= 0x89. The runtime will prefer the VTID if present
  @VTID(199)
  void reload();


  /**
   * @param length Optional parameter. Default value is com4j.Variant.getMissing()
   * @param mode Optional parameter. Default value is com4j.Variant.getMissing()
   * @param updateProperties Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Range
   */

  @DISPID(138) //= 0x8a. The runtime will prefer the VTID if present
  @VTID(200)
  word.Range autoSummarize(
    @Optional java.lang.Object length,
    @Optional java.lang.Object mode,
    @Optional java.lang.Object updateProperties);


  /**
   * @param numberType Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(140) //= 0x8c. The runtime will prefer the VTID if present
  @VTID(201)
  void removeNumbers(
    @Optional java.lang.Object numberType);


  /**
   * @param numberType Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(141) //= 0x8d. The runtime will prefer the VTID if present
  @VTID(202)
  void convertNumbersToText(
    @Optional java.lang.Object numberType);


  /**
   * @param numberType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param level Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(142) //= 0x8e. The runtime will prefer the VTID if present
  @VTID(203)
  int countNumberedItems(
    @Optional java.lang.Object numberType,
    @Optional java.lang.Object level);


  /**
   */

  @DISPID(143) //= 0x8f. The runtime will prefer the VTID if present
  @VTID(204)
  void post();


  /**
   */

  @DISPID(144) //= 0x90. The runtime will prefer the VTID if present
  @VTID(205)
  void toggleFormsDesign();


  /**
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(145) //= 0x91. The runtime will prefer the VTID if present
  @VTID(206)
  void compare2000(
    java.lang.String name);


  /**
   */

  @DISPID(146) //= 0x92. The runtime will prefer the VTID if present
  @VTID(207)
  void updateSummaryProperties();


  /**
   * @param referenceType Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(147) //= 0x93. The runtime will prefer the VTID if present
  @VTID(208)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getCrossReferenceItems(
    java.lang.Object referenceType);


  /**
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(209)
  void autoFormat();


  /**
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(210)
  void viewCode();


  /**
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(211)
  void viewPropertyBrowser();


  /**
   */

  @DISPID(250) //= 0xfa. The runtime will prefer the VTID if present
  @VTID(212)
  void forwardMailer();


  /**
   */

  @DISPID(251) //= 0xfb. The runtime will prefer the VTID if present
  @VTID(213)
  void reply();


  /**
   */

  @DISPID(252) //= 0xfc. The runtime will prefer the VTID if present
  @VTID(214)
  void replyAll();


  /**
   * @param fileFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param priority Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(253) //= 0xfd. The runtime will prefer the VTID if present
  @VTID(215)
  void sendMailer(
    @Optional java.lang.Object fileFormat,
    @Optional java.lang.Object priority);


  /**
   */

  @DISPID(254) //= 0xfe. The runtime will prefer the VTID if present
  @VTID(216)
  void undoClear();


  /**
   */

  @DISPID(255) //= 0xff. The runtime will prefer the VTID if present
  @VTID(217)
  void presentIt();


  /**
   * @param address Mandatory java.lang.String parameter.
   * @param subject Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(256) //= 0x100. The runtime will prefer the VTID if present
  @VTID(218)
  void sendFax(
    java.lang.String address,
    @Optional java.lang.Object subject);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(257) //= 0x101. The runtime will prefer the VTID if present
  @VTID(219)
  void merge2000(
    java.lang.String fileName);


  /**
   */

  @DISPID(258) //= 0x102. The runtime will prefer the VTID if present
  @VTID(220)
  void closePrintPreview();


  /**
   */

  @DISPID(259) //= 0x103. The runtime will prefer the VTID if present
  @VTID(221)
  void checkConsistency();


  /**
   * @param dateFormat Mandatory java.lang.String parameter.
   * @param includeHeaderFooter Mandatory boolean parameter.
   * @param pageDesign Mandatory java.lang.String parameter.
   * @param letterStyle Mandatory word.WdLetterStyle parameter.
   * @param letterhead Mandatory boolean parameter.
   * @param letterheadLocation Mandatory word.WdLetterheadLocation parameter.
   * @param letterheadSize Mandatory float parameter.
   * @param recipientName Mandatory java.lang.String parameter.
   * @param recipientAddress Mandatory java.lang.String parameter.
   * @param salutation Mandatory java.lang.String parameter.
   * @param salutationType Mandatory word.WdSalutationType parameter.
   * @param recipientReference Mandatory java.lang.String parameter.
   * @param mailingInstructions Mandatory java.lang.String parameter.
   * @param attentionLine Mandatory java.lang.String parameter.
   * @param subject Mandatory java.lang.String parameter.
   * @param ccList Mandatory java.lang.String parameter.
   * @param returnAddress Mandatory java.lang.String parameter.
   * @param senderName Mandatory java.lang.String parameter.
   * @param closing Mandatory java.lang.String parameter.
   * @param senderCompany Mandatory java.lang.String parameter.
   * @param senderJobTitle Mandatory java.lang.String parameter.
   * @param senderInitials Mandatory java.lang.String parameter.
   * @param enclosureNumber Mandatory int parameter.
   * @param infoBlock Optional parameter. Default value is com4j.Variant.getMissing()
   * @param recipientCode Optional parameter. Default value is com4j.Variant.getMissing()
   * @param recipientGender Optional parameter. Default value is com4j.Variant.getMissing()
   * @param returnAddressShortForm Optional parameter. Default value is com4j.Variant.getMissing()
   * @param senderCity Optional parameter. Default value is com4j.Variant.getMissing()
   * @param senderCode Optional parameter. Default value is com4j.Variant.getMissing()
   * @param senderGender Optional parameter. Default value is com4j.Variant.getMissing()
   * @param senderReference Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word._LetterContent
   */

  @DISPID(260) //= 0x104. The runtime will prefer the VTID if present
  @VTID(222)
  word._LetterContent createLetterContent(
    java.lang.String dateFormat,
    boolean includeHeaderFooter,
    java.lang.String pageDesign,
    word.WdLetterStyle letterStyle,
    boolean letterhead,
    word.WdLetterheadLocation letterheadLocation,
    float letterheadSize,
    java.lang.String recipientName,
    java.lang.String recipientAddress,
    java.lang.String salutation,
    word.WdSalutationType salutationType,
    java.lang.String recipientReference,
    java.lang.String mailingInstructions,
    java.lang.String attentionLine,
    java.lang.String subject,
    java.lang.String ccList,
    java.lang.String returnAddress,
    java.lang.String senderName,
    java.lang.String closing,
    java.lang.String senderCompany,
    java.lang.String senderJobTitle,
    java.lang.String senderInitials,
    int enclosureNumber,
    @Optional java.lang.Object infoBlock,
    @Optional java.lang.Object recipientCode,
    @Optional java.lang.Object recipientGender,
    @Optional java.lang.Object returnAddressShortForm,
    @Optional java.lang.Object senderCity,
    @Optional java.lang.Object senderCode,
    @Optional java.lang.Object senderGender,
    @Optional java.lang.Object senderReference);


  /**
   */

  @DISPID(317) //= 0x13d. The runtime will prefer the VTID if present
  @VTID(223)
  void acceptAllRevisions();


  /**
   */

  @DISPID(318) //= 0x13e. The runtime will prefer the VTID if present
  @VTID(224)
  void rejectAllRevisions();


  /**
   */

  @DISPID(151) //= 0x97. The runtime will prefer the VTID if present
  @VTID(225)
  void detectLanguage();


  /**
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(322) //= 0x142. The runtime will prefer the VTID if present
  @VTID(226)
  void applyTheme(
    java.lang.String name);


  /**
   */

  @DISPID(323) //= 0x143. The runtime will prefer the VTID if present
  @VTID(227)
  void removeTheme();


  /**
   */

  @DISPID(325) //= 0x145. The runtime will prefer the VTID if present
  @VTID(228)
  void webPagePreview();


  /**
   * @param encoding Mandatory office.MsoEncoding parameter.
   */

  @DISPID(331) //= 0x14b. The runtime will prefer the VTID if present
  @VTID(229)
  void reloadAs(
    office.MsoEncoding encoding);


  /**
   * <p>
   * Getter method for the COM property "ActiveTheme"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(540) //= 0x21c. The runtime will prefer the VTID if present
  @VTID(230)
  java.lang.String activeTheme();


  /**
   * <p>
   * Getter method for the COM property "ActiveThemeDisplayName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(541) //= 0x21d. The runtime will prefer the VTID if present
  @VTID(231)
  java.lang.String activeThemeDisplayName();


  /**
   * <p>
   * Getter method for the COM property "Email"
   * </p>
   * @return  Returns a value of type word.Email
   */

  @DISPID(319) //= 0x13f. The runtime will prefer the VTID if present
  @VTID(232)
  word.Email email();


  /**
   * <p>
   * Getter method for the COM property "Scripts"
   * </p>
   * @return  Returns a value of type office.Scripts
   */

  @DISPID(320) //= 0x140. The runtime will prefer the VTID if present
  @VTID(233)
  office.Scripts scripts();


  @VTID(233)
  @ReturnValue(defaultPropertyThrough={office.Scripts.class})
  office.Script scripts(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "LanguageDetected"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(321) //= 0x141. The runtime will prefer the VTID if present
  @VTID(234)
  boolean languageDetected();


  /**
   * <p>
   * Setter method for the COM property "LanguageDetected"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(321) //= 0x141. The runtime will prefer the VTID if present
  @VTID(235)
  void languageDetected(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "FarEastLineBreakLanguage"
   * </p>
   * @return  Returns a value of type word.WdFarEastLineBreakLanguageID
   */

  @DISPID(326) //= 0x146. The runtime will prefer the VTID if present
  @VTID(236)
  word.WdFarEastLineBreakLanguageID farEastLineBreakLanguage();


  /**
   * <p>
   * Setter method for the COM property "FarEastLineBreakLanguage"
   * </p>
   * @param prop Mandatory word.WdFarEastLineBreakLanguageID parameter.
   */

  @DISPID(326) //= 0x146. The runtime will prefer the VTID if present
  @VTID(237)
  void farEastLineBreakLanguage(
    word.WdFarEastLineBreakLanguageID prop);


  /**
   * <p>
   * Getter method for the COM property "Frameset"
   * </p>
   * @return  Returns a value of type word.Frameset
   */

  @DISPID(327) //= 0x147. The runtime will prefer the VTID if present
  @VTID(238)
  word.Frameset frameset();


  /**
   * <p>
   * Getter method for the COM property "ClickAndTypeParagraphStyle"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(328) //= 0x148. The runtime will prefer the VTID if present
  @VTID(239)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clickAndTypeParagraphStyle();


  /**
   * <p>
   * Setter method for the COM property "ClickAndTypeParagraphStyle"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(328) //= 0x148. The runtime will prefer the VTID if present
  @VTID(240)
  void clickAndTypeParagraphStyle(
    java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "HTMLProject"
   * </p>
   * @return  Returns a value of type office.HTMLProject
   */

  @DISPID(329) //= 0x149. The runtime will prefer the VTID if present
  @VTID(241)
  office.HTMLProject htmlProject();


  /**
   * <p>
   * Getter method for the COM property "WebOptions"
   * </p>
   * @return  Returns a value of type word.WebOptions
   */

  @DISPID(330) //= 0x14a. The runtime will prefer the VTID if present
  @VTID(242)
  word.WebOptions webOptions();


  /**
   * <p>
   * Getter method for the COM property "OpenEncoding"
   * </p>
   * @return  Returns a value of type office.MsoEncoding
   */

  @DISPID(332) //= 0x14c. The runtime will prefer the VTID if present
  @VTID(243)
  office.MsoEncoding openEncoding();


  /**
   * <p>
   * Getter method for the COM property "SaveEncoding"
   * </p>
   * @return  Returns a value of type office.MsoEncoding
   */

  @DISPID(333) //= 0x14d. The runtime will prefer the VTID if present
  @VTID(244)
  office.MsoEncoding saveEncoding();


  /**
   * <p>
   * Setter method for the COM property "SaveEncoding"
   * </p>
   * @param prop Mandatory office.MsoEncoding parameter.
   */

  @DISPID(333) //= 0x14d. The runtime will prefer the VTID if present
  @VTID(245)
  void saveEncoding(
    office.MsoEncoding prop);


  /**
   * <p>
   * Getter method for the COM property "OptimizeForWord97"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(334) //= 0x14e. The runtime will prefer the VTID if present
  @VTID(246)
  boolean optimizeForWord97();


  /**
   * <p>
   * Setter method for the COM property "OptimizeForWord97"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(334) //= 0x14e. The runtime will prefer the VTID if present
  @VTID(247)
  void optimizeForWord97(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "VBASigned"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(335) //= 0x14f. The runtime will prefer the VTID if present
  @VTID(248)
  boolean vbaSigned();


  /**
   * @param background Optional parameter. Default value is com4j.Variant.getMissing()
   * @param append Optional parameter. Default value is com4j.Variant.getMissing()
   * @param range Optional parameter. Default value is com4j.Variant.getMissing()
   * @param outputFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pages Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pageType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinterMacGX Optional parameter. Default value is com4j.Variant.getMissing()
   * @param manualDuplexPrint Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printZoomColumn Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printZoomRow Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printZoomPaperWidth Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printZoomPaperHeight Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(444) //= 0x1bc. The runtime will prefer the VTID if present
  @VTID(249)
  void printOut2000(
    @Optional java.lang.Object background,
    @Optional java.lang.Object append,
    @Optional java.lang.Object range,
    @Optional java.lang.Object outputFileName,
    @Optional java.lang.Object from,
    @Optional java.lang.Object to,
    @Optional java.lang.Object item,
    @Optional java.lang.Object copies,
    @Optional java.lang.Object pages,
    @Optional java.lang.Object pageType,
    @Optional java.lang.Object printToFile,
    @Optional java.lang.Object collate,
    @Optional java.lang.Object activePrinterMacGX,
    @Optional java.lang.Object manualDuplexPrint,
    @Optional java.lang.Object printZoomColumn,
    @Optional java.lang.Object printZoomRow,
    @Optional java.lang.Object printZoomPaperWidth,
    @Optional java.lang.Object printZoomPaperHeight);


  /**
   * @param s Mandatory java.lang.String parameter.
   */

  @DISPID(445) //= 0x1bd. The runtime will prefer the VTID if present
  @VTID(250)
  void sblt(
    java.lang.String s);


  /**
   * @param codePageOrigin Mandatory int parameter.
   */

  @DISPID(447) //= 0x1bf. The runtime will prefer the VTID if present
  @VTID(251)
  void convertVietDoc(
    int codePageOrigin);


  /**
   * @param background Optional parameter. Default value is com4j.Variant.getMissing()
   * @param append Optional parameter. Default value is com4j.Variant.getMissing()
   * @param range Optional parameter. Default value is com4j.Variant.getMissing()
   * @param outputFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pages Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pageType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinterMacGX Optional parameter. Default value is com4j.Variant.getMissing()
   * @param manualDuplexPrint Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printZoomColumn Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printZoomRow Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printZoomPaperWidth Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printZoomPaperHeight Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(446) //= 0x1be. The runtime will prefer the VTID if present
  @VTID(252)
  void printOut(
    @Optional java.lang.Object background,
    @Optional java.lang.Object append,
    @Optional java.lang.Object range,
    @Optional java.lang.Object outputFileName,
    @Optional java.lang.Object from,
    @Optional java.lang.Object to,
    @Optional java.lang.Object item,
    @Optional java.lang.Object copies,
    @Optional java.lang.Object pages,
    @Optional java.lang.Object pageType,
    @Optional java.lang.Object printToFile,
    @Optional java.lang.Object collate,
    @Optional java.lang.Object activePrinterMacGX,
    @Optional java.lang.Object manualDuplexPrint,
    @Optional java.lang.Object printZoomColumn,
    @Optional java.lang.Object printZoomRow,
    @Optional java.lang.Object printZoomPaperWidth,
    @Optional java.lang.Object printZoomPaperHeight);


  /**
   * <p>
   * Getter method for the COM property "MailEnvelope"
   * </p>
   * @return  Returns a value of type office.IMsoEnvelopeVB
   */

  @DISPID(336) //= 0x150. The runtime will prefer the VTID if present
  @VTID(253)
  office.IMsoEnvelopeVB mailEnvelope();


  /**
   * <p>
   * Getter method for the COM property "DisableFeatures"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(337) //= 0x151. The runtime will prefer the VTID if present
  @VTID(254)
  boolean disableFeatures();


  /**
   * <p>
   * Setter method for the COM property "DisableFeatures"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(337) //= 0x151. The runtime will prefer the VTID if present
  @VTID(255)
  void disableFeatures(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "DoNotEmbedSystemFonts"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(338) //= 0x152. The runtime will prefer the VTID if present
  @VTID(256)
  boolean doNotEmbedSystemFonts();


  /**
   * <p>
   * Setter method for the COM property "DoNotEmbedSystemFonts"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(338) //= 0x152. The runtime will prefer the VTID if present
  @VTID(257)
  void doNotEmbedSystemFonts(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Signatures"
   * </p>
   * @return  Returns a value of type office.SignatureSet
   */

  @DISPID(339) //= 0x153. The runtime will prefer the VTID if present
  @VTID(258)
  office.SignatureSet signatures();


  @VTID(258)
  @ReturnValue(defaultPropertyThrough={office.SignatureSet.class})
  office.Signature signatures(
    int iSig);

  /**
   * <p>
   * Getter method for the COM property "DefaultTargetFrame"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(340) //= 0x154. The runtime will prefer the VTID if present
  @VTID(259)
  java.lang.String defaultTargetFrame();


  /**
   * <p>
   * Setter method for the COM property "DefaultTargetFrame"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(340) //= 0x154. The runtime will prefer the VTID if present
  @VTID(260)
  void defaultTargetFrame(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "HTMLDivisions"
   * </p>
   * @return  Returns a value of type word.HTMLDivisions
   */

  @DISPID(342) //= 0x156. The runtime will prefer the VTID if present
  @VTID(261)
  word.HTMLDivisions htmlDivisions();


  @VTID(261)
  @ReturnValue(defaultPropertyThrough={word.HTMLDivisions.class})
  word.HTMLDivision htmlDivisions(
    int index);

  /**
   * <p>
   * Getter method for the COM property "DisableFeaturesIntroducedAfter"
   * </p>
   * @return  Returns a value of type word.WdDisableFeaturesIntroducedAfter
   */

  @DISPID(343) //= 0x157. The runtime will prefer the VTID if present
  @VTID(262)
  word.WdDisableFeaturesIntroducedAfter disableFeaturesIntroducedAfter();


  /**
   * <p>
   * Setter method for the COM property "DisableFeaturesIntroducedAfter"
   * </p>
   * @param prop Mandatory word.WdDisableFeaturesIntroducedAfter parameter.
   */

  @DISPID(343) //= 0x157. The runtime will prefer the VTID if present
  @VTID(263)
  void disableFeaturesIntroducedAfter(
    word.WdDisableFeaturesIntroducedAfter prop);


  /**
   * <p>
   * Getter method for the COM property "RemovePersonalInformation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(344) //= 0x158. The runtime will prefer the VTID if present
  @VTID(264)
  boolean removePersonalInformation();


  /**
   * <p>
   * Setter method for the COM property "RemovePersonalInformation"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(344) //= 0x158. The runtime will prefer the VTID if present
  @VTID(265)
  void removePersonalInformation(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SmartTags"
   * </p>
   * @return  Returns a value of type word.SmartTags
   */

  @DISPID(346) //= 0x15a. The runtime will prefer the VTID if present
  @VTID(266)
  word.SmartTags smartTags();


  @VTID(266)
  @ReturnValue(defaultPropertyThrough={word.SmartTags.class})
  word.SmartTag smartTags(
    java.lang.Object index);

  /**
   * @param name Mandatory java.lang.String parameter.
   * @param authorName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param compareTarget Optional parameter. Default value is com4j.Variant.getMissing()
   * @param detectFormatChanges Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreAllComparisonWarnings Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToRecentFiles Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(345) //= 0x159. The runtime will prefer the VTID if present
  @VTID(267)
  void compare2002(
    java.lang.String name,
    @Optional java.lang.Object authorName,
    @Optional java.lang.Object compareTarget,
    @Optional java.lang.Object detectFormatChanges,
    @Optional java.lang.Object ignoreAllComparisonWarnings,
    @Optional java.lang.Object addToRecentFiles);


  /**
   * @param saveChanges Optional parameter. Default value is false
   * @param comments Optional parameter. Default value is com4j.Variant.getMissing()
   * @param makePublic Optional parameter. Default value is false
   */

  @DISPID(349) //= 0x15d. The runtime will prefer the VTID if present
  @VTID(268)
  void checkIn(
    @Optional @DefaultValue("-1") boolean saveChanges,
    @Optional java.lang.Object comments,
    @Optional @DefaultValue("0") boolean makePublic);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(351) //= 0x15f. The runtime will prefer the VTID if present
  @VTID(269)
  boolean canCheckin();


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param mergeTarget Optional parameter. Default value is com4j.Variant.getMissing()
   * @param detectFormatChanges Optional parameter. Default value is com4j.Variant.getMissing()
   * @param useFormattingFrom Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToRecentFiles Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(362) //= 0x16a. The runtime will prefer the VTID if present
  @VTID(270)
  void merge(
    java.lang.String fileName,
    @Optional java.lang.Object mergeTarget,
    @Optional java.lang.Object detectFormatChanges,
    @Optional java.lang.Object useFormattingFrom,
    @Optional java.lang.Object addToRecentFiles);


  /**
   * <p>
   * Getter method for the COM property "EmbedSmartTags"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(347) //= 0x15b. The runtime will prefer the VTID if present
  @VTID(271)
  boolean embedSmartTags();


  /**
   * <p>
   * Setter method for the COM property "EmbedSmartTags"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(347) //= 0x15b. The runtime will prefer the VTID if present
  @VTID(272)
  void embedSmartTags(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SmartTagsAsXMLProps"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(348) //= 0x15c. The runtime will prefer the VTID if present
  @VTID(273)
  boolean smartTagsAsXMLProps();


  /**
   * <p>
   * Setter method for the COM property "SmartTagsAsXMLProps"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(348) //= 0x15c. The runtime will prefer the VTID if present
  @VTID(274)
  void smartTagsAsXMLProps(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "TextEncoding"
   * </p>
   * @return  Returns a value of type office.MsoEncoding
   */

  @DISPID(357) //= 0x165. The runtime will prefer the VTID if present
  @VTID(275)
  office.MsoEncoding textEncoding();


  /**
   * <p>
   * Setter method for the COM property "TextEncoding"
   * </p>
   * @param prop Mandatory office.MsoEncoding parameter.
   */

  @DISPID(357) //= 0x165. The runtime will prefer the VTID if present
  @VTID(276)
  void textEncoding(
    office.MsoEncoding prop);


  /**
   * <p>
   * Getter method for the COM property "TextLineEnding"
   * </p>
   * @return  Returns a value of type word.WdLineEndingType
   */

  @DISPID(358) //= 0x166. The runtime will prefer the VTID if present
  @VTID(277)
  word.WdLineEndingType textLineEnding();


  /**
   * <p>
   * Setter method for the COM property "TextLineEnding"
   * </p>
   * @param prop Mandatory word.WdLineEndingType parameter.
   */

  @DISPID(358) //= 0x166. The runtime will prefer the VTID if present
  @VTID(278)
  void textLineEnding(
    word.WdLineEndingType prop);


  /**
   * @param recipients Optional parameter. Default value is com4j.Variant.getMissing()
   * @param subject Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showMessage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param includeAttachment Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(353) //= 0x161. The runtime will prefer the VTID if present
  @VTID(279)
  void sendForReview(
    @Optional java.lang.Object recipients,
    @Optional java.lang.Object subject,
    @Optional java.lang.Object showMessage,
    @Optional java.lang.Object includeAttachment);


  /**
   * @param showMessage Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(354) //= 0x162. The runtime will prefer the VTID if present
  @VTID(280)
  void replyWithChanges(
    @Optional java.lang.Object showMessage);


  /**
   */

  @DISPID(356) //= 0x164. The runtime will prefer the VTID if present
  @VTID(281)
  void endReview();


  /**
   * <p>
   * Getter method for the COM property "StyleSheets"
   * </p>
   * @return  Returns a value of type word.StyleSheets
   */

  @DISPID(360) //= 0x168. The runtime will prefer the VTID if present
  @VTID(282)
  word.StyleSheets styleSheets();


  @VTID(282)
  @ReturnValue(defaultPropertyThrough={word.StyleSheets.class})
  word.StyleSheet styleSheets(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "DefaultTableStyle"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(365) //= 0x16d. The runtime will prefer the VTID if present
  @VTID(283)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object defaultTableStyle();


  /**
   * <p>
   * Getter method for the COM property "PasswordEncryptionProvider"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(367) //= 0x16f. The runtime will prefer the VTID if present
  @VTID(284)
  java.lang.String passwordEncryptionProvider();


  /**
   * <p>
   * Getter method for the COM property "PasswordEncryptionAlgorithm"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(368) //= 0x170. The runtime will prefer the VTID if present
  @VTID(285)
  java.lang.String passwordEncryptionAlgorithm();


  /**
   * <p>
   * Getter method for the COM property "PasswordEncryptionKeyLength"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(369) //= 0x171. The runtime will prefer the VTID if present
  @VTID(286)
  int passwordEncryptionKeyLength();


  /**
   * <p>
   * Getter method for the COM property "PasswordEncryptionFileProperties"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(370) //= 0x172. The runtime will prefer the VTID if present
  @VTID(287)
  boolean passwordEncryptionFileProperties();


  /**
   * @param passwordEncryptionProvider Mandatory java.lang.String parameter.
   * @param passwordEncryptionAlgorithm Mandatory java.lang.String parameter.
   * @param passwordEncryptionKeyLength Mandatory int parameter.
   * @param passwordEncryptionFileProperties Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(361) //= 0x169. The runtime will prefer the VTID if present
  @VTID(288)
  void setPasswordEncryptionOptions(
    java.lang.String passwordEncryptionProvider,
    java.lang.String passwordEncryptionAlgorithm,
    int passwordEncryptionKeyLength,
    @Optional java.lang.Object passwordEncryptionFileProperties);


  /**
   */

  @DISPID(363) //= 0x16b. The runtime will prefer the VTID if present
  @VTID(289)
  void recheckSmartTags();


  /**
   */

  @DISPID(364) //= 0x16c. The runtime will prefer the VTID if present
  @VTID(290)
  void removeSmartTags();


  /**
   * @param style Mandatory java.lang.Object parameter.
   * @param setInTemplate Mandatory boolean parameter.
   */

  @DISPID(366) //= 0x16e. The runtime will prefer the VTID if present
  @VTID(291)
  void setDefaultTableStyle(
    java.lang.Object style,
    boolean setInTemplate);


  /**
   */

  @DISPID(371) //= 0x173. The runtime will prefer the VTID if present
  @VTID(292)
  void deleteAllComments();


  /**
   */

  @DISPID(372) //= 0x174. The runtime will prefer the VTID if present
  @VTID(293)
  void acceptAllRevisionsShown();


  /**
   */

  @DISPID(373) //= 0x175. The runtime will prefer the VTID if present
  @VTID(294)
  void rejectAllRevisionsShown();


  /**
   */

  @DISPID(374) //= 0x176. The runtime will prefer the VTID if present
  @VTID(295)
  void deleteAllCommentsShown();


  /**
   */

  @DISPID(375) //= 0x177. The runtime will prefer the VTID if present
  @VTID(296)
  void resetFormFields();


  /**
   * @param fileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fileFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lockComments Optional parameter. Default value is com4j.Variant.getMissing()
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToRecentFiles Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePassword Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnlyRecommended Optional parameter. Default value is com4j.Variant.getMissing()
   * @param embedTrueTypeFonts Optional parameter. Default value is com4j.Variant.getMissing()
   * @param saveNativePictureFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param saveFormsData Optional parameter. Default value is com4j.Variant.getMissing()
   * @param saveAsAOCELetter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param encoding Optional parameter. Default value is com4j.Variant.getMissing()
   * @param insertLineBreaks Optional parameter. Default value is com4j.Variant.getMissing()
   * @param allowSubstitutions Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lineEnding Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addBiDiMarks Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(376) //= 0x178. The runtime will prefer the VTID if present
  @VTID(297)
  void saveAs(
    @Optional java.lang.Object fileName,
    @Optional java.lang.Object fileFormat,
    @Optional java.lang.Object lockComments,
    @Optional java.lang.Object password,
    @Optional java.lang.Object addToRecentFiles,
    @Optional java.lang.Object writePassword,
    @Optional java.lang.Object readOnlyRecommended,
    @Optional java.lang.Object embedTrueTypeFonts,
    @Optional java.lang.Object saveNativePictureFormat,
    @Optional java.lang.Object saveFormsData,
    @Optional java.lang.Object saveAsAOCELetter,
    @Optional java.lang.Object encoding,
    @Optional java.lang.Object insertLineBreaks,
    @Optional java.lang.Object allowSubstitutions,
    @Optional java.lang.Object lineEnding,
    @Optional java.lang.Object addBiDiMarks);


  /**
   * <p>
   * Getter method for the COM property "EmbedLinguisticData"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(377) //= 0x179. The runtime will prefer the VTID if present
  @VTID(298)
  boolean embedLinguisticData();


  /**
   * <p>
   * Setter method for the COM property "EmbedLinguisticData"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(377) //= 0x179. The runtime will prefer the VTID if present
  @VTID(299)
  void embedLinguisticData(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "FormattingShowFont"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(448) //= 0x1c0. The runtime will prefer the VTID if present
  @VTID(300)
  boolean formattingShowFont();


  /**
   * <p>
   * Setter method for the COM property "FormattingShowFont"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(448) //= 0x1c0. The runtime will prefer the VTID if present
  @VTID(301)
  void formattingShowFont(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "FormattingShowClear"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(449) //= 0x1c1. The runtime will prefer the VTID if present
  @VTID(302)
  boolean formattingShowClear();


  /**
   * <p>
   * Setter method for the COM property "FormattingShowClear"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(449) //= 0x1c1. The runtime will prefer the VTID if present
  @VTID(303)
  void formattingShowClear(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "FormattingShowParagraph"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(450) //= 0x1c2. The runtime will prefer the VTID if present
  @VTID(304)
  boolean formattingShowParagraph();


  /**
   * <p>
   * Setter method for the COM property "FormattingShowParagraph"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(450) //= 0x1c2. The runtime will prefer the VTID if present
  @VTID(305)
  void formattingShowParagraph(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "FormattingShowNumbering"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(451) //= 0x1c3. The runtime will prefer the VTID if present
  @VTID(306)
  boolean formattingShowNumbering();


  /**
   * <p>
   * Setter method for the COM property "FormattingShowNumbering"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(451) //= 0x1c3. The runtime will prefer the VTID if present
  @VTID(307)
  void formattingShowNumbering(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "FormattingShowFilter"
   * </p>
   * @return  Returns a value of type word.WdShowFilter
   */

  @DISPID(452) //= 0x1c4. The runtime will prefer the VTID if present
  @VTID(308)
  word.WdShowFilter formattingShowFilter();


  /**
   * <p>
   * Setter method for the COM property "FormattingShowFilter"
   * </p>
   * @param prop Mandatory word.WdShowFilter parameter.
   */

  @DISPID(452) //= 0x1c4. The runtime will prefer the VTID if present
  @VTID(309)
  void formattingShowFilter(
    word.WdShowFilter prop);


  /**
   */

  @DISPID(378) //= 0x17a. The runtime will prefer the VTID if present
  @VTID(310)
  void checkNewSmartTags();


  /**
   * <p>
   * Getter method for the COM property "Permission"
   * </p>
   * @return  Returns a value of type office.Permission
   */

  @DISPID(453) //= 0x1c5. The runtime will prefer the VTID if present
  @VTID(311)
  office.Permission permission();


  @VTID(311)
  @ReturnValue(defaultPropertyThrough={office.Permission.class})
  office.UserPermission permission(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "XMLNodes"
   * </p>
   * @return  Returns a value of type word.XMLNodes
   */

  @DISPID(460) //= 0x1cc. The runtime will prefer the VTID if present
  @VTID(312)
  word.XMLNodes xmlNodes();


  @VTID(312)
  @ReturnValue(defaultPropertyThrough={word.XMLNodes.class})
  word.XMLNode xmlNodes(
    int index);

  /**
   * <p>
   * Getter method for the COM property "XMLSchemaReferences"
   * </p>
   * @return  Returns a value of type word.XMLSchemaReferences
   */

  @DISPID(461) //= 0x1cd. The runtime will prefer the VTID if present
  @VTID(313)
  word.XMLSchemaReferences xmlSchemaReferences();


  @VTID(313)
  @ReturnValue(defaultPropertyThrough={word.XMLSchemaReferences.class})
  word.XMLSchemaReference xmlSchemaReferences(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "SmartDocument"
   * </p>
   * @return  Returns a value of type office.SmartDocument
   */

  @DISPID(462) //= 0x1ce. The runtime will prefer the VTID if present
  @VTID(314)
  office.SmartDocument smartDocument();


  /**
   * <p>
   * Getter method for the COM property "SharedWorkspace"
   * </p>
   * @return  Returns a value of type office.SharedWorkspace
   */

  @DISPID(463) //= 0x1cf. The runtime will prefer the VTID if present
  @VTID(315)
  office.SharedWorkspace sharedWorkspace();


  /**
   * <p>
   * Getter method for the COM property "Sync"
   * </p>
   * @return  Returns a value of type office.Sync
   */

  @DISPID(466) //= 0x1d2. The runtime will prefer the VTID if present
  @VTID(316)
  office.Sync sync();


  /**
   * <p>
   * Getter method for the COM property "EnforceStyle"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(471) //= 0x1d7. The runtime will prefer the VTID if present
  @VTID(317)
  boolean enforceStyle();


  /**
   * <p>
   * Setter method for the COM property "EnforceStyle"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(471) //= 0x1d7. The runtime will prefer the VTID if present
  @VTID(318)
  void enforceStyle(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatOverride"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(472) //= 0x1d8. The runtime will prefer the VTID if present
  @VTID(319)
  boolean autoFormatOverride();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatOverride"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(472) //= 0x1d8. The runtime will prefer the VTID if present
  @VTID(320)
  void autoFormatOverride(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "XMLSaveDataOnly"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(473) //= 0x1d9. The runtime will prefer the VTID if present
  @VTID(321)
  boolean xmlSaveDataOnly();


  /**
   * <p>
   * Setter method for the COM property "XMLSaveDataOnly"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(473) //= 0x1d9. The runtime will prefer the VTID if present
  @VTID(322)
  void xmlSaveDataOnly(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "XMLHideNamespaces"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(477) //= 0x1dd. The runtime will prefer the VTID if present
  @VTID(323)
  boolean xmlHideNamespaces();


  /**
   * <p>
   * Setter method for the COM property "XMLHideNamespaces"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(477) //= 0x1dd. The runtime will prefer the VTID if present
  @VTID(324)
  void xmlHideNamespaces(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "XMLShowAdvancedErrors"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(478) //= 0x1de. The runtime will prefer the VTID if present
  @VTID(325)
  boolean xmlShowAdvancedErrors();


  /**
   * <p>
   * Setter method for the COM property "XMLShowAdvancedErrors"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(478) //= 0x1de. The runtime will prefer the VTID if present
  @VTID(326)
  void xmlShowAdvancedErrors(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "XMLUseXSLTWhenSaving"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(474) //= 0x1da. The runtime will prefer the VTID if present
  @VTID(327)
  boolean xmlUseXSLTWhenSaving();


  /**
   * <p>
   * Setter method for the COM property "XMLUseXSLTWhenSaving"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(474) //= 0x1da. The runtime will prefer the VTID if present
  @VTID(328)
  void xmlUseXSLTWhenSaving(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "XMLSaveThroughXSLT"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(475) //= 0x1db. The runtime will prefer the VTID if present
  @VTID(329)
  java.lang.String xmlSaveThroughXSLT();


  /**
   * <p>
   * Setter method for the COM property "XMLSaveThroughXSLT"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(475) //= 0x1db. The runtime will prefer the VTID if present
  @VTID(330)
  void xmlSaveThroughXSLT(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "DocumentLibraryVersions"
   * </p>
   * @return  Returns a value of type office.DocumentLibraryVersions
   */

  @DISPID(476) //= 0x1dc. The runtime will prefer the VTID if present
  @VTID(331)
  office.DocumentLibraryVersions documentLibraryVersions();


  @VTID(331)
  @ReturnValue(defaultPropertyThrough={office.DocumentLibraryVersions.class})
  office.DocumentLibraryVersion documentLibraryVersions(
    int lIndex);

  /**
   * <p>
   * Getter method for the COM property "ReadingModeLayoutFrozen"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(481) //= 0x1e1. The runtime will prefer the VTID if present
  @VTID(332)
  boolean readingModeLayoutFrozen();


  /**
   * <p>
   * Setter method for the COM property "ReadingModeLayoutFrozen"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(481) //= 0x1e1. The runtime will prefer the VTID if present
  @VTID(333)
  void readingModeLayoutFrozen(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "RemoveDateAndTime"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(484) //= 0x1e4. The runtime will prefer the VTID if present
  @VTID(334)
  boolean removeDateAndTime();


  /**
   * <p>
   * Setter method for the COM property "RemoveDateAndTime"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(484) //= 0x1e4. The runtime will prefer the VTID if present
  @VTID(335)
  void removeDateAndTime(
    boolean prop);


  /**
   * @param recipients Optional parameter. Default value is com4j.Variant.getMissing()
   * @param subject Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showMessage Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(464) //= 0x1d0. The runtime will prefer the VTID if present
  @VTID(336)
  void sendFaxOverInternet(
    @Optional java.lang.Object recipients,
    @Optional java.lang.Object subject,
    @Optional java.lang.Object showMessage);


  /**
   * @param path Mandatory java.lang.String parameter.
   * @param dataOnly Optional parameter. Default value is false
   */

  @DISPID(500) //= 0x1f4. The runtime will prefer the VTID if present
  @VTID(337)
  void transformDocument(
    java.lang.String path,
    @Optional @DefaultValue("-1") boolean dataOnly);


  /**
   * @param type Mandatory word.WdProtectionType parameter.
   * @param noReset Optional parameter. Default value is com4j.Variant.getMissing()
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param useIRM Optional parameter. Default value is com4j.Variant.getMissing()
   * @param enforceStyleLock Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(467) //= 0x1d3. The runtime will prefer the VTID if present
  @VTID(338)
  void protect(
    word.WdProtectionType type,
    @Optional java.lang.Object noReset,
    @Optional java.lang.Object password,
    @Optional java.lang.Object useIRM,
    @Optional java.lang.Object enforceStyleLock);


  /**
   * @param editorID Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(468) //= 0x1d4. The runtime will prefer the VTID if present
  @VTID(339)
  void selectAllEditableRanges(
    @Optional java.lang.Object editorID);


  /**
   * @param editorID Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(469) //= 0x1d5. The runtime will prefer the VTID if present
  @VTID(340)
  void deleteAllEditableRanges(
    @Optional java.lang.Object editorID);


  /**
   */

  @DISPID(479) //= 0x1df. The runtime will prefer the VTID if present
  @VTID(341)
  void deleteAllInkAnnotations();


  /**
   * @param richFormat Mandatory boolean parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param title Mandatory java.lang.String parameter.
   * @param description Mandatory java.lang.String parameter.
   * @param id Mandatory java.lang.String parameter.
   */

  @DISPID(482) //= 0x1e2. The runtime will prefer the VTID if present
  @VTID(342)
  void addDocumentWorkspaceHeader(
    boolean richFormat,
    java.lang.String url,
    java.lang.String title,
    java.lang.String description,
    java.lang.String id);


  /**
   * @param id Mandatory java.lang.String parameter.
   */

  @DISPID(483) //= 0x1e3. The runtime will prefer the VTID if present
  @VTID(343)
  void removeDocumentWorkspaceHeader(
    java.lang.String id);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param authorName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param compareTarget Optional parameter. Default value is com4j.Variant.getMissing()
   * @param detectFormatChanges Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreAllComparisonWarnings Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToRecentFiles Optional parameter. Default value is com4j.Variant.getMissing()
   * @param removePersonalInformation Optional parameter. Default value is com4j.Variant.getMissing()
   * @param removeDateAndTime Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(485) //= 0x1e5. The runtime will prefer the VTID if present
  @VTID(344)
  void compare(
    java.lang.String name,
    @Optional java.lang.Object authorName,
    @Optional java.lang.Object compareTarget,
    @Optional java.lang.Object detectFormatChanges,
    @Optional java.lang.Object ignoreAllComparisonWarnings,
    @Optional java.lang.Object addToRecentFiles,
    @Optional java.lang.Object removePersonalInformation,
    @Optional java.lang.Object removeDateAndTime);


  /**
   */

  @DISPID(487) //= 0x1e7. The runtime will prefer the VTID if present
  @VTID(345)
  void removeLockedStyles();


  /**
   * <p>
   * Getter method for the COM property "ChildNodeSuggestions"
   * </p>
   * @return  Returns a value of type word.XMLChildNodeSuggestions
   */

  @DISPID(486) //= 0x1e6. The runtime will prefer the VTID if present
  @VTID(346)
  word.XMLChildNodeSuggestions childNodeSuggestions();


  @VTID(346)
  @ReturnValue(defaultPropertyThrough={word.XMLChildNodeSuggestions.class})
  word.XMLChildNodeSuggestion childNodeSuggestions(
    java.lang.Object index);

  /**
   * @param xPath Mandatory java.lang.String parameter.
   * @param prefixMapping Optional parameter. Default value is ""
   * @param fastSearchSkippingTextNodes Optional parameter. Default value is false
   * @return  Returns a value of type word.XMLNode
   */

  @DISPID(488) //= 0x1e8. The runtime will prefer the VTID if present
  @VTID(347)
  word.XMLNode selectSingleNode(
    java.lang.String xPath,
    @Optional @DefaultValue("") java.lang.String prefixMapping,
    @Optional @DefaultValue("-1") boolean fastSearchSkippingTextNodes);


  /**
   * @param xPath Mandatory java.lang.String parameter.
   * @param prefixMapping Optional parameter. Default value is ""
   * @param fastSearchSkippingTextNodes Optional parameter. Default value is false
   * @return  Returns a value of type word.XMLNodes
   */

  @DISPID(489) //= 0x1e9. The runtime will prefer the VTID if present
  @VTID(348)
  word.XMLNodes selectNodes(
    java.lang.String xPath,
    @Optional @DefaultValue("") java.lang.String prefixMapping,
    @Optional @DefaultValue("-1") boolean fastSearchSkippingTextNodes);


  /**
   * <p>
   * Getter method for the COM property "XMLSchemaViolations"
   * </p>
   * @return  Returns a value of type word.XMLNodes
   */

  @DISPID(490) //= 0x1ea. The runtime will prefer the VTID if present
  @VTID(349)
  word.XMLNodes xmlSchemaViolations();


  @VTID(349)
  @ReturnValue(defaultPropertyThrough={word.XMLNodes.class})
  word.XMLNode xmlSchemaViolations(
    int index);

  /**
   * <p>
   * Getter method for the COM property "ReadingLayoutSizeX"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(491) //= 0x1eb. The runtime will prefer the VTID if present
  @VTID(350)
  int readingLayoutSizeX();


  /**
   * <p>
   * Setter method for the COM property "ReadingLayoutSizeX"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(491) //= 0x1eb. The runtime will prefer the VTID if present
  @VTID(351)
  void readingLayoutSizeX(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "ReadingLayoutSizeY"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(492) //= 0x1ec. The runtime will prefer the VTID if present
  @VTID(352)
  int readingLayoutSizeY();


  /**
   * <p>
   * Setter method for the COM property "ReadingLayoutSizeY"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(492) //= 0x1ec. The runtime will prefer the VTID if present
  @VTID(353)
  void readingLayoutSizeY(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "StyleSortMethod"
   * </p>
   * @return  Returns a value of type word.WdStyleSort
   */

  @DISPID(493) //= 0x1ed. The runtime will prefer the VTID if present
  @VTID(354)
  word.WdStyleSort styleSortMethod();


  /**
   * <p>
   * Setter method for the COM property "StyleSortMethod"
   * </p>
   * @param prop Mandatory word.WdStyleSort parameter.
   */

  @DISPID(493) //= 0x1ed. The runtime will prefer the VTID if present
  @VTID(355)
  void styleSortMethod(
    word.WdStyleSort prop);


  /**
   * <p>
   * Getter method for the COM property "ContentTypeProperties"
   * </p>
   * @return  Returns a value of type office.MetaProperties
   */

  @DISPID(496) //= 0x1f0. The runtime will prefer the VTID if present
  @VTID(356)
  office.MetaProperties contentTypeProperties();


  @VTID(356)
  @ReturnValue(defaultPropertyThrough={office.MetaProperties.class})
  office.MetaProperty contentTypeProperties(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "TrackMoves"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(499) //= 0x1f3. The runtime will prefer the VTID if present
  @VTID(357)
  boolean trackMoves();


  /**
   * <p>
   * Setter method for the COM property "TrackMoves"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(499) //= 0x1f3. The runtime will prefer the VTID if present
  @VTID(358)
  void trackMoves(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "TrackFormatting"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(502) //= 0x1f6. The runtime will prefer the VTID if present
  @VTID(359)
  boolean trackFormatting();


  /**
   * <p>
   * Setter method for the COM property "TrackFormatting"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(502) //= 0x1f6. The runtime will prefer the VTID if present
  @VTID(360)
  void trackFormatting(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Dummy1"
   * </p>
   */

  @DISPID(503) //= 0x1f7. The runtime will prefer the VTID if present
  @VTID(361)
  void dummy1();


  /**
   * <p>
   * Getter method for the COM property "OMaths"
   * </p>
   * @return  Returns a value of type word.OMaths
   */

  @DISPID(504) //= 0x1f8. The runtime will prefer the VTID if present
  @VTID(362)
  word.OMaths oMaths();


  @VTID(362)
  @ReturnValue(defaultPropertyThrough={word.OMaths.class})
  word.OMath oMaths(
    int index);

  /**
   * @param removeDocInfoType Mandatory word.WdRemoveDocInfoType parameter.
   */

  @DISPID(495) //= 0x1ef. The runtime will prefer the VTID if present
  @VTID(363)
  void removeDocumentInformation(
    word.WdRemoveDocInfoType removeDocInfoType);


  /**
   * @param saveChanges Optional parameter. Default value is false
   * @param comments Optional parameter. Default value is com4j.Variant.getMissing()
   * @param makePublic Optional parameter. Default value is false
   * @param versionType Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(501) //= 0x1f5. The runtime will prefer the VTID if present
  @VTID(364)
  void checkInWithVersion(
    @Optional @DefaultValue("-1") boolean saveChanges,
    @Optional java.lang.Object comments,
    @Optional @DefaultValue("0") boolean makePublic,
    @Optional java.lang.Object versionType);


  /**
   */

  @DISPID(505) //= 0x1f9. The runtime will prefer the VTID if present
  @VTID(365)
  void dummy2();


  /**
   * <p>
   * Getter method for the COM property "Dummy3"
   * </p>
   */

  @DISPID(506) //= 0x1fa. The runtime will prefer the VTID if present
  @VTID(366)
  void dummy3();


  /**
   * <p>
   * Getter method for the COM property "ServerPolicy"
   * </p>
   * @return  Returns a value of type office.ServerPolicy
   */

  @DISPID(507) //= 0x1fb. The runtime will prefer the VTID if present
  @VTID(367)
  office.ServerPolicy serverPolicy();


  @VTID(367)
  @ReturnValue(defaultPropertyThrough={office.ServerPolicy.class})
  office.PolicyItem serverPolicy(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "ContentControls"
   * </p>
   * @return  Returns a value of type word.ContentControls
   */

  @DISPID(508) //= 0x1fc. The runtime will prefer the VTID if present
  @VTID(368)
  word.ContentControls contentControls();


  @VTID(368)
  @ReturnValue(defaultPropertyThrough={word.ContentControls.class})
  word.ContentControl contentControls(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "DocumentInspectors"
   * </p>
   * @return  Returns a value of type office.DocumentInspectors
   */

  @DISPID(510) //= 0x1fe. The runtime will prefer the VTID if present
  @VTID(369)
  office.DocumentInspectors documentInspectors();


  @VTID(369)
  @ReturnValue(defaultPropertyThrough={office.DocumentInspectors.class})
  office.DocumentInspector documentInspectors(
    int index);

  /**
   */

  @DISPID(509) //= 0x1fd. The runtime will prefer the VTID if present
  @VTID(370)
  void lockServerFile();


  /**
   * @return  Returns a value of type office.WorkflowTasks
   */

  @DISPID(511) //= 0x1ff. The runtime will prefer the VTID if present
  @VTID(371)
  office.WorkflowTasks getWorkflowTasks();


  @VTID(371)
  @ReturnValue(defaultPropertyThrough={office.WorkflowTasks.class})
  office.WorkflowTask getWorkflowTasks(
    int index);

  /**
   * @return  Returns a value of type office.WorkflowTemplates
   */

  @DISPID(512) //= 0x200. The runtime will prefer the VTID if present
  @VTID(372)
  office.WorkflowTemplates getWorkflowTemplates();


  @VTID(372)
  @ReturnValue(defaultPropertyThrough={office.WorkflowTemplates.class})
  office.WorkflowTemplate getWorkflowTemplates(
    int index);

  /**
   */

  @DISPID(514) //= 0x202. The runtime will prefer the VTID if present
  @VTID(373)
  void dummy4();


  /**
   * @param skipIfAbsent Mandatory boolean parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param title Mandatory java.lang.String parameter.
   * @param description Mandatory java.lang.String parameter.
   * @param id Mandatory java.lang.String parameter.
   */

  @DISPID(515) //= 0x203. The runtime will prefer the VTID if present
  @VTID(374)
  void addMeetingWorkspaceHeader(
    boolean skipIfAbsent,
    java.lang.String url,
    java.lang.String title,
    java.lang.String description,
    java.lang.String id);


  /**
   * <p>
   * Getter method for the COM property "Bibliography"
   * </p>
   * @return  Returns a value of type word.Bibliography
   */

  @DISPID(516) //= 0x204. The runtime will prefer the VTID if present
  @VTID(375)
  word.Bibliography bibliography();


  /**
   * <p>
   * Getter method for the COM property "LockTheme"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(517) //= 0x205. The runtime will prefer the VTID if present
  @VTID(376)
  boolean lockTheme();


  /**
   * <p>
   * Setter method for the COM property "LockTheme"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(517) //= 0x205. The runtime will prefer the VTID if present
  @VTID(377)
  void lockTheme(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "LockQuickStyleSet"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(518) //= 0x206. The runtime will prefer the VTID if present
  @VTID(378)
  boolean lockQuickStyleSet();


  /**
   * <p>
   * Setter method for the COM property "LockQuickStyleSet"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(518) //= 0x206. The runtime will prefer the VTID if present
  @VTID(379)
  void lockQuickStyleSet(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "OriginalDocumentTitle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(519) //= 0x207. The runtime will prefer the VTID if present
  @VTID(380)
  java.lang.String originalDocumentTitle();


  /**
   * <p>
   * Getter method for the COM property "RevisedDocumentTitle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(520) //= 0x208. The runtime will prefer the VTID if present
  @VTID(381)
  java.lang.String revisedDocumentTitle();


  /**
   * <p>
   * Getter method for the COM property "CustomXMLParts"
   * </p>
   * @return  Returns a value of type office._CustomXMLParts
   */

  @DISPID(521) //= 0x209. The runtime will prefer the VTID if present
  @VTID(382)
  office._CustomXMLParts customXMLParts();


  /**
   * <p>
   * Getter method for the COM property "FormattingShowNextLevel"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(522) //= 0x20a. The runtime will prefer the VTID if present
  @VTID(383)
  boolean formattingShowNextLevel();


  /**
   * <p>
   * Setter method for the COM property "FormattingShowNextLevel"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(522) //= 0x20a. The runtime will prefer the VTID if present
  @VTID(384)
  void formattingShowNextLevel(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "FormattingShowUserStyleName"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(523) //= 0x20b. The runtime will prefer the VTID if present
  @VTID(385)
  boolean formattingShowUserStyleName();


  /**
   * <p>
   * Setter method for the COM property "FormattingShowUserStyleName"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(523) //= 0x20b. The runtime will prefer the VTID if present
  @VTID(386)
  void formattingShowUserStyleName(
    boolean prop);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(524) //= 0x20c. The runtime will prefer the VTID if present
  @VTID(387)
  void saveAsQuickStyleSet(
    java.lang.String fileName);


  /**
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(525) //= 0x20d. The runtime will prefer the VTID if present
  @VTID(388)
  void applyQuickStyleSet(
    java.lang.String name);


  /**
   * <p>
   * Getter method for the COM property "Research"
   * </p>
   * @return  Returns a value of type word.Research
   */

  @DISPID(526) //= 0x20e. The runtime will prefer the VTID if present
  @VTID(389)
  word.Research research();


  /**
   * <p>
   * Getter method for the COM property "Final"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(527) //= 0x20f. The runtime will prefer the VTID if present
  @VTID(390)
  boolean _final();


  /**
   * <p>
   * Setter method for the COM property "Final"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(527) //= 0x20f. The runtime will prefer the VTID if present
  @VTID(391)
  void _final(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "OMathBreakBin"
   * </p>
   * @return  Returns a value of type word.WdOMathBreakBin
   */

  @DISPID(528) //= 0x210. The runtime will prefer the VTID if present
  @VTID(392)
  word.WdOMathBreakBin oMathBreakBin();


  /**
   * <p>
   * Setter method for the COM property "OMathBreakBin"
   * </p>
   * @param prop Mandatory word.WdOMathBreakBin parameter.
   */

  @DISPID(528) //= 0x210. The runtime will prefer the VTID if present
  @VTID(393)
  void oMathBreakBin(
    word.WdOMathBreakBin prop);


  /**
   * <p>
   * Getter method for the COM property "OMathBreakSub"
   * </p>
   * @return  Returns a value of type word.WdOMathBreakSub
   */

  @DISPID(529) //= 0x211. The runtime will prefer the VTID if present
  @VTID(394)
  word.WdOMathBreakSub oMathBreakSub();


  /**
   * <p>
   * Setter method for the COM property "OMathBreakSub"
   * </p>
   * @param prop Mandatory word.WdOMathBreakSub parameter.
   */

  @DISPID(529) //= 0x211. The runtime will prefer the VTID if present
  @VTID(395)
  void oMathBreakSub(
    word.WdOMathBreakSub prop);


  /**
   * <p>
   * Getter method for the COM property "OMathJc"
   * </p>
   * @return  Returns a value of type word.WdOMathJc
   */

  @DISPID(530) //= 0x212. The runtime will prefer the VTID if present
  @VTID(396)
  word.WdOMathJc oMathJc();


  /**
   * <p>
   * Setter method for the COM property "OMathJc"
   * </p>
   * @param prop Mandatory word.WdOMathJc parameter.
   */

  @DISPID(530) //= 0x212. The runtime will prefer the VTID if present
  @VTID(397)
  void oMathJc(
    word.WdOMathJc prop);


  /**
   * <p>
   * Getter method for the COM property "OMathLeftMargin"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(531) //= 0x213. The runtime will prefer the VTID if present
  @VTID(398)
  float oMathLeftMargin();


  /**
   * <p>
   * Setter method for the COM property "OMathLeftMargin"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(531) //= 0x213. The runtime will prefer the VTID if present
  @VTID(399)
  void oMathLeftMargin(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "OMathRightMargin"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(532) //= 0x214. The runtime will prefer the VTID if present
  @VTID(400)
  float oMathRightMargin();


  /**
   * <p>
   * Setter method for the COM property "OMathRightMargin"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(532) //= 0x214. The runtime will prefer the VTID if present
  @VTID(401)
  void oMathRightMargin(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "OMathWrap"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(535) //= 0x217. The runtime will prefer the VTID if present
  @VTID(402)
  float oMathWrap();


  /**
   * <p>
   * Setter method for the COM property "OMathWrap"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(535) //= 0x217. The runtime will prefer the VTID if present
  @VTID(403)
  void oMathWrap(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "OMathIntSubSupLim"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(536) //= 0x218. The runtime will prefer the VTID if present
  @VTID(404)
  boolean oMathIntSubSupLim();


  /**
   * <p>
   * Setter method for the COM property "OMathIntSubSupLim"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(536) //= 0x218. The runtime will prefer the VTID if present
  @VTID(405)
  void oMathIntSubSupLim(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "OMathNarySupSubLim"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(537) //= 0x219. The runtime will prefer the VTID if present
  @VTID(406)
  boolean oMathNarySupSubLim();


  /**
   * <p>
   * Setter method for the COM property "OMathNarySupSubLim"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(537) //= 0x219. The runtime will prefer the VTID if present
  @VTID(407)
  void oMathNarySupSubLim(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "OMathSmallFrac"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(539) //= 0x21b. The runtime will prefer the VTID if present
  @VTID(408)
  boolean oMathSmallFrac();


  /**
   * <p>
   * Setter method for the COM property "OMathSmallFrac"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(539) //= 0x21b. The runtime will prefer the VTID if present
  @VTID(409)
  void oMathSmallFrac(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "WordOpenXML"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(542) //= 0x21e. The runtime will prefer the VTID if present
  @VTID(410)
  java.lang.String wordOpenXML();


  /**
   * <p>
   * Getter method for the COM property "DocumentTheme"
   * </p>
   * @return  Returns a value of type office.OfficeTheme
   */

  @DISPID(545) //= 0x221. The runtime will prefer the VTID if present
  @VTID(411)
  office.OfficeTheme documentTheme();


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(546) //= 0x222. The runtime will prefer the VTID if present
  @VTID(412)
  void applyDocumentTheme(
    java.lang.String fileName);


  /**
   * <p>
   * Getter method for the COM property "HasVBProject"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(548) //= 0x224. The runtime will prefer the VTID if present
  @VTID(413)
  boolean hasVBProject();


  /**
   * @param node Mandatory office.CustomXMLNode parameter.
   * @return  Returns a value of type word.ContentControls
   */

  @DISPID(549) //= 0x225. The runtime will prefer the VTID if present
  @VTID(414)
  word.ContentControls selectLinkedControls(
    office.CustomXMLNode node);


  /**
   * @param stream Optional parameter. Default value is 0
   * @return  Returns a value of type word.ContentControls
   */

  @DISPID(550) //= 0x226. The runtime will prefer the VTID if present
  @VTID(415)
  word.ContentControls selectUnlinkedControls(
    @Optional @DefaultValue("0") office._CustomXMLPart stream);


  /**
   * @param title Mandatory java.lang.String parameter.
   * @return  Returns a value of type word.ContentControls
   */

  @DISPID(551) //= 0x227. The runtime will prefer the VTID if present
  @VTID(416)
  word.ContentControls selectContentControlsByTitle(
    java.lang.String title);


  /**
   * @param outputFileName Mandatory java.lang.String parameter.
   * @param exportFormat Mandatory word.WdExportFormat parameter.
   * @param openAfterExport Optional parameter. Default value is false
   * @param optimizeFor Optional parameter. Default value is 0
   * @param range Optional parameter. Default value is 0
   * @param from Optional parameter. Default value is 1
   * @param to Optional parameter. Default value is 1
   * @param item Optional parameter. Default value is 0
   * @param includeDocProps Optional parameter. Default value is false
   * @param keepIRM Optional parameter. Default value is false
   * @param createBookmarks Optional parameter. Default value is 0
   * @param docStructureTags Optional parameter. Default value is false
   * @param bitmapMissingFonts Optional parameter. Default value is false
   * @param useISO19005_1 Optional parameter. Default value is false
   * @param fixedFormatExtClassPtr Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(552) //= 0x228. The runtime will prefer the VTID if present
  @VTID(417)
  void exportAsFixedFormat(
    java.lang.String outputFileName,
    word.WdExportFormat exportFormat,
    @Optional @DefaultValue("0") boolean openAfterExport,
    @Optional @DefaultValue("0") word.WdExportOptimizeFor optimizeFor,
    @Optional @DefaultValue("0") word.WdExportRange range,
    @Optional @DefaultValue("1") int from,
    @Optional @DefaultValue("1") int to,
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

  @DISPID(553) //= 0x229. The runtime will prefer the VTID if present
  @VTID(418)
  void freezeLayout();


  /**
   */

  @DISPID(554) //= 0x22a. The runtime will prefer the VTID if present
  @VTID(419)
  void unfreezeLayout();


  /**
   * <p>
   * Getter method for the COM property "OMathFontName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(555) //= 0x22b. The runtime will prefer the VTID if present
  @VTID(420)
  java.lang.String oMathFontName();


  /**
   * <p>
   * Setter method for the COM property "OMathFontName"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(555) //= 0x22b. The runtime will prefer the VTID if present
  @VTID(421)
  void oMathFontName(
    java.lang.String prop);


  /**
   */

  @DISPID(558) //= 0x22e. The runtime will prefer the VTID if present
  @VTID(422)
  void downgradeDocument();


  /**
   * <p>
   * Getter method for the COM property "EncryptionProvider"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(559) //= 0x22f. The runtime will prefer the VTID if present
  @VTID(423)
  java.lang.String encryptionProvider();


  /**
   * <p>
   * Setter method for the COM property "EncryptionProvider"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(559) //= 0x22f. The runtime will prefer the VTID if present
  @VTID(424)
  void encryptionProvider(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "UseMathDefaults"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(560) //= 0x230. The runtime will prefer the VTID if present
  @VTID(425)
  boolean useMathDefaults();


  /**
   * <p>
   * Setter method for the COM property "UseMathDefaults"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(560) //= 0x230. The runtime will prefer the VTID if present
  @VTID(426)
  void useMathDefaults(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "CurrentRsid"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(563) //= 0x233. The runtime will prefer the VTID if present
  @VTID(427)
  int currentRsid();


  /**
   */

  @DISPID(561) //= 0x231. The runtime will prefer the VTID if present
  @VTID(428)
  void convert();


  /**
   * @param tag Mandatory java.lang.String parameter.
   * @return  Returns a value of type word.ContentControls
   */

  @DISPID(562) //= 0x232. The runtime will prefer the VTID if present
  @VTID(429)
  word.ContentControls selectContentControlsByTag(
    java.lang.String tag);


  /**
   */

  @DISPID(650) //= 0x28a. The runtime will prefer the VTID if present
  @VTID(430)
  void convertAutoHyphens();


  /**
   * <p>
   * Getter method for the COM property "DocID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(564) //= 0x234. The runtime will prefer the VTID if present
  @VTID(431)
  int docID();


  /**
   * @param style Mandatory java.lang.Object parameter.
   */

  @DISPID(566) //= 0x236. The runtime will prefer the VTID if present
  @VTID(432)
  void applyQuickStyleSet2(
    java.lang.Object style);


  /**
   * <p>
   * Getter method for the COM property "CompatibilityMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(567) //= 0x237. The runtime will prefer the VTID if present
  @VTID(433)
  int compatibilityMode();


  /**
   * @param fileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fileFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lockComments Optional parameter. Default value is com4j.Variant.getMissing()
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToRecentFiles Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePassword Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnlyRecommended Optional parameter. Default value is com4j.Variant.getMissing()
   * @param embedTrueTypeFonts Optional parameter. Default value is com4j.Variant.getMissing()
   * @param saveNativePictureFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param saveFormsData Optional parameter. Default value is com4j.Variant.getMissing()
   * @param saveAsAOCELetter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param encoding Optional parameter. Default value is com4j.Variant.getMissing()
   * @param insertLineBreaks Optional parameter. Default value is com4j.Variant.getMissing()
   * @param allowSubstitutions Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lineEnding Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addBiDiMarks Optional parameter. Default value is com4j.Variant.getMissing()
   * @param compatibilityMode Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(568) //= 0x238. The runtime will prefer the VTID if present
  @VTID(434)
  void saveAs2(
    @Optional java.lang.Object fileName,
    @Optional java.lang.Object fileFormat,
    @Optional java.lang.Object lockComments,
    @Optional java.lang.Object password,
    @Optional java.lang.Object addToRecentFiles,
    @Optional java.lang.Object writePassword,
    @Optional java.lang.Object readOnlyRecommended,
    @Optional java.lang.Object embedTrueTypeFonts,
    @Optional java.lang.Object saveNativePictureFormat,
    @Optional java.lang.Object saveFormsData,
    @Optional java.lang.Object saveAsAOCELetter,
    @Optional java.lang.Object encoding,
    @Optional java.lang.Object insertLineBreaks,
    @Optional java.lang.Object allowSubstitutions,
    @Optional java.lang.Object lineEnding,
    @Optional java.lang.Object addBiDiMarks,
    @Optional java.lang.Object compatibilityMode);


  /**
   * <p>
   * Getter method for the COM property "CoAuthoring"
   * </p>
   * @return  Returns a value of type word.CoAuthoring
   */

  @DISPID(600) //= 0x258. The runtime will prefer the VTID if present
  @VTID(435)
  word.CoAuthoring coAuthoring();


  /**
   * @param mode Mandatory int parameter.
   */

  @DISPID(571) //= 0x23b. The runtime will prefer the VTID if present
  @VTID(436)
  void setCompatibilityMode(
    int mode);


  // Properties:
}
