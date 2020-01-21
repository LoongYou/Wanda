package office  ;

import com4j.*;

@IID("{000C1709-0000-0000-C000-000000000046}")
public interface IMsoChart extends Com4jObject {
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
   * <p>
   * Setter method for the COM property "HasTitle"
   * </p>
   * @param fTitle Mandatory boolean parameter.
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  void hasTitle(
    boolean fTitle);


  /**
   * <p>
   * Getter method for the COM property "HasTitle"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(9)
  boolean hasTitle();


  /**
   * <p>
   * Getter method for the COM property "ChartTitle"
   * </p>
   * @return  Returns a value of type office.IMsoChartTitle
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  office.IMsoChartTitle chartTitle();


  /**
   * <p>
   * Getter method for the COM property "DepthPercent"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  int depthPercent();


  /**
   * <p>
   * Setter method for the COM property "DepthPercent"
   * </p>
   * @param pwDepthPercent Mandatory int parameter.
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(12)
  void depthPercent(
    int pwDepthPercent);


  /**
   * <p>
   * Getter method for the COM property "Elevation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  int elevation();


  /**
   * <p>
   * Setter method for the COM property "Elevation"
   * </p>
   * @param pwElevation Mandatory int parameter.
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(14)
  void elevation(
    int pwElevation);


  /**
   * <p>
   * Getter method for the COM property "GapDepth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  int gapDepth();


  /**
   * <p>
   * Setter method for the COM property "GapDepth"
   * </p>
   * @param pwGapDepth Mandatory int parameter.
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(16)
  void gapDepth(
    int pwGapDepth);


  /**
   * <p>
   * Getter method for the COM property "HeightPercent"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  int heightPercent();


  /**
   * <p>
   * Setter method for the COM property "HeightPercent"
   * </p>
   * @param pwHeightPercent Mandatory int parameter.
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(18)
  void heightPercent(
    int pwHeightPercent);


  /**
   * <p>
   * Getter method for the COM property "Perspective"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(19)
  int perspective();


  /**
   * <p>
   * Setter method for the COM property "Perspective"
   * </p>
   * @param pwPerspective Mandatory int parameter.
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(20)
  void perspective(
    int pwPerspective);


  /**
   * <p>
   * Getter method for the COM property "RightAngleAxes"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743822) //= 0x6002000e. The runtime will prefer the VTID if present
  @VTID(21)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object rightAngleAxes();


  /**
   * <p>
   * Setter method for the COM property "RightAngleAxes"
   * </p>
   * @param pvarRightAngleAxes Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743822) //= 0x6002000e. The runtime will prefer the VTID if present
  @VTID(22)
  void rightAngleAxes(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pvarRightAngleAxes);


  /**
   * <p>
   * Getter method for the COM property "Rotation"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743824) //= 0x60020010. The runtime will prefer the VTID if present
  @VTID(23)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object rotation();


  /**
   * <p>
   * Setter method for the COM property "Rotation"
   * </p>
   * @param pvarRotation Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743824) //= 0x60020010. The runtime will prefer the VTID if present
  @VTID(24)
  void rotation(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pvarRotation);


  /**
   * <p>
   * Setter method for the COM property "DisplayBlanksAs"
   * </p>
   * @param pres Mandatory office.XlDisplayBlanksAs parameter.
   */

  @DISPID(1610743826) //= 0x60020012. The runtime will prefer the VTID if present
  @VTID(25)
  void displayBlanksAs(
    office.XlDisplayBlanksAs pres);


  /**
   * <p>
   * Getter method for the COM property "DisplayBlanksAs"
   * </p>
   * @return  Returns a value of type office.XlDisplayBlanksAs
   */

  @DISPID(1610743826) //= 0x60020012. The runtime will prefer the VTID if present
  @VTID(26)
  office.XlDisplayBlanksAs displayBlanksAs();


  /**
   * <p>
   * Setter method for the COM property "ProtectData"
   * </p>
   * @param pres Mandatory boolean parameter.
   */

  @DISPID(1610743828) //= 0x60020014. The runtime will prefer the VTID if present
  @VTID(27)
  void protectData(
    boolean pres);


  /**
   * <p>
   * Getter method for the COM property "ProtectData"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743828) //= 0x60020014. The runtime will prefer the VTID if present
  @VTID(28)
  boolean protectData();


  /**
   * <p>
   * Setter method for the COM property "ProtectFormatting"
   * </p>
   * @param pres Mandatory boolean parameter.
   */

