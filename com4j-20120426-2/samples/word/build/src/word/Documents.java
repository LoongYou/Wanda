package word  ;

import com4j.*;

@IID("{0002096C-0000-0000-C000-000000000046}")
public interface Documents extends Com4jObject,Iterable<Com4jObject> {
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
   * @return  Returns a value of type word._Document
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  word._Document item(
    java.lang.Object index);


  /**
   * @param saveChanges Optional parameter. Default value is com4j.Variant.getMissing()
   * @param originalFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param routeDocument Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1105) //= 0x451. The runtime will prefer the VTID if present
  @VTID(13)
  void close(
    @Optional java.lang.Object saveChanges,
    @Optional java.lang.Object originalFormat,
    @Optional java.lang.Object routeDocument);


  /**
   * @param template Optional parameter. Default value is com4j.Variant.getMissing()
   * @param newTemplate Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word._Document
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(14)
  word._Document addOld(
    @Optional java.lang.Object template,
    @Optional java.lang.Object newTemplate);


  /**
   * @param fileName Mandatory java.lang.Object parameter.
   * @param confirmConversions Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnly Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToRecentFiles Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordTemplate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param revert Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePasswordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePasswordTemplate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word._Document
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(15)
  word._Document openOld(
    java.lang.Object fileName,
    @Optional java.lang.Object confirmConversions,
    @Optional java.lang.Object readOnly,
    @Optional java.lang.Object addToRecentFiles,
    @Optional java.lang.Object passwordDocument,
    @Optional java.lang.Object passwordTemplate,
    @Optional java.lang.Object revert,
    @Optional java.lang.Object writePasswordDocument,
    @Optional java.lang.Object writePasswordTemplate,
    @Optional java.lang.Object format);


  /**
   * @param noPrompt Optional parameter. Default value is com4j.Variant.getMissing()
   * @param originalFormat Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(16)
  void save(
    @Optional java.lang.Object noPrompt,
    @Optional java.lang.Object originalFormat);


  /**
   * @param template Optional parameter. Default value is com4j.Variant.getMissing()
   * @param newTemplate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param documentType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param visible Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word._Document
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(17)
  word._Document add(
    @Optional java.lang.Object template,
    @Optional java.lang.Object newTemplate,
    @Optional java.lang.Object documentType,
    @Optional java.lang.Object visible);


  /**
   * @param fileName Mandatory java.lang.Object parameter.
   * @param confirmConversions Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnly Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToRecentFiles Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordTemplate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param revert Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePasswordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePasswordTemplate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @param encoding Optional parameter. Default value is com4j.Variant.getMissing()
   * @param visible Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word._Document
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(18)
  word._Document open2000(
    java.lang.Object fileName,
    @Optional java.lang.Object confirmConversions,
    @Optional java.lang.Object readOnly,
    @Optional java.lang.Object addToRecentFiles,
    @Optional java.lang.Object passwordDocument,
    @Optional java.lang.Object passwordTemplate,
    @Optional java.lang.Object revert,
    @Optional java.lang.Object writePasswordDocument,
    @Optional java.lang.Object writePasswordTemplate,
    @Optional java.lang.Object format,
    @Optional java.lang.Object encoding,
    @Optional java.lang.Object visible);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(19)
  void checkOut(
    java.lang.String fileName);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(20)
  boolean canCheckOut(
    java.lang.String fileName);


  /**
   * @param fileName Mandatory java.lang.Object parameter.
   * @param confirmConversions Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnly Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToRecentFiles Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordTemplate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param revert Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePasswordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePasswordTemplate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @param encoding Optional parameter. Default value is com4j.Variant.getMissing()
   * @param visible Optional parameter. Default value is com4j.Variant.getMissing()
   * @param openAndRepair Optional parameter. Default value is com4j.Variant.getMissing()
   * @param documentDirection Optional parameter. Default value is com4j.Variant.getMissing()
   * @param noEncodingDialog Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word._Document
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(21)
  word._Document open2002(
    java.lang.Object fileName,
    @Optional java.lang.Object confirmConversions,
    @Optional java.lang.Object readOnly,
    @Optional java.lang.Object addToRecentFiles,
    @Optional java.lang.Object passwordDocument,
    @Optional java.lang.Object passwordTemplate,
    @Optional java.lang.Object revert,
    @Optional java.lang.Object writePasswordDocument,
    @Optional java.lang.Object writePasswordTemplate,
    @Optional java.lang.Object format,
    @Optional java.lang.Object encoding,
    @Optional java.lang.Object visible,
    @Optional java.lang.Object openAndRepair,
    @Optional java.lang.Object documentDirection,
    @Optional java.lang.Object noEncodingDialog);


  /**
   * @param fileName Mandatory java.lang.Object parameter.
   * @param confirmConversions Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnly Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToRecentFiles Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordTemplate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param revert Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePasswordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePasswordTemplate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @param encoding Optional parameter. Default value is com4j.Variant.getMissing()
   * @param visible Optional parameter. Default value is com4j.Variant.getMissing()
   * @param openAndRepair Optional parameter. Default value is com4j.Variant.getMissing()
   * @param documentDirection Optional parameter. Default value is com4j.Variant.getMissing()
   * @param noEncodingDialog Optional parameter. Default value is com4j.Variant.getMissing()
   * @param xmlTransform Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word._Document
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(22)
  word._Document open(
    java.lang.Object fileName,
    @Optional java.lang.Object confirmConversions,
    @Optional java.lang.Object readOnly,
    @Optional java.lang.Object addToRecentFiles,
    @Optional java.lang.Object passwordDocument,
    @Optional java.lang.Object passwordTemplate,
    @Optional java.lang.Object revert,
    @Optional java.lang.Object writePasswordDocument,
    @Optional java.lang.Object writePasswordTemplate,
    @Optional java.lang.Object format,
    @Optional java.lang.Object encoding,
    @Optional java.lang.Object visible,
    @Optional java.lang.Object openAndRepair,
    @Optional java.lang.Object documentDirection,
    @Optional java.lang.Object noEncodingDialog,
    @Optional java.lang.Object xmlTransform);


  /**
   * @param fileName Mandatory java.lang.Object parameter.
   * @param confirmConversions Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnly Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToRecentFiles Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordTemplate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param revert Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePasswordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePasswordTemplate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @param encoding Optional parameter. Default value is com4j.Variant.getMissing()
   * @param visible Optional parameter. Default value is com4j.Variant.getMissing()
   * @param openAndRepair Optional parameter. Default value is com4j.Variant.getMissing()
   * @param documentDirection Optional parameter. Default value is com4j.Variant.getMissing()
   * @param noEncodingDialog Optional parameter. Default value is com4j.Variant.getMissing()
   * @param xmlTransform Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word._Document
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(23)
  word._Document openNoRepairDialog(
    java.lang.Object fileName,
    @Optional java.lang.Object confirmConversions,
    @Optional java.lang.Object readOnly,
    @Optional java.lang.Object addToRecentFiles,
    @Optional java.lang.Object passwordDocument,
    @Optional java.lang.Object passwordTemplate,
    @Optional java.lang.Object revert,
    @Optional java.lang.Object writePasswordDocument,
    @Optional java.lang.Object writePasswordTemplate,
    @Optional java.lang.Object format,
    @Optional java.lang.Object encoding,
    @Optional java.lang.Object visible,
    @Optional java.lang.Object openAndRepair,
    @Optional java.lang.Object documentDirection,
    @Optional java.lang.Object noEncodingDialog,
    @Optional java.lang.Object xmlTransform);


  /**
   * @param providerID Mandatory java.lang.String parameter.
   * @param postURL Mandatory java.lang.String parameter.
   * @param blogName Mandatory java.lang.String parameter.
   * @param postID Optional parameter. Default value is ""
   * @return  Returns a value of type word._Document
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(24)
  word._Document addBlogDocument(
    java.lang.String providerID,
    java.lang.String postURL,
    java.lang.String blogName,
    @Optional @DefaultValue("") java.lang.String postID);


  // Properties:
}
