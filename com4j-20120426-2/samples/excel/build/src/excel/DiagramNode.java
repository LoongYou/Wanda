package excel  ;

import com4j.*;

@IID("{000C0370-0000-0000-C000-000000000046}")
public interface DiagramNode extends office._IMsoDispObj {
  // Methods:
  /**
   * @param pos Optional parameter. Default value is 2
   * @param nodeType Optional parameter. Default value is 1
   * @return  Returns a value of type excel.DiagramNode
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(9)
  excel.DiagramNode addNode(
    @Optional @DefaultValue("2") office.MsoRelativeNodePosition pos,
    @Optional @DefaultValue("1") office.MsoDiagramNodeType nodeType);


  /**
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(10)
  void delete();


  /**
   * @param pTargetNode Mandatory excel.DiagramNode parameter.
   * @param pos Mandatory office.MsoRelativeNodePosition parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(11)
  void moveNode(
    excel.DiagramNode pTargetNode,
    office.MsoRelativeNodePosition pos);


  /**
   * @param pTargetNode Mandatory excel.DiagramNode parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(12)
  void replaceNode(
    excel.DiagramNode pTargetNode);


  /**
   * @param pTargetNode Mandatory excel.DiagramNode parameter.
   * @param swapChildren Optional parameter. Default value is false
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(13)
  void swapNode(
    excel.DiagramNode pTargetNode,
    @Optional @DefaultValue("-1") boolean swapChildren);


  /**
   * @param copyChildren Mandatory boolean parameter.
   * @param pTargetNode Mandatory excel.DiagramNode parameter.
   * @param pos Optional parameter. Default value is 2
   * @return  Returns a value of type excel.DiagramNode
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(14)
  excel.DiagramNode cloneNode(
    boolean copyChildren,
    excel.DiagramNode pTargetNode,
    @Optional @DefaultValue("2") office.MsoRelativeNodePosition pos);


  /**
   * @param pReceivingNode Mandatory excel.DiagramNode parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(15)
  void transferChildren(
    excel.DiagramNode pReceivingNode);


  /**
   * @return  Returns a value of type excel.DiagramNode
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(16)
  excel.DiagramNode nextNode();


  /**
   * @return  Returns a value of type excel.DiagramNode
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(17)
  excel.DiagramNode prevNode();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getParent();


  /**
   * <p>
   * Getter method for the COM property "Children"
   * </p>
   * @return  Returns a value of type excel.DiagramNodeChildren
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(19)
  excel.DiagramNodeChildren getChildren();


  @VTID(19)
  @ReturnValue(defaultPropertyThrough={excel.DiagramNodeChildren.class})
  excel.DiagramNode getChildren(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Shape"
   * </p>
   * @return  Returns a value of type excel.Shape
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(20)
  excel.Shape getShape();


  /**
   * <p>
   * Getter method for the COM property "Root"
   * </p>
   * @return  Returns a value of type excel.DiagramNode
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(21)
  excel.DiagramNode getRoot();


  /**
   * <p>
   * Getter method for the COM property "Diagram"
   * </p>
   * @return  Returns a value of type office.IMsoDiagram
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(22)
  office.IMsoDiagram getDiagram();


  /**
   * <p>
   * Getter method for the COM property "Layout"
   * </p>
   * @return  Returns a value of type office.MsoOrgChartLayoutType
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(23)
  office.MsoOrgChartLayoutType getLayout();


  /**
   * <p>
   * Setter method for the COM property "Layout"
   * </p>
   * @param pdgmType Mandatory office.MsoOrgChartLayoutType parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(24)
  void setLayout(
    office.MsoOrgChartLayoutType pdgmType);


  /**
   * <p>
   * Getter method for the COM property "TextShape"
   * </p>
   * @return  Returns a value of type excel.Shape
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(25)
  excel.Shape getTextShape();


  // Properties:
}
