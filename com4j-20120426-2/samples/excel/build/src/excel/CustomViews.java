package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface CustomViews extends Com4jObject,Iterable<Com4jObject> {
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
   * @param viewName Mandatory java.lang.Object parameter.
   */

  @DISPID(170)
  excel.CustomView item(
    java.lang.Object viewName);


  /**
   * @param viewName Mandatory java.lang.String parameter.
   * @param printSettings Optional parameter. Default value is com4j.Variant.getMissing()
   * @param rowColSettings Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(181)
  excel.CustomView add(
    java.lang.String viewName,
    @Optional java.lang.Object printSettings,
    @Optional java.lang.Object rowColSettings);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param viewName Mandatory java.lang.Object parameter.
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  excel.CustomView get_Default(
    java.lang.Object viewName);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4)
  @PropGet
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
