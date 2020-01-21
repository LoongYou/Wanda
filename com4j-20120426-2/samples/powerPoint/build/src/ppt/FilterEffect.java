package ppt  ;

import com4j.*;

@IID("{914934F0-5A91-11CF-8700-00AA0060263B}")
public interface FilterEffect extends Com4jObject {
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
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type ppt.MsoAnimFilterEffectType
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.MsoAnimFilterEffectType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param type Mandatory ppt.MsoAnimFilterEffectType parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(10)
  void type(
    ppt.MsoAnimFilterEffectType type);


  /**
   * <p>
   * Getter method for the COM property "Subtype"
   * </p>
   * @return  Returns a value of type ppt.MsoAnimFilterEffectSubtype
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(11)
  ppt.MsoAnimFilterEffectSubtype subtype();


  /**
   * <p>
   * Setter method for the COM property "Subtype"
   * </p>
   * @param subtype Mandatory ppt.MsoAnimFilterEffectSubtype parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(12)
  void subtype(
    ppt.MsoAnimFilterEffectSubtype subtype);


  /**
   * <p>
   * Getter method for the COM property "Reveal"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(13)
  office.MsoTriState reveal();


  /**
   * <p>
   * Setter method for the COM property "Reveal"
   * </p>
   * @param reveal Mandatory office.MsoTriState parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(14)
  void reveal(
    office.MsoTriState reveal);


  // Properties:
}
