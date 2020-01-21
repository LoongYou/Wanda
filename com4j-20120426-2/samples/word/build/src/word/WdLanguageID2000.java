package word  ;

import com4j.*;

/**
 */
public enum WdLanguageID2000 implements ComEnum {
  /**
   * <p>
   * The value of this constant is 3076
   * </p>
   */
  wdChineseHongKong(3076),
  /**
   * <p>
   * The value of this constant is 5124
   * </p>
   */
  wdChineseMacao(5124),
  /**
   * <p>
   * The value of this constant is 11273
   * </p>
   */
  wdEnglishTrinidad(11273),
  ;

  private final int value;
  WdLanguageID2000(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
