package ppt  ;

import com4j.*;

/**
 */
public enum PpSlideSizeType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppSlideSizeOnScreen(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppSlideSizeLetterPaper(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppSlideSizeA4Paper(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ppSlideSize35MM(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  ppSlideSizeOverhead(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  ppSlideSizeBanner(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  ppSlideSizeCustom(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  ppSlideSizeLedgerPaper(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  ppSlideSizeA3Paper(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  ppSlideSizeB4ISOPaper(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  ppSlideSizeB5ISOPaper(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  ppSlideSizeB4JISPaper(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  ppSlideSizeB5JISPaper(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  ppSlideSizeHagakiCard(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  ppSlideSizeOnScreen16x9(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  ppSlideSizeOnScreen16x10(16),
  ;

  private final int value;
  PpSlideSizeType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
