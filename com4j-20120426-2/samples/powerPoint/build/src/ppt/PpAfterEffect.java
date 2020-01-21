package ppt  ;

import com4j.*;

/**
 */
public enum PpAfterEffect implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  ppAfterEffectMixed(-2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  ppAfterEffectNothing(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppAfterEffectHide(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppAfterEffectDim(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppAfterEffectHideOnClick(3),
  ;

  private final int value;
  PpAfterEffect(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
