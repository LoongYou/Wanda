package word  ;

import com4j.*;

/**
 */
public enum WdShapePositionRelative implements ComEnum {
  /**
   * <p>
   * The value of this constant is -999999
   * </p>
   */
  wdShapePositionRelativeNone(-999999),
  ;

  private final int value;
  WdShapePositionRelative(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
