package word  ;

import com4j.*;

@IID("{00020950-0000-0000-C000-000000000046}")
public interface Row extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  word.Range range();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(8)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(9)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "AllowBreakAcrossPages"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  int allowBreakAcrossPages();


  /**
   * <p>
   * Setter method for the COM property "AllowBreakAcrossPages"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  void allowBreakAcrossPages(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Alignment"
   * </p>
   * @return  Returns a value of type word.WdRowAlignment
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  word.WdRowAlignment alignment();


  /**
   * <p>
   * Setter method for the COM property "Alignment"
   * </p>
   * @param prop Mandatory word.WdRowAlignment parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  void alignment(
    word.WdRowAlignment prop);


  /**
   * <p>
   * Getter method for the COM property "HeadingFormat"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  int headingFormat();


  /**
   * <p>
   * Setter method for the COM property "HeadingFormat"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  void headingFormat(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "SpaceBetweenColumns"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  float spaceBetweenColumns();


  /**
   * <p>
   * Setter method for the COM property "SpaceBetweenColumns"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  void spaceBetweenColumns(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  float height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(20)
  void height(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "HeightRule"
   * </p>
   * @return  Returns a value of type word.WdRowHeightRule
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  word.WdRowHeightRule heightRule();


  /**
   * <p>
   * Setter method for the COM property "HeightRule"
   * </p>
   * @param prop Mandatory word.WdRowHeightRule parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(22)
  void heightRule(
    word.WdRowHeightRule prop);


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
   * @param prop Mandatory float parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(24)
  void leftIndent(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "IsLast"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(25)
  boolean isLast();


  /**
   * <p>
   * Getter method for the COM property "IsFirst"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(26)
  boolean isFirst();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(27)
  int index();


  /**
   * <p>
   * Getter method for the COM property "Cells"
   * </p>
   * @return  Returns a value of type word.Cells
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(28)
  word.Cells cells();


  @VTID(28)
  @ReturnValue(defaultPropertyThrough={word.Cells.class})
  word.Cell cells(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type word.Borders
   */

  @DISPID(1100) //= 0x44c. The runtime will prefer the VTID if present
  @VTID(29)
  word.Borders borders();


  @VTID(29)
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
  @VTID(30)
  void borders(
    word.Borders prop);


  /**
   * <p>
   * Getter method for the COM property "Shading"
   * </p>
   * @return  Returns a value of type word.Shading
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(31)
  word.Shading shading();


  /**
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type word.Row
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(32)
  word.Row next();


  /**
   * <p>
   * Getter method for the COM property "Previous"
   * </p>
   * @return  Returns a value of type word.Row
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(33)
  word.Row previous();


  /**
   */

  @DISPID(65535) //= 0xffff. The runtime will prefer the VTID if present
  @VTID(34)
  void select();


  /**
   */

  @DISPID(200) //= 0xc8. The runtime will prefer the VTID if present
  @VTID(35)
  void delete();


  /**
   * @param leftIndent Mandatory float parameter.
   * @param rulerStyle Mandatory word.WdRulerStyle parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(36)
  void setLeftIndent(
    float leftIndent,
    word.WdRulerStyle rulerStyle);


  /**
   * @param rowHeight Mandatory float parameter.
   * @param heightRule Mandatory word.WdRowHeightRule parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(37)
  void setHeight(
    float rowHeight,
    word.WdRowHeightRule heightRule);


  /**
   * @param separator Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Range
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(38)
  word.Range convertToTextOld(
    @Optional java.lang.Object separator);


  /**
   * @param separator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param nestedTables Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Range
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(39)
  word.Range convertToText(
    @Optional java.lang.Object separator,
    @Optional java.lang.Object nestedTables);


  /**
   * <p>
   * Getter method for the COM property "NestingLevel"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(40)
  int nestingLevel();


  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(41)
  java.lang.String id();


  /**
   * <p>
   * Setter method for the COM property "ID"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(42)
  void id(
    java.lang.String prop);


  // Properties:
}
