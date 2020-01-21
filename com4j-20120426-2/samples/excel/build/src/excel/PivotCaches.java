package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface PivotCaches extends Com4jObject,Iterable<Com4jObject> {
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
  excel.PivotCache item(
    java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  excel.PivotCache get_Default(
    java.lang.Object index);


  /**
   */

  @DISPID(-4)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param sourceType Mandatory excel.XlPivotTableSourceType parameter.
   * @param sourceData Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(181)
  excel.PivotCache add(
    excel.XlPivotTableSourceType sourceType,
    @Optional java.lang.Object sourceData);


  /**
   * @param sourceType Mandatory excel.XlPivotTableSourceType parameter.
   * @param sourceData Optional parameter. Default value is com4j.Variant.getMissing()
   * @param version Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1896)
  excel.PivotCache create(
    excel.XlPivotTableSourceType sourceType,
    @Optional java.lang.Object sourceData,
    @Optional java.lang.Object version);


  // Properties:
}
