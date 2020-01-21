package word  ;

import com4j.*;

/**
 */
public enum WdPageNumberStyle implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdPageNumberStyleArabic(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdPageNumberStyleUppercaseRoman(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdPageNumberStyleLowercaseRoman(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdPageNumberStyleUppercaseLetter(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdPageNumberStyleLowercaseLetter(4),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  wdPageNumberStyleArabicFullWidth(14),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdPageNumberStyleKanji(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdPageNumberStyleKanjiDigit(11),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  wdPageNumberStyleKanjiTraditional(16),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  wdPageNumberStyleNumberInCircle(18),
  /**
   * <p>
   * The value of this constant is 41
   * </p>
   */
  wdPageNumberStyleHanjaRead(41),
  /**
   * <p>
   * The value of this constant is 42
   * </p>
   */
  wdPageNumberStyleHanjaReadDigit(42),
  /**
   * <p>
   * The value of this constant is 33
   * </p>
   */
  wdPageNumberStyleTradChinNum1(33),
  /**
   * <p>
   * The value of this constant is 34
   * </p>
   */
  wdPageNumberStyleTradChinNum2(34),
  /**
   * <p>
   * The value of this constant is 37
   * </p>
   */
  wdPageNumberStyleSimpChinNum1(37),
  /**
   * <p>
   * The value of this constant is 38
   * </p>
   */
  wdPageNumberStyleSimpChinNum2(38),
  /**
   * <p>
   * The value of this constant is 45
   * </p>
   */
  wdPageNumberStyleHebrewLetter1(45),
  /**
   * <p>
   * The value of this constant is 46
   * </p>
   */
  wdPageNumberStyleArabicLetter1(46),
  /**
   * <p>
   * The value of this constant is 47
   * </p>
   */
  wdPageNumberStyleHebrewLetter2(47),
  /**
   * <p>
   * The value of this constant is 48
   * </p>
   */
  wdPageNumberStyleArabicLetter2(48),
  /**
   * <p>
   * The value of this constant is 49
   * </p>
   */
  wdPageNumberStyleHindiLetter1(49),
  /**
   * <p>
   * The value of this constant is 50
   * </p>
   */
  wdPageNumberStyleHindiLetter2(50),
  /**
   * <p>
   * The value of this constant is 51
   * </p>
   */
  wdPageNumberStyleHindiArabic(51),
  /**
   * <p>
   * The value of this constant is 52
   * </p>
   */
  wdPageNumberStyleHindiCardinalText(52),
  /**
   * <p>
   * The value of this constant is 53
   * </p>
   */
  wdPageNumberStyleThaiLetter(53),
  /**
   * <p>
   * The value of this constant is 54
   * </p>
   */
  wdPageNumberStyleThaiArabic(54),
  /**
   * <p>
   * The value of this constant is 55
   * </p>
   */
  wdPageNumberStyleThaiCardinalText(55),
  /**
   * <p>
   * The value of this constant is 56
   * </p>
   */
  wdPageNumberStyleVietCardinalText(56),
  /**
   * <p>
   * The value of this constant is 57
   * </p>
   */
  wdPageNumberStyleNumberInDash(57),
  ;

  private final int value;
  WdPageNumberStyle(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
