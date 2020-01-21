package ppt  ;

import com4j.*;

/**
 */
public enum PpParagraphAlignment implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  ppAlignmentMixed(-2),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppAlignLeft(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppAlignCenter(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppAlignRight(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ppAlignJustify(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  ppAlignDistribute(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  ppAlignThaiDistribute(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  ppAlignJustifyLow(7),
  ;

  private final int value;
  PpParagraphAlignment(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
