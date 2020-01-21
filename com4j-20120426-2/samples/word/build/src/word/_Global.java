package word  ;

import com4j.*;

@IID("{000209B9-0000-0000-C000-000000000046}")
public interface _Global extends Com4jObject {
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

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
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

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject wordBasic();


  /**
   * <p>
   * Getter method for the COM property "PrintPreview"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(17)
  boolean printPreview();


  /**
   * <p>
   * Setter method for the COM property "PrintPreview"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(18)
  void printPreview(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "RecentFiles"
   * </p>
   * @return  Returns a value of type word.RecentFiles
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  word.RecentFiles recentFiles();


  @VTID(19)
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
  @VTID(20)
  word.Template normalTemplate();


  /**
   * <p>
   * Getter method for the COM property "System"
   * </p>
   * @return  Returns a value of type word.System
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(21)
  word.System system();


  /**
   * <p>
   * Getter method for the COM property "AutoCorrect"
   * </p>
   * @return  Returns a value of type word.AutoCorrect
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(22)
  word.AutoCorrect autoCorrect();


  /**
   * <p>
   * Getter method for the COM property "FontNames"
   * </p>
   * @return  Returns a value of type word.FontNames
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(23)
  word.FontNames fontNames();


  @VTID(23)
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
  @VTID(24)
  word.FontNames landscapeFontNames();


  @VTID(24)
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
  @VTID(25)
  word.FontNames portraitFontNames();


  @VTID(25)
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
  @VTID(26)
  word.Languages languages();


  @VTID(26)
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
  @VTID(27)
  office.Assistant assistant();


  /**
   * <p>
   * Getter method for the COM property "FileConverters"
   * </p>
   * @return  Returns a value of type word.FileConverters
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(28)
  word.FileConverters fileConverters();


  @VTID(28)
  @ReturnValue(defaultPropertyThrough={word.FileConverters.class})
  word.FileConverter fileConverters(
    java.lang.Object index);

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
   * Getter method for the COM property "Tasks"
   * </p>
   * @return  Returns a value of type word.Tasks
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(33)
  word.Tasks tasks();


  @VTID(33)
  @ReturnValue(defaultPropertyThrough={word.Tasks.class})
  word.Task tasks(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "MacroContainer"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(55) //= 0x37. The runtime will prefer the VTID if present
  @VTID(34)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject macroContainer();


  /**
   * <p>
   * Getter method for the COM property "CommandBars"
   * </p>
   * @return  Returns a value of type office._CommandBars
   */

  @DISPID(57) //= 0x39. The runtime will prefer the VTID if present
  @VTID(35)
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
  @VTID(36)
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
  @VTID(37)
  vba.VBE vbe();


  /**
   * <p>
   * Getter method for the COM property "ListGalleries"
   * </p>
   * @return  Returns a value of type word.ListGalleries
   */

  @DISPID(65) //= 0x41. The runtime will prefer the VTID if present
  @VTID(38)
  word.ListGalleries listGalleries();


  @VTID(38)
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
  @VTID(39)
  java.lang.String activePrinter();


  /**
   * <p>
   * Setter method for the COM property "ActivePrinter"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(66) //= 0x42. The runtime will prefer the VTID if present
  @VTID(40)
  void activePrinter(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Templates"
   * </p>
   * @return  Returns a value of type word.Templates
   */

  @DISPID(67) //= 0x43. The runtime will prefer the VTID if present
  @VTID(41)
  word.Templates templates();


  @VTID(41)
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
  @VTID(42)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject customizationContext();


  /**
   * <p>
   * Setter method for the COM property "CustomizationContext"
   * </p>
   * @param prop Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(68) //= 0x44. The runtime will prefer the VTID if present
  @VTID(43)
  void customizationContext(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject prop);


  /**
   * <p>
   * Getter method for the COM property "KeyBindings"
   * </p>
   * @return  Returns a value of type word.KeyBindings
   */

  @DISPID(69) //= 0x45. The runtime will prefer the VTID if present
  @VTID(44)
  word.KeyBindings keyBindings();


  @VTID(44)
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
  @VTID(45)
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
  @VTID(46)
  word.KeyBinding findKey(
    int keyCode,
    @Optional java.lang.Object keyCode2);


