package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface FormatConditions extends Com4jObject,Iterable<Com4jObject> {
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
  com4j.Com4jObject item(
    java.lang.Object index);


  /**
   * @param type Mandatory excel.XlFormatConditionType parameter.
   * @param operator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param formula1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param formula2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param string Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textOperator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param dateOperator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param scopeType Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(181)
  com4j.Com4jObject add(
    excel.XlFormatConditionType type,
    @Optional java.lang.Object operator,
    @Optional java.lang.Object formula1,
    @Optional java.lang.Object formula2,
    @Optional java.lang.Object string,
    @Optional java.lang.Object textOperator,
    @Optional java.lang.Object dateOperator,
    @Optional java.lang.Object scopeType);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  com4j.Com4jObject get_Default(
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
   */

  @DISPID(117)
  void delete();


  /**
   * @param colorScaleType Mandatory int parameter.
   */

  @DISPID(2616)
  com4j.Com4jObject addColorScale(
    int colorScaleType);


  /**
   */

  @DISPID(2618)
  com4j.Com4jObject addDatabar();


  /**
   */

  @DISPID(2619)
  com4j.Com4jObject addIconSetCondition();


  /**
   */

  @DISPID(2620)
  com4j.Com4jObject addTop10();


  /**
   */

  @DISPID(2621)
  com4j.Com4jObject addAboveAverage();


  /**
   */

  @DISPID(2622)
  com4j.Com4jObject addUniqueValues();


  // Properties:
}
