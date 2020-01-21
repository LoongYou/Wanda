package word  ;

import com4j.*;

/**
 */
public enum WdNumberType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdNumberParagraph(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdNumberListNum(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdNumberAllNumbers(3),
  ;

  private final int value;
  WdNumberType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
