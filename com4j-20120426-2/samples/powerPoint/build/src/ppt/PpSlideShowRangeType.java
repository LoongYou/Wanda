package ppt  ;

import com4j.*;

/**
 */
public enum PpSlideShowRangeType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppShowAll(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppShowSlideRange(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppShowNamedSlideShow(3),
  ;

  private final int value;
  PpSlideShowRangeType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
