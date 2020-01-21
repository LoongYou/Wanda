package office  ;

import com4j.*;

@IID("{000CD101-0000-0000-C000-000000000046}")
public interface WebComponentWindowExternal extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "InterfaceVersion"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  int interfaceVersion();


  /**
   * <p>
   * Getter method for the COM property "ApplicationName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String applicationName();


  /**
   * <p>
   * Getter method for the COM property "ApplicationVersion"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  int applicationVersion();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  void closeWindow();


  /**
   * <p>
   * Getter method for the COM property "WebComponent"
   * </p>
   * @return  Returns a value of type office.WebComponent
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  office.WebComponent webComponent();


  // Properties:
}
