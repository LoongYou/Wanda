package excel  ;

import com4j.*;

@IID("{000244AB-0001-0000-C000-000000000046}")
public interface ISort extends Com4jObject {
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
   * Getter method for the COM property "Rng"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(10)
  excel.Range getRng();


  /**
   * <p>
   * Getter method for the COM property "Header"
   * </p>
   * @return  Returns a value of type excel.XlYesNoGuess
   */

  @VTID(11)
  excel.XlYesNoGuess getHeader();


  /**
   * <p>
   * Setter method for the COM property "Header"
   * </p>
   * @param rhs Mandatory excel.XlYesNoGuess parameter.
   */

  @VTID(12)
  void setHeader(
    excel.XlYesNoGuess rhs);


  /**
   * <p>
   * Getter method for the COM property "MatchCase"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(13)
  boolean getMatchCase();


  /**
   * <p>
   * Setter method for the COM property "MatchCase"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(14)
  void setMatchCase(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type excel.XlSortOrientation
   */

  @VTID(15)
  excel.XlSortOrientation getOrientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param rhs Mandatory excel.XlSortOrientation parameter.
   */

  @VTID(16)
  void setOrientation(
    excel.XlSortOrientation rhs);


  /**
   * <p>
   * Getter method for the COM property "SortMethod"
   * </p>
   * @return  Returns a value of type excel.XlSortMethod
   */

  @VTID(17)
  excel.XlSortMethod getSortMethod();


  /**
   * <p>
   * Setter method for the COM property "SortMethod"
   * </p>
   * @param rhs Mandatory excel.XlSortMethod parameter.
   */

  @VTID(18)
  void setSortMethod(
    excel.XlSortMethod rhs);


  /**
   * <p>
   * Getter method for the COM property "SortFields"
   * </p>
   * @return  Returns a value of type excel.SortFields
   */

  @VTID(19)
  excel.SortFields getSortFields();


  /**
   * @param rng Mandatory excel.Range parameter.
   */

  @VTID(20)
  void setRange(
    excel.Range rng);


  /**
   */

  @VTID(21)
  void apply();


  // Properties:
}
