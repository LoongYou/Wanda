package ppt  ;

import com4j.*;

/**
 */
public enum PpSlideShowAdvanceMode implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppSlideShowManualAdvance(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppSlideShowUseSlideTimings(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppSlideShowRehearseNewTimings(3),
  ;

  private final int value;
  PpSlideShowAdvanceMode(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
