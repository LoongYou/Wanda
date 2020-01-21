package ppt  ;

import com4j.*;

@IID("{9149349D-5A91-11CF-8700-00AA0060263B}")
public interface _Presentation extends Com4jObject {
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
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "SlideMaster"
   * </p>
   * @return  Returns a value of type ppt._Master
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt._Master slideMaster();


  /**
   * <p>
   * Getter method for the COM property "TitleMaster"
   * </p>
   * @return  Returns a value of type ppt._Master
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  ppt._Master titleMaster();


  /**
   * <p>
   * Getter method for the COM property "HasTitleMaster"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  office.MsoTriState hasTitleMaster();


  /**
   * @return  Returns a value of type ppt._Master
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(12)
  ppt._Master addTitleMaster();


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(13)
  void applyTemplate(
    java.lang.String fileName);


  /**
   * <p>
   * Getter method for the COM property "TemplateName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String templateName();


  /**
   * <p>
   * Getter method for the COM property "NotesMaster"
   * </p>
   * @return  Returns a value of type ppt._Master
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(15)
  ppt._Master notesMaster();


  /**
   * <p>
   * Getter method for the COM property "HandoutMaster"
   * </p>
   * @return  Returns a value of type ppt._Master
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(16)
  ppt._Master handoutMaster();


  /**
   * <p>
   * Getter method for the COM property "Slides"
   * </p>
   * @return  Returns a value of type ppt.Slides
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(17)
  ppt.Slides slides();


  @VTID(17)
  @ReturnValue(defaultPropertyThrough={ppt.Slides.class})
  ppt._Slide slides(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "PageSetup"
   * </p>
   * @return  Returns a value of type ppt.PageSetup
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(18)
  ppt.PageSetup pageSetup();


  /**
   * <p>
   * Getter method for the COM property "ColorSchemes"
   * </p>
   * @return  Returns a value of type ppt.ColorSchemes
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(19)
  ppt.ColorSchemes colorSchemes();


  @VTID(19)
  @ReturnValue(defaultPropertyThrough={ppt.ColorSchemes.class})
  ppt.ColorScheme colorSchemes(
    int index);

  /**
   * <p>
   * Getter method for the COM property "ExtraColors"
   * </p>
   * @return  Returns a value of type ppt.ExtraColors
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(20)
  ppt.ExtraColors extraColors();


  @VTID(20)
  @ReturnValue(defaultPropertyThrough={ppt.ExtraColors.class})
  int extraColors(
    int index);

  /**
   * <p>
   * Getter method for the COM property "SlideShowSettings"
   * </p>
   * @return  Returns a value of type ppt.SlideShowSettings
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(21)
  ppt.SlideShowSettings slideShowSettings();


  /**
   * <p>
   * Getter method for the COM property "Fonts"
   * </p>
   * @return  Returns a value of type ppt.Fonts
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(22)
  ppt.Fonts fonts();


  @VTID(22)
  @ReturnValue(defaultPropertyThrough={ppt.Fonts.class})
  ppt.Font fonts(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Windows"
   * </p>
   * @return  Returns a value of type ppt.DocumentWindows
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(23)
  ppt.DocumentWindows windows();


  @VTID(23)
  @ReturnValue(defaultPropertyThrough={ppt.DocumentWindows.class})
  ppt.DocumentWindow windows(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Tags"
   * </p>
   * @return  Returns a value of type ppt.Tags
   */

  @DISPID(2018) //= 0x7e2. The runtime will prefer the VTID if present
  @VTID(24)
  ppt.Tags tags();


  @VTID(24)
  @ReturnValue(defaultPropertyThrough={ppt.Tags.class})
  java.lang.String tags(
    java.lang.String name);

  /**
   * <p>
   * Getter method for the COM property "DefaultShape"
   * </p>
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(2019) //= 0x7e3. The runtime will prefer the VTID if present
  @VTID(25)
  ppt.Shape defaultShape();


  /**
   * <p>
   * Getter method for the COM property "BuiltInDocumentProperties"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2020) //= 0x7e4. The runtime will prefer the VTID if present
  @VTID(26)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject builtInDocumentProperties();


  /**
   * <p>
   * Getter method for the COM property "CustomDocumentProperties"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2021) //= 0x7e5. The runtime will prefer the VTID if present
  @VTID(27)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject customDocumentProperties();


  /**
   * <p>
   * Getter method for the COM property "VBProject"
   * </p>
   * @return  Returns a value of type vba._VBProject
   */

  @DISPID(2022) //= 0x7e6. The runtime will prefer the VTID if present
  @VTID(28)
  vba._VBProject vbProject();


  /**
   * <p>
   * Getter method for the COM property "ReadOnly"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2023) //= 0x7e7. The runtime will prefer the VTID if present
  @VTID(29)
  office.MsoTriState readOnly();


  /**
   * <p>
   * Getter method for the COM property "FullName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2024) //= 0x7e8. The runtime will prefer the VTID if present
  @VTID(30)
  java.lang.String fullName();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2025) //= 0x7e9. The runtime will prefer the VTID if present
  @VTID(31)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2026) //= 0x7ea. The runtime will prefer the VTID if present
  @VTID(32)
  java.lang.String path();


  /**
   * <p>
   * Getter method for the COM property "Saved"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2027) //= 0x7eb. The runtime will prefer the VTID if present
  @VTID(33)
  office.MsoTriState saved();


  /**
   * <p>
   * Setter method for the COM property "Saved"
   * </p>
   * @param saved Mandatory office.MsoTriState parameter.
   */

