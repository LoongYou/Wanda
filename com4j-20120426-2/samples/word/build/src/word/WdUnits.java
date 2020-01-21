package word  ;

import com4j.*;

/**
 */
public enum WdUnits implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdCharacter(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdWord(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdSentence(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdParagraph(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdLine(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdStory(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdScreen(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdSection(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdColumn(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdRow(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdWindow(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  wdCell(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  wdCharacterFormatting(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  wdParagraphFormatting(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  wdTable(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  wdItem(16),
  ;

  private final int value;
  WdUnits(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
