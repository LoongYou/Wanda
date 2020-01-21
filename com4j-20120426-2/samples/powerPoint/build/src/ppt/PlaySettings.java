package ppt  ;

import com4j.*;

@IID("{9149348E-5A91-11CF-8700-00AA0060263B}")
public interface PlaySettings extends Com4jObject {
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
   * Getter method for the COM property "ActionVerb"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String actionVerb();


  /**
   * <p>
   * Setter method for the COM property "ActionVerb"
   * </p>
   * @param actionVerb Mandatory java.lang.String parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(10)
  void actionVerb(
    java.lang.String actionVerb);


  /**
   * <p>
   * Getter method for the COM property "HideWhileNotPlaying"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(11)
  office.MsoTriState hideWhileNotPlaying();


  /**
   * <p>
   * Setter method for the COM property "HideWhileNotPlaying"
   * </p>
   * @param hideWhileNotPlaying Mandatory office.MsoTriState parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(12)
  void hideWhileNotPlaying(
    office.MsoTriState hideWhileNotPlaying);


  /**
   * <p>
   * Getter method for the COM property "LoopUntilStopped"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(13)
  office.MsoTriState loopUntilStopped();


  /**
   * <p>
   * Setter method for the COM property "LoopUntilStopped"
   * </p>
   * @param loopUntilStopped Mandatory office.MsoTriState parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(14)
  void loopUntilStopped(
    office.MsoTriState loopUntilStopped);


  /**
   * <p>
   * Getter method for the COM property "PlayOnEntry"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(15)
  office.MsoTriState playOnEntry();


  /**
   * <p>
   * Setter method for the COM property "PlayOnEntry"
   * </p>
   * @param playOnEntry Mandatory office.MsoTriState parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(16)
  void playOnEntry(
    office.MsoTriState playOnEntry);


  /**
   * <p>
   * Getter method for the COM property "RewindMovie"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(17)
  office.MsoTriState rewindMovie();


  /**
   * <p>
   * Setter method for the COM property "RewindMovie"
   * </p>
   * @param rewindMovie Mandatory office.MsoTriState parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(18)
  void rewindMovie(
    office.MsoTriState rewindMovie);


  /**
   * <p>
   * Getter method for the COM property "PauseAnimation"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(19)
  office.MsoTriState pauseAnimation();


  /**
   * <p>
   * Setter method for the COM property "PauseAnimation"
   * </p>
   * @param pauseAnimation Mandatory office.MsoTriState parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(20)
  void pauseAnimation(
    office.MsoTriState pauseAnimation);


  /**
   * <p>
   * Getter method for the COM property "StopAfterSlides"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(21)
  int stopAfterSlides();


  /**
   * <p>
   * Setter method for the COM property "StopAfterSlides"
   * </p>
   * @param stopAfterSlides Mandatory int parameter.
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(22)
  void stopAfterSlides(
    int stopAfterSlides);


  // Properties:
}
