package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ToolbarButtons extends Com4jObject,Iterable<Com4jObject> {
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
   * @param button Optional parameter. Default value is com4j.Variant.getMissing()
   * @param before Optional parameter. Default value is com4j.Variant.getMissing()
   * @param onAction Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pushed Optional parameter. Default value is com4j.Variant.getMissing()
   * @param enabled Optional parameter. Default value is com4j.Variant.getMissing()
   * @param statusBar Optional parameter. Default value is com4j.Variant.getMissing()
   * @param helpFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param helpContextID Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(181)
  excel.ToolbarButton add(
    @Optional java.lang.Object button,
    @Optional java.lang.Object before,
    @Optional java.lang.Object onAction,
    @Optional java.lang.Object pushed,
    @Optional java.lang.Object enabled,
    @Optional java.lang.Object statusBar,
    @Optional java.lang.Object helpFile,
    @Optional java.lang.Object helpContextID);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   */

  @DISPID(118)
  @PropGet
  int getCount();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory int parameter.
   */

  @DISPID(170)
  @PropGet
  excel.ToolbarButton getItem(
    int index);


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
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory int parameter.
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  excel.ToolbarButton get_Default(
    int index);


  // Properties:
}
