package word  ;

import com4j.*;

/**
 */
public enum WdLigatures implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdLigaturesNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdLigaturesStandard(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdLigaturesContextual(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdLigaturesHistorical(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdLigaturesDiscretional(8),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdLigaturesStandardContextual(3),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdLigaturesStandardHistorical(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdLigaturesContextualHistorical(6),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdLigaturesStandardDiscretional(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdLigaturesContextualDiscretional(10),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  wdLigaturesHistoricalDiscretional(12),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdLigaturesStandardContextualHistorical(7),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdLigaturesStandardContextualDiscretional(11),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  wdLigaturesStandardHistoricalDiscretional(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  wdLigaturesContextualHistoricalDiscretional(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  wdLigaturesAll(15),
  ;

  private final int value;
  WdLigatures(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
