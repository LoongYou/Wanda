package ppt  ;

import com4j.*;

@IID("{92D41A5B-F07E-4CA4-AF6F-BEF486AA4E6F}")
public interface ChartFillFormat extends Com4jObject {
  // Methods:
  /**
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  void solid();


  /**
   * @param textureFile Mandatory java.lang.String parameter.
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(8)
  void userTextured(
    java.lang.String textureFile);


  /**
   * <p>
   * Getter method for the COM property "BackColor"
   * </p>
   * @return  Returns a value of type ppt.ChartColorFormat
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.ChartColorFormat backColor();


  /**
   * <p>
   * Getter method for the COM property "ForeColor"
   * </p>
   * @return  Returns a value of type ppt.ChartColorFormat
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  ppt.ChartColorFormat foreColor();


  /**
   * <p>
   * Getter method for the COM property "GradientDegree"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  float gradientDegree();


  /**
   * <p>
   * Getter method for the COM property "TextureName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String textureName();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(13)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(15)
  ppt._Application application();


  /**
   * @param style Mandatory office.MsoGradientStyle parameter.
   * @param variant Mandatory int parameter.
   * @param degree Mandatory float parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(16)
  void oneColorGradient(
    office.MsoGradientStyle style,
    int variant,
    float degree);


  /**
   * <p>
   * Getter method for the COM property "GradientColorType"
   * </p>
   * @return  Returns a value of type office.MsoGradientColorType
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(17)
  office.MsoGradientColorType gradientColorType();


  /**
   * <p>
   * Getter method for the COM property "GradientStyle"
   * </p>
   * @return  Returns a value of type office.MsoGradientStyle
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(18)
  office.MsoGradientStyle gradientStyle();


  /**
   * <p>
   * Getter method for the COM property "GradientVariant"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(19)
  int gradientVariant();


  /**
   * <p>
   * Getter method for the COM property "Pattern"
   * </p>
   * @return  Returns a value of type office.MsoPatternType
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(20)
  office.MsoPatternType pattern();


  /**
   * @param pattern Mandatory office.MsoPatternType parameter.
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(21)
  void patterned(
    office.MsoPatternType pattern);


  /**
   * @param style Mandatory office.MsoGradientStyle parameter.
   * @param variant Mandatory int parameter.
   * @param presetGradientType Mandatory office.MsoPresetGradientType parameter.
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(22)
  void presetGradient(
    office.MsoGradientStyle style,
    int variant,
    office.MsoPresetGradientType presetGradientType);


  /**
   * <p>
   * Getter method for the COM property "PresetGradientType"
   * </p>
   * @return  Returns a value of type office.MsoPresetGradientType
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(23)
  office.MsoPresetGradientType presetGradientType();


  /**
   * <p>
   * Getter method for the COM property "PresetTexture"
   * </p>
   * @return  Returns a value of type office.MsoPresetTexture
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(24)
  office.MsoPresetTexture presetTexture();


  /**
   * @param presetTexture Mandatory office.MsoPresetTexture parameter.
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(25)
  void presetTextured(
    office.MsoPresetTexture presetTexture);


  /**
   * <p>
   * Getter method for the COM property "TextureType"
   * </p>
   * @return  Returns a value of type office.MsoTextureType
   */

  @DISPID(2018) //= 0x7e2. The runtime will prefer the VTID if present
  @VTID(26)
  office.MsoTextureType textureType();


  /**
   * @param style Mandatory office.MsoGradientStyle parameter.
   * @param variant Mandatory int parameter.
   */

  @DISPID(2019) //= 0x7e3. The runtime will prefer the VTID if present
  @VTID(27)
  void twoColorGradient(
    office.MsoGradientStyle style,
    int variant);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type office.MsoFillType
   */

  @DISPID(2020) //= 0x7e4. The runtime will prefer the VTID if present
  @VTID(28)
  office.MsoFillType type();


  /**
   * @param pictureFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pictureFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pictureStackUnit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param picturePlacement Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2021) //= 0x7e5. The runtime will prefer the VTID if present
  @VTID(29)
  void userPicture(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object pictureFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object pictureFormat,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object pictureStackUnit,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object picturePlacement);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2022) //= 0x7e6. The runtime will prefer the VTID if present
  @VTID(30)
  office.MsoTriState visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory office.MsoTriState parameter.
   */

  @DISPID(2022) //= 0x7e6. The runtime will prefer the VTID if present
  @VTID(31)
  void visible(
    office.MsoTriState rhs);


  // Properties:
}
