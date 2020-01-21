package word  ;

import com4j.*;

@IID("{000209A5-0000-0000-C000-000000000046}")
public interface View extends Com4jObject {
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
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type word.WdViewType
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  word.WdViewType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param prop Mandatory word.WdViewType parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  void type(
    word.WdViewType prop);


  /**
   * <p>
   * Getter method for the COM property "FullScreen"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(12)
  boolean fullScreen();


  /**
   * <p>
   * Setter method for the COM property "FullScreen"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(13)
  void fullScreen(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Draft"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(14)
  boolean draft();


  /**
   * <p>
   * Setter method for the COM property "Draft"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(15)
  void draft(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowAll"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(16)
  boolean showAll();


  /**
   * <p>
   * Setter method for the COM property "ShowAll"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(17)
  void showAll(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowFieldCodes"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(18)
  boolean showFieldCodes();


  /**
   * <p>
   * Setter method for the COM property "ShowFieldCodes"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(19)
  void showFieldCodes(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MailMergeDataView"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(20)
  boolean mailMergeDataView();


  /**
   * <p>
   * Setter method for the COM property "MailMergeDataView"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(21)
  void mailMergeDataView(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Magnifier"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(22)
  boolean magnifier();


  /**
   * <p>
   * Setter method for the COM property "Magnifier"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(23)
  void magnifier(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowFirstLineOnly"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(24)
  boolean showFirstLineOnly();


  /**
   * <p>
   * Setter method for the COM property "ShowFirstLineOnly"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(25)
  void showFirstLineOnly(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowFormat"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(26)
  boolean showFormat();


  /**
   * <p>
   * Setter method for the COM property "ShowFormat"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(27)
  void showFormat(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Zoom"
   * </p>
   * @return  Returns a value of type word.Zoom
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(28)
  word.Zoom zoom();


  /**
   * <p>
   * Getter method for the COM property "ShowObjectAnchors"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(29)
  boolean showObjectAnchors();


  /**
   * <p>
   * Setter method for the COM property "ShowObjectAnchors"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(30)
  void showObjectAnchors(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowTextBoundaries"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(31)
  boolean showTextBoundaries();


  /**
   * <p>
   * Setter method for the COM property "ShowTextBoundaries"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(32)
  void showTextBoundaries(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowHighlight"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(33)
  boolean showHighlight();


  /**
   * <p>
   * Setter method for the COM property "ShowHighlight"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(34)
  void showHighlight(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowDrawings"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(35)
  boolean showDrawings();


  /**
   * <p>
   * Setter method for the COM property "ShowDrawings"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(36)
  void showDrawings(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowTabs"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(37)
  boolean showTabs();


  /**
   * <p>
   * Setter method for the COM property "ShowTabs"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(38)
  void showTabs(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowSpaces"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(39)
  boolean showSpaces();


  /**
   * <p>
   * Setter method for the COM property "ShowSpaces"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(40)
  void showSpaces(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowParagraphs"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(41)
  boolean showParagraphs();


  /**
   * <p>
   * Setter method for the COM property "ShowParagraphs"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(42)
  void showParagraphs(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowHyphens"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(43)
  boolean showHyphens();


  /**
   * <p>
   * Setter method for the COM property "ShowHyphens"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(44)
  void showHyphens(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowHiddenText"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(45)
  boolean showHiddenText();


  /**
   * <p>
   * Setter method for the COM property "ShowHiddenText"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(46)
  void showHiddenText(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "WrapToWindow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(47)
  boolean wrapToWindow();


  /**
   * <p>
   * Setter method for the COM property "WrapToWindow"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(48)
  void wrapToWindow(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowPicturePlaceHolders"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(49)
  boolean showPicturePlaceHolders();


  /**
   * <p>
   * Setter method for the COM property "ShowPicturePlaceHolders"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(50)
  void showPicturePlaceHolders(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowBookmarks"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(51)
  boolean showBookmarks();


  /**
   * <p>
   * Setter method for the COM property "ShowBookmarks"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(52)
  void showBookmarks(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "FieldShading"
   * </p>
   * @return  Returns a value of type word.WdFieldShading
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(53)
  word.WdFieldShading fieldShading();


  /**
   * <p>
   * Setter method for the COM property "FieldShading"
   * </p>
   * @param prop Mandatory word.WdFieldShading parameter.
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(54)
  void fieldShading(
    word.WdFieldShading prop);


  /**
   * <p>
   * Getter method for the COM property "ShowAnimation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(55)
  boolean showAnimation();


  /**
   * <p>
   * Setter method for the COM property "ShowAnimation"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(56)
  void showAnimation(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "TableGridlines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(57)
  boolean tableGridlines();


  /**
   * <p>
   * Setter method for the COM property "TableGridlines"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(58)
  void tableGridlines(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "EnlargeFontsLessThan"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(59)
  int enlargeFontsLessThan();


  /**
   * <p>
   * Setter method for the COM property "EnlargeFontsLessThan"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(60)
  void enlargeFontsLessThan(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "ShowMainTextLayer"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(61)
  boolean showMainTextLayer();


  /**
   * <p>
   * Setter method for the COM property "ShowMainTextLayer"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(62)
  void showMainTextLayer(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SeekView"
   * </p>
   * @return  Returns a value of type word.WdSeekView
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(63)
  word.WdSeekView seekView();


  /**
   * <p>
   * Setter method for the COM property "SeekView"
   * </p>
   * @param prop Mandatory word.WdSeekView parameter.
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(64)
  void seekView(
    word.WdSeekView prop);


  /**
   * <p>
   * Getter method for the COM property "SplitSpecial"
   * </p>
   * @return  Returns a value of type word.WdSpecialPane
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(65)
  word.WdSpecialPane splitSpecial();


  /**
   * <p>
   * Setter method for the COM property "SplitSpecial"
   * </p>
   * @param prop Mandatory word.WdSpecialPane parameter.
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(66)
  void splitSpecial(
    word.WdSpecialPane prop);


  /**
   * <p>
   * Getter method for the COM property "BrowseToWindow"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(67)
  int browseToWindow();


  /**
   * <p>
   * Setter method for the COM property "BrowseToWindow"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(68)
  void browseToWindow(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "ShowOptionalBreaks"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(69)
  boolean showOptionalBreaks();


  /**
   * <p>
   * Setter method for the COM property "ShowOptionalBreaks"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(70)
  void showOptionalBreaks(
    boolean prop);


  /**
   * @param range Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(71)
  void collapseOutline(
    @Optional java.lang.Object range);


  /**
   * @param range Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(72)
  void expandOutline(
    @Optional java.lang.Object range);


  /**
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(73)
  void showAllHeadings();


  /**
   * @param level Mandatory int parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(74)
  void showHeading(
    int level);


  /**
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(75)
  void previousHeaderFooter();


  /**
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(76)
  void nextHeaderFooter();


  /**
   * <p>
   * Getter method for the COM property "DisplayPageBoundaries"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(77)
  boolean displayPageBoundaries();


  /**
   * <p>
   * Setter method for the COM property "DisplayPageBoundaries"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(78)
  void displayPageBoundaries(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "DisplaySmartTags"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(79)
  boolean displaySmartTags();


  /**
   * <p>
   * Setter method for the COM property "DisplaySmartTags"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(80)
  void displaySmartTags(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowRevisionsAndComments"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(81)
  boolean showRevisionsAndComments();


  /**
   * <p>
   * Setter method for the COM property "ShowRevisionsAndComments"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(82)
  void showRevisionsAndComments(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowComments"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(83)
  boolean showComments();


  /**
   * <p>
   * Setter method for the COM property "ShowComments"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(84)
  void showComments(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowInsertionsAndDeletions"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(85)
  boolean showInsertionsAndDeletions();


  /**
   * <p>
   * Setter method for the COM property "ShowInsertionsAndDeletions"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(86)
  void showInsertionsAndDeletions(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowFormatChanges"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(87)
  boolean showFormatChanges();


  /**
   * <p>
   * Setter method for the COM property "ShowFormatChanges"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(88)
  void showFormatChanges(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "RevisionsView"
   * </p>
   * @return  Returns a value of type word.WdRevisionsView
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(89)
  word.WdRevisionsView revisionsView();


  /**
   * <p>
   * Setter method for the COM property "RevisionsView"
   * </p>
   * @param prop Mandatory word.WdRevisionsView parameter.
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(90)
  void revisionsView(
    word.WdRevisionsView prop);


  /**
   * <p>
   * Getter method for the COM property "RevisionsMode"
   * </p>
   * @return  Returns a value of type word.WdRevisionsMode
   */

  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
  @VTID(91)
  word.WdRevisionsMode revisionsMode();


