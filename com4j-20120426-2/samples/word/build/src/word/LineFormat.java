package word  ;

import com4j.*;

@IID("{000209CA-0000-0000-C000-000000000046}")
public interface LineFormat extends Com4jObject {
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
   * Getter method for the COM property "BackColor"
   * </p>
   * @return  Returns a value of type word.ColorFormat
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(10)
  word.ColorFormat backColor();


  /**
   * <p>
   * Getter method for the COM property "BeginArrowheadLength"
   * </p>
   * @return  Returns a value of type office.MsoArrowheadLength
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(11)
  office.MsoArrowheadLength beginArrowheadLength();


  /**
   * <p>
   * Setter method for the COM property "BeginArrowheadLength"
   * </p>
   * @param prop Mandatory office.MsoArrowheadLength parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(12)
  void beginArrowheadLength(
    office.MsoArrowheadLength prop);


  /**
   * <p>
   * Getter method for the COM property "BeginArrowheadStyle"
   * </p>
   * @return  Returns a value of type office.MsoArrowheadStyle
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(13)
  office.MsoArrowheadStyle beginArrowheadStyle();


  /**
   * <p>
   * Setter method for the COM property "BeginArrowheadStyle"
   * </p>
   * @param prop Mandatory office.MsoArrowheadStyle parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(14)
  void beginArrowheadStyle(
    office.MsoArrowheadStyle prop);


  /**
   * <p>
   * Getter method for the COM property "BeginArrowheadWidth"
   * </p>
   * @return  Returns a value of type office.MsoArrowheadWidth
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(15)
  office.MsoArrowheadWidth beginArrowheadWidth();


  /**
   * <p>
   * Setter method for the COM property "BeginArrowheadWidth"
   * </p>
   * @param prop Mandatory office.MsoArrowheadWidth parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(16)
  void beginArrowheadWidth(
    office.MsoArrowheadWidth prop);


  /**
   * <p>
   * Getter method for the COM property "DashStyle"
   * </p>
   * @return  Returns a value of type office.MsoLineDashStyle
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(17)
  office.MsoLineDashStyle dashStyle();


  /**
   * <p>
   * Setter method for the COM property "DashStyle"
   * </p>
   * @param prop Mandatory office.MsoLineDashStyle parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(18)
  void dashStyle(
    office.MsoLineDashStyle prop);


  /**
   * <p>
   * Getter method for the COM property "EndArrowheadLength"
   * </p>
   * @return  Returns a value of type office.MsoArrowheadLength
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(19)
  office.MsoArrowheadLength endArrowheadLength();


  /**
   * <p>
   * Setter method for the COM property "EndArrowheadLength"
   * </p>
   * @param prop Mandatory office.MsoArrowheadLength parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(20)
  void endArrowheadLength(
    office.MsoArrowheadLength prop);


  /**
   * <p>
   * Getter method for the COM property "EndArrowheadStyle"
   * </p>
   * @return  Returns a value of type office.MsoArrowheadStyle
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(21)
  office.MsoArrowheadStyle endArrowheadStyle();


  /**
   * <p>
   * Setter method for the COM property "EndArrowheadStyle"
   * </p>
   * @param prop Mandatory office.MsoArrowheadStyle parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(22)
  void endArrowheadStyle(
    office.MsoArrowheadStyle prop);


  /**
   * <p>
   * Getter method for the COM property "EndArrowheadWidth"
   * </p>
   * @return  Returns a value of type office.MsoArrowheadWidth
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(23)
  office.MsoArrowheadWidth endArrowheadWidth();


  /**
   * <p>
   * Setter method for the COM property "EndArrowheadWidth"
   * </p>
   * @param prop Mandatory office.MsoArrowheadWidth parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(24)
  void endArrowheadWidth(
    office.MsoArrowheadWidth prop);


  /**
   * <p>
   * Getter method for the COM property "ForeColor"
   * </p>
   * @return  Returns a value of type word.ColorFormat
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(25)
  word.ColorFormat foreColor();


  /**
   * <p>
   * Getter method for the COM property "Pattern"
   * </p>
   * @return  Returns a value of type office.MsoPatternType
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(26)
  office.MsoPatternType pattern();


  /**
   * <p>
   * Setter method for the COM property "Pattern"
   * </p>
   * @param prop Mandatory office.MsoPatternType parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(27)
  void pattern(
    office.MsoPatternType prop);


  /**
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   * @return  Returns a value of type office.MsoLineStyle
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(28)
  office.MsoLineStyle style();


  /**
   * <p>
   * Setter method for the COM property "Style"
   * </p>
   * @param prop Mandatory office.MsoLineStyle parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(29)
  void style(
    office.MsoLineStyle prop);


  /**
   * <p>
   * Getter method for the COM property "Transparency"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(30)
  float transparency();


  /**
   * <p>
   * Setter method for the COM property "Transparency"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(31)
  void transparency(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(32)
  office.MsoTriState visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param prop Mandatory office.MsoTriState parameter.
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(33)
  void visible(
    office.MsoTriState prop);


  /**
   * <p>
   * Getter method for the COM property "Weight"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(34)
  float weight();


  /**
   * <p>
   * Setter method for the COM property "Weight"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(35)
  void weight(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "InsetPen"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(36)
  office.MsoTriState insetPen();


  /**
   * <p>
   * Setter method for the COM property "InsetPen"
   * </p>
   * @param prop Mandatory office.MsoTriState parameter.
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(37)
  void insetPen(
    office.MsoTriState prop);


  // Properties:
}
