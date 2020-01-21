package office  ;

import com4j.*;

@IID("{000C0399-0000-0000-C000-000000000046}")
public interface ParagraphFormat2 extends office._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Alignment"
   * </p>
   * @return  Returns a value of type office.MsoParagraphAlignment
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  office.MsoParagraphAlignment alignment();


  /**
   * <p>
   * Setter method for the COM property "Alignment"
   * </p>
   * @param alignment Mandatory office.MsoParagraphAlignment parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  void alignment(
    office.MsoParagraphAlignment alignment);


  /**
   * <p>
   * Getter method for the COM property "BaselineAlignment"
   * </p>
   * @return  Returns a value of type office.MsoBaselineAlignment
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  office.MsoBaselineAlignment baselineAlignment();


  /**
   * <p>
   * Setter method for the COM property "BaselineAlignment"
   * </p>
   * @param baselineAlignment Mandatory office.MsoBaselineAlignment parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  void baselineAlignment(
    office.MsoBaselineAlignment baselineAlignment);


  /**
   * <p>
   * Getter method for the COM property "Bullet"
   * </p>
   * @return  Returns a value of type office.BulletFormat2
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  office.BulletFormat2 bullet();


  /**
   * <p>
   * Getter method for the COM property "FarEastLineBreakLevel"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  office.MsoTriState farEastLineBreakLevel();


  /**
   * <p>
   * Setter method for the COM property "FarEastLineBreakLevel"
   * </p>
   * @param _break Mandatory office.MsoTriState parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  void farEastLineBreakLevel(
    office.MsoTriState _break);


  /**
   * <p>
   * Getter method for the COM property "FirstLineIndent"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  float firstLineIndent();


  /**
   * <p>
   * Setter method for the COM property "FirstLineIndent"
   * </p>
   * @param indent Mandatory float parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  void firstLineIndent(
    float indent);


  /**
   * <p>
   * Getter method for the COM property "HangingPunctuation"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  office.MsoTriState hangingPunctuation();


  /**
   * <p>
   * Setter method for the COM property "HangingPunctuation"
   * </p>
   * @param hanging Mandatory office.MsoTriState parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(20)
  void hangingPunctuation(
    office.MsoTriState hanging);


  /**
   * <p>
   * Getter method for the COM property "IndentLevel"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  int indentLevel();


  /**
   * <p>
   * Setter method for the COM property "IndentLevel"
   * </p>
   * @param level Mandatory int parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(22)
  void indentLevel(
    int level);


  /**
   * <p>
   * Getter method for the COM property "LeftIndent"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  float leftIndent();


  /**
   * <p>
   * Setter method for the COM property "LeftIndent"
   * </p>
   * @param indent Mandatory float parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(24)
  void leftIndent(
    float indent);


  /**
   * <p>
   * Getter method for the COM property "LineRuleAfter"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(25)
  office.MsoTriState lineRuleAfter();


  /**
   * <p>
   * Setter method for the COM property "LineRuleAfter"
   * </p>
   * @param lineRule Mandatory office.MsoTriState parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(26)
  void lineRuleAfter(
    office.MsoTriState lineRule);


  /**
   * <p>
   * Getter method for the COM property "LineRuleBefore"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(27)
  office.MsoTriState lineRuleBefore();


  /**
   * <p>
   * Setter method for the COM property "LineRuleBefore"
   * </p>
   * @param lineRule Mandatory office.MsoTriState parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(28)
  void lineRuleBefore(
    office.MsoTriState lineRule);


  /**
   * <p>
   * Getter method for the COM property "LineRuleWithin"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(29)
  office.MsoTriState lineRuleWithin();


  /**
   * <p>
   * Setter method for the COM property "LineRuleWithin"
   * </p>
   * @param lineRule Mandatory office.MsoTriState parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(30)
  void lineRuleWithin(
    office.MsoTriState lineRule);


  /**
   * <p>
   * Getter method for the COM property "RightIndent"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(31)
  float rightIndent();


  /**
   * <p>
   * Setter method for the COM property "RightIndent"
   * </p>
   * @param indent Mandatory float parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(32)
  void rightIndent(
    float indent);


  /**
   * <p>
   * Getter method for the COM property "SpaceAfter"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(33)
  float spaceAfter();


  /**
   * <p>
   * Setter method for the COM property "SpaceAfter"
   * </p>
   * @param space Mandatory float parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(34)
  void spaceAfter(
    float space);


  /**
   * <p>
   * Getter method for the COM property "SpaceBefore"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(35)
  float spaceBefore();


  /**
   * <p>
   * Setter method for the COM property "SpaceBefore"
   * </p>
   * @param space Mandatory float parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(36)
  void spaceBefore(
    float space);


  /**
   * <p>
   * Getter method for the COM property "SpaceWithin"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(37)
  float spaceWithin();


  /**
   * <p>
   * Setter method for the COM property "SpaceWithin"
   * </p>
   * @param space Mandatory float parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(38)
  void spaceWithin(
    float space);


  /**
   * <p>
   * Getter method for the COM property "TabStops"
   * </p>
   * @return  Returns a value of type office.TabStops2
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(39)
  office.TabStops2 tabStops();


  @VTID(39)
  @ReturnValue(defaultPropertyThrough={office.TabStops2.class})
  office.TabStop2 tabStops(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "TextDirection"
   * </p>
   * @return  Returns a value of type office.MsoTextDirection
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(40)
  office.MsoTextDirection textDirection();


  /**
   * <p>
   * Setter method for the COM property "TextDirection"
   * </p>
   * @param direction Mandatory office.MsoTextDirection parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(41)
  void textDirection(
    office.MsoTextDirection direction);


  /**
   * <p>
   * Getter method for the COM property "WordWrap"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(42)
  office.MsoTriState wordWrap();


  /**
   * <p>
   * Setter method for the COM property "WordWrap"
   * </p>
   * @param wordWrap Mandatory office.MsoTriState parameter.
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(43)
  void wordWrap(
    office.MsoTriState wordWrap);


  // Properties:
}
