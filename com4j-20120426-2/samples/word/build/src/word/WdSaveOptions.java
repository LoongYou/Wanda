package word  ;

import com4j.*;

/**
 */
public enum WdSaveOptions implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdDoNotSaveChanges(0),
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  wdSaveChanges(-1),
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  wdPromptToSaveChanges(-2),
  ;

  private final int value;
  WdSaveOptions(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
