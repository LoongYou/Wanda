package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Research extends Com4jObject {
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
   * @param serviceID Mandatory java.lang.String parameter.
   * @param queryString Optional parameter. Default value is com4j.Variant.getMissing()
   * @param queryLanguage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param useSelection Optional parameter. Default value is com4j.Variant.getMissing()
   * @param launchQuery Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2751)
  java.lang.Object query(
    java.lang.String serviceID,
    @Optional java.lang.Object queryString,
    @Optional java.lang.Object queryLanguage,
    @Optional java.lang.Object useSelection,
    @Optional java.lang.Object launchQuery);


  /**
   * @param serviceID Mandatory java.lang.String parameter.
   */

  @DISPID(2757)
  boolean isResearchService(
    java.lang.String serviceID);


  /**
   * @param languageFrom Mandatory int parameter.
   * @param languageTo Mandatory int parameter.
   */

  @DISPID(2758)
  java.lang.Object setLanguagePair(
    int languageFrom,
    int languageTo);


  // Properties:
}
