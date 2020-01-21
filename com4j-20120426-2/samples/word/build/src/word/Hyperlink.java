package word  ;

import com4j.*;

@IID("{0002099D-0000-0000-C000-000000000046}")
public interface Hyperlink extends Com4jObject {
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

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "AddressOld"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String addressOld();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type office.MsoHyperlinkType
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(12)
  office.MsoHyperlinkType type();


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(13)
  word.Range range();


  /**
   * <p>
   * Getter method for the COM property "Shape"
   * </p>
   * @return  Returns a value of type word.Shape
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(14)
  word.Shape shape();


  /**
   * <p>
   * Getter method for the COM property "SubAddressOld"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String subAddressOld();


  /**
   * <p>
   * Getter method for the COM property "ExtraInfoRequired"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(16)
  boolean extraInfoRequired();


  /**
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(17)
  void delete();


  /**
   * @param newWindow Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addHistory Optional parameter. Default value is com4j.Variant.getMissing()
   * @param extraInfo Optional parameter. Default value is com4j.Variant.getMissing()
   * @param method Optional parameter. Default value is com4j.Variant.getMissing()
   * @param headerInfo Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(18)
  void follow(
    @Optional java.lang.Object newWindow,
    @Optional java.lang.Object addHistory,
    @Optional java.lang.Object extraInfo,
    @Optional java.lang.Object method,
    @Optional java.lang.Object headerInfo);


  /**
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(19)
  void addToFavorites();


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param editNow Mandatory boolean parameter.
   * @param overwrite Mandatory boolean parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(20)
  void createNewDocument(
    java.lang.String fileName,
    boolean editNow,
    boolean overwrite);


  /**
   * <p>
   * Getter method for the COM property "Address"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1100) //= 0x44c. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String address();


  /**
   * <p>
   * Setter method for the COM property "Address"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(1100) //= 0x44c. The runtime will prefer the VTID if present
  @VTID(22)
  void address(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "SubAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1101) //= 0x44d. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String subAddress();


  /**
   * <p>
   * Setter method for the COM property "SubAddress"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(1101) //= 0x44d. The runtime will prefer the VTID if present
  @VTID(24)
  void subAddress(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "EmailSubject"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String emailSubject();


  /**
   * <p>
   * Setter method for the COM property "EmailSubject"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(26)
  void emailSubject(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "ScreenTip"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String screenTip();


  /**
   * <p>
   * Setter method for the COM property "ScreenTip"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(28)
  void screenTip(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "TextToDisplay"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(29)
  java.lang.String textToDisplay();


  /**
   * <p>
   * Setter method for the COM property "TextToDisplay"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(30)
  void textToDisplay(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Target"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1013) //= 0x3f5. The runtime will prefer the VTID if present
  @VTID(31)
  java.lang.String target();


  /**
   * <p>
   * Setter method for the COM property "Target"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(1013) //= 0x3f5. The runtime will prefer the VTID if present
  @VTID(32)
  void target(
    java.lang.String prop);


  // Properties:
}
