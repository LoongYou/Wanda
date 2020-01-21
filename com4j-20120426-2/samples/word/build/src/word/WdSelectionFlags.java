package word  ;

import com4j.*;

/**
 */
public enum WdSelectionFlags implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdSelStartActive(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdSelAtEOL(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdSelOvertype(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdSelActive(8),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  wdSelReplace(16),
  ;

  private final int value;
  WdSelectionFlags(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
