package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface PivotTables extends Com4jObject,Iterable<Com4jObject> {
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
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   */

  @DISPID(118)
  @PropGet
  int getCount();


  /**
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(170)
  excel.PivotTable item(
    java.lang.Object index);


  /**
   */

  @DISPID(-4)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param pivotCache Mandatory excel.PivotCache parameter.
   * @param tableDestination Mandatory java.lang.Object parameter.
   * @param tableName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readData Optional parameter. Default value is com4j.Variant.getMissing()
   * @param defaultVersion Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(181)
  excel.PivotTable add(
    excel.PivotCache pivotCache,
    java.lang.Object tableDestination,
    @Optional java.lang.Object tableName,
    @Optional java.lang.Object readData,
    @Optional java.lang.Object defaultVersion);


  // Properties:
}
