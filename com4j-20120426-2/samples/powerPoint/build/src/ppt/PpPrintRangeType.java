package ppt  ;

import com4j.*;

/**
 */
public enum PpPrintRangeType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppPrintAll(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppPrintSelection(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppPrintCurrent(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ppPrintSlideRange(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  ppPrintNamedSlideShow(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  ppPrintSection(6),
  ;

  private final int value;
  PpPrintRangeType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
