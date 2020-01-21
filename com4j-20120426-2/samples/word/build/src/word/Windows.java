package word  ;

import com4j.*;

@IID("{00020961-0000-0000-C000-000000000046}")
public interface Windows extends Com4jObject,Iterable<Com4jObject> {
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
   * @return  Returns a value of type word.Window
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  word.Window item(
    java.lang.Object index);


  /**
   * @param window Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Window
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(13)
  word.Window add(
    @Optional java.lang.Object window);


  /**
   * @param arrangeStyle Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(14)
  void arrange(
    @Optional java.lang.Object arrangeStyle);


  /**
   * @param document Mandatory java.lang.Object parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(15)
  boolean compareSideBySideWith(
    java.lang.Object document);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(16)
  boolean breakSideBySide();


  /**
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(17)
  void resetPositionsSideBySide();


  /**
   * <p>
   * Getter method for the COM property "SyncScrollingSideBySide"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(18)
  boolean syncScrollingSideBySide();


  /**
   * <p>
   * Setter method for the COM property "SyncScrollingSideBySide"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(19)
  void syncScrollingSideBySide(
    boolean prop);


  // Properties:
}
