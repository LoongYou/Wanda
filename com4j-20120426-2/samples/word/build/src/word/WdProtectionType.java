package word  ;

import com4j.*;

/**
 */
public enum WdProtectionType implements ComEnum {
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  wdNoProtection(-1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdAllowOnlyRevisions(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdAllowOnlyComments(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdAllowOnlyFormFields(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdAllowOnlyReading(3),
  ;

  private final int value;
  WdProtectionType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
