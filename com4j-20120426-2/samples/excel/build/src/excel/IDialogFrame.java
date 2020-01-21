package excel  ;

import com4j.*;

@IID("{0002088F-0001-0000-C000-000000000046}")
public interface IDialogFrame extends Com4jObject {
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
   */

  @VTID(11)
  void _Dummy4();


  /**
   */

  @VTID(12)
  void _Dummy5();


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
   */

  @VTID(14)
  void _Dummy7();


  /**
   */

  @VTID(15)
  void _Dummy8();


  /**
   */

  @VTID(16)
  void _Dummy9();


  /**
   */

  @VTID(17)
  void _Dummy10();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(18)
  double getHeight();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(19)
  void setHeight(
    double rhs);


  /**
   */

  @VTID(20)
  void _Dummy12();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(21)
  double getLeft();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(22)
  void setLeft(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(23)
  boolean getLocked();


  /**
   * <p>
   * Setter method for the COM property "Locked"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(24)
  void setLocked(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(25)
  java.lang.String getName();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(26)
  void setName(
    java.lang.String rhs);


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
   */

  @VTID(29)
  void _Dummy17();


  /**
   */

  @VTID(30)
  void _Dummy18();


  /**
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(31)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object replace);


  /**
   */

  @VTID(32)
  void _Dummy20();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(33)
  double getTop();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(34)
  void setTop(
    double rhs);


  /**
   */

  @VTID(35)
  void _Dummy22();


  /**
   */

  @VTID(36)
  void _Dummy23();


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(37)
  double getWidth();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(38)
  void setWidth(
    double rhs);


  /**
   */

  @VTID(39)
  void _Dummy25();


  /**
   * <p>
   * Getter method for the COM property "ShapeRange"
   * </p>
   * @return  Returns a value of type excel.ShapeRange
   */

  @VTID(40)
  excel.ShapeRange getShapeRange();


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(41)
  java.lang.String getCaption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(42)
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

  @VTID(43)
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

  @VTID(44)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object checkSpelling(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object customDictionary,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignoreUppercase,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object alwaysSuggest,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object spellLang);


  /**
   * <p>
   * Getter method for the COM property "LockedText"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(45)
  boolean getLockedText();


  /**
   * <p>
   * Setter method for the COM property "LockedText"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(46)
  void setLockedText(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(47)
  java.lang.String getText();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(48)
  void setText(
    java.lang.String rhs);


  // Properties:
}
