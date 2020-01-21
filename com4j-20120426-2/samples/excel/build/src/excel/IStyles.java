package excel  ;

import com4j.*;

@IID("{00020853-0001-0000-C000-000000000046}")
public interface IStyles extends Com4jObject,Iterable<Com4jObject> {
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
   * @param basedOn Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.Style
   */

  @VTID(10)
  excel.Style add(
    java.lang.String name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object basedOn);


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
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.Style
   */

  @VTID(12)
  excel.Style getItem(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param workbook Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object merge(
    @MarshalAs(NativeType.VARIANT) java.lang.Object workbook);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(14)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel.Style
   */

  @VTID(15)
  @DefaultMethod
  excel.Style get_Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  // Properties:
}
