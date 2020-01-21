package excel  ;

import com4j.*;

@IID("{00024484-0001-0000-C000-000000000046}")
public interface IPivotFilters extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.PivotFilter
   */

  @VTID(10)
  @DefaultMethod
  excel.PivotFilter get_Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(11)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.PivotFilter
   */

  @VTID(12)
  excel.PivotFilter getItem(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(13)
  int getCount();


  /**
   * @param type Mandatory excel.XlPivotFilterType parameter.
   * @param dataField Optional parameter. Default value is com4j.Variant.getMissing()
   * @param value1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param value2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param order Optional parameter. Default value is com4j.Variant.getMissing()
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param description Optional parameter. Default value is com4j.Variant.getMissing()
   * @param memberPropertyField Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.PivotFilter
   */

  @VTID(14)
  excel.PivotFilter add(
    excel.XlPivotFilterType type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object dataField,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object value1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object value2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object order,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object description,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object memberPropertyField);


  // Properties:
}
