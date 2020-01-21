package word  ;

import com4j.*;

@IID("{00020A01-0001-0000-C000-000000000046}")
public interface IApplicationEvents4 extends Com4jObject {
  // Methods:
  /**
   */

  @VTID(7)
  void startup();


  /**
   */

  @VTID(8)
  void quit();


  /**
   */

  @VTID(9)
  void documentChange();


  /**
   * @param doc Mandatory word._Document parameter.
   */

  @VTID(10)
  void documentOpen(
    word._Document doc);


  /**
   * @param doc Mandatory word._Document parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(11)
  void documentBeforeClose(
    word._Document doc,
    Holder<Boolean> cancel);


  /**
   * @param doc Mandatory word._Document parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(12)
  void documentBeforePrint(
    word._Document doc,
    Holder<Boolean> cancel);


  /**
   * @param doc Mandatory word._Document parameter.
   * @param saveAsUI Mandatory Holder<Boolean> parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(13)
  void documentBeforeSave(
    word._Document doc,
    Holder<Boolean> saveAsUI,
    Holder<Boolean> cancel);


  /**
   * @param doc Mandatory word._Document parameter.
   */

  @VTID(14)
  void newDocument(
    word._Document doc);


  /**
   * @param doc Mandatory word._Document parameter.
   * @param wn Mandatory word.Window parameter.
   */

  @VTID(15)
  void windowActivate(
    word._Document doc,
    word.Window wn);


  /**
   * @param doc Mandatory word._Document parameter.
   * @param wn Mandatory word.Window parameter.
   */

  @VTID(16)
  void windowDeactivate(
    word._Document doc,
    word.Window wn);


  /**
   * @param sel Mandatory word.Selection parameter.
   */

  @VTID(17)
  void windowSelectionChange(
    word.Selection sel);


  /**
   * @param sel Mandatory word.Selection parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(18)
  void windowBeforeRightClick(
    word.Selection sel,
    Holder<Boolean> cancel);


  /**
   * @param sel Mandatory word.Selection parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(19)
  void windowBeforeDoubleClick(
    word.Selection sel,
    Holder<Boolean> cancel);


  /**
   * @param doc Mandatory word._Document parameter.
   */

  @VTID(20)
  void ePostagePropertyDialog(
    word._Document doc);


  /**
   * @param doc Mandatory word._Document parameter.
   */

  @VTID(21)
  void ePostageInsert(
    word._Document doc);


  /**
   * @param doc Mandatory word._Document parameter.
   * @param docResult Mandatory word._Document parameter.
   */

  @VTID(22)
  void mailMergeAfterMerge(
    word._Document doc,
    word._Document docResult);


  /**
   * @param doc Mandatory word._Document parameter.
   */

  @VTID(23)
  void mailMergeAfterRecordMerge(
    word._Document doc);


  /**
   * @param doc Mandatory word._Document parameter.
   * @param startRecord Mandatory int parameter.
   * @param endRecord Mandatory int parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(24)
  void mailMergeBeforeMerge(
    word._Document doc,
    int startRecord,
    int endRecord,
    Holder<Boolean> cancel);


  /**
   * @param doc Mandatory word._Document parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(25)
  void mailMergeBeforeRecordMerge(
    word._Document doc,
    Holder<Boolean> cancel);


  /**
   * @param doc Mandatory word._Document parameter.
   */

  @VTID(26)
  void mailMergeDataSourceLoad(
    word._Document doc);


  /**
   * @param doc Mandatory word._Document parameter.
   * @param handled Mandatory Holder<Boolean> parameter.
   */

  @VTID(27)
  void mailMergeDataSourceValidate(
    word._Document doc,
    Holder<Boolean> handled);


  /**
   * @param doc Mandatory word._Document parameter.
   */

  @VTID(28)
  void mailMergeWizardSendToCustom(
    word._Document doc);


  /**
   * @param doc Mandatory word._Document parameter.
   * @param fromState Mandatory Holder<Integer> parameter.
   * @param toState Mandatory Holder<Integer> parameter.
   * @param handled Mandatory Holder<Boolean> parameter.
   */

