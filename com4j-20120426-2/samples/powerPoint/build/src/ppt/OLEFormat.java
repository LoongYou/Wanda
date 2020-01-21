package ppt  ;

import com4j.*;

@IID("{91493488-5A91-11CF-8700-00AA0060263B}")
public interface OLEFormat extends Com4jObject {
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
   * <p>
   * Getter method for the COM property "ObjectVerbs"
   * </p>
   * @return  Returns a value of type ppt.ObjectVerbs
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.ObjectVerbs objectVerbs();


  @VTID(9)
  @ReturnValue(defaultPropertyThrough={ppt.ObjectVerbs.class})
  java.lang.String objectVerbs(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Object"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject object();


  /**
   * <p>
   * Getter method for the COM property "ProgID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String progID();


  /**
   * <p>
   * Getter method for the COM property "FollowColors"
   * </p>
   * @return  Returns a value of type ppt.PpFollowColors
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(12)
  ppt.PpFollowColors followColors();


  /**
   * <p>
   * Setter method for the COM property "FollowColors"
   * </p>
   * @param followColors Mandatory ppt.PpFollowColors parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(13)
  void followColors(
    ppt.PpFollowColors followColors);


  /**
   * @param index Optional parameter. Default value is 0
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(14)
  void doVerb(
    @Optional @DefaultValue("0") int index);


  /**
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(15)
  void activate();


  // Properties:
}
