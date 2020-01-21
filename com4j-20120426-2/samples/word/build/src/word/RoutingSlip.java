package word  ;

import com4j.*;

@IID("{00020969-0000-0000-C000-000000000046}")
public interface RoutingSlip extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Subject"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String subject();


  /**
   * <p>
   * Setter method for the COM property "Subject"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  void subject(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Message"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String message();


  /**
   * <p>
   * Setter method for the COM property "Message"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(13)
  void message(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Delivery"
   * </p>
   * @return  Returns a value of type word.WdRoutingSlipDelivery
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(14)
  word.WdRoutingSlipDelivery delivery();


  /**
   * <p>
   * Setter method for the COM property "Delivery"
   * </p>
   * @param prop Mandatory word.WdRoutingSlipDelivery parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(15)
  void delivery(
    word.WdRoutingSlipDelivery prop);


  /**
   * <p>
   * Getter method for the COM property "TrackStatus"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(16)
  boolean trackStatus();


  /**
   * <p>
   * Setter method for the COM property "TrackStatus"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(17)
  void trackStatus(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Protect"
   * </p>
   * @return  Returns a value of type word.WdProtectionType
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(18)
  word.WdProtectionType protect();


  /**
   * <p>
   * Setter method for the COM property "Protect"
   * </p>
   * @param prop Mandatory word.WdProtectionType parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(19)
  void protect(
    word.WdProtectionType prop);


  /**
   * <p>
   * Getter method for the COM property "ReturnWhenDone"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(20)
  boolean returnWhenDone();


  /**
   * <p>
   * Setter method for the COM property "ReturnWhenDone"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(21)
  void returnWhenDone(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Status"
   * </p>
   * @return  Returns a value of type word.WdRoutingSlipStatus
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(22)
  word.WdRoutingSlipStatus status();


  /**
   * <p>
   * Getter method for the COM property "Recipients"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object recipients(
    @Optional java.lang.Object index);


  /**
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(24)
  void reset();


  /**
   * @param recipient Mandatory java.lang.String parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(25)
  void addRecipient(
    java.lang.String recipient);


  // Properties:
}
