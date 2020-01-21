package word  ;

import com4j.*;

@IID("{00020971-0000-0000-C000-000000000046}")
public interface PageSetup extends Com4jObject {
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
   * Getter method for the COM property "TopMargin"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(10)
  float topMargin();


  /**
   * <p>
   * Setter method for the COM property "TopMargin"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(11)
  void topMargin(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "BottomMargin"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(12)
  float bottomMargin();


  /**
   * <p>
   * Setter method for the COM property "BottomMargin"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(13)
  void bottomMargin(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "LeftMargin"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(14)
  float leftMargin();


  /**
   * <p>
   * Setter method for the COM property "LeftMargin"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(15)
  void leftMargin(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "RightMargin"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(16)
  float rightMargin();


  /**
   * <p>
   * Setter method for the COM property "RightMargin"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(17)
  void rightMargin(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Gutter"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(18)
  float gutter();


  /**
   * <p>
   * Setter method for the COM property "Gutter"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(19)
  void gutter(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "PageWidth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(20)
  float pageWidth();


  /**
   * <p>
   * Setter method for the COM property "PageWidth"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(21)
  void pageWidth(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "PageHeight"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(22)
  float pageHeight();


  /**
   * <p>
   * Setter method for the COM property "PageHeight"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(23)
  void pageHeight(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type word.WdOrientation
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(24)
  word.WdOrientation orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param prop Mandatory word.WdOrientation parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(25)
  void orientation(
    word.WdOrientation prop);


  /**
   * <p>
   * Getter method for the COM property "FirstPageTray"
   * </p>
   * @return  Returns a value of type word.WdPaperTray
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(26)
  word.WdPaperTray firstPageTray();


  /**
   * <p>
   * Setter method for the COM property "FirstPageTray"
   * </p>
   * @param prop Mandatory word.WdPaperTray parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(27)
  void firstPageTray(
    word.WdPaperTray prop);


  /**
   * <p>
   * Getter method for the COM property "OtherPagesTray"
   * </p>
   * @return  Returns a value of type word.WdPaperTray
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(28)
  word.WdPaperTray otherPagesTray();


  /**
   * <p>
   * Setter method for the COM property "OtherPagesTray"
   * </p>
   * @param prop Mandatory word.WdPaperTray parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(29)
  void otherPagesTray(
    word.WdPaperTray prop);


  /**
   * <p>
   * Getter method for the COM property "VerticalAlignment"
   * </p>
   * @return  Returns a value of type word.WdVerticalAlignment
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(30)
  word.WdVerticalAlignment verticalAlignment();


  /**
   * <p>
   * Setter method for the COM property "VerticalAlignment"
   * </p>
   * @param prop Mandatory word.WdVerticalAlignment parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(31)
  void verticalAlignment(
    word.WdVerticalAlignment prop);


  /**
   * <p>
   * Getter method for the COM property "MirrorMargins"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(32)
  int mirrorMargins();


  /**
   * <p>
   * Setter method for the COM property "MirrorMargins"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(33)
  void mirrorMargins(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "HeaderDistance"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(34)
  float headerDistance();


  /**
   * <p>
   * Setter method for the COM property "HeaderDistance"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(35)
  void headerDistance(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "FooterDistance"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(36)
  float footerDistance();


  /**
   * <p>
   * Setter method for the COM property "FooterDistance"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(37)
  void footerDistance(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "SectionStart"
   * </p>
   * @return  Returns a value of type word.WdSectionStart
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(38)
  word.WdSectionStart sectionStart();


  /**
   * <p>
   * Setter method for the COM property "SectionStart"
   * </p>
   * @param prop Mandatory word.WdSectionStart parameter.
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(39)
  void sectionStart(
    word.WdSectionStart prop);


  /**
   * <p>
   * Getter method for the COM property "OddAndEvenPagesHeaderFooter"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(40)
  int oddAndEvenPagesHeaderFooter();


  /**
   * <p>
   * Setter method for the COM property "OddAndEvenPagesHeaderFooter"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(41)
  void oddAndEvenPagesHeaderFooter(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "DifferentFirstPageHeaderFooter"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(42)
  int differentFirstPageHeaderFooter();


  /**
   * <p>
   * Setter method for the COM property "DifferentFirstPageHeaderFooter"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(43)
  void differentFirstPageHeaderFooter(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "SuppressEndnotes"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(44)
  int suppressEndnotes();


  /**
   * <p>
   * Setter method for the COM property "SuppressEndnotes"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(45)
  void suppressEndnotes(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "LineNumbering"
   * </p>
   * @return  Returns a value of type word.LineNumbering
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(46)
  word.LineNumbering lineNumbering();


  /**
   * <p>
   * Setter method for the COM property "LineNumbering"
   * </p>
   * @param prop Mandatory word.LineNumbering parameter.
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(47)
  void lineNumbering(
    word.LineNumbering prop);


  /**
   * <p>
   * Getter method for the COM property "TextColumns"
   * </p>
   * @return  Returns a value of type word.TextColumns
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(48)
  word.TextColumns textColumns();


  @VTID(48)
  @ReturnValue(defaultPropertyThrough={word.TextColumns.class})
  word.TextColumn textColumns(
    int index);

  /**
   * <p>
   * Setter method for the COM property "TextColumns"
   * </p>
   * @param prop Mandatory word.TextColumns parameter.
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(49)
  void textColumns(
    word.TextColumns prop);


  /**
   * <p>
   * Getter method for the COM property "PaperSize"
   * </p>
   * @return  Returns a value of type word.WdPaperSize
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(50)
  word.WdPaperSize paperSize();


  /**
   * <p>
   * Setter method for the COM property "PaperSize"
   * </p>
   * @param prop Mandatory word.WdPaperSize parameter.
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(51)
  void paperSize(
    word.WdPaperSize prop);


  /**
   * <p>
   * Getter method for the COM property "TwoPagesOnOne"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(52)
  boolean twoPagesOnOne();


  /**
   * <p>
   * Setter method for the COM property "TwoPagesOnOne"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(53)
  void twoPagesOnOne(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "GutterOnTop"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(54)
  boolean gutterOnTop();


  /**
   * <p>
   * Setter method for the COM property "GutterOnTop"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(55)
  void gutterOnTop(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "CharsLine"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(56)
  float charsLine();


  /**
   * <p>
   * Setter method for the COM property "CharsLine"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(57)
  void charsLine(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "LinesPage"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(124) //= 0x7c. The runtime will prefer the VTID if present
  @VTID(58)
  float linesPage();


  /**
   * <p>
   * Setter method for the COM property "LinesPage"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(124) //= 0x7c. The runtime will prefer the VTID if present
  @VTID(59)
  void linesPage(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "ShowGrid"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(128) //= 0x80. The runtime will prefer the VTID if present
  @VTID(60)
  boolean showGrid();


  /**
   * <p>
   * Setter method for the COM property "ShowGrid"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(128) //= 0x80. The runtime will prefer the VTID if present
  @VTID(61)
  void showGrid(
    boolean prop);


  /**
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(62)
  void togglePortrait();


  /**
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(63)
  void setAsTemplateDefault();


  /**
   * <p>
   * Getter method for the COM property "GutterStyle"
   * </p>
   * @return  Returns a value of type word.WdGutterStyleOld
   */

