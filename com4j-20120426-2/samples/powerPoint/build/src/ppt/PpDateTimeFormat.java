package ppt  ;

import com4j.*;

/**
 */
public enum PpDateTimeFormat implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  ppDateTimeFormatMixed(-2),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppDateTimeMdyy(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppDateTimeddddMMMMddyyyy(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppDateTimedMMMMyyyy(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ppDateTimeMMMMdyyyy(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  ppDateTimedMMMyy(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  ppDateTimeMMMMyy(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  ppDateTimeMMyy(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  ppDateTimeMMddyyHmm(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  ppDateTimeMMddyyhmmAMPM(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  ppDateTimeHmm(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  ppDateTimeHmmss(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  ppDateTimehmmAMPM(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  ppDateTimehmmssAMPM(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  ppDateTimeFigureOut(14),
  ;

  private final int value;
  PpDateTimeFormat(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
