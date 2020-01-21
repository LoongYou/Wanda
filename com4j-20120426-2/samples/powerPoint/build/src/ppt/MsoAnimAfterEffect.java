package ppt  ;

import com4j.*;

/**
 */
public enum MsoAnimAfterEffect implements ComEnum {
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  msoAnimAfterEffectMixed(-1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  msoAnimAfterEffectNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  msoAnimAfterEffectDim(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  msoAnimAfterEffectHide(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  msoAnimAfterEffectHideOnNextClick(3),
  ;

  private final int value;
  MsoAnimAfterEffect(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
