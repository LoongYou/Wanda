package word  ;

import com4j.*;

/**
 */
public enum WdOMathFunctionType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdOMathFunctionAcc(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdOMathFunctionBar(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdOMathFunctionBox(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdOMathFunctionBorderBox(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdOMathFunctionDelim(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdOMathFunctionEqArray(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdOMathFunctionFrac(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdOMathFunctionFunc(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdOMathFunctionGroupChar(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdOMathFunctionLimLow(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdOMathFunctionLimUpp(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  wdOMathFunctionMat(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  wdOMathFunctionNary(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  wdOMathFunctionPhantom(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  wdOMathFunctionScrPre(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  wdOMathFunctionRad(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  wdOMathFunctionScrSub(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  wdOMathFunctionScrSubSup(18),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  wdOMathFunctionScrSup(19),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  wdOMathFunctionText(20),
  /**
   * <p>
   * The value of this constant is 21
   * </p>
   */
  wdOMathFunctionNormalText(21),
  /**
   * <p>
   * The value of this constant is 22
   * </p>
   */
  wdOMathFunctionLiteralText(22),
  ;

  private final int value;
  WdOMathFunctionType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
