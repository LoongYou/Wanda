package visiotool  ;

import com4j.*;

@IID("{000D0737-0000-0000-C000-000000000046}")
public interface IVRelatedShapePairEvent extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  short stat();


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
   * Getter method for the COM property "ContainingPage"
   * </p>
   * @return  Returns a value of type visiotool.IVPage
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  visiotool.IVPage containingPage();


  /**
   * <p>
   * Getter method for the COM property "ContainingPageID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  int containingPageID();


  /**
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of type visiotool.IVDocument
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  visiotool.IVDocument document();


  /**
   * <p>
   * Getter method for the COM property "FromShapeID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  int fromShapeID();


  /**
   * <p>
   * Getter method for the COM property "ToShapeID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  int toShapeID();


  // Properties:
}
