package excel  ;

import com4j.*;

@IID("{000244B2-0001-0000-C000-000000000046}")
public interface IChartFormat extends Com4jObject {
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
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type excel.FillFormat
   */

  @VTID(10)
  excel.FillFormat getFill();


  /**
   * <p>
   * Getter method for the COM property "Glow"
   * </p>
   * @return  Returns a value of type office.GlowFormat
   */

  @VTID(11)
  office.GlowFormat getGlow();


  /**
   * <p>
   * Getter method for the COM property "Line"
   * </p>
   * @return  Returns a value of type excel.LineFormat
   */

  @VTID(12)
  excel.LineFormat getLine();


  /**
   * <p>
   * Getter method for the COM property "PictureFormat"
   * </p>
   * @return  Returns a value of type excel.PictureFormat
   */

  @VTID(13)
  excel.PictureFormat getPictureFormat();


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type excel.ShadowFormat
   */

  @VTID(14)
  excel.ShadowFormat getShadow();


  /**
   * <p>
   * Getter method for the COM property "SoftEdge"
   * </p>
   * @return  Returns a value of type office.SoftEdgeFormat
   */

  @VTID(15)
  office.SoftEdgeFormat getSoftEdge();


  /**
   * <p>
   * Getter method for the COM property "TextFrame2"
   * </p>
   * @return  Returns a value of type excel.TextFrame2
   */

  @VTID(16)
  excel.TextFrame2 getTextFrame2();


  /**
   * <p>
   * Getter method for the COM property "ThreeD"
   * </p>
   * @return  Returns a value of type excel.ThreeDFormat
   */

  @VTID(17)
  excel.ThreeDFormat getThreeD();


  // Properties:
}
