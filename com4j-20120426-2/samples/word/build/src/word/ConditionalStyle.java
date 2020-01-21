package word  ;

import com4j.*;

@IID("{1498F56D-ED33-41F9-B37B-EF30E50B08AC}")
public interface ConditionalStyle extends Com4jObject {
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
   * Getter method for the COM property "Shading"
   * </p>
   * @return  Returns a value of type word.Shading
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  word.Shading shading();


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type word.Borders
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  word.Borders borders();


  @VTID(11)
  @ReturnValue(defaultPropertyThrough={word.Borders.class})
  word.Border borders(
    word.WdBorderType index);

  /**
   * <p>
   * Setter method for the COM property "Borders"
   * </p>
   * @param prop Mandatory word.Borders parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  void borders(
    word.Borders prop);


  /**
   * <p>
   * Getter method for the COM property "BottomPadding"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  float bottomPadding();


  /**
   * <p>
   * Setter method for the COM property "BottomPadding"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(14)
  void bottomPadding(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "TopPadding"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(15)
  float topPadding();


  /**
   * <p>
   * Setter method for the COM property "TopPadding"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(16)
  void topPadding(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "LeftPadding"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(17)
  float leftPadding();


  /**
   * <p>
   * Setter method for the COM property "LeftPadding"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(18)
  void leftPadding(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "RightPadding"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(19)
  float rightPadding();


  /**
   * <p>
   * Setter method for the COM property "RightPadding"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(20)
  void rightPadding(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "ParagraphFormat"
   * </p>
   * @return  Returns a value of type word._ParagraphFormat
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(21)
  word._ParagraphFormat paragraphFormat();


  /**
   * <p>
   * Setter method for the COM property "ParagraphFormat"
   * </p>
   * @param prop Mandatory word._ParagraphFormat parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(22)
  void paragraphFormat(
    word._ParagraphFormat prop);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type word._Font
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(23)
  word._Font font();


  /**
   * <p>
   * Setter method for the COM property "Font"
   * </p>
   * @param prop Mandatory word._Font parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(24)
  void font(
    word._Font prop);


  // Properties:
}
