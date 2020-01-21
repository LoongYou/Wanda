package word  ;

import com4j.*;

/**
 */
public enum WdRecoveryType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdPasteDefault(0),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdSingleCellText(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdSingleCellTable(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdListContinueNumbering(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdListRestartNumbering(8),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdTableInsertAsRows(11),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdTableAppendTable(10),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  wdTableOriginalFormatting(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  wdChartPicture(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  wdChart(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  wdChartLinked(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  wdFormatOriginalFormatting(16),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  wdFormatSurroundingFormattingWithEmphasis(20),
  /**
   * <p>
   * The value of this constant is 22
   * </p>
   */
  wdFormatPlainText(22),
  /**
   * <p>
   * The value of this constant is 23
   * </p>
   */
  wdTableOverwriteCells(23),
  /**
   * <p>
   * The value of this constant is 24
   * </p>
   */
  wdListCombineWithExistingList(24),
  /**
   * <p>
   * The value of this constant is 25
   * </p>
   */
  wdListDontMerge(25),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  wdUseDestinationStylesRecovery(19),
  ;

  private final int value;
  WdRecoveryType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
