package word  ;

import com4j.*;

/**
 */
public enum WdBorderType implements ComEnum {
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  wdBorderTop(-1),
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  wdBorderLeft(-2),
  /**
   * <p>
   * The value of this constant is -3
   * </p>
   */
  wdBorderBottom(-3),
  /**
   * <p>
   * The value of this constant is -4
   * </p>
   */
  wdBorderRight(-4),
  /**
   * <p>
   * The value of this constant is -5
   * </p>
   */
  wdBorderHorizontal(-5),
  /**
   * <p>
   * The value of this constant is -6
   * </p>
   */
  wdBorderVertical(-6),
  /**
   * <p>
   * The value of this constant is -7
   * </p>
   */
  wdBorderDiagonalDown(-7),
  /**
   * <p>
   * The value of this constant is -8
   * </p>
   */
  wdBorderDiagonalUp(-8),
  ;

  private final int value;
  WdBorderType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
