package word  ;

import com4j.*;

@IID("{0002094E-0000-0000-C000-000000000046}")
public interface Cell extends Com4jObject {
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
   * Getter method for the COM property "RowIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(11)
  int rowIndex();


  /**
   * <p>
   * Getter method for the COM property "ColumnIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(12)
  int columnIndex();


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(13)
  float width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(14)
  void width(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(15)
  float height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(16)
  void height(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "HeightRule"
   * </p>
   * @return  Returns a value of type word.WdRowHeightRule
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(17)
  word.WdRowHeightRule heightRule();


  /**
   * <p>
   * Setter method for the COM property "HeightRule"
   * </p>
   * @param prop Mandatory word.WdRowHeightRule parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(18)
  void heightRule(
    word.WdRowHeightRule prop);


  /**
   * <p>
   * Getter method for the COM property "VerticalAlignment"
   * </p>
   * @return  Returns a value of type word.WdCellVerticalAlignment
   */

  @DISPID(1104) //= 0x450. The runtime will prefer the VTID if present
  @VTID(19)
  word.WdCellVerticalAlignment verticalAlignment();


  /**
   * <p>
   * Setter method for the COM property "VerticalAlignment"
   * </p>
   * @param prop Mandatory word.WdCellVerticalAlignment parameter.
   */

  @DISPID(1104) //= 0x450. The runtime will prefer the VTID if present
  @VTID(20)
  void verticalAlignment(
    word.WdCellVerticalAlignment prop);


  /**
   * <p>
   * Getter method for the COM property "Column"
   * </p>
   * @return  Returns a value of type word.Column
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(21)
  word.Column column();


  /**
   * <p>
   * Getter method for the COM property "Row"
   * </p>
   * @return  Returns a value of type word.Row
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(22)
  word.Row row();


  /**
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type word.Cell
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(23)
  word.Cell next();


  /**
   * <p>
   * Getter method for the COM property "Previous"
   * </p>
   * @return  Returns a value of type word.Cell
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(24)
  word.Cell previous();


  /**
   * <p>
   * Getter method for the COM property "Shading"
   * </p>
   * @return  Returns a value of type word.Shading
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(25)
  word.Shading shading();


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type word.Borders
   */

  @DISPID(1100) //= 0x44c. The runtime will prefer the VTID if present
  @VTID(26)
  word.Borders borders();


  @VTID(26)
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
  @VTID(27)
  void borders(
    word.Borders prop);


  /**
   */

  @DISPID(65535) //= 0xffff. The runtime will prefer the VTID if present
  @VTID(28)
  void select();


  /**
   * @param shiftCells Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(200) //= 0xc8. The runtime will prefer the VTID if present
  @VTID(29)
  void delete(
    @Optional java.lang.Object shiftCells);


  /**
   * @param formula Optional parameter. Default value is com4j.Variant.getMissing()
   * @param numFormat Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(30)
  void formula(
    @Optional java.lang.Object formula,
    @Optional java.lang.Object numFormat);


  /**
   * @param columnWidth Mandatory float parameter.
   * @param rulerStyle Mandatory word.WdRulerStyle parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(31)
  void setWidth(
    float columnWidth,
    word.WdRulerStyle rulerStyle);


  /**
   * @param rowHeight Mandatory java.lang.Object parameter.
   * @param heightRule Mandatory word.WdRowHeightRule parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(32)
  void setHeight(
    java.lang.Object rowHeight,
    word.WdRowHeightRule heightRule);


  /**
   * @param mergeTo Mandatory word.Cell parameter.
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(33)
  void merge(
    word.Cell mergeTo);


  /**
   * @param numRows Optional parameter. Default value is com4j.Variant.getMissing()
   * @param numColumns Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(34)
  void split(
    @Optional java.lang.Object numRows,
    @Optional java.lang.Object numColumns);


  /**
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(35)
  void autoSum();


  /**
   * <p>
   * Getter method for the COM property "Tables"
   * </p>
   * @return  Returns a value of type word.Tables
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(36)
  word.Tables tables();


  @VTID(36)
  @ReturnValue(defaultPropertyThrough={word.Tables.class})
  word.Table tables(
    int index);

  /**
   * <p>
   * Getter method for the COM property "NestingLevel"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(37)
  int nestingLevel();


  /**
   * <p>
   * Getter method for the COM property "WordWrap"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(38)
  boolean wordWrap();


  /**
   * <p>
   * Setter method for the COM property "WordWrap"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(39)
  void wordWrap(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PreferredWidth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(40)
  float preferredWidth();


  /**
   * <p>
   * Setter method for the COM property "PreferredWidth"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(41)
  void preferredWidth(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "FitText"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(42)
  boolean fitText();


  /**
   * <p>
   * Setter method for the COM property "FitText"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(43)
  void fitText(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "TopPadding"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(44)
  float topPadding();


  /**
   * <p>
   * Setter method for the COM property "TopPadding"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(45)
  void topPadding(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "BottomPadding"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(46)
  float bottomPadding();


  /**
   * <p>
   * Setter method for the COM property "BottomPadding"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(47)
  void bottomPadding(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "LeftPadding"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(48)
  float leftPadding();


  /**
   * <p>
   * Setter method for the COM property "LeftPadding"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(49)
  void leftPadding(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "RightPadding"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(50)
  float rightPadding();


  /**
   * <p>
   * Setter method for the COM property "RightPadding"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(51)
  void rightPadding(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(52)
  java.lang.String id();


  /**
   * <p>
   * Setter method for the COM property "ID"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(53)
  void id(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "PreferredWidthType"
   * </p>
   * @return  Returns a value of type word.WdPreferredWidthType
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(54)
  word.WdPreferredWidthType preferredWidthType();


  /**
   * <p>
   * Setter method for the COM property "PreferredWidthType"
   * </p>
   * @param prop Mandatory word.WdPreferredWidthType parameter.
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(55)
  void preferredWidthType(
    word.WdPreferredWidthType prop);


  // Properties:
}
