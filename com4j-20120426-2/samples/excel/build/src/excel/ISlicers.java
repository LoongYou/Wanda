package excel  ;

import com4j.*;

@IID("{000244C7-0001-0000-C000-000000000046}")
public interface ISlicers extends Com4jObject,Iterable<Com4jObject> {
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
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.Slicer
   */

  @VTID(11)
  excel.Slicer getItem(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.Slicer
   */

  @VTID(12)
  @DefaultMethod
  excel.Slicer get_Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(13)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param slicerDestination Mandatory java.lang.Object parameter.
   * @param level Optional parameter. Default value is com4j.Variant.getMissing()
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param caption Optional parameter. Default value is com4j.Variant.getMissing()
   * @param top Optional parameter. Default value is com4j.Variant.getMissing()
   * @param left Optional parameter. Default value is com4j.Variant.getMissing()
   * @param width Optional parameter. Default value is com4j.Variant.getMissing()
   * @param height Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.Slicer
   */

  @VTID(14)
  excel.Slicer add(
    @MarshalAs(NativeType.VARIANT) java.lang.Object slicerDestination,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object level,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object caption,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object top,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object left,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object width,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object height);


  // Properties:
}
