package ppt  ;

import com4j.*;

/**
 */
public enum MsoAnimTriggerType implements ComEnum {
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  msoAnimTriggerMixed(-1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  msoAnimTriggerNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  msoAnimTriggerOnPageClick(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  msoAnimTriggerWithPrevious(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  msoAnimTriggerAfterPrevious(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  msoAnimTriggerOnShapeClick(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  msoAnimTriggerOnMediaBookmark(5),
  ;

  private final int value;
  MsoAnimTriggerType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
