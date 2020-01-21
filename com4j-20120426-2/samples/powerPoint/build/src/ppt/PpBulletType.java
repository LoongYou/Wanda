package ppt  ;

import com4j.*;

/**
 */
public enum PpBulletType implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  ppBulletMixed(-2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  ppBulletNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppBulletUnnumbered(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppBulletNumbered(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppBulletPicture(3),
  ;

  private final int value;
  PpBulletType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
