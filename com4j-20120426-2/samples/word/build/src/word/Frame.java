package word  ;

import com4j.*;

@IID("{0002092A-0000-0000-C000-000000000046}")
public interface Frame extends Com4jObject {
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

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "HeightRule"
   * </p>
   * @return  Returns a value of type word.WdFrameSizeRule
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  word.WdFrameSizeRule heightRule();


  /**
   * <p>
   * Setter method for the COM property "HeightRule"
   * </p>
   * @param prop Mandatory word.WdFrameSizeRule parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  void heightRule(
    word.WdFrameSizeRule prop);


  /**
   * <p>
   * Getter method for the COM property "WidthRule"
   * </p>
   * @return  Returns a value of type word.WdFrameSizeRule
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  word.WdFrameSizeRule widthRule();


  /**
   * <p>
   * Setter method for the COM property "WidthRule"
   * </p>
   * @param prop Mandatory word.WdFrameSizeRule parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(13)
  void widthRule(
    word.WdFrameSizeRule prop);


  /**
   * <p>
   * Getter method for the COM property "HorizontalDistanceFromText"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(14)
  float horizontalDistanceFromText();


  /**
   * <p>
   * Setter method for the COM property "HorizontalDistanceFromText"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(15)
  void horizontalDistanceFromText(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(16)
  float height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(17)
  void height(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "HorizontalPosition"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(18)
  float horizontalPosition();


  /**
   * <p>
   * Setter method for the COM property "HorizontalPosition"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(19)
  void horizontalPosition(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "LockAnchor"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(20)
  boolean lockAnchor();


  /**
   * <p>
   * Setter method for the COM property "LockAnchor"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(21)
  void lockAnchor(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "RelativeHorizontalPosition"
   * </p>
   * @return  Returns a value of type word.WdRelativeHorizontalPosition
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(22)
  word.WdRelativeHorizontalPosition relativeHorizontalPosition();


  /**
   * <p>
   * Setter method for the COM property "RelativeHorizontalPosition"
   * </p>
   * @param prop Mandatory word.WdRelativeHorizontalPosition parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(23)
  void relativeHorizontalPosition(
    word.WdRelativeHorizontalPosition prop);


  /**
   * <p>
   * Getter method for the COM property "RelativeVerticalPosition"
   * </p>
   * @return  Returns a value of type word.WdRelativeVerticalPosition
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(24)
  word.WdRelativeVerticalPosition relativeVerticalPosition();


  /**
   * <p>
   * Setter method for the COM property "RelativeVerticalPosition"
   * </p>
   * @param prop Mandatory word.WdRelativeVerticalPosition parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(25)
  void relativeVerticalPosition(
    word.WdRelativeVerticalPosition prop);


  /**
   * <p>
   * Getter method for the COM property "VerticalDistanceFromText"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(26)
  float verticalDistanceFromText();


  /**
   * <p>
   * Setter method for the COM property "VerticalDistanceFromText"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(27)
  void verticalDistanceFromText(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "VerticalPosition"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(28)
  float verticalPosition();


  /**
   * <p>
   * Setter method for the COM property "VerticalPosition"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(29)
  void verticalPosition(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(30)
  float width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(31)
  void width(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "TextWrap"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(32)
  boolean textWrap();


  /**
   * <p>
   * Setter method for the COM property "TextWrap"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(33)
  void textWrap(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Shading"
   * </p>
   * @return  Returns a value of type word.Shading
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(34)
  word.Shading shading();


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type word.Borders
   */

  @DISPID(1100) //= 0x44c. The runtime will prefer the VTID if present
  @VTID(35)
  word.Borders borders();


  @VTID(35)
  @ReturnValue(defaultPropertyThrough={word.Borders.class})
  word.Border borders(
    word.WdBorderType index);

  /**
   * <p>
   * Setter method for the COM property "Borders"
   * </p>
   * @param prop Mandatory word.Borders parameter.
   */

  @DISPID(1100) //= 0x44c. The runtime will prefer the VTID if present
  @VTID(36)
  void borders(
    word.Borders prop);


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(37)
  word.Range range();


  /**
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(38)
  void delete();


  /**
   */

  @DISPID(65535) //= 0xffff. The runtime will prefer the VTID if present
  @VTID(39)
  void select();


  /**
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(40)
  void copy();


  /**
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(41)
  void cut();


  // Properties:
}
