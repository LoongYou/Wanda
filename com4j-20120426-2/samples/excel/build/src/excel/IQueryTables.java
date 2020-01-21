package excel  ;

import com4j.*;

@IID("{00024429-0001-0000-C000-000000000046}")
public interface IQueryTables extends Com4jObject,Iterable<Com4jObject> {
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
   * @param connection Mandatory java.lang.Object parameter.
   * @param destination Mandatory excel.Range parameter.
   * @param sql Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel._QueryTable
   */

  @VTID(11)
  excel._QueryTable add(
    @MarshalAs(NativeType.VARIANT) java.lang.Object connection,
    excel.Range destination,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object sql);


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel._QueryTable
   */

  @VTID(12)
  excel._QueryTable item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel._QueryTable
   */

  @VTID(13)
  @DefaultMethod
  excel._QueryTable get_Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   */

  @VTID(14)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
