package word  ;

import com4j.*;

@IID("{000209FE-0001-0000-C000-000000000046}")
public interface IApplicationEvents2 extends Com4jObject {
  // Methods:
  /**
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void startup();


  /**
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void quit();


  /**
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void documentChange();


  /**
   * @param doc Mandatory word._Document parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  void documentOpen(
    word._Document doc);


  /**
   * @param doc Mandatory word._Document parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(11)
  void documentBeforeClose(
    word._Document doc,
    Holder<Boolean> cancel);


  /**
   * @param doc Mandatory word._Document parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(12)
  void documentBeforePrint(
    word._Document doc,
    Holder<Boolean> cancel);


  /**
   * @param doc Mandatory word._Document parameter.
   * @param saveAsUI Mandatory Holder<Boolean> parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(13)
  void documentBeforeSave(
    word._Document doc,
    Holder<Boolean> saveAsUI,
    Holder<Boolean> cancel);


  /**
   * @param doc Mandatory word._Document parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(14)
  void newDocument(
    word._Document doc);


  /**
   * @param doc Mandatory word._Document parameter.
   * @param wn Mandatory word.Window parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(15)
  void windowActivate(
    word._Document doc,
    word.Window wn);


  /**
   * @param doc Mandatory word._Document parameter.
   * @param wn Mandatory word.Window parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(16)
  void windowDeactivate(
    word._Document doc,
    word.Window wn);


  /**
   * @param sel Mandatory word.Selection parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(17)
  void windowSelectionChange(
    word.Selection sel);


  /**
   * @param sel Mandatory word.Selection parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(18)
  void windowBeforeRightClick(
    word.Selection sel,
    Holder<Boolean> cancel);


  /**
   * @param sel Mandatory word.Selection parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(19)
  void windowBeforeDoubleClick(
    word.Selection sel,
    Holder<Boolean> cancel);


  // Properties:
}
