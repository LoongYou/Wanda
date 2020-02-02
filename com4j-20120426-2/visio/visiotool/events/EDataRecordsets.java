package visiotool.events;

import com4j.*;

/**
 * Visio DataRecordsets Event Interface
 */
@IID("{000D0B10-0000-0000-C000-000000000046}")
public abstract class EDataRecordsets {
  // Methods:
  /**
   * @param dataRecordset Mandatory visiotool.IVDataRecordset parameter.
   */

  @DISPID(32800)
  public void dataRecordsetAdded(
    visiotool.IVDataRecordset dataRecordset) {
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


  // Properties:
}
