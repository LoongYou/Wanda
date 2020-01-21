package ppt  ;

import com4j.*;

/**
 */
public enum PpSoundEffectType implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  ppSoundEffectsMixed(-2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  ppSoundNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppSoundStopPrevious(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppSoundFile(2),
  ;

  private final int value;
  PpSoundEffectType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
