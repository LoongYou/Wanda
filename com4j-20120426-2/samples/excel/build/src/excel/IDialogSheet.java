package excel  ;

import com4j.*;

@IID("{000208AF-0001-0000-C000-000000000046}")
public interface IDialogSheet extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type excel._Application
   */

  @VTID(7)
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type excel.XlCreator
   */

  @VTID(8)
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getParent();


  /**
   * @param lcid Mandatory int parameter.
   */

  @VTID(10)
  void activate(
    @LCID int lcid);


  /**
   * @param before Optional parameter. Default value is com4j.Variant.getMissing()
   * @param after Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @VTID(11)
  void copy(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object before,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object after,
    @LCID int lcid);


  /**
   * @param lcid Mandatory int parameter.
   */

  @VTID(12)
  void delete(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "CodeName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(13)
  java.lang.String getCodeName();


  /**
   * <p>
   * Getter method for the COM property "_CodeName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(14)
  java.lang.String get_CodeName();


  /**
   * <p>
   * Setter method for the COM property "_CodeName"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(15)
  void set_CodeName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @VTID(16)
  int getIndex(
    @LCID int lcid);


  /**
   * @param before Optional parameter. Default value is com4j.Variant.getMissing()
   * @param after Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @VTID(17)
  void move(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object before,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object after,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(18)
  java.lang.String getName();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(19)
  void setName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(20)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getNext();


  /**
   * <p>
   * Getter method for the COM property "OnDoubleClick"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(21)
  java.lang.String getOnDoubleClick(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "OnDoubleClick"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(22)
  void setOnDoubleClick(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "OnSheetActivate"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(23)
  java.lang.String getOnSheetActivate(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "OnSheetActivate"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(24)
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

  @VTID(25)
  java.lang.String getOnSheetDeactivate(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "OnSheetDeactivate"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(26)
  void setOnSheetDeactivate(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "PageSetup"
   * </p>
   * @return  Returns a value of type excel.PageSetup
   */

  @VTID(27)
  excel.PageSetup getPageSetup();


  /**
   * <p>
   * Getter method for the COM property "Previous"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(28)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getPrevious();


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

  @VTID(29)
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

  @VTID(30)
  void printPreview(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object enableChanges,
    @LCID int lcid);


  /**
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param drawingObjects Optional parameter. Default value is com4j.Variant.getMissing()
   * @param contents Optional parameter. Default value is com4j.Variant.getMissing()
   * @param scenarios Optional parameter. Default value is com4j.Variant.getMissing()
   * @param userInterfaceOnly Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @VTID(31)
  void _Protect(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object drawingObjects,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object contents,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object scenarios,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object userInterfaceOnly,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ProtectContents"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(32)
  boolean getProtectContents(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ProtectDrawingObjects"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(33)
  boolean getProtectDrawingObjects(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ProtectionMode"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(34)
  boolean getProtectionMode(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ProtectScenarios"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(35)
  boolean getProtectScenarios(
    @LCID int lcid);


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param fileFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writeResPassword Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnlyRecommended Optional parameter. Default value is com4j.Variant.getMissing()
   * @param createBackup Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToMru Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textCodepage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textVisualLayout Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @VTID(36)
  void _SaveAs(
    java.lang.String filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fileFormat,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object writeResPassword,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object readOnlyRecommended,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object createBackup,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object addToMru,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object textCodepage,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object textVisualLayout,
    @LCID int lcid);


  /**
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @VTID(37)
  void select(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object replace,
    @LCID int lcid);


  /**
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @VTID(38)
  void unprotect(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.XlSheetVisibility
   */

  @VTID(39)
  excel.XlSheetVisibility getVisible(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory excel.XlSheetVisibility parameter.
   */

  @VTID(40)
  void setVisible(
    @LCID int lcid,
    excel.XlSheetVisibility rhs);


  /**
   * <p>
   * Getter method for the COM property "Shapes"
   * </p>
   * @return  Returns a value of type excel.Shapes
   */

  @VTID(41)
  excel.Shapes getShapes();


  /**
   */

  @VTID(42)
  void _Dummy29();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(43)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject arcs(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   */

  @VTID(44)
  void _Dummy31();


  /**
   */

  @VTID(45)
  void _Dummy32();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(46)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject buttons(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   */

  @VTID(47)
  void _Dummy34();


  /**
   * <p>
   * Getter method for the COM property "EnableCalculation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(48)
  boolean getEnableCalculation();


  /**
   * <p>
   * Setter method for the COM property "EnableCalculation"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(49)
  void setEnableCalculation(
    boolean rhs);


  /**
   */

  @VTID(50)
  void _Dummy36();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(51)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject chartObjects(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(52)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject checkBoxes(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param customDictionary Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreUppercase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param alwaysSuggest Optional parameter. Default value is com4j.Variant.getMissing()
   * @param spellLang Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @VTID(53)
  void checkSpelling(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object customDictionary,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignoreUppercase,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object alwaysSuggest,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object spellLang,
    @LCID int lcid);


  /**
   */

  @VTID(54)
  void _Dummy40();


  /**
   */

  @VTID(55)
  void _Dummy41();


  /**
   */

  @VTID(56)
  void _Dummy42();


  /**
   */

  @VTID(57)
  void _Dummy43();


  /**
   */

  @VTID(58)
  void _Dummy44();


  /**
   */

  @VTID(59)
  void _Dummy45();


  /**
   * <p>
   * Getter method for the COM property "DisplayAutomaticPageBreaks"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(60)
  boolean getDisplayAutomaticPageBreaks(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DisplayAutomaticPageBreaks"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(61)
  void setDisplayAutomaticPageBreaks(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(62)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject drawings(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(63)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject drawingObjects(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(64)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject dropDowns(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "EnableAutoFilter"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(65)
  boolean getEnableAutoFilter(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "EnableAutoFilter"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(66)
  void setEnableAutoFilter(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableSelection"
   * </p>
   * @return  Returns a value of type excel.XlEnableSelection
   */

  @VTID(67)
  excel.XlEnableSelection getEnableSelection();


  /**
   * <p>
   * Setter method for the COM property "EnableSelection"
   * </p>
   * @param rhs Mandatory excel.XlEnableSelection parameter.
   */

  @VTID(68)
  void setEnableSelection(
    excel.XlEnableSelection rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableOutlining"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(69)
  boolean getEnableOutlining(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "EnableOutlining"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(70)
  void setEnableOutlining(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnablePivotTable"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(71)
  boolean getEnablePivotTable(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "EnablePivotTable"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(72)
  void setEnablePivotTable(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param name Mandatory java.lang.Object parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(73)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object evaluate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @LCID int lcid);


  /**
   * @param name Mandatory java.lang.Object parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(74)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object _Evaluate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @LCID int lcid);


  /**
   */

  @VTID(75)
  void _Dummy56();


  /**
   */

  @VTID(76)
  void resetAllPageBreaks();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(77)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject groupBoxes(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(78)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject groupObjects(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(79)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject labels(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(80)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject lines(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(81)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject listBoxes(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Names"
   * </p>
   * @return  Returns a value of type excel.Names
   */

  @VTID(82)
  excel.Names getNames();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(83)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject oleObjects(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   */

  @VTID(84)
  void _Dummy65();


  /**
   */

  @VTID(85)
  void _Dummy66();


  /**
   */

  @VTID(86)
  void _Dummy67();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(87)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject optionButtons(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   */

  @VTID(88)
  void _Dummy69();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(89)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject ovals(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param destination Optional parameter. Default value is com4j.Variant.getMissing()
   * @param link Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @VTID(90)
  void paste(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object destination,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object link,
    @LCID int lcid);


  /**
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @param link Optional parameter. Default value is com4j.Variant.getMissing()
   * @param displayAsIcon Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconLabel Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @VTID(91)
  void _PasteSpecial(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object format,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object link,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object displayAsIcon,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object iconFileName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object iconIndex,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object iconLabel,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(92)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject pictures(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   */

  @VTID(93)
  void _Dummy74();


  /**
   */

  @VTID(94)
  void _Dummy75();


  /**
   */

  @VTID(95)
  void _Dummy76();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(96)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject rectangles(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   */

  @VTID(97)
  void _Dummy78();


  /**
   */

  @VTID(98)
  void _Dummy79();


  /**
   * <p>
   * Getter method for the COM property "ScrollArea"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(99)
  java.lang.String getScrollArea();


  /**
   * <p>
   * Setter method for the COM property "ScrollArea"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(100)
  void setScrollArea(
    java.lang.String rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(101)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject scrollBars(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   */

  @VTID(102)
  void _Dummy82();


  /**
   */

  @VTID(103)
  void _Dummy83();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(104)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject spinners(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   */

  @VTID(105)
  void _Dummy85();


  /**
   */

  @VTID(106)
  void _Dummy86();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(107)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject textBoxes(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   */

  @VTID(108)
  void _Dummy88();


  /**
   */

  @VTID(109)
  void _Dummy89();


  /**
   */

  @VTID(110)
  void _Dummy90();


  /**
   * <p>
   * Getter method for the COM property "HPageBreaks"
   * </p>
   * @return  Returns a value of type excel.HPageBreaks
   */

  @VTID(111)
  excel.HPageBreaks getHPageBreaks();


  /**
   * <p>
   * Getter method for the COM property "VPageBreaks"
   * </p>
   * @return  Returns a value of type excel.VPageBreaks
   */

  @VTID(112)
  excel.VPageBreaks getVPageBreaks();


  /**
   * <p>
   * Getter method for the COM property "QueryTables"
   * </p>
   * @return  Returns a value of type excel.QueryTables
   */

  @VTID(113)
  excel.QueryTables getQueryTables();


  /**
   * <p>
   * Getter method for the COM property "DisplayPageBreaks"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(114)
  boolean getDisplayPageBreaks();


  /**
   * <p>
   * Setter method for the COM property "DisplayPageBreaks"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(115)
  void setDisplayPageBreaks(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Comments"
   * </p>
   * @return  Returns a value of type excel.Comments
   */

  @VTID(116)
  excel.Comments getComments();


  /**
   * <p>
   * Getter method for the COM property "Hyperlinks"
   * </p>
   * @return  Returns a value of type excel.Hyperlinks
   */

  @VTID(117)
  excel.Hyperlinks getHyperlinks();


  /**
   */

  @VTID(118)
  void clearCircles();


  /**
   */

  @VTID(119)
  void circleInvalid();


  /**
   * <p>
   * Getter method for the COM property "_DisplayRightToLeft"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @VTID(120)
  int get_DisplayRightToLeft(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "_DisplayRightToLeft"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @VTID(121)
  void set_DisplayRightToLeft(
    @LCID int lcid,
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoFilter"
   * </p>
   * @return  Returns a value of type excel.AutoFilter
   */

  @VTID(122)
  excel.AutoFilter getAutoFilter();


  /**
   * <p>
   * Getter method for the COM property "DisplayRightToLeft"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(123)
  boolean getDisplayRightToLeft(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DisplayRightToLeft"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(124)
  void setDisplayRightToLeft(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Scripts"
   * </p>
   * @return  Returns a value of type office.Scripts
   */

  @VTID(125)
  office.Scripts getScripts();


  @VTID(125)
  @ReturnValue(defaultPropertyThrough={office.Scripts.class})
  office.Script getScripts(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

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

  @VTID(126)
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
   * @param customDictionary Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreUppercase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param alwaysSuggest Optional parameter. Default value is com4j.Variant.getMissing()
   * @param spellLang Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreFinalYaa Optional parameter. Default value is com4j.Variant.getMissing()
   * @param spellScript Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @VTID(127)
  void _CheckSpelling(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object customDictionary,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignoreUppercase,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object alwaysSuggest,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object spellLang,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignoreFinalYaa,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object spellScript,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Tab"
   * </p>
   * @return  Returns a value of type excel.Tab
   */

  @VTID(128)
  excel.Tab getTab();


  /**
   * <p>
   * Getter method for the COM property "MailEnvelope"
   * </p>
   * @return  Returns a value of type office.IMsoEnvelopeVB
   */

  @VTID(129)
  office.IMsoEnvelopeVB getMailEnvelope();


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param fileFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writeResPassword Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnlyRecommended Optional parameter. Default value is com4j.Variant.getMissing()
   * @param createBackup Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToMru Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textCodepage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textVisualLayout Optional parameter. Default value is com4j.Variant.getMissing()
   * @param local Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(130)
  void saveAs(
    java.lang.String filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fileFormat,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object writeResPassword,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object readOnlyRecommended,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object createBackup,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object addToMru,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object textCodepage,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object textVisualLayout,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object local);


  /**
   * <p>
   * Getter method for the COM property "CustomProperties"
   * </p>
   * @return  Returns a value of type excel.CustomProperties
   */

  @VTID(131)
  excel.CustomProperties getCustomProperties();


  /**
   * <p>
   * Getter method for the COM property "SmartTags"
   * </p>
   * @return  Returns a value of type excel.SmartTags
   */

  @VTID(132)
  excel.SmartTags getSmartTags();


  /**
   * <p>
   * Getter method for the COM property "Protection"
   * </p>
   * @return  Returns a value of type excel.Protection
   */

  @VTID(133)
  excel.Protection getProtection();


  /**
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @param link Optional parameter. Default value is com4j.Variant.getMissing()
   * @param displayAsIcon Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconLabel Optional parameter. Default value is com4j.Variant.getMissing()
   * @param noHTMLFormatting Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @VTID(134)
  void pasteSpecial(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object format,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object link,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object displayAsIcon,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object iconFileName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object iconIndex,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object iconLabel,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object noHTMLFormatting,
    @LCID int lcid);


  /**
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param drawingObjects Optional parameter. Default value is com4j.Variant.getMissing()
   * @param contents Optional parameter. Default value is com4j.Variant.getMissing()
   * @param scenarios Optional parameter. Default value is com4j.Variant.getMissing()
   * @param userInterfaceOnly Optional parameter. Default value is com4j.Variant.getMissing()
   * @param allowFormattingCells Optional parameter. Default value is com4j.Variant.getMissing()
   * @param allowFormattingColumns Optional parameter. Default value is com4j.Variant.getMissing()
   * @param allowFormattingRows Optional parameter. Default value is com4j.Variant.getMissing()
   * @param allowInsertingColumns Optional parameter. Default value is com4j.Variant.getMissing()
   * @param allowInsertingRows Optional parameter. Default value is com4j.Variant.getMissing()
   * @param allowInsertingHyperlinks Optional parameter. Default value is com4j.Variant.getMissing()
   * @param allowDeletingColumns Optional parameter. Default value is com4j.Variant.getMissing()
   * @param allowDeletingRows Optional parameter. Default value is com4j.Variant.getMissing()
   * @param allowSorting Optional parameter. Default value is com4j.Variant.getMissing()
   * @param allowFiltering Optional parameter. Default value is com4j.Variant.getMissing()
   * @param allowUsingPivotTables Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(135)
  void protect(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object drawingObjects,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object contents,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object scenarios,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object userInterfaceOnly,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object allowFormattingCells,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object allowFormattingColumns,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object allowFormattingRows,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object allowInsertingColumns,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object allowInsertingRows,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object allowInsertingHyperlinks,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object allowDeletingColumns,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object allowDeletingRows,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object allowSorting,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object allowFiltering,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object allowUsingPivotTables);


  /**
   */

  @VTID(136)
  void _Dummy113();


  /**
   */

  @VTID(137)
  void _Dummy114();


  /**
   */

  @VTID(138)
  void _Dummy115();


  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param prToFileName Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(139)
  void printOut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copies,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object preview,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object activePrinter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object printToFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object collate,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object prToFileName);


  /**
   * <p>
   * Getter method for the COM property "EnableFormatConditionsCalculation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(140)
  boolean getEnableFormatConditionsCalculation();


  /**
   * <p>
   * Setter method for the COM property "EnableFormatConditionsCalculation"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(141)
  void setEnableFormatConditionsCalculation(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Sort"
   * </p>
   * @return  Returns a value of type excel.Sort
   */

  @VTID(142)
  excel.Sort getSort();


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

  @VTID(143)
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
   * Getter method for the COM property "PrintedCommentPages"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(144)
  int getPrintedCommentPages();


  /**
   * <p>
   * Getter method for the COM property "DefaultButton"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(145)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getDefaultButton();


  /**
   * <p>
   * Setter method for the COM property "DefaultButton"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(146)
  void setDefaultButton(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "DialogFrame"
   * </p>
   * @return  Returns a value of type excel.DialogFrame
   */

  @VTID(147)
  excel.DialogFrame getDialogFrame();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(148)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject editBoxes(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "Focus"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(149)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getFocus();


  /**
   * <p>
   * Setter method for the COM property "Focus"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(150)
  void setFocus(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @param cancel Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @VTID(151)
  boolean hide(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object cancel);


  /**
   * @return  Returns a value of type boolean
   */

  @VTID(152)
  boolean show();


  // Properties:
}
