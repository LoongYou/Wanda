package ppt  ;

import com4j.*;

@IID("{91493457-5A91-11CF-8700-00AA0060263B}")
public interface DocumentWindow extends Com4jObject {
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
   * Getter method for the COM property "Selection"
   * </p>
   * @return  Returns a value of type ppt.Selection
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.Selection selection();


  /**
   * <p>
   * Getter method for the COM property "View"
   * </p>
   * @return  Returns a value of type ppt.View
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  ppt.View view();


  /**
   * <p>
   * Getter method for the COM property "Presentation"
   * </p>
   * @return  Returns a value of type ppt._Presentation
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  ppt._Presentation presentation();


  /**
   * <p>
   * Getter method for the COM property "ViewType"
   * </p>
   * @return  Returns a value of type ppt.PpViewType
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(12)
  ppt.PpViewType viewType();


  /**
   * <p>
   * Setter method for the COM property "ViewType"
   * </p>
   * @param viewType Mandatory ppt.PpViewType parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(13)
  void viewType(
    ppt.PpViewType viewType);


  /**
   * <p>
   * Getter method for the COM property "BlackAndWhite"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(14)
  office.MsoTriState blackAndWhite();


  /**
   * <p>
   * Setter method for the COM property "BlackAndWhite"
   * </p>
   * @param blackAndWhite Mandatory office.MsoTriState parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(15)
  void blackAndWhite(
    office.MsoTriState blackAndWhite);


  /**
   * <p>
   * Getter method for the COM property "Active"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(16)
  office.MsoTriState active();


  /**
   * <p>
   * Getter method for the COM property "WindowState"
   * </p>
   * @return  Returns a value of type ppt.PpWindowState
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(17)
  ppt.PpWindowState windowState();


  /**
   * <p>
   * Setter method for the COM property "WindowState"
   * </p>
   * @param windowState Mandatory ppt.PpWindowState parameter.
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(18)
  void windowState(
    ppt.PpWindowState windowState);


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(19)
  @DefaultMethod
  java.lang.String caption();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(20)
  float left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param left Mandatory float parameter.
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(21)
  void left(
    float left);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(22)
  float top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param top Mandatory float parameter.
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(23)
  void top(
    float top);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(24)
  float width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param width Mandatory float parameter.
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(25)
  void width(
    float width);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(26)
  float height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param height Mandatory float parameter.
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(27)
  void height(
    float height);


  /**
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(28)
  void fitToPage();


  /**
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(29)
  void activate();


  /**
   * @param down Optional parameter. Default value is 1
   * @param up Optional parameter. Default value is 0
   * @param toRight Optional parameter. Default value is 0
   * @param toLeft Optional parameter. Default value is 0
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(30)
  void largeScroll(
    @Optional @DefaultValue("1") int down,
    @Optional @DefaultValue("0") int up,
    @Optional @DefaultValue("0") int toRight,
    @Optional @DefaultValue("0") int toLeft);


  /**
   * @param down Optional parameter. Default value is 1
   * @param up Optional parameter. Default value is 0
   * @param toRight Optional parameter. Default value is 0
   * @param toLeft Optional parameter. Default value is 0
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(31)
  void smallScroll(
    @Optional @DefaultValue("1") int down,
    @Optional @DefaultValue("0") int up,
    @Optional @DefaultValue("0") int toRight,
    @Optional @DefaultValue("0") int toLeft);


  /**
   * @return  Returns a value of type ppt.DocumentWindow
   */

  @DISPID(2018) //= 0x7e2. The runtime will prefer the VTID if present
  @VTID(32)
  ppt.DocumentWindow newWindow();


  /**
   */

  @DISPID(2019) //= 0x7e3. The runtime will prefer the VTID if present
  @VTID(33)
  void close();


  /**
   * <p>
   * Getter method for the COM property "HWND"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2020) //= 0x7e4. The runtime will prefer the VTID if present
  @VTID(34)
  int hwnd();


  /**
   * <p>
   * Getter method for the COM property "ActivePane"
   * </p>
   * @return  Returns a value of type ppt.Pane
   */

  @DISPID(2021) //= 0x7e5. The runtime will prefer the VTID if present
  @VTID(35)
  ppt.Pane activePane();


  /**
   * <p>
   * Getter method for the COM property "Panes"
   * </p>
   * @return  Returns a value of type ppt.Panes
   */

  @DISPID(2022) //= 0x7e6. The runtime will prefer the VTID if present
  @VTID(36)
  ppt.Panes panes();


  @VTID(36)
  @ReturnValue(defaultPropertyThrough={ppt.Panes.class})
  ppt.Pane panes(
    int index);

  /**
   * <p>
   * Getter method for the COM property "SplitVertical"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2023) //= 0x7e7. The runtime will prefer the VTID if present
  @VTID(37)
  int splitVertical();


  /**
   * <p>
   * Setter method for the COM property "SplitVertical"
   * </p>
   * @param splitVertical Mandatory int parameter.
   */

  @DISPID(2023) //= 0x7e7. The runtime will prefer the VTID if present
  @VTID(38)
  void splitVertical(
    int splitVertical);


  /**
   * <p>
   * Getter method for the COM property "SplitHorizontal"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2024) //= 0x7e8. The runtime will prefer the VTID if present
  @VTID(39)
  int splitHorizontal();


  /**
   * <p>
   * Setter method for the COM property "SplitHorizontal"
   * </p>
   * @param splitHorizontal Mandatory int parameter.
   */

  @DISPID(2024) //= 0x7e8. The runtime will prefer the VTID if present
  @VTID(40)
  void splitHorizontal(
    int splitHorizontal);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2025) //= 0x7e9. The runtime will prefer the VTID if present
  @VTID(41)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject rangeFromPoint(
    int x,
    int y);


  /**
   * @param points Mandatory float parameter.
   * @return  Returns a value of type int
   */

  @DISPID(2026) //= 0x7ea. The runtime will prefer the VTID if present
  @VTID(42)
  int pointsToScreenPixelsX(
    float points);


  /**
   * @param points Mandatory float parameter.
   * @return  Returns a value of type int
   */

  @DISPID(2027) //= 0x7eb. The runtime will prefer the VTID if present
  @VTID(43)
  int pointsToScreenPixelsY(
    float points);


  /**
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @param start Optional parameter. Default value is -1
   */

  @DISPID(2028) //= 0x7ec. The runtime will prefer the VTID if present
  @VTID(44)
  void scrollIntoView(
    float left,
    float top,
    float width,
    float height,
    @Optional @DefaultValue("-1") office.MsoTriState start);


  /**
   * @param sectionIndex Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(2029) //= 0x7ed. The runtime will prefer the VTID if present
  @VTID(45)
  boolean isSectionExpanded(
    int sectionIndex);


  /**
   * @param sectionIndex Mandatory int parameter.
   * @param expand Mandatory boolean parameter.
   */

  @DISPID(2030) //= 0x7ee. The runtime will prefer the VTID if present
  @VTID(46)
  void expandSection(
    int sectionIndex,
    boolean expand);


  // Properties:
}
