package excel  ;

import com4j.*;

@IID("{00024468-0001-0000-C000-000000000046}")
public interface IPivotItemList extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(10)
  int getCount();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.PivotItem
   */

  @VTID(11)
  excel.PivotItem item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param field Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.PivotItem
   */

  @VTID(12)
  @DefaultMethod
  excel.PivotItem get_Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object field);


  /**
   */

  @VTID(13)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
