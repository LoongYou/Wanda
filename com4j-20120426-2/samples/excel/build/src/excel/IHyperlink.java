package excel  ;

import com4j.*;

@IID("{00024431-0001-0000-C000-000000000046}")
public interface IHyperlink extends Com4jObject {
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
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(10)
  java.lang.String getName();


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(11)
  excel.Range getRange();


  /**
   * <p>
   * Getter method for the COM property "Shape"
   * </p>
   * @return  Returns a value of type excel.Shape
   */

  @VTID(12)
  excel.Shape getShape();


  /**
   * <p>
   * Getter method for the COM property "SubAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(13)
  java.lang.String getSubAddress();


  /**
   * <p>
   * Setter method for the COM property "SubAddress"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(14)
  void setSubAddress(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Address"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(15)
  java.lang.String getAddress();


  /**
   * <p>
   * Setter method for the COM property "Address"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(16)
  void setAddress(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(17)
  int getType();


  /**
   */

  @VTID(18)
  void addToFavorites();


  /**
   */

  @VTID(19)
  void delete();


  /**
   * @param newWindow Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addHistory Optional parameter. Default value is com4j.Variant.getMissing()
   * @param extraInfo Optional parameter. Default value is com4j.Variant.getMissing()
   * @param method Optional parameter. Default value is com4j.Variant.getMissing()
   * @param headerInfo Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(20)
  void follow(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object newWindow,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object addHistory,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object extraInfo,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object method,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object headerInfo);


  /**
   * <p>
   * Getter method for the COM property "EmailSubject"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(21)
  java.lang.String getEmailSubject();


  /**
   * <p>
   * Setter method for the COM property "EmailSubject"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(22)
  void setEmailSubject(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ScreenTip"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(23)
  java.lang.String getScreenTip();


  /**
   * <p>
   * Setter method for the COM property "ScreenTip"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(24)
  void setScreenTip(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "TextToDisplay"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(25)
  java.lang.String getTextToDisplay();


  /**
   * <p>
   * Setter method for the COM property "TextToDisplay"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(26)
  void setTextToDisplay(
    java.lang.String rhs);


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param editNow Mandatory boolean parameter.
   * @param overwrite Mandatory boolean parameter.
   */

  @VTID(27)
  void createNewDocument(
    java.lang.String filename,
    boolean editNow,
    boolean overwrite);


  // Properties:
}
