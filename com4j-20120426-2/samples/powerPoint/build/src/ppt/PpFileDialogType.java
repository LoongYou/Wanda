package ppt  ;

import com4j.*;

/**
 */
public enum PpFileDialogType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppFileDialogOpen(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppFileDialogSave(2),
  ;

  private final int value;
  PpFileDialogType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
