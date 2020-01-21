package office  ;

import com4j.*;

@IID("{000C03C8-0000-0000-C000-000000000046}")
public interface SmartArtNode extends office._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * @param position Optional parameter. Default value is 1
   * @param type Optional parameter. Default value is 1
   * @return  Returns a value of type office.SmartArtNode
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  office.SmartArtNode addNode(
    @Optional @DefaultValue("1") office.MsoSmartArtNodePosition position,
    @Optional @DefaultValue("1") office.MsoSmartArtNodeType type);


  /**
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  void delete();


  /**
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  void promote();


  /**
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(13)
  void demote();


  /**
   * <p>
   * Getter method for the COM property "OrgChartLayout"
   * </p>
   * @return  Returns a value of type office.MsoOrgChartLayoutType
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(14)
  office.MsoOrgChartLayoutType orgChartLayout();


  /**
   * <p>
   * Setter method for the COM property "OrgChartLayout"
   * </p>
   * @param type Mandatory office.MsoOrgChartLayoutType parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(15)
  void orgChartLayout(
    office.MsoOrgChartLayoutType type);


  /**
   * <p>
   * Getter method for the COM property "Shapes"
   * </p>
   * @return  Returns a value of type office.ShapeRange
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(16)
  office.ShapeRange shapes();


  @VTID(16)
  @ReturnValue(defaultPropertyThrough={office.ShapeRange.class})
  office.Shape shapes(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "TextFrame2"
   * </p>
   * @return  Returns a value of type office.TextFrame2
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(17)
  office.TextFrame2 textFrame2();


  /**
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(18)
  void larger();


  /**
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(19)
  void smaller();


  /**
   * <p>
   * Getter method for the COM property "Level"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(20)
  int level();


  /**
   * <p>
   * Getter method for the COM property "Hidden"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(21)
  office.MsoTriState hidden();


  /**
   * <p>
   * Getter method for the COM property "Nodes"
   * </p>
   * @return  Returns a value of type office.SmartArtNodes
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(22)
  office.SmartArtNodes nodes();


  @VTID(22)
  @ReturnValue(defaultPropertyThrough={office.SmartArtNodes.class})
  office.SmartArtNode nodes(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "ParentNode"
   * </p>
   * @return  Returns a value of type office.SmartArtNode
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(23)
  office.SmartArtNode parentNode();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type office.MsoSmartArtNodeType
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(24)
  office.MsoSmartArtNodeType type();


  /**
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(25)
  void reorderUp();


  /**
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(26)
  void reorderDown();


  // Properties:
}
