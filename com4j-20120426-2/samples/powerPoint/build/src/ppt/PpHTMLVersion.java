package ppt  ;

import com4j.*;

/**
 */
public enum PpHTMLVersion implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppHTMLv3(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppHTMLv4(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppHTMLDual(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ppHTMLAutodetect(4),
  ;

  private final int value;
  PpHTMLVersion(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
