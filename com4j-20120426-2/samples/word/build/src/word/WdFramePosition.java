package word  ;

import com4j.*;

/**
 */
public enum WdFramePosition implements ComEnum {
  /**
   * <p>
   * The value of this constant is -999999
   * </p>
   */
  wdFrameTop(-999999),
  /**
   * <p>
   * The value of this constant is -999998
   * </p>
   */
  wdFrameLeft(-999998),
  /**
   * <p>
   * The value of this constant is -999997
   * </p>
   */
  wdFrameBottom(-999997),
  /**
   * <p>
   * The value of this constant is -999996
   * </p>
   */
  wdFrameRight(-999996),
  /**
   * <p>
   * The value of this constant is -999995
   * </p>
   */
  wdFrameCenter(-999995),
  /**
   * <p>
   * The value of this constant is -999994
   * </p>
   */
  wdFrameInside(-999994),
  /**
   * <p>
   * The value of this constant is -999993
   * </p>
   */
  wdFrameOutside(-999993),
  ;

  private final int value;
  WdFramePosition(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
