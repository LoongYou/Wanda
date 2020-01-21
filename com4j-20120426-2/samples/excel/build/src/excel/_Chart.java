package excel  ;

import com4j.*;

@IID("{000208D6-0000-0000-C000-000000000046}")
public interface _Chart extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type excel._Application
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(7)
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type excel.XlCreator
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(8)
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getParent();


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(304) //= 0x130. The runtime will prefer the VTID if present
  @VTID(10)
  void activate(
    @LCID int lcid);


  /**
   * @param before Optional parameter. Default value is com4j.Variant.getMissing()
   * @param after Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(551) //= 0x227. The runtime will prefer the VTID if present
  @VTID(11)
  void copy(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object before,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object after,
    @LCID int lcid);


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(12)
  void delete(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "CodeName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1373) //= 0x55d. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String getCodeName();


  /**
   * <p>
   * Getter method for the COM property "_CodeName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String get_CodeName();


  /**
   * <p>
   * Setter method for the COM property "_CodeName"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(15)
  void set_CodeName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(486) //= 0x1e6. The runtime will prefer the VTID if present
  @VTID(16)
  int getIndex(
    @LCID int lcid);


  /**
   * @param before Optional parameter. Default value is com4j.Variant.getMissing()
   * @param after Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(637) //= 0x27d. The runtime will prefer the VTID if present
  @VTID(17)
  void move(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object before,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object after,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String getName();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(19)
  void setName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(502) //= 0x1f6. The runtime will prefer the VTID if present
  @VTID(20)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getNext();


  /**
   * <p>
   * Getter method for the COM property "OnDoubleClick"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(628) //= 0x274. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String getOnDoubleClick(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "OnDoubleClick"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(628) //= 0x274. The runtime will prefer the VTID if present
  @VTID(22)
  void setOnDoubleClick(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "OnSheetActivate"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1031) //= 0x407. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String getOnSheetActivate(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "OnSheetActivate"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1031) //= 0x407. The runtime will prefer the VTID if present
  @VTID(24)
  void setOnSheetActivate(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "OnSheetDeactivate"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1081) //= 0x439. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String getOnSheetDeactivate(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "OnSheetDeactivate"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1081) //= 0x439. The runtime will prefer the VTID if present
  @VTID(26)
  void setOnSheetDeactivate(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "PageSetup"
   * </p>
   * @return  Returns a value of type excel.PageSetup
   */

  @DISPID(998) //= 0x3e6. The runtime will prefer the VTID if present
  @VTID(27)
  excel.PageSetup getPageSetup();


  /**
   * <p>
   * Getter method for the COM property "Previous"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(503) //= 0x1f7. The runtime will prefer the VTID if present
  @VTID(28)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getPrevious();


  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(905) //= 0x389. The runtime will prefer the VTID if present
  @VTID(29)
  void __PrintOut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copies,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object preview,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object activePrinter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object printToFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object collate,
    @LCID int lcid);


  /**
   * @param enableChanges Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(281) //= 0x119. The runtime will prefer the VTID if present
  @VTID(30)
  void printPreview(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object enableChanges,
    @LCID int lcid);


  /**
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param drawingObjects Optional parameter. Default value is com4j.Variant.getMissing()
   * @param contents Optional parameter. Default value is com4j.Variant.getMissing()
   * @param scenarios Optional parameter. Default value is com4j.Variant.getMissing()
   * @param userInterfaceOnly Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(282) //= 0x11a. The runtime will prefer the VTID if present
  @VTID(31)
  void _Protect(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object drawingObjects,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object contents,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object scenarios,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object userInterfaceOnly,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ProtectContents"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(292) //= 0x124. The runtime will prefer the VTID if present
  @VTID(32)
  boolean getProtectContents(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ProtectDrawingObjects"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(293) //= 0x125. The runtime will prefer the VTID if present
  @VTID(33)
  boolean getProtectDrawingObjects(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ProtectionMode"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1159) //= 0x487. The runtime will prefer the VTID if present
  @VTID(34)
  boolean getProtectionMode(
    @LCID int lcid);


  /**
   */

  @DISPID(65559) //= 0x10017. The runtime will prefer the VTID if present
  @VTID(35)
  void _Dummy23();


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param fileFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writeResPassword Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnlyRecommended Optional parameter. Default value is com4j.Variant.getMissing()
   * @param createBackup Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToMru Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textCodepage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textVisualLayout Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(284) //= 0x11c. The runtime will prefer the VTID if present
  @VTID(36)
  void _SaveAs(
    java.lang.String filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fileFormat,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object writeResPassword,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object readOnlyRecommended,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object createBackup,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object addToMru,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object textCodepage,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object textVisualLayout,
    @LCID int lcid);


  /**
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(235) //= 0xeb. The runtime will prefer the VTID if present
  @VTID(37)
  void select(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object replace,
    @LCID int lcid);


  /**
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(285) //= 0x11d. The runtime will prefer the VTID if present
  @VTID(38)
  void unprotect(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.XlSheetVisibility
   */

  @DISPID(558) //= 0x22e. The runtime will prefer the VTID if present
  @VTID(39)
  excel.XlSheetVisibility getVisible(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory excel.XlSheetVisibility parameter.
   */

  @DISPID(558) //= 0x22e. The runtime will prefer the VTID if present
  @VTID(40)
  void setVisible(
    @LCID int lcid,
    excel.XlSheetVisibility rhs);


  /**
   * <p>
   * Getter method for the COM property "Shapes"
   * </p>
   * @return  Returns a value of type excel.Shapes
   */

  @DISPID(1377) //= 0x561. The runtime will prefer the VTID if present
  @VTID(41)
  excel.Shapes getShapes();


  /**
   * @param type Optional parameter. Default value is 2
   * @param legendKey Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasLeaderLines Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(151) //= 0x97. The runtime will prefer the VTID if present
  @VTID(42)
  void _ApplyDataLabels(
    @Optional @DefaultValue("2") excel.XlDataLabelsType type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object legendKey,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object autoText,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object hasLeaderLines,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(760) //= 0x2f8. The runtime will prefer the VTID if present
  @VTID(43)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject arcs(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Area3DGroup"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.ChartGroup
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(44)
  excel.ChartGroup getArea3DGroup(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(45)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject areaGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param gallery Mandatory int parameter.
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(46)
  void autoFormat(
    int gallery,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object format);


  /**
   * <p>
   * Getter method for the COM property "AutoScaling"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(47)
  boolean getAutoScaling(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "AutoScaling"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(48)
  void setAutoScaling(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param axisGroup Optional parameter. Default value is 1
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(49)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject axes(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type,
    @Optional @DefaultValue("1") excel.XlAxisGroup axisGroup,
    @LCID int lcid);


  /**
   * @param filename Mandatory java.lang.String parameter.
   */

  @DISPID(1188) //= 0x4a4. The runtime will prefer the VTID if present
  @VTID(50)
  void setBackgroundPicture(
    java.lang.String filename);


  /**
   * <p>
   * Getter method for the COM property "Bar3DGroup"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.ChartGroup
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(51)
  excel.ChartGroup getBar3DGroup(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(52)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject barGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(557) //= 0x22d. The runtime will prefer the VTID if present
  @VTID(53)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject buttons(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ChartArea"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.ChartArea
   */

  @DISPID(80) //= 0x50. The runtime will prefer the VTID if present
  @VTID(54)
  excel.ChartArea getChartArea(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(55)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject chartGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1060) //= 0x424. The runtime will prefer the VTID if present
  @VTID(56)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject chartObjects(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ChartTitle"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.ChartTitle
   */

  @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
  @VTID(57)
  excel.ChartTitle getChartTitle(
    @LCID int lcid);


  /**
   * @param source Optional parameter. Default value is com4j.Variant.getMissing()
   * @param gallery Optional parameter. Default value is com4j.Variant.getMissing()
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @param plotBy Optional parameter. Default value is com4j.Variant.getMissing()
   * @param categoryLabels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param seriesLabels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasLegend Optional parameter. Default value is com4j.Variant.getMissing()
   * @param title Optional parameter. Default value is com4j.Variant.getMissing()
   * @param categoryTitle Optional parameter. Default value is com4j.Variant.getMissing()
   * @param valueTitle Optional parameter. Default value is com4j.Variant.getMissing()
   * @param extraTitle Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(196) //= 0xc4. The runtime will prefer the VTID if present
  @VTID(58)
  void chartWizard(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object source,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object gallery,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object format,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object plotBy,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object categoryLabels,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object seriesLabels,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object hasLegend,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object title,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object categoryTitle,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object valueTitle,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object extraTitle,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(824) //= 0x338. The runtime will prefer the VTID if present
  @VTID(59)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject checkBoxes(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param customDictionary Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreUppercase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param alwaysSuggest Optional parameter. Default value is com4j.Variant.getMissing()
   * @param spellLang Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(505) //= 0x1f9. The runtime will prefer the VTID if present
  @VTID(60)
  void checkSpelling(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object customDictionary,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignoreUppercase,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object alwaysSuggest,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object spellLang,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Column3DGroup"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.ChartGroup
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(61)
  excel.ChartGroup getColumn3DGroup(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(62)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject columnGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param appearance Optional parameter. Default value is 1
   * @param format Optional parameter. Default value is -4147
   * @param size Optional parameter. Default value is 2
   * @param lcid Mandatory int parameter.
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(63)
  void copyPicture(
    @Optional @DefaultValue("1") excel.XlPictureAppearance appearance,
    @Optional @DefaultValue("-4147") excel.XlCopyPictureFormat format,
    @Optional @DefaultValue("2") excel.XlPictureAppearance size,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Corners"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.Corners
   */

  @DISPID(79) //= 0x4f. The runtime will prefer the VTID if present
  @VTID(64)
  excel.Corners getCorners(
    @LCID int lcid);


  /**
   * @param edition Optional parameter. Default value is com4j.Variant.getMissing()
   * @param appearance Optional parameter. Default value is 1
   * @param size Optional parameter. Default value is 1
   * @param containsPICT Optional parameter. Default value is com4j.Variant.getMissing()
   * @param containsBIFF Optional parameter. Default value is com4j.Variant.getMissing()
   * @param containsRTF Optional parameter. Default value is com4j.Variant.getMissing()
   * @param containsVALU Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(458) //= 0x1ca. The runtime will prefer the VTID if present
  @VTID(65)
  void createPublisher(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object edition,
    @Optional @DefaultValue("1") excel.XlPictureAppearance appearance,
    @Optional @DefaultValue("1") excel.XlPictureAppearance size,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object containsPICT,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object containsBIFF,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object containsRTF,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object containsVALU,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "DataTable"
   * </p>
   * @return  Returns a value of type excel.DataTable
   */

  @DISPID(1395) //= 0x573. The runtime will prefer the VTID if present
  @VTID(66)
  excel.DataTable getDataTable();


  /**
   * <p>
   * Getter method for the COM property "DepthPercent"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(48) //= 0x30. The runtime will prefer the VTID if present
  @VTID(67)
  int getDepthPercent(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DepthPercent"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(48) //= 0x30. The runtime will prefer the VTID if present
  @VTID(68)
  void setDepthPercent(
    @LCID int lcid,
    int rhs);


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(1120) //= 0x460. The runtime will prefer the VTID if present
  @VTID(69)
  void deselect(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "DisplayBlanksAs"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.XlDisplayBlanksAs
   */

  @DISPID(93) //= 0x5d. The runtime will prefer the VTID if present
  @VTID(70)
  excel.XlDisplayBlanksAs getDisplayBlanksAs(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DisplayBlanksAs"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory excel.XlDisplayBlanksAs parameter.
   */

  @DISPID(93) //= 0x5d. The runtime will prefer the VTID if present
  @VTID(71)
  void setDisplayBlanksAs(
    @LCID int lcid,
    excel.XlDisplayBlanksAs rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(72)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject doughnutGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(772) //= 0x304. The runtime will prefer the VTID if present
  @VTID(73)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject drawings(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(88) //= 0x58. The runtime will prefer the VTID if present
  @VTID(74)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject drawingObjects(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(836) //= 0x344. The runtime will prefer the VTID if present
  @VTID(75)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject dropDowns(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Elevation"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(49) //= 0x31. The runtime will prefer the VTID if present
  @VTID(76)
  int getElevation(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Elevation"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(49) //= 0x31. The runtime will prefer the VTID if present
  @VTID(77)
  void setElevation(
    @LCID int lcid,
    int rhs);


  /**
   * @param name Mandatory java.lang.Object parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(78)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object evaluate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @LCID int lcid);


  /**
   * @param name Mandatory java.lang.Object parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-5) //= 0xfffffffb. The runtime will prefer the VTID if present
  @VTID(79)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object _Evaluate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Floor"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.Floor
   */

  @DISPID(83) //= 0x53. The runtime will prefer the VTID if present
  @VTID(80)
  excel.Floor getFloor(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "GapDepth"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(50) //= 0x32. The runtime will prefer the VTID if present
  @VTID(81)
  int getGapDepth(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "GapDepth"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(50) //= 0x32. The runtime will prefer the VTID if present
  @VTID(82)
  void setGapDepth(
    @LCID int lcid,
    int rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(834) //= 0x342. The runtime will prefer the VTID if present
  @VTID(83)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject groupBoxes(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1113) //= 0x459. The runtime will prefer the VTID if present
  @VTID(84)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject groupObjects(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "HasAxis"
   * </p>
   * @param index1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param index2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(52) //= 0x34. The runtime will prefer the VTID if present
  @VTID(85)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getHasAxis(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index2,
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "HasAxis"
   * </p>
   * @param index1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param index2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(52) //= 0x34. The runtime will prefer the VTID if present
  @VTID(86)
  void setHasAxis(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index2,
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "HasDataTable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1396) //= 0x574. The runtime will prefer the VTID if present
  @VTID(87)
  boolean getHasDataTable();


  /**
   * <p>
   * Setter method for the COM property "HasDataTable"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1396) //= 0x574. The runtime will prefer the VTID if present
  @VTID(88)
  void setHasDataTable(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasLegend"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(53) //= 0x35. The runtime will prefer the VTID if present
  @VTID(89)
  boolean getHasLegend(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "HasLegend"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(53) //= 0x35. The runtime will prefer the VTID if present
  @VTID(90)
  void setHasLegend(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasTitle"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(54) //= 0x36. The runtime will prefer the VTID if present
  @VTID(91)
  boolean getHasTitle(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "HasTitle"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(54) //= 0x36. The runtime will prefer the VTID if present
  @VTID(92)
  void setHasTitle(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HeightPercent"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(55) //= 0x37. The runtime will prefer the VTID if present
  @VTID(93)
  int getHeightPercent(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "HeightPercent"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(55) //= 0x37. The runtime will prefer the VTID if present
  @VTID(94)
  void setHeightPercent(
    @LCID int lcid,
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Hyperlinks"
   * </p>
   * @return  Returns a value of type excel.Hyperlinks
   */

  @DISPID(1393) //= 0x571. The runtime will prefer the VTID if present
  @VTID(95)
  excel.Hyperlinks getHyperlinks();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(841) //= 0x349. The runtime will prefer the VTID if present
  @VTID(96)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject labels(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Legend"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.Legend
   */

  @DISPID(84) //= 0x54. The runtime will prefer the VTID if present
  @VTID(97)
  excel.Legend getLegend(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Line3DGroup"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.ChartGroup
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(98)
  excel.ChartGroup getLine3DGroup(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(99)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject lineGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(767) //= 0x2ff. The runtime will prefer the VTID if present
  @VTID(100)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject lines(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(832) //= 0x340. The runtime will prefer the VTID if present
  @VTID(101)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject listBoxes(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param where Mandatory excel.XlChartLocation parameter.
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel._Chart
   */

  @DISPID(1397) //= 0x575. The runtime will prefer the VTID if present
  @VTID(102)
  excel._Chart location(
    excel.XlChartLocation where,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(799) //= 0x31f. The runtime will prefer the VTID if present
  @VTID(103)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject oleObjects(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(826) //= 0x33a. The runtime will prefer the VTID if present
  @VTID(104)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject optionButtons(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(801) //= 0x321. The runtime will prefer the VTID if present
  @VTID(105)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject ovals(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(106)
  void paste(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Perspective"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(57) //= 0x39. The runtime will prefer the VTID if present
  @VTID(107)
  int getPerspective(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Perspective"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(57) //= 0x39. The runtime will prefer the VTID if present
  @VTID(108)
  void setPerspective(
    @LCID int lcid,
    int rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(771) //= 0x303. The runtime will prefer the VTID if present
  @VTID(109)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject pictures(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Pie3DGroup"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.ChartGroup
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(110)
  excel.ChartGroup getPie3DGroup(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(111)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject pieGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "PlotArea"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.PlotArea
   */

  @DISPID(85) //= 0x55. The runtime will prefer the VTID if present
  @VTID(112)
  excel.PlotArea getPlotArea(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "PlotVisibleOnly"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(92) //= 0x5c. The runtime will prefer the VTID if present
  @VTID(113)
  boolean getPlotVisibleOnly(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "PlotVisibleOnly"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(92) //= 0x5c. The runtime will prefer the VTID if present
  @VTID(114)
  void setPlotVisibleOnly(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(115)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject radarGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(774) //= 0x306. The runtime will prefer the VTID if present
  @VTID(116)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject rectangles(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "RightAngleAxes"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(58) //= 0x3a. The runtime will prefer the VTID if present
  @VTID(117)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getRightAngleAxes(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "RightAngleAxes"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(58) //= 0x3a. The runtime will prefer the VTID if present
  @VTID(118)
  void setRightAngleAxes(
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Rotation"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(59) //= 0x3b. The runtime will prefer the VTID if present
  @VTID(119)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getRotation(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Rotation"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(59) //= 0x3b. The runtime will prefer the VTID if present
  @VTID(120)
  void setRotation(
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(830) //= 0x33e. The runtime will prefer the VTID if present
  @VTID(121)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject scrollBars(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(68) //= 0x44. The runtime will prefer the VTID if present
  @VTID(122)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject seriesCollection(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "SizeWithWindow"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(94) //= 0x5e. The runtime will prefer the VTID if present
  @VTID(123)
  boolean getSizeWithWindow(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "SizeWithWindow"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(94) //= 0x5e. The runtime will prefer the VTID if present
  @VTID(124)
  void setSizeWithWindow(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowWindow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1399) //= 0x577. The runtime will prefer the VTID if present
  @VTID(125)
  boolean getShowWindow();


  /**
   * <p>
   * Setter method for the COM property "ShowWindow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1399) //= 0x577. The runtime will prefer the VTID if present
  @VTID(126)
  void setShowWindow(
    boolean rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(838) //= 0x346. The runtime will prefer the VTID if present
  @VTID(127)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject spinners(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "SubType"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(128)
  int getSubType(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "SubType"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(129)
  void setSubType(
    @LCID int lcid,
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "SurfaceGroup"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.ChartGroup
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(130)
  excel.ChartGroup getSurfaceGroup(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(777) //= 0x309. The runtime will prefer the VTID if present
  @VTID(131)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject textBoxes(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(132)
  int getType(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(133)
  void setType(
    @LCID int lcid,
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ChartType"
   * </p>
   * @return  Returns a value of type excel.XlChartType
   */

  @DISPID(1400) //= 0x578. The runtime will prefer the VTID if present
  @VTID(134)
  excel.XlChartType getChartType();


  /**
   * <p>
   * Setter method for the COM property "ChartType"
   * </p>
   * @param rhs Mandatory excel.XlChartType parameter.
   */

  @DISPID(1400) //= 0x578. The runtime will prefer the VTID if present
  @VTID(135)
  void setChartType(
    excel.XlChartType rhs);


  /**
   * @param chartType Mandatory excel.XlChartType parameter.
   * @param typeName Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1401) //= 0x579. The runtime will prefer the VTID if present
  @VTID(136)
  void applyCustomType(
    excel.XlChartType chartType,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object typeName);


  /**
   * <p>
   * Getter method for the COM property "Walls"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.Walls
   */

  @DISPID(86) //= 0x56. The runtime will prefer the VTID if present
  @VTID(137)
  excel.Walls getWalls(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "WallsAndGridlines2D"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(138)
  boolean getWallsAndGridlines2D(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "WallsAndGridlines2D"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(139)
  void setWallsAndGridlines2D(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(140)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject xyGroups(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "BarShape"
   * </p>
   * @return  Returns a value of type excel.XlBarShape
   */

  @DISPID(1403) //= 0x57b. The runtime will prefer the VTID if present
  @VTID(141)
  excel.XlBarShape getBarShape();


  /**
   * <p>
   * Setter method for the COM property "BarShape"
   * </p>
   * @param rhs Mandatory excel.XlBarShape parameter.
   */

  @DISPID(1403) //= 0x57b. The runtime will prefer the VTID if present
  @VTID(142)
  void setBarShape(
    excel.XlBarShape rhs);


  /**
   * <p>
   * Getter method for the COM property "PlotBy"
   * </p>
   * @return  Returns a value of type excel.XlRowCol
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(143)
  excel.XlRowCol getPlotBy();


  /**
   * <p>
   * Setter method for the COM property "PlotBy"
   * </p>
   * @param rhs Mandatory excel.XlRowCol parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(144)
  void setPlotBy(
    excel.XlRowCol rhs);


  /**
   */

  @DISPID(1404) //= 0x57c. The runtime will prefer the VTID if present
  @VTID(145)
  void copyChartBuild();


  /**
   * <p>
   * Getter method for the COM property "ProtectFormatting"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1405) //= 0x57d. The runtime will prefer the VTID if present
  @VTID(146)
  boolean getProtectFormatting();


  /**
   * <p>
   * Setter method for the COM property "ProtectFormatting"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1405) //= 0x57d. The runtime will prefer the VTID if present
  @VTID(147)
  void setProtectFormatting(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ProtectData"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1406) //= 0x57e. The runtime will prefer the VTID if present
  @VTID(148)
  boolean getProtectData();


  /**
   * <p>
   * Setter method for the COM property "ProtectData"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1406) //= 0x57e. The runtime will prefer the VTID if present
  @VTID(149)
  void setProtectData(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ProtectGoalSeek"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1407) //= 0x57f. The runtime will prefer the VTID if present
  @VTID(150)
  boolean getProtectGoalSeek();


  /**
   * <p>
   * Setter method for the COM property "ProtectGoalSeek"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1407) //= 0x57f. The runtime will prefer the VTID if present
  @VTID(151)
  void setProtectGoalSeek(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ProtectSelection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1408) //= 0x580. The runtime will prefer the VTID if present
  @VTID(152)
  boolean getProtectSelection();


  /**
   * <p>
   * Setter method for the COM property "ProtectSelection"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1408) //= 0x580. The runtime will prefer the VTID if present
  @VTID(153)
  void setProtectSelection(
    boolean rhs);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @param elementID Mandatory Holder<Integer> parameter.
   * @param arg1 Mandatory Holder<Integer> parameter.
   * @param arg2 Mandatory Holder<Integer> parameter.
   */

  @DISPID(1409) //= 0x581. The runtime will prefer the VTID if present
  @VTID(154)
  void getChartElement(
    int x,
    int y,
    Holder<Integer> elementID,
    Holder<Integer> arg1,
    Holder<Integer> arg2);


  /**
   * @param source Mandatory excel.Range parameter.
   * @param plotBy Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1413) //= 0x585. The runtime will prefer the VTID if present
  @VTID(155)
  void setSourceData(
    excel.Range source,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object plotBy);


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param filterName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param interactive Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(1414) //= 0x586. The runtime will prefer the VTID if present
  @VTID(156)
  boolean export(
    java.lang.String filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filterName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object interactive);


  /**
   */

  @DISPID(1417) //= 0x589. The runtime will prefer the VTID if present
  @VTID(157)
  void refresh();


  /**
   * <p>
   * Getter method for the COM property "PivotLayout"
   * </p>
   * @return  Returns a value of type excel.PivotLayout
   */

  @DISPID(1814) //= 0x716. The runtime will prefer the VTID if present
  @VTID(158)
  excel.PivotLayout getPivotLayout();


  /**
   * <p>
   * Getter method for the COM property "HasPivotFields"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1815) //= 0x717. The runtime will prefer the VTID if present
  @VTID(159)
  boolean getHasPivotFields();


  /**
   * <p>
   * Setter method for the COM property "HasPivotFields"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1815) //= 0x717. The runtime will prefer the VTID if present
  @VTID(160)
  void setHasPivotFields(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Scripts"
   * </p>
   * @return  Returns a value of type office.Scripts
   */

  @DISPID(1816) //= 0x718. The runtime will prefer the VTID if present
  @VTID(161)
  office.Scripts getScripts();


  @VTID(161)
  @ReturnValue(defaultPropertyThrough={office.Scripts.class})
  office.Script getScripts(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param prToFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(1772) //= 0x6ec. The runtime will prefer the VTID if present
  @VTID(162)
  void _PrintOut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copies,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object preview,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object activePrinter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object printToFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object collate,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object prToFileName,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Tab"
   * </p>
   * @return  Returns a value of type excel.Tab
   */

  @DISPID(1041) //= 0x411. The runtime will prefer the VTID if present
  @VTID(163)
  excel.Tab getTab();


  /**
   * <p>
   * Getter method for the COM property "MailEnvelope"
   * </p>
   * @return  Returns a value of type office.IMsoEnvelopeVB
   */

  @DISPID(2021) //= 0x7e5. The runtime will prefer the VTID if present
  @VTID(164)
  office.IMsoEnvelopeVB getMailEnvelope();


  /**
   * @param type Optional parameter. Default value is 2
   * @param legendKey Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasLeaderLines Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showSeriesName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showCategoryName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showValue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showPercentage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showBubbleSize Optional parameter. Default value is com4j.Variant.getMissing()
   * @param separator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(1922) //= 0x782. The runtime will prefer the VTID if present
  @VTID(165)
  void applyDataLabels(
    @Optional @DefaultValue("2") excel.XlDataLabelsType type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object legendKey,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object autoText,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object hasLeaderLines,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showSeriesName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showCategoryName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showValue,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showPercentage,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showBubbleSize,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object separator,
    @LCID int lcid);


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param fileFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writeResPassword Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnlyRecommended Optional parameter. Default value is com4j.Variant.getMissing()
   * @param createBackup Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToMru Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textCodepage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textVisualLayout Optional parameter. Default value is com4j.Variant.getMissing()
   * @param local Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1925) //= 0x785. The runtime will prefer the VTID if present
  @VTID(166)
  void saveAs(
    java.lang.String filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fileFormat,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object writeResPassword,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object readOnlyRecommended,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object createBackup,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object addToMru,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object textCodepage,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object textVisualLayout,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object local);


  /**
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param drawingObjects Optional parameter. Default value is com4j.Variant.getMissing()
   * @param contents Optional parameter. Default value is com4j.Variant.getMissing()
   * @param scenarios Optional parameter. Default value is com4j.Variant.getMissing()
   * @param userInterfaceOnly Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2029) //= 0x7ed. The runtime will prefer the VTID if present
  @VTID(167)
  void protect(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object drawingObjects,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object contents,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object scenarios,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object userInterfaceOnly);


  /**
   * @param layout Mandatory int parameter.
   * @param chartType Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2500) //= 0x9c4. The runtime will prefer the VTID if present
  @VTID(168)
  void applyLayout(
    int layout,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object chartType);


  /**
   * @param element Mandatory office.MsoChartElementType parameter.
   */

  @DISPID(2502) //= 0x9c6. The runtime will prefer the VTID if present
  @VTID(169)
  void setElement(
    office.MsoChartElementType element);


  /**
   * <p>
   * Getter method for the COM property "ShowDataLabelsOverMaximum"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2504) //= 0x9c8. The runtime will prefer the VTID if present
  @VTID(170)
  boolean getShowDataLabelsOverMaximum();


  /**
   * <p>
   * Setter method for the COM property "ShowDataLabelsOverMaximum"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2504) //= 0x9c8. The runtime will prefer the VTID if present
  @VTID(171)
  void setShowDataLabelsOverMaximum(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SideWall"
   * </p>
   * @return  Returns a value of type excel.Walls
   */

  @DISPID(2505) //= 0x9c9. The runtime will prefer the VTID if present
  @VTID(172)
  excel.Walls getSideWall();


  /**
   * <p>
   * Getter method for the COM property "BackWall"
   * </p>
   * @return  Returns a value of type excel.Walls
   */

  @DISPID(2506) //= 0x9ca. The runtime will prefer the VTID if present
  @VTID(173)
  excel.Walls getBackWall();


  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param prToFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(2361) //= 0x939. The runtime will prefer the VTID if present
  @VTID(174)
  void printOut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copies,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object preview,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object activePrinter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object printToFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object collate,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object prToFileName,
    @LCID int lcid);


  /**
   * @param filename Mandatory java.lang.String parameter.
   */

  @DISPID(2507) //= 0x9cb. The runtime will prefer the VTID if present
  @VTID(175)
  void applyChartTemplate(
    java.lang.String filename);


  /**
   * @param filename Mandatory java.lang.String parameter.
   */

  @DISPID(2508) //= 0x9cc. The runtime will prefer the VTID if present
  @VTID(176)
  void saveChartTemplate(
    java.lang.String filename);


  /**
   * @param name Mandatory java.lang.Object parameter.
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(177)
  void setDefaultChart(
    @MarshalAs(NativeType.VARIANT) java.lang.Object name);


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

  @DISPID(2493) //= 0x9bd. The runtime will prefer the VTID if present
  @VTID(178)
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
   * Getter method for the COM property "ChartStyle"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2509) //= 0x9cd. The runtime will prefer the VTID if present
  @VTID(179)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getChartStyle();


  /**
   * <p>
   * Setter method for the COM property "ChartStyle"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2509) //= 0x9cd. The runtime will prefer the VTID if present
  @VTID(180)
  void setChartStyle(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   */

  @DISPID(2510) //= 0x9ce. The runtime will prefer the VTID if present
  @VTID(181)
  void clearToMatchStyle();


  /**
   * <p>
   * Getter method for the COM property "PrintedCommentPages"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2857) //= 0xb29. The runtime will prefer the VTID if present
  @VTID(182)
  int getPrintedCommentPages();


  /**
   * <p>
   * Getter method for the COM property "Dummy24"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2858) //= 0xb2a. The runtime will prefer the VTID if present
  @VTID(183)
  boolean getDummy24();


  /**
   * <p>
   * Setter method for the COM property "Dummy24"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2858) //= 0xb2a. The runtime will prefer the VTID if present
  @VTID(184)
  void setDummy24(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Dummy25"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2859) //= 0xb2b. The runtime will prefer the VTID if present
  @VTID(185)
  boolean getDummy25();


  /**
   * <p>
   * Setter method for the COM property "Dummy25"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2859) //= 0xb2b. The runtime will prefer the VTID if present
  @VTID(186)
  void setDummy25(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowReportFilterFieldButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2860) //= 0xb2c. The runtime will prefer the VTID if present
  @VTID(187)
  boolean getShowReportFilterFieldButtons();


  /**
   * <p>
   * Setter method for the COM property "ShowReportFilterFieldButtons"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2860) //= 0xb2c. The runtime will prefer the VTID if present
  @VTID(188)
  void setShowReportFilterFieldButtons(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowLegendFieldButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2861) //= 0xb2d. The runtime will prefer the VTID if present
  @VTID(189)
  boolean getShowLegendFieldButtons();


  /**
   * <p>
   * Setter method for the COM property "ShowLegendFieldButtons"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2861) //= 0xb2d. The runtime will prefer the VTID if present
  @VTID(190)
  void setShowLegendFieldButtons(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowAxisFieldButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2862) //= 0xb2e. The runtime will prefer the VTID if present
  @VTID(191)
  boolean getShowAxisFieldButtons();


  /**
   * <p>
   * Setter method for the COM property "ShowAxisFieldButtons"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2862) //= 0xb2e. The runtime will prefer the VTID if present
  @VTID(192)
  void setShowAxisFieldButtons(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowValueFieldButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2863) //= 0xb2f. The runtime will prefer the VTID if present
  @VTID(193)
  boolean getShowValueFieldButtons();


  /**
   * <p>
   * Setter method for the COM property "ShowValueFieldButtons"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2863) //= 0xb2f. The runtime will prefer the VTID if present
  @VTID(194)
  void setShowValueFieldButtons(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowAllFieldButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2864) //= 0xb30. The runtime will prefer the VTID if present
  @VTID(195)
  boolean getShowAllFieldButtons();


  /**
   * <p>
   * Setter method for the COM property "ShowAllFieldButtons"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2864) //= 0xb30. The runtime will prefer the VTID if present
  @VTID(196)
  void setShowAllFieldButtons(
    boolean rhs);


  // Properties:
}
