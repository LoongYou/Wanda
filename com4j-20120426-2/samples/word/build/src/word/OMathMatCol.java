package word  ;

import com4j.*;

@IID("{CAE36175-3818-4C60-BCBF-0645D51EB33B}")
public interface OMathMatCol extends Com4jObject {
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
   * Getter method for the COM property "Args"
   * </p>
   * @return  Returns a value of type word.OMathArgs
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(10)
  word.OMathArgs args();


  @VTID(10)
  @ReturnValue(defaultPropertyThrough={word.OMathArgs.class})
  word.OMath args(
    int index);

  /**
   * <p>
   * Getter method for the COM property "ColIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(11)
  int colIndex();


  /**
   * <p>
   * Getter method for the COM property "Align"
   * </p>
   * @return  Returns a value of type word.WdOMathHorizAlignType
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(12)
  word.WdOMathHorizAlignType align();


  /**
   * <p>
   * Setter method for the COM property "Align"
   * </p>
   * @param prop Mandatory word.WdOMathHorizAlignType parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(13)
  void align(
    word.WdOMathHorizAlignType prop);


  /**
   */

  @DISPID(200) //= 0xc8. The runtime will prefer the VTID if present
  @VTID(14)
  void delete();


  // Properties:
}
