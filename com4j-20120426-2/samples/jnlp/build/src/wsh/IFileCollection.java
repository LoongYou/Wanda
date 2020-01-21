package wsh  ;

import com4j.*;

@IID("{C7C3F5A5-88A3-11D0-ABCB-00A0C90FFFC0}")
public interface IFileCollection extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param key Mandatory java.lang.Object parameter.
   * @return  Returns a value of type wsh.IFile
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  wsh.IFile item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object key);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(8)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  int count();


  // Properties:
}
