package excel  ;

import com4j.*;

@IID("{0002086B-0001-0000-C000-000000000046}")
public interface ISeries extends Com4jObject {
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
   * @param type Optional parameter. Default value is 2
   * @param legendKey Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasLeaderLines Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object _ApplyDataLabels(
    @Optional @DefaultValue("2") excel.XlDataLabelsType type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object legendKey,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object autoText,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object hasLeaderLines);


  /**
   * <p>
   * Getter method for the COM property "AxisGroup"
   * </p>
   * @return  Returns a value of type excel.XlAxisGroup
   */

  @VTID(11)
  excel.XlAxisGroup getAxisGroup();


  /**
   * <p>
   * Setter method for the COM property "AxisGroup"
   * </p>
   * @param rhs Mandatory excel.XlAxisGroup parameter.
   */

  @VTID(12)
  void setAxisGroup(
    excel.XlAxisGroup rhs);


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   * @return  Returns a value of type excel.Border
   */

  @VTID(13)
  excel.Border getBorder();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clearFormats();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object copy();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(16)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject dataLabels(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object delete();


  /**
   * @param direction Mandatory excel.XlErrorBarDirection parameter.
   * @param include Mandatory excel.XlErrorBarInclude parameter.
   * @param type Mandatory excel.XlErrorBarType parameter.
   * @param amount Optional parameter. Default value is com4j.Variant.getMissing()
   * @param minusValues Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object errorBar(
    excel.XlErrorBarDirection direction,
    excel.XlErrorBarInclude include,
    excel.XlErrorBarType type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object amount,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object minusValues);


  /**
   * <p>
   * Getter method for the COM property "ErrorBars"
   * </p>
   * @return  Returns a value of type excel.ErrorBars
   */

  @VTID(19)
  excel.ErrorBars getErrorBars();


  /**
   * <p>
   * Getter method for the COM property "Explosion"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(20)
  int getExplosion();


  /**
   * <p>
   * Setter method for the COM property "Explosion"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(21)
  void setExplosion(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Formula"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(22)
  java.lang.String getFormula();


  /**
   * <p>
   * Setter method for the COM property "Formula"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(23)
  void setFormula(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaLocal"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(24)
  java.lang.String getFormulaLocal();


  /**
   * <p>
   * Setter method for the COM property "FormulaLocal"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(25)
  void setFormulaLocal(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaR1C1"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(26)
  java.lang.String getFormulaR1C1();


  /**
   * <p>
   * Setter method for the COM property "FormulaR1C1"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(27)
  void setFormulaR1C1(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaR1C1Local"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(28)
  java.lang.String getFormulaR1C1Local();


  /**
   * <p>
   * Setter method for the COM property "FormulaR1C1Local"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(29)
  void setFormulaR1C1Local(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "HasDataLabels"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(30)
  boolean getHasDataLabels();


  /**
   * <p>
   * Setter method for the COM property "HasDataLabels"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(31)
  void setHasDataLabels(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasErrorBars"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(32)
  boolean getHasErrorBars();


  /**
   * <p>
   * Setter method for the COM property "HasErrorBars"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(33)
  void setHasErrorBars(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type excel.Interior
   */

  @VTID(34)
  excel.Interior getInterior();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type excel.ChartFillFormat
   */

  @VTID(35)
  excel.ChartFillFormat getFill();


  /**
   * <p>
   * Getter method for the COM property "InvertIfNegative"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(36)
  boolean getInvertIfNegative();


  /**
   * <p>
   * Setter method for the COM property "InvertIfNegative"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(37)
  void setInvertIfNegative(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerBackgroundColor"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(38)
  int getMarkerBackgroundColor();


  /**
   * <p>
   * Setter method for the COM property "MarkerBackgroundColor"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(39)
  void setMarkerBackgroundColor(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerBackgroundColorIndex"
   * </p>
   * @return  Returns a value of type excel.XlColorIndex
   */

  @VTID(40)
  excel.XlColorIndex getMarkerBackgroundColorIndex();


  /**
   * <p>
   * Setter method for the COM property "MarkerBackgroundColorIndex"
   * </p>
   * @param rhs Mandatory excel.XlColorIndex parameter.
   */

  @VTID(41)
  void setMarkerBackgroundColorIndex(
    excel.XlColorIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerForegroundColor"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(42)
  int getMarkerForegroundColor();


  /**
   * <p>
   * Setter method for the COM property "MarkerForegroundColor"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(43)
  void setMarkerForegroundColor(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerForegroundColorIndex"
   * </p>
   * @return  Returns a value of type excel.XlColorIndex
   */

  @VTID(44)
  excel.XlColorIndex getMarkerForegroundColorIndex();


  /**
   * <p>
   * Setter method for the COM property "MarkerForegroundColorIndex"
   * </p>
   * @param rhs Mandatory excel.XlColorIndex parameter.
   */

  @VTID(45)
  void setMarkerForegroundColorIndex(
    excel.XlColorIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerSize"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(46)
  int getMarkerSize();


  /**
   * <p>
   * Setter method for the COM property "MarkerSize"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(47)
  void setMarkerSize(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerStyle"
   * </p>
   * @return  Returns a value of type excel.XlMarkerStyle
   */

  @VTID(48)
  excel.XlMarkerStyle getMarkerStyle();


  /**
   * <p>
   * Setter method for the COM property "MarkerStyle"
   * </p>
   * @param rhs Mandatory excel.XlMarkerStyle parameter.
   */

  @VTID(49)
  void setMarkerStyle(
    excel.XlMarkerStyle rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(50)
  java.lang.String getName();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(51)
  void setName(
    java.lang.String rhs);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(52)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object paste();


  /**
   * <p>
   * Getter method for the COM property "PictureType"
   * </p>
   * @return  Returns a value of type excel.XlChartPictureType
   */

  @VTID(53)
  excel.XlChartPictureType getPictureType();


  /**
   * <p>
   * Setter method for the COM property "PictureType"
   * </p>
   * @param rhs Mandatory excel.XlChartPictureType parameter.
   */

  @VTID(54)
  void setPictureType(
    excel.XlChartPictureType rhs);


  /**
   * <p>
   * Getter method for the COM property "PictureUnit"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(55)
  int getPictureUnit();


  /**
   * <p>
   * Setter method for the COM property "PictureUnit"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(56)
  void setPictureUnit(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "PlotOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(57)
  int getPlotOrder();


  /**
   * <p>
   * Setter method for the COM property "PlotOrder"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(58)
  void setPlotOrder(
    int rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(59)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject points(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(60)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "Smooth"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(61)
  boolean getSmooth();


  /**
   * <p>
   * Setter method for the COM property "Smooth"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(62)
  void setSmooth(
    boolean rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(63)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject trendlines(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(64)
  int getType();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(65)
  void setType(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ChartType"
   * </p>
   * @return  Returns a value of type excel.XlChartType
   */

  @VTID(66)
  excel.XlChartType getChartType();


  /**
   * <p>
   * Setter method for the COM property "ChartType"
   * </p>
   * @param rhs Mandatory excel.XlChartType parameter.
   */

  @VTID(67)
  void setChartType(
    excel.XlChartType rhs);


  /**
   * @param chartType Mandatory excel.XlChartType parameter.
   */

  @VTID(68)
  void applyCustomType(
    excel.XlChartType chartType);


  /**
   * <p>
   * Getter method for the COM property "Values"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(69)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getValues();


  /**
   * <p>
   * Setter method for the COM property "Values"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(70)
  void setValues(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "XValues"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(71)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getXValues();


  /**
   * <p>
   * Setter method for the COM property "XValues"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(72)
  void setXValues(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "BubbleSizes"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(73)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getBubbleSizes();


  /**
   * <p>
   * Setter method for the COM property "BubbleSizes"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(74)
  void setBubbleSizes(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "BarShape"
   * </p>
   * @return  Returns a value of type excel.XlBarShape
   */

  @VTID(75)
  excel.XlBarShape getBarShape();


  /**
   * <p>
   * Setter method for the COM property "BarShape"
   * </p>
   * @param rhs Mandatory excel.XlBarShape parameter.
   */

  @VTID(76)
  void setBarShape(
    excel.XlBarShape rhs);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToSides"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(77)
  boolean getApplyPictToSides();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToSides"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(78)
  void setApplyPictToSides(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToFront"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(79)
  boolean getApplyPictToFront();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToFront"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(80)
  void setApplyPictToFront(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToEnd"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(81)
  boolean getApplyPictToEnd();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToEnd"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(82)
  void setApplyPictToEnd(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Has3DEffect"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(83)
  boolean getHas3DEffect();


  /**
   * <p>
   * Setter method for the COM property "Has3DEffect"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(84)
  void setHas3DEffect(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(85)
  boolean getShadow();


  /**
   * <p>
   * Setter method for the COM property "Shadow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(86)
  void setShadow(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasLeaderLines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(87)
  boolean getHasLeaderLines();


  /**
   * <p>
   * Setter method for the COM property "HasLeaderLines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(88)
  void setHasLeaderLines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "LeaderLines"
   * </p>
   * @return  Returns a value of type excel.LeaderLines
   */

  @VTID(89)
  excel.LeaderLines getLeaderLines();


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
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(90)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object applyDataLabels(
    @Optional @DefaultValue("2") excel.XlDataLabelsType type,
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
   * Getter method for the COM property "PictureUnit2"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(91)
  double getPictureUnit2();


  /**
   * <p>
   * Setter method for the COM property "PictureUnit2"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(92)
  void setPictureUnit2(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type excel.ChartFormat
   */

  @VTID(93)
  excel.ChartFormat getFormat();


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
   * @return  Returns a value of type int
   */

  @VTID(97)
  int getInvertColorIndex();


  /**
   * <p>
   * Setter method for the COM property "InvertColorIndex"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(98)
  void setInvertColorIndex(
    int rhs);


  // Properties:
}
