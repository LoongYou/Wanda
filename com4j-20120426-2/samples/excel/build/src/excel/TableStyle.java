package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface TableStyle extends Com4jObject {
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
   * Getter method for the COM property "_Default"
   * </p>
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  java.lang.String get_Default();


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
   * Getter method for the COM property "NameLocal"
   * </p>
   */

  @DISPID(937)
  @PropGet
  java.lang.String getNameLocal();


  /**
   * <p>
   * Getter method for the COM property "BuiltIn"
   * </p>
   */

  @DISPID(553)
  @PropGet
  boolean getBuiltIn();


  /**
   * <p>
   * Getter method for the COM property "TableStyleElements"
   * </p>
   */

  @DISPID(2737)
  @PropGet
  excel.TableStyleElements getTableStyleElements();


  /**
   * <p>
   * Getter method for the COM property "ShowAsAvailableTableStyle"
   * </p>
   */

  @DISPID(2738)
  @PropGet
  boolean getShowAsAvailableTableStyle();


  /**
   * <p>
   * Setter method for the COM property "ShowAsAvailableTableStyle"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2738)
  @PropPut
  void setShowAsAvailableTableStyle(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowAsAvailablePivotTableStyle"
   * </p>
   */

  @DISPID(2739)
  @PropGet
  boolean getShowAsAvailablePivotTableStyle();


  /**
   * <p>
   * Setter method for the COM property "ShowAsAvailablePivotTableStyle"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2739)
  @PropPut
  void setShowAsAvailablePivotTableStyle(
    boolean rhs);


  /**
   */

  @DISPID(117)
  void delete();


  /**
   * @param newTableStyleName Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1039)
  excel.TableStyle duplicate(
    @Optional java.lang.Object newTableStyleName);


  /**
   * <p>
   * Getter method for the COM property "ShowAsAvailableSlicerStyle"
   * </p>
   */

  @DISPID(2946)
  @PropGet
  boolean getShowAsAvailableSlicerStyle();


  /**
   * <p>
   * Setter method for the COM property "ShowAsAvailableSlicerStyle"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2946)
  @PropPut
  void setShowAsAvailableSlicerStyle(
    boolean rhs);


  // Properties:
}
