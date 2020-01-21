package ppt  ;

import com4j.*;

/**
 */
public enum PpSlideShowState implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppSlideShowRunning(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppSlideShowPaused(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppSlideShowBlackScreen(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ppSlideShowWhiteScreen(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  ppSlideShowDone(5),
  ;

  private final int value;
  PpSlideShowState(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
