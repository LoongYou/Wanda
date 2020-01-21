package ppt  ;

import com4j.*;

@IID("{9149346E-5A91-11CF-8700-00AA0060263B}")
public interface ColorSchemes extends ppt.Collection {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(10)
  ppt._Application application();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ppt.ColorScheme
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  ppt.ColorScheme item(
    int index);


  /**
   * @param scheme Optional parameter. Default value is 0
   * @return  Returns a value of type ppt.ColorScheme
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(13)
  ppt.ColorScheme add(
    @Optional @DefaultValue("0") ppt.ColorScheme scheme);


  // Properties:
}
