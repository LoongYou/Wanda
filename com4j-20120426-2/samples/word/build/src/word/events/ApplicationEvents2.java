package word.events;

import com4j.*;

@IID("{000209FE-0000-0000-C000-000000000046}")
public abstract class ApplicationEvents2 {
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


  // Properties:
}
