package word  ;

import com4j.*;

@IID("{0002096A-0000-0000-C000-000000000046}")
public interface Template extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(8)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(9)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String path();


  /**
   * <p>
   * Getter method for the COM property "AutoTextEntries"
   * </p>
   * @return  Returns a value of type word.AutoTextEntries
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  word.AutoTextEntries autoTextEntries();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={word.AutoTextEntries.class})
  word.AutoTextEntry autoTextEntries(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "LanguageID"
   * </p>
   * @return  Returns a value of type word.WdLanguageID
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  word.WdLanguageID languageID();


  /**
   * <p>
   * Setter method for the COM property "LanguageID"
   * </p>
   * @param prop Mandatory word.WdLanguageID parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  void languageID(
    word.WdLanguageID prop);


  /**
   * <p>
   * Getter method for the COM property "Saved"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  boolean saved();


  /**
   * <p>
   * Setter method for the COM property "Saved"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  void saved(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type word.WdTemplateType
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  word.WdTemplateType type();


  /**
   * <p>
   * Getter method for the COM property "FullName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String fullName();


  /**
   * <p>
   * Getter method for the COM property "BuiltInDocumentProperties"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject builtInDocumentProperties();


  /**
   * <p>
   * Getter method for the COM property "CustomDocumentProperties"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(20)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject customDocumentProperties();


  /**
   * <p>
   * Getter method for the COM property "ListTemplates"
   * </p>
   * @return  Returns a value of type word.ListTemplates
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(21)
  word.ListTemplates listTemplates();


  @VTID(21)
  @ReturnValue(defaultPropertyThrough={word.ListTemplates.class})
  word.ListTemplate listTemplates(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "LanguageIDFarEast"
   * </p>
   * @return  Returns a value of type word.WdLanguageID
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(22)
  word.WdLanguageID languageIDFarEast();


  /**
   * <p>
   * Setter method for the COM property "LanguageIDFarEast"
   * </p>
   * @param prop Mandatory word.WdLanguageID parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(23)
  void languageIDFarEast(
    word.WdLanguageID prop);


  /**
   * <p>
   * Getter method for the COM property "VBProject"
   * </p>
   * @return  Returns a value of type vba._VBProject
   */

  @DISPID(99) //= 0x63. The runtime will prefer the VTID if present
  @VTID(24)
  vba._VBProject vbProject();


  /**
   * <p>
   * Getter method for the COM property "KerningByAlgorithm"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(25)
  boolean kerningByAlgorithm();


  /**
   * <p>
   * Setter method for the COM property "KerningByAlgorithm"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(26)
  void kerningByAlgorithm(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "JustificationMode"
   * </p>
   * @return  Returns a value of type word.WdJustificationMode
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(27)
  word.WdJustificationMode justificationMode();


  /**
   * <p>
   * Setter method for the COM property "JustificationMode"
   * </p>
   * @param prop Mandatory word.WdJustificationMode parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(28)
  void justificationMode(
    word.WdJustificationMode prop);


  /**
   * <p>
   * Getter method for the COM property "FarEastLineBreakLevel"
   * </p>
   * @return  Returns a value of type word.WdFarEastLineBreakLevel
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(29)
  word.WdFarEastLineBreakLevel farEastLineBreakLevel();


  /**
   * <p>
   * Setter method for the COM property "FarEastLineBreakLevel"
   * </p>
   * @param prop Mandatory word.WdFarEastLineBreakLevel parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(30)
  void farEastLineBreakLevel(
    word.WdFarEastLineBreakLevel prop);


  /**
   * <p>
   * Getter method for the COM property "NoLineBreakBefore"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(31)
  java.lang.String noLineBreakBefore();


  /**
   * <p>
   * Setter method for the COM property "NoLineBreakBefore"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(32)
  void noLineBreakBefore(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "NoLineBreakAfter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String noLineBreakAfter();


  /**
   * <p>
   * Setter method for the COM property "NoLineBreakAfter"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(34)
  void noLineBreakAfter(
    java.lang.String prop);


  /**
   * @return  Returns a value of type word._Document
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(35)
  word._Document openAsDocument();


  /**
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(36)
  void save();


  /**
   * <p>
   * Getter method for the COM property "NoProofing"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(37)
  int noProofing();


  /**
   * <p>
   * Setter method for the COM property "NoProofing"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(38)
  void noProofing(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "FarEastLineBreakLanguage"
   * </p>
   * @return  Returns a value of type word.WdFarEastLineBreakLanguageID
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(39)
  word.WdFarEastLineBreakLanguageID farEastLineBreakLanguage();


  /**
   * <p>
   * Setter method for the COM property "FarEastLineBreakLanguage"
   * </p>
   * @param prop Mandatory word.WdFarEastLineBreakLanguageID parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(40)
  void farEastLineBreakLanguage(
    word.WdFarEastLineBreakLanguageID prop);


  /**
   * <p>
   * Getter method for the COM property "BuildingBlockEntries"
   * </p>
   * @return  Returns a value of type word.BuildingBlockEntries
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(41)
  word.BuildingBlockEntries buildingBlockEntries();


  @VTID(41)
  @ReturnValue(defaultPropertyThrough={word.BuildingBlockEntries.class})
  word.BuildingBlock buildingBlockEntries(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "BuildingBlockTypes"
   * </p>
   * @return  Returns a value of type word.BuildingBlockTypes
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(42)
  word.BuildingBlockTypes buildingBlockTypes();


  @VTID(42)
  @ReturnValue(defaultPropertyThrough={word.BuildingBlockTypes.class})
  word.BuildingBlockType buildingBlockTypes(
    word.WdBuildingBlockTypes index);

  // Properties:
}
