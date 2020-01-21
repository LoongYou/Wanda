package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DialogSheet extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   */

  @DISPID(148)
  @PropGet
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   */

  @DISPID(149)
  @PropGet
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   */

  @DISPID(150)
  @PropGet
  com4j.Com4jObject getParent();


  /**
   */

  @DISPID(304)
  void activate();


  /**
   * @param before Optional parameter. Default value is com4j.Variant.getMissing()
   * @param after Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(551)
  void copy(
    @Optional java.lang.Object before,
    @Optional java.lang.Object after);


  /**
   */

  @DISPID(117)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "CodeName"
   * </p>
   */

  @DISPID(1373)
  @PropGet
  java.lang.String getCodeName();


  /**
   * <p>
   * Getter method for the COM property "_CodeName"
   * </p>
   */

  @DISPID(-2147418112)
  @PropGet
  java.lang.String get_CodeName();


  /**
   * <p>
   * Setter method for the COM property "_CodeName"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418112)
  @PropPut
  void set_CodeName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   */

  @DISPID(486)
  @PropGet
  int getIndex();


  /**
   * @param before Optional parameter. Default value is com4j.Variant.getMissing()
   * @param after Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(637)
  void move(
    @Optional java.lang.Object before,
    @Optional java.lang.Object after);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   */

  @DISPID(110)
  @PropGet
  java.lang.String getName();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(110)
  @PropPut
  void setName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   */

  @DISPID(502)
  @PropGet
  com4j.Com4jObject getNext();


  /**
   * <p>
   * Getter method for the COM property "OnDoubleClick"
   * </p>
   */

  @DISPID(628)
  @PropGet
  java.lang.String getOnDoubleClick();


  /**
   * <p>
   * Setter method for the COM property "OnDoubleClick"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(628)
  @PropPut
  void setOnDoubleClick(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "OnSheetActivate"
   * </p>
   */

  @DISPID(1031)
  @PropGet
  java.lang.String getOnSheetActivate();


  /**
   * <p>
   * Setter method for the COM property "OnSheetActivate"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1031)
  @PropPut
  void setOnSheetActivate(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "OnSheetDeactivate"
   * </p>
   */

  @DISPID(1081)
  @PropGet
  java.lang.String getOnSheetDeactivate();


  /**
   * <p>
   * Setter method for the COM property "OnSheetDeactivate"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1081)
  @PropPut
  void setOnSheetDeactivate(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "PageSetup"
   * </p>
   */

  @DISPID(998)
  @PropGet
  excel.PageSetup getPageSetup();


  /**
   * <p>
   * Getter method for the COM property "Previous"
   * </p>
   */

  @DISPID(503)
  @PropGet
  com4j.Com4jObject getPrevious();


  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(905)
  void __PrintOut(
    @Optional java.lang.Object from,
    @Optional java.lang.Object to,
    @Optional java.lang.Object copies,
    @Optional java.lang.Object preview,
    @Optional java.lang.Object activePrinter,
    @Optional java.lang.Object printToFile,
    @Optional java.lang.Object collate);


  /**
   * @param enableChanges Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(281)
  void printPreview(
    @Optional java.lang.Object enableChanges);


  /**
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param drawingObjects Optional parameter. Default value is com4j.Variant.getMissing()
   * @param contents Optional parameter. Default value is com4j.Variant.getMissing()
   * @param scenarios Optional parameter. Default value is com4j.Variant.getMissing()
   * @param userInterfaceOnly Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(282)
  void _Protect(
    @Optional java.lang.Object password,
    @Optional java.lang.Object drawingObjects,
    @Optional java.lang.Object contents,
    @Optional java.lang.Object scenarios,
    @Optional java.lang.Object userInterfaceOnly);


  /**
   * <p>
   * Getter method for the COM property "ProtectContents"
   * </p>
   */

  @DISPID(292)
  @PropGet
  boolean getProtectContents();


  /**
   * <p>
   * Getter method for the COM property "ProtectDrawingObjects"
   * </p>
   */

  @DISPID(293)
  @PropGet
  boolean getProtectDrawingObjects();


  /**
   * <p>
   * Getter method for the COM property "ProtectionMode"
   * </p>
   */

  @DISPID(1159)
  @PropGet
  boolean getProtectionMode();


  /**
   * <p>
   * Getter method for the COM property "ProtectScenarios"
   * </p>
   */

  @DISPID(294)
  @PropGet
  boolean getProtectScenarios();


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
   */

  @DISPID(284)
  void _SaveAs(
    java.lang.String filename,
    @Optional java.lang.Object fileFormat,
    @Optional java.lang.Object password,
    @Optional java.lang.Object writeResPassword,
    @Optional java.lang.Object readOnlyRecommended,
    @Optional java.lang.Object createBackup,
    @Optional java.lang.Object addToMru,
    @Optional java.lang.Object textCodepage,
    @Optional java.lang.Object textVisualLayout);


  /**
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(235)
  void select(
    @Optional java.lang.Object replace);


  /**
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(285)
  void unprotect(
    @Optional java.lang.Object password);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   */

  @DISPID(558)
  @PropGet
  excel.XlSheetVisibility getVisible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory excel.XlSheetVisibility parameter.
   */

  @DISPID(558)
  @PropPut
  void setVisible(
    excel.XlSheetVisibility rhs);


  /**
   * <p>
   * Getter method for the COM property "Shapes"
   * </p>
   */

  @DISPID(1377)
  @PropGet
  excel.Shapes getShapes();


  /**
   */

  @DISPID(65565)
  void _Dummy29();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(760)
  com4j.Com4jObject arcs(
    @Optional java.lang.Object index);


  /**
   */

  @DISPID(65567)
  void _Dummy31();


  /**
   */

  @DISPID(65568)
  void _Dummy32();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(557)
  com4j.Com4jObject buttons(
    @Optional java.lang.Object index);


  /**
   */

  @DISPID(65570)
  void _Dummy34();


  /**
   * <p>
   * Getter method for the COM property "EnableCalculation"
   * </p>
   */

  @DISPID(1424)
  @PropGet
  boolean getEnableCalculation();


  /**
   * <p>
   * Setter method for the COM property "EnableCalculation"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1424)
  @PropPut
  void setEnableCalculation(
    boolean rhs);


  /**
   */

  @DISPID(65572)
  void _Dummy36();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1060)
  com4j.Com4jObject chartObjects(
    @Optional java.lang.Object index);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(824)
  com4j.Com4jObject checkBoxes(
    @Optional java.lang.Object index);


  /**
   * @param customDictionary Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreUppercase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param alwaysSuggest Optional parameter. Default value is com4j.Variant.getMissing()
   * @param spellLang Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(505)
  void checkSpelling(
    @Optional java.lang.Object customDictionary,
    @Optional java.lang.Object ignoreUppercase,
    @Optional java.lang.Object alwaysSuggest,
    @Optional java.lang.Object spellLang);


  /**
   */

  @DISPID(65576)
  void _Dummy40();


  /**
   */

  @DISPID(65577)
  void _Dummy41();


  /**
   */

  @DISPID(65578)
  void _Dummy42();


  /**
   */

  @DISPID(65579)
  void _Dummy43();


  /**
   */

  @DISPID(65580)
  void _Dummy44();


  /**
   */

  @DISPID(65581)
  void _Dummy45();


  /**
   * <p>
   * Getter method for the COM property "DisplayAutomaticPageBreaks"
   * </p>
   */

  @DISPID(643)
  @PropGet
  boolean getDisplayAutomaticPageBreaks();


  /**
   * <p>
   * Setter method for the COM property "DisplayAutomaticPageBreaks"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(643)
  @PropPut
  void setDisplayAutomaticPageBreaks(
    boolean rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(772)
  com4j.Com4jObject drawings(
    @Optional java.lang.Object index);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(88)
  com4j.Com4jObject drawingObjects(
    @Optional java.lang.Object index);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(836)
  com4j.Com4jObject dropDowns(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "EnableAutoFilter"
   * </p>
   */

  @DISPID(1156)
  @PropGet
  boolean getEnableAutoFilter();


  /**
   * <p>
   * Setter method for the COM property "EnableAutoFilter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1156)
  @PropPut
  void setEnableAutoFilter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableSelection"
   * </p>
   */

  @DISPID(1425)
  @PropGet
  excel.XlEnableSelection getEnableSelection();


  /**
   * <p>
   * Setter method for the COM property "EnableSelection"
   * </p>
   * @param rhs Mandatory excel.XlEnableSelection parameter.
   */

  @DISPID(1425)
  @PropPut
  void setEnableSelection(
    excel.XlEnableSelection rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableOutlining"
   * </p>
   */

  @DISPID(1157)
  @PropGet
  boolean getEnableOutlining();


  /**
   * <p>
   * Setter method for the COM property "EnableOutlining"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1157)
  @PropPut
  void setEnableOutlining(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnablePivotTable"
   * </p>
   */

  @DISPID(1158)
  @PropGet
  boolean getEnablePivotTable();


  /**
   * <p>
   * Setter method for the COM property "EnablePivotTable"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1158)
  @PropPut
  void setEnablePivotTable(
    boolean rhs);


  /**
   * @param name Mandatory java.lang.Object parameter.
   */

  @DISPID(1)
  java.lang.Object evaluate(
    java.lang.Object name);


  /**
   * @param name Mandatory java.lang.Object parameter.
   */

  @DISPID(-5)
  java.lang.Object _Evaluate(
    java.lang.Object name);


  /**
   */

  @DISPID(65592)
  void _Dummy56();


  /**
   */

  @DISPID(1426)
  void resetAllPageBreaks();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(834)
  com4j.Com4jObject groupBoxes(
    @Optional java.lang.Object index);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1113)
  com4j.Com4jObject groupObjects(
    @Optional java.lang.Object index);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(841)
  com4j.Com4jObject labels(
    @Optional java.lang.Object index);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(767)
  com4j.Com4jObject lines(
    @Optional java.lang.Object index);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(832)
  com4j.Com4jObject listBoxes(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "Names"
   * </p>
   */

  @DISPID(442)
  @PropGet
  excel.Names getNames();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(799)
  com4j.Com4jObject oleObjects(
    @Optional java.lang.Object index);


  /**
   */

  @DISPID(65601)
  void _Dummy65();


  /**
   */

  @DISPID(65602)
  void _Dummy66();


  /**
   */

  @DISPID(65603)
  void _Dummy67();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(826)
  com4j.Com4jObject optionButtons(
    @Optional java.lang.Object index);


  /**
   */

  @DISPID(65605)
  void _Dummy69();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(801)
  com4j.Com4jObject ovals(
    @Optional java.lang.Object index);


  /**
   * @param destination Optional parameter. Default value is com4j.Variant.getMissing()
   * @param link Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(211)
  void paste(
    @Optional java.lang.Object destination,
    @Optional java.lang.Object link);


  /**
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @param link Optional parameter. Default value is com4j.Variant.getMissing()
   * @param displayAsIcon Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconLabel Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1027)
  void _PasteSpecial(
    @Optional java.lang.Object format,
    @Optional java.lang.Object link,
    @Optional java.lang.Object displayAsIcon,
    @Optional java.lang.Object iconFileName,
    @Optional java.lang.Object iconIndex,
    @Optional java.lang.Object iconLabel);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(771)
  com4j.Com4jObject pictures(
    @Optional java.lang.Object index);


  /**
   */

  @DISPID(65610)
  void _Dummy74();


  /**
   */

  @DISPID(65611)
  void _Dummy75();


  /**
   */

  @DISPID(65612)
  void _Dummy76();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(774)
  com4j.Com4jObject rectangles(
    @Optional java.lang.Object index);


  /**
   */

  @DISPID(65614)
  void _Dummy78();


  /**
   */

  @DISPID(65615)
  void _Dummy79();


  /**
   * <p>
   * Getter method for the COM property "ScrollArea"
   * </p>
   */

  @DISPID(1433)
  @PropGet
  java.lang.String getScrollArea();


  /**
   * <p>
   * Setter method for the COM property "ScrollArea"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1433)
  @PropPut
  void setScrollArea(
    java.lang.String rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(830)
  com4j.Com4jObject scrollBars(
    @Optional java.lang.Object index);


  /**
   */

  @DISPID(65618)
  void _Dummy82();


  /**
   */

  @DISPID(65619)
  void _Dummy83();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(838)
  com4j.Com4jObject spinners(
    @Optional java.lang.Object index);


  /**
   */

  @DISPID(65621)
  void _Dummy85();


  /**
   */

  @DISPID(65622)
  void _Dummy86();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(777)
  com4j.Com4jObject textBoxes(
    @Optional java.lang.Object index);


  /**
   */

  @DISPID(65624)
  void _Dummy88();


  /**
   */

  @DISPID(65625)
  void _Dummy89();


  /**
   */

  @DISPID(65626)
  void _Dummy90();


  /**
   * <p>
   * Getter method for the COM property "HPageBreaks"
   * </p>
   */

  @DISPID(1418)
  @PropGet
  excel.HPageBreaks getHPageBreaks();


  /**
   * <p>
   * Getter method for the COM property "VPageBreaks"
   * </p>
   */

  @DISPID(1419)
  @PropGet
  excel.VPageBreaks getVPageBreaks();


  /**
   * <p>
   * Getter method for the COM property "QueryTables"
   * </p>
   */

  @DISPID(1434)
  @PropGet
  excel.QueryTables getQueryTables();


  /**
   * <p>
   * Getter method for the COM property "DisplayPageBreaks"
   * </p>
   */

  @DISPID(1435)
  @PropGet
  boolean getDisplayPageBreaks();


  /**
   * <p>
   * Setter method for the COM property "DisplayPageBreaks"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1435)
  @PropPut
  void setDisplayPageBreaks(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Comments"
   * </p>
   */

  @DISPID(575)
  @PropGet
  excel.Comments getComments();


  /**
   * <p>
   * Getter method for the COM property "Hyperlinks"
   * </p>
   */

  @DISPID(1393)
  @PropGet
  excel.Hyperlinks getHyperlinks();


  /**
   */

  @DISPID(1436)
  void clearCircles();


  /**
   */

  @DISPID(1437)
  void circleInvalid();


  /**
   * <p>
   * Getter method for the COM property "_DisplayRightToLeft"
   * </p>
   */

  @DISPID(648)
  @PropGet
  int get_DisplayRightToLeft();


  /**
   * <p>
   * Setter method for the COM property "_DisplayRightToLeft"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(648)
  @PropPut
  void set_DisplayRightToLeft(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoFilter"
   * </p>
   */

  @DISPID(793)
  @PropGet
  excel.AutoFilter getAutoFilter();


  /**
   * <p>
   * Getter method for the COM property "DisplayRightToLeft"
   * </p>
   */

  @DISPID(1774)
  @PropGet
  boolean getDisplayRightToLeft();


  /**
   * <p>
   * Setter method for the COM property "DisplayRightToLeft"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1774)
  @PropPut
  void setDisplayRightToLeft(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Scripts"
   * </p>
   */

  @DISPID(1816)
  @PropGet
  office.Scripts getScripts();


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

  @DISPID(1772)
  void _PrintOut(
    @Optional java.lang.Object from,
    @Optional java.lang.Object to,
    @Optional java.lang.Object copies,
    @Optional java.lang.Object preview,
    @Optional java.lang.Object activePrinter,
    @Optional java.lang.Object printToFile,
    @Optional java.lang.Object collate,
    @Optional java.lang.Object prToFileName);


  /**
   * @param customDictionary Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreUppercase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param alwaysSuggest Optional parameter. Default value is com4j.Variant.getMissing()
   * @param spellLang Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreFinalYaa Optional parameter. Default value is com4j.Variant.getMissing()
   * @param spellScript Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1817)
  void _CheckSpelling(
    @Optional java.lang.Object customDictionary,
    @Optional java.lang.Object ignoreUppercase,
    @Optional java.lang.Object alwaysSuggest,
    @Optional java.lang.Object spellLang,
    @Optional java.lang.Object ignoreFinalYaa,
    @Optional java.lang.Object spellScript);


  /**
   * <p>
   * Getter method for the COM property "Tab"
   * </p>
   */

  @DISPID(1041)
  @PropGet
  excel.Tab getTab();


  /**
   * <p>
   * Getter method for the COM property "MailEnvelope"
   * </p>
   */

  @DISPID(2021)
  @PropGet
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

  @DISPID(1925)
  void saveAs(
    java.lang.String filename,
    @Optional java.lang.Object fileFormat,
    @Optional java.lang.Object password,
    @Optional java.lang.Object writeResPassword,
    @Optional java.lang.Object readOnlyRecommended,
    @Optional java.lang.Object createBackup,
    @Optional java.lang.Object addToMru,
    @Optional java.lang.Object textCodepage,
    @Optional java.lang.Object textVisualLayout,
    @Optional java.lang.Object local);


  /**
   * <p>
   * Getter method for the COM property "CustomProperties"
   * </p>
   */

  @DISPID(2030)
  @PropGet
  excel.CustomProperties getCustomProperties();


  /**
   * <p>
   * Getter method for the COM property "SmartTags"
   * </p>
   */

  @DISPID(2016)
  @PropGet
  excel.SmartTags getSmartTags();


  /**
   * <p>
   * Getter method for the COM property "Protection"
   * </p>
   */

  @DISPID(176)
  @PropGet
  excel.Protection getProtection();


  /**
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @param link Optional parameter. Default value is com4j.Variant.getMissing()
   * @param displayAsIcon Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconLabel Optional parameter. Default value is com4j.Variant.getMissing()
   * @param noHTMLFormatting Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1928)
  void pasteSpecial(
    @Optional java.lang.Object format,
    @Optional java.lang.Object link,
    @Optional java.lang.Object displayAsIcon,
    @Optional java.lang.Object iconFileName,
    @Optional java.lang.Object iconIndex,
    @Optional java.lang.Object iconLabel,
    @Optional java.lang.Object noHTMLFormatting);


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

  @DISPID(2029)
  void protect(
    @Optional java.lang.Object password,
    @Optional java.lang.Object drawingObjects,
    @Optional java.lang.Object contents,
    @Optional java.lang.Object scenarios,
    @Optional java.lang.Object userInterfaceOnly,
    @Optional java.lang.Object allowFormattingCells,
    @Optional java.lang.Object allowFormattingColumns,
    @Optional java.lang.Object allowFormattingRows,
    @Optional java.lang.Object allowInsertingColumns,
    @Optional java.lang.Object allowInsertingRows,
    @Optional java.lang.Object allowInsertingHyperlinks,
    @Optional java.lang.Object allowDeletingColumns,
    @Optional java.lang.Object allowDeletingRows,
    @Optional java.lang.Object allowSorting,
    @Optional java.lang.Object allowFiltering,
    @Optional java.lang.Object allowUsingPivotTables);


  /**
   */

  @DISPID(65649)
  void _Dummy113();


  /**
   */

  @DISPID(65650)
  void _Dummy114();


  /**
   */

  @DISPID(65651)
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

  @DISPID(2361)
  void printOut(
    @Optional java.lang.Object from,
    @Optional java.lang.Object to,
    @Optional java.lang.Object copies,
    @Optional java.lang.Object preview,
    @Optional java.lang.Object activePrinter,
    @Optional java.lang.Object printToFile,
    @Optional java.lang.Object collate,
    @Optional java.lang.Object prToFileName);


  /**
   * <p>
   * Getter method for the COM property "EnableFormatConditionsCalculation"
   * </p>
   */

  @DISPID(2511)
  @PropGet
  boolean getEnableFormatConditionsCalculation();


  /**
   * <p>
   * Setter method for the COM property "EnableFormatConditionsCalculation"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2511)
  @PropPut
  void setEnableFormatConditionsCalculation(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Sort"
   * </p>
   */

  @DISPID(880)
  @PropGet
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

  @DISPID(2493)
  void exportAsFixedFormat(
    excel.XlFixedFormatType type,
    @Optional java.lang.Object filename,
    @Optional java.lang.Object quality,
    @Optional java.lang.Object includeDocProperties,
    @Optional java.lang.Object ignorePrintAreas,
    @Optional java.lang.Object from,
    @Optional java.lang.Object to,
    @Optional java.lang.Object openAfterPublish,
    @Optional java.lang.Object fixedFormatExtClassPtr);


  /**
   * <p>
   * Getter method for the COM property "PrintedCommentPages"
   * </p>
   */

  @DISPID(2857)
  @PropGet
  int getPrintedCommentPages();


  /**
   * <p>
   * Getter method for the COM property "DefaultButton"
   * </p>
   */

  @DISPID(857)
  @PropGet
  java.lang.Object getDefaultButton();


  /**
   * <p>
   * Setter method for the COM property "DefaultButton"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(857)
  @PropPut
  void setDefaultButton(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "DialogFrame"
   * </p>
   */

  @DISPID(839)
  @PropGet
  excel.DialogFrame getDialogFrame();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(828)
  com4j.Com4jObject editBoxes(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "Focus"
   * </p>
   */

  @DISPID(814)
  @PropGet
  java.lang.Object getFocus();


  /**
   * <p>
   * Setter method for the COM property "Focus"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(814)
  @PropPut
  void setFocus(
    java.lang.Object rhs);


  /**
   * @param cancel Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(813)
  boolean hide(
    @Optional java.lang.Object cancel);


  /**
   */

  @DISPID(496)
  boolean show();


  // Properties:
}
