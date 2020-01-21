package ppt  ;

import com4j.*;

/**
 */
public enum PpNumberedBulletStyle implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  ppBulletStyleMixed(-2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  ppBulletAlphaLCPeriod(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppBulletAlphaUCPeriod(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppBulletArabicParenRight(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppBulletArabicPeriod(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ppBulletRomanLCParenBoth(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  ppBulletRomanLCParenRight(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  ppBulletRomanLCPeriod(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  ppBulletRomanUCPeriod(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  ppBulletAlphaLCParenBoth(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  ppBulletAlphaLCParenRight(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  ppBulletAlphaUCParenBoth(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  ppBulletAlphaUCParenRight(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  ppBulletArabicParenBoth(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  ppBulletArabicPlain(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  ppBulletRomanUCParenBoth(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  ppBulletRomanUCParenRight(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  ppBulletSimpChinPlain(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  ppBulletSimpChinPeriod(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  ppBulletCircleNumDBPlain(18),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  ppBulletCircleNumWDWhitePlain(19),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  ppBulletCircleNumWDBlackPlain(20),
  /**
   * <p>
   * The value of this constant is 21
   * </p>
   */
  ppBulletTradChinPlain(21),
  /**
   * <p>
   * The value of this constant is 22
   * </p>
   */
  ppBulletTradChinPeriod(22),
  /**
   * <p>
   * The value of this constant is 23
   * </p>
   */
  ppBulletArabicAlphaDash(23),
  /**
   * <p>
   * The value of this constant is 24
   * </p>
   */
  ppBulletArabicAbjadDash(24),
  /**
   * <p>
   * The value of this constant is 25
   * </p>
   */
  ppBulletHebrewAlphaDash(25),
  /**
   * <p>
   * The value of this constant is 26
   * </p>
   */
  ppBulletKanjiKoreanPlain(26),
  /**
   * <p>
   * The value of this constant is 27
   * </p>
   */
  ppBulletKanjiKoreanPeriod(27),
  /**
   * <p>
   * The value of this constant is 28
   * </p>
   */
  ppBulletArabicDBPlain(28),
  /**
   * <p>
   * The value of this constant is 29
   * </p>
   */
  ppBulletArabicDBPeriod(29),
  /**
   * <p>
   * The value of this constant is 30
   * </p>
   */
  ppBulletThaiAlphaPeriod(30),
  /**
   * <p>
   * The value of this constant is 31
   * </p>
   */
  ppBulletThaiAlphaParenRight(31),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  ppBulletThaiAlphaParenBoth(32),
  /**
   * <p>
   * The value of this constant is 33
   * </p>
   */
  ppBulletThaiNumPeriod(33),
  /**
   * <p>
   * The value of this constant is 34
   * </p>
   */
  ppBulletThaiNumParenRight(34),
  /**
   * <p>
   * The value of this constant is 35
   * </p>
   */
  ppBulletThaiNumParenBoth(35),
  /**
   * <p>
   * The value of this constant is 36
   * </p>
   */
  ppBulletHindiAlphaPeriod(36),
  /**
   * <p>
   * The value of this constant is 37
   * </p>
   */
  ppBulletHindiNumPeriod(37),
  /**
   * <p>
   * The value of this constant is 38
   * </p>
   */
  ppBulletKanjiSimpChinDBPeriod(38),
  /**
   * <p>
   * The value of this constant is 39
   * </p>
   */
  ppBulletHindiNumParenRight(39),
  /**
   * <p>
   * The value of this constant is 40
   * </p>
   */
  ppBulletHindiAlpha1Period(40),
  ;

  private final int value;
  PpNumberedBulletStyle(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
