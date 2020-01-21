package excel  ;

import com4j.*;

@IID("{00024424-0001-0000-C000-000000000046}")
public interface IFormatConditions extends Com4jObject,Iterable<Com4jObject> {
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
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param type Mandatory excel.XlFormatConditionType parameter.
   * @param operator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param formula1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param formula2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param string Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textOperator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param dateOperator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param scopeType Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(12)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject add(
    excel.XlFormatConditionType type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object operator,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object formula1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object formula2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object string,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object textOperator,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object dateOperator,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object scopeType);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(13)
  @DefaultMethod
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject get_Default(
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
   * @param colorScaleType Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(16)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject addColorScale(
    int colorScaleType);


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(17)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject addDatabar();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(18)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject addIconSetCondition();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(19)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject addTop10();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(20)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject addAboveAverage();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(21)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject addUniqueValues();


  // Properties:
}
