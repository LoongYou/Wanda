package word  ;

import com4j.*;

/**
 */
public enum WdKana implements ComEnum {
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdKanaKatakana(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdKanaHiragana(9),
  ;

  private final int value;
  WdKana(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
