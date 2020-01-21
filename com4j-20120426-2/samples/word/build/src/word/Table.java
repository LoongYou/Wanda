package word  ;

import com4j.*;

@IID("{00020951-0000-0000-C000-000000000046}")
public interface Table extends Com4jObject {
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
   * Getter method for the COM property "Columns"
   * </p>
   * @return  Returns a value of type word.Columns
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(11)
  word.Columns columns();


  @VTID(11)
  @ReturnValue(defaultPropertyThrough={word.Columns.class})
  word.Column columns(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Rows"
   * </p>
   * @return  Returns a value of type word.Rows
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(12)
  word.Rows rows();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={word.Rows.class})
  word.Row rows(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type word.Borders
   */

  @DISPID(1100) //= 0x44c. The runtime will prefer the VTID if present
  @VTID(13)
  word.Borders borders();


  @VTID(13)
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
  @VTID(14)
  void borders(
    word.Borders prop);


  /**
   * <p>
   * Getter method for the COM property "Shading"
   * </p>
   * @return  Returns a value of type word.Shading
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(15)
  word.Shading shading();


  /**
   * <p>
   * Getter method for the COM property "Uniform"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(16)
  boolean uniform();


  /**
   * <p>
   * Getter method for the COM property "AutoFormatType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(17)
  int autoFormatType();


  /**
   */

  @DISPID(200) //= 0xc8. The runtime will prefer the VTID if present
  @VTID(18)
  void select();


  /**
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(19)
  void delete();


  /**
   * @param excludeHeader Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fieldNumber Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortFieldType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortOrder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fieldNumber2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortFieldType2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortOrder2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fieldNumber3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortFieldType3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortOrder3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param caseSensitive Optional parameter. Default value is com4j.Variant.getMissing()
   * @param languageID Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(20)
  void sortOld(
    @Optional java.lang.Object excludeHeader,
    @Optional java.lang.Object fieldNumber,
    @Optional java.lang.Object sortFieldType,
    @Optional java.lang.Object sortOrder,
    @Optional java.lang.Object fieldNumber2,
    @Optional java.lang.Object sortFieldType2,
    @Optional java.lang.Object sortOrder2,
    @Optional java.lang.Object fieldNumber3,
    @Optional java.lang.Object sortFieldType3,
    @Optional java.lang.Object sortOrder3,
    @Optional java.lang.Object caseSensitive,
    @Optional java.lang.Object languageID);


  /**
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(21)
  void sortAscending();


  /**
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(22)
  void sortDescending();


  /**
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyBorders Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyShading Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyFont Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyColor Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyHeadingRows Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyLastRow Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyFirstColumn Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyLastColumn Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoFit Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(23)
  void autoFormat(
    @Optional java.lang.Object format,
    @Optional java.lang.Object applyBorders,
    @Optional java.lang.Object applyShading,
    @Optional java.lang.Object applyFont,
    @Optional java.lang.Object applyColor,
    @Optional java.lang.Object applyHeadingRows,
    @Optional java.lang.Object applyLastRow,
    @Optional java.lang.Object applyFirstColumn,
    @Optional java.lang.Object applyLastColumn,
    @Optional java.lang.Object autoFit);


  /**
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(24)
  void updateAutoFormat();


  /**
   * @param separator Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Range
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(25)
  word.Range convertToTextOld(
    @Optional java.lang.Object separator);


  /**
   * @param row Mandatory int parameter.
   * @param column Mandatory int parameter.
   * @return  Returns a value of type word.Cell
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(26)
  word.Cell cell(
    int row,
    int column);


  /**
   * @param beforeRow Mandatory java.lang.Object parameter.
   * @return  Returns a value of type word.Table
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(27)
  word.Table split(
    java.lang.Object beforeRow);


  /**
   * @param separator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param nestedTables Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Range
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(28)
  word.Range convertToText(
    @Optional java.lang.Object separator,
    @Optional java.lang.Object nestedTables);


  /**
   * @param behavior Mandatory word.WdAutoFitBehavior parameter.
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(29)
  void autoFitBehavior(
    word.WdAutoFitBehavior behavior);


  /**
   * @param excludeHeader Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fieldNumber Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortFieldType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortOrder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fieldNumber2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortFieldType2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortOrder2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fieldNumber3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortFieldType3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortOrder3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param caseSensitive Optional parameter. Default value is com4j.Variant.getMissing()
   * @param bidiSort Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreThe Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreKashida Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreDiacritics Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreHe Optional parameter. Default value is com4j.Variant.getMissing()
   * @param languageID Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(30)
  void sort(
    @Optional java.lang.Object excludeHeader,
    @Optional java.lang.Object fieldNumber,
    @Optional java.lang.Object sortFieldType,
    @Optional java.lang.Object sortOrder,
    @Optional java.lang.Object fieldNumber2,
    @Optional java.lang.Object sortFieldType2,
    @Optional java.lang.Object sortOrder2,
    @Optional java.lang.Object fieldNumber3,
    @Optional java.lang.Object sortFieldType3,
    @Optional java.lang.Object sortOrder3,
    @Optional java.lang.Object caseSensitive,
    @Optional java.lang.Object bidiSort,
    @Optional java.lang.Object ignoreThe,
    @Optional java.lang.Object ignoreKashida,
    @Optional java.lang.Object ignoreDiacritics,
    @Optional java.lang.Object ignoreHe,
    @Optional java.lang.Object languageID);


  /**
   * <p>
   * Getter method for the COM property "Tables"
   * </p>
   * @return  Returns a value of type word.Tables
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(31)
  word.Tables tables();


  @VTID(31)
  @ReturnValue(defaultPropertyThrough={word.Tables.class})
  word.Table tables(
    int index);

  /**
   * <p>
   * Getter method for the COM property "NestingLevel"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(32)
  int nestingLevel();


  /**
   * <p>
   * Getter method for the COM property "AllowPageBreaks"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(33)
  boolean allowPageBreaks();


  /**
   * <p>
   * Setter method for the COM property "AllowPageBreaks"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(34)
  void allowPageBreaks(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AllowAutoFit"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(35)
  boolean allowAutoFit();


  /**
   * <p>
   * Setter method for the COM property "AllowAutoFit"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(36)
  void allowAutoFit(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PreferredWidth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(37)
  float preferredWidth();


  /**
   * <p>
   * Setter method for the COM property "PreferredWidth"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(38)
  void preferredWidth(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "PreferredWidthType"
   * </p>
   * @return  Returns a value of type word.WdPreferredWidthType
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(39)
  word.WdPreferredWidthType preferredWidthType();


  /**
   * <p>
   * Setter method for the COM property "PreferredWidthType"
   * </p>
   * @param prop Mandatory word.WdPreferredWidthType parameter.
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(40)
  void preferredWidthType(
    word.WdPreferredWidthType prop);


  /**
   * <p>
   * Getter method for the COM property "TopPadding"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(41)
  float topPadding();


  /**
   * <p>
   * Setter method for the COM property "TopPadding"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(42)
  void topPadding(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "BottomPadding"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(43)
  float bottomPadding();


  /**
   * <p>
   * Setter method for the COM property "BottomPadding"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(44)
  void bottomPadding(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "LeftPadding"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(45)
  float leftPadding();


  /**
   * <p>
   * Setter method for the COM property "LeftPadding"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(46)
  void leftPadding(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "RightPadding"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(47)
  float rightPadding();


  /**
   * <p>
   * Setter method for the COM property "RightPadding"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(48)
  void rightPadding(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Spacing"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(49)
  float spacing();


  /**
   * <p>
   * Setter method for the COM property "Spacing"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(50)
  void spacing(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "TableDirection"
   * </p>
   * @return  Returns a value of type word.WdTableDirection
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(51)
  word.WdTableDirection tableDirection();


  /**
   * <p>
   * Setter method for the COM property "TableDirection"
   * </p>
   * @param prop Mandatory word.WdTableDirection parameter.
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(52)
  void tableDirection(
    word.WdTableDirection prop);


  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(53)
  java.lang.String id();


  /**
   * <p>
   * Setter method for the COM property "ID"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(54)
  void id(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(55)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object style();


  /**
   * <p>
   * Setter method for the COM property "Style"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(56)
  void style(
    java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "ApplyStyleHeadingRows"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(57)
  boolean applyStyleHeadingRows();


  /**
   * <p>
   * Setter method for the COM property "ApplyStyleHeadingRows"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(58)
  void applyStyleHeadingRows(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ApplyStyleLastRow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(59)
  boolean applyStyleLastRow();


  /**
   * <p>
   * Setter method for the COM property "ApplyStyleLastRow"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(60)
  void applyStyleLastRow(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ApplyStyleFirstColumn"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(61)
  boolean applyStyleFirstColumn();


  /**
   * <p>
   * Setter method for the COM property "ApplyStyleFirstColumn"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(62)
  void applyStyleFirstColumn(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ApplyStyleLastColumn"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(63)
  boolean applyStyleLastColumn();


  /**
   * <p>
   * Setter method for the COM property "ApplyStyleLastColumn"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(64)
  void applyStyleLastColumn(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ApplyStyleRowBands"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(65)
  boolean applyStyleRowBands();


  /**
   * <p>
   * Setter method for the COM property "ApplyStyleRowBands"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(66)
  void applyStyleRowBands(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ApplyStyleColumnBands"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(67)
  boolean applyStyleColumnBands();


  /**
   * <p>
   * Setter method for the COM property "ApplyStyleColumnBands"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(68)
  void applyStyleColumnBands(
    boolean prop);


  /**
   * @param styleName Mandatory java.lang.String parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(69)
  void applyStyleDirectFormatting(
    java.lang.String styleName);


  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(70)
  java.lang.String title();


  /**
   * <p>
   * Setter method for the COM property "Title"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(71)
  void title(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Descr"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(72)
  java.lang.String descr();


  /**
   * <p>
   * Setter method for the COM property "Descr"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(73)
  void descr(
    java.lang.String prop);


  // Properties:
}
