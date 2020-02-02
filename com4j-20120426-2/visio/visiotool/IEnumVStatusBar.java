package visiotool  ;

import com4j.*;

@IID("{000D0283-0000-0000-C000-000000000046}")
public interface IEnumVStatusBar extends Com4jObject {
  // Methods:
  /**
   * @param celt Mandatory int parameter.
   * @param rgelt Mandatory Holder<visiotool.IVStatusBar> parameter.
   * @param pceltFetched Mandatory Holder<Integer> parameter.
   */

  @VTID(3)
  void next(
    int celt,
    Holder<visiotool.IVStatusBar> rgelt,
    Holder<Integer> pceltFetched);


  /**
   * @param celt Mandatory int parameter.
   */

  @VTID(4)
  void skip(
    int celt);


  /**
   */

  @VTID(5)
  void reset();


  /**
   * @return  Returns a value of type visiotool.IEnumVStatusBar
   */

  @VTID(6)
  visiotool.IEnumVStatusBar clone();


  // Properties:
}
