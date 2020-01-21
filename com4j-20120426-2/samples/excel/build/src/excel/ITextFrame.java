package excel  ;

import com4j.*;

@IID("{0002443D-0001-0000-C000-000000000046}")
public interface ITextFrame extends Com4jObject {
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
   * Getter method for the COM property "MarginBottom"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(10)
  float getMarginBottom();


  /**
   * <p>
   * Setter method for the COM property "MarginBottom"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(11)
  void setMarginBottom(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "MarginLeft"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(12)
  float getMarginLeft();


  /**
   * <p>
   * Setter method for the COM property "MarginLeft"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(13)
  void setMarginLeft(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "MarginRight"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(14)
  float getMarginRight();


  /**
   * <p>
   * Setter method for the COM property "MarginRight"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(15)
  void setMarginRight(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "MarginTop"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(16)
  float getMarginTop();


  /**
   * <p>
   * Setter method for the COM property "MarginTop"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(17)
  void setMarginTop(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type office.MsoTextOrientation
   */

  @VTID(18)
  office.MsoTextOrientation getOrientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param rhs Mandatory office.MsoTextOrientation parameter.
   */

  @VTID(19)
  void setOrientation(
    office.MsoTextOrientation rhs);


  /**
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   * @param length Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.Characters
   */

  @VTID(20)
  excel.Characters characters(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object start,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object length);


  /**
   * <p>
   * Getter method for the COM property "HorizontalAlignment"
   * </p>
   * @return  Returns a value of type excel.XlHAlign
   */

  @VTID(21)
  excel.XlHAlign getHorizontalAlignment();


  /**
   * <p>
   * Setter method for the COM property "HorizontalAlignment"
   * </p>
   * @param rhs Mandatory excel.XlHAlign parameter.
   */

  @VTID(22)
  void setHorizontalAlignment(
    excel.XlHAlign rhs);


  /**
   * <p>
   * Getter method for the COM property "VerticalAlignment"
   * </p>
   * @return  Returns a value of type excel.XlVAlign
   */

  @VTID(23)
  excel.XlVAlign getVerticalAlignment();


  /**
   * <p>
   * Setter method for the COM property "VerticalAlignment"
   * </p>
   * @param rhs Mandatory excel.XlVAlign parameter.
   */

  @VTID(24)
  void setVerticalAlignment(
    excel.XlVAlign rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoSize"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(25)
  boolean getAutoSize();


  /**
   * <p>
   * Setter method for the COM property "AutoSize"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(26)
  void setAutoSize(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ReadingOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(27)
  int getReadingOrder();


  /**
   * <p>
   * Setter method for the COM property "ReadingOrder"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(28)
  void setReadingOrder(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoMargins"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(29)
  boolean getAutoMargins();


  /**
   * <p>
   * Setter method for the COM property "AutoMargins"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(30)
  void setAutoMargins(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "VerticalOverflow"
   * </p>
   * @return  Returns a value of type excel.XlOartVerticalOverflow
   */

  @VTID(31)
  excel.XlOartVerticalOverflow getVerticalOverflow();


  /**
   * <p>
   * Setter method for the COM property "VerticalOverflow"
   * </p>
   * @param rhs Mandatory excel.XlOartVerticalOverflow parameter.
   */

  @VTID(32)
  void setVerticalOverflow(
    excel.XlOartVerticalOverflow rhs);


  /**
   * <p>
   * Getter method for the COM property "HorizontalOverflow"
   * </p>
   * @return  Returns a value of type excel.XlOartHorizontalOverflow
   */

  @VTID(33)
  excel.XlOartHorizontalOverflow getHorizontalOverflow();


  /**
   * <p>
   * Setter method for the COM property "HorizontalOverflow"
   * </p>
   * @param rhs Mandatory excel.XlOartHorizontalOverflow parameter.
   */

  @VTID(34)
  void setHorizontalOverflow(
    excel.XlOartHorizontalOverflow rhs);


  // Properties:
}
