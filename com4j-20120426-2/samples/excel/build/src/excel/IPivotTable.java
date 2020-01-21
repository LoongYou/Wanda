package excel  ;

import com4j.*;

@IID("{00020872-0001-0000-C000-000000000046}")
public interface IPivotTable extends Com4jObject {
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
   * @param rowFields Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnFields Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pageFields Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToTable Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object addFields(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowFields,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columnFields,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object pageFields,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object addToTable);


  /**
   * <p>
   * Getter method for the COM property "ColumnFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getColumnFields(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "ColumnGrand"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(12)
  boolean getColumnGrand();


  /**
   * <p>
   * Setter method for the COM property "ColumnGrand"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(13)
  void setColumnGrand(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ColumnRange"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(14)
  excel.Range getColumnRange();


  /**
   * @param pageField Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object showPages(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object pageField);


  /**
   * <p>
   * Getter method for the COM property "DataBodyRange"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(16)
  excel.Range getDataBodyRange();


  /**
   * <p>
   * Getter method for the COM property "DataFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(17)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getDataFields(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "DataLabelRange"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(18)
  excel.Range getDataLabelRange();


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(19)
  @DefaultMethod
  java.lang.String get_Default();


  /**
   * <p>
   * Setter method for the COM property "_Default"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(20)
  @DefaultMethod
  void set_Default(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "HasAutoFormat"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(21)
  boolean getHasAutoFormat();


  /**
   * <p>
   * Setter method for the COM property "HasAutoFormat"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(22)
  void setHasAutoFormat(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HiddenFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(23)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getHiddenFields(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "InnerDetail"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(24)
  java.lang.String getInnerDetail();


  /**
   * <p>
   * Setter method for the COM property "InnerDetail"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(25)
  void setInnerDetail(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(26)
  java.lang.String getName();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(27)
  void setName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "PageFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(28)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getPageFields(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "PageRange"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(29)
  excel.Range getPageRange();


  /**
   * <p>
   * Getter method for the COM property "PageRangeCells"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(30)
  excel.Range getPageRangeCells();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(31)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject pivotFields(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "RefreshDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @VTID(32)
  java.util.Date getRefreshDate();


  /**
   * <p>
   * Getter method for the COM property "RefreshName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(33)
  java.lang.String getRefreshName();


  /**
   * @return  Returns a value of type boolean
   */

  @VTID(34)
  boolean refreshTable();


  /**
   * <p>
   * Getter method for the COM property "RowFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(35)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getRowFields(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "RowGrand"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(36)
  boolean getRowGrand();


  /**
   * <p>
   * Setter method for the COM property "RowGrand"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(37)
  void setRowGrand(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RowRange"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(38)
  excel.Range getRowRange();


  /**
   * <p>
   * Getter method for the COM property "SaveData"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(39)
  boolean getSaveData();


  /**
   * <p>
   * Setter method for the COM property "SaveData"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(40)
  void setSaveData(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceData"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(41)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getSourceData();


  /**
   * <p>
   * Setter method for the COM property "SourceData"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(42)
  void setSourceData(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "TableRange1"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(43)
  excel.Range getTableRange1();


  /**
   * <p>
   * Getter method for the COM property "TableRange2"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(44)
  excel.Range getTableRange2();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(45)
  java.lang.String getValue();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(46)
  void setValue(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "VisibleFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(47)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getVisibleFields(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "CacheIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(48)
  int getCacheIndex();


  /**
   * <p>
   * Setter method for the COM property "CacheIndex"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(49)
  void setCacheIndex(
    int rhs);


  /**
   * @return  Returns a value of type excel.CalculatedFields
   */

  @VTID(50)
  excel.CalculatedFields calculatedFields();


