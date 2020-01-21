package word  ;

import com4j.*;

@IID("{000209EE-0000-0000-C000-000000000046}")
public interface SmartTags extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(7)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(9)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(10)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type word.SmartTag
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  word.SmartTag item(
    java.lang.Object index);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param range Optional parameter. Default value is com4j.Variant.getMissing()
   * @param properties Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.SmartTag
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(13)
  word.SmartTag add(
    java.lang.String name,
    @Optional java.lang.Object range,
    @Optional java.lang.Object properties);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type word.SmartTags
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(14)
  word.SmartTags smartTagsByType(
    java.lang.String name);


  // Properties:
}