  /**
   * <p>
   * Getter method for the COM property "Options"
   * </p>
   * @return  Returns a value of type word.Options
   */

  @DISPID(93) //= 0x5d. The runtime will prefer the VTID if present
  @VTID(47)
  word.Options options();


  /**
   * <p>
   * Getter method for the COM property "CustomDictionaries"
   * </p>
   * @return  Returns a value of type word.Dictionaries
   */

  @DISPID(95) //= 0x5f. The runtime will prefer the VTID if present
  @VTID(48)
  word.Dictionaries customDictionaries();


  @VTID(48)
  @ReturnValue(defaultPropertyThrough={word.Dictionaries.class})
  word.Dictionary customDictionaries(
    java.lang.Object index);

  /**
   * <p>
   * Setter method for the COM property "StatusBar"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(97) //= 0x61. The runtime will prefer the VTID if present
  @VTID(49)
  void statusBar(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowVisualBasicEditor"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(50)
  boolean showVisualBasicEditor();


  /**
   * <p>
   * Setter method for the COM property "ShowVisualBasicEditor"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(51)
  void showVisualBasicEditor(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "IsObjectValid"
   * </p>
   * @param object Mandatory com4j.Com4jObject parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(52)
  boolean isObjectValid(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject object);


  /**
   * <p>
   * Getter method for the COM property "HangulHanjaDictionaries"
   * </p>
   * @return  Returns a value of type word.HangulHanjaConversionDictionaries
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(53)
  word.HangulHanjaConversionDictionaries hangulHanjaDictionaries();


  @VTID(53)
  @ReturnValue(defaultPropertyThrough={word.HangulHanjaConversionDictionaries.class})
  word.Dictionary hangulHanjaDictionaries(
    java.lang.Object index);

  /**
   * @param times Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(305) //= 0x131. The runtime will prefer the VTID if present
  @VTID(54)
  boolean repeat(
    @Optional java.lang.Object times);


  /**
   * @param channel Mandatory int parameter.
   * @param command Mandatory java.lang.String parameter.
   */

  @DISPID(310) //= 0x136. The runtime will prefer the VTID if present
  @VTID(55)
  void ddeExecute(
    int channel,
    java.lang.String command);


  /**
   * @param app Mandatory java.lang.String parameter.
   * @param topic Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(311) //= 0x137. The runtime will prefer the VTID if present
  @VTID(56)
  int ddeInitiate(
    java.lang.String app,
    java.lang.String topic);


  /**
   * @param channel Mandatory int parameter.
   * @param item Mandatory java.lang.String parameter.
   * @param data Mandatory java.lang.String parameter.
   */

  @DISPID(312) //= 0x138. The runtime will prefer the VTID if present
  @VTID(57)
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
  @VTID(58)
  java.lang.String ddeRequest(
    int channel,
    java.lang.String item);


  /**
   * @param channel Mandatory int parameter.
   */

  @DISPID(314) //= 0x13a. The runtime will prefer the VTID if present
  @VTID(59)
  void ddeTerminate(
    int channel);


  /**
   */

  @DISPID(315) //= 0x13b. The runtime will prefer the VTID if present
  @VTID(60)
  void ddeTerminateAll();


  /**
   * @param arg1 Mandatory word.WdKey parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(316) //= 0x13c. The runtime will prefer the VTID if present
  @VTID(61)
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
  @VTID(62)
  java.lang.String keyString(
    int keyCode,
    @Optional java.lang.Object keyCode2);


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
  @VTID(63)
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
  @VTID(64)
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
   * @param helpType Mandatory java.lang.Object parameter.
   */

  @DISPID(329) //= 0x149. The runtime will prefer the VTID if present
  @VTID(65)
  void help(
    java.lang.Object helpType);


  /**
   * @return  Returns a value of type word.Window
   */

  @DISPID(345) //= 0x159. The runtime will prefer the VTID if present
  @VTID(66)
  word.Window newWindow();


  /**
   * @param string Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(354) //= 0x162. The runtime will prefer the VTID if present
  @VTID(67)
  java.lang.String cleanString(
    java.lang.String string);


  /**
   * @param path Mandatory java.lang.String parameter.
   */

  @DISPID(355) //= 0x163. The runtime will prefer the VTID if present
  @VTID(68)
  void changeFileOpenDirectory(
    java.lang.String path);


