package word  ;

import com4j.*;

@IID("{356B06EC-4908-42A4-81FC-4B5A51F3483B}")
public interface XMLSchemaReferences extends Com4jObject,Iterable<Com4jObject> {
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
   * <p>
   * Getter method for the COM property "AutomaticValidation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  boolean automaticValidation();


  /**
   * <p>
   * Setter method for the COM property "AutomaticValidation"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  void automaticValidation(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AllowSaveAsXMLWithoutValidation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  boolean allowSaveAsXMLWithoutValidation();


  /**
   * <p>
   * Setter method for the COM property "AllowSaveAsXMLWithoutValidation"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(15)
  void allowSaveAsXMLWithoutValidation(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "HideValidationErrors"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  boolean hideValidationErrors();


  /**
   * <p>
   * Setter method for the COM property "HideValidationErrors"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(17)
  void hideValidationErrors(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "IgnoreMixedContent"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  boolean ignoreMixedContent();


  /**
   * <p>
   * Setter method for the COM property "IgnoreMixedContent"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(19)
  void ignoreMixedContent(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowPlaceholderText"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(20)
  boolean showPlaceholderText();


  /**
   * <p>
   * Setter method for the COM property "ShowPlaceholderText"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(21)
  void showPlaceholderText(
    boolean prop);


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type word.XMLSchemaReference
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(22)
  @DefaultMethod
  word.XMLSchemaReference item(
    java.lang.Object index);


  /**
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(23)
  void validate();


  /**
   * @param namespaceURI Optional parameter. Default value is com4j.Variant.getMissing()
   * @param alias Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param installForAllUsers Optional parameter. Default value is false
   * @return  Returns a value of type word.XMLSchemaReference
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(24)
  word.XMLSchemaReference add(
    @Optional java.lang.Object namespaceURI,
    @Optional java.lang.Object alias,
    @Optional java.lang.Object fileName,
    @Optional @DefaultValue("0") boolean installForAllUsers);


  // Properties:
}
