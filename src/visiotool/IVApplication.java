package visiotool  ;

import com4j.*;

@IID("{000D0700-0000-0000-C000-000000000046}")
public interface IVApplication extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ActiveDocument"
   * </p>
   * @return  Returns a value of type VisioTool.IVDocument
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  visiotool.IVDocument activeDocument();


  /**
   * <p>
   * Getter method for the COM property "ActivePage"
   * </p>
   * @return  Returns a value of type VisioTool.IVPage
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  visiotool.IVPage activePage();


  /**
   * <p>
   * Getter method for the COM property "ActiveWindow"
   * </p>
   * @return  Returns a value of type VisioTool.IVWindow
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  visiotool.IVWindow activeWindow();


  /**
   * <p>
   * Returns Visio Application instance hosting the object.
   * </p>
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type VisioTool.IVApplication
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(10)
  visiotool.IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "Documents"
   * </p>
   * @return  Returns a value of type VisioTool.IVDocuments
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
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

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(12)
  short objectType();


  /**
   * <p>
   * Getter method for the COM property "OnDataChangeDelay"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(13)
  int onDataChangeDelay();


  /**
   * <p>
   * Setter method for the COM property "OnDataChangeDelay"
   * </p>
   * @param lpi4Ret Mandatory int parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(14)
  void onDataChangeDelay(
    int lpi4Ret);


  /**
   * <p>
   * Getter method for the COM property "ProcessID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(15)
  int processID();


  /**
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(16)
  void quit();


  /**
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(17)
  void redo();


  /**
   * <p>
   * Getter method for the COM property "ScreenUpdating"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(18)
  short screenUpdating();


  /**
   * <p>
   * Setter method for the COM property "ScreenUpdating"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(19)
  void screenUpdating(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(20)
  short stat();


  /**
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(21)
  void undo();


  /**
   * <p>
   * Getter method for the COM property "Version"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String version();


  /**
   * <p>
   * Getter method for the COM property "WindowHandle"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(23)
  short windowHandle();


  /**
   * <p>
   * Getter method for the COM property "Windows"
   * </p>
   * @return  Returns a value of type VisioTool.IVWindows
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
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

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(25)
  int language();


  /**
   * <p>
   * Getter method for the COM property "IsVisio16"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(26)
  short isVisio16();


  /**
   * <p>
   * Getter method for the COM property "IsVisio32"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(27)
  short isVisio32();


  /**
   * <p>
   * Getter method for the COM property "WindowHandle32"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(28)
  int windowHandle32();


  /**
   * <p>
   * Getter method for the COM property "InstanceHandle"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(29)
  short instanceHandle();


  /**
   * <p>
   * Getter method for the COM property "InstanceHandle32"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(30)
  int instanceHandle32();


  /**
   * <p>
   * Getter method for the COM property "BuiltInMenus"
   * </p>
   * @return  Returns a value of type VisioTool.IVUIObject
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(31)
  visiotool.IVUIObject builtInMenus();


  /**
   * <p>
   * Getter method for the COM property "BuiltInToolbars"
   * </p>
   * @param fIgnored Mandatory short parameter.
   * @return  Returns a value of type VisioTool.IVUIObject
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(32)
  visiotool.IVUIObject builtInToolbars(
    short fIgnored);


  /**
   * <p>
   * Getter method for the COM property "CustomMenus"
   * </p>
   * @return  Returns a value of type VisioTool.IVUIObject
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(33)
  visiotool.IVUIObject customMenus();


  /**
   * @param menusObject Mandatory VisioTool.IVUIObject parameter.
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(34)
  void setCustomMenus(
    visiotool.IVUIObject menusObject);


  /**
   * <p>
   * Getter method for the COM property "CustomMenusFile"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String customMenusFile();


  /**
   * <p>
   * Setter method for the COM property "CustomMenusFile"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(36)
  void customMenusFile(
    java.lang.String lpbstrRet);


  /**
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(37)
  void clearCustomMenus();


  /**
   * <p>
   * Getter method for the COM property "CustomToolbars"
   * </p>
   * @return  Returns a value of type VisioTool.IVUIObject
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(38)
  visiotool.IVUIObject customToolbars();


  /**
   * @param toolbarsObject Mandatory VisioTool.IVUIObject parameter.
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(39)
  void setCustomToolbars(
    visiotool.IVUIObject toolbarsObject);


  /**
   * <p>
   * Getter method for the COM property "CustomToolbarsFile"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(40)
  java.lang.String customToolbarsFile();


  /**
   * <p>
   * Setter method for the COM property "CustomToolbarsFile"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(41)
  void customToolbarsFile(
    java.lang.String lpbstrRet);


  /**
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(42)
  void clearCustomToolbars();


  /**
   * <p>
   * Getter method for the COM property "AddonPaths"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(43)
  java.lang.String addonPaths();


  /**
   * <p>
   * Setter method for the COM property "AddonPaths"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(44)
  void addonPaths(
    java.lang.String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "DrawingPaths"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(45)
  java.lang.String drawingPaths();


  /**
   * <p>
   * Setter method for the COM property "DrawingPaths"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(46)
  void drawingPaths(
    java.lang.String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "FilterPaths"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(47)
  java.lang.String filterPaths();


  /**
   * <p>
   * Setter method for the COM property "FilterPaths"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(48)
  void filterPaths(
    java.lang.String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "HelpPaths"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(49)
  java.lang.String helpPaths();


  /**
   * <p>
   * Setter method for the COM property "HelpPaths"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(50)
  void helpPaths(
    java.lang.String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "StartupPaths"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(51)
  java.lang.String startupPaths();


  /**
   * <p>
   * Setter method for the COM property "StartupPaths"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(52)
  void startupPaths(
    java.lang.String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "StencilPaths"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(53)
  java.lang.String stencilPaths();


  /**
   * <p>
   * Setter method for the COM property "StencilPaths"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(54)
  void stencilPaths(
    java.lang.String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "TemplatePaths"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(55)
  java.lang.String templatePaths();


  /**
   * <p>
   * Setter method for the COM property "TemplatePaths"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(56)
  void templatePaths(
    java.lang.String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "UserName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
  @VTID(57)
  java.lang.String userName();


  /**
   * <p>
   * Setter method for the COM property "UserName"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
  @VTID(58)
  void userName(
    java.lang.String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "PromptForSummary"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(59)
  short promptForSummary();


  /**
   * <p>
   * Setter method for the COM property "PromptForSummary"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(60)
  void promptForSummary(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "Addons"
   * </p>
   * @return  Returns a value of type VisioTool.IVAddons
   */

  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
  @VTID(61)
  visiotool.IVAddons addons();


  @VTID(61)
  @ReturnValue(defaultPropertyThrough={visiotool.IVAddons.class})
  visiotool.IVAddon addons(
    @MarshalAs(NativeType.VARIANT) java.lang.Object nameOrIndex);

  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
  @VTID(62)
  void saveWorkspaceAs(
    java.lang.String fileName);


  /**
   * @param commandID Mandatory short parameter.
   */

  @DISPID(43) //= 0x2b. The runtime will prefer the VTID if present
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

  @DISPID(44) //= 0x2c. The runtime will prefer the VTID if present
  @VTID(64)
  java.lang.String profileName();


  /**
   * <p>
   * Getter method for the COM property "EventInfo"
   * </p>
   * @param eventSeqNum Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(45) //= 0x2d. The runtime will prefer the VTID if present
  @VTID(65)
  java.lang.String eventInfo(
    int eventSeqNum);


  /**
   * <p>
   * Getter method for the COM property "EventList"
   * </p>
   * @return  Returns a value of type VisioTool.IVEventList
   */

  @DISPID(46) //= 0x2e. The runtime will prefer the VTID if present
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

  @DISPID(47) //= 0x2f. The runtime will prefer the VTID if present
  @VTID(67)
  short persistsEvents();


  /**
   * <p>
   * Getter method for the COM property "Active"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(48) //= 0x30. The runtime will prefer the VTID if present
  @VTID(68)
  short active();


  /**
   * <p>
   * Getter method for the COM property "DeferRecalc"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(49) //= 0x31. The runtime will prefer the VTID if present
  @VTID(69)
  short deferRecalc();


  /**
   * <p>
   * Setter method for the COM property "DeferRecalc"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(49) //= 0x31. The runtime will prefer the VTID if present
  @VTID(70)
  void deferRecalc(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "AlertResponse"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(50) //= 0x32. The runtime will prefer the VTID if present
  @VTID(71)
  short alertResponse();


  /**
   * <p>
   * Setter method for the COM property "AlertResponse"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(50) //= 0x32. The runtime will prefer the VTID if present
  @VTID(72)
  void alertResponse(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "ShowProgress"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(51) //= 0x33. The runtime will prefer the VTID if present
  @VTID(73)
  short showProgress();


  /**
   * <p>
   * Setter method for the COM property "ShowProgress"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(51) //= 0x33. The runtime will prefer the VTID if present
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

  @DISPID(52) //= 0x34. The runtime will prefer the VTID if present
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

  @DISPID(53) //= 0x35. The runtime will prefer the VTID if present
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

  @DISPID(53) //= 0x35. The runtime will prefer the VTID if present
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

  @DISPID(54) //= 0x36. The runtime will prefer the VTID if present
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

  @DISPID(54) //= 0x36. The runtime will prefer the VTID if present
  @VTID(79)
  void toolbarStyle(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "ShowStatusBar"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(55) //= 0x37. The runtime will prefer the VTID if present
  @VTID(80)
  short showStatusBar();


  /**
   * <p>
   * Setter method for the COM property "ShowStatusBar"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(55) //= 0x37. The runtime will prefer the VTID if present
  @VTID(81)
  void showStatusBar(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "EventsEnabled"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(56) //= 0x38. The runtime will prefer the VTID if present
  @VTID(82)
  short eventsEnabled();


  /**
   * <p>
   * Setter method for the COM property "EventsEnabled"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(56) //= 0x38. The runtime will prefer the VTID if present
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

  @DISPID(57) //= 0x39. The runtime will prefer the VTID if present
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

  @DISPID(58) //= 0x3a. The runtime will prefer the VTID if present
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

  @DISPID(59) //= 0x3b. The runtime will prefer the VTID if present
  @VTID(86)
  java.lang.String path();


  /**
   * @param pathsString Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String[]
   */

  @DISPID(60) //= 0x3c. The runtime will prefer the VTID if present
  @VTID(87)
  java.lang.String[] enumDirectories(
    java.lang.String pathsString);


  /**
   * <p>
   * Getter method for the COM property "TraceFlags"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(61) //= 0x3d. The runtime will prefer the VTID if present
  @VTID(88)
  int traceFlags();


  /**
   * <p>
   * Setter method for the COM property "TraceFlags"
   * </p>
   * @param lpi4Ret Mandatory int parameter.
   */

  @DISPID(61) //= 0x3d. The runtime will prefer the VTID if present
  @VTID(89)
  void traceFlags(
    int lpi4Ret);


  /**
   */

  @DISPID(62) //= 0x3e. The runtime will prefer the VTID if present
  @VTID(90)
  void purgeUndo();


  /**
   * @param contextString Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(63) //= 0x3f. The runtime will prefer the VTID if present
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

  @DISPID(64) //= 0x40. The runtime will prefer the VTID if present
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

  @DISPID(64) //= 0x40. The runtime will prefer the VTID if present
  @VTID(93)
  void showToolbar(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "LiveDynamics"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(65) //= 0x41. The runtime will prefer the VTID if present
  @VTID(94)
  boolean liveDynamics();


  /**
   * <p>
   * Setter method for the COM property "LiveDynamics"
   * </p>
   * @param pbRet Mandatory boolean parameter.
   */

  @DISPID(65) //= 0x41. The runtime will prefer the VTID if present
  @VTID(95)
  void liveDynamics(
    boolean pbRet);


  /**
   * <p>
   * Getter method for the COM property "AutoLayout"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(66) //= 0x42. The runtime will prefer the VTID if present
  @VTID(96)
  boolean autoLayout();


  /**
   * <p>
   * Setter method for the COM property "AutoLayout"
   * </p>
   * @param pbRet Mandatory boolean parameter.
   */

  @DISPID(66) //= 0x42. The runtime will prefer the VTID if present
  @VTID(97)
  void autoLayout(
    boolean pbRet);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(67) //= 0x43. The runtime will prefer the VTID if present
  @VTID(98)
  boolean visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param pbVisible Mandatory boolean parameter.
   */

  @DISPID(67) //= 0x43. The runtime will prefer the VTID if present
  @VTID(99)
  void visible(
    boolean pbVisible);


  /**
   * @param bstrUndoScopeName Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(68) //= 0x44. The runtime will prefer the VTID if present
  @VTID(100)
  int beginUndoScope(
    java.lang.String bstrUndoScopeName);


  /**
   * @param nScopeID Mandatory int parameter.
   * @param bCommit Mandatory boolean parameter.
   */

  @DISPID(69) //= 0x45. The runtime will prefer the VTID if present
  @VTID(101)
  void endUndoScope(
    int nScopeID,
    boolean bCommit);


  /**
   * @param pUndoUnit Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(70) //= 0x46. The runtime will prefer the VTID if present
  @VTID(102)
  void addUndoUnit(
    com4j.Com4jObject pUndoUnit);


  /**
   * <p>
   * Getter method for the COM property "CommandLine"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(71) //= 0x47. The runtime will prefer the VTID if present
  @VTID(103)
  java.lang.String commandLine();


  /**
   * <p>
   * Getter method for the COM property "IsUndoingOrRedoing"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(72) //= 0x48. The runtime will prefer the VTID if present
  @VTID(104)
  boolean isUndoingOrRedoing();


  /**
   * <p>
   * Getter method for the COM property "CurrentScope"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(73) //= 0x49. The runtime will prefer the VTID if present
  @VTID(105)
  int currentScope();


  /**
   * <p>
   * Getter method for the COM property "IsInScope"
   * </p>
   * @param nCmdID Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(74) //= 0x4a. The runtime will prefer the VTID if present
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

  @DISPID(75) //= 0x4b. The runtime will prefer the VTID if present
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

  @DISPID(76) //= 0x4c. The runtime will prefer the VTID if present
  @VTID(108)
  java.lang.String productName();


  /**
   * <p>
   * Getter method for the COM property "UndoEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(77) //= 0x4d. The runtime will prefer the VTID if present
  @VTID(109)
  boolean undoEnabled();


  /**
   * <p>
   * Setter method for the COM property "UndoEnabled"
   * </p>
   * @param pbRet Mandatory boolean parameter.
   */

  @DISPID(77) //= 0x4d. The runtime will prefer the VTID if present
  @VTID(110)
  void undoEnabled(
    boolean pbRet);


  /**
   * <p>
   * Getter method for the COM property "ShowChanges"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(78) //= 0x4e. The runtime will prefer the VTID if present
  @VTID(111)
  boolean showChanges();


  /**
   * <p>
   * Setter method for the COM property "ShowChanges"
   * </p>
   * @param pbRet Mandatory boolean parameter.
   */

  @DISPID(78) //= 0x4e. The runtime will prefer the VTID if present
  @VTID(112)
  void showChanges(
    boolean pbRet);


  /**
   * <p>
   * Getter method for the COM property "TypelibMajorVersion"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(79) //= 0x4f. The runtime will prefer the VTID if present
  @VTID(113)
  short typelibMajorVersion();


  /**
   * <p>
   * Getter method for the COM property "TypelibMinorVersion"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(80) //= 0x50. The runtime will prefer the VTID if present
  @VTID(114)
  short typelibMinorVersion();


  /**
   * <p>
   * Getter method for the COM property "AutoRecoverInterval"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
  @VTID(115)
  short autoRecoverInterval();


  /**
   * <p>
   * Setter method for the COM property "AutoRecoverInterval"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
  @VTID(116)
  void autoRecoverInterval(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "InhibitSelectChange"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743918) //= 0x6002006e. The runtime will prefer the VTID if present
  @VTID(117)
  boolean inhibitSelectChange();


  /**
   * <p>
   * Setter method for the COM property "InhibitSelectChange"
   * </p>
   * @param pbRet Mandatory boolean parameter.
   */

  @DISPID(1610743918) //= 0x6002006e. The runtime will prefer the VTID if present
  @VTID(118)
  void inhibitSelectChange(
    boolean pbRet);


  /**
   * <p>
   * Getter method for the COM property "ActivePrinter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743920) //= 0x60020070. The runtime will prefer the VTID if present
  @VTID(119)
  java.lang.String activePrinter();


  /**
   * <p>
   * Setter method for the COM property "ActivePrinter"
   * </p>
   * @param pbstrPrinterName Mandatory java.lang.String parameter.
   */

  @DISPID(1610743920) //= 0x60020070. The runtime will prefer the VTID if present
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

  @DISPID(1610743922) //= 0x60020072. The runtime will prefer the VTID if present
  @VTID(121)
  java.lang.String[] availablePrinters();


  /**
   * <p>
   * Renames the currently open top level undo scope such that bstrScopeName shows up in the do menu item. Raises an exception if not in an open scope.
   * </p>
   * @param bstrScopeName Mandatory java.lang.String parameter.
   */

  @DISPID(1610743923) //= 0x60020073. The runtime will prefer the VTID if present
  @VTID(122)
  void renameCurrentScope(
    java.lang.String bstrScopeName);


  /**
   * @param bstrHelpFileName Mandatory java.lang.String parameter.
   * @param command Mandatory int parameter.
   * @param data Mandatory int parameter.
   */

  @DISPID(1610743924) //= 0x60020074. The runtime will prefer the VTID if present
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

  @DISPID(1610743925) //= 0x60020075. The runtime will prefer the VTID if present
  @VTID(124)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject commandBars();


  /**
   * <p>
   * Getter method for the COM property "Build"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743926) //= 0x60020076. The runtime will prefer the VTID if present
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

  @DISPID(1610743927) //= 0x60020077. The runtime will prefer the VTID if present
  @VTID(126)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject comAddIns();


  /**
   * <p>
   * Getter method for the COM property "DefaultPageUnits"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743928) //= 0x60020078. The runtime will prefer the VTID if present
  @VTID(127)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object defaultPageUnits();


  /**
   * <p>
   * Setter method for the COM property "DefaultPageUnits"
   * </p>
   * @param pUnitsNameOrCode Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743928) //= 0x60020078. The runtime will prefer the VTID if present
  @VTID(128)
  void defaultPageUnits(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pUnitsNameOrCode);


  /**
   * <p>
   * Getter method for the COM property "DefaultTextUnits"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743930) //= 0x6002007a. The runtime will prefer the VTID if present
  @VTID(129)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object defaultTextUnits();


  /**
   * <p>
   * Setter method for the COM property "DefaultTextUnits"
   * </p>
   * @param pUnitsNameOrCode Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743930) //= 0x6002007a. The runtime will prefer the VTID if present
  @VTID(130)
  void defaultTextUnits(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pUnitsNameOrCode);


  /**
   * <p>
   * Getter method for the COM property "DefaultAngleUnits"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743932) //= 0x6002007c. The runtime will prefer the VTID if present
  @VTID(131)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object defaultAngleUnits();


  /**
   * <p>
   * Setter method for the COM property "DefaultAngleUnits"
   * </p>
   * @param pUnitsNameOrCode Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743932) //= 0x6002007c. The runtime will prefer the VTID if present
  @VTID(132)
  void defaultAngleUnits(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pUnitsNameOrCode);


  /**
   * <p>
   * Getter method for the COM property "DefaultDurationUnits"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743934) //= 0x6002007e. The runtime will prefer the VTID if present
  @VTID(133)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object defaultDurationUnits();


  /**
   * <p>
   * Setter method for the COM property "DefaultDurationUnits"
   * </p>
   * @param pUnitsNameOrCode Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743934) //= 0x6002007e. The runtime will prefer the VTID if present
  @VTID(134)
  void defaultDurationUnits(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pUnitsNameOrCode);


  /**
   * <p>
   * Getter method for the COM property "FullBuild"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743936) //= 0x60020080. The runtime will prefer the VTID if present
  @VTID(135)
  int fullBuild();


  /**
   * @param uStateID Mandatory VisioTool.tagVisOnComponentEnterCodes parameter.
   * @param bEnter Mandatory boolean parameter.
   */

  @DISPID(1610743937) //= 0x60020081. The runtime will prefer the VTID if present
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

  @DISPID(1610743938) //= 0x60020082. The runtime will prefer the VTID if present
  @VTID(137)
  boolean vbaEnabled();


  /**
   * <p>
   * Getter method for the COM property "DefaultZoomBehavior"
   * </p>
   * @return  Returns a value of type VisioTool.tagVisZoomBehavior
   */

  @DISPID(1610743939) //= 0x60020083. The runtime will prefer the VTID if present
  @VTID(138)
  visiotool.tagVisZoomBehavior defaultZoomBehavior();


  /**
   * <p>
   * Setter method for the COM property "DefaultZoomBehavior"
   * </p>
   * @param pnZoomBehavior Mandatory VisioTool.tagVisZoomBehavior parameter.
   */

  @DISPID(1610743939) //= 0x60020083. The runtime will prefer the VTID if present
  @VTID(139)
  void defaultZoomBehavior(
    visiotool.tagVisZoomBehavior pnZoomBehavior);


  /**
   * @param nWhichStatistic Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743941) //= 0x60020085. The runtime will prefer the VTID if present
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

  @DISPID(1610743942) //= 0x60020086. The runtime will prefer the VTID if present
  @VTID(141)
  Holder<com4j.stdole.IFontDisp> dialogFont();


  /**
   * <p>
   * Getter method for the COM property "LanguageHelp"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743943) //= 0x60020087. The runtime will prefer the VTID if present
  @VTID(142)
  int languageHelp();


  /**
   * <p>
   * Getter method for the COM property "Window"
   * </p>
   * @return  Returns a value of type VisioTool.IVWindow
   */

  @DISPID(1610743944) //= 0x60020088. The runtime will prefer the VTID if present
  @VTID(143)
  visiotool.IVWindow window();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743945) //= 0x60020089. The runtime will prefer the VTID if present
  @VTID(144)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "ConnectorToolDataObject"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610743946) //= 0x6002008a. The runtime will prefer the VTID if present
  @VTID(145)
  com4j.Com4jObject connectorToolDataObject();


  /**
   * <p>
   * Getter method for the COM property "Settings"
   * </p>
   * @return  Returns a value of type VisioTool.IVApplicationSettings
   */

  @DISPID(1610743947) //= 0x6002008b. The runtime will prefer the VTID if present
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

  @DISPID(1610743948) //= 0x6002008c. The runtime will prefer the VTID if present
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

  @DISPID(1610743949) //= 0x6002008d. The runtime will prefer the VTID if present
  @VTID(148)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject saveAsWebObject();


  /**
   * <p>
   * Getter method for the COM property "MsoDebugOptions"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610743950) //= 0x6002008e. The runtime will prefer the VTID if present
  @VTID(149)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject msoDebugOptions();


  /**
   * <p>
   * Getter method for the COM property "MyShapesPath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743951) //= 0x6002008f. The runtime will prefer the VTID if present
  @VTID(150)
  java.lang.String myShapesPath();


  /**
   * <p>
   * Setter method for the COM property "MyShapesPath"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(1610743951) //= 0x6002008f. The runtime will prefer the VTID if present
  @VTID(151)
  void myShapesPath(
    java.lang.String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "DefaultRectangleDataObject"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610743953) //= 0x60020091. The runtime will prefer the VTID if present
  @VTID(152)
  com4j.Com4jObject defaultRectangleDataObject();


  /**
   * <p>
   * Getter method for the COM property "DataFeaturesEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743954) //= 0x60020092. The runtime will prefer the VTID if present
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

  @DISPID(1610743955) //= 0x60020093. The runtime will prefer the VTID if present
  @VTID(154)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject languageSettings();


  /**
   * <p>
   * Getter method for the COM property "Assistance"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610743956) //= 0x60020094. The runtime will prefer the VTID if present
  @VTID(155)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject assistance();


  /**
   * @param sourceAddOn Mandatory com4j.Com4jObject parameter.
   * @param targetDocument Mandatory VisioTool.IVDocument parameter.
   * @param targetModes Mandatory VisioTool.VisRibbonXModes parameter.
   * @param friendlyName Mandatory java.lang.String parameter.
   */

  @DISPID(1610743957) //= 0x60020095. The runtime will prefer the VTID if present
  @VTID(156)
  void registerRibbonX(
    com4j.Com4jObject sourceAddOn,
    visiotool.IVDocument targetDocument,
    visiotool.VisRibbonXModes targetModes,
    java.lang.String friendlyName);


  /**
   * @param sourceAddOn Mandatory com4j.Com4jObject parameter.
   * @param targetDocument Mandatory VisioTool.IVDocument parameter.
   */

  @DISPID(1610743958) //= 0x60020096. The runtime will prefer the VTID if present
  @VTID(157)
  void unregisterRibbonX(
    com4j.Com4jObject sourceAddOn,
    visiotool.IVDocument targetDocument);


  /**
   * @param galleryName Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743959) //= 0x60020097. The runtime will prefer the VTID if present
  @VTID(158)
  boolean getPreviewEnabled(
    java.lang.String galleryName);


  /**
   * @param galleryName Mandatory java.lang.String parameter.
   * @param onOrOff Mandatory boolean parameter.
   */

  @DISPID(1610743960) //= 0x60020098. The runtime will prefer the VTID if present
  @VTID(159)
  void setPreviewEnabled(
    java.lang.String galleryName,
    boolean onOrOff);


  /**
   * @param stencilType Mandatory VisioTool.VisBuiltInStencilTypes parameter.
   * @param measurementSystem Mandatory VisioTool.VisMeasurementSystem parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743961) //= 0x60020099. The runtime will prefer the VTID if present
  @VTID(160)
  java.lang.String getBuiltInStencilFile(
    visiotool.VisBuiltInStencilTypes stencilType,
    visiotool.VisMeasurementSystem measurementSystem);


  /**
   * @param stencilType Mandatory VisioTool.VisBuiltInStencilTypes parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743962) //= 0x6002009a. The runtime will prefer the VTID if present
  @VTID(161)
  java.lang.String getCustomStencilFile(
    visiotool.VisBuiltInStencilTypes stencilType);


  /**
   * <p>
   * Getter method for the COM property "DeferRelationshipRecalc"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743963) //= 0x6002009b. The runtime will prefer the VTID if present
  @VTID(162)
  boolean deferRelationshipRecalc();


  /**
   * <p>
   * Setter method for the COM property "DeferRelationshipRecalc"
   * </p>
   * @param lpi2Ret Mandatory boolean parameter.
   */

  @DISPID(1610743963) //= 0x6002009b. The runtime will prefer the VTID if present
  @VTID(163)
  void deferRelationshipRecalc(
    boolean lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "CurrentEdition"
   * </p>
   * @return  Returns a value of type VisioTool.VisEdition
   */

  @DISPID(1610743965) //= 0x6002009d. The runtime will prefer the VTID if present
  @VTID(164)
  visiotool.VisEdition currentEdition();


  /**
   * <p>
   * Getter method for the COM property "InstanceHandle64"
   * </p>
   * @return  Returns a value of type long
   */

  @DISPID(1610743966) //= 0x6002009e. The runtime will prefer the VTID if present
  @VTID(165)
  long instanceHandle64();


  // Properties:
}
