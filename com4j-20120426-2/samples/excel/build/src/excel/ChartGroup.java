package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ChartGroup extends Com4jObject {
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
   * Getter method for the COM property "AxisGroup"
   * </p>
   */

  @DISPID(47)
  @PropGet
  excel.XlAxisGroup getAxisGroup();


  /**
   * <p>
   * Setter method for the COM property "AxisGroup"
   * </p>
   * @param rhs Mandatory excel.XlAxisGroup parameter.
   */

  @DISPID(47)
  @PropPut
  void setAxisGroup(
    excel.XlAxisGroup rhs);


  /**
   * <p>
   * Getter method for the COM property "DoughnutHoleSize"
   * </p>
   */

  @DISPID(1126)
  @PropGet
  int getDoughnutHoleSize();


  /**
   * <p>
   * Setter method for the COM property "DoughnutHoleSize"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1126)
  @PropPut
  void setDoughnutHoleSize(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "DownBars"
   * </p>
   */

  @DISPID(141)
  @PropGet
  excel.DownBars getDownBars();


  /**
   * <p>
   * Getter method for the COM property "DropLines"
   * </p>
   */

  @DISPID(142)
  @PropGet
  excel.DropLines getDropLines();


  /**
   * <p>
   * Getter method for the COM property "FirstSliceAngle"
   * </p>
   */

  @DISPID(63)
  @PropGet
  int getFirstSliceAngle();


  /**
   * <p>
   * Setter method for the COM property "FirstSliceAngle"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(63)
  @PropPut
  void setFirstSliceAngle(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "GapWidth"
   * </p>
   */

  @DISPID(51)
  @PropGet
  int getGapWidth();


  /**
   * <p>
   * Setter method for the COM property "GapWidth"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(51)
  @PropPut
  void setGapWidth(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "HasDropLines"
   * </p>
   */

  @DISPID(61)
  @PropGet
  boolean getHasDropLines();


  /**
   * <p>
   * Setter method for the COM property "HasDropLines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(61)
  @PropPut
  void setHasDropLines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasHiLoLines"
   * </p>
   */

  @DISPID(62)
  @PropGet
  boolean getHasHiLoLines();


  /**
   * <p>
   * Setter method for the COM property "HasHiLoLines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(62)
  @PropPut
  void setHasHiLoLines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasRadarAxisLabels"
   * </p>
   */

  @DISPID(64)
  @PropGet
  boolean getHasRadarAxisLabels();


  /**
   * <p>
   * Setter method for the COM property "HasRadarAxisLabels"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(64)
  @PropPut
  void setHasRadarAxisLabels(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasSeriesLines"
   * </p>
   */

  @DISPID(65)
  @PropGet
  boolean getHasSeriesLines();


  /**
   * <p>
   * Setter method for the COM property "HasSeriesLines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(65)
  @PropPut
  void setHasSeriesLines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasUpDownBars"
   * </p>
   */

  @DISPID(66)
  @PropGet
  boolean getHasUpDownBars();


  /**
   * <p>
   * Setter method for the COM property "HasUpDownBars"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(66)
  @PropPut
  void setHasUpDownBars(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HiLoLines"
   * </p>
   */

  @DISPID(143)
  @PropGet
  excel.HiLoLines getHiLoLines();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   */

  @DISPID(486)
  @PropGet
  int getIndex();


  /**
   * <p>
   * Getter method for the COM property "Overlap"
   * </p>
   */

  @DISPID(56)
  @PropGet
  int getOverlap();


  /**
   * <p>
   * Setter method for the COM property "Overlap"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(56)
  @PropPut
  void setOverlap(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "RadarAxisLabels"
   * </p>
   */

  @DISPID(144)
  @PropGet
  excel.TickLabels getRadarAxisLabels();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(68)
  com4j.Com4jObject seriesCollection(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "SeriesLines"
   * </p>
   */

  @DISPID(145)
  @PropGet
  excel.SeriesLines getSeriesLines();


  /**
   * <p>
   * Getter method for the COM property "SubType"
   * </p>
   */

  @DISPID(109)
  @PropGet
  int getSubType();


  /**
   * <p>
   * Setter method for the COM property "SubType"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(109)
  @PropPut
  void setSubType(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  int getType();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(108)
  @PropPut
  void setType(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "UpBars"
   * </p>
   */

  @DISPID(140)
  @PropGet
  excel.UpBars getUpBars();


  /**
   * <p>
   * Getter method for the COM property "VaryByCategories"
   * </p>
   */

  @DISPID(60)
  @PropGet
  boolean getVaryByCategories();


  /**
   * <p>
   * Setter method for the COM property "VaryByCategories"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(60)
  @PropPut
  void setVaryByCategories(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SizeRepresents"
   * </p>
   */

  @DISPID(1652)
  @PropGet
  excel.XlSizeRepresents getSizeRepresents();


  /**
   * <p>
   * Setter method for the COM property "SizeRepresents"
   * </p>
   * @param rhs Mandatory excel.XlSizeRepresents parameter.
   */

  @DISPID(1652)
  @PropPut
  void setSizeRepresents(
    excel.XlSizeRepresents rhs);


  /**
   * <p>
   * Getter method for the COM property "BubbleScale"
   * </p>
   */

  @DISPID(1653)
  @PropGet
  int getBubbleScale();


  /**
   * <p>
   * Setter method for the COM property "BubbleScale"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1653)
  @PropPut
  void setBubbleScale(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowNegativeBubbles"
   * </p>
   */

  @DISPID(1654)
  @PropGet
  boolean getShowNegativeBubbles();


  /**
   * <p>
   * Setter method for the COM property "ShowNegativeBubbles"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1654)
  @PropPut
  void setShowNegativeBubbles(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SplitType"
   * </p>
   */

  @DISPID(1655)
  @PropGet
  excel.XlChartSplitType getSplitType();


  /**
   * <p>
   * Setter method for the COM property "SplitType"
   * </p>
   * @param rhs Mandatory excel.XlChartSplitType parameter.
   */

  @DISPID(1655)
  @PropPut
  void setSplitType(
    excel.XlChartSplitType rhs);


  /**
   * <p>
   * Getter method for the COM property "SplitValue"
   * </p>
   */

  @DISPID(1656)
  @PropGet
  java.lang.Object getSplitValue();


  /**
   * <p>
   * Setter method for the COM property "SplitValue"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1656)
  @PropPut
  void setSplitValue(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "SecondPlotSize"
   * </p>
   */

  @DISPID(1657)
  @PropGet
  int getSecondPlotSize();


  /**
   * <p>
   * Setter method for the COM property "SecondPlotSize"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1657)
  @PropPut
  void setSecondPlotSize(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Has3DShading"
   * </p>
   */

  @DISPID(1658)
  @PropGet
  boolean getHas3DShading();


  /**
   * <p>
   * Setter method for the COM property "Has3DShading"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1658)
  @PropPut
  void setHas3DShading(
    boolean rhs);


  // Properties:
}
