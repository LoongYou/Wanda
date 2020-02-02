package visiotool.events;

import com4j.*;

/**
 * Visio Characters Event Interface
 */
@IID("{000D0B0C-0000-0000-C000-000000000046}")
public abstract class ECharacters {
  // Methods:
  /**
   * @param shape Mandatory visiotool.IVShape parameter.
   */

  @DISPID(8320)
  public void textChanged(
    visiotool.IVShape shape) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
