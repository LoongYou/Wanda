package excel  ;

import com4j.*;

@IID("{00024441-0001-0000-C000-000000000046}")
public interface IOLEFormat extends Com4jObject {
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
  void activate();


  /**
   * <p>
   * Getter method for the COM property "Object"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getObject();


  /**
   * <p>
   * Getter method for the COM property "progID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(12)
  java.lang.String getProgID();


  /**
   * @param verb Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(13)
  void verb(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object verb);


  // Properties:
}
