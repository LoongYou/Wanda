package word  ;

import com4j.*;

/**
 */
public enum WdWrapType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdWrapSquare(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdWrapTight(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdWrapThrough(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdWrapNone(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdWrapTopBottom(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdWrapBehind(5),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdWrapFront(3),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdWrapInline(7),
  ;

  private final int value;
  WdWrapType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
