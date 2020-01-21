package word  ;

import com4j.*;

/**
 */
public enum WdStoryType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdMainTextStory(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdFootnotesStory(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdEndnotesStory(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdCommentsStory(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdTextFrameStory(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdEvenPagesHeaderStory(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdPrimaryHeaderStory(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdEvenPagesFooterStory(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdPrimaryFooterStory(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdFirstPageHeaderStory(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdFirstPageFooterStory(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  wdFootnoteSeparatorStory(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  wdFootnoteContinuationSeparatorStory(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  wdFootnoteContinuationNoticeStory(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  wdEndnoteSeparatorStory(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  wdEndnoteContinuationSeparatorStory(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  wdEndnoteContinuationNoticeStory(17),
  ;

  private final int value;
  WdStoryType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
