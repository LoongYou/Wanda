package ppt  ;

import com4j.*;

/**
 */
public enum PpFrameColors implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppFrameColorsBrowserColors(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppFrameColorsPresentationSchemeTextColor(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppFrameColorsPresentationSchemeAccentColor(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ppFrameColorsWhiteTextOnBlack(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  ppFrameColorsBlackTextOnWhite(5),
  ;

  private final int value;
  PpFrameColors(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
