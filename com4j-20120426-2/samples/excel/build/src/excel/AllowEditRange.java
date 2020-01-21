package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface AllowEditRange extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   */

  @DISPID(199)
  @PropGet
  java.lang.String getTitle();


  /**
   * <p>
   * Setter method for the COM property "Title"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(199)
  @PropPut
  void setTitle(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   */

  @DISPID(197)
  @PropGet
  excel.Range getRange();


  /**
   * <p>
   * Setter method for the COM property "Range"
   * </p>
   * @param rhs Mandatory excel.Range parameter.
   */

  @DISPID(197)
  @PropPut
  void setRange(
    excel.Range rhs);


  /**
   * @param password Mandatory java.lang.String parameter.
   */

  @DISPID(2237)
  void changePassword(
    java.lang.String password);


  /**
   */

  @DISPID(117)
  void delete();


  /**
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(285)
  void unprotect(
    @Optional java.lang.Object password);


  /**
   * <p>
   * Getter method for the COM property "Users"
   * </p>
   */

  @DISPID(2238)
  @PropGet
  excel.UserAccessList getUsers();


  // Properties:
}
