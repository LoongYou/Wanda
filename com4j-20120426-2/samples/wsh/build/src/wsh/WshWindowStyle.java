package wsh  ;

import com4j.*;

/**
 */
public enum WshWindowStyle implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  WshHide(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  WshNormalFocus(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  WshMinimizedFocus(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  WshMaximizedFocus(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  WshNormalNoFocus(4),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  WshMinimizedNoFocus(6),
  ;

  private final int value;
  WshWindowStyle(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
