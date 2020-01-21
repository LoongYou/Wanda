package wsh  ;

import com4j.*;

/**
 * Network Object
 */
@IID("{24BE5A31-EDFE-11D2-B933-00104B365C9F}")
public interface IWshNetwork2 extends wsh.IWshNetwork {
  // Methods:
  /**
   * @param printerName Mandatory java.lang.String parameter.
   * @param driverName Optional parameter. Default value is ""
   * @param port Optional parameter. Default value is "LPT1"
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(20)
  void addWindowsPrinterConnection(
    java.lang.String printerName,
    @Optional @DefaultValue("") java.lang.String driverName,
    @Optional @DefaultValue("LPT1") java.lang.String port);


  // Properties:
}
