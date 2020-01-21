package word  ;

import com4j.*;

@IID("{0002094A-0000-0000-C000-000000000046}")
public interface Cells extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(9)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(10)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  float width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(13)
  void width(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(14)
  float height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(15)
  void height(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "HeightRule"
   * </p>
   * @return  Returns a value of type word.WdRowHeightRule
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(16)
  word.WdRowHeightRule heightRule();


  /**
   * <p>
   * Setter method for the COM property "HeightRule"
   * </p>
   * @param prop Mandatory word.WdRowHeightRule parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(17)
  void heightRule(
    word.WdRowHeightRule prop);


  /**
   * <p>
   * Getter method for the COM property "VerticalAlignment"
   * </p>
   * @return  Returns a value of type word.WdCellVerticalAlignment
   */

  @DISPID(1104) //= 0x450. The runtime will prefer the VTID if present
  @VTID(18)
  word.WdCellVerticalAlignment verticalAlignment();


  /**
   * <p>
   * Setter method for the COM property "VerticalAlignment"
   * </p>
   * @param prop Mandatory word.WdCellVerticalAlignment parameter.
   */

  @DISPID(1104) //= 0x450. The runtime will prefer the VTID if present
  @VTID(19)
  void verticalAlignment(
    word.WdCellVerticalAlignment prop);


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type word.Borders
   */

  @DISPID(1100) //= 0x44c. The runtime will prefer the VTID if present
  @VTID(20)
  word.Borders borders();


  @VTID(20)
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
  @VTID(21)
  void borders(
    word.Borders prop);


  /**
   * <p>
   * Getter method for the COM property "Shading"
   * </p>
   * @return  Returns a value of type word.Shading
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(22)
  word.Shading shading();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type word.Cell
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(23)
  @DefaultMethod
  word.Cell item(
    int index);


  /**
   * @param beforeCell Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Cell
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(24)
  word.Cell add(
    @Optional java.lang.Object beforeCell);


  /**
   * @param shiftCells Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(200) //= 0xc8. The runtime will prefer the VTID if present
  @VTID(25)
  void delete(
    @Optional java.lang.Object shiftCells);


  /**
   * @param columnWidth Mandatory float parameter.
   * @param rulerStyle Mandatory word.WdRulerStyle parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(26)
  void setWidth(
    float columnWidth,
    word.WdRulerStyle rulerStyle);


  /**
   * @param rowHeight Mandatory java.lang.Object parameter.
   * @param heightRule Mandatory word.WdRowHeightRule parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(27)
  void setHeight(
    java.lang.Object rowHeight,
    word.WdRowHeightRule heightRule);


  /**
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(28)
  void merge();


  /**
   * @param numRows Optional parameter. Default value is com4j.Variant.getMissing()
   * @param numColumns Optional parameter. Default value is com4j.Variant.getMissing()
   * @param mergeBeforeSplit Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(29)
  void split(
    @Optional java.lang.Object numRows,
    @Optional java.lang.Object numColumns,
    @Optional java.lang.Object mergeBeforeSplit);


  /**
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(30)
  void distributeHeight();


  /**
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(31)
  void distributeWidth();


  /**
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(32)
  void autoFit();


  /**
   * <p>
   * Getter method for the COM property "NestingLevel"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(33)
  int nestingLevel();


  /**
   * <p>
   * Getter method for the COM property "PreferredWidth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(34)
  float preferredWidth();


  /**
   * <p>
   * Setter method for the COM property "PreferredWidth"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(35)
  void preferredWidth(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "PreferredWidthType"
   * </p>
   * @return  Returns a value of type word.WdPreferredWidthType
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(36)
  word.WdPreferredWidthType preferredWidthType();


  /**
   * <p>
   * Setter method for the COM property "PreferredWidthType"
   * </p>
   * @param prop Mandatory word.WdPreferredWidthType parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(37)
  void preferredWidthType(
    word.WdPreferredWidthType prop);


  // Properties:
}
