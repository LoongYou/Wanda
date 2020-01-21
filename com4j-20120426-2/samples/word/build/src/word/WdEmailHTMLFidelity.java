package word  ;

import com4j.*;

/**
 */
public enum WdEmailHTMLFidelity implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdEmailHTMLFidelityLow(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdEmailHTMLFidelityMedium(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdEmailHTMLFidelityHigh(3),
  ;

  private final int value;
  WdEmailHTMLFidelity(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
