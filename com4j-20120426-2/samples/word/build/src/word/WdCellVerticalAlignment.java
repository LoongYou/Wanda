package word  ;

import com4j.*;

/**
 */
public enum WdCellVerticalAlignment implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdCellAlignVerticalTop(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdCellAlignVerticalCenter(1),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdCellAlignVerticalBottom(3),
  ;

  private final int value;
  WdCellVerticalAlignment(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
