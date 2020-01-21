package word  ;

import com4j.*;

@IID("{000209F7-0001-0000-C000-000000000046}")
public interface IApplicationEvents extends Com4jObject {
  // Methods:
  /**
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void startup();


  /**
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void quit();


  /**
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void documentChange();


  // Properties:
}
