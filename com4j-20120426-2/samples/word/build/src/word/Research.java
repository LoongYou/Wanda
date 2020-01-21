package word  ;

import com4j.*;

@IID("{E6AAEC05-E543-4085-BA92-9BF7D2474F51}")
public interface Research extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * @param serviceID Mandatory java.lang.String parameter.
   * @param queryString Optional parameter. Default value is ""
   * @param queryLanguage Optional parameter. Default value is 0
   * @param useSelection Optional parameter. Default value is false
   * @param launchQuery Optional parameter. Default value is false
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(500) //= 0x1f4. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object query(
    java.lang.String serviceID,
    @Optional @DefaultValue("") java.lang.String queryString,
    @Optional @DefaultValue("0") word.WdLanguageID queryLanguage,
    @Optional @DefaultValue("0") boolean useSelection,
    @Optional @DefaultValue("-1") boolean launchQuery);


  /**
   * @param languageFrom Mandatory word.WdLanguageID parameter.
   * @param languageTo Mandatory word.WdLanguageID parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(501) //= 0x1f5. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object setLanguagePair(
    word.WdLanguageID languageFrom,
    word.WdLanguageID languageTo);


  /**
   * @param serviceID Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(502) //= 0x1f6. The runtime will prefer the VTID if present
  @VTID(12)
  boolean isResearchService(
    java.lang.String serviceID);


  /**
   * <p>
   * Getter method for the COM property "FavoriteService"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String favoriteService();


  /**
   * <p>
   * Setter method for the COM property "FavoriteService"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(14)
  void favoriteService(
    java.lang.String prop);


  // Properties:
}
