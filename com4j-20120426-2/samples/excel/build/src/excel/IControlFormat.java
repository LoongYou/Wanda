package excel  ;

import com4j.*;

@IID("{00024440-0001-0000-C000-000000000046}")
public interface IControlFormat extends Com4jObject {
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
   * @param text Mandatory java.lang.String parameter.
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(10)
  void addItem(
    java.lang.String text,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   */

  @VTID(11)
  void removeAllItems();


  /**
   * @param index Mandatory int parameter.
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(12)
  void removeItem(
    int index,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object count);


  /**
   * <p>
   * Getter method for the COM property "DropDownLines"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(13)
  int getDropDownLines();


  /**
   * <p>
   * Setter method for the COM property "DropDownLines"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(14)
  void setDropDownLines(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(15)
  boolean getEnabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(16)
  void setEnabled(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "LargeChange"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(17)
  int getLargeChange();


  /**
   * <p>
   * Setter method for the COM property "LargeChange"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(18)
  void setLargeChange(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "LinkedCell"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(19)
  java.lang.String getLinkedCell();


  /**
   * <p>
   * Setter method for the COM property "LinkedCell"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(20)
  void setLinkedCell(
    java.lang.String rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(21)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object list(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "ListCount"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(22)
  int getListCount();


  /**
   * <p>
   * Setter method for the COM property "ListCount"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(23)
  void setListCount(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ListFillRange"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(24)
  java.lang.String getListFillRange();


  /**
   * <p>
   * Setter method for the COM property "ListFillRange"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(25)
  void setListFillRange(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ListIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(26)
  int getListIndex();


  /**
   * <p>
   * Setter method for the COM property "ListIndex"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(27)
  void setListIndex(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "LockedText"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(28)
  boolean getLockedText();


  /**
   * <p>
   * Setter method for the COM property "LockedText"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(29)
  void setLockedText(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Max"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(30)
  int getMax();


  /**
   * <p>
   * Setter method for the COM property "Max"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(31)
  void setMax(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Min"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(32)
  int getMin();


  /**
   * <p>
   * Setter method for the COM property "Min"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(33)
  void setMin(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "MultiSelect"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(34)
  int getMultiSelect();


  /**
   * <p>
   * Setter method for the COM property "MultiSelect"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(35)
  void setMultiSelect(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintObject"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(36)
  boolean getPrintObject();


  /**
   * <p>
   * Setter method for the COM property "PrintObject"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(37)
  void setPrintObject(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SmallChange"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(38)
  int getSmallChange();


  /**
   * <p>
   * Setter method for the COM property "SmallChange"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(39)
  void setSmallChange(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(40)
  @DefaultMethod
  int get_Default();


  /**
   * <p>
   * Setter method for the COM property "_Default"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(41)
  @DefaultMethod
  void set_Default(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(42)
  int getValue();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(43)
  void setValue(
    int rhs);


  // Properties:
}
