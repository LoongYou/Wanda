package excel  ;

import com4j.*;

@IID("{00024470-0001-0000-C000-000000000046}")
public interface IListObjects extends Com4jObject,Iterable<Com4jObject> {
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
   * @param sourceType Optional parameter. Default value is 1
   * @param source Optional parameter. Default value is com4j.Variant.getMissing()
   * @param linkSource Optional parameter. Default value is com4j.Variant.getMissing()
   * @param xlListObjectHasHeaders Optional parameter. Default value is 0
   * @param destination Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.ListObject
   */

  @VTID(10)
  excel.ListObject _Add(
    @Optional @DefaultValue("1") excel.XlListObjectSourceType sourceType,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object source,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object linkSource,
    @Optional @DefaultValue("0") excel.XlYesNoGuess xlListObjectHasHeaders,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object destination);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.ListObject
   */

  @VTID(11)
  @DefaultMethod
  excel.ListObject get_Default(
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
   * @return  Returns a value of type excel.ListObject
   */

  @VTID(13)
  excel.ListObject getItem(
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
   * @param sourceType Optional parameter. Default value is 1
   * @param source Optional parameter. Default value is com4j.Variant.getMissing()
   * @param linkSource Optional parameter. Default value is com4j.Variant.getMissing()
   * @param xlListObjectHasHeaders Optional parameter. Default value is 0
   * @param destination Optional parameter. Default value is com4j.Variant.getMissing()
   * @param tableStyleName Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.ListObject
   */

  @VTID(15)
  excel.ListObject add(
    @Optional @DefaultValue("1") excel.XlListObjectSourceType sourceType,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object source,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object linkSource,
    @Optional @DefaultValue("0") excel.XlYesNoGuess xlListObjectHasHeaders,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object destination,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object tableStyleName);


  // Properties:
}
