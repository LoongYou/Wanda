package ppt  ;

import com4j.*;

/**
 */
public enum MsoClickState implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  msoClickStateAfterAllAnimations(-2),
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  msoClickStateBeforeAutomaticAnimations(-1),
  ;

  private final int value;
  MsoClickState(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
