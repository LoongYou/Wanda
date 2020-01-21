package word  ;

import com4j.*;

/**
 */
public enum WdSummaryLength implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  wd10Sentences(-2),
  /**
   * <p>
   * The value of this constant is -3
   * </p>
   */
  wd20Sentences(-3),
  /**
   * <p>
   * The value of this constant is -4
   * </p>
   */
  wd100Words(-4),
  /**
   * <p>
   * The value of this constant is -5
   * </p>
   */
  wd500Words(-5),
  /**
   * <p>
   * The value of this constant is -6
   * </p>
   */
  wd10Percent(-6),
  /**
   * <p>
   * The value of this constant is -7
   * </p>
   */
  wd25Percent(-7),
  /**
   * <p>
   * The value of this constant is -8
   * </p>
   */
  wd50Percent(-8),
  /**
   * <p>
   * The value of this constant is -9
   * </p>
   */
  wd75Percent(-9),
  ;

  private final int value;
  WdSummaryLength(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
