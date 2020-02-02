package visiotool.events;

import com4j.*;

/**
 * Visio DataRecordset Event Interface
 */
@IID("{000D0B11-0000-0000-C000-000000000046}")
public abstract class EDataRecordset {
  // Methods:
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

  @DISPID(16416)
  public void beforeDataRecordsetDelete(
    visiotool.IVDataRecordset dataRecordset) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
