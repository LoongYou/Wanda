package office  ;

import com4j.*;

@IID("{000C0376-0000-0000-C000-000000000046}")
public interface Permission extends office._IMsoDispObj,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type office.UserPermission
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  office.UserPermission item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


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
   * <p>
   * Getter method for the COM property "EnableTrustedBrowser"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  boolean enableTrustedBrowser();


  /**
   * <p>
   * Setter method for the COM property "EnableTrustedBrowser"
   * </p>
   * @param enable Mandatory boolean parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  void enableTrustedBrowser(
    boolean enable);


  /**
   * @param userId Mandatory java.lang.String parameter.
   * @param permission Optional parameter. Default value is com4j.Variant.getMissing()
   * @param expirationDate Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type office.UserPermission
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  office.UserPermission add(
    java.lang.String userId,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object permission,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object expirationDate);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  void applyPolicy(
    java.lang.String fileName);


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  void removeAll();


  /**
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(17)
  boolean enabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param enabled Mandatory boolean parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(18)
  void enabled(
    boolean enabled);


  /**
   * <p>
   * Getter method for the COM property "RequestPermissionURL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String requestPermissionURL();


  /**
   * <p>
   * Setter method for the COM property "RequestPermissionURL"
   * </p>
   * @param contact Mandatory java.lang.String parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(20)
  void requestPermissionURL(
    java.lang.String contact);


  /**
   * <p>
   * Getter method for the COM property "PolicyName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String policyName();


  /**
   * <p>
   * Getter method for the COM property "PolicyDescription"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String policyDescription();


  /**
   * <p>
   * Getter method for the COM property "StoreLicenses"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(23)
  boolean storeLicenses();


  /**
   * <p>
   * Setter method for the COM property "StoreLicenses"
   * </p>
   * @param enabled Mandatory boolean parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(24)
  void storeLicenses(
    boolean enabled);


  /**
   * <p>
   * Getter method for the COM property "DocumentAuthor"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String documentAuthor();


  /**
   * <p>
   * Setter method for the COM property "DocumentAuthor"
   * </p>
   * @param author Mandatory java.lang.String parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(26)
  void documentAuthor(
    java.lang.String author);


  /**
   * <p>
   * Getter method for the COM property "PermissionFromPolicy"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(27)
  boolean permissionFromPolicy();


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(28)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
