package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DataBarBorder extends Com4jObject {
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
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  excel.XlDataBarBorderType getType();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory excel.XlDataBarBorderType parameter.
   */

  @DISPID(108)
  @PropPut
  void setType(
    excel.XlDataBarBorderType rhs);


  /**
   * <p>
   * Getter method for the COM property "Color"
   * </p>
   */

  @DISPID(99)
  @PropGet
  com4j.Com4jObject getColor();


  // Properties:
}
