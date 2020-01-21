package excel  ;

import com4j.*;

@IID("{000244B6-0001-0000-C000-000000000046}")
public interface ISparklineGroups extends Com4jObject,Iterable<Com4jObject> {
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
   * @param type Mandatory excel.XlSparkType parameter.
   * @param sourceData Mandatory java.lang.String parameter.
   * @return  Returns a value of type excel.SparklineGroup
   */

  @VTID(10)
  excel.SparklineGroup add(
    excel.XlSparkType type,
    java.lang.String sourceData);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(11)
  int getCount();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.SparklineGroup
   */

  @VTID(12)
  excel.SparklineGroup getItem(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(13)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.SparklineGroup
   */

  @VTID(14)
  @DefaultMethod
  excel.SparklineGroup get_Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   */

  @VTID(15)
  void clear();


  /**
   */

  @VTID(16)
  void clearGroups();


  /**
   * @param location Mandatory excel.Range parameter.
   */

  @VTID(17)
  void group(
    excel.Range location);


  /**
   */

  @VTID(18)
  void ungroup();


  // Properties:
}
