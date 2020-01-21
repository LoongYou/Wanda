package word  ;

import com4j.*;

/**
 */
public enum WdWordDialogTabHID implements ComEnum {
  /**
   * <p>
   * The value of this constant is 150001
   * </p>
   */
  wdDialogFilePageSetupTabPaperSize(150001),
  /**
   * <p>
   * The value of this constant is 150002
   * </p>
   */
  wdDialogFilePageSetupTabPaperSource(150002),
  ;

  private final int value;
  WdWordDialogTabHID(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
