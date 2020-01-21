package excel  ;

import com4j.*;

@IID("{00024480-0001-0000-C000-000000000046}")
public interface IPivotLine extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type excel._Application
   */

  @VTID(7)
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type excel.XlCreator
   */

  @VTID(8)
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getParent();


  /**
   * <p>
   * Getter method for the COM property "LineType"
   * </p>
   * @return  Returns a value of type excel.XlPivotLineType
   */

  @VTID(10)
  excel.XlPivotLineType getLineType();


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(11)
  int getPosition();


  /**
   * <p>
   * Getter method for the COM property "PivotLineCells"
   * </p>
   * @return  Returns a value of type excel.PivotLineCells
   */

  @VTID(12)
  excel.PivotLineCells getPivotLineCells();


  // Properties:
}
