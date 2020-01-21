package excel.events;

import com4j.*;

@IID("{00024413-0000-0000-C000-000000000046}")
public abstract class AppEvents {
  // Methods:
  /**
   * @param wb Mandatory excel._Workbook parameter.
   */

  @DISPID(1565)
  public void newWorkbook(
    excel._Workbook wb) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory excel.Range parameter.
   */

  @DISPID(1558)
  public void sheetSelectionChange(
    com4j.Com4jObject sh,
    excel.Range target) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory excel.Range parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1559)
  public void sheetBeforeDoubleClick(
    com4j.Com4jObject sh,
    excel.Range target,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory excel.Range parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1560)
  public void sheetBeforeRightClick(
    com4j.Com4jObject sh,
    excel.Range target,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1561)
  public void sheetActivate(
    com4j.Com4jObject sh) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1562)
  public void sheetDeactivate(
    com4j.Com4jObject sh) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1563)
  public void sheetCalculate(
    com4j.Com4jObject sh) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory excel.Range parameter.
   */

  @DISPID(1564)
  public void sheetChange(
    com4j.Com4jObject sh,
    excel.Range target) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory excel._Workbook parameter.
   */

  @DISPID(1567)
  public void workbookOpen(
    excel._Workbook wb) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory excel._Workbook parameter.
   */

  @DISPID(1568)
  public void workbookActivate(
    excel._Workbook wb) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory excel._Workbook parameter.
   */

  @DISPID(1569)
  public void workbookDeactivate(
    excel._Workbook wb) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1570)
  public void workbookBeforeClose(
    excel._Workbook wb,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param saveAsUI Mandatory boolean parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1571)
  public void workbookBeforeSave(
    excel._Workbook wb,
    boolean saveAsUI,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1572)
  public void workbookBeforePrint(
    excel._Workbook wb,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1573)
  public void workbookNewSheet(
    excel._Workbook wb,
    com4j.Com4jObject sh) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory excel._Workbook parameter.
   */

  @DISPID(1574)
  public void workbookAddinInstall(
    excel._Workbook wb) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory excel._Workbook parameter.
   */

  @DISPID(1575)
  public void workbookAddinUninstall(
    excel._Workbook wb) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param wn Mandatory excel.Window parameter.
   */

  @DISPID(1554)
  public void windowResize(
    excel._Workbook wb,
    excel.Window wn) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param wn Mandatory excel.Window parameter.
   */

  @DISPID(1556)
  public void windowActivate(
    excel._Workbook wb,
    excel.Window wn) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param wn Mandatory excel.Window parameter.
   */

  @DISPID(1557)
  public void windowDeactivate(
    excel._Workbook wb,
    excel.Window wn) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory excel.Hyperlink parameter.
   */

  @DISPID(1854)
  public void sheetFollowHyperlink(
    com4j.Com4jObject sh,
    excel.Hyperlink target) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory excel.PivotTable parameter.
   */

  @DISPID(2157)
  public void sheetPivotTableUpdate(
    com4j.Com4jObject sh,
    excel.PivotTable target) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param target Mandatory excel.PivotTable parameter.
   */

  @DISPID(2160)
  public void workbookPivotTableCloseConnection(
    excel._Workbook wb,
    excel.PivotTable target) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param target Mandatory excel.PivotTable parameter.
   */

  @DISPID(2161)
  public void workbookPivotTableOpenConnection(
    excel._Workbook wb,
    excel.PivotTable target) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param syncEventType Mandatory office.MsoSyncEventType parameter.
   */

  @DISPID(2289)
  public void workbookSync(
    excel._Workbook wb,
    office.MsoSyncEventType syncEventType) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param map Mandatory excel.XmlMap parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param isRefresh Mandatory boolean parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(2290)
  public void workbookBeforeXmlImport(
    excel._Workbook wb,
    excel.XmlMap map,
    java.lang.String url,
    boolean isRefresh,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param map Mandatory excel.XmlMap parameter.
   * @param isRefresh Mandatory boolean parameter.
   * @param result Mandatory excel.XlXmlImportResult parameter.
   */

  @DISPID(2291)
  public void workbookAfterXmlImport(
    excel._Workbook wb,
    excel.XmlMap map,
    boolean isRefresh,
    excel.XlXmlImportResult result) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param map Mandatory excel.XmlMap parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(2292)
  public void workbookBeforeXmlExport(
    excel._Workbook wb,
    excel.XmlMap map,
    java.lang.String url,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param map Mandatory excel.XmlMap parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param result Mandatory excel.XlXmlExportResult parameter.
   */

  @DISPID(2293)
  public void workbookAfterXmlExport(
    excel._Workbook wb,
    excel.XmlMap map,
    java.lang.String url,
    excel.XlXmlExportResult result) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param description Mandatory java.lang.String parameter.
   * @param sheet Mandatory java.lang.String parameter.
   * @param success Mandatory boolean parameter.
   */

  @DISPID(2611)
  public void workbookRowsetComplete(
    excel._Workbook wb,
    java.lang.String description,
    java.lang.String sheet,
    boolean success) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(2612)
  public void afterCalculate() {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param targetPivotTable Mandatory excel.PivotTable parameter.
   * @param targetRange Mandatory excel.Range parameter.
   */

  @DISPID(2895)
  public void sheetPivotTableAfterValueChange(
    com4j.Com4jObject sh,
    excel.PivotTable targetPivotTable,
    excel.Range targetRange) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param targetPivotTable Mandatory excel.PivotTable parameter.
   * @param valueChangeStart Mandatory int parameter.
   * @param valueChangeEnd Mandatory int parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(2896)
  public void sheetPivotTableBeforeAllocateChanges(
    com4j.Com4jObject sh,
    excel.PivotTable targetPivotTable,
    int valueChangeStart,
    int valueChangeEnd,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param targetPivotTable Mandatory excel.PivotTable parameter.
   * @param valueChangeStart Mandatory int parameter.
   * @param valueChangeEnd Mandatory int parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(2897)
  public void sheetPivotTableBeforeCommitChanges(
    com4j.Com4jObject sh,
    excel.PivotTable targetPivotTable,
    int valueChangeStart,
    int valueChangeEnd,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param targetPivotTable Mandatory excel.PivotTable parameter.
   * @param valueChangeStart Mandatory int parameter.
   * @param valueChangeEnd Mandatory int parameter.
   */

  @DISPID(2898)
  public void sheetPivotTableBeforeDiscardChanges(
    com4j.Com4jObject sh,
    excel.PivotTable targetPivotTable,
    int valueChangeStart,
    int valueChangeEnd) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param pvw Mandatory excel.ProtectedViewWindow parameter.
   */

  @DISPID(2903)
  public void protectedViewWindowOpen(
    excel.ProtectedViewWindow pvw) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param pvw Mandatory excel.ProtectedViewWindow parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(2905)
  public void protectedViewWindowBeforeEdit(
    excel.ProtectedViewWindow pvw,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param pvw Mandatory excel.ProtectedViewWindow parameter.
   * @param reason Mandatory excel.XlProtectedViewCloseReason parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(2906)
  public void protectedViewWindowBeforeClose(
    excel.ProtectedViewWindow pvw,
    excel.XlProtectedViewCloseReason reason,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param pvw Mandatory excel.ProtectedViewWindow parameter.
   */

  @DISPID(2908)
  public void protectedViewWindowResize(
    excel.ProtectedViewWindow pvw) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param pvw Mandatory excel.ProtectedViewWindow parameter.
   */

  @DISPID(2909)
  public void protectedViewWindowActivate(
    excel.ProtectedViewWindow pvw) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param pvw Mandatory excel.ProtectedViewWindow parameter.
   */

  @DISPID(2910)
  public void protectedViewWindowDeactivate(
    excel.ProtectedViewWindow pvw) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param success Mandatory boolean parameter.
   */

  @DISPID(2911)
  public void workbookAfterSave(
    excel._Workbook wb,
    boolean success) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param ch Mandatory excel._Chart parameter.
   */

  @DISPID(2912)
  public void workbookNewChart(
    excel._Workbook wb,
    excel._Chart ch) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
