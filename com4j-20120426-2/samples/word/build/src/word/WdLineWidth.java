package word  ;

import com4j.*;

/**
 */
public enum WdLineWidth implements ComEnum {
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdLineWidth025pt(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdLineWidth050pt(4),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdLineWidth075pt(6),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdLineWidth100pt(8),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  wdLineWidth150pt(12),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  wdLineWidth225pt(18),
  /**
   * <p>
   * The value of this constant is 24
   * </p>
   */
  wdLineWidth300pt(24),
  /**
   * <p>
   * The value of this constant is 36
   * </p>
   */
  wdLineWidth450pt(36),
  /**
   * <p>
   * The value of this constant is 48
   * </p>
   */
  wdLineWidth600pt(48),
  ;

  private final int value;
  WdLineWidth(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
