package office  ;

import com4j.*;

@IID("{000CDB0A-0000-0000-C000-000000000046}")
public interface ICustomXMLPartsEvents extends Com4jObject {
  // Methods:
  /**
   * @param newPart Mandatory office._CustomXMLPart parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void partAfterAdd(
    office._CustomXMLPart newPart);


  /**
   * @param oldPart Mandatory office._CustomXMLPart parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void partBeforeDelete(
    office._CustomXMLPart oldPart);


  /**
   * @param part Mandatory office._CustomXMLPart parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void partAfterLoad(
    office._CustomXMLPart part);


  // Properties:
}
