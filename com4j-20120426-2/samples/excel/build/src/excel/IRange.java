package excel  ;

import com4j.*;

@IID("{00020846-0001-0000-C000-000000000046}")
public interface IRange extends Com4jObject,Iterable<Com4jObject> {
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
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object activate();


  /**
   * <p>
   * Getter method for the COM property "AddIndent"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getAddIndent();


  /**
   * <p>
   * Setter method for the COM property "AddIndent"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(12)
  void setAddIndent(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Address"
   * </p>
   * @param rowAbsolute Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnAbsolute Optional parameter. Default value is com4j.Variant.getMissing()
   * @param referenceStyle Optional parameter. Default value is 1
   * @param external Optional parameter. Default value is com4j.Variant.getMissing()
   * @param relativeTo Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(13)
  java.lang.String getAddress(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowAbsolute,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columnAbsolute,
    @Optional @DefaultValue("1") excel.XlReferenceStyle referenceStyle,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object external,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object relativeTo,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "AddressLocal"
   * </p>
   * @param rowAbsolute Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnAbsolute Optional parameter. Default value is com4j.Variant.getMissing()
   * @param referenceStyle Optional parameter. Default value is 1
   * @param external Optional parameter. Default value is com4j.Variant.getMissing()
   * @param relativeTo Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @VTID(14)
  java.lang.String getAddressLocal(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowAbsolute,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columnAbsolute,
    @Optional @DefaultValue("1") excel.XlReferenceStyle referenceStyle,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object external,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object relativeTo);


  /**
   * @param action Mandatory excel.XlFilterAction parameter.
   * @param criteriaRange Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copyToRange Optional parameter. Default value is com4j.Variant.getMissing()
   * @param unique Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object advancedFilter(
    excel.XlFilterAction action,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object criteriaRange,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copyToRange,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object unique);


  /**
   * @param names Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreRelativeAbsolute Optional parameter. Default value is com4j.Variant.getMissing()
   * @param useRowColumnNames Optional parameter. Default value is com4j.Variant.getMissing()
   * @param omitColumn Optional parameter. Default value is com4j.Variant.getMissing()
   * @param omitRow Optional parameter. Default value is com4j.Variant.getMissing()
   * @param order Optional parameter. Default value is 1
   * @param appendLast Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object applyNames(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object names,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignoreRelativeAbsolute,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object useRowColumnNames,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object omitColumn,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object omitRow,
    @Optional @DefaultValue("1") excel.XlApplyNamesOrder order,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object appendLast);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object applyOutlineStyles();


  /**
   * <p>
   * Getter method for the COM property "Areas"
   * </p>
   * @return  Returns a value of type excel.Areas
   */

  @VTID(18)
  excel.Areas getAreas();


  /**
   * @param string Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(19)
  java.lang.String autoComplete(
    java.lang.String string);


  /**
   * @param destination Mandatory excel.Range parameter.
   * @param type Optional parameter. Default value is 0
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(20)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object autoFill(
    excel.Range destination,
    @Optional @DefaultValue("0") excel.XlAutoFillType type);


  /**
   * @param field Optional parameter. Default value is com4j.Variant.getMissing()
   * @param criteria1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param operator Optional parameter. Default value is 1
   * @param criteria2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param visibleDropDown Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(21)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object autoFilter(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object field,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object criteria1,
    @Optional @DefaultValue("1") excel.XlAutoFilterOperator operator,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object criteria2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object visibleDropDown);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(22)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object autoFit();


  /**
   * @param format Optional parameter. Default value is 1
   * @param number Optional parameter. Default value is com4j.Variant.getMissing()
   * @param font Optional parameter. Default value is com4j.Variant.getMissing()
   * @param alignment Optional parameter. Default value is com4j.Variant.getMissing()
   * @param border Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pattern Optional parameter. Default value is com4j.Variant.getMissing()
   * @param width Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(23)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object autoFormat(
    @Optional @DefaultValue("1") excel.XlRangeAutoFormat format,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object number,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object font,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object alignment,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object border,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object pattern,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object width);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(24)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object autoOutline();


  /**
   * @param lineStyle Optional parameter. Default value is com4j.Variant.getMissing()
   * @param weight Optional parameter. Default value is 2
   * @param colorIndex Optional parameter. Default value is -4105
   * @param color Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(25)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object _BorderAround(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object lineStyle,
    @Optional @DefaultValue("2") excel.XlBorderWeight weight,
    @Optional @DefaultValue("-4105") excel.XlColorIndex colorIndex,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object color);


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type excel.Borders
   */

