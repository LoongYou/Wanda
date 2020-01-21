package word  ;

import com4j.*;

@IID("{0002093B-0000-0000-C000-000000000046}")
public interface Border extends Com4jObject {
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
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  boolean visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  void visible(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ColorIndex"
   * </p>
   * @return  Returns a value of type word.WdColorIndex
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(12)
  word.WdColorIndex colorIndex();


  /**
   * <p>
   * Setter method for the COM property "ColorIndex"
   * </p>
   * @param prop Mandatory word.WdColorIndex parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(13)
  void colorIndex(
    word.WdColorIndex prop);


  /**
   * <p>
   * Getter method for the COM property "Inside"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(14)
  boolean inside();


  /**
   * <p>
   * Getter method for the COM property "LineStyle"
   * </p>
   * @return  Returns a value of type word.WdLineStyle
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(15)
  word.WdLineStyle lineStyle();


  /**
   * <p>
   * Setter method for the COM property "LineStyle"
   * </p>
   * @param prop Mandatory word.WdLineStyle parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(16)
  void lineStyle(
    word.WdLineStyle prop);


  /**
   * <p>
   * Getter method for the COM property "LineWidth"
   * </p>
   * @return  Returns a value of type word.WdLineWidth
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(17)
  word.WdLineWidth lineWidth();


  /**
   * <p>
   * Setter method for the COM property "LineWidth"
   * </p>
   * @param prop Mandatory word.WdLineWidth parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(18)
  void lineWidth(
    word.WdLineWidth prop);


  /**
   * <p>
   * Getter method for the COM property "ArtStyle"
   * </p>
   * @return  Returns a value of type word.WdPageBorderArt
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(19)
  word.WdPageBorderArt artStyle();


  /**
   * <p>
   * Setter method for the COM property "ArtStyle"
   * </p>
   * @param prop Mandatory word.WdPageBorderArt parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(20)
  void artStyle(
    word.WdPageBorderArt prop);


  /**
   * <p>
   * Getter method for the COM property "ArtWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(21)
  int artWidth();


  /**
   * <p>
   * Setter method for the COM property "ArtWidth"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(22)
  void artWidth(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Color"
   * </p>
   * @return  Returns a value of type word.WdColor
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(23)
  word.WdColor color();


  /**
   * <p>
   * Setter method for the COM property "Color"
   * </p>
   * @param prop Mandatory word.WdColor parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(24)
  void color(
    word.WdColor prop);


  // Properties:
}
