package office  ;

import com4j.*;

@IID("{000C036F-0000-0000-C000-000000000046}")
public interface DiagramNodeChildren extends office._IMsoDispObj,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(9)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type office.DiagramNode
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  office.DiagramNode item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param index Optional parameter. Default value is -1
   * @param nodeType Optional parameter. Default value is 1
   * @return  Returns a value of type office.DiagramNode
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(11)
  office.DiagramNode addNode(
    @Optional @DefaultValue("-1") @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @Optional @DefaultValue("1") office.MsoDiagramNodeType nodeType);


  /**
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(12)
  void selectAll();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(14)
  int count();


  /**
   * <p>
   * Getter method for the COM property "FirstChild"
   * </p>
   * @return  Returns a value of type office.DiagramNode
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(15)
  office.DiagramNode firstChild();


  /**
   * <p>
   * Getter method for the COM property "LastChild"
   * </p>
   * @return  Returns a value of type office.DiagramNode
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(16)
  office.DiagramNode lastChild();


  // Properties:
}
