package visiotool.events;

import com4j.*;

/**
 * Visio Application Event Interface
 */
@IID("{000D0B00-0000-0000-C000-000000000046}")
public abstract class EApplication {
  // Methods:
  /**
   * @param app Mandatory visiotool.IVApplication parameter.
   */

  @DISPID(4097)
  public void appActivated(
    visiotool.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory visiotool.IVApplication parameter.
   */

  @DISPID(4098)
  public void appDeactivated(
    visiotool.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory visiotool.IVApplication parameter.
   */

  @DISPID(4100)
  public void appObjActivated(
    visiotool.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory visiotool.IVApplication parameter.
   */

  @DISPID(4104)
  public void appObjDeactivated(
    visiotool.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory visiotool.IVApplication parameter.
   */

  @DISPID(4112)
  public void beforeQuit(
    visiotool.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory visiotool.IVApplication parameter.
   */

  @DISPID(4128)
  public void beforeModal(
    visiotool.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory visiotool.IVApplication parameter.
   */

  @DISPID(4160)
  public void afterModal(
    visiotool.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window Mandatory visiotool.IVWindow parameter.
   */

  @DISPID(32769)
  public void windowOpened(
    visiotool.IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window Mandatory visiotool.IVWindow parameter.
   */

  @DISPID(701)
  public void selectionChanged(
    visiotool.IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window Mandatory visiotool.IVWindow parameter.
   */

  @DISPID(16385)
  public void beforeWindowClosed(
    visiotool.IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window Mandatory visiotool.IVWindow parameter.
   */

  @DISPID(4224)
  public void windowActivated(
    visiotool.IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window Mandatory visiotool.IVWindow parameter.
   */

  @DISPID(702)
  public void beforeWindowSelDelete(
    visiotool.IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window Mandatory visiotool.IVWindow parameter.
   */

  @DISPID(703)
  public void beforeWindowPageTurn(
    visiotool.IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window Mandatory visiotool.IVWindow parameter.
   */

  @DISPID(704)
  public void windowTurnedToPage(
    visiotool.IVWindow window) {
        throw new UnsupportedOperationException();
  }


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
   * @param app Mandatory visiotool.IVApplication parameter.
   * @param sequenceNum Mandatory int parameter.
   * @param contextString Mandatory java.lang.String parameter.
   */

  @DISPID(4352)
  public void markerEvent(
    visiotool.IVApplication app,
    int sequenceNum,
    java.lang.String contextString) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory visiotool.IVApplication parameter.
   */

  @DISPID(4608)
  public void noEventsPending(
    visiotool.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory visiotool.IVApplication parameter.
   */

  @DISPID(5120)
  public void visioIsIdle(
    visiotool.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory visiotool.IVApplication parameter.
   */

  @DISPID(200)
  public void mustFlushScopeBeginning(
    visiotool.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory visiotool.IVApplication parameter.
   */

  @DISPID(201)
  public void mustFlushScopeEnded(
    visiotool.IVApplication app) {
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
   * @param app Mandatory visiotool.IVApplication parameter.
   * @param nScopeID Mandatory int parameter.
   * @param bstrDescription Mandatory java.lang.String parameter.
   */

  @DISPID(202)
  public void enterScope(
    visiotool.IVApplication app,
    int nScopeID,
    java.lang.String bstrDescription) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory visiotool.IVApplication parameter.
   * @param nScopeID Mandatory int parameter.
   * @param bstrDescription Mandatory java.lang.String parameter.
   * @param bErrOrCancelled Mandatory boolean parameter.
   */

  @DISPID(203)
  public void exitScope(
    visiotool.IVApplication app,
    int nScopeID,
    java.lang.String bstrDescription,
    boolean bErrOrCancelled) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel terminate of application? T:Yes F:No
   * </p>
   * @param app Mandatory visiotool.IVApplication parameter.
   * @return  Returns a value of type void
   */

  @DISPID(204)
  public void queryCancelQuit(
    visiotool.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Terminate application operation was canceled.
   * </p>
   * @param app Mandatory visiotool.IVApplication parameter.
   */

  @DISPID(205)
  public void quitCanceled(
    visiotool.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fires after a window's size or position changes
   * </p>
   * @param window Mandatory visiotool.IVWindow parameter.
   */

  @DISPID(8193)
  public void windowChanged(
    visiotool.IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fires after scroll or zoom in a drawing window
   * </p>
   * @param window Mandatory visiotool.IVWindow parameter.
   */

  @DISPID(705)
  public void viewChanged(
    visiotool.IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel close of window? T:Yes F:No
   * </p>
   * @param window Mandatory visiotool.IVWindow parameter.
   * @return  Returns a value of type void
   */

  @DISPID(706)
  public void queryCancelWindowClose(
    visiotool.IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Window close operation was canceled.
   * </p>
   * @param window Mandatory visiotool.IVWindow parameter.
   */

  @DISPID(707)
  public void windowCloseCanceled(
    visiotool.IVWindow window) {
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
   * Cancel suspension of application? T:Yes F:No
   * </p>
   * @param app Mandatory visiotool.IVApplication parameter.
   * @return  Returns a value of type void
   */

  @DISPID(206)
  public void queryCancelSuspend(
    visiotool.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Suspend application operation was canceled.
   * </p>
   * @param app Mandatory visiotool.IVApplication parameter.
   */

  @DISPID(207)
  public void suspendCanceled(
    visiotool.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory visiotool.IVApplication parameter.
   */

  @DISPID(208)
  public void beforeSuspend(
    visiotool.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory visiotool.IVApplication parameter.
   */

  @DISPID(209)
  public void afterResume(
    visiotool.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when keystroke message received for Addon window. True return indicates message was handled.
   * </p>
   * @param msg Mandatory visiotool.IVMSGWrap parameter.
   * @return  Returns a value of type void
   */

  @DISPID(708)
  public void onKeystrokeMessageForAddon(
    visiotool.IVMSGWrap msg) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when mousedown message received for window. If you set CancelDefault to True then Visio will not process this message.
   * </p>
   * @param button Mandatory int parameter.
   * @param keyButtonState Mandatory int parameter.
   * @param x Mandatory double parameter.
   * @param y Mandatory double parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(709)
  public void mouseDown(
    int button,
    int keyButtonState,
    double x,
    double y,
    Holder<Boolean> cancelDefault) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when mousemove message received for window. If you set CancelDefault to True then Visio will not process this message.
   * </p>
   * @param button Mandatory int parameter.
   * @param keyButtonState Mandatory int parameter.
   * @param x Mandatory double parameter.
   * @param y Mandatory double parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(710)
  public void mouseMove(
    int button,
    int keyButtonState,
    double x,
    double y,
    Holder<Boolean> cancelDefault) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when mouseup message received for window. If you set CancelDefault to True then Visio will not process this message.
   * </p>
   * @param button Mandatory int parameter.
   * @param keyButtonState Mandatory int parameter.
   * @param x Mandatory double parameter.
   * @param y Mandatory double parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(711)
  public void mouseUp(
    int button,
    int keyButtonState,
    double x,
    double y,
    Holder<Boolean> cancelDefault) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when keydown message received for window. If you set CancelDefault to True then Visio will not process this message.
   * </p>
   * @param keyCode Mandatory int parameter.
   * @param keyButtonState Mandatory int parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(712)
  public void keyDown(
    int keyCode,
    int keyButtonState,
    Holder<Boolean> cancelDefault) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when keypress message received for window. If you set CancelDefault to True then Visio will not process this message.
   * </p>
   * @param keyAscii Mandatory int parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(713)
  public void keyPress(
    int keyAscii,
    Holder<Boolean> cancelDefault) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when keyup message received for window. If you set CancelDefault to True then Visio will not process this message.
   * </p>
   * @param keyCode Mandatory int parameter.
   * @param keyButtonState Mandatory int parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(714)
  public void keyUp(
    int keyCode,
    int keyButtonState,
    Holder<Boolean> cancelDefault) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel suspension of application events? T:Yes F:No
   * </p>
   * @param app Mandatory visiotool.IVApplication parameter.
   * @return  Returns a value of type void
   */

  @DISPID(210)
  public void queryCancelSuspendEvents(
    visiotool.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Suspend application events operation was canceled.
   * </p>
   * @param app Mandatory visiotool.IVApplication parameter.
   */

  @DISPID(211)
  public void suspendEventsCanceled(
    visiotool.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory visiotool.IVApplication parameter.
   */

  @DISPID(212)
  public void beforeSuspendEvents(
    visiotool.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory visiotool.IVApplication parameter.
   */

  @DISPID(213)
  public void afterResumeEvents(
    visiotool.IVApplication app) {
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
   * @param dataRecordsetChanged Mandatory visiotool.IVDataRecordsetChangedEvent parameter.
   */

  @DISPID(8224)
  public void dataRecordsetChanged(
    visiotool.IVDataRecordsetChangedEvent dataRecordsetChanged) {
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
   * @param doc Mandatory visiotool.IVDocument parameter.
   */

  @DISPID(11)
  public void afterRemoveHiddenInformation(
    visiotool.IVDocument doc) {
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
   * @param ruleSet Mandatory visiotool.IVValidationRuleSet parameter.
   */

  @DISPID(13)
  public void ruleSetValidated(
    visiotool.IVValidationRuleSet ruleSet) {
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
