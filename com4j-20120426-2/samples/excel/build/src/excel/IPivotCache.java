package excel  ;

import com4j.*;

@IID("{0002441C-0001-0000-C000-000000000046}")
public interface IPivotCache extends Com4jObject {
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
   * <p>
   * Getter method for the COM property "BackgroundQuery"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(10)
  boolean getBackgroundQuery();


  /**
   * <p>
   * Setter method for the COM property "BackgroundQuery"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(11)
  void setBackgroundQuery(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Connection"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getConnection();


  /**
   * <p>
   * Setter method for the COM property "Connection"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(13)
  void setConnection(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableRefresh"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(14)
  boolean getEnableRefresh();


  /**
   * <p>
   * Setter method for the COM property "EnableRefresh"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(15)
  void setEnableRefresh(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(16)
  int getIndex();


  /**
   * <p>
   * Getter method for the COM property "MemoryUsed"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(17)
  int getMemoryUsed();


  /**
   * <p>
   * Getter method for the COM property "OptimizeCache"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(18)
  boolean getOptimizeCache();


  /**
   * <p>
   * Setter method for the COM property "OptimizeCache"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(19)
  void setOptimizeCache(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RecordCount"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(20)
  int getRecordCount();


  /**
   */

  @VTID(21)
  void refresh();


  /**
   * <p>
   * Getter method for the COM property "RefreshDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @VTID(22)
  java.util.Date getRefreshDate();


  /**
   * <p>
   * Getter method for the COM property "RefreshName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(23)
  java.lang.String getRefreshName();


  /**
   * <p>
   * Getter method for the COM property "RefreshOnFileOpen"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(24)
  boolean getRefreshOnFileOpen();


  /**
   * <p>
   * Setter method for the COM property "RefreshOnFileOpen"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(25)
  void setRefreshOnFileOpen(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Sql"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(26)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getSql();


  /**
   * <p>
   * Setter method for the COM property "Sql"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(27)
  void setSql(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "SavePassword"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(28)
  boolean getSavePassword();


  /**
   * <p>
   * Setter method for the COM property "SavePassword"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(29)
  void setSavePassword(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceData"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(30)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getSourceData();


  /**
   * <p>
   * Setter method for the COM property "SourceData"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(31)
  void setSourceData(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "CommandText"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(32)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getCommandText();


  /**
   * <p>
   * Setter method for the COM property "CommandText"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(33)
  void setCommandText(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "CommandType"
   * </p>
   * @return  Returns a value of type excel.XlCmdType
   */

  @VTID(34)
  excel.XlCmdType getCommandType();


  /**
   * <p>
   * Setter method for the COM property "CommandType"
   * </p>
   * @param rhs Mandatory excel.XlCmdType parameter.
   */

  @VTID(35)
  void setCommandType(
    excel.XlCmdType rhs);


  /**
   * <p>
   * Getter method for the COM property "QueryType"
   * </p>
   * @return  Returns a value of type excel.XlQueryType
   */

  @VTID(36)
  excel.XlQueryType getQueryType();


  /**
   * <p>
   * Getter method for the COM property "MaintainConnection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(37)
  boolean getMaintainConnection();


  /**
   * <p>
   * Setter method for the COM property "MaintainConnection"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(38)
  void setMaintainConnection(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RefreshPeriod"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(39)
  int getRefreshPeriod();


  /**
   * <p>
   * Setter method for the COM property "RefreshPeriod"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(40)
  void setRefreshPeriod(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Recordset"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(41)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getRecordset();


  /**
   * <p>
   * Setter method for the COM property "Recordset"
   * </p>
   * @param rhs Mandatory com4j.Com4jObject parameter.
   */

  @VTID(42)
  void setRecordset(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject rhs);


  /**
   */

  @VTID(43)
  void resetTimer();


  /**
   * <p>
   * Getter method for the COM property "LocalConnection"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(44)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getLocalConnection();


  /**
   * <p>
   * Setter method for the COM property "LocalConnection"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(45)
  void setLocalConnection(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @param tableDestination Mandatory java.lang.Object parameter.
   * @param tableName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readData Optional parameter. Default value is com4j.Variant.getMissing()
   * @param defaultVersion Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.PivotTable
   */

  @VTID(46)
  excel.PivotTable createPivotTable(
    @MarshalAs(NativeType.VARIANT) java.lang.Object tableDestination,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object tableName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object readData,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object defaultVersion);


  /**
   * <p>
   * Getter method for the COM property "UseLocalConnection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(47)
  boolean getUseLocalConnection();


  /**
   * <p>
   * Setter method for the COM property "UseLocalConnection"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(48)
  void setUseLocalConnection(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ADOConnection"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(49)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getADOConnection();


  /**
   * <p>
   * Getter method for the COM property "IsConnected"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(50)
  boolean getIsConnected();


  /**
   */

  @VTID(51)
  void makeConnection();


  /**
   * <p>
   * Getter method for the COM property "OLAP"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(52)
  boolean getOLAP();


  /**
   * <p>
   * Getter method for the COM property "SourceType"
   * </p>
   * @return  Returns a value of type excel.XlPivotTableSourceType
   */

  @VTID(53)
  excel.XlPivotTableSourceType getSourceType();


  /**
   * <p>
   * Getter method for the COM property "MissingItemsLimit"
   * </p>
   * @return  Returns a value of type excel.XlPivotTableMissingItems
   */

  @VTID(54)
  excel.XlPivotTableMissingItems getMissingItemsLimit();


  /**
   * <p>
   * Setter method for the COM property "MissingItemsLimit"
   * </p>
   * @param rhs Mandatory excel.XlPivotTableMissingItems parameter.
   */

  @VTID(55)
  void setMissingItemsLimit(
    excel.XlPivotTableMissingItems rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceConnectionFile"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(56)
  java.lang.String getSourceConnectionFile();


  /**
   * <p>
   * Setter method for the COM property "SourceConnectionFile"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(57)
  void setSourceConnectionFile(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceDataFile"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(58)
  java.lang.String getSourceDataFile();


  /**
   * <p>
   * Getter method for the COM property "RobustConnect"
   * </p>
   * @return  Returns a value of type excel.XlRobustConnect
   */

  @VTID(59)
  excel.XlRobustConnect getRobustConnect();


  /**
   * <p>
   * Setter method for the COM property "RobustConnect"
   * </p>
   * @param rhs Mandatory excel.XlRobustConnect parameter.
   */

  @VTID(60)
  void setRobustConnect(
    excel.XlRobustConnect rhs);


  /**
   * @param odcFileName Mandatory java.lang.String parameter.
   * @param description Optional parameter. Default value is com4j.Variant.getMissing()
   * @param keywords Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(61)
  void saveAsODC(
    java.lang.String odcFileName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object description,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object keywords);


  /**
   * <p>
   * Getter method for the COM property "WorkbookConnection"
   * </p>
   * @return  Returns a value of type excel.WorkbookConnection
   */

  @VTID(62)
  excel.WorkbookConnection getWorkbookConnection();


  /**
   * <p>
   * Getter method for the COM property "Version"
   * </p>
   * @return  Returns a value of type excel.XlPivotTableVersionList
   */

  @VTID(63)
  excel.XlPivotTableVersionList getVersion();


  /**
   * <p>
   * Getter method for the COM property "UpgradeOnRefresh"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(64)
  boolean getUpgradeOnRefresh();


  /**
   * <p>
   * Setter method for the COM property "UpgradeOnRefresh"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(65)
  void setUpgradeOnRefresh(
    boolean rhs);


  // Properties:
}
