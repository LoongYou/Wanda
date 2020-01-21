package office  ;

import com4j.*;

@IID("{000C0398-0000-0000-C000-000000000046}")
public interface TextFrame2 extends office._IMsoDispObj {
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
   * Getter method for the COM property "MarginBottom"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(10)
  float marginBottom();


  /**
   * <p>
   * Setter method for the COM property "MarginBottom"
   * </p>
   * @param marginBottom Mandatory float parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(11)
  void marginBottom(
    float marginBottom);


  /**
   * <p>
   * Getter method for the COM property "MarginLeft"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(12)
  float marginLeft();


  /**
   * <p>
   * Setter method for the COM property "MarginLeft"
   * </p>
   * @param marginLeft Mandatory float parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(13)
  void marginLeft(
    float marginLeft);


  /**
   * <p>
   * Getter method for the COM property "MarginRight"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(14)
  float marginRight();


  /**
   * <p>
   * Setter method for the COM property "MarginRight"
   * </p>
   * @param marginRight Mandatory float parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(15)
  void marginRight(
    float marginRight);


  /**
   * <p>
   * Getter method for the COM property "MarginTop"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(16)
  float marginTop();


  /**
   * <p>
   * Setter method for the COM property "MarginTop"
   * </p>
   * @param marginTop Mandatory float parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(17)
  void marginTop(
    float marginTop);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type office.MsoTextOrientation
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(18)
  office.MsoTextOrientation orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param orientation Mandatory office.MsoTextOrientation parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(19)
  void orientation(
    office.MsoTextOrientation orientation);


  /**
   * <p>
   * Getter method for the COM property "HorizontalAnchor"
   * </p>
   * @return  Returns a value of type office.MsoHorizontalAnchor
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(20)
  office.MsoHorizontalAnchor horizontalAnchor();


  /**
   * <p>
   * Setter method for the COM property "HorizontalAnchor"
   * </p>
   * @param horizontalAnchor Mandatory office.MsoHorizontalAnchor parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(21)
  void horizontalAnchor(
    office.MsoHorizontalAnchor horizontalAnchor);


  /**
   * <p>
   * Getter method for the COM property "VerticalAnchor"
   * </p>
   * @return  Returns a value of type office.MsoVerticalAnchor
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(22)
  office.MsoVerticalAnchor verticalAnchor();


  /**
   * <p>
   * Setter method for the COM property "VerticalAnchor"
   * </p>
   * @param verticalAnchor Mandatory office.MsoVerticalAnchor parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(23)
  void verticalAnchor(
    office.MsoVerticalAnchor verticalAnchor);


  /**
   * <p>
   * Getter method for the COM property "PathFormat"
   * </p>
   * @return  Returns a value of type office.MsoPathFormat
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(24)
  office.MsoPathFormat pathFormat();


  /**
   * <p>
   * Setter method for the COM property "PathFormat"
   * </p>
   * @param pathFormat Mandatory office.MsoPathFormat parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(25)
  void pathFormat(
    office.MsoPathFormat pathFormat);


  /**
   * <p>
   * Getter method for the COM property "WarpFormat"
   * </p>
   * @return  Returns a value of type office.MsoWarpFormat
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(26)
  office.MsoWarpFormat warpFormat();


  /**
   * <p>
   * Setter method for the COM property "WarpFormat"
   * </p>
   * @param warpFormat Mandatory office.MsoWarpFormat parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(27)
  void warpFormat(
    office.MsoWarpFormat warpFormat);


  /**
   * <p>
   * Getter method for the COM property "WordArtformat"
   * </p>
   * @return  Returns a value of type office.MsoPresetTextEffect
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(28)
  office.MsoPresetTextEffect wordArtformat();


  /**
   * <p>
   * Setter method for the COM property "WordArtformat"
   * </p>
   * @param wordArtformat Mandatory office.MsoPresetTextEffect parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(29)
  void wordArtformat(
    office.MsoPresetTextEffect wordArtformat);


  /**
   * <p>
   * Getter method for the COM property "WordWrap"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(30)
  office.MsoTriState wordWrap();


  /**
   * <p>
   * Setter method for the COM property "WordWrap"
   * </p>
   * @param wordWrap Mandatory office.MsoTriState parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(31)
  void wordWrap(
    office.MsoTriState wordWrap);


  /**
   * <p>
   * Getter method for the COM property "AutoSize"
   * </p>
   * @return  Returns a value of type office.MsoAutoSize
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(32)
  office.MsoAutoSize autoSize();


  /**
   * <p>
   * Setter method for the COM property "AutoSize"
   * </p>
   * @param autoSize Mandatory office.MsoAutoSize parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(33)
  void autoSize(
    office.MsoAutoSize autoSize);


  /**
   * <p>
   * Getter method for the COM property "ThreeD"
   * </p>
   * @return  Returns a value of type office.ThreeDFormat
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(34)
  office.ThreeDFormat threeD();


  /**
   * <p>
   * Getter method for the COM property "HasText"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(35)
  office.MsoTriState hasText();


  /**
   * <p>
   * Getter method for the COM property "TextRange"
   * </p>
   * @return  Returns a value of type office.TextRange2
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(36)
  office.TextRange2 textRange();


  /**
   * <p>
   * Getter method for the COM property "Column"
   * </p>
   * @return  Returns a value of type office.TextColumn2
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(37)
  office.TextColumn2 column();


  /**
   * <p>
   * Getter method for the COM property "Ruler"
   * </p>
   * @return  Returns a value of type office.Ruler2
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(38)
  office.Ruler2 ruler();


  /**
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(39)
  void deleteText();


  /**
   * <p>
   * Getter method for the COM property "NoTextRotation"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(40)
  office.MsoTriState noTextRotation();


  /**
   * <p>
   * Setter method for the COM property "NoTextRotation"
   * </p>
   * @param noTextRotation Mandatory office.MsoTriState parameter.
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(41)
  void noTextRotation(
    office.MsoTriState noTextRotation);


  // Properties:
}
