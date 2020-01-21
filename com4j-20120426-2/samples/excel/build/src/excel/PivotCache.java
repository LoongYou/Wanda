package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface PivotCache extends Com4jObject {
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
   * <p>
   * Getter method for the COM property "BackgroundQuery"
   * </p>
   */

  @DISPID(1427)
  @PropGet
  boolean getBackgroundQuery();


  /**
   * <p>
   * Setter method for the COM property "BackgroundQuery"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1427)
  @PropPut
  void setBackgroundQuery(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Connection"
   * </p>
   */

  @DISPID(1432)
  @PropGet
  java.lang.Object getConnection();


  /**
   * <p>
   * Setter method for the COM property "Connection"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1432)
  @PropPut
  void setConnection(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableRefresh"
   * </p>
   */

  @DISPID(1477)
  @PropGet
  boolean getEnableRefresh();


  /**
   * <p>
   * Setter method for the COM property "EnableRefresh"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1477)
  @PropPut
  void setEnableRefresh(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   */

  @DISPID(486)
  @PropGet
  int getIndex();


  /**
   * <p>
   * Getter method for the COM property "MemoryUsed"
   * </p>
   */

  @DISPID(372)
  @PropGet
  int getMemoryUsed();


  /**
   * <p>
   * Getter method for the COM property "OptimizeCache"
   * </p>
   */

  @DISPID(1428)
  @PropGet
  boolean getOptimizeCache();


  /**
   * <p>
   * Setter method for the COM property "OptimizeCache"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1428)
  @PropPut
  void setOptimizeCache(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RecordCount"
   * </p>
   */

  @DISPID(1478)
  @PropGet
  int getRecordCount();


  /**
   */

  @DISPID(1417)
  void refresh();


  /**
   * <p>
   * Getter method for the COM property "RefreshDate"
   * </p>
   */

  @DISPID(696)
  @PropGet
  java.util.Date getRefreshDate();


  /**
   * <p>
   * Getter method for the COM property "RefreshName"
   * </p>
   */

  @DISPID(697)
  @PropGet
  java.lang.String getRefreshName();


  /**
   * <p>
   * Getter method for the COM property "RefreshOnFileOpen"
   * </p>
   */

  @DISPID(1479)
  @PropGet
  boolean getRefreshOnFileOpen();


  /**
   * <p>
   * Setter method for the COM property "RefreshOnFileOpen"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1479)
  @PropPut
  void setRefreshOnFileOpen(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Sql"
   * </p>
   */

  @DISPID(1480)
  @PropGet
  java.lang.Object getSql();


  /**
   * <p>
   * Setter method for the COM property "Sql"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1480)
  @PropPut
  void setSql(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "SavePassword"
   * </p>
   */

  @DISPID(1481)
  @PropGet
  boolean getSavePassword();


  /**
   * <p>
   * Setter method for the COM property "SavePassword"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1481)
  @PropPut
  void setSavePassword(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceData"
   * </p>
   */

  @DISPID(686)
  @PropGet
  java.lang.Object getSourceData();


  /**
   * <p>
   * Setter method for the COM property "SourceData"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(686)
  @PropPut
  void setSourceData(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "CommandText"
   * </p>
   */

  @DISPID(1829)
  @PropGet
  java.lang.Object getCommandText();


  /**
   * <p>
   * Setter method for the COM property "CommandText"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1829)
  @PropPut
  void setCommandText(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "CommandType"
   * </p>
   */

  @DISPID(1830)
  @PropGet
  excel.XlCmdType getCommandType();


  /**
   * <p>
   * Setter method for the COM property "CommandType"
   * </p>
   * @param rhs Mandatory excel.XlCmdType parameter.
   */

  @DISPID(1830)
  @PropPut
  void setCommandType(
    excel.XlCmdType rhs);


  /**
   * <p>
   * Getter method for the COM property "QueryType"
   * </p>
   */

  @DISPID(1831)
  @PropGet
  excel.XlQueryType getQueryType();


  /**
   * <p>
   * Getter method for the COM property "MaintainConnection"
   * </p>
   */

  @DISPID(1832)
  @PropGet
  boolean getMaintainConnection();


  /**
   * <p>
   * Setter method for the COM property "MaintainConnection"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1832)
  @PropPut
  void setMaintainConnection(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RefreshPeriod"
   * </p>
   */

  @DISPID(1833)
  @PropGet
  int getRefreshPeriod();


  /**
   * <p>
   * Setter method for the COM property "RefreshPeriod"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1833)
  @PropPut
  void setRefreshPeriod(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Recordset"
   * </p>
   */

  @DISPID(1165)
  @PropGet
  com4j.Com4jObject getRecordset();


  /**
   * <p>
   * Setter method for the COM property "Recordset"
   * </p>
   * @param rhs Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1165)
  @PropPut
  void setRecordset(
    com4j.Com4jObject rhs);


  /**
   */

  @DISPID(1834)
  void resetTimer();


  /**
   * <p>
   * Getter method for the COM property "LocalConnection"
   * </p>
   */

  @DISPID(1835)
  @PropGet
  java.lang.Object getLocalConnection();


  /**
   * <p>
   * Setter method for the COM property "LocalConnection"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1835)
  @PropPut
  void setLocalConnection(
    java.lang.Object rhs);


  /**
   * @param tableDestination Mandatory java.lang.Object parameter.
   * @param tableName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readData Optional parameter. Default value is com4j.Variant.getMissing()
   * @param defaultVersion Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1836)
  excel.PivotTable createPivotTable(
    java.lang.Object tableDestination,
    @Optional java.lang.Object tableName,
    @Optional java.lang.Object readData,
    @Optional java.lang.Object defaultVersion);


  /**
   * <p>
   * Getter method for the COM property "UseLocalConnection"
   * </p>
   */

  @DISPID(1837)
  @PropGet
  boolean getUseLocalConnection();


  /**
   * <p>
   * Setter method for the COM property "UseLocalConnection"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1837)
  @PropPut
  void setUseLocalConnection(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ADOConnection"
   * </p>
   */

  @DISPID(2074)
  @PropGet
  com4j.Com4jObject getADOConnection();


  /**
   * <p>
   * Getter method for the COM property "IsConnected"
   * </p>
   */

  @DISPID(2075)
  @PropGet
  boolean getIsConnected();


  /**
   */

  @DISPID(2076)
  void makeConnection();


  /**
   * <p>
   * Getter method for the COM property "OLAP"
   * </p>
   */

  @DISPID(2077)
  @PropGet
  boolean getOLAP();


  /**
   * <p>
   * Getter method for the COM property "SourceType"
   * </p>
   */

  @DISPID(685)
  @PropGet
  excel.XlPivotTableSourceType getSourceType();


  /**
   * <p>
   * Getter method for the COM property "MissingItemsLimit"
   * </p>
   */

  @DISPID(2078)
  @PropGet
  excel.XlPivotTableMissingItems getMissingItemsLimit();


  /**
   * <p>
   * Setter method for the COM property "MissingItemsLimit"
   * </p>
   * @param rhs Mandatory excel.XlPivotTableMissingItems parameter.
   */

  @DISPID(2078)
  @PropPut
  void setMissingItemsLimit(
    excel.XlPivotTableMissingItems rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceConnectionFile"
   * </p>
   */

  @DISPID(2079)
  @PropGet
  java.lang.String getSourceConnectionFile();


  /**
   * <p>
   * Setter method for the COM property "SourceConnectionFile"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2079)
  @PropPut
  void setSourceConnectionFile(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceDataFile"
   * </p>
   */

  @DISPID(2080)
  @PropGet
  java.lang.String getSourceDataFile();


  /**
   * <p>
   * Getter method for the COM property "RobustConnect"
   * </p>
   */

  @DISPID(2081)
  @PropGet
  excel.XlRobustConnect getRobustConnect();


  /**
   * <p>
   * Setter method for the COM property "RobustConnect"
   * </p>
   * @param rhs Mandatory excel.XlRobustConnect parameter.
   */

  @DISPID(2081)
  @PropPut
  void setRobustConnect(
    excel.XlRobustConnect rhs);


  /**
   * @param odcFileName Mandatory java.lang.String parameter.
   * @param description Optional parameter. Default value is com4j.Variant.getMissing()
   * @param keywords Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2082)
  void saveAsODC(
    java.lang.String odcFileName,
    @Optional java.lang.Object description,
    @Optional java.lang.Object keywords);


  /**
   * <p>
   * Getter method for the COM property "WorkbookConnection"
   * </p>
   */

  @DISPID(2544)
  @PropGet
  excel.WorkbookConnection getWorkbookConnection();


  /**
   * <p>
   * Getter method for the COM property "Version"
   * </p>
   */

  @DISPID(392)
  @PropGet
  excel.XlPivotTableVersionList getVersion();


  /**
   * <p>
   * Getter method for the COM property "UpgradeOnRefresh"
   * </p>
   */

  @DISPID(2545)
  @PropGet
  boolean getUpgradeOnRefresh();


  /**
   * <p>
   * Setter method for the COM property "UpgradeOnRefresh"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2545)
  @PropPut
  void setUpgradeOnRefresh(
    boolean rhs);


  // Properties:
}