  @DISPID(2027) //= 0x7eb. The runtime will prefer the VTID if present
  @VTID(34)
  void saved(
    office.MsoTriState saved);


  /**
   * <p>
   * Getter method for the COM property "LayoutDirection"
   * </p>
   * @return  Returns a value of type ppt.PpDirection
   */

  @DISPID(2028) //= 0x7ec. The runtime will prefer the VTID if present
  @VTID(35)
  ppt.PpDirection layoutDirection();


  /**
   * <p>
   * Setter method for the COM property "LayoutDirection"
   * </p>
   * @param layoutDirection Mandatory ppt.PpDirection parameter.
   */

  @DISPID(2028) //= 0x7ec. The runtime will prefer the VTID if present
  @VTID(36)
  void layoutDirection(
    ppt.PpDirection layoutDirection);


  /**
   * @return  Returns a value of type ppt.DocumentWindow
   */

  @DISPID(2029) //= 0x7ed. The runtime will prefer the VTID if present
  @VTID(37)
  ppt.DocumentWindow newWindow();


  /**
   * @param address Mandatory java.lang.String parameter.
   * @param subAddress Optional parameter. Default value is ""
   * @param newWindow Optional parameter. Default value is false
   * @param addHistory Optional parameter. Default value is false
   * @param extraInfo Optional parameter. Default value is ""
   * @param method Optional parameter. Default value is 0
   * @param headerInfo Optional parameter. Default value is ""
   */

  @DISPID(2030) //= 0x7ee. The runtime will prefer the VTID if present
  @VTID(38)
  void followHyperlink(
    java.lang.String address,
    @Optional @DefaultValue("") java.lang.String subAddress,
    @Optional @DefaultValue("0") boolean newWindow,
    @Optional @DefaultValue("-1") boolean addHistory,
    @Optional @DefaultValue("") java.lang.String extraInfo,
    @Optional @DefaultValue("0") office.MsoExtraInfoMethod method,
    @Optional @DefaultValue("") java.lang.String headerInfo);


  /**
   */

  @DISPID(2031) //= 0x7ef. The runtime will prefer the VTID if present
  @VTID(39)
  void addToFavorites();


  /**
   */

  @DISPID(2032) //= 0x7f0. The runtime will prefer the VTID if present
  @VTID(40)
  void unused();


  /**
   * <p>
   * Getter method for the COM property "PrintOptions"
   * </p>
   * @return  Returns a value of type ppt.PrintOptions
   */

  @DISPID(2033) //= 0x7f1. The runtime will prefer the VTID if present
  @VTID(41)
  ppt.PrintOptions printOptions();


  /**
   * @param from Optional parameter. Default value is -1
   * @param to Optional parameter. Default value is -1
   * @param printToFile Optional parameter. Default value is ""
   * @param copies Optional parameter. Default value is 0
   * @param collate Optional parameter. Default value is -99
   */

  @DISPID(2034) //= 0x7f2. The runtime will prefer the VTID if present
  @VTID(42)
  void printOut(
    @Optional @DefaultValue("-1") int from,
    @Optional @DefaultValue("-1") int to,
    @Optional @DefaultValue("") java.lang.String printToFile,
    @Optional @DefaultValue("0") int copies,
    @Optional @DefaultValue("-99") office.MsoTriState collate);


  /**
   */

  @DISPID(2035) //= 0x7f3. The runtime will prefer the VTID if present
  @VTID(43)
  void save();


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param fileFormat Optional parameter. Default value is 11
   * @param embedTrueTypeFonts Optional parameter. Default value is -2
   */

  @DISPID(2036) //= 0x7f4. The runtime will prefer the VTID if present
  @VTID(44)
  void saveAs(
    java.lang.String fileName,
    @Optional @DefaultValue("11") ppt.PpSaveAsFileType fileFormat,
    @Optional @DefaultValue("-2") office.MsoTriState embedTrueTypeFonts);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param fileFormat Optional parameter. Default value is 11
   * @param embedTrueTypeFonts Optional parameter. Default value is -2
   */

  @DISPID(2037) //= 0x7f5. The runtime will prefer the VTID if present
  @VTID(45)
  void saveCopyAs(
    java.lang.String fileName,
    @Optional @DefaultValue("11") ppt.PpSaveAsFileType fileFormat,
    @Optional @DefaultValue("-2") office.MsoTriState embedTrueTypeFonts);


  /**
   * @param path Mandatory java.lang.String parameter.
   * @param filterName Mandatory java.lang.String parameter.
   * @param scaleWidth Optional parameter. Default value is 0
   * @param scaleHeight Optional parameter. Default value is 0
   */

