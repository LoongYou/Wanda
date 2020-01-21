package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface SeriesCollection extends Com4jObject,Iterable<Com4jObject> {
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
   * @param source Mandatory java.lang.Object parameter.
   * @param rowcol Optional parameter. Default value is -4105
   * @param seriesLabels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param categoryLabels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(181)
  excel.Series add(
    java.lang.Object source,
    @Optional @DefaultValue("-4105") excel.XlRowCol rowcol,
    @Optional java.lang.Object seriesLabels,
    @Optional java.lang.Object categoryLabels,
    @Optional java.lang.Object replace);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   */

  @DISPID(118)
  @PropGet
  int getCount();


  /**
   * @param source Mandatory java.lang.Object parameter.
   * @param rowcol Optional parameter. Default value is com4j.Variant.getMissing()
   * @param categoryLabels Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(227)
  java.lang.Object extend(
    java.lang.Object source,
    @Optional java.lang.Object rowcol,
    @Optional java.lang.Object categoryLabels);


  /**
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(170)
  excel.Series item(
    java.lang.Object index);


  /**
   */

  @DISPID(-4)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param rowcol Optional parameter. Default value is -4105
   * @param seriesLabels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param categoryLabels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   * @param newSeries Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(211)
  java.lang.Object paste(
    @Optional @DefaultValue("-4105") excel.XlRowCol rowcol,
    @Optional java.lang.Object seriesLabels,
    @Optional java.lang.Object categoryLabels,
    @Optional java.lang.Object replace,
    @Optional java.lang.Object newSeries);


  /**
   */

  @DISPID(1117)
  excel.Series newSeries();


  /**
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(0)
  @DefaultMethod
  excel.Series _Default(
    java.lang.Object index);


  // Properties:
}
