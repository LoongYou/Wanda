package ppt  ;

import com4j.*;

@IID("{914934F2-5A91-11CF-8700-00AA0060263B}")
public interface CustomLayouts extends ppt.Collection {
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
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type ppt.CustomLayout
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  ppt.CustomLayout item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ppt.CustomLayout
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(13)
  ppt.CustomLayout add(
    int index);


  /**
   * @param index Optional parameter. Default value is -1
   * @return  Returns a value of type ppt.CustomLayout
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(14)
  ppt.CustomLayout paste(
    @Optional @DefaultValue("-1") int index);


  // Properties:
}
