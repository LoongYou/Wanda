package word  ;

import com4j.*;

/**
 */
public enum WdOutlineLevel implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdOutlineLevel1(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdOutlineLevel2(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdOutlineLevel3(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdOutlineLevel4(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdOutlineLevel5(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdOutlineLevel6(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdOutlineLevel7(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdOutlineLevel8(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdOutlineLevel9(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdOutlineLevelBodyText(10),
  ;

  private final int value;
  WdOutlineLevel(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
