package word  ;

import com4j.*;

/**
 */
public enum WdCaptionNumberStyle implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdCaptionNumberStyleArabic(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdCaptionNumberStyleUppercaseRoman(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdCaptionNumberStyleLowercaseRoman(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdCaptionNumberStyleUppercaseLetter(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdCaptionNumberStyleLowercaseLetter(4),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  wdCaptionNumberStyleArabicFullWidth(14),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdCaptionNumberStyleKanji(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdCaptionNumberStyleKanjiDigit(11),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  wdCaptionNumberStyleKanjiTraditional(16),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  wdCaptionNumberStyleNumberInCircle(18),
  /**
   * <p>
   * The value of this constant is 24
   * </p>
   */
  wdCaptionNumberStyleGanada(24),
  /**
   * <p>
   * The value of this constant is 25
   * </p>
   */
  wdCaptionNumberStyleChosung(25),
  /**
   * <p>
   * The value of this constant is 30
   * </p>
   */
  wdCaptionNumberStyleZodiac1(30),
  /**
   * <p>
   * The value of this constant is 31
   * </p>
   */
  wdCaptionNumberStyleZodiac2(31),
  /**
   * <p>
   * The value of this constant is 41
   * </p>
   */
  wdCaptionNumberStyleHanjaRead(41),
  /**
   * <p>
   * The value of this constant is 42
   * </p>
   */
  wdCaptionNumberStyleHanjaReadDigit(42),
  /**
   * <p>
   * The value of this constant is 34
   * </p>
   */
  wdCaptionNumberStyleTradChinNum2(34),
  /**
   * <p>
   * The value of this constant is 35
   * </p>
   */
  wdCaptionNumberStyleTradChinNum3(35),
  /**
   * <p>
   * The value of this constant is 38
   * </p>
   */
  wdCaptionNumberStyleSimpChinNum2(38),
  /**
   * <p>
   * The value of this constant is 39
   * </p>
   */
  wdCaptionNumberStyleSimpChinNum3(39),
  /**
   * <p>
   * The value of this constant is 45
   * </p>
   */
  wdCaptionNumberStyleHebrewLetter1(45),
  /**
   * <p>
   * The value of this constant is 46
   * </p>
   */
  wdCaptionNumberStyleArabicLetter1(46),
  /**
   * <p>
   * The value of this constant is 47
   * </p>
   */
  wdCaptionNumberStyleHebrewLetter2(47),
  /**
   * <p>
   * The value of this constant is 48
   * </p>
   */
  wdCaptionNumberStyleArabicLetter2(48),
  /**
   * <p>
   * The value of this constant is 49
   * </p>
   */
  wdCaptionNumberStyleHindiLetter1(49),
  /**
   * <p>
   * The value of this constant is 50
   * </p>
   */
  wdCaptionNumberStyleHindiLetter2(50),
  /**
   * <p>
   * The value of this constant is 51
   * </p>
   */
  wdCaptionNumberStyleHindiArabic(51),
  /**
   * <p>
   * The value of this constant is 52
   * </p>
   */
  wdCaptionNumberStyleHindiCardinalText(52),
  /**
   * <p>
   * The value of this constant is 53
   * </p>
   */
  wdCaptionNumberStyleThaiLetter(53),
  /**
   * <p>
   * The value of this constant is 54
   * </p>
   */
  wdCaptionNumberStyleThaiArabic(54),
  /**
   * <p>
   * The value of this constant is 55
   * </p>
   */
  wdCaptionNumberStyleThaiCardinalText(55),
  /**
   * <p>
   * The value of this constant is 56
   * </p>
   */
  wdCaptionNumberStyleVietCardinalText(56),
  ;

  private final int value;
  WdCaptionNumberStyle(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