  @DISPID(1610743830) //= 0x60020016. The runtime will prefer the VTID if present
  @VTID(29)
  void protectFormatting(
    boolean pres);


  /**
   * <p>
   * Getter method for the COM property "ProtectFormatting"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743830) //= 0x60020016. The runtime will prefer the VTID if present
  @VTID(30)
  boolean protectFormatting();


  /**
   * <p>
   * Setter method for the COM property "ProtectGoalSeek"
   * </p>
   * @param pres Mandatory boolean parameter.
   */

  @DISPID(1610743832) //= 0x60020018. The runtime will prefer the VTID if present
  @VTID(31)
  void protectGoalSeek(
    boolean pres);


  /**
   * <p>
   * Getter method for the COM property "ProtectGoalSeek"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743832) //= 0x60020018. The runtime will prefer the VTID if present
  @VTID(32)
  boolean protectGoalSeek();


  /**
   * <p>
   * Setter method for the COM property "ProtectSelection"
   * </p>
   * @param pres Mandatory boolean parameter.
   */

  @DISPID(1610743834) //= 0x6002001a. The runtime will prefer the VTID if present
  @VTID(33)
  void protectSelection(
    boolean pres);


  /**
   * <p>
   * Getter method for the COM property "ProtectSelection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743834) //= 0x6002001a. The runtime will prefer the VTID if present
  @VTID(34)
  boolean protectSelection();


  /**
   * <p>
   * Setter method for the COM property "ProtectChartObjects"
   * </p>
   * @param pres Mandatory boolean parameter.
   */

  @DISPID(1610743836) //= 0x6002001c. The runtime will prefer the VTID if present
  @VTID(35)
  void protectChartObjects(
    boolean pres);


  /**
   * <p>
   * Getter method for the COM property "ProtectChartObjects"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743836) //= 0x6002001c. The runtime will prefer the VTID if present
  @VTID(36)
  boolean protectChartObjects();


  /**
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1610743838) //= 0x6002001e. The runtime will prefer the VTID if present
  @VTID(37)
  void unProtect(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password);


  /**
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param drawingObjects Optional parameter. Default value is com4j.Variant.getMissing()
   * @param contents Optional parameter. Default value is com4j.Variant.getMissing()
   * @param scenarios Optional parameter. Default value is com4j.Variant.getMissing()
   * @param userInterfaceOnly Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1610743839) //= 0x6002001f. The runtime will prefer the VTID if present
  @VTID(38)
  void protect(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object drawingObjects,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object contents,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object scenarios,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object userInterfaceOnly);


  /**
   * <p>
   * Getter method for the COM property "ChartGroups"
   * </p>
   * @param pvarIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param varIgallery Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(39)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject chartGroups(
    @Optional java.lang.Object pvarIndex,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varIgallery,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(68) //= 0x44. The runtime will prefer the VTID if present
  @VTID(40)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject seriesCollection(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param type Optional parameter. Default value is 2
   * @param iMsoLegendKey Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasLeaderLines Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(151) //= 0x97. The runtime will prefer the VTID if present
  @VTID(41)
  void _ApplyDataLabels(
    @Optional @DefaultValue("2") office.XlDataLabelsType type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object iMsoLegendKey,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object autoText,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object hasLeaderLines);


  /**
   * <p>
   * Getter method for the COM property "SubType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(42)
  int subType();


  /**
   * <p>
   * Setter method for the COM property "SubType"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(43)
  void subType(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(44)
  int type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(45)
  void type(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Corners"
   * </p>
   * @return  Returns a value of type office.IMsoCorners
   */

  @DISPID(79) //= 0x4f. The runtime will prefer the VTID if present
  @VTID(46)
  office.IMsoCorners corners();


  /**
   * @param type Optional parameter. Default value is 2
   * @param iMsoLegendKey Optional parameter. Default value is com4j.Variant.getMissing()
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
  @VTID(47)
  void applyDataLabels(
    @Optional @DefaultValue("2") office.XlDataLabelsType type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object iMsoLegendKey,
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
  @VTID(48)
  office.XlChartType chartType();


  /**
   * <p>
   * Setter method for the COM property "ChartType"
   * </p>
   * @param rhs Mandatory office.XlChartType parameter.
   */

  @DISPID(1400) //= 0x578. The runtime will prefer the VTID if present
  @VTID(49)
  void chartType(
    office.XlChartType rhs);


