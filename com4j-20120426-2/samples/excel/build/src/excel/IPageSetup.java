package excel  ;

import com4j.*;

@IID("{000208B4-0001-0000-C000-000000000046}")
public interface IPageSetup extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type excel._Application
   */

  @VTID(7)
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type excel.XlCreator
   */

  @VTID(8)
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getParent();


  /**
   * <p>
   * Getter method for the COM property "BlackAndWhite"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(10)
  boolean getBlackAndWhite();


  /**
   * <p>
   * Setter method for the COM property "BlackAndWhite"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(11)
  void setBlackAndWhite(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "BottomMargin"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(12)
  double getBottomMargin();


  /**
   * <p>
   * Setter method for the COM property "BottomMargin"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(13)
  void setBottomMargin(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "CenterFooter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(14)
  java.lang.String getCenterFooter();


  /**
   * <p>
   * Setter method for the COM property "CenterFooter"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(15)
  void setCenterFooter(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "CenterHeader"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(16)
  java.lang.String getCenterHeader();


  /**
   * <p>
   * Setter method for the COM property "CenterHeader"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(17)
  void setCenterHeader(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "CenterHorizontally"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(18)
  boolean getCenterHorizontally();


  /**
   * <p>
   * Setter method for the COM property "CenterHorizontally"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(19)
  void setCenterHorizontally(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CenterVertically"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(20)
  boolean getCenterVertically();


  /**
   * <p>
   * Setter method for the COM property "CenterVertically"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(21)
  void setCenterVertically(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ChartSize"
   * </p>
   * @return  Returns a value of type excel.XlObjectSize
   */

  @VTID(22)
  excel.XlObjectSize getChartSize();


  /**
   * <p>
   * Setter method for the COM property "ChartSize"
   * </p>
   * @param rhs Mandatory excel.XlObjectSize parameter.
   */

  @VTID(23)
  void setChartSize(
    excel.XlObjectSize rhs);


  /**
   * <p>
   * Getter method for the COM property "Draft"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(24)
  boolean getDraft();


  /**
   * <p>
   * Setter method for the COM property "Draft"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(25)
  void setDraft(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "FirstPageNumber"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(26)
  int getFirstPageNumber();


  /**
   * <p>
   * Setter method for the COM property "FirstPageNumber"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(27)
  void setFirstPageNumber(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "FitToPagesTall"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(28)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getFitToPagesTall();


  /**
   * <p>
   * Setter method for the COM property "FitToPagesTall"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(29)
  void setFitToPagesTall(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "FitToPagesWide"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(30)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getFitToPagesWide();


  /**
   * <p>
   * Setter method for the COM property "FitToPagesWide"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(31)
  void setFitToPagesWide(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "FooterMargin"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(32)
  double getFooterMargin();


  /**
   * <p>
   * Setter method for the COM property "FooterMargin"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(33)
  void setFooterMargin(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "HeaderMargin"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(34)
  double getHeaderMargin();


  /**
   * <p>
   * Setter method for the COM property "HeaderMargin"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(35)
  void setHeaderMargin(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "LeftFooter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(36)
  java.lang.String getLeftFooter();


  /**
   * <p>
   * Setter method for the COM property "LeftFooter"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(37)
  void setLeftFooter(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "LeftHeader"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(38)
  java.lang.String getLeftHeader();


  /**
   * <p>
   * Setter method for the COM property "LeftHeader"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(39)
  void setLeftHeader(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "LeftMargin"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(40)
  double getLeftMargin();


  /**
   * <p>
   * Setter method for the COM property "LeftMargin"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(41)
  void setLeftMargin(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Order"
   * </p>
   * @return  Returns a value of type excel.XlOrder
   */

  @VTID(42)
  excel.XlOrder getOrder();


  /**
   * <p>
   * Setter method for the COM property "Order"
   * </p>
   * @param rhs Mandatory excel.XlOrder parameter.
   */

  @VTID(43)
  void setOrder(
    excel.XlOrder rhs);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type excel.XlPageOrientation
   */

  @VTID(44)
  excel.XlPageOrientation getOrientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param rhs Mandatory excel.XlPageOrientation parameter.
   */

  @VTID(45)
  void setOrientation(
    excel.XlPageOrientation rhs);


  /**
   * <p>
   * Getter method for the COM property "PaperSize"
   * </p>
   * @return  Returns a value of type excel.XlPaperSize
   */

  @VTID(46)
  excel.XlPaperSize getPaperSize();


  /**
   * <p>
   * Setter method for the COM property "PaperSize"
   * </p>
   * @param rhs Mandatory excel.XlPaperSize parameter.
   */

  @VTID(47)
  void setPaperSize(
    excel.XlPaperSize rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintArea"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(48)
  java.lang.String getPrintArea();


  /**
   * <p>
   * Setter method for the COM property "PrintArea"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(49)
  void setPrintArea(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintGridlines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(50)
  boolean getPrintGridlines();


  /**
   * <p>
   * Setter method for the COM property "PrintGridlines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(51)
  void setPrintGridlines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintHeadings"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(52)
  boolean getPrintHeadings();


  /**
   * <p>
   * Setter method for the COM property "PrintHeadings"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(53)
  void setPrintHeadings(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintNotes"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(54)
  boolean getPrintNotes();


  /**
   * <p>
   * Setter method for the COM property "PrintNotes"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(55)
  void setPrintNotes(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintQuality"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(56)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getPrintQuality(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Setter method for the COM property "PrintQuality"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(57)
  void setPrintQuality(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintTitleColumns"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(58)
  java.lang.String getPrintTitleColumns();


  /**
   * <p>
   * Setter method for the COM property "PrintTitleColumns"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(59)
  void setPrintTitleColumns(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintTitleRows"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(60)
  java.lang.String getPrintTitleRows();


  /**
   * <p>
   * Setter method for the COM property "PrintTitleRows"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(61)
  void setPrintTitleRows(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "RightFooter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(62)
  java.lang.String getRightFooter();


  /**
   * <p>
   * Setter method for the COM property "RightFooter"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(63)
  void setRightFooter(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "RightHeader"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(64)
  java.lang.String getRightHeader();


  /**
   * <p>
   * Setter method for the COM property "RightHeader"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(65)
  void setRightHeader(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "RightMargin"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(66)
  double getRightMargin();


  /**
   * <p>
   * Setter method for the COM property "RightMargin"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(67)
  void setRightMargin(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "TopMargin"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(68)
  double getTopMargin();


  /**
   * <p>
   * Setter method for the COM property "TopMargin"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(69)
  void setTopMargin(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Zoom"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(70)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getZoom();


  /**
   * <p>
   * Setter method for the COM property "Zoom"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(71)
  void setZoom(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintComments"
   * </p>
   * @return  Returns a value of type excel.XlPrintLocation
   */

  @VTID(72)
  excel.XlPrintLocation getPrintComments();


  /**
   * <p>
   * Setter method for the COM property "PrintComments"
   * </p>
   * @param rhs Mandatory excel.XlPrintLocation parameter.
   */

  @VTID(73)
  void setPrintComments(
    excel.XlPrintLocation rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintErrors"
   * </p>
   * @return  Returns a value of type excel.XlPrintErrors
   */

  @VTID(74)
  excel.XlPrintErrors getPrintErrors();


  /**
   * <p>
   * Setter method for the COM property "PrintErrors"
   * </p>
   * @param rhs Mandatory excel.XlPrintErrors parameter.
   */

  @VTID(75)
  void setPrintErrors(
    excel.XlPrintErrors rhs);


  /**
   * <p>
   * Getter method for the COM property "CenterHeaderPicture"
   * </p>
   * @return  Returns a value of type excel.Graphic
   */

  @VTID(76)
  excel.Graphic getCenterHeaderPicture();


  /**
   * <p>
   * Getter method for the COM property "CenterFooterPicture"
   * </p>
   * @return  Returns a value of type excel.Graphic
   */

  @VTID(77)
  excel.Graphic getCenterFooterPicture();


  /**
   * <p>
   * Getter method for the COM property "LeftHeaderPicture"
   * </p>
   * @return  Returns a value of type excel.Graphic
   */

  @VTID(78)
  excel.Graphic getLeftHeaderPicture();


  /**
   * <p>
   * Getter method for the COM property "LeftFooterPicture"
   * </p>
   * @return  Returns a value of type excel.Graphic
   */

  @VTID(79)
  excel.Graphic getLeftFooterPicture();


  /**
   * <p>
   * Getter method for the COM property "RightHeaderPicture"
   * </p>
   * @return  Returns a value of type excel.Graphic
   */

  @VTID(80)
  excel.Graphic getRightHeaderPicture();


  /**
   * <p>
   * Getter method for the COM property "RightFooterPicture"
   * </p>
   * @return  Returns a value of type excel.Graphic
   */

  @VTID(81)
  excel.Graphic getRightFooterPicture();


  /**
   * <p>
   * Getter method for the COM property "OddAndEvenPagesHeaderFooter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(82)
  boolean getOddAndEvenPagesHeaderFooter();


  /**
   * <p>
   * Setter method for the COM property "OddAndEvenPagesHeaderFooter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(83)
  void setOddAndEvenPagesHeaderFooter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DifferentFirstPageHeaderFooter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(84)
  boolean getDifferentFirstPageHeaderFooter();


  /**
   * <p>
   * Setter method for the COM property "DifferentFirstPageHeaderFooter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(85)
  void setDifferentFirstPageHeaderFooter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ScaleWithDocHeaderFooter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(86)
  boolean getScaleWithDocHeaderFooter();


  /**
   * <p>
   * Setter method for the COM property "ScaleWithDocHeaderFooter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(87)
  void setScaleWithDocHeaderFooter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AlignMarginsHeaderFooter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(88)
  boolean getAlignMarginsHeaderFooter();


  /**
   * <p>
   * Setter method for the COM property "AlignMarginsHeaderFooter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(89)
  void setAlignMarginsHeaderFooter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Pages"
   * </p>
   * @return  Returns a value of type excel.Pages
   */

  @VTID(90)
  excel.Pages getPages();


  /**
   * <p>
   * Getter method for the COM property "EvenPage"
   * </p>
   * @return  Returns a value of type excel.Page
   */

  @VTID(91)
  excel.Page getEvenPage();


  /**
   * <p>
   * Getter method for the COM property "FirstPage"
   * </p>
   * @return  Returns a value of type excel.Page
   */

  @VTID(92)
  excel.Page getFirstPage();


  // Properties:
}
