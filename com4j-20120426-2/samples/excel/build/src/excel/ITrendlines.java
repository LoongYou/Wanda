package excel  ;

import com4j.*;

@IID("{000208BD-0001-0000-C000-000000000046}")
public interface ITrendlines extends Com4jObject,Iterable<Com4jObject> {
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
   * @param type Optional parameter. Default value is -4132
   * @param order Optional parameter. Default value is com4j.Variant.getMissing()
   * @param period Optional parameter. Default value is com4j.Variant.getMissing()
   * @param forward Optional parameter. Default value is com4j.Variant.getMissing()
   * @param backward Optional parameter. Default value is com4j.Variant.getMissing()
   * @param intercept Optional parameter. Default value is com4j.Variant.getMissing()
   * @param displayEquation Optional parameter. Default value is com4j.Variant.getMissing()
   * @param displayRSquared Optional parameter. Default value is com4j.Variant.getMissing()
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.Trendline
   */

  @VTID(10)
  excel.Trendline add(
    @Optional @DefaultValue("-4132") excel.XlTrendlineType type,
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

  @VTID(11)
  int getCount();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.Trendline
   */

  @VTID(12)
  excel.Trendline item(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   */

  @VTID(13)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.Trendline
   */

  @VTID(14)
  @DefaultMethod
  excel.Trendline _Default(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  // Properties:
}
