package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ListObjects extends Com4jObject,Iterable<Com4jObject> {
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
   * @param sourceType Optional parameter. Default value is 1
   * @param source Optional parameter. Default value is com4j.Variant.getMissing()
   * @param linkSource Optional parameter. Default value is com4j.Variant.getMissing()
   * @param xlListObjectHasHeaders Optional parameter. Default value is 0
   * @param destination Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2085)
  excel.ListObject _Add(
    @Optional @DefaultValue("1") excel.XlListObjectSourceType sourceType,
    @Optional java.lang.Object source,
    @Optional java.lang.Object linkSource,
    @Optional @DefaultValue("0") excel.XlYesNoGuess xlListObjectHasHeaders,
    @Optional java.lang.Object destination);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  excel.ListObject get_Default(
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
  excel.ListObject getItem(
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
   * @param sourceType Optional parameter. Default value is 1
   * @param source Optional parameter. Default value is com4j.Variant.getMissing()
   * @param linkSource Optional parameter. Default value is com4j.Variant.getMissing()
   * @param xlListObjectHasHeaders Optional parameter. Default value is 0
   * @param destination Optional parameter. Default value is com4j.Variant.getMissing()
   * @param tableStyleName Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(181)
  excel.ListObject add(
    @Optional @DefaultValue("1") excel.XlListObjectSourceType sourceType,
    @Optional java.lang.Object source,
    @Optional java.lang.Object linkSource,
    @Optional @DefaultValue("0") excel.XlYesNoGuess xlListObjectHasHeaders,
    @Optional java.lang.Object destination,
    @Optional java.lang.Object tableStyleName);


  // Properties:
}
