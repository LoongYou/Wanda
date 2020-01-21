package office  ;

import com4j.*;

@IID("{000C0386-0000-0000-C000-000000000046}")
public interface Sync extends office._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Status"
   * </p>
   * @return  Returns a value of type office.MsoSyncStatusType
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  office.MsoSyncStatusType status();


  /**
   * <p>
   * Getter method for the COM property "WorkspaceLastChangedBy"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String workspaceLastChangedBy();


  /**
   * <p>
   * Getter method for the COM property "LastSyncTime"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object lastSyncTime();


  /**
   * <p>
   * Getter method for the COM property "ErrorType"
   * </p>
   * @return  Returns a value of type office.MsoSyncErrorType
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  office.MsoSyncErrorType errorType();


  /**
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(13)
  void getUpdate();


  /**
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(14)
  void putUpdate();


  /**
   * @param syncVersionType Mandatory office.MsoSyncVersionType parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(15)
  void openVersion(
    office.MsoSyncVersionType syncVersionType);


  /**
   * @param syncConflictResolution Mandatory office.MsoSyncConflictResolutionType parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(16)
  void resolveConflict(
    office.MsoSyncConflictResolutionType syncConflictResolution);


  /**
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(17)
  void unsuspend();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  // Properties:
}
