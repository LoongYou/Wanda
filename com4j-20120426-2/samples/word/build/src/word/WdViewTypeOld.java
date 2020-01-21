package word  ;

import com4j.*;

/**
 */
public enum WdViewTypeOld implements ComEnum {
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdPageView(3),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdOnlineView(6),
  ;

  private final int value;
  WdViewTypeOld(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
