package word  ;

import com4j.*;

@IID("{DD947D72-F33C-4198-9BDF-F86181D05E41}")
public interface Editor extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String id();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(9)
  word.Range range();


  /**
   * <p>
   * Getter method for the COM property "NextRange"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(10)
  word.Range nextRange();


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
   */

  @DISPID(500) //= 0x1f4. The runtime will prefer the VTID if present
  @VTID(14)
  void delete();


  /**
   */

  @DISPID(501) //= 0x1f5. The runtime will prefer the VTID if present
  @VTID(15)
  void deleteAll();


  /**
   */

  @DISPID(502) //= 0x1f6. The runtime will prefer the VTID if present
  @VTID(16)
  void selectAll();


  // Properties:
}
