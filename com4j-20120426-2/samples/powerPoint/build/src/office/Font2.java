package office  ;

import com4j.*;

@IID("{000C039A-0000-0000-C000-000000000046}")
public interface Font2 extends office._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Bold"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  office.MsoTriState bold();


  /**
   * <p>
   * Setter method for the COM property "Bold"
   * </p>
   * @param bold Mandatory office.MsoTriState parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  void bold(
    office.MsoTriState bold);


  /**
   * <p>
   * Getter method for the COM property "Italic"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  office.MsoTriState italic();


  /**
   * <p>
   * Setter method for the COM property "Italic"
   * </p>
   * @param italic Mandatory office.MsoTriState parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  void italic(
    office.MsoTriState italic);


  /**
   * <p>
   * Getter method for the COM property "Strike"
   * </p>
   * @return  Returns a value of type office.MsoTextStrike
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  office.MsoTextStrike strike();


  /**
   * <p>
   * Setter method for the COM property "Strike"
   * </p>
   * @param strike Mandatory office.MsoTextStrike parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(15)
  void strike(
    office.MsoTextStrike strike);


  /**
   * <p>
   * Getter method for the COM property "Caps"
   * </p>
   * @return  Returns a value of type office.MsoTextCaps
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  office.MsoTextCaps caps();


  /**
   * <p>
   * Setter method for the COM property "Caps"
   * </p>
   * @param caps Mandatory office.MsoTextCaps parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(17)
  void caps(
    office.MsoTextCaps caps);


  /**
   * <p>
   * Getter method for the COM property "AutorotateNumbers"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  office.MsoTriState autorotateNumbers();


  /**
   * <p>
   * Setter method for the COM property "AutorotateNumbers"
   * </p>
   * @param rotateNumbers Mandatory office.MsoTriState parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(19)
  void autorotateNumbers(
    office.MsoTriState rotateNumbers);


  /**
   * <p>
   * Getter method for the COM property "BaselineOffset"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(20)
  float baselineOffset();


  /**
   * <p>
   * Setter method for the COM property "BaselineOffset"
   * </p>
   * @param offset Mandatory float parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(21)
  void baselineOffset(
    float offset);


  /**
   * <p>
   * Getter method for the COM property "Kerning"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(22)
  float kerning();


  /**
   * <p>
   * Setter method for the COM property "Kerning"
   * </p>
   * @param kerningSize Mandatory float parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(23)
  void kerning(
    float kerningSize);


  /**
   * <p>
   * Getter method for the COM property "Size"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(24)
  float size();


  /**
   * <p>
   * Setter method for the COM property "Size"
   * </p>
   * @param size Mandatory float parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(25)
  void size(
    float size);


  /**
   * <p>
   * Getter method for the COM property "Spacing"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(26)
  float spacing();


  /**
   * <p>
   * Setter method for the COM property "Spacing"
   * </p>
   * @param spacing Mandatory float parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(27)
  void spacing(
    float spacing);


  /**
   * <p>
   * Getter method for the COM property "UnderlineStyle"
   * </p>
   * @return  Returns a value of type office.MsoTextUnderlineType
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(28)
  office.MsoTextUnderlineType underlineStyle();


  /**
   * <p>
   * Setter method for the COM property "UnderlineStyle"
   * </p>
   * @param style Mandatory office.MsoTextUnderlineType parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(29)
  void underlineStyle(
    office.MsoTextUnderlineType style);


  /**
   * <p>
   * Getter method for the COM property "Allcaps"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(30)
  office.MsoTriState allcaps();


  /**
   * <p>
   * Setter method for the COM property "Allcaps"
   * </p>
   * @param allcaps Mandatory office.MsoTriState parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(31)
  void allcaps(
    office.MsoTriState allcaps);


  /**
   * <p>
   * Getter method for the COM property "DoubleStrikeThrough"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(32)
  office.MsoTriState doubleStrikeThrough();


  /**
   * <p>
   * Setter method for the COM property "DoubleStrikeThrough"
   * </p>
   * @param doubleStrikeThrough Mandatory office.MsoTriState parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(33)
  void doubleStrikeThrough(
    office.MsoTriState doubleStrikeThrough);


  /**
   * <p>
   * Getter method for the COM property "Equalize"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(34)
  office.MsoTriState equalize();


  /**
   * <p>
   * Setter method for the COM property "Equalize"
   * </p>
   * @param equalize Mandatory office.MsoTriState parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(35)
  void equalize(
    office.MsoTriState equalize);


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type office.FillFormat
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(36)
  office.FillFormat fill();


  /**
   * <p>
   * Getter method for the COM property "Glow"
   * </p>
   * @return  Returns a value of type office.GlowFormat
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(37)
  office.GlowFormat glow();


  /**
   * <p>
   * Getter method for the COM property "Reflection"
   * </p>
   * @return  Returns a value of type office.ReflectionFormat
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(38)
  office.ReflectionFormat reflection();


  /**
   * <p>
   * Getter method for the COM property "Line"
   * </p>
   * @return  Returns a value of type office.LineFormat
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(39)
  office.LineFormat line();


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type office.ShadowFormat
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(40)
  office.ShadowFormat shadow();


  /**
   * <p>
   * Getter method for the COM property "Highlight"
   * </p>
   * @return  Returns a value of type office.ColorFormat
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(41)
  office.ColorFormat highlight();


  /**
   * <p>
   * Getter method for the COM property "UnderlineColor"
   * </p>
   * @return  Returns a value of type office.ColorFormat
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(42)
  office.ColorFormat underlineColor();


  /**
   * <p>
   * Getter method for the COM property "Smallcaps"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(43)
  office.MsoTriState smallcaps();


  /**
   * <p>
   * Setter method for the COM property "Smallcaps"
   * </p>
   * @param smallcaps Mandatory office.MsoTriState parameter.
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(44)
  void smallcaps(
    office.MsoTriState smallcaps);


  /**
   * <p>
   * Getter method for the COM property "SoftEdgeFormat"
   * </p>
   * @return  Returns a value of type office.MsoSoftEdgeType
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(45)
  office.MsoSoftEdgeType softEdgeFormat();


  /**
   * <p>
   * Setter method for the COM property "SoftEdgeFormat"
   * </p>
   * @param softEdgeFormat Mandatory office.MsoSoftEdgeType parameter.
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(46)
  void softEdgeFormat(
    office.MsoSoftEdgeType softEdgeFormat);


  /**
   * <p>
   * Getter method for the COM property "StrikeThrough"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(47)
  office.MsoTriState strikeThrough();


  /**
   * <p>
   * Setter method for the COM property "StrikeThrough"
   * </p>
   * @param strikeThrough Mandatory office.MsoTriState parameter.
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(48)
  void strikeThrough(
    office.MsoTriState strikeThrough);


  /**
   * <p>
   * Getter method for the COM property "Subscript"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(49)
  office.MsoTriState subscript();


  /**
   * <p>
   * Setter method for the COM property "Subscript"
   * </p>
   * @param subscript Mandatory office.MsoTriState parameter.
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(50)
  void subscript(
    office.MsoTriState subscript);


  /**
   * <p>
   * Getter method for the COM property "Superscript"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(51)
  office.MsoTriState superscript();


  /**
   * <p>
   * Setter method for the COM property "Superscript"
   * </p>
   * @param superscript Mandatory office.MsoTriState parameter.
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(52)
  void superscript(
    office.MsoTriState superscript);


  /**
   * <p>
   * Getter method for the COM property "WordArtformat"
   * </p>
   * @return  Returns a value of type office.MsoPresetTextEffect
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(53)
  office.MsoPresetTextEffect wordArtformat();


  /**
   * <p>
   * Setter method for the COM property "WordArtformat"
   * </p>
   * @param wordArtformat Mandatory office.MsoPresetTextEffect parameter.
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(54)
  void wordArtformat(
    office.MsoPresetTextEffect wordArtformat);


  /**
   * <p>
   * Getter method for the COM property "Embeddable"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(55)
  office.MsoTriState embeddable();


  /**
   * <p>
   * Getter method for the COM property "Embedded"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(56)
  office.MsoTriState embedded();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(57)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(58)
  void name(
    java.lang.String name);


  /**
   * <p>
   * Getter method for the COM property "NameAscii"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(59)
  java.lang.String nameAscii();


  /**
   * <p>
   * Setter method for the COM property "NameAscii"
   * </p>
   * @param nameAscii Mandatory java.lang.String parameter.
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(60)
  void nameAscii(
    java.lang.String nameAscii);


  /**
   * <p>
   * Getter method for the COM property "NameComplexScript"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(61)
  java.lang.String nameComplexScript();


  /**
   * <p>
   * Setter method for the COM property "NameComplexScript"
   * </p>
   * @param nameComplexScript Mandatory java.lang.String parameter.
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(62)
  void nameComplexScript(
    java.lang.String nameComplexScript);


  /**
   * <p>
   * Getter method for the COM property "NameFarEast"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(63)
  java.lang.String nameFarEast();


  /**
   * <p>
   * Setter method for the COM property "NameFarEast"
   * </p>
   * @param nameFarEast Mandatory java.lang.String parameter.
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(64)
  void nameFarEast(
    java.lang.String nameFarEast);


  /**
   * <p>
   * Getter method for the COM property "NameOther"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(65)
  java.lang.String nameOther();


  /**
   * <p>
   * Setter method for the COM property "NameOther"
   * </p>
   * @param nameOther Mandatory java.lang.String parameter.
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(66)
  void nameOther(
    java.lang.String nameOther);


  // Properties:
}
