package word  ;

import com4j.*;

@IID("{E4442A83-F623-459C-8E95-8BFB44DCF23A}")
public interface OMath extends Com4jObject {
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
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(10)
  word.Range range();


  /**
   * <p>
   * Getter method for the COM property "Functions"
   * </p>
   * @return  Returns a value of type word.OMathFunctions
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(11)
  word.OMathFunctions functions();


  @VTID(11)
  @ReturnValue(defaultPropertyThrough={word.OMathFunctions.class})
  word.OMathFunction functions(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type word.WdOMathType
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(12)
  word.WdOMathType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param prop Mandatory word.WdOMathType parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(13)
  void type(
    word.WdOMathType prop);


  /**
   * <p>
   * Getter method for the COM property "ParentOMath"
   * </p>
   * @return  Returns a value of type word.OMath
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(14)
  word.OMath parentOMath();


  /**
   * <p>
   * Getter method for the COM property "ParentFunction"
   * </p>
   * @return  Returns a value of type word.OMathFunction
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(15)
  word.OMathFunction parentFunction();


  /**
   * <p>
   * Getter method for the COM property "ParentRow"
   * </p>
   * @return  Returns a value of type word.OMathMatRow
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(16)
  word.OMathMatRow parentRow();


  /**
   * <p>
   * Getter method for the COM property "ParentCol"
   * </p>
   * @return  Returns a value of type word.OMathMatCol
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(17)
  word.OMathMatCol parentCol();


  /**
   * <p>
   * Getter method for the COM property "ParentArg"
   * </p>
   * @return  Returns a value of type word.OMath
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(18)
  word.OMath parentArg();


  /**
   * <p>
   * Getter method for the COM property "ArgIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(19)
  int argIndex();


  /**
   * <p>
   * Getter method for the COM property "NestingLevel"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(20)
  int nestingLevel();


  /**
   * <p>
   * Getter method for the COM property "ArgSize"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(21)
  int argSize();


  /**
   * <p>
   * Setter method for the COM property "ArgSize"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(22)
  void argSize(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Breaks"
   * </p>
   * @return  Returns a value of type word.OMathBreaks
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(23)
  word.OMathBreaks breaks();


  @VTID(23)
  @ReturnValue(defaultPropertyThrough={word.OMathBreaks.class})
  word.OMathBreak breaks(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Justification"
   * </p>
   * @return  Returns a value of type word.WdOMathJc
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(24)
  word.WdOMathJc justification();


  /**
   * <p>
   * Setter method for the COM property "Justification"
   * </p>
   * @param prop Mandatory word.WdOMathJc parameter.
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(25)
  void justification(
    word.WdOMathJc prop);


  /**
   * <p>
   * Getter method for the COM property "AlignPoint"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(26)
  int alignPoint();


  /**
   * <p>
   * Setter method for the COM property "AlignPoint"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(27)
  void alignPoint(
    int prop);


  /**
   */

  @DISPID(200) //= 0xc8. The runtime will prefer the VTID if present
  @VTID(28)
  void linearize();


  /**
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(29)
  void buildUp();


  /**
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(30)
  void remove();


  /**
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(31)
  void convertToMathText();


  /**
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(32)
  void convertToNormalText();


  /**
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(33)
  void convertToLiteralText();


  // Properties:
}
