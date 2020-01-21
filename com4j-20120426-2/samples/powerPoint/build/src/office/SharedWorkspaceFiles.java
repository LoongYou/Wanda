package office  ;

import com4j.*;

@IID("{000C037C-0000-0000-C000-000000000046}")
public interface SharedWorkspaceFiles extends office._IMsoDispObj,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(9)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type office.SharedWorkspaceFile
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  office.SharedWorkspaceFile item(
    int index);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  int count();


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param parentFolder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param overwriteIfFileAlreadyExists Optional parameter. Default value is com4j.Variant.getMissing()
   * @param keepInSync Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type office.SharedWorkspaceFile
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  office.SharedWorkspaceFile add(
    java.lang.String fileName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object parentFolder,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object overwriteIfFileAlreadyExists,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object keepInSync);


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "ItemCountExceeded"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  boolean itemCountExceeded();


  // Properties:
}
