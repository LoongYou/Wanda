package excel  ;

import com4j.*;

@IID("{00020892-0001-0000-C000-000000000046}")
public interface IWindows extends Com4jObject,Iterable<Com4jObject> {
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
   * @param arrangeStyle Optional parameter. Default value is 1
   * @param activeWorkbook Optional parameter. Default value is com4j.Variant.getMissing()
   * @param syncHorizontal Optional parameter. Default value is com4j.Variant.getMissing()
   * @param syncVertical Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object arrange(
    @Optional @DefaultValue("1") excel.XlArrangeStyle arrangeStyle,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object activeWorkbook,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object syncHorizontal,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object syncVertical);


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
   * @return  Returns a value of type excel.Window
   */

  @VTID(12)
  excel.Window getItem(
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
   * @return  Returns a value of type excel.Window
   */

  @VTID(14)
  @DefaultMethod
  excel.Window get_Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param windowName Mandatory java.lang.Object parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(15)
  boolean compareSideBySideWith(
    @MarshalAs(NativeType.VARIANT) java.lang.Object windowName);


  /**
   * @return  Returns a value of type boolean
   */

  @VTID(16)
  boolean breakSideBySide();


  /**
   * <p>
   * Getter method for the COM property "SyncScrollingSideBySide"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(17)
  boolean getSyncScrollingSideBySide();


  /**
   * <p>
   * Setter method for the COM property "SyncScrollingSideBySide"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(18)
  void setSyncScrollingSideBySide(
    boolean rhs);


  /**
   */

  @VTID(19)
  void resetPositionsSideBySide();


  // Properties:
}
