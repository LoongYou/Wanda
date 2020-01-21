package word  ;

import com4j.*;

/**
 */
public enum WdCellColor implements ComEnum {
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  wdCellColorByAuthor(-1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdCellColorNoHighlight(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdCellColorPink(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdCellColorLightBlue(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdCellColorLightYellow(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdCellColorLightPurple(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdCellColorLightOrange(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdCellColorLightGreen(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdCellColorLightGray(7),
  ;

  private final int value;
  WdCellColor(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