  @VTID(26)
  excel.Borders getBorders();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(27)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object calculate();


  /**
   * <p>
   * Getter method for the COM property "Cells"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(28)
  excel.Range getCells();


  /**
   * <p>
   * Getter method for the COM property "Characters"
   * </p>
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   * @param length Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.Characters
   */

  @VTID(29)
  excel.Characters getCharacters(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object start,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object length);


  /**
   * @param customDictionary Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreUppercase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param alwaysSuggest Optional parameter. Default value is com4j.Variant.getMissing()
   * @param spellLang Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(30)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object checkSpelling(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object customDictionary,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignoreUppercase,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object alwaysSuggest,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object spellLang);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(31)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clear();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(32)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clearContents();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(33)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clearFormats();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(34)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clearNotes();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(35)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clearOutline();


  /**
   * <p>
   * Getter method for the COM property "Column"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(36)
  int getColumn();


  /**
   * @param comparison Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.Range
   */

  @VTID(37)
  excel.Range columnDifferences(
    @MarshalAs(NativeType.VARIANT) java.lang.Object comparison);


  /**
   * <p>
   * Getter method for the COM property "Columns"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(38)
  excel.Range getColumns();


  /**
   * <p>
   * Getter method for the COM property "ColumnWidth"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(39)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getColumnWidth();


  /**
   * <p>
   * Setter method for the COM property "ColumnWidth"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(40)
  void setColumnWidth(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @param sources Optional parameter. Default value is com4j.Variant.getMissing()
   * @param function Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topRow Optional parameter. Default value is com4j.Variant.getMissing()
   * @param leftColumn Optional parameter. Default value is com4j.Variant.getMissing()
   * @param createLinks Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(41)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object consolidate(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object sources,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object function,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topRow,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object leftColumn,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object createLinks);


  /**
   * @param destination Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(42)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object copy(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object destination);


  /**
   * @param data Mandatory com4j.Com4jObject parameter.
   * @param maxRows Optional parameter. Default value is com4j.Variant.getMissing()
   * @param maxColumns Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @VTID(43)
  int copyFromRecordset(
    com4j.Com4jObject data,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object maxRows,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object maxColumns);


  /**
   * @param appearance Optional parameter. Default value is 1
   * @param format Optional parameter. Default value is -4147
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(44)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object copyPicture(
    @Optional @DefaultValue("1") excel.XlPictureAppearance appearance,
    @Optional @DefaultValue("-4147") excel.XlCopyPictureFormat format);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(45)
  int getCount();


  /**
   * @param top Optional parameter. Default value is com4j.Variant.getMissing()
   * @param left Optional parameter. Default value is com4j.Variant.getMissing()
   * @param bottom Optional parameter. Default value is com4j.Variant.getMissing()
   * @param right Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(46)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object createNames(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object top,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object left,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object bottom,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object right);


  /**
   * @param edition Optional parameter. Default value is com4j.Variant.getMissing()
   * @param appearance Optional parameter. Default value is 1
   * @param containsPICT Optional parameter. Default value is com4j.Variant.getMissing()
   * @param containsBIFF Optional parameter. Default value is com4j.Variant.getMissing()
   * @param containsRTF Optional parameter. Default value is com4j.Variant.getMissing()
   * @param containsVALU Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(47)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object createPublisher(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object edition,
    @Optional @DefaultValue("1") excel.XlPictureAppearance appearance,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object containsPICT,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object containsBIFF,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object containsRTF,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object containsVALU);


  /**
   * <p>
   * Getter method for the COM property "CurrentArray"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(48)
  excel.Range getCurrentArray();


  /**
   * <p>
   * Getter method for the COM property "CurrentRegion"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(49)
  excel.Range getCurrentRegion();


  /**
   * @param destination Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(50)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object cut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object destination);


  /**
   * @param rowcol Optional parameter. Default value is com4j.Variant.getMissing()
   * @param type Optional parameter. Default value is -4132
   * @param date Optional parameter. Default value is 1
   * @param step Optional parameter. Default value is com4j.Variant.getMissing()
   * @param stop Optional parameter. Default value is com4j.Variant.getMissing()
   * @param trend Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(51)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dataSeries(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowcol,
    @Optional @DefaultValue("-4132") excel.XlDataSeriesType type,
    @Optional @DefaultValue("1") excel.XlDataSeriesDate date,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object step,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object stop,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object trend);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param rowIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(52)
  @DefaultMethod
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object get_Default(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowIndex,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columnIndex,
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "_Default"
   * </p>
   * @param rowIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(53)
  @DefaultMethod
  void set_Default(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowIndex,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columnIndex,
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @param shift Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(54)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object delete(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object shift);


  /**
   * <p>
   * Getter method for the COM property "Dependents"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(55)
  excel.Range getDependents();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(56)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dialogBox();


  /**
   * <p>
   * Getter method for the COM property "DirectDependents"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(57)
  excel.Range getDirectDependents();


  /**
   * <p>
   * Getter method for the COM property "DirectPrecedents"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(58)
  excel.Range getDirectPrecedents();


  /**
   * @param type Mandatory excel.XlEditionType parameter.
   * @param option Mandatory excel.XlEditionOptionsOption parameter.
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param reference Optional parameter. Default value is com4j.Variant.getMissing()
   * @param appearance Optional parameter. Default value is 1
   * @param chartSize Optional parameter. Default value is 1
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(59)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object editionOptions(
    excel.XlEditionType type,
    excel.XlEditionOptionsOption option,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object reference,
    @Optional @DefaultValue("1") excel.XlPictureAppearance appearance,
    @Optional @DefaultValue("1") excel.XlPictureAppearance chartSize,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object format);


  /**
   * <p>
   * Getter method for the COM property "End"
   * </p>
   * @param direction Mandatory excel.XlDirection parameter.
   * @return  Returns a value of type excel.Range
   */

