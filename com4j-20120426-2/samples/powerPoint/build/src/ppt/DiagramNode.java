package ppt  ;

import com4j.*;

@IID("{914934D8-5A91-11CF-8700-00AA0060263B}")
public interface DiagramNode extends Com4jObject {
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
   * @param pos Optional parameter. Default value is 2
   * @param nodeType Optional parameter. Default value is 1
   * @return  Returns a value of type ppt.DiagramNode
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.DiagramNode addNode(
    @Optional @DefaultValue("2") office.MsoRelativeNodePosition pos,
    @Optional @DefaultValue("1") office.MsoDiagramNodeType nodeType);


  /**
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(10)
  void delete();


  /**
   * @param targetNode Mandatory ppt.DiagramNode parameter.
   * @param pos Mandatory office.MsoRelativeNodePosition parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(11)
  void moveNode(
    ppt.DiagramNode targetNode,
    office.MsoRelativeNodePosition pos);


  /**
   * @param targetNode Mandatory ppt.DiagramNode parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(12)
  void replaceNode(
    ppt.DiagramNode targetNode);


  /**
   * @param targetNode Mandatory ppt.DiagramNode parameter.
   * @param swapChildren Optional parameter. Default value is false
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(13)
  void swapNode(
    ppt.DiagramNode targetNode,
    @Optional @DefaultValue("-1") boolean swapChildren);


  /**
   * @param copyChildren Mandatory boolean parameter.
   * @param targetNode Mandatory ppt.DiagramNode parameter.
   * @param pos Optional parameter. Default value is 2
   * @return  Returns a value of type ppt.DiagramNode
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(14)
  ppt.DiagramNode cloneNode(
    boolean copyChildren,
    ppt.DiagramNode targetNode,
    @Optional @DefaultValue("2") office.MsoRelativeNodePosition pos);


  /**
   * @param receivingNode Mandatory ppt.DiagramNode parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(15)
  void transferChildren(
    ppt.DiagramNode receivingNode);


  /**
   * @return  Returns a value of type ppt.DiagramNode
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(16)
  ppt.DiagramNode nextNode();


  /**
   * @return  Returns a value of type ppt.DiagramNode
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(17)
  ppt.DiagramNode prevNode();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Children"
   * </p>
   * @return  Returns a value of type ppt.DiagramNodeChildren
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(19)
  ppt.DiagramNodeChildren children();


  @VTID(19)
  @ReturnValue(defaultPropertyThrough={ppt.DiagramNodeChildren.class})
  ppt.DiagramNode children(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Shape"
   * </p>
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(20)
  ppt.Shape shape();


  /**
   * <p>
   * Getter method for the COM property "Root"
   * </p>
   * @return  Returns a value of type ppt.DiagramNode
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(21)
  ppt.DiagramNode root();


  /**
   * <p>
   * Getter method for the COM property "Diagram"
   * </p>
   * @return  Returns a value of type ppt.Diagram
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(22)
  ppt.Diagram diagram();


  /**
   * <p>
   * Getter method for the COM property "Layout"
   * </p>
   * @return  Returns a value of type office.MsoOrgChartLayoutType
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(23)
  office.MsoOrgChartLayoutType layout();


  /**
   * <p>
   * Setter method for the COM property "Layout"
   * </p>
   * @param type Mandatory office.MsoOrgChartLayoutType parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(24)
  void layout(
    office.MsoOrgChartLayoutType type);


  /**
   * <p>
   * Getter method for the COM property "TextShape"
   * </p>
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(25)
  ppt.Shape textShape();


  // Properties:
}
