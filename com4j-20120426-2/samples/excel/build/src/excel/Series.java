package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Series extends Com4jObject {
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
   * @param type Optional parameter. Default value is 2
   * @param legendKey Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasLeaderLines Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(151)
  java.lang.Object _ApplyDataLabels(
    @Optional @DefaultValue("2") excel.XlDataLabelsType type,
    @Optional java.lang.Object legendKey,
    @Optional java.lang.Object autoText,
    @Optional java.lang.Object hasLeaderLines);


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
   * Getter method for the COM property "Border"
   * </p>
   */

  @DISPID(128)
  @PropGet
  excel.Border getBorder();


  /**
   */

  @DISPID(112)
  java.lang.Object clearFormats();


  /**
   */

  @DISPID(551)
  java.lang.Object copy();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(157)
  com4j.Com4jObject dataLabels(
    @Optional java.lang.Object index);


  /**
   */

  @DISPID(117)
  java.lang.Object delete();


  /**
   * @param direction Mandatory excel.XlErrorBarDirection parameter.
   * @param include Mandatory excel.XlErrorBarInclude parameter.
   * @param type Mandatory excel.XlErrorBarType parameter.
   * @param amount Optional parameter. Default value is com4j.Variant.getMissing()
   * @param minusValues Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(152)
  java.lang.Object errorBar(
    excel.XlErrorBarDirection direction,
    excel.XlErrorBarInclude include,
    excel.XlErrorBarType type,
    @Optional java.lang.Object amount,
    @Optional java.lang.Object minusValues);


  /**
   * <p>
   * Getter method for the COM property "ErrorBars"
   * </p>
   */

  @DISPID(159)
  @PropGet
  excel.ErrorBars getErrorBars();


  /**
   * <p>
   * Getter method for the COM property "Explosion"
   * </p>
   */

  @DISPID(182)
  @PropGet
  int getExplosion();


  /**
   * <p>
   * Setter method for the COM property "Explosion"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(182)
  @PropPut
  void setExplosion(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Formula"
   * </p>
   */

  @DISPID(261)
  @PropGet
  java.lang.String getFormula();


  /**
   * <p>
   * Setter method for the COM property "Formula"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(261)
  @PropPut
  void setFormula(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaLocal"
   * </p>
   */

  @DISPID(263)
  @PropGet
  java.lang.String getFormulaLocal();


  /**
   * <p>
   * Setter method for the COM property "FormulaLocal"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(263)
  @PropPut
  void setFormulaLocal(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaR1C1"
   * </p>
   */

  @DISPID(264)
  @PropGet
  java.lang.String getFormulaR1C1();


  /**
   * <p>
   * Setter method for the COM property "FormulaR1C1"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(264)
  @PropPut
  void setFormulaR1C1(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaR1C1Local"
   * </p>
   */

  @DISPID(265)
  @PropGet
  java.lang.String getFormulaR1C1Local();


  /**
   * <p>
   * Setter method for the COM property "FormulaR1C1Local"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(265)
  @PropPut
  void setFormulaR1C1Local(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "HasDataLabels"
   * </p>
   */

  @DISPID(78)
  @PropGet
  boolean getHasDataLabels();


  /**
   * <p>
   * Setter method for the COM property "HasDataLabels"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(78)
  @PropPut
  void setHasDataLabels(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasErrorBars"
   * </p>
   */

  @DISPID(160)
  @PropGet
  boolean getHasErrorBars();


  /**
   * <p>
   * Setter method for the COM property "HasErrorBars"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(160)
  @PropPut
  void setHasErrorBars(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   */

  @DISPID(129)
  @PropGet
  excel.Interior getInterior();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   */

  @DISPID(1663)
  @PropGet
  excel.ChartFillFormat getFill();


  /**
   * <p>
   * Getter method for the COM property "InvertIfNegative"
   * </p>
   */

  @DISPID(132)
  @PropGet
  boolean getInvertIfNegative();


  /**
   * <p>
   * Setter method for the COM property "InvertIfNegative"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(132)
  @PropPut
  void setInvertIfNegative(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerBackgroundColor"
   * </p>
   */

  @DISPID(73)
  @PropGet
  int getMarkerBackgroundColor();


  /**
   * <p>
   * Setter method for the COM property "MarkerBackgroundColor"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(73)
  @PropPut
  void setMarkerBackgroundColor(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerBackgroundColorIndex"
   * </p>
   */

  @DISPID(74)
  @PropGet
  excel.XlColorIndex getMarkerBackgroundColorIndex();


  /**
   * <p>
   * Setter method for the COM property "MarkerBackgroundColorIndex"
   * </p>
   * @param rhs Mandatory excel.XlColorIndex parameter.
   */

  @DISPID(74)
  @PropPut
  void setMarkerBackgroundColorIndex(
    excel.XlColorIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerForegroundColor"
   * </p>
   */

  @DISPID(75)
  @PropGet
  int getMarkerForegroundColor();


  /**
   * <p>
   * Setter method for the COM property "MarkerForegroundColor"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(75)
  @PropPut
  void setMarkerForegroundColor(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerForegroundColorIndex"
   * </p>
   */

  @DISPID(76)
  @PropGet
  excel.XlColorIndex getMarkerForegroundColorIndex();


  /**
   * <p>
   * Setter method for the COM property "MarkerForegroundColorIndex"
   * </p>
   * @param rhs Mandatory excel.XlColorIndex parameter.
   */

  @DISPID(76)
  @PropPut
  void setMarkerForegroundColorIndex(
    excel.XlColorIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerSize"
   * </p>
   */

  @DISPID(231)
  @PropGet
  int getMarkerSize();


  /**
   * <p>
   * Setter method for the COM property "MarkerSize"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(231)
  @PropPut
  void setMarkerSize(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerStyle"
   * </p>
   */

  @DISPID(72)
  @PropGet
  excel.XlMarkerStyle getMarkerStyle();


  /**
   * <p>
   * Setter method for the COM property "MarkerStyle"
   * </p>
   * @param rhs Mandatory excel.XlMarkerStyle parameter.
   */

  @DISPID(72)
  @PropPut
  void setMarkerStyle(
    excel.XlMarkerStyle rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   */

  @DISPID(110)
  @PropGet
  java.lang.String getName();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(110)
  @PropPut
  void setName(
    java.lang.String rhs);


  /**
   */

  @DISPID(211)
  java.lang.Object paste();


  /**
   * <p>
   * Getter method for the COM property "PictureType"
   * </p>
   */

  @DISPID(161)
  @PropGet
  excel.XlChartPictureType getPictureType();


  /**
   * <p>
   * Setter method for the COM property "PictureType"
   * </p>
   * @param rhs Mandatory excel.XlChartPictureType parameter.
   */

  @DISPID(161)
  @PropPut
  void setPictureType(
    excel.XlChartPictureType rhs);


  /**
   * <p>
   * Getter method for the COM property "PictureUnit"
   * </p>
   */

  @DISPID(162)
  @PropGet
  int getPictureUnit();


  /**
   * <p>
   * Setter method for the COM property "PictureUnit"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(162)
  @PropPut
  void setPictureUnit(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "PlotOrder"
   * </p>
   */

  @DISPID(228)
  @PropGet
  int getPlotOrder();


  /**
   * <p>
   * Setter method for the COM property "PlotOrder"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(228)
  @PropPut
  void setPlotOrder(
    int rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(70)
  com4j.Com4jObject points(
    @Optional java.lang.Object index);


  /**
   */

  @DISPID(235)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "Smooth"
   * </p>
   */

  @DISPID(163)
  @PropGet
  boolean getSmooth();


  /**
   * <p>
   * Setter method for the COM property "Smooth"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(163)
  @PropPut
  void setSmooth(
    boolean rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(154)
  com4j.Com4jObject trendlines(
    @Optional java.lang.Object index);


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
   * Getter method for the COM property "ChartType"
   * </p>
   */

  @DISPID(1400)
  @PropGet
  excel.XlChartType getChartType();


  /**
   * <p>
   * Setter method for the COM property "ChartType"
   * </p>
   * @param rhs Mandatory excel.XlChartType parameter.
   */

  @DISPID(1400)
  @PropPut
  void setChartType(
    excel.XlChartType rhs);


  /**
   * @param chartType Mandatory excel.XlChartType parameter.
   */

  @DISPID(1401)
  void applyCustomType(
    excel.XlChartType chartType);


  /**
   * <p>
   * Getter method for the COM property "Values"
   * </p>
   */

  @DISPID(164)
  @PropGet
  java.lang.Object getValues();


  /**
   * <p>
   * Setter method for the COM property "Values"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(164)
  @PropPut
  void setValues(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "XValues"
   * </p>
   */

  @DISPID(1111)
  @PropGet
  java.lang.Object getXValues();


  /**
   * <p>
   * Setter method for the COM property "XValues"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1111)
  @PropPut
  void setXValues(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "BubbleSizes"
   * </p>
   */

  @DISPID(1664)
  @PropGet
  java.lang.Object getBubbleSizes();


  /**
   * <p>
   * Setter method for the COM property "BubbleSizes"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1664)
  @PropPut
  void setBubbleSizes(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "BarShape"
   * </p>
   */

  @DISPID(1403)
  @PropGet
  excel.XlBarShape getBarShape();


  /**
   * <p>
   * Setter method for the COM property "BarShape"
   * </p>
   * @param rhs Mandatory excel.XlBarShape parameter.
   */

  @DISPID(1403)
  @PropPut
  void setBarShape(
    excel.XlBarShape rhs);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToSides"
   * </p>
   */

  @DISPID(1659)
  @PropGet
  boolean getApplyPictToSides();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToSides"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1659)
  @PropPut
  void setApplyPictToSides(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToFront"
   * </p>
   */

  @DISPID(1660)
  @PropGet
  boolean getApplyPictToFront();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToFront"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1660)
  @PropPut
  void setApplyPictToFront(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToEnd"
   * </p>
   */

  @DISPID(1661)
  @PropGet
  boolean getApplyPictToEnd();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToEnd"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1661)
  @PropPut
  void setApplyPictToEnd(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Has3DEffect"
   * </p>
   */

  @DISPID(1665)
  @PropGet
  boolean getHas3DEffect();


  /**
   * <p>
   * Setter method for the COM property "Has3DEffect"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1665)
  @PropPut
  void setHas3DEffect(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   */

  @DISPID(103)
  @PropGet
  boolean getShadow();


  /**
   * <p>
   * Setter method for the COM property "Shadow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(103)
  @PropPut
  void setShadow(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasLeaderLines"
   * </p>
   */

  @DISPID(1394)
  @PropGet
  boolean getHasLeaderLines();


  /**
   * <p>
   * Setter method for the COM property "HasLeaderLines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1394)
  @PropPut
  void setHasLeaderLines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "LeaderLines"
   * </p>
   */

  @DISPID(1666)
  @PropGet
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
   */

  @DISPID(1922)
  java.lang.Object applyDataLabels(
    @Optional @DefaultValue("2") excel.XlDataLabelsType type,
    @Optional java.lang.Object legendKey,
    @Optional java.lang.Object autoText,
    @Optional java.lang.Object hasLeaderLines,
    @Optional java.lang.Object showSeriesName,
    @Optional java.lang.Object showCategoryName,
    @Optional java.lang.Object showValue,
    @Optional java.lang.Object showPercentage,
    @Optional java.lang.Object showBubbleSize,
    @Optional java.lang.Object separator);


  /**
   * <p>
   * Getter method for the COM property "PictureUnit2"
   * </p>
   */

  @DISPID(2649)
  @PropGet
  double getPictureUnit2();


  /**
   * <p>
   * Setter method for the COM property "PictureUnit2"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(2649)
  @PropPut
  void setPictureUnit2(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   */

  @DISPID(116)
  @PropGet
  excel.ChartFormat getFormat();


  /**
   * <p>
   * Getter method for the COM property "PlotColorIndex"
   * </p>
   */

  @DISPID(2915)
  @PropGet
  int getPlotColorIndex();


  /**
   * <p>
   * Getter method for the COM property "InvertColor"
   * </p>
   */

  @DISPID(2916)
  @PropGet
  int getInvertColor();


  /**
   * <p>
   * Setter method for the COM property "InvertColor"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2916)
  @PropPut
  void setInvertColor(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "InvertColorIndex"
   * </p>
   */

  @DISPID(2917)
  @PropGet
  int getInvertColorIndex();


  /**
   * <p>
   * Setter method for the COM property "InvertColorIndex"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2917)
  @PropPut
  void setInvertColorIndex(
    int rhs);


  // Properties:
}
