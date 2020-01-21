package word  ;

import com4j.*;

/**
 */
public enum WdFontBias implements ComEnum {
  /**
   * <p>
   * The value of this constant is 255
   * </p>
   */
  wdFontBiasDontCare(255),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdFontBiasDefault(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdFontBiasFareast(1),
  ;

  private final int value;
  WdFontBias(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
