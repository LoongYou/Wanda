package excel  ;

import com4j.*;

@IID("{000208AB-0001-0000-C000-000000000046}")
public interface IOutline extends Com4jObject {
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
   * Getter method for the COM property "AutomaticStyles"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(10)
  boolean getAutomaticStyles();


  /**
   * <p>
   * Setter method for the COM property "AutomaticStyles"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(11)
  void setAutomaticStyles(
    boolean rhs);


  /**
   * @param rowLevels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnLevels Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object showLevels(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowLevels,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columnLevels);


  /**
   * <p>
   * Getter method for the COM property "SummaryColumn"
   * </p>
   * @return  Returns a value of type excel.XlSummaryColumn
   */

  @VTID(13)
  excel.XlSummaryColumn getSummaryColumn();


  /**
   * <p>
   * Setter method for the COM property "SummaryColumn"
   * </p>
   * @param rhs Mandatory excel.XlSummaryColumn parameter.
   */

  @VTID(14)
  void setSummaryColumn(
    excel.XlSummaryColumn rhs);


  /**
   * <p>
   * Getter method for the COM property "SummaryRow"
   * </p>
   * @return  Returns a value of type excel.XlSummaryRow
   */

  @VTID(15)
  excel.XlSummaryRow getSummaryRow();


  /**
   * <p>
   * Setter method for the COM property "SummaryRow"
   * </p>
   * @param rhs Mandatory excel.XlSummaryRow parameter.
   */

  @VTID(16)
  void setSummaryRow(
    excel.XlSummaryRow rhs);


  // Properties:
}
