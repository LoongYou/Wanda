package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ChartFormat extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   */

  @DISPID(148)
  @PropGet
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   */

  @DISPID(149)
  @PropGet
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   */

  @DISPID(150)
  @PropGet
  com4j.Com4jObject getParent();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   */

  @DISPID(1663)
  @PropGet
  excel.FillFormat getFill();


  /**
   * <p>
   * Getter method for the COM property "Glow"
   * </p>
   */

  @DISPID(2663)
  @PropGet
  office.GlowFormat getGlow();


  /**
   * <p>
   * Getter method for the COM property "Line"
   * </p>
   */

  @DISPID(817)
  @PropGet
  excel.LineFormat getLine();


  /**
   * <p>
   * Getter method for the COM property "PictureFormat"
   * </p>
   */

  @DISPID(1631)
  @PropGet
  excel.PictureFormat getPictureFormat();


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   */

  @DISPID(103)
  @PropGet
  excel.ShadowFormat getShadow();


  /**
   * <p>
   * Getter method for the COM property "SoftEdge"
   * </p>
   */

  @DISPID(2662)
  @PropGet
  office.SoftEdgeFormat getSoftEdge();


  /**
   * <p>
   * Getter method for the COM property "TextFrame2"
   * </p>
   */

  @DISPID(2659)
  @PropGet
  excel.TextFrame2 getTextFrame2();


  /**
   * <p>
   * Getter method for the COM property "ThreeD"
   * </p>
   */

  @DISPID(1703)
  @PropGet
  excel.ThreeDFormat getThreeD();


  // Properties:
}
