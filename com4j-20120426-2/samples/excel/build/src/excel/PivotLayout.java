package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface PivotLayout extends Com4jObject {
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
   * Getter method for the COM property "ColumnFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(713)
  @PropGet
  com4j.Com4jObject getColumnFields(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "DataFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(715)
  @PropGet
  com4j.Com4jObject getDataFields(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "PageFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(714)
  @PropGet
  com4j.Com4jObject getPageFields(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "RowFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(712)
  @PropGet
  com4j.Com4jObject getRowFields(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "HiddenFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(711)
  @PropGet
  com4j.Com4jObject getHiddenFields(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "VisibleFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(710)
  @PropGet
  com4j.Com4jObject getVisibleFields(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "PivotFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(718)
  @PropGet
  com4j.Com4jObject getPivotFields(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "CubeFields"
   * </p>
   */

  @DISPID(1839)
  @PropGet
  excel.CubeFields getCubeFields();


  /**
   * <p>
   * Getter method for the COM property "PivotCache"
   * </p>
   */

  @DISPID(1496)
  @PropGet
  excel.PivotCache getPivotCache();


  /**
   * <p>
   * Getter method for the COM property "PivotTable"
   * </p>
   */

  @DISPID(716)
  @PropGet
  excel.PivotTable getPivotTable();


  /**
   * <p>
   * Getter method for the COM property "InnerDetail"
   * </p>
   */

  @DISPID(698)
  @PropGet
  java.lang.String getInnerDetail();


  /**
   * <p>
   * Setter method for the COM property "InnerDetail"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(698)
  @PropPut
  void setInnerDetail(
    java.lang.String rhs);


  /**
   * @param rowFields Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnFields Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pageFields Optional parameter. Default value is com4j.Variant.getMissing()
   * @param appendField Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(708)
  void addFields(
    @Optional java.lang.Object rowFields,
    @Optional java.lang.Object columnFields,
    @Optional java.lang.Object pageFields,
    @Optional java.lang.Object appendField);


  // Properties:
}
