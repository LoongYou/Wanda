package excel  ;

import com4j.*;

@IID("{0002446B-0001-0000-C000-000000000046}")
public interface IAllowEditRange extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(7)
  java.lang.String getTitle();


  /**
   * <p>
   * Setter method for the COM property "Title"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(8)
  void setTitle(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(9)
  excel.Range getRange();


  /**
   * <p>
   * Setter method for the COM property "Range"
   * </p>
   * @param rhs Mandatory excel.Range parameter.
   */

  @VTID(10)
  void setRange(
    excel.Range rhs);


  /**
   * @param password Mandatory java.lang.String parameter.
   */

  @VTID(11)
  void changePassword(
    java.lang.String password);


  /**
   */

  @VTID(12)
  void delete();


  /**
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(13)
  void unprotect(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password);


  /**
   * <p>
   * Getter method for the COM property "Users"
   * </p>
   * @return  Returns a value of type excel.UserAccessList
   */

  @VTID(14)
  excel.UserAccessList getUsers();


  // Properties:
}
