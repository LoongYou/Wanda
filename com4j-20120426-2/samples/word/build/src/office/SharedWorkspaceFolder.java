package office  ;

import com4j.*;

@IID("{000C037D-0000-0000-C000-000000000046}")
public interface SharedWorkspaceFolder extends office._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "FolderName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  java.lang.String folderName();


  /**
   * @param deleteEventIfFolderContainsFiles Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  void delete(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object deleteEventIfFolderContainsFiles);


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  // Properties:
}
