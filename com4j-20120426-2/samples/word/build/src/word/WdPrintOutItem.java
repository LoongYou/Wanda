package word  ;

import com4j.*;

/**
 */
public enum WdPrintOutItem implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdPrintDocumentContent(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdPrintProperties(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdPrintComments(2),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdPrintMarkup(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdPrintStyles(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdPrintAutoTextEntries(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdPrintKeyAssignments(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdPrintEnvelope(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdPrintDocumentWithMarkup(7),
  ;

  private final int value;
  WdPrintOutItem(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
