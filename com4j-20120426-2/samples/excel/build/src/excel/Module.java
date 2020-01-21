package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Module extends Com4jObject {
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
   */

  @DISPID(65554)
  void _Dummy18();


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
   */

  @DISPID(65557)
  void _Dummy21();


  /**
   * <p>
   * Getter method for the COM property "ProtectionMode"
   * </p>
   */

  @DISPID(1159)
  @PropGet
  boolean getProtectionMode();


  /**
   */

  @DISPID(65559)
  void _Dummy23();


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
   * @param filename Mandatory java.lang.Object parameter.
   * @param merge Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(584)
  java.lang.Object insertFile(
    java.lang.Object filename,
    @Optional java.lang.Object merge);


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
    @Optional java.lang.Object textVisualLayout);


  /**
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param drawingObjects Optional parameter. Default value is com4j.Variant.getMissing()
   * @param contents Optional parameter. Default value is com4j.Variant.getMissing()
   * @param scenarios Optional parameter. Default value is com4j.Variant.getMissing()
   * @param userInterfaceOnly Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2029)
  void protect(
    @Optional java.lang.Object password,
    @Optional java.lang.Object drawingObjects,
    @Optional java.lang.Object contents,
    @Optional java.lang.Object scenarios,
    @Optional java.lang.Object userInterfaceOnly);


  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1772)
  void _PrintOut(
    @Optional java.lang.Object from,
    @Optional java.lang.Object to,
    @Optional java.lang.Object copies,
    @Optional java.lang.Object preview,
    @Optional java.lang.Object activePrinter,
    @Optional java.lang.Object printToFile,
    @Optional java.lang.Object collate);


  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2361)
  void printOut(
    @Optional java.lang.Object from,
    @Optional java.lang.Object to,
    @Optional java.lang.Object copies,
    @Optional java.lang.Object preview,
    @Optional java.lang.Object activePrinter,
    @Optional java.lang.Object printToFile,
    @Optional java.lang.Object collate);


  // Properties:
}
