package word  ;

import com4j.*;

@IID("{0002096D-0000-0000-C000-000000000046}")
public interface Language extends Com4jObject {
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
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type word.WdLanguageID
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(10)
  word.WdLanguageID id();


  /**
   * <p>
   * Getter method for the COM property "NameLocal"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  java.lang.String nameLocal();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "ActiveGrammarDictionary"
   * </p>
   * @return  Returns a value of type word.Dictionary
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(13)
  word.Dictionary activeGrammarDictionary();


  /**
   * <p>
   * Getter method for the COM property "ActiveHyphenationDictionary"
   * </p>
   * @return  Returns a value of type word.Dictionary
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(14)
  word.Dictionary activeHyphenationDictionary();


  /**
   * <p>
   * Getter method for the COM property "ActiveSpellingDictionary"
   * </p>
   * @return  Returns a value of type word.Dictionary
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(15)
  word.Dictionary activeSpellingDictionary();


  /**
   * <p>
   * Getter method for the COM property "ActiveThesaurusDictionary"
   * </p>
   * @return  Returns a value of type word.Dictionary
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(16)
  word.Dictionary activeThesaurusDictionary();


  /**
   * <p>
   * Getter method for the COM property "DefaultWritingStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String defaultWritingStyle();


  /**
   * <p>
   * Setter method for the COM property "DefaultWritingStyle"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(18)
  void defaultWritingStyle(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "WritingStyleList"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object writingStyleList();


  /**
   * <p>
   * Getter method for the COM property "SpellingDictionaryType"
   * </p>
   * @return  Returns a value of type word.WdDictionaryType
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(20)
  word.WdDictionaryType spellingDictionaryType();


  /**
   * <p>
   * Setter method for the COM property "SpellingDictionaryType"
   * </p>
   * @param prop Mandatory word.WdDictionaryType parameter.
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(21)
  void spellingDictionaryType(
    word.WdDictionaryType prop);


  // Properties:
}
