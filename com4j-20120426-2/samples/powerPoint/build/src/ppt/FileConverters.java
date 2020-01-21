package ppt  ;

import com4j.*;

@IID("{92D41A50-F07E-4CA4-AF6F-BEF486AA4E6F}")
public interface FileConverters extends ppt.Collection {
  // Methods:
  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type ppt.FileConverter
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  ppt.FileConverter item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  // Properties:
}
