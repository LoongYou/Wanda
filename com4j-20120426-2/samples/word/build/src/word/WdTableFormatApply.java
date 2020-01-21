package word  ;

import com4j.*;

/**
 */
public enum WdTableFormatApply implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdTableFormatApplyBorders(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdTableFormatApplyShading(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdTableFormatApplyFont(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdTableFormatApplyColor(8),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  wdTableFormatApplyAutoFit(16),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  wdTableFormatApplyHeadingRows(32),
  /**
   * <p>
   * The value of this constant is 64
   * </p>
   */
  wdTableFormatApplyLastRow(64),
  /**
   * <p>
   * The value of this constant is 128
   * </p>
   */
  wdTableFormatApplyFirstColumn(128),
  /**
   * <p>
   * The value of this constant is 256
   * </p>
   */
  wdTableFormatApplyLastColumn(256),
  ;

  private final int value;
  WdTableFormatApply(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
