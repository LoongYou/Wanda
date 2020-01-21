package ppt  ;

import com4j.*;

@IID("{914934F3-5A91-11CF-8700-00AA0060263B}")
public interface CustomLayout extends Com4jObject {
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
   * Getter method for the COM property "Background"
   * </p>
   * @return  Returns a value of type ppt.ShapeRange
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  ppt.ShapeRange background();


  @VTID(11)
  @ReturnValue(defaultPropertyThrough={ppt.ShapeRange.class})
  ppt.Shape background(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(13)
  void name(
    java.lang.String name);


  /**
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(14)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(15)
  float height();


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(16)
  float width();


  /**
   * <p>
   * Getter method for the COM property "Hyperlinks"
   * </p>
   * @return  Returns a value of type ppt.Hyperlinks
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(17)
  ppt.Hyperlinks hyperlinks();


  @VTID(17)
  @ReturnValue(defaultPropertyThrough={ppt.Hyperlinks.class})
  ppt.Hyperlink hyperlinks(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Design"
   * </p>
   * @return  Returns a value of type ppt.Design
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(18)
  ppt.Design design();


  /**
   * <p>
   * Getter method for the COM property "TimeLine"
   * </p>
   * @return  Returns a value of type ppt.TimeLine
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(19)
  ppt.TimeLine timeLine();


  /**
   * <p>
   * Getter method for the COM property "SlideShowTransition"
   * </p>
   * @return  Returns a value of type ppt.SlideShowTransition
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(20)
  ppt.SlideShowTransition slideShowTransition();


  /**
   * <p>
   * Getter method for the COM property "MatchingName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String matchingName();


  /**
   * <p>
   * Setter method for the COM property "MatchingName"
   * </p>
   * @param matchingName Mandatory java.lang.String parameter.
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(22)
  void matchingName(
    java.lang.String matchingName);


  /**
   * <p>
   * Getter method for the COM property "Preserved"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(23)
  office.MsoTriState preserved();


  /**
   * <p>
   * Setter method for the COM property "Preserved"
   * </p>
   * @param preserved Mandatory office.MsoTriState parameter.
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(24)
  void preserved(
    office.MsoTriState preserved);


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(25)
  int index();


  /**
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(26)
  void select();


  /**
   */

  @DISPID(2018) //= 0x7e2. The runtime will prefer the VTID if present
  @VTID(27)
  void cut();


  /**
   */

  @DISPID(2019) //= 0x7e3. The runtime will prefer the VTID if present
  @VTID(28)
  void copy();


  /**
   * @return  Returns a value of type ppt.CustomLayout
   */

  @DISPID(2020) //= 0x7e4. The runtime will prefer the VTID if present
  @VTID(29)
  ppt.CustomLayout duplicate();


  /**
   * @param toPos Mandatory int parameter.
   */

  @DISPID(2021) //= 0x7e5. The runtime will prefer the VTID if present
  @VTID(30)
  void moveTo(
    int toPos);


  /**
   * <p>
   * Getter method for the COM property "DisplayMasterShapes"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2022) //= 0x7e6. The runtime will prefer the VTID if present
  @VTID(31)
  office.MsoTriState displayMasterShapes();


  /**
   * <p>
   * Setter method for the COM property "DisplayMasterShapes"
   * </p>
   * @param displayMasterShapes Mandatory office.MsoTriState parameter.
   */

  @DISPID(2022) //= 0x7e6. The runtime will prefer the VTID if present
  @VTID(32)
  void displayMasterShapes(
    office.MsoTriState displayMasterShapes);


  /**
   * <p>
   * Getter method for the COM property "FollowMasterBackground"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2023) //= 0x7e7. The runtime will prefer the VTID if present
  @VTID(33)
  office.MsoTriState followMasterBackground();


  /**
   * <p>
   * Setter method for the COM property "FollowMasterBackground"
   * </p>
   * @param followMasterBackground Mandatory office.MsoTriState parameter.
   */

  @DISPID(2023) //= 0x7e7. The runtime will prefer the VTID if present
  @VTID(34)
  void followMasterBackground(
    office.MsoTriState followMasterBackground);


  /**
   * <p>
   * Getter method for the COM property "ThemeColorScheme"
   * </p>
   * @return  Returns a value of type office.ThemeColorScheme
   */

  @DISPID(2024) //= 0x7e8. The runtime will prefer the VTID if present
  @VTID(35)
  office.ThemeColorScheme themeColorScheme();


  @VTID(35)
  @ReturnValue(defaultPropertyThrough={office.ThemeColorScheme.class})
  office.ThemeColor themeColorScheme(
    office.MsoThemeColorSchemeIndex index);

  /**
   * <p>
   * Getter method for the COM property "CustomerData"
   * </p>
   * @return  Returns a value of type ppt.CustomerData
   */

  @DISPID(2025) //= 0x7e9. The runtime will prefer the VTID if present
  @VTID(36)
  ppt.CustomerData customerData();


  @VTID(36)
  @ReturnValue(defaultPropertyThrough={ppt.CustomerData.class})
  office._CustomXMLPart customerData(
    java.lang.String id);

  // Properties:
}
