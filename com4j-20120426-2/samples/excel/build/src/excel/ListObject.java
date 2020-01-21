package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ListObject extends Com4jObject {
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

  @DISPID(117)
  void delete();


  /**
   * @param target Mandatory java.lang.Object parameter.
   * @param linkSource Mandatory boolean parameter.
   */

  @DISPID(1895)
  java.lang.String publish(
    java.lang.Object target,
    boolean linkSource);


  /**
   */

  @DISPID(1417)
  void refresh();


  /**
   */

  @DISPID(2308)
  void unlink();


  /**
   */

  @DISPID(2309)
  void unlist();


  /**
   * @param iConflictType Optional parameter. Default value is 0
   */

  @DISPID(2310)
  void updateChanges(
    @Optional @DefaultValue("0") excel.XlListConflict iConflictType);


  /**
   * @param range Mandatory excel.Range parameter.
   */

  @DISPID(256)
  void resize(
    excel.Range range);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  java.lang.String get_Default();


  /**
   * <p>
   * Getter method for the COM property "Active"
   * </p>
   */

  @DISPID(2312)
  @PropGet
  boolean getActive();


  /**
   * <p>
   * Getter method for the COM property "DataBodyRange"
   * </p>
   */

  @DISPID(705)
  @PropGet
  excel.Range getDataBodyRange();


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
   * Getter method for the COM property "HeaderRowRange"
   * </p>
   */

  @DISPID(2313)
  @PropGet
  excel.Range getHeaderRowRange();


  /**
   * <p>
   * Getter method for the COM property "InsertRowRange"
   * </p>
   */

  @DISPID(2314)
  @PropGet
  excel.Range getInsertRowRange();


  /**
   * <p>
   * Getter method for the COM property "ListColumns"
   * </p>
   */

  @DISPID(2315)
  @PropGet
  excel.ListColumns getListColumns();


  /**
   * <p>
   * Getter method for the COM property "ListRows"
   * </p>
   */

  @DISPID(2316)
  @PropGet
  excel.ListRows getListRows();


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
   * Getter method for the COM property "QueryTable"
   * </p>
   */

  @DISPID(1386)
  @PropGet
  excel._QueryTable getQueryTable();


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   */

  @DISPID(197)
  @PropGet
  excel.Range getRange();


  /**
   * <p>
   * Getter method for the COM property "ShowAutoFilter"
   * </p>
   */

  @DISPID(2317)
  @PropGet
  boolean getShowAutoFilter();


  /**
   * <p>
   * Setter method for the COM property "ShowAutoFilter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2317)
  @PropPut
  void setShowAutoFilter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTotals"
   * </p>
   */

  @DISPID(2318)
  @PropGet
  boolean getShowTotals();


  /**
   * <p>
   * Setter method for the COM property "ShowTotals"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2318)
  @PropPut
  void setShowTotals(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceType"
   * </p>
   */

  @DISPID(685)
  @PropGet
  excel.XlListObjectSourceType getSourceType();


  /**
   * <p>
   * Getter method for the COM property "TotalsRowRange"
   * </p>
   */

  @DISPID(2319)
  @PropGet
  excel.Range getTotalsRowRange();


  /**
   * <p>
   * Getter method for the COM property "SharePointURL"
   * </p>
   */

  @DISPID(2320)
  @PropGet
  java.lang.String getSharePointURL();


  /**
   * <p>
   * Getter method for the COM property "XmlMap"
   * </p>
   */

  @DISPID(2253)
  @PropGet
  excel.XmlMap getXmlMap();


  /**
   * <p>
   * Getter method for the COM property "DisplayName"
   * </p>
   */

  @DISPID(2677)
  @PropGet
  java.lang.String getDisplayName();


  /**
   * <p>
   * Setter method for the COM property "DisplayName"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2677)
  @PropPut
  void setDisplayName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowHeaders"
   * </p>
   */

  @DISPID(2678)
  @PropGet
  boolean getShowHeaders();


  /**
   * <p>
   * Setter method for the COM property "ShowHeaders"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2678)
  @PropPut
  void setShowHeaders(
    boolean rhs);


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
   * Getter method for the COM property "TableStyle"
   * </p>
   */

  @DISPID(1504)
  @PropGet
  java.lang.Object getTableStyle();


  /**
   * <p>
   * Setter method for the COM property "TableStyle"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1504)
  @PropPut
  void setTableStyle(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTableStyleFirstColumn"
   * </p>
   */

  @DISPID(2679)
  @PropGet
  boolean getShowTableStyleFirstColumn();


  /**
   * <p>
   * Setter method for the COM property "ShowTableStyleFirstColumn"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2679)
  @PropPut
  void setShowTableStyleFirstColumn(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTableStyleLastColumn"
   * </p>
   */

  @DISPID(2563)
  @PropGet
  boolean getShowTableStyleLastColumn();


  /**
   * <p>
   * Setter method for the COM property "ShowTableStyleLastColumn"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2563)
  @PropPut
  void setShowTableStyleLastColumn(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTableStyleRowStripes"
   * </p>
   */

  @DISPID(2564)
  @PropGet
  boolean getShowTableStyleRowStripes();


  /**
   * <p>
   * Setter method for the COM property "ShowTableStyleRowStripes"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2564)
  @PropPut
  void setShowTableStyleRowStripes(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTableStyleColumnStripes"
   * </p>
   */

  @DISPID(2565)
  @PropGet
  boolean getShowTableStyleColumnStripes();


  /**
   * <p>
   * Setter method for the COM property "ShowTableStyleColumnStripes"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2565)
  @PropPut
  void setShowTableStyleColumnStripes(
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
   * <p>
   * Getter method for the COM property "Comment"
   * </p>
   */

  @DISPID(910)
  @PropGet
  java.lang.String getComment();


  /**
   * <p>
   * Setter method for the COM property "Comment"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(910)
  @PropPut
  void setComment(
    java.lang.String rhs);


  /**
   */

  @DISPID(2680)
  void exportToVisio();


  /**
   * <p>
   * Getter method for the COM property "AlternativeText"
   * </p>
   */

  @DISPID(1891)
  @PropGet
  java.lang.String getAlternativeText();


  /**
   * <p>
   * Setter method for the COM property "AlternativeText"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1891)
  @PropPut
  void setAlternativeText(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Summary"
   * </p>
   */

  @DISPID(273)
  @PropGet
  java.lang.String getSummary();


  /**
   * <p>
   * Setter method for the COM property "Summary"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(273)
  @PropPut
  void setSummary(
    java.lang.String rhs);


  // Properties:
}
