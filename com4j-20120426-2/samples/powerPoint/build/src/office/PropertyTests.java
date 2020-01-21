package office  ;

import com4j.*;

@IID("{000C0334-0000-0000-C000-000000000046}")
public interface PropertyTests extends office._IMsoDispObj,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory int parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type office.PropertyTest
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  office.PropertyTest item(
    int index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  int count();


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param condition Mandatory office.MsoCondition parameter.
   * @param value Optional parameter. Default value is com4j.Variant.getMissing()
   * @param secondValue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param connector Optional parameter. Default value is 1
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  void add(
    java.lang.String name,
    office.MsoCondition condition,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object value,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object secondValue,
    @Optional @DefaultValue("1") office.MsoConnector connector);


  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  void remove(
    int index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(13)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
