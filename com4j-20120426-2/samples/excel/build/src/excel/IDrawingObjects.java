package excel  ;

import com4j.*;

@IID("{0002086F-0001-0000-C000-000000000046}")
public interface IDrawingObjects extends Com4jObject,Iterable<Com4jObject> {
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
   */

  @VTID(10)
  void _Dummy3();


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
   */

  @VTID(21)
  void _Dummy12();


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
   */

  @VTID(26)
  void _Dummy15();


  /**
   * <p>
   * Getter method for the COM property "OnAction"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(27)
  java.lang.String getOnAction();


  /**
   * <p>
   * Setter method for the COM property "OnAction"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(28)
  void setOnAction(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Placement"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(29)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getPlacement();


  /**
   * <p>
   * Setter method for the COM property "Placement"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(30)
  void setPlacement(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintObject"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(31)
  boolean getPrintObject();


  /**
   * <p>
   * Setter method for the COM property "PrintObject"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(32)
  void setPrintObject(
    boolean rhs);


  /**
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(33)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object replace);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(34)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object sendToBack();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(35)
  double getTop();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(36)
  void setTop(
    double rhs);


  /**
   */

  @VTID(37)
  void _Dummy22();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(38)
  boolean getVisible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(39)
  void setVisible(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(40)
  double getWidth();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(41)
  void setWidth(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "ZOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(42)
  int getZOrder();


  /**
   * <p>
   * Getter method for the COM property "ShapeRange"
   * </p>
   * @return  Returns a value of type excel.ShapeRange
   */

  @VTID(43)
  excel.ShapeRange getShapeRange();


  /**
   * <p>
   * Getter method for the COM property "Accelerator"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(44)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getAccelerator();


  /**
   * <p>
   * Setter method for the COM property "Accelerator"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(45)
  void setAccelerator(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   */

  @VTID(46)
  void _Dummy28();


  /**
   * <p>
   * Getter method for the COM property "AddIndent"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(47)
  boolean getAddIndent();


  /**
   * <p>
   * Setter method for the COM property "AddIndent"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(48)
  void setAddIndent(
    boolean rhs);


  /**
   * @param text Mandatory java.lang.Object parameter.
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(49)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object addItem(
    @MarshalAs(NativeType.VARIANT) java.lang.Object text,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "ArrowHeadLength"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(50)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getArrowHeadLength();


  /**
   * <p>
   * Setter method for the COM property "ArrowHeadLength"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(51)
  void setArrowHeadLength(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ArrowHeadStyle"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(52)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getArrowHeadStyle();


  /**
   * <p>
   * Setter method for the COM property "ArrowHeadStyle"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(53)
  void setArrowHeadStyle(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ArrowHeadWidth"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(54)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getArrowHeadWidth();


  /**
   * <p>
   * Setter method for the COM property "ArrowHeadWidth"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(55)
  void setArrowHeadWidth(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoSize"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(56)
  boolean getAutoSize();


  /**
   * <p>
   * Setter method for the COM property "AutoSize"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(57)
  void setAutoSize(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   * @return  Returns a value of type excel.Border
   */

  @VTID(58)
  excel.Border getBorder();


  /**
   * <p>
   * Getter method for the COM property "CancelButton"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(59)
  boolean getCancelButton();


  /**
   * <p>
   * Setter method for the COM property "CancelButton"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(60)
  void setCancelButton(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(61)
  java.lang.String getCaption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(62)
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

  @VTID(63)
  excel.Characters getCharacters(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object start,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object length);


  /**
   * @param customDictionary Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreUppercase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param alwaysSuggest Optional parameter. Default value is com4j.Variant.getMissing()
   * @param spellLang Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(64)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object checkSpelling(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object customDictionary,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignoreUppercase,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object alwaysSuggest,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object spellLang);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(65)
  @DefaultMethod
  int get_Default();


  /**
   * <p>
   * Setter method for the COM property "_Default"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(66)
  @DefaultMethod
  void set_Default(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "DefaultButton"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(67)
  boolean getDefaultButton();


  /**
   * <p>
   * Setter method for the COM property "DefaultButton"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(68)
  void setDefaultButton(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DismissButton"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(69)
  boolean getDismissButton();


  /**
   * <p>
   * Setter method for the COM property "DismissButton"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(70)
  void setDismissButton(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Display3DShading"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(71)
  boolean getDisplay3DShading();


  /**
   * <p>
   * Setter method for the COM property "Display3DShading"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(72)
  void setDisplay3DShading(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayVerticalScrollBar"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(73)
  boolean getDisplayVerticalScrollBar();


  /**
   * <p>
   * Setter method for the COM property "DisplayVerticalScrollBar"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(74)
  void setDisplayVerticalScrollBar(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DropDownLines"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(75)
  int getDropDownLines();


  /**
   * <p>
   * Setter method for the COM property "DropDownLines"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(76)
  void setDropDownLines(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type excel.Font
   */

  @VTID(77)
  excel.Font getFont();


  /**
   */

  @VTID(78)
  void _Dummy47();


  /**
   * <p>
   * Getter method for the COM property "HelpButton"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(79)
  boolean getHelpButton();


  /**
   * <p>
   * Setter method for the COM property "HelpButton"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(80)
  void setHelpButton(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HorizontalAlignment"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(81)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getHorizontalAlignment();


  /**
   * <p>
   * Setter method for the COM property "HorizontalAlignment"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(82)
  void setHorizontalAlignment(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "InputType"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(83)
  int getInputType();


  /**
   * <p>
   * Setter method for the COM property "InputType"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(84)
  void setInputType(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type excel.Interior
   */

  @VTID(85)
  excel.Interior getInterior();


  /**
   * <p>
   * Getter method for the COM property "LargeChange"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(86)
  int getLargeChange();


  /**
   * <p>
   * Setter method for the COM property "LargeChange"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(87)
  void setLargeChange(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "LinkedCell"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(88)
  java.lang.String getLinkedCell();


  /**
   * <p>
   * Setter method for the COM property "LinkedCell"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(89)
  void setLinkedCell(
    java.lang.String rhs);


  /**
   */

  @VTID(90)
  void _Dummy54();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(91)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object list(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   */

  @VTID(92)
  void _Dummy56();


  /**
   * <p>
   * Getter method for the COM property "ListFillRange"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(93)
  java.lang.String getListFillRange();


  /**
   * <p>
   * Setter method for the COM property "ListFillRange"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(94)
  void setListFillRange(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ListIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(95)
  int getListIndex();


  /**
   * <p>
   * Setter method for the COM property "ListIndex"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(96)
  void setListIndex(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "LockedText"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(97)
  boolean getLockedText();


  /**
   * <p>
   * Setter method for the COM property "LockedText"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(98)
  void setLockedText(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Max"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(99)
  int getMax();


  /**
   * <p>
   * Setter method for the COM property "Max"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(100)
  void setMax(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Min"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(101)
  int getMin();


  /**
   * <p>
   * Setter method for the COM property "Min"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(102)
  void setMin(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "MultiLine"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(103)
  boolean getMultiLine();


  /**
   * <p>
   * Setter method for the COM property "MultiLine"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(104)
  void setMultiLine(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MultiSelect"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(105)
  boolean getMultiSelect();


  /**
   * <p>
   * Setter method for the COM property "MultiSelect"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(106)
  void setMultiSelect(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(107)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getOrientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(108)
  void setOrientation(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "PhoneticAccelerator"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(109)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getPhoneticAccelerator();


  /**
   * <p>
   * Setter method for the COM property "PhoneticAccelerator"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(110)
  void setPhoneticAccelerator(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(111)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object removeAllItems();


  /**
   * @param index Mandatory int parameter.
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(112)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object removeItem(
    int index,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object count);


  /**
   * @param vertex Mandatory int parameter.
   * @param insert Mandatory java.lang.Object parameter.
   * @param left Optional parameter. Default value is com4j.Variant.getMissing()
   * @param top Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(113)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object reshape(
    int vertex,
    @MarshalAs(NativeType.VARIANT) java.lang.Object insert,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object left,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object top);


  /**
   * <p>
   * Getter method for the COM property "RoundedCorners"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(114)
  boolean getRoundedCorners();


  /**
   * <p>
   * Setter method for the COM property "RoundedCorners"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(115)
  void setRoundedCorners(
    boolean rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(116)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object selected(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(117)
  boolean getShadow();


  /**
   * <p>
   * Setter method for the COM property "Shadow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(118)
  void setShadow(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SmallChange"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(119)
  int getSmallChange();


  /**
   * <p>
   * Setter method for the COM property "SmallChange"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(120)
  void setSmallChange(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(121)
  java.lang.String getText();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(122)
  void setText(
    java.lang.String rhs);


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(123)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject ungroup();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(124)
  int getValue();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(125)
  void setValue(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "VerticalAlignment"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(126)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getVerticalAlignment();


  /**
   * <p>
   * Setter method for the COM property "VerticalAlignment"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(127)
  void setVerticalAlignment(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @param index1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param index2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(128)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object vertices(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index2);


  /**
   * <p>
   * Getter method for the COM property "ReadingOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(129)
  int getReadingOrder();


  /**
   * <p>
   * Setter method for the COM property "ReadingOrder"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(130)
  void setReadingOrder(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(131)
  int getCount();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(132)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @return  Returns a value of type excel.GroupObject
   */

  @VTID(133)
  excel.GroupObject group();


  /**
   * @param link Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(134)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object linkCombo(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object link);


  /**
   */

  @VTID(135)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
