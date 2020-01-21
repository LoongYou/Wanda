package word  ;

import com4j.*;

/**
 */
public enum WdXMLValidationStatus implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdXMLValidationStatusOK(0),
  /**
   * <p>
   * The value of this constant is -1072898048
   * </p>
   */
  wdXMLValidationStatusCustom(-1072898048),
  ;

  private final int value;
  WdXMLValidationStatus(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
