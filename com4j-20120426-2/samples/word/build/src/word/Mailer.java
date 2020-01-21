package word  ;

import com4j.*;

@IID("{000209BD-0000-0000-C000-000000000046}")
public interface Mailer extends Com4jObject {
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
   * Getter method for the COM property "BCCRecipients"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object bccRecipients();


  /**
   * <p>
   * Setter method for the COM property "BCCRecipients"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(11)
  void bccRecipients(
    java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "CCRecipients"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ccRecipients();


  /**
   * <p>
   * Setter method for the COM property "CCRecipients"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(13)
  void ccRecipients(
    java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "Recipients"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object recipients();


  /**
   * <p>
   * Setter method for the COM property "Recipients"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(15)
  void recipients(
    java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "Enclosures"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object enclosures();


  /**
   * <p>
   * Setter method for the COM property "Enclosures"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(17)
  void enclosures(
    java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "Sender"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String sender();


  /**
   * <p>
   * Getter method for the COM property "SendDateTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(19)
  java.util.Date sendDateTime();


  /**
   * <p>
   * Getter method for the COM property "Received"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(20)
  boolean received();


  /**
   * <p>
   * Getter method for the COM property "Subject"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String subject();


  /**
   * <p>
   * Setter method for the COM property "Subject"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(22)
  void subject(
    java.lang.String prop);


  // Properties:
}
