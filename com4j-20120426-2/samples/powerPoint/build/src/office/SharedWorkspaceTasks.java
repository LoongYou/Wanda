package office  ;

import com4j.*;

@IID("{000C037A-0000-0000-C000-000000000046}")
public interface SharedWorkspaceTasks extends office._IMsoDispObj,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type office.SharedWorkspaceTask
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  office.SharedWorkspaceTask item(
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
   * @param title Mandatory java.lang.String parameter.
   * @param status Optional parameter. Default value is com4j.Variant.getMissing()
   * @param priority Optional parameter. Default value is com4j.Variant.getMissing()
   * @param assignee Optional parameter. Default value is com4j.Variant.getMissing()
   * @param description Optional parameter. Default value is com4j.Variant.getMissing()
   * @param dueDate Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type office.SharedWorkspaceTask
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  office.SharedWorkspaceTask add(
    java.lang.String title,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object status,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object priority,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object assignee,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object description,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object dueDate);


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "ItemCountExceeded"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  boolean itemCountExceeded();


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(14)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
