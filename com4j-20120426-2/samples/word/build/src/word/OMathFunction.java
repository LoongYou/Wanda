package word  ;

import com4j.*;

@IID("{F1F37152-1DB1-4901-AD9A-C740F99464B4}")
public interface OMathFunction extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type word.WdOMathFunctionType
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  word.WdOMathFunctionType type();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(8)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(9)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(11)
  word.Range range();


  /**
   * <p>
   * Getter method for the COM property "Args"
   * </p>
   * @return  Returns a value of type word.OMathArgs
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(12)
  word.OMathArgs args();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={word.OMathArgs.class})
  word.OMath args(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Acc"
   * </p>
   * @return  Returns a value of type word.OMathAcc
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(13)
  word.OMathAcc acc();


  /**
   * <p>
   * Getter method for the COM property "Bar"
   * </p>
   * @return  Returns a value of type word.OMathBar
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(14)
  word.OMathBar bar();


  /**
   * <p>
   * Getter method for the COM property "Box"
   * </p>
   * @return  Returns a value of type word.OMathBox
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(15)
  word.OMathBox box();


  /**
   * <p>
   * Getter method for the COM property "BorderBox"
   * </p>
   * @return  Returns a value of type word.OMathBorderBox
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(16)
  word.OMathBorderBox borderBox();


  /**
   * <p>
   * Getter method for the COM property "Delim"
   * </p>
   * @return  Returns a value of type word.OMathDelim
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(17)
  word.OMathDelim delim();


  /**
   * <p>
   * Getter method for the COM property "EqArray"
   * </p>
   * @return  Returns a value of type word.OMathEqArray
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(18)
  word.OMathEqArray eqArray();


  /**
   * <p>
   * Getter method for the COM property "Frac"
   * </p>
   * @return  Returns a value of type word.OMathFrac
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(19)
  word.OMathFrac frac();


  /**
   * <p>
   * Getter method for the COM property "Func"
   * </p>
   * @return  Returns a value of type word.OMathFunc
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(20)
  word.OMathFunc func();


  /**
   * <p>
   * Getter method for the COM property "GroupChar"
   * </p>
   * @return  Returns a value of type word.OMathGroupChar
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(21)
  word.OMathGroupChar groupChar();


  /**
   * <p>
   * Getter method for the COM property "LimLow"
   * </p>
   * @return  Returns a value of type word.OMathLimLow
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(22)
  word.OMathLimLow limLow();


  /**
   * <p>
   * Getter method for the COM property "LimUpp"
   * </p>
   * @return  Returns a value of type word.OMathLimUpp
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(23)
  word.OMathLimUpp limUpp();


  /**
   * <p>
   * Getter method for the COM property "Mat"
   * </p>
   * @return  Returns a value of type word.OMathMat
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(24)
  word.OMathMat mat();


  /**
   * <p>
   * Getter method for the COM property "Nary"
   * </p>
   * @return  Returns a value of type word.OMathNary
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(25)
  word.OMathNary nary();


  /**
   * <p>
   * Getter method for the COM property "Phantom"
   * </p>
   * @return  Returns a value of type word.OMathPhantom
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(26)
  word.OMathPhantom phantom();


  /**
   * <p>
   * Getter method for the COM property "ScrPre"
   * </p>
   * @return  Returns a value of type word.OMathScrPre
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(27)
  word.OMathScrPre scrPre();


  /**
   * <p>
   * Getter method for the COM property "Rad"
   * </p>
   * @return  Returns a value of type word.OMathRad
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(28)
  word.OMathRad rad();


  /**
   * <p>
   * Getter method for the COM property "ScrSub"
   * </p>
   * @return  Returns a value of type word.OMathScrSub
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(29)
  word.OMathScrSub scrSub();


  /**
   * <p>
   * Getter method for the COM property "ScrSubSup"
   * </p>
   * @return  Returns a value of type word.OMathScrSubSup
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(30)
  word.OMathScrSubSup scrSubSup();


  /**
   * <p>
   * Getter method for the COM property "ScrSup"
   * </p>
   * @return  Returns a value of type word.OMathScrSup
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(31)
  word.OMathScrSup scrSup();


  /**
   * <p>
   * Getter method for the COM property "OMath"
   * </p>
   * @return  Returns a value of type word.OMath
   */

  @DISPID(125) //= 0x7d. The runtime will prefer the VTID if present
  @VTID(32)
  word.OMath oMath();


  /**
   * @return  Returns a value of type word.OMathFunction
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(33)
  word.OMathFunction remove();


  // Properties:
}
