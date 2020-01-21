package ppt  ;

import com4j.*;

/**
 */
public enum PpPublishSourceType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppPublishAll(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppPublishSlideRange(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppPublishNamedSlideShow(3),
  ;

  private final int value;
  PpPublishSourceType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
