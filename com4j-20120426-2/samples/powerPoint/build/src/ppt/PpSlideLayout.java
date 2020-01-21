package ppt  ;

import com4j.*;

/**
 */
public enum PpSlideLayout implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  ppLayoutMixed(-2),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppLayoutTitle(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppLayoutText(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppLayoutTwoColumnText(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ppLayoutTable(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  ppLayoutTextAndChart(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  ppLayoutChartAndText(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  ppLayoutOrgchart(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  ppLayoutChart(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  ppLayoutTextAndClipart(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  ppLayoutClipartAndText(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  ppLayoutTitleOnly(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  ppLayoutBlank(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  ppLayoutTextAndObject(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  ppLayoutObjectAndText(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  ppLayoutLargeObject(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  ppLayoutObject(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  ppLayoutTextAndMediaClip(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  ppLayoutMediaClipAndText(18),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  ppLayoutObjectOverText(19),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  ppLayoutTextOverObject(20),
  /**
   * <p>
   * The value of this constant is 21
   * </p>
   */
  ppLayoutTextAndTwoObjects(21),
  /**
   * <p>
   * The value of this constant is 22
   * </p>
   */
  ppLayoutTwoObjectsAndText(22),
  /**
   * <p>
   * The value of this constant is 23
   * </p>
   */
  ppLayoutTwoObjectsOverText(23),
  /**
   * <p>
   * The value of this constant is 24
   * </p>
   */
  ppLayoutFourObjects(24),
  /**
   * <p>
   * The value of this constant is 25
   * </p>
   */
  ppLayoutVerticalText(25),
  /**
   * <p>
   * The value of this constant is 26
   * </p>
   */
  ppLayoutClipArtAndVerticalText(26),
  /**
   * <p>
   * The value of this constant is 27
   * </p>
   */
  ppLayoutVerticalTitleAndText(27),
  /**
   * <p>
   * The value of this constant is 28
   * </p>
   */
  ppLayoutVerticalTitleAndTextOverChart(28),
  /**
   * <p>
   * The value of this constant is 29
   * </p>
   */
  ppLayoutTwoObjects(29),
  /**
   * <p>
   * The value of this constant is 30
   * </p>
   */
  ppLayoutObjectAndTwoObjects(30),
  /**
   * <p>
   * The value of this constant is 31
   * </p>
   */
  ppLayoutTwoObjectsAndObject(31),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  ppLayoutCustom(32),
  /**
   * <p>
   * The value of this constant is 33
   * </p>
   */
  ppLayoutSectionHeader(33),
  /**
   * <p>
   * The value of this constant is 34
   * </p>
   */
  ppLayoutComparison(34),
  /**
   * <p>
   * The value of this constant is 35
   * </p>
   */
  ppLayoutContentWithCaption(35),
  /**
   * <p>
   * The value of this constant is 36
   * </p>
   */
  ppLayoutPictureWithCaption(36),
  ;

  private final int value;
  PpSlideLayout(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
