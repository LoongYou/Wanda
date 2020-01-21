package wsh  ;

import com4j.*;

/**
 */
public enum Tristate implements ComEnum {
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  TristateTrue(-1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  TristateFalse(0),
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  TristateUseDefault(-2),
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  TristateMixed(-2),
  ;

  private final int value;
  Tristate(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
