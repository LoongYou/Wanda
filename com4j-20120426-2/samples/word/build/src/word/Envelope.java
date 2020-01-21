package word  ;

import com4j.*;

@IID("{00020918-0000-0000-C000-000000000046}")
public interface Envelope extends Com4jObject {
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
   * Getter method for the COM property "Address"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  word.Range address();


  /**
   * <p>
   * Getter method for the COM property "ReturnAddress"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  word.Range returnAddress();


  /**
   * <p>
   * Getter method for the COM property "DefaultPrintBarCode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  boolean defaultPrintBarCode();


  /**
   * <p>
   * Setter method for the COM property "DefaultPrintBarCode"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  void defaultPrintBarCode(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "DefaultPrintFIMA"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(14)
  boolean defaultPrintFIMA();


  /**
   * <p>
   * Setter method for the COM property "DefaultPrintFIMA"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  void defaultPrintFIMA(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "DefaultHeight"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  float defaultHeight();


  /**
   * <p>
   * Setter method for the COM property "DefaultHeight"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  void defaultHeight(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "DefaultWidth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(18)
  float defaultWidth();


  /**
   * <p>
   * Setter method for the COM property "DefaultWidth"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  void defaultWidth(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "DefaultSize"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(20)
  @DefaultMethod
  java.lang.String defaultSize();


  /**
   * <p>
   * Setter method for the COM property "DefaultSize"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(21)
  @DefaultMethod
  void defaultSize(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "DefaultOmitReturnAddress"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(22)
  boolean defaultOmitReturnAddress();


  /**
   * <p>
   * Setter method for the COM property "DefaultOmitReturnAddress"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  void defaultOmitReturnAddress(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "FeedSource"
   * </p>
   * @return  Returns a value of type word.WdPaperTray
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(24)
  word.WdPaperTray feedSource();


  /**
   * <p>
   * Setter method for the COM property "FeedSource"
   * </p>
   * @param prop Mandatory word.WdPaperTray parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(25)
  void feedSource(
    word.WdPaperTray prop);


  /**
   * <p>
   * Getter method for the COM property "AddressFromLeft"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(26)
  float addressFromLeft();


  /**
   * <p>
   * Setter method for the COM property "AddressFromLeft"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(27)
  void addressFromLeft(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "AddressFromTop"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(28)
  float addressFromTop();


  /**
   * <p>
   * Setter method for the COM property "AddressFromTop"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(29)
  void addressFromTop(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "ReturnAddressFromLeft"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(30)
  float returnAddressFromLeft();


  /**
   * <p>
   * Setter method for the COM property "ReturnAddressFromLeft"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(31)
  void returnAddressFromLeft(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "ReturnAddressFromTop"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(32)
  float returnAddressFromTop();


  /**
   * <p>
   * Setter method for the COM property "ReturnAddressFromTop"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(33)
  void returnAddressFromTop(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "AddressStyle"
   * </p>
   * @return  Returns a value of type word.Style
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(34)
  word.Style addressStyle();


  /**
   * <p>
   * Getter method for the COM property "ReturnAddressStyle"
   * </p>
   * @return  Returns a value of type word.Style
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(35)
  word.Style returnAddressStyle();


  /**
   * <p>
   * Getter method for the COM property "DefaultOrientation"
   * </p>
   * @return  Returns a value of type word.WdEnvelopeOrientation
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(36)
  word.WdEnvelopeOrientation defaultOrientation();


  /**
   * <p>
   * Setter method for the COM property "DefaultOrientation"
   * </p>
   * @param prop Mandatory word.WdEnvelopeOrientation parameter.
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(37)
  void defaultOrientation(
    word.WdEnvelopeOrientation prop);


  /**
   * <p>
   * Getter method for the COM property "DefaultFaceUp"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(38)
  boolean defaultFaceUp();


  /**
   * <p>
   * Setter method for the COM property "DefaultFaceUp"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(39)
  void defaultFaceUp(
    boolean prop);


  /**
   * @param extractAddress Optional parameter. Default value is com4j.Variant.getMissing()
   * @param address Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param omitReturnAddress Optional parameter. Default value is com4j.Variant.getMissing()
   * @param returnAddress Optional parameter. Default value is com4j.Variant.getMissing()
   * @param returnAutoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printBarCode Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printFIMA Optional parameter. Default value is com4j.Variant.getMissing()
   * @param size Optional parameter. Default value is com4j.Variant.getMissing()
   * @param height Optional parameter. Default value is com4j.Variant.getMissing()
   * @param width Optional parameter. Default value is com4j.Variant.getMissing()
   * @param feedSource Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addressFromLeft Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addressFromTop Optional parameter. Default value is com4j.Variant.getMissing()
   * @param returnAddressFromLeft Optional parameter. Default value is com4j.Variant.getMissing()
   * @param returnAddressFromTop Optional parameter. Default value is com4j.Variant.getMissing()
   * @param defaultFaceUp Optional parameter. Default value is com4j.Variant.getMissing()
   * @param defaultOrientation Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(40)
  void insert2000(
    @Optional java.lang.Object extractAddress,
    @Optional java.lang.Object address,
    @Optional java.lang.Object autoText,
    @Optional java.lang.Object omitReturnAddress,
    @Optional java.lang.Object returnAddress,
    @Optional java.lang.Object returnAutoText,
    @Optional java.lang.Object printBarCode,
    @Optional java.lang.Object printFIMA,
    @Optional java.lang.Object size,
    @Optional java.lang.Object height,
    @Optional java.lang.Object width,
    @Optional java.lang.Object feedSource,
    @Optional java.lang.Object addressFromLeft,
    @Optional java.lang.Object addressFromTop,
    @Optional java.lang.Object returnAddressFromLeft,
    @Optional java.lang.Object returnAddressFromTop,
    @Optional java.lang.Object defaultFaceUp,
    @Optional java.lang.Object defaultOrientation);


  /**
   * @param extractAddress Optional parameter. Default value is com4j.Variant.getMissing()
   * @param address Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param omitReturnAddress Optional parameter. Default value is com4j.Variant.getMissing()
   * @param returnAddress Optional parameter. Default value is com4j.Variant.getMissing()
   * @param returnAutoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printBarCode Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printFIMA Optional parameter. Default value is com4j.Variant.getMissing()
   * @param size Optional parameter. Default value is com4j.Variant.getMissing()
   * @param height Optional parameter. Default value is com4j.Variant.getMissing()
   * @param width Optional parameter. Default value is com4j.Variant.getMissing()
   * @param feedSource Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addressFromLeft Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addressFromTop Optional parameter. Default value is com4j.Variant.getMissing()
   * @param returnAddressFromLeft Optional parameter. Default value is com4j.Variant.getMissing()
   * @param returnAddressFromTop Optional parameter. Default value is com4j.Variant.getMissing()
   * @param defaultFaceUp Optional parameter. Default value is com4j.Variant.getMissing()
   * @param defaultOrientation Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(41)
  void printOut2000(
    @Optional java.lang.Object extractAddress,
    @Optional java.lang.Object address,
    @Optional java.lang.Object autoText,
    @Optional java.lang.Object omitReturnAddress,
    @Optional java.lang.Object returnAddress,
    @Optional java.lang.Object returnAutoText,
    @Optional java.lang.Object printBarCode,
    @Optional java.lang.Object printFIMA,
    @Optional java.lang.Object size,
    @Optional java.lang.Object height,
    @Optional java.lang.Object width,
    @Optional java.lang.Object feedSource,
    @Optional java.lang.Object addressFromLeft,
    @Optional java.lang.Object addressFromTop,
    @Optional java.lang.Object returnAddressFromLeft,
    @Optional java.lang.Object returnAddressFromTop,
    @Optional java.lang.Object defaultFaceUp,
    @Optional java.lang.Object defaultOrientation);


  /**
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(42)
  void updateDocument();


  /**
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(43)
  void options();


  /**
   * <p>
   * Getter method for the COM property "Vertical"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(44)
  boolean vertical();


  /**
   * <p>
   * Setter method for the COM property "Vertical"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(45)
  void vertical(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "RecipientNamefromLeft"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(46)
  float recipientNamefromLeft();


  /**
   * <p>
   * Setter method for the COM property "RecipientNamefromLeft"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(47)
  void recipientNamefromLeft(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "RecipientNamefromTop"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(48)
  float recipientNamefromTop();


  /**
   * <p>
   * Setter method for the COM property "RecipientNamefromTop"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(49)
  void recipientNamefromTop(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "RecipientPostalfromLeft"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(50)
  float recipientPostalfromLeft();


  /**
   * <p>
   * Setter method for the COM property "RecipientPostalfromLeft"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(51)
  void recipientPostalfromLeft(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "RecipientPostalfromTop"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(52)
  float recipientPostalfromTop();


  /**
   * <p>
   * Setter method for the COM property "RecipientPostalfromTop"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(53)
  void recipientPostalfromTop(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "SenderNamefromLeft"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(54)
  float senderNamefromLeft();


  /**
   * <p>
   * Setter method for the COM property "SenderNamefromLeft"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(55)
  void senderNamefromLeft(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "SenderNamefromTop"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(56)
  float senderNamefromTop();


  /**
   * <p>
   * Setter method for the COM property "SenderNamefromTop"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(57)
  void senderNamefromTop(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "SenderPostalfromLeft"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(58)
  float senderPostalfromLeft();


  /**
   * <p>
   * Setter method for the COM property "SenderPostalfromLeft"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(59)
  void senderPostalfromLeft(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "SenderPostalfromTop"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(60)
  float senderPostalfromTop();


  /**
   * <p>
   * Setter method for the COM property "SenderPostalfromTop"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(61)
  void senderPostalfromTop(
    float prop);


  /**
   * @param extractAddress Optional parameter. Default value is com4j.Variant.getMissing()
   * @param address Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param omitReturnAddress Optional parameter. Default value is com4j.Variant.getMissing()
   * @param returnAddress Optional parameter. Default value is com4j.Variant.getMissing()
   * @param returnAutoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printBarCode Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printFIMA Optional parameter. Default value is com4j.Variant.getMissing()
   * @param size Optional parameter. Default value is com4j.Variant.getMissing()
   * @param height Optional parameter. Default value is com4j.Variant.getMissing()
   * @param width Optional parameter. Default value is com4j.Variant.getMissing()
   * @param feedSource Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addressFromLeft Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addressFromTop Optional parameter. Default value is com4j.Variant.getMissing()
   * @param returnAddressFromLeft Optional parameter. Default value is com4j.Variant.getMissing()
   * @param returnAddressFromTop Optional parameter. Default value is com4j.Variant.getMissing()
   * @param defaultFaceUp Optional parameter. Default value is com4j.Variant.getMissing()
   * @param defaultOrientation Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printEPostage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param vertical Optional parameter. Default value is com4j.Variant.getMissing()
   * @param recipientNamefromLeft Optional parameter. Default value is com4j.Variant.getMissing()
   * @param recipientNamefromTop Optional parameter. Default value is com4j.Variant.getMissing()
   * @param recipientPostalfromLeft Optional parameter. Default value is com4j.Variant.getMissing()
   * @param recipientPostalfromTop Optional parameter. Default value is com4j.Variant.getMissing()
   * @param senderNamefromLeft Optional parameter. Default value is com4j.Variant.getMissing()
   * @param senderNamefromTop Optional parameter. Default value is com4j.Variant.getMissing()
   * @param senderPostalfromLeft Optional parameter. Default value is com4j.Variant.getMissing()
   * @param senderPostalfromTop Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(62)
  void insert(
    @Optional java.lang.Object extractAddress,
    @Optional java.lang.Object address,
    @Optional java.lang.Object autoText,
    @Optional java.lang.Object omitReturnAddress,
    @Optional java.lang.Object returnAddress,
    @Optional java.lang.Object returnAutoText,
    @Optional java.lang.Object printBarCode,
    @Optional java.lang.Object printFIMA,
    @Optional java.lang.Object size,
    @Optional java.lang.Object height,
    @Optional java.lang.Object width,
    @Optional java.lang.Object feedSource,
    @Optional java.lang.Object addressFromLeft,
    @Optional java.lang.Object addressFromTop,
    @Optional java.lang.Object returnAddressFromLeft,
    @Optional java.lang.Object returnAddressFromTop,
    @Optional java.lang.Object defaultFaceUp,
    @Optional java.lang.Object defaultOrientation,
    @Optional java.lang.Object printEPostage,
    @Optional java.lang.Object vertical,
    @Optional java.lang.Object recipientNamefromLeft,
    @Optional java.lang.Object recipientNamefromTop,
    @Optional java.lang.Object recipientPostalfromLeft,
    @Optional java.lang.Object recipientPostalfromTop,
    @Optional java.lang.Object senderNamefromLeft,
    @Optional java.lang.Object senderNamefromTop,
    @Optional java.lang.Object senderPostalfromLeft,
    @Optional java.lang.Object senderPostalfromTop);


  /**
   * @param extractAddress Optional parameter. Default value is com4j.Variant.getMissing()
   * @param address Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param omitReturnAddress Optional parameter. Default value is com4j.Variant.getMissing()
   * @param returnAddress Optional parameter. Default value is com4j.Variant.getMissing()
   * @param returnAutoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printBarCode Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printFIMA Optional parameter. Default value is com4j.Variant.getMissing()
   * @param size Optional parameter. Default value is com4j.Variant.getMissing()
   * @param height Optional parameter. Default value is com4j.Variant.getMissing()
   * @param width Optional parameter. Default value is com4j.Variant.getMissing()
   * @param feedSource Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addressFromLeft Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addressFromTop Optional parameter. Default value is com4j.Variant.getMissing()
   * @param returnAddressFromLeft Optional parameter. Default value is com4j.Variant.getMissing()
   * @param returnAddressFromTop Optional parameter. Default value is com4j.Variant.getMissing()
   * @param defaultFaceUp Optional parameter. Default value is com4j.Variant.getMissing()
   * @param defaultOrientation Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printEPostage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param vertical Optional parameter. Default value is com4j.Variant.getMissing()
   * @param recipientNamefromLeft Optional parameter. Default value is com4j.Variant.getMissing()
   * @param recipientNamefromTop Optional parameter. Default value is com4j.Variant.getMissing()
   * @param recipientPostalfromLeft Optional parameter. Default value is com4j.Variant.getMissing()
   * @param recipientPostalfromTop Optional parameter. Default value is com4j.Variant.getMissing()
   * @param senderNamefromLeft Optional parameter. Default value is com4j.Variant.getMissing()
   * @param senderNamefromTop Optional parameter. Default value is com4j.Variant.getMissing()
   * @param senderPostalfromLeft Optional parameter. Default value is com4j.Variant.getMissing()
   * @param senderPostalfromTop Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(63)
  void printOut(
    @Optional java.lang.Object extractAddress,
    @Optional java.lang.Object address,
    @Optional java.lang.Object autoText,
    @Optional java.lang.Object omitReturnAddress,
    @Optional java.lang.Object returnAddress,
    @Optional java.lang.Object returnAutoText,
    @Optional java.lang.Object printBarCode,
    @Optional java.lang.Object printFIMA,
    @Optional java.lang.Object size,
    @Optional java.lang.Object height,
    @Optional java.lang.Object width,
    @Optional java.lang.Object feedSource,
    @Optional java.lang.Object addressFromLeft,
    @Optional java.lang.Object addressFromTop,
    @Optional java.lang.Object returnAddressFromLeft,
    @Optional java.lang.Object returnAddressFromTop,
    @Optional java.lang.Object defaultFaceUp,
    @Optional java.lang.Object defaultOrientation,
    @Optional java.lang.Object printEPostage,
    @Optional java.lang.Object vertical,
    @Optional java.lang.Object recipientNamefromLeft,
    @Optional java.lang.Object recipientNamefromTop,
    @Optional java.lang.Object recipientPostalfromLeft,
    @Optional java.lang.Object recipientPostalfromTop,
    @Optional java.lang.Object senderNamefromLeft,
    @Optional java.lang.Object senderNamefromTop,
    @Optional java.lang.Object senderPostalfromLeft,
    @Optional java.lang.Object senderPostalfromTop);


  // Properties:
}