  @DISPID(2038) //= 0x7f6. The runtime will prefer the VTID if present
  @VTID(46)
  void export(
    java.lang.String path,
    java.lang.String filterName,
    @Optional @DefaultValue("0") int scaleWidth,
    @Optional @DefaultValue("0") int scaleHeight);


  /**
   */

  @DISPID(2039) //= 0x7f7. The runtime will prefer the VTID if present
  @VTID(47)
  void close();


  /**
   * @param text Mandatory java.lang.String parameter.
   */

  @DISPID(2040) //= 0x7f8. The runtime will prefer the VTID if present
  @VTID(48)
  void setUndoText(
    java.lang.String text);


  /**
   * <p>
   * Getter method for the COM property "Container"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2041) //= 0x7f9. The runtime will prefer the VTID if present
  @VTID(49)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject container();


  /**
   * <p>
   * Getter method for the COM property "DisplayComments"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2042) //= 0x7fa. The runtime will prefer the VTID if present
  @VTID(50)
  office.MsoTriState displayComments();


  /**
   * <p>
   * Setter method for the COM property "DisplayComments"
   * </p>
   * @param displayComments Mandatory office.MsoTriState parameter.
   */

  @DISPID(2042) //= 0x7fa. The runtime will prefer the VTID if present
  @VTID(51)
  void displayComments(
    office.MsoTriState displayComments);


  /**
   * <p>
   * Getter method for the COM property "FarEastLineBreakLevel"
   * </p>
   * @return  Returns a value of type ppt.PpFarEastLineBreakLevel
   */

  @DISPID(2043) //= 0x7fb. The runtime will prefer the VTID if present
  @VTID(52)
  ppt.PpFarEastLineBreakLevel farEastLineBreakLevel();


  /**
   * <p>
   * Setter method for the COM property "FarEastLineBreakLevel"
   * </p>
   * @param farEastLineBreakLevel Mandatory ppt.PpFarEastLineBreakLevel parameter.
   */

  @DISPID(2043) //= 0x7fb. The runtime will prefer the VTID if present
  @VTID(53)
  void farEastLineBreakLevel(
    ppt.PpFarEastLineBreakLevel farEastLineBreakLevel);


  /**
   * <p>
   * Getter method for the COM property "NoLineBreakBefore"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2044) //= 0x7fc. The runtime will prefer the VTID if present
  @VTID(54)
  java.lang.String noLineBreakBefore();


  /**
   * <p>
   * Setter method for the COM property "NoLineBreakBefore"
   * </p>
   * @param noLineBreakBefore Mandatory java.lang.String parameter.
   */

  @DISPID(2044) //= 0x7fc. The runtime will prefer the VTID if present
  @VTID(55)
  void noLineBreakBefore(
    java.lang.String noLineBreakBefore);


  /**
   * <p>
   * Getter method for the COM property "NoLineBreakAfter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2045) //= 0x7fd. The runtime will prefer the VTID if present
  @VTID(56)
  java.lang.String noLineBreakAfter();


  /**
   * <p>
   * Setter method for the COM property "NoLineBreakAfter"
   * </p>
   * @param noLineBreakAfter Mandatory java.lang.String parameter.
   */

  @DISPID(2045) //= 0x7fd. The runtime will prefer the VTID if present
  @VTID(57)
  void noLineBreakAfter(
    java.lang.String noLineBreakAfter);


  /**
   */

  @DISPID(2046) //= 0x7fe. The runtime will prefer the VTID if present
  @VTID(58)
  void updateLinks();


  /**
   * <p>
   * Getter method for the COM property "SlideShowWindow"
   * </p>
   * @return  Returns a value of type ppt.SlideShowWindow
   */

  @DISPID(2047) //= 0x7ff. The runtime will prefer the VTID if present
  @VTID(59)
  ppt.SlideShowWindow slideShowWindow();


  /**
   * <p>
   * Getter method for the COM property "FarEastLineBreakLanguage"
   * </p>
   * @return  Returns a value of type office.MsoFarEastLineBreakLanguageID
   */

  @DISPID(2048) //= 0x800. The runtime will prefer the VTID if present
  @VTID(60)
  office.MsoFarEastLineBreakLanguageID farEastLineBreakLanguage();


  /**
   * <p>
   * Setter method for the COM property "FarEastLineBreakLanguage"
   * </p>
   * @param farEastLineBreakLanguage Mandatory office.MsoFarEastLineBreakLanguageID parameter.
   */

  @DISPID(2048) //= 0x800. The runtime will prefer the VTID if present
  @VTID(61)
  void farEastLineBreakLanguage(
    office.MsoFarEastLineBreakLanguageID farEastLineBreakLanguage);


  /**
   */

  @DISPID(2049) //= 0x801. The runtime will prefer the VTID if present
  @VTID(62)
  void webPagePreview();


  /**
   * <p>
   * Getter method for the COM property "DefaultLanguageID"
   * </p>
   * @return  Returns a value of type office.MsoLanguageID
   */

  @DISPID(2050) //= 0x802. The runtime will prefer the VTID if present
  @VTID(63)
  office.MsoLanguageID defaultLanguageID();


