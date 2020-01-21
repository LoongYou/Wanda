package ppt  ;

import com4j.*;

@IID("{914934F7-5A91-11CF-8700-00AA0060263B}")
public interface Research extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  ppt._Application application();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * @param serviceID Mandatory java.lang.String parameter.
   * @param queryString Optional parameter. Default value is com4j.Variant.getMissing()
   * @param queryLanguage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param useSelection Optional parameter. Default value is false
   * @param launchQuery Optional parameter. Default value is false
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  void query(
    java.lang.String serviceID,
    @Optional java.lang.Object queryString,
    @Optional java.lang.Object queryLanguage,
    @Optional @DefaultValue("0") boolean useSelection,
    @Optional @DefaultValue("-1") boolean launchQuery);


  /**
   * @param language1 Mandatory java.lang.Object parameter.
   * @param language2 Mandatory java.lang.Object parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  void setLanguagePair(
    java.lang.Object language1,
    java.lang.Object language2);


  /**
   * @param serviceID Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  boolean isResearchService(
    java.lang.String serviceID);


  // Properties:
}
