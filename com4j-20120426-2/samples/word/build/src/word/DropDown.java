package word  ;

import com4j.*;

@IID("{00020925-0000-0000-C000-000000000046}")
public interface DropDown extends Com4jObject {
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
   * <p>
   * Getter method for the COM property "Valid"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  boolean valid();


  /**
   * <p>
   * Getter method for the COM property "Default"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  int _default();


  /**
   * <p>
   * Setter method for the COM property "Default"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(12)
  void _default(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(13)
  int value();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(14)
  void value(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "ListEntries"
   * </p>
   * @return  Returns a value of type word.ListEntries
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(15)
  word.ListEntries listEntries();


  @VTID(15)
  @ReturnValue(defaultPropertyThrough={word.ListEntries.class})
  word.ListEntry listEntries(
    java.lang.Object index);

  // Properties:
}
