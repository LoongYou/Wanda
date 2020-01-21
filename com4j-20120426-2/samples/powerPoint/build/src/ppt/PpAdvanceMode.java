package ppt  ;

import com4j.*;

/**
 */
public enum PpAdvanceMode implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  ppAdvanceModeMixed(-2),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppAdvanceOnClick(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppAdvanceOnTime(2),
  ;

  private final int value;
  PpAdvanceMode(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
