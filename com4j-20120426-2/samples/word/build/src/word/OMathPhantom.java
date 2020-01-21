package word  ;

import com4j.*;

@IID("{DB77D541-85C3-42E8-8649-AFBD7CF87866}")
public interface OMathPhantom extends Com4jObject {
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
   * Getter method for the COM property "E"
   * </p>
   * @return  Returns a value of type word.OMath
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(10)
  word.OMath e();


  /**
   * <p>
   * Getter method for the COM property "Show"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(11)
  boolean show();


  /**
   * <p>
   * Setter method for the COM property "Show"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(12)
  void show(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ZeroWid"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(13)
  boolean zeroWid();


  /**
   * <p>
   * Setter method for the COM property "ZeroWid"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(14)
  void zeroWid(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ZeroAsc"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(15)
  boolean zeroAsc();


  /**
   * <p>
   * Setter method for the COM property "ZeroAsc"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(16)
  void zeroAsc(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ZeroDesc"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(17)
  boolean zeroDesc();


  /**
   * <p>
   * Setter method for the COM property "ZeroDesc"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(18)
  void zeroDesc(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Transp"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(19)
  boolean transp();


  /**
   * <p>
   * Setter method for the COM property "Transp"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(20)
  void transp(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Smash"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(21)
  boolean smash();


  /**
   * <p>
   * Setter method for the COM property "Smash"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(22)
  void smash(
    boolean prop);


  // Properties:
}
