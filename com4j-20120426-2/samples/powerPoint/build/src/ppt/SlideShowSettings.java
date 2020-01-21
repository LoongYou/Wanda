package ppt  ;

import com4j.*;

@IID("{9149345A-5A91-11CF-8700-00AA0060263B}")
public interface SlideShowSettings extends Com4jObject {
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
   * Getter method for the COM property "PointerColor"
   * </p>
   * @return  Returns a value of type ppt.ColorFormat
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.ColorFormat pointerColor();


  /**
   * <p>
   * Getter method for the COM property "NamedSlideShows"
   * </p>
   * @return  Returns a value of type ppt.NamedSlideShows
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  ppt.NamedSlideShows namedSlideShows();


  @VTID(10)
  @ReturnValue(defaultPropertyThrough={ppt.NamedSlideShows.class})
  ppt.NamedSlideShow namedSlideShows(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "StartingSlide"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  int startingSlide();


  /**
   * <p>
   * Setter method for the COM property "StartingSlide"
   * </p>
   * @param startingSlide Mandatory int parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(12)
  void startingSlide(
    int startingSlide);


  /**
   * <p>
   * Getter method for the COM property "EndingSlide"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(13)
  int endingSlide();


  /**
   * <p>
   * Setter method for the COM property "EndingSlide"
   * </p>
   * @param endingSlide Mandatory int parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(14)
  void endingSlide(
    int endingSlide);


  /**
   * <p>
   * Getter method for the COM property "AdvanceMode"
   * </p>
   * @return  Returns a value of type ppt.PpSlideShowAdvanceMode
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(15)
  ppt.PpSlideShowAdvanceMode advanceMode();


  /**
   * <p>
   * Setter method for the COM property "AdvanceMode"
   * </p>
   * @param advanceMode Mandatory ppt.PpSlideShowAdvanceMode parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(16)
  void advanceMode(
    ppt.PpSlideShowAdvanceMode advanceMode);


  /**
   * @return  Returns a value of type ppt.SlideShowWindow
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(17)
  ppt.SlideShowWindow run();


  /**
   * <p>
   * Getter method for the COM property "LoopUntilStopped"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(18)
  office.MsoTriState loopUntilStopped();


  /**
   * <p>
   * Setter method for the COM property "LoopUntilStopped"
   * </p>
   * @param loopUntilStopped Mandatory office.MsoTriState parameter.
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(19)
  void loopUntilStopped(
    office.MsoTriState loopUntilStopped);


  /**
   * <p>
   * Getter method for the COM property "ShowType"
   * </p>
   * @return  Returns a value of type ppt.PpSlideShowType
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(20)
  ppt.PpSlideShowType showType();


  /**
   * <p>
   * Setter method for the COM property "ShowType"
   * </p>
   * @param showType Mandatory ppt.PpSlideShowType parameter.
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(21)
  void showType(
    ppt.PpSlideShowType showType);


  /**
   * <p>
   * Getter method for the COM property "ShowWithNarration"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(22)
  office.MsoTriState showWithNarration();


  /**
   * <p>
   * Setter method for the COM property "ShowWithNarration"
   * </p>
   * @param showWithNarration Mandatory office.MsoTriState parameter.
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(23)
  void showWithNarration(
    office.MsoTriState showWithNarration);


  /**
   * <p>
   * Getter method for the COM property "ShowWithAnimation"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(24)
  office.MsoTriState showWithAnimation();


  /**
   * <p>
   * Setter method for the COM property "ShowWithAnimation"
   * </p>
   * @param showWithAnimation Mandatory office.MsoTriState parameter.
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(25)
  void showWithAnimation(
    office.MsoTriState showWithAnimation);


  /**
   * <p>
   * Getter method for the COM property "SlideShowName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.String slideShowName();


  /**
   * <p>
   * Setter method for the COM property "SlideShowName"
   * </p>
   * @param slideShowName Mandatory java.lang.String parameter.
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(27)
  void slideShowName(
    java.lang.String slideShowName);


  /**
   * <p>
   * Getter method for the COM property "RangeType"
   * </p>
   * @return  Returns a value of type ppt.PpSlideShowRangeType
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(28)
  ppt.PpSlideShowRangeType rangeType();


  /**
   * <p>
   * Setter method for the COM property "RangeType"
   * </p>
   * @param rangeType Mandatory ppt.PpSlideShowRangeType parameter.
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(29)
  void rangeType(
    ppt.PpSlideShowRangeType rangeType);


  /**
   * <p>
   * Getter method for the COM property "ShowScrollbar"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(30)
  office.MsoTriState showScrollbar();


  /**
   * <p>
   * Setter method for the COM property "ShowScrollbar"
   * </p>
   * @param showScrollbar Mandatory office.MsoTriState parameter.
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(31)
  void showScrollbar(
    office.MsoTriState showScrollbar);


  /**
   * <p>
   * Getter method for the COM property "ShowPresenterView"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(32)
  office.MsoTriState showPresenterView();


  /**
   * <p>
   * Setter method for the COM property "ShowPresenterView"
   * </p>
   * @param showPresenterView Mandatory office.MsoTriState parameter.
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(33)
  void showPresenterView(
    office.MsoTriState showPresenterView);


  /**
   * <p>
   * Getter method for the COM property "ShowMediaControls"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(34)
  office.MsoTriState showMediaControls();


  /**
   * <p>
   * Setter method for the COM property "ShowMediaControls"
   * </p>
   * @param showMediaControls Mandatory office.MsoTriState parameter.
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(35)
  void showMediaControls(
    office.MsoTriState showMediaControls);


  // Properties:
}
