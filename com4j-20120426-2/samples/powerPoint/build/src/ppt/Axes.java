package ppt  ;

import com4j.*;

@IID("{92D41A52-F07E-4CA4-AF6F-BEF486AA4E6F}")
public interface Axes extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(10)
  ppt._Application application();


  /**
   * @param type Mandatory ppt.XlAxisType parameter.
   * @param axisGroup Optional parameter. Default value is 1
   * @return  Returns a value of type ppt.Axis
   */

  @DISPID(170) //= 0xaa. The runtime will prefer the VTID if present
  @VTID(11)
  ppt.Axis item(
    ppt.XlAxisType type,
    @Optional @DefaultValue("1") ppt.XlAxisGroup axisGroup);


  /**
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(12)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param type Mandatory ppt.XlAxisType parameter.
   * @param axisGroup Optional parameter. Default value is 1
   * @return  Returns a value of type ppt.Axis
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(13)
  @DefaultMethod
  ppt.Axis _Default(
    ppt.XlAxisType type,
    @Optional @DefaultValue("1") ppt.XlAxisGroup axisGroup);


  // Properties:
}