  /**
   * <p>
   * Getter method for the COM property "DisplayErrorString"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(51)
  boolean getDisplayErrorString();


  /**
   * <p>
   * Setter method for the COM property "DisplayErrorString"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(52)
  void setDisplayErrorString(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayNullString"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(53)
  boolean getDisplayNullString();


  /**
   * <p>
   * Setter method for the COM property "DisplayNullString"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(54)
  void setDisplayNullString(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableDrilldown"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(55)
  boolean getEnableDrilldown();


  /**
   * <p>
   * Setter method for the COM property "EnableDrilldown"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(56)
  void setEnableDrilldown(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableFieldDialog"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(57)
  boolean getEnableFieldDialog();


  /**
   * <p>
   * Setter method for the COM property "EnableFieldDialog"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(58)
  void setEnableFieldDialog(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableWizard"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(59)
  boolean getEnableWizard();


  /**
   * <p>
   * Setter method for the COM property "EnableWizard"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(60)
  void setEnableWizard(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ErrorString"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(61)
  java.lang.String getErrorString();


  /**
   * <p>
   * Setter method for the COM property "ErrorString"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(62)
  void setErrorString(
    java.lang.String rhs);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type double
   */

  @VTID(63)
  double getData(
    java.lang.String name);


  /**
   */

  @VTID(64)
  void listFormulas();


  /**
   * <p>
   * Getter method for the COM property "ManualUpdate"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(65)
  boolean getManualUpdate();


  /**
   * <p>
   * Setter method for the COM property "ManualUpdate"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(66)
  void setManualUpdate(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MergeLabels"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(67)
  boolean getMergeLabels();


  /**
   * <p>
   * Setter method for the COM property "MergeLabels"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(68)
  void setMergeLabels(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "NullString"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(69)
  java.lang.String getNullString();


  /**
   * <p>
   * Setter method for the COM property "NullString"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(70)
  void setNullString(
    java.lang.String rhs);


  /**
   * @return  Returns a value of type excel.PivotCache
   */

  @VTID(71)
  excel.PivotCache pivotCache();


  /**
   * <p>
   * Getter method for the COM property "PivotFormulas"
   * </p>
   * @return  Returns a value of type excel.PivotFormulas
   */

  @VTID(72)
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

  @VTID(73)
  void pivotTableWizard(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object sourceType,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object sourceData,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object tableDestination,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object tableName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowGrand,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columnGrand,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object saveData,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object hasAutoFormat,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object autoPage,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object reserved,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object backgroundQuery,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object optimizeCache,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object pageFieldOrder,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object pageFieldWrapCount,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object readData,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object connection);


  /**
   * <p>
   * Getter method for the COM property "SubtotalHiddenPageItems"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(74)
  boolean getSubtotalHiddenPageItems();


  /**
   * <p>
   * Setter method for the COM property "SubtotalHiddenPageItems"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(75)
  void setSubtotalHiddenPageItems(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PageFieldOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(76)
  int getPageFieldOrder();


  /**
   * <p>
   * Setter method for the COM property "PageFieldOrder"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(77)
  void setPageFieldOrder(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "PageFieldStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(78)
  java.lang.String getPageFieldStyle();


  /**
   * <p>
   * Setter method for the COM property "PageFieldStyle"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(79)
  void setPageFieldStyle(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "PageFieldWrapCount"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(80)
  int getPageFieldWrapCount();


  /**
   * <p>
   * Setter method for the COM property "PageFieldWrapCount"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(81)
  void setPageFieldWrapCount(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "PreserveFormatting"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(82)
  boolean getPreserveFormatting();


  /**
   * <p>
   * Setter method for the COM property "PreserveFormatting"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(83)
  void setPreserveFormatting(
    boolean rhs);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param mode Optional parameter. Default value is 0
   */

  @VTID(84)
  void _PivotSelect(
    java.lang.String name,
    @Optional @DefaultValue("0") excel.XlPTSelectionMode mode);


  /**
   * <p>
   * Getter method for the COM property "PivotSelection"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(85)
  java.lang.String getPivotSelection();


  /**
   * <p>
   * Setter method for the COM property "PivotSelection"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(86)
  void setPivotSelection(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "SelectionMode"
   * </p>
   * @return  Returns a value of type excel.XlPTSelectionMode
   */

  @VTID(87)
  excel.XlPTSelectionMode getSelectionMode();


  /**
   * <p>
   * Setter method for the COM property "SelectionMode"
   * </p>
   * @param rhs Mandatory excel.XlPTSelectionMode parameter.
   */

  @VTID(88)
  void setSelectionMode(
    excel.XlPTSelectionMode rhs);


  /**
   * <p>
   * Getter method for the COM property "TableStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(89)
  java.lang.String getTableStyle();


  /**
   * <p>
   * Setter method for the COM property "TableStyle"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(90)
  void setTableStyle(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Tag"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(91)
  java.lang.String getTag();


  /**
   * <p>
   * Setter method for the COM property "Tag"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(92)
  void setTag(
    java.lang.String rhs);


  /**
   */