  /**
   * <p>
   * Getter method for the COM property "HasDataTable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1396) //= 0x574. The runtime will prefer the VTID if present
  @VTID(50)
  boolean hasDataTable();


  /**
   * <p>
   * Setter method for the COM property "HasDataTable"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1396) //= 0x574. The runtime will prefer the VTID if present
  @VTID(51)
  void hasDataTable(
    boolean rhs);


  /**
   * @param chartType Mandatory office.XlChartType parameter.
   * @param typeName Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1401) //= 0x579. The runtime will prefer the VTID if present
  @VTID(52)
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
  @VTID(53)
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
  @VTID(54)
  void setSourceData(
    java.lang.String source,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object plotBy);


  /**
   * <p>
   * Getter method for the COM property "PlotBy"
   * </p>
   * @return  Returns a value of type office.XlRowCol
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(55)
  office.XlRowCol plotBy();


  /**
   * <p>
   * Setter method for the COM property "PlotBy"
   * </p>
   * @param plotBy Mandatory office.XlRowCol parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(56)
  void plotBy(
    office.XlRowCol plotBy);


  /**
   * <p>
   * Getter method for the COM property "HasLegend"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(53) //= 0x35. The runtime will prefer the VTID if present
  @VTID(57)
  boolean hasLegend();


  /**
   * <p>
   * Setter method for the COM property "HasLegend"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(53) //= 0x35. The runtime will prefer the VTID if present
  @VTID(58)
  void hasLegend(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Legend"
   * </p>
   * @return  Returns a value of type office.IMsoLegend
   */

  @DISPID(84) //= 0x54. The runtime will prefer the VTID if present
  @VTID(59)
  office.IMsoLegend legend();


  /**
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param axisGroup Optional parameter. Default value is 1
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610743861) //= 0x60020035. The runtime will prefer the VTID if present
  @VTID(60)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject axes(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type,
    @Optional @DefaultValue("1") office.XlAxisGroup axisGroup);


  /**
   * <p>
   * Setter method for the COM property "HasAxis"
   * </p>
   * @param axisType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param axisGroup Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pval Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743862) //= 0x60020036. The runtime will prefer the VTID if present
  @VTID(61)
  void hasAxis(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object axisType,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object axisGroup,
    @MarshalAs(NativeType.VARIANT) java.lang.Object pval);


  /**
   * <p>
   * Getter method for the COM property "HasAxis"
   * </p>
   * @param axisType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param axisGroup Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743862) //= 0x60020036. The runtime will prefer the VTID if present
  @VTID(62)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object hasAxis(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object axisType,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object axisGroup);


  /**
   * <p>
   * Getter method for the COM property "Walls"
   * </p>
   * @param fBackWall Optional parameter. Default value is false
   * @return  Returns a value of type office.IMsoWalls
   */

  @DISPID(1610743864) //= 0x60020038. The runtime will prefer the VTID if present
  @VTID(63)
  office.IMsoWalls walls(
    @Optional @DefaultValue("-1") boolean fBackWall);


  /**
   * <p>
   * Getter method for the COM property "Floor"
   * </p>
   * @return  Returns a value of type office.IMsoFloor
   */

  @DISPID(1610743865) //= 0x60020039. The runtime will prefer the VTID if present
  @VTID(64)
  office.IMsoFloor floor();


  /**
   * <p>
   * Getter method for the COM property "PlotArea"
   * </p>
   * @return  Returns a value of type office.IMsoPlotArea
   */

  @DISPID(1610743866) //= 0x6002003a. The runtime will prefer the VTID if present
  @VTID(65)
  office.IMsoPlotArea plotArea();


  /**
   * <p>
   * Getter method for the COM property "PlotVisibleOnly"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(92) //= 0x5c. The runtime will prefer the VTID if present
  @VTID(66)
  boolean plotVisibleOnly();


  /**
   * <p>
   * Setter method for the COM property "PlotVisibleOnly"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(92) //= 0x5c. The runtime will prefer the VTID if present
  @VTID(67)
  void plotVisibleOnly(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ChartArea"
   * </p>
   * @return  Returns a value of type office.IMsoChartArea
   */

  @DISPID(1610743869) //= 0x6002003d. The runtime will prefer the VTID if present
  @VTID(68)
  office.IMsoChartArea chartArea();


