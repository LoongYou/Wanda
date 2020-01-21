package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Scenarios extends Com4jObject,Iterable<Com4jObject> {
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
   * @param name Mandatory java.lang.String parameter.
   * @param changingCells Mandatory java.lang.Object parameter.
   * @param values Optional parameter. Default value is com4j.Variant.getMissing()
   * @param comment Optional parameter. Default value is com4j.Variant.getMissing()
   * @param locked Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hidden Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(181)
  excel.Scenario add(
    java.lang.String name,
    java.lang.Object changingCells,
    @Optional java.lang.Object values,
    @Optional java.lang.Object comment,
    @Optional java.lang.Object locked,
    @Optional java.lang.Object hidden);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   */

  @DISPID(118)
  @PropGet
  int getCount();


  /**
   * @param reportType Optional parameter. Default value is 1
   * @param resultCells Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(913)
  java.lang.Object createSummary(
    @Optional @DefaultValue("1") excel.XlSummaryReportType reportType,
    @Optional java.lang.Object resultCells);


  /**
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(170)
  excel.Scenario item(
    java.lang.Object index);


  /**
   * @param source Mandatory java.lang.Object parameter.
   */

  @DISPID(564)
  java.lang.Object merge(
    java.lang.Object source);


  /**
   */

  @DISPID(-4)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
