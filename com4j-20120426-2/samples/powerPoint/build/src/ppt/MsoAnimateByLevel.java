package ppt  ;

import com4j.*;

/**
 */
public enum MsoAnimateByLevel implements ComEnum {
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  msoAnimateLevelMixed(-1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  msoAnimateLevelNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  msoAnimateTextByAllLevels(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  msoAnimateTextByFirstLevel(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  msoAnimateTextBySecondLevel(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  msoAnimateTextByThirdLevel(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  msoAnimateTextByFourthLevel(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  msoAnimateTextByFifthLevel(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  msoAnimateChartAllAtOnce(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  msoAnimateChartByCategory(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  msoAnimateChartByCategoryElements(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  msoAnimateChartBySeries(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  msoAnimateChartBySeriesElements(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  msoAnimateDiagramAllAtOnce(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  msoAnimateDiagramDepthByNode(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  msoAnimateDiagramDepthByBranch(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  msoAnimateDiagramBreadthByNode(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  msoAnimateDiagramBreadthByLevel(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  msoAnimateDiagramClockwise(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  msoAnimateDiagramClockwiseIn(18),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  msoAnimateDiagramClockwiseOut(19),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  msoAnimateDiagramCounterClockwise(20),
  /**
   * <p>
   * The value of this constant is 21
   * </p>
   */
  msoAnimateDiagramCounterClockwiseIn(21),
  /**
   * <p>
   * The value of this constant is 22
   * </p>
   */
  msoAnimateDiagramCounterClockwiseOut(22),
  /**
   * <p>
   * The value of this constant is 23
   * </p>
   */
  msoAnimateDiagramInByRing(23),
  /**
   * <p>
   * The value of this constant is 24
   * </p>
   */
  msoAnimateDiagramOutByRing(24),
  /**
   * <p>
   * The value of this constant is 25
   * </p>
   */
  msoAnimateDiagramUp(25),
  /**
   * <p>
   * The value of this constant is 26
   * </p>
   */
  msoAnimateDiagramDown(26),
  ;

  private final int value;
  MsoAnimateByLevel(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
