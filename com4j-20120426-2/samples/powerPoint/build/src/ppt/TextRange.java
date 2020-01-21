package ppt  ;

import com4j.*;

@IID("{9149348F-5A91-11CF-8700-00AA0060263B}")
public interface TextRange extends ppt.Collection {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(10)
  ppt._Application application();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "ActionSettings"
   * </p>
   * @return  Returns a value of type ppt.ActionSettings
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(12)
  ppt.ActionSettings actionSettings();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={ppt.ActionSettings.class})
  ppt.ActionSetting actionSettings(
    ppt.PpMouseActivation index);

  /**
   * <p>
   * Getter method for the COM property "Start"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(13)
  int start();


  /**
   * <p>
   * Getter method for the COM property "Length"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(14)
  int length();


  /**
   * <p>
   * Getter method for the COM property "BoundLeft"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(15)
  float boundLeft();


  /**
   * <p>
   * Getter method for the COM property "BoundTop"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(16)
  float boundTop();


  /**
   * <p>
   * Getter method for the COM property "BoundWidth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(17)
  float boundWidth();


  /**
   * <p>
   * Getter method for the COM property "BoundHeight"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(18)
  float boundHeight();


  /**
   * @param start Optional parameter. Default value is -1
   * @param length Optional parameter. Default value is -1
   * @return  Returns a value of type ppt.TextRange
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(19)
  ppt.TextRange paragraphs(
    @Optional @DefaultValue("-1") int start,
    @Optional @DefaultValue("-1") int length);


  /**
   * @param start Optional parameter. Default value is -1
   * @param length Optional parameter. Default value is -1
   * @return  Returns a value of type ppt.TextRange
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(20)
  ppt.TextRange sentences(
    @Optional @DefaultValue("-1") int start,
    @Optional @DefaultValue("-1") int length);


  /**
   * @param start Optional parameter. Default value is -1
   * @param length Optional parameter. Default value is -1
   * @return  Returns a value of type ppt.TextRange
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(21)
  ppt.TextRange words(
    @Optional @DefaultValue("-1") int start,
    @Optional @DefaultValue("-1") int length);


  /**
   * @param start Optional parameter. Default value is -1
   * @param length Optional parameter. Default value is -1
   * @return  Returns a value of type ppt.TextRange
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(22)
  ppt.TextRange characters(
    @Optional @DefaultValue("-1") int start,
    @Optional @DefaultValue("-1") int length);


  /**
   * @param start Optional parameter. Default value is -1
   * @param length Optional parameter. Default value is -1
   * @return  Returns a value of type ppt.TextRange
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(23)
  ppt.TextRange lines(
    @Optional @DefaultValue("-1") int start,
    @Optional @DefaultValue("-1") int length);


  /**
   * @param start Optional parameter. Default value is -1
   * @param length Optional parameter. Default value is -1
   * @return  Returns a value of type ppt.TextRange
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(24)
  ppt.TextRange runs(
    @Optional @DefaultValue("-1") int start,
    @Optional @DefaultValue("-1") int length);


  /**
   * @return  Returns a value of type ppt.TextRange
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(25)
  ppt.TextRange trimText();


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(26)
  @DefaultMethod
  java.lang.String text();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param text Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(27)
  @DefaultMethod
  void text(
    java.lang.String text);


  /**
   * @param newText Optional parameter. Default value is ""
   * @return  Returns a value of type ppt.TextRange
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(28)
  ppt.TextRange insertAfter(
    @Optional @DefaultValue("") java.lang.String newText);


  /**
   * @param newText Optional parameter. Default value is ""
   * @return  Returns a value of type ppt.TextRange
   */

  @DISPID(2018) //= 0x7e2. The runtime will prefer the VTID if present
  @VTID(29)
  ppt.TextRange insertBefore(
    @Optional @DefaultValue("") java.lang.String newText);


  /**
   * @param dateTimeFormat Mandatory ppt.PpDateTimeFormat parameter.
   * @param insertAsField Optional parameter. Default value is 0
   * @return  Returns a value of type ppt.TextRange
   */

  @DISPID(2019) //= 0x7e3. The runtime will prefer the VTID if present
  @VTID(30)
  ppt.TextRange insertDateTime(
    ppt.PpDateTimeFormat dateTimeFormat,
    @Optional @DefaultValue("0") office.MsoTriState insertAsField);


  /**
   * @return  Returns a value of type ppt.TextRange
   */

  @DISPID(2020) //= 0x7e4. The runtime will prefer the VTID if present
  @VTID(31)
  ppt.TextRange insertSlideNumber();


  /**
   * @param fontName Mandatory java.lang.String parameter.
   * @param charNumber Mandatory int parameter.
   * @param unicode Optional parameter. Default value is 0
   * @return  Returns a value of type ppt.TextRange
   */

  @DISPID(2021) //= 0x7e5. The runtime will prefer the VTID if present
  @VTID(32)
  ppt.TextRange insertSymbol(
    java.lang.String fontName,
    int charNumber,
    @Optional @DefaultValue("0") office.MsoTriState unicode);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type ppt.Font
   */

  @DISPID(2022) //= 0x7e6. The runtime will prefer the VTID if present
  @VTID(33)
  ppt.Font font();


  /**
   * <p>
   * Getter method for the COM property "ParagraphFormat"
   * </p>
   * @return  Returns a value of type ppt.ParagraphFormat
   */

  @DISPID(2023) //= 0x7e7. The runtime will prefer the VTID if present
  @VTID(34)
  ppt.ParagraphFormat paragraphFormat();


  /**
   * <p>
   * Getter method for the COM property "IndentLevel"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2024) //= 0x7e8. The runtime will prefer the VTID if present
  @VTID(35)
  int indentLevel();


  /**
   * <p>
   * Setter method for the COM property "IndentLevel"
   * </p>
   * @param indentLevel Mandatory int parameter.
   */

  @DISPID(2024) //= 0x7e8. The runtime will prefer the VTID if present
  @VTID(36)
  void indentLevel(
    int indentLevel);


  /**
   */

  @DISPID(2025) //= 0x7e9. The runtime will prefer the VTID if present
  @VTID(37)
  void select();


  /**
   */

  @DISPID(2026) //= 0x7ea. The runtime will prefer the VTID if present
  @VTID(38)
  void cut();


  /**
   */

  @DISPID(2027) //= 0x7eb. The runtime will prefer the VTID if present
  @VTID(39)
  void copy();


  /**
   */

  @DISPID(2028) //= 0x7ec. The runtime will prefer the VTID if present
  @VTID(40)
  void delete();


  /**
   * @return  Returns a value of type ppt.TextRange
   */

  @DISPID(2029) //= 0x7ed. The runtime will prefer the VTID if present
  @VTID(41)
  ppt.TextRange paste();


  /**
   * @param type Mandatory ppt.PpChangeCase parameter.
   */

  @DISPID(2030) //= 0x7ee. The runtime will prefer the VTID if present
  @VTID(42)
  void changeCase(
    ppt.PpChangeCase type);


  /**
   */

  @DISPID(2031) //= 0x7ef. The runtime will prefer the VTID if present
  @VTID(43)
  void addPeriods();


  /**
   */

  @DISPID(2032) //= 0x7f0. The runtime will prefer the VTID if present
  @VTID(44)
  void removePeriods();


  /**
   * @param findWhat Mandatory java.lang.String parameter.
   * @param after Optional parameter. Default value is 0
   * @param matchCase Optional parameter. Default value is 0
   * @param wholeWords Optional parameter. Default value is 0
   * @return  Returns a value of type ppt.TextRange
   */

  @DISPID(2033) //= 0x7f1. The runtime will prefer the VTID if present
  @VTID(45)
  ppt.TextRange find(
    java.lang.String findWhat,
    @Optional @DefaultValue("0") int after,
    @Optional @DefaultValue("0") office.MsoTriState matchCase,
    @Optional @DefaultValue("0") office.MsoTriState wholeWords);


  /**
   * @param findWhat Mandatory java.lang.String parameter.
   * @param replaceWhat Mandatory java.lang.String parameter.
   * @param after Optional parameter. Default value is 0
   * @param matchCase Optional parameter. Default value is 0
   * @param wholeWords Optional parameter. Default value is 0
   * @return  Returns a value of type ppt.TextRange
   */

  @DISPID(2034) //= 0x7f2. The runtime will prefer the VTID if present
  @VTID(46)
  ppt.TextRange replace(
    java.lang.String findWhat,
    java.lang.String replaceWhat,
    @Optional @DefaultValue("0") int after,
    @Optional @DefaultValue("0") office.MsoTriState matchCase,
    @Optional @DefaultValue("0") office.MsoTriState wholeWords);


  /**
   * @param x1 Mandatory Holder<Float> parameter.
   * @param y1 Mandatory Holder<Float> parameter.
   * @param x2 Mandatory Holder<Float> parameter.
   * @param y2 Mandatory Holder<Float> parameter.
   * @param x3 Mandatory Holder<Float> parameter.
   * @param y3 Mandatory Holder<Float> parameter.
   * @param x4 Mandatory Holder<Float> parameter.
   * @param y4 Mandatory Holder<Float> parameter.
   */

  @DISPID(2035) //= 0x7f3. The runtime will prefer the VTID if present
  @VTID(47)
  void rotatedBounds(
    Holder<Float> x1,
    Holder<Float> y1,
    Holder<Float> x2,
    Holder<Float> y2,
    Holder<Float> x3,
    Holder<Float> y3,
    Holder<Float> x4,
    Holder<Float> y4);


  /**
   * <p>
   * Getter method for the COM property "LanguageID"
   * </p>
   * @return  Returns a value of type office.MsoLanguageID
   */

  @DISPID(2036) //= 0x7f4. The runtime will prefer the VTID if present
  @VTID(48)
  office.MsoLanguageID languageID();


  /**
   * <p>
   * Setter method for the COM property "LanguageID"
   * </p>
   * @param languageID Mandatory office.MsoLanguageID parameter.
   */

  @DISPID(2036) //= 0x7f4. The runtime will prefer the VTID if present
  @VTID(49)
  void languageID(
    office.MsoLanguageID languageID);


  /**
   */

  @DISPID(2037) //= 0x7f5. The runtime will prefer the VTID if present
  @VTID(50)
  void rtlRun();


  /**
   */

  @DISPID(2038) //= 0x7f6. The runtime will prefer the VTID if present
  @VTID(51)
  void ltrRun();


  /**
   * @param dataType Optional parameter. Default value is 0
   * @param displayAsIcon Optional parameter. Default value is 0
   * @param iconFileName Optional parameter. Default value is ""
   * @param iconIndex Optional parameter. Default value is 0
   * @param iconLabel Optional parameter. Default value is ""
   * @param link Optional parameter. Default value is 0
   * @return  Returns a value of type ppt.TextRange
   */

  @DISPID(2039) //= 0x7f7. The runtime will prefer the VTID if present
  @VTID(52)
  ppt.TextRange pasteSpecial(
    @Optional @DefaultValue("0") ppt.PpPasteDataType dataType,
    @Optional @DefaultValue("0") office.MsoTriState displayAsIcon,
    @Optional @DefaultValue("") java.lang.String iconFileName,
    @Optional @DefaultValue("0") int iconIndex,
    @Optional @DefaultValue("") java.lang.String iconLabel,
    @Optional @DefaultValue("0") office.MsoTriState link);


  // Properties:
}
