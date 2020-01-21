package ppt  ;

import com4j.*;

@IID("{914934F1-5A91-11CF-8700-00AA0060263B}")
public interface SetEffect extends Com4jObject {
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
   * Getter method for the COM property "Property"
   * </p>
   * @return  Returns a value of type ppt.MsoAnimProperty
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.MsoAnimProperty property();


  /**
   * <p>
   * Setter method for the COM property "Property"
   * </p>
   * @param property Mandatory ppt.MsoAnimProperty parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(10)
  void property(
    ppt.MsoAnimProperty property);


  /**
   * <p>
   * Getter method for the COM property "To"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object to();


  /**
   * <p>
   * Setter method for the COM property "To"
   * </p>
   * @param to Mandatory java.lang.Object parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(12)
  void to(
    @MarshalAs(NativeType.VARIANT) java.lang.Object to);


  // Properties:
}
