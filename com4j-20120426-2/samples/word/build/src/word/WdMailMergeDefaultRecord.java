package word  ;

import com4j.*;

/**
 */
public enum WdMailMergeDefaultRecord implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdDefaultFirstRecord(1),
  /**
   * <p>
   * The value of this constant is -16
   * </p>
   */
  wdDefaultLastRecord(-16),
  ;

  private final int value;
  WdMailMergeDefaultRecord(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
