package ppt  ;

import com4j.*;

/**
 */
public enum PpTextLevelEffect implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  ppAnimateLevelMixed(-2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  ppAnimateLevelNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppAnimateByFirstLevel(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppAnimateBySecondLevel(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppAnimateByThirdLevel(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ppAnimateByFourthLevel(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  ppAnimateByFifthLevel(5),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  ppAnimateByAllLevels(16),
  ;

  private final int value;
  PpTextLevelEffect(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
