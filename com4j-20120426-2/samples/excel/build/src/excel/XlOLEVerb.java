package excel  ;

import com4j.*;

/**
 */
public enum XlOLEVerb implements ComEnum {
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  xlVerbOpen(2),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  xlVerbPrimary(1),
  ;

  private final int value;
  XlOLEVerb(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
