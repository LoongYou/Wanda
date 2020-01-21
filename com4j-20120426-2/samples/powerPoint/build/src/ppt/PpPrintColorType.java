package ppt  ;

import com4j.*;

/**
 */
public enum PpPrintColorType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppPrintColor(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppPrintBlackAndWhite(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppPrintPureBlackAndWhite(3),
  ;

  private final int value;
  PpPrintColorType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
