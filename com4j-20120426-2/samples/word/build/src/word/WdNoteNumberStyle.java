package word  ;

import com4j.*;

/**
 */
public enum WdNoteNumberStyle implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdNoteNumberStyleArabic(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdNoteNumberStyleUppercaseRoman(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdNoteNumberStyleLowercaseRoman(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdNoteNumberStyleUppercaseLetter(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdNoteNumberStyleLowercaseLetter(4),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdNoteNumberStyleSymbol(9),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  wdNoteNumberStyleArabicFullWidth(14),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdNoteNumberStyleKanji(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdNoteNumberStyleKanjiDigit(11),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  wdNoteNumberStyleKanjiTraditional(16),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  wdNoteNumberStyleNumberInCircle(18),
  /**
   * <p>
   * The value of this constant is 41
   * </p>
   */
  wdNoteNumberStyleHanjaRead(41),
  /**
   * <p>
   * The value of this constant is 42
   * </p>
   */
  wdNoteNumberStyleHanjaReadDigit(42),
  /**
   * <p>
   * The value of this constant is 33
   * </p>
   */
  wdNoteNumberStyleTradChinNum1(33),
  /**
   * <p>
   * The value of this constant is 34
   * </p>
   */
  wdNoteNumberStyleTradChinNum2(34),
  /**
   * <p>
   * The value of this constant is 37
   * </p>
   */
  wdNoteNumberStyleSimpChinNum1(37),
  /**
   * <p>
   * The value of this constant is 38
   * </p>
   */
  wdNoteNumberStyleSimpChinNum2(38),
  /**
   * <p>
   * The value of this constant is 45
   * </p>
   */
  wdNoteNumberStyleHebrewLetter1(45),
  /**
   * <p>
   * The value of this constant is 46
   * </p>
   */
  wdNoteNumberStyleArabicLetter1(46),
  /**
   * <p>
   * The value of this constant is 47
   * </p>
   */
  wdNoteNumberStyleHebrewLetter2(47),
  /**
   * <p>
   * The value of this constant is 48
   * </p>
   */
  wdNoteNumberStyleArabicLetter2(48),
  /**
   * <p>
   * The value of this constant is 49
   * </p>
   */
  wdNoteNumberStyleHindiLetter1(49),
  /**
   * <p>
   * The value of this constant is 50
   * </p>
   */
  wdNoteNumberStyleHindiLetter2(50),
  /**
   * <p>
   * The value of this constant is 51
   * </p>
   */
  wdNoteNumberStyleHindiArabic(51),
  /**
   * <p>
   * The value of this constant is 52
   * </p>
   */
  wdNoteNumberStyleHindiCardinalText(52),
  /**
   * <p>
   * The value of this constant is 53
   * </p>
   */
  wdNoteNumberStyleThaiLetter(53),
  /**
   * <p>
   * The value of this constant is 54
   * </p>
   */
  wdNoteNumberStyleThaiArabic(54),
  /**
   * <p>
   * The value of this constant is 55
   * </p>
   */
  wdNoteNumberStyleThaiCardinalText(55),
  /**
   * <p>
   * The value of this constant is 56
   * </p>
   */
  wdNoteNumberStyleVietCardinalText(56),
  ;

  private final int value;
  WdNoteNumberStyle(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
