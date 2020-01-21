package word  ;

import com4j.*;

/**
 */
public enum WdOMathJc implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdOMathJcCenterGroup(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdOMathJcCenter(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdOMathJcLeft(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdOMathJcRight(4),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdOMathJcInline(7),
  ;

  private final int value;
  WdOMathJc(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
