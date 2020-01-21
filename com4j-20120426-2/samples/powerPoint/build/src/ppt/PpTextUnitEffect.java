package ppt  ;

import com4j.*;

/**
 */
public enum PpTextUnitEffect implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  ppAnimateUnitMixed(-2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  ppAnimateByParagraph(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppAnimateByWord(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppAnimateByCharacter(2),
  ;

  private final int value;
  PpTextUnitEffect(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
