package office  ;

import com4j.*;

@IID("{000C031A-0000-0000-C000-000000000046}")
public interface PictureFormat extends office._IMsoDispObj {
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
   * @param increment Mandatory float parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(10)
  void incrementBrightness(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(11)
  void incrementContrast(
    float increment);


  /**
   * <p>
   * Getter method for the COM property "Brightness"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(12)
  float brightness();


  /**
   * <p>
   * Setter method for the COM property "Brightness"
   * </p>
   * @param brightness Mandatory float parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(13)
  void brightness(
    float brightness);


  /**
   * <p>
   * Getter method for the COM property "ColorType"
   * </p>
   * @return  Returns a value of type office.MsoPictureColorType
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(14)
  office.MsoPictureColorType colorType();


  /**
   * <p>
   * Setter method for the COM property "ColorType"
   * </p>
   * @param colorType Mandatory office.MsoPictureColorType parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(15)
  void colorType(
    office.MsoPictureColorType colorType);


  /**
   * <p>
   * Getter method for the COM property "Contrast"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(16)
  float contrast();


  /**
   * <p>
   * Setter method for the COM property "Contrast"
   * </p>
   * @param contrast Mandatory float parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(17)
  void contrast(
    float contrast);


  /**
   * <p>
   * Getter method for the COM property "CropBottom"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(18)
  float cropBottom();


  /**
   * <p>
   * Setter method for the COM property "CropBottom"
   * </p>
   * @param cropBottom Mandatory float parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(19)
  void cropBottom(
    float cropBottom);


  /**
   * <p>
   * Getter method for the COM property "CropLeft"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(20)
  float cropLeft();


  /**
   * <p>
   * Setter method for the COM property "CropLeft"
   * </p>
   * @param cropLeft Mandatory float parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(21)
  void cropLeft(
    float cropLeft);


  /**
   * <p>
   * Getter method for the COM property "CropRight"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(22)
  float cropRight();


  /**
   * <p>
   * Setter method for the COM property "CropRight"
   * </p>
   * @param cropRight Mandatory float parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(23)
  void cropRight(
    float cropRight);


  /**
   * <p>
   * Getter method for the COM property "CropTop"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(24)
  float cropTop();


  /**
   * <p>
   * Setter method for the COM property "CropTop"
   * </p>
   * @param cropTop Mandatory float parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(25)
  void cropTop(
    float cropTop);


  /**
   * <p>
   * Getter method for the COM property "TransparencyColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(26)
  int transparencyColor();


  /**
   * <p>
   * Setter method for the COM property "TransparencyColor"
   * </p>
   * @param transparencyColor Mandatory int parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(27)
  void transparencyColor(
    int transparencyColor);


  /**
   * <p>
   * Getter method for the COM property "TransparentBackground"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(28)
  office.MsoTriState transparentBackground();


  /**
   * <p>
   * Setter method for the COM property "TransparentBackground"
   * </p>
   * @param transparentBackground Mandatory office.MsoTriState parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(29)
  void transparentBackground(
    office.MsoTriState transparentBackground);


  /**
   * <p>
   * Getter method for the COM property "Crop"
   * </p>
   * @return  Returns a value of type office.Crop
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(30)
  office.Crop crop();


  // Properties:
}
