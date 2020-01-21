package word  ;

import com4j.*;

@IID("{000209B7-0000-0000-C000-000000000046}")
public interface Options extends Com4jObject {
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
   * Getter method for the COM property "AllowAccentedUppercase"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  boolean allowAccentedUppercase();


  /**
   * <p>
   * Setter method for the COM property "AllowAccentedUppercase"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  void allowAccentedUppercase(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "WPHelp"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(12)
  boolean wpHelp();


  /**
   * <p>
   * Setter method for the COM property "WPHelp"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(13)
  void wpHelp(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "WPDocNavKeys"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(14)
  boolean wpDocNavKeys();


  /**
   * <p>
   * Setter method for the COM property "WPDocNavKeys"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(15)
  void wpDocNavKeys(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Pagination"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(16)
  boolean pagination();


  /**
   * <p>
   * Setter method for the COM property "Pagination"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(17)
  void pagination(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "BlueScreen"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(18)
  boolean blueScreen();


  /**
   * <p>
   * Setter method for the COM property "BlueScreen"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(19)
  void blueScreen(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "EnableSound"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(20)
  boolean enableSound();


  /**
   * <p>
   * Setter method for the COM property "EnableSound"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(21)
  void enableSound(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ConfirmConversions"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(22)
  boolean confirmConversions();


  /**
   * <p>
   * Setter method for the COM property "ConfirmConversions"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(23)
  void confirmConversions(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "UpdateLinksAtOpen"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(24)
  boolean updateLinksAtOpen();


  /**
   * <p>
   * Setter method for the COM property "UpdateLinksAtOpen"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(25)
  void updateLinksAtOpen(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SendMailAttach"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(26)
  boolean sendMailAttach();


  /**
   * <p>
   * Setter method for the COM property "SendMailAttach"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(27)
  void sendMailAttach(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MeasurementUnit"
   * </p>
   * @return  Returns a value of type word.WdMeasurementUnits
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(28)
  word.WdMeasurementUnits measurementUnit();


  /**
   * <p>
   * Setter method for the COM property "MeasurementUnit"
   * </p>
   * @param prop Mandatory word.WdMeasurementUnits parameter.
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(29)
  void measurementUnit(
    word.WdMeasurementUnits prop);


  /**
   * <p>
   * Getter method for the COM property "ButtonFieldClicks"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(30)
  int buttonFieldClicks();


  /**
   * <p>
   * Setter method for the COM property "ButtonFieldClicks"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(31)
  void buttonFieldClicks(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "ShortMenuNames"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(32)
  boolean shortMenuNames();


  /**
   * <p>
   * Setter method for the COM property "ShortMenuNames"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(33)
  void shortMenuNames(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "RTFInClipboard"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(34)
  boolean rtfInClipboard();


  /**
   * <p>
   * Setter method for the COM property "RTFInClipboard"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(35)
  void rtfInClipboard(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "UpdateFieldsAtPrint"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(36)
  boolean updateFieldsAtPrint();


  /**
   * <p>
   * Setter method for the COM property "UpdateFieldsAtPrint"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(37)
  void updateFieldsAtPrint(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PrintProperties"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(38)
  boolean printProperties();


  /**
   * <p>
   * Setter method for the COM property "PrintProperties"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(39)
  void printProperties(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PrintFieldCodes"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(40)
  boolean printFieldCodes();


  /**
   * <p>
   * Setter method for the COM property "PrintFieldCodes"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(41)
  void printFieldCodes(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PrintComments"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(42)
  boolean printComments();


  /**
   * <p>
   * Setter method for the COM property "PrintComments"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(43)
  void printComments(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PrintHiddenText"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(44)
  boolean printHiddenText();


  /**
   * <p>
   * Setter method for the COM property "PrintHiddenText"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(45)
  void printHiddenText(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "EnvelopeFeederInstalled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(46)
  boolean envelopeFeederInstalled();


  /**
   * <p>
   * Getter method for the COM property "UpdateLinksAtPrint"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(47)
  boolean updateLinksAtPrint();


  /**
   * <p>
   * Setter method for the COM property "UpdateLinksAtPrint"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(48)
  void updateLinksAtPrint(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PrintBackground"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(49)
  boolean printBackground();


  /**
   * <p>
   * Setter method for the COM property "PrintBackground"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(50)
  void printBackground(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PrintDrawingObjects"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(51)
  boolean printDrawingObjects();


  /**
   * <p>
   * Setter method for the COM property "PrintDrawingObjects"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(52)
  void printDrawingObjects(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "DefaultTray"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
  @VTID(53)
  java.lang.String defaultTray();


  /**
   * <p>
   * Setter method for the COM property "DefaultTray"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
  @VTID(54)
  void defaultTray(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "DefaultTrayID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(55)
  int defaultTrayID();


  /**
   * <p>
   * Setter method for the COM property "DefaultTrayID"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(56)
  void defaultTrayID(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "CreateBackup"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
  @VTID(57)
  boolean createBackup();


  /**
   * <p>
   * Setter method for the COM property "CreateBackup"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
  @VTID(58)
  void createBackup(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AllowFastSave"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
  @VTID(59)
  boolean allowFastSave();


  /**
   * <p>
   * Setter method for the COM property "AllowFastSave"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
  @VTID(60)
  void allowFastSave(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SavePropertiesPrompt"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(43) //= 0x2b. The runtime will prefer the VTID if present
  @VTID(61)
  boolean savePropertiesPrompt();


  /**
   * <p>
   * Setter method for the COM property "SavePropertiesPrompt"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(43) //= 0x2b. The runtime will prefer the VTID if present
  @VTID(62)
  void savePropertiesPrompt(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SaveNormalPrompt"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(44) //= 0x2c. The runtime will prefer the VTID if present
  @VTID(63)
  boolean saveNormalPrompt();


  /**
   * <p>
   * Setter method for the COM property "SaveNormalPrompt"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(44) //= 0x2c. The runtime will prefer the VTID if present
  @VTID(64)
  void saveNormalPrompt(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SaveInterval"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(45) //= 0x2d. The runtime will prefer the VTID if present
  @VTID(65)
  int saveInterval();


  /**
   * <p>
   * Setter method for the COM property "SaveInterval"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(45) //= 0x2d. The runtime will prefer the VTID if present
  @VTID(66)
  void saveInterval(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "BackgroundSave"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(46) //= 0x2e. The runtime will prefer the VTID if present
  @VTID(67)
  boolean backgroundSave();


  /**
   * <p>
   * Setter method for the COM property "BackgroundSave"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(46) //= 0x2e. The runtime will prefer the VTID if present
  @VTID(68)
  void backgroundSave(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "InsertedTextMark"
   * </p>
   * @return  Returns a value of type word.WdInsertedTextMark
   */

  @DISPID(57) //= 0x39. The runtime will prefer the VTID if present
  @VTID(69)
  word.WdInsertedTextMark insertedTextMark();


  /**
   * <p>
   * Setter method for the COM property "InsertedTextMark"
   * </p>
   * @param prop Mandatory word.WdInsertedTextMark parameter.
   */

  @DISPID(57) //= 0x39. The runtime will prefer the VTID if present
  @VTID(70)
  void insertedTextMark(
    word.WdInsertedTextMark prop);


  /**
   * <p>
   * Getter method for the COM property "DeletedTextMark"
   * </p>
   * @return  Returns a value of type word.WdDeletedTextMark
   */

  @DISPID(58) //= 0x3a. The runtime will prefer the VTID if present
  @VTID(71)
  word.WdDeletedTextMark deletedTextMark();


  /**
   * <p>
   * Setter method for the COM property "DeletedTextMark"
   * </p>
   * @param prop Mandatory word.WdDeletedTextMark parameter.
   */

  @DISPID(58) //= 0x3a. The runtime will prefer the VTID if present
  @VTID(72)
  void deletedTextMark(
    word.WdDeletedTextMark prop);


  /**
   * <p>
   * Getter method for the COM property "RevisedLinesMark"
   * </p>
   * @return  Returns a value of type word.WdRevisedLinesMark
   */

  @DISPID(59) //= 0x3b. The runtime will prefer the VTID if present
  @VTID(73)
  word.WdRevisedLinesMark revisedLinesMark();


  /**
   * <p>
   * Setter method for the COM property "RevisedLinesMark"
   * </p>
   * @param prop Mandatory word.WdRevisedLinesMark parameter.
   */

  @DISPID(59) //= 0x3b. The runtime will prefer the VTID if present
  @VTID(74)
  void revisedLinesMark(
    word.WdRevisedLinesMark prop);


  /**
   * <p>
   * Getter method for the COM property "InsertedTextColor"
   * </p>
   * @return  Returns a value of type word.WdColorIndex
   */

  @DISPID(60) //= 0x3c. The runtime will prefer the VTID if present
  @VTID(75)
  word.WdColorIndex insertedTextColor();


  /**
   * <p>
   * Setter method for the COM property "InsertedTextColor"
   * </p>
   * @param prop Mandatory word.WdColorIndex parameter.
   */

  @DISPID(60) //= 0x3c. The runtime will prefer the VTID if present
  @VTID(76)
  void insertedTextColor(
    word.WdColorIndex prop);


  /**
   * <p>
   * Getter method for the COM property "DeletedTextColor"
   * </p>
   * @return  Returns a value of type word.WdColorIndex
   */

  @DISPID(61) //= 0x3d. The runtime will prefer the VTID if present
  @VTID(77)
  word.WdColorIndex deletedTextColor();


  /**
   * <p>
   * Setter method for the COM property "DeletedTextColor"
   * </p>
   * @param prop Mandatory word.WdColorIndex parameter.
   */

  @DISPID(61) //= 0x3d. The runtime will prefer the VTID if present
  @VTID(78)
  void deletedTextColor(
    word.WdColorIndex prop);


  /**
   * <p>
   * Getter method for the COM property "RevisedLinesColor"
   * </p>
   * @return  Returns a value of type word.WdColorIndex
   */

  @DISPID(62) //= 0x3e. The runtime will prefer the VTID if present
  @VTID(79)
  word.WdColorIndex revisedLinesColor();


  /**
   * <p>
   * Setter method for the COM property "RevisedLinesColor"
   * </p>
   * @param prop Mandatory word.WdColorIndex parameter.
   */

  @DISPID(62) //= 0x3e. The runtime will prefer the VTID if present
  @VTID(80)
  void revisedLinesColor(
    word.WdColorIndex prop);


