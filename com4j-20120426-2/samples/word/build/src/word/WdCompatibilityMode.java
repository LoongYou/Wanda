package word  ;

import com4j.*;

/**
 */
public enum WdCompatibilityMode implements ComEnum {
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdWord2003(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  wdWord2007(12),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  wdWord2010(14),
  /**
   * <p>
   * The value of this constant is 65535
   * </p>
   */
  wdCurrent(65535),
  ;

  private final int value;
  WdCompatibilityMode(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
