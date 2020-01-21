package excel  ;

import com4j.*;

@IID("{000244B9-0001-0000-C000-000000000046}")
public interface ISparkline extends Com4jObject {
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
   * Getter method for the COM property "Location"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(10)
  excel.Range getLocation();


  /**
   * <p>
   * Setter method for the COM property "Location"
   * </p>
   * @param rhs Mandatory excel.Range parameter.
   */

  @VTID(11)
  void setLocation(
    excel.Range rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceData"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(12)
  java.lang.String getSourceData();


  /**
   * <p>
   * Setter method for the COM property "SourceData"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(13)
  void setSourceData(
    java.lang.String rhs);


  /**
   * @param range Mandatory excel.Range parameter.
   */

  @VTID(14)
  void modifyLocation(
    excel.Range range);


  /**
   * @param formula Mandatory java.lang.String parameter.
   */

  @VTID(15)
  void modifySourceData(
    java.lang.String formula);


  // Properties:
}
