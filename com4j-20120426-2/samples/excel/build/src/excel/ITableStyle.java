package excel  ;

import com4j.*;

@IID("{000244A7-0001-0000-C000-000000000046}")
public interface ITableStyle extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type excel._Application
   */

  @VTID(7)
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type excel.XlCreator
   */

  @VTID(8)
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getParent();


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(10)
  @DefaultMethod
  java.lang.String get_Default();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(11)
  java.lang.String getName();


  /**
   * <p>
   * Getter method for the COM property "NameLocal"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(12)
  java.lang.String getNameLocal();


  /**
   * <p>
   * Getter method for the COM property "BuiltIn"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(13)
  boolean getBuiltIn();


  /**
   * <p>
   * Getter method for the COM property "TableStyleElements"
   * </p>
   * @return  Returns a value of type excel.TableStyleElements
   */

  @VTID(14)
  excel.TableStyleElements getTableStyleElements();


  /**
   * <p>
   * Getter method for the COM property "ShowAsAvailableTableStyle"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(15)
  boolean getShowAsAvailableTableStyle();


  /**
   * <p>
   * Setter method for the COM property "ShowAsAvailableTableStyle"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(16)
  void setShowAsAvailableTableStyle(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowAsAvailablePivotTableStyle"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(17)
  boolean getShowAsAvailablePivotTableStyle();


  /**
   * <p>
   * Setter method for the COM property "ShowAsAvailablePivotTableStyle"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(18)
  void setShowAsAvailablePivotTableStyle(
    boolean rhs);


  /**
   */

  @VTID(19)
  void delete();


  /**
   * @param newTableStyleName Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.TableStyle
   */

  @VTID(20)
  excel.TableStyle duplicate(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object newTableStyleName);


  /**
   * <p>
   * Getter method for the COM property "ShowAsAvailableSlicerStyle"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(21)
  boolean getShowAsAvailableSlicerStyle();


  /**
   * <p>
   * Setter method for the COM property "ShowAsAvailableSlicerStyle"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(22)
  void setShowAsAvailableSlicerStyle(
    boolean rhs);


  // Properties:
}
