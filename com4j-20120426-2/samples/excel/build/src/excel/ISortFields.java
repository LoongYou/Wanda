package excel  ;

import com4j.*;

@IID("{000244AA-0001-0000-C000-000000000046}")
public interface ISortFields extends Com4jObject,Iterable<Com4jObject> {
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
   * @param key Mandatory excel.Range parameter.
   * @param sortOn Optional parameter. Default value is com4j.Variant.getMissing()
   * @param order Optional parameter. Default value is com4j.Variant.getMissing()
   * @param customOrder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param dataOption Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.SortField
   */

  @VTID(10)
  excel.SortField add(
    excel.Range key,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object sortOn,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object order,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object customOrder,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object dataOption);


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.SortField
   */

  @VTID(11)
  excel.SortField getItem(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(12)
  int getCount();


  /**
   */

  @VTID(13)
  void clear();


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.SortField
   */

  @VTID(14)
  @DefaultMethod
  excel.SortField get_Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(15)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