  @DISPID(129) //= 0x81. The runtime will prefer the VTID if present
  @VTID(64)
  word.WdGutterStyleOld gutterStyle();


  /**
   * <p>
   * Setter method for the COM property "GutterStyle"
   * </p>
   * @param prop Mandatory word.WdGutterStyleOld parameter.
   */

  @DISPID(129) //= 0x81. The runtime will prefer the VTID if present
  @VTID(65)
  void gutterStyle(
    word.WdGutterStyleOld prop);


  /**
   * <p>
   * Getter method for the COM property "SectionDirection"
   * </p>
   * @return  Returns a value of type word.WdSectionDirection
   */

  @DISPID(130) //= 0x82. The runtime will prefer the VTID if present
  @VTID(66)
  word.WdSectionDirection sectionDirection();


  /**
   * <p>
   * Setter method for the COM property "SectionDirection"
   * </p>
   * @param prop Mandatory word.WdSectionDirection parameter.
   */

  @DISPID(130) //= 0x82. The runtime will prefer the VTID if present
  @VTID(67)
  void sectionDirection(
    word.WdSectionDirection prop);


  /**
   * <p>
   * Getter method for the COM property "LayoutMode"
   * </p>
   * @return  Returns a value of type word.WdLayoutMode
   */

  @DISPID(131) //= 0x83. The runtime will prefer the VTID if present
  @VTID(68)
  word.WdLayoutMode layoutMode();


  /**
   * <p>
   * Setter method for the COM property "LayoutMode"
   * </p>
   * @param prop Mandatory word.WdLayoutMode parameter.
   */

  @DISPID(131) //= 0x83. The runtime will prefer the VTID if present
  @VTID(69)
  void layoutMode(
    word.WdLayoutMode prop);


  /**
   * <p>
   * Getter method for the COM property "GutterPos"
   * </p>
   * @return  Returns a value of type word.WdGutterStyle
   */

  @DISPID(1222) //= 0x4c6. The runtime will prefer the VTID if present
  @VTID(70)
  word.WdGutterStyle gutterPos();


  /**
   * <p>
   * Setter method for the COM property "GutterPos"
   * </p>
   * @param prop Mandatory word.WdGutterStyle parameter.
   */

  @DISPID(1222) //= 0x4c6. The runtime will prefer the VTID if present
  @VTID(71)
  void gutterPos(
    word.WdGutterStyle prop);


  /**
   * <p>
   * Getter method for the COM property "BookFoldPrinting"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1223) //= 0x4c7. The runtime will prefer the VTID if present
  @VTID(72)
  boolean bookFoldPrinting();


  /**
   * <p>
   * Setter method for the COM property "BookFoldPrinting"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1223) //= 0x4c7. The runtime will prefer the VTID if present
  @VTID(73)
  void bookFoldPrinting(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "BookFoldRevPrinting"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1224) //= 0x4c8. The runtime will prefer the VTID if present
  @VTID(74)
  boolean bookFoldRevPrinting();


  /**
   * <p>
   * Setter method for the COM property "BookFoldRevPrinting"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1224) //= 0x4c8. The runtime will prefer the VTID if present
  @VTID(75)
  void bookFoldRevPrinting(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "BookFoldPrintingSheets"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1225) //= 0x4c9. The runtime will prefer the VTID if present
  @VTID(76)
  int bookFoldPrintingSheets();


  /**
   * <p>
   * Setter method for the COM property "BookFoldPrintingSheets"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(1225) //= 0x4c9. The runtime will prefer the VTID if present
  @VTID(77)
  void bookFoldPrintingSheets(
    int prop);


  // Properties:
}
