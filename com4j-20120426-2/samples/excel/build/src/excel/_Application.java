package excel  ;

import com4j.*;

@IID("{000208D5-0000-0000-C000-000000000046}")
public interface _Application extends Com4jObject {
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
   * @return  Returns a value of type excel._Application
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(9)
  excel._Application getParent();


  /**
   * <p>
   * Getter method for the COM property "ActiveCell"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @DISPID(305) //= 0x131. The runtime will prefer the VTID if present
  @VTID(10)
  excel.Range getActiveCell();


  /**
   * <p>
   * Getter method for the COM property "ActiveChart"
   * </p>
   * @return  Returns a value of type excel._Chart
   */

  @DISPID(183) //= 0xb7. The runtime will prefer the VTID if present
  @VTID(11)
  excel._Chart getActiveChart();


  /**
   * <p>
   * Getter method for the COM property "ActiveDialog"
   * </p>
   * @return  Returns a value of type excel.DialogSheet
   */

  @DISPID(815) //= 0x32f. The runtime will prefer the VTID if present
  @VTID(12)
  excel.DialogSheet getActiveDialog();


  /**
   * <p>
   * Getter method for the COM property "ActiveMenuBar"
   * </p>
   * @return  Returns a value of type excel.MenuBar
   */

  @DISPID(758) //= 0x2f6. The runtime will prefer the VTID if present
  @VTID(13)
  excel.MenuBar getActiveMenuBar();


  /**
   * <p>
   * Getter method for the COM property "ActivePrinter"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(306) //= 0x132. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String getActivePrinter(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "ActivePrinter"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(306) //= 0x132. The runtime will prefer the VTID if present
  @VTID(15)
  void setActivePrinter(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ActiveSheet"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(307) //= 0x133. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getActiveSheet();


  /**
   * <p>
   * Getter method for the COM property "ActiveWindow"
   * </p>
   * @return  Returns a value of type excel.Window
   */

  @DISPID(759) //= 0x2f7. The runtime will prefer the VTID if present
  @VTID(17)
  excel.Window getActiveWindow();


  /**
   * <p>
   * Getter method for the COM property "ActiveWorkbook"
   * </p>
   * @return  Returns a value of type excel._Workbook
   */

  @DISPID(308) //= 0x134. The runtime will prefer the VTID if present
  @VTID(18)
  excel._Workbook getActiveWorkbook();


  /**
   * <p>
   * Getter method for the COM property "AddIns"
   * </p>
   * @return  Returns a value of type excel.AddIns
   */

  @DISPID(549) //= 0x225. The runtime will prefer the VTID if present
  @VTID(19)
  excel.AddIns getAddIns();


  /**
   * <p>
   * Getter method for the COM property "Assistant"
   * </p>
   * @return  Returns a value of type office.Assistant
   */

