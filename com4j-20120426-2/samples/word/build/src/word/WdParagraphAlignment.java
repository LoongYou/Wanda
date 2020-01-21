package word  ;

import com4j.*;

/**
 */
public enum WdParagraphAlignment implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdAlignParagraphLeft(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdAlignParagraphCenter(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdAlignParagraphRight(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdAlignParagraphJustify(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdAlignParagraphDistribute(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdAlignParagraphJustifyMed(5),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdAlignParagraphJustifyHi(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdAlignParagraphJustifyLow(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdAlignParagraphThaiJustify(9),
  ;

  private final int value;
  WdParagraphAlignment(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
