package word  ;

import com4j.*;

@IID("{000209E9-0000-0000-C000-000000000046}")
public interface DiagramNode extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Children"
   * </p>
   * @return  Returns a value of type word.DiagramNodeChildren
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(10)
  word.DiagramNodeChildren children();


  @VTID(10)
  @ReturnValue(defaultPropertyThrough={word.DiagramNodeChildren.class})
  word.DiagramNode children(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Shape"
   * </p>
   * @return  Returns a value of type word.Shape
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(11)
  word.Shape shape();


  /**
   * <p>
   * Getter method for the COM property "Root"
   * </p>
   * @return  Returns a value of type word.DiagramNode
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(12)
  word.DiagramNode root();


  /**
   * <p>
   * Getter method for the COM property "Diagram"
   * </p>
   * @return  Returns a value of type word.Diagram
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(13)
  word.Diagram diagram();


  /**
   * <p>
   * Getter method for the COM property "Layout"
   * </p>
   * @return  Returns a value of type office.MsoOrgChartLayoutType
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(14)
  office.MsoOrgChartLayoutType layout();


  /**
   * <p>
   * Setter method for the COM property "Layout"
   * </p>
   * @param prop Mandatory office.MsoOrgChartLayoutType parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(15)
  void layout(
    office.MsoOrgChartLayoutType prop);


  /**
   * <p>
   * Getter method for the COM property "TextShape"
   * </p>
   * @return  Returns a value of type word.Shape
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(16)
  word.Shape textShape();


  /**
   * @param pos Optional parameter. Default value is 2
   * @param nodeType Optional parameter. Default value is 1
   * @return  Returns a value of type word.DiagramNode
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(17)
  word.DiagramNode addNode(
    @Optional @DefaultValue("2") office.MsoRelativeNodePosition pos,
    @Optional @DefaultValue("1") office.MsoDiagramNodeType nodeType);


  /**
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(18)
  void delete();


  /**
   * @param pos Mandatory office.MsoRelativeNodePosition parameter.
   * @return  Returns a value of type word.DiagramNode
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(index=0)
  word.DiagramNode moveNode(
    office.MsoRelativeNodePosition pos);


  /**
   * @return  Returns a value of type word.DiagramNode
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(20)
  word.DiagramNode replaceNode();


  /**
   * @param pos Optional parameter. Default value is -1
   * @return  Returns a value of type word.DiagramNode
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(21)
  @ReturnValue(index=0)
  word.DiagramNode swapNode(
    @Optional @DefaultValue("-1") office.MsoRelativeNodePosition pos);


  /**
   * @param copyChildren Mandatory boolean parameter.
   * @param targetNode Optional parameter. Default value is 0
   * @param pos Optional parameter. Default value is 2
   * @return  Returns a value of type word.DiagramNode
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(22)
  word.DiagramNode cloneNode(
    boolean copyChildren,
    @Optional @DefaultValue("0") Holder<word.DiagramNode> targetNode,
    @Optional @DefaultValue("2") office.MsoRelativeNodePosition pos);


  /**
   * @return  Returns a value of type word.DiagramNode
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(23)
  word.DiagramNode transferChildren();


  /**
   * @return  Returns a value of type word.DiagramNode
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(24)
  word.DiagramNode nextNode();


  /**
   * @return  Returns a value of type word.DiagramNode
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(25)
  word.DiagramNode prevNode();


  // Properties:
}
