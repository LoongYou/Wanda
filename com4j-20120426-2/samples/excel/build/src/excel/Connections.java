package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Connections extends Com4jObject,Iterable<Com4jObject> {
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
   * @param filename Mandatory java.lang.String parameter.
   */

  @DISPID(2700)
  excel.WorkbookConnection addFromFile(
    java.lang.String filename);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param description Mandatory java.lang.String parameter.
   * @param connectionString Mandatory java.lang.Object parameter.
   * @param commandText Mandatory java.lang.Object parameter.
   * @param lCmdtype Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(181)
  excel.WorkbookConnection add(
    java.lang.String name,
    java.lang.String description,
    java.lang.Object connectionString,
    java.lang.Object commandText,
    @Optional java.lang.Object lCmdtype);


  /**
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(170)
  excel.WorkbookConnection item(
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
  excel.WorkbookConnection get_Default(
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
