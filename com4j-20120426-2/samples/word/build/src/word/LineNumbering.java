package word  ;

import com4j.*;

@IID("{00020972-0000-0000-C000-000000000046}")
public interface LineNumbering extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "RestartMode"
   * </p>
   * @return  Returns a value of type word.WdNumberingRule
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(10)
  word.WdNumberingRule restartMode();


  /**
   * <p>
   * Setter method for the COM property "RestartMode"
   * </p>
   * @param prop Mandatory word.WdNumberingRule parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(11)
  void restartMode(
    word.WdNumberingRule prop);


  /**
   * <p>
   * Getter method for the COM property "StartingNumber"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(12)
  int startingNumber();


  /**
   * <p>
   * Setter method for the COM property "StartingNumber"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(13)
  void startingNumber(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "DistanceFromText"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(14)
  float distanceFromText();


  /**
   * <p>
   * Setter method for the COM property "DistanceFromText"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(15)
  void distanceFromText(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "CountBy"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(16)
  int countBy();


  /**
   * <p>
   * Setter method for the COM property "CountBy"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(17)
  void countBy(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Active"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(18)
  int active();


  /**
   * <p>
   * Setter method for the COM property "Active"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(19)
  void active(
    int prop);


  // Properties:
}
