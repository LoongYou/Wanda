package word  ;

import com4j.*;

/**
 */
public enum WdGoToDirection implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdGoToFirst(1),
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  wdGoToLast(-1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdGoToNext(2),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdGoToRelative(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdGoToPrevious(3),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdGoToAbsolute(1),
  ;

  private final int value;
  WdGoToDirection(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
