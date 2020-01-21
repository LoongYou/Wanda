package wsh  ;

import com4j.*;

/**
 * Environment Variables Collection Object
 */
@IID("{F935DC29-1CF0-11D0-ADB9-00C04FD58A0B}")
public interface IWshEnvironment extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  java.lang.String item(
    java.lang.String name);


  /**
   * <p>
   * Setter method for the COM property "Item"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   * @param out_Value Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(8)
  @DefaultMethod
  void item(
    java.lang.String name,
    java.lang.String out_Value);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  int count();


  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  int length();


  /**
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(11)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(12)
  void remove(
    java.lang.String name);


  // Properties:
}
