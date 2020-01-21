package word  ;

import com4j.*;

@IID("{09760240-0B89-49F7-A79D-479F24723F56}")
public interface XMLNode extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "BaseName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  java.lang.String baseName();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(8)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(9)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  word.Range range();


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String text();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(13)
  void text(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "NamespaceURI"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String namespaceURI();


  /**
   * <p>
   * Getter method for the COM property "XML"
   * </p>
   * @param dataOnly Optional parameter. Default value is false
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String xml(
    @Optional @DefaultValue("0") boolean dataOnly);


  /**
   * <p>
   * Getter method for the COM property "NextSibling"
   * </p>
   * @return  Returns a value of type word.XMLNode
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  word.XMLNode nextSibling();


  /**
   * <p>
   * Getter method for the COM property "PreviousSibling"
   * </p>
   * @return  Returns a value of type word.XMLNode
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(17)
  word.XMLNode previousSibling();


  /**
   * <p>
   * Getter method for the COM property "ParentNode"
   * </p>
   * @return  Returns a value of type word.XMLNode
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(18)
  word.XMLNode parentNode();


  /**
   * <p>
   * Getter method for the COM property "FirstChild"
   * </p>
   * @return  Returns a value of type word.XMLNode
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(19)
  word.XMLNode firstChild();


  /**
   * <p>
   * Getter method for the COM property "LastChild"
   * </p>
   * @return  Returns a value of type word.XMLNode
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(20)
  word.XMLNode lastChild();


  /**
   * <p>
   * Getter method for the COM property "OwnerDocument"
   * </p>
   * @return  Returns a value of type word._Document
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(21)
  word._Document ownerDocument();


  /**
   * <p>
   * Getter method for the COM property "NodeType"
   * </p>
   * @return  Returns a value of type word.WdXMLNodeType
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(22)
  word.WdXMLNodeType nodeType();


  /**
   * <p>
   * Getter method for the COM property "ChildNodes"
   * </p>
   * @return  Returns a value of type word.XMLNodes
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(23)
  word.XMLNodes childNodes();


  @VTID(23)
  @ReturnValue(defaultPropertyThrough={word.XMLNodes.class})
  word.XMLNode childNodes(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Attributes"
   * </p>
   * @return  Returns a value of type word.XMLNodes
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(24)
  word.XMLNodes attributes();


  @VTID(24)
  @ReturnValue(defaultPropertyThrough={word.XMLNodes.class})
  word.XMLNode attributes(
    int index);

  /**
   * <p>
   * Getter method for the COM property "NodeValue"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String nodeValue();


  /**
   * <p>
   * Setter method for the COM property "NodeValue"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(26)
  void nodeValue(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "HasChildNodes"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(27)
  boolean hasChildNodes();


  /**
   * @param xPath Mandatory java.lang.String parameter.
   * @param prefixMapping Optional parameter. Default value is ""
   * @param fastSearchSkippingTextNodes Optional parameter. Default value is false
   * @return  Returns a value of type word.XMLNode
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(28)
  word.XMLNode selectSingleNode(
    java.lang.String xPath,
    @Optional @DefaultValue("") java.lang.String prefixMapping,
    @Optional @DefaultValue("-1") boolean fastSearchSkippingTextNodes);


  /**
   * @param xPath Mandatory java.lang.String parameter.
   * @param prefixMapping Optional parameter. Default value is ""
   * @param fastSearchSkippingTextNodes Optional parameter. Default value is false
   * @return  Returns a value of type word.XMLNodes
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(29)
  word.XMLNodes selectNodes(
    java.lang.String xPath,
    @Optional @DefaultValue("") java.lang.String prefixMapping,
    @Optional @DefaultValue("-1") boolean fastSearchSkippingTextNodes);


  /**
   * <p>
   * Getter method for the COM property "ChildNodeSuggestions"
   * </p>
   * @return  Returns a value of type word.XMLChildNodeSuggestions
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(30)
  word.XMLChildNodeSuggestions childNodeSuggestions();


  @VTID(30)
  @ReturnValue(defaultPropertyThrough={word.XMLChildNodeSuggestions.class})
  word.XMLChildNodeSuggestion childNodeSuggestions(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Level"
   * </p>
   * @return  Returns a value of type word.WdXMLNodeLevel
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(31)
  word.WdXMLNodeLevel level();


  /**
   * <p>
   * Getter method for the COM property "ValidationStatus"
   * </p>
   * @return  Returns a value of type word.WdXMLValidationStatus
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(32)
  word.WdXMLValidationStatus validationStatus();


  /**
   * <p>
   * Getter method for the COM property "SmartTag"
   * </p>
   * @return  Returns a value of type word.SmartTag
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(33)
  word.SmartTag smartTag();


  /**
   * <p>
   * Getter method for the COM property "ValidationErrorText"
   * </p>
   * @param advanced Optional parameter. Default value is false
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(34)
  java.lang.String validationErrorText(
    @Optional @DefaultValue("0") boolean advanced);


  /**
   * <p>
   * Getter method for the COM property "PlaceholderText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String placeholderText();


  /**
   * <p>
   * Setter method for the COM property "PlaceholderText"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(36)
  void placeholderText(
    java.lang.String prop);


  /**
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(37)
  void delete();


  /**
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(38)
  void copy();


  /**
   * @param childElement Mandatory word.XMLNode parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(39)
  void removeChild(
    word.XMLNode childElement);


  /**
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(40)
  void cut();


  /**
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(41)
  void validate();


  /**
   * @param status Mandatory word.WdXMLValidationStatus parameter.
   * @param errorText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param clearedAutomatically Optional parameter. Default value is false
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(42)
  void setValidationError(
    word.WdXMLValidationStatus status,
    @Optional java.lang.Object errorText,
    @Optional @DefaultValue("-1") boolean clearedAutomatically);


  /**
   * <p>
   * Getter method for the COM property "WordOpenXML"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(43)
  java.lang.String wordOpenXML();


  // Properties:
}
