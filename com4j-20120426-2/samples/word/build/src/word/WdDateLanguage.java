package word  ;

import com4j.*;

/**
 */
public enum WdDateLanguage implements ComEnum {
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdDateLanguageBidi(10),
  /**
   * <p>
   * The value of this constant is 1033
   * </p>
   */
  wdDateLanguageLatin(1033),
  ;

  private final int value;
  WdDateLanguage(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