  /**
   * <p>
   * Setter method for the COM property "DefaultLanguageID"
   * </p>
   * @param defaultLanguageID Mandatory office.MsoLanguageID parameter.
   */

  @DISPID(2050) //= 0x802. The runtime will prefer the VTID if present
  @VTID(64)
  void defaultLanguageID(
    office.MsoLanguageID defaultLanguageID);


  /**
   * <p>
   * Getter method for the COM property "CommandBars"
   * </p>
   * @return  Returns a value of type office._CommandBars
   */

  @DISPID(2051) //= 0x803. The runtime will prefer the VTID if present
  @VTID(65)
  office._CommandBars commandBars();


  /**
   * <p>
   * Getter method for the COM property "PublishObjects"
   * </p>
   * @return  Returns a value of type ppt.PublishObjects
   */

  @DISPID(2052) //= 0x804. The runtime will prefer the VTID if present
  @VTID(66)
  ppt.PublishObjects publishObjects();


  @VTID(66)
  @ReturnValue(defaultPropertyThrough={ppt.PublishObjects.class})
  ppt.PublishObject publishObjects(
    int index);

  /**
   * <p>
   * Getter method for the COM property "WebOptions"
   * </p>
   * @return  Returns a value of type ppt.WebOptions
   */

  @DISPID(2053) //= 0x805. The runtime will prefer the VTID if present
  @VTID(67)
  ppt.WebOptions webOptions();


  /**
   * <p>
   * Getter method for the COM property "HTMLProject"
   * </p>
   * @return  Returns a value of type office.HTMLProject
   */

  @DISPID(2054) //= 0x806. The runtime will prefer the VTID if present
  @VTID(68)
  office.HTMLProject htmlProject();


  /**
   * @param cp Mandatory office.MsoEncoding parameter.
   */

  @DISPID(2055) //= 0x807. The runtime will prefer the VTID if present
  @VTID(69)
  void reloadAs(
    office.MsoEncoding cp);


  /**
   * @param isDesignTemplate Mandatory office.MsoTriState parameter.
   */

  @DISPID(2056) //= 0x808. The runtime will prefer the VTID if present
  @VTID(70)
  void makeIntoTemplate(
    office.MsoTriState isDesignTemplate);


  /**
   * <p>
   * Getter method for the COM property "EnvelopeVisible"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2057) //= 0x809. The runtime will prefer the VTID if present
  @VTID(71)
  office.MsoTriState envelopeVisible();


  /**
   * <p>
   * Setter method for the COM property "EnvelopeVisible"
   * </p>
   * @param envelopeVisible Mandatory office.MsoTriState parameter.
   */

  @DISPID(2057) //= 0x809. The runtime will prefer the VTID if present
  @VTID(72)
  void envelopeVisible(
    office.MsoTriState envelopeVisible);


  /**
   * @param s Mandatory java.lang.String parameter.
   */

  @DISPID(2058) //= 0x80a. The runtime will prefer the VTID if present
  @VTID(73)
  void sblt(
    java.lang.String s);


  /**
   * <p>
   * Getter method for the COM property "VBASigned"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2059) //= 0x80b. The runtime will prefer the VTID if present
  @VTID(74)
  office.MsoTriState vbaSigned();


  /**
   * <p>
   * Getter method for the COM property "SnapToGrid"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2061) //= 0x80d. The runtime will prefer the VTID if present
  @VTID(75)
  office.MsoTriState snapToGrid();


  /**
   * <p>
   * Setter method for the COM property "SnapToGrid"
   * </p>
   * @param snapToGrid Mandatory office.MsoTriState parameter.
   */

  @DISPID(2061) //= 0x80d. The runtime will prefer the VTID if present
  @VTID(76)
  void snapToGrid(
    office.MsoTriState snapToGrid);


  /**
   * <p>
   * Getter method for the COM property "GridDistance"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2062) //= 0x80e. The runtime will prefer the VTID if present
  @VTID(77)
  float gridDistance();


  /**
   * <p>
   * Setter method for the COM property "GridDistance"
   * </p>
   * @param gridDistance Mandatory float parameter.
   */

  @DISPID(2062) //= 0x80e. The runtime will prefer the VTID if present
  @VTID(78)
  void gridDistance(
    float gridDistance);


  /**
   * <p>
   * Getter method for the COM property "Designs"
   * </p>
   * @return  Returns a value of type ppt.Designs
   */

  @DISPID(2063) //= 0x80f. The runtime will prefer the VTID if present
  @VTID(79)
  ppt.Designs designs();


