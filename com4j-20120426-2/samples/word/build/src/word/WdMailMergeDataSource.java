package word  ;

import com4j.*;

/**
 */
public enum WdMailMergeDataSource implements ComEnum {
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  wdNoMergeInfo(-1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdMergeInfoFromWord(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdMergeInfoFromAccessDDE(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdMergeInfoFromExcelDDE(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdMergeInfoFromMSQueryDDE(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdMergeInfoFromODBC(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdMergeInfoFromODSO(5),
  ;

  private final int value;
  WdMailMergeDataSource(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
