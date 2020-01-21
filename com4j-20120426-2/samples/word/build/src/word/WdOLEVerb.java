package word  ;

import com4j.*;

/**
 */
public enum WdOLEVerb implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdOLEVerbPrimary(0),
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  wdOLEVerbShow(-1),
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  wdOLEVerbOpen(-2),
  /**
   * <p>
   * The value of this constant is -3
   * </p>
   */
  wdOLEVerbHide(-3),
  /**
   * <p>
   * The value of this constant is -4
   * </p>
   */
  wdOLEVerbUIActivate(-4),
  /**
   * <p>
   * The value of this constant is -5
   * </p>
   */
  wdOLEVerbInPlaceActivate(-5),
  /**
   * <p>
   * The value of this constant is -6
   * </p>
   */
  wdOLEVerbDiscardUndoState(-6),
  ;

  private final int value;
  WdOLEVerb(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
