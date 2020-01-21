package word  ;

import com4j.*;

/**
 */
public enum WdPreferredWidthType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdPreferredWidthAuto(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdPreferredWidthPercent(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdPreferredWidthPoints(3),
  ;

  private final int value;
  WdPreferredWidthType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
