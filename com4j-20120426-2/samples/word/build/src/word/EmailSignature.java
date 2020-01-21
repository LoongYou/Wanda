package word  ;

import com4j.*;

@IID("{000209DC-0000-0000-C000-000000000046}")
public interface EmailSignature extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(7)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "NewMessageSignature"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String newMessageSignature();


  /**
   * <p>
   * Setter method for the COM property "NewMessageSignature"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(11)
  void newMessageSignature(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "ReplyMessageSignature"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String replyMessageSignature();


  /**
   * <p>
   * Setter method for the COM property "ReplyMessageSignature"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(13)
  void replyMessageSignature(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "EmailSignatureEntries"
   * </p>
   * @return  Returns a value of type word.EmailSignatureEntries
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(14)
  word.EmailSignatureEntries emailSignatureEntries();


  @VTID(14)
  @ReturnValue(defaultPropertyThrough={word.EmailSignatureEntries.class})
  word.EmailSignatureEntry emailSignatureEntries(
    java.lang.Object index);

  // Properties:
}
