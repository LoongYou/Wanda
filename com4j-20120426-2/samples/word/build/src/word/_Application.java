package word  ;

import com4j.*;

@IID("{00020970-0000-0000-C000-000000000046}")
public interface _Application extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "Documents"
   * </p>
   * @return  Returns a value of type word.Documents
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(11)
  word.Documents documents();


  @VTID(11)
  @ReturnValue(defaultPropertyThrough={word.Documents.class})
  word._Document documents(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Windows"
   * </p>
   * @return  Returns a value of type word.Windows
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  word.Windows windows();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={word.Windows.class})
  word.Window windows(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "ActiveDocument"
   * </p>
   * @return  Returns a value of type word._Document
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  word._Document activeDocument();


  /**
   * <p>
   * Getter method for the COM property "ActiveWindow"
   * </p>
   * @return  Returns a value of type word.Window
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  word.Window activeWindow();


  /**
   * <p>
   * Getter method for the COM property "Selection"
   * </p>
   * @return  Returns a value of type word.Selection
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  word.Selection selection();


  /**
   * <p>
   * Getter method for the COM property "WordBasic"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject wordBasic();


  /**
   * <p>
   * Getter method for the COM property "RecentFiles"
   * </p>
   * @return  Returns a value of type word.RecentFiles
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(17)
  word.RecentFiles recentFiles();


  @VTID(17)
  @ReturnValue(defaultPropertyThrough={word.RecentFiles.class})
  word.RecentFile recentFiles(
    int index);

  /**
   * <p>
   * Getter method for the COM property "NormalTemplate"
   * </p>
   * @return  Returns a value of type word.Template
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(18)
  word.Template normalTemplate();


  /**
   * <p>
   * Getter method for the COM property "System"
   * </p>
   * @return  Returns a value of type word.System
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(19)
  word.System system();


  /**
   * <p>
   * Getter method for the COM property "AutoCorrect"
   * </p>
   * @return  Returns a value of type word.AutoCorrect
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(20)
  word.AutoCorrect autoCorrect();


  /**
   * <p>
   * Getter method for the COM property "FontNames"
   * </p>
   * @return  Returns a value of type word.FontNames
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(21)
  word.FontNames fontNames();


  @VTID(21)
  @ReturnValue(defaultPropertyThrough={word.FontNames.class})
  java.lang.String fontNames(
    int index);

  /**
   * <p>
   * Getter method for the COM property "LandscapeFontNames"
   * </p>
   * @return  Returns a value of type word.FontNames
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(22)
  word.FontNames landscapeFontNames();


  @VTID(22)
  @ReturnValue(defaultPropertyThrough={word.FontNames.class})
  java.lang.String landscapeFontNames(
    int index);

  /**
   * <p>
   * Getter method for the COM property "PortraitFontNames"
   * </p>
   * @return  Returns a value of type word.FontNames
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(23)
  word.FontNames portraitFontNames();


  @VTID(23)
  @ReturnValue(defaultPropertyThrough={word.FontNames.class})
  java.lang.String portraitFontNames(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Languages"
   * </p>
   * @return  Returns a value of type word.Languages
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(24)
  word.Languages languages();


  @VTID(24)
  @ReturnValue(defaultPropertyThrough={word.Languages.class})
  word.Language languages(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Assistant"
   * </p>
   * @return  Returns a value of type office.Assistant
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(25)
  office.Assistant assistant();


  /**
   * <p>
   * Getter method for the COM property "Browser"
   * </p>
   * @return  Returns a value of type word.Browser
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(26)
  word.Browser browser();


  /**
   * <p>
   * Getter method for the COM property "FileConverters"
   * </p>
   * @return  Returns a value of type word.FileConverters
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(27)
  word.FileConverters fileConverters();


  @VTID(27)
  @ReturnValue(defaultPropertyThrough={word.FileConverters.class})
  word.FileConverter fileConverters(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "MailingLabel"
   * </p>
   * @return  Returns a value of type word.MailingLabel
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(28)
  word.MailingLabel mailingLabel();


  /**
   * <p>
   * Getter method for the COM property "Dialogs"
   * </p>
   * @return  Returns a value of type word.Dialogs
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(29)
  word.Dialogs dialogs();


  @VTID(29)
  @ReturnValue(defaultPropertyThrough={word.Dialogs.class})
  word.Dialog dialogs(
    word.WdWordDialog index);

  /**
   * <p>
   * Getter method for the COM property "CaptionLabels"
   * </p>
   * @return  Returns a value of type word.CaptionLabels
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(30)
  word.CaptionLabels captionLabels();


  @VTID(30)
  @ReturnValue(defaultPropertyThrough={word.CaptionLabels.class})
  word.CaptionLabel captionLabels(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "AutoCaptions"
   * </p>
   * @return  Returns a value of type word.AutoCaptions
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(31)
  word.AutoCaptions autoCaptions();


  @VTID(31)
  @ReturnValue(defaultPropertyThrough={word.AutoCaptions.class})
  word.AutoCaption autoCaptions(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "AddIns"
   * </p>
   * @return  Returns a value of type word.AddIns
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(32)
  word.AddIns addIns();


  @VTID(32)
  @ReturnValue(defaultPropertyThrough={word.AddIns.class})
  word.AddIn addIns(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(33)
  boolean visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(34)
  void visible(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Version"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String version();


  /**
   * <p>
   * Getter method for the COM property "ScreenUpdating"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(36)
  boolean screenUpdating();


  /**
   * <p>
   * Setter method for the COM property "ScreenUpdating"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(37)
  void screenUpdating(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PrintPreview"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(38)
  boolean printPreview();


  /**
   * <p>
   * Setter method for the COM property "PrintPreview"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(39)
  void printPreview(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Tasks"
   * </p>
   * @return  Returns a value of type word.Tasks
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(40)
  word.Tasks tasks();


  @VTID(40)
  @ReturnValue(defaultPropertyThrough={word.Tasks.class})
  word.Task tasks(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "DisplayStatusBar"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(41)
  boolean displayStatusBar();


  /**
   * <p>
   * Setter method for the COM property "DisplayStatusBar"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(42)
  void displayStatusBar(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SpecialMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(43)
  boolean specialMode();


  /**
   * <p>
   * Getter method for the COM property "UsableWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(44)
  int usableWidth();


  /**
   * <p>
   * Getter method for the COM property "UsableHeight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(45)
  int usableHeight();


  /**
   * <p>
   * Getter method for the COM property "MathCoprocessorAvailable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(46)
  boolean mathCoprocessorAvailable();


  /**
   * <p>
   * Getter method for the COM property "MouseAvailable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(47)
  boolean mouseAvailable();


  /**
   * <p>
   * Getter method for the COM property "International"
   * </p>
   * @param index Mandatory word.WdInternationalIndex parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(46) //= 0x2e. The runtime will prefer the VTID if present
  @VTID(48)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object international(
    word.WdInternationalIndex index);


  /**
   * <p>
   * Getter method for the COM property "Build"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(47) //= 0x2f. The runtime will prefer the VTID if present
  @VTID(49)
  java.lang.String build();


  /**
   * <p>
   * Getter method for the COM property "CapsLock"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(48) //= 0x30. The runtime will prefer the VTID if present
  @VTID(50)
  boolean capsLock();


  /**
   * <p>
   * Getter method for the COM property "NumLock"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(49) //= 0x31. The runtime will prefer the VTID if present
  @VTID(51)
  boolean numLock();


  /**
   * <p>
   * Getter method for the COM property "UserName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(52) //= 0x34. The runtime will prefer the VTID if present
  @VTID(52)
  java.lang.String userName();


  /**
   * <p>
   * Setter method for the COM property "UserName"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(52) //= 0x34. The runtime will prefer the VTID if present
  @VTID(53)
  void userName(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "UserInitials"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(53) //= 0x35. The runtime will prefer the VTID if present
  @VTID(54)
  java.lang.String userInitials();


  /**
   * <p>
   * Setter method for the COM property "UserInitials"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(53) //= 0x35. The runtime will prefer the VTID if present
  @VTID(55)
  void userInitials(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "UserAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(54) //= 0x36. The runtime will prefer the VTID if present
  @VTID(56)
  java.lang.String userAddress();


  /**
   * <p>
   * Setter method for the COM property "UserAddress"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(54) //= 0x36. The runtime will prefer the VTID if present
  @VTID(57)
  void userAddress(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "MacroContainer"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(55) //= 0x37. The runtime will prefer the VTID if present
  @VTID(58)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject macroContainer();


  /**
   * <p>
   * Getter method for the COM property "DisplayRecentFiles"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(56) //= 0x38. The runtime will prefer the VTID if present
  @VTID(59)
  boolean displayRecentFiles();


  /**
   * <p>
   * Setter method for the COM property "DisplayRecentFiles"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(56) //= 0x38. The runtime will prefer the VTID if present
  @VTID(60)
  void displayRecentFiles(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "CommandBars"
   * </p>
   * @return  Returns a value of type office._CommandBars
   */

  @DISPID(57) //= 0x39. The runtime will prefer the VTID if present
  @VTID(61)
  office._CommandBars commandBars();


  /**
   * <p>
   * Getter method for the COM property "SynonymInfo"
   * </p>
   * @param word Mandatory java.lang.String parameter.
   * @param languageID Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.SynonymInfo
   */

  @DISPID(59) //= 0x3b. The runtime will prefer the VTID if present
  @VTID(62)
  word.SynonymInfo synonymInfo(
    java.lang.String word,
    @Optional java.lang.Object languageID);


  /**
   * <p>
   * Getter method for the COM property "VBE"
   * </p>
   * @return  Returns a value of type vba.VBE
   */

  @DISPID(61) //= 0x3d. The runtime will prefer the VTID if present
  @VTID(63)
  vba.VBE vbe();


  /**
   * <p>
   * Getter method for the COM property "DefaultSaveFormat"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64) //= 0x40. The runtime will prefer the VTID if present
  @VTID(64)
  java.lang.String defaultSaveFormat();


  /**
   * <p>
   * Setter method for the COM property "DefaultSaveFormat"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(64) //= 0x40. The runtime will prefer the VTID if present
  @VTID(65)
  void defaultSaveFormat(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "ListGalleries"
   * </p>
   * @return  Returns a value of type word.ListGalleries
   */

  @DISPID(65) //= 0x41. The runtime will prefer the VTID if present
  @VTID(66)
  word.ListGalleries listGalleries();


  @VTID(66)
  @ReturnValue(defaultPropertyThrough={word.ListGalleries.class})
  word.ListGallery listGalleries(
    word.WdListGalleryType index);

  /**
   * <p>
   * Getter method for the COM property "ActivePrinter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(66) //= 0x42. The runtime will prefer the VTID if present
  @VTID(67)
  java.lang.String activePrinter();


  /**
   * <p>
   * Setter method for the COM property "ActivePrinter"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(66) //= 0x42. The runtime will prefer the VTID if present
  @VTID(68)
  void activePrinter(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Templates"
   * </p>
   * @return  Returns a value of type word.Templates
   */

  @DISPID(67) //= 0x43. The runtime will prefer the VTID if present
  @VTID(69)
  word.Templates templates();


  @VTID(69)
  @ReturnValue(defaultPropertyThrough={word.Templates.class})
  word.Template templates(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "CustomizationContext"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(68) //= 0x44. The runtime will prefer the VTID if present
  @VTID(70)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject customizationContext();


  /**
   * <p>
   * Setter method for the COM property "CustomizationContext"
   * </p>
   * @param prop Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(68) //= 0x44. The runtime will prefer the VTID if present
  @VTID(71)
  void customizationContext(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject prop);


  /**
   * <p>
   * Getter method for the COM property "KeyBindings"
   * </p>
   * @return  Returns a value of type word.KeyBindings
   */

  @DISPID(69) //= 0x45. The runtime will prefer the VTID if present
  @VTID(72)
  word.KeyBindings keyBindings();


  @VTID(72)
  @ReturnValue(defaultPropertyThrough={word.KeyBindings.class})
  word.KeyBinding keyBindings(
    int index);

  /**
   * <p>
   * Getter method for the COM property "KeysBoundTo"
   * </p>
   * @param keyCategory Mandatory word.WdKeyCategory parameter.
   * @param command Mandatory java.lang.String parameter.
   * @param commandParameter Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.KeysBoundTo
   */

  @DISPID(70) //= 0x46. The runtime will prefer the VTID if present
  @VTID(73)
  word.KeysBoundTo keysBoundTo(
    word.WdKeyCategory keyCategory,
    java.lang.String command,
    @Optional java.lang.Object commandParameter);


  /**
   * <p>
   * Getter method for the COM property "FindKey"
   * </p>
   * @param keyCode Mandatory int parameter.
   * @param keyCode2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.KeyBinding
   */

  @DISPID(71) //= 0x47. The runtime will prefer the VTID if present
  @VTID(74)
  word.KeyBinding findKey(
    int keyCode,
    @Optional java.lang.Object keyCode2);


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(80) //= 0x50. The runtime will prefer the VTID if present
  @VTID(75)
  java.lang.String caption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(80) //= 0x50. The runtime will prefer the VTID if present
  @VTID(76)
  void caption(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
  @VTID(77)
  java.lang.String path();


  /**
   * <p>
   * Getter method for the COM property "DisplayScrollBars"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(82) //= 0x52. The runtime will prefer the VTID if present
  @VTID(78)
  boolean displayScrollBars();


  /**
   * <p>
   * Setter method for the COM property "DisplayScrollBars"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(82) //= 0x52. The runtime will prefer the VTID if present
  @VTID(79)
  void displayScrollBars(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "StartupPath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(83) //= 0x53. The runtime will prefer the VTID if present
  @VTID(80)
  java.lang.String startupPath();


  /**
   * <p>
   * Setter method for the COM property "StartupPath"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(83) //= 0x53. The runtime will prefer the VTID if present
  @VTID(81)
  void startupPath(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "BackgroundSavingStatus"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(85) //= 0x55. The runtime will prefer the VTID if present
  @VTID(82)
  int backgroundSavingStatus();


  /**
   * <p>
   * Getter method for the COM property "BackgroundPrintingStatus"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(86) //= 0x56. The runtime will prefer the VTID if present
  @VTID(83)
  int backgroundPrintingStatus();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(87) //= 0x57. The runtime will prefer the VTID if present
  @VTID(84)
  int left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(87) //= 0x57. The runtime will prefer the VTID if present
  @VTID(85)
  void left(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(88) //= 0x58. The runtime will prefer the VTID if present
  @VTID(86)
  int top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(88) //= 0x58. The runtime will prefer the VTID if present
  @VTID(87)
  void top(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(89) //= 0x59. The runtime will prefer the VTID if present
  @VTID(88)
  int width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(89) //= 0x59. The runtime will prefer the VTID if present
  @VTID(89)
  void width(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(90) //= 0x5a. The runtime will prefer the VTID if present
  @VTID(90)
  int height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(90) //= 0x5a. The runtime will prefer the VTID if present
  @VTID(91)
  void height(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "WindowState"
   * </p>
   * @return  Returns a value of type word.WdWindowState
   */

  @DISPID(91) //= 0x5b. The runtime will prefer the VTID if present
  @VTID(92)
  word.WdWindowState windowState();


  /**
   * <p>
   * Setter method for the COM property "WindowState"
   * </p>
   * @param prop Mandatory word.WdWindowState parameter.
   */

  @DISPID(91) //= 0x5b. The runtime will prefer the VTID if present
  @VTID(93)
  void windowState(
    word.WdWindowState prop);


  /**
   * <p>
   * Getter method for the COM property "DisplayAutoCompleteTips"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(92) //= 0x5c. The runtime will prefer the VTID if present
  @VTID(94)
  boolean displayAutoCompleteTips();


  /**
   * <p>
   * Setter method for the COM property "DisplayAutoCompleteTips"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(92) //= 0x5c. The runtime will prefer the VTID if present
  @VTID(95)
  void displayAutoCompleteTips(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Options"
   * </p>
   * @return  Returns a value of type word.Options
   */

  @DISPID(93) //= 0x5d. The runtime will prefer the VTID if present
  @VTID(96)
  word.Options options();


  /**
   * <p>
   * Getter method for the COM property "DisplayAlerts"
   * </p>
   * @return  Returns a value of type word.WdAlertLevel
   */

  @DISPID(94) //= 0x5e. The runtime will prefer the VTID if present
  @VTID(97)
  word.WdAlertLevel displayAlerts();


  /**
   * <p>
   * Setter method for the COM property "DisplayAlerts"
   * </p>
   * @param prop Mandatory word.WdAlertLevel parameter.
   */

  @DISPID(94) //= 0x5e. The runtime will prefer the VTID if present
  @VTID(98)
  void displayAlerts(
    word.WdAlertLevel prop);


  /**
   * <p>
   * Getter method for the COM property "CustomDictionaries"
   * </p>
   * @return  Returns a value of type word.Dictionaries
   */

  @DISPID(95) //= 0x5f. The runtime will prefer the VTID if present
  @VTID(99)
  word.Dictionaries customDictionaries();


  @VTID(99)
  @ReturnValue(defaultPropertyThrough={word.Dictionaries.class})
  word.Dictionary customDictionaries(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "PathSeparator"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(96) //= 0x60. The runtime will prefer the VTID if present
  @VTID(100)
  java.lang.String pathSeparator();


  /**
   * <p>
   * Setter method for the COM property "StatusBar"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(97) //= 0x61. The runtime will prefer the VTID if present
  @VTID(101)
  void statusBar(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "MAPIAvailable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(98) //= 0x62. The runtime will prefer the VTID if present
  @VTID(102)
  boolean mapiAvailable();


  /**
   * <p>
   * Getter method for the COM property "DisplayScreenTips"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(99) //= 0x63. The runtime will prefer the VTID if present
  @VTID(103)
  boolean displayScreenTips();


  /**
   * <p>
   * Setter method for the COM property "DisplayScreenTips"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(99) //= 0x63. The runtime will prefer the VTID if present
  @VTID(104)
  void displayScreenTips(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "EnableCancelKey"
   * </p>
   * @return  Returns a value of type word.WdEnableCancelKey
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(105)
  word.WdEnableCancelKey enableCancelKey();


  /**
   * <p>
   * Setter method for the COM property "EnableCancelKey"
   * </p>
   * @param prop Mandatory word.WdEnableCancelKey parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(106)
  void enableCancelKey(
    word.WdEnableCancelKey prop);


  /**
   * <p>
   * Getter method for the COM property "UserControl"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(107)
  boolean userControl();


  /**
   * <p>
   * Getter method for the COM property "FileSearch"
   * </p>
   * @return  Returns a value of type office.FileSearch
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(108)
  office.FileSearch fileSearch();


  /**
   * <p>
   * Getter method for the COM property "MailSystem"
   * </p>
   * @return  Returns a value of type word.WdMailSystem
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(109)
  word.WdMailSystem mailSystem();


  /**
   * <p>
   * Getter method for the COM property "DefaultTableSeparator"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(110)
  java.lang.String defaultTableSeparator();


  /**
   * <p>
   * Setter method for the COM property "DefaultTableSeparator"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(111)
  void defaultTableSeparator(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "ShowVisualBasicEditor"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(112)
  boolean showVisualBasicEditor();


  /**
   * <p>
   * Setter method for the COM property "ShowVisualBasicEditor"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(113)
  void showVisualBasicEditor(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "BrowseExtraFileTypes"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(114)
  java.lang.String browseExtraFileTypes();


  /**
   * <p>
   * Setter method for the COM property "BrowseExtraFileTypes"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(115)
  void browseExtraFileTypes(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "IsObjectValid"
   * </p>
   * @param object Mandatory com4j.Com4jObject parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(116)
  boolean isObjectValid(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject object);


  /**
   * <p>
   * Getter method for the COM property "HangulHanjaDictionaries"
   * </p>
   * @return  Returns a value of type word.HangulHanjaConversionDictionaries
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(117)
  word.HangulHanjaConversionDictionaries hangulHanjaDictionaries();


  @VTID(117)
  @ReturnValue(defaultPropertyThrough={word.HangulHanjaConversionDictionaries.class})
  word.Dictionary hangulHanjaDictionaries(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "MailMessage"
   * </p>
   * @return  Returns a value of type word.MailMessage
   */

  @DISPID(348) //= 0x15c. The runtime will prefer the VTID if present
  @VTID(118)
  word.MailMessage mailMessage();


  /**
   * <p>
   * Getter method for the COM property "FocusInMailHeader"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(386) //= 0x182. The runtime will prefer the VTID if present
  @VTID(119)
  boolean focusInMailHeader();


  /**
   * @param saveChanges Optional parameter. Default value is com4j.Variant.getMissing()
   * @param originalFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param routeDocument Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1105) //= 0x451. The runtime will prefer the VTID if present
  @VTID(120)
  void quit(
    @Optional java.lang.Object saveChanges,
    @Optional java.lang.Object originalFormat,
    @Optional java.lang.Object routeDocument);


  /**
   */

  @DISPID(301) //= 0x12d. The runtime will prefer the VTID if present
  @VTID(121)
  void screenRefresh();


  /**
   * @param background Optional parameter. Default value is com4j.Variant.getMissing()
   * @param append Optional parameter. Default value is com4j.Variant.getMissing()
   * @param range Optional parameter. Default value is com4j.Variant.getMissing()
   * @param outputFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pages Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pageType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinterMacGX Optional parameter. Default value is com4j.Variant.getMissing()
   * @param manualDuplexPrint Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(302) //= 0x12e. The runtime will prefer the VTID if present
  @VTID(122)
  void printOutOld(
    @Optional java.lang.Object background,
    @Optional java.lang.Object append,
    @Optional java.lang.Object range,
    @Optional java.lang.Object outputFileName,
    @Optional java.lang.Object from,
    @Optional java.lang.Object to,
    @Optional java.lang.Object item,
    @Optional java.lang.Object copies,
    @Optional java.lang.Object pages,
    @Optional java.lang.Object pageType,
    @Optional java.lang.Object printToFile,
    @Optional java.lang.Object collate,
    @Optional java.lang.Object fileName,
    @Optional java.lang.Object activePrinterMacGX,
    @Optional java.lang.Object manualDuplexPrint);


  /**
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(303) //= 0x12f. The runtime will prefer the VTID if present
  @VTID(123)
  void lookupNameProperties(
    java.lang.String name);


  /**
   * @param unavailableFont Mandatory java.lang.String parameter.
   * @param substituteFont Mandatory java.lang.String parameter.
   */

  @DISPID(304) //= 0x130. The runtime will prefer the VTID if present
  @VTID(124)
  void substituteFont(
    java.lang.String unavailableFont,
    java.lang.String substituteFont);


  /**
   * @param times Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(305) //= 0x131. The runtime will prefer the VTID if present
  @VTID(125)
  boolean repeat(
    @Optional java.lang.Object times);


  /**
   * @param channel Mandatory int parameter.
   * @param command Mandatory java.lang.String parameter.
   */

  @DISPID(310) //= 0x136. The runtime will prefer the VTID if present
  @VTID(126)
  void ddeExecute(
    int channel,
    java.lang.String command);


  /**
   * @param app Mandatory java.lang.String parameter.
   * @param topic Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(311) //= 0x137. The runtime will prefer the VTID if present
  @VTID(127)
  int ddeInitiate(
    java.lang.String app,
    java.lang.String topic);


  /**
   * @param channel Mandatory int parameter.
   * @param item Mandatory java.lang.String parameter.
   * @param data Mandatory java.lang.String parameter.
   */

  @DISPID(312) //= 0x138. The runtime will prefer the VTID if present
  @VTID(128)
  void ddePoke(
    int channel,
    java.lang.String item,
    java.lang.String data);


  /**
   * @param channel Mandatory int parameter.
   * @param item Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(313) //= 0x139. The runtime will prefer the VTID if present
  @VTID(129)
  java.lang.String ddeRequest(
    int channel,
    java.lang.String item);


  /**
   * @param channel Mandatory int parameter.
   */

  @DISPID(314) //= 0x13a. The runtime will prefer the VTID if present
  @VTID(130)
  void ddeTerminate(
    int channel);


  /**
   */

  @DISPID(315) //= 0x13b. The runtime will prefer the VTID if present
  @VTID(131)
  void ddeTerminateAll();


  /**
   * @param arg1 Mandatory word.WdKey parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(316) //= 0x13c. The runtime will prefer the VTID if present
  @VTID(132)
  int buildKeyCode(
    word.WdKey arg1,
    @Optional java.lang.Object arg2,
    @Optional java.lang.Object arg3,
    @Optional java.lang.Object arg4);


  /**
   * @param keyCode Mandatory int parameter.
   * @param keyCode2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(317) //= 0x13d. The runtime will prefer the VTID if present
  @VTID(133)
  java.lang.String keyString(
    int keyCode,
    @Optional java.lang.Object keyCode2);


  /**
   * @param source Mandatory java.lang.String parameter.
   * @param destination Mandatory java.lang.String parameter.
   * @param name Mandatory java.lang.String parameter.
   * @param object Mandatory word.WdOrganizerObject parameter.
   */

  @DISPID(318) //= 0x13e. The runtime will prefer the VTID if present
  @VTID(134)
  void organizerCopy(
    java.lang.String source,
    java.lang.String destination,
    java.lang.String name,
    word.WdOrganizerObject object);


  /**
   * @param source Mandatory java.lang.String parameter.
   * @param name Mandatory java.lang.String parameter.
   * @param object Mandatory word.WdOrganizerObject parameter.
   */

  @DISPID(319) //= 0x13f. The runtime will prefer the VTID if present
  @VTID(135)
  void organizerDelete(
    java.lang.String source,
    java.lang.String name,
    word.WdOrganizerObject object);


  /**
   * @param source Mandatory java.lang.String parameter.
   * @param name Mandatory java.lang.String parameter.
   * @param newName Mandatory java.lang.String parameter.
   * @param object Mandatory word.WdOrganizerObject parameter.
   */

  @DISPID(320) //= 0x140. The runtime will prefer the VTID if present
  @VTID(136)
  void organizerRename(
    java.lang.String source,
    java.lang.String name,
    java.lang.String newName,
    word.WdOrganizerObject object);


    /**
     * @param name Optional parameter. Default value is com4j.Variant.getMissing()
     * @param addressProperties Optional parameter. Default value is com4j.Variant.getMissing()
     * @param useAutoText Optional parameter. Default value is com4j.Variant.getMissing()
     * @param displaySelectDialog Optional parameter. Default value is com4j.Variant.getMissing()
     * @param selectDialog Optional parameter. Default value is com4j.Variant.getMissing()
     * @param checkNamesDialog Optional parameter. Default value is com4j.Variant.getMissing()
     * @param recentAddressesChoice Optional parameter. Default value is com4j.Variant.getMissing()
     * @param updateRecentAddresses Optional parameter. Default value is com4j.Variant.getMissing()
     * @return  Returns a value of type java.lang.String
     */

    @DISPID(322) //= 0x142. The runtime will prefer the VTID if present
    @VTID(138)
    java.lang.String getAddress(
      @Optional java.lang.Object name,
      @Optional java.lang.Object addressProperties,
      @Optional java.lang.Object useAutoText,
      @Optional java.lang.Object displaySelectDialog,
      @Optional java.lang.Object selectDialog,
      @Optional java.lang.Object checkNamesDialog,
      @Optional java.lang.Object recentAddressesChoice,
      @Optional java.lang.Object updateRecentAddresses);


    /**
     * @param string Mandatory java.lang.String parameter.
     * @return  Returns a value of type boolean
     */

    @DISPID(323) //= 0x143. The runtime will prefer the VTID if present
    @VTID(139)
    boolean checkGrammar(
      java.lang.String string);


    /**
     * @param word Mandatory java.lang.String parameter.
     * @param customDictionary Optional parameter. Default value is com4j.Variant.getMissing()
     * @param ignoreUppercase Optional parameter. Default value is com4j.Variant.getMissing()
     * @param mainDictionary Optional parameter. Default value is com4j.Variant.getMissing()
     * @param customDictionary2 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param customDictionary3 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param customDictionary4 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param customDictionary5 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param customDictionary6 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param customDictionary7 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param customDictionary8 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param customDictionary9 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param customDictionary10 Optional parameter. Default value is com4j.Variant.getMissing()
     * @return  Returns a value of type boolean
     */

    @DISPID(324) //= 0x144. The runtime will prefer the VTID if present
    @VTID(140)
    boolean checkSpelling(
      java.lang.String word,
      @Optional java.lang.Object customDictionary,
      @Optional java.lang.Object ignoreUppercase,
      @Optional java.lang.Object mainDictionary,
      @Optional java.lang.Object customDictionary2,
      @Optional java.lang.Object customDictionary3,
      @Optional java.lang.Object customDictionary4,
      @Optional java.lang.Object customDictionary5,
      @Optional java.lang.Object customDictionary6,
      @Optional java.lang.Object customDictionary7,
      @Optional java.lang.Object customDictionary8,
      @Optional java.lang.Object customDictionary9,
      @Optional java.lang.Object customDictionary10);


    /**
     */

    @DISPID(326) //= 0x146. The runtime will prefer the VTID if present
    @VTID(141)
    void resetIgnoreAll();


    /**
     * @param word Mandatory java.lang.String parameter.
     * @param customDictionary Optional parameter. Default value is com4j.Variant.getMissing()
     * @param ignoreUppercase Optional parameter. Default value is com4j.Variant.getMissing()
     * @param mainDictionary Optional parameter. Default value is com4j.Variant.getMissing()
     * @param suggestionMode Optional parameter. Default value is com4j.Variant.getMissing()
     * @param customDictionary2 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param customDictionary3 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param customDictionary4 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param customDictionary5 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param customDictionary6 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param customDictionary7 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param customDictionary8 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param customDictionary9 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param customDictionary10 Optional parameter. Default value is com4j.Variant.getMissing()
     * @return  Returns a value of type word.SpellingSuggestions
     */

    @DISPID(327) //= 0x147. The runtime will prefer the VTID if present
    @VTID(142)
    word.SpellingSuggestions getSpellingSuggestions(
      java.lang.String word,
      @Optional java.lang.Object customDictionary,
      @Optional java.lang.Object ignoreUppercase,
      @Optional java.lang.Object mainDictionary,
      @Optional java.lang.Object suggestionMode,
      @Optional java.lang.Object customDictionary2,
      @Optional java.lang.Object customDictionary3,
      @Optional java.lang.Object customDictionary4,
      @Optional java.lang.Object customDictionary5,
      @Optional java.lang.Object customDictionary6,
      @Optional java.lang.Object customDictionary7,
      @Optional java.lang.Object customDictionary8,
      @Optional java.lang.Object customDictionary9,
      @Optional java.lang.Object customDictionary10);


    /**
     */

    @DISPID(328) //= 0x148. The runtime will prefer the VTID if present
    @VTID(143)
    void goBack();


    /**
     * @param helpType Mandatory java.lang.Object parameter.
     */

    @DISPID(329) //= 0x149. The runtime will prefer the VTID if present
    @VTID(144)
    void help(
      java.lang.Object helpType);


    /**
     */

    @DISPID(330) //= 0x14a. The runtime will prefer the VTID if present
    @VTID(145)
    void automaticChange();


    /**
     */

    @DISPID(331) //= 0x14b. The runtime will prefer the VTID if present
    @VTID(146)
    void showMe();


    /**
     */

    @DISPID(332) //= 0x14c. The runtime will prefer the VTID if present
    @VTID(147)
    void helpTool();


    /**
     * @return  Returns a value of type word.Window
     */

    @DISPID(345) //= 0x159. The runtime will prefer the VTID if present
    @VTID(148)
    word.Window newWindow();


    /**
     * @param listAllCommands Mandatory boolean parameter.
     */

    @DISPID(346) //= 0x15a. The runtime will prefer the VTID if present
    @VTID(149)
    void listCommands(
      boolean listAllCommands);


    /**
     */

    @DISPID(349) //= 0x15d. The runtime will prefer the VTID if present
    @VTID(150)
    void showClipboard();


    /**
     * @param when Mandatory java.lang.Object parameter.
     * @param name Mandatory java.lang.String parameter.
     * @param tolerance Optional parameter. Default value is com4j.Variant.getMissing()
     */

    @DISPID(350) //= 0x15e. The runtime will prefer the VTID if present
    @VTID(151)
    void onTime(
      java.lang.Object when,
      java.lang.String name,
      @Optional java.lang.Object tolerance);


    /**
     */

    @DISPID(351) //= 0x15f. The runtime will prefer the VTID if present
    @VTID(152)
    void nextLetter();


    /**
     * @param zone Mandatory java.lang.String parameter.
     * @param server Mandatory java.lang.String parameter.
     * @param volume Mandatory java.lang.String parameter.
     * @param user Optional parameter. Default value is com4j.Variant.getMissing()
     * @param userPassword Optional parameter. Default value is com4j.Variant.getMissing()
     * @param volumePassword Optional parameter. Default value is com4j.Variant.getMissing()
     * @return  Returns a value of type short
     */

    @DISPID(353) //= 0x161. The runtime will prefer the VTID if present
    @VTID(153)
    short mountVolume(
      java.lang.String zone,
      java.lang.String server,
      java.lang.String volume,
      @Optional java.lang.Object user,
      @Optional java.lang.Object userPassword,
      @Optional java.lang.Object volumePassword);


    /**
     * @param string Mandatory java.lang.String parameter.
     * @return  Returns a value of type java.lang.String
     */

    @DISPID(354) //= 0x162. The runtime will prefer the VTID if present
    @VTID(154)
    java.lang.String cleanString(
      java.lang.String string);


    /**
     */

    @DISPID(356) //= 0x164. The runtime will prefer the VTID if present
    @VTID(155)
    void sendFax();


    /**
     * @param path Mandatory java.lang.String parameter.
     */

    @DISPID(357) //= 0x165. The runtime will prefer the VTID if present
    @VTID(156)
    void changeFileOpenDirectory(
      java.lang.String path);


    /**
     * @param macroName Mandatory java.lang.String parameter.
     */

    @DISPID(358) //= 0x166. The runtime will prefer the VTID if present
    @VTID(157)
    void runOld(
      java.lang.String macroName);


    /**
     */

    @DISPID(359) //= 0x167. The runtime will prefer the VTID if present
    @VTID(158)
    void goForward();


    /**
     * @param left Mandatory int parameter.
     * @param top Mandatory int parameter.
     */

    @DISPID(360) //= 0x168. The runtime will prefer the VTID if present
    @VTID(159)
    void move(
      int left,
      int top);


    /**
     * @param width Mandatory int parameter.
     * @param height Mandatory int parameter.
     */

    @DISPID(361) //= 0x169. The runtime will prefer the VTID if present
    @VTID(160)
    void resize(
      int width,
      int height);


    /**
     * @param inches Mandatory float parameter.
     * @return  Returns a value of type float
     */

    @DISPID(370) //= 0x172. The runtime will prefer the VTID if present
    @VTID(161)
    float inchesToPoints(
      float inches);


    /**
     * @param centimeters Mandatory float parameter.
     * @return  Returns a value of type float
     */

    @DISPID(371) //= 0x173. The runtime will prefer the VTID if present
    @VTID(162)
    float centimetersToPoints(
      float centimeters);


    /**
     * @param millimeters Mandatory float parameter.
     * @return  Returns a value of type float
     */

    @DISPID(372) //= 0x174. The runtime will prefer the VTID if present
    @VTID(163)
    float millimetersToPoints(
      float millimeters);


    /**
     * @param picas Mandatory float parameter.
     * @return  Returns a value of type float
     */

    @DISPID(373) //= 0x175. The runtime will prefer the VTID if present
    @VTID(164)
    float picasToPoints(
      float picas);


    /**
     * @param lines Mandatory float parameter.
     * @return  Returns a value of type float
     */

    @DISPID(374) //= 0x176. The runtime will prefer the VTID if present
    @VTID(165)
    float linesToPoints(
      float lines);


    /**
     * @param points Mandatory float parameter.
     * @return  Returns a value of type float
     */

    @DISPID(380) //= 0x17c. The runtime will prefer the VTID if present
    @VTID(166)
    float pointsToInches(
      float points);


    /**
     * @param points Mandatory float parameter.
     * @return  Returns a value of type float
     */

    @DISPID(381) //= 0x17d. The runtime will prefer the VTID if present
    @VTID(167)
    float pointsToCentimeters(
      float points);


    /**
     * @param points Mandatory float parameter.
     * @return  Returns a value of type float
     */

    @DISPID(382) //= 0x17e. The runtime will prefer the VTID if present
    @VTID(168)
    float pointsToMillimeters(
      float points);


    /**
     * @param points Mandatory float parameter.
     * @return  Returns a value of type float
     */

    @DISPID(383) //= 0x17f. The runtime will prefer the VTID if present
    @VTID(169)
    float pointsToPicas(
      float points);


    /**
     * @param points Mandatory float parameter.
     * @return  Returns a value of type float
     */

    @DISPID(384) //= 0x180. The runtime will prefer the VTID if present
    @VTID(170)
    float pointsToLines(
      float points);


    /**
     */

    @DISPID(385) //= 0x181. The runtime will prefer the VTID if present
    @VTID(171)
    void activate();


    /**
     * @param points Mandatory float parameter.
     * @param fVertical Optional parameter. Default value is com4j.Variant.getMissing()
     * @return  Returns a value of type float
     */

    @DISPID(387) //= 0x183. The runtime will prefer the VTID if present
    @VTID(172)
    float pointsToPixels(
      float points,
      @Optional java.lang.Object fVertical);


    /**
     * @param pixels Mandatory float parameter.
     * @param fVertical Optional parameter. Default value is com4j.Variant.getMissing()
     * @return  Returns a value of type float
     */

    @DISPID(388) //= 0x184. The runtime will prefer the VTID if present
    @VTID(173)
    float pixelsToPoints(
      float pixels,
      @Optional java.lang.Object fVertical);


    /**
     */

    @DISPID(400) //= 0x190. The runtime will prefer the VTID if present
    @VTID(174)
    void keyboardLatin();


    /**
     */

    @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
    @VTID(175)
    void keyboardBidi();


    /**
     */

    @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
    @VTID(176)
    void toggleKeyboard();


    /**
     * @param langId Optional parameter. Default value is 0
     * @return  Returns a value of type int
     */

    @DISPID(446) //= 0x1be. The runtime will prefer the VTID if present
    @VTID(177)
    int keyboard(
      @Optional @DefaultValue("0") int langId);


    /**
     * @return  Returns a value of type java.lang.String
     */

    @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
    @VTID(178)
    java.lang.String productCode();


    /**
     * @return  Returns a value of type word.DefaultWebOptions
     */

    @DISPID(405) //= 0x195. The runtime will prefer the VTID if present
    @VTID(179)
    word.DefaultWebOptions defaultWebOptions();


    /**
     * @param range Mandatory java.lang.Object parameter.
     * @param cid Mandatory java.lang.Object parameter.
     * @param piCSE Mandatory java.lang.Object parameter.
     */

    @DISPID(407) //= 0x197. The runtime will prefer the VTID if present
    @VTID(180)
    void discussionSupport(
      java.lang.Object range,
      java.lang.Object cid,
      java.lang.Object piCSE);


    /**
     * @param name Mandatory java.lang.String parameter.
     * @param documentType Mandatory word.WdDocumentMedium parameter.
     */

    @DISPID(414) //= 0x19e. The runtime will prefer the VTID if present
    @VTID(181)
    void setDefaultTheme(
      java.lang.String name,
      word.WdDocumentMedium documentType);


    /**
     * @param documentType Mandatory word.WdDocumentMedium parameter.
     * @return  Returns a value of type java.lang.String
     */

    @DISPID(416) //= 0x1a0. The runtime will prefer the VTID if present
    @VTID(182)
    java.lang.String getDefaultTheme(
      word.WdDocumentMedium documentType);


    /**
     * <p>
     * Getter method for the COM property "EmailOptions"
     * </p>
     * @return  Returns a value of type word.EmailOptions
     */

    @DISPID(389) //= 0x185. The runtime will prefer the VTID if present
    @VTID(183)
    word.EmailOptions emailOptions();


    /**
     * <p>
     * Getter method for the COM property "Language"
     * </p>
     * @return  Returns a value of type office.MsoLanguageID
     */

    @DISPID(391) //= 0x187. The runtime will prefer the VTID if present
    @VTID(184)
    office.MsoLanguageID language();


    /**
     * <p>
     * Getter method for the COM property "COMAddIns"
     * </p>
     * @return  Returns a value of type office.COMAddIns
     */

    @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
    @VTID(185)
    office.COMAddIns comAddIns();


    @VTID(185)
    @ReturnValue(defaultPropertyThrough={office.COMAddIns.class})
    office.COMAddIn comAddIns(
      java.lang.Object index);

    /**
     * <p>
     * Getter method for the COM property "CheckLanguage"
     * </p>
     * @return  Returns a value of type boolean
     */

    @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
    @VTID(186)
    boolean checkLanguage();


    /**
     * <p>
     * Setter method for the COM property "CheckLanguage"
     * </p>
     * @param prop Mandatory boolean parameter.
     */

    @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
    @VTID(187)
    void checkLanguage(
      boolean prop);


    /**
     * <p>
     * Getter method for the COM property "LanguageSettings"
     * </p>
     * @return  Returns a value of type office.LanguageSettings
     */

    @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
    @VTID(188)
    office.LanguageSettings languageSettings();


    /**
     * <p>
     * Getter method for the COM property "Dummy1"
     * </p>
     * @return  Returns a value of type boolean
     */

    @DISPID(406) //= 0x196. The runtime will prefer the VTID if present
    @VTID(189)
    boolean dummy1();


    /**
     * <p>
     * Getter method for the COM property "AnswerWizard"
     * </p>
     * @return  Returns a value of type office.AnswerWizard
     */

    @DISPID(409) //= 0x199. The runtime will prefer the VTID if present
    @VTID(190)
    office.AnswerWizard answerWizard();


    /**
     * <p>
     * Getter method for the COM property "FeatureInstall"
     * </p>
     * @return  Returns a value of type office.MsoFeatureInstall
     */

    @DISPID(447) //= 0x1bf. The runtime will prefer the VTID if present
    @VTID(191)
    office.MsoFeatureInstall featureInstall();


    /**
     * <p>
     * Setter method for the COM property "FeatureInstall"
     * </p>
     * @param prop Mandatory office.MsoFeatureInstall parameter.
     */

    @DISPID(447) //= 0x1bf. The runtime will prefer the VTID if present
    @VTID(192)
    void featureInstall(
      office.MsoFeatureInstall prop);


    /**
     * @param background Optional parameter. Default value is com4j.Variant.getMissing()
     * @param append Optional parameter. Default value is com4j.Variant.getMissing()
     * @param range Optional parameter. Default value is com4j.Variant.getMissing()
     * @param outputFileName Optional parameter. Default value is com4j.Variant.getMissing()
     * @param from Optional parameter. Default value is com4j.Variant.getMissing()
     * @param to Optional parameter. Default value is com4j.Variant.getMissing()
     * @param item Optional parameter. Default value is com4j.Variant.getMissing()
     * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
     * @param pages Optional parameter. Default value is com4j.Variant.getMissing()
     * @param pageType Optional parameter. Default value is com4j.Variant.getMissing()
     * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
     * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
     * @param fileName Optional parameter. Default value is com4j.Variant.getMissing()
     * @param activePrinterMacGX Optional parameter. Default value is com4j.Variant.getMissing()
     * @param manualDuplexPrint Optional parameter. Default value is com4j.Variant.getMissing()
     * @param printZoomColumn Optional parameter. Default value is com4j.Variant.getMissing()
     * @param printZoomRow Optional parameter. Default value is com4j.Variant.getMissing()
     * @param printZoomPaperWidth Optional parameter. Default value is com4j.Variant.getMissing()
     * @param printZoomPaperHeight Optional parameter. Default value is com4j.Variant.getMissing()
     */

    @DISPID(444) //= 0x1bc. The runtime will prefer the VTID if present
    @VTID(193)
    void printOut2000(
      @Optional java.lang.Object background,
      @Optional java.lang.Object append,
      @Optional java.lang.Object range,
      @Optional java.lang.Object outputFileName,
      @Optional java.lang.Object from,
      @Optional java.lang.Object to,
      @Optional java.lang.Object item,
      @Optional java.lang.Object copies,
      @Optional java.lang.Object pages,
      @Optional java.lang.Object pageType,
      @Optional java.lang.Object printToFile,
      @Optional java.lang.Object collate,
      @Optional java.lang.Object fileName,
      @Optional java.lang.Object activePrinterMacGX,
      @Optional java.lang.Object manualDuplexPrint,
      @Optional java.lang.Object printZoomColumn,
      @Optional java.lang.Object printZoomRow,
      @Optional java.lang.Object printZoomPaperWidth,
      @Optional java.lang.Object printZoomPaperHeight);


    /**
     * @param macroName Mandatory java.lang.String parameter.
     * @param varg1 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg2 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg3 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg4 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg5 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg6 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg7 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg8 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg9 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg10 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg11 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg12 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg13 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg14 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg15 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg16 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg17 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg18 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg19 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg20 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg21 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg22 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg23 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg24 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg25 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg26 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg27 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg28 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg29 Optional parameter. Default value is com4j.Variant.getMissing()
     * @param varg30 Optional parameter. Default value is com4j.Variant.getMissing()
     * @return  Returns a value of type java.lang.Object
     */

    @DISPID(445) //= 0x1bd. The runtime will prefer the VTID if present
    @VTID(194)
    @ReturnValue(type=NativeType.VARIANT)
    java.lang.Object run(
      java.lang.String macroName,
      @Optional java.lang.Object varg1,
      @Optional java.lang.Object varg2,
      @Optional java.lang.Object varg3,
      @Optional java.lang.Object varg4,
      @Optional java.lang.Object varg5,
      @Optional java.lang.Object varg6,
      @Optional java.lang.Object varg7,
      @Optional java.lang.Object varg8,
      @Optional java.lang.Object varg9,
      @Optional java.lang.Object varg10,
      @Optional java.lang.Object varg11,
      @Optional java.lang.Object varg12,
      @Optional java.lang.Object varg13,
      @Optional java.lang.Object varg14,
      @Optional java.lang.Object varg15,
      @Optional java.lang.Object varg16,
      @Optional java.lang.Object varg17,
      @Optional java.lang.Object varg18,
      @Optional java.lang.Object varg19,
      @Optional java.lang.Object varg20,
      @Optional java.lang.Object varg21,
      @Optional java.lang.Object varg22,
      @Optional java.lang.Object varg23,
      @Optional java.lang.Object varg24,
      @Optional java.lang.Object varg25,
      @Optional java.lang.Object varg26,
      @Optional java.lang.Object varg27,
      @Optional java.lang.Object varg28,
      @Optional java.lang.Object varg29,
      @Optional java.lang.Object varg30);


    /**
     * @param background Optional parameter. Default value is com4j.Variant.getMissing()
     * @param append Optional parameter. Default value is com4j.Variant.getMissing()
     * @param range Optional parameter. Default value is com4j.Variant.getMissing()
     * @param outputFileName Optional parameter. Default value is com4j.Variant.getMissing()
     * @param from Optional parameter. Default value is com4j.Variant.getMissing()
     * @param to Optional parameter. Default value is com4j.Variant.getMissing()
     * @param item Optional parameter. Default value is com4j.Variant.getMissing()
     * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
     * @param pages Optional parameter. Default value is com4j.Variant.getMissing()
     * @param pageType Optional parameter. Default value is com4j.Variant.getMissing()
     * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
     * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
     * @param fileName Optional parameter. Default value is com4j.Variant.getMissing()
     * @param activePrinterMacGX Optional parameter. Default value is com4j.Variant.getMissing()
     * @param manualDuplexPrint Optional parameter. Default value is com4j.Variant.getMissing()
     * @param printZoomColumn Optional parameter. Default value is com4j.Variant.getMissing()
     * @param printZoomRow Optional parameter. Default value is com4j.Variant.getMissing()
     * @param printZoomPaperWidth Optional parameter. Default value is com4j.Variant.getMissing()
     * @param printZoomPaperHeight Optional parameter. Default value is com4j.Variant.getMissing()
     */

    @DISPID(448) //= 0x1c0. The runtime will prefer the VTID if present
    @VTID(195)
    void printOut(
      @Optional java.lang.Object background,
      @Optional java.lang.Object append,
      @Optional java.lang.Object range,
      @Optional java.lang.Object outputFileName,
      @Optional java.lang.Object from,
      @Optional java.lang.Object to,
      @Optional java.lang.Object item,
      @Optional java.lang.Object copies,
      @Optional java.lang.Object pages,
      @Optional java.lang.Object pageType,
      @Optional java.lang.Object printToFile,
      @Optional java.lang.Object collate,
      @Optional java.lang.Object fileName,
      @Optional java.lang.Object activePrinterMacGX,
      @Optional java.lang.Object manualDuplexPrint,
      @Optional java.lang.Object printZoomColumn,
      @Optional java.lang.Object printZoomRow,
      @Optional java.lang.Object printZoomPaperWidth,
      @Optional java.lang.Object printZoomPaperHeight);


    /**
     * <p>
     * Getter method for the COM property "AutomationSecurity"
     * </p>
     * @return  Returns a value of type office.MsoAutomationSecurity
     */

    @DISPID(449) //= 0x1c1. The runtime will prefer the VTID if present
    @VTID(196)
    office.MsoAutomationSecurity automationSecurity();


    /**
     * <p>
     * Setter method for the COM property "AutomationSecurity"
     * </p>
     * @param prop Mandatory office.MsoAutomationSecurity parameter.
     */

    @DISPID(449) //= 0x1c1. The runtime will prefer the VTID if present
    @VTID(197)
    void automationSecurity(
      office.MsoAutomationSecurity prop);


    /**
     * <p>
     * Getter method for the COM property "FileDialog"
     * </p>
     * @param fileDialogType Mandatory office.MsoFileDialogType parameter.
     * @return  Returns a value of type office.FileDialog
     */

    @DISPID(450) //= 0x1c2. The runtime will prefer the VTID if present
    @VTID(198)
    office.FileDialog fileDialog(
      office.MsoFileDialogType fileDialogType);


    /**
     * <p>
     * Getter method for the COM property "EmailTemplate"
     * </p>
     * @return  Returns a value of type java.lang.String
     */

    @DISPID(451) //= 0x1c3. The runtime will prefer the VTID if present
    @VTID(199)
    java.lang.String emailTemplate();


    /**
     * <p>
     * Setter method for the COM property "EmailTemplate"
     * </p>
     * @param prop Mandatory java.lang.String parameter.
     */

    @DISPID(451) //= 0x1c3. The runtime will prefer the VTID if present
    @VTID(200)
    void emailTemplate(
      java.lang.String prop);


    /**
     * <p>
     * Getter method for the COM property "ShowWindowsInTaskbar"
     * </p>
     * @return  Returns a value of type boolean
     */

    @DISPID(452) //= 0x1c4. The runtime will prefer the VTID if present
    @VTID(201)
    boolean showWindowsInTaskbar();


    /**
     * <p>
     * Setter method for the COM property "ShowWindowsInTaskbar"
     * </p>
     * @param prop Mandatory boolean parameter.
     */

    @DISPID(452) //= 0x1c4. The runtime will prefer the VTID if present
    @VTID(202)
    void showWindowsInTaskbar(
      boolean prop);


    /**
     * <p>
     * Getter method for the COM property "NewDocument"
     * </p>
     * @return  Returns a value of type office.NewFile
     */

    @DISPID(454) //= 0x1c6. The runtime will prefer the VTID if present
    @VTID(203)
    office.NewFile newDocument();


    /**
     * <p>
     * Getter method for the COM property "ShowStartupDialog"
     * </p>
     * @return  Returns a value of type boolean
     */

    @DISPID(455) //= 0x1c7. The runtime will prefer the VTID if present
    @VTID(204)
    boolean showStartupDialog();


    /**
     * <p>
     * Setter method for the COM property "ShowStartupDialog"
     * </p>
     * @param prop Mandatory boolean parameter.
     */

    @DISPID(455) //= 0x1c7. The runtime will prefer the VTID if present
    @VTID(205)
    void showStartupDialog(
      boolean prop);


    /**
     * <p>
     * Getter method for the COM property "AutoCorrectEmail"
     * </p>
     * @return  Returns a value of type word.AutoCorrect
     */

    @DISPID(456) //= 0x1c8. The runtime will prefer the VTID if present
    @VTID(206)
    word.AutoCorrect autoCorrectEmail();


    /**
     * <p>
     * Getter method for the COM property "TaskPanes"
     * </p>
     * @return  Returns a value of type word.TaskPanes
     */

    @DISPID(457) //= 0x1c9. The runtime will prefer the VTID if present
    @VTID(207)
    word.TaskPanes taskPanes();


    @VTID(207)
    @ReturnValue(defaultPropertyThrough={word.TaskPanes.class})
    word.TaskPane taskPanes(
      word.WdTaskPanes index);

    /**
     * <p>
     * Getter method for the COM property "DefaultLegalBlackline"
     * </p>
     * @return  Returns a value of type boolean
     */

    @DISPID(459) //= 0x1cb. The runtime will prefer the VTID if present
    @VTID(208)
    boolean defaultLegalBlackline();


    /**
     * <p>
     * Setter method for the COM property "DefaultLegalBlackline"
     * </p>
     * @param prop Mandatory boolean parameter.
     */

    @DISPID(459) //= 0x1cb. The runtime will prefer the VTID if present
    @VTID(209)
    void defaultLegalBlackline(
      boolean prop);


    /**
     * @return  Returns a value of type boolean
     */

    @DISPID(458) //= 0x1ca. The runtime will prefer the VTID if present
    @VTID(210)
    boolean dummy2();


    /**
     * <p>
     * Getter method for the COM property "SmartTagRecognizers"
     * </p>
     * @return  Returns a value of type word.SmartTagRecognizers
     */

    @DISPID(460) //= 0x1cc. The runtime will prefer the VTID if present
    @VTID(211)
    word.SmartTagRecognizers smartTagRecognizers();


    @VTID(211)
    @ReturnValue(defaultPropertyThrough={word.SmartTagRecognizers.class})
    word.SmartTagRecognizer smartTagRecognizers(
      java.lang.Object index);

    /**
     * <p>
     * Getter method for the COM property "SmartTagTypes"
     * </p>
     * @return  Returns a value of type word.SmartTagTypes
     */

    @DISPID(461) //= 0x1cd. The runtime will prefer the VTID if present
    @VTID(212)
    word.SmartTagTypes smartTagTypes();


    @VTID(212)
    @ReturnValue(defaultPropertyThrough={word.SmartTagTypes.class})
    word.SmartTagType smartTagTypes(
      java.lang.Object index);

    /**
     * <p>
     * Getter method for the COM property "XMLNamespaces"
     * </p>
     * @return  Returns a value of type word.XMLNamespaces
     */

    @DISPID(463) //= 0x1cf. The runtime will prefer the VTID if present
    @VTID(213)
    word.XMLNamespaces xmlNamespaces();


    @VTID(213)
    @ReturnValue(defaultPropertyThrough={word.XMLNamespaces.class})
    word.XMLNamespace xmlNamespaces(
      java.lang.Object index);

    /**
     */

    @DISPID(464) //= 0x1d0. The runtime will prefer the VTID if present
    @VTID(214)
    void putFocusInMailHeader();


    /**
     * <p>
     * Getter method for the COM property "ArbitraryXMLSupportAvailable"
     * </p>
     * @return  Returns a value of type boolean
     */

    @DISPID(465) //= 0x1d1. The runtime will prefer the VTID if present
    @VTID(215)
    boolean arbitraryXMLSupportAvailable();


    /**
     * <p>
     * Getter method for the COM property "BuildFull"
     * </p>
     * @return  Returns a value of type java.lang.String
     */

    @DISPID(466) //= 0x1d2. The runtime will prefer the VTID if present
    @VTID(216)
    java.lang.String buildFull();


    /**
     * <p>
     * Getter method for the COM property "BuildFeatureCrew"
     * </p>
     * @return  Returns a value of type java.lang.String
     */

    @DISPID(467) //= 0x1d3. The runtime will prefer the VTID if present
    @VTID(217)
    java.lang.String buildFeatureCrew();


    /**
     * @param fileName Mandatory java.lang.String parameter.
     */

    @DISPID(469) //= 0x1d5. The runtime will prefer the VTID if present
    @VTID(218)
    void loadMasterList(
      java.lang.String fileName);


    /**
     * @param originalDocument Mandatory word._Document parameter.
     * @param revisedDocument Mandatory word._Document parameter.
     * @param destination Optional parameter. Default value is 2
     * @param granularity Optional parameter. Default value is 1
     * @param compareFormatting Optional parameter. Default value is false
     * @param compareCaseChanges Optional parameter. Default value is false
     * @param compareWhitespace Optional parameter. Default value is false
     * @param compareTables Optional parameter. Default value is false
     * @param compareHeaders Optional parameter. Default value is false
     * @param compareFootnotes Optional parameter. Default value is false
     * @param compareTextboxes Optional parameter. Default value is false
     * @param compareFields Optional parameter. Default value is false
     * @param compareComments Optional parameter. Default value is false
     * @param compareMoves Optional parameter. Default value is false
     * @param revisedAuthor Optional parameter. Default value is ""
     * @param ignoreAllComparisonWarnings Optional parameter. Default value is false
     * @return  Returns a value of type word._Document
     */

    @DISPID(470) //= 0x1d6. The runtime will prefer the VTID if present
    @VTID(219)
    word._Document compareDocuments(
      word._Document originalDocument,
      word._Document revisedDocument,
      @Optional @DefaultValue("2") word.WdCompareDestination destination,
      @Optional @DefaultValue("1") word.WdGranularity granularity,
      @Optional @DefaultValue("-1") boolean compareFormatting,
      @Optional @DefaultValue("-1") boolean compareCaseChanges,
      @Optional @DefaultValue("-1") boolean compareWhitespace,
      @Optional @DefaultValue("-1") boolean compareTables,
      @Optional @DefaultValue("-1") boolean compareHeaders,
      @Optional @DefaultValue("-1") boolean compareFootnotes,
      @Optional @DefaultValue("-1") boolean compareTextboxes,
      @Optional @DefaultValue("-1") boolean compareFields,
      @Optional @DefaultValue("-1") boolean compareComments,
      @Optional @DefaultValue("-1") boolean compareMoves,
      @Optional @DefaultValue("") java.lang.String revisedAuthor,
      @Optional @DefaultValue("0") boolean ignoreAllComparisonWarnings);


    /**
     * @param originalDocument Mandatory word._Document parameter.
     * @param revisedDocument Mandatory word._Document parameter.
     * @param destination Optional parameter. Default value is 2
     * @param granularity Optional parameter. Default value is 1
     * @param compareFormatting Optional parameter. Default value is false
     * @param compareCaseChanges Optional parameter. Default value is false
     * @param compareWhitespace Optional parameter. Default value is false
     * @param compareTables Optional parameter. Default value is false
     * @param compareHeaders Optional parameter. Default value is false
     * @param compareFootnotes Optional parameter. Default value is false
     * @param compareTextboxes Optional parameter. Default value is false
     * @param compareFields Optional parameter. Default value is false
     * @param compareComments Optional parameter. Default value is false
     * @param compareMoves Optional parameter. Default value is false
     * @param originalAuthor Optional parameter. Default value is ""
     * @param revisedAuthor Optional parameter. Default value is ""
     * @param formatFrom Optional parameter. Default value is 2
     * @return  Returns a value of type word._Document
     */

    @DISPID(471) //= 0x1d7. The runtime will prefer the VTID if present
    @VTID(220)
    word._Document mergeDocuments(
      word._Document originalDocument,
      word._Document revisedDocument,
      @Optional @DefaultValue("2") word.WdCompareDestination destination,
      @Optional @DefaultValue("1") word.WdGranularity granularity,
      @Optional @DefaultValue("-1") boolean compareFormatting,
      @Optional @DefaultValue("-1") boolean compareCaseChanges,
      @Optional @DefaultValue("-1") boolean compareWhitespace,
      @Optional @DefaultValue("-1") boolean compareTables,
      @Optional @DefaultValue("-1") boolean compareHeaders,
      @Optional @DefaultValue("-1") boolean compareFootnotes,
      @Optional @DefaultValue("-1") boolean compareTextboxes,
      @Optional @DefaultValue("-1") boolean compareFields,
      @Optional @DefaultValue("-1") boolean compareComments,
      @Optional @DefaultValue("-1") boolean compareMoves,
      @Optional @DefaultValue("") java.lang.String originalAuthor,
      @Optional @DefaultValue("") java.lang.String revisedAuthor,
      @Optional @DefaultValue("2") word.WdMergeFormatFrom formatFrom);


    /**
     * <p>
     * Getter method for the COM property "Bibliography"
     * </p>
     * @return  Returns a value of type word.Bibliography
     */

    @DISPID(472) //= 0x1d8. The runtime will prefer the VTID if present
    @VTID(221)
    word.Bibliography bibliography();


    /**
     * <p>
     * Getter method for the COM property "ShowStylePreviews"
     * </p>
     * @return  Returns a value of type boolean
     */

    @DISPID(473) //= 0x1d9. The runtime will prefer the VTID if present
    @VTID(222)
    boolean showStylePreviews();


    /**
     * <p>
     * Setter method for the COM property "ShowStylePreviews"
     * </p>
     * @param prop Mandatory boolean parameter.
     */

    @DISPID(473) //= 0x1d9. The runtime will prefer the VTID if present
    @VTID(223)
    void showStylePreviews(
      boolean prop);


    /**
     * <p>
     * Getter method for the COM property "RestrictLinkedStyles"
     * </p>
     * @return  Returns a value of type boolean
     */

    @DISPID(474) //= 0x1da. The runtime will prefer the VTID if present
    @VTID(224)
    boolean restrictLinkedStyles();


    /**
     * <p>
     * Setter method for the COM property "RestrictLinkedStyles"
     * </p>
     * @param prop Mandatory boolean parameter.
     */

    @DISPID(474) //= 0x1da. The runtime will prefer the VTID if present
    @VTID(225)
    void restrictLinkedStyles(
      boolean prop);


    /**
     * <p>
     * Getter method for the COM property "OMathAutoCorrect"
     * </p>
     * @return  Returns a value of type word.OMathAutoCorrect
     */

    @DISPID(475) //= 0x1db. The runtime will prefer the VTID if present
    @VTID(226)
    word.OMathAutoCorrect oMathAutoCorrect();


    /**
     * <p>
     * Getter method for the COM property "DisplayDocumentInformationPanel"
     * </p>
     * @return  Returns a value of type boolean
     */

    @DISPID(476) //= 0x1dc. The runtime will prefer the VTID if present
    @VTID(227)
    boolean displayDocumentInformationPanel();


    /**
     * <p>
     * Setter method for the COM property "DisplayDocumentInformationPanel"
     * </p>
     * @param prop Mandatory boolean parameter.
     */

    @DISPID(476) //= 0x1dc. The runtime will prefer the VTID if present
    @VTID(228)
    void displayDocumentInformationPanel(
      boolean prop);


    /**
     * <p>
     * Getter method for the COM property "Assistance"
     * </p>
     * @return  Returns a value of type office.IAssistance
     */

    @DISPID(477) //= 0x1dd. The runtime will prefer the VTID if present
    @VTID(229)
    office.IAssistance assistance();


    /**
     * <p>
     * Getter method for the COM property "OpenAttachmentsInFullScreen"
     * </p>
     * @return  Returns a value of type boolean
     */

    @DISPID(478) //= 0x1de. The runtime will prefer the VTID if present
    @VTID(230)
    boolean openAttachmentsInFullScreen();


    /**
     * <p>
     * Setter method for the COM property "OpenAttachmentsInFullScreen"
     * </p>
     * @param prop Mandatory boolean parameter.
     */

    @DISPID(478) //= 0x1de. The runtime will prefer the VTID if present
    @VTID(231)
    void openAttachmentsInFullScreen(
      boolean prop);


    /**
     * <p>
     * Getter method for the COM property "ActiveEncryptionSession"
     * </p>
     * @return  Returns a value of type int
     */

    @DISPID(479) //= 0x1df. The runtime will prefer the VTID if present
    @VTID(232)
    int activeEncryptionSession();


    /**
     * <p>
     * Getter method for the COM property "DontResetInsertionPointProperties"
     * </p>
     * @return  Returns a value of type boolean
     */

    @DISPID(480) //= 0x1e0. The runtime will prefer the VTID if present
    @VTID(233)
    boolean dontResetInsertionPointProperties();


    /**
     * <p>
     * Setter method for the COM property "DontResetInsertionPointProperties"
     * </p>
     * @param prop Mandatory boolean parameter.
     */

    @DISPID(480) //= 0x1e0. The runtime will prefer the VTID if present
    @VTID(234)
    void dontResetInsertionPointProperties(
      boolean prop);


    /**
     * <p>
     * Getter method for the COM property "SmartArtLayouts"
     * </p>
     * @return  Returns a value of type office.SmartArtLayouts
     */

    @DISPID(481) //= 0x1e1. The runtime will prefer the VTID if present
    @VTID(235)
    office.SmartArtLayouts smartArtLayouts();


    @VTID(235)
    @ReturnValue(defaultPropertyThrough={office.SmartArtLayouts.class})
    office.SmartArtLayout smartArtLayouts(
      @MarshalAs(NativeType.VARIANT) java.lang.Object index);

    /**
     * <p>
     * Getter method for the COM property "SmartArtQuickStyles"
     * </p>
     * @return  Returns a value of type office.SmartArtQuickStyles
     */

    @DISPID(482) //= 0x1e2. The runtime will prefer the VTID if present
    @VTID(236)
    office.SmartArtQuickStyles smartArtQuickStyles();


    @VTID(236)
    @ReturnValue(defaultPropertyThrough={office.SmartArtQuickStyles.class})
    office.SmartArtQuickStyle smartArtQuickStyles(
      @MarshalAs(NativeType.VARIANT) java.lang.Object index);

    /**
     * <p>
     * Getter method for the COM property "SmartArtColors"
     * </p>
     * @return  Returns a value of type office.SmartArtColors
     */

    @DISPID(483) //= 0x1e3. The runtime will prefer the VTID if present
    @VTID(237)
    office.SmartArtColors smartArtColors();


    @VTID(237)
    @ReturnValue(defaultPropertyThrough={office.SmartArtColors.class})
    office.SmartArtColor smartArtColors(
      @MarshalAs(NativeType.VARIANT) java.lang.Object index);

    /**
     * @param localDocument Mandatory word._Document parameter.
     * @param serverDocument Mandatory word._Document parameter.
     * @param baseDocument Mandatory word._Document parameter.
     * @param favorSource Mandatory boolean parameter.
     */

    @DISPID(484) //= 0x1e4. The runtime will prefer the VTID if present
    @VTID(238)
    void threeWayMerge(
      word._Document localDocument,
      word._Document serverDocument,
      word._Document baseDocument,
      boolean favorSource);


    /**
     */

    @DISPID(485) //= 0x1e5. The runtime will prefer the VTID if present
    @VTID(239)
    void dummy4();


    /**
     * <p>
     * Getter method for the COM property "UndoRecord"
     * </p>
     * @return  Returns a value of type word.UndoRecord
     */

    @DISPID(486) //= 0x1e6. The runtime will prefer the VTID if present
    @VTID(240)
    word.UndoRecord undoRecord();


    /**
     * <p>
     * Getter method for the COM property "PickerDialog"
     * </p>
     * @return  Returns a value of type office.PickerDialog
     */

    @DISPID(489) //= 0x1e9. The runtime will prefer the VTID if present
    @VTID(241)
    office.PickerDialog pickerDialog();


    /**
     * <p>
     * Getter method for the COM property "ProtectedViewWindows"
     * </p>
     * @return  Returns a value of type word.ProtectedViewWindows
     */

    @DISPID(490) //= 0x1ea. The runtime will prefer the VTID if present
    @VTID(242)
    word.ProtectedViewWindows protectedViewWindows();


    @VTID(242)
    @ReturnValue(defaultPropertyThrough={word.ProtectedViewWindows.class})
    word.ProtectedViewWindow protectedViewWindows(
      java.lang.Object index);

    /**
     * <p>
     * Getter method for the COM property "ActiveProtectedViewWindow"
     * </p>
     * @return  Returns a value of type word.ProtectedViewWindow
     */

    @DISPID(491) //= 0x1eb. The runtime will prefer the VTID if present
    @VTID(243)
    word.ProtectedViewWindow activeProtectedViewWindow();


    /**
     * <p>
     * Getter method for the COM property "IsSandboxed"
     * </p>
     * @return  Returns a value of type boolean
     */

    @DISPID(492) //= 0x1ec. The runtime will prefer the VTID if present
    @VTID(244)
    boolean isSandboxed();


    /**
     * <p>
     * Getter method for the COM property "FileValidation"
     * </p>
     * @return  Returns a value of type office.MsoFileValidationMode
     */

    @DISPID(493) //= 0x1ed. The runtime will prefer the VTID if present
    @VTID(245)
    office.MsoFileValidationMode fileValidation();


    /**
     * <p>
     * Setter method for the COM property "FileValidation"
     * </p>
     * @param prop Mandatory office.MsoFileValidationMode parameter.
     */

    @DISPID(493) //= 0x1ed. The runtime will prefer the VTID if present
    @VTID(246)
    void fileValidation(
      office.MsoFileValidationMode prop);


    // Properties:
  }
