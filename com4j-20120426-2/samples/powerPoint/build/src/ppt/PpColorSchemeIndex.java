package ppt  ;

import com4j.*;

/**
 */
public enum PpColorSchemeIndex implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  ppSchemeColorMixed(-2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  ppNotSchemeColor(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppBackground(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppForeground(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppShadow(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ppTitle(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  ppFill(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  ppAccent1(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  ppAccent2(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  ppAccent3(8),
  ;

  private final int value;
  PpColorSchemeIndex(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
