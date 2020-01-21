package word  ;

import com4j.*;

/**
 */
public enum WdShapePosition implements ComEnum {
  /**
   * <p>
   * The value of this constant is -999999
   * </p>
   */
  wdShapeTop(-999999),
  /**
   * <p>
   * The value of this constant is -999998
   * </p>
   */
  wdShapeLeft(-999998),
  /**
   * <p>
   * The value of this constant is -999997
   * </p>
   */
  wdShapeBottom(-999997),
  /**
   * <p>
   * The value of this constant is -999996
   * </p>
   */
  wdShapeRight(-999996),
  /**
   * <p>
   * The value of this constant is -999995
   * </p>
   */
  wdShapeCenter(-999995),
  /**
   * <p>
   * The value of this constant is -999994
   * </p>
   */
  wdShapeInside(-999994),
  /**
   * <p>
   * The value of this constant is -999993
   * </p>
   */
  wdShapeOutside(-999993),
  ;

  private final int value;
  WdShapePosition(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
