package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface SmartTagOptions extends Com4jObject {
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
   * Getter method for the COM property "DisplaySmartTags"
   * </p>
   */

  @DISPID(2218)
  @PropGet
  excel.XlSmartTagDisplayMode getDisplaySmartTags();


  /**
   * <p>
   * Setter method for the COM property "DisplaySmartTags"
   * </p>
   * @param rhs Mandatory excel.XlSmartTagDisplayMode parameter.
   */

  @DISPID(2218)
  @PropPut
  void setDisplaySmartTags(
    excel.XlSmartTagDisplayMode rhs);


  /**
   * <p>
   * Getter method for the COM property "EmbedSmartTags"
   * </p>
   */

  @DISPID(2219)
  @PropGet
  boolean getEmbedSmartTags();


  /**
   * <p>
   * Setter method for the COM property "EmbedSmartTags"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2219)
  @PropPut
  void setEmbedSmartTags(
    boolean rhs);


  // Properties:
}
