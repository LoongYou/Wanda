package excel  ;

import com4j.*;

@IID("{00024435-0001-0000-C000-000000000046}")
public interface IChartFillFormat extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type excel._Application
   */

  @VTID(7)
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type excel.XlCreator
   */

  @VTID(8)
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getParent();


  /**
   * @param style Mandatory office.MsoGradientStyle parameter.
   * @param variant Mandatory int parameter.
   * @param degree Mandatory float parameter.
   */

  @VTID(10)
  void oneColorGradient(
    office.MsoGradientStyle style,
    int variant,
    float degree);


  /**
   * @param style Mandatory office.MsoGradientStyle parameter.
   * @param variant Mandatory int parameter.
   */

  @VTID(11)
  void twoColorGradient(
    office.MsoGradientStyle style,
    int variant);


  /**
   * @param presetTexture Mandatory office.MsoPresetTexture parameter.
   */

  @VTID(12)
  void presetTextured(
    office.MsoPresetTexture presetTexture);


  /**
   */

  @VTID(13)
  void solid();


  /**
   * @param pattern Mandatory office.MsoPatternType parameter.
   */

  @VTID(14)
  void patterned(
    office.MsoPatternType pattern);


  /**
   * @param pictureFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pictureFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pictureStackUnit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param picturePlacement Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(15)
  void userPicture(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object pictureFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object pictureFormat,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object pictureStackUnit,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object picturePlacement);


  /**
   * @param textureFile Mandatory java.lang.String parameter.
   */

  @VTID(16)
  void userTextured(
    java.lang.String textureFile);


  /**
   * @param style Mandatory office.MsoGradientStyle parameter.
   * @param variant Mandatory int parameter.
   * @param presetGradientType Mandatory office.MsoPresetGradientType parameter.
   */

  @VTID(17)
  void presetGradient(
    office.MsoGradientStyle style,
    int variant,
    office.MsoPresetGradientType presetGradientType);


  /**
   * <p>
   * Getter method for the COM property "BackColor"
   * </p>
   * @return  Returns a value of type excel.ChartColorFormat
   */

  @VTID(18)
  excel.ChartColorFormat getBackColor();


  /**
   * <p>
   * Getter method for the COM property "ForeColor"
   * </p>
   * @return  Returns a value of type excel.ChartColorFormat
   */

  @VTID(19)
  excel.ChartColorFormat getForeColor();


  /**
   * <p>
   * Getter method for the COM property "GradientColorType"
   * </p>
   * @return  Returns a value of type office.MsoGradientColorType
   */

  @VTID(20)
  office.MsoGradientColorType getGradientColorType();


  /**
   * <p>
   * Getter method for the COM property "GradientDegree"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(21)
  float getGradientDegree();


  /**
   * <p>
   * Getter method for the COM property "GradientStyle"
   * </p>
   * @return  Returns a value of type office.MsoGradientStyle
   */

  @VTID(22)
  office.MsoGradientStyle getGradientStyle();


  /**
   * <p>
   * Getter method for the COM property "GradientVariant"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(23)
  int getGradientVariant();


  /**
   * <p>
   * Getter method for the COM property "Pattern"
   * </p>
   * @return  Returns a value of type office.MsoPatternType
   */

  @VTID(24)
  office.MsoPatternType getPattern();


  /**
   * <p>
   * Getter method for the COM property "PresetGradientType"
   * </p>
   * @return  Returns a value of type office.MsoPresetGradientType
   */

  @VTID(25)
  office.MsoPresetGradientType getPresetGradientType();


  /**
   * <p>
   * Getter method for the COM property "PresetTexture"
   * </p>
   * @return  Returns a value of type office.MsoPresetTexture
   */

  @VTID(26)
  office.MsoPresetTexture getPresetTexture();


  /**
   * <p>
   * Getter method for the COM property "TextureName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(27)
  java.lang.String getTextureName();


  /**
   * <p>
   * Getter method for the COM property "TextureType"
   * </p>
   * @return  Returns a value of type office.MsoTextureType
   */

  @VTID(28)
  office.MsoTextureType getTextureType();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type office.MsoFillType
   */

  @VTID(29)
  office.MsoFillType getType();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @VTID(30)
  office.MsoTriState getVisible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory office.MsoTriState parameter.
   */

  @VTID(31)
  void setVisible(
    office.MsoTriState rhs);


  // Properties:
}
