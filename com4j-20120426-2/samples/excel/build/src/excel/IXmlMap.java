package excel  ;

import com4j.*;

@IID("{0002447B-0001-0000-C000-000000000046}")
public interface IXmlMap extends Com4jObject {
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
   * Getter method for the COM property "_Default"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(10)
  @DefaultMethod
  java.lang.String get_Default();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(11)
  java.lang.String getName();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(12)
  void setName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "IsExportable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(13)
  boolean getIsExportable();


  /**
   * <p>
   * Getter method for the COM property "ShowImportExportValidationErrors"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(14)
  boolean getShowImportExportValidationErrors();


  /**
   * <p>
   * Setter method for the COM property "ShowImportExportValidationErrors"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(15)
  void setShowImportExportValidationErrors(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SaveDataSourceDefinition"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(16)
  boolean getSaveDataSourceDefinition();


  /**
   * <p>
   * Setter method for the COM property "SaveDataSourceDefinition"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(17)
  void setSaveDataSourceDefinition(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AdjustColumnWidth"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(18)
  boolean getAdjustColumnWidth();


  /**
   * <p>
   * Setter method for the COM property "AdjustColumnWidth"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(19)
  void setAdjustColumnWidth(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PreserveColumnFilter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(20)
  boolean getPreserveColumnFilter();


  /**
   * <p>
   * Setter method for the COM property "PreserveColumnFilter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(21)
  void setPreserveColumnFilter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PreserveNumberFormatting"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(22)
  boolean getPreserveNumberFormatting();


  /**
   * <p>
   * Setter method for the COM property "PreserveNumberFormatting"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(23)
  void setPreserveNumberFormatting(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AppendOnImport"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(24)
  boolean getAppendOnImport();


  /**
   * <p>
   * Setter method for the COM property "AppendOnImport"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(25)
  void setAppendOnImport(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RootElementName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(26)
  java.lang.String getRootElementName();


  /**
   * <p>
   * Getter method for the COM property "RootElementNamespace"
   * </p>
   * @return  Returns a value of type excel.XmlNamespace
   */

  @VTID(27)
  excel.XmlNamespace getRootElementNamespace();


  /**
   * <p>
   * Getter method for the COM property "Schemas"
   * </p>
   * @return  Returns a value of type excel.XmlSchemas
   */

  @VTID(28)
  excel.XmlSchemas getSchemas();


  /**
   * <p>
   * Getter method for the COM property "DataBinding"
   * </p>
   * @return  Returns a value of type excel.XmlDataBinding
   */

  @VTID(29)
  excel.XmlDataBinding getDataBinding();


  /**
   */

  @VTID(30)
  void delete();


  /**
   * @param url Mandatory java.lang.String parameter.
   * @param overwrite Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.XlXmlImportResult
   */

  @VTID(31)
  excel.XlXmlImportResult _import(
    java.lang.String url,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object overwrite);


  /**
   * @param xmlData Mandatory java.lang.String parameter.
   * @param overwrite Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.XlXmlImportResult
   */

  @VTID(32)
  excel.XlXmlImportResult importXml(
    java.lang.String xmlData,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object overwrite);


  /**
   * @param url Mandatory java.lang.String parameter.
   * @param overwrite Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.XlXmlExportResult
   */

  @VTID(33)
  excel.XlXmlExportResult export(
    java.lang.String url,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object overwrite);


  /**
   * @param data Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type excel.XlXmlExportResult
   */

  @VTID(34)
  excel.XlXmlExportResult exportXml(
    Holder<java.lang.String> data);


  /**
   * <p>
   * Getter method for the COM property "WorkbookConnection"
   * </p>
   * @return  Returns a value of type excel.WorkbookConnection
   */

  @VTID(35)
  excel.WorkbookConnection getWorkbookConnection();


  // Properties:
}
