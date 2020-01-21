package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Comment extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   */

  @DISPID(148)
  @PropGet
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   */

  @DISPID(149)
  @PropGet
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   */

  @DISPID(150)
  @PropGet
  com4j.Com4jObject getParent();


  /**
   * <p>
   * Getter method for the COM property "Author"
   * </p>
   */

  @DISPID(574)
  @PropGet
  java.lang.String getAuthor();


  /**
   * <p>
   * Getter method for the COM property "Shape"
   * </p>
   */

  @DISPID(1582)
  @PropGet
  excel.Shape getShape();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   */

  @DISPID(558)
  @PropGet
  boolean getVisible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(558)
  @PropPut
  void setVisible(
    boolean rhs);


  /**
   * @param text Optional parameter. Default value is com4j.Variant.getMissing()
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   * @param overwrite Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(138)
  java.lang.String text(
    @Optional java.lang.Object text,
    @Optional java.lang.Object start,
    @Optional java.lang.Object overwrite);


  /**
   */

  @DISPID(117)
  void delete();


  /**
   */

  @DISPID(502)
  excel.Comment next();


  /**
   */

  @DISPID(503)
  excel.Comment previous();


  // Properties:
}
