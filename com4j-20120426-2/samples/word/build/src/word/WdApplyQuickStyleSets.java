package word  ;

import com4j.*;

/**
 */
public enum WdApplyQuickStyleSets implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdSessionStartSet(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdTemplateSet(2),
  ;

  private final int value;
  WdApplyQuickStyleSets(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
