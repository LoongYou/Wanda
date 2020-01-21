package word  ;

import com4j.*;

/**
 */
public enum WdKeyCategory implements ComEnum {
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  wdKeyCategoryNil(-1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdKeyCategoryDisable(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdKeyCategoryCommand(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdKeyCategoryMacro(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdKeyCategoryFont(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdKeyCategoryAutoText(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdKeyCategoryStyle(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdKeyCategorySymbol(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdKeyCategoryPrefix(7),
  ;

  private final int value;
  WdKeyCategory(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
