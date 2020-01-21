package office  ;

import com4j.*;

@IID("{000C170A-0000-0000-C000-000000000046}")
public interface SeriesCollection extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * @param source Mandatory java.lang.Object parameter.
   * @param rowcol Optional parameter. Default value is 2
   * @param seriesLabels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param categoryLabels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type office.IMsoSeries
   */

  @VTID(8)
  office.IMsoSeries add(
    @MarshalAs(NativeType.VARIANT) java.lang.Object source,
    @Optional @DefaultValue("2") office.XlRowCol rowcol,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object seriesLabels,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object categoryLabels,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object replace);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(9)
  int count();


  /**
   * @param source Mandatory java.lang.Object parameter.
   * @param rowcol Optional parameter. Default value is com4j.Variant.getMissing()
   * @param categoryLabels Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object extend(
    @MarshalAs(NativeType.VARIANT) java.lang.Object source,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowcol,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object categoryLabels);


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type office.IMsoSeries
   */

  @VTID(11)
  office.IMsoSeries item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   */

  @VTID(12)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param rowcol Optional parameter. Default value is 2
   * @param seriesLabels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param categoryLabels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   * @param newSeries Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object paste(
    @Optional @DefaultValue("2") office.XlRowCol rowcol,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object seriesLabels,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object categoryLabels,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object replace,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object newSeries);


  /**
   * @return  Returns a value of type office.IMsoSeries
   */

  @VTID(14)
  office.IMsoSeries newSeries();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(15)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(16)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type office.IMsoSeries
   */

  @VTID(17)
  @DefaultMethod
  office.IMsoSeries _Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  // Properties:
}
