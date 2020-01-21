package word  ;

import com4j.*;

@IID("{000209C8-0000-0000-C000-000000000046}")
public interface FillFormat extends Com4jObject {
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

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "BackColor"
   * </p>
   * @return  Returns a value of type word.ColorFormat
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(10)
  word.ColorFormat backColor();


  /**
   * <p>
   * Getter method for the COM property "ForeColor"
   * </p>
   * @return  Returns a value of type word.ColorFormat
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(11)
  word.ColorFormat foreColor();


  /**
   * <p>
   * Getter method for the COM property "GradientColorType"
   * </p>
   * @return  Returns a value of type office.MsoGradientColorType
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(12)
  office.MsoGradientColorType gradientColorType();


  /**
   * <p>
   * Getter method for the COM property "GradientDegree"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(13)
  float gradientDegree();


  /**
   * <p>
   * Getter method for the COM property "GradientStyle"
   * </p>
   * @return  Returns a value of type office.MsoGradientStyle
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(14)
  office.MsoGradientStyle gradientStyle();


  /**
   * <p>
   * Getter method for the COM property "GradientVariant"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(15)
  int gradientVariant();


  /**
   * <p>
   * Getter method for the COM property "Pattern"
   * </p>
   * @return  Returns a value of type office.MsoPatternType
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(16)
  office.MsoPatternType pattern();


  /**
   * <p>
   * Getter method for the COM property "PresetGradientType"
   * </p>
   * @return  Returns a value of type office.MsoPresetGradientType
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(17)
  office.MsoPresetGradientType presetGradientType();


  /**
   * <p>
   * Getter method for the COM property "PresetTexture"
   * </p>
   * @return  Returns a value of type office.MsoPresetTexture
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(18)
  office.MsoPresetTexture presetTexture();


  /**
   * <p>
   * Getter method for the COM property "TextureName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String textureName();


  /**
   * <p>
   * Getter method for the COM property "TextureType"
   * </p>
   * @return  Returns a value of type office.MsoTextureType
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(20)
  office.MsoTextureType textureType();


  /**
   * <p>
   * Getter method for the COM property "Transparency"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(21)
  float transparency();


  /**
   * <p>
   * Setter method for the COM property "Transparency"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(22)
  void transparency(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type office.MsoFillType
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(23)
  office.MsoFillType type();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(24)
  office.MsoTriState visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param prop Mandatory office.MsoTriState parameter.
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(25)
  void visible(
    office.MsoTriState prop);


  /**
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(26)
  void background();


  /**
   * @param style Mandatory office.MsoGradientStyle parameter.
   * @param variant Mandatory int parameter.
   * @param degree Mandatory float parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(27)
  void oneColorGradient(
    office.MsoGradientStyle style,
    int variant,
    float degree);


  /**
   * @param pattern Mandatory office.MsoPatternType parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(28)
  void patterned(
    office.MsoPatternType pattern);


  /**
   * @param style Mandatory office.MsoGradientStyle parameter.
   * @param variant Mandatory int parameter.
   * @param presetGradientType Mandatory office.MsoPresetGradientType parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(29)
  void presetGradient(
    office.MsoGradientStyle style,
    int variant,
    office.MsoPresetGradientType presetGradientType);


  /**
   * @param presetTexture Mandatory office.MsoPresetTexture parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(30)
  void presetTextured(
    office.MsoPresetTexture presetTexture);


  /**
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(31)
  void solid();


  /**
   * @param style Mandatory office.MsoGradientStyle parameter.
   * @param variant Mandatory int parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(32)
  void twoColorGradient(
    office.MsoGradientStyle style,
    int variant);


  /**
   * @param pictureFile Mandatory java.lang.String parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(33)
  void userPicture(
    java.lang.String pictureFile);


  /**
   * @param textureFile Mandatory java.lang.String parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(34)
  void userTextured(
    java.lang.String textureFile);


  /**
   * <p>
   * Getter method for the COM property "GradientStops"
   * </p>
   * @return  Returns a value of type office.GradientStops
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(35)
  office.GradientStops gradientStops();


  @VTID(35)
  @ReturnValue(defaultPropertyThrough={office.GradientStops.class})
  office.GradientStop gradientStops(
    int index);

  /**
   * <p>
   * Getter method for the COM property "TextureOffsetX"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(36)
  float textureOffsetX();


  /**
   * <p>
   * Setter method for the COM property "TextureOffsetX"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(37)
  void textureOffsetX(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "TextureOffsetY"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(38)
  float textureOffsetY();


  /**
   * <p>
   * Setter method for the COM property "TextureOffsetY"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(39)
  void textureOffsetY(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "TextureAlignment"
   * </p>
   * @return  Returns a value of type office.MsoTextureAlignment
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(40)
  office.MsoTextureAlignment textureAlignment();


  /**
   * <p>
   * Setter method for the COM property "TextureAlignment"
   * </p>
   * @param prop Mandatory office.MsoTextureAlignment parameter.
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(41)
  void textureAlignment(
    office.MsoTextureAlignment prop);


  /**
   * <p>
   * Getter method for the COM property "TextureHorizontalScale"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(42)
  float textureHorizontalScale();


  /**
   * <p>
   * Setter method for the COM property "TextureHorizontalScale"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(43)
  void textureHorizontalScale(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "TextureVerticalScale"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(44)
  float textureVerticalScale();


  /**
   * <p>
   * Setter method for the COM property "TextureVerticalScale"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(45)
  void textureVerticalScale(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "TextureTile"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(46)
  office.MsoTriState textureTile();


  /**
   * <p>
   * Setter method for the COM property "TextureTile"
   * </p>
   * @param prop Mandatory office.MsoTriState parameter.
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(47)
  void textureTile(
    office.MsoTriState prop);


  /**
   * <p>
   * Getter method for the COM property "RotateWithObject"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(48)
  office.MsoTriState rotateWithObject();


  /**
   * <p>
   * Setter method for the COM property "RotateWithObject"
   * </p>
   * @param prop Mandatory office.MsoTriState parameter.
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(49)
  void rotateWithObject(
    office.MsoTriState prop);


  /**
   * <p>
   * Getter method for the COM property "PictureEffects"
   * </p>
   * @return  Returns a value of type office.PictureEffects
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(50)
  office.PictureEffects pictureEffects();


  @VTID(50)
  @ReturnValue(defaultPropertyThrough={office.PictureEffects.class})
  office.PictureEffect pictureEffects(
    int index);

  /**
   * <p>
   * Getter method for the COM property "GradientAngle"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(51)
  float gradientAngle();


  /**
   * <p>
   * Setter method for the COM property "GradientAngle"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(52)
  void gradientAngle(
    float prop);


  // Properties:
}
