package ppt  ;

import com4j.*;

/**
 */
public enum PpFixedFormatType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppFixedFormatTypeXPS(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppFixedFormatTypePDF(2),
  ;

  private final int value;
  PpFixedFormatType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
