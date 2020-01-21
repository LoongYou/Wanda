package office  ;

import com4j.*;

@IID("{000C03E5-0000-0000-C000-000000000046}")
public interface PickerResults extends office._IMsoDispObj,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type office.PickerResult
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  office.PickerResult item(
    int index);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  int count();


  /**
   * @param id Mandatory java.lang.String parameter.
   * @param displayName Mandatory java.lang.String parameter.
   * @param type Mandatory java.lang.String parameter.
   * @param sipId Optional parameter. Default value is ""
   * @param itemData Optional parameter. Default value is com4j.Variant.getMissing()
   * @param subItems Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type office.PickerResult
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  office.PickerResult add(
    java.lang.String id,
    java.lang.String displayName,
    java.lang.String type,
    @Optional @DefaultValue("") java.lang.String sipId,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object itemData,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object subItems);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(12)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
