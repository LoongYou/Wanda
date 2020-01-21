package office.events;

import com4j.*;

@IID("{000CDB07-0000-0000-C000-000000000046}")
public abstract class _CustomXMLPartEvents {
  // Methods:
  /**
   * @param newNode Mandatory office.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(1)
  public void nodeAfterInsert(
    office.CustomXMLNode newNode,
    boolean inUndoRedo) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param oldNode Mandatory office.CustomXMLNode parameter.
   * @param oldParentNode Mandatory office.CustomXMLNode parameter.
   * @param oldNextSibling Mandatory office.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(2)
  public void nodeAfterDelete(
    office.CustomXMLNode oldNode,
    office.CustomXMLNode oldParentNode,
    office.CustomXMLNode oldNextSibling,
    boolean inUndoRedo) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param oldNode Mandatory office.CustomXMLNode parameter.
   * @param newNode Mandatory office.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(3)
  public void nodeAfterReplace(
    office.CustomXMLNode oldNode,
    office.CustomXMLNode newNode,
    boolean inUndoRedo) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
