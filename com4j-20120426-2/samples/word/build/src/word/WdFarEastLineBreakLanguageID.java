package word  ;

import com4j.*;

/**
 */
public enum WdFarEastLineBreakLanguageID implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1041
   * </p>
   */
  wdLineBreakJapanese(1041),
  /**
   * <p>
   * The value of this constant is 1042
   * </p>
   */
  wdLineBreakKorean(1042),
  /**
   * <p>
   * The value of this constant is 2052
   * </p>
   */
  wdLineBreakSimplifiedChinese(2052),
  /**
   * <p>
   * The value of this constant is 1028
   * </p>
   */
  wdLineBreakTraditionalChinese(1028),
  ;

  private final int value;
  WdFarEastLineBreakLanguageID(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
