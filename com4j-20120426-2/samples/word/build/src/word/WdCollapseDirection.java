package word  ;

import com4j.*;

/**
 */
public enum WdCollapseDirection implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdCollapseStart(1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdCollapseEnd(0),
  ;

  private final int value;
  WdCollapseDirection(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
