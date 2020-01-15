package visiotool  ;

import com4j.*;

@IID("{000D0243-0000-0000-C000-000000000046}")
public interface IEnumVToolbarItem extends Com4jObject {
  // Methods:
  /**
   * @param celt Mandatory int parameter.
   * @param rgelt Mandatory Holder<VisioTool.IVToolbarItem> parameter.
   * @param pceltFetched Mandatory Holder<Integer> parameter.
   */

  @VTID(3)
  void next(
    int celt,
    Holder<visiotool.IVToolbarItem> rgelt,
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
   * @return  Returns a value of type VisioTool.IEnumVToolbarItem
   */

  @VTID(6)
  visiotool.IEnumVToolbarItem clone();


  // Properties:
}
