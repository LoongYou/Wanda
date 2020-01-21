package office  ;

import com4j.*;

@IID("{000CDB09-0000-0000-C000-000000000046}")
public interface _CustomXMLParts extends office._IMsoDispObj,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610809344) //= 0x60030000. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809345) //= 0x60030001. The runtime will prefer the VTID if present
  @VTID(10)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type office._CustomXMLPart
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  office._CustomXMLPart item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param xml Optional parameter. Default value is ""
   * @param schemaCollection Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type office._CustomXMLPart
   */

  @DISPID(1610809347) //= 0x60030003. The runtime will prefer the VTID if present
  @VTID(12)
  office._CustomXMLPart add(
    @Optional @DefaultValue("") java.lang.String xml,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object schemaCollection);


  /**
   * @param id Mandatory java.lang.String parameter.
   * @return  Returns a value of type office._CustomXMLPart
   */

  @DISPID(1610809348) //= 0x60030004. The runtime will prefer the VTID if present
  @VTID(13)
  office._CustomXMLPart selectByID(
    java.lang.String id);


  /**
   * @param namespaceURI Mandatory java.lang.String parameter.
   * @return  Returns a value of type office._CustomXMLParts
   */

  @DISPID(1610809349) //= 0x60030005. The runtime will prefer the VTID if present
  @VTID(14)
  office._CustomXMLParts selectByNamespace(
    java.lang.String namespaceURI);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(15)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