  /**
   * <p>
   * Getter method for the COM property "DefaultFilePath"
   * </p>
   * @param path Mandatory word.WdDefaultFilePath parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(65) //= 0x41. The runtime will prefer the VTID if present
  @VTID(81)
  java.lang.String defaultFilePath(
    word.WdDefaultFilePath path);


  /**
   * <p>
   * Setter method for the COM property "DefaultFilePath"
   * </p>
   * @param path Mandatory word.WdDefaultFilePath parameter.
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(65) //= 0x41. The runtime will prefer the VTID if present
  @VTID(82)
  void defaultFilePath(
    word.WdDefaultFilePath path,
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Overtype"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(66) //= 0x42. The runtime will prefer the VTID if present
  @VTID(83)
  boolean overtype();


  /**
   * <p>
   * Setter method for the COM property "Overtype"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(66) //= 0x42. The runtime will prefer the VTID if present
  @VTID(84)
  void overtype(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ReplaceSelection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(67) //= 0x43. The runtime will prefer the VTID if present
  @VTID(85)
  boolean replaceSelection();


  /**
   * <p>
   * Setter method for the COM property "ReplaceSelection"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(67) //= 0x43. The runtime will prefer the VTID if present
  @VTID(86)
  void replaceSelection(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AllowDragAndDrop"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(68) //= 0x44. The runtime will prefer the VTID if present
  @VTID(87)
  boolean allowDragAndDrop();


  /**
   * <p>
   * Setter method for the COM property "AllowDragAndDrop"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(68) //= 0x44. The runtime will prefer the VTID if present
  @VTID(88)
  void allowDragAndDrop(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoWordSelection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(69) //= 0x45. The runtime will prefer the VTID if present
  @VTID(89)
  boolean autoWordSelection();


  /**
   * <p>
   * Setter method for the COM property "AutoWordSelection"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(69) //= 0x45. The runtime will prefer the VTID if present
  @VTID(90)
  void autoWordSelection(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "INSKeyForPaste"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(70) //= 0x46. The runtime will prefer the VTID if present
  @VTID(91)
  boolean insKeyForPaste();


  /**
   * <p>
   * Setter method for the COM property "INSKeyForPaste"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(70) //= 0x46. The runtime will prefer the VTID if present
  @VTID(92)
  void insKeyForPaste(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SmartCutPaste"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(71) //= 0x47. The runtime will prefer the VTID if present
  @VTID(93)
  boolean smartCutPaste();


  /**
   * <p>
   * Setter method for the COM property "SmartCutPaste"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(71) //= 0x47. The runtime will prefer the VTID if present
  @VTID(94)
  void smartCutPaste(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "TabIndentKey"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(72) //= 0x48. The runtime will prefer the VTID if present
  @VTID(95)
  boolean tabIndentKey();


  /**
   * <p>
   * Setter method for the COM property "TabIndentKey"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(72) //= 0x48. The runtime will prefer the VTID if present
  @VTID(96)
  void tabIndentKey(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PictureEditor"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(73) //= 0x49. The runtime will prefer the VTID if present
  @VTID(97)
  java.lang.String pictureEditor();


  /**
   * <p>
   * Setter method for the COM property "PictureEditor"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(73) //= 0x49. The runtime will prefer the VTID if present
  @VTID(98)
  void pictureEditor(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "AnimateScreenMovements"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(74) //= 0x4a. The runtime will prefer the VTID if present
  @VTID(99)
  boolean animateScreenMovements();


  /**
   * <p>
   * Setter method for the COM property "AnimateScreenMovements"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(74) //= 0x4a. The runtime will prefer the VTID if present
  @VTID(100)
  void animateScreenMovements(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "VirusProtection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(75) //= 0x4b. The runtime will prefer the VTID if present
  @VTID(101)
  boolean virusProtection();


  /**
   * <p>
   * Setter method for the COM property "VirusProtection"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(75) //= 0x4b. The runtime will prefer the VTID if present
  @VTID(102)
  void virusProtection(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "RevisedPropertiesMark"
   * </p>
   * @return  Returns a value of type word.WdRevisedPropertiesMark
   */

  @DISPID(76) //= 0x4c. The runtime will prefer the VTID if present
  @VTID(103)
  word.WdRevisedPropertiesMark revisedPropertiesMark();


  /**
   * <p>
   * Setter method for the COM property "RevisedPropertiesMark"
   * </p>
   * @param prop Mandatory word.WdRevisedPropertiesMark parameter.
   */

  @DISPID(76) //= 0x4c. The runtime will prefer the VTID if present
  @VTID(104)
  void revisedPropertiesMark(
    word.WdRevisedPropertiesMark prop);


  /**
   * <p>
   * Getter method for the COM property "RevisedPropertiesColor"
   * </p>
   * @return  Returns a value of type word.WdColorIndex
   */

  @DISPID(77) //= 0x4d. The runtime will prefer the VTID if present
  @VTID(105)
  word.WdColorIndex revisedPropertiesColor();


  /**
   * <p>
   * Setter method for the COM property "RevisedPropertiesColor"
   * </p>
   * @param prop Mandatory word.WdColorIndex parameter.
   */

  @DISPID(77) //= 0x4d. The runtime will prefer the VTID if present
  @VTID(106)
  void revisedPropertiesColor(
    word.WdColorIndex prop);


  /**
   * <p>
   * Getter method for the COM property "SnapToGrid"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(79) //= 0x4f. The runtime will prefer the VTID if present
  @VTID(107)
  boolean snapToGrid();


  /**
   * <p>
   * Setter method for the COM property "SnapToGrid"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(79) //= 0x4f. The runtime will prefer the VTID if present
  @VTID(108)
  void snapToGrid(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SnapToShapes"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(80) //= 0x50. The runtime will prefer the VTID if present
  @VTID(109)
  boolean snapToShapes();


  /**
   * <p>
   * Setter method for the COM property "SnapToShapes"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(80) //= 0x50. The runtime will prefer the VTID if present
  @VTID(110)
  void snapToShapes(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "GridDistanceHorizontal"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
  @VTID(111)
  float gridDistanceHorizontal();


  /**
   * <p>
   * Setter method for the COM property "GridDistanceHorizontal"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
  @VTID(112)
  void gridDistanceHorizontal(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "GridDistanceVertical"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(82) //= 0x52. The runtime will prefer the VTID if present
  @VTID(113)
  float gridDistanceVertical();


  /**
   * <p>
   * Setter method for the COM property "GridDistanceVertical"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(82) //= 0x52. The runtime will prefer the VTID if present
  @VTID(114)
  void gridDistanceVertical(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "GridOriginHorizontal"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(83) //= 0x53. The runtime will prefer the VTID if present
  @VTID(115)
  float gridOriginHorizontal();


  /**
   * <p>
   * Setter method for the COM property "GridOriginHorizontal"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(83) //= 0x53. The runtime will prefer the VTID if present
  @VTID(116)
  void gridOriginHorizontal(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "GridOriginVertical"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(84) //= 0x54. The runtime will prefer the VTID if present
  @VTID(117)
  float gridOriginVertical();


  /**
   * <p>
   * Setter method for the COM property "GridOriginVertical"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(84) //= 0x54. The runtime will prefer the VTID if present
  @VTID(118)
  void gridOriginVertical(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "InlineConversion"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(86) //= 0x56. The runtime will prefer the VTID if present
  @VTID(119)
  boolean inlineConversion();


  /**
   * <p>
   * Setter method for the COM property "InlineConversion"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(86) //= 0x56. The runtime will prefer the VTID if present
  @VTID(120)
  void inlineConversion(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "IMEAutomaticControl"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(87) //= 0x57. The runtime will prefer the VTID if present
  @VTID(121)
  boolean imeAutomaticControl();


  /**
   * <p>
   * Setter method for the COM property "IMEAutomaticControl"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(87) //= 0x57. The runtime will prefer the VTID if present
  @VTID(122)
  void imeAutomaticControl(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatApplyHeadings"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(250) //= 0xfa. The runtime will prefer the VTID if present
  @VTID(123)
  boolean autoFormatApplyHeadings();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatApplyHeadings"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(250) //= 0xfa. The runtime will prefer the VTID if present
  @VTID(124)
  void autoFormatApplyHeadings(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatApplyLists"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(251) //= 0xfb. The runtime will prefer the VTID if present
  @VTID(125)
  boolean autoFormatApplyLists();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatApplyLists"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(251) //= 0xfb. The runtime will prefer the VTID if present
  @VTID(126)
  void autoFormatApplyLists(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatApplyBulletedLists"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(252) //= 0xfc. The runtime will prefer the VTID if present
  @VTID(127)
  boolean autoFormatApplyBulletedLists();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatApplyBulletedLists"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(252) //= 0xfc. The runtime will prefer the VTID if present
  @VTID(128)
  void autoFormatApplyBulletedLists(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatApplyOtherParas"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(253) //= 0xfd. The runtime will prefer the VTID if present
  @VTID(129)
  boolean autoFormatApplyOtherParas();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatApplyOtherParas"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(253) //= 0xfd. The runtime will prefer the VTID if present
  @VTID(130)
  void autoFormatApplyOtherParas(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatReplaceQuotes"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(254) //= 0xfe. The runtime will prefer the VTID if present
  @VTID(131)
  boolean autoFormatReplaceQuotes();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatReplaceQuotes"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(254) //= 0xfe. The runtime will prefer the VTID if present
  @VTID(132)
  void autoFormatReplaceQuotes(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatReplaceSymbols"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(255) //= 0xff. The runtime will prefer the VTID if present
  @VTID(133)
  boolean autoFormatReplaceSymbols();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatReplaceSymbols"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(255) //= 0xff. The runtime will prefer the VTID if present
  @VTID(134)
  void autoFormatReplaceSymbols(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatReplaceOrdinals"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(256) //= 0x100. The runtime will prefer the VTID if present
  @VTID(135)
  boolean autoFormatReplaceOrdinals();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatReplaceOrdinals"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(256) //= 0x100. The runtime will prefer the VTID if present
  @VTID(136)
  void autoFormatReplaceOrdinals(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatReplaceFractions"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(257) //= 0x101. The runtime will prefer the VTID if present
  @VTID(137)
  boolean autoFormatReplaceFractions();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatReplaceFractions"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(257) //= 0x101. The runtime will prefer the VTID if present
  @VTID(138)
  void autoFormatReplaceFractions(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatReplacePlainTextEmphasis"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(258) //= 0x102. The runtime will prefer the VTID if present
  @VTID(139)
  boolean autoFormatReplacePlainTextEmphasis();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatReplacePlainTextEmphasis"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(258) //= 0x102. The runtime will prefer the VTID if present
  @VTID(140)
  void autoFormatReplacePlainTextEmphasis(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatPreserveStyles"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(259) //= 0x103. The runtime will prefer the VTID if present
  @VTID(141)
  boolean autoFormatPreserveStyles();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatPreserveStyles"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(259) //= 0x103. The runtime will prefer the VTID if present
  @VTID(142)
  void autoFormatPreserveStyles(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeApplyHeadings"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(260) //= 0x104. The runtime will prefer the VTID if present
  @VTID(143)
  boolean autoFormatAsYouTypeApplyHeadings();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeApplyHeadings"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(260) //= 0x104. The runtime will prefer the VTID if present
  @VTID(144)
  void autoFormatAsYouTypeApplyHeadings(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeApplyBorders"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(261) //= 0x105. The runtime will prefer the VTID if present
  @VTID(145)
  boolean autoFormatAsYouTypeApplyBorders();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeApplyBorders"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(261) //= 0x105. The runtime will prefer the VTID if present
  @VTID(146)
  void autoFormatAsYouTypeApplyBorders(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeApplyBulletedLists"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(262) //= 0x106. The runtime will prefer the VTID if present
  @VTID(147)
  boolean autoFormatAsYouTypeApplyBulletedLists();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeApplyBulletedLists"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(262) //= 0x106. The runtime will prefer the VTID if present
  @VTID(148)
  void autoFormatAsYouTypeApplyBulletedLists(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeApplyNumberedLists"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(263) //= 0x107. The runtime will prefer the VTID if present
  @VTID(149)
  boolean autoFormatAsYouTypeApplyNumberedLists();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeApplyNumberedLists"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(263) //= 0x107. The runtime will prefer the VTID if present
  @VTID(150)
  void autoFormatAsYouTypeApplyNumberedLists(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeReplaceQuotes"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(264) //= 0x108. The runtime will prefer the VTID if present
  @VTID(151)
  boolean autoFormatAsYouTypeReplaceQuotes();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeReplaceQuotes"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(264) //= 0x108. The runtime will prefer the VTID if present
  @VTID(152)
  void autoFormatAsYouTypeReplaceQuotes(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeReplaceSymbols"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(265) //= 0x109. The runtime will prefer the VTID if present
  @VTID(153)
  boolean autoFormatAsYouTypeReplaceSymbols();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeReplaceSymbols"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(265) //= 0x109. The runtime will prefer the VTID if present
  @VTID(154)
  void autoFormatAsYouTypeReplaceSymbols(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeReplaceOrdinals"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(266) //= 0x10a. The runtime will prefer the VTID if present
  @VTID(155)
  boolean autoFormatAsYouTypeReplaceOrdinals();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeReplaceOrdinals"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(266) //= 0x10a. The runtime will prefer the VTID if present
  @VTID(156)
  void autoFormatAsYouTypeReplaceOrdinals(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeReplaceFractions"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(267) //= 0x10b. The runtime will prefer the VTID if present
  @VTID(157)
  boolean autoFormatAsYouTypeReplaceFractions();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeReplaceFractions"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(267) //= 0x10b. The runtime will prefer the VTID if present
  @VTID(158)
  void autoFormatAsYouTypeReplaceFractions(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeReplacePlainTextEmphasis"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(268) //= 0x10c. The runtime will prefer the VTID if present
  @VTID(159)
  boolean autoFormatAsYouTypeReplacePlainTextEmphasis();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeReplacePlainTextEmphasis"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(268) //= 0x10c. The runtime will prefer the VTID if present
  @VTID(160)
  void autoFormatAsYouTypeReplacePlainTextEmphasis(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeFormatListItemBeginning"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(269) //= 0x10d. The runtime will prefer the VTID if present
  @VTID(161)
  boolean autoFormatAsYouTypeFormatListItemBeginning();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeFormatListItemBeginning"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(269) //= 0x10d. The runtime will prefer the VTID if present
  @VTID(162)
  void autoFormatAsYouTypeFormatListItemBeginning(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeDefineStyles"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(270) //= 0x10e. The runtime will prefer the VTID if present
  @VTID(163)
  boolean autoFormatAsYouTypeDefineStyles();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeDefineStyles"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(270) //= 0x10e. The runtime will prefer the VTID if present
  @VTID(164)
  void autoFormatAsYouTypeDefineStyles(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatPlainTextWordMail"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(271) //= 0x10f. The runtime will prefer the VTID if present
  @VTID(165)
  boolean autoFormatPlainTextWordMail();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatPlainTextWordMail"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(271) //= 0x10f. The runtime will prefer the VTID if present
  @VTID(166)
  void autoFormatPlainTextWordMail(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeReplaceHyperlinks"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(272) //= 0x110. The runtime will prefer the VTID if present
  @VTID(167)
  boolean autoFormatAsYouTypeReplaceHyperlinks();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeReplaceHyperlinks"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(272) //= 0x110. The runtime will prefer the VTID if present
  @VTID(168)
  void autoFormatAsYouTypeReplaceHyperlinks(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatReplaceHyperlinks"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(273) //= 0x111. The runtime will prefer the VTID if present
  @VTID(169)
  boolean autoFormatReplaceHyperlinks();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatReplaceHyperlinks"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(273) //= 0x111. The runtime will prefer the VTID if present
  @VTID(170)
  void autoFormatReplaceHyperlinks(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "DefaultHighlightColorIndex"
   * </p>
   * @return  Returns a value of type word.WdColorIndex
   */

