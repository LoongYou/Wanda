package excel  ;

import com4j.*;

@IID("{000C031B-0000-0000-C000-000000000046}")
public interface ShadowFormat extends office._IMsoDispObj {
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
  com4j.Com4jObject getParent();


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(10)
  void incrementOffsetX(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(11)
  void incrementOffsetY(
    float increment);


  /**
   * <p>
   * Getter method for the COM property "ForeColor"
   * </p>
   * @return  Returns a value of type excel.ColorFormat
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(12)
  excel.ColorFormat getForeColor();


  /**
   * <p>
   * Setter method for the COM property "ForeColor"
   * </p>
   * @param foreColor Mandatory excel.ColorFormat parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(13)
  void setForeColor(
    excel.ColorFormat foreColor);


  /**
   * <p>
   * Getter method for the COM property "Obscured"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(14)
  office.MsoTriState getObscured();


  /**
   * <p>
   * Setter method for the COM property "Obscured"
   * </p>
   * @param obscured Mandatory office.MsoTriState parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(15)
  void setObscured(
    office.MsoTriState obscured);


  /**
   * <p>
   * Getter method for the COM property "OffsetX"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(16)
  float getOffsetX();


  /**
   * <p>
   * Setter method for the COM property "OffsetX"
   * </p>
   * @param offsetX Mandatory float parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(17)
  void setOffsetX(
    float offsetX);


  /**
   * <p>
   * Getter method for the COM property "OffsetY"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(18)
  float getOffsetY();


  /**
   * <p>
   * Setter method for the COM property "OffsetY"
   * </p>
   * @param offsetY Mandatory float parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(19)
  void setOffsetY(
    float offsetY);


  /**
   * <p>
   * Getter method for the COM property "Transparency"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(20)
  float getTransparency();


  /**
   * <p>
   * Setter method for the COM property "Transparency"
   * </p>
   * @param transparency Mandatory float parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(21)
  void setTransparency(
    float transparency);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type office.MsoShadowType
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(22)
  office.MsoShadowType getType();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param type Mandatory office.MsoShadowType parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(23)
  void setType(
    office.MsoShadowType type);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(24)
  office.MsoTriState getVisible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param visible Mandatory office.MsoTriState parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(25)
  void setVisible(
    office.MsoTriState visible);


  /**
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   * @return  Returns a value of type office.MsoShadowStyle
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(26)
  office.MsoShadowStyle getStyle();


  /**
   * <p>
   * Setter method for the COM property "Style"
   * </p>
   * @param shadowStyle Mandatory office.MsoShadowStyle parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(27)
  void setStyle(
    office.MsoShadowStyle shadowStyle);


  /**
   * <p>
   * Getter method for the COM property "Blur"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(28)
  float getBlur();


  /**
   * <p>
   * Setter method for the COM property "Blur"
   * </p>
   * @param blur Mandatory float parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(29)
  void setBlur(
    float blur);


  /**
   * <p>
   * Getter method for the COM property "Size"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(30)
  float getSize();


  /**
   * <p>
   * Setter method for the COM property "Size"
   * </p>
   * @param size Mandatory float parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(31)
  void setSize(
    float size);


  /**
   * <p>
   * Getter method for the COM property "RotateWithShape"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(32)
  office.MsoTriState getRotateWithShape();


  /**
   * <p>
   * Setter method for the COM property "RotateWithShape"
   * </p>
   * @param rotateWithShape Mandatory office.MsoTriState parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(33)
  void setRotateWithShape(
    office.MsoTriState rotateWithShape);


  // Properties:
}
