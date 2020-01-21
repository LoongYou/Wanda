package word  ;

import com4j.*;

/**
 */
public enum WdStyleSheetPrecedence implements ComEnum {
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  wdStyleSheetPrecedenceHigher(-1),
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  wdStyleSheetPrecedenceLower(-2),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdStyleSheetPrecedenceHighest(1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdStyleSheetPrecedenceLowest(0),
  ;

  private final int value;
  WdStyleSheetPrecedence(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
