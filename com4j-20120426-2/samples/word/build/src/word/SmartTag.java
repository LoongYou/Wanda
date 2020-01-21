package word  ;

import com4j.*;

@IID("{000209ED-0000-0000-C000-000000000046}")
public interface SmartTag extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "XML"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String xml();


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  word.Range range();


  /**
   * <p>
   * Getter method for the COM property "DownloadURL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String downloadURL();


  /**
   * <p>
   * Getter method for the COM property "Properties"
   * </p>
   * @return  Returns a value of type word.CustomProperties
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  word.CustomProperties properties();


  @VTID(11)
  @ReturnValue(defaultPropertyThrough={word.CustomProperties.class})
  word.CustomProperty properties(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(12)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(13)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   */

  @DISPID(65535) //= 0xffff. The runtime will prefer the VTID if present
  @VTID(15)
  void select();


  /**
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(16)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "SmartTagActions"
   * </p>
   * @return  Returns a value of type word.SmartTagActions
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(17)
  word.SmartTagActions smartTagActions();


  @VTID(17)
  @ReturnValue(defaultPropertyThrough={word.SmartTagActions.class})
  word.SmartTagAction smartTagActions(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "XMLNode"
   * </p>
   * @return  Returns a value of type word.XMLNode
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(18)
  word.XMLNode xmlNode();


  // Properties:
}
