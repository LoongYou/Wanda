package office  ;

import com4j.*;

@IID("{000CDB04-0000-0000-C000-000000000046}")
public interface CustomXMLNode extends office._IMsoDispObj {
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
   * Getter method for the COM property "Attributes"
   * </p>
   * @return  Returns a value of type office.CustomXMLNodes
   */

  @DISPID(1610809345) //= 0x60030001. The runtime will prefer the VTID if present
  @VTID(10)
  office.CustomXMLNodes attributes();


  @VTID(10)
  @ReturnValue(defaultPropertyThrough={office.CustomXMLNodes.class})
  office.CustomXMLNode attributes(
    int index);

  /**
   * <p>
   * Getter method for the COM property "BaseName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809346) //= 0x60030002. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String baseName();


  /**
   * <p>
   * Getter method for the COM property "ChildNodes"
   * </p>
   * @return  Returns a value of type office.CustomXMLNodes
   */

  @DISPID(1610809347) //= 0x60030003. The runtime will prefer the VTID if present
  @VTID(12)
  office.CustomXMLNodes childNodes();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={office.CustomXMLNodes.class})
  office.CustomXMLNode childNodes(
    int index);

  /**
   * <p>
   * Getter method for the COM property "FirstChild"
   * </p>
   * @return  Returns a value of type office.CustomXMLNode
   */

  @DISPID(1610809348) //= 0x60030004. The runtime will prefer the VTID if present
  @VTID(13)
  office.CustomXMLNode firstChild();


  /**
   * <p>
   * Getter method for the COM property "LastChild"
   * </p>
   * @return  Returns a value of type office.CustomXMLNode
   */

  @DISPID(1610809349) //= 0x60030005. The runtime will prefer the VTID if present
  @VTID(14)
  office.CustomXMLNode lastChild();


  /**
   * <p>
   * Getter method for the COM property "NamespaceURI"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809350) //= 0x60030006. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String namespaceURI();


  /**
   * <p>
   * Getter method for the COM property "NextSibling"
   * </p>
   * @return  Returns a value of type office.CustomXMLNode
   */

  @DISPID(1610809351) //= 0x60030007. The runtime will prefer the VTID if present
  @VTID(16)
  office.CustomXMLNode nextSibling();


  /**
   * <p>
   * Getter method for the COM property "NodeType"
   * </p>
   * @return  Returns a value of type office.MsoCustomXMLNodeType
   */

  @DISPID(1610809352) //= 0x60030008. The runtime will prefer the VTID if present
  @VTID(17)
  office.MsoCustomXMLNodeType nodeType();


  /**
   * <p>
   * Getter method for the COM property "NodeValue"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809353) //= 0x60030009. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String nodeValue();


  /**
   * <p>
   * Setter method for the COM property "NodeValue"
   * </p>
   * @param pbstrNodeValue Mandatory java.lang.String parameter.
   */

  @DISPID(1610809353) //= 0x60030009. The runtime will prefer the VTID if present
  @VTID(19)
  void nodeValue(
    java.lang.String pbstrNodeValue);


  /**
   * <p>
   * Getter method for the COM property "OwnerDocument"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610809355) //= 0x6003000b. The runtime will prefer the VTID if present
  @VTID(20)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject ownerDocument();


  /**
   * <p>
   * Getter method for the COM property "OwnerPart"
   * </p>
   * @return  Returns a value of type office._CustomXMLPart
   */

  @DISPID(1610809356) //= 0x6003000c. The runtime will prefer the VTID if present
  @VTID(21)
  office._CustomXMLPart ownerPart();


  /**
   * <p>
   * Getter method for the COM property "PreviousSibling"
   * </p>
   * @return  Returns a value of type office.CustomXMLNode
   */

  @DISPID(1610809357) //= 0x6003000d. The runtime will prefer the VTID if present
  @VTID(22)
  office.CustomXMLNode previousSibling();


  /**
   * <p>
   * Getter method for the COM property "ParentNode"
   * </p>
   * @return  Returns a value of type office.CustomXMLNode
   */

  @DISPID(1610809358) //= 0x6003000e. The runtime will prefer the VTID if present
  @VTID(23)
  office.CustomXMLNode parentNode();


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809359) //= 0x6003000f. The runtime will prefer the VTID if present
  @VTID(24)
  java.lang.String text();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param pbstrText Mandatory java.lang.String parameter.
   */

  @DISPID(1610809359) //= 0x6003000f. The runtime will prefer the VTID if present
  @VTID(25)
  void text(
    java.lang.String pbstrText);


  /**
   * <p>
   * Getter method for the COM property "XPath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809361) //= 0x60030011. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.String xPath();


  /**
   * <p>
   * Getter method for the COM property "XML"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809362) //= 0x60030012. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String xml();


  /**
   * @param name Optional parameter. Default value is ""
   * @param namespaceURI Optional parameter. Default value is ""
   * @param nodeType Optional parameter. Default value is 1
   * @param nodeValue Optional parameter. Default value is ""
   */

  @DISPID(1610809363) //= 0x60030013. The runtime will prefer the VTID if present
  @VTID(28)
  void appendChildNode(
    @Optional @DefaultValue("") java.lang.String name,
    @Optional @DefaultValue("") java.lang.String namespaceURI,
    @Optional @DefaultValue("1") office.MsoCustomXMLNodeType nodeType,
    @Optional @DefaultValue("") java.lang.String nodeValue);


  /**
   * @param xml Mandatory java.lang.String parameter.
   */

  @DISPID(1610809364) //= 0x60030014. The runtime will prefer the VTID if present
  @VTID(29)
  void appendChildSubtree(
    java.lang.String xml);


  /**
   */

  @DISPID(1610809365) //= 0x60030015. The runtime will prefer the VTID if present
  @VTID(30)
  void delete();


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809366) //= 0x60030016. The runtime will prefer the VTID if present
  @VTID(31)
  boolean hasChildNodes();


  /**
   * @param name Optional parameter. Default value is ""
   * @param namespaceURI Optional parameter. Default value is ""
   * @param nodeType Optional parameter. Default value is 1
   * @param nodeValue Optional parameter. Default value is ""
   * @param nextSibling Optional parameter. Default value is 0
   */

  @DISPID(1610809367) //= 0x60030017. The runtime will prefer the VTID if present
  @VTID(32)
  void insertNodeBefore(
    @Optional @DefaultValue("") java.lang.String name,
    @Optional @DefaultValue("") java.lang.String namespaceURI,
    @Optional @DefaultValue("1") office.MsoCustomXMLNodeType nodeType,
    @Optional @DefaultValue("") java.lang.String nodeValue,
    @Optional @DefaultValue("0") office.CustomXMLNode nextSibling);


  /**
   * @param xml Mandatory java.lang.String parameter.
   * @param nextSibling Optional parameter. Default value is 0
   */

  @DISPID(1610809368) //= 0x60030018. The runtime will prefer the VTID if present
  @VTID(33)
  void insertSubtreeBefore(
    java.lang.String xml,
    @Optional @DefaultValue("0") office.CustomXMLNode nextSibling);


  /**
   * @param child Mandatory office.CustomXMLNode parameter.
   */

  @DISPID(1610809369) //= 0x60030019. The runtime will prefer the VTID if present
  @VTID(34)
  void removeChild(
    office.CustomXMLNode child);


  /**
   * @param oldNode Mandatory office.CustomXMLNode parameter.
   * @param name Optional parameter. Default value is ""
   * @param namespaceURI Optional parameter. Default value is ""
   * @param nodeType Optional parameter. Default value is 1
   * @param nodeValue Optional parameter. Default value is ""
   */

  @DISPID(1610809370) //= 0x6003001a. The runtime will prefer the VTID if present
  @VTID(35)
  void replaceChildNode(
    office.CustomXMLNode oldNode,
    @Optional @DefaultValue("") java.lang.String name,
    @Optional @DefaultValue("") java.lang.String namespaceURI,
    @Optional @DefaultValue("1") office.MsoCustomXMLNodeType nodeType,
    @Optional @DefaultValue("") java.lang.String nodeValue);


  /**
   * @param xml Mandatory java.lang.String parameter.
   * @param oldNode Mandatory office.CustomXMLNode parameter.
   */

  @DISPID(1610809371) //= 0x6003001b. The runtime will prefer the VTID if present
  @VTID(36)
  void replaceChildSubtree(
    java.lang.String xml,
    office.CustomXMLNode oldNode);


  /**
   * @param xPath Mandatory java.lang.String parameter.
   * @return  Returns a value of type office.CustomXMLNodes
   */

  @DISPID(1610809372) //= 0x6003001c. The runtime will prefer the VTID if present
  @VTID(37)
  office.CustomXMLNodes selectNodes(
    java.lang.String xPath);


  /**
   * @param xPath Mandatory java.lang.String parameter.
   * @return  Returns a value of type office.CustomXMLNode
   */

  @DISPID(1610809373) //= 0x6003001d. The runtime will prefer the VTID if present
  @VTID(38)
  office.CustomXMLNode selectSingleNode(
    java.lang.String xPath);


  // Properties:
}
