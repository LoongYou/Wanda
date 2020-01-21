package ppt  ;

import com4j.*;

/**
 */
public enum PpDirection implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  ppDirectionMixed(-2),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppDirectionLeftToRight(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppDirectionRightToLeft(2),
  ;

  private final int value;
  PpDirection(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
