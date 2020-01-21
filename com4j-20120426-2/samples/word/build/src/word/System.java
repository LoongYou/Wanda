package word  ;

import com4j.*;

@IID("{00020935-0000-0000-C000-000000000046}")
public interface System extends Com4jObject {
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
   * Getter method for the COM property "OperatingSystem"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String operatingSystem();


  /**
   * <p>
   * Getter method for the COM property "ProcessorType"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String processorType();


  /**
   * <p>
   * Getter method for the COM property "Version"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String version();


  /**
   * <p>
   * Getter method for the COM property "FreeDiskSpace"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  int freeDiskSpace();


  /**
   * <p>
   * Getter method for the COM property "Country"
   * </p>
   * @return  Returns a value of type word.WdCountry
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(14)
  word.WdCountry country();


  /**
   * <p>
   * Getter method for the COM property "LanguageDesignation"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String languageDesignation();


  /**
   * <p>
   * Getter method for the COM property "HorizontalResolution"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(16)
  int horizontalResolution();


  /**
   * <p>
   * Getter method for the COM property "VerticalResolution"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(17)
  int verticalResolution();


  /**
   * <p>
   * Getter method for the COM property "ProfileString"
   * </p>
   * @param section Mandatory java.lang.String parameter.
   * @param key Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String profileString(
    java.lang.String section,
    java.lang.String key);


  /**
   * <p>
   * Setter method for the COM property "ProfileString"
   * </p>
   * @param section Mandatory java.lang.String parameter.
   * @param key Mandatory java.lang.String parameter.
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(19)
  void profileString(
    java.lang.String section,
    java.lang.String key,
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "PrivateProfileString"
   * </p>
   * @param fileName Mandatory java.lang.String parameter.
   * @param section Mandatory java.lang.String parameter.
   * @param key Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String privateProfileString(
    java.lang.String fileName,
    java.lang.String section,
    java.lang.String key);


  /**
   * <p>
   * Setter method for the COM property "PrivateProfileString"
   * </p>
   * @param fileName Mandatory java.lang.String parameter.
   * @param section Mandatory java.lang.String parameter.
   * @param key Mandatory java.lang.String parameter.
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(21)
  void privateProfileString(
    java.lang.String fileName,
    java.lang.String section,
    java.lang.String key,
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "MathCoprocessorInstalled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(22)
  boolean mathCoprocessorInstalled();


  /**
   * <p>
   * Getter method for the COM property "ComputerType"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String computerType();


  /**
   * <p>
   * Getter method for the COM property "MacintoshName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(24)
  java.lang.String macintoshName();


  /**
   * <p>
   * Getter method for the COM property "QuickDrawInstalled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(25)
  boolean quickDrawInstalled();


  /**
   * <p>
   * Getter method for the COM property "Cursor"
   * </p>
   * @return  Returns a value of type word.WdCursorType
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(26)
  word.WdCursorType cursor();


  /**
   * <p>
   * Setter method for the COM property "Cursor"
   * </p>
   * @param prop Mandatory word.WdCursorType parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(27)
  void cursor(
    word.WdCursorType prop);


  /**
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(28)
  void msInfo();


  /**
   * @param path Mandatory java.lang.String parameter.
   * @param drive Optional parameter. Default value is com4j.Variant.getMissing()
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(29)
  void connect(
    java.lang.String path,
    @Optional java.lang.Object drive,
    @Optional java.lang.Object password);


  /**
   * <p>
   * Getter method for the COM property "CountryRegion"
   * </p>
   * @return  Returns a value of type word.WdCountry
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(30)
  word.WdCountry countryRegion();


  // Properties:
}
