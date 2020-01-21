package word  ;

import com4j.*;

@IID("{0002094C-0000-0000-C000-000000000046}")
public interface Rows extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(7)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  int count();


  /**
   * <p>
   * Getter method for the COM property "AllowBreakAcrossPages"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  int allowBreakAcrossPages();


  /**
   * <p>
   * Setter method for the COM property "AllowBreakAcrossPages"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(10)
  void allowBreakAcrossPages(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Alignment"
   * </p>
   * @return  Returns a value of type word.WdRowAlignment
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(11)
  word.WdRowAlignment alignment();


  /**
   * <p>
   * Setter method for the COM property "Alignment"
   * </p>
   * @param prop Mandatory word.WdRowAlignment parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  void alignment(
    word.WdRowAlignment prop);


  /**
   * <p>
   * Getter method for the COM property "HeadingFormat"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(13)
  int headingFormat();


  /**
   * <p>
   * Setter method for the COM property "HeadingFormat"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(14)
  void headingFormat(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "SpaceBetweenColumns"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(15)
  float spaceBetweenColumns();


  /**
   * <p>
   * Setter method for the COM property "SpaceBetweenColumns"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  void spaceBetweenColumns(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(17)
  float height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(18)
  void height(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "HeightRule"
   * </p>
   * @return  Returns a value of type word.WdRowHeightRule
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(19)
  word.WdRowHeightRule heightRule();


  /**
   * <p>
   * Setter method for the COM property "HeightRule"
   * </p>
   * @param prop Mandatory word.WdRowHeightRule parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(20)
  void heightRule(
    word.WdRowHeightRule prop);


  /**
   * <p>
   * Getter method for the COM property "LeftIndent"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(21)
  float leftIndent();


  /**
   * <p>
   * Setter method for the COM property "LeftIndent"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(22)
  void leftIndent(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "First"
   * </p>
   * @return  Returns a value of type word.Row
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(23)
  word.Row first();


  /**
   * <p>
   * Getter method for the COM property "Last"
   * </p>
   * @return  Returns a value of type word.Row
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(24)
  word.Row last();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(25)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(26)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(27)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type word.Borders
   */

  @DISPID(1100) //= 0x44c. The runtime will prefer the VTID if present
  @VTID(28)
  word.Borders borders();


  @VTID(28)
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
  @VTID(29)
  void borders(
    word.Borders prop);


  /**
   * <p>
   * Getter method for the COM property "Shading"
   * </p>
   * @return  Returns a value of type word.Shading
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(30)
  word.Shading shading();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type word.Row
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(31)
  @DefaultMethod
  word.Row item(
    int index);


  /**
   * @param beforeRow Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Row
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(32)
  word.Row add(
    @Optional java.lang.Object beforeRow);


  /**
   */

  @DISPID(199) //= 0xc7. The runtime will prefer the VTID if present
  @VTID(33)
  void select();


  /**
   */

  @DISPID(200) //= 0xc8. The runtime will prefer the VTID if present
  @VTID(34)
  void delete();


  /**
   * @param leftIndent Mandatory float parameter.
   * @param rulerStyle Mandatory word.WdRulerStyle parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(35)
  void setLeftIndent(
    float leftIndent,
    word.WdRulerStyle rulerStyle);


  /**
   * @param rowHeight Mandatory float parameter.
   * @param heightRule Mandatory word.WdRowHeightRule parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(36)
  void setHeight(
    float rowHeight,
    word.WdRowHeightRule heightRule);


  /**
   * @param separator Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Range
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(37)
  word.Range convertToTextOld(
    @Optional java.lang.Object separator);


  /**
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(38)
  void distributeHeight();


  /**
   * @param separator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param nestedTables Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Range
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(39)
  word.Range convertToText(
    @Optional java.lang.Object separator,
    @Optional java.lang.Object nestedTables);


  /**
   * <p>
   * Getter method for the COM property "WrapAroundText"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(40)
  int wrapAroundText();


  /**
   * <p>
   * Setter method for the COM property "WrapAroundText"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(41)
  void wrapAroundText(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "DistanceTop"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(42)
  float distanceTop();


  /**
   * <p>
   * Setter method for the COM property "DistanceTop"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(43)
  void distanceTop(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "DistanceBottom"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(44)
  float distanceBottom();


  /**
   * <p>
   * Setter method for the COM property "DistanceBottom"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(45)
  void distanceBottom(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "DistanceLeft"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(46)
  float distanceLeft();


  /**
   * <p>
   * Setter method for the COM property "DistanceLeft"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(47)
  void distanceLeft(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "DistanceRight"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(48)
  float distanceRight();


  /**
   * <p>
   * Setter method for the COM property "DistanceRight"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(49)
  void distanceRight(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "HorizontalPosition"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(50)
  float horizontalPosition();


  /**
   * <p>
   * Setter method for the COM property "HorizontalPosition"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(51)
  void horizontalPosition(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "VerticalPosition"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(52)
  float verticalPosition();


  /**
   * <p>
   * Setter method for the COM property "VerticalPosition"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(53)
  void verticalPosition(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "RelativeHorizontalPosition"
   * </p>
   * @return  Returns a value of type word.WdRelativeHorizontalPosition
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(54)
  word.WdRelativeHorizontalPosition relativeHorizontalPosition();


  /**
   * <p>
   * Setter method for the COM property "RelativeHorizontalPosition"
   * </p>
   * @param prop Mandatory word.WdRelativeHorizontalPosition parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(55)
  void relativeHorizontalPosition(
    word.WdRelativeHorizontalPosition prop);


  /**
   * <p>
   * Getter method for the COM property "RelativeVerticalPosition"
   * </p>
   * @return  Returns a value of type word.WdRelativeVerticalPosition
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(56)
  word.WdRelativeVerticalPosition relativeVerticalPosition();


  /**
   * <p>
   * Setter method for the COM property "RelativeVerticalPosition"
   * </p>
   * @param prop Mandatory word.WdRelativeVerticalPosition parameter.
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(57)
  void relativeVerticalPosition(
    word.WdRelativeVerticalPosition prop);


  /**
   * <p>
   * Getter method for the COM property "AllowOverlap"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(58)
  int allowOverlap();


  /**
   * <p>
   * Setter method for the COM property "AllowOverlap"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(59)
  void allowOverlap(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "NestingLevel"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(60)
  int nestingLevel();


  /**
   * <p>
   * Getter method for the COM property "TableDirection"
   * </p>
   * @return  Returns a value of type word.WdTableDirection
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(61)
  word.WdTableDirection tableDirection();


  /**
   * <p>
   * Setter method for the COM property "TableDirection"
   * </p>
   * @param prop Mandatory word.WdTableDirection parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(62)
  void tableDirection(
    word.WdTableDirection prop);


  // Properties:
}
