package visiotool  ;

import com4j.*;

@IID("{000D0738-0000-0000-C000-000000000046}")
public interface IVMovedSelectionEvent extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type VisioTool.IVApplication
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  visiotool.IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  short objectType();


  /**
   * <p>
   * Getter method for the COM property "ReplacementShape"
   * </p>
   * @return  Returns a value of type VisioTool.IVShape
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  visiotool.IVShape replacementShape();


  /**
   * <p>
   * Getter method for the COM property "SelectionSource"
   * </p>
   * @return  Returns a value of type VisioTool.IVSelection
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  visiotool.IVSelection selectionSource();


  @VTID(10)
  @ReturnValue(defaultPropertyThrough={visiotool.IVSelection.class})
  visiotool.IVShape selectionSource(
    int index);

  /**
   * <p>
   * Getter method for the COM property "SelectionTarget"
   * </p>
   * @return  Returns a value of type VisioTool.IVSelection
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  visiotool.IVSelection selectionTarget();


  @VTID(11)
  @ReturnValue(defaultPropertyThrough={visiotool.IVSelection.class})
  visiotool.IVShape selectionTarget(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  short stat();


  // Properties:
}
