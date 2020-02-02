package visiotool.events;

import com4j.*;

/**
 * Visio Document Event Interface
 */
@IID("{000D0750-0000-0000-C000-000000000046}")
public abstract class EDocument {
  // Methods:
  /**
   * @param doc Mandatory visiotool.IVDocument parameter.
   */

  @DISPID(2)
  public void documentOpened(
    visiotool.IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory visiotool.IVDocument parameter.
   */

  @DISPID(1)
  public void documentCreated(
    visiotool.IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory visiotool.IVDocument parameter.
   */

  @DISPID(3)
  public void documentSaved(
    visiotool.IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory visiotool.IVDocument parameter.
   */

  @DISPID(4)
  public void documentSavedAs(
    visiotool.IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory visiotool.IVDocument parameter.
   */

  @DISPID(8194)
  public void documentChanged(
    visiotool.IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory visiotool.IVDocument parameter.
   */

  @DISPID(16386)
  public void beforeDocumentClose(
    visiotool.IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param style Mandatory visiotool.IVStyle parameter.
   */

  @DISPID(32772)
  public void styleAdded(
    visiotool.IVStyle style) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param style Mandatory visiotool.IVStyle parameter.
   */

  @DISPID(8196)
  public void styleChanged(
    visiotool.IVStyle style) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param style Mandatory visiotool.IVStyle parameter.
   */

  @DISPID(16388)
  public void beforeStyleDelete(
    visiotool.IVStyle style) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param master Mandatory visiotool.IVMaster parameter.
   */

  @DISPID(32776)
  public void masterAdded(
    visiotool.IVMaster master) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param master Mandatory visiotool.IVMaster parameter.
   */

  @DISPID(8200)
  public void masterChanged(
    visiotool.IVMaster master) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param master Mandatory visiotool.IVMaster parameter.
   */

  @DISPID(16392)
  public void beforeMasterDelete(
    visiotool.IVMaster master) {
        throw new UnsupportedOperationException();
  }


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
   * @param doc Mandatory visiotool.IVDocument parameter.
   */

  @DISPID(5)
  public void runModeEntered(
    visiotool.IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory visiotool.IVDocument parameter.
   */

  @DISPID(6)
  public void designModeEntered(
    visiotool.IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory visiotool.IVDocument parameter.
   */

  @DISPID(7)
  public void beforeDocumentSave(
    visiotool.IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory visiotool.IVDocument parameter.
   */

  @DISPID(8)
  public void beforeDocumentSaveAs(
    visiotool.IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel close of document? T:Yes F:No
   * </p>
   * @param doc Mandatory visiotool.IVDocument parameter.
   * @return  Returns a value of type void
   */

  @DISPID(9)
  public void queryCancelDocumentClose(
    visiotool.IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Document close operation was canceled.
   * </p>
   * @param doc Mandatory visiotool.IVDocument parameter.
   */

  @DISPID(10)
  public void documentCloseCanceled(
    visiotool.IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel delete of style? T:Yes F:No
   * </p>
   * @param style Mandatory visiotool.IVStyle parameter.
   * @return  Returns a value of type void
   */

  @DISPID(300)
  public void queryCancelStyleDelete(
    visiotool.IVStyle style) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Delete style operation was canceled.
   * </p>
   * @param style Mandatory visiotool.IVStyle parameter.
   */

  @DISPID(301)
  public void styleDeleteCanceled(
    visiotool.IVStyle style) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel delete of master? T:Yes F:No
   * </p>
   * @param master Mandatory visiotool.IVMaster parameter.
   * @return  Returns a value of type void
   */

  @DISPID(400)
  public void queryCancelMasterDelete(
    visiotool.IVMaster master) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Delete master operation was canceled.
   * </p>
   * @param master Mandatory visiotool.IVMaster parameter.
   */

  @DISPID(401)
  public void masterDeleteCanceled(
    visiotool.IVMaster master) {
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
   * @param dataRecordset Mandatory visiotool.IVDataRecordset parameter.
   */

  @DISPID(16416)
  public void beforeDataRecordsetDelete(
    visiotool.IVDataRecordset dataRecordset) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param dataRecordset Mandatory visiotool.IVDataRecordset parameter.
   */

  @DISPID(32800)
  public void dataRecordsetAdded(
    visiotool.IVDataRecordset dataRecordset) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory visiotool.IVDocument parameter.
   */

  @DISPID(11)
  public void afterRemoveHiddenInformation(
    visiotool.IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param ruleSet Mandatory visiotool.IVValidationRuleSet parameter.
   */

  @DISPID(13)
  public void ruleSetValidated(
    visiotool.IVValidationRuleSet ruleSet) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param coauthMergeObjects Mandatory visiotool.IVCoauthMergeEvent parameter.
   */

  @DISPID(14)
  public void afterDocumentMerge(
    visiotool.IVCoauthMergeEvent coauthMergeObjects) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