  @VTID(60)
  excel.Range getEnd(
    excel.XlDirection direction);


  /**
   * <p>
   * Getter method for the COM property "EntireColumn"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(61)
  excel.Range getEntireColumn();


  /**
   * <p>
   * Getter method for the COM property "EntireRow"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(62)
  excel.Range getEntireRow();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(63)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object fillDown();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(64)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object fillLeft();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(65)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object fillRight();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(66)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object fillUp();


  /**
   * @param what Mandatory java.lang.Object parameter.
   * @param after Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lookIn Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lookAt Optional parameter. Default value is com4j.Variant.getMissing()
   * @param searchOrder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param searchDirection Optional parameter. Default value is 1
   * @param matchCase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchByte Optional parameter. Default value is com4j.Variant.getMissing()
   * @param searchFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.Range
   */

  @VTID(67)
  excel.Range find(
    @MarshalAs(NativeType.VARIANT) java.lang.Object what,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object after,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object lookIn,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object lookAt,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object searchOrder,
    @Optional @DefaultValue("1") excel.XlSearchDirection searchDirection,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object matchCase,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object matchByte,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object searchFormat);


  /**
   * @param after Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.Range
   */

  @VTID(68)
  excel.Range findNext(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object after);


  /**
   * @param after Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.Range
   */

  @VTID(69)
  excel.Range findPrevious(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object after);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type excel.Font
   */

  @VTID(70)
  excel.Font getFont();


  /**
   * <p>
   * Getter method for the COM property "Formula"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(71)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getFormula(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Formula"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(72)
  void setFormula(
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaArray"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(73)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getFormulaArray();


  /**
   * <p>
   * Setter method for the COM property "FormulaArray"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(74)
  void setFormulaArray(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaLabel"
   * </p>
   * @return  Returns a value of type excel.XlFormulaLabel
   */

  @VTID(75)
  excel.XlFormulaLabel getFormulaLabel();


  /**
   * <p>
   * Setter method for the COM property "FormulaLabel"
   * </p>
   * @param rhs Mandatory excel.XlFormulaLabel parameter.
   */

