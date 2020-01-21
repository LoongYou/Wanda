package ppt  ;

import com4j.*;

/**
 */
public enum PpSlideShowType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppShowTypeSpeaker(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppShowTypeWindow(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppShowTypeKiosk(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ppShowTypeWindow2(4),
  ;

  private final int value;
  PpSlideShowType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
