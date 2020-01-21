package office  ;

import com4j.*;

@IID("{000C03F0-0000-0000-C000-000000000046}")
public interface IMsoContactCard extends office._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Address"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String address();


  /**
   * <p>
   * Getter method for the COM property "AddressType"
   * </p>
   * @return  Returns a value of type office.MsoContactCardAddressType
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  office.MsoContactCardAddressType addressType();


  /**
   * <p>
   * Getter method for the COM property "CardType"
   * </p>
   * @return  Returns a value of type office.MsoContactCardType
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  office.MsoContactCardType cardType();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  // Properties:
}
