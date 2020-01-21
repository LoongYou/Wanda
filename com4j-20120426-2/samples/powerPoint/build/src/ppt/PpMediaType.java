package ppt  ;

import com4j.*;

/**
 */
public enum PpMediaType implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  ppMediaTypeMixed(-2),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppMediaTypeOther(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppMediaTypeSound(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppMediaTypeMovie(3),
  ;

  private final int value;
  PpMediaType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
