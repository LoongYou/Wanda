package excel  ;

import com4j.*;

@IID("{00020896-0001-0000-C000-000000000046}")
public interface IScenarios extends Com4jObject,Iterable<Com4jObject> {
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
   * @param name Mandatory java.lang.String parameter.
   * @param changingCells Mandatory java.lang.Object parameter.
   * @param values Optional parameter. Default value is com4j.Variant.getMissing()
   * @param comment Optional parameter. Default value is com4j.Variant.getMissing()
   * @param locked Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hidden Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.Scenario
   */

  @VTID(10)
  excel.Scenario add(
    java.lang.String name,
    @MarshalAs(NativeType.VARIANT) java.lang.Object changingCells,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object values,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object comment,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object locked,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object hidden);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(11)
  int getCount();


  /**
   * @param reportType Optional parameter. Default value is 1
   * @param resultCells Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object createSummary(
    @Optional @DefaultValue("1") excel.XlSummaryReportType reportType,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object resultCells);


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.Scenario
   */

  @VTID(13)
  excel.Scenario item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param source Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object merge(
    @MarshalAs(NativeType.VARIANT) java.lang.Object source);


  /**
   */

  @VTID(15)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
