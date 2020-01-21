package ppt  ;

import com4j.*;

/**
 */
public enum PpTransitionSpeed implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  ppTransitionSpeedMixed(-2),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppTransitionSpeedSlow(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppTransitionSpeedMedium(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppTransitionSpeedFast(3),
  ;

  private final int value;
  PpTransitionSpeed(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
