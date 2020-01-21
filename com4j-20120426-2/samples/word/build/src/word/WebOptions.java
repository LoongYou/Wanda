package word  ;

import com4j.*;

@IID("{000209E4-0000-0000-C000-000000000046}")
public interface WebOptions extends Com4jObject {
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
   * Getter method for the COM property "UseLongFileNames"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(18)
  boolean useLongFileNames();


  /**
   * <p>
   * Setter method for the COM property "UseLongFileNames"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(19)
  void useLongFileNames(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "RelyOnVML"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(20)
  boolean relyOnVML();


  /**
   * <p>
   * Setter method for the COM property "RelyOnVML"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(21)
  void relyOnVML(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "AllowPNG"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(22)
  boolean allowPNG();


  /**
   * <p>
   * Setter method for the COM property "AllowPNG"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(23)
  void allowPNG(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ScreenSize"
   * </p>
   * @return  Returns a value of type office.MsoScreenSize
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(24)
  office.MsoScreenSize screenSize();


  /**
   * <p>
   * Setter method for the COM property "ScreenSize"
   * </p>
   * @param prop Mandatory office.MsoScreenSize parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(25)
  void screenSize(
    office.MsoScreenSize prop);


  /**
   * <p>
   * Getter method for the COM property "PixelsPerInch"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(26)
  int pixelsPerInch();


  /**
   * <p>
   * Setter method for the COM property "PixelsPerInch"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(27)
  void pixelsPerInch(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Encoding"
   * </p>
   * @return  Returns a value of type office.MsoEncoding
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(28)
  office.MsoEncoding encoding();


  /**
   * <p>
   * Setter method for the COM property "Encoding"
   * </p>
   * @param prop Mandatory office.MsoEncoding parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(29)
  void encoding(
    office.MsoEncoding prop);


  /**
   * <p>
   * Getter method for the COM property "FolderSuffix"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(30)
  java.lang.String folderSuffix();


  /**
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(31)
  void useDefaultFolderSuffix();


  /**
   * <p>
   * Getter method for the COM property "TargetBrowser"
   * </p>
   * @return  Returns a value of type office.MsoTargetBrowser
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(32)
  office.MsoTargetBrowser targetBrowser();


  /**
   * <p>
   * Setter method for the COM property "TargetBrowser"
   * </p>
   * @param prop Mandatory office.MsoTargetBrowser parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(33)
  void targetBrowser(
    office.MsoTargetBrowser prop);


  // Properties:
}
