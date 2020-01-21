package word  ;

import com4j.*;

@IID("{000209E0-0000-0000-C000-000000000046}")
public interface HangulHanjaConversionDictionaries extends Com4jObject,Iterable<Com4jObject> {
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

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Maximum"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  int maximum();


  /**
   * <p>
   * Getter method for the COM property "ActiveCustomDictionary"
   * </p>
   * @return  Returns a value of type word.Dictionary
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  word.Dictionary activeCustomDictionary();


  /**
   * <p>
   * Setter method for the COM property "ActiveCustomDictionary"
   * </p>
   * @param prop Mandatory word.Dictionary parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(14)
  void activeCustomDictionary(
    word.Dictionary prop);


  /**
   * <p>
   * Getter method for the COM property "BuiltinDictionary"
   * </p>
   * @return  Returns a value of type word.Dictionary
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(15)
  word.Dictionary builtinDictionary();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type word.Dictionary
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(16)
  @DefaultMethod
  word.Dictionary item(
    java.lang.Object index);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @return  Returns a value of type word.Dictionary
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(17)
  word.Dictionary add(
    java.lang.String fileName);


  /**
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(18)
  void clearAll();


  // Properties:
}
