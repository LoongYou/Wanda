package excel  ;

import com4j.*;

@IID("{000208DA-0000-0000-C000-000000000046}")
public interface _Workbook extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type excel._Application
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(7)
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type excel.XlCreator
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(8)
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getParent();


  /**
   * <p>
   * Getter method for the COM property "AcceptLabelsInFormulas"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1441) //= 0x5a1. The runtime will prefer the VTID if present
  @VTID(10)
  boolean getAcceptLabelsInFormulas();


  /**
   * <p>
   * Setter method for the COM property "AcceptLabelsInFormulas"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1441) //= 0x5a1. The runtime will prefer the VTID if present
  @VTID(11)
  void setAcceptLabelsInFormulas(
    boolean rhs);


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(304) //= 0x130. The runtime will prefer the VTID if present
  @VTID(12)
  void activate(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ActiveChart"
   * </p>
   * @return  Returns a value of type excel._Chart
   */

  @DISPID(183) //= 0xb7. The runtime will prefer the VTID if present
  @VTID(13)
  excel._Chart getActiveChart();


  /**
   * <p>
   * Getter method for the COM property "ActiveSheet"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(307) //= 0x133. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getActiveSheet();


  /**
   * <p>
   * Getter method for the COM property "Author"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(574) //= 0x23e. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String getAuthor(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Author"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(574) //= 0x23e. The runtime will prefer the VTID if present
  @VTID(16)
  void setAuthor(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoUpdateFrequency"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1442) //= 0x5a2. The runtime will prefer the VTID if present
  @VTID(17)
  int getAutoUpdateFrequency();


  /**
   * <p>
   * Setter method for the COM property "AutoUpdateFrequency"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1442) //= 0x5a2. The runtime will prefer the VTID if present
  @VTID(18)
  void setAutoUpdateFrequency(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoUpdateSaveChanges"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1443) //= 0x5a3. The runtime will prefer the VTID if present
  @VTID(19)
  boolean getAutoUpdateSaveChanges();


  /**
   * <p>
   * Setter method for the COM property "AutoUpdateSaveChanges"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1443) //= 0x5a3. The runtime will prefer the VTID if present
  @VTID(20)
  void setAutoUpdateSaveChanges(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ChangeHistoryDuration"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1444) //= 0x5a4. The runtime will prefer the VTID if present
  @VTID(21)
  int getChangeHistoryDuration();


  /**
   * <p>
   * Setter method for the COM property "ChangeHistoryDuration"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1444) //= 0x5a4. The runtime will prefer the VTID if present
  @VTID(22)
  void setChangeHistoryDuration(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "BuiltinDocumentProperties"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1176) //= 0x498. The runtime will prefer the VTID if present
  @VTID(23)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getBuiltinDocumentProperties();


  /**
   * @param mode Mandatory excel.XlFileAccess parameter.
   * @param writePassword Optional parameter. Default value is com4j.Variant.getMissing()
   * @param notify Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(989) //= 0x3dd. The runtime will prefer the VTID if present
  @VTID(24)
  void changeFileAccess(
    excel.XlFileAccess mode,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object writePassword,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object notify,
    @LCID int lcid);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param newName Mandatory java.lang.String parameter.
   * @param type Optional parameter. Default value is 1
   * @param lcid Mandatory int parameter.
   */

  @DISPID(802) //= 0x322. The runtime will prefer the VTID if present
  @VTID(25)
  void changeLink(
    java.lang.String name,
    java.lang.String newName,
    @Optional @DefaultValue("1") excel.XlLinkType type,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Charts"
   * </p>
   * @return  Returns a value of type excel.Sheets
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(26)
  excel.Sheets getCharts();


  @VTID(26)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={excel.Sheets.class})
  com4j.Com4jObject getCharts(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * @param saveChanges Optional parameter. Default value is com4j.Variant.getMissing()
   * @param filename Optional parameter. Default value is com4j.Variant.getMissing()
   * @param routeWorkbook Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(277) //= 0x115. The runtime will prefer the VTID if present
  @VTID(27)
  void close(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object saveChanges,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object routeWorkbook,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "CodeName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1373) //= 0x55d. The runtime will prefer the VTID if present
  @VTID(28)
  java.lang.String getCodeName();


  /**
   * <p>
   * Getter method for the COM property "_CodeName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(29)
  java.lang.String get_CodeName();


  /**
   * <p>
   * Setter method for the COM property "_CodeName"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(30)
  void set_CodeName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Colors"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(286) //= 0x11e. The runtime will prefer the VTID if present
  @VTID(31)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getColors(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Colors"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(286) //= 0x11e. The runtime will prefer the VTID if present
  @VTID(32)
  void setColors(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "CommandBars"
   * </p>
   * @return  Returns a value of type office._CommandBars
   */

  @DISPID(1439) //= 0x59f. The runtime will prefer the VTID if present
  @VTID(33)
  office._CommandBars getCommandBars();


  /**
   * <p>
   * Getter method for the COM property "Comments"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(575) //= 0x23f. The runtime will prefer the VTID if present
  @VTID(34)
  java.lang.String getComments(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Comments"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(575) //= 0x23f. The runtime will prefer the VTID if present
  @VTID(35)
  void setComments(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ConflictResolution"
   * </p>
   * @return  Returns a value of type excel.XlSaveConflictResolution
   */

  @DISPID(1175) //= 0x497. The runtime will prefer the VTID if present
  @VTID(36)
  excel.XlSaveConflictResolution getConflictResolution();


  /**
   * <p>
   * Setter method for the COM property "ConflictResolution"
   * </p>
   * @param rhs Mandatory excel.XlSaveConflictResolution parameter.
   */

  @DISPID(1175) //= 0x497. The runtime will prefer the VTID if present
  @VTID(37)
  void setConflictResolution(
    excel.XlSaveConflictResolution rhs);


  /**
   * <p>
   * Getter method for the COM property "Container"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1190) //= 0x4a6. The runtime will prefer the VTID if present
  @VTID(38)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getContainer();


  /**
   * <p>
   * Getter method for the COM property "CreateBackup"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(287) //= 0x11f. The runtime will prefer the VTID if present
  @VTID(39)
  boolean getCreateBackup(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "CustomDocumentProperties"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1177) //= 0x499. The runtime will prefer the VTID if present
  @VTID(40)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getCustomDocumentProperties();


  /**
   * <p>
   * Getter method for the COM property "Date1904"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(41)
  boolean getDate1904(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Date1904"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(42)
  void setDate1904(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param numberFormat Mandatory java.lang.String parameter.
   * @param lcid Mandatory int parameter.
   */

  @DISPID(397) //= 0x18d. The runtime will prefer the VTID if present
  @VTID(43)
  void deleteNumberFormat(
    java.lang.String numberFormat,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "DialogSheets"
   * </p>
   * @return  Returns a value of type excel.Sheets
   */

  @DISPID(764) //= 0x2fc. The runtime will prefer the VTID if present
  @VTID(44)
  excel.Sheets getDialogSheets();


  @VTID(44)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={excel.Sheets.class})
  com4j.Com4jObject getDialogSheets(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "DisplayDrawingObjects"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.XlDisplayDrawingObjects
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(45)
  excel.XlDisplayDrawingObjects getDisplayDrawingObjects(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DisplayDrawingObjects"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory excel.XlDisplayDrawingObjects parameter.
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(46)
  void setDisplayDrawingObjects(
    @LCID int lcid,
    excel.XlDisplayDrawingObjects rhs);


  /**
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1168) //= 0x490. The runtime will prefer the VTID if present
  @VTID(47)
  boolean exclusiveAccess(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "FileFormat"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.XlFileFormat
   */

  @DISPID(288) //= 0x120. The runtime will prefer the VTID if present
  @VTID(48)
  excel.XlFileFormat getFileFormat(
    @LCID int lcid);


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(973) //= 0x3cd. The runtime will prefer the VTID if present
  @VTID(49)
  void forwardMailer(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "FullName"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(289) //= 0x121. The runtime will prefer the VTID if present
  @VTID(50)
  java.lang.String getFullName(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "HasMailer"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(976) //= 0x3d0. The runtime will prefer the VTID if present
  @VTID(51)
  boolean getHasMailer(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "HasMailer"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(976) //= 0x3d0. The runtime will prefer the VTID if present
  @VTID(52)
  void setHasMailer(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasPassword"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(290) //= 0x122. The runtime will prefer the VTID if present
  @VTID(53)
  boolean getHasPassword(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "HasRoutingSlip"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(950) //= 0x3b6. The runtime will prefer the VTID if present
  @VTID(54)
  boolean getHasRoutingSlip(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "HasRoutingSlip"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(950) //= 0x3b6. The runtime will prefer the VTID if present
  @VTID(55)
  void setHasRoutingSlip(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "IsAddin"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1445) //= 0x5a5. The runtime will prefer the VTID if present
  @VTID(56)
  boolean getIsAddin();


  /**
   * <p>
   * Setter method for the COM property "IsAddin"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1445) //= 0x5a5. The runtime will prefer the VTID if present
  @VTID(57)
  void setIsAddin(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Keywords"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(577) //= 0x241. The runtime will prefer the VTID if present
  @VTID(58)
  java.lang.String getKeywords(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Keywords"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(577) //= 0x241. The runtime will prefer the VTID if present
  @VTID(59)
  void setKeywords(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param linkInfo Mandatory excel.XlLinkInfo parameter.
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param editionRef Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(807) //= 0x327. The runtime will prefer the VTID if present
  @VTID(60)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object linkInfo(
    java.lang.String name,
    excel.XlLinkInfo linkInfo,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object editionRef,
    @LCID int lcid);


  /**
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(808) //= 0x328. The runtime will prefer the VTID if present
  @VTID(61)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object linkSources(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Mailer"
   * </p>
   * @return  Returns a value of type excel.Mailer
   */

  @DISPID(979) //= 0x3d3. The runtime will prefer the VTID if present
  @VTID(62)
  excel.Mailer getMailer();


  /**
   * @param filename Mandatory java.lang.Object parameter.
   */

  @DISPID(1446) //= 0x5a6. The runtime will prefer the VTID if present
  @VTID(63)
  void mergeWorkbook(
    @MarshalAs(NativeType.VARIANT) java.lang.Object filename);


  /**
   * <p>
   * Getter method for the COM property "Modules"
   * </p>
   * @return  Returns a value of type excel.Sheets
   */

  @DISPID(582) //= 0x246. The runtime will prefer the VTID if present
  @VTID(64)
  excel.Sheets getModules();


  @VTID(64)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={excel.Sheets.class})
  com4j.Com4jObject getModules(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "MultiUserEditing"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1169) //= 0x491. The runtime will prefer the VTID if present
  @VTID(65)
  boolean getMultiUserEditing(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(66)
  java.lang.String getName();


  /**
   * <p>
   * Getter method for the COM property "Names"
   * </p>
   * @return  Returns a value of type excel.Names
   */

  @DISPID(442) //= 0x1ba. The runtime will prefer the VTID if present
  @VTID(67)
  excel.Names getNames();


  /**
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.Window
   */

  @DISPID(280) //= 0x118. The runtime will prefer the VTID if present
  @VTID(68)
  excel.Window newWindow(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "OnSave"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1178) //= 0x49a. The runtime will prefer the VTID if present
  @VTID(69)
  java.lang.String getOnSave(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "OnSave"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1178) //= 0x49a. The runtime will prefer the VTID if present
  @VTID(70)
  void setOnSave(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "OnSheetActivate"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1031) //= 0x407. The runtime will prefer the VTID if present
  @VTID(71)
  java.lang.String getOnSheetActivate(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "OnSheetActivate"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1031) //= 0x407. The runtime will prefer the VTID if present
  @VTID(72)
  void setOnSheetActivate(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "OnSheetDeactivate"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1081) //= 0x439. The runtime will prefer the VTID if present
  @VTID(73)
  java.lang.String getOnSheetDeactivate(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "OnSheetDeactivate"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1081) //= 0x439. The runtime will prefer the VTID if present
  @VTID(74)
  void setOnSheetDeactivate(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param readOnly Optional parameter. Default value is com4j.Variant.getMissing()
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(803) //= 0x323. The runtime will prefer the VTID if present
  @VTID(75)
  void openLinks(
    java.lang.String name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object readOnly,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(291) //= 0x123. The runtime will prefer the VTID if present
  @VTID(76)
  java.lang.String getPath(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "PersonalViewListSettings"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1447) //= 0x5a7. The runtime will prefer the VTID if present
  @VTID(77)
  boolean getPersonalViewListSettings();


  /**
   * <p>
   * Setter method for the COM property "PersonalViewListSettings"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1447) //= 0x5a7. The runtime will prefer the VTID if present
  @VTID(78)
  void setPersonalViewListSettings(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PersonalViewPrintSettings"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1448) //= 0x5a8. The runtime will prefer the VTID if present
  @VTID(79)
  boolean getPersonalViewPrintSettings();


  /**
   * <p>
   * Setter method for the COM property "PersonalViewPrintSettings"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1448) //= 0x5a8. The runtime will prefer the VTID if present
  @VTID(80)
  void setPersonalViewPrintSettings(
    boolean rhs);


  /**
   * @return  Returns a value of type excel.PivotCaches
   */

  @DISPID(1449) //= 0x5a9. The runtime will prefer the VTID if present
  @VTID(81)
  excel.PivotCaches pivotCaches();


  /**
   * @param destName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(1166) //= 0x48e. The runtime will prefer the VTID if present
  @VTID(82)
  void post(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object destName,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "PrecisionAsDisplayed"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(405) //= 0x195. The runtime will prefer the VTID if present
  @VTID(83)
  boolean getPrecisionAsDisplayed(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "PrecisionAsDisplayed"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(405) //= 0x195. The runtime will prefer the VTID if present
  @VTID(84)
  void setPrecisionAsDisplayed(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(905) //= 0x389. The runtime will prefer the VTID if present
  @VTID(85)
  void __PrintOut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copies,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object preview,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object activePrinter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object printToFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object collate,
    @LCID int lcid);


  /**
   * @param enableChanges Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(281) //= 0x119. The runtime will prefer the VTID if present
  @VTID(86)
  void printPreview(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object enableChanges,
    @LCID int lcid);


  /**
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param structure Optional parameter. Default value is com4j.Variant.getMissing()
   * @param windows Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(282) //= 0x11a. The runtime will prefer the VTID if present
  @VTID(87)
  void _Protect(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object structure,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object windows);


  /**
   * @param filename Optional parameter. Default value is com4j.Variant.getMissing()
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writeResPassword Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnlyRecommended Optional parameter. Default value is com4j.Variant.getMissing()
   * @param createBackup Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sharingPassword Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1450) //= 0x5aa. The runtime will prefer the VTID if present
  @VTID(88)
  void _ProtectSharing(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object writeResPassword,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object readOnlyRecommended,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object createBackup,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object sharingPassword);


  /**
   * <p>
   * Getter method for the COM property "ProtectStructure"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(588) //= 0x24c. The runtime will prefer the VTID if present
  @VTID(89)
  boolean getProtectStructure();


  /**
   * <p>
   * Getter method for the COM property "ProtectWindows"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(295) //= 0x127. The runtime will prefer the VTID if present
  @VTID(90)
  boolean getProtectWindows();


  /**
   * <p>
   * Getter method for the COM property "ReadOnly"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(296) //= 0x128. The runtime will prefer the VTID if present
  @VTID(91)
  boolean getReadOnly(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "_ReadOnlyRecommended"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(297) //= 0x129. The runtime will prefer the VTID if present
  @VTID(92)
  boolean get_ReadOnlyRecommended(
    @LCID int lcid);


  /**
   */

  @DISPID(1452) //= 0x5ac. The runtime will prefer the VTID if present
  @VTID(93)
  void refreshAll();


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(977) //= 0x3d1. The runtime will prefer the VTID if present
  @VTID(94)
  void reply(
    @LCID int lcid);


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(978) //= 0x3d2. The runtime will prefer the VTID if present
  @VTID(95)
  void replyAll(
    @LCID int lcid);


  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(1453) //= 0x5ad. The runtime will prefer the VTID if present
  @VTID(96)
  void removeUser(
    int index);


  /**
   * <p>
   * Getter method for the COM property "RevisionNumber"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1172) //= 0x494. The runtime will prefer the VTID if present
  @VTID(97)
  int getRevisionNumber(
    @LCID int lcid);


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(946) //= 0x3b2. The runtime will prefer the VTID if present
  @VTID(98)
  void route(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Routed"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(951) //= 0x3b7. The runtime will prefer the VTID if present
  @VTID(99)
  boolean getRouted(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "RoutingSlip"
   * </p>
   * @return  Returns a value of type excel.RoutingSlip
   */

  @DISPID(949) //= 0x3b5. The runtime will prefer the VTID if present
  @VTID(100)
  excel.RoutingSlip getRoutingSlip();


  /**
   * @param which Mandatory excel.XlRunAutoMacro parameter.
   * @param lcid Mandatory int parameter.
   */

  @DISPID(634) //= 0x27a. The runtime will prefer the VTID if present
  @VTID(101)
  void runAutoMacros(
    excel.XlRunAutoMacro which,
    @LCID int lcid);


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(283) //= 0x11b. The runtime will prefer the VTID if present
  @VTID(102)
  void save(
    @LCID int lcid);


  /**
   * @param filename Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fileFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writeResPassword Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnlyRecommended Optional parameter. Default value is com4j.Variant.getMissing()
   * @param createBackup Optional parameter. Default value is com4j.Variant.getMissing()
   * @param accessMode Optional parameter. Default value is 1
   * @param conflictResolution Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToMru Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textCodepage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textVisualLayout Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(284) //= 0x11c. The runtime will prefer the VTID if present
  @VTID(103)
  void _SaveAs(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fileFormat,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object writeResPassword,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object readOnlyRecommended,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object createBackup,
    @Optional @DefaultValue("1") excel.XlSaveAsAccessMode accessMode,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object conflictResolution,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object addToMru,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object textCodepage,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object textVisualLayout,
    @LCID int lcid);


  /**
   * @param filename Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(175) //= 0xaf. The runtime will prefer the VTID if present
  @VTID(104)
  void saveCopyAs(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filename,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Saved"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(298) //= 0x12a. The runtime will prefer the VTID if present
  @VTID(105)
  boolean getSaved(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Saved"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(298) //= 0x12a. The runtime will prefer the VTID if present
  @VTID(106)
  void setSaved(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SaveLinkValues"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(406) //= 0x196. The runtime will prefer the VTID if present
  @VTID(107)
  boolean getSaveLinkValues(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "SaveLinkValues"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(406) //= 0x196. The runtime will prefer the VTID if present
  @VTID(108)
  void setSaveLinkValues(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param recipients Mandatory java.lang.Object parameter.
   * @param subject Optional parameter. Default value is com4j.Variant.getMissing()
   * @param returnReceipt Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(947) //= 0x3b3. The runtime will prefer the VTID if present
  @VTID(109)
  void sendMail(
    @MarshalAs(NativeType.VARIANT) java.lang.Object recipients,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object subject,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object returnReceipt,
    @LCID int lcid);


  /**
   * @param fileFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param priority Optional parameter. Default value is -4143
   * @param lcid Mandatory int parameter.
   */

  @DISPID(980) //= 0x3d4. The runtime will prefer the VTID if present
  @VTID(110)
  void sendMailer(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fileFormat,
    @Optional @DefaultValue("-4143") excel.XlPriority priority,
    @LCID int lcid);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param procedure Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(809) //= 0x329. The runtime will prefer the VTID if present
  @VTID(111)
  void setLinkOnData(
    java.lang.String name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object procedure,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Sheets"
   * </p>
   * @return  Returns a value of type excel.Sheets
   */

  @DISPID(485) //= 0x1e5. The runtime will prefer the VTID if present
  @VTID(112)
  excel.Sheets getSheets();


  @VTID(112)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={excel.Sheets.class})
  com4j.Com4jObject getSheets(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "ShowConflictHistory"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1171) //= 0x493. The runtime will prefer the VTID if present
  @VTID(113)
  boolean getShowConflictHistory(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "ShowConflictHistory"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1171) //= 0x493. The runtime will prefer the VTID if present
  @VTID(114)
  void setShowConflictHistory(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Styles"
   * </p>
   * @return  Returns a value of type excel.Styles
   */

  @DISPID(493) //= 0x1ed. The runtime will prefer the VTID if present
  @VTID(115)
  excel.Styles getStyles();


  /**
   * <p>
   * Getter method for the COM property "Subject"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(953) //= 0x3b9. The runtime will prefer the VTID if present
  @VTID(116)
  java.lang.String getSubject(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Subject"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(953) //= 0x3b9. The runtime will prefer the VTID if present
  @VTID(117)
  void setSubject(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(199) //= 0xc7. The runtime will prefer the VTID if present
  @VTID(118)
  java.lang.String getTitle(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Title"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(199) //= 0xc7. The runtime will prefer the VTID if present
  @VTID(119)
  void setTitle(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(285) //= 0x11d. The runtime will prefer the VTID if present
  @VTID(120)
  void unprotect(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @LCID int lcid);


  /**
   * @param sharingPassword Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1455) //= 0x5af. The runtime will prefer the VTID if present
  @VTID(121)
  void unprotectSharing(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object sharingPassword);


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(995) //= 0x3e3. The runtime will prefer the VTID if present
  @VTID(122)
  void updateFromFile(
    @LCID int lcid);


  /**
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(804) //= 0x324. The runtime will prefer the VTID if present
  @VTID(123)
  void updateLink(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "UpdateRemoteReferences"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(411) //= 0x19b. The runtime will prefer the VTID if present
  @VTID(124)
  boolean getUpdateRemoteReferences(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "UpdateRemoteReferences"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(411) //= 0x19b. The runtime will prefer the VTID if present
  @VTID(125)
  void setUpdateRemoteReferences(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "UserControl"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1210) //= 0x4ba. The runtime will prefer the VTID if present
  @VTID(126)
  boolean getUserControl();


  /**
   * <p>
   * Setter method for the COM property "UserControl"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1210) //= 0x4ba. The runtime will prefer the VTID if present
  @VTID(127)
  void setUserControl(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "UserStatus"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1173) //= 0x495. The runtime will prefer the VTID if present
  @VTID(128)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getUserStatus(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "CustomViews"
   * </p>
   * @return  Returns a value of type excel.CustomViews
   */

  @DISPID(1456) //= 0x5b0. The runtime will prefer the VTID if present
  @VTID(129)
  excel.CustomViews getCustomViews();


  /**
   * <p>
   * Getter method for the COM property "Windows"
   * </p>
   * @return  Returns a value of type excel.Windows
   */

  @DISPID(430) //= 0x1ae. The runtime will prefer the VTID if present
  @VTID(130)
  excel.Windows getWindows();


  /**
   * <p>
   * Getter method for the COM property "Worksheets"
   * </p>
   * @return  Returns a value of type excel.Sheets
   */

  @DISPID(494) //= 0x1ee. The runtime will prefer the VTID if present
  @VTID(131)
  excel.Sheets getWorksheets();


  @VTID(131)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={excel.Sheets.class})
  com4j.Com4jObject getWorksheets(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "WriteReserved"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(299) //= 0x12b. The runtime will prefer the VTID if present
  @VTID(132)
  boolean getWriteReserved(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "WriteReservedBy"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(300) //= 0x12c. The runtime will prefer the VTID if present
  @VTID(133)
  java.lang.String getWriteReservedBy(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Excel4IntlMacroSheets"
   * </p>
   * @return  Returns a value of type excel.Sheets
   */

  @DISPID(581) //= 0x245. The runtime will prefer the VTID if present
  @VTID(134)
  excel.Sheets getExcel4IntlMacroSheets();


  @VTID(134)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={excel.Sheets.class})
  com4j.Com4jObject getExcel4IntlMacroSheets(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Excel4MacroSheets"
   * </p>
   * @return  Returns a value of type excel.Sheets
   */

  @DISPID(579) //= 0x243. The runtime will prefer the VTID if present
  @VTID(135)
  excel.Sheets getExcel4MacroSheets();


  @VTID(135)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={excel.Sheets.class})
  com4j.Com4jObject getExcel4MacroSheets(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "TemplateRemoveExtData"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1457) //= 0x5b1. The runtime will prefer the VTID if present
  @VTID(136)
  boolean getTemplateRemoveExtData();


  /**
   * <p>
   * Setter method for the COM property "TemplateRemoveExtData"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1457) //= 0x5b1. The runtime will prefer the VTID if present
  @VTID(137)
  void setTemplateRemoveExtData(
    boolean rhs);


  /**
   * @param when Optional parameter. Default value is com4j.Variant.getMissing()
   * @param who Optional parameter. Default value is com4j.Variant.getMissing()
   * @param where Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1458) //= 0x5b2. The runtime will prefer the VTID if present
  @VTID(138)
  void highlightChangesOptions(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object when,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object who,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object where);


  /**
   * <p>
   * Getter method for the COM property "HighlightChangesOnScreen"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1461) //= 0x5b5. The runtime will prefer the VTID if present
  @VTID(139)
  boolean getHighlightChangesOnScreen();


  /**
   * <p>
   * Setter method for the COM property "HighlightChangesOnScreen"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1461) //= 0x5b5. The runtime will prefer the VTID if present
  @VTID(140)
  void setHighlightChangesOnScreen(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "KeepChangeHistory"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1462) //= 0x5b6. The runtime will prefer the VTID if present
  @VTID(141)
  boolean getKeepChangeHistory();


  /**
   * <p>
   * Setter method for the COM property "KeepChangeHistory"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1462) //= 0x5b6. The runtime will prefer the VTID if present
  @VTID(142)
  void setKeepChangeHistory(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ListChangesOnNewSheet"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1463) //= 0x5b7. The runtime will prefer the VTID if present
  @VTID(143)
  boolean getListChangesOnNewSheet();


  /**
   * <p>
   * Setter method for the COM property "ListChangesOnNewSheet"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1463) //= 0x5b7. The runtime will prefer the VTID if present
  @VTID(144)
  void setListChangesOnNewSheet(
    boolean rhs);


  /**
   * @param days Mandatory int parameter.
   * @param sharingPassword Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1464) //= 0x5b8. The runtime will prefer the VTID if present
  @VTID(145)
  void purgeChangeHistoryNow(
    int days,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object sharingPassword);


  /**
   * @param when Optional parameter. Default value is com4j.Variant.getMissing()
   * @param who Optional parameter. Default value is com4j.Variant.getMissing()
   * @param where Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1466) //= 0x5ba. The runtime will prefer the VTID if present
  @VTID(146)
  void acceptAllChanges(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object when,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object who,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object where);


  /**
   * @param when Optional parameter. Default value is com4j.Variant.getMissing()
   * @param who Optional parameter. Default value is com4j.Variant.getMissing()
   * @param where Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1467) //= 0x5bb. The runtime will prefer the VTID if present
  @VTID(147)
  void rejectAllChanges(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object when,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object who,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object where);


  /**
   * @param sourceType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sourceData Optional parameter. Default value is com4j.Variant.getMissing()
   * @param tableDestination Optional parameter. Default value is com4j.Variant.getMissing()
   * @param tableName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param rowGrand Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnGrand Optional parameter. Default value is com4j.Variant.getMissing()
   * @param saveData Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasAutoFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoPage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param reserved Optional parameter. Default value is com4j.Variant.getMissing()
   * @param backgroundQuery Optional parameter. Default value is com4j.Variant.getMissing()
   * @param optimizeCache Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pageFieldOrder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pageFieldWrapCount Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readData Optional parameter. Default value is com4j.Variant.getMissing()
   * @param connection Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(684) //= 0x2ac. The runtime will prefer the VTID if present
  @VTID(148)
  void pivotTableWizard(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object sourceType,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object sourceData,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object tableDestination,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object tableName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowGrand,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columnGrand,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object saveData,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object hasAutoFormat,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object autoPage,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object reserved,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object backgroundQuery,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object optimizeCache,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object pageFieldOrder,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object pageFieldWrapCount,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object readData,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object connection,
    @LCID int lcid);


  /**
   */

  @DISPID(1468) //= 0x5bc. The runtime will prefer the VTID if present
  @VTID(149)
  void resetColors();


  /**
   * <p>
   * Getter method for the COM property "VBProject"
   * </p>
   * @return  Returns a value of type vba._VBProject
   */

  @DISPID(1469) //= 0x5bd. The runtime will prefer the VTID if present
  @VTID(150)
  vba._VBProject getVBProject();


  /**
   * @param address Mandatory java.lang.String parameter.
   * @param subAddress Optional parameter. Default value is com4j.Variant.getMissing()
   * @param newWindow Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addHistory Optional parameter. Default value is com4j.Variant.getMissing()
   * @param extraInfo Optional parameter. Default value is com4j.Variant.getMissing()
   * @param method Optional parameter. Default value is com4j.Variant.getMissing()
   * @param headerInfo Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1470) //= 0x5be. The runtime will prefer the VTID if present
  @VTID(151)
  void followHyperlink(
    java.lang.String address,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object subAddress,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object newWindow,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object addHistory,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object extraInfo,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object method,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object headerInfo);


  /**
   */

  @DISPID(1476) //= 0x5c4. The runtime will prefer the VTID if present
  @VTID(152)
  void addToFavorites();


  /**
   * <p>
   * Getter method for the COM property "IsInplace"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1769) //= 0x6e9. The runtime will prefer the VTID if present
  @VTID(153)
  boolean getIsInplace();


  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param prToFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(1772) //= 0x6ec. The runtime will prefer the VTID if present
  @VTID(154)
  void _PrintOut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copies,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object preview,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object activePrinter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object printToFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object collate,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object prToFileName,
    @LCID int lcid);


  /**
   */

  @DISPID(1818) //= 0x71a. The runtime will prefer the VTID if present
  @VTID(155)
  void webPagePreview();


  /**
   * <p>
   * Getter method for the COM property "PublishObjects"
   * </p>
   * @return  Returns a value of type excel.PublishObjects
   */

  @DISPID(1819) //= 0x71b. The runtime will prefer the VTID if present
  @VTID(156)
  excel.PublishObjects getPublishObjects();


  /**
   * <p>
   * Getter method for the COM property "WebOptions"
   * </p>
   * @return  Returns a value of type excel.WebOptions
   */

  @DISPID(1820) //= 0x71c. The runtime will prefer the VTID if present
  @VTID(157)
  excel.WebOptions getWebOptions();


  /**
   * @param encoding Mandatory office.MsoEncoding parameter.
   */

  @DISPID(1821) //= 0x71d. The runtime will prefer the VTID if present
  @VTID(158)
  void reloadAs(
    office.MsoEncoding encoding);


  /**
   * <p>
   * Getter method for the COM property "HTMLProject"
   * </p>
   * @return  Returns a value of type office.HTMLProject
   */

  @DISPID(1823) //= 0x71f. The runtime will prefer the VTID if present
  @VTID(159)
  office.HTMLProject getHTMLProject();


  /**
   * <p>
   * Getter method for the COM property "EnvelopeVisible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1824) //= 0x720. The runtime will prefer the VTID if present
  @VTID(160)
  boolean getEnvelopeVisible();


  /**
   * <p>
   * Setter method for the COM property "EnvelopeVisible"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1824) //= 0x720. The runtime will prefer the VTID if present
  @VTID(161)
  void setEnvelopeVisible(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CalculationVersion"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1806) //= 0x70e. The runtime will prefer the VTID if present
  @VTID(162)
  int getCalculationVersion();


  /**
   * @param calcid Mandatory int parameter.
   */

  @DISPID(2044) //= 0x7fc. The runtime will prefer the VTID if present
  @VTID(163)
  void dummy17(
    int calcid);


  /**
   * @param s Mandatory java.lang.String parameter.
   */

  @DISPID(1826) //= 0x722. The runtime will prefer the VTID if present
  @VTID(164)
  void sblt(
    java.lang.String s);


  /**
   * <p>
   * Getter method for the COM property "VBASigned"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1828) //= 0x724. The runtime will prefer the VTID if present
  @VTID(165)
  boolean getVBASigned();


  /**
   * <p>
   * Getter method for the COM property "ShowPivotTableFieldList"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2046) //= 0x7fe. The runtime will prefer the VTID if present
  @VTID(166)
  boolean getShowPivotTableFieldList();


  /**
   * <p>
   * Setter method for the COM property "ShowPivotTableFieldList"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2046) //= 0x7fe. The runtime will prefer the VTID if present
  @VTID(167)
  void setShowPivotTableFieldList(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "UpdateLinks"
   * </p>
   * @return  Returns a value of type excel.XlUpdateLinks
   */

  @DISPID(864) //= 0x360. The runtime will prefer the VTID if present
  @VTID(168)
  excel.XlUpdateLinks getUpdateLinks();


  /**
   * <p>
   * Setter method for the COM property "UpdateLinks"
   * </p>
   * @param rhs Mandatory excel.XlUpdateLinks parameter.
   */

  @DISPID(864) //= 0x360. The runtime will prefer the VTID if present
  @VTID(169)
  void setUpdateLinks(
    excel.XlUpdateLinks rhs);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param type Mandatory excel.XlLinkType parameter.
   */

  @DISPID(2047) //= 0x7ff. The runtime will prefer the VTID if present
  @VTID(170)
  void breakLink(
    java.lang.String name,
    excel.XlLinkType type);


  /**
   */

  @DISPID(2048) //= 0x800. The runtime will prefer the VTID if present
  @VTID(171)
  void dummy16();


  /**
   * @param filename Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fileFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writeResPassword Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnlyRecommended Optional parameter. Default value is com4j.Variant.getMissing()
   * @param createBackup Optional parameter. Default value is com4j.Variant.getMissing()
   * @param accessMode Optional parameter. Default value is 1
   * @param conflictResolution Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToMru Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textCodepage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textVisualLayout Optional parameter. Default value is com4j.Variant.getMissing()
   * @param local Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(1925) //= 0x785. The runtime will prefer the VTID if present
  @VTID(172)
  void saveAs(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fileFormat,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object writeResPassword,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object readOnlyRecommended,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object createBackup,
    @Optional @DefaultValue("1") excel.XlSaveAsAccessMode accessMode,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object conflictResolution,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object addToMru,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object textCodepage,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object textVisualLayout,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object local,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "EnableAutoRecover"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2049) //= 0x801. The runtime will prefer the VTID if present
  @VTID(173)
  boolean getEnableAutoRecover();


  /**
   * <p>
   * Setter method for the COM property "EnableAutoRecover"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2049) //= 0x801. The runtime will prefer the VTID if present
  @VTID(174)
  void setEnableAutoRecover(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RemovePersonalInformation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2050) //= 0x802. The runtime will prefer the VTID if present
  @VTID(175)
  boolean getRemovePersonalInformation();


  /**
   * <p>
   * Setter method for the COM property "RemovePersonalInformation"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2050) //= 0x802. The runtime will prefer the VTID if present
  @VTID(176)
  void setRemovePersonalInformation(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "FullNameURLEncoded"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1927) //= 0x787. The runtime will prefer the VTID if present
  @VTID(177)
  java.lang.String getFullNameURLEncoded(
    @LCID int lcid);


  /**
   * @param saveChanges Optional parameter. Default value is com4j.Variant.getMissing()
   * @param comments Optional parameter. Default value is com4j.Variant.getMissing()
   * @param makePublic Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2051) //= 0x803. The runtime will prefer the VTID if present
  @VTID(178)
  void checkIn(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object saveChanges,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object comments,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object makePublic);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(2053) //= 0x805. The runtime will prefer the VTID if present
  @VTID(179)
  boolean canCheckIn();


  /**
   * @param recipients Optional parameter. Default value is com4j.Variant.getMissing()
   * @param subject Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showMessage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param includeAttachment Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2054) //= 0x806. The runtime will prefer the VTID if present
  @VTID(180)
  void sendForReview(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object recipients,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object subject,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showMessage,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object includeAttachment);


  /**
   * @param showMessage Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2057) //= 0x809. The runtime will prefer the VTID if present
  @VTID(181)
  void replyWithChanges(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showMessage);


  /**
   */

  @DISPID(2058) //= 0x80a. The runtime will prefer the VTID if present
  @VTID(182)
  void endReview();


  /**
   * <p>
   * Getter method for the COM property "Password"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(429) //= 0x1ad. The runtime will prefer the VTID if present
  @VTID(183)
  java.lang.String getPassword();


  /**
   * <p>
   * Setter method for the COM property "Password"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(429) //= 0x1ad. The runtime will prefer the VTID if present
  @VTID(184)
  void setPassword(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "WritePassword"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1128) //= 0x468. The runtime will prefer the VTID if present
  @VTID(185)
  java.lang.String getWritePassword();


  /**
   * <p>
   * Setter method for the COM property "WritePassword"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1128) //= 0x468. The runtime will prefer the VTID if present
  @VTID(186)
  void setWritePassword(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "PasswordEncryptionProvider"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2059) //= 0x80b. The runtime will prefer the VTID if present
  @VTID(187)
  java.lang.String getPasswordEncryptionProvider();


  /**
   * <p>
   * Getter method for the COM property "PasswordEncryptionAlgorithm"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2060) //= 0x80c. The runtime will prefer the VTID if present
  @VTID(188)
  java.lang.String getPasswordEncryptionAlgorithm();


  /**
   * <p>
   * Getter method for the COM property "PasswordEncryptionKeyLength"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2061) //= 0x80d. The runtime will prefer the VTID if present
  @VTID(189)
  int getPasswordEncryptionKeyLength();


  /**
   * @param passwordEncryptionProvider Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordEncryptionAlgorithm Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordEncryptionKeyLength Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordEncryptionFileProperties Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2062) //= 0x80e. The runtime will prefer the VTID if present
  @VTID(190)
  void setPasswordEncryptionOptions(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object passwordEncryptionProvider,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object passwordEncryptionAlgorithm,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object passwordEncryptionKeyLength,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object passwordEncryptionFileProperties);


  /**
   * <p>
   * Getter method for the COM property "PasswordEncryptionFileProperties"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2063) //= 0x80f. The runtime will prefer the VTID if present
  @VTID(191)
  boolean getPasswordEncryptionFileProperties();


  /**
   * <p>
   * Getter method for the COM property "ReadOnlyRecommended"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(192)
  boolean getReadOnlyRecommended();


  /**
   * <p>
   * Setter method for the COM property "ReadOnlyRecommended"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(193)
  void setReadOnlyRecommended(
    boolean rhs);


  /**
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param structure Optional parameter. Default value is com4j.Variant.getMissing()
   * @param windows Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2029) //= 0x7ed. The runtime will prefer the VTID if present
  @VTID(194)
  void protect(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object structure,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object windows);


  /**
   * <p>
   * Getter method for the COM property "SmartTagOptions"
   * </p>
   * @return  Returns a value of type excel.SmartTagOptions
   */

  @DISPID(2064) //= 0x810. The runtime will prefer the VTID if present
  @VTID(195)
  excel.SmartTagOptions getSmartTagOptions();


  /**
   */

  @DISPID(2065) //= 0x811. The runtime will prefer the VTID if present
  @VTID(196)
  void recheckSmartTags();


  /**
   * <p>
   * Getter method for the COM property "Permission"
   * </p>
   * @return  Returns a value of type office.Permission
   */

  @DISPID(2264) //= 0x8d8. The runtime will prefer the VTID if present
  @VTID(197)
  office.Permission getPermission();


  @VTID(197)
  @ReturnValue(defaultPropertyThrough={office.Permission.class})
  office.UserPermission getPermission(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "SharedWorkspace"
   * </p>
   * @return  Returns a value of type office.SharedWorkspace
   */

  @DISPID(2265) //= 0x8d9. The runtime will prefer the VTID if present
  @VTID(198)
  office.SharedWorkspace getSharedWorkspace();


  /**
   * <p>
   * Getter method for the COM property "Sync"
   * </p>
   * @return  Returns a value of type office.Sync
   */

  @DISPID(2266) //= 0x8da. The runtime will prefer the VTID if present
  @VTID(199)
  office.Sync getSync();


  /**
   * @param recipients Optional parameter. Default value is com4j.Variant.getMissing()
   * @param subject Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showMessage Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2267) //= 0x8db. The runtime will prefer the VTID if present
  @VTID(200)
  void sendFaxOverInternet(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object recipients,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object subject,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showMessage);


  /**
   * <p>
   * Getter method for the COM property "XmlNamespaces"
   * </p>
   * @return  Returns a value of type excel.XmlNamespaces
   */

  @DISPID(2268) //= 0x8dc. The runtime will prefer the VTID if present
  @VTID(201)
  excel.XmlNamespaces getXmlNamespaces();


  /**
   * <p>
   * Getter method for the COM property "XmlMaps"
   * </p>
   * @return  Returns a value of type excel.XmlMaps
   */

  @DISPID(2269) //= 0x8dd. The runtime will prefer the VTID if present
  @VTID(202)
  excel.XmlMaps getXmlMaps();


  /**
   * @param url Mandatory java.lang.String parameter.
   * @param importMap Mandatory Holder<excel.XmlMap> parameter.
   * @param overwrite Optional parameter. Default value is com4j.Variant.getMissing()
   * @param destination Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.XlXmlImportResult
   */

  @DISPID(2270) //= 0x8de. The runtime will prefer the VTID if present
  @VTID(203)
  excel.XlXmlImportResult xmlImport(
    java.lang.String url,
    Holder<excel.XmlMap> importMap,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object overwrite,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object destination);


  /**
   * <p>
   * Getter method for the COM property "SmartDocument"
   * </p>
   * @return  Returns a value of type office.SmartDocument
   */

  @DISPID(2273) //= 0x8e1. The runtime will prefer the VTID if present
  @VTID(204)
  office.SmartDocument getSmartDocument();


  /**
   * <p>
   * Getter method for the COM property "DocumentLibraryVersions"
   * </p>
   * @return  Returns a value of type office.DocumentLibraryVersions
   */

  @DISPID(2274) //= 0x8e2. The runtime will prefer the VTID if present
  @VTID(205)
  office.DocumentLibraryVersions getDocumentLibraryVersions();


  @VTID(205)
  @ReturnValue(defaultPropertyThrough={office.DocumentLibraryVersions.class})
  office.DocumentLibraryVersion getDocumentLibraryVersions(
    int lIndex);

  /**
   * <p>
   * Getter method for the COM property "InactiveListBorderVisible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2275) //= 0x8e3. The runtime will prefer the VTID if present
  @VTID(206)
  boolean getInactiveListBorderVisible();


  /**
   * <p>
   * Setter method for the COM property "InactiveListBorderVisible"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2275) //= 0x8e3. The runtime will prefer the VTID if present
  @VTID(207)
  void setInactiveListBorderVisible(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayInkComments"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2276) //= 0x8e4. The runtime will prefer the VTID if present
  @VTID(208)
  boolean getDisplayInkComments();


  /**
   * <p>
   * Setter method for the COM property "DisplayInkComments"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2276) //= 0x8e4. The runtime will prefer the VTID if present
  @VTID(209)
  void setDisplayInkComments(
    boolean rhs);


  /**
   * @param data Mandatory java.lang.String parameter.
   * @param importMap Mandatory Holder<excel.XmlMap> parameter.
   * @param overwrite Optional parameter. Default value is com4j.Variant.getMissing()
   * @param destination Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.XlXmlImportResult
   */

  @DISPID(2277) //= 0x8e5. The runtime will prefer the VTID if present
  @VTID(210)
  excel.XlXmlImportResult xmlImportXml(
    java.lang.String data,
    Holder<excel.XmlMap> importMap,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object overwrite,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object destination);


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param map Mandatory excel.XmlMap parameter.
   */

  @DISPID(2278) //= 0x8e6. The runtime will prefer the VTID if present
  @VTID(211)
  void saveAsXMLData(
    java.lang.String filename,
    excel.XmlMap map);


  /**
   */

  @DISPID(2279) //= 0x8e7. The runtime will prefer the VTID if present
  @VTID(212)
  void toggleFormsDesign();


  /**
   * <p>
   * Getter method for the COM property "ContentTypeProperties"
   * </p>
   * @return  Returns a value of type office.MetaProperties
   */

  @DISPID(2512) //= 0x9d0. The runtime will prefer the VTID if present
  @VTID(213)
  office.MetaProperties getContentTypeProperties();


  @VTID(213)
  @ReturnValue(defaultPropertyThrough={office.MetaProperties.class})
  office.MetaProperty getContentTypeProperties(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Connections"
   * </p>
   * @return  Returns a value of type excel.Connections
   */

  @DISPID(2513) //= 0x9d1. The runtime will prefer the VTID if present
  @VTID(214)
  excel.Connections getConnections();


  /**
   * @param removeDocInfoType Mandatory excel.XlRemoveDocInfoType parameter.
   */

  @DISPID(2514) //= 0x9d2. The runtime will prefer the VTID if present
  @VTID(215)
  void removeDocumentInformation(
    excel.XlRemoveDocInfoType removeDocInfoType);


  /**
   * <p>
   * Getter method for the COM property "Signatures"
   * </p>
   * @return  Returns a value of type office.SignatureSet
   */

  @DISPID(2516) //= 0x9d4. The runtime will prefer the VTID if present
  @VTID(216)
  office.SignatureSet getSignatures();


  @VTID(216)
  @ReturnValue(defaultPropertyThrough={office.SignatureSet.class})
  office.Signature getSignatures(
    int iSig);

  /**
   * @param saveChanges Optional parameter. Default value is com4j.Variant.getMissing()
   * @param comments Optional parameter. Default value is com4j.Variant.getMissing()
   * @param makePublic Optional parameter. Default value is com4j.Variant.getMissing()
   * @param versionType Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2517) //= 0x9d5. The runtime will prefer the VTID if present
  @VTID(217)
  void checkInWithVersion(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object saveChanges,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object comments,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object makePublic,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object versionType);


  /**
   * <p>
   * Getter method for the COM property "ServerPolicy"
   * </p>
   * @return  Returns a value of type office.ServerPolicy
   */

  @DISPID(2519) //= 0x9d7. The runtime will prefer the VTID if present
  @VTID(218)
  office.ServerPolicy getServerPolicy();


  @VTID(218)
  @ReturnValue(defaultPropertyThrough={office.ServerPolicy.class})
  office.PolicyItem getServerPolicy(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   */

  @DISPID(2520) //= 0x9d8. The runtime will prefer the VTID if present
  @VTID(219)
  void lockServerFile();


  /**
   * <p>
   * Getter method for the COM property "DocumentInspectors"
   * </p>
   * @return  Returns a value of type office.DocumentInspectors
   */

  @DISPID(2521) //= 0x9d9. The runtime will prefer the VTID if present
  @VTID(220)
  office.DocumentInspectors getDocumentInspectors();


  @VTID(220)
  @ReturnValue(defaultPropertyThrough={office.DocumentInspectors.class})
  office.DocumentInspector getDocumentInspectors(
    int index);

  /**
   * @return  Returns a value of type office.WorkflowTasks
   */

  @DISPID(2522) //= 0x9da. The runtime will prefer the VTID if present
  @VTID(221)
  office.WorkflowTasks getWorkflowTasks();


  @VTID(221)
  @ReturnValue(defaultPropertyThrough={office.WorkflowTasks.class})
  office.WorkflowTask getWorkflowTasks(
    int index);

  /**
   * @return  Returns a value of type office.WorkflowTemplates
   */

  @DISPID(2523) //= 0x9db. The runtime will prefer the VTID if present
  @VTID(222)
  office.WorkflowTemplates getWorkflowTemplates();


  @VTID(222)
  @ReturnValue(defaultPropertyThrough={office.WorkflowTemplates.class})
  office.WorkflowTemplate getWorkflowTemplates(
    int index);

  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param prToFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignorePrintAreas Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(2361) //= 0x939. The runtime will prefer the VTID if present
  @VTID(223)
  void printOut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copies,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object preview,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object activePrinter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object printToFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object collate,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object prToFileName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignorePrintAreas,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ServerViewableItems"
   * </p>
   * @return  Returns a value of type excel.ServerViewableItems
   */

  @DISPID(2524) //= 0x9dc. The runtime will prefer the VTID if present
  @VTID(224)
  excel.ServerViewableItems getServerViewableItems();


  /**
   * <p>
   * Getter method for the COM property "TableStyles"
   * </p>
   * @return  Returns a value of type excel.TableStyles
   */

  @DISPID(2525) //= 0x9dd. The runtime will prefer the VTID if present
  @VTID(225)
  excel.TableStyles getTableStyles();


  /**
   * <p>
   * Getter method for the COM property "DefaultTableStyle"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2526) //= 0x9de. The runtime will prefer the VTID if present
  @VTID(226)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getDefaultTableStyle();


  /**
   * <p>
   * Setter method for the COM property "DefaultTableStyle"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2526) //= 0x9de. The runtime will prefer the VTID if present
  @VTID(227)
  void setDefaultTableStyle(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "DefaultPivotTableStyle"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2527) //= 0x9df. The runtime will prefer the VTID if present
  @VTID(228)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getDefaultPivotTableStyle();


  /**
   * <p>
   * Setter method for the COM property "DefaultPivotTableStyle"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2527) //= 0x9df. The runtime will prefer the VTID if present
  @VTID(229)
  void setDefaultPivotTableStyle(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "CheckCompatibility"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2528) //= 0x9e0. The runtime will prefer the VTID if present
  @VTID(230)
  boolean getCheckCompatibility();


  /**
   * <p>
   * Setter method for the COM property "CheckCompatibility"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2528) //= 0x9e0. The runtime will prefer the VTID if present
  @VTID(231)
  void setCheckCompatibility(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasVBProject"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2529) //= 0x9e1. The runtime will prefer the VTID if present
  @VTID(232)
  boolean getHasVBProject();


  /**
   * <p>
   * Getter method for the COM property "CustomXMLParts"
   * </p>
   * @return  Returns a value of type office._CustomXMLParts
   */

  @DISPID(2530) //= 0x9e2. The runtime will prefer the VTID if present
  @VTID(233)
  office._CustomXMLParts getCustomXMLParts();


  /**
   * <p>
   * Getter method for the COM property "Final"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2531) //= 0x9e3. The runtime will prefer the VTID if present
  @VTID(234)
  boolean getFinal();


  /**
   * <p>
   * Setter method for the COM property "Final"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2531) //= 0x9e3. The runtime will prefer the VTID if present
  @VTID(235)
  void setFinal(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Research"
   * </p>
   * @return  Returns a value of type excel.Research
   */

  @DISPID(2532) //= 0x9e4. The runtime will prefer the VTID if present
  @VTID(236)
  excel.Research getResearch();


  /**
   * <p>
   * Getter method for the COM property "Theme"
   * </p>
   * @return  Returns a value of type office.OfficeTheme
   */

  @DISPID(2533) //= 0x9e5. The runtime will prefer the VTID if present
  @VTID(237)
  office.OfficeTheme getTheme();


  /**
   * @param filename Mandatory java.lang.String parameter.
   */

  @DISPID(2534) //= 0x9e6. The runtime will prefer the VTID if present
  @VTID(238)
  void applyTheme(
    java.lang.String filename);


  /**
   * <p>
   * Getter method for the COM property "Excel8CompatibilityMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2535) //= 0x9e7. The runtime will prefer the VTID if present
  @VTID(239)
  boolean getExcel8CompatibilityMode();


  /**
   * <p>
   * Getter method for the COM property "ConnectionsDisabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2536) //= 0x9e8. The runtime will prefer the VTID if present
  @VTID(240)
  boolean getConnectionsDisabled();


  /**
   */

  @DISPID(2537) //= 0x9e9. The runtime will prefer the VTID if present
  @VTID(241)
  void enableConnections();


  /**
   * <p>
   * Getter method for the COM property "ShowPivotChartActiveFields"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2538) //= 0x9ea. The runtime will prefer the VTID if present
  @VTID(242)
  boolean getShowPivotChartActiveFields();


  /**
   * <p>
   * Setter method for the COM property "ShowPivotChartActiveFields"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2538) //= 0x9ea. The runtime will prefer the VTID if present
  @VTID(243)
  void setShowPivotChartActiveFields(
    boolean rhs);


  /**
   * @param type Mandatory excel.XlFixedFormatType parameter.
   * @param filename Optional parameter. Default value is com4j.Variant.getMissing()
   * @param quality Optional parameter. Default value is com4j.Variant.getMissing()
   * @param includeDocProperties Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignorePrintAreas Optional parameter. Default value is com4j.Variant.getMissing()
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param openAfterPublish Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fixedFormatExtClassPtr Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2493) //= 0x9bd. The runtime will prefer the VTID if present
  @VTID(244)
  void exportAsFixedFormat(
    excel.XlFixedFormatType type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object quality,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object includeDocProperties,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignorePrintAreas,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object openAfterPublish,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fixedFormatExtClassPtr);


  /**
   * <p>
   * Getter method for the COM property "IconSets"
   * </p>
   * @return  Returns a value of type excel.IconSets
   */

  @DISPID(2539) //= 0x9eb. The runtime will prefer the VTID if present
  @VTID(245)
  excel.IconSets getIconSets();


  /**
   * <p>
   * Getter method for the COM property "EncryptionProvider"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2540) //= 0x9ec. The runtime will prefer the VTID if present
  @VTID(246)
  java.lang.String getEncryptionProvider();


  /**
   * <p>
   * Setter method for the COM property "EncryptionProvider"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2540) //= 0x9ec. The runtime will prefer the VTID if present
  @VTID(247)
  void setEncryptionProvider(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "DoNotPromptForConvert"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2541) //= 0x9ed. The runtime will prefer the VTID if present
  @VTID(248)
  boolean getDoNotPromptForConvert();


  /**
   * <p>
   * Setter method for the COM property "DoNotPromptForConvert"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2541) //= 0x9ed. The runtime will prefer the VTID if present
  @VTID(249)
  void setDoNotPromptForConvert(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ForceFullCalculation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2542) //= 0x9ee. The runtime will prefer the VTID if present
  @VTID(250)
  boolean getForceFullCalculation();


  /**
   * <p>
   * Setter method for the COM property "ForceFullCalculation"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2542) //= 0x9ee. The runtime will prefer the VTID if present
  @VTID(251)
  void setForceFullCalculation(
    boolean rhs);


  /**
   * @param filename Optional parameter. Default value is com4j.Variant.getMissing()
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writeResPassword Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnlyRecommended Optional parameter. Default value is com4j.Variant.getMissing()
   * @param createBackup Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sharingPassword Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fileFormat Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2543) //= 0x9ef. The runtime will prefer the VTID if present
  @VTID(252)
  void protectSharing(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object writeResPassword,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object readOnlyRecommended,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object createBackup,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object sharingPassword,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fileFormat);


  /**
   * <p>
   * Getter method for the COM property "SlicerCaches"
   * </p>
   * @return  Returns a value of type excel.SlicerCaches
   */

  @DISPID(2866) //= 0xb32. The runtime will prefer the VTID if present
  @VTID(253)
  excel.SlicerCaches getSlicerCaches();


  /**
   * <p>
   * Getter method for the COM property "ActiveSlicer"
   * </p>
   * @return  Returns a value of type excel.Slicer
   */

  @DISPID(2867) //= 0xb33. The runtime will prefer the VTID if present
  @VTID(254)
  excel.Slicer getActiveSlicer();


  /**
   * <p>
   * Getter method for the COM property "DefaultSlicerStyle"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2868) //= 0xb34. The runtime will prefer the VTID if present
  @VTID(255)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getDefaultSlicerStyle();


  /**
   * <p>
   * Setter method for the COM property "DefaultSlicerStyle"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2868) //= 0xb34. The runtime will prefer the VTID if present
  @VTID(256)
  void setDefaultSlicerStyle(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   */

  @DISPID(2869) //= 0xb35. The runtime will prefer the VTID if present
  @VTID(257)
  void dummy26();


  /**
   */

  @DISPID(2870) //= 0xb36. The runtime will prefer the VTID if present
  @VTID(258)
  void dummy27();


  /**
   * <p>
   * Getter method for the COM property "AccuracyVersion"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2871) //= 0xb37. The runtime will prefer the VTID if present
  @VTID(259)
  int getAccuracyVersion();


  /**
   * <p>
   * Setter method for the COM property "AccuracyVersion"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2871) //= 0xb37. The runtime will prefer the VTID if present
  @VTID(260)
  void setAccuracyVersion(
    int rhs);


  // Properties:
}
