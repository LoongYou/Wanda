package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Page extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "LeftHeader"
   * </p>
   */

  @DISPID(1018)
  @PropGet
  excel.HeaderFooter getLeftHeader();


  /**
   * <p>
   * Getter method for the COM property "CenterHeader"
   * </p>
   */

  @DISPID(1011)
  @PropGet
  excel.HeaderFooter getCenterHeader();


  /**
   * <p>
   * Getter method for the COM property "RightHeader"
   * </p>
   */

  @DISPID(1026)
  @PropGet
  excel.HeaderFooter getRightHeader();


  /**
   * <p>
   * Getter method for the COM property "LeftFooter"
   * </p>
   */

  @DISPID(1017)
  @PropGet
  excel.HeaderFooter getLeftFooter();


  /**
   * <p>
   * Getter method for the COM property "CenterFooter"
   * </p>
   */

  @DISPID(1010)
  @PropGet
  excel.HeaderFooter getCenterFooter();


  /**
   * <p>
   * Getter method for the COM property "RightFooter"
   * </p>
   */

  @DISPID(1025)
  @PropGet
  excel.HeaderFooter getRightFooter();


  // Properties:
}
