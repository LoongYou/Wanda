package excel  ;

import com4j.*;

@IID("{00024466-0001-0000-C000-000000000046}")
public interface ISpeech extends Com4jObject {
  // Methods:
  /**
   * @param text Mandatory java.lang.String parameter.
   * @param speakAsync Optional parameter. Default value is com4j.Variant.getMissing()
   * @param speakXML Optional parameter. Default value is com4j.Variant.getMissing()
   * @param purge Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(7)
  void speak(
    java.lang.String text,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object speakAsync,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object speakXML,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object purge);


  /**
   * <p>
   * Getter method for the COM property "Direction"
   * </p>
   * @return  Returns a value of type excel.XlSpeakDirection
   */

  @VTID(8)
  excel.XlSpeakDirection getDirection();


  /**
   * <p>
   * Setter method for the COM property "Direction"
   * </p>
   * @param rhs Mandatory excel.XlSpeakDirection parameter.
   */

  @VTID(9)
  void setDirection(
    excel.XlSpeakDirection rhs);


  /**
   * <p>
   * Getter method for the COM property "SpeakCellOnEnter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(10)
  boolean getSpeakCellOnEnter();


  /**
   * <p>
   * Setter method for the COM property "SpeakCellOnEnter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(11)
  void setSpeakCellOnEnter(
    boolean rhs);


  // Properties:
}
