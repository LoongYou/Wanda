package word  ;

import com4j.*;

/**
 */
public enum WdInternationalIndex implements ComEnum {
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  wdListSeparator(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  wdDecimalSeparator(18),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  wdThousandsSeparator(19),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  wdCurrencyCode(20),
  /**
   * <p>
   * The value of this constant is 21
   * </p>
   */
  wd24HourClock(21),
  /**
   * <p>
   * The value of this constant is 22
   * </p>
   */
  wdInternationalAM(22),
  /**
   * <p>
   * The value of this constant is 23
   * </p>
   */
  wdInternationalPM(23),
  /**
   * <p>
   * The value of this constant is 24
   * </p>
   */
  wdTimeSeparator(24),
  /**
   * <p>
   * The value of this constant is 25
   * </p>
   */
  wdDateSeparator(25),
  /**
   * <p>
   * The value of this constant is 26
   * </p>
   */
  wdProductLanguageID(26),
  ;

  private final int value;
  WdInternationalIndex(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
