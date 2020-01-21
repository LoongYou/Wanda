package wsh  ;

import com4j.*;

/**
 * Shell Object Interface
 */
@IID("{F935DC21-1CF0-11D0-ADB9-00C04FD58A0B}")
public interface IWshShell extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "SpecialFolders"
   * </p>
   * @return  Returns a value of type wsh.IWshCollection
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(7)
  wsh.IWshCollection specialFolders();


  @VTID(7)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={wsh.IWshCollection.class})
  java.lang.Object specialFolders(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Environment"
   * </p>
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type wsh.IWshEnvironment
   */

  @DISPID(200) //= 0xc8. The runtime will prefer the VTID if present
  @VTID(8)
  wsh.IWshEnvironment environment(
    @Optional java.lang.Object type);


  /**
   * @param command Mandatory java.lang.String parameter.
   * @param windowStyle Optional parameter. Default value is com4j.Variant.getMissing()
   * @param waitOnReturn Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(9)
  int run(
    java.lang.String command,
    @Optional java.lang.Object windowStyle,
    @Optional java.lang.Object waitOnReturn);


  /**
   * @param text Mandatory java.lang.String parameter.
   * @param secondsToWait Optional parameter. Default value is com4j.Variant.getMissing()
   * @param title Optional parameter. Default value is com4j.Variant.getMissing()
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(10)
  int popup(
    java.lang.String text,
    @Optional java.lang.Object secondsToWait,
    @Optional java.lang.Object title,
    @Optional java.lang.Object type);


  /**
   * @param pathLink Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject createShortcut(
    java.lang.String pathLink);


  /**
   * @param src Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String expandEnvironmentStrings(
    java.lang.String src);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2000) //= 0x7d0. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object regRead(
    java.lang.String name);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param value Mandatory java.lang.Object parameter.
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(14)
  void regWrite(
    java.lang.String name,
    java.lang.Object value,
    @Optional java.lang.Object type);


  /**
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(15)
  void regDelete(
    java.lang.String name);


  // Properties:
}
