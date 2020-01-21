package ppt  ;

import com4j.*;

@IID("{91493459-5A91-11CF-8700-00AA0060263B}")
public interface SlideShowView extends Com4jObject {
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
   * Getter method for the COM property "Zoom"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  int zoom();


  /**
   * <p>
   * Getter method for the COM property "Slide"
   * </p>
   * @return  Returns a value of type ppt._Slide
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  ppt._Slide slide();


  /**
   * <p>
   * Getter method for the COM property "PointerType"
   * </p>
   * @return  Returns a value of type ppt.PpSlideShowPointerType
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  ppt.PpSlideShowPointerType pointerType();


  /**
   * <p>
   * Setter method for the COM property "PointerType"
   * </p>
   * @param pointerType Mandatory ppt.PpSlideShowPointerType parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(12)
  void pointerType(
    ppt.PpSlideShowPointerType pointerType);


  /**
   * <p>
   * Getter method for the COM property "State"
   * </p>
   * @return  Returns a value of type ppt.PpSlideShowState
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(13)
  ppt.PpSlideShowState state();


  /**
   * <p>
   * Setter method for the COM property "State"
   * </p>
   * @param state Mandatory ppt.PpSlideShowState parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(14)
  void state(
    ppt.PpSlideShowState state);


  /**
   * <p>
   * Getter method for the COM property "AcceleratorsEnabled"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(15)
  office.MsoTriState acceleratorsEnabled();


  /**
   * <p>
   * Setter method for the COM property "AcceleratorsEnabled"
   * </p>
   * @param acceleratorsEnabled Mandatory office.MsoTriState parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(16)
  void acceleratorsEnabled(
    office.MsoTriState acceleratorsEnabled);


  /**
   * <p>
   * Getter method for the COM property "PresentationElapsedTime"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(17)
  float presentationElapsedTime();


  /**
   * <p>
   * Getter method for the COM property "SlideElapsedTime"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(18)
  float slideElapsedTime();


  /**
   * <p>
   * Setter method for the COM property "SlideElapsedTime"
   * </p>
   * @param slideElapsedTime Mandatory float parameter.
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(19)
  void slideElapsedTime(
    float slideElapsedTime);


  /**
   * <p>
   * Getter method for the COM property "LastSlideViewed"
   * </p>
   * @return  Returns a value of type ppt._Slide
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(20)
  ppt._Slide lastSlideViewed();


  /**
   * <p>
   * Getter method for the COM property "AdvanceMode"
   * </p>
   * @return  Returns a value of type ppt.PpSlideShowAdvanceMode
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(21)
  ppt.PpSlideShowAdvanceMode advanceMode();


  /**
   * <p>
   * Getter method for the COM property "PointerColor"
   * </p>
   * @return  Returns a value of type ppt.ColorFormat
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(22)
  ppt.ColorFormat pointerColor();


  /**
   * <p>
   * Getter method for the COM property "IsNamedShow"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(23)
  office.MsoTriState isNamedShow();


  /**
   * <p>
   * Getter method for the COM property "SlideShowName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(24)
  java.lang.String slideShowName();


  /**
   * @param beginX Mandatory float parameter.
   * @param beginY Mandatory float parameter.
   * @param endX Mandatory float parameter.
   * @param endY Mandatory float parameter.
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(25)
  void drawLine(
    float beginX,
    float beginY,
    float endX,
    float endY);


  /**
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(26)
  void eraseDrawing();


  /**
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(27)
  void first();


  /**
   */

  @DISPID(2018) //= 0x7e2. The runtime will prefer the VTID if present
  @VTID(28)
  void last();


  /**
   */

  @DISPID(2019) //= 0x7e3. The runtime will prefer the VTID if present
  @VTID(29)
  void next();


  /**
   */

  @DISPID(2020) //= 0x7e4. The runtime will prefer the VTID if present
  @VTID(30)
  void previous();


  /**
   * @param index Mandatory int parameter.
   * @param resetSlide Optional parameter. Default value is -1
   */

  @DISPID(2021) //= 0x7e5. The runtime will prefer the VTID if present
  @VTID(31)
  void gotoSlide(
    int index,
    @Optional @DefaultValue("-1") office.MsoTriState resetSlide);


  /**
   * @param slideShowName Mandatory java.lang.String parameter.
   */

  @DISPID(2022) //= 0x7e6. The runtime will prefer the VTID if present
  @VTID(32)
  void gotoNamedShow(
    java.lang.String slideShowName);


  /**
   */

  @DISPID(2023) //= 0x7e7. The runtime will prefer the VTID if present
  @VTID(33)
  void endNamedShow();


  /**
   */

  @DISPID(2024) //= 0x7e8. The runtime will prefer the VTID if present
  @VTID(34)
  void resetSlideTime();


  /**
   */

  @DISPID(2025) //= 0x7e9. The runtime will prefer the VTID if present
  @VTID(35)
  void exit();


  /**
   * @param pTracker Mandatory ppt.MouseTracker parameter.
   * @param presenter Mandatory office.MsoTriState parameter.
   */

  @DISPID(2026) //= 0x7ea. The runtime will prefer the VTID if present
  @VTID(36)
  void installTracker(
    ppt.MouseTracker pTracker,
    office.MsoTriState presenter);


  /**
   * <p>
   * Getter method for the COM property "CurrentShowPosition"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2027) //= 0x7eb. The runtime will prefer the VTID if present
  @VTID(37)
  int currentShowPosition();


  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(2028) //= 0x7ec. The runtime will prefer the VTID if present
  @VTID(38)
  void gotoClick(
    int index);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(2029) //= 0x7ed. The runtime will prefer the VTID if present
  @VTID(39)
  int getClickIndex();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(2030) //= 0x7ee. The runtime will prefer the VTID if present
  @VTID(40)
  int getClickCount();


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(2031) //= 0x7ef. The runtime will prefer the VTID if present
  @VTID(41)
  boolean firstAnimationIsAutomatic();


  /**
   * @param shapeId Mandatory java.lang.Object parameter.
   * @return  Returns a value of type ppt.Player
   */

  @DISPID(2032) //= 0x7f0. The runtime will prefer the VTID if present
  @VTID(42)
  ppt.Player player(
    @MarshalAs(NativeType.VARIANT) java.lang.Object shapeId);


  /**
   * <p>
   * Getter method for the COM property "MediaControlsVisible"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2033) //= 0x7f1. The runtime will prefer the VTID if present
  @VTID(43)
  office.MsoTriState mediaControlsVisible();


  /**
   * <p>
   * Getter method for the COM property "MediaControlsLeft"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2034) //= 0x7f2. The runtime will prefer the VTID if present
  @VTID(44)
  float mediaControlsLeft();


  /**
   * <p>
   * Getter method for the COM property "MediaControlsTop"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2035) //= 0x7f3. The runtime will prefer the VTID if present
  @VTID(45)
  float mediaControlsTop();


  /**
   * <p>
   * Getter method for the COM property "MediaControlsWidth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2036) //= 0x7f4. The runtime will prefer the VTID if present
  @VTID(46)
  float mediaControlsWidth();


  /**
   * <p>
   * Getter method for the COM property "MediaControlsHeight"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2037) //= 0x7f5. The runtime will prefer the VTID if present
  @VTID(47)
  float mediaControlsHeight();


  // Properties:
}
