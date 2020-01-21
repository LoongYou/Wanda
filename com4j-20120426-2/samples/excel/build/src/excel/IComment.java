package excel  ;

import com4j.*;

@IID("{00024427-0001-0000-C000-000000000046}")
public interface IComment extends Com4jObject {
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
   * Getter method for the COM property "Author"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(10)
  java.lang.String getAuthor();


  /**
   * <p>
   * Getter method for the COM property "Shape"
   * </p>
   * @return  Returns a value of type excel.Shape
   */

  @VTID(11)
  excel.Shape getShape();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(12)
  boolean getVisible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(13)
  void setVisible(
    boolean rhs);


  /**
   * @param text Optional parameter. Default value is com4j.Variant.getMissing()
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   * @param overwrite Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @VTID(14)
  java.lang.String text(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object text,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object start,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object overwrite);


  /**
   */

  @VTID(15)
  void delete();


  /**
   * @return  Returns a value of type excel.Comment
   */

  @VTID(16)
  excel.Comment next();


  /**
   * @return  Returns a value of type excel.Comment
   */

  @VTID(17)
  excel.Comment previous();


  // Properties:
}
