package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface SortField extends Com4jObject {
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
   * <p>
   * Getter method for the COM property "SortOn"
   * </p>
   */

  @DISPID(2741)
  @PropGet
  excel.XlSortOn getSortOn();


  /**
   * <p>
   * Setter method for the COM property "SortOn"
   * </p>
   * @param rhs Mandatory excel.XlSortOn parameter.
   */

  @DISPID(2741)
  @PropPut
  void setSortOn(
    excel.XlSortOn rhs);


  /**
   * <p>
   * Getter method for the COM property "SortOnValue"
   * </p>
   */

  @DISPID(2742)
  @PropGet
  com4j.Com4jObject getSortOnValue();


  /**
   * <p>
   * Getter method for the COM property "Key"
   * </p>
   */

  @DISPID(155)
  @PropGet
  excel.Range getKey();


  /**
   * <p>
   * Getter method for the COM property "Order"
   * </p>
   */

  @DISPID(192)
  @PropGet
  excel.XlSortOrder getOrder();


  /**
   * <p>
   * Setter method for the COM property "Order"
   * </p>
   * @param rhs Mandatory excel.XlSortOrder parameter.
   */

  @DISPID(192)
  @PropPut
  void setOrder(
    excel.XlSortOrder rhs);


  /**
   * <p>
   * Getter method for the COM property "CustomOrder"
   * </p>
   */

  @DISPID(2743)
  @PropGet
  java.lang.Object getCustomOrder();


  /**
   * <p>
   * Setter method for the COM property "CustomOrder"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2743)
  @PropPut
  void setCustomOrder(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "DataOption"
   * </p>
   */

  @DISPID(2744)
  @PropGet
  excel.XlSortDataOption getDataOption();


  /**
   * <p>
   * Setter method for the COM property "DataOption"
   * </p>
   * @param rhs Mandatory excel.XlSortDataOption parameter.
   */

  @DISPID(2744)
  @PropPut
  void setDataOption(
    excel.XlSortDataOption rhs);


  /**
   * <p>
   * Getter method for the COM property "Priority"
   * </p>
   */

  @DISPID(985)
  @PropGet
  int getPriority();


  /**
   * <p>
   * Setter method for the COM property "Priority"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(985)
  @PropPut
  void setPriority(
    int rhs);


  /**
   */

  @DISPID(117)
  void delete();


  /**
   * @param key Mandatory excel.Range parameter.
   */

  @DISPID(2745)
  void modifyKey(
    excel.Range key);


  /**
   * @param icon Mandatory excel.Icon parameter.
   */

  @DISPID(2746)
  void setIcon(
    excel.Icon icon);


  // Properties:
}
