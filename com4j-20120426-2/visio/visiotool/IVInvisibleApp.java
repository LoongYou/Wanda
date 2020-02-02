package visiotool  ;

import com4j.*;

@IID("{000D072C-0000-0000-C000-000000000046}")
public interface IVInvisibleApp extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ActiveDocument"
   * </p>
   * @return  Returns a value of type visiotool.IVDocument
   */

  @VTID(7)
  @DefaultMethod
  visiotool.IVDocument activeDocument();


  /**
   * <p>
   * Getter method for the COM property "ActivePage"
   * </p>
   * @return  Returns a value of type visiotool.IVPage
   */

  @VTID(8)
  visiotool.IVPage activePage();


  /**
   * <p>
   * Getter method for the COM property "ActiveWindow"
   * </p>
   * @return  Returns a value of type visiotool.IVWindow
   */

  @VTID(9)
  visiotool.IVWindow activeWindow();


  /**
   * <p>
   * Returns Visio Application instance hosting the object.
   * </p>
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type visiotool.IVApplication
   */

  @VTID(10)
  visiotool.IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "Documents"
   * </p>
   * @return  Returns a value of type visiotool.IVDocuments
   */

  @VTID(11)
  visiotool.IVDocuments documents();


  @VTID(11)
  @ReturnValue(defaultPropertyThrough={visiotool.IVDocuments.class})
  visiotool.IVDocument documents(
    @MarshalAs(NativeType.VARIANT) java.lang.Object nameOrIndex);

  /**
   * <p>
   * Returns visObjTypeApp (3).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @VTID(12)
  short objectType();


  /**
   * <p>
   * Getter method for the COM property "OnDataChangeDelay"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(13)
  int onDataChangeDelay();


  /**
   * <p>
   * Setter method for the COM property "OnDataChangeDelay"
   * </p>
   * @param lpi4Ret Mandatory int parameter.
   */

  @VTID(14)
  void onDataChangeDelay(
    int lpi4Ret);


  /**
   * <p>
   * Getter method for the COM property "ProcessID"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(15)
  int processID();


  /**
   */

  @VTID(16)
  void quit();


  /**
   */

  @VTID(17)
  void redo();


  /**
   * <p>
   * Getter method for the COM property "ScreenUpdating"
   * </p>
   * @return  Returns a value of type short
   */

  @VTID(18)
  short screenUpdating();


  /**
   * <p>
   * Setter method for the COM property "ScreenUpdating"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @VTID(19)
  void screenUpdating(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @VTID(20)
  short stat();


  /**
   */

  @VTID(21)
  void undo();


  /**
   * <p>
   * Getter method for the COM property "Version"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(22)
  java.lang.String version();


  /**
   * <p>
   * Getter method for the COM property "WindowHandle"
   * </p>
   * @return  Returns a value of type short
   */

  @VTID(23)
  short windowHandle();


  /**
   * <p>
   * Getter method for the COM property "Windows"
   * </p>
   * @return  Returns a value of type visiotool.IVWindows
   */

  @VTID(24)
  visiotool.IVWindows windows();


  @VTID(24)
  @ReturnValue(defaultPropertyThrough={visiotool.IVWindows.class})
  visiotool.IVWindow windows(
    short index);

  /**
   * <p>
   * Getter method for the COM property "Language"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(25)
  int language();


  /**
   * <p>
   * Getter method for the COM property "IsVisio16"
   * </p>
   * @return  Returns a value of type short
   */

  @VTID(26)
  short isVisio16();


  /**
   * <p>
   * Getter method for the COM property "IsVisio32"
   * </p>
   * @return  Returns a value of type short
   */

  @VTID(27)
  short isVisio32();


  /**
   * <p>
   * Getter method for the COM property "WindowHandle32"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(28)
  int windowHandle32();


  /**
   * <p>
   * Getter method for the COM property "InstanceHandle"
   * </p>
   * @return  Returns a value of type short
   */

  @VTID(29)
  short instanceHandle();


  /**
   * <p>
   * Getter method for the COM property "InstanceHandle32"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(30)
  int instanceHandle32();


  /**
   * <p>
   * Getter method for the COM property "BuiltInMenus"
   * </p>
   * @return  Returns a value of type visiotool.IVUIObject
   */

  @VTID(31)
  visiotool.IVUIObject builtInMenus();


  /**
   * <p>
   * Getter method for the COM property "BuiltInToolbars"
   * </p>
   * @param fIgnored Mandatory short parameter.
   * @return  Returns a value of type visiotool.IVUIObject
   */

  @VTID(32)
  visiotool.IVUIObject builtInToolbars(
    short fIgnored);


  /**
   * <p>
   * Getter method for the COM property "CustomMenus"
   * </p>
   * @return  Returns a value of type visiotool.IVUIObject
   */

  @VTID(33)
  visiotool.IVUIObject customMenus();


  /**
   * @param menusObject Mandatory visiotool.IVUIObject parameter.
   */

  @VTID(34)
  void setCustomMenus(
    visiotool.IVUIObject menusObject);


  /**
   * <p>
   * Getter method for the COM property "CustomMenusFile"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(35)
  java.lang.String customMenusFile();


  /**
   * <p>
   * Setter method for the COM property "CustomMenusFile"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @VTID(36)
  void customMenusFile(
    java.lang.String lpbstrRet);


  /**
   */

  @VTID(37)
  void clearCustomMenus();


  /**
   * <p>
   * Getter method for the COM property "CustomToolbars"
   * </p>
   * @return  Returns a value of type visiotool.IVUIObject
   */

  @VTID(38)
  visiotool.IVUIObject customToolbars();


  /**
   * @param toolbarsObject Mandatory visiotool.IVUIObject parameter.
   */

  @VTID(39)
  void setCustomToolbars(
    visiotool.IVUIObject toolbarsObject);


  /**
   * <p>
   * Getter method for the COM property "CustomToolbarsFile"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(40)
  java.lang.String customToolbarsFile();


  /**
   * <p>
   * Setter method for the COM property "CustomToolbarsFile"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @VTID(41)
  void customToolbarsFile(
    java.lang.String lpbstrRet);


  /**
   */

  @VTID(42)
  void clearCustomToolbars();


  /**
   * <p>
   * Getter method for the COM property "AddonPaths"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(43)
  java.lang.String addonPaths();


  /**
   * <p>
   * Setter method for the COM property "AddonPaths"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @VTID(44)
  void addonPaths(
    java.lang.String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "DrawingPaths"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(45)
  java.lang.String drawingPaths();


  /**
   * <p>
   * Setter method for the COM property "DrawingPaths"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @VTID(46)
  void drawingPaths(
    java.lang.String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "FilterPaths"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(47)
  java.lang.String filterPaths();


  /**
   * <p>
   * Setter method for the COM property "FilterPaths"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @VTID(48)
  void filterPaths(
    java.lang.String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "HelpPaths"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(49)
  java.lang.String helpPaths();


  /**
   * <p>
   * Setter method for the COM property "HelpPaths"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @VTID(50)
  void helpPaths(
    java.lang.String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "StartupPaths"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(51)
  java.lang.String startupPaths();


  /**
   * <p>
   * Setter method for the COM property "StartupPaths"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @VTID(52)
  void startupPaths(
    java.lang.String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "StencilPaths"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(53)
  java.lang.String stencilPaths();


  /**
   * <p>
   * Setter method for the COM property "StencilPaths"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @VTID(54)
  void stencilPaths(
    java.lang.String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "TemplatePaths"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(55)
  java.lang.String templatePaths();


  /**
   * <p>
   * Setter method for the COM property "TemplatePaths"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @VTID(56)
  void templatePaths(
    java.lang.String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "UserName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(57)
  java.lang.String userName();


  /**
   * <p>
   * Setter method for the COM property "UserName"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @VTID(58)
  void userName(
    java.lang.String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "PromptForSummary"
   * </p>
   * @return  Returns a value of type short
   */

  @VTID(59)
  short promptForSummary();


  /**
   * <p>
   * Setter method for the COM property "PromptForSummary"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @VTID(60)
  void promptForSummary(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "Addons"
   * </p>
   * @return  Returns a value of type visiotool.IVAddons
   */

  @VTID(61)
  visiotool.IVAddons addons();


  @VTID(61)
  @ReturnValue(defaultPropertyThrough={visiotool.IVAddons.class})
  visiotool.IVAddon addons(
    @MarshalAs(NativeType.VARIANT) java.lang.Object nameOrIndex);

  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @VTID(62)
  void saveWorkspaceAs(
    java.lang.String fileName);


  /**
   * @param commandID Mandatory short parameter.
   */

  @VTID(63)
  void doCmd(
    short commandID);


  /**
   * <p>
   * ProfileName is obsolete as of Visio 2000.
   * </p>
   * <p>
   * Getter method for the COM property "ProfileName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(64)
  java.lang.String profileName();


  /**
   * <p>
   * Getter method for the COM property "EventInfo"
   * </p>
   * @param eventSeqNum Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(65)
  java.lang.String eventInfo(
    int eventSeqNum);


  /**
   * <p>
   * Getter method for the COM property "EventList"
   * </p>
   * @return  Returns a value of type visiotool.IVEventList
   */

  @VTID(66)
  visiotool.IVEventList eventList();


  @VTID(66)
  @ReturnValue(defaultPropertyThrough={visiotool.IVEventList.class})
  visiotool.IVEvent eventList(
    short index);

  /**
   * <p>
   * Getter method for the COM property "PersistsEvents"
   * </p>
   * @return  Returns a value of type short
   */

  @VTID(67)
  short persistsEvents();


  /**
   * <p>
   * Getter method for the COM property "Active"
   * </p>
   * @return  Returns a value of type short
   */

  @VTID(68)
  short active();


  /**
   * <p>
   * Getter method for the COM property "DeferRecalc"
   * </p>
   * @return  Returns a value of type short
   */

  @VTID(69)
  short deferRecalc();


  /**
   * <p>
   * Setter method for the COM property "DeferRecalc"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @VTID(70)
  void deferRecalc(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "AlertResponse"
   * </p>
   * @return  Returns a value of type short
   */

  @VTID(71)
  short alertResponse();


  /**
   * <p>
   * Setter method for the COM property "AlertResponse"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @VTID(72)
  void alertResponse(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "ShowProgress"
   * </p>
   * @return  Returns a value of type short
   */

  @VTID(73)
  short showProgress();


  /**
   * <p>
   * Setter method for the COM property "ShowProgress"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @VTID(74)
  void showProgress(
    short lpi2Ret);


  /**
   * <p>
   * Interface returned is VBIDE.VBE.
   * </p>
   * <p>
   * Getter method for the COM property "Vbe"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(75)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject vbe();


  /**
   * <p>
   * In Visio 2002 and later, ShowMenus does nothing. ShowToolbar now hides/shows all command menus and toolbars.
   * </p>
   * <p>
   * Getter method for the COM property "ShowMenus"
   * </p>
   * @return  Returns a value of type short
   */

  @VTID(76)
  short showMenus();


  /**
   * <p>
   * In Visio 2002 and later, ShowMenus does nothing. ShowToolbar now hides/shows all command menus and toolbars.
   * </p>
   * <p>
   * Setter method for the COM property "ShowMenus"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @VTID(77)
  void showMenus(
    short lpi2Ret);


  /**
   * <p>
   * Superseded by App.ShowToolbar as of Visio 5.0.
   * </p>
   * <p>
   * Getter method for the COM property "ToolbarStyle"
   * </p>
   * @return  Returns a value of type short
   */

  @VTID(78)
  short toolbarStyle();


  /**
   * <p>
   * Superseded by App.ShowToolbar as of Visio 5.0.
   * </p>
   * <p>
   * Setter method for the COM property "ToolbarStyle"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @VTID(79)
  void toolbarStyle(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "ShowStatusBar"
   * </p>
   * @return  Returns a value of type short
   */

  @VTID(80)
  short showStatusBar();


  /**
   * <p>
   * Setter method for the COM property "ShowStatusBar"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @VTID(81)
  void showStatusBar(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "EventsEnabled"
   * </p>
   * @return  Returns a value of type short
   */

  @VTID(82)
  short eventsEnabled();


  /**
   * <p>
   * Setter method for the COM property "EventsEnabled"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @VTID(83)
  void eventsEnabled(
    short lpi2Ret);


  /**
   * @param stringOrNumber Mandatory java.lang.Object parameter.
   * @param unitsIn Mandatory java.lang.Object parameter.
   * @param unitsOut Mandatory java.lang.Object parameter.
   * @param format Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(84)
  java.lang.String formatResult(
    @MarshalAs(NativeType.VARIANT) java.lang.Object stringOrNumber,
    @MarshalAs(NativeType.VARIANT) java.lang.Object unitsIn,
    @MarshalAs(NativeType.VARIANT) java.lang.Object unitsOut,
    java.lang.String format);


  /**
   * @param stringOrNumber Mandatory java.lang.Object parameter.
   * @param unitsIn Mandatory java.lang.Object parameter.
   * @param unitsOut Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(85)
  double convertResult(
    @MarshalAs(NativeType.VARIANT) java.lang.Object stringOrNumber,
    @MarshalAs(NativeType.VARIANT) java.lang.Object unitsIn,
    @MarshalAs(NativeType.VARIANT) java.lang.Object unitsOut);


  /**
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(86)
  java.lang.String path();


  /**
   * @param pathsString Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String[]
   */

  @VTID(87)
  java.lang.String[] enumDirectories(
    java.lang.String pathsString);


  /**
   * <p>
   * Getter method for the COM property "TraceFlags"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(88)
  int traceFlags();


  /**
   * <p>
   * Setter method for the COM property "TraceFlags"
   * </p>
   * @param lpi4Ret Mandatory int parameter.
   */

  @VTID(89)
  void traceFlags(
    int lpi4Ret);


  /**
   */

  @VTID(90)
  void purgeUndo();


  /**
   * @param contextString Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @VTID(91)
  int queueMarkerEvent(
    java.lang.String contextString);


  /**
   * <p>
   * In Visio 2002 and later, ShowToolbar hides/shows all commandbars - menus and toolbars. S now does nothing.
   * </p>
   * <p>
   * Getter method for the COM property "ShowToolbar"
   * </p>
   * @return  Returns a value of type short
   */

  @VTID(92)
  short showToolbar();


  /**
   * <p>
   * In Visio 2002 and later, ShowToolbar hides/shows all commandbars - menus and toolbars. S now does nothing.
   * </p>
   * <p>
   * Setter method for the COM property "ShowToolbar"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @VTID(93)
  void showToolbar(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "LiveDynamics"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(94)
  boolean liveDynamics();


  /**
   * <p>
   * Setter method for the COM property "LiveDynamics"
   * </p>
   * @param pbRet Mandatory boolean parameter.
   */

  @VTID(95)
  void liveDynamics(
    boolean pbRet);


  /**
   * <p>
   * Getter method for the COM property "AutoLayout"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(96)
  boolean autoLayout();


  /**
   * <p>
   * Setter method for the COM property "AutoLayout"
   * </p>
   * @param pbRet Mandatory boolean parameter.
   */

  @VTID(97)
  void autoLayout(
    boolean pbRet);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(98)
  boolean visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param pbVisible Mandatory boolean parameter.
   */

  @VTID(99)
  void visible(
    boolean pbVisible);


  /**
   * @param bstrUndoScopeName Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @VTID(100)
  int beginUndoScope(
    java.lang.String bstrUndoScopeName);


  /**
   * @param nScopeID Mandatory int parameter.
   * @param bCommit Mandatory boolean parameter.
   */

  @VTID(101)
  void endUndoScope(
    int nScopeID,
    boolean bCommit);


  /**
   * @param pUndoUnit Mandatory com4j.Com4jObject parameter.
   */

  @VTID(102)
  void addUndoUnit(
    com4j.Com4jObject pUndoUnit);


  /**
   * <p>
   * Getter method for the COM property "CommandLine"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(103)
  java.lang.String commandLine();


  /**
   * <p>
   * Getter method for the COM property "IsUndoingOrRedoing"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(104)
  boolean isUndoingOrRedoing();


  /**
   * <p>
   * Getter method for the COM property "CurrentScope"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(105)
  int currentScope();


  /**
   * <p>
   * Getter method for the COM property "IsInScope"
   * </p>
   * @param nCmdID Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(106)
  boolean isInScope(
    int nCmdID);


  /**
   * <p>
   * Collection of COM Addins that are registered.
   * </p>
   * <p>
   * Getter method for the COM property "old_Addins"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(107)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject old_Addins();


  /**
   * <p>
   * ProductName is obsolete as of Visio 2000.
   * </p>
   * <p>
   * Getter method for the COM property "ProductName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(108)
  java.lang.String productName();


  /**
   * <p>
   * Getter method for the COM property "UndoEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(109)
  boolean undoEnabled();


  /**
   * <p>
   * Setter method for the COM property "UndoEnabled"
   * </p>
   * @param pbRet Mandatory boolean parameter.
   */

  @VTID(110)
  void undoEnabled(
    boolean pbRet);


  /**
   * <p>
   * Getter method for the COM property "ShowChanges"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(111)
  boolean showChanges();


  /**
   * <p>
   * Setter method for the COM property "ShowChanges"
   * </p>
   * @param pbRet Mandatory boolean parameter.
   */

  @VTID(112)
  void showChanges(
    boolean pbRet);


  /**
   * <p>
   * Getter method for the COM property "TypelibMajorVersion"
   * </p>
   * @return  Returns a value of type short
   */

  @VTID(113)
  short typelibMajorVersion();


  /**
   * <p>
   * Getter method for the COM property "TypelibMinorVersion"
   * </p>
   * @return  Returns a value of type short
   */

  @VTID(114)
  short typelibMinorVersion();


  /**
   * <p>
   * Getter method for the COM property "AutoRecoverInterval"
   * </p>
   * @return  Returns a value of type short
   */

  @VTID(115)
  short autoRecoverInterval();


  /**
   * <p>
   * Setter method for the COM property "AutoRecoverInterval"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @VTID(116)
  void autoRecoverInterval(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "InhibitSelectChange"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(117)
  boolean inhibitSelectChange();


  /**
   * <p>
   * Setter method for the COM property "InhibitSelectChange"
   * </p>
   * @param pbRet Mandatory boolean parameter.
   */

  @VTID(118)
  void inhibitSelectChange(
    boolean pbRet);


  /**
   * <p>
   * Getter method for the COM property "ActivePrinter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(119)
  java.lang.String activePrinter();


  /**
   * <p>
   * Setter method for the COM property "ActivePrinter"
   * </p>
   * @param pbstrPrinterName Mandatory java.lang.String parameter.
   */

  @VTID(120)
  void activePrinter(
    java.lang.String pbstrPrinterName);


  /**
   * <p>
   * Use the elements returned in this array with the ActivePrinter property.
   * </p>
   * <p>
   * Getter method for the COM property "AvailablePrinters"
   * </p>
   * @return  Returns a value of type java.lang.String[]
   */

  @VTID(121)
  java.lang.String[] availablePrinters();


  /**
   * <p>
   * Renames the currently open top level undo scope such that bstrScopeName shows up in the do menu item. Raises an exception if not in an open scope.
   * </p>
   * @param bstrScopeName Mandatory java.lang.String parameter.
   */

  @VTID(122)
  void renameCurrentScope(
    java.lang.String bstrScopeName);


  /**
   * @param bstrHelpFileName Mandatory java.lang.String parameter.
   * @param command Mandatory int parameter.
   * @param data Mandatory int parameter.
   */

  @VTID(123)
  void invokeHelp(
    java.lang.String bstrHelpFileName,
    int command,
    int data);


  /**
   * <p>
   * Interface returned is Office.CommandBars.
   * </p>
   * <p>
   * Getter method for the COM property "CommandBars"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(124)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject commandBars();


  /**
   * <p>
   * Getter method for the COM property "Build"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(125)
  int build();


  /**
   * <p>
   * Interface returned is Office.COMAddIns.
   * </p>
   * <p>
   * Getter method for the COM property "COMAddIns"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(126)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject comAddIns();


  /**
   * <p>
   * Getter method for the COM property "DefaultPageUnits"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(127)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object defaultPageUnits();


  /**
   * <p>
   * Setter method for the COM property "DefaultPageUnits"
   * </p>
   * @param pUnitsNameOrCode Mandatory java.lang.Object parameter.
   */

  @VTID(128)
  void defaultPageUnits(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pUnitsNameOrCode);


  /**
   * <p>
   * Getter method for the COM property "DefaultTextUnits"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(129)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object defaultTextUnits();


  /**
   * <p>
   * Setter method for the COM property "DefaultTextUnits"
   * </p>
   * @param pUnitsNameOrCode Mandatory java.lang.Object parameter.
   */

  @VTID(130)
  void defaultTextUnits(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pUnitsNameOrCode);


  /**
   * <p>
   * Getter method for the COM property "DefaultAngleUnits"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(131)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object defaultAngleUnits();


  /**
   * <p>
   * Setter method for the COM property "DefaultAngleUnits"
   * </p>
   * @param pUnitsNameOrCode Mandatory java.lang.Object parameter.
   */

  @VTID(132)
  void defaultAngleUnits(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pUnitsNameOrCode);


  /**
   * <p>
   * Getter method for the COM property "DefaultDurationUnits"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(133)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object defaultDurationUnits();


  /**
   * <p>
   * Setter method for the COM property "DefaultDurationUnits"
   * </p>
   * @param pUnitsNameOrCode Mandatory java.lang.Object parameter.
   */

  @VTID(134)
  void defaultDurationUnits(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pUnitsNameOrCode);


  /**
   * <p>
   * Getter method for the COM property "FullBuild"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(135)
  int fullBuild();


  /**
   * @param uStateID Mandatory visiotool.tagVisOnComponentEnterCodes parameter.
   * @param bEnter Mandatory boolean parameter.
   */

  @VTID(136)
  void onComponentEnterState(
    visiotool.tagVisOnComponentEnterCodes uStateID,
    boolean bEnter);


  /**
   * <p>
   * Getter method for the COM property "VBAEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(137)
  boolean vbaEnabled();


  /**
   * <p>
   * Getter method for the COM property "DefaultZoomBehavior"
   * </p>
   * @return  Returns a value of type visiotool.tagVisZoomBehavior
   */

  @VTID(138)
  visiotool.tagVisZoomBehavior defaultZoomBehavior();


  /**
   * <p>
   * Setter method for the COM property "DefaultZoomBehavior"
   * </p>
   * @param pnZoomBehavior Mandatory visiotool.tagVisZoomBehavior parameter.
   */

  @VTID(139)
  void defaultZoomBehavior(
    visiotool.tagVisZoomBehavior pnZoomBehavior);


  /**
   * @param nWhichStatistic Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(140)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getUsageStatistic(
    int nWhichStatistic);


  /**
   * <p>
   * Returns font Visio is using in its dialogs.
   * </p>
   * <p>
   * Getter method for the COM property "DialogFont"
   * </p>
   * @return  Returns a value of type Holder<com4j.stdole.IFontDisp>
   */

  @VTID(141)
  Holder<com4j.stdole.IFontDisp> dialogFont();


  /**
   * <p>
   * Getter method for the COM property "LanguageHelp"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(142)
  int languageHelp();


  /**
   * <p>
   * Getter method for the COM property "Window"
   * </p>
   * @return  Returns a value of type visiotool.IVWindow
   */

  @VTID(143)
  visiotool.IVWindow window();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(144)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "ConnectorToolDataObject"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(145)
  com4j.Com4jObject connectorToolDataObject();


  /**
   * <p>
   * Getter method for the COM property "Settings"
   * </p>
   * @return  Returns a value of type visiotool.IVApplicationSettings
   */

  @VTID(146)
  visiotool.IVApplicationSettings settings();


  /**
   * @param stringOrNumber Mandatory java.lang.Object parameter.
   * @param unitsIn Mandatory java.lang.Object parameter.
   * @param unitsOut Mandatory java.lang.Object parameter.
   * @param format Mandatory java.lang.String parameter.
   * @param langID Optional parameter. Default value is 0
   * @param calendarID Optional parameter. Default value is -1
   * @return  Returns a value of type java.lang.String
   */

  @VTID(147)
  java.lang.String formatResultEx(
    @MarshalAs(NativeType.VARIANT) java.lang.Object stringOrNumber,
    @MarshalAs(NativeType.VARIANT) java.lang.Object unitsIn,
    @MarshalAs(NativeType.VARIANT) java.lang.Object unitsOut,
    java.lang.String format,
    @Optional @DefaultValue("0") int langID,
    @Optional @DefaultValue("-1") int calendarID);


  /**
   * <p>
   * Getter method for the COM property "SaveAsWebObject"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(148)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject saveAsWebObject();


  /**
   * <p>
   * Getter method for the COM property "MsoDebugOptions"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(149)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject msoDebugOptions();


  /**
   * <p>
   * Getter method for the COM property "MyShapesPath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(150)
  java.lang.String myShapesPath();


  /**
   * <p>
   * Setter method for the COM property "MyShapesPath"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @VTID(151)
  void myShapesPath(
    java.lang.String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "DefaultRectangleDataObject"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(152)
  com4j.Com4jObject defaultRectangleDataObject();


  /**
   * <p>
   * Getter method for the COM property "DataFeaturesEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(153)
  boolean dataFeaturesEnabled();


  /**
   * <p>
   * Interface returned is Office.LanguageSettings.
   * </p>
   * <p>
   * Getter method for the COM property "LanguageSettings"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(154)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject languageSettings();


  /**
   * <p>
   * Getter method for the COM property "Assistance"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(155)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject assistance();


  /**
   * @param sourceAddOn Mandatory com4j.Com4jObject parameter.
   * @param targetDocument Mandatory visiotool.IVDocument parameter.
   * @param targetModes Mandatory visiotool.VisRibbonXModes parameter.
   * @param friendlyName Mandatory java.lang.String parameter.
   */

  @VTID(156)
  void registerRibbonX(
    com4j.Com4jObject sourceAddOn,
    visiotool.IVDocument targetDocument,
    visiotool.VisRibbonXModes targetModes,
    java.lang.String friendlyName);


  /**
   * @param sourceAddOn Mandatory com4j.Com4jObject parameter.
   * @param targetDocument Mandatory visiotool.IVDocument parameter.
   */

  @VTID(157)
  void unregisterRibbonX(
    com4j.Com4jObject sourceAddOn,
    visiotool.IVDocument targetDocument);


  /**
   * @param galleryName Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(158)
  boolean getPreviewEnabled(
    java.lang.String galleryName);


  /**
   * @param galleryName Mandatory java.lang.String parameter.
   * @param onOrOff Mandatory boolean parameter.
   */

  @VTID(159)
  void setPreviewEnabled(
    java.lang.String galleryName,
    boolean onOrOff);


  /**
   * @param stencilType Mandatory visiotool.VisBuiltInStencilTypes parameter.
   * @param measurementSystem Mandatory visiotool.VisMeasurementSystem parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(160)
  java.lang.String getBuiltInStencilFile(
    visiotool.VisBuiltInStencilTypes stencilType,
    visiotool.VisMeasurementSystem measurementSystem);


  /**
   * @param stencilType Mandatory visiotool.VisBuiltInStencilTypes parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(161)
  java.lang.String getCustomStencilFile(
    visiotool.VisBuiltInStencilTypes stencilType);


  /**
   * <p>
   * Getter method for the COM property "DeferRelationshipRecalc"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(162)
  boolean deferRelationshipRecalc();


  /**
   * <p>
   * Setter method for the COM property "DeferRelationshipRecalc"
   * </p>
   * @param lpi2Ret Mandatory boolean parameter.
   */

  @VTID(163)
  void deferRelationshipRecalc(
    boolean lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "CurrentEdition"
   * </p>
   * @return  Returns a value of type visiotool.VisEdition
   */

  @VTID(164)
  visiotool.VisEdition currentEdition();


  /**
   * <p>
   * Getter method for the COM property "InstanceHandle64"
   * </p>
   * @return  Returns a value of type long
   */

  @VTID(165)
  long instanceHandle64();


  // Properties:
}
