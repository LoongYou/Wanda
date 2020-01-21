package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Names extends Com4jObject,Iterable<Com4jObject> {
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
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param refersTo Optional parameter. Default value is com4j.Variant.getMissing()
   * @param visible Optional parameter. Default value is com4j.Variant.getMissing()
   * @param macroType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param shortcutKey Optional parameter. Default value is com4j.Variant.getMissing()
   * @param category Optional parameter. Default value is com4j.Variant.getMissing()
   * @param nameLocal Optional parameter. Default value is com4j.Variant.getMissing()
   * @param refersToLocal Optional parameter. Default value is com4j.Variant.getMissing()
   * @param categoryLocal Optional parameter. Default value is com4j.Variant.getMissing()
   * @param refersToR1C1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param refersToR1C1Local Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(181)
  excel.Name add(
    @Optional java.lang.Object name,
    @Optional java.lang.Object refersTo,
    @Optional java.lang.Object visible,
    @Optional java.lang.Object macroType,
    @Optional java.lang.Object shortcutKey,
    @Optional java.lang.Object category,
    @Optional java.lang.Object nameLocal,
    @Optional java.lang.Object refersToLocal,
    @Optional java.lang.Object categoryLocal,
    @Optional java.lang.Object refersToR1C1,
    @Optional java.lang.Object refersToR1C1Local);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param indexLocal Optional parameter. Default value is com4j.Variant.getMissing()
   * @param refersTo Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(170)
  excel.Name item(
    @Optional java.lang.Object index,
    @Optional java.lang.Object indexLocal,
    @Optional java.lang.Object refersTo);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param indexLocal Optional parameter. Default value is com4j.Variant.getMissing()
   * @param refersTo Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(0)
  @DefaultMethod
  excel.Name _Default(
    @Optional java.lang.Object index,
    @Optional java.lang.Object indexLocal,
    @Optional java.lang.Object refersTo);


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
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4)
  @PropGet
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
