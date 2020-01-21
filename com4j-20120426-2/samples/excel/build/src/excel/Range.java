package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Range extends Com4jObject,Iterable<Com4jObject> {
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

  @DISPID(304)
  java.lang.Object activate();


  /**
   * <p>
   * Getter method for the COM property "AddIndent"
   * </p>
   */

  @DISPID(1063)
  @PropGet
  java.lang.Object getAddIndent();


  /**
   * <p>
   * Setter method for the COM property "AddIndent"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1063)
  @PropPut
  void setAddIndent(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Address"
   * </p>
   * @param rowAbsolute Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnAbsolute Optional parameter. Default value is com4j.Variant.getMissing()
   * @param referenceStyle Optional parameter. Default value is 1
   * @param external Optional parameter. Default value is com4j.Variant.getMissing()
   * @param relativeTo Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(236)
  @PropGet
  java.lang.String getAddress(
    @Optional java.lang.Object rowAbsolute,
    @Optional java.lang.Object columnAbsolute,
    @Optional @DefaultValue("1") excel.XlReferenceStyle referenceStyle,
    @Optional java.lang.Object external,
    @Optional java.lang.Object relativeTo);


  /**
   * <p>
   * Getter method for the COM property "AddressLocal"
   * </p>
   * @param rowAbsolute Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnAbsolute Optional parameter. Default value is com4j.Variant.getMissing()
   * @param referenceStyle Optional parameter. Default value is 1
   * @param external Optional parameter. Default value is com4j.Variant.getMissing()
   * @param relativeTo Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(437)
  @PropGet
  java.lang.String getAddressLocal(
    @Optional java.lang.Object rowAbsolute,
    @Optional java.lang.Object columnAbsolute,
    @Optional @DefaultValue("1") excel.XlReferenceStyle referenceStyle,
    @Optional java.lang.Object external,
    @Optional java.lang.Object relativeTo);


  /**
   * @param action Mandatory excel.XlFilterAction parameter.
   * @param criteriaRange Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copyToRange Optional parameter. Default value is com4j.Variant.getMissing()
   * @param unique Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(876)
  java.lang.Object advancedFilter(
    excel.XlFilterAction action,
    @Optional java.lang.Object criteriaRange,
    @Optional java.lang.Object copyToRange,
    @Optional java.lang.Object unique);


  /**
   * @param names Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreRelativeAbsolute Optional parameter. Default value is com4j.Variant.getMissing()
   * @param useRowColumnNames Optional parameter. Default value is com4j.Variant.getMissing()
   * @param omitColumn Optional parameter. Default value is com4j.Variant.getMissing()
   * @param omitRow Optional parameter. Default value is com4j.Variant.getMissing()
   * @param order Optional parameter. Default value is 1
   * @param appendLast Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(441)
  java.lang.Object applyNames(
    @Optional java.lang.Object names,
    @Optional java.lang.Object ignoreRelativeAbsolute,
    @Optional java.lang.Object useRowColumnNames,
    @Optional java.lang.Object omitColumn,
    @Optional java.lang.Object omitRow,
    @Optional @DefaultValue("1") excel.XlApplyNamesOrder order,
    @Optional java.lang.Object appendLast);


  /**
   */

  @DISPID(448)
  java.lang.Object applyOutlineStyles();


  /**
   * <p>
   * Getter method for the COM property "Areas"
   * </p>
   */

  @DISPID(568)
  @PropGet
  excel.Areas getAreas();


  /**
   * @param string Mandatory java.lang.String parameter.
   */

  @DISPID(1185)
  java.lang.String autoComplete(
    java.lang.String string);


  /**
   * @param destination Mandatory excel.Range parameter.
   * @param type Optional parameter. Default value is 0
   */

  @DISPID(449)
  java.lang.Object autoFill(
    excel.Range destination,
    @Optional @DefaultValue("0") excel.XlAutoFillType type);


  /**
   * @param field Optional parameter. Default value is com4j.Variant.getMissing()
   * @param criteria1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param operator Optional parameter. Default value is 1
   * @param criteria2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param visibleDropDown Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(793)
  java.lang.Object autoFilter(
    @Optional java.lang.Object field,
    @Optional java.lang.Object criteria1,
    @Optional @DefaultValue("1") excel.XlAutoFilterOperator operator,
    @Optional java.lang.Object criteria2,
    @Optional java.lang.Object visibleDropDown);


  /**
   */

  @DISPID(237)
  java.lang.Object autoFit();


  /**
   * @param format Optional parameter. Default value is 1
   * @param number Optional parameter. Default value is com4j.Variant.getMissing()
   * @param font Optional parameter. Default value is com4j.Variant.getMissing()
   * @param alignment Optional parameter. Default value is com4j.Variant.getMissing()
   * @param border Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pattern Optional parameter. Default value is com4j.Variant.getMissing()
   * @param width Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(114)
  java.lang.Object autoFormat(
    @Optional @DefaultValue("1") excel.XlRangeAutoFormat format,
    @Optional java.lang.Object number,
    @Optional java.lang.Object font,
    @Optional java.lang.Object alignment,
    @Optional java.lang.Object border,
    @Optional java.lang.Object pattern,
    @Optional java.lang.Object width);


  /**
   */

  @DISPID(1036)
  java.lang.Object autoOutline();


  /**
   * @param lineStyle Optional parameter. Default value is com4j.Variant.getMissing()
   * @param weight Optional parameter. Default value is 2
   * @param colorIndex Optional parameter. Default value is -4105
   * @param color Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1067)
  java.lang.Object _BorderAround(
    @Optional java.lang.Object lineStyle,
    @Optional @DefaultValue("2") excel.XlBorderWeight weight,
    @Optional @DefaultValue("-4105") excel.XlColorIndex colorIndex,
    @Optional java.lang.Object color);


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   */

  @DISPID(435)
  @PropGet
  excel.Borders getBorders();


  /**
   */

  @DISPID(279)
  java.lang.Object calculate();


  /**
   * <p>
   * Getter method for the COM property "Cells"
   * </p>
   */

  @DISPID(238)
  @PropGet
  excel.Range getCells();


  /**
   * <p>
   * Getter method for the COM property "Characters"
   * </p>
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   * @param length Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(603)
  @PropGet
  excel.Characters getCharacters(
    @Optional java.lang.Object start,
    @Optional java.lang.Object length);


  /**
   * @param customDictionary Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreUppercase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param alwaysSuggest Optional parameter. Default value is com4j.Variant.getMissing()
   * @param spellLang Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(505)
  java.lang.Object checkSpelling(
    @Optional java.lang.Object customDictionary,
    @Optional java.lang.Object ignoreUppercase,
    @Optional java.lang.Object alwaysSuggest,
    @Optional java.lang.Object spellLang);


  /**
   */

  @DISPID(111)
  java.lang.Object clear();


  /**
   */

  @DISPID(113)
  java.lang.Object clearContents();


  /**
   */

  @DISPID(112)
  java.lang.Object clearFormats();


  /**
   */

  @DISPID(239)
  java.lang.Object clearNotes();


  /**
   */

  @DISPID(1037)
  java.lang.Object clearOutline();


  /**
   * <p>
   * Getter method for the COM property "Column"
   * </p>
   */

  @DISPID(240)
  @PropGet
  int getColumn();


  /**
   * @param comparison Mandatory java.lang.Object parameter.
   */

  @DISPID(510)
  excel.Range columnDifferences(
    java.lang.Object comparison);


  /**
   * <p>
   * Getter method for the COM property "Columns"
   * </p>
   */

  @DISPID(241)
  @PropGet
  excel.Range getColumns();


  /**
   * <p>
   * Getter method for the COM property "ColumnWidth"
   * </p>
   */

  @DISPID(242)
  @PropGet
  java.lang.Object getColumnWidth();


  /**
   * <p>
   * Setter method for the COM property "ColumnWidth"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(242)
  @PropPut
  void setColumnWidth(
    java.lang.Object rhs);


  /**
   * @param sources Optional parameter. Default value is com4j.Variant.getMissing()
   * @param function Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topRow Optional parameter. Default value is com4j.Variant.getMissing()
   * @param leftColumn Optional parameter. Default value is com4j.Variant.getMissing()
   * @param createLinks Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(482)
  java.lang.Object consolidate(
    @Optional java.lang.Object sources,
    @Optional java.lang.Object function,
    @Optional java.lang.Object topRow,
    @Optional java.lang.Object leftColumn,
    @Optional java.lang.Object createLinks);


  /**
   * @param destination Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(551)
  java.lang.Object copy(
    @Optional java.lang.Object destination);


  /**
   * @param data Mandatory com4j.Com4jObject parameter.
   * @param maxRows Optional parameter. Default value is com4j.Variant.getMissing()
   * @param maxColumns Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1152)
  int copyFromRecordset(
    com4j.Com4jObject data,
    @Optional java.lang.Object maxRows,
    @Optional java.lang.Object maxColumns);


  /**
   * @param appearance Optional parameter. Default value is 1
   * @param format Optional parameter. Default value is -4147
   */

  @DISPID(213)
  java.lang.Object copyPicture(
    @Optional @DefaultValue("1") excel.XlPictureAppearance appearance,
    @Optional @DefaultValue("-4147") excel.XlCopyPictureFormat format);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   */

  @DISPID(118)
  @PropGet
  int getCount();


  /**
   * @param top Optional parameter. Default value is com4j.Variant.getMissing()
   * @param left Optional parameter. Default value is com4j.Variant.getMissing()
   * @param bottom Optional parameter. Default value is com4j.Variant.getMissing()
   * @param right Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(457)
  java.lang.Object createNames(
    @Optional java.lang.Object top,
    @Optional java.lang.Object left,
    @Optional java.lang.Object bottom,
    @Optional java.lang.Object right);


  /**
   * @param edition Optional parameter. Default value is com4j.Variant.getMissing()
   * @param appearance Optional parameter. Default value is 1
   * @param containsPICT Optional parameter. Default value is com4j.Variant.getMissing()
   * @param containsBIFF Optional parameter. Default value is com4j.Variant.getMissing()
   * @param containsRTF Optional parameter. Default value is com4j.Variant.getMissing()
   * @param containsVALU Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(458)
  java.lang.Object createPublisher(
    @Optional java.lang.Object edition,
    @Optional @DefaultValue("1") excel.XlPictureAppearance appearance,
    @Optional java.lang.Object containsPICT,
    @Optional java.lang.Object containsBIFF,
    @Optional java.lang.Object containsRTF,
    @Optional java.lang.Object containsVALU);


  /**
   * <p>
   * Getter method for the COM property "CurrentArray"
   * </p>
   */

  @DISPID(501)
  @PropGet
  excel.Range getCurrentArray();


  /**
   * <p>
   * Getter method for the COM property "CurrentRegion"
   * </p>
   */

  @DISPID(243)
  @PropGet
  excel.Range getCurrentRegion();


  /**
   * @param destination Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(565)
  java.lang.Object cut(
    @Optional java.lang.Object destination);


  /**
   * @param rowcol Optional parameter. Default value is com4j.Variant.getMissing()
   * @param type Optional parameter. Default value is -4132
   * @param date Optional parameter. Default value is 1
   * @param step Optional parameter. Default value is com4j.Variant.getMissing()
   * @param stop Optional parameter. Default value is com4j.Variant.getMissing()
   * @param trend Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(464)
  java.lang.Object dataSeries(
    @Optional java.lang.Object rowcol,
    @Optional @DefaultValue("-4132") excel.XlDataSeriesType type,
    @Optional @DefaultValue("1") excel.XlDataSeriesDate date,
    @Optional java.lang.Object step,
    @Optional java.lang.Object stop,
    @Optional java.lang.Object trend);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param rowIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnIndex Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  java.lang.Object get_Default(
    @Optional java.lang.Object rowIndex,
    @Optional java.lang.Object columnIndex);


  /**
   * <p>
   * Setter method for the COM property "_Default"
   * </p>
   * @param rowIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(0)
  @PropPut
  @DefaultMethod
  void set_Default(
    @Optional java.lang.Object rowIndex,
    @Optional java.lang.Object columnIndex,
    java.lang.Object rhs);


  /**
   * @param shift Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(117)
  java.lang.Object delete(
    @Optional java.lang.Object shift);


  /**
   * <p>
   * Getter method for the COM property "Dependents"
   * </p>
   */

  @DISPID(543)
  @PropGet
  excel.Range getDependents();


  /**
   */

  @DISPID(245)
  java.lang.Object dialogBox();


  /**
   * <p>
   * Getter method for the COM property "DirectDependents"
   * </p>
   */

  @DISPID(545)
  @PropGet
  excel.Range getDirectDependents();


  /**
   * <p>
   * Getter method for the COM property "DirectPrecedents"
   * </p>
   */

  @DISPID(546)
  @PropGet
  excel.Range getDirectPrecedents();


  /**
   * @param type Mandatory excel.XlEditionType parameter.
   * @param option Mandatory excel.XlEditionOptionsOption parameter.
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param reference Optional parameter. Default value is com4j.Variant.getMissing()
   * @param appearance Optional parameter. Default value is 1
   * @param chartSize Optional parameter. Default value is 1
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1131)
  java.lang.Object editionOptions(
    excel.XlEditionType type,
    excel.XlEditionOptionsOption option,
    @Optional java.lang.Object name,
    @Optional java.lang.Object reference,
    @Optional @DefaultValue("1") excel.XlPictureAppearance appearance,
    @Optional @DefaultValue("1") excel.XlPictureAppearance chartSize,
    @Optional java.lang.Object format);


  /**
   * <p>
   * Getter method for the COM property "End"
   * </p>
   * @param direction Mandatory excel.XlDirection parameter.
   */

  @DISPID(500)
  @PropGet
  excel.Range getEnd(
    excel.XlDirection direction);


  /**
   * <p>
   * Getter method for the COM property "EntireColumn"
   * </p>
   */

  @DISPID(246)
  @PropGet
  excel.Range getEntireColumn();


  /**
   * <p>
   * Getter method for the COM property "EntireRow"
   * </p>
   */

  @DISPID(247)
  @PropGet
  excel.Range getEntireRow();


  /**
   */

  @DISPID(248)
  java.lang.Object fillDown();


  /**
   */

  @DISPID(249)
  java.lang.Object fillLeft();


  /**
   */

  @DISPID(250)
  java.lang.Object fillRight();


  /**
   */

  @DISPID(251)
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
   */

  @DISPID(398)
  excel.Range find(
    java.lang.Object what,
    @Optional java.lang.Object after,
    @Optional java.lang.Object lookIn,
    @Optional java.lang.Object lookAt,
    @Optional java.lang.Object searchOrder,
    @Optional @DefaultValue("1") excel.XlSearchDirection searchDirection,
    @Optional java.lang.Object matchCase,
    @Optional java.lang.Object matchByte,
    @Optional java.lang.Object searchFormat);


  /**
   * @param after Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(399)
  excel.Range findNext(
    @Optional java.lang.Object after);


  /**
   * @param after Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(400)
  excel.Range findPrevious(
    @Optional java.lang.Object after);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   */

  @DISPID(146)
  @PropGet
  excel.Font getFont();


  /**
   * <p>
   * Getter method for the COM property "Formula"
   * </p>
   */

  @DISPID(261)
  @PropGet
  java.lang.Object getFormula();


  /**
   * <p>
   * Setter method for the COM property "Formula"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(261)
  @PropPut
  void setFormula(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaArray"
   * </p>
   */

  @DISPID(586)
  @PropGet
  java.lang.Object getFormulaArray();


  /**
   * <p>
   * Setter method for the COM property "FormulaArray"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(586)
  @PropPut
  void setFormulaArray(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaLabel"
   * </p>
   */

  @DISPID(1380)
  @PropGet
  excel.XlFormulaLabel getFormulaLabel();


  /**
   * <p>
   * Setter method for the COM property "FormulaLabel"
   * </p>
   * @param rhs Mandatory excel.XlFormulaLabel parameter.
   */

  @DISPID(1380)
  @PropPut
  void setFormulaLabel(
    excel.XlFormulaLabel rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaHidden"
   * </p>
   */

  @DISPID(262)
  @PropGet
  java.lang.Object getFormulaHidden();


  /**
   * <p>
   * Setter method for the COM property "FormulaHidden"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(262)
  @PropPut
  void setFormulaHidden(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaLocal"
   * </p>
   */

  @DISPID(263)
  @PropGet
  java.lang.Object getFormulaLocal();


  /**
   * <p>
   * Setter method for the COM property "FormulaLocal"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(263)
  @PropPut
  void setFormulaLocal(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaR1C1"
   * </p>
   */

  @DISPID(264)
  @PropGet
  java.lang.Object getFormulaR1C1();


  /**
   * <p>
   * Setter method for the COM property "FormulaR1C1"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(264)
  @PropPut
  void setFormulaR1C1(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaR1C1Local"
   * </p>
   */

  @DISPID(265)
  @PropGet
  java.lang.Object getFormulaR1C1Local();


  /**
   * <p>
   * Setter method for the COM property "FormulaR1C1Local"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(265)
  @PropPut
  void setFormulaR1C1Local(
    java.lang.Object rhs);


  /**
   */

  @DISPID(571)
  java.lang.Object functionWizard();


  /**
   * @param goal Mandatory java.lang.Object parameter.
   * @param changingCell Mandatory excel.Range parameter.
   */

  @DISPID(472)
  boolean goalSeek(
    java.lang.Object goal,
    excel.Range changingCell);


  /**
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   * @param end Optional parameter. Default value is com4j.Variant.getMissing()
   * @param by Optional parameter. Default value is com4j.Variant.getMissing()
   * @param periods Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(46)
  java.lang.Object group(
    @Optional java.lang.Object start,
    @Optional java.lang.Object end,
    @Optional java.lang.Object by,
    @Optional java.lang.Object periods);


  /**
   * <p>
   * Getter method for the COM property "HasArray"
   * </p>
   */

  @DISPID(266)
  @PropGet
  java.lang.Object getHasArray();


  /**
   * <p>
   * Getter method for the COM property "HasFormula"
   * </p>
   */

  @DISPID(267)
  @PropGet
  java.lang.Object getHasFormula();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   */

  @DISPID(123)
  @PropGet
  java.lang.Object getHeight();


  /**
   * <p>
   * Getter method for the COM property "Hidden"
   * </p>
   */

  @DISPID(268)
  @PropGet
  java.lang.Object getHidden();


  /**
   * <p>
   * Setter method for the COM property "Hidden"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(268)
  @PropPut
  void setHidden(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "HorizontalAlignment"
   * </p>
   */

  @DISPID(136)
  @PropGet
  java.lang.Object getHorizontalAlignment();


  /**
   * <p>
   * Setter method for the COM property "HorizontalAlignment"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(136)
  @PropPut
  void setHorizontalAlignment(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "IndentLevel"
   * </p>
   */

  @DISPID(201)
  @PropGet
  java.lang.Object getIndentLevel();


  /**
   * <p>
   * Setter method for the COM property "IndentLevel"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(201)
  @PropPut
  void setIndentLevel(
    java.lang.Object rhs);


  /**
   * @param insertAmount Mandatory int parameter.
   */

  @DISPID(1381)
  void insertIndent(
    int insertAmount);


  /**
   * @param shift Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copyOrigin Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(252)
  java.lang.Object insert(
    @Optional java.lang.Object shift,
    @Optional java.lang.Object copyOrigin);


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   */

  @DISPID(129)
  @PropGet
  excel.Interior getInterior();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param rowIndex Mandatory java.lang.Object parameter.
   * @param columnIndex Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(170)
  @PropGet
  java.lang.Object getItem(
    java.lang.Object rowIndex,
    @Optional java.lang.Object columnIndex);


  /**
   * <p>
   * Setter method for the COM property "Item"
   * </p>
   * @param rowIndex Mandatory java.lang.Object parameter.
   * @param columnIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(170)
  @PropPut
  void setItem(
    java.lang.Object rowIndex,
    @Optional java.lang.Object columnIndex,
    java.lang.Object rhs);


  /**
   */

  @DISPID(495)
  java.lang.Object justify();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   */

  @DISPID(127)
  @PropGet
  java.lang.Object getLeft();


  /**
   * <p>
   * Getter method for the COM property "ListHeaderRows"
   * </p>
   */

  @DISPID(1187)
  @PropGet
  int getListHeaderRows();


  /**
   */

  @DISPID(253)
  java.lang.Object listNames();


  /**
   * <p>
   * Getter method for the COM property "LocationInTable"
   * </p>
   */

  @DISPID(691)
  @PropGet
  excel.XlLocationInTable getLocationInTable();


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   */

  @DISPID(269)
  @PropGet
  java.lang.Object getLocked();


  /**
   * <p>
   * Setter method for the COM property "Locked"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(269)
  @PropPut
  void setLocked(
    java.lang.Object rhs);


  /**
   * @param across Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(564)
  void merge(
    @Optional java.lang.Object across);


  /**
   */

  @DISPID(1384)
  void unMerge();


  /**
   * <p>
   * Getter method for the COM property "MergeArea"
   * </p>
   */

  @DISPID(1385)
  @PropGet
  excel.Range getMergeArea();


  /**
   * <p>
   * Getter method for the COM property "MergeCells"
   * </p>
   */

  @DISPID(208)
  @PropGet
  java.lang.Object getMergeCells();


  /**
   * <p>
   * Setter method for the COM property "MergeCells"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(208)
  @PropPut
  void setMergeCells(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   */

  @DISPID(110)
  @PropGet
  java.lang.Object getName();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(110)
  @PropPut
  void setName(
    java.lang.Object rhs);


  /**
   * @param towardPrecedent Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arrowNumber Optional parameter. Default value is com4j.Variant.getMissing()
   * @param linkNumber Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1032)
  java.lang.Object navigateArrow(
    @Optional java.lang.Object towardPrecedent,
    @Optional java.lang.Object arrowNumber,
    @Optional java.lang.Object linkNumber);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4)
  @PropGet
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   */

  @DISPID(502)
  @PropGet
  excel.Range getNext();


  /**
   * @param text Optional parameter. Default value is com4j.Variant.getMissing()
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   * @param length Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1127)
  java.lang.String noteText(
    @Optional java.lang.Object text,
    @Optional java.lang.Object start,
    @Optional java.lang.Object length);


  /**
   * <p>
   * Getter method for the COM property "NumberFormat"
   * </p>
   */

  @DISPID(193)
  @PropGet
  java.lang.Object getNumberFormat();


  /**
   * <p>
   * Setter method for the COM property "NumberFormat"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(193)
  @PropPut
  void setNumberFormat(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "NumberFormatLocal"
   * </p>
   */

  @DISPID(1097)
  @PropGet
  java.lang.Object getNumberFormatLocal();


  /**
   * <p>
   * Setter method for the COM property "NumberFormatLocal"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1097)
  @PropPut
  void setNumberFormatLocal(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Offset"
   * </p>
   * @param rowOffset Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnOffset Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(254)
  @PropGet
  excel.Range getOffset(
    @Optional java.lang.Object rowOffset,
    @Optional java.lang.Object columnOffset);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   */

  @DISPID(134)
  @PropGet
  java.lang.Object getOrientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(134)
  @PropPut
  void setOrientation(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "OutlineLevel"
   * </p>
   */

  @DISPID(271)
  @PropGet
  java.lang.Object getOutlineLevel();


  /**
   * <p>
   * Setter method for the COM property "OutlineLevel"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(271)
  @PropPut
  void setOutlineLevel(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "PageBreak"
   * </p>
   */

  @DISPID(255)
  @PropGet
  int getPageBreak();


  /**
   * <p>
   * Setter method for the COM property "PageBreak"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(255)
  @PropPut
  void setPageBreak(
    int rhs);


  /**
   * @param parseLine Optional parameter. Default value is com4j.Variant.getMissing()
   * @param destination Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(477)
  java.lang.Object parse(
    @Optional java.lang.Object parseLine,
    @Optional java.lang.Object destination);


  /**
   * @param paste Optional parameter. Default value is -4104
   * @param operation Optional parameter. Default value is -4142
   * @param skipBlanks Optional parameter. Default value is com4j.Variant.getMissing()
   * @param transpose Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1027)
  java.lang.Object _PasteSpecial(
    @Optional @DefaultValue("-4104") excel.XlPasteType paste,
    @Optional @DefaultValue("-4142") excel.XlPasteSpecialOperation operation,
    @Optional java.lang.Object skipBlanks,
    @Optional java.lang.Object transpose);


  /**
   * <p>
   * Getter method for the COM property "PivotField"
   * </p>
   */

  @DISPID(731)
  @PropGet
  excel.PivotField getPivotField();


  /**
   * <p>
   * Getter method for the COM property "PivotItem"
   * </p>
   */

  @DISPID(740)
  @PropGet
  excel.PivotItem getPivotItem();


  /**
   * <p>
   * Getter method for the COM property "PivotTable"
   * </p>
   */

  @DISPID(716)
  @PropGet
  excel.PivotTable getPivotTable();


  /**
   * <p>
   * Getter method for the COM property "Precedents"
   * </p>
   */

  @DISPID(544)
  @PropGet
  excel.Range getPrecedents();


  /**
   * <p>
   * Getter method for the COM property "PrefixCharacter"
   * </p>
   */

  @DISPID(504)
  @PropGet
  java.lang.Object getPrefixCharacter();


  /**
   * <p>
   * Getter method for the COM property "Previous"
   * </p>
   */

  @DISPID(503)
  @PropGet
  excel.Range getPrevious();


  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(905)
  java.lang.Object __PrintOut(
    @Optional java.lang.Object from,
    @Optional java.lang.Object to,
    @Optional java.lang.Object copies,
    @Optional java.lang.Object preview,
    @Optional java.lang.Object activePrinter,
    @Optional java.lang.Object printToFile,
    @Optional java.lang.Object collate);


  /**
   * @param enableChanges Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(281)
  java.lang.Object printPreview(
    @Optional java.lang.Object enableChanges);


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
   * @param cell1 Mandatory java.lang.Object parameter.
   * @param cell2 Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(197)
  @PropGet
  excel.Range getRange(
    java.lang.Object cell1,
    @Optional java.lang.Object cell2);


  /**
   */

  @DISPID(883)
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
   */

  @DISPID(226)
  boolean replace(
    java.lang.Object what,
    java.lang.Object replacement,
    @Optional java.lang.Object lookAt,
    @Optional java.lang.Object searchOrder,
    @Optional java.lang.Object matchCase,
    @Optional java.lang.Object matchByte,
    @Optional java.lang.Object searchFormat,
    @Optional java.lang.Object replaceFormat);


  /**
   * <p>
   * Getter method for the COM property "Resize"
   * </p>
   * @param rowSize Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnSize Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(256)
  @PropGet
  excel.Range getResize(
    @Optional java.lang.Object rowSize,
    @Optional java.lang.Object columnSize);


  /**
   * <p>
   * Getter method for the COM property "Row"
   * </p>
   */

  @DISPID(257)
  @PropGet
  int getRow();


  /**
   * @param comparison Mandatory java.lang.Object parameter.
   */

  @DISPID(511)
  excel.Range rowDifferences(
    java.lang.Object comparison);


  /**
   * <p>
   * Getter method for the COM property "RowHeight"
   * </p>
   */

  @DISPID(272)
  @PropGet
  java.lang.Object getRowHeight();


  /**
   * <p>
   * Setter method for the COM property "RowHeight"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(272)
  @PropPut
  void setRowHeight(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Rows"
   * </p>
   */

  @DISPID(258)
  @PropGet
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
   */

  @DISPID(259)
  java.lang.Object run(
    @Optional java.lang.Object arg1,
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
   */

  @DISPID(235)
  java.lang.Object select();


  /**
   */

  @DISPID(496)
  java.lang.Object show();


  /**
   * @param remove Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(877)
  java.lang.Object showDependents(
    @Optional java.lang.Object remove);


  /**
   * <p>
   * Getter method for the COM property "ShowDetail"
   * </p>
   */

  @DISPID(585)
  @PropGet
  java.lang.Object getShowDetail();


  /**
   * <p>
   * Setter method for the COM property "ShowDetail"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(585)
  @PropPut
  void setShowDetail(
    java.lang.Object rhs);


  /**
   */

  @DISPID(878)
  java.lang.Object showErrors();


  /**
   * @param remove Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(879)
  java.lang.Object showPrecedents(
    @Optional java.lang.Object remove);


  /**
   * <p>
   * Getter method for the COM property "ShrinkToFit"
   * </p>
   */

  @DISPID(209)
  @PropGet
  java.lang.Object getShrinkToFit();


  /**
   * <p>
   * Setter method for the COM property "ShrinkToFit"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(209)
  @PropPut
  void setShrinkToFit(
    java.lang.Object rhs);


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
   */

  @DISPID(880)
  java.lang.Object sort(
    @Optional java.lang.Object key1,
    @Optional @DefaultValue("1") excel.XlSortOrder order1,
    @Optional java.lang.Object key2,
    @Optional java.lang.Object type,
    @Optional @DefaultValue("1") excel.XlSortOrder order2,
    @Optional java.lang.Object key3,
    @Optional @DefaultValue("1") excel.XlSortOrder order3,
    @Optional @DefaultValue("2") excel.XlYesNoGuess header,
    @Optional java.lang.Object orderCustom,
    @Optional java.lang.Object matchCase,
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
   */

  @DISPID(881)
  java.lang.Object sortSpecial(
    @Optional @DefaultValue("1") excel.XlSortMethod sortMethod,
    @Optional java.lang.Object key1,
    @Optional @DefaultValue("1") excel.XlSortOrder order1,
    @Optional java.lang.Object type,
    @Optional java.lang.Object key2,
    @Optional @DefaultValue("1") excel.XlSortOrder order2,
    @Optional java.lang.Object key3,
    @Optional @DefaultValue("1") excel.XlSortOrder order3,
    @Optional @DefaultValue("2") excel.XlYesNoGuess header,
    @Optional java.lang.Object orderCustom,
    @Optional java.lang.Object matchCase,
    @Optional @DefaultValue("2") excel.XlSortOrientation orientation,
    @Optional @DefaultValue("0") excel.XlSortDataOption dataOption1,
    @Optional @DefaultValue("0") excel.XlSortDataOption dataOption2,
    @Optional @DefaultValue("0") excel.XlSortDataOption dataOption3);


  /**
   * <p>
   * Getter method for the COM property "SoundNote"
   * </p>
   */

  @DISPID(916)
  @PropGet
  excel.SoundNote getSoundNote();


  /**
   * @param type Mandatory excel.XlCellType parameter.
   * @param value Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(410)
  excel.Range specialCells(
    excel.XlCellType type,
    @Optional java.lang.Object value);


  /**
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   */

  @DISPID(260)
  @PropGet
  java.lang.Object getStyle();


  /**
   * <p>
   * Setter method for the COM property "Style"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(260)
  @PropPut
  void setStyle(
    java.lang.Object rhs);


  /**
   * @param edition Mandatory java.lang.String parameter.
   * @param format Optional parameter. Default value is -4158
   */

  @DISPID(481)
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
   */

  @DISPID(882)
  java.lang.Object subtotal(
    int groupBy,
    excel.XlConsolidationFunction function,
    java.lang.Object totalList,
    @Optional java.lang.Object replace,
    @Optional java.lang.Object pageBreaks,
    @Optional @DefaultValue("1") excel.XlSummaryRow summaryBelowData);


  /**
   * <p>
   * Getter method for the COM property "Summary"
   * </p>
   */

  @DISPID(273)
  @PropGet
  java.lang.Object getSummary();


  /**
   * @param rowInput Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnInput Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(497)
  java.lang.Object table(
    @Optional java.lang.Object rowInput,
    @Optional java.lang.Object columnInput);


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   */

  @DISPID(138)
  @PropGet
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
   */

  @DISPID(1040)
  java.lang.Object textToColumns(
    @Optional java.lang.Object destination,
    @Optional @DefaultValue("1") excel.XlTextParsingType dataType,
    @Optional @DefaultValue("1") excel.XlTextQualifier textQualifier,
    @Optional java.lang.Object consecutiveDelimiter,
    @Optional java.lang.Object tab,
    @Optional java.lang.Object semicolon,
    @Optional java.lang.Object comma,
    @Optional java.lang.Object space,
    @Optional java.lang.Object other,
    @Optional java.lang.Object otherChar,
    @Optional java.lang.Object fieldInfo,
    @Optional java.lang.Object decimalSeparator,
    @Optional java.lang.Object thousandsSeparator,
    @Optional java.lang.Object trailingMinusNumbers);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   */

  @DISPID(126)
  @PropGet
  java.lang.Object getTop();


  /**
   */

  @DISPID(244)
  java.lang.Object ungroup();


  /**
   * <p>
   * Getter method for the COM property "UseStandardHeight"
   * </p>
   */

  @DISPID(274)
  @PropGet
  java.lang.Object getUseStandardHeight();


  /**
   * <p>
   * Setter method for the COM property "UseStandardHeight"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(274)
  @PropPut
  void setUseStandardHeight(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "UseStandardWidth"
   * </p>
   */

  @DISPID(275)
  @PropGet
  java.lang.Object getUseStandardWidth();


  /**
   * <p>
   * Setter method for the COM property "UseStandardWidth"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(275)
  @PropPut
  void setUseStandardWidth(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Validation"
   * </p>
   */

  @DISPID(1387)
  @PropGet
  excel.Validation getValidation();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @param rangeValueDataType Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(6)
  @PropGet
  java.lang.Object getValue(
    @Optional java.lang.Object rangeValueDataType);


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param rangeValueDataType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(6)
  @PropPut
  void setValue(
    @Optional java.lang.Object rangeValueDataType,
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Value2"
   * </p>
   */

  @DISPID(1388)
  @PropGet
  java.lang.Object getValue2();


  /**
   * <p>
   * Setter method for the COM property "Value2"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1388)
  @PropPut
  void setValue2(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "VerticalAlignment"
   * </p>
   */

  @DISPID(137)
  @PropGet
  java.lang.Object getVerticalAlignment();


  /**
   * <p>
   * Setter method for the COM property "VerticalAlignment"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(137)
  @PropPut
  void setVerticalAlignment(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   */

  @DISPID(122)
  @PropGet
  java.lang.Object getWidth();


  /**
   * <p>
   * Getter method for the COM property "Worksheet"
   * </p>
   */

  @DISPID(348)
  @PropGet
  excel._Worksheet getWorksheet();


  /**
   * <p>
   * Getter method for the COM property "WrapText"
   * </p>
   */

  @DISPID(276)
  @PropGet
  java.lang.Object getWrapText();


  /**
   * <p>
   * Setter method for the COM property "WrapText"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(276)
  @PropPut
  void setWrapText(
    java.lang.Object rhs);


  /**
   * @param text Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1389)
  excel.Comment addComment(
    @Optional java.lang.Object text);


  /**
   * <p>
   * Getter method for the COM property "Comment"
   * </p>
   */

  @DISPID(910)
  @PropGet
  excel.Comment getComment();


  /**
   */

  @DISPID(1390)
  void clearComments();


  /**
   * <p>
   * Getter method for the COM property "Phonetic"
   * </p>
   */

  @DISPID(1391)
  @PropGet
  excel.Phonetic getPhonetic();


  /**
   * <p>
   * Getter method for the COM property "FormatConditions"
   * </p>
   */

  @DISPID(1392)
  @PropGet
  excel.FormatConditions getFormatConditions();


  /**
   * <p>
   * Getter method for the COM property "ReadingOrder"
   * </p>
   */

  @DISPID(975)
  @PropGet
  int getReadingOrder();


  /**
   * <p>
   * Setter method for the COM property "ReadingOrder"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(975)
  @PropPut
  void setReadingOrder(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Hyperlinks"
   * </p>
   */

  @DISPID(1393)
  @PropGet
  excel.Hyperlinks getHyperlinks();


  /**
   * <p>
   * Getter method for the COM property "Phonetics"
   * </p>
   */

  @DISPID(1811)
  @PropGet
  excel.Phonetics getPhonetics();


  /**
   */

  @DISPID(1812)
  void setPhonetic();


  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   */

  @DISPID(1813)
  @PropGet
  java.lang.String getID();


  /**
   * <p>
   * Setter method for the COM property "ID"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1813)
  @PropPut
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
   */

  @DISPID(1772)
  java.lang.Object _PrintOut(
    @Optional java.lang.Object from,
    @Optional java.lang.Object to,
    @Optional java.lang.Object copies,
    @Optional java.lang.Object preview,
    @Optional java.lang.Object activePrinter,
    @Optional java.lang.Object printToFile,
    @Optional java.lang.Object collate,
    @Optional java.lang.Object prToFileName);


  /**
   * <p>
   * Getter method for the COM property "PivotCell"
   * </p>
   */

  @DISPID(2013)
  @PropGet
  excel.PivotCell getPivotCell();


  /**
   */

  @DISPID(2014)
  void dirty();


  /**
   * <p>
   * Getter method for the COM property "Errors"
   * </p>
   */

  @DISPID(2015)
  @PropGet
  excel.Errors getErrors();


  /**
   * <p>
   * Getter method for the COM property "SmartTags"
   * </p>
   */

  @DISPID(2016)
  @PropGet
  excel.SmartTags getSmartTags();


  /**
   * @param speakDirection Optional parameter. Default value is com4j.Variant.getMissing()
   * @param speakFormulas Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2017)
  void speak(
    @Optional java.lang.Object speakDirection,
    @Optional java.lang.Object speakFormulas);


  /**
   * @param paste Optional parameter. Default value is -4104
   * @param operation Optional parameter. Default value is -4142
   * @param skipBlanks Optional parameter. Default value is com4j.Variant.getMissing()
   * @param transpose Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1928)
  java.lang.Object pasteSpecial(
    @Optional @DefaultValue("-4104") excel.XlPasteType paste,
    @Optional @DefaultValue("-4142") excel.XlPasteSpecialOperation operation,
    @Optional java.lang.Object skipBlanks,
    @Optional java.lang.Object transpose);


  /**
   * <p>
   * Getter method for the COM property "AllowEdit"
   * </p>
   */

  @DISPID(2020)
  @PropGet
  boolean getAllowEdit();


  /**
   * <p>
   * Getter method for the COM property "ListObject"
   * </p>
   */

  @DISPID(2257)
  @PropGet
  excel.ListObject getListObject();


  /**
   * <p>
   * Getter method for the COM property "XPath"
   * </p>
   */

  @DISPID(2258)
  @PropGet
  excel.XPath getXPath();


  /**
   * <p>
   * Getter method for the COM property "ServerActions"
   * </p>
   */

  @DISPID(2491)
  @PropGet
  excel.Actions getServerActions();


  /**
   * @param columns Optional parameter. Default value is com4j.Variant.getMissing()
   * @param header Optional parameter. Default value is 2
   */

  @DISPID(2492)
  void removeDuplicates(
    @Optional java.lang.Object columns,
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
   */

  @DISPID(2361)
  java.lang.Object printOut(
    @Optional java.lang.Object from,
    @Optional java.lang.Object to,
    @Optional java.lang.Object copies,
    @Optional java.lang.Object preview,
    @Optional java.lang.Object activePrinter,
    @Optional java.lang.Object printToFile,
    @Optional java.lang.Object collate,
    @Optional java.lang.Object prToFileName);


  /**
   * <p>
   * Getter method for the COM property "MDX"
   * </p>
   */

  @DISPID(2123)
  @PropGet
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

  @DISPID(2493)
  void exportAsFixedFormat(
    excel.XlFixedFormatType type,
    @Optional java.lang.Object filename,
    @Optional java.lang.Object quality,
    @Optional java.lang.Object includeDocProperties,
    @Optional java.lang.Object ignorePrintAreas,
    @Optional java.lang.Object from,
    @Optional java.lang.Object to,
    @Optional java.lang.Object openAfterPublish,
    @Optional java.lang.Object fixedFormatExtClassPtr);


  /**
   * <p>
   * Getter method for the COM property "CountLarge"
   * </p>
   */

  @DISPID(2499)
  @PropGet
  java.lang.Object getCountLarge();


  /**
   */

  @DISPID(2364)
  java.lang.Object calculateRowMajorOrder();


  /**
   * <p>
   * Getter method for the COM property "SparklineGroups"
   * </p>
   */

  @DISPID(2853)
  @PropGet
  excel.SparklineGroups getSparklineGroups();


  /**
   */

  @DISPID(2854)
  void clearHyperlinks();


  /**
   * <p>
   * Getter method for the COM property "DisplayFormat"
   * </p>
   */

  @DISPID(666)
  @PropGet
  excel.DisplayFormat getDisplayFormat();


  /**
   * @param lineStyle Optional parameter. Default value is com4j.Variant.getMissing()
   * @param weight Optional parameter. Default value is 2
   * @param colorIndex Optional parameter. Default value is -4105
   * @param color Optional parameter. Default value is com4j.Variant.getMissing()
   * @param themeColor Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2771)
  java.lang.Object borderAround(
    @Optional java.lang.Object lineStyle,
    @Optional @DefaultValue("2") excel.XlBorderWeight weight,
    @Optional @DefaultValue("-4105") excel.XlColorIndex colorIndex,
    @Optional java.lang.Object color,
    @Optional java.lang.Object themeColor);


  /**
   */

  @DISPID(2855)
  void allocateChanges();


  /**
   */

  @DISPID(2856)
  void discardChanges();


  // Properties:
}
