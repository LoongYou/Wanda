package ppt  ;

import com4j.*;

/**
 */
public enum PpPrintOutputType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppPrintOutputSlides(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppPrintOutputTwoSlideHandouts(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppPrintOutputThreeSlideHandouts(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ppPrintOutputSixSlideHandouts(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  ppPrintOutputNotesPages(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  ppPrintOutputOutline(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  ppPrintOutputBuildSlides(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  ppPrintOutputFourSlideHandouts(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  ppPrintOutputNineSlideHandouts(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  ppPrintOutputOneSlideHandouts(10),
  ;

  private final int value;
  PpPrintOutputType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
