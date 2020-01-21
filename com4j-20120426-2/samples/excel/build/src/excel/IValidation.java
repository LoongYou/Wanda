package excel  ;

import com4j.*;

@IID("{0002442F-0001-0000-C000-000000000046}")
public interface IValidation extends Com4jObject {
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
   * @param type Mandatory excel.XlDVType parameter.
   * @param alertStyle Optional parameter. Default value is com4j.Variant.getMissing()
   * @param operator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param formula1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param formula2 Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(10)
  void add(
    excel.XlDVType type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object alertStyle,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object operator,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object formula1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object formula2);


  /**
   * <p>
   * Getter method for the COM property "AlertStyle"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(11)
  int getAlertStyle();


  /**
   * <p>
   * Getter method for the COM property "IgnoreBlank"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(12)
  boolean getIgnoreBlank();


  /**
   * <p>
   * Setter method for the COM property "IgnoreBlank"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(13)
  void setIgnoreBlank(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "IMEMode"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(14)
  int getIMEMode();


  /**
   * <p>
   * Setter method for the COM property "IMEMode"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(15)
  void setIMEMode(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "InCellDropdown"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(16)
  boolean getInCellDropdown();


  /**
   * <p>
   * Setter method for the COM property "InCellDropdown"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(17)
  void setInCellDropdown(
    boolean rhs);


  /**
   */

  @VTID(18)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "ErrorMessage"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(19)
  java.lang.String getErrorMessage();


  /**
   * <p>
   * Setter method for the COM property "ErrorMessage"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(20)
  void setErrorMessage(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ErrorTitle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(21)
  java.lang.String getErrorTitle();


  /**
   * <p>
   * Setter method for the COM property "ErrorTitle"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(22)
  void setErrorTitle(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "InputMessage"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(23)
  java.lang.String getInputMessage();


  /**
   * <p>
   * Setter method for the COM property "InputMessage"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(24)
  void setInputMessage(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "InputTitle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(25)
  java.lang.String getInputTitle();


  /**
   * <p>
   * Setter method for the COM property "InputTitle"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(26)
  void setInputTitle(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Formula1"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(27)
  java.lang.String getFormula1();


  /**
   * <p>
   * Getter method for the COM property "Formula2"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(28)
  java.lang.String getFormula2();


  /**
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param alertStyle Optional parameter. Default value is com4j.Variant.getMissing()
   * @param operator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param formula1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param formula2 Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(29)
  void modify(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object alertStyle,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object operator,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object formula1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object formula2);


  /**
   * <p>
   * Getter method for the COM property "Operator"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(30)
  int getOperator();


  /**
   * <p>
   * Getter method for the COM property "ShowError"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(31)
  boolean getShowError();


  /**
   * <p>
   * Setter method for the COM property "ShowError"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(32)
  void setShowError(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowInput"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(33)
  boolean getShowInput();


  /**
   * <p>
   * Setter method for the COM property "ShowInput"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(34)
  void setShowInput(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(35)
  int getType();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(36)
  boolean getValue();


  // Properties:
}
