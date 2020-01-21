package word  ;

import com4j.*;

/**
 */
public enum WdPortugueseReform implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdPortuguesePreReform(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdPortuguesePostReform(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdPortugueseBoth(3),
  ;

  private final int value;
  WdPortugueseReform(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
