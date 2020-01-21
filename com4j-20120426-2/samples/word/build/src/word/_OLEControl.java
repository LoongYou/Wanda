package word  ;

import com4j.*;

@IID("{000209A4-0000-0000-C000-000000000046}")
public interface _OLEControl extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(-2147417853) //= 0x80010103. The runtime will prefer the VTID if present
  @VTID(7)
  float left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(-2147417853) //= 0x80010103. The runtime will prefer the VTID if present
  @VTID(8)
  void left(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(-2147417852) //= 0x80010104. The runtime will prefer the VTID if present
  @VTID(9)
  float top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(-2147417852) //= 0x80010104. The runtime will prefer the VTID if present
  @VTID(10)
  void top(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(-2147417851) //= 0x80010105. The runtime will prefer the VTID if present
  @VTID(11)
  float height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(-2147417851) //= 0x80010105. The runtime will prefer the VTID if present
  @VTID(12)
  void height(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(-2147417850) //= 0x80010106. The runtime will prefer the VTID if present
  @VTID(13)
  float width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(-2147417850) //= 0x80010106. The runtime will prefer the VTID if present
  @VTID(14)
  void width(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(16)
  void name(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Automation"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(-2147417849) //= 0x80010107. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject automation();


  /**
   */

  @DISPID(-2147417568) //= 0x80010220. The runtime will prefer the VTID if present
  @VTID(18)
  void select();


  /**
   */

  @DISPID(-2147417560) //= 0x80010228. The runtime will prefer the VTID if present
  @VTID(19)
  void copy();


  /**
   */

  @DISPID(-2147417559) //= 0x80010229. The runtime will prefer the VTID if present
  @VTID(20)
  void cut();


  /**
   */

  @DISPID(-2147417520) //= 0x80010250. The runtime will prefer the VTID if present
  @VTID(21)
  void delete();


  /**
   */

  @DISPID(-2147417519) //= 0x80010251. The runtime will prefer the VTID if present
  @VTID(22)
  void activate();


  /**
   * <p>
   * Getter method for the COM property "AltHTML"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147415101) //= 0x80010bc3. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String altHTML();


  /**
   * <p>
   * Setter method for the COM property "AltHTML"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(-2147415101) //= 0x80010bc3. The runtime will prefer the VTID if present
  @VTID(24)
  void altHTML(
    java.lang.String prop);


  // Properties:
}
