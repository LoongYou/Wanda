package ppt  ;

import com4j.*;

@IID("{914934E2-5A91-11CF-8700-00AA0060263B}")
public interface EffectInformation extends Com4jObject {
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
   * Getter method for the COM property "AfterEffect"
   * </p>
   * @return  Returns a value of type ppt.MsoAnimAfterEffect
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.MsoAnimAfterEffect afterEffect();


  /**
   * <p>
   * Getter method for the COM property "AnimateBackground"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  office.MsoTriState animateBackground();


  /**
   * <p>
   * Getter method for the COM property "AnimateTextInReverse"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  office.MsoTriState animateTextInReverse();


  /**
   * <p>
   * Getter method for the COM property "BuildByLevelEffect"
   * </p>
   * @return  Returns a value of type ppt.MsoAnimateByLevel
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(12)
  ppt.MsoAnimateByLevel buildByLevelEffect();


  /**
   * <p>
   * Getter method for the COM property "Dim"
   * </p>
   * @return  Returns a value of type ppt.ColorFormat
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(13)
  ppt.ColorFormat dim();


  /**
   * <p>
   * Getter method for the COM property "PlaySettings"
   * </p>
   * @return  Returns a value of type ppt.PlaySettings
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(14)
  ppt.PlaySettings playSettings();


  /**
   * <p>
   * Getter method for the COM property "SoundEffect"
   * </p>
   * @return  Returns a value of type ppt.SoundEffect
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(15)
  ppt.SoundEffect soundEffect();


  /**
   * <p>
   * Getter method for the COM property "TextUnitEffect"
   * </p>
   * @return  Returns a value of type ppt.MsoAnimTextUnitEffect
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(16)
  ppt.MsoAnimTextUnitEffect textUnitEffect();


  // Properties:
}
