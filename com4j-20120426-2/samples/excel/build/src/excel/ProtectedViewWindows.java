package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ProtectedViewWindows extends Com4jObject,Iterable<Com4jObject> {
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
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(170)
  @PropGet
  excel.ProtectedViewWindow getItem(
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
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  excel.ProtectedViewWindow get_Default(
    java.lang.Object index);


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToMru Optional parameter. Default value is com4j.Variant.getMissing()
   * @param repairMode Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1923)
  excel.ProtectedViewWindow open(
    java.lang.String filename,
    @Optional java.lang.Object password,
    @Optional java.lang.Object addToMru,
    @Optional java.lang.Object repairMode);


  // Properties:
}
