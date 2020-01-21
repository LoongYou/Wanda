package ppt  ;

import com4j.*;

@IID("{914934E1-5A91-11CF-8700-00AA0060263B}")
public interface EffectParameters extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  ppt._Application application();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Direction"
   * </p>
   * @return  Returns a value of type ppt.MsoAnimDirection
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.MsoAnimDirection direction();


  /**
   * <p>
   * Setter method for the COM property "Direction"
   * </p>
   * @param direction Mandatory ppt.MsoAnimDirection parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(10)
  void direction(
    ppt.MsoAnimDirection direction);


  /**
   * <p>
   * Getter method for the COM property "Amount"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(11)
  float amount();


  /**
   * <p>
   * Setter method for the COM property "Amount"
   * </p>
   * @param amount Mandatory float parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(12)
  void amount(
    float amount);


  /**
   * <p>
   * Getter method for the COM property "Size"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(13)
  float size();


  /**
   * <p>
   * Setter method for the COM property "Size"
   * </p>
   * @param size Mandatory float parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(14)
  void size(
    float size);


  /**
   * <p>
   * Getter method for the COM property "Color2"
   * </p>
   * @return  Returns a value of type ppt.ColorFormat
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(15)
  ppt.ColorFormat color2();


  /**
   * <p>
   * Getter method for the COM property "Relative"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(16)
  office.MsoTriState relative();


  /**
   * <p>
   * Setter method for the COM property "Relative"
   * </p>
   * @param relative Mandatory office.MsoTriState parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(17)
  void relative(
    office.MsoTriState relative);


  /**
   * <p>
   * Getter method for the COM property "FontName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String fontName();


  /**
   * <p>
   * Setter method for the COM property "FontName"
   * </p>
   * @param fontName Mandatory java.lang.String parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(19)
  void fontName(
    java.lang.String fontName);


  // Properties:
}
