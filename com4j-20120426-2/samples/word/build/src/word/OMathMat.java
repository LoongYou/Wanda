package word  ;

import com4j.*;

@IID("{3E061A7E-67AD-4EAA-BC1E-55057D5E596F}")
public interface OMathMat extends Com4jObject {
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
   * Getter method for the COM property "Rows"
   * </p>
   * @return  Returns a value of type word.OMathMatRows
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(10)
  word.OMathMatRows rows();


  @VTID(10)
  @ReturnValue(defaultPropertyThrough={word.OMathMatRows.class})
  word.OMathMatRow rows(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Cols"
   * </p>
   * @return  Returns a value of type word.OMathMatCols
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(11)
  word.OMathMatCols cols();


  @VTID(11)
  @ReturnValue(defaultPropertyThrough={word.OMathMatCols.class})
  word.OMathMatCol cols(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Cell"
   * </p>
   * @param row Mandatory int parameter.
   * @param col Mandatory int parameter.
   * @return  Returns a value of type word.OMath
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(12)
  word.OMath cell(
    int row,
    int col);


  /**
   * <p>
   * Getter method for the COM property "Align"
   * </p>
   * @return  Returns a value of type word.WdOMathVertAlignType
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(13)
  word.WdOMathVertAlignType align();


  /**
   * <p>
   * Setter method for the COM property "Align"
   * </p>
   * @param prop Mandatory word.WdOMathVertAlignType parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(14)
  void align(
    word.WdOMathVertAlignType prop);


  /**
   * <p>
   * Getter method for the COM property "PlcHoldHidden"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(15)
  boolean plcHoldHidden();


  /**
   * <p>
   * Setter method for the COM property "PlcHoldHidden"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(16)
  void plcHoldHidden(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "RowSpacingRule"
   * </p>
   * @return  Returns a value of type word.WdOMathSpacingRule
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(17)
  word.WdOMathSpacingRule rowSpacingRule();


  /**
   * <p>
   * Setter method for the COM property "RowSpacingRule"
   * </p>
   * @param prop Mandatory word.WdOMathSpacingRule parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(18)
  void rowSpacingRule(
    word.WdOMathSpacingRule prop);


  /**
   * <p>
   * Getter method for the COM property "RowSpacing"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(19)
  int rowSpacing();


  /**
   * <p>
   * Setter method for the COM property "RowSpacing"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(20)
  void rowSpacing(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "ColSpacing"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(21)
  int colSpacing();


  /**
   * <p>
   * Setter method for the COM property "ColSpacing"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(22)
  void colSpacing(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "ColGapRule"
   * </p>
   * @return  Returns a value of type word.WdOMathSpacingRule
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(23)
  word.WdOMathSpacingRule colGapRule();


  /**
   * <p>
   * Setter method for the COM property "ColGapRule"
   * </p>
   * @param prop Mandatory word.WdOMathSpacingRule parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(24)
  void colGapRule(
    word.WdOMathSpacingRule prop);


  /**
   * <p>
   * Getter method for the COM property "ColGap"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(25)
  int colGap();


  /**
   * <p>
   * Setter method for the COM property "ColGap"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(26)
  void colGap(
    int prop);


  // Properties:
}
