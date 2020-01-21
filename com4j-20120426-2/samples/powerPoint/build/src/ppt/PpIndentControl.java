package ppt  ;

import com4j.*;

/**
 */
public enum PpIndentControl implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  ppIndentControlMixed(-2),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppIndentReplaceAttr(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppIndentKeepAttr(2),
  ;

  private final int value;
  PpIndentControl(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
