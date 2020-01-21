package ppt  ;

import com4j.*;

@IID("{91493453-5A91-11CF-8700-00AA0060263B}")
public interface SlideShowWindow extends Com4jObject {
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
   * Getter method for the COM property "View"
   * </p>
   * @return  Returns a value of type ppt.SlideShowView
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.SlideShowView view();


  /**
   * <p>
   * Getter method for the COM property "Presentation"
   * </p>
   * @return  Returns a value of type ppt._Presentation
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  ppt._Presentation presentation();


  /**
   * <p>
   * Getter method for the COM property "IsFullScreen"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  office.MsoTriState isFullScreen();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(12)
  float left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param left Mandatory float parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(13)
  void left(
    float left);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(14)
  float top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param top Mandatory float parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(15)
  void top(
    float top);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(16)
  float width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param width Mandatory float parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(17)
  void width(
    float width);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(18)
  float height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param height Mandatory float parameter.
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(19)
  void height(
    float height);


  /**
   * <p>
   * Getter method for the COM property "HWND"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(20)
  int hwnd();


  /**
   * <p>
   * Getter method for the COM property "Active"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(21)
  office.MsoTriState active();


  /**
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(22)
  void activate();


  // Properties:
}
