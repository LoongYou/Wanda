package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Speech extends Com4jObject {
  // Methods:
  /**
   * @param text Mandatory java.lang.String parameter.
   * @param speakAsync Optional parameter. Default value is com4j.Variant.getMissing()
   * @param speakXML Optional parameter. Default value is com4j.Variant.getMissing()
   * @param purge Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2017)
  void speak(
    java.lang.String text,
    @Optional java.lang.Object speakAsync,
    @Optional java.lang.Object speakXML,
    @Optional java.lang.Object purge);


  /**
   * <p>
   * Getter method for the COM property "Direction"
   * </p>
   */

  @DISPID(168)
  @PropGet
  excel.XlSpeakDirection getDirection();


  /**
   * <p>
   * Setter method for the COM property "Direction"
   * </p>
   * @param rhs Mandatory excel.XlSpeakDirection parameter.
   */

  @DISPID(168)
  @PropPut
  void setDirection(
    excel.XlSpeakDirection rhs);


  /**
   * <p>
   * Getter method for the COM property "SpeakCellOnEnter"
   * </p>
   */

  @DISPID(2235)
  @PropGet
  boolean getSpeakCellOnEnter();


  /**
   * <p>
   * Setter method for the COM property "SpeakCellOnEnter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2235)
  @PropPut
  void setSpeakCellOnEnter(
    boolean rhs);


  // Properties:
}
