package excel  ;

import com4j.*;

@IID("{0002448E-0001-0000-C000-000000000046}")
public interface IODBCConnection extends Com4jObject {
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
   */

  @VTID(12)
  void cancelRefresh();


  /**
   * <p>
   * Getter method for the COM property "CommandText"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getCommandText();


  /**
   * <p>
   * Setter method for the COM property "CommandText"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(14)
  void setCommandText(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "CommandType"
   * </p>
   * @return  Returns a value of type excel.XlCmdType
   */

  @VTID(15)
  excel.XlCmdType getCommandType();


  /**
   * <p>
   * Setter method for the COM property "CommandType"
   * </p>
   * @param rhs Mandatory excel.XlCmdType parameter.
   */

  @VTID(16)
  void setCommandType(
    excel.XlCmdType rhs);


  /**
   * <p>
   * Getter method for the COM property "Connection"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getConnection();


  /**
   * <p>
   * Setter method for the COM property "Connection"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(18)
  void setConnection(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableRefresh"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(19)
  boolean getEnableRefresh();


  /**
   * <p>
   * Setter method for the COM property "EnableRefresh"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(20)
  void setEnableRefresh(
    boolean rhs);


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
   * Getter method for the COM property "Refreshing"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(23)
  boolean getRefreshing();


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
   * Getter method for the COM property "RefreshPeriod"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(26)
  int getRefreshPeriod();


  /**
   * <p>
   * Setter method for the COM property "RefreshPeriod"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(27)
  void setRefreshPeriod(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "RobustConnect"
   * </p>
   * @return  Returns a value of type excel.XlRobustConnect
   */

  @VTID(28)
  excel.XlRobustConnect getRobustConnect();


  /**
   * <p>
   * Setter method for the COM property "RobustConnect"
   * </p>
   * @param rhs Mandatory excel.XlRobustConnect parameter.
   */

  @VTID(29)
  void setRobustConnect(
    excel.XlRobustConnect rhs);


  /**
   * @param odcFileName Mandatory java.lang.String parameter.
   * @param description Optional parameter. Default value is com4j.Variant.getMissing()
   * @param keywords Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(30)
  void saveAsODC(
    java.lang.String odcFileName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object description,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object keywords);


  /**
   * <p>
   * Getter method for the COM property "SavePassword"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(31)
  boolean getSavePassword();


  /**
   * <p>
   * Setter method for the COM property "SavePassword"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(32)
  void setSavePassword(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceConnectionFile"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(33)
  java.lang.String getSourceConnectionFile();


  /**
   * <p>
   * Setter method for the COM property "SourceConnectionFile"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(34)
  void setSourceConnectionFile(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceData"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(35)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getSourceData();


  /**
   * <p>
   * Setter method for the COM property "SourceData"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(36)
  void setSourceData(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceDataFile"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(37)
  java.lang.String getSourceDataFile();


  /**
   * <p>
   * Setter method for the COM property "SourceDataFile"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(38)
  void setSourceDataFile(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ServerCredentialsMethod"
   * </p>
   * @return  Returns a value of type excel.XlCredentialsMethod
   */

  @VTID(39)
  excel.XlCredentialsMethod getServerCredentialsMethod();


  /**
   * <p>
   * Setter method for the COM property "ServerCredentialsMethod"
   * </p>
   * @param rhs Mandatory excel.XlCredentialsMethod parameter.
   */

  @VTID(40)
  void setServerCredentialsMethod(
    excel.XlCredentialsMethod rhs);


  /**
   * <p>
   * Getter method for the COM property "ServerSSOApplicationID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(41)
  java.lang.String getServerSSOApplicationID();


  /**
   * <p>
   * Setter method for the COM property "ServerSSOApplicationID"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(42)
  void setServerSSOApplicationID(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "AlwaysUseConnectionFile"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(43)
  boolean getAlwaysUseConnectionFile();


  /**
   * <p>
   * Setter method for the COM property "AlwaysUseConnectionFile"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(44)
  void setAlwaysUseConnectionFile(
    boolean rhs);


  // Properties:
}
