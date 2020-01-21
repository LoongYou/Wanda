package wmi.events;

import com4j.*;

/**
 * A sink for events arising from asynchronous operations
 */
@IID("{75718CA0-F029-11D1-A1AC-00C04FB6C223}")
public abstract class ISWbemSinkEvents {
  // Methods:
  /**
   * <p>
   * Event triggered when an Object is available
   * </p>
   * @param objWbemObject Mandatory wmi.ISWbemObject parameter.
   * @param objWbemAsyncContext Mandatory wmi.ISWbemNamedValueSet parameter.
   */

  @DISPID(1)
  public void onObjectReady(
    wmi.ISWbemObject objWbemObject,
    wmi.ISWbemNamedValueSet objWbemAsyncContext) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Event triggered when an asynchronous operation is completed
   * </p>
   * @param iHResult Mandatory wmi.WbemErrorEnum parameter.
   * @param objWbemErrorObject Mandatory wmi.ISWbemObject parameter.
   * @param objWbemAsyncContext Mandatory wmi.ISWbemNamedValueSet parameter.
   */

  @DISPID(2)
  public void onCompleted(
    wmi.WbemErrorEnum iHResult,
    wmi.ISWbemObject objWbemErrorObject,
    wmi.ISWbemNamedValueSet objWbemAsyncContext) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Event triggered to report the progress of an asynchronous operation
   * </p>
   * @param iUpperBound Mandatory int parameter.
   * @param iCurrent Mandatory int parameter.
   * @param strMessage Mandatory java.lang.String parameter.
   * @param objWbemAsyncContext Mandatory wmi.ISWbemNamedValueSet parameter.
   */

  @DISPID(3)
  public void onProgress(
    int iUpperBound,
    int iCurrent,
    java.lang.String strMessage,
    wmi.ISWbemNamedValueSet objWbemAsyncContext) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Event triggered when an object path is available following a Put operation
   * </p>
   * @param objWbemObjectPath Mandatory wmi.ISWbemObjectPath parameter.
   * @param objWbemAsyncContext Mandatory wmi.ISWbemNamedValueSet parameter.
   */

  @DISPID(4)
  public void onObjectPut(
    wmi.ISWbemObjectPath objWbemObjectPath,
    wmi.ISWbemNamedValueSet objWbemAsyncContext) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
