package ppt  ;

import com4j.*;

@IID("{914934DF-5A91-11CF-8700-00AA0060263B}")
public interface Effect extends Com4jObject {
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
   * Getter method for the COM property "Shape"
   * </p>
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.Shape shape();


  /**
   * <p>
   * Setter method for the COM property "Shape"
   * </p>
   * @param shape Mandatory ppt.Shape parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(10)
  void shape(
    ppt.Shape shape);


  /**
   * @param toPos Mandatory int parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(11)
  void moveTo(
    int toPos);


  /**
   * @param effect Mandatory ppt.Effect parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(12)
  void moveBefore(
    ppt.Effect effect);


  /**
   * @param effect Mandatory ppt.Effect parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(13)
  void moveAfter(
    ppt.Effect effect);


  /**
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(14)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(15)
  int index();


  /**
   * <p>
   * Getter method for the COM property "Timing"
   * </p>
   * @return  Returns a value of type ppt.Timing
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(16)
  ppt.Timing timing();


  /**
   * <p>
   * Getter method for the COM property "EffectType"
   * </p>
   * @return  Returns a value of type ppt.MsoAnimEffect
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(17)
  ppt.MsoAnimEffect effectType();


  /**
   * <p>
   * Setter method for the COM property "EffectType"
   * </p>
   * @param effectType Mandatory ppt.MsoAnimEffect parameter.
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(18)
  void effectType(
    ppt.MsoAnimEffect effectType);


  /**
   * <p>
   * Getter method for the COM property "EffectParameters"
   * </p>
   * @return  Returns a value of type ppt.EffectParameters
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(19)
  ppt.EffectParameters effectParameters();


  /**
   * <p>
   * Getter method for the COM property "TextRangeStart"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(20)
  int textRangeStart();


  /**
   * <p>
   * Getter method for the COM property "TextRangeLength"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(21)
  int textRangeLength();


  /**
   * <p>
   * Getter method for the COM property "Paragraph"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(22)
  int paragraph();


  /**
   * <p>
   * Setter method for the COM property "Paragraph"
   * </p>
   * @param paragraph Mandatory int parameter.
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(23)
  void paragraph(
    int paragraph);


  /**
   * <p>
   * Getter method for the COM property "DisplayName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(24)
  java.lang.String displayName();


  /**
   * <p>
   * Getter method for the COM property "Exit"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(25)
  office.MsoTriState exit();


  /**
   * <p>
   * Setter method for the COM property "Exit"
   * </p>
   * @param exit Mandatory office.MsoTriState parameter.
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(26)
  void exit(
    office.MsoTriState exit);


  /**
   * <p>
   * Getter method for the COM property "Behaviors"
   * </p>
   * @return  Returns a value of type ppt.AnimationBehaviors
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(27)
  ppt.AnimationBehaviors behaviors();


  @VTID(27)
  @ReturnValue(defaultPropertyThrough={ppt.AnimationBehaviors.class})
  ppt.AnimationBehavior behaviors(
    int index);

  /**
   * <p>
   * Getter method for the COM property "EffectInformation"
   * </p>
   * @return  Returns a value of type ppt.EffectInformation
   */

  @DISPID(2018) //= 0x7e2. The runtime will prefer the VTID if present
  @VTID(28)
  ppt.EffectInformation effectInformation();


  // Properties:
}
