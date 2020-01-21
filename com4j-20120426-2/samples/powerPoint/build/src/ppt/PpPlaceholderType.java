package ppt  ;

import com4j.*;

/**
 */
public enum PpPlaceholderType implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  ppPlaceholderMixed(-2),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppPlaceholderTitle(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppPlaceholderBody(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppPlaceholderCenterTitle(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ppPlaceholderSubtitle(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  ppPlaceholderVerticalTitle(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  ppPlaceholderVerticalBody(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  ppPlaceholderObject(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  ppPlaceholderChart(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  ppPlaceholderBitmap(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  ppPlaceholderMediaClip(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  ppPlaceholderOrgChart(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  ppPlaceholderTable(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  ppPlaceholderSlideNumber(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  ppPlaceholderHeader(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  ppPlaceholderFooter(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  ppPlaceholderDate(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  ppPlaceholderVerticalObject(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  ppPlaceholderPicture(18),
  ;

  private final int value;
  PpPlaceholderType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
