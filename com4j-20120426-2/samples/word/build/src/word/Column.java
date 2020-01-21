package word  ;

import com4j.*;

@IID("{0002094F-0000-0000-C000-000000000046}")
public interface Column extends Com4jObject {
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
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(10)
  float width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  void width(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "IsFirst"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  boolean isFirst();


  /**
   * <p>
   * Getter method for the COM property "IsLast"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(13)
  boolean isLast();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(14)
  int index();


  /**
   * <p>
   * Getter method for the COM property "Cells"
   * </p>
   * @return  Returns a value of type word.Cells
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(15)
  word.Cells cells();


  @VTID(15)
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
  @VTID(16)
  word.Borders borders();


  @VTID(16)
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
  @VTID(17)
  void borders(
    word.Borders prop);


  /**
   * <p>
   * Getter method for the COM property "Shading"
   * </p>
   * @return  Returns a value of type word.Shading
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(18)
  word.Shading shading();


  /**
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type word.Column
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(19)
  word.Column next();


  /**
   * <p>
   * Getter method for the COM property "Previous"
   * </p>
   * @return  Returns a value of type word.Column
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(20)
  word.Column previous();


  /**
   */

  @DISPID(65535) //= 0xffff. The runtime will prefer the VTID if present
  @VTID(21)
  void select();


  /**
   */

  @DISPID(200) //= 0xc8. The runtime will prefer the VTID if present
  @VTID(22)
  void delete();


  /**
   * @param columnWidth Mandatory float parameter.
   * @param rulerStyle Mandatory word.WdRulerStyle parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(23)
  void setWidth(
    float columnWidth,
    word.WdRulerStyle rulerStyle);


  /**
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(24)
  void autoFit();


  /**
   * @param excludeHeader Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortFieldType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortOrder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param caseSensitive Optional parameter. Default value is com4j.Variant.getMissing()
   * @param languageID Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(25)
  void sortOld(
    @Optional java.lang.Object excludeHeader,
    @Optional java.lang.Object sortFieldType,
    @Optional java.lang.Object sortOrder,
    @Optional java.lang.Object caseSensitive,
    @Optional java.lang.Object languageID);


  /**
   * @param excludeHeader Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortFieldType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortOrder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param caseSensitive Optional parameter. Default value is com4j.Variant.getMissing()
   * @param bidiSort Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreThe Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreKashida Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreDiacritics Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreHe Optional parameter. Default value is com4j.Variant.getMissing()
   * @param languageID Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(26)
  void sort(
    @Optional java.lang.Object excludeHeader,
    @Optional java.lang.Object sortFieldType,
    @Optional java.lang.Object sortOrder,
    @Optional java.lang.Object caseSensitive,
    @Optional java.lang.Object bidiSort,
    @Optional java.lang.Object ignoreThe,
    @Optional java.lang.Object ignoreKashida,
    @Optional java.lang.Object ignoreDiacritics,
    @Optional java.lang.Object ignoreHe,
    @Optional java.lang.Object languageID);


  /**
   * <p>
   * Getter method for the COM property "NestingLevel"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(27)
  int nestingLevel();


  /**
   * <p>
   * Getter method for the COM property "PreferredWidth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(28)
  float preferredWidth();


  /**
   * <p>
   * Setter method for the COM property "PreferredWidth"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(29)
  void preferredWidth(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "PreferredWidthType"
   * </p>
   * @return  Returns a value of type word.WdPreferredWidthType
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(30)
  word.WdPreferredWidthType preferredWidthType();


  /**
   * <p>
   * Setter method for the COM property "PreferredWidthType"
   * </p>
   * @param prop Mandatory word.WdPreferredWidthType parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(31)
  void preferredWidthType(
    word.WdPreferredWidthType prop);


  // Properties:
}
