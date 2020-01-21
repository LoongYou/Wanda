package word  ;

import com4j.*;

/**
 */
public enum WdGutterStyleOld implements ComEnum {
  /**
   * <p>
   * The value of this constant is -10
   * </p>
   */
  wdGutterStyleLatin(-10),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdGutterStyleBidi(2),
  ;

  private final int value;
  WdGutterStyleOld(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
