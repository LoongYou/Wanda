package excel  ;

import com4j.*;

@IID("{0002444A-0001-0000-C000-000000000046}")
public interface IPivotLayout extends Com4jObject {
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
   * Getter method for the COM property "ColumnFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getColumnFields(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "DataFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getDataFields(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "PageFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(12)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getPageFields(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "RowFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(13)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getRowFields(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "HiddenFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(14)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getHiddenFields(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "VisibleFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(15)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getVisibleFields(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "PivotFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(16)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getPivotFields(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "CubeFields"
   * </p>
   * @return  Returns a value of type excel.CubeFields
   */

  @VTID(17)
  excel.CubeFields getCubeFields();


  @VTID(17)
  @ReturnValue(defaultPropertyThrough={excel.CubeFields.class})
  excel.CubeField getCubeFields(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "PivotCache"
   * </p>
   * @return  Returns a value of type excel.PivotCache
   */

  @VTID(18)
  excel.PivotCache getPivotCache();


  /**
   * <p>
   * Getter method for the COM property "PivotTable"
   * </p>
   * @return  Returns a value of type excel.PivotTable
   */

  @VTID(19)
  excel.PivotTable getPivotTable();


  /**
   * <p>
   * Getter method for the COM property "InnerDetail"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(20)
  java.lang.String getInnerDetail();


  /**
   * <p>
   * Setter method for the COM property "InnerDetail"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(21)
  void setInnerDetail(
    java.lang.String rhs);


  /**
   * @param rowFields Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnFields Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pageFields Optional parameter. Default value is com4j.Variant.getMissing()
   * @param appendField Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(22)
  void addFields(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowFields,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columnFields,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object pageFields,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object appendField);


  // Properties:
}
