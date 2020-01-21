package ppt  ;

import com4j.*;

/**
 */
public enum PpFixedFormatIntent implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppFixedFormatIntentScreen(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppFixedFormatIntentPrint(2),
  ;

  private final int value;
  PpFixedFormatIntent(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