  @DISPID(274) //= 0x112. The runtime will prefer the VTID if present
  @VTID(171)
  word.WdColorIndex defaultHighlightColorIndex();


  /**
   * <p>
   * Setter method for the COM property "DefaultHighlightColorIndex"
   * </p>
   * @param prop Mandatory word.WdColorIndex parameter.
   */

  @DISPID(274) //= 0x112. The runtime will prefer the VTID if present
  @VTID(172)
  void defaultHighlightColorIndex(
    word.WdColorIndex prop);


  /**
   * <p>
   * Getter method for the COM property "DefaultBorderLineStyle"
   * </p>
   * @return  Returns a value of type word.WdLineStyle
   */

  @DISPID(275) //= 0x113. The runtime will prefer the VTID if present
  @VTID(173)
  word.WdLineStyle defaultBorderLineStyle();


  /**
   * <p>
   * Setter method for the COM property "DefaultBorderLineStyle"
   * </p>
   * @param prop Mandatory word.WdLineStyle parameter.
   */

  @DISPID(275) //= 0x113. The runtime will prefer the VTID if present
  @VTID(174)
  void defaultBorderLineStyle(
    word.WdLineStyle prop);


  /**
   * <p>
   * Getter method for the COM property "CheckSpellingAsYouType"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(276) //= 0x114. The runtime will prefer the VTID if present
  @VTID(175)
  boolean checkSpellingAsYouType();


  /**
   * <p>
   * Setter method for the COM property "CheckSpellingAsYouType"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(276) //= 0x114. The runtime will prefer the VTID if present
  @VTID(176)
  void checkSpellingAsYouType(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "CheckGrammarAsYouType"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(277) //= 0x115. The runtime will prefer the VTID if present
  @VTID(177)
  boolean checkGrammarAsYouType();


  /**
   * <p>
   * Setter method for the COM property "CheckGrammarAsYouType"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(277) //= 0x115. The runtime will prefer the VTID if present
  @VTID(178)
  void checkGrammarAsYouType(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "IgnoreInternetAndFileAddresses"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(278) //= 0x116. The runtime will prefer the VTID if present
  @VTID(179)
  boolean ignoreInternetAndFileAddresses();


  /**
   * <p>
   * Setter method for the COM property "IgnoreInternetAndFileAddresses"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(278) //= 0x116. The runtime will prefer the VTID if present
  @VTID(180)
  void ignoreInternetAndFileAddresses(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowReadabilityStatistics"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(279) //= 0x117. The runtime will prefer the VTID if present
  @VTID(181)
  boolean showReadabilityStatistics();


  /**
   * <p>
   * Setter method for the COM property "ShowReadabilityStatistics"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(279) //= 0x117. The runtime will prefer the VTID if present
  @VTID(182)
  void showReadabilityStatistics(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "IgnoreUppercase"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(280) //= 0x118. The runtime will prefer the VTID if present
  @VTID(183)
  boolean ignoreUppercase();


  /**
   * <p>
   * Setter method for the COM property "IgnoreUppercase"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(280) //= 0x118. The runtime will prefer the VTID if present
  @VTID(184)
  void ignoreUppercase(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "IgnoreMixedDigits"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(281) //= 0x119. The runtime will prefer the VTID if present
  @VTID(185)
  boolean ignoreMixedDigits();


  /**
   * <p>
   * Setter method for the COM property "IgnoreMixedDigits"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(281) //= 0x119. The runtime will prefer the VTID if present
  @VTID(186)
  void ignoreMixedDigits(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SuggestFromMainDictionaryOnly"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(282) //= 0x11a. The runtime will prefer the VTID if present
  @VTID(187)
  boolean suggestFromMainDictionaryOnly();


  /**
   * <p>
   * Setter method for the COM property "SuggestFromMainDictionaryOnly"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(282) //= 0x11a. The runtime will prefer the VTID if present
  @VTID(188)
  void suggestFromMainDictionaryOnly(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SuggestSpellingCorrections"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(283) //= 0x11b. The runtime will prefer the VTID if present
  @VTID(189)
  boolean suggestSpellingCorrections();


  /**
   * <p>
   * Setter method for the COM property "SuggestSpellingCorrections"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(283) //= 0x11b. The runtime will prefer the VTID if present
  @VTID(190)
  void suggestSpellingCorrections(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "DefaultBorderLineWidth"
   * </p>
   * @return  Returns a value of type word.WdLineWidth
   */

  @DISPID(284) //= 0x11c. The runtime will prefer the VTID if present
  @VTID(191)
  word.WdLineWidth defaultBorderLineWidth();


  /**
   * <p>
   * Setter method for the COM property "DefaultBorderLineWidth"
   * </p>
   * @param prop Mandatory word.WdLineWidth parameter.
   */

  @DISPID(284) //= 0x11c. The runtime will prefer the VTID if present
  @VTID(192)
  void defaultBorderLineWidth(
    word.WdLineWidth prop);


  /**
   * <p>
   * Getter method for the COM property "CheckGrammarWithSpelling"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(285) //= 0x11d. The runtime will prefer the VTID if present
  @VTID(193)
  boolean checkGrammarWithSpelling();


  /**
   * <p>
   * Setter method for the COM property "CheckGrammarWithSpelling"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(285) //= 0x11d. The runtime will prefer the VTID if present
  @VTID(194)
  void checkGrammarWithSpelling(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "DefaultOpenFormat"
   * </p>
   * @return  Returns a value of type word.WdOpenFormat
   */

  @DISPID(286) //= 0x11e. The runtime will prefer the VTID if present
  @VTID(195)
  word.WdOpenFormat defaultOpenFormat();


  /**
   * <p>
   * Setter method for the COM property "DefaultOpenFormat"
   * </p>
   * @param prop Mandatory word.WdOpenFormat parameter.
   */

  @DISPID(286) //= 0x11e. The runtime will prefer the VTID if present
  @VTID(196)
  void defaultOpenFormat(
    word.WdOpenFormat prop);


