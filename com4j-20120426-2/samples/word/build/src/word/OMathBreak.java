package word  ;

import com4j.*;

@IID("{65E515D5-F50B-4951-8F38-FA6AC8707387}")
public interface OMathBreak extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(7)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(10)
  word.Range range();


  /**
   * <p>
   * Getter method for the COM property "AlignAt"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(11)
  int alignAt();


  /**
   * <p>
   * Setter method for the COM property "AlignAt"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(12)
  void alignAt(
    int prop);


  /**
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(13)
  void delete();


  // Properties:
}
