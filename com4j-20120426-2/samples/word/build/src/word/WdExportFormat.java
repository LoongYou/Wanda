package word  ;

import com4j.*;

/**
 */
public enum WdExportFormat implements ComEnum {
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  wdExportFormatPDF(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  wdExportFormatXPS(18),
  ;

  private final int value;
  WdExportFormat(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
