package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Windows extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   */

  @DISPID(148)
  @PropGet
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   */

  @DISPID(149)
  @PropGet
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   */

  @DISPID(150)
  @PropGet
  com4j.Com4jObject getParent();


  /**
   * @param arrangeStyle Optional parameter. Default value is 1
   * @param activeWorkbook Optional parameter. Default value is com4j.Variant.getMissing()
   * @param syncHorizontal Optional parameter. Default value is com4j.Variant.getMissing()
   * @param syncVertical Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(638)
  java.lang.Object arrange(
    @Optional @DefaultValue("1") excel.XlArrangeStyle arrangeStyle,
    @Optional java.lang.Object activeWorkbook,
    @Optional java.lang.Object syncHorizontal,
    @Optional java.lang.Object syncVertical);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   */

  @DISPID(118)
  @PropGet
  int getCount();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(170)
  @PropGet
  excel.Window getItem(
    java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4)
  @PropGet
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  excel.Window get_Default(
    java.lang.Object index);


  /**
   * @param windowName Mandatory java.lang.Object parameter.
   */

  @DISPID(2246)
  boolean compareSideBySideWith(
    java.lang.Object windowName);


  /**
   */

  @DISPID(2248)
  boolean breakSideBySide();


  /**
   * <p>
   * Getter method for the COM property "SyncScrollingSideBySide"
   * </p>
   */

  @DISPID(2249)
  @PropGet
  boolean getSyncScrollingSideBySide();


  /**
   * <p>
   * Setter method for the COM property "SyncScrollingSideBySide"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2249)
  @PropPut
  void setSyncScrollingSideBySide(
    boolean rhs);


  /**
   */

  @DISPID(2250)
  void resetPositionsSideBySide();


  // Properties:
}
