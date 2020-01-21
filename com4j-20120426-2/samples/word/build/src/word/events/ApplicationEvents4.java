package word.events;

import com4j.*;

@IID("{00020A01-0000-0000-C000-000000000046}")
public abstract class ApplicationEvents4 {
  // Methods:
  /**
   */

  @DISPID(1)
  public void startup() {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(2)
  public void quit() {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(3)
  public void documentChange() {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory word._Document parameter.
   */

  @DISPID(4)
  public void documentOpen(
    word._Document doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory word._Document parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(6)
  public void documentBeforeClose(
    word._Document doc,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory word._Document parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(7)
  public void documentBeforePrint(
    word._Document doc,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory word._Document parameter.
   * @param saveAsUI Mandatory Holder<Boolean> parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(8)
  public void documentBeforeSave(
    word._Document doc,
    Holder<Boolean> saveAsUI,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory word._Document parameter.
   */

  @DISPID(9)
  public void newDocument(
    word._Document doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory word._Document parameter.
   * @param wn Mandatory word.Window parameter.
   */

  @DISPID(10)
  public void windowActivate(
    word._Document doc,
    word.Window wn) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory word._Document parameter.
   * @param wn Mandatory word.Window parameter.
   */

  @DISPID(11)
  public void windowDeactivate(
    word._Document doc,
    word.Window wn) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sel Mandatory word.Selection parameter.
   */

  @DISPID(12)
  public void windowSelectionChange(
    word.Selection sel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sel Mandatory word.Selection parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(13)
  public void windowBeforeRightClick(
    word.Selection sel,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sel Mandatory word.Selection parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(14)
  public void windowBeforeDoubleClick(
    word.Selection sel,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory word._Document parameter.
   */

  @DISPID(15)
  public void ePostagePropertyDialog(
    word._Document doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory word._Document parameter.
   */

  @DISPID(16)
  public void ePostageInsert(
    word._Document doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory word._Document parameter.
   * @param docResult Mandatory word._Document parameter.
   */

  @DISPID(17)
  public void mailMergeAfterMerge(
    word._Document doc,
    word._Document docResult) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory word._Document parameter.
   */

  @DISPID(18)
  public void mailMergeAfterRecordMerge(
    word._Document doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory word._Document parameter.
   * @param startRecord Mandatory int parameter.
   * @param endRecord Mandatory int parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(19)
  public void mailMergeBeforeMerge(
    word._Document doc,
    int startRecord,
    int endRecord,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory word._Document parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(20)
  public void mailMergeBeforeRecordMerge(
    word._Document doc,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory word._Document parameter.
   */

  @DISPID(21)
  public void mailMergeDataSourceLoad(
    word._Document doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory word._Document parameter.
   * @param handled Mandatory Holder<Boolean> parameter.
   */

  @DISPID(22)
  public void mailMergeDataSourceValidate(
    word._Document doc,
    Holder<Boolean> handled) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory word._Document parameter.
   */

  @DISPID(23)
  public void mailMergeWizardSendToCustom(
    word._Document doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory word._Document parameter.
   * @param fromState Mandatory Holder<Integer> parameter.
   * @param toState Mandatory Holder<Integer> parameter.
   * @param handled Mandatory Holder<Boolean> parameter.
   */

  @DISPID(24)
  public void mailMergeWizardStateChange(
    word._Document doc,
    Holder<Integer> fromState,
    Holder<Integer> toState,
    Holder<Boolean> handled) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory word._Document parameter.
   * @param wn Mandatory word.Window parameter.
   */

  @DISPID(25)
  public void windowSize(
    word._Document doc,
    word.Window wn) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sel Mandatory word.Selection parameter.
   * @param oldXMLNode Mandatory word.XMLNode parameter.
   * @param newXMLNode Mandatory word.XMLNode parameter.
   * @param reason Mandatory Holder<Integer> parameter.
   */

  @DISPID(26)
  public void xmlSelectionChange(
    word.Selection sel,
    word.XMLNode oldXMLNode,
    word.XMLNode newXMLNode,
    Holder<Integer> reason) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param xmlNode Mandatory word.XMLNode parameter.
   */

  @DISPID(27)
  public void xmlValidationError(
    word.XMLNode xmlNode) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory word._Document parameter.
   * @param syncEventType Mandatory office.MsoSyncEventType parameter.
   */

  @DISPID(28)
  public void documentSync(
    word._Document doc,
    office.MsoSyncEventType syncEventType) {
        throw new UnsupportedOperationException();
  }


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

  @DISPID(29)
  public void ePostageInsertEx(
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
    Holder<Boolean> fCancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory word._Document parameter.
   * @param handled Mandatory Holder<Boolean> parameter.
   */

  @DISPID(30)
  public void mailMergeDataSourceValidate2(
    word._Document doc,
    Holder<Boolean> handled) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param pvWindow Mandatory word.ProtectedViewWindow parameter.
   */

  @DISPID(31)
  public void protectedViewWindowOpen(
    word.ProtectedViewWindow pvWindow) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param pvWindow Mandatory word.ProtectedViewWindow parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(32)
  public void protectedViewWindowBeforeEdit(
    word.ProtectedViewWindow pvWindow,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param pvWindow Mandatory word.ProtectedViewWindow parameter.
   * @param closeReason Mandatory int parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(33)
  public void protectedViewWindowBeforeClose(
    word.ProtectedViewWindow pvWindow,
    int closeReason,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param pvWindow Mandatory word.ProtectedViewWindow parameter.
   */

  @DISPID(34)
  public void protectedViewWindowSize(
    word.ProtectedViewWindow pvWindow) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param pvWindow Mandatory word.ProtectedViewWindow parameter.
   */

  @DISPID(35)
  public void protectedViewWindowActivate(
    word.ProtectedViewWindow pvWindow) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param pvWindow Mandatory word.ProtectedViewWindow parameter.
   */

  @DISPID(36)
  public void protectedViewWindowDeactivate(
    word.ProtectedViewWindow pvWindow) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
