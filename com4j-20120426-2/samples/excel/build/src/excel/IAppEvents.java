package excel  ;

import com4j.*;

@IID("{00024413-0001-0000-C000-000000000046}")
public interface IAppEvents extends Com4jObject {
  // Methods:
  /**
   * @param wb Mandatory excel._Workbook parameter.
   */

  @VTID(7)
  void newWorkbook(
    excel._Workbook wb);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory excel.Range parameter.
   */

  @VTID(8)
  void sheetSelectionChange(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    excel.Range target);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory excel.Range parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(9)
  void sheetBeforeDoubleClick(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    excel.Range target,
    Holder<Boolean> cancel);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory excel.Range parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(10)
  void sheetBeforeRightClick(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    excel.Range target,
    Holder<Boolean> cancel);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @VTID(11)
  void sheetActivate(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @VTID(12)
  void sheetDeactivate(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @VTID(13)
  void sheetCalculate(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory excel.Range parameter.
   */

  @VTID(14)
  void sheetChange(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    excel.Range target);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   */

  @VTID(15)
  void workbookOpen(
    excel._Workbook wb);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   */

  @VTID(16)
  void workbookActivate(
    excel._Workbook wb);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   */

  @VTID(17)
  void workbookDeactivate(
    excel._Workbook wb);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(18)
  void workbookBeforeClose(
    excel._Workbook wb,
    Holder<Boolean> cancel);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param saveAsUI Mandatory boolean parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(19)
  void workbookBeforeSave(
    excel._Workbook wb,
    boolean saveAsUI,
    Holder<Boolean> cancel);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(20)
  void workbookBeforePrint(
    excel._Workbook wb,
    Holder<Boolean> cancel);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @VTID(21)
  void workbookNewSheet(
    excel._Workbook wb,
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   */

  @VTID(22)
  void workbookAddinInstall(
    excel._Workbook wb);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   */

  @VTID(23)
  void workbookAddinUninstall(
    excel._Workbook wb);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param wn Mandatory excel.Window parameter.
   */

  @VTID(24)
  void windowResize(
    excel._Workbook wb,
    excel.Window wn);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param wn Mandatory excel.Window parameter.
   */

  @VTID(25)
  void windowActivate(
    excel._Workbook wb,
    excel.Window wn);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param wn Mandatory excel.Window parameter.
   */

  @VTID(26)
  void windowDeactivate(
    excel._Workbook wb,
    excel.Window wn);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory excel.Hyperlink parameter.
   */

  @VTID(27)
  void sheetFollowHyperlink(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    excel.Hyperlink target);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory excel.PivotTable parameter.
   */

  @VTID(28)
  void sheetPivotTableUpdate(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    excel.PivotTable target);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param target Mandatory excel.PivotTable parameter.
   */

  @VTID(29)
  void workbookPivotTableCloseConnection(
    excel._Workbook wb,
    excel.PivotTable target);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param target Mandatory excel.PivotTable parameter.
   */

  @VTID(30)
  void workbookPivotTableOpenConnection(
    excel._Workbook wb,
    excel.PivotTable target);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param syncEventType Mandatory office.MsoSyncEventType parameter.
   */

  @VTID(31)
  void workbookSync(
    excel._Workbook wb,
    office.MsoSyncEventType syncEventType);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param map Mandatory excel.XmlMap parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param isRefresh Mandatory boolean parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(32)
  void workbookBeforeXmlImport(
    excel._Workbook wb,
    excel.XmlMap map,
    java.lang.String url,
    boolean isRefresh,
    Holder<Boolean> cancel);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param map Mandatory excel.XmlMap parameter.
   * @param isRefresh Mandatory boolean parameter.
   * @param result Mandatory excel.XlXmlImportResult parameter.
   */

  @VTID(33)
  void workbookAfterXmlImport(
    excel._Workbook wb,
    excel.XmlMap map,
    boolean isRefresh,
    excel.XlXmlImportResult result);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param map Mandatory excel.XmlMap parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(34)
  void workbookBeforeXmlExport(
    excel._Workbook wb,
    excel.XmlMap map,
    java.lang.String url,
    Holder<Boolean> cancel);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param map Mandatory excel.XmlMap parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param result Mandatory excel.XlXmlExportResult parameter.
   */

  @VTID(35)
  void workbookAfterXmlExport(
    excel._Workbook wb,
    excel.XmlMap map,
    java.lang.String url,
    excel.XlXmlExportResult result);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param description Mandatory java.lang.String parameter.
   * @param sheet Mandatory java.lang.String parameter.
   * @param success Mandatory boolean parameter.
   */

  @VTID(36)
  void workbookRowsetComplete(
    excel._Workbook wb,
    java.lang.String description,
    java.lang.String sheet,
    boolean success);


  /**
   */

  @VTID(37)
  void afterCalculate();


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param targetPivotTable Mandatory excel.PivotTable parameter.
   * @param targetRange Mandatory excel.Range parameter.
   */

  @VTID(38)
  void sheetPivotTableAfterValueChange(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    excel.PivotTable targetPivotTable,
    excel.Range targetRange);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param targetPivotTable Mandatory excel.PivotTable parameter.
   * @param valueChangeStart Mandatory int parameter.
   * @param valueChangeEnd Mandatory int parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(39)
  void sheetPivotTableBeforeAllocateChanges(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    excel.PivotTable targetPivotTable,
    int valueChangeStart,
    int valueChangeEnd,
    Holder<Boolean> cancel);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param targetPivotTable Mandatory excel.PivotTable parameter.
   * @param valueChangeStart Mandatory int parameter.
   * @param valueChangeEnd Mandatory int parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(40)
  void sheetPivotTableBeforeCommitChanges(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    excel.PivotTable targetPivotTable,
    int valueChangeStart,
    int valueChangeEnd,
    Holder<Boolean> cancel);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param targetPivotTable Mandatory excel.PivotTable parameter.
   * @param valueChangeStart Mandatory int parameter.
   * @param valueChangeEnd Mandatory int parameter.
   */

  @VTID(41)
  void sheetPivotTableBeforeDiscardChanges(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    excel.PivotTable targetPivotTable,
    int valueChangeStart,
    int valueChangeEnd);


  /**
   * @param pvw Mandatory excel.ProtectedViewWindow parameter.
   */

  @VTID(42)
  void protectedViewWindowOpen(
    excel.ProtectedViewWindow pvw);


  /**
   * @param pvw Mandatory excel.ProtectedViewWindow parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(43)
  void protectedViewWindowBeforeEdit(
    excel.ProtectedViewWindow pvw,
    Holder<Boolean> cancel);


  /**
   * @param pvw Mandatory excel.ProtectedViewWindow parameter.
   * @param reason Mandatory excel.XlProtectedViewCloseReason parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(44)
  void protectedViewWindowBeforeClose(
    excel.ProtectedViewWindow pvw,
    excel.XlProtectedViewCloseReason reason,
    Holder<Boolean> cancel);


  /**
   * @param pvw Mandatory excel.ProtectedViewWindow parameter.
   */

  @VTID(45)
  void protectedViewWindowResize(
    excel.ProtectedViewWindow pvw);


  /**
   * @param pvw Mandatory excel.ProtectedViewWindow parameter.
   */

  @VTID(46)
  void protectedViewWindowActivate(
    excel.ProtectedViewWindow pvw);


  /**
   * @param pvw Mandatory excel.ProtectedViewWindow parameter.
   */

  @VTID(47)
  void protectedViewWindowDeactivate(
    excel.ProtectedViewWindow pvw);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param success Mandatory boolean parameter.
   */

  @VTID(48)
  void workbookAfterSave(
    excel._Workbook wb,
    boolean success);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param ch Mandatory excel._Chart parameter.
   */

  @VTID(49)
  void workbookNewChart(
    excel._Workbook wb,
    excel._Chart ch);


  // Properties:
}
