package word  ;

import com4j.*;

/**
 */
public enum WdCharacterCase implements ComEnum {
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  wdNextCase(-1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdLowerCase(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdUpperCase(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdTitleWord(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdTitleSentence(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdToggleCase(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdHalfWidth(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdFullWidth(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdKatakana(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdHiragana(9),
  ;

  private final int value;
  WdCharacterCase(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
