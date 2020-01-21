package excel  ;

import com4j.*;

@IID("{00020895-0001-0000-C000-000000000046}")
public interface IPane extends Com4jObject {
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
   * @return  Returns a value of type boolean
   */

  @VTID(10)
  boolean activate();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(11)
  int getIndex();


  /**
   * @param down Optional parameter. Default value is com4j.Variant.getMissing()
   * @param up Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toRight Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toLeft Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object largeScroll(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object down,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object up,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object toRight,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object toLeft);


  /**
   * <p>
   * Getter method for the COM property "ScrollColumn"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(13)
  int getScrollColumn();


  /**
   * <p>
   * Setter method for the COM property "ScrollColumn"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(14)
  void setScrollColumn(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ScrollRow"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(15)
  int getScrollRow();


  /**
   * <p>
   * Setter method for the COM property "ScrollRow"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(16)
  void setScrollRow(
    int rhs);


  /**
   * @param down Optional parameter. Default value is com4j.Variant.getMissing()
   * @param up Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toRight Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toLeft Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object smallScroll(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object down,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object up,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object toRight,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object toLeft);


  /**
   * <p>
   * Getter method for the COM property "VisibleRange"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(18)
  excel.Range getVisibleRange();


  /**
   * @param left Mandatory int parameter.
   * @param top Mandatory int parameter.
   * @param width Mandatory int parameter.
   * @param height Mandatory int parameter.
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(19)
  void scrollIntoView(
    int left,
    int top,
    int width,
    int height,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object start);


  /**
   * @param points Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @VTID(20)
  int pointsToScreenPixelsX(
    int points);


  /**
   * @param points Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @VTID(21)
  int pointsToScreenPixelsY(
    int points);


  // Properties:
}