  /**
   * @param inches Mandatory float parameter.
   * @return  Returns a value of type float
   */

  @DISPID(370) //= 0x172. The runtime will prefer the VTID if present
  @VTID(69)
  float inchesToPoints(
    float inches);


  /**
   * @param centimeters Mandatory float parameter.
   * @return  Returns a value of type float
   */

  @DISPID(371) //= 0x173. The runtime will prefer the VTID if present
  @VTID(70)
  float centimetersToPoints(
    float centimeters);


  /**
   * @param millimeters Mandatory float parameter.
   * @return  Returns a value of type float
   */

  @DISPID(372) //= 0x174. The runtime will prefer the VTID if present
  @VTID(71)
  float millimetersToPoints(
    float millimeters);


  /**
   * @param picas Mandatory float parameter.
   * @return  Returns a value of type float
   */

  @DISPID(373) //= 0x175. The runtime will prefer the VTID if present
  @VTID(72)
  float picasToPoints(
    float picas);


  /**
   * @param lines Mandatory float parameter.
   * @return  Returns a value of type float
   */

  @DISPID(374) //= 0x176. The runtime will prefer the VTID if present
  @VTID(73)
  float linesToPoints(
    float lines);


  /**
   * @param points Mandatory float parameter.
   * @return  Returns a value of type float
   */

  @DISPID(380) //= 0x17c. The runtime will prefer the VTID if present
  @VTID(74)
  float pointsToInches(
    float points);


  /**
   * @param points Mandatory float parameter.
   * @return  Returns a value of type float
   */

  @DISPID(381) //= 0x17d. The runtime will prefer the VTID if present
  @VTID(75)
  float pointsToCentimeters(
    float points);


  /**
   * @param points Mandatory float parameter.
   * @return  Returns a value of type float
   */

  @DISPID(382) //= 0x17e. The runtime will prefer the VTID if present
  @VTID(76)
  float pointsToMillimeters(
    float points);


  /**
   * @param points Mandatory float parameter.
   * @return  Returns a value of type float
   */

  @DISPID(383) //= 0x17f. The runtime will prefer the VTID if present
  @VTID(77)
  float pointsToPicas(
    float points);


  /**
   * @param points Mandatory float parameter.
   * @return  Returns a value of type float
   */

  @DISPID(384) //= 0x180. The runtime will prefer the VTID if present
  @VTID(78)
  float pointsToLines(
    float points);


  /**
   * @param points Mandatory float parameter.
   * @param fVertical Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type float
   */

  @DISPID(385) //= 0x181. The runtime will prefer the VTID if present
  @VTID(79)
  float pointsToPixels(
    float points,
    @Optional java.lang.Object fVertical);


  /**
   * @param pixels Mandatory float parameter.
   * @param fVertical Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type float
   */

  @DISPID(386) //= 0x182. The runtime will prefer the VTID if present
  @VTID(80)
  float pixelsToPoints(
    float pixels,
    @Optional java.lang.Object fVertical);


  /**
   * <p>
   * Getter method for the COM property "LanguageSettings"
   * </p>
   * @return  Returns a value of type office.LanguageSettings
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(81)
  office.LanguageSettings languageSettings();


  /**
   * <p>
   * Getter method for the COM property "AnswerWizard"
   * </p>
   * @return  Returns a value of type office.AnswerWizard
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(82)
  office.AnswerWizard answerWizard();


  /**
   * <p>
   * Getter method for the COM property "AutoCorrectEmail"
   * </p>
   * @return  Returns a value of type word.AutoCorrect
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(83)
  word.AutoCorrect autoCorrectEmail();


  /**
   * <p>
   * Getter method for the COM property "ProtectedViewWindows"
   * </p>
   * @return  Returns a value of type word.ProtectedViewWindows
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(84)
  word.ProtectedViewWindows protectedViewWindows();


  @VTID(84)
  @ReturnValue(defaultPropertyThrough={word.ProtectedViewWindows.class})
  word.ProtectedViewWindow protectedViewWindows(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "ActiveProtectedViewWindow"
   * </p>
   * @return  Returns a value of type word.ProtectedViewWindow
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(85)
  word.ProtectedViewWindow activeProtectedViewWindow();


  /**
   * <p>
   * Getter method for the COM property "IsSandboxed"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(86)
  boolean isSandboxed();


  // Properties:
}
