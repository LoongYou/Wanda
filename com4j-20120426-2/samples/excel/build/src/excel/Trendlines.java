package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Trendlines extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   */

  @DISPID(148)
  @PropGet
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   */

  @DISPID(149)
  @PropGet
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   */

  @DISPID(150)
  @PropGet
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
   */

  @DISPID(181)
  excel.Trendline add(
    @Optional @DefaultValue("-4132") excel.XlTrendlineType type,
    @Optional java.lang.Object order,
    @Optional java.lang.Object period,
    @Optional java.lang.Object forward,
    @Optional java.lang.Object backward,
    @Optional java.lang.Object intercept,
    @Optional java.lang.Object displayEquation,
    @Optional java.lang.Object displayRSquared,
    @Optional java.lang.Object name);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   */

  @DISPID(118)
  @PropGet
  int getCount();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(170)
  excel.Trendline item(
    @Optional java.lang.Object index);


  /**
   */

  @DISPID(-4)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(0)
  @DefaultMethod
  excel.Trendline _Default(
    @Optional java.lang.Object index);


  // Properties:
}
