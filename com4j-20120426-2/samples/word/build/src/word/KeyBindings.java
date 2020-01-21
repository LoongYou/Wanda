package word  ;

import com4j.*;

@IID("{00020996-0000-0000-C000-000000000046}")
public interface KeyBindings extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(10)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Context"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject context();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type word.KeyBinding
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(13)
  @DefaultMethod
  word.KeyBinding item(
    int index);


  /**
   * @param keyCategory Mandatory word.WdKeyCategory parameter.
   * @param command Mandatory java.lang.String parameter.
   * @param keyCode Mandatory int parameter.
   * @param keyCode2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param commandParameter Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.KeyBinding
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(14)
  word.KeyBinding add(
    word.WdKeyCategory keyCategory,
    java.lang.String command,
    int keyCode,
    @Optional java.lang.Object keyCode2,
    @Optional java.lang.Object commandParameter);


  /**
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(15)
  void clearAll();


  /**
   * @param keyCode Mandatory int parameter.
   * @param keyCode2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.KeyBinding
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(16)
  word.KeyBinding key(
    int keyCode,
    @Optional java.lang.Object keyCode2);


  // Properties:
}
