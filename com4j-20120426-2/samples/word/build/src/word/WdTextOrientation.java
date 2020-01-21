package word  ;

import com4j.*;

/**
 */
public enum WdTextOrientation implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdTextOrientationHorizontal(0),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdTextOrientationUpward(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdTextOrientationDownward(3),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdTextOrientationVerticalFarEast(1),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdTextOrientationHorizontalRotatedFarEast(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdTextOrientationVertical(5),
  ;

  private final int value;
  WdTextOrientation(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