  @VTID(76)
  void setFormulaLabel(
    excel.XlFormulaLabel rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaHidden"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(77)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getFormulaHidden();


  /**
   * <p>
   * Setter method for the COM property "FormulaHidden"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(78)
  void setFormulaHidden(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaLocal"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(79)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getFormulaLocal();


  /**
   * <p>
   * Setter method for the COM property "FormulaLocal"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(80)
  void setFormulaLocal(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaR1C1"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(81)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getFormulaR1C1(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "FormulaR1C1"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(82)
  void setFormulaR1C1(
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaR1C1Local"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(83)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getFormulaR1C1Local();


  /**
   * <p>
   * Setter method for the COM property "FormulaR1C1Local"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(84)
  void setFormulaR1C1Local(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(85)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object functionWizard();


  /**
   * @param goal Mandatory java.lang.Object parameter.
   * @param changingCell Mandatory excel.Range parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(86)
  boolean goalSeek(
    @MarshalAs(NativeType.VARIANT) java.lang.Object goal,
    excel.Range changingCell);


  /**
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   * @param end Optional parameter. Default value is com4j.Variant.getMissing()
   * @param by Optional parameter. Default value is com4j.Variant.getMissing()
   * @param periods Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(87)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object group(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object start,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object end,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object by,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object periods);


  /**
   * <p>
   * Getter method for the COM property "HasArray"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(88)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getHasArray();


  /**
   * <p>
   * Getter method for the COM property "HasFormula"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(89)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getHasFormula();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(90)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getHeight();


  /**
   * <p>
   * Getter method for the COM property "Hidden"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(91)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getHidden();


  /**
   * <p>
   * Setter method for the COM property "Hidden"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(92)
  void setHidden(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "HorizontalAlignment"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(93)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getHorizontalAlignment();


  /**
   * <p>
   * Setter method for the COM property "HorizontalAlignment"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(94)
  void setHorizontalAlignment(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "IndentLevel"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(95)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getIndentLevel();


  /**
   * <p>
   * Setter method for the COM property "IndentLevel"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(96)
  void setIndentLevel(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @param insertAmount Mandatory int parameter.
   */

  @VTID(97)
  void insertIndent(
    int insertAmount);


  /**
   * @param shift Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copyOrigin Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(98)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object insert(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object shift,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copyOrigin);


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type excel.Interior
   */

  @VTID(99)
  excel.Interior getInterior();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param rowIndex Mandatory java.lang.Object parameter.
   * @param columnIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(100)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getItem(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rowIndex,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columnIndex,
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Item"
   * </p>
   * @param rowIndex Mandatory java.lang.Object parameter.
   * @param columnIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(101)
  void setItem(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rowIndex,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columnIndex,
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(102)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object justify();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(103)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getLeft();


  /**
   * <p>
   * Getter method for the COM property "ListHeaderRows"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(104)
  int getListHeaderRows();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(105)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object listNames();


  /**
   * <p>
   * Getter method for the COM property "LocationInTable"
   * </p>
   * @return  Returns a value of type excel.XlLocationInTable
   */

  @VTID(106)
  excel.XlLocationInTable getLocationInTable();


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(107)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getLocked();


  /**
   * <p>
   * Setter method for the COM property "Locked"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(108)
  void setLocked(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @param across Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(109)
  void merge(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object across);


  /**
   */

  @VTID(110)
  void unMerge();


  /**
   * <p>
   * Getter method for the COM property "MergeArea"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(111)
  excel.Range getMergeArea();


  /**
   * <p>
   * Getter method for the COM property "MergeCells"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(112)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getMergeCells();


  /**
   * <p>
   * Setter method for the COM property "MergeCells"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(113)
  void setMergeCells(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(114)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getName();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(115)
  void setName(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @param towardPrecedent Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arrowNumber Optional parameter. Default value is com4j.Variant.getMissing()
   * @param linkNumber Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(116)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object navigateArrow(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object towardPrecedent,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arrowNumber,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object linkNumber);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(117)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(118)
  excel.Range getNext();


  /**
   * @param text Optional parameter. Default value is com4j.Variant.getMissing()
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   * @param length Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @VTID(119)
  java.lang.String noteText(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object text,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object start,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object length);


  /**
   * <p>
   * Getter method for the COM property "NumberFormat"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(120)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getNumberFormat();


  /**
   * <p>
   * Setter method for the COM property "NumberFormat"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(121)
  void setNumberFormat(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "NumberFormatLocal"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(122)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getNumberFormatLocal();


  /**
   * <p>
   * Setter method for the COM property "NumberFormatLocal"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(123)
  void setNumberFormatLocal(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Offset"
   * </p>
   * @param rowOffset Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnOffset Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.Range
   */

  @VTID(124)
  excel.Range getOffset(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowOffset,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columnOffset);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(125)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getOrientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(126)
  void setOrientation(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "OutlineLevel"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(127)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getOutlineLevel();


  /**
   * <p>
   * Setter method for the COM property "OutlineLevel"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(128)
  void setOutlineLevel(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "PageBreak"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(129)
  int getPageBreak();


  /**
   * <p>
   * Setter method for the COM property "PageBreak"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(130)
  void setPageBreak(
    int rhs);


  /**
   * @param parseLine Optional parameter. Default value is com4j.Variant.getMissing()
   * @param destination Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(131)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object parse(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object parseLine,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object destination);


  /**
   * @param paste Optional parameter. Default value is -4104
   * @param operation Optional parameter. Default value is -4142
   * @param skipBlanks Optional parameter. Default value is com4j.Variant.getMissing()
   * @param transpose Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(132)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object _PasteSpecial(
    @Optional @DefaultValue("-4104") excel.XlPasteType paste,
    @Optional @DefaultValue("-4142") excel.XlPasteSpecialOperation operation,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object skipBlanks,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object transpose);


  /**
   * <p>
   * Getter method for the COM property "PivotField"
   * </p>
   * @return  Returns a value of type excel.PivotField
   */

  @VTID(133)
  excel.PivotField getPivotField();


  /**
   * <p>
   * Getter method for the COM property "PivotItem"
   * </p>
   * @return  Returns a value of type excel.PivotItem
   */

  @VTID(134)
  excel.PivotItem getPivotItem();


  /**
   * <p>
   * Getter method for the COM property "PivotTable"
   * </p>
   * @return  Returns a value of type excel.PivotTable
   */

  @VTID(135)
  excel.PivotTable getPivotTable();


  /**
   * <p>
   * Getter method for the COM property "Precedents"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(136)
  excel.Range getPrecedents();


  /**
   * <p>
   * Getter method for the COM property "PrefixCharacter"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(137)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getPrefixCharacter();


  /**
   * <p>
   * Getter method for the COM property "Previous"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(138)
  excel.Range getPrevious();


  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(139)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object __PrintOut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copies,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object preview,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object activePrinter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object printToFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object collate);


  /**
   * @param enableChanges Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(140)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object printPreview(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object enableChanges);


  /**
   * <p>
   * Getter method for the COM property "QueryTable"
   * </p>
   * @return  Returns a value of type excel._QueryTable
   */

  @VTID(141)
  excel._QueryTable getQueryTable();


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @param cell1 Mandatory java.lang.Object parameter.
   * @param cell2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.Range
   */

  @VTID(142)
  excel.Range getRange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object cell1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object cell2);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(143)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object removeSubtotal();


  /**
   * @param what Mandatory java.lang.Object parameter.
   * @param replacement Mandatory java.lang.Object parameter.
   * @param lookAt Optional parameter. Default value is com4j.Variant.getMissing()
   * @param searchOrder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchCase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchByte Optional parameter. Default value is com4j.Variant.getMissing()
   * @param searchFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param replaceFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @VTID(144)
  boolean replace(
    @MarshalAs(NativeType.VARIANT) java.lang.Object what,
    @MarshalAs(NativeType.VARIANT) java.lang.Object replacement,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object lookAt,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object searchOrder,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object matchCase,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object matchByte,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object searchFormat,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object replaceFormat);


  /**
   * <p>
   * Getter method for the COM property "Resize"
   * </p>
   * @param rowSize Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnSize Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.Range
   */

  @VTID(145)
  excel.Range getResize(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowSize,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columnSize);


  /**
   * <p>
   * Getter method for the COM property "Row"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(146)
  int getRow();


  /**
   * @param comparison Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.Range
   */

  @VTID(147)
  excel.Range rowDifferences(
    @MarshalAs(NativeType.VARIANT) java.lang.Object comparison);


  /**
   * <p>
   * Getter method for the COM property "RowHeight"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(148)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getRowHeight();


  /**
   * <p>
   * Setter method for the COM property "RowHeight"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(149)
  void setRowHeight(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Rows"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(150)
  excel.Range getRows();


  /**
   * @param arg1 Optional parameter. Default value is com4j.Variant.getMissing()
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

  @VTID(151)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object run(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
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
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(152)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(153)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object show();


  /**
   * @param remove Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(154)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object showDependents(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object remove);


  /**
   * <p>
   * Getter method for the COM property "ShowDetail"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(155)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getShowDetail();


  /**
   * <p>
   * Setter method for the COM property "ShowDetail"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(156)
  void setShowDetail(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(157)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object showErrors();


  /**
   * @param remove Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(158)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object showPrecedents(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object remove);


  /**
   * <p>
   * Getter method for the COM property "ShrinkToFit"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(159)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getShrinkToFit();


  /**
   * <p>
   * Setter method for the COM property "ShrinkToFit"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(160)
  void setShrinkToFit(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @param key1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param order1 Optional parameter. Default value is 1
   * @param key2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param order2 Optional parameter. Default value is 1
   * @param key3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param order3 Optional parameter. Default value is 1
   * @param header Optional parameter. Default value is 2
   * @param orderCustom Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchCase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param orientation Optional parameter. Default value is 2
   * @param sortMethod Optional parameter. Default value is 1
   * @param dataOption1 Optional parameter. Default value is 0
   * @param dataOption2 Optional parameter. Default value is 0
   * @param dataOption3 Optional parameter. Default value is 0
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(161)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object sort(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object key1,
    @Optional @DefaultValue("1") excel.XlSortOrder order1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object key2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type,
    @Optional @DefaultValue("1") excel.XlSortOrder order2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object key3,
    @Optional @DefaultValue("1") excel.XlSortOrder order3,
    @Optional @DefaultValue("2") excel.XlYesNoGuess header,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object orderCustom,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object matchCase,
    @Optional @DefaultValue("2") excel.XlSortOrientation orientation,
    @Optional @DefaultValue("1") excel.XlSortMethod sortMethod,
    @Optional @DefaultValue("0") excel.XlSortDataOption dataOption1,
    @Optional @DefaultValue("0") excel.XlSortDataOption dataOption2,
    @Optional @DefaultValue("0") excel.XlSortDataOption dataOption3);


  /**
   * @param sortMethod Optional parameter. Default value is 1
   * @param key1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param order1 Optional parameter. Default value is 1
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param key2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param order2 Optional parameter. Default value is 1
   * @param key3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param order3 Optional parameter. Default value is 1
   * @param header Optional parameter. Default value is 2
   * @param orderCustom Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchCase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param orientation Optional parameter. Default value is 2
   * @param dataOption1 Optional parameter. Default value is 0
   * @param dataOption2 Optional parameter. Default value is 0
   * @param dataOption3 Optional parameter. Default value is 0
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(162)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object sortSpecial(
    @Optional @DefaultValue("1") excel.XlSortMethod sortMethod,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object key1,
    @Optional @DefaultValue("1") excel.XlSortOrder order1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object key2,
    @Optional @DefaultValue("1") excel.XlSortOrder order2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object key3,
    @Optional @DefaultValue("1") excel.XlSortOrder order3,
    @Optional @DefaultValue("2") excel.XlYesNoGuess header,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object orderCustom,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object matchCase,
    @Optional @DefaultValue("2") excel.XlSortOrientation orientation,
    @Optional @DefaultValue("0") excel.XlSortDataOption dataOption1,
    @Optional @DefaultValue("0") excel.XlSortDataOption dataOption2,
    @Optional @DefaultValue("0") excel.XlSortDataOption dataOption3);


  /**
   * <p>
   * Getter method for the COM property "SoundNote"
   * </p>
   * @return  Returns a value of type excel.SoundNote
   */

  @VTID(163)
  excel.SoundNote getSoundNote();


  /**
   * @param type Mandatory excel.XlCellType parameter.
   * @param value Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.Range
   */

  @VTID(164)
  excel.Range specialCells(
    excel.XlCellType type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(165)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getStyle();


  /**
   * <p>
   * Setter method for the COM property "Style"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(166)
  void setStyle(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @param edition Mandatory java.lang.String parameter.
   * @param format Optional parameter. Default value is -4158
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(167)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object subscribeTo(
    java.lang.String edition,
    @Optional @DefaultValue("-4158") excel.XlSubscribeToFormat format);


  /**
   * @param groupBy Mandatory int parameter.
   * @param function Mandatory excel.XlConsolidationFunction parameter.
   * @param totalList Mandatory java.lang.Object parameter.
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pageBreaks Optional parameter. Default value is com4j.Variant.getMissing()
   * @param summaryBelowData Optional parameter. Default value is 1
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(168)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object subtotal(
    int groupBy,
    excel.XlConsolidationFunction function,
    @MarshalAs(NativeType.VARIANT) java.lang.Object totalList,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object replace,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object pageBreaks,
    @Optional @DefaultValue("1") excel.XlSummaryRow summaryBelowData);


  /**
   * <p>
   * Getter method for the COM property "Summary"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(169)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getSummary();


  /**
   * @param rowInput Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnInput Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(170)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object table(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowInput,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columnInput);


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(171)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getText();


  /**
   * @param destination Optional parameter. Default value is com4j.Variant.getMissing()
   * @param dataType Optional parameter. Default value is 1
   * @param textQualifier Optional parameter. Default value is 1
   * @param consecutiveDelimiter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param tab Optional parameter. Default value is com4j.Variant.getMissing()
   * @param semicolon Optional parameter. Default value is com4j.Variant.getMissing()
   * @param comma Optional parameter. Default value is com4j.Variant.getMissing()
   * @param space Optional parameter. Default value is com4j.Variant.getMissing()
   * @param other Optional parameter. Default value is com4j.Variant.getMissing()
   * @param otherChar Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fieldInfo Optional parameter. Default value is com4j.Variant.getMissing()
   * @param decimalSeparator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param thousandsSeparator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param trailingMinusNumbers Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(172)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object textToColumns(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object destination,
    @Optional @DefaultValue("1") excel.XlTextParsingType dataType,
    @Optional @DefaultValue("1") excel.XlTextQualifier textQualifier,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object consecutiveDelimiter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object tab,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object semicolon,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object comma,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object space,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object other,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object otherChar,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fieldInfo,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object decimalSeparator,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object thousandsSeparator,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object trailingMinusNumbers);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(173)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getTop();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(174)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ungroup();


  /**
   * <p>
   * Getter method for the COM property "UseStandardHeight"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(175)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getUseStandardHeight();


  /**
   * <p>
   * Setter method for the COM property "UseStandardHeight"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(176)
  void setUseStandardHeight(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "UseStandardWidth"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(177)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getUseStandardWidth();


  /**
   * <p>
   * Setter method for the COM property "UseStandardWidth"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(178)
  void setUseStandardWidth(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Validation"
   * </p>
   * @return  Returns a value of type excel.Validation
   */

  @VTID(179)
  excel.Validation getValidation();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @param rangeValueDataType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(180)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getValue(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rangeValueDataType,
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param rangeValueDataType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(181)
  void setValue(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rangeValueDataType,
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Value2"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(182)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getValue2(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Value2"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(183)
  void setValue2(
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "VerticalAlignment"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(184)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getVerticalAlignment();


  /**
   * <p>
   * Setter method for the COM property "VerticalAlignment"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(185)
  void setVerticalAlignment(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(186)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getWidth();


  /**
   * <p>
   * Getter method for the COM property "Worksheet"
   * </p>
   * @return  Returns a value of type excel._Worksheet
   */

  @VTID(187)
  excel._Worksheet getWorksheet();


  /**
   * <p>
   * Getter method for the COM property "WrapText"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(188)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getWrapText();


  /**
   * <p>
   * Setter method for the COM property "WrapText"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(189)
  void setWrapText(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @param text Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.Comment
   */

  @VTID(190)
  excel.Comment addComment(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object text);


  /**
   * <p>
   * Getter method for the COM property "Comment"
   * </p>
   * @return  Returns a value of type excel.Comment
   */

  @VTID(191)
  excel.Comment getComment();


  /**
   */

  @VTID(192)
  void clearComments();


  /**
   * <p>
   * Getter method for the COM property "Phonetic"
   * </p>
   * @return  Returns a value of type excel.Phonetic
   */

  @VTID(193)
  excel.Phonetic getPhonetic();


  /**
   * <p>
   * Getter method for the COM property "FormatConditions"
   * </p>
   * @return  Returns a value of type excel.FormatConditions
   */

  @VTID(194)
  excel.FormatConditions getFormatConditions();


  /**
   * <p>
   * Getter method for the COM property "ReadingOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(195)
  int getReadingOrder();


  /**
   * <p>
   * Setter method for the COM property "ReadingOrder"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(196)
  void setReadingOrder(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Hyperlinks"
   * </p>
   * @return  Returns a value of type excel.Hyperlinks
   */

  @VTID(197)
  excel.Hyperlinks getHyperlinks();


  /**
   * <p>
   * Getter method for the COM property "Phonetics"
   * </p>
   * @return  Returns a value of type excel.Phonetics
   */

  @VTID(198)
  excel.Phonetics getPhonetics();


  /**
   */

  @VTID(199)
  void setPhonetic();


  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(200)
  java.lang.String getID();


  /**
   * <p>
   * Setter method for the COM property "ID"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(201)
  void setID(
    java.lang.String rhs);


  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param prToFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(202)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object _PrintOut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copies,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object preview,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object activePrinter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object printToFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object collate,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object prToFileName);


  /**
   * <p>
   * Getter method for the COM property "PivotCell"
   * </p>
   * @return  Returns a value of type excel.PivotCell
   */

  @VTID(203)
  excel.PivotCell getPivotCell();


  /**
   */

  @VTID(204)
  void dirty();


  /**
   * <p>
   * Getter method for the COM property "Errors"
   * </p>
   * @return  Returns a value of type excel.Errors
   */

  @VTID(205)
  excel.Errors getErrors();


  /**
   * <p>
   * Getter method for the COM property "SmartTags"
   * </p>
   * @return  Returns a value of type excel.SmartTags
   */

  @VTID(206)
  excel.SmartTags getSmartTags();


  /**
   * @param speakDirection Optional parameter. Default value is com4j.Variant.getMissing()
   * @param speakFormulas Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(207)
  void speak(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object speakDirection,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object speakFormulas);


  /**
   * @param paste Optional parameter. Default value is -4104
   * @param operation Optional parameter. Default value is -4142
   * @param skipBlanks Optional parameter. Default value is com4j.Variant.getMissing()
   * @param transpose Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(208)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object pasteSpecial(
    @Optional @DefaultValue("-4104") excel.XlPasteType paste,
    @Optional @DefaultValue("-4142") excel.XlPasteSpecialOperation operation,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object skipBlanks,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object transpose);


  /**
   * <p>
   * Getter method for the COM property "AllowEdit"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(209)
  boolean getAllowEdit();


  /**
   * <p>
   * Getter method for the COM property "ListObject"
   * </p>
   * @return  Returns a value of type excel.ListObject
   */

  @VTID(210)
  excel.ListObject getListObject();


  /**
   * <p>
   * Getter method for the COM property "XPath"
   * </p>
   * @return  Returns a value of type excel.XPath
   */

  @VTID(211)
  excel.XPath getXPath();


  /**
   * <p>
   * Getter method for the COM property "ServerActions"
   * </p>
   * @return  Returns a value of type excel.Actions
   */

  @VTID(212)
  excel.Actions getServerActions();


  /**
   * @param columns Optional parameter. Default value is com4j.Variant.getMissing()
   * @param header Optional parameter. Default value is 2
   */

  @VTID(213)
  void removeDuplicates(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columns,
    @Optional @DefaultValue("2") excel.XlYesNoGuess header);


  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param prToFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(214)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object printOut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copies,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object preview,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object activePrinter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object printToFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object collate,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object prToFileName);


  /**
   * <p>
   * Getter method for the COM property "MDX"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(215)
  java.lang.String getMDX();


  /**
   * @param type Mandatory excel.XlFixedFormatType parameter.
   * @param filename Optional parameter. Default value is com4j.Variant.getMissing()
   * @param quality Optional parameter. Default value is com4j.Variant.getMissing()
   * @param includeDocProperties Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignorePrintAreas Optional parameter. Default value is com4j.Variant.getMissing()
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param openAfterPublish Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fixedFormatExtClassPtr Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(216)
  void exportAsFixedFormat(
    excel.XlFixedFormatType type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object quality,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object includeDocProperties,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignorePrintAreas,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object openAfterPublish,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fixedFormatExtClassPtr);


  /**
   * <p>
   * Getter method for the COM property "CountLarge"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(217)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getCountLarge();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(218)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object calculateRowMajorOrder();


  /**
   * <p>
   * Getter method for the COM property "SparklineGroups"
   * </p>
   * @return  Returns a value of type excel.SparklineGroups
   */

  @VTID(219)
  excel.SparklineGroups getSparklineGroups();


  /**
   */

  @VTID(220)
  void clearHyperlinks();


  /**
   * <p>
   * Getter method for the COM property "DisplayFormat"
   * </p>
   * @return  Returns a value of type excel.DisplayFormat
   */

  @VTID(221)
  excel.DisplayFormat getDisplayFormat();


  /**
   * @param lineStyle Optional parameter. Default value is com4j.Variant.getMissing()
   * @param weight Optional parameter. Default value is 2
   * @param colorIndex Optional parameter. Default value is -4105
   * @param color Optional parameter. Default value is com4j.Variant.getMissing()
   * @param themeColor Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(222)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object borderAround(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object lineStyle,
    @Optional @DefaultValue("2") excel.XlBorderWeight weight,
    @Optional @DefaultValue("-4105") excel.XlColorIndex colorIndex,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object color,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object themeColor);


  /**
   */

  @VTID(223)
  void allocateChanges();


  /**
   */

  @VTID(224)
  void discardChanges();


  // Properties:
}
