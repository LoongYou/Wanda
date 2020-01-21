package ppt  ;

import com4j.*;

/**
 */
public enum MsoAnimEffectAfter implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  msoAnimEffectAfterFreeze(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  msoAnimEffectAfterRemove(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  msoAnimEffectAfterHold(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  msoAnimEffectAfterTransition(4),
  ;

  private final int value;
  MsoAnimEffectAfter(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
