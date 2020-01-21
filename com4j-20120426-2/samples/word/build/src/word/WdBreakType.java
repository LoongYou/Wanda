package word  ;

import com4j.*;

/**
 */
public enum WdBreakType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdSectionBreakNextPage(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdSectionBreakContinuous(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdSectionBreakEvenPage(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdSectionBreakOddPage(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdLineBreak(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdPageBreak(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdColumnBreak(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdLineBreakClearLeft(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdLineBreakClearRight(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdTextWrappingBreak(11),
  ;

  private final int value;
  WdBreakType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
