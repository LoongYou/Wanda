package word  ;

import com4j.*;

/**
 */
public enum WdBuildingBlockTypes implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdTypeQuickParts(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdTypeCoverPage(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdTypeEquations(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdTypeFooters(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdTypeHeaders(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdTypePageNumber(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdTypeTables(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdTypeWatermarks(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdTypeAutoText(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdTypeTextBox(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdTypePageNumberTop(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  wdTypePageNumberBottom(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  wdTypePageNumberPage(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  wdTypeTableOfContents(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  wdTypeCustomQuickParts(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  wdTypeCustomCoverPage(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  wdTypeCustomEquations(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  wdTypeCustomFooters(18),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  wdTypeCustomHeaders(19),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  wdTypeCustomPageNumber(20),
  /**
   * <p>
   * The value of this constant is 21
   * </p>
   */
  wdTypeCustomTables(21),
  /**
   * <p>
   * The value of this constant is 22
   * </p>
   */
  wdTypeCustomWatermarks(22),
  /**
   * <p>
   * The value of this constant is 23
   * </p>
   */
  wdTypeCustomAutoText(23),
  /**
   * <p>
   * The value of this constant is 24
   * </p>
   */
  wdTypeCustomTextBox(24),
  /**
   * <p>
   * The value of this constant is 25
   * </p>
   */
  wdTypeCustomPageNumberTop(25),
  /**
   * <p>
   * The value of this constant is 26
   * </p>
   */
  wdTypeCustomPageNumberBottom(26),
  /**
   * <p>
   * The value of this constant is 27
   * </p>
   */
  wdTypeCustomPageNumberPage(27),
  /**
   * <p>
   * The value of this constant is 28
   * </p>
   */
  wdTypeCustomTableOfContents(28),
  /**
   * <p>
   * The value of this constant is 29
   * </p>
   */
  wdTypeCustom1(29),
  /**
   * <p>
   * The value of this constant is 30
   * </p>
   */
  wdTypeCustom2(30),
  /**
   * <p>
   * The value of this constant is 31
   * </p>
   */
  wdTypeCustom3(31),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  wdTypeCustom4(32),
  /**
   * <p>
   * The value of this constant is 33
   * </p>
   */
  wdTypeCustom5(33),
  /**
   * <p>
   * The value of this constant is 34
   * </p>
   */
  wdTypeBibliography(34),
  /**
   * <p>
   * The value of this constant is 35
   * </p>
   */
  wdTypeCustomBibliography(35),
  ;

  private final int value;
  WdBuildingBlockTypes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
