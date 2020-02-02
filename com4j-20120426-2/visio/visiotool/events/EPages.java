package visiotool.events;

import com4j.*;

/**
 * Visio Pages Event Interface
 */
@IID("{000D0B09-0000-0000-C000-000000000046}")
public abstract class EPages {
  // Methods:
  /**
   * @param page Mandatory visiotool.IVPage parameter.
   */

  @DISPID(32784)
  public void pageAdded(
    visiotool.IVPage page) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param page Mandatory visiotool.IVPage parameter.
   */

  @DISPID(8208)
  public void pageChanged(
    visiotool.IVPage page) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param page Mandatory visiotool.IVPage parameter.
   */

  @DISPID(16400)
  public void beforePageDelete(
    visiotool.IVPage page) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory visiotool.IVShape parameter.
   */

  @DISPID(32832)
  public void shapeAdded(
    visiotool.IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param selection Mandatory visiotool.IVSelection parameter.
   */

  @DISPID(901)
  public void beforeSelectionDelete(
    visiotool.IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory visiotool.IVShape parameter.
   */

  @DISPID(8256)
  public void shapeChanged(
    visiotool.IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param selection Mandatory visiotool.IVSelection parameter.
   */

  @DISPID(902)
  public void selectionAdded(
    visiotool.IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory visiotool.IVShape parameter.
   */

  @DISPID(16448)
  public void beforeShapeDelete(
    visiotool.IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory visiotool.IVShape parameter.
   */

  @DISPID(8320)
  public void textChanged(
    visiotool.IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fires after a cell's value changes.
   * </p>
   * @param cell Mandatory visiotool.IVCell parameter.
   */

  @DISPID(10240)
  public void cellChanged(
    visiotool.IVCell cell) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fires after a cell's formula changes.
   * </p>
   * @param cell Mandatory visiotool.IVCell parameter.
   */

  @DISPID(12288)
  public void formulaChanged(
    visiotool.IVCell cell) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param connects Mandatory visiotool.IVConnects parameter.
   */

  @DISPID(33024)
  public void connectionsAdded(
    visiotool.IVConnects connects) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param connects Mandatory visiotool.IVConnects parameter.
   */

  @DISPID(16640)
  public void connectionsDeleted(
    visiotool.IVConnects connects) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel delete of page? T:Yes F:No
   * </p>
   * @param page Mandatory visiotool.IVPage parameter.
   * @return  Returns a value of type void
   */

  @DISPID(500)
  public void queryCancelPageDelete(
    visiotool.IVPage page) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Delete page operation was canceled.
   * </p>
   * @param page Mandatory visiotool.IVPage parameter.
   */

  @DISPID(501)
  public void pageDeleteCanceled(
    visiotool.IVPage page) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory visiotool.IVShape parameter.
   */

  @DISPID(802)
  public void shapeParentChanged(
    visiotool.IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory visiotool.IVShape parameter.
   */

  @DISPID(803)
  public void beforeShapeTextEdit(
    visiotool.IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory visiotool.IVShape parameter.
   */

  @DISPID(804)
  public void shapeExitedTextEdit(
    visiotool.IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel delete of shapes? T:Yes F:No
   * </p>
   * @param selection Mandatory visiotool.IVSelection parameter.
   * @return  Returns a value of type void
   */

  @DISPID(903)
  public void queryCancelSelectionDelete(
    visiotool.IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Delete shapes operation was canceled.
   * </p>
   * @param selection Mandatory visiotool.IVSelection parameter.
   */

  @DISPID(904)
  public void selectionDeleteCanceled(
    visiotool.IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel ungroup operation? T:Yes F:No
   * </p>
   * @param selection Mandatory visiotool.IVSelection parameter.
   * @return  Returns a value of type void
   */

  @DISPID(905)
  public void queryCancelUngroup(
    visiotool.IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Ungroup operation was canceled.
   * </p>
   * @param selection Mandatory visiotool.IVSelection parameter.
   */

  @DISPID(906)
  public void ungroupCanceled(
    visiotool.IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel convert to group operation? T:Yes F:No
   * </p>
   * @param selection Mandatory visiotool.IVSelection parameter.
   * @return  Returns a value of type void
   */

  @DISPID(907)
  public void queryCancelConvertToGroup(
    visiotool.IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Convert to group operation was canceled.
   * </p>
   * @param selection Mandatory visiotool.IVSelection parameter.
   */

  @DISPID(908)
  public void convertToGroupCanceled(
    visiotool.IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel group operation? T:Yes F:No
   * </p>
   * @param selection Mandatory visiotool.IVSelection parameter.
   * @return  Returns a value of type void
   */

  @DISPID(909)
  public void queryCancelGroup(
    visiotool.IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Group operation was canceled.
   * </p>
   * @param selection Mandatory visiotool.IVSelection parameter.
   */

  @DISPID(910)
  public void groupCanceled(
    visiotool.IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory visiotool.IVShape parameter.
   */

  @DISPID(807)
  public void shapeDataGraphicChanged(
    visiotool.IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory visiotool.IVShape parameter.
   * @param dataRecordsetID Mandatory int parameter.
   * @param dataRowID Mandatory int parameter.
   */

  @DISPID(805)
  public void shapeLinkAdded(
    visiotool.IVShape shape,
    int dataRecordsetID,
    int dataRowID) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory visiotool.IVShape parameter.
   * @param dataRecordsetID Mandatory int parameter.
   * @param dataRowID Mandatory int parameter.
   */

  @DISPID(806)
  public void shapeLinkDeleted(
    visiotool.IVShape shape,
    int dataRecordsetID,
    int dataRowID) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shapePair Mandatory visiotool.IVRelatedShapePairEvent parameter.
   */

  @DISPID(502)
  public void containerRelationshipAdded(
    visiotool.IVRelatedShapePairEvent shapePair) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shapePair Mandatory visiotool.IVRelatedShapePairEvent parameter.
   */

  @DISPID(503)
  public void containerRelationshipDeleted(
    visiotool.IVRelatedShapePairEvent shapePair) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shapePair Mandatory visiotool.IVRelatedShapePairEvent parameter.
   */

  @DISPID(504)
  public void calloutRelationshipAdded(
    visiotool.IVRelatedShapePairEvent shapePair) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shapePair Mandatory visiotool.IVRelatedShapePairEvent parameter.
   */

  @DISPID(505)
  public void calloutRelationshipDeleted(
    visiotool.IVRelatedShapePairEvent shapePair) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param replaceShapes Mandatory visiotool.IVReplaceShapesEvent parameter.
   * @return  Returns a value of type void
   */

  @DISPID(911)
  public void queryCancelReplaceShapes(
    visiotool.IVReplaceShapesEvent replaceShapes) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param replaceShapes Mandatory visiotool.IVReplaceShapesEvent parameter.
   */

  @DISPID(912)
  public void replaceShapesCanceled(
    visiotool.IVReplaceShapesEvent replaceShapes) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param replaceShapes Mandatory visiotool.IVReplaceShapesEvent parameter.
   */

  @DISPID(913)
  public void beforeReplaceShapes(
    visiotool.IVReplaceShapesEvent replaceShapes) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sel Mandatory visiotool.IVSelection parameter.
   */

  @DISPID(914)
  public void afterReplaceShapes(
    visiotool.IVSelection sel) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
