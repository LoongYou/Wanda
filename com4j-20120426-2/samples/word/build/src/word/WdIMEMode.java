package word  ;

import com4j.*;

/**
 */
public enum WdIMEMode implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdIMEModeNoControl(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdIMEModeOn(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdIMEModeOff(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdIMEModeHiragana(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdIMEModeKatakana(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdIMEModeKatakanaHalf(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdIMEModeAlphaFull(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdIMEModeAlpha(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdIMEModeHangulFull(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdIMEModeHangul(10),
  ;

  private final int value;
  WdIMEMode(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
