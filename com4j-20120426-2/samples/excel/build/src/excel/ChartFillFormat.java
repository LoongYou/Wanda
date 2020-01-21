package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ChartFillFormat extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   */

  @DISPID(148)
  @PropGet
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   */

  @DISPID(149)
  @PropGet
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   */

  @DISPID(150)
  @PropGet
  com4j.Com4jObject getParent();


  /**
   * @param style Mandatory office.MsoGradientStyle parameter.
   * @param variant Mandatory int parameter.
   * @param degree Mandatory float parameter.
   */

  @DISPID(1621)
  void oneColorGradient(
    office.MsoGradientStyle style,
    int variant,
    float degree);


  /**
   * @param style Mandatory office.MsoGradientStyle parameter.
   * @param variant Mandatory int parameter.
   */

  @DISPID(1624)
  void twoColorGradient(
    office.MsoGradientStyle style,
    int variant);


  /**
   * @param presetTexture Mandatory office.MsoPresetTexture parameter.
   */

  @DISPID(1625)
  void presetTextured(
    office.MsoPresetTexture presetTexture);


  /**
   */

  @DISPID(1627)
  void solid();


  /**
   * @param pattern Mandatory office.MsoPatternType parameter.
   */

  @DISPID(1628)
  void patterned(
    office.MsoPatternType pattern);


  /**
   * @param pictureFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pictureFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pictureStackUnit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param picturePlacement Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1629)
  void userPicture(
    @Optional java.lang.Object pictureFile,
    @Optional java.lang.Object pictureFormat,
    @Optional java.lang.Object pictureStackUnit,
    @Optional java.lang.Object picturePlacement);


  /**
   * @param textureFile Mandatory java.lang.String parameter.
   */

  @DISPID(1634)
  void userTextured(
    java.lang.String textureFile);


  /**
   * @param style Mandatory office.MsoGradientStyle parameter.
   * @param variant Mandatory int parameter.
   * @param presetGradientType Mandatory office.MsoPresetGradientType parameter.
   */

  @DISPID(1636)
  void presetGradient(
    office.MsoGradientStyle style,
    int variant,
    office.MsoPresetGradientType presetGradientType);


  /**
   * <p>
   * Getter method for the COM property "BackColor"
   * </p>
   */

  @DISPID(1638)
  @PropGet
  excel.ChartColorFormat getBackColor();


  /**
   * <p>
   * Getter method for the COM property "ForeColor"
   * </p>
   */

  @DISPID(1639)
  @PropGet
  excel.ChartColorFormat getForeColor();


  /**
   * <p>
   * Getter method for the COM property "GradientColorType"
   * </p>
   */

  @DISPID(1640)
  @PropGet
  office.MsoGradientColorType getGradientColorType();


  /**
   * <p>
   * Getter method for the COM property "GradientDegree"
   * </p>
   */

  @DISPID(1641)
  @PropGet
  float getGradientDegree();


  /**
   * <p>
   * Getter method for the COM property "GradientStyle"
   * </p>
   */

  @DISPID(1642)
  @PropGet
  office.MsoGradientStyle getGradientStyle();


  /**
   * <p>
   * Getter method for the COM property "GradientVariant"
   * </p>
   */

  @DISPID(1643)
  @PropGet
  int getGradientVariant();


  /**
   * <p>
   * Getter method for the COM property "Pattern"
   * </p>
   */

  @DISPID(95)
  @PropGet
  office.MsoPatternType getPattern();


  /**
   * <p>
   * Getter method for the COM property "PresetGradientType"
   * </p>
   */

  @DISPID(1637)
  @PropGet
  office.MsoPresetGradientType getPresetGradientType();


  /**
   * <p>
   * Getter method for the COM property "PresetTexture"
   * </p>
   */

  @DISPID(1626)
  @PropGet
  office.MsoPresetTexture getPresetTexture();


  /**
   * <p>
   * Getter method for the COM property "TextureName"
   * </p>
   */

  @DISPID(1644)
  @PropGet
  java.lang.String getTextureName();


  /**
   * <p>
   * Getter method for the COM property "TextureType"
   * </p>
   */

  @DISPID(1645)
  @PropGet
  office.MsoTextureType getTextureType();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  office.MsoFillType getType();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   */

  @DISPID(558)
  @PropGet
  office.MsoTriState getVisible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory office.MsoTriState parameter.
   */

  @DISPID(558)
  @PropPut
  void setVisible(
    office.MsoTriState rhs);


  // Properties:
}
