package ppt  ;

import com4j.*;

@IID("{9149346C-5A91-11CF-8700-00AA0060263B}")
public interface _Master extends Com4jObject {
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
   * Getter method for the COM property "ColorScheme"
   * </p>
   * @return  Returns a value of type ppt.ColorScheme
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  ppt.ColorScheme colorScheme();


  @VTID(11)
  @ReturnValue(defaultPropertyThrough={ppt.ColorScheme.class})
  ppt.RGBColor colorScheme(
    ppt.PpColorSchemeIndex schemeColor);

  /**
   * <p>
   * Setter method for the COM property "ColorScheme"
   * </p>
   * @param colorScheme Mandatory ppt.ColorScheme parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(12)
  void colorScheme(
    ppt.ColorScheme colorScheme);


  /**
   * <p>
   * Getter method for the COM property "Background"
   * </p>
   * @return  Returns a value of type ppt.ShapeRange
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(13)
  ppt.ShapeRange background();


  @VTID(13)
  @ReturnValue(defaultPropertyThrough={ppt.ShapeRange.class})
  ppt.Shape background(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(15)
  void name(
    java.lang.String name);


  /**
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(16)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(17)
  float height();


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(18)
  float width();


  /**
   * <p>
   * Getter method for the COM property "TextStyles"
   * </p>
   * @return  Returns a value of type ppt.TextStyles
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(19)
  ppt.TextStyles textStyles();


  @VTID(19)
  @ReturnValue(defaultPropertyThrough={ppt.TextStyles.class})
  ppt.TextStyle textStyles(
    ppt.PpTextStyleType type);

  /**
   * <p>
   * Getter method for the COM property "Hyperlinks"
   * </p>
   * @return  Returns a value of type ppt.Hyperlinks
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(20)
  ppt.Hyperlinks hyperlinks();


  @VTID(20)
  @ReturnValue(defaultPropertyThrough={ppt.Hyperlinks.class})
  ppt.Hyperlink hyperlinks(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Scripts"
   * </p>
   * @return  Returns a value of type office.Scripts
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(21)
  office.Scripts scripts();


  @VTID(21)
  @ReturnValue(defaultPropertyThrough={office.Scripts.class})
  office.Script scripts(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Design"
   * </p>
   * @return  Returns a value of type ppt.Design
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(22)
  ppt.Design design();


  /**
   * <p>
   * Getter method for the COM property "TimeLine"
   * </p>
   * @return  Returns a value of type ppt.TimeLine
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(23)
  ppt.TimeLine timeLine();


  /**
   * <p>
   * Getter method for the COM property "SlideShowTransition"
   * </p>
   * @return  Returns a value of type ppt.SlideShowTransition
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(24)
  ppt.SlideShowTransition slideShowTransition();


  /**
   * <p>
   * Getter method for the COM property "CustomLayouts"
   * </p>
   * @return  Returns a value of type ppt.CustomLayouts
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(25)
  ppt.CustomLayouts customLayouts();


  @VTID(25)
  @ReturnValue(defaultPropertyThrough={ppt.CustomLayouts.class})
  ppt.CustomLayout customLayouts(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Theme"
   * </p>
   * @return  Returns a value of type office.OfficeTheme
   */

  @DISPID(2018) //= 0x7e2. The runtime will prefer the VTID if present
  @VTID(26)
  office.OfficeTheme theme();


  /**
   * @param themeName Mandatory java.lang.String parameter.
   */

  @DISPID(2019) //= 0x7e3. The runtime will prefer the VTID if present
  @VTID(27)
  void applyTheme(
    java.lang.String themeName);


  /**
   * <p>
   * Getter method for the COM property "BackgroundStyle"
   * </p>
   * @return  Returns a value of type office.MsoBackgroundStyleIndex
   */

  @DISPID(2020) //= 0x7e4. The runtime will prefer the VTID if present
  @VTID(28)
  office.MsoBackgroundStyleIndex backgroundStyle();


  /**
   * <p>
   * Setter method for the COM property "BackgroundStyle"
   * </p>
   * @param backgroundStyle Mandatory office.MsoBackgroundStyleIndex parameter.
   */

  @DISPID(2020) //= 0x7e4. The runtime will prefer the VTID if present
  @VTID(29)
  void backgroundStyle(
    office.MsoBackgroundStyleIndex backgroundStyle);


  /**
   * <p>
   * Getter method for the COM property "CustomerData"
   * </p>
   * @return  Returns a value of type ppt.CustomerData
   */

  @DISPID(2021) //= 0x7e5. The runtime will prefer the VTID if present
  @VTID(30)
  ppt.CustomerData customerData();


  @VTID(30)
  @ReturnValue(defaultPropertyThrough={ppt.CustomerData.class})
  office._CustomXMLPart customerData(
    java.lang.String id);

  // Properties:
}
