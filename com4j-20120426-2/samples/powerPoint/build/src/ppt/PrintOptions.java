package ppt  ;

import com4j.*;

@IID("{9149345D-5A91-11CF-8700-00AA0060263B}")
public interface PrintOptions extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  ppt._Application application();


  /**
   * <p>
   * Getter method for the COM property "PrintColorType"
   * </p>
   * @return  Returns a value of type ppt.PpPrintColorType
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(8)
  ppt.PpPrintColorType printColorType();


  /**
   * <p>
   * Setter method for the COM property "PrintColorType"
   * </p>
   * @param printColorType Mandatory ppt.PpPrintColorType parameter.
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(9)
  void printColorType(
    ppt.PpPrintColorType printColorType);


  /**
   * <p>
   * Getter method for the COM property "Collate"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(10)
  office.MsoTriState collate();


  /**
   * <p>
   * Setter method for the COM property "Collate"
   * </p>
   * @param collate Mandatory office.MsoTriState parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(11)
  void collate(
    office.MsoTriState collate);


  /**
   * <p>
   * Getter method for the COM property "FitToPage"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(12)
  office.MsoTriState fitToPage();


  /**
   * <p>
   * Setter method for the COM property "FitToPage"
   * </p>
   * @param fitToPage Mandatory office.MsoTriState parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(13)
  void fitToPage(
    office.MsoTriState fitToPage);


  /**
   * <p>
   * Getter method for the COM property "FrameSlides"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(14)
  office.MsoTriState frameSlides();


  /**
   * <p>
   * Setter method for the COM property "FrameSlides"
   * </p>
   * @param frameSlides Mandatory office.MsoTriState parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(15)
  void frameSlides(
    office.MsoTriState frameSlides);


  /**
   * <p>
   * Getter method for the COM property "NumberOfCopies"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(16)
  int numberOfCopies();


  /**
   * <p>
   * Setter method for the COM property "NumberOfCopies"
   * </p>
   * @param numberOfCopies Mandatory int parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(17)
  void numberOfCopies(
    int numberOfCopies);


  /**
   * <p>
   * Getter method for the COM property "OutputType"
   * </p>
   * @return  Returns a value of type ppt.PpPrintOutputType
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(18)
  ppt.PpPrintOutputType outputType();


  /**
   * <p>
   * Setter method for the COM property "OutputType"
   * </p>
   * @param outputType Mandatory ppt.PpPrintOutputType parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(19)
  void outputType(
    ppt.PpPrintOutputType outputType);


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(20)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "PrintHiddenSlides"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(21)
  office.MsoTriState printHiddenSlides();


  /**
   * <p>
   * Setter method for the COM property "PrintHiddenSlides"
   * </p>
   * @param printHiddenSlides Mandatory office.MsoTriState parameter.
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(22)
  void printHiddenSlides(
    office.MsoTriState printHiddenSlides);


  /**
   * <p>
   * Getter method for the COM property "PrintInBackground"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(23)
  office.MsoTriState printInBackground();


  /**
   * <p>
   * Setter method for the COM property "PrintInBackground"
   * </p>
   * @param printInBackground Mandatory office.MsoTriState parameter.
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(24)
  void printInBackground(
    office.MsoTriState printInBackground);


  /**
   * <p>
   * Getter method for the COM property "RangeType"
   * </p>
   * @return  Returns a value of type ppt.PpPrintRangeType
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(25)
  ppt.PpPrintRangeType rangeType();


  /**
   * <p>
   * Setter method for the COM property "RangeType"
   * </p>
   * @param rangeType Mandatory ppt.PpPrintRangeType parameter.
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(26)
  void rangeType(
    ppt.PpPrintRangeType rangeType);


  /**
   * <p>
   * Getter method for the COM property "Ranges"
   * </p>
   * @return  Returns a value of type ppt.PrintRanges
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(27)
  ppt.PrintRanges ranges();


  @VTID(27)
  @ReturnValue(defaultPropertyThrough={ppt.PrintRanges.class})
  ppt.PrintRange ranges(
    int index);

  /**
   * <p>
   * Getter method for the COM property "PrintFontsAsGraphics"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(28)
  office.MsoTriState printFontsAsGraphics();


  /**
   * <p>
   * Setter method for the COM property "PrintFontsAsGraphics"
   * </p>
   * @param printFontsAsGraphics Mandatory office.MsoTriState parameter.
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(29)
  void printFontsAsGraphics(
    office.MsoTriState printFontsAsGraphics);


  /**
   * <p>
   * Getter method for the COM property "SlideShowName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(30)
  java.lang.String slideShowName();


  /**
   * <p>
   * Setter method for the COM property "SlideShowName"
   * </p>
   * @param slideShowName Mandatory java.lang.String parameter.
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(31)
  void slideShowName(
    java.lang.String slideShowName);


  /**
   * <p>
   * Getter method for the COM property "ActivePrinter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(32)
  java.lang.String activePrinter();


  /**
   * <p>
   * Setter method for the COM property "ActivePrinter"
   * </p>
   * @param activePrinter Mandatory java.lang.String parameter.
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(33)
  void activePrinter(
    java.lang.String activePrinter);


  /**
   * <p>
   * Getter method for the COM property "HandoutOrder"
   * </p>
   * @return  Returns a value of type ppt.PpPrintHandoutOrder
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(34)
  ppt.PpPrintHandoutOrder handoutOrder();


  /**
   * <p>
   * Setter method for the COM property "HandoutOrder"
   * </p>
   * @param handoutOrder Mandatory ppt.PpPrintHandoutOrder parameter.
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(35)
  void handoutOrder(
    ppt.PpPrintHandoutOrder handoutOrder);


  /**
   * <p>
   * Getter method for the COM property "PrintComments"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(36)
  office.MsoTriState printComments();


  /**
   * <p>
   * Setter method for the COM property "PrintComments"
   * </p>
   * @param printComments Mandatory office.MsoTriState parameter.
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(37)
  void printComments(
    office.MsoTriState printComments);


  /**
   * <p>
   * Getter method for the COM property "sectionIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2018) //= 0x7e2. The runtime will prefer the VTID if present
  @VTID(38)
  int sectionIndex();


  /**
   * <p>
   * Setter method for the COM property "sectionIndex"
   * </p>
   * @param sectionIndex Mandatory int parameter.
   */

  @DISPID(2018) //= 0x7e2. The runtime will prefer the VTID if present
  @VTID(39)
  void sectionIndex(
    int sectionIndex);


  /**
   * <p>
   * Getter method for the COM property "HighQuality"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2019) //= 0x7e3. The runtime will prefer the VTID if present
  @VTID(40)
  office.MsoTriState highQuality();


  /**
   * <p>
   * Setter method for the COM property "HighQuality"
   * </p>
   * @param highQuality Mandatory office.MsoTriState parameter.
   */

  @DISPID(2019) //= 0x7e3. The runtime will prefer the VTID if present
  @VTID(41)
  void highQuality(
    office.MsoTriState highQuality);


  // Properties:
}
