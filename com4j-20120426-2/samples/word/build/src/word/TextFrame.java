package word  ;

import com4j.*;

@IID("{000209B2-0000-0000-C000-000000000046}")
public interface TextFrame extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(8000) //= 0x1f40. The runtime will prefer the VTID if present
  @VTID(7)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8001) //= 0x1f41. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type word.Shape
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  word.Shape parent();


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
   * @param prop Mandatory float parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(11)
  void marginBottom(
    float prop);


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
   * @param prop Mandatory float parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(13)
  void marginLeft(
    float prop);


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
   * @param prop Mandatory float parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(15)
  void marginRight(
    float prop);


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
   * @param prop Mandatory float parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(17)
  void marginTop(
    float prop);


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
   * @param prop Mandatory office.MsoTextOrientation parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(19)
  void orientation(
    office.MsoTextOrientation prop);


  /**
   * <p>
   * Getter method for the COM property "TextRange"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(20)
  word.Range textRange();


  /**
   * <p>
   * Getter method for the COM property "ContainingRange"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(21)
  word.Range containingRange();


  /**
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type word.TextFrame
   */

  @DISPID(5001) //= 0x1389. The runtime will prefer the VTID if present
  @VTID(22)
  word.TextFrame next();


  /**
   * <p>
   * Setter method for the COM property "Next"
   * </p>
   * @param prop Mandatory word.TextFrame parameter.
   */

  @DISPID(5001) //= 0x1389. The runtime will prefer the VTID if present
  @VTID(23)
  void next(
    word.TextFrame prop);


  /**
   * <p>
   * Getter method for the COM property "Previous"
   * </p>
   * @return  Returns a value of type word.TextFrame
   */

  @DISPID(5002) //= 0x138a. The runtime will prefer the VTID if present
  @VTID(24)
  word.TextFrame previous();


  /**
   * <p>
   * Setter method for the COM property "Previous"
   * </p>
   * @param prop Mandatory word.TextFrame parameter.
   */

  @DISPID(5002) //= 0x138a. The runtime will prefer the VTID if present
  @VTID(25)
  void previous(
    word.TextFrame prop);


  /**
   * <p>
   * Getter method for the COM property "Overflowing"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(5003) //= 0x138b. The runtime will prefer the VTID if present
  @VTID(26)
  boolean overflowing();


  /**
   * <p>
   * Getter method for the COM property "HasText"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5008) //= 0x1390. The runtime will prefer the VTID if present
  @VTID(27)
  int hasText();


  /**
   */

  @DISPID(5004) //= 0x138c. The runtime will prefer the VTID if present
  @VTID(28)
  void breakForwardLink();


  /**
   * @param targetTextFrame Mandatory word.TextFrame parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(5006) //= 0x138e. The runtime will prefer the VTID if present
  @VTID(29)
  boolean validLinkTarget(
    word.TextFrame targetTextFrame);


  /**
   * <p>
   * Getter method for the COM property "AutoSize"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5009) //= 0x1391. The runtime will prefer the VTID if present
  @VTID(30)
  int autoSize();


  /**
   * <p>
   * Setter method for the COM property "AutoSize"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(5009) //= 0x1391. The runtime will prefer the VTID if present
  @VTID(31)
  void autoSize(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "WordWrap"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5010) //= 0x1392. The runtime will prefer the VTID if present
  @VTID(32)
  int wordWrap();


  /**
   * <p>
   * Setter method for the COM property "WordWrap"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(5010) //= 0x1392. The runtime will prefer the VTID if present
  @VTID(33)
  void wordWrap(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "VerticalAnchor"
   * </p>
   * @return  Returns a value of type office.MsoVerticalAnchor
   */

  @DISPID(5011) //= 0x1393. The runtime will prefer the VTID if present
  @VTID(34)
  office.MsoVerticalAnchor verticalAnchor();


  /**
   * <p>
   * Setter method for the COM property "VerticalAnchor"
   * </p>
   * @param prop Mandatory office.MsoVerticalAnchor parameter.
   */

  @DISPID(5011) //= 0x1393. The runtime will prefer the VTID if present
  @VTID(35)
  void verticalAnchor(
    office.MsoVerticalAnchor prop);


  /**
   * <p>
   * Getter method for the COM property "HorizontalAnchor"
   * </p>
   * @return  Returns a value of type office.MsoHorizontalAnchor
   */

  @DISPID(5012) //= 0x1394. The runtime will prefer the VTID if present
  @VTID(36)
  office.MsoHorizontalAnchor horizontalAnchor();


  /**
   * <p>
   * Setter method for the COM property "HorizontalAnchor"
   * </p>
   * @param prop Mandatory office.MsoHorizontalAnchor parameter.
   */

  @DISPID(5012) //= 0x1394. The runtime will prefer the VTID if present
  @VTID(37)
  void horizontalAnchor(
    office.MsoHorizontalAnchor prop);


  /**
   * <p>
   * Getter method for the COM property "PathFormat"
   * </p>
   * @return  Returns a value of type office.MsoPathFormat
   */

  @DISPID(5013) //= 0x1395. The runtime will prefer the VTID if present
  @VTID(38)
  office.MsoPathFormat pathFormat();


  /**
   * <p>
   * Setter method for the COM property "PathFormat"
   * </p>
   * @param prop Mandatory office.MsoPathFormat parameter.
   */

  @DISPID(5013) //= 0x1395. The runtime will prefer the VTID if present
  @VTID(39)
  void pathFormat(
    office.MsoPathFormat prop);


  /**
   * <p>
   * Getter method for the COM property "WarpFormat"
   * </p>
   * @return  Returns a value of type office.MsoWarpFormat
   */

  @DISPID(5014) //= 0x1396. The runtime will prefer the VTID if present
  @VTID(40)
  office.MsoWarpFormat warpFormat();


  /**
   * <p>
   * Setter method for the COM property "WarpFormat"
   * </p>
   * @param prop Mandatory office.MsoWarpFormat parameter.
   */

  @DISPID(5014) //= 0x1396. The runtime will prefer the VTID if present
  @VTID(41)
  void warpFormat(
    office.MsoWarpFormat prop);


  /**
   * <p>
   * Getter method for the COM property "Column"
   * </p>
   * @return  Returns a value of type office.TextColumn2
   */

  @DISPID(5015) //= 0x1397. The runtime will prefer the VTID if present
  @VTID(42)
  office.TextColumn2 column();


  /**
   * <p>
   * Getter method for the COM property "ThreeD"
   * </p>
   * @return  Returns a value of type word.ThreeDFormat
   */

  @DISPID(5016) //= 0x1398. The runtime will prefer the VTID if present
  @VTID(43)
  word.ThreeDFormat threeD();


  /**
   * <p>
   * Getter method for the COM property "NoTextRotation"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(5017) //= 0x1399. The runtime will prefer the VTID if present
  @VTID(44)
  office.MsoTriState noTextRotation();


  /**
   * <p>
   * Setter method for the COM property "NoTextRotation"
   * </p>
   * @param prop Mandatory office.MsoTriState parameter.
   */

  @DISPID(5017) //= 0x1399. The runtime will prefer the VTID if present
  @VTID(45)
  void noTextRotation(
    office.MsoTriState prop);


  /**
   */

  @DISPID(5018) //= 0x139a. The runtime will prefer the VTID if present
  @VTID(46)
  void deleteText();


  // Properties:
}