  /**
   * <p>
   * Getter method for the COM property "PrintDraft"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(287) //= 0x11f. The runtime will prefer the VTID if present
  @VTID(197)
  boolean printDraft();


  /**
   * <p>
   * Setter method for the COM property "PrintDraft"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(287) //= 0x11f. The runtime will prefer the VTID if present
  @VTID(198)
  void printDraft(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PrintReverse"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(288) //= 0x120. The runtime will prefer the VTID if present
  @VTID(199)
  boolean printReverse();


  /**
   * <p>
   * Setter method for the COM property "PrintReverse"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(288) //= 0x120. The runtime will prefer the VTID if present
  @VTID(200)
  void printReverse(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MapPaperSize"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(289) //= 0x121. The runtime will prefer the VTID if present
  @VTID(201)
  boolean mapPaperSize();


  /**
   * <p>
   * Setter method for the COM property "MapPaperSize"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(289) //= 0x121. The runtime will prefer the VTID if present
  @VTID(202)
  void mapPaperSize(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeApplyTables"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(290) //= 0x122. The runtime will prefer the VTID if present
  @VTID(203)
  boolean autoFormatAsYouTypeApplyTables();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeApplyTables"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(290) //= 0x122. The runtime will prefer the VTID if present
  @VTID(204)
  void autoFormatAsYouTypeApplyTables(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatApplyFirstIndents"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(291) //= 0x123. The runtime will prefer the VTID if present
  @VTID(205)
  boolean autoFormatApplyFirstIndents();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatApplyFirstIndents"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(291) //= 0x123. The runtime will prefer the VTID if present
  @VTID(206)
  void autoFormatApplyFirstIndents(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatMatchParentheses"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(294) //= 0x126. The runtime will prefer the VTID if present
  @VTID(207)
  boolean autoFormatMatchParentheses();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatMatchParentheses"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(294) //= 0x126. The runtime will prefer the VTID if present
  @VTID(208)
  void autoFormatMatchParentheses(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatReplaceFarEastDashes"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(295) //= 0x127. The runtime will prefer the VTID if present
  @VTID(209)
  boolean autoFormatReplaceFarEastDashes();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatReplaceFarEastDashes"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(295) //= 0x127. The runtime will prefer the VTID if present
  @VTID(210)
  void autoFormatReplaceFarEastDashes(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatDeleteAutoSpaces"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(296) //= 0x128. The runtime will prefer the VTID if present
  @VTID(211)
  boolean autoFormatDeleteAutoSpaces();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatDeleteAutoSpaces"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(296) //= 0x128. The runtime will prefer the VTID if present
  @VTID(212)
  void autoFormatDeleteAutoSpaces(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeApplyFirstIndents"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(297) //= 0x129. The runtime will prefer the VTID if present
  @VTID(213)
  boolean autoFormatAsYouTypeApplyFirstIndents();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeApplyFirstIndents"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(297) //= 0x129. The runtime will prefer the VTID if present
  @VTID(214)
  void autoFormatAsYouTypeApplyFirstIndents(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeApplyDates"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(298) //= 0x12a. The runtime will prefer the VTID if present
  @VTID(215)
  boolean autoFormatAsYouTypeApplyDates();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeApplyDates"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(298) //= 0x12a. The runtime will prefer the VTID if present
  @VTID(216)
  void autoFormatAsYouTypeApplyDates(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeApplyClosings"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(299) //= 0x12b. The runtime will prefer the VTID if present
  @VTID(217)
  boolean autoFormatAsYouTypeApplyClosings();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeApplyClosings"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(299) //= 0x12b. The runtime will prefer the VTID if present
  @VTID(218)
  void autoFormatAsYouTypeApplyClosings(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeMatchParentheses"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(300) //= 0x12c. The runtime will prefer the VTID if present
  @VTID(219)
  boolean autoFormatAsYouTypeMatchParentheses();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeMatchParentheses"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(300) //= 0x12c. The runtime will prefer the VTID if present
  @VTID(220)
  void autoFormatAsYouTypeMatchParentheses(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeReplaceFarEastDashes"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(301) //= 0x12d. The runtime will prefer the VTID if present
  @VTID(221)
  boolean autoFormatAsYouTypeReplaceFarEastDashes();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeReplaceFarEastDashes"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(301) //= 0x12d. The runtime will prefer the VTID if present
  @VTID(222)
  void autoFormatAsYouTypeReplaceFarEastDashes(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeDeleteAutoSpaces"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(302) //= 0x12e. The runtime will prefer the VTID if present
  @VTID(223)
  boolean autoFormatAsYouTypeDeleteAutoSpaces();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeDeleteAutoSpaces"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(302) //= 0x12e. The runtime will prefer the VTID if present
  @VTID(224)
  void autoFormatAsYouTypeDeleteAutoSpaces(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeInsertClosings"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(303) //= 0x12f. The runtime will prefer the VTID if present
  @VTID(225)
  boolean autoFormatAsYouTypeInsertClosings();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeInsertClosings"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(303) //= 0x12f. The runtime will prefer the VTID if present
  @VTID(226)
  void autoFormatAsYouTypeInsertClosings(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeAutoLetterWizard"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(304) //= 0x130. The runtime will prefer the VTID if present
  @VTID(227)
  boolean autoFormatAsYouTypeAutoLetterWizard();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeAutoLetterWizard"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(304) //= 0x130. The runtime will prefer the VTID if present
  @VTID(228)
  void autoFormatAsYouTypeAutoLetterWizard(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeInsertOvers"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(305) //= 0x131. The runtime will prefer the VTID if present
  @VTID(229)
  boolean autoFormatAsYouTypeInsertOvers();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeInsertOvers"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(305) //= 0x131. The runtime will prefer the VTID if present
  @VTID(230)
  void autoFormatAsYouTypeInsertOvers(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "DisplayGridLines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(306) //= 0x132. The runtime will prefer the VTID if present
  @VTID(231)
  boolean displayGridLines();


  /**
   * <p>
   * Setter method for the COM property "DisplayGridLines"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(306) //= 0x132. The runtime will prefer the VTID if present
  @VTID(232)
  void displayGridLines(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchFuzzyCase"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(309) //= 0x135. The runtime will prefer the VTID if present
  @VTID(233)
  boolean matchFuzzyCase();


  /**
   * <p>
   * Setter method for the COM property "MatchFuzzyCase"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(309) //= 0x135. The runtime will prefer the VTID if present
  @VTID(234)
  void matchFuzzyCase(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchFuzzyByte"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(310) //= 0x136. The runtime will prefer the VTID if present
  @VTID(235)
  boolean matchFuzzyByte();


  /**
   * <p>
   * Setter method for the COM property "MatchFuzzyByte"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(310) //= 0x136. The runtime will prefer the VTID if present
  @VTID(236)
  void matchFuzzyByte(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchFuzzyHiragana"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(311) //= 0x137. The runtime will prefer the VTID if present
  @VTID(237)
  boolean matchFuzzyHiragana();


  /**
   * <p>
   * Setter method for the COM property "MatchFuzzyHiragana"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(311) //= 0x137. The runtime will prefer the VTID if present
  @VTID(238)
  void matchFuzzyHiragana(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchFuzzySmallKana"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(312) //= 0x138. The runtime will prefer the VTID if present
  @VTID(239)
  boolean matchFuzzySmallKana();


  /**
   * <p>
   * Setter method for the COM property "MatchFuzzySmallKana"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(312) //= 0x138. The runtime will prefer the VTID if present
  @VTID(240)
  void matchFuzzySmallKana(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchFuzzyDash"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(313) //= 0x139. The runtime will prefer the VTID if present
  @VTID(241)
  boolean matchFuzzyDash();


  /**
   * <p>
   * Setter method for the COM property "MatchFuzzyDash"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(313) //= 0x139. The runtime will prefer the VTID if present
  @VTID(242)
  void matchFuzzyDash(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchFuzzyIterationMark"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(314) //= 0x13a. The runtime will prefer the VTID if present
  @VTID(243)
  boolean matchFuzzyIterationMark();


  /**
   * <p>
   * Setter method for the COM property "MatchFuzzyIterationMark"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(314) //= 0x13a. The runtime will prefer the VTID if present
  @VTID(244)
  void matchFuzzyIterationMark(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchFuzzyKanji"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(315) //= 0x13b. The runtime will prefer the VTID if present
  @VTID(245)
  boolean matchFuzzyKanji();


  /**
   * <p>
   * Setter method for the COM property "MatchFuzzyKanji"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(315) //= 0x13b. The runtime will prefer the VTID if present
  @VTID(246)
  void matchFuzzyKanji(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchFuzzyOldKana"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(316) //= 0x13c. The runtime will prefer the VTID if present
  @VTID(247)
  boolean matchFuzzyOldKana();


  /**
   * <p>
   * Setter method for the COM property "MatchFuzzyOldKana"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(316) //= 0x13c. The runtime will prefer the VTID if present
  @VTID(248)
  void matchFuzzyOldKana(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchFuzzyProlongedSoundMark"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(317) //= 0x13d. The runtime will prefer the VTID if present
  @VTID(249)
  boolean matchFuzzyProlongedSoundMark();


  /**
   * <p>
   * Setter method for the COM property "MatchFuzzyProlongedSoundMark"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(317) //= 0x13d. The runtime will prefer the VTID if present
  @VTID(250)
  void matchFuzzyProlongedSoundMark(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchFuzzyDZ"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(318) //= 0x13e. The runtime will prefer the VTID if present
  @VTID(251)
  boolean matchFuzzyDZ();


  /**
   * <p>
   * Setter method for the COM property "MatchFuzzyDZ"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(318) //= 0x13e. The runtime will prefer the VTID if present
  @VTID(252)
  void matchFuzzyDZ(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchFuzzyBV"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(319) //= 0x13f. The runtime will prefer the VTID if present
  @VTID(253)
  boolean matchFuzzyBV();


  /**
   * <p>
   * Setter method for the COM property "MatchFuzzyBV"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(319) //= 0x13f. The runtime will prefer the VTID if present
  @VTID(254)
  void matchFuzzyBV(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchFuzzyTC"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(320) //= 0x140. The runtime will prefer the VTID if present
  @VTID(255)
  boolean matchFuzzyTC();


  /**
   * <p>
   * Setter method for the COM property "MatchFuzzyTC"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(320) //= 0x140. The runtime will prefer the VTID if present
  @VTID(256)
  void matchFuzzyTC(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchFuzzyHF"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(321) //= 0x141. The runtime will prefer the VTID if present
  @VTID(257)
  boolean matchFuzzyHF();


  /**
   * <p>
   * Setter method for the COM property "MatchFuzzyHF"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(321) //= 0x141. The runtime will prefer the VTID if present
  @VTID(258)
  void matchFuzzyHF(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchFuzzyZJ"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(322) //= 0x142. The runtime will prefer the VTID if present
  @VTID(259)
  boolean matchFuzzyZJ();


  /**
   * <p>
   * Setter method for the COM property "MatchFuzzyZJ"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(322) //= 0x142. The runtime will prefer the VTID if present
  @VTID(260)
  void matchFuzzyZJ(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchFuzzyAY"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(323) //= 0x143. The runtime will prefer the VTID if present
  @VTID(261)
  boolean matchFuzzyAY();


  /**
   * <p>
   * Setter method for the COM property "MatchFuzzyAY"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(323) //= 0x143. The runtime will prefer the VTID if present
  @VTID(262)
  void matchFuzzyAY(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchFuzzyKiKu"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(324) //= 0x144. The runtime will prefer the VTID if present
  @VTID(263)
  boolean matchFuzzyKiKu();


  /**
   * <p>
   * Setter method for the COM property "MatchFuzzyKiKu"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(324) //= 0x144. The runtime will prefer the VTID if present
  @VTID(264)
  void matchFuzzyKiKu(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchFuzzyPunctuation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(325) //= 0x145. The runtime will prefer the VTID if present
  @VTID(265)
  boolean matchFuzzyPunctuation();


  /**
   * <p>
   * Setter method for the COM property "MatchFuzzyPunctuation"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(325) //= 0x145. The runtime will prefer the VTID if present
  @VTID(266)
  void matchFuzzyPunctuation(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MatchFuzzySpace"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(326) //= 0x146. The runtime will prefer the VTID if present
  @VTID(267)
  boolean matchFuzzySpace();


  /**
   * <p>
   * Setter method for the COM property "MatchFuzzySpace"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(326) //= 0x146. The runtime will prefer the VTID if present
  @VTID(268)
  void matchFuzzySpace(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ApplyFarEastFontsToAscii"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(327) //= 0x147. The runtime will prefer the VTID if present
  @VTID(269)
  boolean applyFarEastFontsToAscii();


  /**
   * <p>
   * Setter method for the COM property "ApplyFarEastFontsToAscii"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(327) //= 0x147. The runtime will prefer the VTID if present
  @VTID(270)
  void applyFarEastFontsToAscii(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ConvertHighAnsiToFarEast"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(328) //= 0x148. The runtime will prefer the VTID if present
  @VTID(271)
  boolean convertHighAnsiToFarEast();


  /**
   * <p>
   * Setter method for the COM property "ConvertHighAnsiToFarEast"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(328) //= 0x148. The runtime will prefer the VTID if present
  @VTID(272)
  void convertHighAnsiToFarEast(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PrintOddPagesInAscendingOrder"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(330) //= 0x14a. The runtime will prefer the VTID if present
  @VTID(273)
  boolean printOddPagesInAscendingOrder();


  /**
   * <p>
   * Setter method for the COM property "PrintOddPagesInAscendingOrder"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(330) //= 0x14a. The runtime will prefer the VTID if present
  @VTID(274)
  void printOddPagesInAscendingOrder(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PrintEvenPagesInAscendingOrder"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(331) //= 0x14b. The runtime will prefer the VTID if present
  @VTID(275)
  boolean printEvenPagesInAscendingOrder();


  /**
   * <p>
   * Setter method for the COM property "PrintEvenPagesInAscendingOrder"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(331) //= 0x14b. The runtime will prefer the VTID if present
  @VTID(276)
  void printEvenPagesInAscendingOrder(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "DefaultBorderColorIndex"
   * </p>
   * @return  Returns a value of type word.WdColorIndex
   */

  @DISPID(337) //= 0x151. The runtime will prefer the VTID if present
  @VTID(277)
  word.WdColorIndex defaultBorderColorIndex();


  /**
   * <p>
   * Setter method for the COM property "DefaultBorderColorIndex"
   * </p>
   * @param prop Mandatory word.WdColorIndex parameter.
   */

  @DISPID(337) //= 0x151. The runtime will prefer the VTID if present
  @VTID(278)
  void defaultBorderColorIndex(
    word.WdColorIndex prop);


