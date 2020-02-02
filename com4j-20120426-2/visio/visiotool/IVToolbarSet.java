package visiotool  ;

import com4j.*;

@IID("{000D0262-0000-0000-C000-000000000046}")
public interface IVToolbarSet extends Com4jObject {
  // Methods:
  /**
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Default"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String _default();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param pCaption Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  void caption(
    java.lang.String pCaption);


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  java.lang.String caption();


  /**
   * <p>
   * Getter method for the COM property "SetID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  int setID();


  /**
   * <p>
   * Getter method for the COM property "Toolbars"
   * </p>
   * @return  Returns a value of type visiotool.IVToolbars
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  visiotool.IVToolbars toolbars();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={visiotool.IVToolbars.class})
  visiotool.IVToolbar toolbars(
    int lIndex);

  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type visiotool.IVToolbarSets
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  visiotool.IVToolbarSets parent();


  @VTID(13)
  @ReturnValue(defaultPropertyThrough={visiotool.IVToolbarSets.class})
  visiotool.IVToolbarSet parent(
    int lIndex);

  // Properties:
}
