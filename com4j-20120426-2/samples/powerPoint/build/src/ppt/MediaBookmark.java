package ppt  ;

import com4j.*;

@IID("{BA72E555-4FF5-48F4-8215-5505F990966F}")
public interface MediaBookmark extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  int index();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  int position();


  /**
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  void delete();


  // Properties:
}
