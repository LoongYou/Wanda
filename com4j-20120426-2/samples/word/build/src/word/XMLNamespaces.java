package word  ;

import com4j.*;

@IID("{656BBED7-E82D-4B0A-8F97-EC742BA11FFA}")
public interface XMLNamespaces extends Com4jObject,Iterable<Com4jObject> {
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
   * @return  Returns a value of type word.XMLNamespace
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  word.XMLNamespace item(
    java.lang.Object index);


  /**
   * @param path Mandatory java.lang.String parameter.
   * @param namespaceURI Optional parameter. Default value is com4j.Variant.getMissing()
   * @param alias Optional parameter. Default value is com4j.Variant.getMissing()
   * @param installForAllUsers Optional parameter. Default value is false
   * @return  Returns a value of type word.XMLNamespace
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(13)
  word.XMLNamespace add(
    java.lang.String path,
    @Optional java.lang.Object namespaceURI,
    @Optional java.lang.Object alias,
    @Optional @DefaultValue("0") boolean installForAllUsers);


  /**
   * @param path Mandatory java.lang.String parameter.
   * @param installForAllUsers Optional parameter. Default value is false
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(14)
  void installManifest(
    java.lang.String path,
    @Optional @DefaultValue("0") boolean installForAllUsers);


  // Properties:
}
