package ppt  ;

import com4j.*;

@IID("{914934D9-5A91-11CF-8700-00AA0060263B}")
public interface DiagramNodeChildren extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


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
   * @return  Returns a value of type ppt.DiagramNode
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  ppt.DiagramNode item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param index Optional parameter. Default value is -1
   * @param nodeType Optional parameter. Default value is 1
   * @return  Returns a value of type ppt.DiagramNode
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(11)
  ppt.DiagramNode addNode(
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
   * @return  Returns a value of type ppt.DiagramNode
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(15)
  ppt.DiagramNode firstChild();


  /**
   * <p>
   * Getter method for the COM property "LastChild"
   * </p>
   * @return  Returns a value of type ppt.DiagramNode
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(16)
  ppt.DiagramNode lastChild();


  // Properties:
}
