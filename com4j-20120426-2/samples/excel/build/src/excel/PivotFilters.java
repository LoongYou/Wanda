package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface PivotFilters extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  excel.PivotFilter get_Default(
    java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4)
  @PropGet
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(170)
  @PropGet
  excel.PivotFilter getItem(
    java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   */

  @DISPID(118)
  @PropGet
  int getCount();


  /**
   * @param type Mandatory excel.XlPivotFilterType parameter.
   * @param dataField Optional parameter. Default value is com4j.Variant.getMissing()
   * @param value1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param value2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param order Optional parameter. Default value is com4j.Variant.getMissing()
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param description Optional parameter. Default value is com4j.Variant.getMissing()
   * @param memberPropertyField Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(181)
  excel.PivotFilter add(
    excel.XlPivotFilterType type,
    @Optional java.lang.Object dataField,
    @Optional java.lang.Object value1,
    @Optional java.lang.Object value2,
    @Optional java.lang.Object order,
    @Optional java.lang.Object name,
    @Optional java.lang.Object description,
    @Optional java.lang.Object memberPropertyField);


  // Properties:
}
