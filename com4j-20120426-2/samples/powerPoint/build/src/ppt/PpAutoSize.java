package ppt  ;

import com4j.*;

/**
 */
public enum PpAutoSize implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  ppAutoSizeMixed(-2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  ppAutoSizeNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppAutoSizeShapeToFitText(1),
  ;

  private final int value;
  PpAutoSize(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
