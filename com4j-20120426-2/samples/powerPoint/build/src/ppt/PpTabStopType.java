package ppt  ;

import com4j.*;

/**
 */
public enum PpTabStopType implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  ppTabStopMixed(-2),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppTabStopLeft(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppTabStopCenter(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppTabStopRight(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ppTabStopDecimal(4),
  ;

  private final int value;
  PpTabStopType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
