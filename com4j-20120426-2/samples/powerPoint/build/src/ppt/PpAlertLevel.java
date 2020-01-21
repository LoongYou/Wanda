package ppt  ;

import com4j.*;

/**
 */
public enum PpAlertLevel implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppAlertsNone(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppAlertsAll(2),
  ;

  private final int value;
  PpAlertLevel(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
