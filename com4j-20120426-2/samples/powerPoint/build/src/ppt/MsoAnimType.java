package ppt  ;

import com4j.*;

/**
 */
public enum MsoAnimType implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  msoAnimTypeMixed(-2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  msoAnimTypeNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  msoAnimTypeMotion(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  msoAnimTypeColor(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  msoAnimTypeScale(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  msoAnimTypeRotation(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  msoAnimTypeProperty(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  msoAnimTypeCommand(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  msoAnimTypeFilter(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  msoAnimTypeSet(8),
  ;

  private final int value;
  MsoAnimType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
