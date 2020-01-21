package word  ;

import com4j.*;

/**
 */
public enum WdGoToItem implements ComEnum {
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  wdGoToBookmark(-1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdGoToSection(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdGoToPage(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdGoToTable(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdGoToLine(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdGoToFootnote(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdGoToEndnote(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdGoToComment(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdGoToField(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdGoToGraphic(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdGoToObject(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdGoToEquation(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdGoToHeading(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  wdGoToPercent(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  wdGoToSpellingError(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  wdGoToGrammaticalError(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  wdGoToProofreadingError(15),
  ;

  private final int value;
  WdGoToItem(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
