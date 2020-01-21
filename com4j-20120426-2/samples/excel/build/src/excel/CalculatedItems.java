package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface CalculatedItems extends Com4jObject,Iterable<Com4jObject> {
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
   * @param name Mandatory java.lang.String parameter.
   * @param formula Mandatory java.lang.String parameter.
   */

  @DISPID(2085)
  excel.PivotItem _Add(
    java.lang.String name,
    java.lang.String formula);


  /**
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(170)
  excel.PivotItem item(
    java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param field Mandatory java.lang.Object parameter.
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  excel.PivotItem get_Default(
    java.lang.Object field);


  /**
   */

  @DISPID(-4)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param name Mandatory java.lang.String parameter.
   * @param formula Mandatory java.lang.String parameter.
   * @param useStandardFormula Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(181)
  excel.PivotItem add(
    java.lang.String name,
    java.lang.String formula,
    @Optional java.lang.Object useStandardFormula);


  // Properties:
}
