package ppt  ;

import com4j.*;

/**
 */
public enum PpExportMode implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppRelativeToSlide(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppClipRelativeToSlide(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppScaleToFit(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ppScaleXY(4),
  ;

  private final int value;
  PpExportMode(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
