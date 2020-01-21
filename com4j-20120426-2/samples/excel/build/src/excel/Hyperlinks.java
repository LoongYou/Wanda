package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Hyperlinks extends Com4jObject,Iterable<Com4jObject> {
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
   * @param anchor Mandatory com4j.Com4jObject parameter.
   * @param address Mandatory java.lang.String parameter.
   * @param subAddress Optional parameter. Default value is com4j.Variant.getMissing()
   * @param screenTip Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textToDisplay Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(181)
  com4j.Com4jObject add(
    com4j.Com4jObject anchor,
    java.lang.String address,
    @Optional java.lang.Object subAddress,
    @Optional java.lang.Object screenTip,
    @Optional java.lang.Object textToDisplay);


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
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(170)
  @PropGet
  excel.Hyperlink getItem(
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
  excel.Hyperlink get_Default(
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


  // Properties:
}
