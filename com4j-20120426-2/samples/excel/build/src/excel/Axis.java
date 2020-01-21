package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Axis extends Com4jObject {
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
   * Getter method for the COM property "AxisBetweenCategories"
   * </p>
   */

  @DISPID(45)
  @PropGet
  boolean getAxisBetweenCategories();


  /**
   * <p>
   * Setter method for the COM property "AxisBetweenCategories"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(45)
  @PropPut
  void setAxisBetweenCategories(
    boolean rhs);


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
   * Getter method for the COM property "AxisTitle"
   * </p>
   */

  @DISPID(82)
  @PropGet
  excel.AxisTitle getAxisTitle();


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   */

  @DISPID(128)
  @PropGet
  excel.Border getBorder();


  /**
   * <p>
   * Getter method for the COM property "CategoryNames"
   * </p>
   */

  @DISPID(156)
  @PropGet
  java.lang.Object getCategoryNames();


  /**
   * <p>
   * Setter method for the COM property "CategoryNames"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(156)
  @PropPut
  void setCategoryNames(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Crosses"
   * </p>
   */

  @DISPID(42)
  @PropGet
  excel.XlAxisCrosses getCrosses();


  /**
   * <p>
   * Setter method for the COM property "Crosses"
   * </p>
   * @param rhs Mandatory excel.XlAxisCrosses parameter.
   */

  @DISPID(42)
  @PropPut
  void setCrosses(
    excel.XlAxisCrosses rhs);


  /**
   * <p>
   * Getter method for the COM property "CrossesAt"
   * </p>
   */

  @DISPID(43)
  @PropGet
  double getCrossesAt();


  /**
   * <p>
   * Setter method for the COM property "CrossesAt"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(43)
  @PropPut
  void setCrossesAt(
    double rhs);


  /**
   */

  @DISPID(117)
  java.lang.Object delete();


  /**
   * <p>
   * Getter method for the COM property "HasMajorGridlines"
   * </p>
   */

  @DISPID(24)
  @PropGet
  boolean getHasMajorGridlines();


  /**
   * <p>
   * Setter method for the COM property "HasMajorGridlines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(24)
  @PropPut
  void setHasMajorGridlines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasMinorGridlines"
   * </p>
   */

  @DISPID(25)
  @PropGet
  boolean getHasMinorGridlines();


  /**
   * <p>
   * Setter method for the COM property "HasMinorGridlines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(25)
  @PropPut
  void setHasMinorGridlines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasTitle"
   * </p>
   */

  @DISPID(54)
  @PropGet
  boolean getHasTitle();


  /**
   * <p>
   * Setter method for the COM property "HasTitle"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(54)
  @PropPut
  void setHasTitle(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MajorGridlines"
   * </p>
   */

  @DISPID(89)
  @PropGet
  excel.Gridlines getMajorGridlines();


  /**
   * <p>
   * Getter method for the COM property "MajorTickMark"
   * </p>
   */

  @DISPID(26)
  @PropGet
  excel.XlTickMark getMajorTickMark();


  /**
   * <p>
   * Setter method for the COM property "MajorTickMark"
   * </p>
   * @param rhs Mandatory excel.XlTickMark parameter.
   */

  @DISPID(26)
  @PropPut
  void setMajorTickMark(
    excel.XlTickMark rhs);


  /**
   * <p>
   * Getter method for the COM property "MajorUnit"
   * </p>
   */

  @DISPID(37)
  @PropGet
  double getMajorUnit();


  /**
   * <p>
   * Setter method for the COM property "MajorUnit"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(37)
  @PropPut
  void setMajorUnit(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "MajorUnitIsAuto"
   * </p>
   */

  @DISPID(38)
  @PropGet
  boolean getMajorUnitIsAuto();


  /**
   * <p>
   * Setter method for the COM property "MajorUnitIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(38)
  @PropPut
  void setMajorUnitIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MaximumScale"
   * </p>
   */

  @DISPID(35)
  @PropGet
  double getMaximumScale();


  /**
   * <p>
   * Setter method for the COM property "MaximumScale"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(35)
  @PropPut
  void setMaximumScale(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "MaximumScaleIsAuto"
   * </p>
   */

  @DISPID(36)
  @PropGet
  boolean getMaximumScaleIsAuto();


  /**
   * <p>
   * Setter method for the COM property "MaximumScaleIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(36)
  @PropPut
  void setMaximumScaleIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MinimumScale"
   * </p>
   */

  @DISPID(33)
  @PropGet
  double getMinimumScale();


  /**
   * <p>
   * Setter method for the COM property "MinimumScale"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(33)
  @PropPut
  void setMinimumScale(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "MinimumScaleIsAuto"
   * </p>
   */

  @DISPID(34)
  @PropGet
  boolean getMinimumScaleIsAuto();


  /**
   * <p>
   * Setter method for the COM property "MinimumScaleIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(34)
  @PropPut
  void setMinimumScaleIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MinorGridlines"
   * </p>
   */

  @DISPID(90)
  @PropGet
  excel.Gridlines getMinorGridlines();


  /**
   * <p>
   * Getter method for the COM property "MinorTickMark"
   * </p>
   */

  @DISPID(27)
  @PropGet
  excel.XlTickMark getMinorTickMark();


  /**
   * <p>
   * Setter method for the COM property "MinorTickMark"
   * </p>
   * @param rhs Mandatory excel.XlTickMark parameter.
   */

  @DISPID(27)
  @PropPut
  void setMinorTickMark(
    excel.XlTickMark rhs);


  /**
   * <p>
   * Getter method for the COM property "MinorUnit"
   * </p>
   */

  @DISPID(39)
  @PropGet
  double getMinorUnit();


  /**
   * <p>
   * Setter method for the COM property "MinorUnit"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(39)
  @PropPut
  void setMinorUnit(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "MinorUnitIsAuto"
   * </p>
   */

  @DISPID(40)
  @PropGet
  boolean getMinorUnitIsAuto();


  /**
   * <p>
   * Setter method for the COM property "MinorUnitIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(40)
  @PropPut
  void setMinorUnitIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ReversePlotOrder"
   * </p>
   */

  @DISPID(44)
  @PropGet
  boolean getReversePlotOrder();


  /**
   * <p>
   * Setter method for the COM property "ReversePlotOrder"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(44)
  @PropPut
  void setReversePlotOrder(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ScaleType"
   * </p>
   */

  @DISPID(41)
  @PropGet
  excel.XlScaleType getScaleType();


  /**
   * <p>
   * Setter method for the COM property "ScaleType"
   * </p>
   * @param rhs Mandatory excel.XlScaleType parameter.
   */

  @DISPID(41)
  @PropPut
  void setScaleType(
    excel.XlScaleType rhs);


  /**
   */

  @DISPID(235)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "TickLabelPosition"
   * </p>
   */

  @DISPID(28)
  @PropGet
  excel.XlTickLabelPosition getTickLabelPosition();


  /**
   * <p>
   * Setter method for the COM property "TickLabelPosition"
   * </p>
   * @param rhs Mandatory excel.XlTickLabelPosition parameter.
   */

  @DISPID(28)
  @PropPut
  void setTickLabelPosition(
    excel.XlTickLabelPosition rhs);


  /**
   * <p>
   * Getter method for the COM property "TickLabels"
   * </p>
   */

  @DISPID(91)
  @PropGet
  excel.TickLabels getTickLabels();


  /**
   * <p>
   * Getter method for the COM property "TickLabelSpacing"
   * </p>
   */

  @DISPID(29)
  @PropGet
  int getTickLabelSpacing();


  /**
   * <p>
   * Setter method for the COM property "TickLabelSpacing"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(29)
  @PropPut
  void setTickLabelSpacing(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "TickMarkSpacing"
   * </p>
   */

  @DISPID(31)
  @PropGet
  int getTickMarkSpacing();


  /**
   * <p>
   * Setter method for the COM property "TickMarkSpacing"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(31)
  @PropPut
  void setTickMarkSpacing(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  excel.XlAxisType getType();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory excel.XlAxisType parameter.
   */

  @DISPID(108)
  @PropPut
  void setType(
    excel.XlAxisType rhs);


  /**
   * <p>
   * Getter method for the COM property "BaseUnit"
   * </p>
   */

  @DISPID(1647)
  @PropGet
  excel.XlTimeUnit getBaseUnit();


  /**
   * <p>
   * Setter method for the COM property "BaseUnit"
   * </p>
   * @param rhs Mandatory excel.XlTimeUnit parameter.
   */

  @DISPID(1647)
  @PropPut
  void setBaseUnit(
    excel.XlTimeUnit rhs);


  /**
   * <p>
   * Getter method for the COM property "BaseUnitIsAuto"
   * </p>
   */

  @DISPID(1648)
  @PropGet
  boolean getBaseUnitIsAuto();


  /**
   * <p>
   * Setter method for the COM property "BaseUnitIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1648)
  @PropPut
  void setBaseUnitIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MajorUnitScale"
   * </p>
   */

  @DISPID(1649)
  @PropGet
  excel.XlTimeUnit getMajorUnitScale();


  /**
   * <p>
   * Setter method for the COM property "MajorUnitScale"
   * </p>
   * @param rhs Mandatory excel.XlTimeUnit parameter.
   */

  @DISPID(1649)
  @PropPut
  void setMajorUnitScale(
    excel.XlTimeUnit rhs);


  /**
   * <p>
   * Getter method for the COM property "MinorUnitScale"
   * </p>
   */

  @DISPID(1650)
  @PropGet
  excel.XlTimeUnit getMinorUnitScale();


  /**
   * <p>
   * Setter method for the COM property "MinorUnitScale"
   * </p>
   * @param rhs Mandatory excel.XlTimeUnit parameter.
   */

  @DISPID(1650)
  @PropPut
  void setMinorUnitScale(
    excel.XlTimeUnit rhs);


  /**
   * <p>
   * Getter method for the COM property "CategoryType"
   * </p>
   */

  @DISPID(1651)
  @PropGet
  excel.XlCategoryType getCategoryType();


  /**
   * <p>
   * Setter method for the COM property "CategoryType"
   * </p>
   * @param rhs Mandatory excel.XlCategoryType parameter.
   */

  @DISPID(1651)
  @PropPut
  void setCategoryType(
    excel.XlCategoryType rhs);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   */

  @DISPID(127)
  @PropGet
  double getLeft();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   */

  @DISPID(126)
  @PropGet
  double getTop();


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   */

  @DISPID(122)
  @PropGet
  double getWidth();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   */

  @DISPID(123)
  @PropGet
  double getHeight();


  /**
   * <p>
   * Getter method for the COM property "DisplayUnit"
   * </p>
   */

  @DISPID(1886)
  @PropGet
  excel.XlDisplayUnit getDisplayUnit();


  /**
   * <p>
   * Setter method for the COM property "DisplayUnit"
   * </p>
   * @param rhs Mandatory excel.XlDisplayUnit parameter.
   */

  @DISPID(1886)
  @PropPut
  void setDisplayUnit(
    excel.XlDisplayUnit rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayUnitCustom"
   * </p>
   */

  @DISPID(1887)
  @PropGet
  double getDisplayUnitCustom();


  /**
   * <p>
   * Setter method for the COM property "DisplayUnitCustom"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(1887)
  @PropPut
  void setDisplayUnitCustom(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "HasDisplayUnitLabel"
   * </p>
   */

  @DISPID(1888)
  @PropGet
  boolean getHasDisplayUnitLabel();


  /**
   * <p>
   * Setter method for the COM property "HasDisplayUnitLabel"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1888)
  @PropPut
  void setHasDisplayUnitLabel(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayUnitLabel"
   * </p>
   */

  @DISPID(1889)
  @PropGet
  excel.DisplayUnitLabel getDisplayUnitLabel();


  /**
   * <p>
   * Getter method for the COM property "LogBase"
   * </p>
   */

  @DISPID(2646)
  @PropGet
  double getLogBase();


  /**
   * <p>
   * Setter method for the COM property "LogBase"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(2646)
  @PropPut
  void setLogBase(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "TickLabelSpacingIsAuto"
   * </p>
   */

  @DISPID(2647)
  @PropGet
  boolean getTickLabelSpacingIsAuto();


  /**
   * <p>
   * Setter method for the COM property "TickLabelSpacingIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2647)
  @PropPut
  void setTickLabelSpacingIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   */

  @DISPID(116)
  @PropGet
  excel.ChartFormat getFormat();


  // Properties:
}
