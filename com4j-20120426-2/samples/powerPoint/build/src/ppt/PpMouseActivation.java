package ppt  ;

import com4j.*;

/**
 */
public enum PpMouseActivation implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppMouseClick(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppMouseOver(2),
  ;

  private final int value;
  PpMouseActivation(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