  /**
   * <p>
   * Getter method for the COM property "EnableMisusedWordsDictionary"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(338) //= 0x152. The runtime will prefer the VTID if present
  @VTID(279)
  boolean enableMisusedWordsDictionary();


  /**
   * <p>
   * Setter method for the COM property "EnableMisusedWordsDictionary"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(338) //= 0x152. The runtime will prefer the VTID if present
  @VTID(280)
  void enableMisusedWordsDictionary(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AllowCombinedAuxiliaryForms"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(339) //= 0x153. The runtime will prefer the VTID if present
  @VTID(281)
  boolean allowCombinedAuxiliaryForms();


  /**
   * <p>
   * Setter method for the COM property "AllowCombinedAuxiliaryForms"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(339) //= 0x153. The runtime will prefer the VTID if present
  @VTID(282)
  void allowCombinedAuxiliaryForms(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "HangulHanjaFastConversion"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(340) //= 0x154. The runtime will prefer the VTID if present
  @VTID(283)
  boolean hangulHanjaFastConversion();


  /**
   * <p>
   * Setter method for the COM property "HangulHanjaFastConversion"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(340) //= 0x154. The runtime will prefer the VTID if present
  @VTID(284)
  void hangulHanjaFastConversion(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "CheckHangulEndings"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(341) //= 0x155. The runtime will prefer the VTID if present
  @VTID(285)
  boolean checkHangulEndings();


  /**
   * <p>
   * Setter method for the COM property "CheckHangulEndings"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(341) //= 0x155. The runtime will prefer the VTID if present
  @VTID(286)
  void checkHangulEndings(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "EnableHangulHanjaRecentOrdering"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(342) //= 0x156. The runtime will prefer the VTID if present
  @VTID(287)
  boolean enableHangulHanjaRecentOrdering();


  /**
   * <p>
   * Setter method for the COM property "EnableHangulHanjaRecentOrdering"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(342) //= 0x156. The runtime will prefer the VTID if present
  @VTID(288)
  void enableHangulHanjaRecentOrdering(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MultipleWordConversionsMode"
   * </p>
   * @return  Returns a value of type word.WdMultipleWordConversionsMode
   */

  @DISPID(343) //= 0x157. The runtime will prefer the VTID if present
  @VTID(289)
  word.WdMultipleWordConversionsMode multipleWordConversionsMode();


  /**
   * <p>
   * Setter method for the COM property "MultipleWordConversionsMode"
   * </p>
   * @param prop Mandatory word.WdMultipleWordConversionsMode parameter.
   */

  @DISPID(343) //= 0x157. The runtime will prefer the VTID if present
  @VTID(290)
  void multipleWordConversionsMode(
    word.WdMultipleWordConversionsMode prop);


  /**
   * @param commandKeyHelp Optional parameter. Default value is com4j.Variant.getMissing()
   * @param docNavigationKeys Optional parameter. Default value is com4j.Variant.getMissing()
   * @param mouseSimulation Optional parameter. Default value is com4j.Variant.getMissing()
   * @param demoGuidance Optional parameter. Default value is com4j.Variant.getMissing()
   * @param demoSpeed Optional parameter. Default value is com4j.Variant.getMissing()
   * @param helpType Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(333) //= 0x14d. The runtime will prefer the VTID if present
  @VTID(291)
  void setWPHelpOptions(
    @Optional java.lang.Object commandKeyHelp,
    @Optional java.lang.Object docNavigationKeys,
    @Optional java.lang.Object mouseSimulation,
    @Optional java.lang.Object demoGuidance,
    @Optional java.lang.Object demoSpeed,
    @Optional java.lang.Object helpType);


  /**
   * <p>
   * Getter method for the COM property "DefaultBorderColor"
   * </p>
   * @return  Returns a value of type word.WdColor
   */

  @DISPID(344) //= 0x158. The runtime will prefer the VTID if present
  @VTID(292)
  word.WdColor defaultBorderColor();


  /**
   * <p>
   * Setter method for the COM property "DefaultBorderColor"
   * </p>
   * @param prop Mandatory word.WdColor parameter.
   */

  @DISPID(344) //= 0x158. The runtime will prefer the VTID if present
  @VTID(293)
  void defaultBorderColor(
    word.WdColor prop);


  /**
   * <p>
   * Getter method for the COM property "AllowPixelUnits"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(345) //= 0x159. The runtime will prefer the VTID if present
  @VTID(294)
  boolean allowPixelUnits();


  /**
   * <p>
   * Setter method for the COM property "AllowPixelUnits"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(345) //= 0x159. The runtime will prefer the VTID if present
  @VTID(295)
  void allowPixelUnits(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "UseCharacterUnit"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(346) //= 0x15a. The runtime will prefer the VTID if present
  @VTID(296)
  boolean useCharacterUnit();


  /**
   * <p>
   * Setter method for the COM property "UseCharacterUnit"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(346) //= 0x15a. The runtime will prefer the VTID if present
  @VTID(297)
  void useCharacterUnit(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AllowCompoundNounProcessing"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(347) //= 0x15b. The runtime will prefer the VTID if present
  @VTID(298)
  boolean allowCompoundNounProcessing();


  /**
   * <p>
   * Setter method for the COM property "AllowCompoundNounProcessing"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(347) //= 0x15b. The runtime will prefer the VTID if present
  @VTID(299)
  void allowCompoundNounProcessing(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoKeyboardSwitching"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(399) //= 0x18f. The runtime will prefer the VTID if present
  @VTID(300)
  boolean autoKeyboardSwitching();


  /**
   * <p>
   * Setter method for the COM property "AutoKeyboardSwitching"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(399) //= 0x18f. The runtime will prefer the VTID if present
  @VTID(301)
  void autoKeyboardSwitching(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "DocumentViewDirection"
   * </p>
   * @return  Returns a value of type word.WdDocumentViewDirection
   */

  @DISPID(400) //= 0x190. The runtime will prefer the VTID if present
  @VTID(302)
  word.WdDocumentViewDirection documentViewDirection();


  /**
   * <p>
   * Setter method for the COM property "DocumentViewDirection"
   * </p>
   * @param prop Mandatory word.WdDocumentViewDirection parameter.
   */

  @DISPID(400) //= 0x190. The runtime will prefer the VTID if present
  @VTID(303)
  void documentViewDirection(
    word.WdDocumentViewDirection prop);


  /**
   * <p>
   * Getter method for the COM property "ArabicNumeral"
   * </p>
   * @return  Returns a value of type word.WdArabicNumeral
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(304)
  word.WdArabicNumeral arabicNumeral();


  /**
   * <p>
   * Setter method for the COM property "ArabicNumeral"
   * </p>
   * @param prop Mandatory word.WdArabicNumeral parameter.
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(305)
  void arabicNumeral(
    word.WdArabicNumeral prop);


  /**
   * <p>
   * Getter method for the COM property "MonthNames"
   * </p>
   * @return  Returns a value of type word.WdMonthNames
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(306)
  word.WdMonthNames monthNames();


  /**
   * <p>
   * Setter method for the COM property "MonthNames"
   * </p>
   * @param prop Mandatory word.WdMonthNames parameter.
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(307)
  void monthNames(
    word.WdMonthNames prop);


  /**
   * <p>
   * Getter method for the COM property "CursorMovement"
   * </p>
   * @return  Returns a value of type word.WdCursorMovement
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(308)
  word.WdCursorMovement cursorMovement();


  /**
   * <p>
   * Setter method for the COM property "CursorMovement"
   * </p>
   * @param prop Mandatory word.WdCursorMovement parameter.
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(309)
  void cursorMovement(
    word.WdCursorMovement prop);


  /**
   * <p>
   * Getter method for the COM property "VisualSelection"
   * </p>
   * @return  Returns a value of type word.WdVisualSelection
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(310)
  word.WdVisualSelection visualSelection();


  /**
   * <p>
   * Setter method for the COM property "VisualSelection"
   * </p>
   * @param prop Mandatory word.WdVisualSelection parameter.
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(311)
  void visualSelection(
    word.WdVisualSelection prop);


  /**
   * <p>
   * Getter method for the COM property "ShowDiacritics"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(405) //= 0x195. The runtime will prefer the VTID if present
  @VTID(312)
  boolean showDiacritics();


  /**
   * <p>
   * Setter method for the COM property "ShowDiacritics"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(405) //= 0x195. The runtime will prefer the VTID if present
  @VTID(313)
  void showDiacritics(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowControlCharacters"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(406) //= 0x196. The runtime will prefer the VTID if present
  @VTID(314)
  boolean showControlCharacters();


  /**
   * <p>
   * Setter method for the COM property "ShowControlCharacters"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(406) //= 0x196. The runtime will prefer the VTID if present
  @VTID(315)
  void showControlCharacters(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AddControlCharacters"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(407) //= 0x197. The runtime will prefer the VTID if present
  @VTID(316)
  boolean addControlCharacters();


  /**
   * <p>
   * Setter method for the COM property "AddControlCharacters"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(407) //= 0x197. The runtime will prefer the VTID if present
  @VTID(317)
  void addControlCharacters(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AddBiDirectionalMarksWhenSavingTextFile"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(408) //= 0x198. The runtime will prefer the VTID if present
  @VTID(318)
  boolean addBiDirectionalMarksWhenSavingTextFile();


  /**
   * <p>
   * Setter method for the COM property "AddBiDirectionalMarksWhenSavingTextFile"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(408) //= 0x198. The runtime will prefer the VTID if present
  @VTID(319)
  void addBiDirectionalMarksWhenSavingTextFile(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "StrictInitialAlefHamza"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(409) //= 0x199. The runtime will prefer the VTID if present
  @VTID(320)
  boolean strictInitialAlefHamza();


  /**
   * <p>
   * Setter method for the COM property "StrictInitialAlefHamza"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(409) //= 0x199. The runtime will prefer the VTID if present
  @VTID(321)
  void strictInitialAlefHamza(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "StrictFinalYaa"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(410) //= 0x19a. The runtime will prefer the VTID if present
  @VTID(322)
  boolean strictFinalYaa();


  /**
   * <p>
   * Setter method for the COM property "StrictFinalYaa"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(410) //= 0x19a. The runtime will prefer the VTID if present
  @VTID(323)
  void strictFinalYaa(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "HebrewMode"
   * </p>
   * @return  Returns a value of type word.WdHebSpellStart
   */

  @DISPID(411) //= 0x19b. The runtime will prefer the VTID if present
  @VTID(324)
  word.WdHebSpellStart hebrewMode();


  /**
   * <p>
   * Setter method for the COM property "HebrewMode"
   * </p>
   * @param prop Mandatory word.WdHebSpellStart parameter.
   */

  @DISPID(411) //= 0x19b. The runtime will prefer the VTID if present
  @VTID(325)
  void hebrewMode(
    word.WdHebSpellStart prop);


  /**
   * <p>
   * Getter method for the COM property "ArabicMode"
   * </p>
   * @return  Returns a value of type word.WdAraSpeller
   */

  @DISPID(412) //= 0x19c. The runtime will prefer the VTID if present
  @VTID(326)
  word.WdAraSpeller arabicMode();


  /**
   * <p>
   * Setter method for the COM property "ArabicMode"
   * </p>
   * @param prop Mandatory word.WdAraSpeller parameter.
   */

  @DISPID(412) //= 0x19c. The runtime will prefer the VTID if present
  @VTID(327)
  void arabicMode(
    word.WdAraSpeller prop);


  /**
   * <p>
   * Getter method for the COM property "AllowClickAndTypeMouse"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(413) //= 0x19d. The runtime will prefer the VTID if present
  @VTID(328)
  boolean allowClickAndTypeMouse();


  /**
   * <p>
   * Setter method for the COM property "AllowClickAndTypeMouse"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(413) //= 0x19d. The runtime will prefer the VTID if present
  @VTID(329)
  void allowClickAndTypeMouse(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "UseGermanSpellingReform"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(415) //= 0x19f. The runtime will prefer the VTID if present
  @VTID(330)
  boolean useGermanSpellingReform();


  /**
   * <p>
   * Setter method for the COM property "UseGermanSpellingReform"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(415) //= 0x19f. The runtime will prefer the VTID if present
  @VTID(331)
  void useGermanSpellingReform(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "InterpretHighAnsi"
   * </p>
   * @return  Returns a value of type word.WdHighAnsiText
   */

