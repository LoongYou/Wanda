package excel  ;

import com4j.*;

@IID("{0002441D-0001-0000-C000-000000000046}")
public interface IPivotCaches extends Com4jObject,Iterable<Com4jObject> {
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
   * @return  Returns a value of type excel.PivotCache
   */

  @VTID(11)
  excel.PivotCache item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.PivotCache
   */

  @VTID(12)
  @DefaultMethod
  excel.PivotCache get_Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   */

  @VTID(13)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param sourceType Mandatory excel.XlPivotTableSourceType parameter.
   * @param sourceData Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.PivotCache
   */

  @VTID(14)
  excel.PivotCache add(
    excel.XlPivotTableSourceType sourceType,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object sourceData);


  /**
   * @param sourceType Mandatory excel.XlPivotTableSourceType parameter.
   * @param sourceData Optional parameter. Default value is com4j.Variant.getMissing()
   * @param version Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.PivotCache
   */

  @VTID(15)
  excel.PivotCache create(
    excel.XlPivotTableSourceType sourceType,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object sourceData,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object version);


  // Properties:
}
