package office  ;

import com4j.*;

@IID("{000CDB0F-0000-0000-C000-000000000046}")
public interface CustomXMLValidationErrors extends office._IMsoDispObj,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610809344) //= 0x60030000. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809345) //= 0x60030001. The runtime will prefer the VTID if present
  @VTID(10)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type office.CustomXMLValidationError
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  office.CustomXMLValidationError item(
    int index);


  /**
   * @param node Mandatory office.CustomXMLNode parameter.
   * @param errorName Mandatory java.lang.String parameter.
   * @param errorText Optional parameter. Default value is ""
   * @param clearedOnUpdate Optional parameter. Default value is false
   */

  @DISPID(1610809347) //= 0x60030003. The runtime will prefer the VTID if present
  @VTID(12)
  void add(
    office.CustomXMLNode node,
    java.lang.String errorName,
    @Optional @DefaultValue("") java.lang.String errorText,
    @Optional @DefaultValue("-1") boolean clearedOnUpdate);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(13)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