  @DISPID(418) //= 0x1a2. The runtime will prefer the VTID if present
  @VTID(332)
  word.WdHighAnsiText interpretHighAnsi();


  /**
   * <p>
   * Setter method for the COM property "InterpretHighAnsi"
   * </p>
   * @param prop Mandatory word.WdHighAnsiText parameter.
   */

  @DISPID(418) //= 0x1a2. The runtime will prefer the VTID if present
  @VTID(333)
  void interpretHighAnsi(
    word.WdHighAnsiText prop);


  /**
   * <p>
   * Getter method for the COM property "AddHebDoubleQuote"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(419) //= 0x1a3. The runtime will prefer the VTID if present
  @VTID(334)
  boolean addHebDoubleQuote();


  /**
   * <p>
   * Setter method for the COM property "AddHebDoubleQuote"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(419) //= 0x1a3. The runtime will prefer the VTID if present
  @VTID(335)
  void addHebDoubleQuote(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "UseDiffDiacColor"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(420) //= 0x1a4. The runtime will prefer the VTID if present
  @VTID(336)
  boolean useDiffDiacColor();


  /**
   * <p>
   * Setter method for the COM property "UseDiffDiacColor"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(420) //= 0x1a4. The runtime will prefer the VTID if present
  @VTID(337)
  void useDiffDiacColor(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "DiacriticColorVal"
   * </p>
   * @return  Returns a value of type word.WdColor
   */

  @DISPID(421) //= 0x1a5. The runtime will prefer the VTID if present
  @VTID(338)
  word.WdColor diacriticColorVal();


  /**
   * <p>
   * Setter method for the COM property "DiacriticColorVal"
   * </p>
   * @param prop Mandatory word.WdColor parameter.
   */

  @DISPID(421) //= 0x1a5. The runtime will prefer the VTID if present
  @VTID(339)
  void diacriticColorVal(
    word.WdColor prop);


  /**
   * <p>
   * Getter method for the COM property "OptimizeForWord97byDefault"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(423) //= 0x1a7. The runtime will prefer the VTID if present
  @VTID(340)
  boolean optimizeForWord97byDefault();


  /**
   * <p>
   * Setter method for the COM property "OptimizeForWord97byDefault"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(423) //= 0x1a7. The runtime will prefer the VTID if present
  @VTID(341)
  void optimizeForWord97byDefault(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "LocalNetworkFile"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(424) //= 0x1a8. The runtime will prefer the VTID if present
  @VTID(342)
  boolean localNetworkFile();


  /**
   * <p>
   * Setter method for the COM property "LocalNetworkFile"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(424) //= 0x1a8. The runtime will prefer the VTID if present
  @VTID(343)
  void localNetworkFile(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "TypeNReplace"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(425) //= 0x1a9. The runtime will prefer the VTID if present
  @VTID(344)
  boolean typeNReplace();


  /**
   * <p>
   * Setter method for the COM property "TypeNReplace"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(425) //= 0x1a9. The runtime will prefer the VTID if present
  @VTID(345)
  void typeNReplace(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SequenceCheck"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(426) //= 0x1aa. The runtime will prefer the VTID if present
  @VTID(346)
  boolean sequenceCheck();


  /**
   * <p>
   * Setter method for the COM property "SequenceCheck"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(426) //= 0x1aa. The runtime will prefer the VTID if present
  @VTID(347)
  void sequenceCheck(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "BackgroundOpen"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(427) //= 0x1ab. The runtime will prefer the VTID if present
  @VTID(348)
  boolean backgroundOpen();


  /**
   * <p>
   * Setter method for the COM property "BackgroundOpen"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(427) //= 0x1ab. The runtime will prefer the VTID if present
  @VTID(349)
  void backgroundOpen(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "DisableFeaturesbyDefault"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(428) //= 0x1ac. The runtime will prefer the VTID if present
  @VTID(350)
  boolean disableFeaturesbyDefault();


  /**
   * <p>
   * Setter method for the COM property "DisableFeaturesbyDefault"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(428) //= 0x1ac. The runtime will prefer the VTID if present
  @VTID(351)
  void disableFeaturesbyDefault(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PasteAdjustWordSpacing"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(429) //= 0x1ad. The runtime will prefer the VTID if present
  @VTID(352)
  boolean pasteAdjustWordSpacing();


  /**
   * <p>
   * Setter method for the COM property "PasteAdjustWordSpacing"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(429) //= 0x1ad. The runtime will prefer the VTID if present
  @VTID(353)
  void pasteAdjustWordSpacing(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PasteAdjustParagraphSpacing"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(430) //= 0x1ae. The runtime will prefer the VTID if present
  @VTID(354)
  boolean pasteAdjustParagraphSpacing();


  /**
   * <p>
   * Setter method for the COM property "PasteAdjustParagraphSpacing"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(430) //= 0x1ae. The runtime will prefer the VTID if present
  @VTID(355)
  void pasteAdjustParagraphSpacing(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PasteAdjustTableFormatting"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(431) //= 0x1af. The runtime will prefer the VTID if present
  @VTID(356)
  boolean pasteAdjustTableFormatting();


  /**
   * <p>
   * Setter method for the COM property "PasteAdjustTableFormatting"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(431) //= 0x1af. The runtime will prefer the VTID if present
  @VTID(357)
  void pasteAdjustTableFormatting(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PasteSmartStyleBehavior"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(432) //= 0x1b0. The runtime will prefer the VTID if present
  @VTID(358)
  boolean pasteSmartStyleBehavior();


  /**
   * <p>
   * Setter method for the COM property "PasteSmartStyleBehavior"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(432) //= 0x1b0. The runtime will prefer the VTID if present
  @VTID(359)
  void pasteSmartStyleBehavior(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PasteMergeFromPPT"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(433) //= 0x1b1. The runtime will prefer the VTID if present
  @VTID(360)
  boolean pasteMergeFromPPT();


  /**
   * <p>
   * Setter method for the COM property "PasteMergeFromPPT"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(433) //= 0x1b1. The runtime will prefer the VTID if present
  @VTID(361)
  void pasteMergeFromPPT(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PasteMergeFromXL"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(434) //= 0x1b2. The runtime will prefer the VTID if present
  @VTID(362)
  boolean pasteMergeFromXL();


  /**
   * <p>
   * Setter method for the COM property "PasteMergeFromXL"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(434) //= 0x1b2. The runtime will prefer the VTID if present
  @VTID(363)
  void pasteMergeFromXL(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "CtrlClickHyperlinkToOpen"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(435) //= 0x1b3. The runtime will prefer the VTID if present
  @VTID(364)
  boolean ctrlClickHyperlinkToOpen();


  /**
   * <p>
   * Setter method for the COM property "CtrlClickHyperlinkToOpen"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(435) //= 0x1b3. The runtime will prefer the VTID if present
  @VTID(365)
  void ctrlClickHyperlinkToOpen(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PictureWrapType"
   * </p>
   * @return  Returns a value of type word.WdWrapTypeMerged
   */

  @DISPID(436) //= 0x1b4. The runtime will prefer the VTID if present
  @VTID(366)
  word.WdWrapTypeMerged pictureWrapType();


  /**
   * <p>
   * Setter method for the COM property "PictureWrapType"
   * </p>
   * @param prop Mandatory word.WdWrapTypeMerged parameter.
   */

  @DISPID(436) //= 0x1b4. The runtime will prefer the VTID if present
  @VTID(367)
  void pictureWrapType(
    word.WdWrapTypeMerged prop);


  /**
   * <p>
   * Getter method for the COM property "DisableFeaturesIntroducedAfterbyDefault"
   * </p>
   * @return  Returns a value of type word.WdDisableFeaturesIntroducedAfter
   */

  @DISPID(437) //= 0x1b5. The runtime will prefer the VTID if present
  @VTID(368)
  word.WdDisableFeaturesIntroducedAfter disableFeaturesIntroducedAfterbyDefault();


  /**
   * <p>
   * Setter method for the COM property "DisableFeaturesIntroducedAfterbyDefault"
   * </p>
   * @param prop Mandatory word.WdDisableFeaturesIntroducedAfter parameter.
   */

  @DISPID(437) //= 0x1b5. The runtime will prefer the VTID if present
  @VTID(369)
  void disableFeaturesIntroducedAfterbyDefault(
    word.WdDisableFeaturesIntroducedAfter prop);


  /**
   * <p>
   * Getter method for the COM property "PasteSmartCutPaste"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(438) //= 0x1b6. The runtime will prefer the VTID if present
  @VTID(370)
  boolean pasteSmartCutPaste();


  /**
   * <p>
   * Setter method for the COM property "PasteSmartCutPaste"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(438) //= 0x1b6. The runtime will prefer the VTID if present
  @VTID(371)
  void pasteSmartCutPaste(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "DisplayPasteOptions"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(439) //= 0x1b7. The runtime will prefer the VTID if present
  @VTID(372)
  boolean displayPasteOptions();


  /**
   * <p>
   * Setter method for the COM property "DisplayPasteOptions"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(439) //= 0x1b7. The runtime will prefer the VTID if present
  @VTID(373)
  void displayPasteOptions(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PromptUpdateStyle"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(441) //= 0x1b9. The runtime will prefer the VTID if present
  @VTID(374)
  boolean promptUpdateStyle();


  /**
   * <p>
   * Setter method for the COM property "PromptUpdateStyle"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(441) //= 0x1b9. The runtime will prefer the VTID if present
  @VTID(375)
  void promptUpdateStyle(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "DefaultEPostageApp"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(442) //= 0x1ba. The runtime will prefer the VTID if present
  @VTID(376)
  java.lang.String defaultEPostageApp();


  /**
   * <p>
   * Setter method for the COM property "DefaultEPostageApp"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(442) //= 0x1ba. The runtime will prefer the VTID if present
  @VTID(377)
  void defaultEPostageApp(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "DefaultTextEncoding"
   * </p>
   * @return  Returns a value of type office.MsoEncoding
   */

  @DISPID(443) //= 0x1bb. The runtime will prefer the VTID if present
  @VTID(378)
  office.MsoEncoding defaultTextEncoding();


  /**
   * <p>
   * Setter method for the COM property "DefaultTextEncoding"
   * </p>
   * @param prop Mandatory office.MsoEncoding parameter.
   */

  @DISPID(443) //= 0x1bb. The runtime will prefer the VTID if present
  @VTID(379)
  void defaultTextEncoding(
    office.MsoEncoding prop);


