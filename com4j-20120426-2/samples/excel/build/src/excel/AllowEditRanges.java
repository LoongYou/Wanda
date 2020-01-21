package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface AllowEditRanges extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
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
  excel.AllowEditRange getItem(
    java.lang.Object index);


  /**
   * @param title Mandatory java.lang.String parameter.
   * @param range Mandatory excel.Range parameter.
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(181)
  excel.AllowEditRange add(
    java.lang.String title,
    excel.Range range,
    @Optional java.lang.Object password);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  excel.AllowEditRange get_Default(
    java.lang.Object index);


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
