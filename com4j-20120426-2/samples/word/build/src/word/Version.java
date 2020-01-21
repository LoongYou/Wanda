package word  ;

import com4j.*;

@IID("{000209B4-0000-0000-C000-000000000046}")
public interface Version extends Com4jObject {
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
   * Getter method for the COM property "SavedBy"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String savedBy();


  /**
   * <p>
   * Getter method for the COM property "Comment"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String comment();


  /**
   * <p>
   * Getter method for the COM property "Date"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(12)
  java.util.Date date();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(13)
  int index();


  /**
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(14)
  void openOld();


  /**
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(15)
  void delete();


  /**
   * @return  Returns a value of type word._Document
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(16)
  word._Document open();


  // Properties:
}