  /**
   * <p>
   * Setter method for the COM property "RevisionsMode"
   * </p>
   * @param prop Mandatory word.WdRevisionsMode parameter.
   */

  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
  @VTID(92)
  void revisionsMode(
    word.WdRevisionsMode prop);


  /**
   * <p>
   * Getter method for the COM property "RevisionsBalloonWidth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(93)
  float revisionsBalloonWidth();


  /**
   * <p>
   * Setter method for the COM property "RevisionsBalloonWidth"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(94)
  void revisionsBalloonWidth(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "RevisionsBalloonWidthType"
   * </p>
   * @return  Returns a value of type word.WdRevisionsBalloonWidthType
   */

  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
  @VTID(95)
  word.WdRevisionsBalloonWidthType revisionsBalloonWidthType();


  /**
   * <p>
   * Setter method for the COM property "RevisionsBalloonWidthType"
   * </p>
   * @param prop Mandatory word.WdRevisionsBalloonWidthType parameter.
   */

  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
  @VTID(96)
  void revisionsBalloonWidthType(
    word.WdRevisionsBalloonWidthType prop);


  /**
   * <p>
   * Getter method for the COM property "RevisionsBalloonSide"
   * </p>
   * @return  Returns a value of type word.WdRevisionsBalloonMargin
   */

  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
  @VTID(97)
  word.WdRevisionsBalloonMargin revisionsBalloonSide();


