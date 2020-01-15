package visiotool  ;

import com4j.*;

/**
 */
public enum VisFixedFormatTypes implements ComEnum {
  /**
   * <p>
   * PDF Fixed Format
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visFixedFormatPDF(1),
  /**
   * <p>
   * XPS Fixed Format
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visFixedFormatXPS(2),
  ;

  private final int value;
  VisFixedFormatTypes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
