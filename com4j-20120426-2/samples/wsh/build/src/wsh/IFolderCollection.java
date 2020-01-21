package wsh  ;

import com4j.*;

@IID("{C7C3F5A3-88A3-11D0-ABCB-00A0C90FFFC0}")
public interface IFolderCollection extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type wsh.IFolder
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(7)
  wsh.IFolder add(
    java.lang.String name);


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param key Mandatory java.lang.Object parameter.
   * @return  Returns a value of type wsh.IFolder
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(8)
  @DefaultMethod
  wsh.IFolder item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object key);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(9)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  int count();


  // Properties:
}
