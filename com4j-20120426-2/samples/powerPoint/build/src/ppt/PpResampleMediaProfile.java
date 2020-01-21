package ppt  ;

import com4j.*;

/**
 */
public enum PpResampleMediaProfile implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppResampleMediaProfileCustom(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppResampleMediaProfileSmall(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppResampleMediaProfileSmaller(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ppResampleMediaProfileSmallest(4),
  ;

  private final int value;
  PpResampleMediaProfile(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
