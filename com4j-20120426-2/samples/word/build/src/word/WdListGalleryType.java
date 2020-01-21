package word  ;

import com4j.*;

/**
 */
public enum WdListGalleryType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdBulletGallery(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdNumberGallery(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdOutlineNumberGallery(3),
  ;

  private final int value;
  WdListGalleryType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
