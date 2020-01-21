package word  ;

import com4j.*;

/**
 */
public enum WdCalendarType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdCalendarWestern(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdCalendarArabic(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdCalendarHebrew(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdCalendarTaiwan(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdCalendarJapan(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdCalendarThai(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdCalendarKorean(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdCalendarSakaEra(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdCalendarTranslitEnglish(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdCalendarTranslitFrench(9),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  wdCalendarUmalqura(13),
  ;

  private final int value;
  WdCalendarType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
