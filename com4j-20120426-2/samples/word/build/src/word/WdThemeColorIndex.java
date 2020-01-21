package word  ;

import com4j.*;

/**
 */
public enum WdThemeColorIndex implements ComEnum {
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  wdNotThemeColor(-1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdThemeColorMainDark1(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdThemeColorMainLight1(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdThemeColorMainDark2(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdThemeColorMainLight2(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdThemeColorAccent1(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdThemeColorAccent2(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdThemeColorAccent3(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdThemeColorAccent4(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdThemeColorAccent5(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdThemeColorAccent6(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdThemeColorHyperlink(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdThemeColorHyperlinkFollowed(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  wdThemeColorBackground1(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  wdThemeColorText1(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  wdThemeColorBackground2(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  wdThemeColorText2(15),
  ;

  private final int value;
  WdThemeColorIndex(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
