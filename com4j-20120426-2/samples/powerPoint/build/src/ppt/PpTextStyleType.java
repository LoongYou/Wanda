package ppt  ;

import com4j.*;

/**
 */
public enum PpTextStyleType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppDefaultStyle(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppTitleStyle(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppBodyStyle(3),
  ;

  private final int value;
  PpTextStyleType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
