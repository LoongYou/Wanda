package word  ;

import com4j.*;

@IID("{00020955-0000-0000-C000-000000000046}")
public interface TabStops extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(7)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(9)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(10)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type word.TabStop
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  word.TabStop item(
    java.lang.Object index);


  /**
   * @param position Mandatory float parameter.
   * @param alignment Optional parameter. Default value is com4j.Variant.getMissing()
   * @param leader Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.TabStop
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(13)
  word.TabStop add(
    float position,
    @Optional java.lang.Object alignment,
    @Optional java.lang.Object leader);


  /**
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(14)
  void clearAll();


  /**
   * @param position Mandatory float parameter.
   * @return  Returns a value of type word.TabStop
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(15)
  word.TabStop before(
    float position);


  /**
   * @param position Mandatory float parameter.
   * @return  Returns a value of type word.TabStop
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(16)
  word.TabStop after(
    float position);


  // Properties:
}
