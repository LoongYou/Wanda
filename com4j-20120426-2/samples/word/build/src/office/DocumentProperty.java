package office  ;

import com4j.*;

@IID("{2DF8D04E-5BFA-101B-BDE5-00AA0044DE52}")
public interface DocumentProperty extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   */

  @VTID(7)
  void parent();


  /**
   */

  @VTID(8)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(9)
  java.lang.String name(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param pbstrRetVal Mandatory java.lang.String parameter.
   */

  @VTID(10)
  void name(
    @LCID int lcid,
    java.lang.String pbstrRetVal);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(11)
  @DefaultMethod
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object value(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param pvargRetVal Mandatory java.lang.Object parameter.
   */

  @VTID(12)
  @DefaultMethod
  void value(
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object pvargRetVal);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type office.MsoDocProperties
   */

  @VTID(13)
  office.MsoDocProperties type(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param ptypeRetVal Mandatory office.MsoDocProperties parameter.
   */

  @VTID(14)
  void type(
    @LCID int lcid,
    office.MsoDocProperties ptypeRetVal);


  /**
   * <p>
   * Getter method for the COM property "LinkToContent"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(15)
  boolean linkToContent();


  /**
   * <p>
   * Setter method for the COM property "LinkToContent"
   * </p>
   * @param pfLinkRetVal Mandatory boolean parameter.
   */

  @VTID(16)
  void linkToContent(
    boolean pfLinkRetVal);


  /**
   * <p>
   * Getter method for the COM property "LinkSource"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(17)
  java.lang.String linkSource();


  /**
   * <p>
   * Setter method for the COM property "LinkSource"
   * </p>
   * @param pbstrSourceRetVal Mandatory java.lang.String parameter.
   */

  @VTID(18)
  void linkSource(
    java.lang.String pbstrSourceRetVal);


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(19)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(20)
  int creator();


  // Properties:
}
