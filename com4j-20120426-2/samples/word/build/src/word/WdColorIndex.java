package word  ;

import com4j.*;

/**
 */
public enum WdColorIndex implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdAuto(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdBlack(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdBlue(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdTurquoise(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdBrightGreen(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdPink(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdRed(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdYellow(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdWhite(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdDarkBlue(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdTeal(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdGreen(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  wdViolet(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  wdDarkRed(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  wdDarkYellow(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  wdGray50(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  wdGray25(16),
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  wdByAuthor(-1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdNoHighlight(0),
  ;

  private final int value;
  WdColorIndex(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
