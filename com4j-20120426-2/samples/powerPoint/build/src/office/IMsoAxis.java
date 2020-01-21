package office  ;

import com4j.*;

@IID("{000C1713-0000-0000-C000-000000000046}")
public interface IMsoAxis extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "AxisBetweenCategories"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  boolean axisBetweenCategories();


  /**
   * <p>
   * Setter method for the COM property "AxisBetweenCategories"
   * </p>
   * @param pval Mandatory boolean parameter.
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(8)
  void axisBetweenCategories(
    boolean pval);


  /**
   * <p>
   * Getter method for the COM property "AxisGroup"
   * </p>
   * @return  Returns a value of type office.XlAxisGroup
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  office.XlAxisGroup axisGroup();


  /**
   * <p>
   * Getter method for the COM property "AxisTitle"
   * </p>
   * @return  Returns a value of type office.IMsoAxisTitle
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  office.IMsoAxisTitle axisTitle();


  /**
   * <p>
   * Getter method for the COM property "CategoryNames"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object categoryNames();


  /**
   * <p>
   * Setter method for the COM property "CategoryNames"
   * </p>
   * @param pval Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(12)
  void categoryNames(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pval);


  /**
   * <p>
   * Getter method for the COM property "Crosses"
   * </p>
   * @return  Returns a value of type office.XlAxisCrosses
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  office.XlAxisCrosses crosses();


  /**
   * <p>
   * Setter method for the COM property "Crosses"
   * </p>
   * @param pval Mandatory office.XlAxisCrosses parameter.
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(14)
  void crosses(
    office.XlAxisCrosses pval);


  /**
   * <p>
   * Getter method for the COM property "CrossesAt"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  double crossesAt();


  /**
   * <p>
   * Setter method for the COM property "CrossesAt"
   * </p>
   * @param pval Mandatory double parameter.
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(16)
  void crossesAt(
    double pval);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object delete();


  /**
   * <p>
   * Getter method for the COM property "HasMajorGridlines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(18)
  boolean hasMajorGridlines();


  /**
   * <p>
   * Setter method for the COM property "HasMajorGridlines"
   * </p>
   * @param pval Mandatory boolean parameter.
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(19)
  void hasMajorGridlines(
    boolean pval);


  /**
   * <p>
   * Getter method for the COM property "HasMinorGridlines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743821) //= 0x6002000d. The runtime will prefer the VTID if present
  @VTID(20)
  boolean hasMinorGridlines();


  /**
   * <p>
   * Setter method for the COM property "HasMinorGridlines"
   * </p>
   * @param pval Mandatory boolean parameter.
   */

  @DISPID(1610743821) //= 0x6002000d. The runtime will prefer the VTID if present
  @VTID(21)
  void hasMinorGridlines(
    boolean pval);


  /**
   * <p>
   * Getter method for the COM property "HasTitle"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743823) //= 0x6002000f. The runtime will prefer the VTID if present
  @VTID(22)
  boolean hasTitle();


  /**
   * <p>
   * Setter method for the COM property "HasTitle"
   * </p>
   * @param pval Mandatory boolean parameter.
   */

  @DISPID(1610743823) //= 0x6002000f. The runtime will prefer the VTID if present
  @VTID(23)
  void hasTitle(
    boolean pval);


  /**
   * <p>
   * Getter method for the COM property "MajorGridlines"
   * </p>
   * @return  Returns a value of type office.GridLines
   */

  @DISPID(1610743825) //= 0x60020011. The runtime will prefer the VTID if present
  @VTID(24)
  office.GridLines majorGridlines();


  /**
   * <p>
   * Getter method for the COM property "MajorTickMark"
   * </p>
   * @return  Returns a value of type office.XlTickMark
   */

  @DISPID(1610743826) //= 0x60020012. The runtime will prefer the VTID if present
  @VTID(25)
  office.XlTickMark majorTickMark();


  /**
   * <p>
   * Setter method for the COM property "MajorTickMark"
   * </p>
   * @param pval Mandatory office.XlTickMark parameter.
   */

  @DISPID(1610743826) //= 0x60020012. The runtime will prefer the VTID if present
  @VTID(26)
  void majorTickMark(
    office.XlTickMark pval);


  /**
   * <p>
   * Getter method for the COM property "MajorUnit"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743828) //= 0x60020014. The runtime will prefer the VTID if present
  @VTID(27)
  double majorUnit();


  /**
   * <p>
   * Setter method for the COM property "MajorUnit"
   * </p>
   * @param pval Mandatory double parameter.
   */

  @DISPID(1610743828) //= 0x60020014. The runtime will prefer the VTID if present
  @VTID(28)
  void majorUnit(
    double pval);


  /**
   * <p>
   * Getter method for the COM property "LogBase"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743830) //= 0x60020016. The runtime will prefer the VTID if present
  @VTID(29)
  double logBase();


  /**
   * <p>
   * Setter method for the COM property "LogBase"
   * </p>
   * @param pval Mandatory double parameter.
   */

  @DISPID(1610743830) //= 0x60020016. The runtime will prefer the VTID if present
  @VTID(30)
  void logBase(
    double pval);


  /**
   * <p>
   * Getter method for the COM property "TickLabelSpacingIsAuto"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743832) //= 0x60020018. The runtime will prefer the VTID if present
  @VTID(31)
  boolean tickLabelSpacingIsAuto();


  /**
   * <p>
   * Setter method for the COM property "TickLabelSpacingIsAuto"
   * </p>
   * @param pval Mandatory boolean parameter.
   */

  @DISPID(1610743832) //= 0x60020018. The runtime will prefer the VTID if present
  @VTID(32)
  void tickLabelSpacingIsAuto(
    boolean pval);


  /**
   * <p>
   * Getter method for the COM property "MajorUnitIsAuto"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743834) //= 0x6002001a. The runtime will prefer the VTID if present
  @VTID(33)
  boolean majorUnitIsAuto();


  /**
   * <p>
   * Setter method for the COM property "MajorUnitIsAuto"
   * </p>
   * @param pval Mandatory boolean parameter.
   */

  @DISPID(1610743834) //= 0x6002001a. The runtime will prefer the VTID if present
  @VTID(34)
  void majorUnitIsAuto(
    boolean pval);


  /**
   * <p>
   * Getter method for the COM property "MaximumScale"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743836) //= 0x6002001c. The runtime will prefer the VTID if present
  @VTID(35)
  double maximumScale();


  /**
   * <p>
   * Setter method for the COM property "MaximumScale"
   * </p>
   * @param pval Mandatory double parameter.
   */

  @DISPID(1610743836) //= 0x6002001c. The runtime will prefer the VTID if present
  @VTID(36)
  void maximumScale(
    double pval);


  /**
   * <p>
   * Getter method for the COM property "MaximumScaleIsAuto"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743838) //= 0x6002001e. The runtime will prefer the VTID if present
  @VTID(37)
  boolean maximumScaleIsAuto();


  /**
   * <p>
   * Setter method for the COM property "MaximumScaleIsAuto"
   * </p>
   * @param pval Mandatory boolean parameter.
   */

  @DISPID(1610743838) //= 0x6002001e. The runtime will prefer the VTID if present
  @VTID(38)
  void maximumScaleIsAuto(
    boolean pval);


  /**
   * <p>
   * Getter method for the COM property "MinimumScale"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743840) //= 0x60020020. The runtime will prefer the VTID if present
  @VTID(39)
  double minimumScale();


  /**
   * <p>
   * Setter method for the COM property "MinimumScale"
   * </p>
   * @param pval Mandatory double parameter.
   */

  @DISPID(1610743840) //= 0x60020020. The runtime will prefer the VTID if present
  @VTID(40)
  void minimumScale(
    double pval);


  /**
   * <p>
   * Getter method for the COM property "MinimumScaleIsAuto"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743842) //= 0x60020022. The runtime will prefer the VTID if present
  @VTID(41)
  boolean minimumScaleIsAuto();


  /**
   * <p>
   * Setter method for the COM property "MinimumScaleIsAuto"
   * </p>
   * @param pval Mandatory boolean parameter.
   */

  @DISPID(1610743842) //= 0x60020022. The runtime will prefer the VTID if present
  @VTID(42)
  void minimumScaleIsAuto(
    boolean pval);


  /**
   * <p>
   * Getter method for the COM property "MinorGridlines"
   * </p>
   * @return  Returns a value of type office.GridLines
   */

  @DISPID(1610743844) //= 0x60020024. The runtime will prefer the VTID if present
  @VTID(43)
  office.GridLines minorGridlines();


  /**
   * <p>
   * Getter method for the COM property "MinorTickMark"
   * </p>
   * @return  Returns a value of type office.XlTickMark
   */

  @DISPID(1610743845) //= 0x60020025. The runtime will prefer the VTID if present
  @VTID(44)
  office.XlTickMark minorTickMark();


  /**
   * <p>
   * Setter method for the COM property "MinorTickMark"
   * </p>
   * @param pval Mandatory office.XlTickMark parameter.
   */

  @DISPID(1610743845) //= 0x60020025. The runtime will prefer the VTID if present
  @VTID(45)
  void minorTickMark(
    office.XlTickMark pval);


  /**
   * <p>
   * Getter method for the COM property "MinorUnit"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743847) //= 0x60020027. The runtime will prefer the VTID if present
  @VTID(46)
  double minorUnit();


  /**
   * <p>
   * Setter method for the COM property "MinorUnit"
   * </p>
   * @param pval Mandatory double parameter.
   */

  @DISPID(1610743847) //= 0x60020027. The runtime will prefer the VTID if present
  @VTID(47)
  void minorUnit(
    double pval);


  /**
   * <p>
   * Getter method for the COM property "MinorUnitIsAuto"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743849) //= 0x60020029. The runtime will prefer the VTID if present
  @VTID(48)
  boolean minorUnitIsAuto();


  /**
   * <p>
   * Setter method for the COM property "MinorUnitIsAuto"
   * </p>
   * @param pval Mandatory boolean parameter.
   */

  @DISPID(1610743849) //= 0x60020029. The runtime will prefer the VTID if present
  @VTID(49)
  void minorUnitIsAuto(
    boolean pval);


  /**
   * <p>
   * Getter method for the COM property "ReversePlotOrder"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743851) //= 0x6002002b. The runtime will prefer the VTID if present
  @VTID(50)
  boolean reversePlotOrder();


  /**
   * <p>
   * Setter method for the COM property "ReversePlotOrder"
   * </p>
   * @param pval Mandatory boolean parameter.
   */

  @DISPID(1610743851) //= 0x6002002b. The runtime will prefer the VTID if present
  @VTID(51)
  void reversePlotOrder(
    boolean pval);


  /**
   * <p>
   * Getter method for the COM property "ScaleType"
   * </p>
   * @return  Returns a value of type office.XlScaleType
   */

  @DISPID(1610743853) //= 0x6002002d. The runtime will prefer the VTID if present
  @VTID(52)
  office.XlScaleType scaleType();


  /**
   * <p>
   * Setter method for the COM property "ScaleType"
   * </p>
   * @param pval Mandatory office.XlScaleType parameter.
   */

  @DISPID(1610743853) //= 0x6002002d. The runtime will prefer the VTID if present
  @VTID(53)
  void scaleType(
    office.XlScaleType pval);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743855) //= 0x6002002f. The runtime will prefer the VTID if present
  @VTID(54)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "TickLabelPosition"
   * </p>
   * @return  Returns a value of type office.XlTickLabelPosition
   */

  @DISPID(1610743856) //= 0x60020030. The runtime will prefer the VTID if present
  @VTID(55)
  office.XlTickLabelPosition tickLabelPosition();


  /**
   * <p>
   * Setter method for the COM property "TickLabelPosition"
   * </p>
   * @param pval Mandatory office.XlTickLabelPosition parameter.
   */

  @DISPID(1610743856) //= 0x60020030. The runtime will prefer the VTID if present
  @VTID(56)
  void tickLabelPosition(
    office.XlTickLabelPosition pval);


  /**
   * <p>
   * Getter method for the COM property "TickLabels"
   * </p>
   * @return  Returns a value of type office.IMsoTickLabels
   */

  @DISPID(1610743858) //= 0x60020032. The runtime will prefer the VTID if present
  @VTID(57)
  office.IMsoTickLabels tickLabels();


  /**
   * <p>
   * Getter method for the COM property "TickLabelSpacing"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743859) //= 0x60020033. The runtime will prefer the VTID if present
  @VTID(58)
  int tickLabelSpacing();


  /**
   * <p>
   * Setter method for the COM property "TickLabelSpacing"
   * </p>
   * @param pval Mandatory int parameter.
   */

  @DISPID(1610743859) //= 0x60020033. The runtime will prefer the VTID if present
  @VTID(59)
  void tickLabelSpacing(
    int pval);


  /**
   * <p>
   * Getter method for the COM property "TickMarkSpacing"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743861) //= 0x60020035. The runtime will prefer the VTID if present
  @VTID(60)
  int tickMarkSpacing();


  /**
   * <p>
   * Setter method for the COM property "TickMarkSpacing"
   * </p>
   * @param pval Mandatory int parameter.
   */

  @DISPID(1610743861) //= 0x60020035. The runtime will prefer the VTID if present
  @VTID(61)
  void tickMarkSpacing(
    int pval);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type office.XlAxisType
   */

  @DISPID(1610743863) //= 0x60020037. The runtime will prefer the VTID if present
  @VTID(62)
  office.XlAxisType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param pval Mandatory office.XlAxisType parameter.
   */

  @DISPID(1610743863) //= 0x60020037. The runtime will prefer the VTID if present
  @VTID(63)
  void type(
    office.XlAxisType pval);


  /**
   * <p>
   * Getter method for the COM property "BaseUnit"
   * </p>
   * @return  Returns a value of type office.XlTimeUnit
   */

  @DISPID(1610743865) //= 0x60020039. The runtime will prefer the VTID if present
  @VTID(64)
  office.XlTimeUnit baseUnit();


  /**
   * <p>
   * Setter method for the COM property "BaseUnit"
   * </p>
   * @param pval Mandatory office.XlTimeUnit parameter.
   */

  @DISPID(1610743865) //= 0x60020039. The runtime will prefer the VTID if present
  @VTID(65)
  void baseUnit(
    office.XlTimeUnit pval);


  /**
   * <p>
   * Getter method for the COM property "BaseUnitIsAuto"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743867) //= 0x6002003b. The runtime will prefer the VTID if present
  @VTID(66)
  boolean baseUnitIsAuto();


  /**
   * <p>
   * Setter method for the COM property "BaseUnitIsAuto"
   * </p>
   * @param pval Mandatory boolean parameter.
   */

  @DISPID(1610743867) //= 0x6002003b. The runtime will prefer the VTID if present
  @VTID(67)
  void baseUnitIsAuto(
    boolean pval);


  /**
   * <p>
   * Getter method for the COM property "MajorUnitScale"
   * </p>
   * @return  Returns a value of type office.XlTimeUnit
   */

  @DISPID(1610743869) //= 0x6002003d. The runtime will prefer the VTID if present
  @VTID(68)
  office.XlTimeUnit majorUnitScale();


  /**
   * <p>
   * Setter method for the COM property "MajorUnitScale"
   * </p>
   * @param pval Mandatory office.XlTimeUnit parameter.
   */

  @DISPID(1610743869) //= 0x6002003d. The runtime will prefer the VTID if present
  @VTID(69)
  void majorUnitScale(
    office.XlTimeUnit pval);


  /**
   * <p>
   * Getter method for the COM property "MinorUnitScale"
   * </p>
   * @return  Returns a value of type office.XlTimeUnit
   */

  @DISPID(1610743871) //= 0x6002003f. The runtime will prefer the VTID if present
  @VTID(70)
  office.XlTimeUnit minorUnitScale();


  /**
   * <p>
   * Setter method for the COM property "MinorUnitScale"
   * </p>
   * @param pval Mandatory office.XlTimeUnit parameter.
   */

  @DISPID(1610743871) //= 0x6002003f. The runtime will prefer the VTID if present
  @VTID(71)
  void minorUnitScale(
    office.XlTimeUnit pval);


  /**
   * <p>
   * Getter method for the COM property "CategoryType"
   * </p>
   * @return  Returns a value of type office.XlCategoryType
   */

  @DISPID(1610743873) //= 0x60020041. The runtime will prefer the VTID if present
  @VTID(72)
  office.XlCategoryType categoryType();


  /**
   * <p>
   * Setter method for the COM property "CategoryType"
   * </p>
   * @param pval Mandatory office.XlCategoryType parameter.
   */

  @DISPID(1610743873) //= 0x60020041. The runtime will prefer the VTID if present
  @VTID(73)
  void categoryType(
    office.XlCategoryType pval);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743875) //= 0x60020043. The runtime will prefer the VTID if present
  @VTID(74)
  double left();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743876) //= 0x60020044. The runtime will prefer the VTID if present
  @VTID(75)
  double top();


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743877) //= 0x60020045. The runtime will prefer the VTID if present
  @VTID(76)
  double width();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743878) //= 0x60020046. The runtime will prefer the VTID if present
  @VTID(77)
  double height();


  /**
   * <p>
   * Getter method for the COM property "DisplayUnit"
   * </p>
   * @return  Returns a value of type office.XlDisplayUnit
   */

  @DISPID(1610743879) //= 0x60020047. The runtime will prefer the VTID if present
  @VTID(78)
  office.XlDisplayUnit displayUnit();


  /**
   * <p>
   * Setter method for the COM property "DisplayUnit"
   * </p>
   * @param pval Mandatory office.XlDisplayUnit parameter.
   */

  @DISPID(1610743879) //= 0x60020047. The runtime will prefer the VTID if present
  @VTID(79)
  void displayUnit(
    office.XlDisplayUnit pval);


  /**
   * <p>
   * Getter method for the COM property "DisplayUnitCustom"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743881) //= 0x60020049. The runtime will prefer the VTID if present
  @VTID(80)
  double displayUnitCustom();


  /**
   * <p>
   * Setter method for the COM property "DisplayUnitCustom"
   * </p>
   * @param pval Mandatory double parameter.
   */

  @DISPID(1610743881) //= 0x60020049. The runtime will prefer the VTID if present
  @VTID(81)
  void displayUnitCustom(
    double pval);


  /**
   * <p>
   * Getter method for the COM property "HasDisplayUnitLabel"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743883) //= 0x6002004b. The runtime will prefer the VTID if present
  @VTID(82)
  boolean hasDisplayUnitLabel();


  /**
   * <p>
   * Setter method for the COM property "HasDisplayUnitLabel"
   * </p>
   * @param pval Mandatory boolean parameter.
   */

  @DISPID(1610743883) //= 0x6002004b. The runtime will prefer the VTID if present
  @VTID(83)
  void hasDisplayUnitLabel(
    boolean pval);


  /**
   * <p>
   * Getter method for the COM property "DisplayUnitLabel"
   * </p>
   * @return  Returns a value of type office.IMsoDisplayUnitLabel
   */

  @DISPID(1610743885) //= 0x6002004d. The runtime will prefer the VTID if present
  @VTID(84)
  office.IMsoDisplayUnitLabel displayUnitLabel();


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   * @return  Returns a value of type office.IMsoBorder
   */

  @DISPID(1610743886) //= 0x6002004e. The runtime will prefer the VTID if present
  @VTID(85)
  office.IMsoBorder border();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743887) //= 0x6002004f. The runtime will prefer the VTID if present
  @VTID(86)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type office.IMsoChartFormat
   */

  @DISPID(1610743888) //= 0x60020050. The runtime will prefer the VTID if present
  @VTID(87)
  office.IMsoChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(88)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(89)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(90)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  // Properties:
}