  @VTID(79)
  @ReturnValue(defaultPropertyThrough={ppt.Designs.class})
  ppt.Design designs(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * @param path Mandatory java.lang.String parameter.
   */

  @DISPID(2064) //= 0x810. The runtime will prefer the VTID if present
  @VTID(80)
  void merge(
    java.lang.String path);


  /**
   * @param saveChanges Optional parameter. Default value is false
   * @param comments Optional parameter. Default value is com4j.Variant.getMissing()
   * @param makePublic Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2065) //= 0x811. The runtime will prefer the VTID if present
  @VTID(81)
  void checkIn(
    @Optional @DefaultValue("-1") boolean saveChanges,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object comments,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object makePublic);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(2066) //= 0x812. The runtime will prefer the VTID if present
  @VTID(82)
  boolean canCheckIn();


  /**
   * <p>
   * Getter method for the COM property "Signatures"
   * </p>
   * @return  Returns a value of type office.SignatureSet
   */

  @DISPID(2067) //= 0x813. The runtime will prefer the VTID if present
  @VTID(83)
  office.SignatureSet signatures();


  @VTID(83)
  @ReturnValue(defaultPropertyThrough={office.SignatureSet.class})
  office.Signature signatures(
    int iSig);

  /**
   * <p>
   * Getter method for the COM property "RemovePersonalInformation"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2068) //= 0x814. The runtime will prefer the VTID if present
  @VTID(84)
  office.MsoTriState removePersonalInformation();


  /**
   * <p>
   * Setter method for the COM property "RemovePersonalInformation"
   * </p>
   * @param removePersonalInformation Mandatory office.MsoTriState parameter.
   */

  @DISPID(2068) //= 0x814. The runtime will prefer the VTID if present
  @VTID(85)
  void removePersonalInformation(
    office.MsoTriState removePersonalInformation);


  /**
   * @param recipients Optional parameter. Default value is ""
   * @param subject Optional parameter. Default value is ""
   * @param showMessage Optional parameter. Default value is false
   * @param includeAttachment Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2069) //= 0x815. The runtime will prefer the VTID if present
  @VTID(86)
  void sendForReview(
    @Optional @DefaultValue("") java.lang.String recipients,
    @Optional @DefaultValue("") java.lang.String subject,
    @Optional @DefaultValue("-1") boolean showMessage,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object includeAttachment);


  /**
   * @param showMessage Optional parameter. Default value is false
   */

  @DISPID(2070) //= 0x816. The runtime will prefer the VTID if present
  @VTID(87)
  void replyWithChanges(
    @Optional @DefaultValue("-1") boolean showMessage);


  /**
   */

  @DISPID(2071) //= 0x817. The runtime will prefer the VTID if present
  @VTID(88)
  void endReview();


  /**
   * <p>
   * Getter method for the COM property "HasRevisionInfo"
   * </p>
   * @return  Returns a value of type ppt.PpRevisionInfo
   */

  @DISPID(2072) //= 0x818. The runtime will prefer the VTID if present
  @VTID(89)
  ppt.PpRevisionInfo hasRevisionInfo();


  /**
   * @param fileName Optional parameter. Default value is ""
   */

  @DISPID(2073) //= 0x819. The runtime will prefer the VTID if present
  @VTID(90)
  void addBaseline(
    @Optional @DefaultValue("") java.lang.String fileName);


  /**
   */

  @DISPID(2074) //= 0x81a. The runtime will prefer the VTID if present
  @VTID(91)
  void removeBaseline();


  /**
   * <p>
   * Getter method for the COM property "PasswordEncryptionProvider"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2075) //= 0x81b. The runtime will prefer the VTID if present
  @VTID(92)
  java.lang.String passwordEncryptionProvider();


  /**
   * <p>
   * Getter method for the COM property "PasswordEncryptionAlgorithm"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2076) //= 0x81c. The runtime will prefer the VTID if present
  @VTID(93)
  java.lang.String passwordEncryptionAlgorithm();


  /**
   * <p>
   * Getter method for the COM property "PasswordEncryptionKeyLength"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2077) //= 0x81d. The runtime will prefer the VTID if present
  @VTID(94)
  int passwordEncryptionKeyLength();


  /**
   * <p>
   * Getter method for the COM property "PasswordEncryptionFileProperties"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2078) //= 0x81e. The runtime will prefer the VTID if present
  @VTID(95)
  boolean passwordEncryptionFileProperties();


  /**
   * @param passwordEncryptionProvider Mandatory java.lang.String parameter.
   * @param passwordEncryptionAlgorithm Mandatory java.lang.String parameter.
   * @param passwordEncryptionKeyLength Mandatory int parameter.
   * @param passwordEncryptionFileProperties Mandatory boolean parameter.
   */

  @DISPID(2079) //= 0x81f. The runtime will prefer the VTID if present
  @VTID(96)
  void setPasswordEncryptionOptions(
    java.lang.String passwordEncryptionProvider,
    java.lang.String passwordEncryptionAlgorithm,
    int passwordEncryptionKeyLength,
    boolean passwordEncryptionFileProperties);


  /**
   * <p>
   * Getter method for the COM property "Password"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2080) //= 0x820. The runtime will prefer the VTID if present
  @VTID(97)
  java.lang.String password();


  /**
   * <p>
   * Setter method for the COM property "Password"
   * </p>
   * @param password Mandatory java.lang.String parameter.
   */

  @DISPID(2080) //= 0x820. The runtime will prefer the VTID if present
  @VTID(98)
  void password(
    java.lang.String password);


  /**
   * <p>
   * Getter method for the COM property "WritePassword"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2081) //= 0x821. The runtime will prefer the VTID if present
  @VTID(99)
  java.lang.String writePassword();


  /**
   * <p>
   * Setter method for the COM property "WritePassword"
   * </p>
   * @param writePassword Mandatory java.lang.String parameter.
   */

  @DISPID(2081) //= 0x821. The runtime will prefer the VTID if present
  @VTID(100)
  void writePassword(
    java.lang.String writePassword);


  /**
   * <p>
   * Getter method for the COM property "Permission"
   * </p>
   * @return  Returns a value of type office.Permission
   */

  @DISPID(2082) //= 0x822. The runtime will prefer the VTID if present
  @VTID(101)
  office.Permission permission();


  @VTID(101)
  @ReturnValue(defaultPropertyThrough={office.Permission.class})
  office.UserPermission permission(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "SharedWorkspace"
   * </p>
   * @return  Returns a value of type office.SharedWorkspace
   */

  @DISPID(2083) //= 0x823. The runtime will prefer the VTID if present
  @VTID(102)
  office.SharedWorkspace sharedWorkspace();


  /**
   * <p>
   * Getter method for the COM property "Sync"
   * </p>
   * @return  Returns a value of type office.Sync
   */

  @DISPID(2084) //= 0x824. The runtime will prefer the VTID if present
  @VTID(103)
  office.Sync sync();


  /**
   * @param recipients Optional parameter. Default value is ""
   * @param subject Optional parameter. Default value is ""
   * @param showMessage Optional parameter. Default value is false
   */

  @DISPID(2085) //= 0x825. The runtime will prefer the VTID if present
  @VTID(104)
  void sendFaxOverInternet(
    @Optional @DefaultValue("") java.lang.String recipients,
    @Optional @DefaultValue("") java.lang.String subject,
    @Optional @DefaultValue("0") boolean showMessage);


  /**
   * <p>
   * Getter method for the COM property "DocumentLibraryVersions"
   * </p>
   * @return  Returns a value of type office.DocumentLibraryVersions
   */

  @DISPID(2086) //= 0x826. The runtime will prefer the VTID if present
  @VTID(105)
  office.DocumentLibraryVersions documentLibraryVersions();


  @VTID(105)
  @ReturnValue(defaultPropertyThrough={office.DocumentLibraryVersions.class})
  office.DocumentLibraryVersion documentLibraryVersions(
    int lIndex);

  /**
   * <p>
   * Getter method for the COM property "ContentTypeProperties"
   * </p>
   * @return  Returns a value of type office.MetaProperties
   */

  @DISPID(2087) //= 0x827. The runtime will prefer the VTID if present
  @VTID(106)
  office.MetaProperties contentTypeProperties();


  @VTID(106)
  @ReturnValue(defaultPropertyThrough={office.MetaProperties.class})
  office.MetaProperty contentTypeProperties(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "SectionCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2088) //= 0x828. The runtime will prefer the VTID if present
  @VTID(107)
  int sectionCount();


  /**
   * <p>
   * Getter method for the COM property "HasSections"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2089) //= 0x829. The runtime will prefer the VTID if present
  @VTID(108)
  boolean hasSections();


  /**
   * @param index Mandatory int parameter.
   * @param afterSlide Mandatory boolean parameter.
   * @param sectionTitle Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(2090) //= 0x82a. The runtime will prefer the VTID if present
  @VTID(109)
  int newSectionAfter(
    int index,
    boolean afterSlide,
    java.lang.String sectionTitle);


  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(2091) //= 0x82b. The runtime will prefer the VTID if present
  @VTID(110)
  void deleteSection(
    int index);


  /**
   */

  @DISPID(2092) //= 0x82c. The runtime will prefer the VTID if present
  @VTID(111)
  void disableSections();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2093) //= 0x82d. The runtime will prefer the VTID if present
  @VTID(112)
  java.lang.String sectionTitle(
    int index);


  /**
   * @param type Mandatory ppt.PpRemoveDocInfoType parameter.
   */

  @DISPID(2094) //= 0x82e. The runtime will prefer the VTID if present
  @VTID(113)
  void removeDocumentInformation(
    ppt.PpRemoveDocInfoType type);


  /**
   * @param saveChanges Optional parameter. Default value is false
   * @param comments Optional parameter. Default value is com4j.Variant.getMissing()
   * @param makePublic Optional parameter. Default value is com4j.Variant.getMissing()
   * @param versionType Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2095) //= 0x82f. The runtime will prefer the VTID if present
  @VTID(114)
  void checkInWithVersion(
    @Optional @DefaultValue("-1") boolean saveChanges,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object comments,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object makePublic,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object versionType);


  /**
   * @param path Mandatory java.lang.String parameter.
   * @param fixedFormatType Mandatory ppt.PpFixedFormatType parameter.
   * @param intent Optional parameter. Default value is 1
   * @param frameSlides Optional parameter. Default value is 0
   * @param handoutOrder Optional parameter. Default value is 1
   * @param outputType Optional parameter. Default value is 1
   * @param printHiddenSlides Optional parameter. Default value is 0
   * @param printRange Optional parameter. Default value is 0
   * @param rangeType Optional parameter. Default value is 1
   * @param slideShowName Optional parameter. Default value is ""
   * @param includeDocProperties Optional parameter. Default value is false
   * @param keepIRMSettings Optional parameter. Default value is false
   * @param docStructureTags Optional parameter. Default value is false
   * @param bitmapMissingFonts Optional parameter. Default value is false
   * @param useISO19005_1 Optional parameter. Default value is false
   * @param externalExporter Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2096) //= 0x830. The runtime will prefer the VTID if present
  @VTID(115)
  void exportAsFixedFormat(
    java.lang.String path,
    ppt.PpFixedFormatType fixedFormatType,
    @Optional @DefaultValue("1") ppt.PpFixedFormatIntent intent,
    @Optional @DefaultValue("0") office.MsoTriState frameSlides,
    @Optional @DefaultValue("1") ppt.PpPrintHandoutOrder handoutOrder,
    @Optional @DefaultValue("1") ppt.PpPrintOutputType outputType,
    @Optional @DefaultValue("0") office.MsoTriState printHiddenSlides,
    @Optional @DefaultValue("0") ppt.PrintRange printRange,
    @Optional @DefaultValue("1") ppt.PpPrintRangeType rangeType,
    @Optional @DefaultValue("") java.lang.String slideShowName,
    @Optional @DefaultValue("0") boolean includeDocProperties,
    @Optional @DefaultValue("-1") boolean keepIRMSettings,
    @Optional @DefaultValue("-1") boolean docStructureTags,
    @Optional @DefaultValue("-1") boolean bitmapMissingFonts,
    @Optional @DefaultValue("0") boolean useISO19005_1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object externalExporter);


  /**
   * <p>
   * Getter method for the COM property "ServerPolicy"
   * </p>
   * @return  Returns a value of type office.ServerPolicy
   */

  @DISPID(2097) //= 0x831. The runtime will prefer the VTID if present
  @VTID(116)
  office.ServerPolicy serverPolicy();


  @VTID(116)
  @ReturnValue(defaultPropertyThrough={office.ServerPolicy.class})
  office.PolicyItem serverPolicy(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * @return  Returns a value of type office.WorkflowTasks
   */

  @DISPID(2098) //= 0x832. The runtime will prefer the VTID if present
  @VTID(117)
  office.WorkflowTasks getWorkflowTasks();


  @VTID(117)
  @ReturnValue(defaultPropertyThrough={office.WorkflowTasks.class})
  office.WorkflowTask getWorkflowTasks(
    int index);

  /**
   * @return  Returns a value of type office.WorkflowTemplates
   */

  @DISPID(2099) //= 0x833. The runtime will prefer the VTID if present
  @VTID(118)
  office.WorkflowTemplates getWorkflowTemplates();


  @VTID(118)
  @ReturnValue(defaultPropertyThrough={office.WorkflowTemplates.class})
  office.WorkflowTemplate getWorkflowTemplates(
    int index);

  /**
   */

  @DISPID(2100) //= 0x834. The runtime will prefer the VTID if present
  @VTID(119)
  void lockServerFile();


  /**
   * <p>
   * Getter method for the COM property "DocumentInspectors"
   * </p>
   * @return  Returns a value of type office.DocumentInspectors
   */

  @DISPID(2101) //= 0x835. The runtime will prefer the VTID if present
  @VTID(120)
  office.DocumentInspectors documentInspectors();


  @VTID(120)
  @ReturnValue(defaultPropertyThrough={office.DocumentInspectors.class})
  office.DocumentInspector documentInspectors(
    int index);

  /**
   * <p>
   * Getter method for the COM property "HasVBProject"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2102) //= 0x836. The runtime will prefer the VTID if present
  @VTID(121)
  boolean hasVBProject();


  /**
   * <p>
   * Getter method for the COM property "CustomXMLParts"
   * </p>
   * @return  Returns a value of type office._CustomXMLParts
   */

  @DISPID(2103) //= 0x837. The runtime will prefer the VTID if present
  @VTID(122)
  office._CustomXMLParts customXMLParts();


  /**
   * <p>
   * Getter method for the COM property "Final"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2104) //= 0x838. The runtime will prefer the VTID if present
  @VTID(123)
  boolean _final();


  /**
   * <p>
   * Setter method for the COM property "Final"
   * </p>
   * @param _final Mandatory boolean parameter.
   */

  @DISPID(2104) //= 0x838. The runtime will prefer the VTID if present
  @VTID(124)
  void _final(
    boolean _final);


  /**
   * @param themeName Mandatory java.lang.String parameter.
   */

  @DISPID(2105) //= 0x839. The runtime will prefer the VTID if present
  @VTID(125)
  void applyTheme(
    java.lang.String themeName);


  /**
   * <p>
   * Getter method for the COM property "CustomerData"
   * </p>
   * @return  Returns a value of type ppt.CustomerData
   */

  @DISPID(2106) //= 0x83a. The runtime will prefer the VTID if present
  @VTID(126)
  ppt.CustomerData customerData();


  @VTID(126)
  @ReturnValue(defaultPropertyThrough={ppt.CustomerData.class})
  office._CustomXMLPart customerData(
    java.lang.String id);

  /**
   * <p>
   * Getter method for the COM property "Research"
   * </p>
   * @return  Returns a value of type ppt.Research
   */

  @DISPID(2107) //= 0x83b. The runtime will prefer the VTID if present
  @VTID(127)
  ppt.Research research();


  /**
   * @param slideLibraryUrl Mandatory java.lang.String parameter.
   * @param overwrite Optional parameter. Default value is false
   * @param useSlideOrder Optional parameter. Default value is false
   */

  @DISPID(2108) //= 0x83c. The runtime will prefer the VTID if present
  @VTID(128)
  void publishSlides(
    java.lang.String slideLibraryUrl,
    @Optional @DefaultValue("0") boolean overwrite,
    @Optional @DefaultValue("0") boolean useSlideOrder);


  /**
   * <p>
   * Getter method for the COM property "EncryptionProvider"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2109) //= 0x83d. The runtime will prefer the VTID if present
  @VTID(129)
  java.lang.String encryptionProvider();


  /**
   * <p>
   * Setter method for the COM property "EncryptionProvider"
   * </p>
   * @param encryptionProvider Mandatory java.lang.String parameter.
   */

  @DISPID(2109) //= 0x83d. The runtime will prefer the VTID if present
  @VTID(130)
  void encryptionProvider(
    java.lang.String encryptionProvider);


  /**
   */

  @DISPID(2110) //= 0x83e. The runtime will prefer the VTID if present
  @VTID(131)
  void convert();


  /**
   * <p>
   * Getter method for the COM property "SectionProperties"
   * </p>
   * @return  Returns a value of type ppt.SectionProperties
   */

  @DISPID(2111) //= 0x83f. The runtime will prefer the VTID if present
  @VTID(132)
  ppt.SectionProperties sectionProperties();


  /**
   * <p>
   * Getter method for the COM property "Coauthoring"
   * </p>
   * @return  Returns a value of type ppt.Coauthoring
   */

  @DISPID(2112) //= 0x840. The runtime will prefer the VTID if present
  @VTID(133)
  ppt.Coauthoring coauthoring();


  /**
   * @param withPresentation Mandatory java.lang.String parameter.
   * @param baselinePresentation Mandatory java.lang.String parameter.
   */

  @DISPID(2113) //= 0x841. The runtime will prefer the VTID if present
  @VTID(134)
  void mergeWithBaseline(
    java.lang.String withPresentation,
    java.lang.String baselinePresentation);


  /**
   * <p>
   * Getter method for the COM property "InMergeMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2114) //= 0x842. The runtime will prefer the VTID if present
  @VTID(135)
  boolean inMergeMode();


  /**
   */

  @DISPID(2115) //= 0x843. The runtime will prefer the VTID if present
  @VTID(136)
  void acceptAll();


  /**
   */

  @DISPID(2116) //= 0x844. The runtime will prefer the VTID if present
  @VTID(137)
  void rejectAll();


  /**
   */

  @DISPID(2117) //= 0x845. The runtime will prefer the VTID if present
  @VTID(138)
  void ensureAllMediaUpgraded();


  /**
   * <p>
   * Getter method for the COM property "Broadcast"
   * </p>
   * @return  Returns a value of type ppt.Broadcast
   */

  @DISPID(2118) //= 0x846. The runtime will prefer the VTID if present
  @VTID(139)
  ppt.Broadcast broadcast();


  /**
   * <p>
   * Getter method for the COM property "HasNotesMaster"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2119) //= 0x847. The runtime will prefer the VTID if present
  @VTID(140)
  boolean hasNotesMaster();


  /**
   * <p>
   * Getter method for the COM property "HasHandoutMaster"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2120) //= 0x848. The runtime will prefer the VTID if present
  @VTID(141)
  boolean hasHandoutMaster();


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(2121) //= 0x849. The runtime will prefer the VTID if present
  @VTID(142)
  void convert2(
    java.lang.String fileName);


  /**
   * <p>
   * Getter method for the COM property "CreateVideoStatus"
   * </p>
   * @return  Returns a value of type ppt.PpMediaTaskStatus
   */

  @DISPID(2122) //= 0x84a. The runtime will prefer the VTID if present
  @VTID(143)
  ppt.PpMediaTaskStatus createVideoStatus();


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param useTimingsAndNarrations Optional parameter. Default value is false
   * @param defaultSlideDuration Optional parameter. Default value is 5
   * @param vertResolution Optional parameter. Default value is 720
   * @param framesPerSecond Optional parameter. Default value is 30
   * @param quality Optional parameter. Default value is 85
   */

  @DISPID(2123) //= 0x84b. The runtime will prefer the VTID if present
  @VTID(144)
  void createVideo(
    java.lang.String fileName,
    @Optional @DefaultValue("-1") boolean useTimingsAndNarrations,
    @Optional @DefaultValue("5") int defaultSlideDuration,
    @Optional @DefaultValue("720") int vertResolution,
    @Optional @DefaultValue("30") int framesPerSecond,
    @Optional @DefaultValue("85") int quality);


  // Properties:
}
