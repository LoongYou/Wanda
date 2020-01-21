package office  ;

import com4j.*;

@IID("{000CDB06-0000-0000-C000-000000000046}")
public interface ICustomXMLPartEvents extends Com4jObject {
  // Methods:
  /**
   * @param newNode Mandatory office.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void nodeAfterInsert(
    office.CustomXMLNode newNode,
    boolean inUndoRedo);


  /**
   * @param oldNode Mandatory office.CustomXMLNode parameter.
   * @param oldParentNode Mandatory office.CustomXMLNode parameter.
   * @param oldNextSibling Mandatory office.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void nodeAfterDelete(
    office.CustomXMLNode oldNode,
    office.CustomXMLNode oldParentNode,
    office.CustomXMLNode oldNextSibling,
    boolean inUndoRedo);


  /**
   * @param oldNode Mandatory office.CustomXMLNode parameter.
   * @param newNode Mandatory office.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void nodeAfterReplace(
    office.CustomXMLNode oldNode,
    office.CustomXMLNode newNode,
    boolean inUndoRedo);


  // Properties:
}
