package excel  ;

import com4j.*;

@IID("{00024443-0001-0000-C000-000000000046}")
public interface IPublishObjects extends Com4jObject,Iterable<Com4jObject> {
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
   * @param sourceType Mandatory excel.XlSourceType parameter.
   * @param filename Mandatory java.lang.String parameter.
   * @param sheet Optional parameter. Default value is com4j.Variant.getMissing()
   * @param source Optional parameter. Default value is com4j.Variant.getMissing()
   * @param htmlType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param divID Optional parameter. Default value is com4j.Variant.getMissing()
   * @param title Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.PublishObject
   */

  @VTID(10)
  excel.PublishObject add(
    excel.XlSourceType sourceType,
    java.lang.String filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object sheet,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object source,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object htmlType,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object divID,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object title);


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
   * @return  Returns a value of type excel.PublishObject
   */

  @VTID(12)
  excel.PublishObject getItem(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.PublishObject
   */

  @VTID(13)
  @DefaultMethod
  excel.PublishObject get_Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(14)
  java.util.Iterator<Com4jObject> iterator();

  /**
   */

  @VTID(15)
  void delete();


  /**
   */

  @VTID(16)
  void publish();


  // Properties:
}
