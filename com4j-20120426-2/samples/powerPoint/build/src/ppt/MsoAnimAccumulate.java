package ppt  ;

import com4j.*;

/**
 */
public enum MsoAnimAccumulate implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  msoAnimAccumulateNone(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  msoAnimAccumulateAlways(2),
  ;

  private final int value;
  MsoAnimAccumulate(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
