package word  ;

import com4j.*;

@IID("{00020949-0000-0000-C000-000000000046}")
public interface AutoCorrect extends Com4jObject {
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
   * Getter method for the COM property "CorrectDays"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  boolean correctDays();


  /**
   * <p>
   * Setter method for the COM property "CorrectDays"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  void correctDays(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "CorrectInitialCaps"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  boolean correctInitialCaps();


  /**
   * <p>
   * Setter method for the COM property "CorrectInitialCaps"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(13)
  void correctInitialCaps(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "CorrectSentenceCaps"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(14)
  boolean correctSentenceCaps();


  /**
   * <p>
   * Setter method for the COM property "CorrectSentenceCaps"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(15)
  void correctSentenceCaps(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ReplaceText"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(16)
  boolean replaceText();


  /**
   * <p>
   * Setter method for the COM property "ReplaceText"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(17)
  void replaceText(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Entries"
   * </p>
   * @return  Returns a value of type word.AutoCorrectEntries
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  word.AutoCorrectEntries entries();


  @VTID(18)
  @ReturnValue(defaultPropertyThrough={word.AutoCorrectEntries.class})
  word.AutoCorrectEntry entries(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "FirstLetterExceptions"
   * </p>
   * @return  Returns a value of type word.FirstLetterExceptions
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  word.FirstLetterExceptions firstLetterExceptions();


  @VTID(19)
  @ReturnValue(defaultPropertyThrough={word.FirstLetterExceptions.class})
  word.FirstLetterException firstLetterExceptions(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "FirstLetterAutoAdd"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(20)
  boolean firstLetterAutoAdd();


  /**
   * <p>
   * Setter method for the COM property "FirstLetterAutoAdd"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  void firstLetterAutoAdd(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "TwoInitialCapsExceptions"
   * </p>
   * @return  Returns a value of type word.TwoInitialCapsExceptions
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(22)
  word.TwoInitialCapsExceptions twoInitialCapsExceptions();


  @VTID(22)
  @ReturnValue(defaultPropertyThrough={word.TwoInitialCapsExceptions.class})
  word.TwoInitialCapsException twoInitialCapsExceptions(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "TwoInitialCapsAutoAdd"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(23)
  boolean twoInitialCapsAutoAdd();


  /**
   * <p>
   * Setter method for the COM property "TwoInitialCapsAutoAdd"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(24)
  void twoInitialCapsAutoAdd(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "CorrectCapsLock"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(25)
  boolean correctCapsLock();


  /**
   * <p>
   * Setter method for the COM property "CorrectCapsLock"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(26)
  void correctCapsLock(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "CorrectHangulAndAlphabet"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(27)
  boolean correctHangulAndAlphabet();


  /**
   * <p>
   * Setter method for the COM property "CorrectHangulAndAlphabet"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(28)
  void correctHangulAndAlphabet(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "HangulAndAlphabetExceptions"
   * </p>
   * @return  Returns a value of type word.HangulAndAlphabetExceptions
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(29)
  word.HangulAndAlphabetExceptions hangulAndAlphabetExceptions();


  @VTID(29)
  @ReturnValue(defaultPropertyThrough={word.HangulAndAlphabetExceptions.class})
  word.HangulAndAlphabetException hangulAndAlphabetExceptions(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "HangulAndAlphabetAutoAdd"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(30)
  boolean hangulAndAlphabetAutoAdd();


  /**
   * <p>
   * Setter method for the COM property "HangulAndAlphabetAutoAdd"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(31)
  void hangulAndAlphabetAutoAdd(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ReplaceTextFromSpellingChecker"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(32)
  boolean replaceTextFromSpellingChecker();


  /**
   * <p>
   * Setter method for the COM property "ReplaceTextFromSpellingChecker"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(33)
  void replaceTextFromSpellingChecker(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "OtherCorrectionsAutoAdd"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(34)
  boolean otherCorrectionsAutoAdd();


  /**
   * <p>
   * Setter method for the COM property "OtherCorrectionsAutoAdd"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(35)
  void otherCorrectionsAutoAdd(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "OtherCorrectionsExceptions"
   * </p>
   * @return  Returns a value of type word.OtherCorrectionsExceptions
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(36)
  word.OtherCorrectionsExceptions otherCorrectionsExceptions();


  @VTID(36)
  @ReturnValue(defaultPropertyThrough={word.OtherCorrectionsExceptions.class})
  word.OtherCorrectionsException otherCorrectionsExceptions(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "CorrectKeyboardSetting"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(37)
  boolean correctKeyboardSetting();


  /**
   * <p>
   * Setter method for the COM property "CorrectKeyboardSetting"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(38)
  void correctKeyboardSetting(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "CorrectTableCells"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(39)
  boolean correctTableCells();


  /**
   * <p>
   * Setter method for the COM property "CorrectTableCells"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(40)
  void correctTableCells(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "DisplayAutoCorrectOptions"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(41)
  boolean displayAutoCorrectOptions();


  /**
   * <p>
   * Setter method for the COM property "DisplayAutoCorrectOptions"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(42)
  void displayAutoCorrectOptions(
    boolean prop);


  // Properties:
}
