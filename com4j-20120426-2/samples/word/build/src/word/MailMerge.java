package word  ;

import com4j.*;

@IID("{00020920-0000-0000-C000-000000000046}")
public interface MailMerge extends Com4jObject {
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
   * Getter method for the COM property "MainDocumentType"
   * </p>
   * @return  Returns a value of type word.WdMailMergeMainDocType
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  word.WdMailMergeMainDocType mainDocumentType();


  /**
   * <p>
   * Setter method for the COM property "MainDocumentType"
   * </p>
   * @param prop Mandatory word.WdMailMergeMainDocType parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  void mainDocumentType(
    word.WdMailMergeMainDocType prop);


  /**
   * <p>
   * Getter method for the COM property "State"
   * </p>
   * @return  Returns a value of type word.WdMailMergeState
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  word.WdMailMergeState state();


  /**
   * <p>
   * Getter method for the COM property "Destination"
   * </p>
   * @return  Returns a value of type word.WdMailMergeDestination
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  word.WdMailMergeDestination destination();


  /**
   * <p>
   * Setter method for the COM property "Destination"
   * </p>
   * @param prop Mandatory word.WdMailMergeDestination parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(14)
  void destination(
    word.WdMailMergeDestination prop);


  /**
   * <p>
   * Getter method for the COM property "DataSource"
   * </p>
   * @return  Returns a value of type word.MailMergeDataSource
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(15)
  word.MailMergeDataSource dataSource();


  /**
   * <p>
   * Getter method for the COM property "Fields"
   * </p>
   * @return  Returns a value of type word.MailMergeFields
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  word.MailMergeFields fields();


  @VTID(16)
  @ReturnValue(defaultPropertyThrough={word.MailMergeFields.class})
  word.MailMergeField fields(
    int index);

  /**
   * <p>
   * Getter method for the COM property "ViewMailMergeFieldCodes"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  int viewMailMergeFieldCodes();


  /**
   * <p>
   * Setter method for the COM property "ViewMailMergeFieldCodes"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  void viewMailMergeFieldCodes(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "SuppressBlankLines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  boolean suppressBlankLines();


  /**
   * <p>
   * Setter method for the COM property "SuppressBlankLines"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(20)
  void suppressBlankLines(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MailAsAttachment"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  boolean mailAsAttachment();


  /**
   * <p>
   * Setter method for the COM property "MailAsAttachment"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(22)
  void mailAsAttachment(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MailAddressFieldName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String mailAddressFieldName();


  /**
   * <p>
   * Setter method for the COM property "MailAddressFieldName"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(24)
  void mailAddressFieldName(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "MailSubject"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String mailSubject();


  /**
   * <p>
   * Setter method for the COM property "MailSubject"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(26)
  void mailSubject(
    java.lang.String prop);


  /**
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePasswordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param headerRecord Optional parameter. Default value is com4j.Variant.getMissing()
   * @param msQuery Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sqlStatement Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sqlStatement1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param connection Optional parameter. Default value is com4j.Variant.getMissing()
   * @param linkToSource Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(27)
  void createDataSource(
    @Optional java.lang.Object name,
    @Optional java.lang.Object passwordDocument,
    @Optional java.lang.Object writePasswordDocument,
    @Optional java.lang.Object headerRecord,
    @Optional java.lang.Object msQuery,
    @Optional java.lang.Object sqlStatement,
    @Optional java.lang.Object sqlStatement1,
    @Optional java.lang.Object connection,
    @Optional java.lang.Object linkToSource);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param passwordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePasswordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param headerRecord Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(28)
  void createHeaderSource(
    java.lang.String name,
    @Optional java.lang.Object passwordDocument,
    @Optional java.lang.Object writePasswordDocument,
    @Optional java.lang.Object headerRecord);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @param confirmConversions Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnly Optional parameter. Default value is com4j.Variant.getMissing()
   * @param linkToSource Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToRecentFiles Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordTemplate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param revert Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePasswordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePasswordTemplate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param connection Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sqlStatement Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sqlStatement1 Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(29)
  void openDataSource2000(
    java.lang.String name,
    @Optional java.lang.Object format,
    @Optional java.lang.Object confirmConversions,
    @Optional java.lang.Object readOnly,
    @Optional java.lang.Object linkToSource,
    @Optional java.lang.Object addToRecentFiles,
    @Optional java.lang.Object passwordDocument,
    @Optional java.lang.Object passwordTemplate,
    @Optional java.lang.Object revert,
    @Optional java.lang.Object writePasswordDocument,
    @Optional java.lang.Object writePasswordTemplate,
    @Optional java.lang.Object connection,
    @Optional java.lang.Object sqlStatement,
    @Optional java.lang.Object sqlStatement1);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @param confirmConversions Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnly Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToRecentFiles Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordTemplate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param revert Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePasswordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePasswordTemplate Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(30)
  void openHeaderSource2000(
    java.lang.String name,
    @Optional java.lang.Object format,
    @Optional java.lang.Object confirmConversions,
    @Optional java.lang.Object readOnly,
    @Optional java.lang.Object addToRecentFiles,
    @Optional java.lang.Object passwordDocument,
    @Optional java.lang.Object passwordTemplate,
    @Optional java.lang.Object revert,
    @Optional java.lang.Object writePasswordDocument,
    @Optional java.lang.Object writePasswordTemplate);


  /**
   * @param pause Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(31)
  void execute(
    @Optional java.lang.Object pause);


  /**
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(32)
  void check();


  /**
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(33)
  void editDataSource();


  /**
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(34)
  void editHeaderSource();


  /**
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(35)
  void editMainDocument();


  /**
   * @param type Mandatory java.lang.String parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(36)
  void useAddressBook(
    java.lang.String type);


  /**
   * <p>
   * Getter method for the COM property "HighlightMergeFields"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(37)
  boolean highlightMergeFields();


  /**
   * <p>
   * Setter method for the COM property "HighlightMergeFields"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(38)
  void highlightMergeFields(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MailFormat"
   * </p>
   * @return  Returns a value of type word.WdMailMergeMailFormat
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(39)
  word.WdMailMergeMailFormat mailFormat();


  /**
   * <p>
   * Setter method for the COM property "MailFormat"
   * </p>
   * @param prop Mandatory word.WdMailMergeMailFormat parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(40)
  void mailFormat(
    word.WdMailMergeMailFormat prop);


  /**
   * <p>
   * Getter method for the COM property "ShowSendToCustom"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(41)
  java.lang.String showSendToCustom();


  /**
   * <p>
   * Setter method for the COM property "ShowSendToCustom"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(42)
  void showSendToCustom(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "WizardState"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(43)
  int wizardState();


  /**
   * <p>
   * Setter method for the COM property "WizardState"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(44)
  void wizardState(
    int prop);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @param confirmConversions Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnly Optional parameter. Default value is com4j.Variant.getMissing()
   * @param linkToSource Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToRecentFiles Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordTemplate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param revert Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePasswordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePasswordTemplate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param connection Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sqlStatement Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sqlStatement1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param openExclusive Optional parameter. Default value is com4j.Variant.getMissing()
   * @param subType Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(45)
  void openDataSource(
    java.lang.String name,
    @Optional java.lang.Object format,
    @Optional java.lang.Object confirmConversions,
    @Optional java.lang.Object readOnly,
    @Optional java.lang.Object linkToSource,
    @Optional java.lang.Object addToRecentFiles,
    @Optional java.lang.Object passwordDocument,
    @Optional java.lang.Object passwordTemplate,
    @Optional java.lang.Object revert,
    @Optional java.lang.Object writePasswordDocument,
    @Optional java.lang.Object writePasswordTemplate,
    @Optional java.lang.Object connection,
    @Optional java.lang.Object sqlStatement,
    @Optional java.lang.Object sqlStatement1,
    @Optional java.lang.Object openExclusive,
    @Optional java.lang.Object subType);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @param confirmConversions Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnly Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToRecentFiles Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordTemplate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param revert Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePasswordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePasswordTemplate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param openExclusive Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(46)
  void openHeaderSource(
    java.lang.String name,
    @Optional java.lang.Object format,
    @Optional java.lang.Object confirmConversions,
    @Optional java.lang.Object readOnly,
    @Optional java.lang.Object addToRecentFiles,
    @Optional java.lang.Object passwordDocument,
    @Optional java.lang.Object passwordTemplate,
    @Optional java.lang.Object revert,
    @Optional java.lang.Object writePasswordDocument,
    @Optional java.lang.Object writePasswordTemplate,
    @Optional java.lang.Object openExclusive);


  /**
   * @param initialState Mandatory java.lang.Object parameter.
   * @param showDocumentStep Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showTemplateStep Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showDataStep Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showWriteStep Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showPreviewStep Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showMergeStep Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(47)
  void showWizard(
    java.lang.Object initialState,
    @Optional java.lang.Object showDocumentStep,
    @Optional java.lang.Object showTemplateStep,
    @Optional java.lang.Object showDataStep,
    @Optional java.lang.Object showWriteStep,
    @Optional java.lang.Object showPreviewStep,
    @Optional java.lang.Object showMergeStep);


  // Properties:
}
