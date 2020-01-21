package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface WorkbookConnection extends Com4jObject {
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
   * Getter method for the COM property "Name"
   * </p>
   */

  @DISPID(110)
  @PropGet
  java.lang.String getName();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(110)
  @PropPut
  void setName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   */

  @DISPID(218)
  @PropGet
  java.lang.String getDescription();


  /**
   * <p>
   * Setter method for the COM property "Description"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(218)
  @PropPut
  void setDescription(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  java.lang.String get_Default();


  /**
   * <p>
   * Setter method for the COM property "_Default"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(0)
  @PropPut
  @DefaultMethod
  void set_Default(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  excel.XlConnectionType getType();


  /**
   * <p>
   * Getter method for the COM property "OLEDBConnection"
   * </p>
   */

  @DISPID(2697)
  @PropGet
  excel.OLEDBConnection getOLEDBConnection();


  /**
   * <p>
   * Getter method for the COM property "ODBCConnection"
   * </p>
   */

  @DISPID(2698)
  @PropGet
  excel.ODBCConnection getODBCConnection();


  /**
   * <p>
   * Getter method for the COM property "Ranges"
   * </p>
   */

  @DISPID(2699)
  @PropGet
  excel.Ranges getRanges();


  /**
   */

  @DISPID(117)
  void delete();


  /**
   */

  @DISPID(1417)
  void refresh();


  // Properties:
}
