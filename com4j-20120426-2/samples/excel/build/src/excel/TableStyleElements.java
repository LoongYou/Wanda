package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface TableStyleElements extends Com4jObject,Iterable<Com4jObject> {
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
   * @param index Mandatory excel.XlTableStyleElementType parameter.
   */

  @DISPID(170)
  excel.TableStyleElement item(
    excel.XlTableStyleElementType index);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory excel.XlTableStyleElementType parameter.
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  excel.TableStyleElement get_Default(
    excel.XlTableStyleElementType index);


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
