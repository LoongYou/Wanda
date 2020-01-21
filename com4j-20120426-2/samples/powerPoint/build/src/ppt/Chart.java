package ppt  ;

import com4j.*;

@IID("{92D41A55-F07E-4CA4-AF6F-BEF486AA4E6F}")
public interface Chart extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * @param type Optional parameter. Default value is 2
   * @param legendKey Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasLeaderLines Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showSeriesName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showCategoryName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showValue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showPercentage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showBubbleSize Optional parameter. Default value is com4j.Variant.getMissing()
   * @param separator Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1922) //= 0x782. The runtime will prefer the VTID if present
  @VTID(8)
  void applyDataLabels(
    @Optional @DefaultValue("2") ppt.XlDataLabelsType type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object legendKey,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object autoText,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object hasLeaderLines,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showSeriesName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showCategoryName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showValue,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showPercentage,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showBubbleSize,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object separator);


  /**
   * <p>
   * Getter method for the COM property "ChartType"
   * </p>
   * @return  Returns a value of type office.XlChartType
   */

  @DISPID(1400) //= 0x578. The runtime will prefer the VTID if present
  @VTID(9)
  office.XlChartType chartType();


  /**
   * <p>
   * Setter method for the COM property "ChartType"
   * </p>
   * @param rhs Mandatory office.XlChartType parameter.
   */

  @DISPID(1400) //= 0x578. The runtime will prefer the VTID if present
  @VTID(10)
  void chartType(
    office.XlChartType rhs);


  /**
   * <p>
   * Getter method for the COM property "HasDataTable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1396) //= 0x574. The runtime will prefer the VTID if present
  @VTID(11)
  boolean hasDataTable();


  /**
   * <p>
   * Setter method for the COM property "HasDataTable"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1396) //= 0x574. The runtime will prefer the VTID if present
  @VTID(12)
  void hasDataTable(
    boolean rhs);


  /**
   * @param chartType Mandatory office.XlChartType parameter.
   * @param typeName Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1401) //= 0x579. The runtime will prefer the VTID if present
  @VTID(13)
  void applyCustomType(
    office.XlChartType chartType,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object typeName);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @param elementID Mandatory Holder<Integer> parameter.
   * @param arg1 Mandatory Holder<Integer> parameter.
   * @param arg2 Mandatory Holder<Integer> parameter.
   */

  @DISPID(1409) //= 0x581. The runtime will prefer the VTID if present
  @VTID(14)
  void getChartElement(
    int x,
    int y,
    Holder<Integer> elementID,
    Holder<Integer> arg1,
    Holder<Integer> arg2);


  /**
   * @param source Mandatory java.lang.String parameter.
   * @param plotBy Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1413) //= 0x585. The runtime will prefer the VTID if present
  @VTID(15)
  void setSourceData(
    java.lang.String source,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object plotBy);


  /**
   * <p>
   * Getter method for the COM property "PlotBy"
   * </p>
   * @return  Returns a value of type ppt.XlRowCol
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(16)
  ppt.XlRowCol plotBy();


  /**
   * <p>
   * Setter method for the COM property "PlotBy"
   * </p>
   * @param plotBy Mandatory ppt.XlRowCol parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(17)
  void plotBy(
    ppt.XlRowCol plotBy);


  /**
   * @param gallery Mandatory int parameter.
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(18)
  void autoFormat(
    int gallery,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object format);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(19)
  void setBackgroundPicture(
    java.lang.String fileName);


  /**
   * <p>
   * Getter method for the COM property "DataTable"
   * </p>
   * @return  Returns a value of type ppt.DataTable
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(20)
  ppt.DataTable dataTable();


  /**
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(21)
  void paste(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "BarShape"
   * </p>
   * @return  Returns a value of type ppt.XlBarShape
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(22)
  ppt.XlBarShape barShape();


  /**
   * <p>
   * Setter method for the COM property "BarShape"
   * </p>
   * @param rhs Mandatory ppt.XlBarShape parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(23)
  void barShape(
    ppt.XlBarShape rhs);


  /**
   * @param name Mandatory java.lang.Object parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(24)
  void setDefaultChart(
    @MarshalAs(NativeType.VARIANT) java.lang.Object name);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(25)
  void applyChartTemplate(
    java.lang.String fileName);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(26)
  void saveChartTemplate(
    java.lang.String fileName);


  /**
   * <p>
   * Getter method for the COM property "SideWall"
   * </p>
   * @return  Returns a value of type ppt.Walls
   */

  @DISPID(2377) //= 0x949. The runtime will prefer the VTID if present
  @VTID(27)
  ppt.Walls sideWall();


  /**
   * <p>
   * Getter method for the COM property "BackWall"
   * </p>
   * @return  Returns a value of type ppt.Walls
   */

  @DISPID(2378) //= 0x94a. The runtime will prefer the VTID if present
  @VTID(28)
  ppt.Walls backWall();


  /**
   * <p>
   * Getter method for the COM property "ChartStyle"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2465) //= 0x9a1. The runtime will prefer the VTID if present
  @VTID(29)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object chartStyle();


  /**
   * <p>
   * Setter method for the COM property "ChartStyle"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2465) //= 0x9a1. The runtime will prefer the VTID if present
  @VTID(30)
  void chartStyle(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   */

  @DISPID(2466) //= 0x9a2. The runtime will prefer the VTID if present
  @VTID(31)
  void clearToMatchStyle();


  /**
   * <p>
   * Getter method for the COM property "HasPivotFields"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1815) //= 0x717. The runtime will prefer the VTID if present
  @VTID(32)
  boolean hasPivotFields();


  /**
   * <p>
   * Setter method for the COM property "HasPivotFields"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1815) //= 0x717. The runtime will prefer the VTID if present
  @VTID(33)
  void hasPivotFields(
    boolean rhs);


  /**
   * <p>
   * Setter method for the COM property "ShowDataLabelsOverMaximum"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(34)
  void showDataLabelsOverMaximum(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowDataLabelsOverMaximum"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(35)
  boolean showDataLabelsOverMaximum();


  /**
   * @param layout Mandatory int parameter.
   * @param chartType Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2468) //= 0x9a4. The runtime will prefer the VTID if present
  @VTID(36)
  void applyLayout(
    int layout,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object chartType);


  /**
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(37)
  void refresh();


  /**
   * <p>
   * Getter method for the COM property "ChartData"
   * </p>
   * @return  Returns a value of type ppt.ChartData
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(38)
  ppt.ChartData chartData();


  /**
   * <p>
   * Getter method for the COM property "Shapes"
   * </p>
   * @return  Returns a value of type ppt.Shapes
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(39)
  ppt.Shapes shapes();


  @VTID(39)
  @ReturnValue(defaultPropertyThrough={ppt.Shapes.class})
  ppt.Shape shapes(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(40)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Area3DGroup"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type ppt.ChartGroup
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(41)
  ppt.ChartGroup area3DGroup(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(42)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject areaGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Bar3DGroup"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type ppt.ChartGroup
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(43)
  ppt.ChartGroup bar3DGroup(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(44)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject barGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Column3DGroup"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type ppt.ChartGroup
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(45)
  ppt.ChartGroup column3DGroup(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(46)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject columnGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Line3DGroup"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type ppt.ChartGroup
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(47)
  ppt.ChartGroup line3DGroup(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(48)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject lineGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Pie3DGroup"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type ppt.ChartGroup
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(49)
  ppt.ChartGroup pie3DGroup(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(50)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject pieGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(51)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject doughnutGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(52)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject radarGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "SurfaceGroup"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type ppt.ChartGroup
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(53)
  ppt.ChartGroup surfaceGroup(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(54)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject xyGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(55)
  ppt._Application application();


  /**
   * @param type Optional parameter. Default value is 2
   * @param legendKey Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasLeaderLines Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(56)
  void _ApplyDataLabels(
    @Optional @DefaultValue("2") ppt.XlDataLabelsType type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object legendKey,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object autoText,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object hasLeaderLines,
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "AutoScaling"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(57)
  void autoScaling(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoScaling"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(58)
  boolean autoScaling(
    @LCID int lcid);


  /**
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param axisGroup Optional parameter. Default value is 1
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(59)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject axes(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type,
    @Optional @DefaultValue("1") ppt.XlAxisGroup axisGroup,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ChartArea"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type ppt.ChartArea
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(60)
  ppt.ChartArea chartArea(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2018) //= 0x7e2. The runtime will prefer the VTID if present
  @VTID(61)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject chartGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ChartTitle"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type ppt.ChartTitle
   */

  @DISPID(2019) //= 0x7e3. The runtime will prefer the VTID if present
  @VTID(62)
  ppt.ChartTitle chartTitle(
    @LCID int lcid);


  /**
   * @param source Optional parameter. Default value is com4j.Variant.getMissing()
   * @param gallery Optional parameter. Default value is com4j.Variant.getMissing()
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @param plotBy Optional parameter. Default value is com4j.Variant.getMissing()
   * @param categoryLabels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param seriesLabels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasLegend Optional parameter. Default value is com4j.Variant.getMissing()
   * @param title Optional parameter. Default value is com4j.Variant.getMissing()
   * @param categoryTitle Optional parameter. Default value is com4j.Variant.getMissing()
   * @param valueTitle Optional parameter. Default value is com4j.Variant.getMissing()
   * @param extraTitle Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(2020) //= 0x7e4. The runtime will prefer the VTID if present
  @VTID(63)
  void chartWizard(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object source,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object gallery,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object format,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object plotBy,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object categoryLabels,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object seriesLabels,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object hasLegend,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object title,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object categoryTitle,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object valueTitle,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object extraTitle,
    @LCID int lcid);


  /**
   * @param before Optional parameter. Default value is com4j.Variant.getMissing()
   * @param after Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(2021) //= 0x7e5. The runtime will prefer the VTID if present
  @VTID(64)
  void copy(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object before,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object after,
    @LCID int lcid);


  /**
   * @param appearance Optional parameter. Default value is 1
   * @param format Optional parameter. Default value is -4147
   * @param size Optional parameter. Default value is 2
   * @param localeID Mandatory int parameter.
   */

  @DISPID(2022) //= 0x7e6. The runtime will prefer the VTID if present
  @VTID(65)
  void copyPicture(
    @Optional @DefaultValue("1") ppt.XlPictureAppearance appearance,
    @Optional @DefaultValue("-4147") ppt.XlCopyPictureFormat format,
    @Optional @DefaultValue("2") ppt.XlPictureAppearance size,
    @LCID int localeID);


  /**
   * <p>
   * Getter method for the COM property "Corners"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type ppt.Corners
   */

  @DISPID(2023) //= 0x7e7. The runtime will prefer the VTID if present
  @VTID(66)
  ppt.Corners corners(
    @LCID int lcid);


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(2024) //= 0x7e8. The runtime will prefer the VTID if present
  @VTID(67)
  void delete(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "DepthPercent"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(2025) //= 0x7e9. The runtime will prefer the VTID if present
  @VTID(68)
  int depthPercent(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DepthPercent"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2025) //= 0x7e9. The runtime will prefer the VTID if present
  @VTID(69)
  void depthPercent(
    @LCID int lcid,
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayBlanksAs"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type ppt.XlDisplayBlanksAs
   */

  @DISPID(2026) //= 0x7ea. The runtime will prefer the VTID if present
  @VTID(70)
  ppt.XlDisplayBlanksAs displayBlanksAs(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DisplayBlanksAs"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory ppt.XlDisplayBlanksAs parameter.
   */

  @DISPID(2026) //= 0x7ea. The runtime will prefer the VTID if present
  @VTID(71)
  void displayBlanksAs(
    @LCID int lcid,
    ppt.XlDisplayBlanksAs rhs);


  /**
   * <p>
   * Getter method for the COM property "Elevation"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(2027) //= 0x7eb. The runtime will prefer the VTID if present
  @VTID(72)
  int elevation(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Elevation"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2027) //= 0x7eb. The runtime will prefer the VTID if present
  @VTID(73)
  void elevation(
    @LCID int lcid,
    int rhs);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param filterName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param interactive Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(2028) //= 0x7ec. The runtime will prefer the VTID if present
  @VTID(74)
  boolean export(
    java.lang.String fileName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filterName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object interactive);


  /**
   * <p>
   * Getter method for the COM property "Floor"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type ppt.Floor
   */

  @DISPID(2029) //= 0x7ed. The runtime will prefer the VTID if present
  @VTID(75)
  ppt.Floor floor(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "GapDepth"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(2030) //= 0x7ee. The runtime will prefer the VTID if present
  @VTID(76)
  int gapDepth(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "GapDepth"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2030) //= 0x7ee. The runtime will prefer the VTID if present
  @VTID(77)
  void gapDepth(
    @LCID int lcid,
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "HasAxis"
   * </p>
   * @param index1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param index2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2031) //= 0x7ef. The runtime will prefer the VTID if present
  @VTID(78)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object hasAxis(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index2,
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "HasAxis"
   * </p>
   * @param index1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param index2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2031) //= 0x7ef. The runtime will prefer the VTID if present
  @VTID(79)
  void hasAxis(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index2,
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "HasLegend"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(2032) //= 0x7f0. The runtime will prefer the VTID if present
  @VTID(80)
  boolean hasLegend(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "HasLegend"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2032) //= 0x7f0. The runtime will prefer the VTID if present
  @VTID(81)
  void hasLegend(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasTitle"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(2033) //= 0x7f1. The runtime will prefer the VTID if present
  @VTID(82)
  boolean hasTitle(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "HasTitle"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2033) //= 0x7f1. The runtime will prefer the VTID if present
  @VTID(83)
  void hasTitle(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HeightPercent"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(2034) //= 0x7f2. The runtime will prefer the VTID if present
  @VTID(84)
  int heightPercent(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "HeightPercent"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2034) //= 0x7f2. The runtime will prefer the VTID if present
  @VTID(85)
  void heightPercent(
    @LCID int lcid,
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Legend"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type ppt.Legend
   */

  @DISPID(2035) //= 0x7f3. The runtime will prefer the VTID if present
  @VTID(86)
  ppt.Legend legend(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2036) //= 0x7f4. The runtime will prefer the VTID if present
  @VTID(87)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2036) //= 0x7f4. The runtime will prefer the VTID if present
  @VTID(88)
  void name(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Perspective"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(2037) //= 0x7f5. The runtime will prefer the VTID if present
  @VTID(89)
  int perspective(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Perspective"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2037) //= 0x7f5. The runtime will prefer the VTID if present
  @VTID(90)
  void perspective(
    @LCID int lcid,
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "PlotArea"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type ppt.PlotArea
   */

  @DISPID(2038) //= 0x7f6. The runtime will prefer the VTID if present
  @VTID(91)
  ppt.PlotArea plotArea(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "PlotVisibleOnly"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(2039) //= 0x7f7. The runtime will prefer the VTID if present
  @VTID(92)
  boolean plotVisibleOnly(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "PlotVisibleOnly"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2039) //= 0x7f7. The runtime will prefer the VTID if present
  @VTID(93)
  void plotVisibleOnly(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RightAngleAxes"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2040) //= 0x7f8. The runtime will prefer the VTID if present
  @VTID(94)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object rightAngleAxes(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "RightAngleAxes"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2040) //= 0x7f8. The runtime will prefer the VTID if present
  @VTID(95)
  void rightAngleAxes(
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Rotation"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2041) //= 0x7f9. The runtime will prefer the VTID if present
  @VTID(96)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object rotation(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Rotation"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2041) //= 0x7f9. The runtime will prefer the VTID if present
  @VTID(97)
  void rotation(
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(2042) //= 0x7fa. The runtime will prefer the VTID if present
  @VTID(98)
  void select(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object replace,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2043) //= 0x7fb. The runtime will prefer the VTID if present
  @VTID(99)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject seriesCollection(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param element Mandatory office.MsoChartElementType parameter.
   */

  @DISPID(2044) //= 0x7fc. The runtime will prefer the VTID if present
  @VTID(100)
  void setElement(
    office.MsoChartElementType element);


  /**
   * <p>
   * Getter method for the COM property "Subtype"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(2045) //= 0x7fd. The runtime will prefer the VTID if present
  @VTID(101)
  int subtype(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Subtype"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2045) //= 0x7fd. The runtime will prefer the VTID if present
  @VTID(102)
  void subtype(
    @LCID int lcid,
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(2046) //= 0x7fe. The runtime will prefer the VTID if present
  @VTID(103)
  int type(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2046) //= 0x7fe. The runtime will prefer the VTID if present
  @VTID(104)
  void type(
    @LCID int lcid,
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Walls"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type ppt.Walls
   */

  @DISPID(2047) //= 0x7ff. The runtime will prefer the VTID if present
  @VTID(105)
  ppt.Walls walls(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type ppt.ChartFormat
   */

  @DISPID(2048) //= 0x800. The runtime will prefer the VTID if present
  @VTID(106)
  ppt.ChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "ShowReportFilterFieldButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2049) //= 0x801. The runtime will prefer the VTID if present
  @VTID(107)
  boolean showReportFilterFieldButtons();


  /**
   * <p>
   * Setter method for the COM property "ShowReportFilterFieldButtons"
   * </p>
   * @param res Mandatory boolean parameter.
   */

  @DISPID(2049) //= 0x801. The runtime will prefer the VTID if present
  @VTID(108)
  void showReportFilterFieldButtons(
    boolean res);


  /**
   * <p>
   * Getter method for the COM property "ShowLegendFieldButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2050) //= 0x802. The runtime will prefer the VTID if present
  @VTID(109)
  boolean showLegendFieldButtons();


  /**
   * <p>
   * Setter method for the COM property "ShowLegendFieldButtons"
   * </p>
   * @param res Mandatory boolean parameter.
   */

  @DISPID(2050) //= 0x802. The runtime will prefer the VTID if present
  @VTID(110)
  void showLegendFieldButtons(
    boolean res);


  /**
   * <p>
   * Getter method for the COM property "ShowAxisFieldButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2051) //= 0x803. The runtime will prefer the VTID if present
  @VTID(111)
  boolean showAxisFieldButtons();


  /**
   * <p>
   * Setter method for the COM property "ShowAxisFieldButtons"
   * </p>
   * @param res Mandatory boolean parameter.
   */

  @DISPID(2051) //= 0x803. The runtime will prefer the VTID if present
  @VTID(112)
  void showAxisFieldButtons(
    boolean res);


  /**
   * <p>
   * Getter method for the COM property "ShowValueFieldButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2052) //= 0x804. The runtime will prefer the VTID if present
  @VTID(113)
  boolean showValueFieldButtons();


  /**
   * <p>
   * Setter method for the COM property "ShowValueFieldButtons"
   * </p>
   * @param res Mandatory boolean parameter.
   */

  @DISPID(2052) //= 0x804. The runtime will prefer the VTID if present
  @VTID(114)
  void showValueFieldButtons(
    boolean res);


  /**
   * <p>
   * Getter method for the COM property "ShowAllFieldButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2053) //= 0x805. The runtime will prefer the VTID if present
  @VTID(115)
  boolean showAllFieldButtons();


  /**
   * <p>
   * Setter method for the COM property "ShowAllFieldButtons"
   * </p>
   * @param res Mandatory boolean parameter.
   */

  @DISPID(2053) //= 0x805. The runtime will prefer the VTID if present
  @VTID(116)
  void showAllFieldButtons(
    boolean res);


  /**
   * <p>
   * Getter method for the COM property "AlternativeText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2054) //= 0x806. The runtime will prefer the VTID if present
  @VTID(117)
  java.lang.String alternativeText();


  /**
   * <p>
   * Setter method for the COM property "AlternativeText"
   * </p>
   * @param alternativeText Mandatory java.lang.String parameter.
   */

  @DISPID(2054) //= 0x806. The runtime will prefer the VTID if present
  @VTID(118)
  void alternativeText(
    java.lang.String alternativeText);


  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2055) //= 0x807. The runtime will prefer the VTID if present
  @VTID(119)
  java.lang.String title();


  /**
   * <p>
   * Setter method for the COM property "Title"
   * </p>
   * @param title Mandatory java.lang.String parameter.
   */

  @DISPID(2055) //= 0x807. The runtime will prefer the VTID if present
  @VTID(120)
  void title(
    java.lang.String title);


  // Properties:
}
