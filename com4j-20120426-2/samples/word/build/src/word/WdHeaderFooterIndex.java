package word  ;

import com4j.*;

/**
 */
public enum WdHeaderFooterIndex implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdHeaderFooterPrimary(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdHeaderFooterFirstPage(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdHeaderFooterEvenPages(3),
  ;

  private final int value;
  WdHeaderFooterIndex(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
