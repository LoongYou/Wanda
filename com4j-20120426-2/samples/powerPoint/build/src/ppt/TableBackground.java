package ppt  ;

import com4j.*;

@IID("{914934F8-5A91-11CF-8700-00AA0060263B}")
public interface TableBackground extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type ppt.FillFormat
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  ppt.FillFormat fill();


  /**
   * <p>
   * Getter method for the COM property "Picture"
   * </p>
   * @return  Returns a value of type ppt.PictureFormat
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(8)
  ppt.PictureFormat picture();


  /**
   * <p>
   * Getter method for the COM property "Reflection"
   * </p>
   * @return  Returns a value of type office.ReflectionFormat
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  office.ReflectionFormat reflection();


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type ppt.ShadowFormat
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  ppt.ShadowFormat shadow();


  // Properties:
}
