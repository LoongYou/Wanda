package ppt  ;

import com4j.*;

/**
 */
public enum PpFarEastLineBreakLevel implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppFarEastLineBreakLevelNormal(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppFarEastLineBreakLevelStrict(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppFarEastLineBreakLevelCustom(3),
  ;

  private final int value;
  PpFarEastLineBreakLevel(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
