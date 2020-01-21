package word  ;

import com4j.*;

/**
 */
public enum WdConstants implements ComEnum {
  /**
   * <p>
   * The value of this constant is 9999999
   * </p>
   */
  wdUndefined(9999999),
  /**
   * <p>
   * The value of this constant is 9999998
   * </p>
   */
  wdToggle(9999998),
  /**
   * <p>
   * The value of this constant is 1073741823
   * </p>
   */
  wdForward(1073741823),
  /**
   * <p>
   * The value of this constant is -1073741823
   * </p>
   */
  wdBackward(-1073741823),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdAutoPosition(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdFirst(1),
  /**
   * <p>
   * The value of this constant is 1297307460
   * </p>
   */
  wdCreatorCode(1297307460),
  ;

  private final int value;
  WdConstants(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
