package excel  ;

import com4j.*;

@IID("{0002086C-0001-0000-C000-000000000046}")
public interface ISeriesCollection extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type excel._Application
   */

  @VTID(7)
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type excel.XlCreator
   */

  @VTID(8)
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getParent();


  /**
   * @param source Mandatory java.lang.Object parameter.
   * @param rowcol Optional parameter. Default value is -4105
   * @param seriesLabels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param categoryLabels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.Series
   */

  @VTID(10)
  excel.Series add(
    @MarshalAs(NativeType.VARIANT) java.lang.Object source,
    @Optional @DefaultValue("-4105") excel.XlRowCol rowcol,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object seriesLabels,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object categoryLabels,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object replace);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(11)
  int getCount();


  /**
   * @param source Mandatory java.lang.Object parameter.
   * @param rowcol Optional parameter. Default value is com4j.Variant.getMissing()
   * @param categoryLabels Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object extend(
    @MarshalAs(NativeType.VARIANT) java.lang.Object source,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowcol,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object categoryLabels);


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.Series
   */

  @VTID(13)
  excel.Series item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   */

  @VTID(14)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param rowcol Optional parameter. Default value is -4105
   * @param seriesLabels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param categoryLabels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   * @param newSeries Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object paste(
    @Optional @DefaultValue("-4105") excel.XlRowCol rowcol,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object seriesLabels,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object categoryLabels,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object replace,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object newSeries);


  /**
   * @return  Returns a value of type excel.Series
   */

  @VTID(16)
  excel.Series newSeries();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.Series
   */

  @VTID(17)
  @DefaultMethod
  excel.Series _Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  // Properties:
}
