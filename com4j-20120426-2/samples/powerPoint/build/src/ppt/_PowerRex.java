package ppt  ;

import com4j.*;

@IID("{914934D3-5A91-11CF-8700-00AA0060263B}")
public interface _PowerRex extends Com4jObject {
  // Methods:
  /**
   * @param erorCode Mandatory java.lang.Object parameter.
   * @param bstrErrorDesc Mandatory java.lang.Object parameter.
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  void onAsfEncoderEvent(
    @MarshalAs(NativeType.VARIANT) java.lang.Object erorCode,
    @MarshalAs(NativeType.VARIANT) java.lang.Object bstrErrorDesc);


  // Properties:
}
