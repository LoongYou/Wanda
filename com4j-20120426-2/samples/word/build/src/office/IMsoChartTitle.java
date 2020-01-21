package office  ;

import com4j.*;

@IID("{000C170F-0000-0000-C000-000000000046}")
public interface IMsoChartTitle extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param pbstr Mandatory java.lang.String parameter.
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  void caption(
    java.lang.String pbstr);


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String caption();


  /**
   * <p>
   * Getter method for the COM property "Characters"
   * </p>
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   * @param length Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type office.IMsoCharacters
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  office.IMsoCharacters characters(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object start,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object length);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type office.ChartFont
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  office.ChartFont font();


  /**
   * <p>
   * Setter method for the COM property "HorizontalAlignment"
   * </p>
   * @param val Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  void horizontalAlignment(
    @MarshalAs(NativeType.VARIANT) java.lang.Object val);


  /**
   * <p>
   * Getter method for the COM property "HorizontalAlignment"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object horizontalAlignment();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  double left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param pval Mandatory double parameter.
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(14)
  void left(
    double pval);


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param val Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  void orientation(
    @MarshalAs(NativeType.VARIANT) java.lang.Object val);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object orientation();


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  boolean shadow();


  /**
   * <p>
   * Setter method for the COM property "Shadow"
   * </p>
   * @param pval Mandatory boolean parameter.
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(18)
  void shadow(
    boolean pval);


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param pbstr Mandatory java.lang.String parameter.
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(19)
  void text(
    java.lang.String pbstr);


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String text();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743822) //= 0x6002000e. The runtime will prefer the VTID if present
  @VTID(21)
  double top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param pval Mandatory double parameter.
   */

  @DISPID(1610743822) //= 0x6002000e. The runtime will prefer the VTID if present
  @VTID(22)
  void top(
    double pval);


  /**
   * <p>
   * Setter method for the COM property "VerticalAlignment"
   * </p>
   * @param val Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743824) //= 0x60020010. The runtime will prefer the VTID if present
  @VTID(23)
  void verticalAlignment(
    @MarshalAs(NativeType.VARIANT) java.lang.Object val);


  /**
   * <p>
   * Getter method for the COM property "VerticalAlignment"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743824) //= 0x60020010. The runtime will prefer the VTID if present
  @VTID(24)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object verticalAlignment();


  /**
   * <p>
   * Getter method for the COM property "ReadingOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743826) //= 0x60020012. The runtime will prefer the VTID if present
  @VTID(25)
  int readingOrder();


  /**
   * <p>
   * Setter method for the COM property "ReadingOrder"
   * </p>
   * @param pval Mandatory int parameter.
   */

  @DISPID(1610743826) //= 0x60020012. The runtime will prefer the VTID if present
  @VTID(26)
  void readingOrder(
    int pval);


  /**
   * <p>
   * Setter method for the COM property "AutoScaleFont"
   * </p>
   * @param val Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743828) //= 0x60020014. The runtime will prefer the VTID if present
  @VTID(27)
  void autoScaleFont(
    @MarshalAs(NativeType.VARIANT) java.lang.Object val);


  /**
   * <p>
   * Getter method for the COM property "AutoScaleFont"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743828) //= 0x60020014. The runtime will prefer the VTID if present
  @VTID(28)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object autoScaleFont();


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type office.IMsoInterior
   */

  @DISPID(1610743830) //= 0x60020016. The runtime will prefer the VTID if present
  @VTID(29)
  office.IMsoInterior interior();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type office.ChartFillFormat
   */

  @DISPID(1610743831) //= 0x60020017. The runtime will prefer the VTID if present
  @VTID(30)
  office.ChartFillFormat fill();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743832) //= 0x60020018. The runtime will prefer the VTID if present
  @VTID(31)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object delete();


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   * @return  Returns a value of type office.IMsoBorder
   */

  @DISPID(1610743833) //= 0x60020019. The runtime will prefer the VTID if present
  @VTID(32)
  office.IMsoBorder border();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743834) //= 0x6002001a. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610743835) //= 0x6002001b. The runtime will prefer the VTID if present
  @VTID(34)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743836) //= 0x6002001c. The runtime will prefer the VTID if present
  @VTID(35)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "IncludeInLayout"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2418) //= 0x972. The runtime will prefer the VTID if present
  @VTID(36)
  boolean includeInLayout();


  /**
   * <p>
   * Setter method for the COM property "IncludeInLayout"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2418) //= 0x972. The runtime will prefer the VTID if present
  @VTID(37)
  void includeInLayout(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   * @return  Returns a value of type office.XlChartElementPosition
   */

  @DISPID(1671) //= 0x687. The runtime will prefer the VTID if present
  @VTID(38)
  office.XlChartElementPosition position();


  /**
   * <p>
   * Setter method for the COM property "Position"
   * </p>
   * @param pval Mandatory office.XlChartElementPosition parameter.
   */

  @DISPID(1671) //= 0x687. The runtime will prefer the VTID if present
  @VTID(39)
  void position(
    office.XlChartElementPosition pval);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type office.IMsoChartFormat
   */

  @DISPID(1610743841) //= 0x60020021. The runtime will prefer the VTID if present
  @VTID(40)
  office.IMsoChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743842) //= 0x60020022. The runtime will prefer the VTID if present
  @VTID(41)
  double height();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(42)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(43)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743845) //= 0x60020025. The runtime will prefer the VTID if present
  @VTID(44)
  double width();


  /**
   * <p>
   * Setter method for the COM property "Formula"
   * </p>
   * @param pbstr Mandatory java.lang.String parameter.
   */

  @DISPID(1610743846) //= 0x60020026. The runtime will prefer the VTID if present
  @VTID(45)
  void formula(
    java.lang.String pbstr);


  /**
   * <p>
   * Getter method for the COM property "Formula"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743846) //= 0x60020026. The runtime will prefer the VTID if present
  @VTID(46)
  java.lang.String formula();


  /**
   * <p>
   * Setter method for the COM property "FormulaR1C1"
   * </p>
   * @param pbstr Mandatory java.lang.String parameter.
   */

  @DISPID(1610743848) //= 0x60020028. The runtime will prefer the VTID if present
  @VTID(47)
  void formulaR1C1(
    java.lang.String pbstr);


  /**
   * <p>
   * Getter method for the COM property "FormulaR1C1"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743848) //= 0x60020028. The runtime will prefer the VTID if present
  @VTID(48)
  java.lang.String formulaR1C1();


  /**
   * <p>
   * Setter method for the COM property "FormulaLocal"
   * </p>
   * @param pbstr Mandatory java.lang.String parameter.
   */

  @DISPID(1610743850) //= 0x6002002a. The runtime will prefer the VTID if present
  @VTID(49)
  void formulaLocal(
    java.lang.String pbstr);


  /**
   * <p>
   * Getter method for the COM property "FormulaLocal"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743850) //= 0x6002002a. The runtime will prefer the VTID if present
  @VTID(50)
  java.lang.String formulaLocal();


  /**
   * <p>
   * Setter method for the COM property "FormulaR1C1Local"
   * </p>
   * @param pbstr Mandatory java.lang.String parameter.
   */

  @DISPID(1610743852) //= 0x6002002c. The runtime will prefer the VTID if present
  @VTID(51)
  void formulaR1C1Local(
    java.lang.String pbstr);


  /**
   * <p>
   * Getter method for the COM property "FormulaR1C1Local"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743852) //= 0x6002002c. The runtime will prefer the VTID if present
  @VTID(52)
  java.lang.String formulaR1C1Local();


  // Properties:
}
