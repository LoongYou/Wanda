package word  ;

import com4j.*;

/**
 */
public enum WdEditorType implements ComEnum {
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  wdEditorEveryone(-1),
  /**
   * <p>
   * The value of this constant is -4
   * </p>
   */
  wdEditorOwners(-4),
  /**
   * <p>
   * The value of this constant is -5
   * </p>
   */
  wdEditorEditors(-5),
  /**
   * <p>
   * The value of this constant is -6
   * </p>
   */
  wdEditorCurrent(-6),
  ;

  private final int value;
  WdEditorType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
