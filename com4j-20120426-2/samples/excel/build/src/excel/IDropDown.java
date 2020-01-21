package excel  ;

import com4j.*;

@IID("{0002088B-0001-0000-C000-000000000046}")
public interface IDropDown extends Com4jObject {
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
   * Getter method for the COM property "BottomRightCell"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(10)
  excel.Range getBottomRightCell();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object bringToFront();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object copy();


  /**
   * @param appearance Optional parameter. Default value is 2
   * @param format Optional parameter. Default value is -4147
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object copyPicture(
    @Optional @DefaultValue("2") excel.XlPictureAppearance appearance,
    @Optional @DefaultValue("-4147") excel.XlCopyPictureFormat format);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object cut();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object delete();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(16)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject duplicate();


  /**
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(17)
  boolean getEnabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(18)
  void setEnabled(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(19)
  double getHeight();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(20)
  void setHeight(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(21)
  int getIndex();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(22)
  double getLeft();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(23)
  void setLeft(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(24)
  boolean getLocked();


  /**
   * <p>
   * Setter method for the COM property "Locked"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(25)
  void setLocked(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(26)
  java.lang.String getName();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(27)
  void setName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "OnAction"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(28)
  java.lang.String getOnAction();


  /**
   * <p>
   * Setter method for the COM property "OnAction"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(29)
  void setOnAction(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Placement"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(30)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getPlacement();


  /**
   * <p>
   * Setter method for the COM property "Placement"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(31)
  void setPlacement(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintObject"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(32)
  boolean getPrintObject();


  /**
   * <p>
   * Setter method for the COM property "PrintObject"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(33)
  void setPrintObject(
    boolean rhs);


  /**
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(34)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object replace);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(35)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object sendToBack();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(36)
  double getTop();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(37)
  void setTop(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "TopLeftCell"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(38)
  excel.Range getTopLeftCell();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(39)
  boolean getVisible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(40)
  void setVisible(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(41)
  double getWidth();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(42)
  void setWidth(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "ZOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(43)
  int getZOrder();


  /**
   * <p>
   * Getter method for the COM property "ShapeRange"
   * </p>
   * @return  Returns a value of type excel.ShapeRange
   */

  @VTID(44)
  excel.ShapeRange getShapeRange();


  /**
   * @param text Mandatory java.lang.Object parameter.
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(45)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object addItem(
    @MarshalAs(NativeType.VARIANT) java.lang.Object text,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "Display3DShading"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(46)
  boolean getDisplay3DShading();


  /**
   * <p>
   * Setter method for the COM property "Display3DShading"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(47)
  void setDisplay3DShading(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(48)
  @DefaultMethod
  int get_Default();


  /**
   * <p>
   * Setter method for the COM property "_Default"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(49)
  @DefaultMethod
  void set_Default(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "LinkedCell"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(50)
  java.lang.String getLinkedCell();


  /**
   * <p>
   * Setter method for the COM property "LinkedCell"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(51)
  void setLinkedCell(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "LinkedObject"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(52)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getLinkedObject();


  /**
   * <p>
   * Getter method for the COM property "List"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(53)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getList(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Setter method for the COM property "List"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(54)
  void setList(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ListCount"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(55)
  int getListCount();


  /**
   * <p>
   * Getter method for the COM property "ListFillRange"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(56)
  java.lang.String getListFillRange();


  /**
   * <p>
   * Setter method for the COM property "ListFillRange"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(57)
  void setListFillRange(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ListIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(58)
  int getListIndex();


  /**
   * <p>
   * Setter method for the COM property "ListIndex"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(59)
  void setListIndex(
    int rhs);


  /**
   */

  @VTID(60)
  void _Dummy36();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(61)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object removeAllItems();


  /**
   * @param index Mandatory int parameter.
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(62)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object removeItem(
    int index,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object count);


  /**
   * <p>
   * Getter method for the COM property "Selected"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(63)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getSelected(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Setter method for the COM property "Selected"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(64)
  void setSelected(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(65)
  int getValue();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(66)
  void setValue(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(67)
  java.lang.String getCaption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(68)
  void setCaption(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Characters"
   * </p>
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   * @param length Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.Characters
   */

  @VTID(69)
  excel.Characters getCharacters(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object start,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object length);


  /**
   * <p>
   * Getter method for the COM property "DropDownLines"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(70)
  int getDropDownLines();


  /**
   * <p>
   * Setter method for the COM property "DropDownLines"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(71)
  void setDropDownLines(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(72)
  java.lang.String getText();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(73)
  void setText(
    java.lang.String rhs);


  // Properties:
}
