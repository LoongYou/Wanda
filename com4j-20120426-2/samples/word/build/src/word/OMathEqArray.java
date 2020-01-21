package word  ;

import com4j.*;

@IID("{1F998A61-71C6-44C2-A0F2-1D66169B47CB}")
public interface OMathEqArray extends Com4jObject {
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
   * @return  Returns a value of type word.OMathArgs
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(10)
  word.OMathArgs e();


  @VTID(10)
  @ReturnValue(defaultPropertyThrough={word.OMathArgs.class})
  word.OMath e(
    int index);

  /**
   * <p>
   * Getter method for the COM property "MaxDist"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(11)
  boolean maxDist();


  /**
   * <p>
   * Setter method for the COM property "MaxDist"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(12)
  void maxDist(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ObjDist"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(13)
  boolean objDist();


  /**
   * <p>
   * Setter method for the COM property "ObjDist"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(14)
  void objDist(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Align"
   * </p>
   * @return  Returns a value of type word.WdOMathVertAlignType
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(15)
  word.WdOMathVertAlignType align();


  /**
   * <p>
   * Setter method for the COM property "Align"
   * </p>
   * @param prop Mandatory word.WdOMathVertAlignType parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(16)
  void align(
    word.WdOMathVertAlignType prop);


  /**
   * <p>
   * Getter method for the COM property "RowSpacingRule"
   * </p>
   * @return  Returns a value of type word.WdOMathSpacingRule
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(17)
  word.WdOMathSpacingRule rowSpacingRule();


  /**
   * <p>
   * Setter method for the COM property "RowSpacingRule"
   * </p>
   * @param prop Mandatory word.WdOMathSpacingRule parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(18)
  void rowSpacingRule(
    word.WdOMathSpacingRule prop);


  /**
   * <p>
   * Getter method for the COM property "RowSpacing"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(19)
  int rowSpacing();


  /**
   * <p>
   * Setter method for the COM property "RowSpacing"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(20)
  void rowSpacing(
    int prop);


  // Properties:
}
