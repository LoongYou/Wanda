package ppt  ;

import com4j.*;

@IID("{91493465-5A91-11CF-8700-00AA0060263B}")
public interface Hyperlink extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  ppt._Application application();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type office.MsoHyperlinkType
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  office.MsoHyperlinkType type();


  /**
   * <p>
   * Getter method for the COM property "Address"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String address();


  /**
   * <p>
   * Setter method for the COM property "Address"
   * </p>
   * @param address Mandatory java.lang.String parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(11)
  void address(
    java.lang.String address);


  /**
   * <p>
   * Getter method for the COM property "SubAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String subAddress();


  /**
   * <p>
   * Setter method for the COM property "SubAddress"
   * </p>
   * @param subAddress Mandatory java.lang.String parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(13)
  void subAddress(
    java.lang.String subAddress);


  /**
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(14)
  void addToFavorites();


  /**
   * <p>
   * Getter method for the COM property "EmailSubject"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String emailSubject();


  /**
   * <p>
   * Setter method for the COM property "EmailSubject"
   * </p>
   * @param emailSubject Mandatory java.lang.String parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(16)
  void emailSubject(
    java.lang.String emailSubject);


  /**
   * <p>
   * Getter method for the COM property "ScreenTip"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String screenTip();


  /**
   * <p>
   * Setter method for the COM property "ScreenTip"
   * </p>
   * @param screenTip Mandatory java.lang.String parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(18)
  void screenTip(
    java.lang.String screenTip);


  /**
   * <p>
   * Getter method for the COM property "TextToDisplay"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String textToDisplay();


  /**
   * <p>
   * Setter method for the COM property "TextToDisplay"
   * </p>
   * @param textToDisplay Mandatory java.lang.String parameter.
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(20)
  void textToDisplay(
    java.lang.String textToDisplay);


  /**
   * <p>
   * Getter method for the COM property "ShowAndReturn"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(21)
  office.MsoTriState showAndReturn();


  /**
   * <p>
   * Setter method for the COM property "ShowAndReturn"
   * </p>
   * @param showAndReturn Mandatory office.MsoTriState parameter.
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(22)
  void showAndReturn(
    office.MsoTriState showAndReturn);


  /**
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(23)
  void follow();


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param editNow Mandatory office.MsoTriState parameter.
   * @param overwrite Mandatory office.MsoTriState parameter.
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(24)
  void createNewDocument(
    java.lang.String fileName,
    office.MsoTriState editNow,
    office.MsoTriState overwrite);


  /**
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(25)
  void delete();


  // Properties:
}
