package word  ;

import com4j.*;

@IID("{B7564E97-0519-4C68-B400-3803E7C63242}")
public interface TableStyle extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "AllowPageBreaks"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  boolean allowPageBreaks();


  /**
   * <p>
   * Setter method for the COM property "AllowPageBreaks"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  void allowPageBreaks(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type word.Borders
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  word.Borders borders();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={word.Borders.class})
  word.Border borders(
    word.WdBorderType index);

  /**
   * <p>
   * Setter method for the COM property "Borders"
   * </p>
   * @param prop Mandatory word.Borders parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  void borders(
    word.Borders prop);


  /**
   * <p>
   * Getter method for the COM property "BottomPadding"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  float bottomPadding();


  /**
   * <p>
   * Setter method for the COM property "BottomPadding"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(15)
  void bottomPadding(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "LeftPadding"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  float leftPadding();


  /**
   * <p>
   * Setter method for the COM property "LeftPadding"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(17)
  void leftPadding(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "TopPadding"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  float topPadding();


  /**
   * <p>
   * Setter method for the COM property "TopPadding"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(19)
  void topPadding(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "RightPadding"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(20)
  float rightPadding();


  /**
   * <p>
   * Setter method for the COM property "RightPadding"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(21)
  void rightPadding(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Alignment"
   * </p>
   * @return  Returns a value of type word.WdRowAlignment
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(22)
  word.WdRowAlignment alignment();


  /**
   * <p>
   * Setter method for the COM property "Alignment"
   * </p>
   * @param prop Mandatory word.WdRowAlignment parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  void alignment(
    word.WdRowAlignment prop);


  /**
   * <p>
   * Getter method for the COM property "Spacing"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(24)
  float spacing();


  /**
   * <p>
   * Setter method for the COM property "Spacing"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(25)
  void spacing(
    float prop);


  /**
   * @param conditionCode Mandatory word.WdConditionCode parameter.
   * @return  Returns a value of type word.ConditionalStyle
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(26)
  word.ConditionalStyle condition(
    word.WdConditionCode conditionCode);


  /**
   * <p>
   * Getter method for the COM property "TableDirection"
   * </p>
   * @return  Returns a value of type word.WdTableDirection
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(27)
  word.WdTableDirection tableDirection();


  /**
   * <p>
   * Setter method for the COM property "TableDirection"
   * </p>
   * @param prop Mandatory word.WdTableDirection parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(28)
  void tableDirection(
    word.WdTableDirection prop);


  /**
   * <p>
   * Getter method for the COM property "AllowBreakAcrossPage"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(29)
  int allowBreakAcrossPage();


  /**
   * <p>
   * Setter method for the COM property "AllowBreakAcrossPage"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(30)
  void allowBreakAcrossPage(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "LeftIndent"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(31)
  float leftIndent();


  /**
   * <p>
   * Setter method for the COM property "LeftIndent"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(32)
  void leftIndent(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Shading"
   * </p>
   * @return  Returns a value of type word.Shading
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(33)
  word.Shading shading();


  /**
   * <p>
   * Getter method for the COM property "RowStripe"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(34)
  int rowStripe();


  /**
   * <p>
   * Setter method for the COM property "RowStripe"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(35)
  void rowStripe(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "ColumnStripe"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(36)
  int columnStripe();


  /**
   * <p>
   * Setter method for the COM property "ColumnStripe"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(37)
  void columnStripe(
    int prop);


  // Properties:
}
