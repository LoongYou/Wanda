package ppt  ;

import com4j.*;

@IID("{914934F6-5A91-11CF-8700-00AA0060263B}")
public interface CustomerData extends ppt.Collection {
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
   * @param id Mandatory java.lang.String parameter.
   * @return  Returns a value of type office._CustomXMLPart
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  office._CustomXMLPart item(
    java.lang.String id);


  /**
   * @return  Returns a value of type office._CustomXMLPart
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(13)
  office._CustomXMLPart add();


  /**
   * @param id Mandatory java.lang.String parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(14)
  void delete(
    java.lang.String id);


  // Properties:
}
