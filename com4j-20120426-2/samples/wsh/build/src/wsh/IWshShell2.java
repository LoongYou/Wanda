package wsh  ;

import com4j.*;

/**
 * Shell Object Interface
 */
@IID("{24BE5A30-EDFE-11D2-B933-00104B365C9F}")
public interface IWshShell2 extends wsh.IWshShell {
  // Methods:
  /**
   * @param type Mandatory java.lang.Object parameter.
   * @param message Mandatory java.lang.String parameter.
   * @param target Optional parameter. Default value is ""
   * @return  Returns a value of type boolean
   */

  @DISPID(3000) //= 0xbb8. The runtime will prefer the VTID if present
  @VTID(16)
  boolean logEvent(
    java.lang.Object type,
    java.lang.String message,
    @Optional @DefaultValue("") java.lang.String target);


  /**
   * @param app Mandatory java.lang.Object parameter.
   * @param wait Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(3010) //= 0xbc2. The runtime will prefer the VTID if present
  @VTID(17)
  boolean appActivate(
    java.lang.Object app,
    @Optional java.lang.Object wait);


  /**
   * @param keys Mandatory java.lang.String parameter.
   * @param wait Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(3011) //= 0xbc3. The runtime will prefer the VTID if present
  @VTID(18)
  void sendKeys(
    java.lang.String keys,
    @Optional java.lang.Object wait);


  // Properties:
}
