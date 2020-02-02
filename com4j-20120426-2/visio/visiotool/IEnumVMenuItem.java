package visiotool  ;

import com4j.*;

@IID("{000D0213-0000-0000-C000-000000000046}")
public interface IEnumVMenuItem extends Com4jObject {
  // Methods:
  /**
   * @param celt Mandatory int parameter.
   * @param rgelt Mandatory Holder<visiotool.IVMenuItem> parameter.
   * @param pceltFetched Mandatory Holder<Integer> parameter.
   */

  @VTID(3)
  void next(
    int celt,
    Holder<visiotool.IVMenuItem> rgelt,
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
   * @return  Returns a value of type visiotool.IEnumVMenuItem
   */

  @VTID(6)
  visiotool.IEnumVMenuItem clone();


  // Properties:
}