  /**
   * @param rGallery Mandatory int parameter.
   * @param varFormat Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1610743870) //= 0x6002003e. The runtime will prefer the VTID if present
  @VTID(69)
  void autoFormat(
    int rGallery,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varFormat);


  /**
   * <p>
   * Getter method for the COM property "AutoScaling"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743871) //= 0x6002003f. The runtime will prefer the VTID if present
  @VTID(70)
  boolean autoScaling();


  /**
   * <p>
   * Setter method for the COM property "AutoScaling"
   * </p>
   * @param f Mandatory boolean parameter.
   */

  @DISPID(1610743871) //= 0x6002003f. The runtime will prefer the VTID if present
  @VTID(71)
  void autoScaling(
    boolean f);


  /**
   * @param bstr Mandatory java.lang.String parameter.
   */

  @DISPID(1610743873) //= 0x60020041. The runtime will prefer the VTID if present
  @VTID(72)
  void setBackgroundPicture(
    java.lang.String bstr);


  /**
   * @param varSource Optional parameter. Default value is com4j.Variant.getMissing()
   * @param varGallery Optional parameter. Default value is com4j.Variant.getMissing()
   * @param varFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param varPlotBy Optional parameter. Default value is com4j.Variant.getMissing()
   * @param varCategoryLabels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param varSeriesLabels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param varHasLegend Optional parameter. Default value is com4j.Variant.getMissing()
   * @param varTitle Optional parameter. Default value is com4j.Variant.getMissing()
   * @param varCategoryTitle Optional parameter. Default value is com4j.Variant.getMissing()
   * @param varValueTitle Optional parameter. Default value is com4j.Variant.getMissing()
   * @param varExtraTitle Optional parameter. Default value is com4j.Variant.getMissing()
   * @param localeID Mandatory int parameter.
   */

  @DISPID(1610743874) //= 0x60020042. The runtime will prefer the VTID if present
  @VTID(73)
  void chartWizard(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varSource,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varGallery,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varFormat,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varPlotBy,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varCategoryLabels,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varSeriesLabels,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varHasLegend,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varTitle,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varCategoryTitle,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varValueTitle,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varExtraTitle,
    @LCID int localeID);


  /**
   * @param appearance Optional parameter. Default value is 1
   * @param format Optional parameter. Default value is -4147
   * @param size Optional parameter. Default value is 2
   * @param localeID Mandatory int parameter.
   */

  @DISPID(1610743875) //= 0x60020043. The runtime will prefer the VTID if present
  @VTID(74)
  void copyPicture(
    @Optional @DefaultValue("1") int appearance,
    @Optional @DefaultValue("-4147") int format,
    @Optional @DefaultValue("2") int size,
    @LCID int localeID);


  /**
   * <p>
   * Getter method for the COM property "DataTable"
   * </p>
   * @return  Returns a value of type office.IMsoDataTable
   */

  @DISPID(1610743876) //= 0x60020044. The runtime will prefer the VTID if present
  @VTID(75)
  office.IMsoDataTable dataTable();


  /**
   * @param varName Mandatory java.lang.Object parameter.
   * @param localeID Mandatory int parameter.
   * @param objType Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743877) //= 0x60020045. The runtime will prefer the VTID if present
  @VTID(76)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object evaluate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object varName,
    int localeID,
    Holder<Integer> objType);


  /**
   * @param varName Mandatory java.lang.Object parameter.
   * @param localeID Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743878) //= 0x60020046. The runtime will prefer the VTID if present
  @VTID(77)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object _Evaluate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object varName,
    int localeID);


  /**
   * @param varType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param localeID Mandatory int parameter.
   */

  @DISPID(1610743879) //= 0x60020047. The runtime will prefer the VTID if present
  @VTID(78)
  void paste(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varType,
    @LCID int localeID);


  /**
   * <p>
   * Getter method for the COM property "BarShape"
   * </p>
   * @return  Returns a value of type office.XlBarShape
   */

  @DISPID(1610743880) //= 0x60020048. The runtime will prefer the VTID if present
  @VTID(79)
  office.XlBarShape barShape();


  /**
   * <p>
   * Setter method for the COM property "BarShape"
   * </p>
   * @param pShape Mandatory office.XlBarShape parameter.
   */

  @DISPID(1610743880) //= 0x60020048. The runtime will prefer the VTID if present
  @VTID(80)
  void barShape(
    office.XlBarShape pShape);


