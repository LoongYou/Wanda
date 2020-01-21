package word  ;

import com4j.*;

@IID("{A87E00E9-3AC3-4B53-ABE3-7379653D0E82}")
public interface XMLChildNodeSuggestion extends Com4jObject {
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
   * Getter method for the COM property "BaseName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  java.lang.String baseName();


  /**
   * <p>
   * Getter method for the COM property "NamespaceURI"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String namespaceURI();


  /**
   * <p>
   * Getter method for the COM property "XMLSchemaReference"
   * </p>
   * @return  Returns a value of type word.XMLSchemaReference
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  word.XMLSchemaReference xmlSchemaReference();


  /**
   * @param range Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.XMLNode
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(13)
  word.XMLNode insert(
    @Optional java.lang.Object range);


  // Properties:
}
