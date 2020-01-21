package ppt  ;

import com4j.*;

@IID("{BA72E55A-4FF5-48F4-8215-5505F990966F}")
public interface ProtectedViewWindow extends Com4jObject {
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
   * Getter method for the COM property "Presentation"
   * </p>
   * @return  Returns a value of type ppt._Presentation
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt._Presentation presentation();


  /**
   * <p>
   * Getter method for the COM property "Active"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  office.MsoTriState active();


  /**
   * <p>
   * Getter method for the COM property "WindowState"
   * </p>
   * @return  Returns a value of type ppt.PpWindowState
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  ppt.PpWindowState windowState();


  /**
   * <p>
   * Setter method for the COM property "WindowState"
   * </p>
   * @param windowState Mandatory ppt.PpWindowState parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(12)
  void windowState(
    ppt.PpWindowState windowState);


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(13)
  @DefaultMethod
  java.lang.String caption();


  /**
   * <p>
   * Getter method for the COM property "SourcePath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String sourcePath();


  /**
   * <p>
   * Getter method for the COM property "SourceName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String sourceName();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(16)
  float left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param left Mandatory float parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(17)
  void left(
    float left);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(18)
  float top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param top Mandatory float parameter.
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(19)
  void top(
    float top);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(20)
  float width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param width Mandatory float parameter.
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(21)
  void width(
    float width);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(22)
  float height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param height Mandatory float parameter.
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(23)
  void height(
    float height);


  /**
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(24)
  void activate();


  /**
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(25)
  void close();


  /**
   * @param modifyPassword Optional parameter. Default value is ""
   * @return  Returns a value of type ppt._Presentation
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(26)
  ppt._Presentation edit(
    @Optional @DefaultValue("") java.lang.String modifyPassword);


  /**
   * <p>
   * Getter method for the COM property "HWND"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(27)
  int hwnd();


  // Properties:
}
