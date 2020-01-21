package excel  ;

import com4j.*;

@IID("{00024412-0001-0000-C000-000000000046}")
public interface IWorkbookEvents extends Com4jObject {
  // Methods:
  /**
   */

  @VTID(7)
  void open();


  /**
   */

  @VTID(8)
  void activate();


  /**
   */

  @VTID(9)
  void deactivate();


  /**
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(10)
  void beforeClose(
    Holder<Boolean> cancel);


  /**
   * @param saveAsUI Mandatory boolean parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(11)
  void beforeSave(
    boolean saveAsUI,
    Holder<Boolean> cancel);


  /**
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(12)
  void beforePrint(
    Holder<Boolean> cancel);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @VTID(13)
  void newSheet(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh);


  /**
   */

  @VTID(14)
  void addinInstall();


  /**
   */

  @VTID(15)
  void addinUninstall();


  /**
   * @param wn Mandatory excel.Window parameter.
   */

  @VTID(16)
  void windowResize(
    excel.Window wn);


  /**
   * @param wn Mandatory excel.Window parameter.
   */

  @VTID(17)
  void windowActivate(
    excel.Window wn);


  /**
   * @param wn Mandatory excel.Window parameter.
   */

  @VTID(18)
  void windowDeactivate(
    excel.Window wn);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory excel.Range parameter.
   */

  @VTID(19)
  void sheetSelectionChange(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    excel.Range target);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory excel.Range parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(20)
  void sheetBeforeDoubleClick(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    excel.Range target,
    Holder<Boolean> cancel);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory excel.Range parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(21)
  void sheetBeforeRightClick(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    excel.Range target,
    Holder<Boolean> cancel);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @VTID(22)
  void sheetActivate(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @VTID(23)
  void sheetDeactivate(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @VTID(24)
  void sheetCalculate(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory excel.Range parameter.
   */

  @VTID(25)
  void sheetChange(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    excel.Range target);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory excel.Hyperlink parameter.
   */

  @VTID(26)
  void sheetFollowHyperlink(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    excel.Hyperlink target);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory excel.PivotTable parameter.
   */

  @VTID(27)
  void sheetPivotTableUpdate(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    excel.PivotTable target);


  /**
   * @param target Mandatory excel.PivotTable parameter.
   */

  @VTID(28)
  void pivotTableCloseConnection(
    excel.PivotTable target);


  /**
   * @param target Mandatory excel.PivotTable parameter.
   */

  @VTID(29)
  void pivotTableOpenConnection(
    excel.PivotTable target);


  /**
   * @param syncEventType Mandatory office.MsoSyncEventType parameter.
   */

  @VTID(30)
  void sync(
    office.MsoSyncEventType syncEventType);


  /**
   * @param map Mandatory excel.XmlMap parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param isRefresh Mandatory boolean parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(31)
  void beforeXmlImport(
    excel.XmlMap map,
    java.lang.String url,
    boolean isRefresh,
    Holder<Boolean> cancel);


  /**
   * @param map Mandatory excel.XmlMap parameter.
   * @param isRefresh Mandatory boolean parameter.
   * @param result Mandatory excel.XlXmlImportResult parameter.
   */

  @VTID(32)
  void afterXmlImport(
    excel.XmlMap map,
    boolean isRefresh,
    excel.XlXmlImportResult result);


  /**
   * @param map Mandatory excel.XmlMap parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(33)
  void beforeXmlExport(
    excel.XmlMap map,
    java.lang.String url,
    Holder<Boolean> cancel);


  /**
   * @param map Mandatory excel.XmlMap parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param result Mandatory excel.XlXmlExportResult parameter.
   */

  @VTID(34)
  void afterXmlExport(
    excel.XmlMap map,
    java.lang.String url,
    excel.XlXmlExportResult result);


  /**
   * @param description Mandatory java.lang.String parameter.
   * @param sheet Mandatory java.lang.String parameter.
   * @param success Mandatory boolean parameter.
   */

  @VTID(35)
  void rowsetComplete(
    java.lang.String description,
    java.lang.String sheet,
    boolean success);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param targetPivotTable Mandatory excel.PivotTable parameter.
   * @param targetRange Mandatory excel.Range parameter.
   */

  @VTID(36)
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

  @VTID(37)
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

  @VTID(38)
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

  @VTID(39)
  void sheetPivotTableBeforeDiscardChanges(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    excel.PivotTable targetPivotTable,
    int valueChangeStart,
    int valueChangeEnd);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory excel.PivotTable parameter.
   */

  @VTID(40)
  void sheetPivotTableChangeSync(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    excel.PivotTable target);


  /**
   * @param success Mandatory boolean parameter.
   */

  @VTID(41)
  void afterSave(
    boolean success);


  /**
   * @param ch Mandatory excel._Chart parameter.
   */

  @VTID(42)
  void newChart(
    excel._Chart ch);


  // Properties:
}
