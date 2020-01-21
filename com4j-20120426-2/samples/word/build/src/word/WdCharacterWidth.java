package word  ;

import com4j.*;

/**
 */
public enum WdCharacterWidth implements ComEnum {
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdWidthHalfWidth(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdWidthFullWidth(7),
  ;

  private final int value;
  WdCharacterWidth(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
