package ppt  ;

import com4j.*;

/**
 */
public enum PpPrintHandoutOrder implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppPrintHandoutVerticalFirst(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppPrintHandoutHorizontalFirst(2),
  ;

  private final int value;
  PpPrintHandoutOrder(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
