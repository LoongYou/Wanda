package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface OLEDBConnection extends Com4jObject {
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
   * Getter method for the COM property "ADOConnection"
   * </p>
   */

  @DISPID(2074)
  @PropGet
  com4j.Com4jObject getADOConnection();


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
   */

  @DISPID(1589)
  void cancelRefresh();


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
   */

  @DISPID(2076)
  void makeConnection();


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
   * Getter method for the COM property "Refreshing"
   * </p>
   */

  @DISPID(1587)
  @PropGet
  boolean getRefreshing();


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
   * Setter method for the COM property "SourceDataFile"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2080)
  @PropPut
  void setSourceDataFile(
    java.lang.String rhs);


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
   * Getter method for the COM property "MaxDrillthroughRecords"
   * </p>
   */

  @DISPID(2703)
  @PropGet
  int getMaxDrillthroughRecords();


  /**
   * <p>
   * Setter method for the COM property "MaxDrillthroughRecords"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2703)
  @PropPut
  void setMaxDrillthroughRecords(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "IsConnected"
   * </p>
   */

  @DISPID(2075)
  @PropGet
  boolean getIsConnected();


  /**
   * <p>
   * Getter method for the COM property "ServerCredentialsMethod"
   * </p>
   */

  @DISPID(2704)
  @PropGet
  excel.XlCredentialsMethod getServerCredentialsMethod();


  /**
   * <p>
   * Setter method for the COM property "ServerCredentialsMethod"
   * </p>
   * @param rhs Mandatory excel.XlCredentialsMethod parameter.
   */

  @DISPID(2704)
  @PropPut
  void setServerCredentialsMethod(
    excel.XlCredentialsMethod rhs);


  /**
   * <p>
   * Getter method for the COM property "ServerSSOApplicationID"
   * </p>
   */

  @DISPID(2705)
  @PropGet
  java.lang.String getServerSSOApplicationID();


  /**
   * <p>
   * Setter method for the COM property "ServerSSOApplicationID"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2705)
  @PropPut
  void setServerSSOApplicationID(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "AlwaysUseConnectionFile"
   * </p>
   */

  @DISPID(2706)
  @PropGet
  boolean getAlwaysUseConnectionFile();


  /**
   * <p>
   * Setter method for the COM property "AlwaysUseConnectionFile"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2706)
  @PropPut
  void setAlwaysUseConnectionFile(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ServerFillColor"
   * </p>
   */

  @DISPID(2707)
  @PropGet
  boolean getServerFillColor();


  /**
   * <p>
   * Setter method for the COM property "ServerFillColor"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2707)
  @PropPut
  void setServerFillColor(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ServerFontStyle"
   * </p>
   */

  @DISPID(2708)
  @PropGet
  boolean getServerFontStyle();


  /**
   * <p>
   * Setter method for the COM property "ServerFontStyle"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2708)
  @PropPut
  void setServerFontStyle(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ServerNumberFormat"
   * </p>
   */

  @DISPID(2709)
  @PropGet
  boolean getServerNumberFormat();


  /**
   * <p>
   * Setter method for the COM property "ServerNumberFormat"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2709)
  @PropPut
  void setServerNumberFormat(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ServerTextColor"
   * </p>
   */

  @DISPID(2710)
  @PropGet
  boolean getServerTextColor();


  /**
   * <p>
   * Setter method for the COM property "ServerTextColor"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2710)
  @PropPut
  void setServerTextColor(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RetrieveInOfficeUILang"
   * </p>
   */

  @DISPID(2711)
  @PropGet
  boolean getRetrieveInOfficeUILang();


  /**
   * <p>
   * Setter method for the COM property "RetrieveInOfficeUILang"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2711)
  @PropPut
  void setRetrieveInOfficeUILang(
    boolean rhs);


  /**
   */

  @DISPID(2939)
  void reconnect();


  /**
   * <p>
   * Getter method for the COM property "CalculatedMembers"
   * </p>
   */

  @DISPID(2125)
  @PropGet
  excel.CalculatedMembers getCalculatedMembers();


  /**
   * <p>
   * Getter method for the COM property "LocaleID"
   * </p>
   */

  @DISPID(2940)
  @PropGet
  int getLocaleID();


  /**
   * <p>
   * Setter method for the COM property "LocaleID"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2940)
  @PropPut
  void setLocaleID(
    int rhs);


  // Properties:
}
