package word  ;

import com4j.*;

/**
 */
public enum WdViewType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdNormalView(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdOutlineView(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdPrintView(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdPrintPreview(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdMasterView(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdWebView(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdReadingView(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdConflictView(8),
  ;

  private final int value;
  WdViewType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
