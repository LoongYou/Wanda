package office  ;

import com4j.*;

@IID("{000C0314-0000-0000-C000-000000000046}")
public interface FillFormat extends office._IMsoDispObj {
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
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(10)
  void background();


  /**
   * @param style Mandatory office.MsoGradientStyle parameter.
   * @param variant Mandatory int parameter.
   * @param degree Mandatory float parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(11)
  void oneColorGradient(
    office.MsoGradientStyle style,
    int variant,
    float degree);


  /**
   * @param pattern Mandatory office.MsoPatternType parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(12)
  void patterned(
    office.MsoPatternType pattern);


  /**
   * @param style Mandatory office.MsoGradientStyle parameter.
   * @param variant Mandatory int parameter.
   * @param presetGradientType Mandatory office.MsoPresetGradientType parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(13)
  void presetGradient(
    office.MsoGradientStyle style,
    int variant,
    office.MsoPresetGradientType presetGradientType);


  /**
   * @param presetTexture Mandatory office.MsoPresetTexture parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(14)
  void presetTextured(
    office.MsoPresetTexture presetTexture);


  /**
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(15)
  void solid();


  /**
   * @param style Mandatory office.MsoGradientStyle parameter.
   * @param variant Mandatory int parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(16)
  void twoColorGradient(
    office.MsoGradientStyle style,
    int variant);


  /**
   * @param pictureFile Mandatory java.lang.String parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(17)
  void userPicture(
    java.lang.String pictureFile);


  /**
   * @param textureFile Mandatory java.lang.String parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(18)
  void userTextured(
    java.lang.String textureFile);


  /**
   * <p>
   * Getter method for the COM property "BackColor"
   * </p>
   * @return  Returns a value of type office.ColorFormat
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(19)
  office.ColorFormat backColor();


  /**
   * <p>
   * Setter method for the COM property "BackColor"
   * </p>
   * @param backColor Mandatory office.ColorFormat parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(20)
  void backColor(
    office.ColorFormat backColor);


  /**
   * <p>
   * Getter method for the COM property "ForeColor"
   * </p>
   * @return  Returns a value of type office.ColorFormat
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(21)
  office.ColorFormat foreColor();


  /**
   * <p>
   * Setter method for the COM property "ForeColor"
   * </p>
   * @param foreColor Mandatory office.ColorFormat parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(22)
  void foreColor(
    office.ColorFormat foreColor);


  /**
   * <p>
   * Getter method for the COM property "GradientColorType"
   * </p>
   * @return  Returns a value of type office.MsoGradientColorType
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(23)
  office.MsoGradientColorType gradientColorType();


  /**
   * <p>
   * Getter method for the COM property "GradientDegree"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(24)
  float gradientDegree();


  /**
   * <p>
   * Getter method for the COM property "GradientStyle"
   * </p>
   * @return  Returns a value of type office.MsoGradientStyle
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(25)
  office.MsoGradientStyle gradientStyle();


  /**
   * <p>
   * Getter method for the COM property "GradientVariant"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(26)
  int gradientVariant();


  /**
   * <p>
   * Getter method for the COM property "Pattern"
   * </p>
   * @return  Returns a value of type office.MsoPatternType
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(27)
  office.MsoPatternType pattern();


  /**
   * <p>
   * Getter method for the COM property "PresetGradientType"
   * </p>
   * @return  Returns a value of type office.MsoPresetGradientType
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(28)
  office.MsoPresetGradientType presetGradientType();


  /**
   * <p>
   * Getter method for the COM property "PresetTexture"
   * </p>
   * @return  Returns a value of type office.MsoPresetTexture
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(29)
  office.MsoPresetTexture presetTexture();


  /**
   * <p>
   * Getter method for the COM property "TextureName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(30)
  java.lang.String textureName();


  /**
   * <p>
   * Getter method for the COM property "TextureType"
   * </p>
   * @return  Returns a value of type office.MsoTextureType
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(31)
  office.MsoTextureType textureType();


  /**
   * <p>
   * Getter method for the COM property "Transparency"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(32)
  float transparency();


  /**
   * <p>
   * Setter method for the COM property "Transparency"
   * </p>
   * @param transparency Mandatory float parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(33)
  void transparency(
    float transparency);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type office.MsoFillType
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(34)
  office.MsoFillType type();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(35)
  office.MsoTriState visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param visible Mandatory office.MsoTriState parameter.
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(36)
  void visible(
    office.MsoTriState visible);


  /**
   * <p>
   * Getter method for the COM property "GradientStops"
   * </p>
   * @return  Returns a value of type office.GradientStops
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(37)
  office.GradientStops gradientStops();


  @VTID(37)
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
  @VTID(38)
  float textureOffsetX();


  /**
   * <p>
   * Setter method for the COM property "TextureOffsetX"
   * </p>
   * @param textureOffsetX Mandatory float parameter.
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(39)
  void textureOffsetX(
    float textureOffsetX);


  /**
   * <p>
   * Getter method for the COM property "TextureOffsetY"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(40)
  float textureOffsetY();


  /**
   * <p>
   * Setter method for the COM property "TextureOffsetY"
   * </p>
   * @param textureOffsetY Mandatory float parameter.
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(41)
  void textureOffsetY(
    float textureOffsetY);


  /**
   * <p>
   * Getter method for the COM property "TextureAlignment"
   * </p>
   * @return  Returns a value of type office.MsoTextureAlignment
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(42)
  office.MsoTextureAlignment textureAlignment();


  /**
   * <p>
   * Setter method for the COM property "TextureAlignment"
   * </p>
   * @param textureAlignment Mandatory office.MsoTextureAlignment parameter.
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(43)
  void textureAlignment(
    office.MsoTextureAlignment textureAlignment);


  /**
   * <p>
   * Getter method for the COM property "TextureHorizontalScale"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(44)
  float textureHorizontalScale();


  /**
   * <p>
   * Setter method for the COM property "TextureHorizontalScale"
   * </p>
   * @param horizontalScale Mandatory float parameter.
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(45)
  void textureHorizontalScale(
    float horizontalScale);


  /**
   * <p>
   * Getter method for the COM property "TextureVerticalScale"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(46)
  float textureVerticalScale();


  /**
   * <p>
   * Setter method for the COM property "TextureVerticalScale"
   * </p>
   * @param verticalScale Mandatory float parameter.
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(47)
  void textureVerticalScale(
    float verticalScale);


  /**
   * <p>
   * Getter method for the COM property "TextureTile"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(48)
  office.MsoTriState textureTile();


  /**
   * <p>
   * Setter method for the COM property "TextureTile"
   * </p>
   * @param textureTile Mandatory office.MsoTriState parameter.
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(49)
  void textureTile(
    office.MsoTriState textureTile);


  /**
   * <p>
   * Getter method for the COM property "RotateWithObject"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(50)
  office.MsoTriState rotateWithObject();


  /**
   * <p>
   * Setter method for the COM property "RotateWithObject"
   * </p>
   * @param rotateWithObject Mandatory office.MsoTriState parameter.
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(51)
  void rotateWithObject(
    office.MsoTriState rotateWithObject);


  /**
   * <p>
   * Getter method for the COM property "PictureEffects"
   * </p>
   * @return  Returns a value of type office.PictureEffects
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(52)
  office.PictureEffects pictureEffects();


  @VTID(52)
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
  @VTID(53)
  float gradientAngle();


  /**
   * <p>
   * Setter method for the COM property "GradientAngle"
   * </p>
   * @param gradientAngle Mandatory float parameter.
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(54)
  void gradientAngle(
    float gradientAngle);


  // Properties:
}
