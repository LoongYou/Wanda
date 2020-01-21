package word.events;

import com4j.*;

@IID("{00020A02-0000-0000-C000-000000000046}")
public abstract class DocumentEvents2 {
  // Methods:
  /**
   */

  @DISPID(4)
  public void _new() {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(5)
  public void open() {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(6)
  public void close() {
        throw new UnsupportedOperationException();
  }


  /**
   * @param syncEventType Mandatory office.MsoSyncEventType parameter.
   */

  @DISPID(7)
  public void sync(
    office.MsoSyncEventType syncEventType) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param newXMLNode Mandatory word.XMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(8)
  public void xmlAfterInsert(
    word.XMLNode newXMLNode,
    boolean inUndoRedo) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param deletedRange Mandatory word.Range parameter.
   * @param oldXMLNode Mandatory word.XMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(9)
  public void xmlBeforeDelete(
    word.Range deletedRange,
    word.XMLNode oldXMLNode,
    boolean inUndoRedo) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param newContentControl Mandatory word.ContentControl parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(12)
  public void contentControlAfterAdd(
    word.ContentControl newContentControl,
    boolean inUndoRedo) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param oldContentControl Mandatory word.ContentControl parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(13)
  public void contentControlBeforeDelete(
    word.ContentControl oldContentControl,
    boolean inUndoRedo) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param contentControl Mandatory word.ContentControl parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(14)
  public void contentControlOnExit(
    word.ContentControl contentControl,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param contentControl Mandatory word.ContentControl parameter.
   */

  @DISPID(15)
  public void contentControlOnEnter(
    word.ContentControl contentControl) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param contentControl Mandatory word.ContentControl parameter.
   * @param content Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(16)
  public void contentControlBeforeStoreUpdate(
    word.ContentControl contentControl,
    Holder<java.lang.String> content) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param contentControl Mandatory word.ContentControl parameter.
   * @param content Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(17)
  public void contentControlBeforeContentUpdate(
    word.ContentControl contentControl,
    Holder<java.lang.String> content) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param range Mandatory word.Range parameter.
   * @param name Mandatory java.lang.String parameter.
   * @param category Mandatory java.lang.String parameter.
   * @param blockType Mandatory java.lang.String parameter.
   * @param template Mandatory java.lang.String parameter.
   */

  @DISPID(18)
  public void buildingBlockInsert(
    word.Range range,
    java.lang.String name,
    java.lang.String category,
    java.lang.String blockType,
    java.lang.String template) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
