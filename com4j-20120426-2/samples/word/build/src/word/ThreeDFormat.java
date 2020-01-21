package word  ;

import com4j.*;

@IID("{000209D0-0000-0000-C000-000000000046}")
public interface ThreeDFormat extends Com4jObject {
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
   * Getter method for the COM property "Depth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(10)
  float depth();


  /**
   * <p>
   * Setter method for the COM property "Depth"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(11)
  void depth(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "ExtrusionColor"
   * </p>
   * @return  Returns a value of type word.ColorFormat
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(12)
  word.ColorFormat extrusionColor();


  /**
   * <p>
   * Getter method for the COM property "ExtrusionColorType"
   * </p>
   * @return  Returns a value of type office.MsoExtrusionColorType
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(13)
  office.MsoExtrusionColorType extrusionColorType();


  /**
   * <p>
   * Setter method for the COM property "ExtrusionColorType"
   * </p>
   * @param prop Mandatory office.MsoExtrusionColorType parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(14)
  void extrusionColorType(
    office.MsoExtrusionColorType prop);


  /**
   * <p>
   * Getter method for the COM property "Perspective"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(15)
  office.MsoTriState perspective();


  /**
   * <p>
   * Setter method for the COM property "Perspective"
   * </p>
   * @param prop Mandatory office.MsoTriState parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(16)
  void perspective(
    office.MsoTriState prop);


  /**
   * <p>
   * Getter method for the COM property "PresetExtrusionDirection"
   * </p>
   * @return  Returns a value of type office.MsoPresetExtrusionDirection
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(17)
  office.MsoPresetExtrusionDirection presetExtrusionDirection();


  /**
   * <p>
   * Getter method for the COM property "PresetLightingDirection"
   * </p>
   * @return  Returns a value of type office.MsoPresetLightingDirection
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(18)
  office.MsoPresetLightingDirection presetLightingDirection();


  /**
   * <p>
   * Setter method for the COM property "PresetLightingDirection"
   * </p>
   * @param prop Mandatory office.MsoPresetLightingDirection parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(19)
  void presetLightingDirection(
    office.MsoPresetLightingDirection prop);


  /**
   * <p>
   * Getter method for the COM property "PresetLightingSoftness"
   * </p>
   * @return  Returns a value of type office.MsoPresetLightingSoftness
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(20)
  office.MsoPresetLightingSoftness presetLightingSoftness();


  /**
   * <p>
   * Setter method for the COM property "PresetLightingSoftness"
   * </p>
   * @param prop Mandatory office.MsoPresetLightingSoftness parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(21)
  void presetLightingSoftness(
    office.MsoPresetLightingSoftness prop);


  /**
   * <p>
   * Getter method for the COM property "PresetMaterial"
   * </p>
   * @return  Returns a value of type office.MsoPresetMaterial
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(22)
  office.MsoPresetMaterial presetMaterial();


  /**
   * <p>
   * Setter method for the COM property "PresetMaterial"
   * </p>
   * @param prop Mandatory office.MsoPresetMaterial parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(23)
  void presetMaterial(
    office.MsoPresetMaterial prop);


  /**
   * <p>
   * Getter method for the COM property "PresetThreeDFormat"
   * </p>
   * @return  Returns a value of type office.MsoPresetThreeDFormat
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(24)
  office.MsoPresetThreeDFormat presetThreeDFormat();


  /**
   * <p>
   * Getter method for the COM property "RotationX"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(25)
  float rotationX();


  /**
   * <p>
   * Setter method for the COM property "RotationX"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(26)
  void rotationX(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "RotationY"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(27)
  float rotationY();


  /**
   * <p>
   * Setter method for the COM property "RotationY"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(28)
  void rotationY(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(29)
  office.MsoTriState visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param prop Mandatory office.MsoTriState parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(30)
  void visible(
    office.MsoTriState prop);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(31)
  void incrementRotationX(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(32)
  void incrementRotationY(
    float increment);


  /**
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(33)
  void resetRotation();


  /**
   * @param presetExtrusionDirection Mandatory office.MsoPresetExtrusionDirection parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(34)
  void setExtrusionDirection(
    office.MsoPresetExtrusionDirection presetExtrusionDirection);


  /**
   * @param presetThreeDFormat Mandatory office.MsoPresetThreeDFormat parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(35)
  void setThreeDFormat(
    office.MsoPresetThreeDFormat presetThreeDFormat);


  /**
   * @param presetCamera Mandatory office.MsoPresetCamera parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(36)
  void setPresetCamera(
    office.MsoPresetCamera presetCamera);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(37)
  void incrementRotationZ(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(38)
  void incrementRotationHorizontal(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(39)
  void incrementRotationVertical(
    float increment);


  /**
   * <p>
   * Getter method for the COM property "PresetLighting"
   * </p>
   * @return  Returns a value of type office.MsoLightRigType
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(40)
  office.MsoLightRigType presetLighting();


  /**
   * <p>
   * Setter method for the COM property "PresetLighting"
   * </p>
   * @param prop Mandatory office.MsoLightRigType parameter.
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(41)
  void presetLighting(
    office.MsoLightRigType prop);


  /**
   * <p>
   * Getter method for the COM property "Z"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(42)
  float z();


  /**
   * <p>
   * Setter method for the COM property "Z"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(43)
  void z(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "BevelTopType"
   * </p>
   * @return  Returns a value of type office.MsoBevelType
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(44)
  office.MsoBevelType bevelTopType();


  /**
   * <p>
   * Setter method for the COM property "BevelTopType"
   * </p>
   * @param prop Mandatory office.MsoBevelType parameter.
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(45)
  void bevelTopType(
    office.MsoBevelType prop);


  /**
   * <p>
   * Getter method for the COM property "BevelTopInset"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(46)
  float bevelTopInset();


  /**
   * <p>
   * Setter method for the COM property "BevelTopInset"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(47)
  void bevelTopInset(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "BevelTopDepth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(48)
  float bevelTopDepth();


  /**
   * <p>
   * Setter method for the COM property "BevelTopDepth"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(49)
  void bevelTopDepth(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "BevelBottomType"
   * </p>
   * @return  Returns a value of type office.MsoBevelType
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(50)
  office.MsoBevelType bevelBottomType();


  /**
   * <p>
   * Setter method for the COM property "BevelBottomType"
   * </p>
   * @param prop Mandatory office.MsoBevelType parameter.
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(51)
  void bevelBottomType(
    office.MsoBevelType prop);


  /**
   * <p>
   * Getter method for the COM property "BevelBottomInset"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(52)
  float bevelBottomInset();


  /**
   * <p>
   * Setter method for the COM property "BevelBottomInset"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(53)
  void bevelBottomInset(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "BevelBottomDepth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(54)
  float bevelBottomDepth();


  /**
   * <p>
   * Setter method for the COM property "BevelBottomDepth"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(55)
  void bevelBottomDepth(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "PresetCamera"
   * </p>
   * @return  Returns a value of type office.MsoPresetCamera
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(56)
  office.MsoPresetCamera presetCamera();


  /**
   * <p>
   * Getter method for the COM property "RotationZ"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(57)
  float rotationZ();


  /**
   * <p>
   * Setter method for the COM property "RotationZ"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(58)
  void rotationZ(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "ContourWidth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(59)
  float contourWidth();


  /**
   * <p>
   * Setter method for the COM property "ContourWidth"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(60)
  void contourWidth(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "ContourColor"
   * </p>
   * @return  Returns a value of type word.ColorFormat
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(61)
  word.ColorFormat contourColor();


  /**
   * <p>
   * Getter method for the COM property "FieldOfView"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(124) //= 0x7c. The runtime will prefer the VTID if present
  @VTID(62)
  float fieldOfView();


  /**
   * <p>
   * Setter method for the COM property "FieldOfView"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(124) //= 0x7c. The runtime will prefer the VTID if present
  @VTID(63)
  void fieldOfView(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "ProjectText"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(125) //= 0x7d. The runtime will prefer the VTID if present
  @VTID(64)
  office.MsoTriState projectText();


  /**
   * <p>
   * Setter method for the COM property "ProjectText"
   * </p>
   * @param prop Mandatory office.MsoTriState parameter.
   */

  @DISPID(125) //= 0x7d. The runtime will prefer the VTID if present
  @VTID(65)
  void projectText(
    office.MsoTriState prop);


  /**
   * <p>
   * Getter method for the COM property "LightAngle"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(66)
  float lightAngle();


  /**
   * <p>
   * Setter method for the COM property "LightAngle"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(67)
  void lightAngle(
    float prop);


  // Properties:
}
