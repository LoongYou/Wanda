package ppt  ;

import com4j.*;

/**
 */
public enum PpFollowColors implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  ppFollowColorsMixed(-2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  ppFollowColorsNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppFollowColorsScheme(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppFollowColorsTextAndBackground(2),
  ;

  private final int value;
  PpFollowColors(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