  /**
   * <p>
   * Getter method for the COM property "LabelSmartTags"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(444) //= 0x1bc. The runtime will prefer the VTID if present
  @VTID(380)
  boolean labelSmartTags();


  /**
   * <p>
   * Setter method for the COM property "LabelSmartTags"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(444) //= 0x1bc. The runtime will prefer the VTID if present
  @VTID(381)
  void labelSmartTags(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "DisplaySmartTagButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(445) //= 0x1bd. The runtime will prefer the VTID if present
  @VTID(382)
  boolean displaySmartTagButtons();


  /**
   * <p>
   * Setter method for the COM property "DisplaySmartTagButtons"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(445) //= 0x1bd. The runtime will prefer the VTID if present
  @VTID(383)
  void displaySmartTagButtons(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "WarnBeforeSavingPrintingSendingMarkup"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(446) //= 0x1be. The runtime will prefer the VTID if present
  @VTID(384)
  boolean warnBeforeSavingPrintingSendingMarkup();


  /**
   * <p>
   * Setter method for the COM property "WarnBeforeSavingPrintingSendingMarkup"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(446) //= 0x1be. The runtime will prefer the VTID if present
  @VTID(385)
  void warnBeforeSavingPrintingSendingMarkup(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "StoreRSIDOnSave"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(447) //= 0x1bf. The runtime will prefer the VTID if present
  @VTID(386)
  boolean storeRSIDOnSave();


  /**
   * <p>
   * Setter method for the COM property "StoreRSIDOnSave"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(447) //= 0x1bf. The runtime will prefer the VTID if present
  @VTID(387)
  void storeRSIDOnSave(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowFormatError"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(448) //= 0x1c0. The runtime will prefer the VTID if present
  @VTID(388)
  boolean showFormatError();


  /**
   * <p>
   * Setter method for the COM property "ShowFormatError"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(448) //= 0x1c0. The runtime will prefer the VTID if present
  @VTID(389)
  void showFormatError(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "FormatScanning"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(449) //= 0x1c1. The runtime will prefer the VTID if present
  @VTID(390)
  boolean formatScanning();


  /**
   * <p>
   * Setter method for the COM property "FormatScanning"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(449) //= 0x1c1. The runtime will prefer the VTID if present
  @VTID(391)
  void formatScanning(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PasteMergeLists"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(450) //= 0x1c2. The runtime will prefer the VTID if present
  @VTID(392)
  boolean pasteMergeLists();


  /**
   * <p>
   * Setter method for the COM property "PasteMergeLists"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(450) //= 0x1c2. The runtime will prefer the VTID if present
  @VTID(393)
  void pasteMergeLists(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AutoCreateNewDrawings"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(451) //= 0x1c3. The runtime will prefer the VTID if present
  @VTID(394)
  boolean autoCreateNewDrawings();


  /**
   * <p>
   * Setter method for the COM property "AutoCreateNewDrawings"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(451) //= 0x1c3. The runtime will prefer the VTID if present
  @VTID(395)
  void autoCreateNewDrawings(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SmartParaSelection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(452) //= 0x1c4. The runtime will prefer the VTID if present
  @VTID(396)
  boolean smartParaSelection();


  /**
   * <p>
   * Setter method for the COM property "SmartParaSelection"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(452) //= 0x1c4. The runtime will prefer the VTID if present
  @VTID(397)
  void smartParaSelection(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "RevisionsBalloonPrintOrientation"
   * </p>
   * @return  Returns a value of type word.WdRevisionsBalloonPrintOrientation
   */

  @DISPID(453) //= 0x1c5. The runtime will prefer the VTID if present
  @VTID(398)
  word.WdRevisionsBalloonPrintOrientation revisionsBalloonPrintOrientation();


  /**
   * <p>
   * Setter method for the COM property "RevisionsBalloonPrintOrientation"
   * </p>
   * @param prop Mandatory word.WdRevisionsBalloonPrintOrientation parameter.
   */

  @DISPID(453) //= 0x1c5. The runtime will prefer the VTID if present
  @VTID(399)
  void revisionsBalloonPrintOrientation(
    word.WdRevisionsBalloonPrintOrientation prop);


  /**
   * <p>
   * Getter method for the COM property "CommentsColor"
   * </p>
   * @return  Returns a value of type word.WdColorIndex
   */

  @DISPID(454) //= 0x1c6. The runtime will prefer the VTID if present
  @VTID(400)
  word.WdColorIndex commentsColor();


  /**
   * <p>
   * Setter method for the COM property "CommentsColor"
   * </p>
   * @param prop Mandatory word.WdColorIndex parameter.
   */

  @DISPID(454) //= 0x1c6. The runtime will prefer the VTID if present
  @VTID(401)
  void commentsColor(
    word.WdColorIndex prop);


  /**
   * <p>
   * Getter method for the COM property "PrintXMLTag"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(455) //= 0x1c7. The runtime will prefer the VTID if present
  @VTID(402)
  boolean printXMLTag();


  /**
   * <p>
   * Setter method for the COM property "PrintXMLTag"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(455) //= 0x1c7. The runtime will prefer the VTID if present
  @VTID(403)
  void printXMLTag(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PrintBackgrounds"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(456) //= 0x1c8. The runtime will prefer the VTID if present
  @VTID(404)
  boolean printBackgrounds();


  /**
   * <p>
   * Setter method for the COM property "PrintBackgrounds"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(456) //= 0x1c8. The runtime will prefer the VTID if present
  @VTID(405)
  void printBackgrounds(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AllowReadingMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(457) //= 0x1c9. The runtime will prefer the VTID if present
  @VTID(406)
  boolean allowReadingMode();


  /**
   * <p>
   * Setter method for the COM property "AllowReadingMode"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(457) //= 0x1c9. The runtime will prefer the VTID if present
  @VTID(407)
  void allowReadingMode(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowMarkupOpenSave"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(458) //= 0x1ca. The runtime will prefer the VTID if present
  @VTID(408)
  boolean showMarkupOpenSave();


  /**
   * <p>
   * Setter method for the COM property "ShowMarkupOpenSave"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(458) //= 0x1ca. The runtime will prefer the VTID if present
  @VTID(409)
  void showMarkupOpenSave(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SmartCursoring"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(459) //= 0x1cb. The runtime will prefer the VTID if present
  @VTID(410)
  boolean smartCursoring();


  /**
   * <p>
   * Setter method for the COM property "SmartCursoring"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(459) //= 0x1cb. The runtime will prefer the VTID if present
  @VTID(411)
  void smartCursoring(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MoveToTextMark"
   * </p>
   * @return  Returns a value of type word.WdMoveToTextMark
   */

  @DISPID(460) //= 0x1cc. The runtime will prefer the VTID if present
  @VTID(412)
  word.WdMoveToTextMark moveToTextMark();


  /**
   * <p>
   * Setter method for the COM property "MoveToTextMark"
   * </p>
   * @param prop Mandatory word.WdMoveToTextMark parameter.
   */

  @DISPID(460) //= 0x1cc. The runtime will prefer the VTID if present
  @VTID(413)
  void moveToTextMark(
    word.WdMoveToTextMark prop);


  /**
   * <p>
   * Getter method for the COM property "MoveFromTextMark"
   * </p>
   * @return  Returns a value of type word.WdMoveFromTextMark
   */

  @DISPID(461) //= 0x1cd. The runtime will prefer the VTID if present
  @VTID(414)
  word.WdMoveFromTextMark moveFromTextMark();


  /**
   * <p>
   * Setter method for the COM property "MoveFromTextMark"
   * </p>
   * @param prop Mandatory word.WdMoveFromTextMark parameter.
   */

  @DISPID(461) //= 0x1cd. The runtime will prefer the VTID if present
  @VTID(415)
  void moveFromTextMark(
    word.WdMoveFromTextMark prop);


  /**
   * <p>
   * Getter method for the COM property "BibliographyStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(462) //= 0x1ce. The runtime will prefer the VTID if present
  @VTID(416)
  java.lang.String bibliographyStyle();


  /**
   * <p>
   * Setter method for the COM property "BibliographyStyle"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(462) //= 0x1ce. The runtime will prefer the VTID if present
  @VTID(417)
  void bibliographyStyle(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "BibliographySort"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(463) //= 0x1cf. The runtime will prefer the VTID if present
  @VTID(418)
  java.lang.String bibliographySort();


  /**
   * <p>
   * Setter method for the COM property "BibliographySort"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(463) //= 0x1cf. The runtime will prefer the VTID if present
  @VTID(419)
  void bibliographySort(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "InsertedCellColor"
   * </p>
   * @return  Returns a value of type word.WdCellColor
   */

  @DISPID(464) //= 0x1d0. The runtime will prefer the VTID if present
  @VTID(420)
  word.WdCellColor insertedCellColor();


  /**
   * <p>
   * Setter method for the COM property "InsertedCellColor"
   * </p>
   * @param prop Mandatory word.WdCellColor parameter.
   */

  @DISPID(464) //= 0x1d0. The runtime will prefer the VTID if present
  @VTID(421)
  void insertedCellColor(
    word.WdCellColor prop);


  /**
   * <p>
   * Getter method for the COM property "DeletedCellColor"
   * </p>
   * @return  Returns a value of type word.WdCellColor
   */

  @DISPID(465) //= 0x1d1. The runtime will prefer the VTID if present
  @VTID(422)
  word.WdCellColor deletedCellColor();


  /**
   * <p>
   * Setter method for the COM property "DeletedCellColor"
   * </p>
   * @param prop Mandatory word.WdCellColor parameter.
   */

  @DISPID(465) //= 0x1d1. The runtime will prefer the VTID if present
  @VTID(423)
  void deletedCellColor(
    word.WdCellColor prop);


  /**
   * <p>
   * Getter method for the COM property "MergedCellColor"
   * </p>
   * @return  Returns a value of type word.WdCellColor
   */

  @DISPID(466) //= 0x1d2. The runtime will prefer the VTID if present
  @VTID(424)
  word.WdCellColor mergedCellColor();


  /**
   * <p>
   * Setter method for the COM property "MergedCellColor"
   * </p>
   * @param prop Mandatory word.WdCellColor parameter.
   */

  @DISPID(466) //= 0x1d2. The runtime will prefer the VTID if present
  @VTID(425)
  void mergedCellColor(
    word.WdCellColor prop);


  /**
   * <p>
   * Getter method for the COM property "SplitCellColor"
   * </p>
   * @return  Returns a value of type word.WdCellColor
   */

  @DISPID(467) //= 0x1d3. The runtime will prefer the VTID if present
  @VTID(426)
  word.WdCellColor splitCellColor();


  /**
   * <p>
   * Setter method for the COM property "SplitCellColor"
   * </p>
   * @param prop Mandatory word.WdCellColor parameter.
   */

  @DISPID(467) //= 0x1d3. The runtime will prefer the VTID if present
  @VTID(427)
  void splitCellColor(
    word.WdCellColor prop);


  /**
   * <p>
   * Getter method for the COM property "ShowSelectionFloaties"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(468) //= 0x1d4. The runtime will prefer the VTID if present
  @VTID(428)
  boolean showSelectionFloaties();


  /**
   * <p>
   * Setter method for the COM property "ShowSelectionFloaties"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(468) //= 0x1d4. The runtime will prefer the VTID if present
  @VTID(429)
  void showSelectionFloaties(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowMenuFloaties"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(469) //= 0x1d5. The runtime will prefer the VTID if present
  @VTID(430)
  boolean showMenuFloaties();


  /**
   * <p>
   * Setter method for the COM property "ShowMenuFloaties"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(469) //= 0x1d5. The runtime will prefer the VTID if present
  @VTID(431)
  void showMenuFloaties(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ShowDevTools"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(470) //= 0x1d6. The runtime will prefer the VTID if present
  @VTID(432)
  boolean showDevTools();


  /**
   * <p>
   * Setter method for the COM property "ShowDevTools"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(470) //= 0x1d6. The runtime will prefer the VTID if present
  @VTID(433)
  void showDevTools(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "EnableLivePreview"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(472) //= 0x1d8. The runtime will prefer the VTID if present
  @VTID(434)
  boolean enableLivePreview();


  /**
   * <p>
   * Setter method for the COM property "EnableLivePreview"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(472) //= 0x1d8. The runtime will prefer the VTID if present
  @VTID(435)
  void enableLivePreview(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "OMathAutoBuildUp"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(474) //= 0x1da. The runtime will prefer the VTID if present
  @VTID(436)
  boolean oMathAutoBuildUp();


  /**
   * <p>
   * Setter method for the COM property "OMathAutoBuildUp"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(474) //= 0x1da. The runtime will prefer the VTID if present
  @VTID(437)
  void oMathAutoBuildUp(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AlwaysUseClearType"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(476) //= 0x1dc. The runtime will prefer the VTID if present
  @VTID(438)
  boolean alwaysUseClearType();


  /**
   * <p>
   * Setter method for the COM property "AlwaysUseClearType"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(476) //= 0x1dc. The runtime will prefer the VTID if present
  @VTID(439)
  void alwaysUseClearType(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PasteFormatWithinDocument"
   * </p>
   * @return  Returns a value of type word.WdPasteOptions
   */

  @DISPID(477) //= 0x1dd. The runtime will prefer the VTID if present
  @VTID(440)
  word.WdPasteOptions pasteFormatWithinDocument();


