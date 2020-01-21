package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface PivotTable extends Com4jObject {
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
   * @param rowFields Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnFields Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pageFields Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToTable Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(708)
  java.lang.Object addFields(
    @Optional java.lang.Object rowFields,
    @Optional java.lang.Object columnFields,
    @Optional java.lang.Object pageFields,
    @Optional java.lang.Object addToTable);


  /**
   * <p>
   * Getter method for the COM property "ColumnFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(713)
  @PropGet
  com4j.Com4jObject getColumnFields(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "ColumnGrand"
   * </p>
   */

  @DISPID(694)
  @PropGet
  boolean getColumnGrand();


  /**
   * <p>
   * Setter method for the COM property "ColumnGrand"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(694)
  @PropPut
  void setColumnGrand(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ColumnRange"
   * </p>
   */

  @DISPID(702)
  @PropGet
  excel.Range getColumnRange();


  /**
   * @param pageField Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(706)
  java.lang.Object showPages(
    @Optional java.lang.Object pageField);


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
   * Getter method for the COM property "DataFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(715)
  @PropGet
  com4j.Com4jObject getDataFields(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "DataLabelRange"
   * </p>
   */

  @DISPID(704)
  @PropGet
  excel.Range getDataLabelRange();


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
   * Setter method for the COM property "_Default"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(0)
  @PropPut
  @DefaultMethod
  void set_Default(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "HasAutoFormat"
   * </p>
   */

  @DISPID(695)
  @PropGet
  boolean getHasAutoFormat();


  /**
   * <p>
   * Setter method for the COM property "HasAutoFormat"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(695)
  @PropPut
  void setHasAutoFormat(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HiddenFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(711)
  @PropGet
  com4j.Com4jObject getHiddenFields(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "InnerDetail"
   * </p>
   */

  @DISPID(698)
  @PropGet
  java.lang.String getInnerDetail();


  /**
   * <p>
   * Setter method for the COM property "InnerDetail"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(698)
  @PropPut
  void setInnerDetail(
    java.lang.String rhs);


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
   * Getter method for the COM property "PageFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(714)
  @PropGet
  com4j.Com4jObject getPageFields(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "PageRange"
   * </p>
   */

  @DISPID(703)
  @PropGet
  excel.Range getPageRange();


  /**
   * <p>
   * Getter method for the COM property "PageRangeCells"
   * </p>
   */

  @DISPID(1482)
  @PropGet
  excel.Range getPageRangeCells();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(718)
  com4j.Com4jObject pivotFields(
    @Optional java.lang.Object index);


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
   */

  @DISPID(717)
  boolean refreshTable();


  /**
   * <p>
   * Getter method for the COM property "RowFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(712)
  @PropGet
  com4j.Com4jObject getRowFields(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "RowGrand"
   * </p>
   */

  @DISPID(693)
  @PropGet
  boolean getRowGrand();


  /**
   * <p>
   * Setter method for the COM property "RowGrand"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(693)
  @PropPut
  void setRowGrand(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RowRange"
   * </p>
   */

  @DISPID(701)
  @PropGet
  excel.Range getRowRange();


  /**
   * <p>
   * Getter method for the COM property "SaveData"
   * </p>
   */

  @DISPID(692)
  @PropGet
  boolean getSaveData();


  /**
   * <p>
   * Setter method for the COM property "SaveData"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(692)
  @PropPut
  void setSaveData(
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
   * Getter method for the COM property "TableRange1"
   * </p>
   */

  @DISPID(699)
  @PropGet
  excel.Range getTableRange1();


  /**
   * <p>
   * Getter method for the COM property "TableRange2"
   * </p>
   */

  @DISPID(700)
  @PropGet
  excel.Range getTableRange2();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   */

  @DISPID(6)
  @PropGet
  java.lang.String getValue();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(6)
  @PropPut
  void setValue(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "VisibleFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(710)
  @PropGet
  com4j.Com4jObject getVisibleFields(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "CacheIndex"
   * </p>
   */

  @DISPID(1483)
  @PropGet
  int getCacheIndex();


  /**
   * <p>
   * Setter method for the COM property "CacheIndex"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1483)
  @PropPut
  void setCacheIndex(
    int rhs);


  /**
   */

  @DISPID(1484)
  excel.CalculatedFields calculatedFields();


  /**
   * <p>
   * Getter method for the COM property "DisplayErrorString"
   * </p>
   */

  @DISPID(1485)
  @PropGet
  boolean getDisplayErrorString();


  /**
   * <p>
   * Setter method for the COM property "DisplayErrorString"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1485)
  @PropPut
  void setDisplayErrorString(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayNullString"
   * </p>
   */

  @DISPID(1486)
  @PropGet
  boolean getDisplayNullString();


  /**
   * <p>
   * Setter method for the COM property "DisplayNullString"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1486)
  @PropPut
  void setDisplayNullString(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableDrilldown"
   * </p>
   */

  @DISPID(1487)
  @PropGet
  boolean getEnableDrilldown();


  /**
   * <p>
   * Setter method for the COM property "EnableDrilldown"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1487)
  @PropPut
  void setEnableDrilldown(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableFieldDialog"
   * </p>
   */

  @DISPID(1488)
  @PropGet
  boolean getEnableFieldDialog();


  /**
   * <p>
   * Setter method for the COM property "EnableFieldDialog"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1488)
  @PropPut
  void setEnableFieldDialog(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableWizard"
   * </p>
   */

  @DISPID(1489)
  @PropGet
  boolean getEnableWizard();


  /**
   * <p>
   * Setter method for the COM property "EnableWizard"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1489)
  @PropPut
  void setEnableWizard(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ErrorString"
   * </p>
   */

  @DISPID(1490)
  @PropGet
  java.lang.String getErrorString();


  /**
   * <p>
   * Setter method for the COM property "ErrorString"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1490)
  @PropPut
  void setErrorString(
    java.lang.String rhs);


  /**
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(1491)
  double getData(
    java.lang.String name);


  /**
   */

  @DISPID(1492)
  void listFormulas();


  /**
   * <p>
   * Getter method for the COM property "ManualUpdate"
   * </p>
   */

  @DISPID(1493)
  @PropGet
  boolean getManualUpdate();


  /**
   * <p>
   * Setter method for the COM property "ManualUpdate"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1493)
  @PropPut
  void setManualUpdate(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MergeLabels"
   * </p>
   */

  @DISPID(1494)
  @PropGet
  boolean getMergeLabels();


  /**
   * <p>
   * Setter method for the COM property "MergeLabels"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1494)
  @PropPut
  void setMergeLabels(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "NullString"
   * </p>
   */

  @DISPID(1495)
  @PropGet
  java.lang.String getNullString();


  /**
   * <p>
   * Setter method for the COM property "NullString"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1495)
  @PropPut
  void setNullString(
    java.lang.String rhs);


  /**
   */

  @DISPID(1496)
  excel.PivotCache pivotCache();


  /**
   * <p>
   * Getter method for the COM property "PivotFormulas"
   * </p>
   */

  @DISPID(1497)
  @PropGet
  excel.PivotFormulas getPivotFormulas();


  /**
   * @param sourceType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sourceData Optional parameter. Default value is com4j.Variant.getMissing()
   * @param tableDestination Optional parameter. Default value is com4j.Variant.getMissing()
   * @param tableName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param rowGrand Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnGrand Optional parameter. Default value is com4j.Variant.getMissing()
   * @param saveData Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasAutoFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoPage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param reserved Optional parameter. Default value is com4j.Variant.getMissing()
   * @param backgroundQuery Optional parameter. Default value is com4j.Variant.getMissing()
   * @param optimizeCache Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pageFieldOrder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pageFieldWrapCount Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readData Optional parameter. Default value is com4j.Variant.getMissing()
   * @param connection Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(684)
  void pivotTableWizard(
    @Optional java.lang.Object sourceType,
    @Optional java.lang.Object sourceData,
    @Optional java.lang.Object tableDestination,
    @Optional java.lang.Object tableName,
    @Optional java.lang.Object rowGrand,
    @Optional java.lang.Object columnGrand,
    @Optional java.lang.Object saveData,
    @Optional java.lang.Object hasAutoFormat,
    @Optional java.lang.Object autoPage,
    @Optional java.lang.Object reserved,
    @Optional java.lang.Object backgroundQuery,
    @Optional java.lang.Object optimizeCache,
    @Optional java.lang.Object pageFieldOrder,
    @Optional java.lang.Object pageFieldWrapCount,
    @Optional java.lang.Object readData,
    @Optional java.lang.Object connection);


  /**
   * <p>
   * Getter method for the COM property "SubtotalHiddenPageItems"
   * </p>
   */

  @DISPID(1498)
  @PropGet
  boolean getSubtotalHiddenPageItems();


  /**
   * <p>
   * Setter method for the COM property "SubtotalHiddenPageItems"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1498)
  @PropPut
  void setSubtotalHiddenPageItems(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PageFieldOrder"
   * </p>
   */

  @DISPID(1429)
  @PropGet
  int getPageFieldOrder();


  /**
   * <p>
   * Setter method for the COM property "PageFieldOrder"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1429)
  @PropPut
  void setPageFieldOrder(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "PageFieldStyle"
   * </p>
   */

  @DISPID(1499)
  @PropGet
  java.lang.String getPageFieldStyle();


  /**
   * <p>
   * Setter method for the COM property "PageFieldStyle"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1499)
  @PropPut
  void setPageFieldStyle(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "PageFieldWrapCount"
   * </p>
   */

  @DISPID(1430)
  @PropGet
  int getPageFieldWrapCount();


  /**
   * <p>
   * Setter method for the COM property "PageFieldWrapCount"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1430)
  @PropPut
  void setPageFieldWrapCount(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "PreserveFormatting"
   * </p>
   */

  @DISPID(1500)
  @PropGet
  boolean getPreserveFormatting();


  /**
   * <p>
   * Setter method for the COM property "PreserveFormatting"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1500)
  @PropPut
  void setPreserveFormatting(
    boolean rhs);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param mode Optional parameter. Default value is 0
   */

  @DISPID(2087)
  void _PivotSelect(
    java.lang.String name,
    @Optional @DefaultValue("0") excel.XlPTSelectionMode mode);


  /**
   * <p>
   * Getter method for the COM property "PivotSelection"
   * </p>
   */

  @DISPID(1502)
  @PropGet
  java.lang.String getPivotSelection();


  /**
   * <p>
   * Setter method for the COM property "PivotSelection"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1502)
  @PropPut
  void setPivotSelection(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "SelectionMode"
   * </p>
   */

  @DISPID(1503)
  @PropGet
  excel.XlPTSelectionMode getSelectionMode();


  /**
   * <p>
   * Setter method for the COM property "SelectionMode"
   * </p>
   * @param rhs Mandatory excel.XlPTSelectionMode parameter.
   */

  @DISPID(1503)
  @PropPut
  void setSelectionMode(
    excel.XlPTSelectionMode rhs);


  /**
   * <p>
   * Getter method for the COM property "TableStyle"
   * </p>
   */

  @DISPID(1504)
  @PropGet
  java.lang.String getTableStyle();


  /**
   * <p>
   * Setter method for the COM property "TableStyle"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1504)
  @PropPut
  void setTableStyle(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Tag"
   * </p>
   */

  @DISPID(1505)
  @PropGet
  java.lang.String getTag();


  /**
   * <p>
   * Setter method for the COM property "Tag"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1505)
  @PropPut
  void setTag(
    java.lang.String rhs);


  /**
   */

  @DISPID(680)
  void update();


  /**
   * <p>
   * Getter method for the COM property "VacatedStyle"
   * </p>
   */

  @DISPID(1506)
  @PropGet
  java.lang.String getVacatedStyle();


  /**
   * <p>
   * Setter method for the COM property "VacatedStyle"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1506)
  @PropPut
  void setVacatedStyle(
    java.lang.String rhs);


  /**
   * @param format Mandatory excel.XlPivotFormatType parameter.
   */

  @DISPID(116)
  void format(
    excel.XlPivotFormatType format);


  /**
   * <p>
   * Getter method for the COM property "PrintTitles"
   * </p>
   */

  @DISPID(1838)
  @PropGet
  boolean getPrintTitles();


  /**
   * <p>
   * Setter method for the COM property "PrintTitles"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1838)
  @PropPut
  void setPrintTitles(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CubeFields"
   * </p>
   */

  @DISPID(1839)
  @PropGet
  excel.CubeFields getCubeFields();


  /**
   * <p>
   * Getter method for the COM property "GrandTotalName"
   * </p>
   */

  @DISPID(1840)
  @PropGet
  java.lang.String getGrandTotalName();


  /**
   * <p>
   * Setter method for the COM property "GrandTotalName"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1840)
  @PropPut
  void setGrandTotalName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "SmallGrid"
   * </p>
   */

  @DISPID(1841)
  @PropGet
  boolean getSmallGrid();


  /**
   * <p>
   * Setter method for the COM property "SmallGrid"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1841)
  @PropPut
  void setSmallGrid(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RepeatItemsOnEachPrintedPage"
   * </p>
   */

  @DISPID(1842)
  @PropGet
  boolean getRepeatItemsOnEachPrintedPage();


  /**
   * <p>
   * Setter method for the COM property "RepeatItemsOnEachPrintedPage"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1842)
  @PropPut
  void setRepeatItemsOnEachPrintedPage(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TotalsAnnotation"
   * </p>
   */

  @DISPID(1843)
  @PropGet
  boolean getTotalsAnnotation();


  /**
   * <p>
   * Setter method for the COM property "TotalsAnnotation"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1843)
  @PropPut
  void setTotalsAnnotation(
    boolean rhs);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param mode Optional parameter. Default value is 0
   * @param useStandardName Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1501)
  void pivotSelect(
    java.lang.String name,
    @Optional @DefaultValue("0") excel.XlPTSelectionMode mode,
    @Optional java.lang.Object useStandardName);


  /**
   * <p>
   * Getter method for the COM property "PivotSelectionStandard"
   * </p>
   */

  @DISPID(2089)
  @PropGet
  java.lang.String getPivotSelectionStandard();


  /**
   * <p>
   * Setter method for the COM property "PivotSelectionStandard"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2089)
  @PropPut
  void setPivotSelectionStandard(
    java.lang.String rhs);


  /**
   * @param dataField Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item14 Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2090)
  excel.Range getPivotData(
    @Optional java.lang.Object dataField,
    @Optional java.lang.Object field1,
    @Optional java.lang.Object item1,
    @Optional java.lang.Object field2,
    @Optional java.lang.Object item2,
    @Optional java.lang.Object field3,
    @Optional java.lang.Object item3,
    @Optional java.lang.Object field4,
    @Optional java.lang.Object item4,
    @Optional java.lang.Object field5,
    @Optional java.lang.Object item5,
    @Optional java.lang.Object field6,
    @Optional java.lang.Object item6,
    @Optional java.lang.Object field7,
    @Optional java.lang.Object item7,
    @Optional java.lang.Object field8,
    @Optional java.lang.Object item8,
    @Optional java.lang.Object field9,
    @Optional java.lang.Object item9,
    @Optional java.lang.Object field10,
    @Optional java.lang.Object item10,
    @Optional java.lang.Object field11,
    @Optional java.lang.Object item11,
    @Optional java.lang.Object field12,
    @Optional java.lang.Object item12,
    @Optional java.lang.Object field13,
    @Optional java.lang.Object item13,
    @Optional java.lang.Object field14,
    @Optional java.lang.Object item14);


  /**
   * <p>
   * Getter method for the COM property "DataPivotField"
   * </p>
   */

  @DISPID(2120)
  @PropGet
  excel.PivotField getDataPivotField();


  /**
   * <p>
   * Getter method for the COM property "EnableDataValueEditing"
   * </p>
   */

  @DISPID(2121)
  @PropGet
  boolean getEnableDataValueEditing();


  /**
   * <p>
   * Setter method for the COM property "EnableDataValueEditing"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2121)
  @PropPut
  void setEnableDataValueEditing(
    boolean rhs);


  /**
   * @param field Mandatory com4j.Com4jObject parameter.
   * @param caption Optional parameter. Default value is com4j.Variant.getMissing()
   * @param function Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2122)
  excel.PivotField addDataField(
    com4j.Com4jObject field,
    @Optional java.lang.Object caption,
    @Optional java.lang.Object function);


  /**
   * <p>
   * Getter method for the COM property "MDX"
   * </p>
   */

  @DISPID(2123)
  @PropGet
  java.lang.String getMDX();


  /**
   * <p>
   * Getter method for the COM property "ViewCalculatedMembers"
   * </p>
   */

  @DISPID(2124)
  @PropGet
  boolean getViewCalculatedMembers();


  /**
   * <p>
   * Setter method for the COM property "ViewCalculatedMembers"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2124)
  @PropPut
  void setViewCalculatedMembers(
    boolean rhs);


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
   * Getter method for the COM property "DisplayImmediateItems"
   * </p>
   */

  @DISPID(2126)
  @PropGet
  boolean getDisplayImmediateItems();


  /**
   * <p>
   * Setter method for the COM property "DisplayImmediateItems"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2126)
  @PropPut
  void setDisplayImmediateItems(
    boolean rhs);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2127)
  java.lang.Object dummy15(
    java.lang.Object arg1,
    @Optional java.lang.Object arg2,
    @Optional java.lang.Object arg3,
    @Optional java.lang.Object arg4,
    @Optional java.lang.Object arg5,
    @Optional java.lang.Object arg6,
    @Optional java.lang.Object arg7,
    @Optional java.lang.Object arg8,
    @Optional java.lang.Object arg9,
    @Optional java.lang.Object arg10,
    @Optional java.lang.Object arg11,
    @Optional java.lang.Object arg12,
    @Optional java.lang.Object arg13,
    @Optional java.lang.Object arg14,
    @Optional java.lang.Object arg15,
    @Optional java.lang.Object arg16,
    @Optional java.lang.Object arg17,
    @Optional java.lang.Object arg18,
    @Optional java.lang.Object arg19,
    @Optional java.lang.Object arg20,
    @Optional java.lang.Object arg21,
    @Optional java.lang.Object arg22,
    @Optional java.lang.Object arg23,
    @Optional java.lang.Object arg24,
    @Optional java.lang.Object arg25,
    @Optional java.lang.Object arg26,
    @Optional java.lang.Object arg27,
    @Optional java.lang.Object arg28,
    @Optional java.lang.Object arg29,
    @Optional java.lang.Object arg30);


  /**
   * <p>
   * Getter method for the COM property "EnableFieldList"
   * </p>
   */

  @DISPID(2128)
  @PropGet
  boolean getEnableFieldList();


  /**
   * <p>
   * Setter method for the COM property "EnableFieldList"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2128)
  @PropPut
  void setEnableFieldList(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "VisualTotals"
   * </p>
   */

  @DISPID(2129)
  @PropGet
  boolean getVisualTotals();


  /**
   * <p>
   * Setter method for the COM property "VisualTotals"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2129)
  @PropPut
  void setVisualTotals(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowPageMultipleItemLabel"
   * </p>
   */

  @DISPID(2130)
  @PropGet
  boolean getShowPageMultipleItemLabel();


  /**
   * <p>
   * Setter method for the COM property "ShowPageMultipleItemLabel"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2130)
  @PropPut
  void setShowPageMultipleItemLabel(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Version"
   * </p>
   */

  @DISPID(392)
  @PropGet
  excel.XlPivotTableVersionList getVersion();


  /**
   * @param file Mandatory java.lang.String parameter.
   * @param measures Optional parameter. Default value is com4j.Variant.getMissing()
   * @param levels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param members Optional parameter. Default value is com4j.Variant.getMissing()
   * @param properties Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2131)
  java.lang.String createCubeFile(
    java.lang.String file,
    @Optional java.lang.Object measures,
    @Optional java.lang.Object levels,
    @Optional java.lang.Object members,
    @Optional java.lang.Object properties);


  /**
   * <p>
   * Getter method for the COM property "DisplayEmptyRow"
   * </p>
   */

  @DISPID(2136)
  @PropGet
  boolean getDisplayEmptyRow();


  /**
   * <p>
   * Setter method for the COM property "DisplayEmptyRow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2136)
  @PropPut
  void setDisplayEmptyRow(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayEmptyColumn"
   * </p>
   */

  @DISPID(2137)
  @PropGet
  boolean getDisplayEmptyColumn();


  /**
   * <p>
   * Setter method for the COM property "DisplayEmptyColumn"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2137)
  @PropPut
  void setDisplayEmptyColumn(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowCellBackgroundFromOLAP"
   * </p>
   */

  @DISPID(2138)
  @PropGet
  boolean getShowCellBackgroundFromOLAP();


  /**
   * <p>
   * Setter method for the COM property "ShowCellBackgroundFromOLAP"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2138)
  @PropPut
  void setShowCellBackgroundFromOLAP(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PivotColumnAxis"
   * </p>
   */

  @DISPID(2546)
  @PropGet
  excel.PivotAxis getPivotColumnAxis();


  /**
   * <p>
   * Getter method for the COM property "PivotRowAxis"
   * </p>
   */

  @DISPID(2547)
  @PropGet
  excel.PivotAxis getPivotRowAxis();


  /**
   * <p>
   * Getter method for the COM property "ShowDrillIndicators"
   * </p>
   */

  @DISPID(2548)
  @PropGet
  boolean getShowDrillIndicators();


  /**
   * <p>
   * Setter method for the COM property "ShowDrillIndicators"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2548)
  @PropPut
  void setShowDrillIndicators(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintDrillIndicators"
   * </p>
   */

  @DISPID(2549)
  @PropGet
  boolean getPrintDrillIndicators();


  /**
   * <p>
   * Setter method for the COM property "PrintDrillIndicators"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2549)
  @PropPut
  void setPrintDrillIndicators(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayMemberPropertyTooltips"
   * </p>
   */

  @DISPID(2550)
  @PropGet
  boolean getDisplayMemberPropertyTooltips();


  /**
   * <p>
   * Setter method for the COM property "DisplayMemberPropertyTooltips"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2550)
  @PropPut
  void setDisplayMemberPropertyTooltips(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayContextTooltips"
   * </p>
   */

  @DISPID(2551)
  @PropGet
  boolean getDisplayContextTooltips();


  /**
   * <p>
   * Setter method for the COM property "DisplayContextTooltips"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2551)
  @PropPut
  void setDisplayContextTooltips(
    boolean rhs);


  /**
   */

  @DISPID(2552)
  void clearTable();


  /**
   * <p>
   * Getter method for the COM property "CompactRowIndent"
   * </p>
   */

  @DISPID(2553)
  @PropGet
  int getCompactRowIndent();


  /**
   * <p>
   * Setter method for the COM property "CompactRowIndent"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2553)
  @PropPut
  void setCompactRowIndent(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "LayoutRowDefault"
   * </p>
   */

  @DISPID(2554)
  @PropGet
  excel.XlLayoutRowType getLayoutRowDefault();


  /**
   * <p>
   * Setter method for the COM property "LayoutRowDefault"
   * </p>
   * @param rhs Mandatory excel.XlLayoutRowType parameter.
   */

  @DISPID(2554)
  @PropPut
  void setLayoutRowDefault(
    excel.XlLayoutRowType rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayFieldCaptions"
   * </p>
   */

  @DISPID(2555)
  @PropGet
  boolean getDisplayFieldCaptions();


  /**
   * <p>
   * Setter method for the COM property "DisplayFieldCaptions"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2555)
  @PropPut
  void setDisplayFieldCaptions(
    boolean rhs);


  /**
   * @param rowLayout Mandatory excel.XlLayoutRowType parameter.
   */

  @DISPID(2556)
  void rowAxisLayout(
    excel.XlLayoutRowType rowLayout);


  /**
   * @param location Mandatory excel.XlSubtototalLocationType parameter.
   */

  @DISPID(2558)
  void subtotalLocation(
    excel.XlSubtototalLocationType location);


  /**
   * <p>
   * Getter method for the COM property "ActiveFilters"
   * </p>
   */

  @DISPID(2559)
  @PropGet
  excel.PivotFilters getActiveFilters();


  /**
   * <p>
   * Getter method for the COM property "InGridDropZones"
   * </p>
   */

  @DISPID(2560)
  @PropGet
  boolean getInGridDropZones();


  /**
   * <p>
   * Setter method for the COM property "InGridDropZones"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2560)
  @PropPut
  void setInGridDropZones(
    boolean rhs);


  /**
   */

  @DISPID(2561)
  void clearAllFilters();


  /**
   * <p>
   * Getter method for the COM property "TableStyle2"
   * </p>
   */

  @DISPID(2562)
  @PropGet
  java.lang.Object getTableStyle2();


  /**
   * <p>
   * Setter method for the COM property "TableStyle2"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2562)
  @PropPut
  void setTableStyle2(
    java.lang.Object rhs);


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
   * Getter method for the COM property "ShowTableStyleRowHeaders"
   * </p>
   */

  @DISPID(2566)
  @PropGet
  boolean getShowTableStyleRowHeaders();


  /**
   * <p>
   * Setter method for the COM property "ShowTableStyleRowHeaders"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2566)
  @PropPut
  void setShowTableStyleRowHeaders(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTableStyleColumnHeaders"
   * </p>
   */

  @DISPID(2567)
  @PropGet
  boolean getShowTableStyleColumnHeaders();


  /**
   * <p>
   * Setter method for the COM property "ShowTableStyleColumnHeaders"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2567)
  @PropPut
  void setShowTableStyleColumnHeaders(
    boolean rhs);


  /**
   * @param convertFilters Mandatory boolean parameter.
   */

  @DISPID(2568)
  void convertToFormulas(
    boolean convertFilters);


  /**
   * <p>
   * Getter method for the COM property "AllowMultipleFilters"
   * </p>
   */

  @DISPID(2570)
  @PropGet
  boolean getAllowMultipleFilters();


  /**
   * <p>
   * Setter method for the COM property "AllowMultipleFilters"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2570)
  @PropPut
  void setAllowMultipleFilters(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CompactLayoutRowHeader"
   * </p>
   */

  @DISPID(2571)
  @PropGet
  java.lang.String getCompactLayoutRowHeader();


  /**
   * <p>
   * Setter method for the COM property "CompactLayoutRowHeader"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2571)
  @PropPut
  void setCompactLayoutRowHeader(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "CompactLayoutColumnHeader"
   * </p>
   */

  @DISPID(2572)
  @PropGet
  java.lang.String getCompactLayoutColumnHeader();


  /**
   * <p>
   * Setter method for the COM property "CompactLayoutColumnHeader"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2572)
  @PropPut
  void setCompactLayoutColumnHeader(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "FieldListSortAscending"
   * </p>
   */

  @DISPID(2573)
  @PropGet
  boolean getFieldListSortAscending();


  /**
   * <p>
   * Setter method for the COM property "FieldListSortAscending"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2573)
  @PropPut
  void setFieldListSortAscending(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SortUsingCustomLists"
   * </p>
   */

  @DISPID(2574)
  @PropGet
  boolean getSortUsingCustomLists();


  /**
   * <p>
   * Setter method for the COM property "SortUsingCustomLists"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2574)
  @PropPut
  void setSortUsingCustomLists(
    boolean rhs);


  /**
   * @param conn Mandatory excel.WorkbookConnection parameter.
   */

  @DISPID(2575)
  void changeConnection(
    excel.WorkbookConnection conn);


  /**
   * @param pivotCache Mandatory java.lang.Object parameter.
   */

  @DISPID(2577)
  void changePivotCache(
    java.lang.Object pivotCache);


  /**
   * <p>
   * Getter method for the COM property "Location"
   * </p>
   */

  @DISPID(1397)
  @PropGet
  java.lang.String getLocation();


  /**
   * <p>
   * Setter method for the COM property "Location"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1397)
  @PropPut
  void setLocation(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableWriteback"
   * </p>
   */

  @DISPID(2872)
  @PropGet
  boolean getEnableWriteback();


  /**
   * <p>
   * Setter method for the COM property "EnableWriteback"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2872)
  @PropPut
  void setEnableWriteback(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Allocation"
   * </p>
   */

  @DISPID(2873)
  @PropGet
  excel.XlAllocation getAllocation();


  /**
   * <p>
   * Setter method for the COM property "Allocation"
   * </p>
   * @param rhs Mandatory excel.XlAllocation parameter.
   */

  @DISPID(2873)
  @PropPut
  void setAllocation(
    excel.XlAllocation rhs);


  /**
   * <p>
   * Getter method for the COM property "AllocationValue"
   * </p>
   */

  @DISPID(2874)
  @PropGet
  excel.XlAllocationValue getAllocationValue();


  /**
   * <p>
   * Setter method for the COM property "AllocationValue"
   * </p>
   * @param rhs Mandatory excel.XlAllocationValue parameter.
   */

  @DISPID(2874)
  @PropPut
  void setAllocationValue(
    excel.XlAllocationValue rhs);


  /**
   * <p>
   * Getter method for the COM property "AllocationMethod"
   * </p>
   */

  @DISPID(2875)
  @PropGet
  excel.XlAllocationMethod getAllocationMethod();


  /**
   * <p>
   * Setter method for the COM property "AllocationMethod"
   * </p>
   * @param rhs Mandatory excel.XlAllocationMethod parameter.
   */

  @DISPID(2875)
  @PropPut
  void setAllocationMethod(
    excel.XlAllocationMethod rhs);


  /**
   * <p>
   * Getter method for the COM property "AllocationWeightExpression"
   * </p>
   */

  @DISPID(2876)
  @PropGet
  java.lang.String getAllocationWeightExpression();


  /**
   * <p>
   * Setter method for the COM property "AllocationWeightExpression"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2876)
  @PropPut
  void setAllocationWeightExpression(
    java.lang.String rhs);


  /**
   */

  @DISPID(2855)
  void allocateChanges();


  /**
   */

  @DISPID(2877)
  void commitChanges();


  /**
   */

  @DISPID(2856)
  void discardChanges();


  /**
   */

  @DISPID(2878)
  void refreshDataSourceValues();


  /**
   * @param repeat Mandatory excel.XlPivotFieldRepeatLabels parameter.
   */

  @DISPID(2879)
  void repeatAllLabels(
    excel.XlPivotFieldRepeatLabels repeat);


  /**
   * <p>
   * Getter method for the COM property "ChangeList"
   * </p>
   */

  @DISPID(2880)
  @PropGet
  excel.PivotTableChangeList getChangeList();


  /**
   * <p>
   * Getter method for the COM property "Slicers"
   * </p>
   */

  @DISPID(2881)
  @PropGet
  excel.Slicers getSlicers();


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


  /**
   * <p>
   * Getter method for the COM property "VisualTotalsForSets"
   * </p>
   */

  @DISPID(2882)
  @PropGet
  boolean getVisualTotalsForSets();


  /**
   * <p>
   * Setter method for the COM property "VisualTotalsForSets"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2882)
  @PropPut
  void setVisualTotalsForSets(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowValuesRow"
   * </p>
   */

  @DISPID(2883)
  @PropGet
  boolean getShowValuesRow();


  /**
   * <p>
   * Setter method for the COM property "ShowValuesRow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2883)
  @PropPut
  void setShowValuesRow(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CalculatedMembersInFilters"
   * </p>
   */

  @DISPID(2884)
  @PropGet
  boolean getCalculatedMembersInFilters();


  /**
   * <p>
   * Setter method for the COM property "CalculatedMembersInFilters"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2884)
  @PropPut
  void setCalculatedMembersInFilters(
    boolean rhs);


  // Properties:
}
