package ppt  ;

import com4j.*;

/**
 */
public enum PpBaselineAlignment implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  ppBaselineAlignMixed(-2),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppBaselineAlignBaseline(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppBaselineAlignTop(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppBaselineAlignCenter(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ppBaselineAlignFarEast50(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  ppBaselineAlignAuto(5),
  ;

  private final int value;
  PpBaselineAlignment(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