  /**
   * <p>
   * Setter method for the COM property "PasteFormatWithinDocument"
   * </p>
   * @param prop Mandatory word.WdPasteOptions parameter.
   */

  @DISPID(477) //= 0x1dd. The runtime will prefer the VTID if present
  @VTID(441)
  void pasteFormatWithinDocument(
    word.WdPasteOptions prop);


  /**
   * <p>
   * Getter method for the COM property "PasteFormatBetweenDocuments"
   * </p>
   * @return  Returns a value of type word.WdPasteOptions
   */

  @DISPID(478) //= 0x1de. The runtime will prefer the VTID if present
  @VTID(442)
  word.WdPasteOptions pasteFormatBetweenDocuments();


  /**
   * <p>
   * Setter method for the COM property "PasteFormatBetweenDocuments"
   * </p>
   * @param prop Mandatory word.WdPasteOptions parameter.
   */

  @DISPID(478) //= 0x1de. The runtime will prefer the VTID if present
  @VTID(443)
  void pasteFormatBetweenDocuments(
    word.WdPasteOptions prop);


  /**
   * <p>
   * Getter method for the COM property "PasteFormatBetweenStyledDocuments"
   * </p>
   * @return  Returns a value of type word.WdPasteOptions
   */

  @DISPID(479) //= 0x1df. The runtime will prefer the VTID if present
  @VTID(444)
  word.WdPasteOptions pasteFormatBetweenStyledDocuments();


  /**
   * <p>
   * Setter method for the COM property "PasteFormatBetweenStyledDocuments"
   * </p>
   * @param prop Mandatory word.WdPasteOptions parameter.
   */

  @DISPID(479) //= 0x1df. The runtime will prefer the VTID if present
  @VTID(445)
  void pasteFormatBetweenStyledDocuments(
    word.WdPasteOptions prop);


  /**
   * <p>
   * Getter method for the COM property "PasteFormatFromExternalSource"
   * </p>
   * @return  Returns a value of type word.WdPasteOptions
   */

  @DISPID(480) //= 0x1e0. The runtime will prefer the VTID if present
  @VTID(446)
  word.WdPasteOptions pasteFormatFromExternalSource();


  /**
   * <p>
   * Setter method for the COM property "PasteFormatFromExternalSource"
   * </p>
   * @param prop Mandatory word.WdPasteOptions parameter.
   */

  @DISPID(480) //= 0x1e0. The runtime will prefer the VTID if present
  @VTID(447)
  void pasteFormatFromExternalSource(
    word.WdPasteOptions prop);


  /**
   * <p>
   * Getter method for the COM property "PasteOptionKeepBulletsAndNumbers"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(481) //= 0x1e1. The runtime will prefer the VTID if present
  @VTID(448)
  boolean pasteOptionKeepBulletsAndNumbers();


  /**
   * <p>
   * Setter method for the COM property "PasteOptionKeepBulletsAndNumbers"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(481) //= 0x1e1. The runtime will prefer the VTID if present
  @VTID(449)
  void pasteOptionKeepBulletsAndNumbers(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "INSKeyForOvertype"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(482) //= 0x1e2. The runtime will prefer the VTID if present
  @VTID(450)
  boolean insKeyForOvertype();


  /**
   * <p>
   * Setter method for the COM property "INSKeyForOvertype"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(482) //= 0x1e2. The runtime will prefer the VTID if present
  @VTID(451)
  void insKeyForOvertype(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "RepeatWord"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(483) //= 0x1e3. The runtime will prefer the VTID if present
  @VTID(452)
  boolean repeatWord();


  /**
   * <p>
   * Setter method for the COM property "RepeatWord"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(483) //= 0x1e3. The runtime will prefer the VTID if present
  @VTID(453)
  void repeatWord(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "FrenchReform"
   * </p>
   * @return  Returns a value of type word.WdFrenchSpeller
   */

  @DISPID(484) //= 0x1e4. The runtime will prefer the VTID if present
  @VTID(454)
  word.WdFrenchSpeller frenchReform();


  /**
   * <p>
   * Setter method for the COM property "FrenchReform"
   * </p>
   * @param prop Mandatory word.WdFrenchSpeller parameter.
   */

  @DISPID(484) //= 0x1e4. The runtime will prefer the VTID if present
  @VTID(455)
  void frenchReform(
    word.WdFrenchSpeller prop);


  /**
   * <p>
   * Getter method for the COM property "ContextualSpeller"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(485) //= 0x1e5. The runtime will prefer the VTID if present
  @VTID(456)
  boolean contextualSpeller();


  /**
   * <p>
   * Setter method for the COM property "ContextualSpeller"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(485) //= 0x1e5. The runtime will prefer the VTID if present
  @VTID(457)
  void contextualSpeller(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "MoveToTextColor"
   * </p>
   * @return  Returns a value of type word.WdColorIndex
   */

  @DISPID(486) //= 0x1e6. The runtime will prefer the VTID if present
  @VTID(458)
  word.WdColorIndex moveToTextColor();


  /**
   * <p>
   * Setter method for the COM property "MoveToTextColor"
   * </p>
   * @param prop Mandatory word.WdColorIndex parameter.
   */

  @DISPID(486) //= 0x1e6. The runtime will prefer the VTID if present
  @VTID(459)
  void moveToTextColor(
    word.WdColorIndex prop);


  /**
   * <p>
   * Getter method for the COM property "MoveFromTextColor"
   * </p>
   * @return  Returns a value of type word.WdColorIndex
   */

  @DISPID(487) //= 0x1e7. The runtime will prefer the VTID if present
  @VTID(460)
  word.WdColorIndex moveFromTextColor();


  /**
   * <p>
   * Setter method for the COM property "MoveFromTextColor"
   * </p>
   * @param prop Mandatory word.WdColorIndex parameter.
   */

  @DISPID(487) //= 0x1e7. The runtime will prefer the VTID if present
  @VTID(461)
  void moveFromTextColor(
    word.WdColorIndex prop);


  /**
   * <p>
   * Getter method for the COM property "OMathCopyLF"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(488) //= 0x1e8. The runtime will prefer the VTID if present
  @VTID(462)
  boolean oMathCopyLF();


  /**
   * <p>
   * Setter method for the COM property "OMathCopyLF"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(488) //= 0x1e8. The runtime will prefer the VTID if present
  @VTID(463)
  void oMathCopyLF(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "UseNormalStyleForList"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(489) //= 0x1e9. The runtime will prefer the VTID if present
  @VTID(464)
  boolean useNormalStyleForList();


  /**
   * <p>
   * Setter method for the COM property "UseNormalStyleForList"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(489) //= 0x1e9. The runtime will prefer the VTID if present
  @VTID(465)
  void useNormalStyleForList(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AllowOpenInDraftView"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(490) //= 0x1ea. The runtime will prefer the VTID if present
  @VTID(466)
  boolean allowOpenInDraftView();


  /**
   * <p>
   * Setter method for the COM property "AllowOpenInDraftView"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(490) //= 0x1ea. The runtime will prefer the VTID if present
  @VTID(467)
  void allowOpenInDraftView(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "EnableLegacyIMEMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(492) //= 0x1ec. The runtime will prefer the VTID if present
  @VTID(468)
  boolean enableLegacyIMEMode();


  /**
   * <p>
   * Setter method for the COM property "EnableLegacyIMEMode"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(492) //= 0x1ec. The runtime will prefer the VTID if present
  @VTID(469)
  void enableLegacyIMEMode(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "DoNotPromptForConvert"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(493) //= 0x1ed. The runtime will prefer the VTID if present
  @VTID(470)
  boolean doNotPromptForConvert();


  /**
   * <p>
   * Setter method for the COM property "DoNotPromptForConvert"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(493) //= 0x1ed. The runtime will prefer the VTID if present
  @VTID(471)
  void doNotPromptForConvert(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PrecisePositioning"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(494) //= 0x1ee. The runtime will prefer the VTID if present
  @VTID(472)
  boolean precisePositioning();


  /**
   * <p>
   * Setter method for the COM property "PrecisePositioning"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(494) //= 0x1ee. The runtime will prefer the VTID if present
  @VTID(473)
  void precisePositioning(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "UpdateStyleListBehavior"
   * </p>
   * @return  Returns a value of type word.WdUpdateStyleListBehavior
   */

  @DISPID(495) //= 0x1ef. The runtime will prefer the VTID if present
  @VTID(474)
  word.WdUpdateStyleListBehavior updateStyleListBehavior();


  /**
   * <p>
   * Setter method for the COM property "UpdateStyleListBehavior"
   * </p>
   * @param prop Mandatory word.WdUpdateStyleListBehavior parameter.
   */

  @DISPID(495) //= 0x1ef. The runtime will prefer the VTID if present
  @VTID(475)
  void updateStyleListBehavior(
    word.WdUpdateStyleListBehavior prop);


  /**
   * <p>
   * Getter method for the COM property "StrictTaaMarboota"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(496) //= 0x1f0. The runtime will prefer the VTID if present
  @VTID(476)
  boolean strictTaaMarboota();


  /**
   * <p>
   * Setter method for the COM property "StrictTaaMarboota"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(496) //= 0x1f0. The runtime will prefer the VTID if present
  @VTID(477)
  void strictTaaMarboota(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "StrictRussianE"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(497) //= 0x1f1. The runtime will prefer the VTID if present
  @VTID(478)
  boolean strictRussianE();


  /**
   * <p>
   * Setter method for the COM property "StrictRussianE"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(497) //= 0x1f1. The runtime will prefer the VTID if present
  @VTID(479)
  void strictRussianE(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SpanishMode"
   * </p>
   * @return  Returns a value of type word.WdSpanishSpeller
   */

  @DISPID(498) //= 0x1f2. The runtime will prefer the VTID if present
  @VTID(480)
  word.WdSpanishSpeller spanishMode();


  /**
   * <p>
   * Setter method for the COM property "SpanishMode"
   * </p>
   * @param prop Mandatory word.WdSpanishSpeller parameter.
   */

  @DISPID(498) //= 0x1f2. The runtime will prefer the VTID if present
  @VTID(481)
  void spanishMode(
    word.WdSpanishSpeller prop);


  /**
   * <p>
   * Getter method for the COM property "PortugalReform"
   * </p>
   * @return  Returns a value of type word.WdPortugueseReform
   */

  @DISPID(501) //= 0x1f5. The runtime will prefer the VTID if present
  @VTID(482)
  word.WdPortugueseReform portugalReform();


  /**
   * <p>
   * Setter method for the COM property "PortugalReform"
   * </p>
   * @param prop Mandatory word.WdPortugueseReform parameter.
   */

  @DISPID(501) //= 0x1f5. The runtime will prefer the VTID if present
  @VTID(483)
  void portugalReform(
    word.WdPortugueseReform prop);


  /**
   * <p>
   * Getter method for the COM property "BrazilReform"
   * </p>
   * @return  Returns a value of type word.WdPortugueseReform
   */

  @DISPID(502) //= 0x1f6. The runtime will prefer the VTID if present
  @VTID(484)
  word.WdPortugueseReform brazilReform();


  /**
   * <p>
   * Setter method for the COM property "BrazilReform"
   * </p>
   * @param prop Mandatory word.WdPortugueseReform parameter.
   */

  @DISPID(502) //= 0x1f6. The runtime will prefer the VTID if present
  @VTID(485)
  void brazilReform(
    word.WdPortugueseReform prop);


  /**
   * <p>
   * Getter method for the COM property "UpdateFieldsWithTrackedChangesAtPrint"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(503) //= 0x1f7. The runtime will prefer the VTID if present
  @VTID(486)
  boolean updateFieldsWithTrackedChangesAtPrint();


  /**
   * <p>
   * Setter method for the COM property "UpdateFieldsWithTrackedChangesAtPrint"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(503) //= 0x1f7. The runtime will prefer the VTID if present
  @VTID(487)
  void updateFieldsWithTrackedChangesAtPrint(
    boolean prop);


  // Properties:
}
