package ppt  ;

import com4j.*;

/**
 */
public enum PpChangeCase implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppCaseSentence(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppCaseLower(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppCaseUpper(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ppCaseTitle(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  ppCaseToggle(5),
  ;

  private final int value;
  PpChangeCase(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
