package word  ;

import com4j.*;

@IID("{8FEB78F7-35C6-4871-918C-193C3CDD886D}")
public interface SeriesCollection extends Com4jObject,Iterable<Com4jObject> {
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
   * @param source Mandatory java.lang.Object parameter.
   * @param rowcol Optional parameter. Default value is 2
   * @param seriesLabels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param categoryLabels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Series
   */

  @DISPID(181) //= 0xb5. The runtime will prefer the VTID if present
  @VTID(8)
  word.Series add(
    @MarshalAs(NativeType.VARIANT) java.lang.Object source,
    @Optional @DefaultValue("2") word.XlRowCol rowcol,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object seriesLabels,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object categoryLabels,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object replace);


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
   * @param source Mandatory java.lang.Object parameter.
   * @param rowcol Optional parameter. Default value is com4j.Variant.getMissing()
   * @param categoryLabels Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(227) //= 0xe3. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object extend(
    @MarshalAs(NativeType.VARIANT) java.lang.Object source,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowcol,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object categoryLabels);


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type word.Series
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  word.Series item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(12)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @return  Returns a value of type word.Series
   */

  @DISPID(1117) //= 0x45d. The runtime will prefer the VTID if present
  @VTID(13)
  word.Series newSeries();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(15)
  int creator();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type word.Series
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(16)
  word.Series _Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  // Properties:
}
