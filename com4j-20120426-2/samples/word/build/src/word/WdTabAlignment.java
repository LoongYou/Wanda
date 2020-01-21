package word  ;

import com4j.*;

/**
 */
public enum WdTabAlignment implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdAlignTabLeft(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdAlignTabCenter(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdAlignTabRight(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdAlignTabDecimal(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdAlignTabBar(4),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdAlignTabList(6),
  ;

  private final int value;
  WdTabAlignment(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
