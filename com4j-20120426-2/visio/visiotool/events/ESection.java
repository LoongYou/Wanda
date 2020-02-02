package visiotool.events;

import com4j.*;

/**
 * Visio Section Event Interface
 */
@IID("{000D0B0E-0000-0000-C000-000000000046}")
public abstract class ESection {
  // Methods:
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


  // Properties:
}
