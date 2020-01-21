package word  ;

import com4j.*;

/**
 */
public enum WdFindMatch implements ComEnum {
  /**
   * <p>
   * The value of this constant is 65551
   * </p>
   */
  wdMatchParagraphMark(65551),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdMatchTabCharacter(9),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdMatchCommentMark(5),
  /**
   * <p>
   * The value of this constant is 65599
   * </p>
   */
  wdMatchAnyCharacter(65599),
  /**
   * <p>
   * The value of this constant is 65567
   * </p>
   */
  wdMatchAnyDigit(65567),
  /**
   * <p>
   * The value of this constant is 65583
   * </p>
   */
  wdMatchAnyLetter(65583),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdMatchCaretCharacter(11),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  wdMatchColumnBreak(14),
  /**
   * <p>
   * The value of this constant is 8212
   * </p>
   */
  wdMatchEmDash(8212),
  /**
   * <p>
   * The value of this constant is 8211
   * </p>
   */
  wdMatchEnDash(8211),
  /**
   * <p>
   * The value of this constant is 65555
   * </p>
   */
  wdMatchEndnoteMark(65555),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  wdMatchField(19),
  /**
   * <p>
   * The value of this constant is 65554
   * </p>
   */
  wdMatchFootnoteMark(65554),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdMatchGraphic(1),
  /**
   * <p>
   * The value of this constant is 65551
   * </p>
   */
  wdMatchManualLineBreak(65551),
  /**
   * <p>
   * The value of this constant is 65564
   * </p>
   */
  wdMatchManualPageBreak(65564),
  /**
   * <p>
   * The value of this constant is 30
   * </p>
   */
  wdMatchNonbreakingHyphen(30),
  /**
   * <p>
   * The value of this constant is 160
   * </p>
   */
  wdMatchNonbreakingSpace(160),
  /**
   * <p>
   * The value of this constant is 31
   * </p>
   */
  wdMatchOptionalHyphen(31),
  /**
   * <p>
   * The value of this constant is 65580
   * </p>
   */
  wdMatchSectionBreak(65580),
  /**
   * <p>
   * The value of this constant is 65655
   * </p>
   */
  wdMatchWhiteSpace(65655),
  ;

  private final int value;
  WdFindMatch(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
