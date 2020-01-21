package word  ;

import com4j.*;

@IID("{0C1FABE7-F737-406F-9CA3-B07661F9D1A2}")
public interface XMLMapping extends Com4jObject {
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
   * Getter method for the COM property "IsMapped"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  boolean isMapped();


  /**
   * <p>
   * Getter method for the COM property "CustomXMLPart"
   * </p>
   * @return  Returns a value of type office._CustomXMLPart
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  office._CustomXMLPart customXMLPart();


  /**
   * <p>
   * Getter method for the COM property "CustomXMLNode"
   * </p>
   * @return  Returns a value of type office.CustomXMLNode
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  office.CustomXMLNode customXMLNode();


  /**
   * @param xPath Mandatory java.lang.String parameter.
   * @param prefixMapping Optional parameter. Default value is ""
   * @param source Optional parameter. Default value is 0
   * @return  Returns a value of type boolean
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  boolean setMapping(
    java.lang.String xPath,
    @Optional @DefaultValue("") java.lang.String prefixMapping,
    @Optional @DefaultValue("0") office._CustomXMLPart source);


  /**
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  void delete();


  /**
   * @param node Mandatory office.CustomXMLNode parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  boolean setMappingByNode(
    office.CustomXMLNode node);


  /**
   * <p>
   * Getter method for the COM property "XPath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String xPath();


  /**
   * <p>
   * Getter method for the COM property "PrefixMappings"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String prefixMappings();


  // Properties:
}
