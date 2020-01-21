package excel  ;

import com4j.*;

@IID("{00020859-0001-0000-C000-000000000046}")
public interface IChartGroup extends Com4jObject {
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
   * Getter method for the COM property "AxisGroup"
   * </p>
   * @return  Returns a value of type excel.XlAxisGroup
   */

  @VTID(10)
  excel.XlAxisGroup getAxisGroup();


  /**
   * <p>
   * Setter method for the COM property "AxisGroup"
   * </p>
   * @param rhs Mandatory excel.XlAxisGroup parameter.
   */

  @VTID(11)
  void setAxisGroup(
    excel.XlAxisGroup rhs);


  /**
   * <p>
   * Getter method for the COM property "DoughnutHoleSize"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(12)
  int getDoughnutHoleSize();


  /**
   * <p>
   * Setter method for the COM property "DoughnutHoleSize"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(13)
  void setDoughnutHoleSize(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "DownBars"
   * </p>
   * @return  Returns a value of type excel.DownBars
   */

  @VTID(14)
  excel.DownBars getDownBars();


  /**
   * <p>
   * Getter method for the COM property "DropLines"
   * </p>
   * @return  Returns a value of type excel.DropLines
   */

  @VTID(15)
  excel.DropLines getDropLines();


  /**
   * <p>
   * Getter method for the COM property "FirstSliceAngle"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(16)
  int getFirstSliceAngle();


  /**
   * <p>
   * Setter method for the COM property "FirstSliceAngle"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(17)
  void setFirstSliceAngle(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "GapWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(18)
  int getGapWidth();


  /**
   * <p>
   * Setter method for the COM property "GapWidth"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(19)
  void setGapWidth(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "HasDropLines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(20)
  boolean getHasDropLines();


  /**
   * <p>
   * Setter method for the COM property "HasDropLines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(21)
  void setHasDropLines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasHiLoLines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(22)
  boolean getHasHiLoLines();


  /**
   * <p>
   * Setter method for the COM property "HasHiLoLines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(23)
  void setHasHiLoLines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasRadarAxisLabels"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(24)
  boolean getHasRadarAxisLabels();


  /**
   * <p>
   * Setter method for the COM property "HasRadarAxisLabels"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(25)
  void setHasRadarAxisLabels(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasSeriesLines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(26)
  boolean getHasSeriesLines();


  /**
   * <p>
   * Setter method for the COM property "HasSeriesLines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(27)
  void setHasSeriesLines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasUpDownBars"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(28)
  boolean getHasUpDownBars();


  /**
   * <p>
   * Setter method for the COM property "HasUpDownBars"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(29)
  void setHasUpDownBars(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HiLoLines"
   * </p>
   * @return  Returns a value of type excel.HiLoLines
   */

  @VTID(30)
  excel.HiLoLines getHiLoLines();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(31)
  int getIndex();


  /**
   * <p>
   * Getter method for the COM property "Overlap"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(32)
  int getOverlap();


  /**
   * <p>
   * Setter method for the COM property "Overlap"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(33)
  void setOverlap(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "RadarAxisLabels"
   * </p>
   * @return  Returns a value of type excel.TickLabels
   */

  @VTID(34)
  excel.TickLabels getRadarAxisLabels();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(35)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject seriesCollection(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "SeriesLines"
   * </p>
   * @return  Returns a value of type excel.SeriesLines
   */

  @VTID(36)
  excel.SeriesLines getSeriesLines();


  /**
   * <p>
   * Getter method for the COM property "SubType"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(37)
  int getSubType();


  /**
   * <p>
   * Setter method for the COM property "SubType"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(38)
  void setSubType(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(39)
  int getType();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(40)
  void setType(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "UpBars"
   * </p>
   * @return  Returns a value of type excel.UpBars
   */

  @VTID(41)
  excel.UpBars getUpBars();


  /**
   * <p>
   * Getter method for the COM property "VaryByCategories"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(42)
  boolean getVaryByCategories();


  /**
   * <p>
   * Setter method for the COM property "VaryByCategories"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(43)
  void setVaryByCategories(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SizeRepresents"
   * </p>
   * @return  Returns a value of type excel.XlSizeRepresents
   */

  @VTID(44)
  excel.XlSizeRepresents getSizeRepresents();


  /**
   * <p>
   * Setter method for the COM property "SizeRepresents"
   * </p>
   * @param rhs Mandatory excel.XlSizeRepresents parameter.
   */

  @VTID(45)
  void setSizeRepresents(
    excel.XlSizeRepresents rhs);


  /**
   * <p>
   * Getter method for the COM property "BubbleScale"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(46)
  int getBubbleScale();


  /**
   * <p>
   * Setter method for the COM property "BubbleScale"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(47)
  void setBubbleScale(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowNegativeBubbles"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(48)
  boolean getShowNegativeBubbles();


  /**
   * <p>
   * Setter method for the COM property "ShowNegativeBubbles"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(49)
  void setShowNegativeBubbles(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SplitType"
   * </p>
   * @return  Returns a value of type excel.XlChartSplitType
   */

  @VTID(50)
  excel.XlChartSplitType getSplitType();


  /**
   * <p>
   * Setter method for the COM property "SplitType"
   * </p>
   * @param rhs Mandatory excel.XlChartSplitType parameter.
   */

  @VTID(51)
  void setSplitType(
    excel.XlChartSplitType rhs);


  /**
   * <p>
   * Getter method for the COM property "SplitValue"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(52)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getSplitValue();


  /**
   * <p>
   * Setter method for the COM property "SplitValue"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(53)
  void setSplitValue(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "SecondPlotSize"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(54)
  int getSecondPlotSize();


  /**
   * <p>
   * Setter method for the COM property "SecondPlotSize"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(55)
  void setSecondPlotSize(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Has3DShading"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(56)
  boolean getHas3DShading();


  /**
   * <p>
   * Setter method for the COM property "Has3DShading"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(57)
  void setHas3DShading(
    boolean rhs);


  // Properties:
}
