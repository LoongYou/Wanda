package ppt  ;

import com4j.*;

/**
 */
public enum MsoAnimAdditive implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  msoAnimAdditiveAddBase(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  msoAnimAdditiveAddSum(2),
  ;

  private final int value;
  MsoAnimAdditive(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
