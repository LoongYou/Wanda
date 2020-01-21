package ppt  ;

import com4j.*;

@IID("{91493484-5A91-11CF-8700-00AA0060263B}")
public interface TextFrame extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
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
   * Getter method for the COM property "HasText"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(20)
  office.MsoTriState hasText();


  /**
   * <p>
   * Getter method for the COM property "TextRange"
   * </p>
   * @return  Returns a value of type ppt.TextRange
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(21)
  ppt.TextRange textRange();


  /**
   * <p>
   * Getter method for the COM property "Ruler"
   * </p>
   * @return  Returns a value of type ppt.Ruler
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(22)
  ppt.Ruler ruler();


  /**
   * <p>
   * Getter method for the COM property "HorizontalAnchor"
   * </p>
   * @return  Returns a value of type office.MsoHorizontalAnchor
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(23)
  office.MsoHorizontalAnchor horizontalAnchor();


  /**
   * <p>
   * Setter method for the COM property "HorizontalAnchor"
   * </p>
   * @param horizontalAnchor Mandatory office.MsoHorizontalAnchor parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(24)
  void horizontalAnchor(
    office.MsoHorizontalAnchor horizontalAnchor);


  /**
   * <p>
   * Getter method for the COM property "VerticalAnchor"
   * </p>
   * @return  Returns a value of type office.MsoVerticalAnchor
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(25)
  office.MsoVerticalAnchor verticalAnchor();


  /**
   * <p>
   * Setter method for the COM property "VerticalAnchor"
   * </p>
   * @param verticalAnchor Mandatory office.MsoVerticalAnchor parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(26)
  void verticalAnchor(
    office.MsoVerticalAnchor verticalAnchor);


  /**
   * <p>
   * Getter method for the COM property "AutoSize"
   * </p>
   * @return  Returns a value of type ppt.PpAutoSize
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(27)
  ppt.PpAutoSize autoSize();


  /**
   * <p>
   * Setter method for the COM property "AutoSize"
   * </p>
   * @param autoSize Mandatory ppt.PpAutoSize parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(28)
  void autoSize(
    ppt.PpAutoSize autoSize);


  /**
   * <p>
   * Getter method for the COM property "WordWrap"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(29)
  office.MsoTriState wordWrap();


  /**
   * <p>
   * Setter method for the COM property "WordWrap"
   * </p>
   * @param wordWrap Mandatory office.MsoTriState parameter.
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(30)
  void wordWrap(
    office.MsoTriState wordWrap);


  /**
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(31)
  void deleteText();


  // Properties:
}
