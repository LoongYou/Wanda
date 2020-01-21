package excel  ;

import com4j.*;

@IID("{00024442-0001-0000-C000-000000000046}")
public interface ILinkFormat extends Com4jObject {
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
   * Getter method for the COM property "AutoUpdate"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(10)
  boolean getAutoUpdate();


  /**
   * <p>
   * Setter method for the COM property "AutoUpdate"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(11)
  void setAutoUpdate(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(12)
  boolean getLocked();


  /**
   * <p>
   * Setter method for the COM property "Locked"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(13)
  void setLocked(
    boolean rhs);


  /**
   */

  @VTID(14)
  void update();


  // Properties:
}
