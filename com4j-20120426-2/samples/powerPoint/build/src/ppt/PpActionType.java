package ppt  ;

import com4j.*;

/**
 */
public enum PpActionType implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  ppActionMixed(-2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  ppActionNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppActionNextSlide(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppActionPreviousSlide(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppActionFirstSlide(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ppActionLastSlide(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  ppActionLastSlideViewed(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  ppActionEndShow(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  ppActionHyperlink(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  ppActionRunMacro(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  ppActionRunProgram(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  ppActionNamedSlideShow(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  ppActionOLEVerb(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  ppActionPlay(12),
  ;

  private final int value;
  PpActionType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
