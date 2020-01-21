package excel  ;

import com4j.*;

@IID("{00024474-0001-0000-C000-000000000046}")
public interface IListRows extends Com4jObject,Iterable<Com4jObject> {
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
   * @param position Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.ListRow
   */

  @VTID(10)
  excel.ListRow _Add(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object position);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.ListRow
   */

  @VTID(11)
  @DefaultMethod
  excel.ListRow get_Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(12)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.ListRow
   */

  @VTID(13)
  excel.ListRow getItem(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(14)
  int getCount();


  /**
   * @param position Optional parameter. Default value is com4j.Variant.getMissing()
   * @param alwaysInsert Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.ListRow
   */

  @VTID(15)
  excel.ListRow add(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object position,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object alwaysInsert);


  // Properties:
}
