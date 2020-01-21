package word  ;

import com4j.*;

@IID("{00020998-0000-0000-C000-000000000046}")
public interface KeyBinding extends Com4jObject {
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
   * Getter method for the COM property "Command"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String command();


  /**
   * <p>
   * Getter method for the COM property "KeyString"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String keyString();


  /**
   * <p>
   * Getter method for the COM property "Protected"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  boolean _protected();


  /**
   * <p>
   * Getter method for the COM property "KeyCategory"
   * </p>
   * @return  Returns a value of type word.WdKeyCategory
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  word.WdKeyCategory keyCategory();


  /**
   * <p>
   * Getter method for the COM property "KeyCode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(14)
  int keyCode();


  /**
   * <p>
   * Getter method for the COM property "KeyCode2"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(15)
  int keyCode2();


  /**
   * <p>
   * Getter method for the COM property "CommandParameter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String commandParameter();


  /**
   * <p>
   * Getter method for the COM property "Context"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject context();


  /**
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(18)
  void clear();


  /**
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(19)
  void disable();


  /**
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(20)
  void execute();


  /**
   * @param keyCategory Mandatory word.WdKeyCategory parameter.
   * @param command Mandatory java.lang.String parameter.
   * @param commandParameter Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(21)
  void rebind(
    word.WdKeyCategory keyCategory,
    java.lang.String command,
    @Optional java.lang.Object commandParameter);


  // Properties:
}
