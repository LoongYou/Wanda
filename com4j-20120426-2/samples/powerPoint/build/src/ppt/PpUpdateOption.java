package ppt  ;

import com4j.*;

/**
 */
public enum PpUpdateOption implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  ppUpdateOptionMixed(-2),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppUpdateOptionManual(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppUpdateOptionAutomatic(2),
  ;

  private final int value;
  PpUpdateOption(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
