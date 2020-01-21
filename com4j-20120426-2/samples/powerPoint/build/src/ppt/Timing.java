package ppt  ;

import com4j.*;

@IID("{914934E0-5A91-11CF-8700-00AA0060263B}")
public interface Timing extends Com4jObject {
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
   * Getter method for the COM property "Duration"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  float duration();


  /**
   * <p>
   * Setter method for the COM property "Duration"
   * </p>
   * @param duration Mandatory float parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(10)
  void duration(
    float duration);


  /**
   * <p>
   * Getter method for the COM property "TriggerType"
   * </p>
   * @return  Returns a value of type ppt.MsoAnimTriggerType
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(11)
  ppt.MsoAnimTriggerType triggerType();


  /**
   * <p>
   * Setter method for the COM property "TriggerType"
   * </p>
   * @param triggerType Mandatory ppt.MsoAnimTriggerType parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(12)
  void triggerType(
    ppt.MsoAnimTriggerType triggerType);


  /**
   * <p>
   * Getter method for the COM property "TriggerDelayTime"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(13)
  float triggerDelayTime();


  /**
   * <p>
   * Setter method for the COM property "TriggerDelayTime"
   * </p>
   * @param triggerDelayTime Mandatory float parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(14)
  void triggerDelayTime(
    float triggerDelayTime);


  /**
   * <p>
   * Getter method for the COM property "TriggerShape"
   * </p>
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(15)
  ppt.Shape triggerShape();


  /**
   * <p>
   * Setter method for the COM property "TriggerShape"
   * </p>
   * @param triggerShape Mandatory ppt.Shape parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(16)
  void triggerShape(
    ppt.Shape triggerShape);


  /**
   * <p>
   * Getter method for the COM property "RepeatCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(17)
  int repeatCount();


  /**
   * <p>
   * Setter method for the COM property "RepeatCount"
   * </p>
   * @param repeatCount Mandatory int parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(18)
  void repeatCount(
    int repeatCount);


  /**
   * <p>
   * Getter method for the COM property "RepeatDuration"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(19)
  float repeatDuration();


  /**
   * <p>
   * Setter method for the COM property "RepeatDuration"
   * </p>
   * @param repeatDuration Mandatory float parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(20)
  void repeatDuration(
    float repeatDuration);


  /**
   * <p>
   * Getter method for the COM property "Speed"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(21)
  float speed();


  /**
   * <p>
   * Setter method for the COM property "Speed"
   * </p>
   * @param speed Mandatory float parameter.
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(22)
  void speed(
    float speed);


  /**
   * <p>
   * Getter method for the COM property "Accelerate"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(23)
  float accelerate();


  /**
   * <p>
   * Setter method for the COM property "Accelerate"
   * </p>
   * @param accelerate Mandatory float parameter.
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(24)
  void accelerate(
    float accelerate);


  /**
   * <p>
   * Getter method for the COM property "Decelerate"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(25)
  float decelerate();


  /**
   * <p>
   * Setter method for the COM property "Decelerate"
   * </p>
   * @param decelerate Mandatory float parameter.
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(26)
  void decelerate(
    float decelerate);


  /**
   * <p>
   * Getter method for the COM property "AutoReverse"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(27)
  office.MsoTriState autoReverse();


  /**
   * <p>
   * Setter method for the COM property "AutoReverse"
   * </p>
   * @param autoReverse Mandatory office.MsoTriState parameter.
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(28)
  void autoReverse(
    office.MsoTriState autoReverse);


  /**
   * <p>
   * Getter method for the COM property "SmoothStart"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(29)
  office.MsoTriState smoothStart();


  /**
   * <p>
   * Setter method for the COM property "SmoothStart"
   * </p>
   * @param smoothStart Mandatory office.MsoTriState parameter.
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(30)
  void smoothStart(
    office.MsoTriState smoothStart);


  /**
   * <p>
   * Getter method for the COM property "SmoothEnd"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(31)
  office.MsoTriState smoothEnd();


  /**
   * <p>
   * Setter method for the COM property "SmoothEnd"
   * </p>
   * @param smoothEnd Mandatory office.MsoTriState parameter.
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(32)
  void smoothEnd(
    office.MsoTriState smoothEnd);


  /**
   * <p>
   * Getter method for the COM property "RewindAtEnd"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(33)
  office.MsoTriState rewindAtEnd();


  /**
   * <p>
   * Setter method for the COM property "RewindAtEnd"
   * </p>
   * @param rewindAtEnd Mandatory office.MsoTriState parameter.
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(34)
  void rewindAtEnd(
    office.MsoTriState rewindAtEnd);


  /**
   * <p>
   * Getter method for the COM property "Restart"
   * </p>
   * @return  Returns a value of type ppt.MsoAnimEffectRestart
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(35)
  ppt.MsoAnimEffectRestart restart();


  /**
   * <p>
   * Setter method for the COM property "Restart"
   * </p>
   * @param restart Mandatory ppt.MsoAnimEffectRestart parameter.
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(36)
  void restart(
    ppt.MsoAnimEffectRestart restart);


  /**
   * <p>
   * Getter method for the COM property "BounceEnd"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(37)
  office.MsoTriState bounceEnd();


  /**
   * <p>
   * Setter method for the COM property "BounceEnd"
   * </p>
   * @param bounceEnd Mandatory office.MsoTriState parameter.
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(38)
  void bounceEnd(
    office.MsoTriState bounceEnd);


  /**
   * <p>
   * Getter method for the COM property "BounceEndIntensity"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2018) //= 0x7e2. The runtime will prefer the VTID if present
  @VTID(39)
  float bounceEndIntensity();


  /**
   * <p>
   * Setter method for the COM property "BounceEndIntensity"
   * </p>
   * @param bounceEndIntensity Mandatory float parameter.
   */

  @DISPID(2018) //= 0x7e2. The runtime will prefer the VTID if present
  @VTID(40)
  void bounceEndIntensity(
    float bounceEndIntensity);


  /**
   * <p>
   * Getter method for the COM property "TriggerBookmark"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2019) //= 0x7e3. The runtime will prefer the VTID if present
  @VTID(41)
  java.lang.String triggerBookmark();


  /**
   * <p>
   * Setter method for the COM property "TriggerBookmark"
   * </p>
   * @param triggerBookmark Mandatory java.lang.String parameter.
   */

  @DISPID(2019) //= 0x7e3. The runtime will prefer the VTID if present
  @VTID(42)
  void triggerBookmark(
    java.lang.String triggerBookmark);


  // Properties:
}
