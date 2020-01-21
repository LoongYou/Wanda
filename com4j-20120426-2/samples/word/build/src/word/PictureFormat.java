package word  ;

import com4j.*;

@IID("{000209CB-0000-0000-C000-000000000046}")
public interface PictureFormat extends Com4jObject {
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
   * Getter method for the COM property "Brightness"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(10)
  float brightness();


  /**
   * <p>
   * Setter method for the COM property "Brightness"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(11)
  void brightness(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "ColorType"
   * </p>
   * @return  Returns a value of type office.MsoPictureColorType
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(12)
  office.MsoPictureColorType colorType();


  /**
   * <p>
   * Setter method for the COM property "ColorType"
   * </p>
   * @param prop Mandatory office.MsoPictureColorType parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(13)
  void colorType(
    office.MsoPictureColorType prop);


  /**
   * <p>
   * Getter method for the COM property "Contrast"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(14)
  float contrast();


  /**
   * <p>
   * Setter method for the COM property "Contrast"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(15)
  void contrast(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "CropBottom"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(16)
  float cropBottom();


  /**
   * <p>
   * Setter method for the COM property "CropBottom"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(17)
  void cropBottom(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "CropLeft"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(18)
  float cropLeft();


  /**
   * <p>
   * Setter method for the COM property "CropLeft"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(19)
  void cropLeft(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "CropRight"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(20)
  float cropRight();


  /**
   * <p>
   * Setter method for the COM property "CropRight"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(21)
  void cropRight(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "CropTop"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(22)
  float cropTop();


  /**
   * <p>
   * Setter method for the COM property "CropTop"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(23)
  void cropTop(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "TransparencyColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(24)
  int transparencyColor();


  /**
   * <p>
   * Setter method for the COM property "TransparencyColor"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(25)
  void transparencyColor(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "TransparentBackground"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(26)
  office.MsoTriState transparentBackground();


  /**
   * <p>
   * Setter method for the COM property "TransparentBackground"
   * </p>
   * @param prop Mandatory office.MsoTriState parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(27)
  void transparentBackground(
    office.MsoTriState prop);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(28)
  void incrementBrightness(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(29)
  void incrementContrast(
    float increment);


  /**
   * <p>
   * Getter method for the COM property "Crop"
   * </p>
   * @return  Returns a value of type office.Crop
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(30)
  office.Crop crop();


  /**
   * <p>
   * Setter method for the COM property "Crop"
   * </p>
   * @param prop Mandatory office.Crop parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(31)
  void crop(
    office.Crop prop);


  // Properties:
}
