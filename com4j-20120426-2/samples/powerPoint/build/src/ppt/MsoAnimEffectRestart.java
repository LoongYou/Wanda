package ppt  ;

import com4j.*;

/**
 */
public enum MsoAnimEffectRestart implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  msoAnimEffectRestartAlways(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  msoAnimEffectRestartWhenOff(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  msoAnimEffectRestartNever(3),
  ;

  private final int value;
  MsoAnimEffectRestart(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
