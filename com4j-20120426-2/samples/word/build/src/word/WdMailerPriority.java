package word  ;

import com4j.*;

/**
 */
public enum WdMailerPriority implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdPriorityNormal(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdPriorityLow(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdPriorityHigh(3),
  ;

  private final int value;
  WdMailerPriority(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
