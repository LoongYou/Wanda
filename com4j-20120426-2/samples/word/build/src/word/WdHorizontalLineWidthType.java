package word  ;

import com4j.*;

/**
 */
public enum WdHorizontalLineWidthType implements ComEnum {
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  wdHorizontalLinePercentWidth(-1),
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  wdHorizontalLineFixedWidth(-2),
  ;

  private final int value;
  WdHorizontalLineWidthType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
