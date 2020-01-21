package word  ;

import com4j.*;

/**
 */
public enum WdAlertLevel implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdAlertsNone(0),
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  wdAlertsMessageBox(-2),
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  wdAlertsAll(-1),
  ;

  private final int value;
  WdAlertLevel(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
