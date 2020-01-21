package word  ;

import com4j.*;

/**
 */
public enum WdInlineShapeType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdInlineShapeEmbeddedOLEObject(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdInlineShapeLinkedOLEObject(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdInlineShapePicture(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdInlineShapeLinkedPicture(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdInlineShapeOLEControlObject(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdInlineShapeHorizontalLine(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdInlineShapePictureHorizontalLine(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdInlineShapeLinkedPictureHorizontalLine(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdInlineShapePictureBullet(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdInlineShapeScriptAnchor(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdInlineShapeOWSAnchor(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  wdInlineShapeChart(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  wdInlineShapeDiagram(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  wdInlineShapeLockedCanvas(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  wdInlineShapeSmartArt(15),
  ;

  private final int value;
  WdInlineShapeType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
