package word  ;

import com4j.*;

@IID("{DC489AD4-23C4-4F4B-990F-45A51C7C0C4F}")
public interface OMathScrSubSup extends Com4jObject {
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
   * Getter method for the COM property "Sub"
   * </p>
   * @return  Returns a value of type word.OMath
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(11)
  word.OMath sub();


  /**
   * <p>
   * Getter method for the COM property "Sup"
   * </p>
   * @return  Returns a value of type word.OMath
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(12)
  word.OMath sup();


  /**
   * <p>
   * Getter method for the COM property "AlignScripts"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(13)
  boolean alignScripts();


  /**
   * <p>
   * Setter method for the COM property "AlignScripts"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(14)
  void alignScripts(
    boolean prop);


  /**
   * @return  Returns a value of type word.OMathFunction
   */

  @DISPID(200) //= 0xc8. The runtime will prefer the VTID if present
  @VTID(15)
  word.OMathFunction removeSub();


  /**
   * @return  Returns a value of type word.OMathFunction
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(16)
  word.OMathFunction removeSup();


  /**
   * @return  Returns a value of type word.OMathFunction
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(17)
  word.OMathFunction toScrPre();


  // Properties:
}
