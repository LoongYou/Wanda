package ppt  ;

import com4j.*;

@IID("{92D41A76-F07E-4CA4-AF6F-BEF486AA4E6F}")
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
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(8)
  int count();


  /**
   * @param source Mandatory java.lang.Object parameter.
   * @param rowcol Optional parameter. Default value is com4j.Variant.getMissing()
   * @param categoryLabels Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(227) //= 0xe3. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object extend(
    @MarshalAs(NativeType.VARIANT) java.lang.Object source,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowcol,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object categoryLabels);


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type ppt.Series
   */

  @DISPID(170) //= 0xaa. The runtime will prefer the VTID if present
  @VTID(10)
  ppt.Series item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(11)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @return  Returns a value of type ppt.Series
   */

  @DISPID(1117) //= 0x45d. The runtime will prefer the VTID if present
  @VTID(12)
  ppt.Series newSeries();


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
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(14)
  ppt._Application application();


  /**
   * @param source Mandatory java.lang.Object parameter.
   * @param rowcol Optional parameter. Default value is -4105
   * @param seriesLabels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param categoryLabels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type ppt.Series
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(15)
  ppt.Series add(
    @MarshalAs(NativeType.VARIANT) java.lang.Object source,
    @Optional @DefaultValue("-4105") ppt.XlRowCol rowcol,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object seriesLabels,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object categoryLabels,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object replace);


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type ppt.Series
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(16)
  @DefaultMethod
  ppt.Series _Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  // Properties:
}
