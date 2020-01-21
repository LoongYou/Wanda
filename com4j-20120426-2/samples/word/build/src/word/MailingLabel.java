package word  ;

import com4j.*;

@IID("{00020917-0000-0000-C000-000000000046}")
public interface MailingLabel extends Com4jObject {
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
   * Getter method for the COM property "DefaultPrintBarCode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  boolean defaultPrintBarCode();


  /**
   * <p>
   * Setter method for the COM property "DefaultPrintBarCode"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  void defaultPrintBarCode(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "DefaultLaserTray"
   * </p>
   * @return  Returns a value of type word.WdPaperTray
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  word.WdPaperTray defaultLaserTray();


  /**
   * <p>
   * Setter method for the COM property "DefaultLaserTray"
   * </p>
   * @param prop Mandatory word.WdPaperTray parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  void defaultLaserTray(
    word.WdPaperTray prop);


  /**
   * <p>
   * Getter method for the COM property "CustomLabels"
   * </p>
   * @return  Returns a value of type word.CustomLabels
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  word.CustomLabels customLabels();


  @VTID(14)
  @ReturnValue(defaultPropertyThrough={word.CustomLabels.class})
  word.CustomLabel customLabels(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "DefaultLabelName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String defaultLabelName();


  /**
   * <p>
   * Setter method for the COM property "DefaultLabelName"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(16)
  void defaultLabelName(
    java.lang.String prop);


  /**
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param address Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param extractAddress Optional parameter. Default value is com4j.Variant.getMissing()
   * @param laserTray Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word._Document
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(17)
  word._Document createNewDocument2000(
    @Optional java.lang.Object name,
    @Optional java.lang.Object address,
    @Optional java.lang.Object autoText,
    @Optional java.lang.Object extractAddress,
    @Optional java.lang.Object laserTray);


  /**
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param address Optional parameter. Default value is com4j.Variant.getMissing()
   * @param extractAddress Optional parameter. Default value is com4j.Variant.getMissing()
   * @param laserTray Optional parameter. Default value is com4j.Variant.getMissing()
   * @param singleLabel Optional parameter. Default value is com4j.Variant.getMissing()
   * @param row Optional parameter. Default value is com4j.Variant.getMissing()
   * @param column Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(18)
  void printOut2000(
    @Optional java.lang.Object name,
    @Optional java.lang.Object address,
    @Optional java.lang.Object extractAddress,
    @Optional java.lang.Object laserTray,
    @Optional java.lang.Object singleLabel,
    @Optional java.lang.Object row,
    @Optional java.lang.Object column);


  /**
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(19)
  void labelOptions();


  /**
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param address Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param extractAddress Optional parameter. Default value is com4j.Variant.getMissing()
   * @param laserTray Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printEPostageLabel Optional parameter. Default value is com4j.Variant.getMissing()
   * @param vertical Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word._Document
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(20)
  word._Document createNewDocument(
    @Optional java.lang.Object name,
    @Optional java.lang.Object address,
    @Optional java.lang.Object autoText,
    @Optional java.lang.Object extractAddress,
    @Optional java.lang.Object laserTray,
    @Optional java.lang.Object printEPostageLabel,
    @Optional java.lang.Object vertical);


  /**
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param address Optional parameter. Default value is com4j.Variant.getMissing()
   * @param extractAddress Optional parameter. Default value is com4j.Variant.getMissing()
   * @param laserTray Optional parameter. Default value is com4j.Variant.getMissing()
   * @param singleLabel Optional parameter. Default value is com4j.Variant.getMissing()
   * @param row Optional parameter. Default value is com4j.Variant.getMissing()
   * @param column Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printEPostageLabel Optional parameter. Default value is com4j.Variant.getMissing()
   * @param vertical Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(21)
  void printOut(
    @Optional java.lang.Object name,
    @Optional java.lang.Object address,
    @Optional java.lang.Object extractAddress,
    @Optional java.lang.Object laserTray,
    @Optional java.lang.Object singleLabel,
    @Optional java.lang.Object row,
    @Optional java.lang.Object column,
    @Optional java.lang.Object printEPostageLabel,
    @Optional java.lang.Object vertical);


  /**
   * <p>
   * Getter method for the COM property "Vertical"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(22)
  boolean vertical();


  /**
   * <p>
   * Setter method for the COM property "Vertical"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(23)
  void vertical(
    boolean prop);


  /**
   * @param labelID Optional parameter. Default value is com4j.Variant.getMissing()
   * @param address Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param extractAddress Optional parameter. Default value is com4j.Variant.getMissing()
   * @param laserTray Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printEPostageLabel Optional parameter. Default value is com4j.Variant.getMissing()
   * @param vertical Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word._Document
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(24)
  word._Document createNewDocumentByID(
    @Optional java.lang.Object labelID,
    @Optional java.lang.Object address,
    @Optional java.lang.Object autoText,
    @Optional java.lang.Object extractAddress,
    @Optional java.lang.Object laserTray,
    @Optional java.lang.Object printEPostageLabel,
    @Optional java.lang.Object vertical);


  /**
   * @param labelID Optional parameter. Default value is com4j.Variant.getMissing()
   * @param address Optional parameter. Default value is com4j.Variant.getMissing()
   * @param extractAddress Optional parameter. Default value is com4j.Variant.getMissing()
   * @param laserTray Optional parameter. Default value is com4j.Variant.getMissing()
   * @param singleLabel Optional parameter. Default value is com4j.Variant.getMissing()
   * @param row Optional parameter. Default value is com4j.Variant.getMissing()
   * @param column Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printEPostageLabel Optional parameter. Default value is com4j.Variant.getMissing()
   * @param vertical Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(25)
  void printOutByID(
    @Optional java.lang.Object labelID,
    @Optional java.lang.Object address,
    @Optional java.lang.Object extractAddress,
    @Optional java.lang.Object laserTray,
    @Optional java.lang.Object singleLabel,
    @Optional java.lang.Object row,
    @Optional java.lang.Object column,
    @Optional java.lang.Object printEPostageLabel,
    @Optional java.lang.Object vertical);


  // Properties:
}
