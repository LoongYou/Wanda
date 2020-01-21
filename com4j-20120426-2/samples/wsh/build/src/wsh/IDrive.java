package wsh  ;

import com4j.*;

@IID("{C7C3F5A0-88A3-11D0-ABCB-00A0C90FFFC0}")
public interface IDrive extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  java.lang.String path();


  /**
   * <p>
   * Getter method for the COM property "DriveLetter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10000) //= 0x2710. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String driveLetter();


  /**
   * <p>
   * Getter method for the COM property "ShareName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10001) //= 0x2711. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String shareName();


  /**
   * <p>
   * Getter method for the COM property "DriveType"
   * </p>
   * @return  Returns a value of type wsh.DriveTypeConst
   */

  @DISPID(10002) //= 0x2712. The runtime will prefer the VTID if present
  @VTID(10)
  wsh.DriveTypeConst driveType();


  /**
   * <p>
   * Getter method for the COM property "RootFolder"
   * </p>
   * @return  Returns a value of type wsh.IFolder
   */

  @DISPID(10003) //= 0x2713. The runtime will prefer the VTID if present
  @VTID(11)
  wsh.IFolder rootFolder();


  /**
   * <p>
   * Getter method for the COM property "AvailableSpace"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(10005) //= 0x2715. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object availableSpace();


  /**
   * <p>
   * Getter method for the COM property "FreeSpace"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(10004) //= 0x2714. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object freeSpace();


  /**
   * <p>
   * Getter method for the COM property "TotalSize"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(10006) //= 0x2716. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object totalSize();


  /**
   * <p>
   * Getter method for the COM property "VolumeName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10007) //= 0x2717. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String volumeName();


  /**
   * <p>
   * Setter method for the COM property "VolumeName"
   * </p>
   * @param pbstrName Mandatory java.lang.String parameter.
   */

  @DISPID(10007) //= 0x2717. The runtime will prefer the VTID if present
  @VTID(16)
  void volumeName(
    java.lang.String pbstrName);


  /**
   * <p>
   * Getter method for the COM property "FileSystem"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10008) //= 0x2718. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String fileSystem();


  /**
   * <p>
   * Getter method for the COM property "SerialNumber"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(10009) //= 0x2719. The runtime will prefer the VTID if present
  @VTID(18)
  int serialNumber();


  /**
   * <p>
   * Getter method for the COM property "IsReady"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(10010) //= 0x271a. The runtime will prefer the VTID if present
  @VTID(19)
  boolean isReady();


  // Properties:
}
