package word  ;

import com4j.*;

@IID("{000209B1-0000-0000-C000-000000000046}")
public interface Replacement extends Com4jObject {
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
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type word._Font
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(10)
  word._Font font();


  /**
   * <p>
   * Setter method for the COM property "Font"
   * </p>
   * @param prop Mandatory word._Font parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(11)
  void font(
    word._Font prop);


  /**
   * <p>
   * Getter method for the COM property "ParagraphFormat"
   * </p>
   * @return  Returns a value of type word._ParagraphFormat
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(12)
  word._ParagraphFormat paragraphFormat();


  /**
   * <p>
   * Setter method for the COM property "ParagraphFormat"
   * </p>
   * @param prop Mandatory word._ParagraphFormat parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(13)
  void paragraphFormat(
    word._ParagraphFormat prop);


  /**
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object style();


  /**
   * <p>
   * Setter method for the COM property "Style"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(15)
  void style(
    java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String text();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(17)
  void text(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "LanguageID"
   * </p>
   * @return  Returns a value of type word.WdLanguageID
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(18)
  word.WdLanguageID languageID();


  /**
   * <p>
   * Setter method for the COM property "LanguageID"
   * </p>
   * @param prop Mandatory word.WdLanguageID parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(19)
  void languageID(
    word.WdLanguageID prop);


  /**
   * <p>
   * Getter method for the COM property "Highlight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(20)
  int highlight();


  /**
   * <p>
   * Setter method for the COM property "Highlight"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(21)
  void highlight(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Frame"
   * </p>
   * @return  Returns a value of type word.Frame
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(22)
  word.Frame frame();


  /**
   * <p>
   * Getter method for the COM property "LanguageIDFarEast"
   * </p>
   * @return  Returns a value of type word.WdLanguageID
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(23)
  word.WdLanguageID languageIDFarEast();


  /**
   * <p>
   * Setter method for the COM property "LanguageIDFarEast"
   * </p>
   * @param prop Mandatory word.WdLanguageID parameter.
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(24)
  void languageIDFarEast(
    word.WdLanguageID prop);


  /**
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(25)
  void clearFormatting();


  /**
   * <p>
   * Getter method for the COM property "NoProofing"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(26)
  int noProofing();


  /**
   * <p>
   * Setter method for the COM property "NoProofing"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(27)
  void noProofing(
    int prop);


  // Properties:
}
