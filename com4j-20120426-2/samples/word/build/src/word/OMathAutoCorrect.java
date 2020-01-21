package word  ;

import com4j.*;

@IID("{6F9D1F68-06F7-49EF-8902-185E54EB5E87}")
public interface OMathAutoCorrect extends Com4jObject {
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
   * Getter method for the COM property "ReplaceText"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(10)
  boolean replaceText();


  /**
   * <p>
   * Setter method for the COM property "ReplaceText"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(11)
  void replaceText(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "UseOutsideOMath"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(12)
  boolean useOutsideOMath();


  /**
   * <p>
   * Setter method for the COM property "UseOutsideOMath"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(13)
  void useOutsideOMath(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Entries"
   * </p>
   * @return  Returns a value of type word.OMathAutoCorrectEntries
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(14)
  word.OMathAutoCorrectEntries entries();


  @VTID(14)
  @ReturnValue(defaultPropertyThrough={word.OMathAutoCorrectEntries.class})
  word.OMathAutoCorrectEntry entries(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Functions"
   * </p>
   * @return  Returns a value of type word.OMathRecognizedFunctions
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(15)
  word.OMathRecognizedFunctions functions();


  @VTID(15)
  @ReturnValue(defaultPropertyThrough={word.OMathRecognizedFunctions.class})
  word.OMathRecognizedFunction functions(
    java.lang.Object index);

  // Properties:
}
