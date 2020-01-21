package word  ;

import com4j.*;

@IID("{00020997-0000-0000-C000-000000000046}")
public interface KeysBoundTo extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "KeyCategory"
   * </p>
   * @return  Returns a value of type word.WdKeyCategory
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  word.WdKeyCategory keyCategory();


  /**
   * <p>
   * Getter method for the COM property "Command"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String command();


  /**
   * <p>
   * Getter method for the COM property "CommandParameter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String commandParameter();


  /**
   * <p>
   * Getter method for the COM property "Context"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject context();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type word.KeyBinding
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(16)
  @DefaultMethod
  word.KeyBinding item(
    int index);


  /**
   * @param keyCode Mandatory int parameter.
   * @param keyCode2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.KeyBinding
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(17)
  word.KeyBinding key(
    int keyCode,
    @Optional java.lang.Object keyCode2);


  // Properties:
}
