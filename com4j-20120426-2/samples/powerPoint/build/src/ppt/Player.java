package ppt  ;

import com4j.*;

@IID("{BA72E552-4FF5-48F4-8215-5505F990966F}")
public interface Player extends Com4jObject {
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
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  void play();


  /**
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  void pause();


  /**
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  void stop();


  /**
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(12)
  void goToNextBookmark();


  /**
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(13)
  void goToPreviousBookmark();


  /**
   * <p>
   * Getter method for the COM property "CurrentPosition"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(14)
  int currentPosition();


  /**
   * <p>
   * Setter method for the COM property "CurrentPosition"
   * </p>
   * @param currentPosition Mandatory int parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(15)
  void currentPosition(
    int currentPosition);


  /**
   * <p>
   * Getter method for the COM property "State"
   * </p>
   * @return  Returns a value of type ppt.PpPlayerState
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(16)
  ppt.PpPlayerState state();


  // Properties:
}
