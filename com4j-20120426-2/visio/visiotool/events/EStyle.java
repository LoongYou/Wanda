package visiotool.events;

import com4j.*;

/**
 * Visio Style Event Interface
 */
@IID("{000D0B06-0000-0000-C000-000000000046}")
public abstract class EStyle {
  // Methods:
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


  // Properties:
}
