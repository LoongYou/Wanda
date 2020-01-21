package word  ;

import com4j.*;

@IID("{0002095A-0000-0000-C000-000000000046}")
public interface Sections extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(7)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  int count();


  /**
   * <p>
   * Getter method for the COM property "First"
   * </p>
   * @return  Returns a value of type word.Section
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  word.Section first();


  /**
   * <p>
   * Getter method for the COM property "Last"
   * </p>
   * @return  Returns a value of type word.Section
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  word.Section last();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(11)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(12)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "PageSetup"
   * </p>
   * @return  Returns a value of type word.PageSetup
   */

  @DISPID(1101) //= 0x44d. The runtime will prefer the VTID if present
  @VTID(14)
  word.PageSetup pageSetup();


  /**
   * <p>
   * Setter method for the COM property "PageSetup"
   * </p>
   * @param prop Mandatory word.PageSetup parameter.
   */

  @DISPID(1101) //= 0x44d. The runtime will prefer the VTID if present
  @VTID(15)
  void pageSetup(
    word.PageSetup prop);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type word.Section
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(16)
  @DefaultMethod
  word.Section item(
    int index);


  /**
   * @param range Optional parameter. Default value is com4j.Variant.getMissing()
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Section
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(17)
  word.Section add(
    @Optional java.lang.Object range,
    @Optional java.lang.Object start);


  // Properties:
}
