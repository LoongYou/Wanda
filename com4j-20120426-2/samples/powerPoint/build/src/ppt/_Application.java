package ppt  ;

import com4j.*;

@IID("{91493442-5A91-11CF-8700-00AA0060263B}")
public interface _Application extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Presentations"
   * </p>
   * @return  Returns a value of type ppt.Presentations
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  ppt.Presentations presentations();


  @VTID(7)
  @ReturnValue(defaultPropertyThrough={ppt.Presentations.class})
  ppt._Presentation presentations(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Windows"
   * </p>
   * @return  Returns a value of type ppt.DocumentWindows
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(8)
  ppt.DocumentWindows windows();


  @VTID(8)
  @ReturnValue(defaultPropertyThrough={ppt.DocumentWindows.class})
  ppt.DocumentWindow windows(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Dialogs"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  com4j.Com4jObject dialogs();


  /**
   * <p>
   * Getter method for the COM property "ActiveWindow"
   * </p>
   * @return  Returns a value of type ppt.DocumentWindow
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  ppt.DocumentWindow activeWindow();


  /**
   * <p>
   * Getter method for the COM property "ActivePresentation"
   * </p>
   * @return  Returns a value of type ppt._Presentation
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  ppt._Presentation activePresentation();


  /**
   * <p>
   * Getter method for the COM property "SlideShowWindows"
   * </p>
   * @return  Returns a value of type ppt.SlideShowWindows
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(12)
  ppt.SlideShowWindows slideShowWindows();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={ppt.SlideShowWindows.class})
  ppt.SlideShowWindow slideShowWindows(
    int index);

  /**
   * <p>
   * Getter method for the COM property "CommandBars"
   * </p>
   * @return  Returns a value of type office._CommandBars
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(13)
  office._CommandBars commandBars();


  /**
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String path();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(15)
  @DefaultMethod
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String caption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param caption Mandatory java.lang.String parameter.
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(17)
  void caption(
    java.lang.String caption);


  /**
   * <p>
   * Getter method for the COM property "Assistant"
   * </p>
   * @return  Returns a value of type office.Assistant
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(18)
  office.Assistant assistant();


  /**
   * <p>
   * Getter method for the COM property "FileSearch"
   * </p>
   * @return  Returns a value of type office.FileSearch
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(19)
  office.FileSearch fileSearch();


  /**
   * <p>
   * Getter method for the COM property "FileFind"
   * </p>
   * @return  Returns a value of type office.IFind
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(20)
  office.IFind fileFind();


  /**
   * <p>
   * Getter method for the COM property "Build"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String build();


  /**
   * <p>
   * Getter method for the COM property "Version"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String version();


  /**
   * <p>
   * Getter method for the COM property "OperatingSystem"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String operatingSystem();


  /**
   * <p>
   * Getter method for the COM property "ActivePrinter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(24)
  java.lang.String activePrinter();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(25)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "AddIns"
   * </p>
   * @return  Returns a value of type ppt.AddIns
   */

  @DISPID(2018) //= 0x7e2. The runtime will prefer the VTID if present
  @VTID(26)
  ppt.AddIns addIns();


  @VTID(26)
  @ReturnValue(defaultPropertyThrough={ppt.AddIns.class})
  ppt.AddIn addIns(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "VBE"
   * </p>
   * @return  Returns a value of type vba.VBE
   */

  @DISPID(2019) //= 0x7e3. The runtime will prefer the VTID if present
  @VTID(27)
  vba.VBE vbe();


  /**
   * @param helpFile Optional parameter. Default value is "vbapp10.chm"
   * @param contextID Optional parameter. Default value is 0
   */

  @DISPID(2020) //= 0x7e4. The runtime will prefer the VTID if present
  @VTID(28)
  void help(
    @Optional @DefaultValue("vbapp10.chm") java.lang.String helpFile,
    @Optional @DefaultValue("0") int contextID);


  /**
   */

  @DISPID(2021) //= 0x7e5. The runtime will prefer the VTID if present
  @VTID(29)
  void quit();


    /**
     * @param type Mandatory ppt.PpFileDialogType parameter.
     * @return  Returns a value of type com4j.Com4jObject
     */

    @DISPID(2023) //= 0x7e7. The runtime will prefer the VTID if present
    @VTID(31)
    com4j.Com4jObject ppFileDialog(
      ppt.PpFileDialogType type);


    /**
     * @param pWindow Mandatory ppt.DocumentWindow parameter.
     */

    @DISPID(2024) //= 0x7e8. The runtime will prefer the VTID if present
    @VTID(32)
    void launchSpelling(
      ppt.DocumentWindow pWindow);


    /**
     * <p>
     * Getter method for the COM property "Left"
     * </p>
     * @return  Returns a value of type float
     */

    @DISPID(2025) //= 0x7e9. The runtime will prefer the VTID if present
    @VTID(33)
    float left();


    /**
     * <p>
     * Setter method for the COM property "Left"
     * </p>
     * @param left Mandatory float parameter.
     */

    @DISPID(2025) //= 0x7e9. The runtime will prefer the VTID if present
    @VTID(34)
    void left(
      float left);


    /**
     * <p>
     * Getter method for the COM property "Top"
     * </p>
     * @return  Returns a value of type float
     */

    @DISPID(2026) //= 0x7ea. The runtime will prefer the VTID if present
    @VTID(35)
    float top();


    /**
     * <p>
     * Setter method for the COM property "Top"
     * </p>
     * @param top Mandatory float parameter.
     */

    @DISPID(2026) //= 0x7ea. The runtime will prefer the VTID if present
    @VTID(36)
    void top(
      float top);


    /**
     * <p>
     * Getter method for the COM property "Width"
     * </p>
     * @return  Returns a value of type float
     */

    @DISPID(2027) //= 0x7eb. The runtime will prefer the VTID if present
    @VTID(37)
    float width();


    /**
     * <p>
     * Setter method for the COM property "Width"
     * </p>
     * @param width Mandatory float parameter.
     */

    @DISPID(2027) //= 0x7eb. The runtime will prefer the VTID if present
    @VTID(38)
    void width(
      float width);


    /**
     * <p>
     * Getter method for the COM property "Height"
     * </p>
     * @return  Returns a value of type float
     */

    @DISPID(2028) //= 0x7ec. The runtime will prefer the VTID if present
    @VTID(39)
    float height();


    /**
     * <p>
     * Setter method for the COM property "Height"
     * </p>
     * @param height Mandatory float parameter.
     */

    @DISPID(2028) //= 0x7ec. The runtime will prefer the VTID if present
    @VTID(40)
    void height(
      float height);


    /**
     * <p>
     * Getter method for the COM property "WindowState"
     * </p>
     * @return  Returns a value of type ppt.PpWindowState
     */

    @DISPID(2029) //= 0x7ed. The runtime will prefer the VTID if present
    @VTID(41)
    ppt.PpWindowState windowState();


    /**
     * <p>
     * Setter method for the COM property "WindowState"
     * </p>
     * @param windowState Mandatory ppt.PpWindowState parameter.
     */

    @DISPID(2029) //= 0x7ed. The runtime will prefer the VTID if present
    @VTID(42)
    void windowState(
      ppt.PpWindowState windowState);


    /**
     * <p>
     * Getter method for the COM property "Visible"
     * </p>
     * @return  Returns a value of type office.MsoTriState
     */

    @DISPID(2030) //= 0x7ee. The runtime will prefer the VTID if present
    @VTID(43)
    office.MsoTriState visible();


    /**
     * <p>
     * Setter method for the COM property "Visible"
     * </p>
     * @param visible Mandatory office.MsoTriState parameter.
     */

    @DISPID(2030) //= 0x7ee. The runtime will prefer the VTID if present
    @VTID(44)
    void visible(
      office.MsoTriState visible);


    /**
     * <p>
     * Getter method for the COM property "HWND"
     * </p>
     * @return  Returns a value of type int
     */

    @DISPID(2031) //= 0x7ef. The runtime will prefer the VTID if present
    @VTID(45)
    int hwnd();


    /**
     * <p>
     * Getter method for the COM property "Active"
     * </p>
     * @return  Returns a value of type office.MsoTriState
     */

    @DISPID(2032) //= 0x7f0. The runtime will prefer the VTID if present
    @VTID(46)
    office.MsoTriState active();


    /**
     */

    @DISPID(2033) //= 0x7f1. The runtime will prefer the VTID if present
    @VTID(47)
    void activate();


    /**
     * <p>
     * Getter method for the COM property "AnswerWizard"
     * </p>
     * @return  Returns a value of type office.AnswerWizard
     */

    @DISPID(2034) //= 0x7f2. The runtime will prefer the VTID if present
    @VTID(48)
    office.AnswerWizard answerWizard();


    /**
     * <p>
     * Getter method for the COM property "COMAddIns"
     * </p>
     * @return  Returns a value of type office.COMAddIns
     */

    @DISPID(2035) //= 0x7f3. The runtime will prefer the VTID if present
    @VTID(49)
    office.COMAddIns comAddIns();


    @VTID(49)
    @ReturnValue(defaultPropertyThrough={office.COMAddIns.class})
    office.COMAddIn comAddIns(
      java.lang.Object index);

    /**
     * <p>
     * Getter method for the COM property "ProductCode"
     * </p>
     * @return  Returns a value of type java.lang.String
     */

    @DISPID(2036) //= 0x7f4. The runtime will prefer the VTID if present
    @VTID(50)
    java.lang.String productCode();


    /**
     * <p>
     * Getter method for the COM property "DefaultWebOptions"
     * </p>
     * @return  Returns a value of type ppt.DefaultWebOptions
     */

    @DISPID(2037) //= 0x7f5. The runtime will prefer the VTID if present
    @VTID(51)
    ppt.DefaultWebOptions defaultWebOptions();


    /**
     * <p>
     * Getter method for the COM property "LanguageSettings"
     * </p>
     * @return  Returns a value of type office.LanguageSettings
     */

    @DISPID(2038) //= 0x7f6. The runtime will prefer the VTID if present
    @VTID(52)
    office.LanguageSettings languageSettings();


    /**
     * <p>
     * Getter method for the COM property "MsoDebugOptions"
     * </p>
     * @return  Returns a value of type office.MsoDebugOptions
     */

    @DISPID(2039) //= 0x7f7. The runtime will prefer the VTID if present
    @VTID(53)
    office.MsoDebugOptions msoDebugOptions();


    /**
     * <p>
     * Getter method for the COM property "ShowWindowsInTaskbar"
     * </p>
     * @return  Returns a value of type office.MsoTriState
     */

    @DISPID(2040) //= 0x7f8. The runtime will prefer the VTID if present
    @VTID(54)
    office.MsoTriState showWindowsInTaskbar();


    /**
     * <p>
     * Setter method for the COM property "ShowWindowsInTaskbar"
     * </p>
     * @param showWindowsInTaskbar Mandatory office.MsoTriState parameter.
     */

    @DISPID(2040) //= 0x7f8. The runtime will prefer the VTID if present
    @VTID(55)
    void showWindowsInTaskbar(
      office.MsoTriState showWindowsInTaskbar);


    /**
     * <p>
     * Getter method for the COM property "Marker"
     * </p>
     * @return  Returns a value of type com4j.Com4jObject
     */

    @DISPID(2041) //= 0x7f9. The runtime will prefer the VTID if present
    @VTID(56)
    com4j.Com4jObject marker();


    /**
     * <p>
     * Getter method for the COM property "FeatureInstall"
     * </p>
     * @return  Returns a value of type office.MsoFeatureInstall
     */

    @DISPID(2042) //= 0x7fa. The runtime will prefer the VTID if present
    @VTID(57)
    office.MsoFeatureInstall featureInstall();


    /**
     * <p>
     * Setter method for the COM property "FeatureInstall"
     * </p>
     * @param featureInstall Mandatory office.MsoFeatureInstall parameter.
     */

    @DISPID(2042) //= 0x7fa. The runtime will prefer the VTID if present
    @VTID(58)
    void featureInstall(
      office.MsoFeatureInstall featureInstall);


    /**
     * @param option Mandatory int parameter.
     * @param persist Optional parameter. Default value is false
     * @return  Returns a value of type boolean
     */

    @DISPID(2043) //= 0x7fb. The runtime will prefer the VTID if present
    @VTID(59)
    boolean getOptionFlag(
      int option,
      @Optional @DefaultValue("0") boolean persist);


    /**
     * @param option Mandatory int parameter.
     * @param state Mandatory boolean parameter.
     * @param persist Optional parameter. Default value is false
     */

    @DISPID(2044) //= 0x7fc. The runtime will prefer the VTID if present
    @VTID(60)
    void setOptionFlag(
      int option,
      boolean state,
      @Optional @DefaultValue("0") boolean persist);


    /**
     * <p>
     * Getter method for the COM property "FileDialog"
     * </p>
     * @param type Mandatory office.MsoFileDialogType parameter.
     * @return  Returns a value of type office.FileDialog
     */

    @DISPID(2045) //= 0x7fd. The runtime will prefer the VTID if present
    @VTID(61)
    office.FileDialog fileDialog(
      office.MsoFileDialogType type);


    /**
     * <p>
     * Getter method for the COM property "DisplayGridLines"
     * </p>
     * @return  Returns a value of type office.MsoTriState
     */

    @DISPID(2046) //= 0x7fe. The runtime will prefer the VTID if present
    @VTID(62)
    office.MsoTriState displayGridLines();


    /**
     * <p>
     * Setter method for the COM property "DisplayGridLines"
     * </p>
     * @param displayGridLines Mandatory office.MsoTriState parameter.
     */

    @DISPID(2046) //= 0x7fe. The runtime will prefer the VTID if present
    @VTID(63)
    void displayGridLines(
      office.MsoTriState displayGridLines);


    /**
     * <p>
     * Getter method for the COM property "AutomationSecurity"
     * </p>
     * @return  Returns a value of type office.MsoAutomationSecurity
     */

    @DISPID(2047) //= 0x7ff. The runtime will prefer the VTID if present
    @VTID(64)
    office.MsoAutomationSecurity automationSecurity();


    /**
     * <p>
     * Setter method for the COM property "AutomationSecurity"
     * </p>
     * @param automationSecurity Mandatory office.MsoAutomationSecurity parameter.
     */

    @DISPID(2047) //= 0x7ff. The runtime will prefer the VTID if present
    @VTID(65)
    void automationSecurity(
      office.MsoAutomationSecurity automationSecurity);


    /**
     * <p>
     * Getter method for the COM property "NewPresentation"
     * </p>
     * @return  Returns a value of type office.NewFile
     */

    @DISPID(2048) //= 0x800. The runtime will prefer the VTID if present
    @VTID(66)
    office.NewFile newPresentation();


    /**
     * <p>
     * Getter method for the COM property "DisplayAlerts"
     * </p>
     * @return  Returns a value of type ppt.PpAlertLevel
     */

    @DISPID(2049) //= 0x801. The runtime will prefer the VTID if present
    @VTID(67)
    ppt.PpAlertLevel displayAlerts();


    /**
     * <p>
     * Setter method for the COM property "DisplayAlerts"
     * </p>
     * @param displayAlerts Mandatory ppt.PpAlertLevel parameter.
     */

    @DISPID(2049) //= 0x801. The runtime will prefer the VTID if present
    @VTID(68)
    void displayAlerts(
      ppt.PpAlertLevel displayAlerts);


    /**
     * <p>
     * Getter method for the COM property "ShowStartupDialog"
     * </p>
     * @return  Returns a value of type office.MsoTriState
     */

    @DISPID(2050) //= 0x802. The runtime will prefer the VTID if present
    @VTID(69)
    office.MsoTriState showStartupDialog();


    /**
     * <p>
     * Setter method for the COM property "ShowStartupDialog"
     * </p>
     * @param showStartupDialog Mandatory office.MsoTriState parameter.
     */

    @DISPID(2050) //= 0x802. The runtime will prefer the VTID if present
    @VTID(70)
    void showStartupDialog(
      office.MsoTriState showStartupDialog);


    /**
     * @param marker Mandatory int parameter.
     */

    @DISPID(2051) //= 0x803. The runtime will prefer the VTID if present
    @VTID(71)
    void setPerfMarker(
      int marker);


    /**
     * <p>
     * Getter method for the COM property "AutoCorrect"
     * </p>
     * @return  Returns a value of type ppt.AutoCorrect
     */

    @DISPID(2052) //= 0x804. The runtime will prefer the VTID if present
    @VTID(72)
    ppt.AutoCorrect autoCorrect();


    /**
     * <p>
     * Getter method for the COM property "Options"
     * </p>
     * @return  Returns a value of type ppt.Options
     */

    @DISPID(2053) //= 0x805. The runtime will prefer the VTID if present
    @VTID(73)
    ppt.Options options();


    /**
     * @param slideLibraryUrl Mandatory java.lang.String parameter.
     */

    @DISPID(2054) //= 0x806. The runtime will prefer the VTID if present
    @VTID(74)
    void launchPublishSlidesDialog(
      java.lang.String slideLibraryUrl);


    /**
     * @param slideUrls Mandatory java.lang.Object parameter.
     */

    @DISPID(2055) //= 0x807. The runtime will prefer the VTID if present
    @VTID(75)
    void launchSendToPPTDialog(
      java.lang.Object slideUrls);


    /**
     * <p>
     * Getter method for the COM property "DisplayDocumentInformationPanel"
     * </p>
     * @return  Returns a value of type boolean
     */

    @DISPID(2056) //= 0x808. The runtime will prefer the VTID if present
    @VTID(76)
    boolean displayDocumentInformationPanel();


    /**
     * <p>
     * Setter method for the COM property "DisplayDocumentInformationPanel"
     * </p>
     * @param displayDocumentInformationPanel Mandatory boolean parameter.
     */

    @DISPID(2056) //= 0x808. The runtime will prefer the VTID if present
    @VTID(77)
    void displayDocumentInformationPanel(
      boolean displayDocumentInformationPanel);


    /**
     * <p>
     * Getter method for the COM property "Assistance"
     * </p>
     * @return  Returns a value of type office.IAssistance
     */

    @DISPID(2057) //= 0x809. The runtime will prefer the VTID if present
    @VTID(78)
    office.IAssistance assistance();


    /**
     * <p>
     * Getter method for the COM property "ActiveEncryptionSession"
     * </p>
     * @return  Returns a value of type int
     */

    @DISPID(2058) //= 0x80a. The runtime will prefer the VTID if present
    @VTID(79)
    int activeEncryptionSession();


    /**
     * <p>
     * Getter method for the COM property "FileConverters"
     * </p>
     * @return  Returns a value of type ppt.FileConverters
     */

    @DISPID(2059) //= 0x80b. The runtime will prefer the VTID if present
    @VTID(80)
    ppt.FileConverters fileConverters();


    @VTID(80)
    @ReturnValue(defaultPropertyThrough={ppt.FileConverters.class})
    ppt.FileConverter fileConverters(
      @MarshalAs(NativeType.VARIANT) java.lang.Object index);

    /**
     * <p>
     * Getter method for the COM property "SmartArtLayouts"
     * </p>
     * @return  Returns a value of type office.SmartArtLayouts
     */

    @DISPID(2060) //= 0x80c. The runtime will prefer the VTID if present
    @VTID(81)
    office.SmartArtLayouts smartArtLayouts();


    @VTID(81)
    @ReturnValue(defaultPropertyThrough={office.SmartArtLayouts.class})
    office.SmartArtLayout smartArtLayouts(
      @MarshalAs(NativeType.VARIANT) java.lang.Object index);

    /**
     * <p>
     * Getter method for the COM property "SmartArtQuickStyles"
     * </p>
     * @return  Returns a value of type office.SmartArtQuickStyles
     */

    @DISPID(2061) //= 0x80d. The runtime will prefer the VTID if present
    @VTID(82)
    office.SmartArtQuickStyles smartArtQuickStyles();


    @VTID(82)
    @ReturnValue(defaultPropertyThrough={office.SmartArtQuickStyles.class})
    office.SmartArtQuickStyle smartArtQuickStyles(
      @MarshalAs(NativeType.VARIANT) java.lang.Object index);

    /**
     * <p>
     * Getter method for the COM property "SmartArtColors"
     * </p>
     * @return  Returns a value of type office.SmartArtColors
     */

    @DISPID(2062) //= 0x80e. The runtime will prefer the VTID if present
    @VTID(83)
    office.SmartArtColors smartArtColors();


    @VTID(83)
    @ReturnValue(defaultPropertyThrough={office.SmartArtColors.class})
    office.SmartArtColor smartArtColors(
      @MarshalAs(NativeType.VARIANT) java.lang.Object index);

    /**
     * <p>
     * Getter method for the COM property "ProtectedViewWindows"
     * </p>
     * @return  Returns a value of type ppt.ProtectedViewWindows
     */

    @DISPID(2063) //= 0x80f. The runtime will prefer the VTID if present
    @VTID(84)
    ppt.ProtectedViewWindows protectedViewWindows();


    @VTID(84)
    @ReturnValue(defaultPropertyThrough={ppt.ProtectedViewWindows.class})
    ppt.ProtectedViewWindow protectedViewWindows(
      int index);

    /**
     * <p>
     * Getter method for the COM property "ActiveProtectedViewWindow"
     * </p>
     * @return  Returns a value of type ppt.ProtectedViewWindow
     */

    @DISPID(2064) //= 0x810. The runtime will prefer the VTID if present
    @VTID(85)
    ppt.ProtectedViewWindow activeProtectedViewWindow();


    /**
     * <p>
     * Getter method for the COM property "IsSandboxed"
     * </p>
     * @return  Returns a value of type boolean
     */

    @DISPID(2065) //= 0x811. The runtime will prefer the VTID if present
    @VTID(86)
    boolean isSandboxed();


    /**
     * <p>
     * Getter method for the COM property "ResampleMediaTasks"
     * </p>
     * @return  Returns a value of type ppt.ResampleMediaTasks
     */

    @DISPID(2066) //= 0x812. The runtime will prefer the VTID if present
    @VTID(87)
    ppt.ResampleMediaTasks resampleMediaTasks();


    @VTID(87)
    @ReturnValue(defaultPropertyThrough={ppt.ResampleMediaTasks.class})
    ppt.ResampleMediaTask resampleMediaTasks(
      int index);

    /**
     */

    @DISPID(2067) //= 0x813. The runtime will prefer the VTID if present
    @VTID(88)
    void startNewUndoEntry();


    /**
     * <p>
     * Getter method for the COM property "FileValidation"
     * </p>
     * @return  Returns a value of type office.MsoFileValidationMode
     */

    @DISPID(2068) //= 0x814. The runtime will prefer the VTID if present
    @VTID(89)
    office.MsoFileValidationMode fileValidation();


    /**
     * <p>
     * Setter method for the COM property "FileValidation"
     * </p>
     * @param fileValidation Mandatory office.MsoFileValidationMode parameter.
     */

    @DISPID(2068) //= 0x814. The runtime will prefer the VTID if present
    @VTID(90)
    void fileValidation(
      office.MsoFileValidationMode fileValidation);


    // Properties:
  }
