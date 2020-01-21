package office  ;

import com4j.*;

@IID("{000C170B-0000-0000-C000-000000000046}")
public interface IMsoSeries extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getParent();


  /**
   * @param type Optional parameter. Default value is 2
   * @param iMsoLegendKey Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasLeaderLines Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object _ApplyDataLabels(
    @Optional @DefaultValue("2") office.XlDataLabelsType type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object iMsoLegendKey,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object autoText,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object hasLeaderLines);


  /**
   * <p>
   * Getter method for the COM property "AxisGroup"
   * </p>
   * @return  Returns a value of type office.XlAxisGroup
   */

  @VTID(9)
  office.XlAxisGroup getAxisGroup();


  /**
   * <p>
   * Setter method for the COM property "AxisGroup"
   * </p>
   * @param rhs Mandatory office.XlAxisGroup parameter.
   */

  @VTID(10)
  void setAxisGroup(
    office.XlAxisGroup rhs);


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   * @return  Returns a value of type office.IMsoBorder
   */

  @VTID(11)
  office.IMsoBorder getBorder();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clearFormats();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object copy();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(14)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject dataLabels(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object delete();


  /**
   * @param direction Mandatory office.XlErrorBarDirection parameter.
   * @param include Mandatory office.XlErrorBarInclude parameter.
   * @param type Mandatory office.XlErrorBarType parameter.
   * @param amount Optional parameter. Default value is com4j.Variant.getMissing()
   * @param minusValues Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object errorBar(
    office.XlErrorBarDirection direction,
    office.XlErrorBarInclude include,
    office.XlErrorBarType type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object amount,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object minusValues);


  /**
   * <p>
   * Getter method for the COM property "ErrorBars"
   * </p>
   * @return  Returns a value of type office.IMsoErrorBars
   */

  @VTID(17)
  office.IMsoErrorBars getErrorBars();


  /**
   * <p>
   * Getter method for the COM property "Explosion"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(18)
  int getExplosion();


  /**
   * <p>
   * Setter method for the COM property "Explosion"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(19)
  void setExplosion(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Formula"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(20)
  java.lang.String getFormula();


  /**
   * <p>
   * Setter method for the COM property "Formula"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(21)
  void setFormula(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaLocal"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(22)
  java.lang.String getFormulaLocal();


  /**
   * <p>
   * Setter method for the COM property "FormulaLocal"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(23)
  void setFormulaLocal(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaR1C1"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(24)
  java.lang.String getFormulaR1C1();


  /**
   * <p>
   * Setter method for the COM property "FormulaR1C1"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(25)
  void setFormulaR1C1(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaR1C1Local"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(26)
  java.lang.String getFormulaR1C1Local();


  /**
   * <p>
   * Setter method for the COM property "FormulaR1C1Local"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(27)
  void setFormulaR1C1Local(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "HasDataLabels"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(28)
  boolean getHasDataLabels();


  /**
   * <p>
   * Setter method for the COM property "HasDataLabels"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(29)
  void setHasDataLabels(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasErrorBars"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(30)
  boolean getHasErrorBars();


  /**
   * <p>
   * Setter method for the COM property "HasErrorBars"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(31)
  void setHasErrorBars(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type office.IMsoInterior
   */

  @VTID(32)
  office.IMsoInterior getInterior();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type office.ChartFillFormat
   */

  @VTID(33)
  office.ChartFillFormat getFill();


  /**
   * <p>
   * Getter method for the COM property "InvertIfNegative"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(34)
  boolean getInvertIfNegative();


  /**
   * <p>
   * Setter method for the COM property "InvertIfNegative"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(35)
  void setInvertIfNegative(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerBackgroundColor"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(36)
  int getMarkerBackgroundColor();


  /**
   * <p>
   * Setter method for the COM property "MarkerBackgroundColor"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(37)
  void setMarkerBackgroundColor(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerBackgroundColorIndex"
   * </p>
   * @return  Returns a value of type office.XlColorIndex
   */

  @VTID(38)
  office.XlColorIndex getMarkerBackgroundColorIndex();


  /**
   * <p>
   * Setter method for the COM property "MarkerBackgroundColorIndex"
   * </p>
   * @param rhs Mandatory office.XlColorIndex parameter.
   */

  @VTID(39)
  void setMarkerBackgroundColorIndex(
    office.XlColorIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerForegroundColor"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(40)
  int getMarkerForegroundColor();


  /**
   * <p>
   * Setter method for the COM property "MarkerForegroundColor"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(41)
  void setMarkerForegroundColor(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerForegroundColorIndex"
   * </p>
   * @return  Returns a value of type office.XlColorIndex
   */

  @VTID(42)
  office.XlColorIndex getMarkerForegroundColorIndex();


  /**
   * <p>
   * Setter method for the COM property "MarkerForegroundColorIndex"
   * </p>
   * @param rhs Mandatory office.XlColorIndex parameter.
   */

  @VTID(43)
  void setMarkerForegroundColorIndex(
    office.XlColorIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerSize"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(44)
  int getMarkerSize();


  /**
   * <p>
   * Setter method for the COM property "MarkerSize"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(45)
  void setMarkerSize(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerStyle"
   * </p>
   * @return  Returns a value of type office.XlMarkerStyle
   */

  @VTID(46)
  office.XlMarkerStyle getMarkerStyle();


  /**
   * <p>
   * Setter method for the COM property "MarkerStyle"
   * </p>
   * @param rhs Mandatory office.XlMarkerStyle parameter.
   */

  @VTID(47)
  void setMarkerStyle(
    office.XlMarkerStyle rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(48)
  java.lang.String getName();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(49)
  void setName(
    java.lang.String rhs);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(50)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object paste();


  /**
   * <p>
   * Getter method for the COM property "PictureType"
   * </p>
   * @return  Returns a value of type office.XlChartPictureType
   */

  @VTID(51)
  office.XlChartPictureType getPictureType();


  /**
   * <p>
   * Setter method for the COM property "PictureType"
   * </p>
   * @param rhs Mandatory office.XlChartPictureType parameter.
   */

  @VTID(52)
  void setPictureType(
    office.XlChartPictureType rhs);


  /**
   * <p>
   * Getter method for the COM property "PictureUnit"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(53)
  double getPictureUnit();


  /**
   * <p>
   * Setter method for the COM property "PictureUnit"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(54)
  void setPictureUnit(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "PlotOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(55)
  int getPlotOrder();


  /**
   * <p>
   * Setter method for the COM property "PlotOrder"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(56)
  void setPlotOrder(
    int rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(57)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject points(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(58)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "Smooth"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(59)
  boolean getSmooth();


  /**
   * <p>
   * Setter method for the COM property "Smooth"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(60)
  void setSmooth(
    boolean rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(61)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject trendlines(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(62)
  int getType();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(63)
  void setType(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ChartType"
   * </p>
   * @return  Returns a value of type office.XlChartType
   */

  @VTID(64)
  office.XlChartType getChartType();


  /**
   * <p>
   * Setter method for the COM property "ChartType"
   * </p>
   * @param rhs Mandatory office.XlChartType parameter.
   */

  @VTID(65)
  void setChartType(
    office.XlChartType rhs);


  /**
   * @param chartType Mandatory office.XlChartType parameter.
   */

  @VTID(66)
  void applyCustomType(
    office.XlChartType chartType);


  /**
   * <p>
   * Getter method for the COM property "Values"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(67)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getValues();


  /**
   * <p>
   * Setter method for the COM property "Values"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(68)
  void setValues(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "XValues"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(69)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getXValues();


  /**
   * <p>
   * Setter method for the COM property "XValues"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(70)
  void setXValues(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "BubbleSizes"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(71)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getBubbleSizes();


  /**
   * <p>
   * Setter method for the COM property "BubbleSizes"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(72)
  void setBubbleSizes(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "BarShape"
   * </p>
   * @return  Returns a value of type office.XlBarShape
   */

  @VTID(73)
  office.XlBarShape getBarShape();


  /**
   * <p>
   * Setter method for the COM property "BarShape"
   * </p>
   * @param rhs Mandatory office.XlBarShape parameter.
   */

  @VTID(74)
  void setBarShape(
    office.XlBarShape rhs);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToSides"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(75)
  boolean getApplyPictToSides();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToSides"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(76)
  void setApplyPictToSides(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToFront"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(77)
  boolean getApplyPictToFront();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToFront"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(78)
  void setApplyPictToFront(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToEnd"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(79)
  boolean getApplyPictToEnd();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToEnd"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(80)
  void setApplyPictToEnd(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Has3DEffect"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(81)
  boolean getHas3DEffect();


  /**
   * <p>
   * Setter method for the COM property "Has3DEffect"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(82)
  void setHas3DEffect(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(83)
  boolean getShadow();


  /**
   * <p>
   * Setter method for the COM property "Shadow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(84)
  void setShadow(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasLeaderLines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(85)
  boolean getHasLeaderLines();


  /**
   * <p>
   * Setter method for the COM property "HasLeaderLines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(86)
  void setHasLeaderLines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "LeaderLines"
   * </p>
   * @return  Returns a value of type office.IMsoLeaderLines
   */

  @VTID(87)
  office.IMsoLeaderLines getLeaderLines();


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
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(88)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object applyDataLabels(
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
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type office.IMsoChartFormat
   */

  @VTID(89)
  office.IMsoChartFormat getFormat();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(90)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(91)
  int getCreator();


  /**
   * <p>
   * Getter method for the COM property "PictureUnit2"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(92)
  double getPictureUnit2();


  /**
   * <p>
   * Setter method for the COM property "PictureUnit2"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(93)
  void setPictureUnit2(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "PlotColorIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(94)
  int getPlotColorIndex();


  /**
   * <p>
   * Getter method for the COM property "InvertColor"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(95)
  int getInvertColor();


  /**
   * <p>
   * Setter method for the COM property "InvertColor"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(96)
  void setInvertColor(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "InvertColorIndex"
   * </p>
   * @return  Returns a value of type office.XlColorIndex
   */

  @VTID(97)
  office.XlColorIndex getInvertColorIndex();


  /**
   * <p>
   * Setter method for the COM property "InvertColorIndex"
   * </p>
   * @param rhs Mandatory office.XlColorIndex parameter.
   */

  @VTID(98)
  void setInvertColorIndex(
    office.XlColorIndex rhs);


  // Properties:
}
