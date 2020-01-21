package word  ;

import com4j.*;

@IID("{000209B3-0000-0000-C000-000000000046}")
public interface Versions extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "AutoVersion"
   * </p>
   * @return  Returns a value of type word.WdAutoVersions
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  word.WdAutoVersions autoVersion();


  /**
   * <p>
   * Setter method for the COM property "AutoVersion"
   * </p>
   * @param prop Mandatory word.WdAutoVersions parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  void autoVersion(
    word.WdAutoVersions prop);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type word.Version
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(14)
  @DefaultMethod
  word.Version item(
    int index);


  /**
   * @param comment Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(15)
  void save(
    @Optional java.lang.Object comment);


  // Properties:
}
