package excel  ;

import com4j.*;

@IID("{00024402-0001-0000-C000-000000000046}")
public interface IVPageBreak extends Com4jObject {
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
   * @return  Returns a value of type excel._Worksheet
   */

  @VTID(9)
  excel._Worksheet getParent();


  /**
   */

  @VTID(10)
  void delete();


  /**
   * @param direction Mandatory excel.XlDirection parameter.
   * @param regionIndex Mandatory int parameter.
   */

  @VTID(11)
  void dragOff(
    excel.XlDirection direction,
    int regionIndex);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type excel.XlPageBreak
   */

  @VTID(12)
  excel.XlPageBreak getType();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory excel.XlPageBreak parameter.
   */

  @VTID(13)
  void setType(
    excel.XlPageBreak rhs);


  /**
   * <p>
   * Getter method for the COM property "Extent"
   * </p>
   * @return  Returns a value of type excel.XlPageBreakExtent
   */

  @VTID(14)
  excel.XlPageBreakExtent getExtent();


  /**
   * <p>
   * Getter method for the COM property "Location"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(15)
  excel.Range getLocation();


  /**
   * <p>
   * Setter method for the COM property "Location"
   * </p>
   * @param rhs Mandatory excel.Range parameter.
   */

  @VTID(16)
  void setLocation(
    excel.Range rhs);


  // Properties:
}
