package ppt  ;

import com4j.*;

@IID("{9149348B-5A91-11CF-8700-00AA0060263B}")
public interface AnimationSettings extends Com4jObject {
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
   * Getter method for the COM property "DimColor"
   * </p>
   * @return  Returns a value of type ppt.ColorFormat
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.ColorFormat dimColor();


  /**
   * <p>
   * Getter method for the COM property "SoundEffect"
   * </p>
   * @return  Returns a value of type ppt.SoundEffect
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  ppt.SoundEffect soundEffect();


  /**
   * <p>
   * Getter method for the COM property "EntryEffect"
   * </p>
   * @return  Returns a value of type ppt.PpEntryEffect
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  ppt.PpEntryEffect entryEffect();


  /**
   * <p>
   * Setter method for the COM property "EntryEffect"
   * </p>
   * @param entryEffect Mandatory ppt.PpEntryEffect parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(12)
  void entryEffect(
    ppt.PpEntryEffect entryEffect);


  /**
   * <p>
   * Getter method for the COM property "AfterEffect"
   * </p>
   * @return  Returns a value of type ppt.PpAfterEffect
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(13)
  ppt.PpAfterEffect afterEffect();


  /**
   * <p>
   * Setter method for the COM property "AfterEffect"
   * </p>
   * @param afterEffect Mandatory ppt.PpAfterEffect parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(14)
  void afterEffect(
    ppt.PpAfterEffect afterEffect);


  /**
   * <p>
   * Getter method for the COM property "AnimationOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(15)
  int animationOrder();


  /**
   * <p>
   * Setter method for the COM property "AnimationOrder"
   * </p>
   * @param animationOrder Mandatory int parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(16)
  void animationOrder(
    int animationOrder);


  /**
   * <p>
   * Getter method for the COM property "AdvanceMode"
   * </p>
   * @return  Returns a value of type ppt.PpAdvanceMode
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(17)
  ppt.PpAdvanceMode advanceMode();


  /**
   * <p>
   * Setter method for the COM property "AdvanceMode"
   * </p>
   * @param advanceMode Mandatory ppt.PpAdvanceMode parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(18)
  void advanceMode(
    ppt.PpAdvanceMode advanceMode);


  /**
   * <p>
   * Getter method for the COM property "AdvanceTime"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(19)
  float advanceTime();


  /**
   * <p>
   * Setter method for the COM property "AdvanceTime"
   * </p>
   * @param advanceTime Mandatory float parameter.
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(20)
  void advanceTime(
    float advanceTime);


  /**
   * <p>
   * Getter method for the COM property "PlaySettings"
   * </p>
   * @return  Returns a value of type ppt.PlaySettings
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(21)
  ppt.PlaySettings playSettings();


  /**
   * <p>
   * Getter method for the COM property "TextLevelEffect"
   * </p>
   * @return  Returns a value of type ppt.PpTextLevelEffect
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(22)
  ppt.PpTextLevelEffect textLevelEffect();


  /**
   * <p>
   * Setter method for the COM property "TextLevelEffect"
   * </p>
   * @param textLevelEffect Mandatory ppt.PpTextLevelEffect parameter.
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(23)
  void textLevelEffect(
    ppt.PpTextLevelEffect textLevelEffect);


  /**
   * <p>
   * Getter method for the COM property "TextUnitEffect"
   * </p>
   * @return  Returns a value of type ppt.PpTextUnitEffect
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(24)
  ppt.PpTextUnitEffect textUnitEffect();


  /**
   * <p>
   * Setter method for the COM property "TextUnitEffect"
   * </p>
   * @param textUnitEffect Mandatory ppt.PpTextUnitEffect parameter.
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(25)
  void textUnitEffect(
    ppt.PpTextUnitEffect textUnitEffect);


  /**
   * <p>
   * Getter method for the COM property "Animate"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(26)
  office.MsoTriState animate();


  /**
   * <p>
   * Setter method for the COM property "Animate"
   * </p>
   * @param animate Mandatory office.MsoTriState parameter.
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(27)
  void animate(
    office.MsoTriState animate);


  /**
   * <p>
   * Getter method for the COM property "AnimateBackground"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(28)
  office.MsoTriState animateBackground();


  /**
   * <p>
   * Setter method for the COM property "AnimateBackground"
   * </p>
   * @param animateBackground Mandatory office.MsoTriState parameter.
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(29)
  void animateBackground(
    office.MsoTriState animateBackground);


  /**
   * <p>
   * Getter method for the COM property "AnimateTextInReverse"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(30)
  office.MsoTriState animateTextInReverse();


  /**
   * <p>
   * Setter method for the COM property "AnimateTextInReverse"
   * </p>
   * @param animateTextInReverse Mandatory office.MsoTriState parameter.
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(31)
  void animateTextInReverse(
    office.MsoTriState animateTextInReverse);


  /**
   * <p>
   * Getter method for the COM property "ChartUnitEffect"
   * </p>
   * @return  Returns a value of type ppt.PpChartUnitEffect
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(32)
  ppt.PpChartUnitEffect chartUnitEffect();


  /**
   * <p>
   * Setter method for the COM property "ChartUnitEffect"
   * </p>
   * @param chartUnitEffect Mandatory ppt.PpChartUnitEffect parameter.
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(33)
  void chartUnitEffect(
    ppt.PpChartUnitEffect chartUnitEffect);


  // Properties:
}
