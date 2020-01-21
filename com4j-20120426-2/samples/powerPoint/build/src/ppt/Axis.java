package ppt  ;

import com4j.*;

@IID("{92D41A53-F07E-4CA4-AF6F-BEF486AA4E6F}")
public interface Axis extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "AxisBetweenCategories"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  boolean axisBetweenCategories();


  /**
   * <p>
   * Setter method for the COM property "AxisBetweenCategories"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(8)
  void axisBetweenCategories(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AxisGroup"
   * </p>
   * @return  Returns a value of type ppt.XlAxisGroup
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.XlAxisGroup axisGroup();


  /**
   * <p>
   * Getter method for the COM property "AxisTitle"
   * </p>
   * @return  Returns a value of type ppt.AxisTitle
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(10)
  ppt.AxisTitle axisTitle();


  /**
   * <p>
   * Getter method for the COM property "CategoryNames"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object categoryNames();


  /**
   * <p>
   * Setter method for the COM property "CategoryNames"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(12)
  void categoryNames(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Crosses"
   * </p>
   * @return  Returns a value of type ppt.XlAxisCrosses
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(13)
  ppt.XlAxisCrosses crosses();


  /**
   * <p>
   * Setter method for the COM property "Crosses"
   * </p>
   * @param rhs Mandatory ppt.XlAxisCrosses parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(14)
  void crosses(
    ppt.XlAxisCrosses rhs);


  /**
   * <p>
   * Getter method for the COM property "CrossesAt"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(15)
  double crossesAt();


  /**
   * <p>
   * Setter method for the COM property "CrossesAt"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(16)
  void crossesAt(
    double rhs);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object delete();


  /**
   * <p>
   * Getter method for the COM property "HasMajorGridlines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(18)
  boolean hasMajorGridlines();


  /**
   * <p>
   * Setter method for the COM property "HasMajorGridlines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(19)
  void hasMajorGridlines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasMinorGridlines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(20)
  boolean hasMinorGridlines();


  /**
   * <p>
   * Setter method for the COM property "HasMinorGridlines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(21)
  void hasMinorGridlines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasTitle"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(22)
  boolean hasTitle();


  /**
   * <p>
   * Setter method for the COM property "HasTitle"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(23)
  void hasTitle(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MajorGridlines"
   * </p>
   * @return  Returns a value of type ppt.Gridlines
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(24)
  ppt.Gridlines majorGridlines();


  /**
   * <p>
   * Getter method for the COM property "MajorTickMark"
   * </p>
   * @return  Returns a value of type ppt.XlTickMark
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(25)
  ppt.XlTickMark majorTickMark();


  /**
   * <p>
   * Setter method for the COM property "MajorTickMark"
   * </p>
   * @param rhs Mandatory ppt.XlTickMark parameter.
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(26)
  void majorTickMark(
    ppt.XlTickMark rhs);


  /**
   * <p>
   * Getter method for the COM property "MajorUnit"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(27)
  double majorUnit();


  /**
   * <p>
   * Setter method for the COM property "MajorUnit"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(28)
  void majorUnit(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "LogBase"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(29)
  double logBase();


  /**
   * <p>
   * Setter method for the COM property "LogBase"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(30)
  void logBase(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "TickLabelSpacingIsAuto"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(31)
  boolean tickLabelSpacingIsAuto();


  /**
   * <p>
   * Setter method for the COM property "TickLabelSpacingIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(32)
  void tickLabelSpacingIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MajorUnitIsAuto"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(33)
  boolean majorUnitIsAuto();


  /**
   * <p>
   * Setter method for the COM property "MajorUnitIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(34)
  void majorUnitIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MaximumScale"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(35)
  double maximumScale();


  /**
   * <p>
   * Setter method for the COM property "MaximumScale"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(36)
  void maximumScale(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "MaximumScaleIsAuto"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2018) //= 0x7e2. The runtime will prefer the VTID if present
  @VTID(37)
  boolean maximumScaleIsAuto();


  /**
   * <p>
   * Setter method for the COM property "MaximumScaleIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2018) //= 0x7e2. The runtime will prefer the VTID if present
  @VTID(38)
  void maximumScaleIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MinimumScale"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2019) //= 0x7e3. The runtime will prefer the VTID if present
  @VTID(39)
  double minimumScale();


  /**
   * <p>
   * Setter method for the COM property "MinimumScale"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(2019) //= 0x7e3. The runtime will prefer the VTID if present
  @VTID(40)
  void minimumScale(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "MinimumScaleIsAuto"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2020) //= 0x7e4. The runtime will prefer the VTID if present
  @VTID(41)
  boolean minimumScaleIsAuto();


  /**
   * <p>
   * Setter method for the COM property "MinimumScaleIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2020) //= 0x7e4. The runtime will prefer the VTID if present
  @VTID(42)
  void minimumScaleIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MinorGridlines"
   * </p>
   * @return  Returns a value of type ppt.Gridlines
   */

  @DISPID(2021) //= 0x7e5. The runtime will prefer the VTID if present
  @VTID(43)
  ppt.Gridlines minorGridlines();


  /**
   * <p>
   * Getter method for the COM property "MinorTickMark"
   * </p>
   * @return  Returns a value of type ppt.XlTickMark
   */

  @DISPID(2022) //= 0x7e6. The runtime will prefer the VTID if present
  @VTID(44)
  ppt.XlTickMark minorTickMark();


  /**
   * <p>
   * Setter method for the COM property "MinorTickMark"
   * </p>
   * @param rhs Mandatory ppt.XlTickMark parameter.
   */

  @DISPID(2022) //= 0x7e6. The runtime will prefer the VTID if present
  @VTID(45)
  void minorTickMark(
    ppt.XlTickMark rhs);


  /**
   * <p>
   * Getter method for the COM property "MinorUnit"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2023) //= 0x7e7. The runtime will prefer the VTID if present
  @VTID(46)
  double minorUnit();


  /**
   * <p>
   * Setter method for the COM property "MinorUnit"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(2023) //= 0x7e7. The runtime will prefer the VTID if present
  @VTID(47)
  void minorUnit(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "MinorUnitIsAuto"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2024) //= 0x7e8. The runtime will prefer the VTID if present
  @VTID(48)
  boolean minorUnitIsAuto();


  /**
   * <p>
   * Setter method for the COM property "MinorUnitIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2024) //= 0x7e8. The runtime will prefer the VTID if present
  @VTID(49)
  void minorUnitIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ReversePlotOrder"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2025) //= 0x7e9. The runtime will prefer the VTID if present
  @VTID(50)
  boolean reversePlotOrder();


  /**
   * <p>
   * Setter method for the COM property "ReversePlotOrder"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2025) //= 0x7e9. The runtime will prefer the VTID if present
  @VTID(51)
  void reversePlotOrder(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ScaleType"
   * </p>
   * @return  Returns a value of type ppt.XlScaleType
   */

  @DISPID(2026) //= 0x7ea. The runtime will prefer the VTID if present
  @VTID(52)
  ppt.XlScaleType scaleType();


  /**
   * <p>
   * Setter method for the COM property "ScaleType"
   * </p>
   * @param rhs Mandatory ppt.XlScaleType parameter.
   */

  @DISPID(2026) //= 0x7ea. The runtime will prefer the VTID if present
  @VTID(53)
  void scaleType(
    ppt.XlScaleType rhs);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2027) //= 0x7eb. The runtime will prefer the VTID if present
  @VTID(54)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "TickLabelPosition"
   * </p>
   * @return  Returns a value of type ppt.XlTickLabelPosition
   */

  @DISPID(2028) //= 0x7ec. The runtime will prefer the VTID if present
  @VTID(55)
  ppt.XlTickLabelPosition tickLabelPosition();


  /**
   * <p>
   * Setter method for the COM property "TickLabelPosition"
   * </p>
   * @param rhs Mandatory ppt.XlTickLabelPosition parameter.
   */

  @DISPID(2028) //= 0x7ec. The runtime will prefer the VTID if present
  @VTID(56)
  void tickLabelPosition(
    ppt.XlTickLabelPosition rhs);


  /**
   * <p>
   * Getter method for the COM property "TickLabels"
   * </p>
   * @return  Returns a value of type ppt.TickLabels
   */

  @DISPID(2029) //= 0x7ed. The runtime will prefer the VTID if present
  @VTID(57)
  ppt.TickLabels tickLabels();


  /**
   * <p>
   * Getter method for the COM property "TickLabelSpacing"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2030) //= 0x7ee. The runtime will prefer the VTID if present
  @VTID(58)
  int tickLabelSpacing();


  /**
   * <p>
   * Setter method for the COM property "TickLabelSpacing"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2030) //= 0x7ee. The runtime will prefer the VTID if present
  @VTID(59)
  void tickLabelSpacing(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "TickMarkSpacing"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2031) //= 0x7ef. The runtime will prefer the VTID if present
  @VTID(60)
  int tickMarkSpacing();


  /**
   * <p>
   * Setter method for the COM property "TickMarkSpacing"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2031) //= 0x7ef. The runtime will prefer the VTID if present
  @VTID(61)
  void tickMarkSpacing(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type ppt.XlAxisType
   */

  @DISPID(2032) //= 0x7f0. The runtime will prefer the VTID if present
  @VTID(62)
  ppt.XlAxisType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory ppt.XlAxisType parameter.
   */

  @DISPID(2032) //= 0x7f0. The runtime will prefer the VTID if present
  @VTID(63)
  void type(
    ppt.XlAxisType rhs);


  /**
   * <p>
   * Getter method for the COM property "BaseUnit"
   * </p>
   * @return  Returns a value of type ppt.XlTimeUnit
   */

  @DISPID(2033) //= 0x7f1. The runtime will prefer the VTID if present
  @VTID(64)
  ppt.XlTimeUnit baseUnit();


  /**
   * <p>
   * Setter method for the COM property "BaseUnit"
   * </p>
   * @param rhs Mandatory ppt.XlTimeUnit parameter.
   */

  @DISPID(2033) //= 0x7f1. The runtime will prefer the VTID if present
  @VTID(65)
  void baseUnit(
    ppt.XlTimeUnit rhs);


  /**
   * <p>
   * Getter method for the COM property "BaseUnitIsAuto"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2034) //= 0x7f2. The runtime will prefer the VTID if present
  @VTID(66)
  boolean baseUnitIsAuto();


  /**
   * <p>
   * Setter method for the COM property "BaseUnitIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2034) //= 0x7f2. The runtime will prefer the VTID if present
  @VTID(67)
  void baseUnitIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MajorUnitScale"
   * </p>
   * @return  Returns a value of type ppt.XlTimeUnit
   */

  @DISPID(2035) //= 0x7f3. The runtime will prefer the VTID if present
  @VTID(68)
  ppt.XlTimeUnit majorUnitScale();


  /**
   * <p>
   * Setter method for the COM property "MajorUnitScale"
   * </p>
   * @param rhs Mandatory ppt.XlTimeUnit parameter.
   */

  @DISPID(2035) //= 0x7f3. The runtime will prefer the VTID if present
  @VTID(69)
  void majorUnitScale(
    ppt.XlTimeUnit rhs);


  /**
   * <p>
   * Getter method for the COM property "MinorUnitScale"
   * </p>
   * @return  Returns a value of type ppt.XlTimeUnit
   */

  @DISPID(2036) //= 0x7f4. The runtime will prefer the VTID if present
  @VTID(70)
  ppt.XlTimeUnit minorUnitScale();


  /**
   * <p>
   * Setter method for the COM property "MinorUnitScale"
   * </p>
   * @param rhs Mandatory ppt.XlTimeUnit parameter.
   */

  @DISPID(2036) //= 0x7f4. The runtime will prefer the VTID if present
  @VTID(71)
  void minorUnitScale(
    ppt.XlTimeUnit rhs);


  /**
   * <p>
   * Getter method for the COM property "CategoryType"
   * </p>
   * @return  Returns a value of type ppt.XlCategoryType
   */

  @DISPID(2037) //= 0x7f5. The runtime will prefer the VTID if present
  @VTID(72)
  ppt.XlCategoryType categoryType();


  /**
   * <p>
   * Setter method for the COM property "CategoryType"
   * </p>
   * @param rhs Mandatory ppt.XlCategoryType parameter.
   */

  @DISPID(2037) //= 0x7f5. The runtime will prefer the VTID if present
  @VTID(73)
  void categoryType(
    ppt.XlCategoryType rhs);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2038) //= 0x7f6. The runtime will prefer the VTID if present
  @VTID(74)
  double left();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2039) //= 0x7f7. The runtime will prefer the VTID if present
  @VTID(75)
  double top();


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2040) //= 0x7f8. The runtime will prefer the VTID if present
  @VTID(76)
  double width();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2041) //= 0x7f9. The runtime will prefer the VTID if present
  @VTID(77)
  double height();


  /**
   * <p>
   * Getter method for the COM property "DisplayUnit"
   * </p>
   * @return  Returns a value of type ppt.XlDisplayUnit
   */

  @DISPID(2042) //= 0x7fa. The runtime will prefer the VTID if present
  @VTID(78)
  ppt.XlDisplayUnit displayUnit();


  /**
   * <p>
   * Setter method for the COM property "DisplayUnit"
   * </p>
   * @param rhs Mandatory ppt.XlDisplayUnit parameter.
   */

  @DISPID(2042) //= 0x7fa. The runtime will prefer the VTID if present
  @VTID(79)
  void displayUnit(
    ppt.XlDisplayUnit rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayUnitCustom"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(2043) //= 0x7fb. The runtime will prefer the VTID if present
  @VTID(80)
  double displayUnitCustom();


  /**
   * <p>
   * Setter method for the COM property "DisplayUnitCustom"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(2043) //= 0x7fb. The runtime will prefer the VTID if present
  @VTID(81)
  void displayUnitCustom(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "HasDisplayUnitLabel"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2044) //= 0x7fc. The runtime will prefer the VTID if present
  @VTID(82)
  boolean hasDisplayUnitLabel();


  /**
   * <p>
   * Setter method for the COM property "HasDisplayUnitLabel"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2044) //= 0x7fc. The runtime will prefer the VTID if present
  @VTID(83)
  void hasDisplayUnitLabel(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayUnitLabel"
   * </p>
   * @return  Returns a value of type ppt.DisplayUnitLabel
   */

  @DISPID(2045) //= 0x7fd. The runtime will prefer the VTID if present
  @VTID(84)
  ppt.DisplayUnitLabel displayUnitLabel();


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   * @return  Returns a value of type ppt.ChartBorder
   */

  @DISPID(2046) //= 0x7fe. The runtime will prefer the VTID if present
  @VTID(85)
  ppt.ChartBorder border();


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type ppt.ChartFormat
   */

  @DISPID(2047) //= 0x7ff. The runtime will prefer the VTID if present
  @VTID(86)
  ppt.ChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(87)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(88)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2048) //= 0x800. The runtime will prefer the VTID if present
  @VTID(89)
  ppt._Application application();


  // Properties:
}
