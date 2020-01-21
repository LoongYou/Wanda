package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Validation extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   */

  @DISPID(148)
  @PropGet
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   */

  @DISPID(149)
  @PropGet
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   */

  @DISPID(150)
  @PropGet
  com4j.Com4jObject getParent();


  /**
   * @param type Mandatory excel.XlDVType parameter.
   * @param alertStyle Optional parameter. Default value is com4j.Variant.getMissing()
   * @param operator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param formula1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param formula2 Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(181)
  void add(
    excel.XlDVType type,
    @Optional java.lang.Object alertStyle,
    @Optional java.lang.Object operator,
    @Optional java.lang.Object formula1,
    @Optional java.lang.Object formula2);


  /**
   * <p>
   * Getter method for the COM property "AlertStyle"
   * </p>
   */

  @DISPID(1605)
  @PropGet
  int getAlertStyle();


  /**
   * <p>
   * Getter method for the COM property "IgnoreBlank"
   * </p>
   */

  @DISPID(1606)
  @PropGet
  boolean getIgnoreBlank();


  /**
   * <p>
   * Setter method for the COM property "IgnoreBlank"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1606)
  @PropPut
  void setIgnoreBlank(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "IMEMode"
   * </p>
   */

  @DISPID(1607)
  @PropGet
  int getIMEMode();


  /**
   * <p>
   * Setter method for the COM property "IMEMode"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1607)
  @PropPut
  void setIMEMode(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "InCellDropdown"
   * </p>
   */

  @DISPID(1608)
  @PropGet
  boolean getInCellDropdown();


  /**
   * <p>
   * Setter method for the COM property "InCellDropdown"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1608)
  @PropPut
  void setInCellDropdown(
    boolean rhs);


  /**
   */

  @DISPID(117)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "ErrorMessage"
   * </p>
   */

  @DISPID(1609)
  @PropGet
  java.lang.String getErrorMessage();


  /**
   * <p>
   * Setter method for the COM property "ErrorMessage"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1609)
  @PropPut
  void setErrorMessage(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ErrorTitle"
   * </p>
   */

  @DISPID(1610)
  @PropGet
  java.lang.String getErrorTitle();


  /**
   * <p>
   * Setter method for the COM property "ErrorTitle"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1610)
  @PropPut
  void setErrorTitle(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "InputMessage"
   * </p>
   */

  @DISPID(1611)
  @PropGet
  java.lang.String getInputMessage();


  /**
   * <p>
   * Setter method for the COM property "InputMessage"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1611)
  @PropPut
  void setInputMessage(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "InputTitle"
   * </p>
   */

  @DISPID(1612)
  @PropGet
  java.lang.String getInputTitle();


  /**
   * <p>
   * Setter method for the COM property "InputTitle"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1612)
  @PropPut
  void setInputTitle(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Formula1"
   * </p>
   */

  @DISPID(1579)
  @PropGet
  java.lang.String getFormula1();


  /**
   * <p>
   * Getter method for the COM property "Formula2"
   * </p>
   */

  @DISPID(1580)
  @PropGet
  java.lang.String getFormula2();


  /**
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param alertStyle Optional parameter. Default value is com4j.Variant.getMissing()
   * @param operator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param formula1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param formula2 Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1581)
  void modify(
    @Optional java.lang.Object type,
    @Optional java.lang.Object alertStyle,
    @Optional java.lang.Object operator,
    @Optional java.lang.Object formula1,
    @Optional java.lang.Object formula2);


  /**
   * <p>
   * Getter method for the COM property "Operator"
   * </p>
   */

  @DISPID(797)
  @PropGet
  int getOperator();


  /**
   * <p>
   * Getter method for the COM property "ShowError"
   * </p>
   */

  @DISPID(1613)
  @PropGet
  boolean getShowError();


  /**
   * <p>
   * Setter method for the COM property "ShowError"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1613)
  @PropPut
  void setShowError(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowInput"
   * </p>
   */

  @DISPID(1614)
  @PropGet
  boolean getShowInput();


  /**
   * <p>
   * Setter method for the COM property "ShowInput"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1614)
  @PropPut
  void setShowInput(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  int getType();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   */

  @DISPID(6)
  @PropGet
  boolean getValue();


  // Properties:
}
