package excel  ;

import com4j.*;

@IID("{00024485-0001-0000-C000-000000000046}")
public interface IWorkbookConnection extends Com4jObject {
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
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(10)
  java.lang.String getName();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(11)
  void setName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(12)
  java.lang.String getDescription();


  /**
   * <p>
   * Setter method for the COM property "Description"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(13)
  void setDescription(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(14)
  @DefaultMethod
  java.lang.String get_Default();


  /**
   * <p>
   * Setter method for the COM property "_Default"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(15)
  @DefaultMethod
  void set_Default(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type excel.XlConnectionType
   */

  @VTID(16)
  excel.XlConnectionType getType();


  /**
   * <p>
   * Getter method for the COM property "OLEDBConnection"
   * </p>
   * @return  Returns a value of type excel.OLEDBConnection
   */

  @VTID(17)
  excel.OLEDBConnection getOLEDBConnection();


  /**
   * <p>
   * Getter method for the COM property "ODBCConnection"
   * </p>
   * @return  Returns a value of type excel.ODBCConnection
   */

  @VTID(18)
  excel.ODBCConnection getODBCConnection();


  /**
   * <p>
   * Getter method for the COM property "Ranges"
   * </p>
   * @return  Returns a value of type excel.Ranges
   */

  @VTID(19)
  excel.Ranges getRanges();


  /**
   */

  @VTID(20)
  void delete();


  /**
   */

  @VTID(21)
  void refresh();


  // Properties:
}