  @VTID(29)
  void mailMergeWizardStateChange(
    word._Document doc,
    Holder<Integer> fromState,
    Holder<Integer> toState,
    Holder<Boolean> handled);


  /**
   * @param doc Mandatory word._Document parameter.
   * @param wn Mandatory word.Window parameter.
   */

  @VTID(30)
  void windowSize(
    word._Document doc,
    word.Window wn);


  /**
   * @param sel Mandatory word.Selection parameter.
   * @param oldXMLNode Mandatory word.XMLNode parameter.
   * @param newXMLNode Mandatory word.XMLNode parameter.
   * @param reason Mandatory Holder<Integer> parameter.
   */

  @VTID(31)
  void xmlSelectionChange(
    word.Selection sel,
    word.XMLNode oldXMLNode,
    word.XMLNode newXMLNode,
    Holder<Integer> reason);


  /**
   * @param xmlNode Mandatory word.XMLNode parameter.
   */

  @VTID(32)
  void xmlValidationError(
    word.XMLNode xmlNode);


  /**
   * @param doc Mandatory word._Document parameter.
   * @param syncEventType Mandatory office.MsoSyncEventType parameter.
   */

  @VTID(33)
  void documentSync(
    word._Document doc,
    office.MsoSyncEventType syncEventType);


  /**
   * @param doc Mandatory word._Document parameter.
   * @param cpDeliveryAddrStart Mandatory int parameter.
   * @param cpDeliveryAddrEnd Mandatory int parameter.
   * @param cpReturnAddrStart Mandatory int parameter.
   * @param cpReturnAddrEnd Mandatory int parameter.
   * @param xaWidth Mandatory int parameter.
   * @param yaHeight Mandatory int parameter.
   * @param bstrPrinterName Mandatory java.lang.String parameter.
   * @param bstrPaperFeed Mandatory java.lang.String parameter.
   * @param fPrint Mandatory boolean parameter.
   * @param fCancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(34)
  void ePostageInsertEx(
    word._Document doc,
    int cpDeliveryAddrStart,
    int cpDeliveryAddrEnd,
    int cpReturnAddrStart,
    int cpReturnAddrEnd,
    int xaWidth,
    int yaHeight,
    java.lang.String bstrPrinterName,
    java.lang.String bstrPaperFeed,
    boolean fPrint,
    Holder<Boolean> fCancel);


  /**
   * @param doc Mandatory word._Document parameter.
   * @param handled Mandatory Holder<Boolean> parameter.
   */

  @VTID(35)
  void mailMergeDataSourceValidate2(
    word._Document doc,
    Holder<Boolean> handled);


  /**
   * @param pvWindow Mandatory word.ProtectedViewWindow parameter.
   */

  @VTID(36)
  void protectedViewWindowOpen(
    word.ProtectedViewWindow pvWindow);


  /**
   * @param pvWindow Mandatory word.ProtectedViewWindow parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(37)
  void protectedViewWindowBeforeEdit(
    word.ProtectedViewWindow pvWindow,
    Holder<Boolean> cancel);


  /**
   * @param pvWindow Mandatory word.ProtectedViewWindow parameter.
   * @param closeReason Mandatory int parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(38)
  void protectedViewWindowBeforeClose(
    word.ProtectedViewWindow pvWindow,
    int closeReason,
    Holder<Boolean> cancel);


  /**
   * @param pvWindow Mandatory word.ProtectedViewWindow parameter.
   */

  @VTID(39)
  void protectedViewWindowSize(
    word.ProtectedViewWindow pvWindow);


  /**
   * @param pvWindow Mandatory word.ProtectedViewWindow parameter.
   */

  @VTID(40)
  void protectedViewWindowActivate(
    word.ProtectedViewWindow pvWindow);


  /**
   * @param pvWindow Mandatory word.ProtectedViewWindow parameter.
   */

  @VTID(41)
  void protectedViewWindowDeactivate(
    word.ProtectedViewWindow pvWindow);


  // Properties:
}
