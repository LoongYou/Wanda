package ppt  ;

import com4j.*;

@IID("{914934E6-5A91-11CF-8700-00AA0060263B}")
public interface ColorEffect extends Com4jObject {
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
   * Getter method for the COM property "By"
   * </p>
   * @return  Returns a value of type ppt.ColorFormat
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.ColorFormat by();


  /**
   * <p>
   * Getter method for the COM property "From"
   * </p>
   * @return  Returns a value of type ppt.ColorFormat
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  ppt.ColorFormat from();


  /**
   * <p>
   * Getter method for the COM property "To"
   * </p>
   * @return  Returns a value of type ppt.ColorFormat
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  ppt.ColorFormat to();


  // Properties:
}