  @DISPID(1438) //= 0x59e. The runtime will prefer the VTID if present
  @VTID(20)
  office.Assistant getAssistant();


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(279) //= 0x117. The runtime will prefer the VTID if present
  @VTID(21)
  void calculate(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Cells"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @DISPID(238) //= 0xee. The runtime will prefer the VTID if present
  @VTID(22)
  excel.Range getCells();


  /**
   * <p>
   * Getter method for the COM property "Charts"
   * </p>
   * @return  Returns a value of type excel.Sheets
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(23)
  excel.Sheets getCharts();


  @VTID(23)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={excel.Sheets.class})
  com4j.Com4jObject getCharts(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Columns"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @DISPID(241) //= 0xf1. The runtime will prefer the VTID if present
  @VTID(24)
  excel.Range getColumns();


  /**
   * <p>
   * Getter method for the COM property "CommandBars"
   * </p>
   * @return  Returns a value of type office._CommandBars
   */

  @DISPID(1439) //= 0x59f. The runtime will prefer the VTID if present
  @VTID(25)
  office._CommandBars getCommandBars();


  /**
   * <p>
   * Getter method for the COM property "DDEAppReturnCode"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(332) //= 0x14c. The runtime will prefer the VTID if present
  @VTID(26)
  int getDDEAppReturnCode(
    @LCID int lcid);


  /**
   * @param channel Mandatory int parameter.
   * @param string Mandatory java.lang.String parameter.
   * @param lcid Mandatory int parameter.
   */

  @DISPID(333) //= 0x14d. The runtime will prefer the VTID if present
  @VTID(27)
  void ddeExecute(
    int channel,
    java.lang.String string,
    @LCID int lcid);


  /**
   * @param app Mandatory java.lang.String parameter.
   * @param topic Mandatory java.lang.String parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(334) //= 0x14e. The runtime will prefer the VTID if present
  @VTID(28)
  int ddeInitiate(
    java.lang.String app,
    java.lang.String topic,
    @LCID int lcid);


  /**
   * @param channel Mandatory int parameter.
   * @param item Mandatory java.lang.Object parameter.
   * @param data Mandatory java.lang.Object parameter.
   * @param lcid Mandatory int parameter.
   */

  @DISPID(335) //= 0x14f. The runtime will prefer the VTID if present
  @VTID(29)
  void ddePoke(
    int channel,
    @MarshalAs(NativeType.VARIANT) java.lang.Object item,
    @MarshalAs(NativeType.VARIANT) java.lang.Object data,
    @LCID int lcid);


  /**
   * @param channel Mandatory int parameter.
   * @param item Mandatory java.lang.String parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(336) //= 0x150. The runtime will prefer the VTID if present
  @VTID(30)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ddeRequest(
    int channel,
    java.lang.String item,
    @LCID int lcid);


  /**
   * @param channel Mandatory int parameter.
   * @param lcid Mandatory int parameter.
   */

  @DISPID(337) //= 0x151. The runtime will prefer the VTID if present
  @VTID(31)
  void ddeTerminate(
    int channel,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "DialogSheets"
   * </p>
   * @return  Returns a value of type excel.Sheets
   */

  @DISPID(764) //= 0x2fc. The runtime will prefer the VTID if present
  @VTID(32)
  excel.Sheets getDialogSheets();


  @VTID(32)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={excel.Sheets.class})
  com4j.Com4jObject getDialogSheets(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * @param name Mandatory java.lang.Object parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(33)
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
  @VTID(34)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object _Evaluate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @LCID int lcid);


  /**
   * @param string Mandatory java.lang.String parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(350) //= 0x15e. The runtime will prefer the VTID if present
  @VTID(35)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object executeExcel4Macro(
    java.lang.String string,
    @LCID int lcid);


  /**
   * @param arg1 Mandatory excel.Range parameter.
   * @param arg2 Mandatory excel.Range parameter.
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
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.Range
   */

  @DISPID(766) //= 0x2fe. The runtime will prefer the VTID if present
  @VTID(36)
  excel.Range intersect(
    excel.Range arg1,
    excel.Range arg2,
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
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "MenuBars"
   * </p>
   * @return  Returns a value of type excel.MenuBars
   */

  @DISPID(589) //= 0x24d. The runtime will prefer the VTID if present
  @VTID(37)
  excel.MenuBars getMenuBars();


  /**
   * <p>
   * Getter method for the COM property "Modules"
   * </p>
   * @return  Returns a value of type excel.Modules
   */

  @DISPID(582) //= 0x246. The runtime will prefer the VTID if present
  @VTID(38)
  excel.Modules getModules();


  /**
   * <p>
   * Getter method for the COM property "Names"
   * </p>
   * @return  Returns a value of type excel.Names
   */

  @DISPID(442) //= 0x1ba. The runtime will prefer the VTID if present
  @VTID(39)
  excel.Names getNames();


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @param cell1 Mandatory java.lang.Object parameter.
   * @param cell2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.Range
   */

  @DISPID(197) //= 0xc5. The runtime will prefer the VTID if present
  @VTID(40)
  excel.Range getRange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object cell1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object cell2);


  /**
   * <p>
   * Getter method for the COM property "Rows"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @DISPID(258) //= 0x102. The runtime will prefer the VTID if present
  @VTID(41)
  excel.Range getRows();


  /**
   * @param macro Optional parameter. Default value is com4j.Variant.getMissing()
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

  @DISPID(259) //= 0x103. The runtime will prefer the VTID if present
  @VTID(42)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object run(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object macro,
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
   * @param macro Optional parameter. Default value is com4j.Variant.getMissing()
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
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(806) //= 0x326. The runtime will prefer the VTID if present
  @VTID(43)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object _Run2(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object macro,
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
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Selection"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(147) //= 0x93. The runtime will prefer the VTID if present
  @VTID(44)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getSelection(
    @LCID int lcid);


  /**
   * @param keys Mandatory java.lang.Object parameter.
   * @param wait Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(383) //= 0x17f. The runtime will prefer the VTID if present
  @VTID(45)
  void sendKeys(
    @MarshalAs(NativeType.VARIANT) java.lang.Object keys,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object wait,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Sheets"
   * </p>
   * @return  Returns a value of type excel.Sheets
   */

  @DISPID(485) //= 0x1e5. The runtime will prefer the VTID if present
  @VTID(46)
  excel.Sheets getSheets();


  @VTID(46)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={excel.Sheets.class})
  com4j.Com4jObject getSheets(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "ShortcutMenus"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type excel.Menu
   */

  @DISPID(776) //= 0x308. The runtime will prefer the VTID if present
  @VTID(47)
  excel.Menu getShortcutMenus(
    int index);


  /**
   * <p>
   * Getter method for the COM property "ThisWorkbook"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel._Workbook
   */

  @DISPID(778) //= 0x30a. The runtime will prefer the VTID if present
  @VTID(48)
  excel._Workbook getThisWorkbook(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Toolbars"
   * </p>
   * @return  Returns a value of type excel.Toolbars
   */

  @DISPID(552) //= 0x228. The runtime will prefer the VTID if present
  @VTID(49)
  excel.Toolbars getToolbars();


  /**
   * @param arg1 Mandatory excel.Range parameter.
   * @param arg2 Mandatory excel.Range parameter.
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
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.Range
   */

  @DISPID(779) //= 0x30b. The runtime will prefer the VTID if present
  @VTID(50)
  excel.Range union(
    excel.Range arg1,
    excel.Range arg2,
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
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Windows"
   * </p>
   * @return  Returns a value of type excel.Windows
   */

  @DISPID(430) //= 0x1ae. The runtime will prefer the VTID if present
  @VTID(51)
  excel.Windows getWindows();


  /**
   * <p>
   * Getter method for the COM property "Workbooks"
   * </p>
   * @return  Returns a value of type excel.Workbooks
   */

  @DISPID(572) //= 0x23c. The runtime will prefer the VTID if present
  @VTID(52)
  excel.Workbooks getWorkbooks();


  @VTID(52)
  @ReturnValue(defaultPropertyThrough={excel.Workbooks.class})
  excel._Workbook getWorkbooks(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "WorksheetFunction"
   * </p>
   * @return  Returns a value of type excel.WorksheetFunction
   */

  @DISPID(1440) //= 0x5a0. The runtime will prefer the VTID if present
  @VTID(53)
  excel.WorksheetFunction getWorksheetFunction();


  /**
   * <p>
   * Getter method for the COM property "Worksheets"
   * </p>
   * @return  Returns a value of type excel.Sheets
   */

  @DISPID(494) //= 0x1ee. The runtime will prefer the VTID if present
  @VTID(54)
  excel.Sheets getWorksheets();


  @VTID(54)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={excel.Sheets.class})
  com4j.Com4jObject getWorksheets(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Excel4IntlMacroSheets"
   * </p>
   * @return  Returns a value of type excel.Sheets
   */

  @DISPID(581) //= 0x245. The runtime will prefer the VTID if present
  @VTID(55)
  excel.Sheets getExcel4IntlMacroSheets();


  @VTID(55)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={excel.Sheets.class})
  com4j.Com4jObject getExcel4IntlMacroSheets(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Excel4MacroSheets"
   * </p>
   * @return  Returns a value of type excel.Sheets
   */

  @DISPID(579) //= 0x243. The runtime will prefer the VTID if present
  @VTID(56)
  excel.Sheets getExcel4MacroSheets();


  @VTID(56)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={excel.Sheets.class})
  com4j.Com4jObject getExcel4MacroSheets(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * @param index Mandatory excel.XlMSApplication parameter.
   * @param lcid Mandatory int parameter.
   */

  @DISPID(1095) //= 0x447. The runtime will prefer the VTID if present
  @VTID(57)
  void activateMicrosoftApp(
    excel.XlMSApplication index,
    @LCID int lcid);


  /**
   * @param chart Mandatory java.lang.Object parameter.
   * @param name Mandatory java.lang.String parameter.
   * @param description Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(58)
  void addChartAutoFormat(
    @MarshalAs(NativeType.VARIANT) java.lang.Object chart,
    java.lang.String name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object description,
    @LCID int lcid);


  /**
   * @param listArray Mandatory java.lang.Object parameter.
   * @param byRow Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(780) //= 0x30c. The runtime will prefer the VTID if present
  @VTID(59)
  void addCustomList(
    @MarshalAs(NativeType.VARIANT) java.lang.Object listArray,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object byRow,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "AlertBeforeOverwriting"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(930) //= 0x3a2. The runtime will prefer the VTID if present
  @VTID(60)
  boolean getAlertBeforeOverwriting(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "AlertBeforeOverwriting"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(930) //= 0x3a2. The runtime will prefer the VTID if present
  @VTID(61)
  void setAlertBeforeOverwriting(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AltStartupPath"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(313) //= 0x139. The runtime will prefer the VTID if present
  @VTID(62)
  java.lang.String getAltStartupPath(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "AltStartupPath"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(313) //= 0x139. The runtime will prefer the VTID if present
  @VTID(63)
  void setAltStartupPath(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "AskToUpdateLinks"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(992) //= 0x3e0. The runtime will prefer the VTID if present
  @VTID(64)
  boolean getAskToUpdateLinks(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "AskToUpdateLinks"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(992) //= 0x3e0. The runtime will prefer the VTID if present
  @VTID(65)
  void setAskToUpdateLinks(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableAnimations"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1180) //= 0x49c. The runtime will prefer the VTID if present
  @VTID(66)
  boolean getEnableAnimations(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "EnableAnimations"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1180) //= 0x49c. The runtime will prefer the VTID if present
  @VTID(67)
  void setEnableAnimations(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoCorrect"
   * </p>
   * @return  Returns a value of type excel.AutoCorrect
   */

  @DISPID(1145) //= 0x479. The runtime will prefer the VTID if present
  @VTID(68)
  excel.AutoCorrect getAutoCorrect();


  /**
   * <p>
   * Getter method for the COM property "Build"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(314) //= 0x13a. The runtime will prefer the VTID if present
  @VTID(69)
  int getBuild(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "CalculateBeforeSave"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(315) //= 0x13b. The runtime will prefer the VTID if present
  @VTID(70)
  boolean getCalculateBeforeSave(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "CalculateBeforeSave"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(315) //= 0x13b. The runtime will prefer the VTID if present
  @VTID(71)
  void setCalculateBeforeSave(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Calculation"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.XlCalculation
   */

  @DISPID(316) //= 0x13c. The runtime will prefer the VTID if present
  @VTID(72)
  excel.XlCalculation getCalculation(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Calculation"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory excel.XlCalculation parameter.
   */

  @DISPID(316) //= 0x13c. The runtime will prefer the VTID if present
  @VTID(73)
  void setCalculation(
    @LCID int lcid,
    excel.XlCalculation rhs);


  /**
   * <p>
   * Getter method for the COM property "Caller"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(317) //= 0x13d. The runtime will prefer the VTID if present
  @VTID(74)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getCaller(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "CanPlaySounds"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(318) //= 0x13e. The runtime will prefer the VTID if present
  @VTID(75)
  boolean getCanPlaySounds(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "CanRecordSounds"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(319) //= 0x13f. The runtime will prefer the VTID if present
  @VTID(76)
  boolean getCanRecordSounds(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(139) //= 0x8b. The runtime will prefer the VTID if present
  @VTID(77)
  java.lang.String getCaption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(139) //= 0x8b. The runtime will prefer the VTID if present
  @VTID(78)
  void setCaption(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "CellDragAndDrop"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(320) //= 0x140. The runtime will prefer the VTID if present
  @VTID(79)
  boolean getCellDragAndDrop(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "CellDragAndDrop"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(320) //= 0x140. The runtime will prefer the VTID if present
  @VTID(80)
  void setCellDragAndDrop(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param centimeters Mandatory double parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(1086) //= 0x43e. The runtime will prefer the VTID if present
  @VTID(81)
  double centimetersToPoints(
    double centimeters,
    @LCID int lcid);


  /**
   * @param word Mandatory java.lang.String parameter.
   * @param customDictionary Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreUppercase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(505) //= 0x1f9. The runtime will prefer the VTID if present
  @VTID(82)
  boolean checkSpelling(
    java.lang.String word,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object customDictionary,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignoreUppercase,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ClipboardFormats"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(321) //= 0x141. The runtime will prefer the VTID if present
  @VTID(83)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getClipboardFormats(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "DisplayClipboardWindow"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(322) //= 0x142. The runtime will prefer the VTID if present
  @VTID(84)
  boolean getDisplayClipboardWindow(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DisplayClipboardWindow"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(322) //= 0x142. The runtime will prefer the VTID if present
  @VTID(85)
  void setDisplayClipboardWindow(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ColorButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(365) //= 0x16d. The runtime will prefer the VTID if present
  @VTID(86)
  boolean getColorButtons();


  /**
   * <p>
   * Setter method for the COM property "ColorButtons"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(365) //= 0x16d. The runtime will prefer the VTID if present
  @VTID(87)
  void setColorButtons(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CommandUnderlines"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.XlCommandUnderlines
   */

  @DISPID(323) //= 0x143. The runtime will prefer the VTID if present
  @VTID(88)
  excel.XlCommandUnderlines getCommandUnderlines(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "CommandUnderlines"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory excel.XlCommandUnderlines parameter.
   */

  @DISPID(323) //= 0x143. The runtime will prefer the VTID if present
  @VTID(89)
  void setCommandUnderlines(
    @LCID int lcid,
    excel.XlCommandUnderlines rhs);


  /**
   * <p>
   * Getter method for the COM property "ConstrainNumeric"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(324) //= 0x144. The runtime will prefer the VTID if present
  @VTID(90)
  boolean getConstrainNumeric(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "ConstrainNumeric"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(324) //= 0x144. The runtime will prefer the VTID if present
  @VTID(91)
  void setConstrainNumeric(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param formula Mandatory java.lang.Object parameter.
   * @param fromReferenceStyle Mandatory excel.XlReferenceStyle parameter.
   * @param toReferenceStyle Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toAbsolute Optional parameter. Default value is com4j.Variant.getMissing()
   * @param relativeTo Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(325) //= 0x145. The runtime will prefer the VTID if present
  @VTID(92)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object convertFormula(
    @MarshalAs(NativeType.VARIANT) java.lang.Object formula,
    excel.XlReferenceStyle fromReferenceStyle,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object toReferenceStyle,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object toAbsolute,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object relativeTo,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "CopyObjectsWithCells"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(991) //= 0x3df. The runtime will prefer the VTID if present
  @VTID(93)
  boolean getCopyObjectsWithCells(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "CopyObjectsWithCells"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(991) //= 0x3df. The runtime will prefer the VTID if present
  @VTID(94)
  void setCopyObjectsWithCells(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Cursor"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.XlMousePointer
   */

  @DISPID(1161) //= 0x489. The runtime will prefer the VTID if present
  @VTID(95)
  excel.XlMousePointer getCursor(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Cursor"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory excel.XlMousePointer parameter.
   */

  @DISPID(1161) //= 0x489. The runtime will prefer the VTID if present
  @VTID(96)
  void setCursor(
    @LCID int lcid,
    excel.XlMousePointer rhs);


  /**
   * <p>
   * Getter method for the COM property "CustomListCount"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(787) //= 0x313. The runtime will prefer the VTID if present
  @VTID(97)
  int getCustomListCount(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "CutCopyMode"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.XlCutCopyMode
   */

  @DISPID(330) //= 0x14a. The runtime will prefer the VTID if present
  @VTID(98)
  excel.XlCutCopyMode getCutCopyMode(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "CutCopyMode"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory excel.XlCutCopyMode parameter.
   */

  @DISPID(330) //= 0x14a. The runtime will prefer the VTID if present
  @VTID(99)
  void setCutCopyMode(
    @LCID int lcid,
    excel.XlCutCopyMode rhs);


  /**
   * <p>
   * Getter method for the COM property "DataEntryMode"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(331) //= 0x14b. The runtime will prefer the VTID if present
  @VTID(100)
  int getDataEntryMode(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DataEntryMode"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(331) //= 0x14b. The runtime will prefer the VTID if present
  @VTID(101)
  void setDataEntryMode(
    @LCID int lcid,
    int rhs);


  /**
   * @param arg1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1782) //= 0x6f6. The runtime will prefer the VTID if present
  @VTID(102)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dummy1(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4);


  /**
   * @param arg1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1783) //= 0x6f7. The runtime will prefer the VTID if present
  @VTID(103)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dummy2(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1784) //= 0x6f8. The runtime will prefer the VTID if present
  @VTID(104)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dummy3();


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
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1785) //= 0x6f9. The runtime will prefer the VTID if present
  @VTID(105)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dummy4(
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
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15);


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
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1786) //= 0x6fa. The runtime will prefer the VTID if present
  @VTID(106)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dummy5(
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
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1787) //= 0x6fb. The runtime will prefer the VTID if present
  @VTID(107)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dummy6();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1788) //= 0x6fc. The runtime will prefer the VTID if present
  @VTID(108)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dummy7();


  /**
   * @param arg1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1789) //= 0x6fd. The runtime will prefer the VTID if present
  @VTID(109)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dummy8(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1790) //= 0x6fe. The runtime will prefer the VTID if present
  @VTID(110)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dummy9();


  /**
   * @param arg Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(1791) //= 0x6ff. The runtime will prefer the VTID if present
  @VTID(111)
  boolean dummy10(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg);


  /**
   */

  @DISPID(1792) //= 0x700. The runtime will prefer the VTID if present
  @VTID(112)
  void dummy11();


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(113)
  @DefaultMethod
  java.lang.String get_Default();


  /**
   * <p>
   * Getter method for the COM property "DefaultFilePath"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1038) //= 0x40e. The runtime will prefer the VTID if present
  @VTID(114)
  java.lang.String getDefaultFilePath(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DefaultFilePath"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1038) //= 0x40e. The runtime will prefer the VTID if present
  @VTID(115)
  void setDefaultFilePath(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param lcid Mandatory int parameter.
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(116)
  void deleteChartAutoFormat(
    java.lang.String name,
    @LCID int lcid);


  /**
   * @param listNum Mandatory int parameter.
   * @param lcid Mandatory int parameter.
   */

  @DISPID(783) //= 0x30f. The runtime will prefer the VTID if present
  @VTID(117)
  void deleteCustomList(
    int listNum,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Dialogs"
   * </p>
   * @return  Returns a value of type excel.Dialogs
   */

  @DISPID(761) //= 0x2f9. The runtime will prefer the VTID if present
  @VTID(118)
  excel.Dialogs getDialogs();


  /**
   * <p>
   * Getter method for the COM property "DisplayAlerts"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(343) //= 0x157. The runtime will prefer the VTID if present
  @VTID(119)
  boolean getDisplayAlerts(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DisplayAlerts"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(343) //= 0x157. The runtime will prefer the VTID if present
  @VTID(120)
  void setDisplayAlerts(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayFormulaBar"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(344) //= 0x158. The runtime will prefer the VTID if present
  @VTID(121)
  boolean getDisplayFormulaBar(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DisplayFormulaBar"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(344) //= 0x158. The runtime will prefer the VTID if present
  @VTID(122)
  void setDisplayFormulaBar(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayFullScreen"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1061) //= 0x425. The runtime will prefer the VTID if present
  @VTID(123)
  boolean getDisplayFullScreen(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DisplayFullScreen"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1061) //= 0x425. The runtime will prefer the VTID if present
  @VTID(124)
  void setDisplayFullScreen(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayNoteIndicator"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(345) //= 0x159. The runtime will prefer the VTID if present
  @VTID(125)
  boolean getDisplayNoteIndicator();


  /**
   * <p>
   * Setter method for the COM property "DisplayNoteIndicator"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(345) //= 0x159. The runtime will prefer the VTID if present
  @VTID(126)
  void setDisplayNoteIndicator(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayCommentIndicator"
   * </p>
   * @return  Returns a value of type excel.XlCommentDisplayMode
   */

  @DISPID(1196) //= 0x4ac. The runtime will prefer the VTID if present
  @VTID(127)
  excel.XlCommentDisplayMode getDisplayCommentIndicator();


  /**
   * <p>
   * Setter method for the COM property "DisplayCommentIndicator"
   * </p>
   * @param rhs Mandatory excel.XlCommentDisplayMode parameter.
   */

  @DISPID(1196) //= 0x4ac. The runtime will prefer the VTID if present
  @VTID(128)
  void setDisplayCommentIndicator(
    excel.XlCommentDisplayMode rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayExcel4Menus"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(927) //= 0x39f. The runtime will prefer the VTID if present
  @VTID(129)
  boolean getDisplayExcel4Menus(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DisplayExcel4Menus"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(927) //= 0x39f. The runtime will prefer the VTID if present
  @VTID(130)
  void setDisplayExcel4Menus(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayRecentFiles"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(926) //= 0x39e. The runtime will prefer the VTID if present
  @VTID(131)
  boolean getDisplayRecentFiles();


  /**
   * <p>
   * Setter method for the COM property "DisplayRecentFiles"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(926) //= 0x39e. The runtime will prefer the VTID if present
  @VTID(132)
  void setDisplayRecentFiles(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayScrollBars"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(346) //= 0x15a. The runtime will prefer the VTID if present
  @VTID(133)
  boolean getDisplayScrollBars(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DisplayScrollBars"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(346) //= 0x15a. The runtime will prefer the VTID if present
  @VTID(134)
  void setDisplayScrollBars(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayStatusBar"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(347) //= 0x15b. The runtime will prefer the VTID if present
  @VTID(135)
  boolean getDisplayStatusBar(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DisplayStatusBar"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(347) //= 0x15b. The runtime will prefer the VTID if present
  @VTID(136)
  void setDisplayStatusBar(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(349) //= 0x15d. The runtime will prefer the VTID if present
  @VTID(137)
  void doubleClick(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "EditDirectlyInCell"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(929) //= 0x3a1. The runtime will prefer the VTID if present
  @VTID(138)
  boolean getEditDirectlyInCell(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "EditDirectlyInCell"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(929) //= 0x3a1. The runtime will prefer the VTID if present
  @VTID(139)
  void setEditDirectlyInCell(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableAutoComplete"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1179) //= 0x49b. The runtime will prefer the VTID if present
  @VTID(140)
  boolean getEnableAutoComplete();


  /**
   * <p>
   * Setter method for the COM property "EnableAutoComplete"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1179) //= 0x49b. The runtime will prefer the VTID if present
  @VTID(141)
  void setEnableAutoComplete(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableCancelKey"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.XlEnableCancelKey
   */

  @DISPID(1096) //= 0x448. The runtime will prefer the VTID if present
  @VTID(142)
  excel.XlEnableCancelKey getEnableCancelKey(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "EnableCancelKey"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory excel.XlEnableCancelKey parameter.
   */

  @DISPID(1096) //= 0x448. The runtime will prefer the VTID if present
  @VTID(143)
  void setEnableCancelKey(
    @LCID int lcid,
    excel.XlEnableCancelKey rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableSound"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1197) //= 0x4ad. The runtime will prefer the VTID if present
  @VTID(144)
  boolean getEnableSound();


  /**
   * <p>
   * Setter method for the COM property "EnableSound"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1197) //= 0x4ad. The runtime will prefer the VTID if present
  @VTID(145)
  void setEnableSound(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableTipWizard"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1064) //= 0x428. The runtime will prefer the VTID if present
  @VTID(146)
  boolean getEnableTipWizard(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "EnableTipWizard"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1064) //= 0x428. The runtime will prefer the VTID if present
  @VTID(147)
  void setEnableTipWizard(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "FileConverters"
   * </p>
   * @param index1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param index2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(931) //= 0x3a3. The runtime will prefer the VTID if present
  @VTID(148)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getFileConverters(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index2,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "FileSearch"
   * </p>
   * @return  Returns a value of type office.FileSearch
   */

  @DISPID(1200) //= 0x4b0. The runtime will prefer the VTID if present
  @VTID(149)
  office.FileSearch getFileSearch();


  /**
   * <p>
   * Getter method for the COM property "FileFind"
   * </p>
   * @return  Returns a value of type office.IFind
   */

  @DISPID(1201) //= 0x4b1. The runtime will prefer the VTID if present
  @VTID(150)
  office.IFind getFileFind();


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(1068) //= 0x42c. The runtime will prefer the VTID if present
  @VTID(151)
  void _FindFile(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "FixedDecimal"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(351) //= 0x15f. The runtime will prefer the VTID if present
  @VTID(152)
  boolean getFixedDecimal(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "FixedDecimal"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(351) //= 0x15f. The runtime will prefer the VTID if present
  @VTID(153)
  void setFixedDecimal(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "FixedDecimalPlaces"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(352) //= 0x160. The runtime will prefer the VTID if present
  @VTID(154)
  int getFixedDecimalPlaces(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "FixedDecimalPlaces"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(352) //= 0x160. The runtime will prefer the VTID if present
  @VTID(155)
  void setFixedDecimalPlaces(
    @LCID int lcid,
    int rhs);


  /**
   * @param listNum Mandatory int parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(786) //= 0x312. The runtime will prefer the VTID if present
  @VTID(156)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getCustomListContents(
    int listNum,
    @LCID int lcid);


  /**
   * @param listArray Mandatory java.lang.Object parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(785) //= 0x311. The runtime will prefer the VTID if present
  @VTID(157)
  int getCustomListNum(
    @MarshalAs(NativeType.VARIANT) java.lang.Object listArray,
    @LCID int lcid);


  /**
   * @param fileFilter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param filterIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param title Optional parameter. Default value is com4j.Variant.getMissing()
   * @param buttonText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param multiSelect Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1075) //= 0x433. The runtime will prefer the VTID if present
  @VTID(158)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getOpenFilename(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fileFilter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filterIndex,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object title,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object buttonText,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object multiSelect,
    @LCID int lcid);


  /**
   * @param initialFilename Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fileFilter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param filterIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param title Optional parameter. Default value is com4j.Variant.getMissing()
   * @param buttonText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1076) //= 0x434. The runtime will prefer the VTID if present
  @VTID(159)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getSaveAsFilename(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object initialFilename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fileFilter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filterIndex,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object title,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object buttonText,
    @LCID int lcid);


  /**
   * @param reference Optional parameter. Default value is com4j.Variant.getMissing()
   * @param scroll Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(475) //= 0x1db. The runtime will prefer the VTID if present
  @VTID(160)
  void _goto(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object reference,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object scroll,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(161)
  double getHeight(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory double parameter.
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(162)
  void setHeight(
    @LCID int lcid,
    double rhs);


  /**
   * @param helpFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param helpContextID Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(354) //= 0x162. The runtime will prefer the VTID if present
  @VTID(163)
  void help(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object helpFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object helpContextID,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "IgnoreRemoteRequests"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(356) //= 0x164. The runtime will prefer the VTID if present
  @VTID(164)
  boolean getIgnoreRemoteRequests(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "IgnoreRemoteRequests"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(356) //= 0x164. The runtime will prefer the VTID if present
  @VTID(165)
  void setIgnoreRemoteRequests(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param inches Mandatory double parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(1087) //= 0x43f. The runtime will prefer the VTID if present
  @VTID(166)
  double inchesToPoints(
    double inches,
    @LCID int lcid);


  /**
   * @param prompt Mandatory java.lang.String parameter.
   * @param title Optional parameter. Default value is com4j.Variant.getMissing()
   * @param _default Optional parameter. Default value is com4j.Variant.getMissing()
   * @param left Optional parameter. Default value is com4j.Variant.getMissing()
   * @param top Optional parameter. Default value is com4j.Variant.getMissing()
   * @param helpFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param helpContextID Optional parameter. Default value is com4j.Variant.getMissing()
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(357) //= 0x165. The runtime will prefer the VTID if present
  @VTID(167)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object inputBox(
    java.lang.String prompt,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object title,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object _default,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object left,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object top,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object helpFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object helpContextID,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Interactive"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(361) //= 0x169. The runtime will prefer the VTID if present
  @VTID(168)
  boolean getInteractive(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Interactive"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(361) //= 0x169. The runtime will prefer the VTID if present
  @VTID(169)
  void setInteractive(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "International"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(362) //= 0x16a. The runtime will prefer the VTID if present
  @VTID(170)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getInternational(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Iteration"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(363) //= 0x16b. The runtime will prefer the VTID if present
  @VTID(171)
  boolean getIteration(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Iteration"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(363) //= 0x16b. The runtime will prefer the VTID if present
  @VTID(172)
  void setIteration(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "LargeButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(364) //= 0x16c. The runtime will prefer the VTID if present
  @VTID(173)
  boolean getLargeButtons();


  /**
   * <p>
   * Setter method for the COM property "LargeButtons"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(364) //= 0x16c. The runtime will prefer the VTID if present
  @VTID(174)
  void setLargeButtons(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(175)
  double getLeft(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory double parameter.
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(176)
  void setLeft(
    @LCID int lcid,
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "LibraryPath"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(366) //= 0x16e. The runtime will prefer the VTID if present
  @VTID(177)
  java.lang.String getLibraryPath(
    @LCID int lcid);


  /**
   * @param macro Optional parameter. Default value is com4j.Variant.getMissing()
   * @param description Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasMenu Optional parameter. Default value is com4j.Variant.getMissing()
   * @param menuText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasShortcutKey Optional parameter. Default value is com4j.Variant.getMissing()
   * @param shortcutKey Optional parameter. Default value is com4j.Variant.getMissing()
   * @param category Optional parameter. Default value is com4j.Variant.getMissing()
   * @param statusBar Optional parameter. Default value is com4j.Variant.getMissing()
   * @param helpContextID Optional parameter. Default value is com4j.Variant.getMissing()
   * @param helpFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(1135) //= 0x46f. The runtime will prefer the VTID if present
  @VTID(178)
  void _MacroOptions(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object macro,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object description,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object hasMenu,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object menuText,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object hasShortcutKey,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object shortcutKey,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object category,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object statusBar,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object helpContextID,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object helpFile,
    @LCID int lcid);


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(945) //= 0x3b1. The runtime will prefer the VTID if present
  @VTID(179)
  void mailLogoff(
    @LCID int lcid);


  /**
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param downloadNewMail Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(943) //= 0x3af. The runtime will prefer the VTID if present
  @VTID(180)
  void mailLogon(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object downloadNewMail,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "MailSession"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(942) //= 0x3ae. The runtime will prefer the VTID if present
  @VTID(181)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getMailSession(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "MailSystem"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.XlMailSystem
   */

  @DISPID(971) //= 0x3cb. The runtime will prefer the VTID if present
  @VTID(182)
  excel.XlMailSystem getMailSystem(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "MathCoprocessorAvailable"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(367) //= 0x16f. The runtime will prefer the VTID if present
  @VTID(183)
  boolean getMathCoprocessorAvailable(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "MaxChange"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(368) //= 0x170. The runtime will prefer the VTID if present
  @VTID(184)
  double getMaxChange(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "MaxChange"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory double parameter.
   */

  @DISPID(368) //= 0x170. The runtime will prefer the VTID if present
  @VTID(185)
  void setMaxChange(
    @LCID int lcid,
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "MaxIterations"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(369) //= 0x171. The runtime will prefer the VTID if present
  @VTID(186)
  int getMaxIterations(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "MaxIterations"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(369) //= 0x171. The runtime will prefer the VTID if present
  @VTID(187)
  void setMaxIterations(
    @LCID int lcid,
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "MemoryFree"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(370) //= 0x172. The runtime will prefer the VTID if present
  @VTID(188)
  int getMemoryFree(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "MemoryTotal"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(371) //= 0x173. The runtime will prefer the VTID if present
  @VTID(189)
  int getMemoryTotal(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "MemoryUsed"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(372) //= 0x174. The runtime will prefer the VTID if present
  @VTID(190)
  int getMemoryUsed(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "MouseAvailable"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(373) //= 0x175. The runtime will prefer the VTID if present
  @VTID(191)
  boolean getMouseAvailable(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "MoveAfterReturn"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(374) //= 0x176. The runtime will prefer the VTID if present
  @VTID(192)
  boolean getMoveAfterReturn(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "MoveAfterReturn"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(374) //= 0x176. The runtime will prefer the VTID if present
  @VTID(193)
  void setMoveAfterReturn(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MoveAfterReturnDirection"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.XlDirection
   */

  @DISPID(1144) //= 0x478. The runtime will prefer the VTID if present
  @VTID(194)
  excel.XlDirection getMoveAfterReturnDirection(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "MoveAfterReturnDirection"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory excel.XlDirection parameter.
   */

  @DISPID(1144) //= 0x478. The runtime will prefer the VTID if present
  @VTID(195)
  void setMoveAfterReturnDirection(
    @LCID int lcid,
    excel.XlDirection rhs);


  /**
   * <p>
   * Getter method for the COM property "RecentFiles"
   * </p>
   * @return  Returns a value of type excel.RecentFiles
   */

  @DISPID(1202) //= 0x4b2. The runtime will prefer the VTID if present
  @VTID(196)
  excel.RecentFiles getRecentFiles();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(197)
  java.lang.String getName();


  /**
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel._Workbook
   */

  @DISPID(972) //= 0x3cc. The runtime will prefer the VTID if present
  @VTID(198)
  excel._Workbook nextLetter(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "NetworkTemplatesPath"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(388) //= 0x184. The runtime will prefer the VTID if present
  @VTID(199)
  java.lang.String getNetworkTemplatesPath(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ODBCErrors"
   * </p>
   * @return  Returns a value of type excel.ODBCErrors
   */

  @DISPID(1203) //= 0x4b3. The runtime will prefer the VTID if present
  @VTID(200)
  excel.ODBCErrors getODBCErrors();


  /**
   * <p>
   * Getter method for the COM property "ODBCTimeout"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1204) //= 0x4b4. The runtime will prefer the VTID if present
  @VTID(201)
  int getODBCTimeout();


  /**
   * <p>
   * Setter method for the COM property "ODBCTimeout"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1204) //= 0x4b4. The runtime will prefer the VTID if present
  @VTID(202)
  void setODBCTimeout(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "OnCalculate"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(625) //= 0x271. The runtime will prefer the VTID if present
  @VTID(203)
  java.lang.String getOnCalculate(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "OnCalculate"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(625) //= 0x271. The runtime will prefer the VTID if present
  @VTID(204)
  void setOnCalculate(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "OnData"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(629) //= 0x275. The runtime will prefer the VTID if present
  @VTID(205)
  java.lang.String getOnData(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "OnData"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(629) //= 0x275. The runtime will prefer the VTID if present
  @VTID(206)
  void setOnData(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "OnDoubleClick"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(628) //= 0x274. The runtime will prefer the VTID if present
  @VTID(207)
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
  @VTID(208)
  void setOnDoubleClick(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "OnEntry"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(627) //= 0x273. The runtime will prefer the VTID if present
  @VTID(209)
  java.lang.String getOnEntry(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "OnEntry"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(627) //= 0x273. The runtime will prefer the VTID if present
  @VTID(210)
  void setOnEntry(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * @param key Mandatory java.lang.String parameter.
   * @param procedure Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(626) //= 0x272. The runtime will prefer the VTID if present
  @VTID(211)
  void onKey(
    java.lang.String key,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object procedure,
    @LCID int lcid);


  /**
   * @param text Mandatory java.lang.String parameter.
   * @param procedure Mandatory java.lang.String parameter.
   * @param lcid Mandatory int parameter.
   */

  @DISPID(769) //= 0x301. The runtime will prefer the VTID if present
  @VTID(212)
  void onRepeat(
    java.lang.String text,
    java.lang.String procedure,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "OnSheetActivate"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1031) //= 0x407. The runtime will prefer the VTID if present
  @VTID(213)
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
  @VTID(214)
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
  @VTID(215)
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
  @VTID(216)
  void setOnSheetDeactivate(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * @param earliestTime Mandatory java.lang.Object parameter.
   * @param procedure Mandatory java.lang.String parameter.
   * @param latestTime Optional parameter. Default value is com4j.Variant.getMissing()
   * @param schedule Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(624) //= 0x270. The runtime will prefer the VTID if present
  @VTID(217)
  void onTime(
    @MarshalAs(NativeType.VARIANT) java.lang.Object earliestTime,
    java.lang.String procedure,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object latestTime,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object schedule,
    @LCID int lcid);


  /**
   * @param text Mandatory java.lang.String parameter.
   * @param procedure Mandatory java.lang.String parameter.
   * @param lcid Mandatory int parameter.
   */

  @DISPID(770) //= 0x302. The runtime will prefer the VTID if present
  @VTID(218)
  void onUndo(
    java.lang.String text,
    java.lang.String procedure,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "OnWindow"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(623) //= 0x26f. The runtime will prefer the VTID if present
  @VTID(219)
  java.lang.String getOnWindow(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "OnWindow"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(623) //= 0x26f. The runtime will prefer the VTID if present
  @VTID(220)
  void setOnWindow(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "OperatingSystem"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(375) //= 0x177. The runtime will prefer the VTID if present
  @VTID(221)
  java.lang.String getOperatingSystem(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "OrganizationName"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(376) //= 0x178. The runtime will prefer the VTID if present
  @VTID(222)
  java.lang.String getOrganizationName(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(291) //= 0x123. The runtime will prefer the VTID if present
  @VTID(223)
  java.lang.String getPath(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "PathSeparator"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(377) //= 0x179. The runtime will prefer the VTID if present
  @VTID(224)
  java.lang.String getPathSeparator(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "PreviousSelections"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(378) //= 0x17a. The runtime will prefer the VTID if present
  @VTID(225)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getPreviousSelections(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "PivotTableSelection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1205) //= 0x4b5. The runtime will prefer the VTID if present
  @VTID(226)
  boolean getPivotTableSelection();


  /**
   * <p>
   * Setter method for the COM property "PivotTableSelection"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1205) //= 0x4b5. The runtime will prefer the VTID if present
  @VTID(227)
  void setPivotTableSelection(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PromptForSummaryInfo"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1062) //= 0x426. The runtime will prefer the VTID if present
  @VTID(228)
  boolean getPromptForSummaryInfo(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "PromptForSummaryInfo"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1062) //= 0x426. The runtime will prefer the VTID if present
  @VTID(229)
  void setPromptForSummaryInfo(
    @LCID int lcid,
    boolean rhs);


  /**
   */

  @DISPID(302) //= 0x12e. The runtime will prefer the VTID if present
  @VTID(230)
  void quit();


  /**
   * @param basicCode Optional parameter. Default value is com4j.Variant.getMissing()
   * @param xlmCode Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(773) //= 0x305. The runtime will prefer the VTID if present
  @VTID(231)
  void recordMacro(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object basicCode,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object xlmCode,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "RecordRelative"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(379) //= 0x17b. The runtime will prefer the VTID if present
  @VTID(232)
  boolean getRecordRelative(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ReferenceStyle"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.XlReferenceStyle
   */

  @DISPID(380) //= 0x17c. The runtime will prefer the VTID if present
  @VTID(233)
  excel.XlReferenceStyle getReferenceStyle(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "ReferenceStyle"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory excel.XlReferenceStyle parameter.
   */

  @DISPID(380) //= 0x17c. The runtime will prefer the VTID if present
  @VTID(234)
  void setReferenceStyle(
    @LCID int lcid,
    excel.XlReferenceStyle rhs);


  /**
   * <p>
   * Getter method for the COM property "RegisteredFunctions"
   * </p>
   * @param index1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param index2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(775) //= 0x307. The runtime will prefer the VTID if present
  @VTID(235)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getRegisteredFunctions(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index2,
    @LCID int lcid);


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(236)
  boolean registerXLL(
    java.lang.String filename,
    @LCID int lcid);


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(301) //= 0x12d. The runtime will prefer the VTID if present
  @VTID(237)
  void repeat(
    @LCID int lcid);


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(928) //= 0x3a0. The runtime will prefer the VTID if present
  @VTID(238)
  void resetTipWizard(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "RollZoom"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1206) //= 0x4b6. The runtime will prefer the VTID if present
  @VTID(239)
  boolean getRollZoom();


  /**
   * <p>
   * Setter method for the COM property "RollZoom"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1206) //= 0x4b6. The runtime will prefer the VTID if present
  @VTID(240)
  void setRollZoom(
    boolean rhs);


  /**
   * @param filename Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(283) //= 0x11b. The runtime will prefer the VTID if present
  @VTID(241)
  void save(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filename,
    @LCID int lcid);


  /**
   * @param filename Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(242)
  void saveWorkspace(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filename,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ScreenUpdating"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(382) //= 0x17e. The runtime will prefer the VTID if present
  @VTID(243)
  boolean getScreenUpdating(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "ScreenUpdating"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(382) //= 0x17e. The runtime will prefer the VTID if present
  @VTID(244)
  void setScreenUpdating(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param formatName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param gallery Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(245)
  void setDefaultChart(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object formatName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object gallery);


  /**
   * <p>
   * Getter method for the COM property "SheetsInNewWorkbook"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(993) //= 0x3e1. The runtime will prefer the VTID if present
  @VTID(246)
  int getSheetsInNewWorkbook(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "SheetsInNewWorkbook"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(993) //= 0x3e1. The runtime will prefer the VTID if present
  @VTID(247)
  void setSheetsInNewWorkbook(
    @LCID int lcid,
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowChartTipNames"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1207) //= 0x4b7. The runtime will prefer the VTID if present
  @VTID(248)
  boolean getShowChartTipNames();


  /**
   * <p>
   * Setter method for the COM property "ShowChartTipNames"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1207) //= 0x4b7. The runtime will prefer the VTID if present
  @VTID(249)
  void setShowChartTipNames(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowChartTipValues"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1208) //= 0x4b8. The runtime will prefer the VTID if present
  @VTID(250)
  boolean getShowChartTipValues();


  /**
   * <p>
   * Setter method for the COM property "ShowChartTipValues"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1208) //= 0x4b8. The runtime will prefer the VTID if present
  @VTID(251)
  void setShowChartTipValues(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "StandardFont"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(924) //= 0x39c. The runtime will prefer the VTID if present
  @VTID(252)
  java.lang.String getStandardFont(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "StandardFont"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(924) //= 0x39c. The runtime will prefer the VTID if present
  @VTID(253)
  void setStandardFont(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "StandardFontSize"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(925) //= 0x39d. The runtime will prefer the VTID if present
  @VTID(254)
  double getStandardFontSize(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "StandardFontSize"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory double parameter.
   */

  @DISPID(925) //= 0x39d. The runtime will prefer the VTID if present
  @VTID(255)
  void setStandardFontSize(
    @LCID int lcid,
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "StartupPath"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(385) //= 0x181. The runtime will prefer the VTID if present
  @VTID(256)
  java.lang.String getStartupPath(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "StatusBar"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(386) //= 0x182. The runtime will prefer the VTID if present
  @VTID(257)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getStatusBar(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "StatusBar"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(386) //= 0x182. The runtime will prefer the VTID if present
  @VTID(258)
  void setStatusBar(
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "TemplatesPath"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(381) //= 0x17d. The runtime will prefer the VTID if present
  @VTID(259)
  java.lang.String getTemplatesPath(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ShowToolTips"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(387) //= 0x183. The runtime will prefer the VTID if present
  @VTID(260)
  boolean getShowToolTips();


  /**
   * <p>
   * Setter method for the COM property "ShowToolTips"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(387) //= 0x183. The runtime will prefer the VTID if present
  @VTID(261)
  void setShowToolTips(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(262)
  double getTop(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory double parameter.
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(263)
  void setTop(
    @LCID int lcid,
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "DefaultSaveFormat"
   * </p>
   * @return  Returns a value of type excel.XlFileFormat
   */

  @DISPID(1209) //= 0x4b9. The runtime will prefer the VTID if present
  @VTID(264)
  excel.XlFileFormat getDefaultSaveFormat();


  /**
   * <p>
   * Setter method for the COM property "DefaultSaveFormat"
   * </p>
   * @param rhs Mandatory excel.XlFileFormat parameter.
   */

  @DISPID(1209) //= 0x4b9. The runtime will prefer the VTID if present
  @VTID(265)
  void setDefaultSaveFormat(
    excel.XlFileFormat rhs);


  /**
   * <p>
   * Getter method for the COM property "TransitionMenuKey"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(310) //= 0x136. The runtime will prefer the VTID if present
  @VTID(266)
  java.lang.String getTransitionMenuKey(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "TransitionMenuKey"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(310) //= 0x136. The runtime will prefer the VTID if present
  @VTID(267)
  void setTransitionMenuKey(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "TransitionMenuKeyAction"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(311) //= 0x137. The runtime will prefer the VTID if present
  @VTID(268)
  int getTransitionMenuKeyAction(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "TransitionMenuKeyAction"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(311) //= 0x137. The runtime will prefer the VTID if present
  @VTID(269)
  void setTransitionMenuKeyAction(
    @LCID int lcid,
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "TransitionNavigKeys"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(312) //= 0x138. The runtime will prefer the VTID if present
  @VTID(270)
  boolean getTransitionNavigKeys(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "TransitionNavigKeys"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(312) //= 0x138. The runtime will prefer the VTID if present
  @VTID(271)
  void setTransitionNavigKeys(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(303) //= 0x12f. The runtime will prefer the VTID if present
  @VTID(272)
  void undo(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "UsableHeight"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(389) //= 0x185. The runtime will prefer the VTID if present
  @VTID(273)
  double getUsableHeight(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "UsableWidth"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(390) //= 0x186. The runtime will prefer the VTID if present
  @VTID(274)
  double getUsableWidth(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "UserControl"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1210) //= 0x4ba. The runtime will prefer the VTID if present
  @VTID(275)
  boolean getUserControl();


  /**
   * <p>
   * Setter method for the COM property "UserControl"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1210) //= 0x4ba. The runtime will prefer the VTID if present
  @VTID(276)
  void setUserControl(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "UserName"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(391) //= 0x187. The runtime will prefer the VTID if present
  @VTID(277)
  java.lang.String getUserName(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "UserName"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(391) //= 0x187. The runtime will prefer the VTID if present
  @VTID(278)
  void setUserName(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(279)
  java.lang.String getValue();


  /**
   * <p>
   * Getter method for the COM property "VBE"
   * </p>
   * @return  Returns a value of type vba.VBE
   */

  @DISPID(1211) //= 0x4bb. The runtime will prefer the VTID if present
  @VTID(280)
  vba.VBE getVBE();


  /**
   * <p>
   * Getter method for the COM property "Version"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(392) //= 0x188. The runtime will prefer the VTID if present
  @VTID(281)
  java.lang.String getVersion(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(558) //= 0x22e. The runtime will prefer the VTID if present
  @VTID(282)
  boolean getVisible(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(558) //= 0x22e. The runtime will prefer the VTID if present
  @VTID(283)
  void setVisible(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param _volatile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(788) //= 0x314. The runtime will prefer the VTID if present
  @VTID(284)
  void _volatile(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object _volatile,
    @LCID int lcid);


  /**
   * @param time Mandatory java.lang.Object parameter.
   * @param lcid Mandatory int parameter.
   */

  @DISPID(393) //= 0x189. The runtime will prefer the VTID if present
  @VTID(285)
  void _Wait(
    @MarshalAs(NativeType.VARIANT) java.lang.Object time,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(286)
  double getWidth(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory double parameter.
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(287)
  void setWidth(
    @LCID int lcid,
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "WindowsForPens"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(395) //= 0x18b. The runtime will prefer the VTID if present
  @VTID(288)
  boolean getWindowsForPens(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "WindowState"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.XlWindowState
   */

  @DISPID(396) //= 0x18c. The runtime will prefer the VTID if present
  @VTID(289)
  excel.XlWindowState getWindowState(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "WindowState"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory excel.XlWindowState parameter.
   */

  @DISPID(396) //= 0x18c. The runtime will prefer the VTID if present
  @VTID(290)
  void setWindowState(
    @LCID int lcid,
    excel.XlWindowState rhs);


  /**
   * <p>
   * Getter method for the COM property "UILanguage"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(291)
  int getUILanguage(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "UILanguage"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(292)
  void setUILanguage(
    @LCID int lcid,
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "DefaultSheetDirection"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(229) //= 0xe5. The runtime will prefer the VTID if present
  @VTID(293)
  int getDefaultSheetDirection(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DefaultSheetDirection"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(229) //= 0xe5. The runtime will prefer the VTID if present
  @VTID(294)
  void setDefaultSheetDirection(
    @LCID int lcid,
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "CursorMovement"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(232) //= 0xe8. The runtime will prefer the VTID if present
  @VTID(295)
  int getCursorMovement(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "CursorMovement"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(232) //= 0xe8. The runtime will prefer the VTID if present
  @VTID(296)
  void setCursorMovement(
    @LCID int lcid,
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ControlCharacters"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(233) //= 0xe9. The runtime will prefer the VTID if present
  @VTID(297)
  boolean getControlCharacters(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "ControlCharacters"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(233) //= 0xe9. The runtime will prefer the VTID if present
  @VTID(298)
  void setControlCharacters(
    @LCID int lcid,
    boolean rhs);


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
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(169) //= 0xa9. The runtime will prefer the VTID if present
  @VTID(299)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object _WSFunction(
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
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "EnableEvents"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1212) //= 0x4bc. The runtime will prefer the VTID if present
  @VTID(300)
  boolean getEnableEvents();


  /**
   * <p>
   * Setter method for the COM property "EnableEvents"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1212) //= 0x4bc. The runtime will prefer the VTID if present
  @VTID(301)
  void setEnableEvents(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayInfoWindow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1213) //= 0x4bd. The runtime will prefer the VTID if present
  @VTID(302)
  boolean getDisplayInfoWindow();


  /**
   * <p>
   * Setter method for the COM property "DisplayInfoWindow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1213) //= 0x4bd. The runtime will prefer the VTID if present
  @VTID(303)
  void setDisplayInfoWindow(
    boolean rhs);


  /**
   * @param time Mandatory java.lang.Object parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1770) //= 0x6ea. The runtime will prefer the VTID if present
  @VTID(304)
  boolean wait_(
    @MarshalAs(NativeType.VARIANT) java.lang.Object time,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ExtendList"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1793) //= 0x701. The runtime will prefer the VTID if present
  @VTID(305)
  boolean getExtendList();


  /**
   * <p>
   * Setter method for the COM property "ExtendList"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1793) //= 0x701. The runtime will prefer the VTID if present
  @VTID(306)
  void setExtendList(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "OLEDBErrors"
   * </p>
   * @return  Returns a value of type excel.OLEDBErrors
   */

  @DISPID(1794) //= 0x702. The runtime will prefer the VTID if present
  @VTID(307)
  excel.OLEDBErrors getOLEDBErrors();


  /**
   * @param text Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1795) //= 0x703. The runtime will prefer the VTID if present
  @VTID(308)
  java.lang.String getPhonetic(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object text);


  /**
   * <p>
   * Getter method for the COM property "COMAddIns"
   * </p>
   * @return  Returns a value of type office.COMAddIns
   */

  @DISPID(1796) //= 0x704. The runtime will prefer the VTID if present
  @VTID(309)
  office.COMAddIns getCOMAddIns();


  @VTID(309)
  @ReturnValue(defaultPropertyThrough={office.COMAddIns.class})
  office.COMAddIn getCOMAddIns(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "DefaultWebOptions"
   * </p>
   * @return  Returns a value of type excel.DefaultWebOptions
   */

  @DISPID(1797) //= 0x705. The runtime will prefer the VTID if present
  @VTID(310)
  excel.DefaultWebOptions getDefaultWebOptions();


  /**
   * <p>
   * Getter method for the COM property "ProductCode"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1798) //= 0x706. The runtime will prefer the VTID if present
  @VTID(311)
  java.lang.String getProductCode();


  /**
   * <p>
   * Getter method for the COM property "UserLibraryPath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1799) //= 0x707. The runtime will prefer the VTID if present
  @VTID(312)
  java.lang.String getUserLibraryPath();


  /**
   * <p>
   * Getter method for the COM property "AutoPercentEntry"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1800) //= 0x708. The runtime will prefer the VTID if present
  @VTID(313)
  boolean getAutoPercentEntry();


  /**
   * <p>
   * Setter method for the COM property "AutoPercentEntry"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1800) //= 0x708. The runtime will prefer the VTID if present
  @VTID(314)
  void setAutoPercentEntry(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "LanguageSettings"
   * </p>
   * @return  Returns a value of type office.LanguageSettings
   */

  @DISPID(1801) //= 0x709. The runtime will prefer the VTID if present
  @VTID(315)
  office.LanguageSettings getLanguageSettings();


  /**
   * <p>
   * Getter method for the COM property "Dummy101"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1802) //= 0x70a. The runtime will prefer the VTID if present
  @VTID(316)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getDummy101();


  /**
   * @param p1 Mandatory excel.PivotTable parameter.
   * @param p2 Mandatory excel.PivotTable parameter.
   */

  @DISPID(1803) //= 0x70b. The runtime will prefer the VTID if present
  @VTID(317)
  void dummy12(
    excel.PivotTable p1,
    excel.PivotTable p2);


  /**
   * <p>
   * Getter method for the COM property "AnswerWizard"
   * </p>
   * @return  Returns a value of type office.AnswerWizard
   */

  @DISPID(1804) //= 0x70c. The runtime will prefer the VTID if present
  @VTID(318)
  office.AnswerWizard getAnswerWizard();


  /**
   */

  @DISPID(1805) //= 0x70d. The runtime will prefer the VTID if present
  @VTID(319)
  void calculateFull();


  /**
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1771) //= 0x6eb. The runtime will prefer the VTID if present
  @VTID(320)
  boolean findFile(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "CalculationVersion"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1806) //= 0x70e. The runtime will prefer the VTID if present
  @VTID(321)
  int getCalculationVersion();


  /**
   * <p>
   * Getter method for the COM property "ShowWindowsInTaskbar"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1807) //= 0x70f. The runtime will prefer the VTID if present
  @VTID(322)
  boolean getShowWindowsInTaskbar();


  /**
   * <p>
   * Setter method for the COM property "ShowWindowsInTaskbar"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1807) //= 0x70f. The runtime will prefer the VTID if present
  @VTID(323)
  void setShowWindowsInTaskbar(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "FeatureInstall"
   * </p>
   * @return  Returns a value of type office.MsoFeatureInstall
   */

  @DISPID(1808) //= 0x710. The runtime will prefer the VTID if present
  @VTID(324)
  office.MsoFeatureInstall getFeatureInstall();


  /**
   * <p>
   * Setter method for the COM property "FeatureInstall"
   * </p>
   * @param rhs Mandatory office.MsoFeatureInstall parameter.
   */

  @DISPID(1808) //= 0x710. The runtime will prefer the VTID if present
  @VTID(325)
  void setFeatureInstall(
    office.MsoFeatureInstall rhs);


  /**
   * <p>
   * Getter method for the COM property "Ready"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1932) //= 0x78c. The runtime will prefer the VTID if present
  @VTID(326)
  boolean getReady();


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

  @DISPID(1933) //= 0x78d. The runtime will prefer the VTID if present
  @VTID(327)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dummy13(
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
   * Getter method for the COM property "FindFormat"
   * </p>
   * @return  Returns a value of type excel.CellFormat
   */

  @DISPID(1934) //= 0x78e. The runtime will prefer the VTID if present
  @VTID(328)
  excel.CellFormat getFindFormat();


  /**
   * <p>
   * Setter method for the COM property "FindFormat"
   * </p>
   * @param rhs Mandatory excel.CellFormat parameter.
   */

  @DISPID(1934) //= 0x78e. The runtime will prefer the VTID if present
  @VTID(329)
  void setFindFormat(
    excel.CellFormat rhs);


  /**
   * <p>
   * Getter method for the COM property "ReplaceFormat"
   * </p>
   * @return  Returns a value of type excel.CellFormat
   */

  @DISPID(1935) //= 0x78f. The runtime will prefer the VTID if present
  @VTID(330)
  excel.CellFormat getReplaceFormat();


  /**
   * <p>
   * Setter method for the COM property "ReplaceFormat"
   * </p>
   * @param rhs Mandatory excel.CellFormat parameter.
   */

  @DISPID(1935) //= 0x78f. The runtime will prefer the VTID if present
  @VTID(331)
  void setReplaceFormat(
    excel.CellFormat rhs);


  /**
   * <p>
   * Getter method for the COM property "UsedObjects"
   * </p>
   * @return  Returns a value of type excel.UsedObjects
   */

  @DISPID(1936) //= 0x790. The runtime will prefer the VTID if present
  @VTID(332)
  excel.UsedObjects getUsedObjects();


  /**
   * <p>
   * Getter method for the COM property "CalculationState"
   * </p>
   * @return  Returns a value of type excel.XlCalculationState
   */

  @DISPID(1937) //= 0x791. The runtime will prefer the VTID if present
  @VTID(333)
  excel.XlCalculationState getCalculationState();


  /**
   * <p>
   * Getter method for the COM property "CalculationInterruptKey"
   * </p>
   * @return  Returns a value of type excel.XlCalculationInterruptKey
   */

  @DISPID(1938) //= 0x792. The runtime will prefer the VTID if present
  @VTID(334)
  excel.XlCalculationInterruptKey getCalculationInterruptKey();


  /**
   * <p>
   * Setter method for the COM property "CalculationInterruptKey"
   * </p>
   * @param rhs Mandatory excel.XlCalculationInterruptKey parameter.
   */

  @DISPID(1938) //= 0x792. The runtime will prefer the VTID if present
  @VTID(335)
  void setCalculationInterruptKey(
    excel.XlCalculationInterruptKey rhs);


  /**
   * <p>
   * Getter method for the COM property "Watches"
   * </p>
   * @return  Returns a value of type excel.Watches
   */

  @DISPID(1939) //= 0x793. The runtime will prefer the VTID if present
  @VTID(336)
  excel.Watches getWatches();


  /**
   * <p>
   * Getter method for the COM property "DisplayFunctionToolTips"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1940) //= 0x794. The runtime will prefer the VTID if present
  @VTID(337)
  boolean getDisplayFunctionToolTips();


  /**
   * <p>
   * Setter method for the COM property "DisplayFunctionToolTips"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1940) //= 0x794. The runtime will prefer the VTID if present
  @VTID(338)
  void setDisplayFunctionToolTips(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AutomationSecurity"
   * </p>
   * @return  Returns a value of type office.MsoAutomationSecurity
   */

  @DISPID(1941) //= 0x795. The runtime will prefer the VTID if present
  @VTID(339)
  office.MsoAutomationSecurity getAutomationSecurity();


  /**
   * <p>
   * Setter method for the COM property "AutomationSecurity"
   * </p>
   * @param rhs Mandatory office.MsoAutomationSecurity parameter.
   */

  @DISPID(1941) //= 0x795. The runtime will prefer the VTID if present
  @VTID(340)
  void setAutomationSecurity(
    office.MsoAutomationSecurity rhs);


  /**
   * <p>
   * Getter method for the COM property "FileDialog"
   * </p>
   * @param fileDialogType Mandatory office.MsoFileDialogType parameter.
   * @return  Returns a value of type office.FileDialog
   */

  @DISPID(1942) //= 0x796. The runtime will prefer the VTID if present
  @VTID(341)
  office.FileDialog getFileDialog(
    office.MsoFileDialogType fileDialogType);


  /**
   */

  @DISPID(1944) //= 0x798. The runtime will prefer the VTID if present
  @VTID(342)
  void dummy14();


  /**
   */

  @DISPID(1945) //= 0x799. The runtime will prefer the VTID if present
  @VTID(343)
  void calculateFullRebuild();


  /**
   * <p>
   * Getter method for the COM property "DisplayPasteOptions"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1946) //= 0x79a. The runtime will prefer the VTID if present
  @VTID(344)
  boolean getDisplayPasteOptions();


  /**
   * <p>
   * Setter method for the COM property "DisplayPasteOptions"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1946) //= 0x79a. The runtime will prefer the VTID if present
  @VTID(345)
  void setDisplayPasteOptions(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayInsertOptions"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1947) //= 0x79b. The runtime will prefer the VTID if present
  @VTID(346)
  boolean getDisplayInsertOptions();


  /**
   * <p>
   * Setter method for the COM property "DisplayInsertOptions"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1947) //= 0x79b. The runtime will prefer the VTID if present
  @VTID(347)
  void setDisplayInsertOptions(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "GenerateGetPivotData"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1948) //= 0x79c. The runtime will prefer the VTID if present
  @VTID(348)
  boolean getGenerateGetPivotData();


  /**
   * <p>
   * Setter method for the COM property "GenerateGetPivotData"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1948) //= 0x79c. The runtime will prefer the VTID if present
  @VTID(349)
  void setGenerateGetPivotData(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoRecover"
   * </p>
   * @return  Returns a value of type excel.AutoRecover
   */

  @DISPID(1949) //= 0x79d. The runtime will prefer the VTID if present
  @VTID(350)
  excel.AutoRecover getAutoRecover();


  /**
   * <p>
   * Getter method for the COM property "Hwnd"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1950) //= 0x79e. The runtime will prefer the VTID if present
  @VTID(351)
  int getHwnd();


  /**
   * <p>
   * Getter method for the COM property "Hinstance"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1951) //= 0x79f. The runtime will prefer the VTID if present
  @VTID(352)
  int getHinstance();


  /**
   * @param keepAbort Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1952) //= 0x7a0. The runtime will prefer the VTID if present
  @VTID(353)
  void checkAbort(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object keepAbort);


  /**
   * <p>
   * Getter method for the COM property "ErrorCheckingOptions"
   * </p>
   * @return  Returns a value of type excel.ErrorCheckingOptions
   */

  @DISPID(1954) //= 0x7a2. The runtime will prefer the VTID if present
  @VTID(354)
  excel.ErrorCheckingOptions getErrorCheckingOptions();


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeReplaceHyperlinks"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1955) //= 0x7a3. The runtime will prefer the VTID if present
  @VTID(355)
  boolean getAutoFormatAsYouTypeReplaceHyperlinks();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeReplaceHyperlinks"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1955) //= 0x7a3. The runtime will prefer the VTID if present
  @VTID(356)
  void setAutoFormatAsYouTypeReplaceHyperlinks(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SmartTagRecognizers"
   * </p>
   * @return  Returns a value of type excel.SmartTagRecognizers
   */

  @DISPID(1956) //= 0x7a4. The runtime will prefer the VTID if present
  @VTID(357)
  excel.SmartTagRecognizers getSmartTagRecognizers();


  /**
   * <p>
   * Getter method for the COM property "NewWorkbook"
   * </p>
   * @return  Returns a value of type office.NewFile
   */

  @DISPID(1565) //= 0x61d. The runtime will prefer the VTID if present
  @VTID(358)
  office.NewFile getNewWorkbook();


  /**
   * <p>
   * Getter method for the COM property "SpellingOptions"
   * </p>
   * @return  Returns a value of type excel.SpellingOptions
   */

  @DISPID(1957) //= 0x7a5. The runtime will prefer the VTID if present
  @VTID(359)
  excel.SpellingOptions getSpellingOptions();


  /**
   * <p>
   * Getter method for the COM property "Speech"
   * </p>
   * @return  Returns a value of type excel.Speech
   */

  @DISPID(1958) //= 0x7a6. The runtime will prefer the VTID if present
  @VTID(360)
  excel.Speech getSpeech();


  /**
   * <p>
   * Getter method for the COM property "MapPaperSize"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1959) //= 0x7a7. The runtime will prefer the VTID if present
  @VTID(361)
  boolean getMapPaperSize();


  /**
   * <p>
   * Setter method for the COM property "MapPaperSize"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1959) //= 0x7a7. The runtime will prefer the VTID if present
  @VTID(362)
  void setMapPaperSize(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowStartupDialog"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1960) //= 0x7a8. The runtime will prefer the VTID if present
  @VTID(363)
  boolean getShowStartupDialog();


  /**
   * <p>
   * Setter method for the COM property "ShowStartupDialog"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1960) //= 0x7a8. The runtime will prefer the VTID if present
  @VTID(364)
  void setShowStartupDialog(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DecimalSeparator"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1809) //= 0x711. The runtime will prefer the VTID if present
  @VTID(365)
  java.lang.String getDecimalSeparator();


  /**
   * <p>
   * Setter method for the COM property "DecimalSeparator"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1809) //= 0x711. The runtime will prefer the VTID if present
  @VTID(366)
  void setDecimalSeparator(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ThousandsSeparator"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1810) //= 0x712. The runtime will prefer the VTID if present
  @VTID(367)
  java.lang.String getThousandsSeparator();


  /**
   * <p>
   * Setter method for the COM property "ThousandsSeparator"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1810) //= 0x712. The runtime will prefer the VTID if present
  @VTID(368)
  void setThousandsSeparator(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "UseSystemSeparators"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1961) //= 0x7a9. The runtime will prefer the VTID if present
  @VTID(369)
  boolean getUseSystemSeparators();


  /**
   * <p>
   * Setter method for the COM property "UseSystemSeparators"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1961) //= 0x7a9. The runtime will prefer the VTID if present
  @VTID(370)
  void setUseSystemSeparators(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ThisCell"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @DISPID(1962) //= 0x7aa. The runtime will prefer the VTID if present
  @VTID(371)
  excel.Range getThisCell();


  /**
   * <p>
   * Getter method for the COM property "RTD"
   * </p>
   * @return  Returns a value of type excel.RTD
   */

  @DISPID(1963) //= 0x7ab. The runtime will prefer the VTID if present
  @VTID(372)
  excel.RTD getRTD();


  /**
   * <p>
   * Getter method for the COM property "DisplayDocumentActionTaskPane"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2251) //= 0x8cb. The runtime will prefer the VTID if present
  @VTID(373)
  boolean getDisplayDocumentActionTaskPane();


  /**
   * <p>
   * Setter method for the COM property "DisplayDocumentActionTaskPane"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2251) //= 0x8cb. The runtime will prefer the VTID if present
  @VTID(374)
  void setDisplayDocumentActionTaskPane(
    boolean rhs);


  /**
   * @param xmlMap Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2252) //= 0x8cc. The runtime will prefer the VTID if present
  @VTID(375)
  void displayXMLSourcePane(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object xmlMap);


  /**
   * <p>
   * Getter method for the COM property "ArbitraryXMLSupportAvailable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2254) //= 0x8ce. The runtime will prefer the VTID if present
  @VTID(376)
  boolean getArbitraryXMLSupportAvailable();


  /**
   * @param object Mandatory com4j.Com4jObject parameter.
   * @param id Mandatory int parameter.
   * @param arg Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2255) //= 0x8cf. The runtime will prefer the VTID if present
  @VTID(377)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object support(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject object,
    int id,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg);


  /**
   * @param grfCompareFunctions Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2373) //= 0x945. The runtime will prefer the VTID if present
  @VTID(378)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dummy20(
    int grfCompareFunctions);


  /**
   * <p>
   * Getter method for the COM property "MeasurementUnit"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2375) //= 0x947. The runtime will prefer the VTID if present
  @VTID(379)
  int getMeasurementUnit();


  /**
   * <p>
   * Setter method for the COM property "MeasurementUnit"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2375) //= 0x947. The runtime will prefer the VTID if present
  @VTID(380)
  void setMeasurementUnit(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowSelectionFloaties"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2376) //= 0x948. The runtime will prefer the VTID if present
  @VTID(381)
  boolean getShowSelectionFloaties();


  /**
   * <p>
   * Setter method for the COM property "ShowSelectionFloaties"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2376) //= 0x948. The runtime will prefer the VTID if present
  @VTID(382)
  void setShowSelectionFloaties(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowMenuFloaties"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2377) //= 0x949. The runtime will prefer the VTID if present
  @VTID(383)
  boolean getShowMenuFloaties();


  /**
   * <p>
   * Setter method for the COM property "ShowMenuFloaties"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2377) //= 0x949. The runtime will prefer the VTID if present
  @VTID(384)
  void setShowMenuFloaties(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowDevTools"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2378) //= 0x94a. The runtime will prefer the VTID if present
  @VTID(385)
  boolean getShowDevTools();


  /**
   * <p>
   * Setter method for the COM property "ShowDevTools"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2378) //= 0x94a. The runtime will prefer the VTID if present
  @VTID(386)
  void setShowDevTools(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableLivePreview"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2379) //= 0x94b. The runtime will prefer the VTID if present
  @VTID(387)
  boolean getEnableLivePreview();


  /**
   * <p>
   * Setter method for the COM property "EnableLivePreview"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2379) //= 0x94b. The runtime will prefer the VTID if present
  @VTID(388)
  void setEnableLivePreview(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayDocumentInformationPanel"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2380) //= 0x94c. The runtime will prefer the VTID if present
  @VTID(389)
  boolean getDisplayDocumentInformationPanel();


  /**
   * <p>
   * Setter method for the COM property "DisplayDocumentInformationPanel"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2380) //= 0x94c. The runtime will prefer the VTID if present
  @VTID(390)
  void setDisplayDocumentInformationPanel(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AlwaysUseClearType"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2381) //= 0x94d. The runtime will prefer the VTID if present
  @VTID(391)
  boolean getAlwaysUseClearType();


  /**
   * <p>
   * Setter method for the COM property "AlwaysUseClearType"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2381) //= 0x94d. The runtime will prefer the VTID if present
  @VTID(392)
  void setAlwaysUseClearType(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "WarnOnFunctionNameConflict"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2382) //= 0x94e. The runtime will prefer the VTID if present
  @VTID(393)
  boolean getWarnOnFunctionNameConflict();


  /**
   * <p>
   * Setter method for the COM property "WarnOnFunctionNameConflict"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2382) //= 0x94e. The runtime will prefer the VTID if present
  @VTID(394)
  void setWarnOnFunctionNameConflict(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaBarHeight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2383) //= 0x94f. The runtime will prefer the VTID if present
  @VTID(395)
  int getFormulaBarHeight();


  /**
   * <p>
   * Setter method for the COM property "FormulaBarHeight"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2383) //= 0x94f. The runtime will prefer the VTID if present
  @VTID(396)
  void setFormulaBarHeight(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayFormulaAutoComplete"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2384) //= 0x950. The runtime will prefer the VTID if present
  @VTID(397)
  boolean getDisplayFormulaAutoComplete();


  /**
   * <p>
   * Setter method for the COM property "DisplayFormulaAutoComplete"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2384) //= 0x950. The runtime will prefer the VTID if present
  @VTID(398)
  void setDisplayFormulaAutoComplete(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "GenerateTableRefs"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.XlGenerateTableRefs
   */

  @DISPID(2385) //= 0x951. The runtime will prefer the VTID if present
  @VTID(399)
  excel.XlGenerateTableRefs getGenerateTableRefs(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "GenerateTableRefs"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory excel.XlGenerateTableRefs parameter.
   */

  @DISPID(2385) //= 0x951. The runtime will prefer the VTID if present
  @VTID(400)
  void setGenerateTableRefs(
    @LCID int lcid,
    excel.XlGenerateTableRefs rhs);


  /**
   * <p>
   * Getter method for the COM property "Assistance"
   * </p>
   * @return  Returns a value of type office.IAssistance
   */

  @DISPID(2386) //= 0x952. The runtime will prefer the VTID if present
  @VTID(401)
  office.IAssistance getAssistance();


  /**
   */

  @DISPID(2387) //= 0x953. The runtime will prefer the VTID if present
  @VTID(402)
  void calculateUntilAsyncQueriesDone();


  /**
   * <p>
   * Getter method for the COM property "EnableLargeOperationAlert"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2388) //= 0x954. The runtime will prefer the VTID if present
  @VTID(403)
  boolean getEnableLargeOperationAlert();


  /**
   * <p>
   * Setter method for the COM property "EnableLargeOperationAlert"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2388) //= 0x954. The runtime will prefer the VTID if present
  @VTID(404)
  void setEnableLargeOperationAlert(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "LargeOperationCellThousandCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2389) //= 0x955. The runtime will prefer the VTID if present
  @VTID(405)
  int getLargeOperationCellThousandCount();


  /**
   * <p>
   * Setter method for the COM property "LargeOperationCellThousandCount"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2389) //= 0x955. The runtime will prefer the VTID if present
  @VTID(406)
  void setLargeOperationCellThousandCount(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "DeferAsyncQueries"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2390) //= 0x956. The runtime will prefer the VTID if present
  @VTID(407)
  boolean getDeferAsyncQueries();


  /**
   * <p>
   * Setter method for the COM property "DeferAsyncQueries"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2390) //= 0x956. The runtime will prefer the VTID if present
  @VTID(408)
  void setDeferAsyncQueries(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MultiThreadedCalculation"
   * </p>
   * @return  Returns a value of type excel.MultiThreadedCalculation
   */

  @DISPID(2391) //= 0x957. The runtime will prefer the VTID if present
  @VTID(409)
  excel.MultiThreadedCalculation getMultiThreadedCalculation();


  /**
   * @param bstrUrl Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(2392) //= 0x958. The runtime will prefer the VTID if present
  @VTID(410)
  int sharePointVersion(
    java.lang.String bstrUrl);


  /**
   * <p>
   * Getter method for the COM property "ActiveEncryptionSession"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2394) //= 0x95a. The runtime will prefer the VTID if present
  @VTID(411)
  int getActiveEncryptionSession();


  /**
   * <p>
   * Getter method for the COM property "HighQualityModeForGraphics"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2395) //= 0x95b. The runtime will prefer the VTID if present
  @VTID(412)
  boolean getHighQualityModeForGraphics();


  /**
   * <p>
   * Setter method for the COM property "HighQualityModeForGraphics"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2395) //= 0x95b. The runtime will prefer the VTID if present
  @VTID(413)
  void setHighQualityModeForGraphics(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "FileExportConverters"
   * </p>
   * @return  Returns a value of type excel.FileExportConverters
   */

  @DISPID(2768) //= 0xad0. The runtime will prefer the VTID if present
  @VTID(414)
  excel.FileExportConverters getFileExportConverters();


  /**
   * <p>
   * Getter method for the COM property "SmartArtLayouts"
   * </p>
   * @return  Returns a value of type office.SmartArtLayouts
   */

  @DISPID(2772) //= 0xad4. The runtime will prefer the VTID if present
  @VTID(415)
  office.SmartArtLayouts getSmartArtLayouts();


  @VTID(415)
  @ReturnValue(defaultPropertyThrough={office.SmartArtLayouts.class})
  office.SmartArtLayout getSmartArtLayouts(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "SmartArtQuickStyles"
   * </p>
   * @return  Returns a value of type office.SmartArtQuickStyles
   */

  @DISPID(2773) //= 0xad5. The runtime will prefer the VTID if present
  @VTID(416)
  office.SmartArtQuickStyles getSmartArtQuickStyles();


  @VTID(416)
  @ReturnValue(defaultPropertyThrough={office.SmartArtQuickStyles.class})
  office.SmartArtQuickStyle getSmartArtQuickStyles(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "SmartArtColors"
   * </p>
   * @return  Returns a value of type office.SmartArtColors
   */

  @DISPID(2774) //= 0xad6. The runtime will prefer the VTID if present
  @VTID(417)
  office.SmartArtColors getSmartArtColors();


  @VTID(417)
  @ReturnValue(defaultPropertyThrough={office.SmartArtColors.class})
  office.SmartArtColor getSmartArtColors(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "AddIns2"
   * </p>
   * @return  Returns a value of type excel.AddIns2
   */

  @DISPID(2775) //= 0xad7. The runtime will prefer the VTID if present
  @VTID(418)
  excel.AddIns2 getAddIns2();


  /**
   * <p>
   * Getter method for the COM property "PrintCommunication"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2776) //= 0xad8. The runtime will prefer the VTID if present
  @VTID(419)
  boolean getPrintCommunication();


  /**
   * <p>
   * Setter method for the COM property "PrintCommunication"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2776) //= 0xad8. The runtime will prefer the VTID if present
  @VTID(420)
  void setPrintCommunication(
    boolean rhs);


  /**
   * @param macro Optional parameter. Default value is com4j.Variant.getMissing()
   * @param description Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasMenu Optional parameter. Default value is com4j.Variant.getMissing()
   * @param menuText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasShortcutKey Optional parameter. Default value is com4j.Variant.getMissing()
   * @param shortcutKey Optional parameter. Default value is com4j.Variant.getMissing()
   * @param category Optional parameter. Default value is com4j.Variant.getMissing()
   * @param statusBar Optional parameter. Default value is com4j.Variant.getMissing()
   * @param helpContextID Optional parameter. Default value is com4j.Variant.getMissing()
   * @param helpFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param argumentDescriptions Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(2770) //= 0xad2. The runtime will prefer the VTID if present
  @VTID(421)
  void macroOptions(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object macro,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object description,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object hasMenu,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object menuText,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object hasShortcutKey,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object shortcutKey,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object category,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object statusBar,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object helpContextID,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object helpFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object argumentDescriptions,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "UseClusterConnector"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2778) //= 0xada. The runtime will prefer the VTID if present
  @VTID(422)
  boolean getUseClusterConnector();


  /**
   * <p>
   * Setter method for the COM property "UseClusterConnector"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2778) //= 0xada. The runtime will prefer the VTID if present
  @VTID(423)
  void setUseClusterConnector(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ClusterConnector"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2779) //= 0xadb. The runtime will prefer the VTID if present
  @VTID(424)
  java.lang.String getClusterConnector();


  /**
   * <p>
   * Setter method for the COM property "ClusterConnector"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2779) //= 0xadb. The runtime will prefer the VTID if present
  @VTID(425)
  void setClusterConnector(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Quitting"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2780) //= 0xadc. The runtime will prefer the VTID if present
  @VTID(426)
  boolean getQuitting();


  /**
   * <p>
   * Getter method for the COM property "Dummy22"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2781) //= 0xadd. The runtime will prefer the VTID if present
  @VTID(427)
  boolean getDummy22();


  /**
   * <p>
   * Setter method for the COM property "Dummy22"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2781) //= 0xadd. The runtime will prefer the VTID if present
  @VTID(428)
  void setDummy22(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Dummy23"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2782) //= 0xade. The runtime will prefer the VTID if present
  @VTID(429)
  boolean getDummy23();


  /**
   * <p>
   * Setter method for the COM property "Dummy23"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2782) //= 0xade. The runtime will prefer the VTID if present
  @VTID(430)
  void setDummy23(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ProtectedViewWindows"
   * </p>
   * @return  Returns a value of type excel.ProtectedViewWindows
   */

  @DISPID(2783) //= 0xadf. The runtime will prefer the VTID if present
  @VTID(431)
  excel.ProtectedViewWindows getProtectedViewWindows();


  /**
   * <p>
   * Getter method for the COM property "ActiveProtectedViewWindow"
   * </p>
   * @return  Returns a value of type excel.ProtectedViewWindow
   */

  @DISPID(2784) //= 0xae0. The runtime will prefer the VTID if present
  @VTID(432)
  excel.ProtectedViewWindow getActiveProtectedViewWindow();


  /**
   * <p>
   * Getter method for the COM property "IsSandboxed"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2785) //= 0xae1. The runtime will prefer the VTID if present
  @VTID(433)
  boolean getIsSandboxed();


  /**
   * <p>
   * Getter method for the COM property "SaveISO8601Dates"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2786) //= 0xae2. The runtime will prefer the VTID if present
  @VTID(434)
  boolean getSaveISO8601Dates();


  /**
   * <p>
   * Setter method for the COM property "SaveISO8601Dates"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2786) //= 0xae2. The runtime will prefer the VTID if present
  @VTID(435)
  void setSaveISO8601Dates(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HinstancePtr"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2787) //= 0xae3. The runtime will prefer the VTID if present
  @VTID(436)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getHinstancePtr();


  /**
   * <p>
   * Getter method for the COM property "FileValidation"
   * </p>
   * @return  Returns a value of type office.MsoFileValidationMode
   */

  @DISPID(2788) //= 0xae4. The runtime will prefer the VTID if present
  @VTID(437)
  office.MsoFileValidationMode getFileValidation();


  /**
   * <p>
   * Setter method for the COM property "FileValidation"
   * </p>
   * @param rhs Mandatory office.MsoFileValidationMode parameter.
   */

  @DISPID(2788) //= 0xae4. The runtime will prefer the VTID if present
  @VTID(438)
  void setFileValidation(
    office.MsoFileValidationMode rhs);


  /**
   * <p>
   * Getter method for the COM property "FileValidationPivot"
   * </p>
   * @return  Returns a value of type excel.XlFileValidationPivotMode
   */

  @DISPID(2789) //= 0xae5. The runtime will prefer the VTID if present
  @VTID(439)
  excel.XlFileValidationPivotMode getFileValidationPivot();


  /**
   * <p>
   * Setter method for the COM property "FileValidationPivot"
   * </p>
   * @param rhs Mandatory excel.XlFileValidationPivotMode parameter.
   */

  @DISPID(2789) //= 0xae5. The runtime will prefer the VTID if present
  @VTID(440)
  void setFileValidationPivot(
    excel.XlFileValidationPivotMode rhs);


  // Properties:
}
