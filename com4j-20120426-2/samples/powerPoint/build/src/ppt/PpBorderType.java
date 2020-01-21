package ppt  ;

import com4j.*;

/**
 */
public enum PpBorderType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppBorderTop(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppBorderLeft(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppBorderBottom(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ppBorderRight(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  ppBorderDiagonalDown(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  ppBorderDiagonalUp(6),
  ;

  private final int value;
  PpBorderType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
