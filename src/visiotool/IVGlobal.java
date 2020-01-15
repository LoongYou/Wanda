package visiotool  ;

import com4j.*;

@IID("{000D071C-0000-0000-C000-000000000046}")
public interface IVGlobal extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Returns Visio Application instance hosting the object.
   * </p>
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type VisioTool.IVApplication
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  visiotool.IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "ActiveDocument"
   * </p>
   * @return  Returns a value of type VisioTool.IVDocument
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  visiotool.IVDocument activeDocument();


  /**
   * <p>
   * Getter method for the COM property "ActivePage"
   * </p>
   * @return  Returns a value of type VisioTool.IVPage
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  visiotool.IVPage activePage();


  /**
   * <p>
   * Getter method for the COM property "ActiveWindow"
   * </p>
   * @return  Returns a value of type VisioTool.IVWindow
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(10)
  visiotool.IVWindow activeWindow();


  /**
   * <p>
   * Getter method for the COM property "Documents"
   * </p>
   * @return  Returns a value of type VisioTool.IVDocuments
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(11)
  visiotool.IVDocuments documents();


  @VTID(11)
  @ReturnValue(defaultPropertyThrough={visiotool.IVDocuments.class})
  visiotool.IVDocument documents(
    @MarshalAs(NativeType.VARIANT) java.lang.Object nameOrIndex);

  /**
   * <p>
   * Getter method for the COM property "Windows"
   * </p>
   * @return  Returns a value of type VisioTool.IVWindows
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(12)
  visiotool.IVWindows windows();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={visiotool.IVWindows.class})
  visiotool.IVWindow windows(
    short index);

  /**
   * <p>
   * Getter method for the COM property "Addons"
   * </p>
   * @return  Returns a value of type VisioTool.IVAddons
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(13)
  visiotool.IVAddons addons();


  @VTID(13)
  @ReturnValue(defaultPropertyThrough={visiotool.IVAddons.class})
  visiotool.IVAddon addons(
    @MarshalAs(NativeType.VARIANT) java.lang.Object nameOrIndex);

  /**
   * <p>
   * Getter method for the COM property "Vbe"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject vbe();


  // Properties:
}
