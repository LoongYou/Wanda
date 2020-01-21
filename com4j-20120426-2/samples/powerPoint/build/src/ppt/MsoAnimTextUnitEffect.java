package ppt  ;

import com4j.*;

/**
 */
public enum MsoAnimTextUnitEffect implements ComEnum {
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  msoAnimTextUnitEffectMixed(-1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  msoAnimTextUnitEffectByParagraph(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  msoAnimTextUnitEffectByCharacter(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  msoAnimTextUnitEffectByWord(2),
  ;

  private final int value;
  MsoAnimTextUnitEffect(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
