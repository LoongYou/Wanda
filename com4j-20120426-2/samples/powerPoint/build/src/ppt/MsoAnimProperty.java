package ppt  ;

import com4j.*;

/**
 */
public enum MsoAnimProperty implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  msoAnimNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  msoAnimX(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  msoAnimY(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  msoAnimWidth(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  msoAnimHeight(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  msoAnimOpacity(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  msoAnimRotation(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  msoAnimColor(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  msoAnimVisibility(8),
  /**
   * <p>
   * The value of this constant is 100
   * </p>
   */
  msoAnimTextFontBold(100),
  /**
   * <p>
   * The value of this constant is 101
   * </p>
   */
  msoAnimTextFontColor(101),
  /**
   * <p>
   * The value of this constant is 102
   * </p>
   */
  msoAnimTextFontEmboss(102),
  /**
   * <p>
   * The value of this constant is 103
   * </p>
   */
  msoAnimTextFontItalic(103),
  /**
   * <p>
   * The value of this constant is 104
   * </p>
   */
  msoAnimTextFontName(104),
  /**
   * <p>
   * The value of this constant is 105
   * </p>
   */
  msoAnimTextFontShadow(105),
  /**
   * <p>
   * The value of this constant is 106
   * </p>
   */
  msoAnimTextFontSize(106),
  /**
   * <p>
   * The value of this constant is 107
   * </p>
   */
  msoAnimTextFontSubscript(107),
  /**
   * <p>
   * The value of this constant is 108
   * </p>
   */
  msoAnimTextFontSuperscript(108),
  /**
   * <p>
   * The value of this constant is 109
   * </p>
   */
  msoAnimTextFontUnderline(109),
  /**
   * <p>
   * The value of this constant is 110
   * </p>
   */
  msoAnimTextFontStrikeThrough(110),
  /**
   * <p>
   * The value of this constant is 111
   * </p>
   */
  msoAnimTextBulletCharacter(111),
  /**
   * <p>
   * The value of this constant is 112
   * </p>
   */
  msoAnimTextBulletFontName(112),
  /**
   * <p>
   * The value of this constant is 113
   * </p>
   */
  msoAnimTextBulletNumber(113),
  /**
   * <p>
   * The value of this constant is 114
   * </p>
   */
  msoAnimTextBulletColor(114),
  /**
   * <p>
   * The value of this constant is 115
   * </p>
   */
  msoAnimTextBulletRelativeSize(115),
  /**
   * <p>
   * The value of this constant is 116
   * </p>
   */
  msoAnimTextBulletStyle(116),
  /**
   * <p>
   * The value of this constant is 117
   * </p>
   */
  msoAnimTextBulletType(117),
  /**
   * <p>
   * The value of this constant is 1000
   * </p>
   */
  msoAnimShapePictureContrast(1000),
  /**
   * <p>
   * The value of this constant is 1001
   * </p>
   */
  msoAnimShapePictureBrightness(1001),
  /**
   * <p>
   * The value of this constant is 1002
   * </p>
   */
  msoAnimShapePictureGamma(1002),
  /**
   * <p>
   * The value of this constant is 1003
   * </p>
   */
  msoAnimShapePictureGrayscale(1003),
  /**
   * <p>
   * The value of this constant is 1004
   * </p>
   */
  msoAnimShapeFillOn(1004),
  /**
   * <p>
   * The value of this constant is 1005
   * </p>
   */
  msoAnimShapeFillColor(1005),
  /**
   * <p>
   * The value of this constant is 1006
   * </p>
   */
  msoAnimShapeFillOpacity(1006),
  /**
   * <p>
   * The value of this constant is 1007
   * </p>
   */
  msoAnimShapeFillBackColor(1007),
  /**
   * <p>
   * The value of this constant is 1008
   * </p>
   */
  msoAnimShapeLineOn(1008),
  /**
   * <p>
   * The value of this constant is 1009
   * </p>
   */
  msoAnimShapeLineColor(1009),
  /**
   * <p>
   * The value of this constant is 1010
   * </p>
   */
  msoAnimShapeShadowOn(1010),
  /**
   * <p>
   * The value of this constant is 1011
   * </p>
   */
  msoAnimShapeShadowType(1011),
  /**
   * <p>
   * The value of this constant is 1012
   * </p>
   */
  msoAnimShapeShadowColor(1012),
  /**
   * <p>
   * The value of this constant is 1013
   * </p>
   */
  msoAnimShapeShadowOpacity(1013),
  /**
   * <p>
   * The value of this constant is 1014
   * </p>
   */
  msoAnimShapeShadowOffsetX(1014),
  /**
   * <p>
   * The value of this constant is 1015
   * </p>
   */
  msoAnimShapeShadowOffsetY(1015),
  ;

  private final int value;
  MsoAnimProperty(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
