package word  ;

import com4j.*;

@IID("{000209E3-0000-0000-C000-000000000046}")
public interface DefaultWebOptions extends Com4jObject {
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
   * Getter method for the COM property "OptimizeForBrowser"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  boolean optimizeForBrowser();


  /**
   * <p>
   * Setter method for the COM property "OptimizeForBrowser"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  void optimizeForBrowser(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "BrowserLevel"
   * </p>
   * @return  Returns a value of type word.WdBrowserLevel
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  word.WdBrowserLevel browserLevel();


  /**
   * <p>
   * Setter method for the COM property "BrowserLevel"
   * </p>
   * @param prop Mandatory word.WdBrowserLevel parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(13)
  void browserLevel(
    word.WdBrowserLevel prop);


  /**
   * <p>
   * Getter method for the COM property "RelyOnCSS"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(14)
  boolean relyOnCSS();


  /**
   * <p>
   * Setter method for the COM property "RelyOnCSS"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(15)
  void relyOnCSS(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "OrganizeInFolder"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(16)
  boolean organizeInFolder();


  /**
   * <p>
   * Setter method for the COM property "OrganizeInFolder"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(17)
  void organizeInFolder(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "UpdateLinksOnSave"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(18)
  boolean updateLinksOnSave();


  /**
   * <p>
   * Setter method for the COM property "UpdateLinksOnSave"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(19)
  void updateLinksOnSave(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "UseLongFileNames"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(20)
  boolean useLongFileNames();


  /**
   * <p>
   * Setter method for the COM property "UseLongFileNames"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(21)
  void useLongFileNames(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "CheckIfOfficeIsHTMLEditor"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(22)
  boolean checkIfOfficeIsHTMLEditor();


  /**
   * <p>
   * Setter method for the COM property "CheckIfOfficeIsHTMLEditor"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(23)
  void checkIfOfficeIsHTMLEditor(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "CheckIfWordIsDefaultHTMLEditor"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(24)
  boolean checkIfWordIsDefaultHTMLEditor();


  /**
   * <p>
   * Setter method for the COM property "CheckIfWordIsDefaultHTMLEditor"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(25)
  void checkIfWordIsDefaultHTMLEditor(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "RelyOnVML"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(26)
  boolean relyOnVML();


  /**
   * <p>
   * Setter method for the COM property "RelyOnVML"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(27)
  void relyOnVML(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AllowPNG"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(28)
  boolean allowPNG();


  /**
   * <p>
   * Setter method for the COM property "AllowPNG"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(29)
  void allowPNG(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ScreenSize"
   * </p>
   * @return  Returns a value of type office.MsoScreenSize
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(30)
  office.MsoScreenSize screenSize();


  /**
   * <p>
   * Setter method for the COM property "ScreenSize"
   * </p>
   * @param prop Mandatory office.MsoScreenSize parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(31)
  void screenSize(
    office.MsoScreenSize prop);


  /**
   * <p>
   * Getter method for the COM property "PixelsPerInch"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(32)
  int pixelsPerInch();


  /**
   * <p>
   * Setter method for the COM property "PixelsPerInch"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(33)
  void pixelsPerInch(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Encoding"
   * </p>
   * @return  Returns a value of type office.MsoEncoding
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(34)
  office.MsoEncoding encoding();


  /**
   * <p>
   * Setter method for the COM property "Encoding"
   * </p>
   * @param prop Mandatory office.MsoEncoding parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(35)
  void encoding(
    office.MsoEncoding prop);


  /**
   * <p>
   * Getter method for the COM property "AlwaysSaveInDefaultEncoding"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(36)
  boolean alwaysSaveInDefaultEncoding();


  /**
   * <p>
   * Setter method for the COM property "AlwaysSaveInDefaultEncoding"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(37)
  void alwaysSaveInDefaultEncoding(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Fonts"
   * </p>
   * @return  Returns a value of type office.WebPageFonts
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(38)
  office.WebPageFonts fonts();


  @VTID(38)
  @ReturnValue(defaultPropertyThrough={office.WebPageFonts.class})
  office.WebPageFont fonts(
    office.MsoCharacterSet index);

  /**
   * <p>
   * Getter method for the COM property "FolderSuffix"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(39)
  java.lang.String folderSuffix();


  /**
   * <p>
   * Getter method for the COM property "TargetBrowser"
   * </p>
   * @return  Returns a value of type office.MsoTargetBrowser
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(40)
  office.MsoTargetBrowser targetBrowser();


  /**
   * <p>
   * Setter method for the COM property "TargetBrowser"
   * </p>
   * @param prop Mandatory office.MsoTargetBrowser parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(41)
  void targetBrowser(
    office.MsoTargetBrowser prop);


  /**
   * <p>
   * Getter method for the COM property "SaveNewWebPagesAsWebArchives"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(42)
  boolean saveNewWebPagesAsWebArchives();


  /**
   * <p>
   * Setter method for the COM property "SaveNewWebPagesAsWebArchives"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(43)
  void saveNewWebPagesAsWebArchives(
    boolean prop);


  // Properties:
}
