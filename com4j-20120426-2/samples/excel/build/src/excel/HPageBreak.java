package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface HPageBreak extends Com4jObject {
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
  excel._Worksheet getParent();


  /**
   */

  @DISPID(117)
  void delete();


  /**
   * @param direction Mandatory excel.XlDirection parameter.
   * @param regionIndex Mandatory int parameter.
   */

  @DISPID(1420)
  void dragOff(
    excel.XlDirection direction,
    int regionIndex);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  excel.XlPageBreak getType();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory excel.XlPageBreak parameter.
   */

  @DISPID(108)
  @PropPut
  void setType(
    excel.XlPageBreak rhs);


  /**
   * <p>
   * Getter method for the COM property "Extent"
   * </p>
   */

  @DISPID(1422)
  @PropGet
  excel.XlPageBreakExtent getExtent();


  /**
   * <p>
   * Getter method for the COM property "Location"
   * </p>
   */

  @DISPID(1397)
  @PropGet
  excel.Range getLocation();


  /**
   * <p>
   * Setter method for the COM property "Location"
   * </p>
   * @param rhs Mandatory excel.Range parameter.
   */

  @DISPID(1397)
  @PropPut
  void setLocation(
    excel.Range rhs);


  // Properties:
}
