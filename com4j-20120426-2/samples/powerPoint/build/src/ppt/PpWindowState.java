package ppt  ;

import com4j.*;

/**
 */
public enum PpWindowState implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppWindowNormal(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppWindowMinimized(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppWindowMaximized(3),
  ;

  private final int value;
  PpWindowState(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
