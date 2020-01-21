package excel  ;

import com4j.*;

@IID("{000208D9-0000-0000-C000-000000000046}")
public interface _Global extends Com4jObject {
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

  // Properties:
}
