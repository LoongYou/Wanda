package word  ;

import com4j.*;

/**
 */
public enum WdReferenceKind implements ComEnum {
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  wdContentText(-1),
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  wdNumberRelativeContext(-2),
  /**
   * <p>
   * The value of this constant is -3
   * </p>
   */
  wdNumberNoContext(-3),
  /**
   * <p>
   * The value of this constant is -4
   * </p>
   */
  wdNumberFullContext(-4),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdEntireCaption(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdOnlyLabelAndNumber(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdOnlyCaptionText(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdFootnoteNumber(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdEndnoteNumber(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdPageNumber(7),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  wdPosition(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  wdFootnoteNumberFormatted(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  wdEndnoteNumberFormatted(17),
  ;

  private final int value;
  WdReferenceKind(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
