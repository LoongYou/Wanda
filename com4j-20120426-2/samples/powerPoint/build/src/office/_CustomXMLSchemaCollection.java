package office  ;

import com4j.*;

@IID("{000CDB02-0000-0000-C000-000000000046}")
public interface _CustomXMLSchemaCollection extends office._IMsoDispObj,Iterable<Com4jObject> {
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
   * @return  Returns a value of type office.CustomXMLSchema
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  office.CustomXMLSchema item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "NamespaceURI"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809347) //= 0x60030003. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String namespaceURI(
    int index);


  /**
   * @param namespaceURI Optional parameter. Default value is ""
   * @param alias Optional parameter. Default value is ""
   * @param fileName Optional parameter. Default value is ""
   * @param installForAllUsers Optional parameter. Default value is false
   * @return  Returns a value of type office.CustomXMLSchema
   */

  @DISPID(1610809348) //= 0x60030004. The runtime will prefer the VTID if present
  @VTID(13)
  office.CustomXMLSchema add(
    @Optional @DefaultValue("") java.lang.String namespaceURI,
    @Optional @DefaultValue("") java.lang.String alias,
    @Optional @DefaultValue("") java.lang.String fileName,
    @Optional @DefaultValue("0") boolean installForAllUsers);


  /**
   * @param schemaCollection Mandatory office._CustomXMLSchemaCollection parameter.
   */

  @DISPID(1610809349) //= 0x60030005. The runtime will prefer the VTID if present
  @VTID(14)
  void addCollection(
    office._CustomXMLSchemaCollection schemaCollection);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809350) //= 0x60030006. The runtime will prefer the VTID if present
  @VTID(15)
  boolean validate();


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(16)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
