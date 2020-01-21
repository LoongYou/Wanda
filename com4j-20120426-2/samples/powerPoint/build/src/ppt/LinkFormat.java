package ppt  ;

import com4j.*;

@IID("{91493489-5A91-11CF-8700-00AA0060263B}")
public interface LinkFormat extends Com4jObject {
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
   * Getter method for the COM property "SourceFullName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String sourceFullName();


  /**
   * <p>
   * Setter method for the COM property "SourceFullName"
   * </p>
   * @param sourceFullName Mandatory java.lang.String parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(10)
  void sourceFullName(
    java.lang.String sourceFullName);


  /**
   * <p>
   * Getter method for the COM property "AutoUpdate"
   * </p>
   * @return  Returns a value of type ppt.PpUpdateOption
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(11)
  ppt.PpUpdateOption autoUpdate();


  /**
   * <p>
   * Setter method for the COM property "AutoUpdate"
   * </p>
   * @param autoUpdate Mandatory ppt.PpUpdateOption parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(12)
  void autoUpdate(
    ppt.PpUpdateOption autoUpdate);


  /**
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(13)
  void update();


  /**
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(14)
  void breakLink();


  // Properties:
}
