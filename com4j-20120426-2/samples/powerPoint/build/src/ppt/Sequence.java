package ppt  ;

import com4j.*;

@IID("{914934DE-5A91-11CF-8700-00AA0060263B}")
public interface Sequence extends ppt.Collection {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(10)
  ppt._Application application();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ppt.Effect
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  ppt.Effect item(
    int index);


  /**
   * @param shape Mandatory ppt.Shape parameter.
   * @param effectId Mandatory ppt.MsoAnimEffect parameter.
   * @param level Optional parameter. Default value is 0
   * @param trigger Optional parameter. Default value is 1
   * @param index Optional parameter. Default value is -1
   * @return  Returns a value of type ppt.Effect
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(13)
  ppt.Effect addEffect(
    ppt.Shape shape,
    ppt.MsoAnimEffect effectId,
    @Optional @DefaultValue("0") ppt.MsoAnimateByLevel level,
    @Optional @DefaultValue("1") ppt.MsoAnimTriggerType trigger,
    @Optional @DefaultValue("-1") int index);


  /**
   * @param effect Mandatory ppt.Effect parameter.
   * @param index Optional parameter. Default value is -1
   * @return  Returns a value of type ppt.Effect
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(14)
  ppt.Effect clone(
    ppt.Effect effect,
    @Optional @DefaultValue("-1") int index);


  /**
   * @param shape Mandatory ppt.Shape parameter.
   * @return  Returns a value of type ppt.Effect
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(15)
  ppt.Effect findFirstAnimationFor(
    ppt.Shape shape);


  /**
   * @param click Mandatory int parameter.
   * @return  Returns a value of type ppt.Effect
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(16)
  ppt.Effect findFirstAnimationForClick(
    int click);


  /**
   * @param effect Mandatory ppt.Effect parameter.
   * @param level Mandatory ppt.MsoAnimateByLevel parameter.
   * @return  Returns a value of type ppt.Effect
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(17)
  ppt.Effect convertToBuildLevel(
    ppt.Effect effect,
    ppt.MsoAnimateByLevel level);


  /**
   * @param effect Mandatory ppt.Effect parameter.
   * @param after Mandatory ppt.MsoAnimAfterEffect parameter.
   * @param dimColor Optional parameter. Default value is 0
   * @param dimSchemeColor Optional parameter. Default value is 0
   * @return  Returns a value of type ppt.Effect
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(18)
  ppt.Effect convertToAfterEffect(
    ppt.Effect effect,
    ppt.MsoAnimAfterEffect after,
    @Optional @DefaultValue("0") int dimColor,
    @Optional @DefaultValue("0") ppt.PpColorSchemeIndex dimSchemeColor);


  /**
   * @param effect Mandatory ppt.Effect parameter.
   * @param animateBackground Mandatory office.MsoTriState parameter.
   * @return  Returns a value of type ppt.Effect
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(19)
  ppt.Effect convertToAnimateBackground(
    ppt.Effect effect,
    office.MsoTriState animateBackground);


  /**
   * @param effect Mandatory ppt.Effect parameter.
   * @param animateInReverse Mandatory office.MsoTriState parameter.
   * @return  Returns a value of type ppt.Effect
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(20)
  ppt.Effect convertToAnimateInReverse(
    ppt.Effect effect,
    office.MsoTriState animateInReverse);


  /**
   * @param effect Mandatory ppt.Effect parameter.
   * @param unitEffect Mandatory ppt.MsoAnimTextUnitEffect parameter.
   * @return  Returns a value of type ppt.Effect
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(21)
  ppt.Effect convertToTextUnitEffect(
    ppt.Effect effect,
    ppt.MsoAnimTextUnitEffect unitEffect);


  /**
   * @param pShape Mandatory ppt.Shape parameter.
   * @param effectId Mandatory ppt.MsoAnimEffect parameter.
   * @param trigger Mandatory ppt.MsoAnimTriggerType parameter.
   * @param pTriggerShape Mandatory ppt.Shape parameter.
   * @param bookmark Optional parameter. Default value is ""
   * @param level Optional parameter. Default value is 0
   * @return  Returns a value of type ppt.Effect
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(22)
  ppt.Effect addTriggerEffect(
    ppt.Shape pShape,
    ppt.MsoAnimEffect effectId,
    ppt.MsoAnimTriggerType trigger,
    ppt.Shape pTriggerShape,
    @Optional @DefaultValue("") java.lang.String bookmark,
    @Optional @DefaultValue("0") ppt.MsoAnimateByLevel level);


  // Properties:
}