  /**
   * @param bstr Mandatory java.lang.String parameter.
   * @param varFilterName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param varInteractive Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743882) //= 0x6002004a. The runtime will prefer the VTID if present
  @VTID(81)
  boolean export(
    java.lang.String bstr,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varFilterName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varInteractive);


  /**
   * @param varName Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743883) //= 0x6002004b. The runtime will prefer the VTID if present
  @VTID(82)
  void setDefaultChart(
    @MarshalAs(NativeType.VARIANT) java.lang.Object varName);


  /**
   * @param bstrFileName Mandatory java.lang.String parameter.
   */

  @DISPID(1610743884) //= 0x6002004c. The runtime will prefer the VTID if present
  @VTID(83)
  void applyChartTemplate(
    java.lang.String bstrFileName);


  /**
   * @param bstrFileName Mandatory java.lang.String parameter.
   */

  @DISPID(1610743885) //= 0x6002004d. The runtime will prefer the VTID if present
  @VTID(84)
  void saveChartTemplate(
    java.lang.String bstrFileName);


  /**
   * <p>
   * Getter method for the COM property "SideWall"
   * </p>
   * @return  Returns a value of type office.IMsoWalls
   */

  @DISPID(2377) //= 0x949. The runtime will prefer the VTID if present
  @VTID(85)
  office.IMsoWalls sideWall();


  /**
   * <p>
   * Getter method for the COM property "BackWall"
   * </p>
   * @return  Returns a value of type office.IMsoWalls
   */

  @DISPID(2378) //= 0x94a. The runtime will prefer the VTID if present
  @VTID(86)
  office.IMsoWalls backWall();


  /**
   * <p>
   * Getter method for the COM property "ChartStyle"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2465) //= 0x9a1. The runtime will prefer the VTID if present
  @VTID(87)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object chartStyle();


  /**
   * <p>
   * Setter method for the COM property "ChartStyle"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2465) //= 0x9a1. The runtime will prefer the VTID if present
  @VTID(88)
  void chartStyle(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   */

  @DISPID(2466) //= 0x9a2. The runtime will prefer the VTID if present
  @VTID(89)
  void clearToMatchStyle();


  /**
   * <p>
   * Getter method for the COM property "PivotLayout"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1814) //= 0x716. The runtime will prefer the VTID if present
  @VTID(90)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject pivotLayout();


  /**
   * <p>
   * Getter method for the COM property "HasPivotFields"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1815) //= 0x717. The runtime will prefer the VTID if present
  @VTID(91)
  boolean hasPivotFields();


  /**
   * <p>
   * Setter method for the COM property "HasPivotFields"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1815) //= 0x717. The runtime will prefer the VTID if present
  @VTID(92)
  void hasPivotFields(
    boolean rhs);


  /**
   */

  @DISPID(1610743894) //= 0x60020056. The runtime will prefer the VTID if present
  @VTID(93)
  void refreshPivotTable();


  /**
   * <p>
   * Setter method for the COM property "ShowDataLabelsOverMaximum"
   * </p>
   * @param pRHS Mandatory boolean parameter.
   */

  @DISPID(1610743895) //= 0x60020057. The runtime will prefer the VTID if present
  @VTID(94)
  void showDataLabelsOverMaximum(
    boolean pRHS);


  /**
   * <p>
   * Getter method for the COM property "ShowDataLabelsOverMaximum"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743895) //= 0x60020057. The runtime will prefer the VTID if present
  @VTID(95)
  boolean showDataLabelsOverMaximum();


  /**
   * @param layout Mandatory int parameter.
   * @param varChartType Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2468) //= 0x9a4. The runtime will prefer the VTID if present
  @VTID(96)
  void applyLayout(
    int layout,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varChartType);


  /**
   * <p>
   * Getter method for the COM property "Selection"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610743898) //= 0x6002005a. The runtime will prefer the VTID if present
  @VTID(97)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject selection();


  /**
   */

  @DISPID(1610743899) //= 0x6002005b. The runtime will prefer the VTID if present
  @VTID(98)
  void refresh();


  /**
   * @param rhs Mandatory office.MsoChartElementType parameter.
   */

  @DISPID(1610743900) //= 0x6002005c. The runtime will prefer the VTID if present
  @VTID(99)
  void setElement(
    office.MsoChartElementType rhs);


  /**
   * <p>
   * Getter method for the COM property "ChartData"
   * </p>
   * @return  Returns a value of type office.IMsoChartData
   */

  @DISPID(1610743901) //= 0x6002005d. The runtime will prefer the VTID if present
  @VTID(100)
  office.IMsoChartData chartData();


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type office.IMsoChartFormat
   */

