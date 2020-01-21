package excel  ;

import com4j.*;

@IID("{0002441F-0001-0000-C000-000000000046}")
public interface IPivotFormulas extends Com4jObject,Iterable<Com4jObject> {
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
   * @param formula Mandatory java.lang.String parameter.
   * @return  Returns a value of type excel.PivotFormula
   */

  @VTID(11)
  excel.PivotFormula _Add(
    java.lang.String formula);


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.PivotFormula
   */

  @VTID(12)
  excel.PivotFormula item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.PivotFormula
   */

  @VTID(13)
  @DefaultMethod
  excel.PivotFormula get_Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   */

  @VTID(14)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param formula Mandatory java.lang.String parameter.
   * @param useStandardFormula Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.PivotFormula
   */

  @VTID(15)
  excel.PivotFormula add(
    java.lang.String formula,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object useStandardFormula);


  // Properties:
}
