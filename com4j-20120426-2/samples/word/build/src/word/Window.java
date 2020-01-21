package word  ;

import com4j.*;

@IID("{00020962-0000-0000-C000-000000000046}")
public interface Window extends Com4jObject {
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
   * Getter method for the COM property "ActivePane"
   * </p>
   * @return  Returns a value of type word.Pane
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  word.Pane activePane();


  /**
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of type word._Document
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  word._Document document();


  /**
   * <p>
   * Getter method for the COM property "Panes"
   * </p>
   * @return  Returns a value of type word.Panes
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  word.Panes panes();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={word.Panes.class})
  word.Pane panes(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Selection"
   * </p>
   * @return  Returns a value of type word.Selection
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  word.Selection selection();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(14)
  int left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  void left(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  int top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  void top(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(18)
  int width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  void width(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(20)
  int height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  void height(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Split"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(22)
  boolean split();


  /**
   * <p>
   * Setter method for the COM property "Split"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  void split(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SplitVertical"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(24)
  int splitVertical();


  /**
   * <p>
   * Setter method for the COM property "SplitVertical"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(25)
  void splitVertical(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(26)
  @DefaultMethod
  java.lang.String caption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(27)
  @DefaultMethod
  void caption(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "WindowState"
   * </p>
   * @return  Returns a value of type word.WdWindowState
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(28)
  word.WdWindowState windowState();


  /**
   * <p>
   * Setter method for the COM property "WindowState"
   * </p>
   * @param prop Mandatory word.WdWindowState parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(29)
  void windowState(
    word.WdWindowState prop);


  /**
   * <p>
   * Getter method for the COM property "DisplayRulers"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(30)
  boolean displayRulers();


  /**
   * <p>
   * Setter method for the COM property "DisplayRulers"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(31)
  void displayRulers(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "DisplayVerticalRuler"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(32)
  boolean displayVerticalRuler();


  /**
   * <p>
   * Setter method for the COM property "DisplayVerticalRuler"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(33)
  void displayVerticalRuler(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "View"
   * </p>
   * @return  Returns a value of type word.View
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(34)
  word.View view();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type word.WdWindowType
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(35)
  word.WdWindowType type();


  /**
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type word.Window
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(36)
  word.Window next();


  /**
   * <p>
   * Getter method for the COM property "Previous"
   * </p>
   * @return  Returns a value of type word.Window
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(37)
  word.Window previous();


  /**
   * <p>
   * Getter method for the COM property "WindowNumber"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(38)
  int windowNumber();


  /**
   * <p>
   * Getter method for the COM property "DisplayVerticalScrollBar"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(39)
  boolean displayVerticalScrollBar();


  /**
   * <p>
   * Setter method for the COM property "DisplayVerticalScrollBar"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(40)
  void displayVerticalScrollBar(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "DisplayHorizontalScrollBar"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(41)
  boolean displayHorizontalScrollBar();


  /**
   * <p>
   * Setter method for the COM property "DisplayHorizontalScrollBar"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(42)
  void displayHorizontalScrollBar(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "StyleAreaWidth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(43)
  float styleAreaWidth();


  /**
   * <p>
   * Setter method for the COM property "StyleAreaWidth"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(44)
  void styleAreaWidth(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "DisplayScreenTips"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(45)
  boolean displayScreenTips();


  /**
   * <p>
   * Setter method for the COM property "DisplayScreenTips"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(46)
  void displayScreenTips(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "HorizontalPercentScrolled"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(47)
  int horizontalPercentScrolled();


  /**
   * <p>
   * Setter method for the COM property "HorizontalPercentScrolled"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(48)
  void horizontalPercentScrolled(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "VerticalPercentScrolled"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(49)
  int verticalPercentScrolled();


  /**
   * <p>
   * Setter method for the COM property "VerticalPercentScrolled"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(50)
  void verticalPercentScrolled(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "DocumentMap"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(51)
  boolean documentMap();


  /**
   * <p>
   * Setter method for the COM property "DocumentMap"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(52)
  void documentMap(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Active"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(53)
  boolean active();


  /**
   * <p>
   * Getter method for the COM property "DocumentMapPercentWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(54)
  int documentMapPercentWidth();


  /**
   * <p>
   * Setter method for the COM property "DocumentMapPercentWidth"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(55)
  void documentMapPercentWidth(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(56)
  int index();


  /**
   * <p>
   * Getter method for the COM property "IMEMode"
   * </p>
   * @return  Returns a value of type word.WdIMEMode
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(57)
  word.WdIMEMode imeMode();


  /**
   * <p>
   * Setter method for the COM property "IMEMode"
   * </p>
   * @param prop Mandatory word.WdIMEMode parameter.
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(58)
  void imeMode(
    word.WdIMEMode prop);


  /**
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(59)
  void activate();


  /**
   * @param saveChanges Optional parameter. Default value is com4j.Variant.getMissing()
   * @param routeDocument Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(60)
  void close(
    @Optional java.lang.Object saveChanges,
    @Optional java.lang.Object routeDocument);


  /**
   * @param down Optional parameter. Default value is com4j.Variant.getMissing()
   * @param up Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toRight Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toLeft Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(61)
  void largeScroll(
    @Optional java.lang.Object down,
    @Optional java.lang.Object up,
    @Optional java.lang.Object toRight,
    @Optional java.lang.Object toLeft);


  /**
   * @param down Optional parameter. Default value is com4j.Variant.getMissing()
   * @param up Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toRight Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toLeft Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(62)
  void smallScroll(
    @Optional java.lang.Object down,
    @Optional java.lang.Object up,
    @Optional java.lang.Object toRight,
    @Optional java.lang.Object toLeft);


  /**
   * @return  Returns a value of type word.Window
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(63)
  word.Window newWindow();


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

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(64)
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
   * @param down Optional parameter. Default value is com4j.Variant.getMissing()
   * @param up Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(65)
  void pageScroll(
    @Optional java.lang.Object down,
    @Optional java.lang.Object up);


  /**
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(66)
  void setFocus();


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(67)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject rangeFromPoint(
    int x,
    int y);


  /**
   * @param obj Mandatory com4j.Com4jObject parameter.
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(68)
  void scrollIntoView(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject obj,
    @Optional java.lang.Object start);


  /**
   * @param screenPixelsLeft Mandatory Holder<Integer> parameter.
   * @param screenPixelsTop Mandatory Holder<Integer> parameter.
   * @param screenPixelsWidth Mandatory Holder<Integer> parameter.
   * @param screenPixelsHeight Mandatory Holder<Integer> parameter.
   * @param obj Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(69)
  void getPoint(
    Holder<Integer> screenPixelsLeft,
    Holder<Integer> screenPixelsTop,
    Holder<Integer> screenPixelsWidth,
    Holder<Integer> screenPixelsHeight,
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject obj);


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
  @VTID(70)
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
   * <p>
   * Getter method for the COM property "UsableWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(71)
  int usableWidth();


  /**
   * <p>
   * Getter method for the COM property "UsableHeight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(72)
  int usableHeight();


  /**
   * <p>
   * Getter method for the COM property "EnvelopeVisible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(73)
  boolean envelopeVisible();


  /**
   * <p>
   * Setter method for the COM property "EnvelopeVisible"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(74)
  void envelopeVisible(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "DisplayRightRuler"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(75)
  boolean displayRightRuler();


  /**
   * <p>
   * Setter method for the COM property "DisplayRightRuler"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(76)
  void displayRightRuler(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "DisplayLeftScrollBar"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(77)
  boolean displayLeftScrollBar();


  /**
   * <p>
   * Setter method for the COM property "DisplayLeftScrollBar"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(78)
  void displayLeftScrollBar(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(79)
  boolean visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(80)
  void visible(
    boolean prop);


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

  @DISPID(445) //= 0x1bd. The runtime will prefer the VTID if present
  @VTID(81)
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
   */

  @DISPID(446) //= 0x1be. The runtime will prefer the VTID if present
  @VTID(82)
  void toggleShowAllReviewers();


  /**
   * <p>
   * Getter method for the COM property "Thumbnails"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(83)
  boolean thumbnails();


  /**
   * <p>
   * Setter method for the COM property "Thumbnails"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(84)
  void thumbnails(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowSourceDocuments"
   * </p>
   * @return  Returns a value of type word.WdShowSourceDocuments
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(85)
  word.WdShowSourceDocuments showSourceDocuments();


  /**
   * <p>
   * Setter method for the COM property "ShowSourceDocuments"
   * </p>
   * @param prop Mandatory word.WdShowSourceDocuments parameter.
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(86)
  void showSourceDocuments(
    word.WdShowSourceDocuments prop);


  /**
   */

  @DISPID(447) //= 0x1bf. The runtime will prefer the VTID if present
  @VTID(87)
  void toggleRibbon();


  // Properties:
}
