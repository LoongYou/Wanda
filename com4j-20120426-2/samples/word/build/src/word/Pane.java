package word  ;

import com4j.*;

@IID("{00020960-0000-0000-C000-000000000046}")
public interface Pane extends Com4jObject {
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

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of type word._Document
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  word._Document document();


  /**
   * <p>
   * Getter method for the COM property "Selection"
   * </p>
   * @return  Returns a value of type word.Selection
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  word.Selection selection();


  /**
   * <p>
   * Getter method for the COM property "DisplayRulers"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  boolean displayRulers();


  /**
   * <p>
   * Setter method for the COM property "DisplayRulers"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  void displayRulers(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "DisplayVerticalRuler"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(14)
  boolean displayVerticalRuler();


  /**
   * <p>
   * Setter method for the COM property "DisplayVerticalRuler"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  void displayVerticalRuler(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Zooms"
   * </p>
   * @return  Returns a value of type word.Zooms
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(16)
  word.Zooms zooms();


  @VTID(16)
  @ReturnValue(defaultPropertyThrough={word.Zooms.class})
  word.Zoom zooms(
    word.WdViewType index);

  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(17)
  int index();


  /**
   * <p>
   * Getter method for the COM property "View"
   * </p>
   * @return  Returns a value of type word.View
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(18)
  word.View view();


  /**
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type word.Pane
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(19)
  word.Pane next();


  /**
   * <p>
   * Getter method for the COM property "Previous"
   * </p>
   * @return  Returns a value of type word.Pane
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(20)
  word.Pane previous();


  /**
   * <p>
   * Getter method for the COM property "HorizontalPercentScrolled"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(21)
  int horizontalPercentScrolled();


  /**
   * <p>
   * Setter method for the COM property "HorizontalPercentScrolled"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(22)
  void horizontalPercentScrolled(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "VerticalPercentScrolled"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(23)
  int verticalPercentScrolled();


  /**
   * <p>
   * Setter method for the COM property "VerticalPercentScrolled"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(24)
  void verticalPercentScrolled(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "MinimumFontSize"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(25)
  int minimumFontSize();


  /**
   * <p>
   * Setter method for the COM property "MinimumFontSize"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(26)
  void minimumFontSize(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "BrowseToWindow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(27)
  boolean browseToWindow();


  /**
   * <p>
   * Setter method for the COM property "BrowseToWindow"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(28)
  void browseToWindow(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "BrowseWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(29)
  int browseWidth();


  /**
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(30)
  void activate();


  /**
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(31)
  void close();


  /**
   * @param down Optional parameter. Default value is com4j.Variant.getMissing()
   * @param up Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toRight Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toLeft Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(32)
  void largeScroll(
    @Optional java.lang.Object down,
    @Optional java.lang.Object up,
    @Optional java.lang.Object toRight,
    @Optional java.lang.Object toLeft);


  /**
   * @param down Optional parameter. Default value is com4j.Variant.getMissing()
   * @param up Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toRight Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toLeft Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(33)
  void smallScroll(
    @Optional java.lang.Object down,
    @Optional java.lang.Object up,
    @Optional java.lang.Object toRight,
    @Optional java.lang.Object toLeft);


  /**
   * @param velocity Mandatory int parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(34)
  void autoScroll(
    int velocity);


  /**
   * @param down Optional parameter. Default value is com4j.Variant.getMissing()
   * @param up Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(35)
  void pageScroll(
    @Optional java.lang.Object down,
    @Optional java.lang.Object up);


  /**
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(36)
  void newFrameset();


  /**
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(37)
  void tocInFrameset();


  /**
   * <p>
   * Getter method for the COM property "Frameset"
   * </p>
   * @return  Returns a value of type word.Frameset
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(38)
  word.Frameset frameset();


  /**
   * <p>
   * Getter method for the COM property "Pages"
   * </p>
   * @return  Returns a value of type word.Pages
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(39)
  word.Pages pages();


  @VTID(39)
  @ReturnValue(defaultPropertyThrough={word.Pages.class})
  word.Page pages(
    int index);

  // Properties:
}
