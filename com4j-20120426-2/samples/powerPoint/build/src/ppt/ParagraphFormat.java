package ppt  ;

import com4j.*;

@IID("{91493496-5A91-11CF-8700-00AA0060263B}")
public interface ParagraphFormat extends Com4jObject {
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
   * Getter method for the COM property "Alignment"
   * </p>
   * @return  Returns a value of type ppt.PpParagraphAlignment
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.PpParagraphAlignment alignment();


  /**
   * <p>
   * Setter method for the COM property "Alignment"
   * </p>
   * @param alignment Mandatory ppt.PpParagraphAlignment parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(10)
  void alignment(
    ppt.PpParagraphAlignment alignment);


  /**
   * <p>
   * Getter method for the COM property "Bullet"
   * </p>
   * @return  Returns a value of type ppt.BulletFormat
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(11)
  ppt.BulletFormat bullet();


  /**
   * <p>
   * Getter method for the COM property "LineRuleBefore"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(12)
  office.MsoTriState lineRuleBefore();


  /**
   * <p>
   * Setter method for the COM property "LineRuleBefore"
   * </p>
   * @param lineRuleBefore Mandatory office.MsoTriState parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(13)
  void lineRuleBefore(
    office.MsoTriState lineRuleBefore);


  /**
   * <p>
   * Getter method for the COM property "LineRuleAfter"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(14)
  office.MsoTriState lineRuleAfter();


  /**
   * <p>
   * Setter method for the COM property "LineRuleAfter"
   * </p>
   * @param lineRuleAfter Mandatory office.MsoTriState parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(15)
  void lineRuleAfter(
    office.MsoTriState lineRuleAfter);


  /**
   * <p>
   * Getter method for the COM property "LineRuleWithin"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(16)
  office.MsoTriState lineRuleWithin();


  /**
   * <p>
   * Setter method for the COM property "LineRuleWithin"
   * </p>
   * @param lineRuleWithin Mandatory office.MsoTriState parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(17)
  void lineRuleWithin(
    office.MsoTriState lineRuleWithin);


  /**
   * <p>
   * Getter method for the COM property "SpaceBefore"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(18)
  float spaceBefore();


  /**
   * <p>
   * Setter method for the COM property "SpaceBefore"
   * </p>
   * @param spaceBefore Mandatory float parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(19)
  void spaceBefore(
    float spaceBefore);


  /**
   * <p>
   * Getter method for the COM property "SpaceAfter"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(20)
  float spaceAfter();


  /**
   * <p>
   * Setter method for the COM property "SpaceAfter"
   * </p>
   * @param spaceAfter Mandatory float parameter.
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(21)
  void spaceAfter(
    float spaceAfter);


  /**
   * <p>
   * Getter method for the COM property "SpaceWithin"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(22)
  float spaceWithin();


  /**
   * <p>
   * Setter method for the COM property "SpaceWithin"
   * </p>
   * @param spaceWithin Mandatory float parameter.
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(23)
  void spaceWithin(
    float spaceWithin);


  /**
   * <p>
   * Getter method for the COM property "BaseLineAlignment"
   * </p>
   * @return  Returns a value of type ppt.PpBaselineAlignment
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(24)
  ppt.PpBaselineAlignment baseLineAlignment();


  /**
   * <p>
   * Setter method for the COM property "BaseLineAlignment"
   * </p>
   * @param baseLineAlignment Mandatory ppt.PpBaselineAlignment parameter.
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(25)
  void baseLineAlignment(
    ppt.PpBaselineAlignment baseLineAlignment);


  /**
   * <p>
   * Getter method for the COM property "FarEastLineBreakControl"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(26)
  office.MsoTriState farEastLineBreakControl();


  /**
   * <p>
   * Setter method for the COM property "FarEastLineBreakControl"
   * </p>
   * @param farEastLineBreakControl Mandatory office.MsoTriState parameter.
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(27)
  void farEastLineBreakControl(
    office.MsoTriState farEastLineBreakControl);


  /**
   * <p>
   * Getter method for the COM property "WordWrap"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(28)
  office.MsoTriState wordWrap();


  /**
   * <p>
   * Setter method for the COM property "WordWrap"
   * </p>
   * @param wordWrap Mandatory office.MsoTriState parameter.
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(29)
  void wordWrap(
    office.MsoTriState wordWrap);


  /**
   * <p>
   * Getter method for the COM property "HangingPunctuation"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(30)
  office.MsoTriState hangingPunctuation();


  /**
   * <p>
   * Setter method for the COM property "HangingPunctuation"
   * </p>
   * @param hangingPunctuation Mandatory office.MsoTriState parameter.
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(31)
  void hangingPunctuation(
    office.MsoTriState hangingPunctuation);


  /**
   * <p>
   * Getter method for the COM property "TextDirection"
   * </p>
   * @return  Returns a value of type ppt.PpDirection
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(32)
  ppt.PpDirection textDirection();


  /**
   * <p>
   * Setter method for the COM property "TextDirection"
   * </p>
   * @param textDirection Mandatory ppt.PpDirection parameter.
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(33)
  void textDirection(
    ppt.PpDirection textDirection);


  // Properties:
}
