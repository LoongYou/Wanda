package word  ;

import com4j.*;

/**
 */
public enum WdCountry implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdUS(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdCanada(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdLatinAmerica(3),
  /**
   * <p>
   * The value of this constant is 31
   * </p>
   */
  wdNetherlands(31),
  /**
   * <p>
   * The value of this constant is 33
   * </p>
   */
  wdFrance(33),
  /**
   * <p>
   * The value of this constant is 34
   * </p>
   */
  wdSpain(34),
  /**
   * <p>
   * The value of this constant is 39
   * </p>
   */
  wdItaly(39),
  /**
   * <p>
   * The value of this constant is 44
   * </p>
   */
  wdUK(44),
  /**
   * <p>
   * The value of this constant is 45
   * </p>
   */
  wdDenmark(45),
  /**
   * <p>
   * The value of this constant is 46
   * </p>
   */
  wdSweden(46),
  /**
   * <p>
   * The value of this constant is 47
   * </p>
   */
  wdNorway(47),
  /**
   * <p>
   * The value of this constant is 49
   * </p>
   */
  wdGermany(49),
  /**
   * <p>
   * The value of this constant is 51
   * </p>
   */
  wdPeru(51),
  /**
   * <p>
   * The value of this constant is 52
   * </p>
   */
  wdMexico(52),
  /**
   * <p>
   * The value of this constant is 54
   * </p>
   */
  wdArgentina(54),
  /**
   * <p>
   * The value of this constant is 55
   * </p>
   */
  wdBrazil(55),
  /**
   * <p>
   * The value of this constant is 56
   * </p>
   */
  wdChile(56),
  /**
   * <p>
   * The value of this constant is 58
   * </p>
   */
  wdVenezuela(58),
  /**
   * <p>
   * The value of this constant is 81
   * </p>
   */
  wdJapan(81),
  /**
   * <p>
   * The value of this constant is 886
   * </p>
   */
  wdTaiwan(886),
  /**
   * <p>
   * The value of this constant is 86
   * </p>
   */
  wdChina(86),
  /**
   * <p>
   * The value of this constant is 82
   * </p>
   */
  wdKorea(82),
  /**
   * <p>
   * The value of this constant is 358
   * </p>
   */
  wdFinland(358),
  /**
   * <p>
   * The value of this constant is 354
   * </p>
   */
  wdIceland(354),
  ;

  private final int value;
  WdCountry(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
