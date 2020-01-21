package office  ;

import com4j.*;

@IID("{000C0306-0000-0000-C000-000000000046}")
public interface CommandBarControls extends office._IMsoDispObj,Iterable<Com4jObject> {
  // Methods:
  /**
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param id Optional parameter. Default value is com4j.Variant.getMissing()
   * @param parameter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param before Optional parameter. Default value is com4j.Variant.getMissing()
   * @param temporary Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type office.CommandBarControl
   */

  @DISPID(1610809344) //= 0x60030000. The runtime will prefer the VTID if present
  @VTID(9)
  office.CommandBarControl add(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object id,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object parameter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object before,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object temporary);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809345) //= 0x60030001. The runtime will prefer the VTID if present
  @VTID(10)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type office.CommandBarControl
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  office.CommandBarControl item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(12)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type office.CommandBar
   */

  @DISPID(1610809348) //= 0x60030004. The runtime will prefer the VTID if present
  @VTID(13)
  office.CommandBar parent();


  // Properties:
}
