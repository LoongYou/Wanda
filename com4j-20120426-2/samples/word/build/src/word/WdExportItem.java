package word  ;

import com4j.*;

/**
 */
public enum WdExportItem implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdExportDocumentContent(0),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdExportDocumentWithMarkup(7),
  ;

  private final int value;
  WdExportItem(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
