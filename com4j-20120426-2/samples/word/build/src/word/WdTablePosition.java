package word  ;

import com4j.*;

/**
 */
public enum WdTablePosition implements ComEnum {
  /**
   * <p>
   * The value of this constant is -999999
   * </p>
   */
  wdTableTop(-999999),
  /**
   * <p>
   * The value of this constant is -999998
   * </p>
   */
  wdTableLeft(-999998),
  /**
   * <p>
   * The value of this constant is -999997
   * </p>
   */
  wdTableBottom(-999997),
  /**
   * <p>
   * The value of this constant is -999996
   * </p>
   */
  wdTableRight(-999996),
  /**
   * <p>
   * The value of this constant is -999995
   * </p>
   */
  wdTableCenter(-999995),
  /**
   * <p>
   * The value of this constant is -999994
   * </p>
   */
  wdTableInside(-999994),
  /**
   * <p>
   * The value of this constant is -999993
   * </p>
   */
  wdTableOutside(-999993),
  ;

  private final int value;
  WdTablePosition(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
