package word  ;

import com4j.*;

@IID("{E3124493-7D6A-410F-9A48-CC822C033CEC}")
public interface XSLTransform extends Com4jObject {
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
   * Getter method for the COM property "Alias"
   * </p>
   * @param allUsers Optional parameter. Default value is false
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String alias(
    @Optional @DefaultValue("0") boolean allUsers);


  /**
   * <p>
   * Setter method for the COM property "Alias"
   * </p>
   * @param allUsers Optional parameter. Default value is false
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  void alias(
    @Optional @DefaultValue("0") boolean allUsers,
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Location"
   * </p>
   * @param allUsers Optional parameter. Default value is false
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String location(
    @Optional @DefaultValue("0") boolean allUsers);


  /**
   * <p>
   * Setter method for the COM property "Location"
   * </p>
   * @param allUsers Optional parameter. Default value is false
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  void location(
    @Optional @DefaultValue("0") boolean allUsers,
    java.lang.String prop);


  /**
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(14)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String id();


  // Properties:
}
