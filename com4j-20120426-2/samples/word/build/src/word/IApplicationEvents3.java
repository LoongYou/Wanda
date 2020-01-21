package word  ;

import com4j.*;

@IID("{00020A00-0001-0000-C000-000000000046}")
public interface IApplicationEvents3 extends Com4jObject {
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


  /**
   * @param doc Mandatory word._Document parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(20)
  void ePostagePropertyDialog(
    word._Document doc);


  /**
   * @param doc Mandatory word._Document parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(21)
  void ePostageInsert(
    word._Document doc);


  /**
   * @param doc Mandatory word._Document parameter.
   * @param docResult Mandatory word._Document parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(22)
  void mailMergeAfterMerge(
    word._Document doc,
    word._Document docResult);


  /**
   * @param doc Mandatory word._Document parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(23)
  void mailMergeAfterRecordMerge(
    word._Document doc);


  /**
   * @param doc Mandatory word._Document parameter.
   * @param startRecord Mandatory int parameter.
   * @param endRecord Mandatory int parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
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

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(25)
  void mailMergeBeforeRecordMerge(
    word._Document doc,
    Holder<Boolean> cancel);


  /**
   * @param doc Mandatory word._Document parameter.
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(26)
  void mailMergeDataSourceLoad(
    word._Document doc);


  /**
   * @param doc Mandatory word._Document parameter.
   * @param handled Mandatory Holder<Boolean> parameter.
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(27)
  void mailMergeDataSourceValidate(
    word._Document doc,
    Holder<Boolean> handled);


  /**
   * @param doc Mandatory word._Document parameter.
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(28)
  void mailMergeWizardSendToCustom(
    word._Document doc);


  /**
   * @param doc Mandatory word._Document parameter.
   * @param fromState Mandatory Holder<Integer> parameter.
   * @param toState Mandatory Holder<Integer> parameter.
   * @param handled Mandatory Holder<Boolean> parameter.
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
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

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(30)
  void windowSize(
    word._Document doc,
    word.Window wn);


  // Properties:
}
