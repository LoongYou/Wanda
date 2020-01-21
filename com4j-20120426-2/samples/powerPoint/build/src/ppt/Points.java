package ppt  ;

import com4j.*;

@IID("{92D41A74-F07E-4CA4-AF6F-BEF486AA4E6F}")
public interface Points extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(8)
  int count();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ppt.Point
   */

  @DISPID(170) //= 0xaa. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.Point item(
    int index);


  /**
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(10)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(11)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(12)
  ppt._Application application();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ppt.Point
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(13)
  @DefaultMethod
  ppt.Point _Default(
    int index);


  // Properties:
}
