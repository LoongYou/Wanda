package ppt  ;

import com4j.*;

@IID("{92D41A70-F07E-4CA4-AF6F-BEF486AA4E6F}")
public interface LegendEntry extends Com4jObject {
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
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object delete();


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type ppt.ChartFont
   */

  @DISPID(146) //= 0x92. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.ChartFont font();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(486) //= 0x1e6. The runtime will prefer the VTID if present
  @VTID(10)
  int index();


  /**
   * <p>
   * Getter method for the COM property "LegendKey"
   * </p>
   * @return  Returns a value of type ppt.LegendKey
   */

  @DISPID(174) //= 0xae. The runtime will prefer the VTID if present
  @VTID(11)
  ppt.LegendKey legendKey();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(235) //= 0xeb. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "AutoScaleFont"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1525) //= 0x5f5. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object autoScaleFont();


  /**
   * <p>
   * Setter method for the COM property "AutoScaleFont"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1525) //= 0x5f5. The runtime will prefer the VTID if present
  @VTID(14)
  void autoScaleFont(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(15)
  double left();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(16)
  double top();


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(17)
  double width();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(18)
  double height();


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type ppt.ChartFormat
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(19)
  ppt.ChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(20)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(21)
  ppt._Application application();


  // Properties:
}
