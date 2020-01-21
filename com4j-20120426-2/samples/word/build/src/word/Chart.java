package word  ;

import com4j.*;

@IID("{6FFA84BB-A350-4442-BB53-A43653459A84}")
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
   * <p>
   * Getter method for the COM property "HasTitle"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  boolean hasTitle(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "HasTitle"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(9)
  void hasTitle(
    @LCID int lcid,
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ChartTitle"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type word.ChartTitle
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  word.ChartTitle chartTitle(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "DepthPercent"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  int depthPercent(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DepthPercent"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param prop Mandatory int parameter.
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(12)
  void depthPercent(
    @LCID int lcid,
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Elevation"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  int elevation(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Elevation"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param prop Mandatory int parameter.
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(14)
  void elevation(
    @LCID int lcid,
    int prop);


  /**
   * <p>
   * Getter method for the COM property "GapDepth"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  int gapDepth(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "GapDepth"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param prop Mandatory int parameter.
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(16)
  void gapDepth(
    @LCID int lcid,
    int prop);


  /**
   * <p>
   * Getter method for the COM property "HeightPercent"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  int heightPercent(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "HeightPercent"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param prop Mandatory int parameter.
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(18)
  void heightPercent(
    @LCID int lcid,
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Perspective"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(19)
  int perspective(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Perspective"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param prop Mandatory int parameter.
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(20)
  void perspective(
    @LCID int lcid,
    int prop);


  /**
   * <p>
   * Getter method for the COM property "RightAngleAxes"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743822) //= 0x6002000e. The runtime will prefer the VTID if present
  @VTID(21)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object rightAngleAxes(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "RightAngleAxes"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743822) //= 0x6002000e. The runtime will prefer the VTID if present
  @VTID(22)
  void rightAngleAxes(
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "Rotation"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743824) //= 0x60020010. The runtime will prefer the VTID if present
  @VTID(23)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object rotation(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Rotation"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743824) //= 0x60020010. The runtime will prefer the VTID if present
  @VTID(24)
  void rotation(
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "DisplayBlanksAs"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type word.XlDisplayBlanksAs
   */

  @DISPID(1610743826) //= 0x60020012. The runtime will prefer the VTID if present
  @VTID(25)
  word.XlDisplayBlanksAs displayBlanksAs(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DisplayBlanksAs"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param prop Mandatory word.XlDisplayBlanksAs parameter.
   */

  @DISPID(1610743826) //= 0x60020012. The runtime will prefer the VTID if present
  @VTID(26)
  void displayBlanksAs(
    @LCID int lcid,
    word.XlDisplayBlanksAs prop);


  /**
   * <p>
   * Getter method for the COM property "ChartGroups"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(27)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject chartGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(68) //= 0x44. The runtime will prefer the VTID if present
  @VTID(28)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject seriesCollection(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "SubType"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(29)
  int subType(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "SubType"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param prop Mandatory int parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(30)
  void subType(
    @LCID int lcid,
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(31)
  int type(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param prop Mandatory int parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(32)
  void type(
    @LCID int lcid,
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Corners"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type word.Corners
   */

  @DISPID(79) //= 0x4f. The runtime will prefer the VTID if present
  @VTID(33)
  word.Corners corners(
    @LCID int lcid);


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
   * @param lcid Mandatory int parameter.
   */

  @DISPID(1922) //= 0x782. The runtime will prefer the VTID if present
  @VTID(34)
  void applyDataLabels(
    @Optional @DefaultValue("2") word.XlDataLabelsType type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object legendKey,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object autoText,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object hasLeaderLines,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showSeriesName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showCategoryName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showValue,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showPercentage,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showBubbleSize,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object separator,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ChartType"
   * </p>
   * @return  Returns a value of type office.XlChartType
   */

  @DISPID(1400) //= 0x578. The runtime will prefer the VTID if present
  @VTID(35)
  office.XlChartType chartType();


  /**
   * <p>
   * Setter method for the COM property "ChartType"
   * </p>
   * @param prop Mandatory office.XlChartType parameter.
   */

  @DISPID(1400) //= 0x578. The runtime will prefer the VTID if present
  @VTID(36)
  void chartType(
    office.XlChartType prop);


  /**
   * <p>
   * Getter method for the COM property "HasDataTable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1396) //= 0x574. The runtime will prefer the VTID if present
  @VTID(37)
  boolean hasDataTable();


  /**
   * <p>
   * Setter method for the COM property "HasDataTable"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1396) //= 0x574. The runtime will prefer the VTID if present
  @VTID(38)
  void hasDataTable(
    boolean prop);


  /**
   * @param chartType Mandatory office.XlChartType parameter.
   * @param typeName Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1401) //= 0x579. The runtime will prefer the VTID if present
  @VTID(39)
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
  @VTID(40)
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
  @VTID(41)
  void setSourceData(
    java.lang.String source,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object plotBy);


  /**
   * <p>
   * Getter method for the COM property "PlotBy"
   * </p>
   * @return  Returns a value of type word.XlRowCol
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(42)
  word.XlRowCol plotBy();


  /**
   * <p>
   * Setter method for the COM property "PlotBy"
   * </p>
   * @param prop Mandatory word.XlRowCol parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(43)
  void plotBy(
    word.XlRowCol prop);


  /**
   * <p>
   * Getter method for the COM property "HasLegend"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(53) //= 0x35. The runtime will prefer the VTID if present
  @VTID(44)
  boolean hasLegend(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "HasLegend"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(53) //= 0x35. The runtime will prefer the VTID if present
  @VTID(45)
  void hasLegend(
    @LCID int lcid,
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Legend"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type word.Legend
   */

  @DISPID(84) //= 0x54. The runtime will prefer the VTID if present
  @VTID(46)
  word.Legend legend(
    @LCID int lcid);


  /**
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param axisGroup Optional parameter. Default value is 1
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610743861) //= 0x60020035. The runtime will prefer the VTID if present
  @VTID(47)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject axes(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type,
    @Optional @DefaultValue("1") word.XlAxisGroup axisGroup,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "HasAxis"
   * </p>
   * @param index1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param index2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743862) //= 0x60020036. The runtime will prefer the VTID if present
  @VTID(48)
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
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743862) //= 0x60020036. The runtime will prefer the VTID if present
  @VTID(49)
  void hasAxis(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index2,
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "Walls"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type word.Walls
   */

  @DISPID(1610743864) //= 0x60020038. The runtime will prefer the VTID if present
  @VTID(50)
  word.Walls walls(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Floor"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type word.Floor
   */

  @DISPID(1610743865) //= 0x60020039. The runtime will prefer the VTID if present
  @VTID(51)
  word.Floor floor(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "PlotArea"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type word.PlotArea
   */

  @DISPID(1610743866) //= 0x6002003a. The runtime will prefer the VTID if present
  @VTID(52)
  word.PlotArea plotArea(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "PlotVisibleOnly"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(92) //= 0x5c. The runtime will prefer the VTID if present
  @VTID(53)
  boolean plotVisibleOnly(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "PlotVisibleOnly"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(92) //= 0x5c. The runtime will prefer the VTID if present
  @VTID(54)
  void plotVisibleOnly(
    @LCID int lcid,
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ChartArea"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type word.ChartArea
   */

  @DISPID(1610743869) //= 0x6002003d. The runtime will prefer the VTID if present
  @VTID(55)
  word.ChartArea chartArea(
    @LCID int lcid);


  /**
   * @param gallery Mandatory int parameter.
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1610743870) //= 0x6002003e. The runtime will prefer the VTID if present
  @VTID(56)
  void autoFormat(
    int gallery,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object format);


  /**
   * <p>
   * Getter method for the COM property "AutoScaling"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743871) //= 0x6002003f. The runtime will prefer the VTID if present
  @VTID(57)
  boolean autoScaling(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "AutoScaling"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1610743871) //= 0x6002003f. The runtime will prefer the VTID if present
  @VTID(58)
  void autoScaling(
    @LCID int lcid,
    boolean prop);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(1610743873) //= 0x60020041. The runtime will prefer the VTID if present
  @VTID(59)
  void setBackgroundPicture(
    java.lang.String fileName);


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

  @DISPID(1610743874) //= 0x60020042. The runtime will prefer the VTID if present
  @VTID(60)
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
   * @param appearance Optional parameter. Default value is 1
   * @param format Optional parameter. Default value is -4147
   * @param size Optional parameter. Default value is 2
   * @param lcid Mandatory int parameter.
   */

  @DISPID(1610743875) //= 0x60020043. The runtime will prefer the VTID if present
  @VTID(61)
  void copyPicture(
    @Optional @DefaultValue("1") word.XlPictureAppearance appearance,
    @Optional @DefaultValue("-4147") word.XlCopyPictureFormat format,
    @Optional @DefaultValue("2") word.XlPictureAppearance size,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "DataTable"
   * </p>
   * @return  Returns a value of type word.DataTable
   */

  @DISPID(1610743876) //= 0x60020044. The runtime will prefer the VTID if present
  @VTID(62)
  word.DataTable dataTable();


  /**
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(1610743879) //= 0x60020047. The runtime will prefer the VTID if present
  @VTID(63)
  void paste(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "BarShape"
   * </p>
   * @return  Returns a value of type word.XlBarShape
   */

  @DISPID(1610743880) //= 0x60020048. The runtime will prefer the VTID if present
  @VTID(64)
  word.XlBarShape barShape();


  /**
   * <p>
   * Setter method for the COM property "BarShape"
   * </p>
   * @param prop Mandatory word.XlBarShape parameter.
   */

  @DISPID(1610743880) //= 0x60020048. The runtime will prefer the VTID if present
  @VTID(65)
  void barShape(
    word.XlBarShape prop);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param filterName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param interactive Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743882) //= 0x6002004a. The runtime will prefer the VTID if present
  @VTID(66)
  boolean export(
    java.lang.String fileName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filterName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object interactive);


  /**
   * @param name Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743883) //= 0x6002004b. The runtime will prefer the VTID if present
  @VTID(67)
  void setDefaultChart(
    @MarshalAs(NativeType.VARIANT) java.lang.Object name);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(1610743884) //= 0x6002004c. The runtime will prefer the VTID if present
  @VTID(68)
  void applyChartTemplate(
    java.lang.String fileName);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(1610743885) //= 0x6002004d. The runtime will prefer the VTID if present
  @VTID(69)
  void saveChartTemplate(
    java.lang.String fileName);


  /**
   * <p>
   * Getter method for the COM property "SideWall"
   * </p>
   * @return  Returns a value of type word.Walls
   */

  @DISPID(2377) //= 0x949. The runtime will prefer the VTID if present
  @VTID(70)
  word.Walls sideWall();


  /**
   * <p>
   * Getter method for the COM property "BackWall"
   * </p>
   * @return  Returns a value of type word.Walls
   */

  @DISPID(2378) //= 0x94a. The runtime will prefer the VTID if present
  @VTID(71)
  word.Walls backWall();


  /**
   * <p>
   * Getter method for the COM property "ChartStyle"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2465) //= 0x9a1. The runtime will prefer the VTID if present
  @VTID(72)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object chartStyle();


  /**
   * <p>
   * Setter method for the COM property "ChartStyle"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(2465) //= 0x9a1. The runtime will prefer the VTID if present
  @VTID(73)
  void chartStyle(
    @MarshalAs(NativeType.VARIANT) java.lang.Object prop);


  /**
   */

  @DISPID(2466) //= 0x9a2. The runtime will prefer the VTID if present
  @VTID(74)
  void clearToMatchStyle();


  /**
   * <p>
   * Getter method for the COM property "PivotLayout"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1814) //= 0x716. The runtime will prefer the VTID if present
  @VTID(75)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject pivotLayout();


  /**
   * <p>
   * Getter method for the COM property "HasPivotFields"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1815) //= 0x717. The runtime will prefer the VTID if present
  @VTID(76)
  boolean hasPivotFields();


  /**
   * <p>
   * Setter method for the COM property "HasPivotFields"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1815) //= 0x717. The runtime will prefer the VTID if present
  @VTID(77)
  void hasPivotFields(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowDataLabelsOverMaximum"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743895) //= 0x60020057. The runtime will prefer the VTID if present
  @VTID(78)
  boolean showDataLabelsOverMaximum();


  /**
   * <p>
   * Setter method for the COM property "ShowDataLabelsOverMaximum"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1610743895) //= 0x60020057. The runtime will prefer the VTID if present
  @VTID(79)
  void showDataLabelsOverMaximum(
    boolean prop);


  /**
   * @param layout Mandatory int parameter.
   * @param chartType Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2468) //= 0x9a4. The runtime will prefer the VTID if present
  @VTID(80)
  void applyLayout(
    int layout,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object chartType);


  /**
   */

  @DISPID(1610743899) //= 0x6002005b. The runtime will prefer the VTID if present
  @VTID(81)
  void refresh();


  /**
   * @param element Mandatory office.MsoChartElementType parameter.
   */

  @DISPID(1610743900) //= 0x6002005c. The runtime will prefer the VTID if present
  @VTID(82)
  void setElement(
    office.MsoChartElementType element);


  /**
   * <p>
   * Getter method for the COM property "ChartData"
   * </p>
   * @return  Returns a value of type word.ChartData
   */

  @DISPID(1610743901) //= 0x6002005d. The runtime will prefer the VTID if present
  @VTID(83)
  word.ChartData chartData();


  /**
   * <p>
   * Getter method for the COM property "Shapes"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610743903) //= 0x6002005f. The runtime will prefer the VTID if present
  @VTID(84)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject shapes();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(85)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(86)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Area3DGroup"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type word.ChartGroup
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(87)
  word.ChartGroup area3DGroup(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(88)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject areaGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Bar3DGroup"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type word.ChartGroup
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(89)
  word.ChartGroup bar3DGroup(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(90)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject barGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Column3DGroup"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type word.ChartGroup
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(91)
  word.ChartGroup column3DGroup(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(92)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject columnGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Line3DGroup"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type word.ChartGroup
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(93)
  word.ChartGroup line3DGroup(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(94)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject lineGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Pie3DGroup"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type word.ChartGroup
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(95)
  word.ChartGroup pie3DGroup(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(96)
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
  @VTID(97)
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
  @VTID(98)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject radarGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "SurfaceGroup"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type word.ChartGroup
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(99)
  word.ChartGroup surfaceGroup(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(100)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject xyGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(101)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object delete(
    @LCID int lcid);


  /**
   * @param before Optional parameter. Default value is com4j.Variant.getMissing()
   * @param after Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(551) //= 0x227. The runtime will prefer the VTID if present
  @VTID(102)
  void copy(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object before,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object after,
    @LCID int lcid);


  /**
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(235) //= 0xeb. The runtime will prefer the VTID if present
  @VTID(103)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object replace,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ShowReportFilterFieldButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2844) //= 0xb1c. The runtime will prefer the VTID if present
  @VTID(104)
  boolean showReportFilterFieldButtons();


  /**
   * <p>
   * Setter method for the COM property "ShowReportFilterFieldButtons"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(2844) //= 0xb1c. The runtime will prefer the VTID if present
  @VTID(105)
  void showReportFilterFieldButtons(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowLegendFieldButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2845) //= 0xb1d. The runtime will prefer the VTID if present
  @VTID(106)
  boolean showLegendFieldButtons();


  /**
   * <p>
   * Setter method for the COM property "ShowLegendFieldButtons"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(2845) //= 0xb1d. The runtime will prefer the VTID if present
  @VTID(107)
  void showLegendFieldButtons(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowAxisFieldButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2846) //= 0xb1e. The runtime will prefer the VTID if present
  @VTID(108)
  boolean showAxisFieldButtons();


  /**
   * <p>
   * Setter method for the COM property "ShowAxisFieldButtons"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(2846) //= 0xb1e. The runtime will prefer the VTID if present
  @VTID(109)
  void showAxisFieldButtons(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowValueFieldButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2847) //= 0xb1f. The runtime will prefer the VTID if present
  @VTID(110)
  boolean showValueFieldButtons();


  /**
   * <p>
   * Setter method for the COM property "ShowValueFieldButtons"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(2847) //= 0xb1f. The runtime will prefer the VTID if present
  @VTID(111)
  void showValueFieldButtons(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowAllFieldButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2848) //= 0xb20. The runtime will prefer the VTID if present
  @VTID(112)
  boolean showAllFieldButtons();


  /**
   * <p>
   * Setter method for the COM property "ShowAllFieldButtons"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(2848) //= 0xb20. The runtime will prefer the VTID if present
  @VTID(113)
  void showAllFieldButtons(
    boolean prop);


  // Properties:
}
