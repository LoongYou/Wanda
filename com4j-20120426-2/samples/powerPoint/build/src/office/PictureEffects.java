package office  ;

import com4j.*;

@IID("{000C03D2-0000-0000-C000-000000000046}")
public interface PictureEffects extends office._IMsoDispObj,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type office.PictureEffect
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  office.PictureEffect item(
    int index);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  int count();


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(11)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param effectType Mandatory office.MsoPictureEffectType parameter.
   * @param position Optional parameter. Default value is -1
   * @return  Returns a value of type office.PictureEffect
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  office.PictureEffect insert(
    office.MsoPictureEffectType effectType,
    @Optional @DefaultValue("-1") int position);


  /**
   * @param index Optional parameter. Default value is -1
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  void delete(
    @Optional @DefaultValue("-1") int index);


  // Properties:
}
