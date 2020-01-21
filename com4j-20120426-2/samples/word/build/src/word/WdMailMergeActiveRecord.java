package word  ;

import com4j.*;

/**
 */
public enum WdMailMergeActiveRecord implements ComEnum {
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  wdNoActiveRecord(-1),
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  wdNextRecord(-2),
  /**
   * <p>
   * The value of this constant is -3
   * </p>
   */
  wdPreviousRecord(-3),
  /**
   * <p>
   * The value of this constant is -4
   * </p>
   */
  wdFirstRecord(-4),
  /**
   * <p>
   * The value of this constant is -5
   * </p>
   */
  wdLastRecord(-5),
  /**
   * <p>
   * The value of this constant is -6
   * </p>
   */
  wdFirstDataSourceRecord(-6),
  /**
   * <p>
   * The value of this constant is -7
   * </p>
   */
  wdLastDataSourceRecord(-7),
  /**
   * <p>
   * The value of this constant is -8
   * </p>
   */
  wdNextDataSourceRecord(-8),
  /**
   * <p>
   * The value of this constant is -9
   * </p>
   */
  wdPreviousDataSourceRecord(-9),
  ;

  private final int value;
  WdMailMergeActiveRecord(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
