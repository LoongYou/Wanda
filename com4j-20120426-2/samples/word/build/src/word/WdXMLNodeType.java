package word  ;

import com4j.*;

/**
 */
public enum WdXMLNodeType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdXMLNodeElement(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdXMLNodeAttribute(2),
  ;

  private final int value;
  WdXMLNodeType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