  /**
   * <p>
   * Setter method for the COM property "RevisionsBalloonSide"
   * </p>
   * @param prop Mandatory word.WdRevisionsBalloonMargin parameter.
   */

  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
  @VTID(98)
  void revisionsBalloonSide(
    word.WdRevisionsBalloonMargin prop);


  /**
   * <p>
   * Getter method for the COM property "Reviewers"
   * </p>
   * @return  Returns a value of type word.Reviewers
   */

  @DISPID(43) //= 0x2b. The runtime will prefer the VTID if present
  @VTID(99)
  word.Reviewers reviewers();


  @VTID(99)
  @ReturnValue(defaultPropertyThrough={word.Reviewers.class})
  word.Reviewer reviewers(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "RevisionsBalloonShowConnectingLines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(44) //= 0x2c. The runtime will prefer the VTID if present
  @VTID(100)
  boolean revisionsBalloonShowConnectingLines();


  /**
   * <p>
   * Setter method for the COM property "RevisionsBalloonShowConnectingLines"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(44) //= 0x2c. The runtime will prefer the VTID if present
  @VTID(101)
  void revisionsBalloonShowConnectingLines(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ReadingLayout"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(45) //= 0x2d. The runtime will prefer the VTID if present
  @VTID(102)
  boolean readingLayout();


  /**
   * <p>
   * Setter method for the COM property "ReadingLayout"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(45) //= 0x2d. The runtime will prefer the VTID if present
  @VTID(103)
  void readingLayout(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowXMLMarkup"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(46) //= 0x2e. The runtime will prefer the VTID if present
  @VTID(104)
  int showXMLMarkup();


  /**
   * <p>
   * Setter method for the COM property "ShowXMLMarkup"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(46) //= 0x2e. The runtime will prefer the VTID if present
  @VTID(105)
  void showXMLMarkup(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "ShadeEditableRanges"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(47) //= 0x2f. The runtime will prefer the VTID if present
  @VTID(106)
  int shadeEditableRanges();


  /**
   * <p>
   * Setter method for the COM property "ShadeEditableRanges"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(47) //= 0x2f. The runtime will prefer the VTID if present
  @VTID(107)
  void shadeEditableRanges(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "ShowInkAnnotations"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(48) //= 0x30. The runtime will prefer the VTID if present
  @VTID(108)
  boolean showInkAnnotations();


  /**
   * <p>
   * Setter method for the COM property "ShowInkAnnotations"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(48) //= 0x30. The runtime will prefer the VTID if present
  @VTID(109)
  void showInkAnnotations(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "DisplayBackgrounds"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(49) //= 0x31. The runtime will prefer the VTID if present
  @VTID(110)
  boolean displayBackgrounds();


  /**
   * <p>
   * Setter method for the COM property "DisplayBackgrounds"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(49) //= 0x31. The runtime will prefer the VTID if present
  @VTID(111)
  void displayBackgrounds(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ReadingLayoutActualView"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(50) //= 0x32. The runtime will prefer the VTID if present
  @VTID(112)
  boolean readingLayoutActualView();


  /**
   * <p>
   * Setter method for the COM property "ReadingLayoutActualView"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(50) //= 0x32. The runtime will prefer the VTID if present
  @VTID(113)
  void readingLayoutActualView(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ReadingLayoutAllowMultiplePages"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(51) //= 0x33. The runtime will prefer the VTID if present
  @VTID(114)
  boolean readingLayoutAllowMultiplePages();


  /**
   * <p>
   * Setter method for the COM property "ReadingLayoutAllowMultiplePages"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(51) //= 0x33. The runtime will prefer the VTID if present
  @VTID(115)
  void readingLayoutAllowMultiplePages(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ReadingLayoutAllowEditing"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(53) //= 0x35. The runtime will prefer the VTID if present
  @VTID(116)
  boolean readingLayoutAllowEditing();


  /**
   * <p>
   * Setter method for the COM property "ReadingLayoutAllowEditing"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(53) //= 0x35. The runtime will prefer the VTID if present
  @VTID(117)
  void readingLayoutAllowEditing(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ReadingLayoutTruncateMargins"
   * </p>
   * @return  Returns a value of type word.WdReadingLayoutMargin
   */

  @DISPID(54) //= 0x36. The runtime will prefer the VTID if present
  @VTID(118)
  word.WdReadingLayoutMargin readingLayoutTruncateMargins();


  /**
   * <p>
   * Setter method for the COM property "ReadingLayoutTruncateMargins"
   * </p>
   * @param prop Mandatory word.WdReadingLayoutMargin parameter.
   */

  @DISPID(54) //= 0x36. The runtime will prefer the VTID if present
  @VTID(119)
  void readingLayoutTruncateMargins(
    word.WdReadingLayoutMargin prop);


  /**
   * <p>
   * Getter method for the COM property "ShowMarkupAreaHighlight"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(52) //= 0x34. The runtime will prefer the VTID if present
  @VTID(120)
  boolean showMarkupAreaHighlight();


  /**
   * <p>
   * Setter method for the COM property "ShowMarkupAreaHighlight"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(52) //= 0x34. The runtime will prefer the VTID if present
  @VTID(121)
  void showMarkupAreaHighlight(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Panning"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(55) //= 0x37. The runtime will prefer the VTID if present
  @VTID(122)
  boolean panning();


  /**
   * <p>
   * Setter method for the COM property "Panning"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(55) //= 0x37. The runtime will prefer the VTID if present
  @VTID(123)
  void panning(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowCropMarks"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(56) //= 0x38. The runtime will prefer the VTID if present
  @VTID(124)
  boolean showCropMarks();


  /**
   * <p>
   * Setter method for the COM property "ShowCropMarks"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(56) //= 0x38. The runtime will prefer the VTID if present
  @VTID(125)
  void showCropMarks(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MarkupMode"
   * </p>
   * @return  Returns a value of type word.WdRevisionsMode
   */

  @DISPID(57) //= 0x39. The runtime will prefer the VTID if present
  @VTID(126)
  word.WdRevisionsMode markupMode();


  /**
   * <p>
   * Setter method for the COM property "MarkupMode"
   * </p>
   * @param prop Mandatory word.WdRevisionsMode parameter.
   */

  @DISPID(57) //= 0x39. The runtime will prefer the VTID if present
  @VTID(127)
  void markupMode(
    word.WdRevisionsMode prop);


  /**
   * <p>
   * Getter method for the COM property "ConflictMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(58) //= 0x3a. The runtime will prefer the VTID if present
  @VTID(128)
  boolean conflictMode();


  /**
   * <p>
   * Setter method for the COM property "ConflictMode"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(58) //= 0x3a. The runtime will prefer the VTID if present
  @VTID(129)
  void conflictMode(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowOtherAuthors"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(59) //= 0x3b. The runtime will prefer the VTID if present
  @VTID(130)
  boolean showOtherAuthors();


  /**
   * <p>
   * Setter method for the COM property "ShowOtherAuthors"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(59) //= 0x3b. The runtime will prefer the VTID if present
  @VTID(131)
  void showOtherAuthors(
    boolean prop);


  // Properties:
}
