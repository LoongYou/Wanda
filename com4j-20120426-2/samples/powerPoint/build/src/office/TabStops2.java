package office  ;

import com4j.*;

@IID("{000C03BA-0000-0000-C000-000000000046}")
public interface TabStops2 extends office._IMsoDispObj,Iterable<Com4jObject> {
  // Methods:
  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type office.TabStop2
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  office.TabStop2 item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * @param type Mandatory office.MsoTabStopType parameter.
   * @param position Mandatory float parameter.
   * @return  Returns a value of type office.TabStop2
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  office.TabStop2 add(
    office.MsoTabStopType type,
    float position);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  int count();


  /**
   * <p>
   * Getter method for the COM property "DefaultSpacing"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  float defaultSpacing();


  /**
   * <p>
   * Setter method for the COM property "DefaultSpacing"
   * </p>
   * @param spacing Mandatory float parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  void defaultSpacing(
    float spacing);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(15)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