  @DISPID(1610743902) //= 0x6002005e. The runtime will prefer the VTID if present
  @VTID(101)
  office.IMsoChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "Shapes"
   * </p>
   * @return  Returns a value of type office.Shapes
   */

  @DISPID(1610743903) //= 0x6002005f. The runtime will prefer the VTID if present
  @VTID(102)
  office.Shapes shapes();


  @VTID(102)
  @ReturnValue(defaultPropertyThrough={office.Shapes.class})
  office.Shape shapes(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(103)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(104)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Area3DGroup"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type office.IMsoChartGroup
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(105)
  office.IMsoChartGroup area3DGroup(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(106)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject areaGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Bar3DGroup"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type office.IMsoChartGroup
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(107)
  office.IMsoChartGroup bar3DGroup(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(108)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject barGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Column3DGroup"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type office.IMsoChartGroup
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(109)
  office.IMsoChartGroup column3DGroup(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(110)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject columnGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Line3DGroup"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type office.IMsoChartGroup
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(111)
  office.IMsoChartGroup line3DGroup(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(112)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject lineGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Pie3DGroup"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type office.IMsoChartGroup
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(113)
  office.IMsoChartGroup pie3DGroup(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(114)
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
  @VTID(115)
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
  @VTID(116)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject radarGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "SurfaceGroup"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type office.IMsoChartGroup
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(117)
  office.IMsoChartGroup surfaceGroup(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(118)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject xyGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(119)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object delete();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(551) //= 0x227. The runtime will prefer the VTID if present
  @VTID(120)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object copy();


  /**
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(235) //= 0xeb. The runtime will prefer the VTID if present
  @VTID(121)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object replace);


  /**
   * <p>
   * Getter method for the COM property "ShowReportFilterFieldButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743923) //= 0x60020073. The runtime will prefer the VTID if present
  @VTID(122)
  boolean showReportFilterFieldButtons();


  /**
   * <p>
   * Setter method for the COM property "ShowReportFilterFieldButtons"
   * </p>
   * @param res Mandatory boolean parameter.
   */

  @DISPID(1610743923) //= 0x60020073. The runtime will prefer the VTID if present
  @VTID(123)
  void showReportFilterFieldButtons(
    boolean res);


  /**
   * <p>
   * Getter method for the COM property "ShowLegendFieldButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743925) //= 0x60020075. The runtime will prefer the VTID if present
  @VTID(124)
  boolean showLegendFieldButtons();


  /**
   * <p>
   * Setter method for the COM property "ShowLegendFieldButtons"
   * </p>
   * @param res Mandatory boolean parameter.
   */

  @DISPID(1610743925) //= 0x60020075. The runtime will prefer the VTID if present
  @VTID(125)
  void showLegendFieldButtons(
    boolean res);


  /**
   * <p>
   * Getter method for the COM property "ShowAxisFieldButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743927) //= 0x60020077. The runtime will prefer the VTID if present
  @VTID(126)
  boolean showAxisFieldButtons();


  /**
   * <p>
   * Setter method for the COM property "ShowAxisFieldButtons"
   * </p>
   * @param res Mandatory boolean parameter.
   */

  @DISPID(1610743927) //= 0x60020077. The runtime will prefer the VTID if present
  @VTID(127)
  void showAxisFieldButtons(
    boolean res);


  /**
   * <p>
   * Getter method for the COM property "ShowValueFieldButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743929) //= 0x60020079. The runtime will prefer the VTID if present
  @VTID(128)
  boolean showValueFieldButtons();


  /**
   * <p>
   * Setter method for the COM property "ShowValueFieldButtons"
   * </p>
   * @param res Mandatory boolean parameter.
   */

  @DISPID(1610743929) //= 0x60020079. The runtime will prefer the VTID if present
  @VTID(129)
  void showValueFieldButtons(
    boolean res);


  /**
   * <p>
   * Getter method for the COM property "ShowAllFieldButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743931) //= 0x6002007b. The runtime will prefer the VTID if present
  @VTID(130)
  boolean showAllFieldButtons();


  /**
   * <p>
   * Setter method for the COM property "ShowAllFieldButtons"
   * </p>
   * @param res Mandatory boolean parameter.
   */

  @DISPID(1610743931) //= 0x6002007b. The runtime will prefer the VTID if present
  @VTID(131)
  void showAllFieldButtons(
    boolean res);


  // Properties:
}
