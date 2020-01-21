package word  ;

import com4j.*;

/**
 */
public enum WdPasteDataType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdPasteOLEObject(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdPasteRTF(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdPasteText(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdPasteMetafilePicture(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdPasteBitmap(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdPasteDeviceIndependentBitmap(5),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdPasteHyperlink(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdPasteShape(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdPasteEnhancedMetafile(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdPasteHTML(10),
  ;

  private final int value;
  WdPasteDataType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
