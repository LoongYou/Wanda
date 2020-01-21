package ppt  ;

import com4j.*;

/**
 */
public enum PpChartUnitEffect implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  ppAnimateChartMixed(-2),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppAnimateBySeries(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppAnimateByCategory(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppAnimateBySeriesElements(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ppAnimateByCategoryElements(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  ppAnimateChartAllAtOnce(5),
  ;

  private final int value;
  PpChartUnitEffect(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
