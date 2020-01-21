package word  ;

import com4j.*;

/**
 */
public enum WdShapeSizeRelative implements ComEnum {
  /**
   * <p>
   * The value of this constant is -999999
   * </p>
   */
  wdShapeSizeRelativeNone(-999999),
  ;

  private final int value;
  WdShapeSizeRelative(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
