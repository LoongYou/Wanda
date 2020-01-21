package wsh  ;

import com4j.*;

/**
 * Network Object
 */
@IID("{F935DC25-1CF0-11D0-ADB9-00C04FD58A0B}")
public interface IWshNetwork extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "UserDomain"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String userDomain();


  /**
   * <p>
   * Getter method for the COM property "UserName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String userName();


  /**
   * <p>
   * Getter method for the COM property "UserProfile"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String userProfile();


  /**
   * <p>
   * Getter method for the COM property "ComputerName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String computerName();


  /**
   * <p>
   * Getter method for the COM property "Organization"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String organization();


  /**
   * <p>
   * Getter method for the COM property "Site"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String site();


  /**
   * @param localName Mandatory java.lang.String parameter.
   * @param remoteName Mandatory java.lang.String parameter.
   * @param updateProfile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param userName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(13)
  void mapNetworkDrive(
    java.lang.String localName,
    java.lang.String remoteName,
    @Optional java.lang.Object updateProfile,
    @Optional java.lang.Object userName,
    @Optional java.lang.Object password);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param force Optional parameter. Default value is com4j.Variant.getMissing()
   * @param updateProfile Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(14)
  void removeNetworkDrive(
    java.lang.String name,
    @Optional java.lang.Object force,
    @Optional java.lang.Object updateProfile);


  /**
   * @return  Returns a value of type wsh.IWshCollection
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(15)
  wsh.IWshCollection enumNetworkDrives();


  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={wsh.IWshCollection.class})
  java.lang.Object enumNetworkDrives(
    java.lang.Object index);

  /**
   * @param localName Mandatory java.lang.String parameter.
   * @param remoteName Mandatory java.lang.String parameter.
   * @param updateProfile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param userName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2000) //= 0x7d0. The runtime will prefer the VTID if present
  @VTID(16)
  void addPrinterConnection(
    java.lang.String localName,
    java.lang.String remoteName,
    @Optional java.lang.Object updateProfile,
    @Optional java.lang.Object userName,
    @Optional java.lang.Object password);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param force Optional parameter. Default value is com4j.Variant.getMissing()
   * @param updateProfile Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(17)
  void removePrinterConnection(
    java.lang.String name,
    @Optional java.lang.Object force,
    @Optional java.lang.Object updateProfile);


  /**
   * @return  Returns a value of type wsh.IWshCollection
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(18)
  wsh.IWshCollection enumPrinterConnections();


  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={wsh.IWshCollection.class})
  java.lang.Object enumPrinterConnections(
    java.lang.Object index);

  /**
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(19)
  void setDefaultPrinter(
    java.lang.String name);


  // Properties:
}
