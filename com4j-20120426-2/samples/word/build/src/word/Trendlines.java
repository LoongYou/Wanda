package word  ;

import com4j.*;

@IID("{54B7061A-D56C-40E5-B85B-58146446C782}")
public interface Trendlines extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * @param type Optional parameter. Default value is -4132
   * @param order Optional parameter. Default value is com4j.Variant.getMissing()
   * @param period Optional parameter. Default value is com4j.Variant.getMissing()
   * @param forward Optional parameter. Default value is com4j.Variant.getMissing()
   * @param backward Optional parameter. Default value is com4j.Variant.getMissing()
   * @param intercept Optional parameter. Default value is com4j.Variant.getMissing()
   * @param displayEquation Optional parameter. Default value is com4j.Variant.getMissing()
   * @param displayRSquared Optional parameter. Default value is com4j.Variant.getMissing()
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Trendline
   */

  @DISPID(181) //= 0xb5. The runtime will prefer the VTID if present
  @VTID(8)
  word.Trendline add(
    @Optional @DefaultValue("-4132") word.XlTrendlineType type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object order,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object period,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object forward,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object backward,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object intercept,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object displayEquation,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object displayRSquared,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(9)
  int count();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Trendline
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  word.Trendline item(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(11)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(13)
  int creator();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Trendline
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  word.Trendline _Default(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  // Properties:
}
