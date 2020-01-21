package ppt  ;

import com4j.*;

@IID("{92D41A5D-F07E-4CA4-AF6F-BEF486AA4E6F}")
public interface ChartGroup extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "DownBars"
   * </p>
   * @return  Returns a value of type ppt.DownBars
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  ppt.DownBars downBars();


  /**
   * <p>
   * Getter method for the COM property "DropLines"
   * </p>
   * @return  Returns a value of type ppt.DropLines
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  ppt.DropLines dropLines();


  /**
   * <p>
   * Setter method for the COM property "HasDropLines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  void hasDropLines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasDropLines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(10)
  boolean hasDropLines();


  /**
   * <p>
   * Setter method for the COM property "HasHiLoLines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  void hasHiLoLines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasHiLoLines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(12)
  boolean hasHiLoLines();


  /**
   * <p>
   * Setter method for the COM property "HasRadarAxisLabels"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  void hasRadarAxisLabels(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasRadarAxisLabels"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(14)
  boolean hasRadarAxisLabels();


  /**
   * <p>
   * Setter method for the COM property "HasSeriesLines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  void hasSeriesLines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasSeriesLines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(16)
  boolean hasSeriesLines();


  /**
   * <p>
   * Setter method for the COM property "HasUpDownBars"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  void hasUpDownBars(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasUpDownBars"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(18)
  boolean hasUpDownBars();


  /**
   * <p>
   * Getter method for the COM property "HiLoLines"
   * </p>
   * @return  Returns a value of type ppt.HiLoLines
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(19)
  ppt.HiLoLines hiLoLines();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610743821) //= 0x6002000d. The runtime will prefer the VTID if present
  @VTID(20)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject seriesCollection(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "SeriesLines"
   * </p>
   * @return  Returns a value of type ppt.SeriesLines
   */

  @DISPID(1610743822) //= 0x6002000e. The runtime will prefer the VTID if present
  @VTID(21)
  ppt.SeriesLines seriesLines();


  /**
   * <p>
   * Getter method for the COM property "UpBars"
   * </p>
   * @return  Returns a value of type ppt.UpBars
   */

  @DISPID(1610743823) //= 0x6002000f. The runtime will prefer the VTID if present
  @VTID(22)
  ppt.UpBars upBars();


  /**
   * <p>
   * Setter method for the COM property "VaryByCategories"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1610743824) //= 0x60020010. The runtime will prefer the VTID if present
  @VTID(23)
  void varyByCategories(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "VaryByCategories"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743824) //= 0x60020010. The runtime will prefer the VTID if present
  @VTID(24)
  boolean varyByCategories();


  /**
   * <p>
   * Getter method for the COM property "SizeRepresents"
   * </p>
   * @return  Returns a value of type ppt.XlSizeRepresents
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(25)
  ppt.XlSizeRepresents sizeRepresents();


  /**
   * <p>
   * Setter method for the COM property "SizeRepresents"
   * </p>
   * @param rhs Mandatory ppt.XlSizeRepresents parameter.
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(26)
  void sizeRepresents(
    ppt.XlSizeRepresents rhs);


  /**
   * <p>
   * Setter method for the COM property "ShowNegativeBubbles"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(27)
  void showNegativeBubbles(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowNegativeBubbles"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(28)
  boolean showNegativeBubbles();


  /**
   * <p>
   * Setter method for the COM property "SplitType"
   * </p>
   * @param rhs Mandatory ppt.XlChartSplitType parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(29)
  void splitType(
    ppt.XlChartSplitType rhs);


  /**
   * <p>
   * Getter method for the COM property "SplitType"
   * </p>
   * @return  Returns a value of type ppt.XlChartSplitType
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(30)
  ppt.XlChartSplitType splitType();


  /**
   * <p>
   * Getter method for the COM property "SplitValue"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(31)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object splitValue();


  /**
   * <p>
   * Setter method for the COM property "SplitValue"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(32)
  void splitValue(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Has3DShading"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(33)
  boolean has3DShading();


  /**
   * <p>
   * Setter method for the COM property "Has3DShading"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(34)
  void has3DShading(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(35)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(36)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(37)
  ppt._Application application();


  /**
   * <p>
   * Getter method for the COM property "AxisGroup"
   * </p>
   * @return  Returns a value of type ppt.XlAxisGroup
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(38)
  ppt.XlAxisGroup axisGroup();


  /**
   * <p>
   * Setter method for the COM property "AxisGroup"
   * </p>
   * @param rhs Mandatory ppt.XlAxisGroup parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(39)
  void axisGroup(
    ppt.XlAxisGroup rhs);


  /**
   * <p>
   * Getter method for the COM property "BubbleScale"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(40)
  int bubbleScale();


  /**
   * <p>
   * Setter method for the COM property "BubbleScale"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(41)
  void bubbleScale(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "DoughnutHoleSize"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(42)
  int doughnutHoleSize();


  /**
   * <p>
   * Setter method for the COM property "DoughnutHoleSize"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(43)
  void doughnutHoleSize(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "FirstSliceAngle"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(44)
  int firstSliceAngle();


  /**
   * <p>
   * Setter method for the COM property "FirstSliceAngle"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(45)
  void firstSliceAngle(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "GapWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(46)
  int gapWidth();


  /**
   * <p>
   * Setter method for the COM property "GapWidth"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(47)
  void gapWidth(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(48)
  int index();


  /**
   * <p>
   * Getter method for the COM property "Overlap"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(49)
  int overlap();


  /**
   * <p>
   * Setter method for the COM property "Overlap"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(50)
  void overlap(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "RadarAxisLabels"
   * </p>
   * @return  Returns a value of type ppt.TickLabels
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(51)
  ppt.TickLabels radarAxisLabels();


  /**
   * <p>
   * Getter method for the COM property "Subtype"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(52)
  int subtype();


  /**
   * <p>
   * Setter method for the COM property "Subtype"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(53)
  void subtype(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(54)
  int type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(55)
  void type(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "SecondPlotSize"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(56)
  int secondPlotSize();


  /**
   * <p>
   * Setter method for the COM property "SecondPlotSize"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(57)
  void secondPlotSize(
    int rhs);


  // Properties:
}
