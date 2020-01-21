package office  ;

import com4j.*;

@IID("{000C0356-0000-0000-C000-000000000046}")
public interface HTMLProject extends office._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "State"
   * </p>
   * @return  Returns a value of type office.MsoHTMLProjectState
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  office.MsoHTMLProjectState state();


  /**
   * @param refresh Optional parameter. Default value is false
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  void refreshProject(
    @Optional @DefaultValue("-1") boolean refresh);


  /**
   * @param refresh Optional parameter. Default value is false
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  void refreshDocument(
    @Optional @DefaultValue("-1") boolean refresh);


  /**
   * <p>
   * Getter method for the COM property "HTMLProjectItems"
   * </p>
   * @return  Returns a value of type office.HTMLProjectItems
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  office.HTMLProjectItems htmlProjectItems();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={office.HTMLProjectItems.class})
  office.HTMLProjectItem htmlProjectItems(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * @param openKind Optional parameter. Default value is 0
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(14)
  void open(
    @Optional @DefaultValue("0") office.MsoHTMLProjectOpen openKind);


  // Properties:
}
