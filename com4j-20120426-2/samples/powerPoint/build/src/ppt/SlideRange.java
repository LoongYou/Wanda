package ppt  ;

import com4j.*;

@IID("{9149346B-5A91-11CF-8700-00AA0060263B}")
public interface SlideRange extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "Shapes"
   * </p>
   * @return  Returns a value of type ppt.Shapes
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.Shapes shapes();


  @VTID(9)
  @ReturnValue(defaultPropertyThrough={ppt.Shapes.class})
  ppt.Shape shapes(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "HeadersFooters"
   * </p>
   * @return  Returns a value of type ppt.HeadersFooters
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  ppt.HeadersFooters headersFooters();


  /**
   * <p>
   * Getter method for the COM property "SlideShowTransition"
   * </p>
   * @return  Returns a value of type ppt.SlideShowTransition
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  ppt.SlideShowTransition slideShowTransition();


  /**
   * <p>
   * Getter method for the COM property "ColorScheme"
   * </p>
   * @return  Returns a value of type ppt.ColorScheme
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(12)
  ppt.ColorScheme colorScheme();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={ppt.ColorScheme.class})
  ppt.RGBColor colorScheme(
    ppt.PpColorSchemeIndex schemeColor);

  /**
   * <p>
   * Setter method for the COM property "ColorScheme"
   * </p>
   * @param colorScheme Mandatory ppt.ColorScheme parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(13)
  void colorScheme(
    ppt.ColorScheme colorScheme);


  /**
   * <p>
   * Getter method for the COM property "Background"
   * </p>
   * @return  Returns a value of type ppt.ShapeRange
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(14)
  ppt.ShapeRange background();


  @VTID(14)
  @ReturnValue(defaultPropertyThrough={ppt.ShapeRange.class})
  ppt.Shape background(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(16)
  void name(
    java.lang.String name);


  /**
   * <p>
   * Getter method for the COM property "SlideID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(17)
  int slideID();


  /**
   * <p>
   * Getter method for the COM property "PrintSteps"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(18)
  int printSteps();


  /**
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(19)
  void select();


  /**
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(20)
  void cut();


  /**
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(21)
  void copy();


  /**
   * <p>
   * Getter method for the COM property "Layout"
   * </p>
   * @return  Returns a value of type ppt.PpSlideLayout
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(22)
  ppt.PpSlideLayout layout();


  /**
   * <p>
   * Setter method for the COM property "Layout"
   * </p>
   * @param layout Mandatory ppt.PpSlideLayout parameter.
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(23)
  void layout(
    ppt.PpSlideLayout layout);


  /**
   * @return  Returns a value of type ppt.SlideRange
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(24)
  ppt.SlideRange duplicate();


  @VTID(24)
  @ReturnValue(defaultPropertyThrough={ppt.SlideRange.class})
  ppt._Slide duplicate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(25)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Tags"
   * </p>
   * @return  Returns a value of type ppt.Tags
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(26)
  ppt.Tags tags();


  @VTID(26)
  @ReturnValue(defaultPropertyThrough={ppt.Tags.class})
  java.lang.String tags(
    java.lang.String name);

  /**
   * <p>
   * Getter method for the COM property "SlideIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2018) //= 0x7e2. The runtime will prefer the VTID if present
  @VTID(27)
  int slideIndex();


  /**
   * <p>
   * Getter method for the COM property "SlideNumber"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2019) //= 0x7e3. The runtime will prefer the VTID if present
  @VTID(28)
  int slideNumber();


  /**
   * <p>
   * Getter method for the COM property "DisplayMasterShapes"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2020) //= 0x7e4. The runtime will prefer the VTID if present
  @VTID(29)
  office.MsoTriState displayMasterShapes();


  /**
   * <p>
   * Setter method for the COM property "DisplayMasterShapes"
   * </p>
   * @param displayMasterShapes Mandatory office.MsoTriState parameter.
   */

  @DISPID(2020) //= 0x7e4. The runtime will prefer the VTID if present
  @VTID(30)
  void displayMasterShapes(
    office.MsoTriState displayMasterShapes);


  /**
   * <p>
   * Getter method for the COM property "FollowMasterBackground"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2021) //= 0x7e5. The runtime will prefer the VTID if present
  @VTID(31)
  office.MsoTriState followMasterBackground();


  /**
   * <p>
   * Setter method for the COM property "FollowMasterBackground"
   * </p>
   * @param followMasterBackground Mandatory office.MsoTriState parameter.
   */

  @DISPID(2021) //= 0x7e5. The runtime will prefer the VTID if present
  @VTID(32)
  void followMasterBackground(
    office.MsoTriState followMasterBackground);


  /**
   * <p>
   * Getter method for the COM property "NotesPage"
   * </p>
   * @return  Returns a value of type ppt.SlideRange
   */

  @DISPID(2022) //= 0x7e6. The runtime will prefer the VTID if present
  @VTID(33)
  ppt.SlideRange notesPage();


  @VTID(33)
  @ReturnValue(defaultPropertyThrough={ppt.SlideRange.class})
  ppt._Slide notesPage(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Master"
   * </p>
   * @return  Returns a value of type ppt._Master
   */

  @DISPID(2023) //= 0x7e7. The runtime will prefer the VTID if present
  @VTID(34)
  ppt._Master master();


  /**
   * <p>
   * Getter method for the COM property "Hyperlinks"
   * </p>
   * @return  Returns a value of type ppt.Hyperlinks
   */

  @DISPID(2024) //= 0x7e8. The runtime will prefer the VTID if present
  @VTID(35)
  ppt.Hyperlinks hyperlinks();


  @VTID(35)
  @ReturnValue(defaultPropertyThrough={ppt.Hyperlinks.class})
  ppt.Hyperlink hyperlinks(
    int index);

  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param filterName Mandatory java.lang.String parameter.
   * @param scaleWidth Optional parameter. Default value is 0
   * @param scaleHeight Optional parameter. Default value is 0
   */

  @DISPID(2025) //= 0x7e9. The runtime will prefer the VTID if present
  @VTID(36)
  void export(
    java.lang.String fileName,
    java.lang.String filterName,
    @Optional @DefaultValue("0") int scaleWidth,
    @Optional @DefaultValue("0") int scaleHeight);


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type ppt._Slide
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(37)
  @DefaultMethod
  ppt._Slide item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(38)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(39)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object _Index(
    int index);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(40)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Scripts"
   * </p>
   * @return  Returns a value of type office.Scripts
   */

  @DISPID(2026) //= 0x7ea. The runtime will prefer the VTID if present
  @VTID(41)
  office.Scripts scripts();


  @VTID(41)
  @ReturnValue(defaultPropertyThrough={office.Scripts.class})
  office.Script scripts(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Comments"
   * </p>
   * @return  Returns a value of type ppt.Comments
   */

  @DISPID(2028) //= 0x7ec. The runtime will prefer the VTID if present
  @VTID(42)
  ppt.Comments comments();


  @VTID(42)
  @ReturnValue(defaultPropertyThrough={ppt.Comments.class})
  ppt.Comment comments(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Design"
   * </p>
   * @return  Returns a value of type ppt.Design
   */

  @DISPID(2029) //= 0x7ed. The runtime will prefer the VTID if present
  @VTID(43)
  ppt.Design design();


  /**
   * <p>
   * Setter method for the COM property "Design"
   * </p>
   * @param design Mandatory ppt.Design parameter.
   */

  @DISPID(2029) //= 0x7ed. The runtime will prefer the VTID if present
  @VTID(44)
  void design(
    ppt.Design design);


  /**
   * @param toPos Mandatory int parameter.
   */

  @DISPID(2030) //= 0x7ee. The runtime will prefer the VTID if present
  @VTID(45)
  void moveTo(
    int toPos);


  /**
   * <p>
   * Getter method for the COM property "TimeLine"
   * </p>
   * @return  Returns a value of type ppt.TimeLine
   */

  @DISPID(2031) //= 0x7ef. The runtime will prefer the VTID if present
  @VTID(46)
  ppt.TimeLine timeLine();


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(2032) //= 0x7f0. The runtime will prefer the VTID if present
  @VTID(47)
  void applyTemplate(
    java.lang.String fileName);


  /**
   * <p>
   * Getter method for the COM property "SectionNumber"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2033) //= 0x7f1. The runtime will prefer the VTID if present
  @VTID(48)
  int sectionNumber();


  /**
   * <p>
   * Getter method for the COM property "CustomLayout"
   * </p>
   * @return  Returns a value of type ppt.CustomLayout
   */

  @DISPID(2034) //= 0x7f2. The runtime will prefer the VTID if present
  @VTID(49)
  ppt.CustomLayout customLayout();


  /**
   * <p>
   * Setter method for the COM property "CustomLayout"
   * </p>
   * @param customLayout Mandatory ppt.CustomLayout parameter.
   */

  @DISPID(2034) //= 0x7f2. The runtime will prefer the VTID if present
  @VTID(50)
  void customLayout(
    ppt.CustomLayout customLayout);


  /**
   * @param themeName Mandatory java.lang.String parameter.
   */

  @DISPID(2035) //= 0x7f3. The runtime will prefer the VTID if present
  @VTID(51)
  void applyTheme(
    java.lang.String themeName);


  /**
   * <p>
   * Getter method for the COM property "ThemeColorScheme"
   * </p>
   * @return  Returns a value of type office.ThemeColorScheme
   */

  @DISPID(2036) //= 0x7f4. The runtime will prefer the VTID if present
  @VTID(52)
  office.ThemeColorScheme themeColorScheme();


  @VTID(52)
  @ReturnValue(defaultPropertyThrough={office.ThemeColorScheme.class})
  office.ThemeColor themeColorScheme(
    office.MsoThemeColorSchemeIndex index);

  /**
   * @param themeColorSchemeName Mandatory java.lang.String parameter.
   */

  @DISPID(2037) //= 0x7f5. The runtime will prefer the VTID if present
  @VTID(53)
  void applyThemeColorScheme(
    java.lang.String themeColorSchemeName);


  /**
   * <p>
   * Getter method for the COM property "BackgroundStyle"
   * </p>
   * @return  Returns a value of type office.MsoBackgroundStyleIndex
   */

  @DISPID(2038) //= 0x7f6. The runtime will prefer the VTID if present
  @VTID(54)
  office.MsoBackgroundStyleIndex backgroundStyle();


  /**
   * <p>
   * Setter method for the COM property "BackgroundStyle"
   * </p>
   * @param backgroundStyle Mandatory office.MsoBackgroundStyleIndex parameter.
   */

  @DISPID(2038) //= 0x7f6. The runtime will prefer the VTID if present
  @VTID(55)
  void backgroundStyle(
    office.MsoBackgroundStyleIndex backgroundStyle);


  /**
   * <p>
   * Getter method for the COM property "CustomerData"
   * </p>
   * @return  Returns a value of type ppt.CustomerData
   */

  @DISPID(2039) //= 0x7f7. The runtime will prefer the VTID if present
  @VTID(56)
  ppt.CustomerData customerData();


  @VTID(56)
  @ReturnValue(defaultPropertyThrough={ppt.CustomerData.class})
  office._CustomXMLPart customerData(
    java.lang.String id);

  /**
   * @param slideLibraryUrl Mandatory java.lang.String parameter.
   * @param overwrite Optional parameter. Default value is false
   * @param useSlideOrder Optional parameter. Default value is false
   */

  @DISPID(2040) //= 0x7f8. The runtime will prefer the VTID if present
  @VTID(57)
  void publishSlides(
    java.lang.String slideLibraryUrl,
    @Optional @DefaultValue("0") boolean overwrite,
    @Optional @DefaultValue("0") boolean useSlideOrder);


  /**
   * @param toSection Mandatory int parameter.
   */

  @DISPID(2041) //= 0x7f9. The runtime will prefer the VTID if present
  @VTID(58)
  void moveToSectionStart(
    int toSection);


  /**
   * <p>
   * Getter method for the COM property "sectionIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2042) //= 0x7fa. The runtime will prefer the VTID if present
  @VTID(59)
  int sectionIndex();


  /**
   * <p>
   * Getter method for the COM property "HasNotesPage"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2043) //= 0x7fb. The runtime will prefer the VTID if present
  @VTID(60)
  office.MsoTriState hasNotesPage();


  // Properties:
}
