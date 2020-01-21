package word  ;

import com4j.*;

/**
 */
public enum WdCalendarTypeBi implements ComEnum {
  /**
   * <p>
   * The value of this constant is 99
   * </p>
   */
  wdCalendarTypeBidi(99),
  /**
   * <p>
   * The value of this constant is 100
   * </p>
   */
  wdCalendarTypeGregorian(100),
  ;

  private final int value;
  WdCalendarTypeBi(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
