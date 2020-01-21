package word  ;

import com4j.*;

@IID("{0002092C-0000-0000-C000-000000000046}")
public interface Style extends Com4jObject {
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
   * Getter method for the COM property "NameLocal"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  java.lang.String nameLocal();


  /**
   * <p>
   * Setter method for the COM property "NameLocal"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  void nameLocal(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "BaseStyle"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object baseStyle();


  /**
   * <p>
   * Setter method for the COM property "BaseStyle"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(13)
  void baseStyle(
    java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String description();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type word.WdStyleType
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(15)
  word.WdStyleType type();


  /**
   * <p>
   * Getter method for the COM property "BuiltIn"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(16)
  boolean builtIn();


  /**
   * <p>
   * Getter method for the COM property "NextParagraphStyle"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object nextParagraphStyle();


  /**
   * <p>
   * Setter method for the COM property "NextParagraphStyle"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(18)
  void nextParagraphStyle(
    java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "InUse"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(19)
  boolean inUse();


  /**
   * <p>
   * Getter method for the COM property "Shading"
   * </p>
   * @return  Returns a value of type word.Shading
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(20)
  word.Shading shading();


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type word.Borders
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  word.Borders borders();


  @VTID(21)
  @ReturnValue(defaultPropertyThrough={word.Borders.class})
  word.Border borders(
    word.WdBorderType index);

  /**
   * <p>
   * Setter method for the COM property "Borders"
   * </p>
   * @param prop Mandatory word.Borders parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(22)
  void borders(
    word.Borders prop);


  /**
   * <p>
   * Getter method for the COM property "ParagraphFormat"
   * </p>
   * @return  Returns a value of type word._ParagraphFormat
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  word._ParagraphFormat paragraphFormat();


  /**
   * <p>
   * Setter method for the COM property "ParagraphFormat"
   * </p>
   * @param prop Mandatory word._ParagraphFormat parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(24)
  void paragraphFormat(
    word._ParagraphFormat prop);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type word._Font
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(25)
  word._Font font();


  /**
   * <p>
   * Setter method for the COM property "Font"
   * </p>
   * @param prop Mandatory word._Font parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(26)
  void font(
    word._Font prop);


  /**
   * <p>
   * Getter method for the COM property "Frame"
   * </p>
   * @return  Returns a value of type word.Frame
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(27)
  word.Frame frame();


  /**
   * <p>
   * Getter method for the COM property "LanguageID"
   * </p>
   * @return  Returns a value of type word.WdLanguageID
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(28)
  word.WdLanguageID languageID();


  /**
   * <p>
   * Setter method for the COM property "LanguageID"
   * </p>
   * @param prop Mandatory word.WdLanguageID parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(29)
  void languageID(
    word.WdLanguageID prop);


  /**
   * <p>
   * Getter method for the COM property "AutomaticallyUpdate"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(30)
  boolean automaticallyUpdate();


  /**
   * <p>
   * Setter method for the COM property "AutomaticallyUpdate"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(31)
  void automaticallyUpdate(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ListTemplate"
   * </p>
   * @return  Returns a value of type word.ListTemplate
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(32)
  word.ListTemplate listTemplate();


  /**
   * <p>
   * Getter method for the COM property "ListLevelNumber"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(33)
  int listLevelNumber();


  /**
   * <p>
   * Getter method for the COM property "LanguageIDFarEast"
   * </p>
   * @return  Returns a value of type word.WdLanguageID
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(34)
  word.WdLanguageID languageIDFarEast();


  /**
   * <p>
   * Setter method for the COM property "LanguageIDFarEast"
   * </p>
   * @param prop Mandatory word.WdLanguageID parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(35)
  void languageIDFarEast(
    word.WdLanguageID prop);


  /**
   * <p>
   * Getter method for the COM property "Hidden"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(36)
  boolean hidden();


  /**
   * <p>
   * Setter method for the COM property "Hidden"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(37)
  void hidden(
    boolean prop);


  /**
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(38)
  void delete();


  /**
   * @param listTemplate Mandatory word.ListTemplate parameter.
   * @param listLevelNumber Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(39)
  void linkToListTemplate(
    word.ListTemplate listTemplate,
    @Optional java.lang.Object listLevelNumber);


  /**
   * <p>
   * Getter method for the COM property "NoProofing"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(40)
  int noProofing();


  /**
   * <p>
   * Setter method for the COM property "NoProofing"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(41)
  void noProofing(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "LinkStyle"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(42)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object linkStyle();


  /**
   * <p>
   * Setter method for the COM property "LinkStyle"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(43)
  void linkStyle(
    java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "Visibility"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(44)
  boolean visibility();


  /**
   * <p>
   * Setter method for the COM property "Visibility"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(45)
  void visibility(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "NoSpaceBetweenParagraphsOfSameStyle"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(46)
  boolean noSpaceBetweenParagraphsOfSameStyle();


  /**
   * <p>
   * Setter method for the COM property "NoSpaceBetweenParagraphsOfSameStyle"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(47)
  void noSpaceBetweenParagraphsOfSameStyle(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Table"
   * </p>
   * @return  Returns a value of type word.TableStyle
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(48)
  word.TableStyle table();


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(49)
  boolean locked();


  /**
   * <p>
   * Setter method for the COM property "Locked"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(50)
  void locked(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Priority"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(51)
  int priority();


  /**
   * <p>
   * Setter method for the COM property "Priority"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(52)
  void priority(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "UnhideWhenUsed"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(53)
  boolean unhideWhenUsed();


  /**
   * <p>
   * Setter method for the COM property "UnhideWhenUsed"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(54)
  void unhideWhenUsed(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "QuickStyle"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(55)
  boolean quickStyle();


  /**
   * <p>
   * Setter method for the COM property "QuickStyle"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(56)
  void quickStyle(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Linked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(57)
  boolean linked();


  // Properties:
}
