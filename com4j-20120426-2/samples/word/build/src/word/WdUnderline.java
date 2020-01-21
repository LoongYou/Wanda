package word  ;

import com4j.*;

/**
 */
public enum WdUnderline implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdUnderlineNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdUnderlineSingle(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdUnderlineWords(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdUnderlineDouble(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdUnderlineDotted(4),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdUnderlineThick(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdUnderlineDash(7),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdUnderlineDotDash(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdUnderlineDotDotDash(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdUnderlineWavy(11),
  /**
   * <p>
   * The value of this constant is 27
   * </p>
   */
  wdUnderlineWavyHeavy(27),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  wdUnderlineDottedHeavy(20),
  /**
   * <p>
   * The value of this constant is 23
   * </p>
   */
  wdUnderlineDashHeavy(23),
  /**
   * <p>
   * The value of this constant is 25
   * </p>
   */
  wdUnderlineDotDashHeavy(25),
  /**
   * <p>
   * The value of this constant is 26
   * </p>
   */
  wdUnderlineDotDotDashHeavy(26),
  /**
   * <p>
   * The value of this constant is 39
   * </p>
   */
  wdUnderlineDashLong(39),
  /**
   * <p>
   * The value of this constant is 55
   * </p>
   */
  wdUnderlineDashLongHeavy(55),
  /**
   * <p>
   * The value of this constant is 43
   * </p>
   */
  wdUnderlineWavyDouble(43),
  ;

  private final int value;
  WdUnderline(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
