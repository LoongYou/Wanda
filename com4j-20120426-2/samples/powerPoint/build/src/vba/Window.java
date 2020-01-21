package vba  ;

import com4j.*;

@IID("{0002E16B-0000-0000-C000-000000000046}")
public interface Window extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "VBE"
   * </p>
   * @return  Returns a value of type vba.VBE
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  vba.VBE vbe();


  /**
   * <p>
   * Getter method for the COM property "Collection"
   * </p>
   * @return  Returns a value of type vba._Windows
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  vba._Windows collection();


  /**
   */

  @DISPID(99) //= 0x63. The runtime will prefer the VTID if present
  @VTID(9)
  void close();


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String caption();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(11)
  boolean visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param pfVisible Mandatory boolean parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(12)
  void visible(
    boolean pfVisible);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(13)
  int left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param plLeft Mandatory int parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(14)
  void left(
    int plLeft);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(15)
  int top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param plTop Mandatory int parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(16)
  void top(
    int plTop);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(17)
  int width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param plWidth Mandatory int parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(18)
  void width(
    int plWidth);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(19)
  int height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param plHeight Mandatory int parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(20)
  void height(
    int plHeight);


  /**
   * <p>
   * Getter method for the COM property "WindowState"
   * </p>
   * @return  Returns a value of type vba.vbext_WindowState
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(21)
  vba.vbext_WindowState windowState();


  /**
   * <p>
   * Setter method for the COM property "WindowState"
   * </p>
   * @param plWindowState Mandatory vba.vbext_WindowState parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(22)
  void windowState(
    vba.vbext_WindowState plWindowState);


  /**
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(23)
  void setFocus();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type vba.vbext_WindowType
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(24)
  vba.vbext_WindowType type();


  /**
   * @param eKind Mandatory vba.vbext_WindowType parameter.
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(25)
  void setKind(
    vba.vbext_WindowType eKind);


  /**
   * <p>
   * Getter method for the COM property "LinkedWindows"
   * </p>
   * @return  Returns a value of type vba._LinkedWindows
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(26)
  vba._LinkedWindows linkedWindows();


  /**
   * <p>
   * Getter method for the COM property "LinkedWindowFrame"
   * </p>
   * @return  Returns a value of type vba.Window
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(27)
  vba.Window linkedWindowFrame();


  /**
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(28)
  void detach();


  /**
   * @param lWindowHandle Mandatory int parameter.
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(29)
  void attach(
    int lWindowHandle);


  /**
   * <p>
   * Getter method for the COM property "HWnd"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(30)
  int hWnd();


  // Properties:
}
