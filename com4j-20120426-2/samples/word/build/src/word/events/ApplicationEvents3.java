package word.events;

import com4j.*;

@IID("{00020A00-0000-0000-C000-000000000046}")
public abstract class ApplicationEvents3 {
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


  // Properties:
}
