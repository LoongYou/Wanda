package ppt  ;

import com4j.*;

@IID("{91493471-5A91-11CF-8700-00AA0060263B}")
public interface SlideShowTransition extends Com4jObject {
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
   * Getter method for the COM property "AdvanceOnClick"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  office.MsoTriState advanceOnClick();


  /**
   * <p>
   * Setter method for the COM property "AdvanceOnClick"
   * </p>
   * @param advanceOnClick Mandatory office.MsoTriState parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(10)
  void advanceOnClick(
    office.MsoTriState advanceOnClick);


  /**
   * <p>
   * Getter method for the COM property "AdvanceOnTime"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(11)
  office.MsoTriState advanceOnTime();


  /**
   * <p>
   * Setter method for the COM property "AdvanceOnTime"
   * </p>
   * @param advanceOnTime Mandatory office.MsoTriState parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(12)
  void advanceOnTime(
    office.MsoTriState advanceOnTime);


  /**
   * <p>
   * Getter method for the COM property "AdvanceTime"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(13)
  float advanceTime();


  /**
   * <p>
   * Setter method for the COM property "AdvanceTime"
   * </p>
   * @param advanceTime Mandatory float parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(14)
  void advanceTime(
    float advanceTime);


  /**
   * <p>
   * Getter method for the COM property "EntryEffect"
   * </p>
   * @return  Returns a value of type ppt.PpEntryEffect
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(15)
  ppt.PpEntryEffect entryEffect();


  /**
   * <p>
   * Setter method for the COM property "EntryEffect"
   * </p>
   * @param entryEffect Mandatory ppt.PpEntryEffect parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(16)
  void entryEffect(
    ppt.PpEntryEffect entryEffect);


  /**
   * <p>
   * Getter method for the COM property "Hidden"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(17)
  office.MsoTriState hidden();


  /**
   * <p>
   * Setter method for the COM property "Hidden"
   * </p>
   * @param hidden Mandatory office.MsoTriState parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(18)
  void hidden(
    office.MsoTriState hidden);


  /**
   * <p>
   * Getter method for the COM property "LoopSoundUntilNext"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(19)
  office.MsoTriState loopSoundUntilNext();


  /**
   * <p>
   * Setter method for the COM property "LoopSoundUntilNext"
   * </p>
   * @param loopSoundUntilNext Mandatory office.MsoTriState parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(20)
  void loopSoundUntilNext(
    office.MsoTriState loopSoundUntilNext);


  /**
   * <p>
   * Getter method for the COM property "SoundEffect"
   * </p>
   * @return  Returns a value of type ppt.SoundEffect
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(21)
  ppt.SoundEffect soundEffect();


  /**
   * <p>
   * Getter method for the COM property "Speed"
   * </p>
   * @return  Returns a value of type ppt.PpTransitionSpeed
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(22)
  ppt.PpTransitionSpeed speed();


  /**
   * <p>
   * Setter method for the COM property "Speed"
   * </p>
   * @param speed Mandatory ppt.PpTransitionSpeed parameter.
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(23)
  void speed(
    ppt.PpTransitionSpeed speed);


  /**
   * <p>
   * Getter method for the COM property "Duration"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(24)
  float duration();


  /**
   * <p>
   * Setter method for the COM property "Duration"
   * </p>
   * @param duration Mandatory float parameter.
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(25)
  void duration(
    float duration);


  // Properties:
}