  @VTID(93)
  void update();


  /**
   * <p>
   * Getter method for the COM property "VacatedStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(94)
  java.lang.String getVacatedStyle();


  /**
   * <p>
   * Setter method for the COM property "VacatedStyle"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(95)
  void setVacatedStyle(
    java.lang.String rhs);


  /**
   * @param format Mandatory excel.XlPivotFormatType parameter.
   */

  @VTID(96)
  void format(
    excel.XlPivotFormatType format);


  /**
   * <p>
   * Getter method for the COM property "PrintTitles"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(97)
  boolean getPrintTitles();


  /**
   * <p>
   * Setter method for the COM property "PrintTitles"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(98)
  void setPrintTitles(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CubeFields"
   * </p>
   * @return  Returns a value of type excel.CubeFields
   */

  @VTID(99)
  excel.CubeFields getCubeFields();


  @VTID(99)
  @ReturnValue(defaultPropertyThrough={excel.CubeFields.class})
  excel.CubeField getCubeFields(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "GrandTotalName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(100)
  java.lang.String getGrandTotalName();


  /**
   * <p>
   * Setter method for the COM property "GrandTotalName"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(101)
  void setGrandTotalName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "SmallGrid"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(102)
  boolean getSmallGrid();


  /**
   * <p>
   * Setter method for the COM property "SmallGrid"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(103)
  void setSmallGrid(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RepeatItemsOnEachPrintedPage"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(104)
  boolean getRepeatItemsOnEachPrintedPage();


  /**
   * <p>
   * Setter method for the COM property "RepeatItemsOnEachPrintedPage"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(105)
  void setRepeatItemsOnEachPrintedPage(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TotalsAnnotation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(106)
  boolean getTotalsAnnotation();


  /**
   * <p>
   * Setter method for the COM property "TotalsAnnotation"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(107)
  void setTotalsAnnotation(
    boolean rhs);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param mode Optional parameter. Default value is 0
   * @param useStandardName Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(108)
  void pivotSelect(
    java.lang.String name,
    @Optional @DefaultValue("0") excel.XlPTSelectionMode mode,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object useStandardName);


  /**
   * <p>
   * Getter method for the COM property "PivotSelectionStandard"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(109)
  java.lang.String getPivotSelectionStandard();


  /**
   * <p>
   * Setter method for the COM property "PivotSelectionStandard"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(110)
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
   * @return  Returns a value of type excel.Range
   */

  @VTID(111)
  excel.Range getPivotData(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object dataField,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object field1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object item1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object field2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object item2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object field3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object item3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object field4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object item4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object field5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object item5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object field6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object item6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object field7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object item7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object field8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object item8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object field9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object item9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object field10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object item10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object field11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object item11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object field12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object item12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object field13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object item13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object field14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object item14);


  /**
   * <p>
   * Getter method for the COM property "DataPivotField"
   * </p>
   * @return  Returns a value of type excel.PivotField
   */

  @VTID(112)
  excel.PivotField getDataPivotField();


  /**
   * <p>
   * Getter method for the COM property "EnableDataValueEditing"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(113)
  boolean getEnableDataValueEditing();


  /**
   * <p>
   * Setter method for the COM property "EnableDataValueEditing"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(114)
  void setEnableDataValueEditing(
    boolean rhs);


  /**
   * @param field Mandatory com4j.Com4jObject parameter.
   * @param caption Optional parameter. Default value is com4j.Variant.getMissing()
   * @param function Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.PivotField
   */

  @VTID(115)
  excel.PivotField addDataField(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject field,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object caption,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object function);


  /**
   * <p>
   * Getter method for the COM property "MDX"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(116)
  java.lang.String getMDX();


  /**
   * <p>
   * Getter method for the COM property "ViewCalculatedMembers"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(117)
  boolean getViewCalculatedMembers();


  /**
   * <p>
   * Setter method for the COM property "ViewCalculatedMembers"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(118)
  void setViewCalculatedMembers(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CalculatedMembers"
   * </p>
   * @return  Returns a value of type excel.CalculatedMembers
   */

  @VTID(119)
  excel.CalculatedMembers getCalculatedMembers();


  /**
   * <p>
   * Getter method for the COM property "DisplayImmediateItems"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(120)
  boolean getDisplayImmediateItems();


  /**
   * <p>
   * Setter method for the COM property "DisplayImmediateItems"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(121)
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
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(122)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dummy15(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * <p>
   * Getter method for the COM property "EnableFieldList"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(123)
  boolean getEnableFieldList();


  /**
   * <p>
   * Setter method for the COM property "EnableFieldList"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(124)
  void setEnableFieldList(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "VisualTotals"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(125)
  boolean getVisualTotals();


  /**
   * <p>
   * Setter method for the COM property "VisualTotals"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(126)
  void setVisualTotals(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowPageMultipleItemLabel"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(127)
  boolean getShowPageMultipleItemLabel();


  /**
   * <p>
   * Setter method for the COM property "ShowPageMultipleItemLabel"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(128)
  void setShowPageMultipleItemLabel(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Version"
   * </p>
   * @return  Returns a value of type excel.XlPivotTableVersionList
   */

  @VTID(129)
  excel.XlPivotTableVersionList getVersion();


  /**
   * @param file Mandatory java.lang.String parameter.
   * @param measures Optional parameter. Default value is com4j.Variant.getMissing()
   * @param levels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param members Optional parameter. Default value is com4j.Variant.getMissing()
   * @param properties Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @VTID(130)
  java.lang.String createCubeFile(
    java.lang.String file,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object measures,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object levels,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object members,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object properties);


  /**
   * <p>
   * Getter method for the COM property "DisplayEmptyRow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(131)
  boolean getDisplayEmptyRow();


  /**
   * <p>
   * Setter method for the COM property "DisplayEmptyRow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(132)
  void setDisplayEmptyRow(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayEmptyColumn"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(133)
  boolean getDisplayEmptyColumn();


  /**
   * <p>
   * Setter method for the COM property "DisplayEmptyColumn"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(134)
  void setDisplayEmptyColumn(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowCellBackgroundFromOLAP"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(135)
  boolean getShowCellBackgroundFromOLAP();


  /**
   * <p>
   * Setter method for the COM property "ShowCellBackgroundFromOLAP"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(136)
  void setShowCellBackgroundFromOLAP(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PivotColumnAxis"
   * </p>
   * @return  Returns a value of type excel.PivotAxis
   */

  @VTID(137)
  excel.PivotAxis getPivotColumnAxis();


  /**
   * <p>
   * Getter method for the COM property "PivotRowAxis"
   * </p>
   * @return  Returns a value of type excel.PivotAxis
   */

  @VTID(138)
  excel.PivotAxis getPivotRowAxis();


  /**
   * <p>
   * Getter method for the COM property "ShowDrillIndicators"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(139)
  boolean getShowDrillIndicators();


  /**
   * <p>
   * Setter method for the COM property "ShowDrillIndicators"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(140)
  void setShowDrillIndicators(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintDrillIndicators"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(141)
  boolean getPrintDrillIndicators();


  /**
   * <p>
   * Setter method for the COM property "PrintDrillIndicators"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(142)
  void setPrintDrillIndicators(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayMemberPropertyTooltips"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(143)
  boolean getDisplayMemberPropertyTooltips();


  /**
   * <p>
   * Setter method for the COM property "DisplayMemberPropertyTooltips"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(144)
  void setDisplayMemberPropertyTooltips(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayContextTooltips"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(145)
  boolean getDisplayContextTooltips();


  /**
   * <p>
   * Setter method for the COM property "DisplayContextTooltips"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(146)
  void setDisplayContextTooltips(
    boolean rhs);


  /**
   */

  @VTID(147)
  void clearTable();


  /**
   * <p>
   * Getter method for the COM property "CompactRowIndent"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(148)
  int getCompactRowIndent();


  /**
   * <p>
   * Setter method for the COM property "CompactRowIndent"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(149)
  void setCompactRowIndent(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "LayoutRowDefault"
   * </p>
   * @return  Returns a value of type excel.XlLayoutRowType
   */

  @VTID(150)
  excel.XlLayoutRowType getLayoutRowDefault();


  /**
   * <p>
   * Setter method for the COM property "LayoutRowDefault"
   * </p>
   * @param rhs Mandatory excel.XlLayoutRowType parameter.
   */

  @VTID(151)
  void setLayoutRowDefault(
    excel.XlLayoutRowType rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayFieldCaptions"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(152)
  boolean getDisplayFieldCaptions();


  /**
   * <p>
   * Setter method for the COM property "DisplayFieldCaptions"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(153)
  void setDisplayFieldCaptions(
    boolean rhs);


  /**
   * @param rowLayout Mandatory excel.XlLayoutRowType parameter.
   */

  @VTID(154)
  void rowAxisLayout(
    excel.XlLayoutRowType rowLayout);


  /**
   * @param location Mandatory excel.XlSubtototalLocationType parameter.
   */

  @VTID(155)
  void subtotalLocation(
    excel.XlSubtototalLocationType location);


  /**
   * <p>
   * Getter method for the COM property "ActiveFilters"
   * </p>
   * @return  Returns a value of type excel.PivotFilters
   */

  @VTID(156)
  excel.PivotFilters getActiveFilters();


  /**
   * <p>
   * Getter method for the COM property "InGridDropZones"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(157)
  boolean getInGridDropZones();


  /**
   * <p>
   * Setter method for the COM property "InGridDropZones"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(158)
  void setInGridDropZones(
    boolean rhs);


  /**
   */

  @VTID(159)
  void clearAllFilters();


  /**
   * <p>
   * Getter method for the COM property "TableStyle2"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(160)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getTableStyle2();


  /**
   * <p>
   * Setter method for the COM property "TableStyle2"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(161)
  void setTableStyle2(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTableStyleLastColumn"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(162)
  boolean getShowTableStyleLastColumn();


  /**
   * <p>
   * Setter method for the COM property "ShowTableStyleLastColumn"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(163)
  void setShowTableStyleLastColumn(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTableStyleRowStripes"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(164)
  boolean getShowTableStyleRowStripes();


  /**
   * <p>
   * Setter method for the COM property "ShowTableStyleRowStripes"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(165)
  void setShowTableStyleRowStripes(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTableStyleColumnStripes"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(166)
  boolean getShowTableStyleColumnStripes();


  /**
   * <p>
   * Setter method for the COM property "ShowTableStyleColumnStripes"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(167)
  void setShowTableStyleColumnStripes(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTableStyleRowHeaders"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(168)
  boolean getShowTableStyleRowHeaders();


  /**
   * <p>
   * Setter method for the COM property "ShowTableStyleRowHeaders"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(169)
  void setShowTableStyleRowHeaders(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTableStyleColumnHeaders"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(170)
  boolean getShowTableStyleColumnHeaders();


  /**
   * <p>
   * Setter method for the COM property "ShowTableStyleColumnHeaders"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(171)
  void setShowTableStyleColumnHeaders(
    boolean rhs);


  /**
   * @param convertFilters Mandatory boolean parameter.
   */

  @VTID(172)
  void convertToFormulas(
    boolean convertFilters);


  /**
   * <p>
   * Getter method for the COM property "AllowMultipleFilters"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(173)
  boolean getAllowMultipleFilters();


  /**
   * <p>
   * Setter method for the COM property "AllowMultipleFilters"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(174)
  void setAllowMultipleFilters(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CompactLayoutRowHeader"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(175)
  java.lang.String getCompactLayoutRowHeader();


  /**
   * <p>
   * Setter method for the COM property "CompactLayoutRowHeader"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(176)
  void setCompactLayoutRowHeader(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "CompactLayoutColumnHeader"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(177)
  java.lang.String getCompactLayoutColumnHeader();


  /**
   * <p>
   * Setter method for the COM property "CompactLayoutColumnHeader"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(178)
  void setCompactLayoutColumnHeader(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "FieldListSortAscending"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(179)
  boolean getFieldListSortAscending();


  /**
   * <p>
   * Setter method for the COM property "FieldListSortAscending"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(180)
  void setFieldListSortAscending(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SortUsingCustomLists"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(181)
  boolean getSortUsingCustomLists();


  /**
   * <p>
   * Setter method for the COM property "SortUsingCustomLists"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(182)
  void setSortUsingCustomLists(
    boolean rhs);


  /**
   * @param conn Mandatory excel.WorkbookConnection parameter.
   */

  @VTID(183)
  void changeConnection(
    excel.WorkbookConnection conn);


  /**
   * @param pivotCache Mandatory java.lang.Object parameter.
   */

  @VTID(184)
  void changePivotCache(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pivotCache);


  /**
   * <p>
   * Getter method for the COM property "Location"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(185)
  java.lang.String getLocation();


  /**
   * <p>
   * Setter method for the COM property "Location"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(186)
  void setLocation(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableWriteback"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(187)
  boolean getEnableWriteback();


  /**
   * <p>
   * Setter method for the COM property "EnableWriteback"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(188)
  void setEnableWriteback(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Allocation"
   * </p>
   * @return  Returns a value of type excel.XlAllocation
   */

  @VTID(189)
  excel.XlAllocation getAllocation();


  /**
   * <p>
   * Setter method for the COM property "Allocation"
   * </p>
   * @param rhs Mandatory excel.XlAllocation parameter.
   */

  @VTID(190)
  void setAllocation(
    excel.XlAllocation rhs);


  /**
   * <p>
   * Getter method for the COM property "AllocationValue"
   * </p>
   * @return  Returns a value of type excel.XlAllocationValue
   */

  @VTID(191)
  excel.XlAllocationValue getAllocationValue();


  /**
   * <p>
   * Setter method for the COM property "AllocationValue"
   * </p>
   * @param rhs Mandatory excel.XlAllocationValue parameter.
   */

  @VTID(192)
  void setAllocationValue(
    excel.XlAllocationValue rhs);


  /**
   * <p>
   * Getter method for the COM property "AllocationMethod"
   * </p>
   * @return  Returns a value of type excel.XlAllocationMethod
   */

  @VTID(193)
  excel.XlAllocationMethod getAllocationMethod();


  /**
   * <p>
   * Setter method for the COM property "AllocationMethod"
   * </p>
   * @param rhs Mandatory excel.XlAllocationMethod parameter.
   */

  @VTID(194)
  void setAllocationMethod(
    excel.XlAllocationMethod rhs);


  /**
   * <p>
   * Getter method for the COM property "AllocationWeightExpression"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(195)
  java.lang.String getAllocationWeightExpression();


  /**
   * <p>
   * Setter method for the COM property "AllocationWeightExpression"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(196)
  void setAllocationWeightExpression(
    java.lang.String rhs);


  /**
   */

  @VTID(197)
  void allocateChanges();


  /**
   */

  @VTID(198)
  void commitChanges();


  /**
   */

  @VTID(199)
  void discardChanges();


  /**
   */

  @VTID(200)
  void refreshDataSourceValues();


  /**
   * @param repeat Mandatory excel.XlPivotFieldRepeatLabels parameter.
   */

  @VTID(201)
  void repeatAllLabels(
    excel.XlPivotFieldRepeatLabels repeat);


  /**
   * <p>
   * Getter method for the COM property "ChangeList"
   * </p>
   * @return  Returns a value of type excel.PivotTableChangeList
   */

  @VTID(202)
  excel.PivotTableChangeList getChangeList();


  /**
   * <p>
   * Getter method for the COM property "Slicers"
   * </p>
   * @return  Returns a value of type excel.Slicers
   */

  @VTID(203)
  excel.Slicers getSlicers();


  /**
   * <p>
   * Getter method for the COM property "AlternativeText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(204)
  java.lang.String getAlternativeText();


  /**
   * <p>
   * Setter method for the COM property "AlternativeText"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(205)
  void setAlternativeText(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Summary"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(206)
  java.lang.String getSummary();


  /**
   * <p>
   * Setter method for the COM property "Summary"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(207)
  void setSummary(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "VisualTotalsForSets"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(208)
  boolean getVisualTotalsForSets();


  /**
   * <p>
   * Setter method for the COM property "VisualTotalsForSets"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(209)
  void setVisualTotalsForSets(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowValuesRow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(210)
  boolean getShowValuesRow();


  /**
   * <p>
   * Setter method for the COM property "ShowValuesRow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(211)
  void setShowValuesRow(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CalculatedMembersInFilters"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(212)
  boolean getCalculatedMembersInFilters();


  /**
   * <p>
   * Setter method for the COM property "CalculatedMembersInFilters"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(213)
  void setCalculatedMembersInFilters(
    boolean rhs);


  // Properties:
}
